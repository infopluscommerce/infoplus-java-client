package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Alert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class AlertApi {
  private ApiClient apiClient;

  public AlertApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AlertApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for an alert
   * Adds an audit to an existing alert.
   * @param alertId Id of the alert to add an audit to (required)
   * @param alertAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addAlertAudit(Integer alertId, String alertAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'alertId' is set
    if (alertId == null) {
      throw new ApiException(400, "Missing the required parameter 'alertId' when calling addAlertAudit");
    }
    
    // verify the required parameter 'alertAudit' is set
    if (alertAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'alertAudit' when calling addAlertAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/alert/{alertId}/audit/{alertAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertId" + "\\}", apiClient.escapeString(alertId.toString()))
      .replaceAll("\\{" + "alertAudit" + "\\}", apiClient.escapeString(alertAudit.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Add new tags for an alert.
   * Adds a tag to an existing alert.
   * @param alertId Id of the alert to add a tag to (required)
   * @param alertTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addAlertTag(Integer alertId, String alertTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'alertId' is set
    if (alertId == null) {
      throw new ApiException(400, "Missing the required parameter 'alertId' when calling addAlertTag");
    }
    
    // verify the required parameter 'alertTag' is set
    if (alertTag == null) {
      throw new ApiException(400, "Missing the required parameter 'alertTag' when calling addAlertTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/alert/{alertId}/tag/{alertTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertId" + "\\}", apiClient.escapeString(alertId.toString()))
      .replaceAll("\\{" + "alertTag" + "\\}", apiClient.escapeString(alertTag.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete a tag for an alert.
   * Deletes an existing alert tag using the specified data.
   * @param alertId Id of the alert to remove tag from (required)
   * @param alertTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertTag(Integer alertId, String alertTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'alertId' is set
    if (alertId == null) {
      throw new ApiException(400, "Missing the required parameter 'alertId' when calling deleteAlertTag");
    }
    
    // verify the required parameter 'alertTag' is set
    if (alertTag == null) {
      throw new ApiException(400, "Missing the required parameter 'alertTag' when calling deleteAlertTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/alert/{alertId}/tag/{alertTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertId" + "\\}", apiClient.escapeString(alertId.toString()))
      .replaceAll("\\{" + "alertTag" + "\\}", apiClient.escapeString(alertTag.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Search alerts by filter
   * Returns the list of alerts that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<Alert>
   * @throws ApiException if fails to make API call
   */
  public List<Alert> getAlertByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/alert/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    GenericType<List<Alert>> localVarReturnType = new GenericType<List<Alert>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an alert by id
   * Returns the alert identified by the specified id.
   * @param alertId Id of the alert to be returned. (required)
   * @return Alert
   * @throws ApiException if fails to make API call
   */
  public Alert getAlertById(Integer alertId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'alertId' is set
    if (alertId == null) {
      throw new ApiException(400, "Missing the required parameter 'alertId' when calling getAlertById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/alert/{alertId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertId" + "\\}", apiClient.escapeString(alertId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    GenericType<Alert> localVarReturnType = new GenericType<Alert>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an alert.
   * Get all existing alert tags.
   * @param alertId Id of the alert to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getAlertTags(Integer alertId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'alertId' is set
    if (alertId == null) {
      throw new ApiException(400, "Missing the required parameter 'alertId' when calling getAlertTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/alert/{alertId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertId" + "\\}", apiClient.escapeString(alertId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Get a duplicated an alert by id
   * Returns a duplicated alert identified by the specified id.
   * @param alertId Id of the alert to be duplicated. (required)
   * @return Alert
   * @throws ApiException if fails to make API call
   */
  public Alert getDuplicateAlertById(Integer alertId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'alertId' is set
    if (alertId == null) {
      throw new ApiException(400, "Missing the required parameter 'alertId' when calling getDuplicateAlertById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/alert/duplicate/{alertId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertId" + "\\}", apiClient.escapeString(alertId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    GenericType<Alert> localVarReturnType = new GenericType<Alert>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update an alert custom fields
   * Updates an existing alert custom fields using the specified data.
   * @param body Alert to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateAlertCustomFields(Alert body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateAlertCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/alert/customFields".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
}
