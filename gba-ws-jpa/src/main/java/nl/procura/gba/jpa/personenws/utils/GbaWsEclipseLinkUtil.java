/*
 * Copyright 2021 - 2022 Procura B.V.
 *
 * In licentie gegeven krachtens de EUPL, versie 1.2
 * U mag dit werk niet gebruiken, behalve onder de voorwaarden van de licentie.
 * U kunt een kopie van de licentie vinden op:
 *
 *   https://github.com/vrijBRP/vrijBRP/blob/master/LICENSE.md
 *
 * Deze bevat zowel de Nederlandse als de Engelse tekst
 *
 * Tenzij dit op grond van toepasselijk recht vereist is of schriftelijk
 * is overeengekomen, wordt software krachtens deze licentie verspreid
 * "zoals deze is", ZONDER ENIGE GARANTIES OF VOORWAARDEN, noch expliciet
 * noch impliciet.
 * Zie de licentie voor de specifieke bepalingen voor toestemmingen en
 * beperkingen op grond van de licentie.
 */

package nl.procura.gba.jpa.personenws.utils;

import static nl.procura.standard.Globalfunctions.*;
import static org.eclipse.persistence.config.PersistenceUnitProperties.LOGGING_LOGGER;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.persistence.config.CacheType;
import org.eclipse.persistence.config.PersistenceUnitProperties;

import nl.procura.gba.jpa.personenws.session.GbaWsSessionCustomize;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class GbaWsEclipseLinkUtil {

  public static final String  TNS_ADMIN_DIR         = "app_db_tns_admin_dir";
  public static final String  CUSTOM_URL            = "app_db_custom_url";
  public static final String  CUSTOM_DRIVER         = "app_db_custom_driver";
  public static final String  DATABASE              = "app_db_sid";
  public static final String  DATABASE_TYPE         = "app_db_name";
  public static final String  PW                    = "app_db_password";
  public static final String  PORT                  = "app_db_port";
  public static final String  SERVER                = "app_db_server";
  public static final String  USERNAME              = "app_db_username";
  public static final String  PERSISTENCE_UNIT_NAME = "persistenceUnitName";
  public static final String  LOG_LEVEL             = "loglevel";
  public static final String  MAX_CONNECTIONS       = "connections.max";
  public static final String  MIN_CONNECTIONS       = "connections.min";
  private static final int    LOG_LINE_LENGTH       = 30;
  private static final String DB_LOG_INFO           = "INFO";
  private static final String DB_ORACLE             = "oracle";
  private static final String DB_POSTGRES           = "postgres";
  private static final String TCP_KEEPALIVE         = "tcpKeepAlive";

  private static final String ONE = "1";

  // EntityManagerFactories
  private static final Map<String, EntityManagerFactory> factories = new HashMap<>();

  private GbaWsEclipseLinkUtil() {
  }

  public static EntityManagerFactory getEntityManagerFactory(String persistenceUnitName, Properties properties) {

    // Instellingen
    String databaseType = getProperty(properties, DATABASE_TYPE);
    String server = getProperty(properties, SERVER);
    String port = getProperty(properties, PORT);
    String database = getProperty(properties, DATABASE);
    String username = getProperty(properties, USERNAME);
    String password = getProperty(properties, PW);
    String logLevel = getProperty(properties, LOG_LEVEL);
    String keepalive = getProperty(properties, TCP_KEEPALIVE);

    if (fil(getProperty(properties, PERSISTENCE_UNIT_NAME))) {
      persistenceUnitName = getProperty(properties, PERSISTENCE_UNIT_NAME);
    }

    String minConnections = "" + getNonNegatieveInteger(getProperty(properties, MIN_CONNECTIONS));
    String maxConnections = "" + getNonNegatieveInteger(getProperty(properties, MAX_CONNECTIONS));

    if (log.isDebugEnabled()) {
      log.debug(pad_right("Persistence unit", ".", LOG_LINE_LENGTH) + ": " + persistenceUnitName);
      log.debug(pad_right("Connecties", ".", LOG_LINE_LENGTH) + ": " + minConnections + " - " + maxConnections);
      log.debug(pad_right("Log Level", ".", LOG_LINE_LENGTH) + ": " + logLevel);
      log.debug(pad_right("Generate tabels", ".", LOG_LINE_LENGTH) + ": no");
    }

    // Configuratie vullen.
    Map<String, String> configuration = new HashMap<>();
    configuration.put(PersistenceUnitProperties.LOGGING_LEVEL, logLevel);
    configuration.put(PersistenceUnitProperties.LOGGING_PARAMETERS,
        DB_LOG_INFO.equals(logLevel) ? "false" : "true");

    configuration.put(PersistenceUnitProperties.SESSION_CUSTOMIZER, GbaWsSessionCustomize.class.getName());
    configuration.put(PersistenceUnitProperties.ID_VALIDATION,
        org.eclipse.persistence.annotations.IdValidation.NULL.toString());
    configuration.put(PersistenceUnitProperties.DDL_GENERATION, PersistenceUnitProperties.NONE);

    configuration.put(PersistenceUnitProperties.PESSIMISTIC_LOCK_TIMEOUT, "30000");
    configuration.put(PersistenceUnitProperties.QUERY_TIMEOUT, "30000");

    configuration.put(PersistenceUnitProperties.CONNECTION_POOL_MIN, minConnections);
    configuration.put(PersistenceUnitProperties.CONNECTION_POOL_MAX, maxConnections);
    configuration.put(PersistenceUnitProperties.CONNECTION_POOL_SHARED, "true");

    configuration.put(PersistenceUnitProperties.JDBC_USER, username);
    configuration.put(PersistenceUnitProperties.JDBC_PASSWORD, password);

    configuration.put(PersistenceUnitProperties.CACHE_STATEMENTS, "true");
    configuration.put(PersistenceUnitProperties.CACHE_TYPE_DEFAULT, CacheType.NONE);
    configuration.put(PersistenceUnitProperties.CACHE_SIZE_DEFAULT, "3000");
    configuration.put(PersistenceUnitProperties.CACHE_SHARED_DEFAULT, "false");
    configuration.put(PersistenceUnitProperties.NATIVE_QUERY_UPPERCASE_COLUMNS, "true");

    if (log.isDebugEnabled()) {
      configuration.put(LOGGING_LOGGER, GbaWsCustomSessionLogger.class.getName());
      configuration.put("eclipselink.profiler", GbaWsCustomPerformanceProfiler.class.getName());
    }

    String finalUrl = properties.getProperty(CUSTOM_URL);
    String finalDriver = properties.getProperty(CUSTOM_DRIVER);

    if (StringUtils.isBlank(finalUrl)) {
      if (databaseType.equals(DB_POSTGRES)) {
        finalUrl = String.format("jdbc:postgresql://%s:%s/%s", server, port, database);
      } else if (databaseType.equals(DB_ORACLE)) {
        finalUrl = String.format("jdbc:oracle:thin:@%s:%s:%s", server, port, database);
      }
    }

    if (StringUtils.isBlank(finalDriver)) {
      if (databaseType.equals(DB_POSTGRES)) {
        finalDriver = "org.postgresql.Driver";
      } else if (databaseType.equals(DB_ORACLE)) {
        finalDriver = "oracle.jdbc.OracleDriver";
      }
    }

    if (StringUtils.isNotBlank(keepalive)) {
      configuration.put(TCP_KEEPALIVE, keepalive);
      log.info("TCP keepalive enabled");
    }

    log.info("JPA connection: " + finalUrl);
    configuration.put(PersistenceUnitProperties.SESSION_NAME, finalUrl);
    configuration.put(PersistenceUnitProperties.JDBC_URL, finalUrl);
    configuration.put(PersistenceUnitProperties.JDBC_DRIVER, finalDriver);

    return Persistence.createEntityManagerFactory(persistenceUnitName, configuration);
  }

  public static EntityManager createEntityManager(String persistenceUnitName, Properties properties) {

    if (!factories.containsKey(persistenceUnitName)) {
      factories.put(persistenceUnitName, getEntityManagerFactory(persistenceUnitName, properties));
    }

    EntityManagerFactory factory = factories.get(persistenceUnitName);
    factory.getCache().evictAll();

    return factory.createEntityManager();
  }

  private static String getProperty(Properties properties, String key) {
    return (properties.containsKey(key) ? properties.getProperty(key) : "");
  }

  private static int getNonNegatieveInteger(String value) {
    return (along(value) >= 0) ? aval(value) : 1;
  }
}
