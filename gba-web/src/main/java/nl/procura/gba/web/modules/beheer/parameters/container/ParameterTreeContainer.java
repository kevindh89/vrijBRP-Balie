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

package nl.procura.gba.web.modules.beheer.parameters.container;

import static nl.procura.gba.web.services.beheer.parameter.ParameterGroup.*;

import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.Collection;

import com.vaadin.data.Item;
import com.vaadin.data.util.HierarchicalContainer;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;

import nl.procura.gba.web.modules.beheer.parameters.bean.ParameterBean;
import nl.procura.gba.web.modules.beheer.parameters.layout.*;
import nl.procura.gba.web.services.beheer.gebruiker.Gebruiker;
import nl.procura.gba.web.services.beheer.parameter.ParameterGroup;
import nl.procura.gba.web.services.beheer.parameter.ParameterType;
import nl.procura.gba.web.services.beheer.parameter.annotations.ParameterAnnotation;
import nl.procura.gba.web.services.beheer.profiel.Profiel;
import nl.procura.vaadin.component.container.ProcuraContainer;
import nl.procura.vaadin.component.formfieldfactory.BeanAnnotationUtil;

public class ParameterTreeContainer extends HierarchicalContainer implements ProcuraContainer {

  public static final String LEAF_CLASS = "Waarde";

  private final Gebruiker gebruiker;
  private final Profiel   profiel;

  public ParameterTreeContainer(Gebruiker gebruiker, Profiel profiel) {

    this.gebruiker = gebruiker;
    this.profiel = profiel;

    addContainerProperty(OMSCHRIJVING, String.class, "");
    addContainerProperty(LEAF_CLASS, Class.class, "");
    removeAllItems();

    addTreeItem(GROUP_ALGEMEEN, true, HorizontalLayout.class);
    addTreeItem(GROUP_ALGEMENE_INSTELLINGEN, GROUP_ALGEMEEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_APPS, GROUP_ALGEMEEN, false, AppInstanceLayout.class);
    addTreeItem(GROUP_DIENSTEN, true, HorizontalLayout.class);
    addTreeItem(GROUP_OVERIG, true, HorizontalLayout.class);
    addTreeItem(GROUP_CONFIGURATIEBESTAND, GROUP_ALGEMEEN, false, ConfigParameterLayout.class);
    addTreeItem(GROUP_DATABASES, GROUP_ALGEMEEN, false, AvailableDatabasesLayout.class);

    // Diensten
    addTreeItem(GROUP_BSM, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_COVOG, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_CURATELE, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_GEO, GROUP_DIENSTEN, false, GeoParameterLayout.class);
    addTreeItem(GROUP_GPK, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_GV, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_KENNISBANK, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_MIDOFFICE, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_MIJN_OVERHEID, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_ONTBINDING, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_ONDERZOEK, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_PRESENTIEVRAAG, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_RAAS, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_REISDOCUMENTEN, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_RIJBEWIJZEN, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_RISKANALYSIS, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_SMS, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_TERUGMELDINGEN, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_VERIFICATIEVRAAG, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_VERHUIZING, GROUP_DIENSTEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_ZAKEN, GROUP_DIENSTEN, true, DatabaseParameterLayout.class);
    addTreeItem(GROUP_ZAKEN_ALGEMEEN, GROUP_ZAKEN, false, ZakenStatusParametersLayout.class);
    addTreeItem(GROUP_ZAKEN_STATUS, GROUP_ZAKEN, false, ZakenStatusParametersLayout.class);
    addTreeItem(GROUP_ZAKEN_DMS, GROUP_ZAKEN, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_ZAKEN_DMS_TYPES, GROUP_ZAKEN, false, ZakenDmsParametersLayout.class);
    addTreeItem(GROUP_ZOEKEN, GROUP_DIENSTEN, true, DatabaseParameterLayout.class);
    addTreeItem(GROUP_ZOEKEN_ALGEMEEN, GROUP_ZOEKEN, false, ZoekenAlgemeenParametersLayout.class);
    addTreeItem(GROUP_ZOEKEN_PROFIEL_STANDAARD, GROUP_ZOEKEN, false, ZoekenProfielParametersLayout.class);
    addTreeItem(GROUP_ZOEKEN_PROFIEL_GBAV_PLUS, GROUP_ZOEKEN, false, ZoekenProfielParametersLayout.class);

    // Overige
    addTreeItem(GROUP_PRINT, GROUP_OVERIG, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_CONNECT, GROUP_OVERIG, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_CONTACT, GROUP_OVERIG, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_DOCUMENTEN, GROUP_OVERIG, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_EMAIL, GROUP_OVERIG, false, EmailParameterLayout.class);
    addTreeItem(GROUP_HANDLEIDINGEN, GROUP_OVERIG, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_KASSA, GROUP_OVERIG, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_PROBEV, GROUP_OVERIG, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_PROCURA, GROUP_OVERIG, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_SYSTEM, GROUP_OVERIG, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_PROTOCOLLERING, GROUP_OVERIG, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_VOORRAAD, GROUP_OVERIG, false, DatabaseParameterLayout.class);
    addTreeItem(GROUP_WERKPROCES, GROUP_OVERIG, false, DatabaseParameterLayout.class);

    removeEmptyLeafs();
  }

  public boolean isGebruiker() {
    return gebruiker != null;
  }

  public boolean isProfiel() {
    return profiel != null;
  }

  private void addTreeItem(ParameterGroup itemId, boolean childrenAllowed,
      Class<? extends Component> componentClass) {

    boolean isApp = (!isGebruiker() && !isProfiel());
    boolean isParmLayout = DatabaseParameterLayout.class.isAssignableFrom(componentClass);

    // Niet parameters layout tonen in algemene parameters
    if (!childrenAllowed && !isParmLayout && !isApp) {
      return;
    }

    // Parameter layout niet tonen als er geen parameters zijn
    if (!childrenAllowed && isParmLayout && !hasParameter(ParameterBean.class, itemId, isGebruiker(), isProfiel())) {
      return;
    }

    Item item = addItem(itemId);
    setChildrenAllowed(itemId, childrenAllowed);
    item.getItemProperty(OMSCHRIJVING).setValue(itemId.getCaption());
    item.getItemProperty(LEAF_CLASS).setValue(componentClass);
  }

  private void addTreeItem(ParameterGroup itemId, ParameterGroup parentId, boolean childrenAllowed,
      Class<? extends Component> componentClass) {

    addTreeItem(itemId, childrenAllowed, componentClass);
    setParent(itemId, parentId);
  }

  /**
   * De categorie heeft een (gebruiker) parameter.
   */
  private boolean hasParameter(Class<?> beanClass, ParameterGroup category, boolean showUser, boolean showProfile) {
    Collection<?> propertyIds = BeanAnnotationUtil.getPropertyIdsForAnnotatedFields(beanClass);
    for (Object propertyId : propertyIds) {
      if (propertyId instanceof String) {
        try {
          AnnotatedElement element = BeanAnnotationUtil.getMember(beanClass, propertyId);
          if (element.isAnnotationPresent(ParameterAnnotation.class)) {
            ParameterAnnotation annotation = element.getAnnotation(ParameterAnnotation.class);
            if (isAnnotationCorrect(annotation, category, showUser, showProfile)) {
              return true;
            }
          }
        } catch (SecurityException | NoSuchFieldException | NoSuchMethodException e) {
          e.printStackTrace();
        }
      }
    }

    return false;
  }

  private boolean isAnnotationCorrect(ParameterAnnotation annotation, ParameterGroup category,
      boolean showUser, boolean showProfile) {

    ParameterType type = annotation.value();
    boolean isCategory = (type.getCategory() != null) && type.getCategory() == category;
    boolean isUserParameter = showUser && type.isShowUser();
    boolean isProfileParameter = showProfile && type.isShowProfile();
    boolean isAppParameter = !showUser && !showProfile && type.isShowApplication();
    return isCategory && (isAppParameter || isProfileParameter || isUserParameter);
  }

  /**
   * Opschonen lege categorieen
   */
  private void removeEmptyLeafs() {
    for (Object itemId : new ArrayList<>(getItemIds())) {
      if (!hasChildren(itemId) && areChildrenAllowed(itemId)) {
        removeItem(itemId);
      }
    }
  }
}
