/*
 * Copyright 2024 - 2025 Procura B.V.
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

/*
 * Signaleringcontroles API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package nl.procura.burgerzaken.requestinbox.api;

public class DocumentsApi {

  private final ApiClient apiClient;

  public DocumentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public byte[] getDocumentContent(String id, RequestConfig config) throws ApiException {
    ApiClient.Request<Object> apiRequest;
    String localVarPath = "/api/documents/" + id + "/contents";
    apiRequest = new ApiClient.Request<>(localVarPath);
    defaultHeaders(config, apiRequest);
    return apiClient.get(apiRequest, byte[].class);
  }

  protected static void defaultHeaders(RequestConfig config, ApiClient.Request<Object> apiRequest) {
    apiRequest.header("Authorization", "Bearer " + config.accessToken());
    apiRequest.header("Accept", "application/ld+json");
  }
}
