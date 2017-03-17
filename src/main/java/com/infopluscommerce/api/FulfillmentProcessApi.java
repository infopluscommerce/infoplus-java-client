package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.FulfillmentProcess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class FulfillmentProcessApi {
  private ApiClient apiClient;

  public FulfillmentProcessApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FulfillmentProcessApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a fulfillmentProcess
   * Adds an audit to an existing fulfillmentProcess.
   * @param fulfillmentProcessId Id of the fulfillmentProcess to add an audit to (required)
   * @param fulfillmentProcessAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addFulfillmentProcessAudit(Integer fulfillmentProcessId, String fulfillmentProcessAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fulfillmentProcessId' is set
    if (fulfillmentProcessId == null) {
      throw new ApiException(400, "Missing the required parameter 'fulfillmentProcessId' when calling addFulfillmentProcessAudit");
    }
    
    // verify the required parameter 'fulfillmentProcessAudit' is set
    if (fulfillmentProcessAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'fulfillmentProcessAudit' when calling addFulfillmentProcessAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/fulfillmentProcess/{fulfillmentProcessId}/audit/{fulfillmentProcessAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fulfillmentProcessId" + "\\}", apiClient.escapeString(fulfillmentProcessId.toString()))
      .replaceAll("\\{" + "fulfillmentProcessAudit" + "\\}", apiClient.escapeString(fulfillmentProcessAudit.toString()));

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
   * Add new tags for a fulfillmentProcess.
   * Adds a tag to an existing fulfillmentProcess.
   * @param fulfillmentProcessId Id of the fulfillmentProcess to add a tag to (required)
   * @param fulfillmentProcessTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addFulfillmentProcessTag(Integer fulfillmentProcessId, String fulfillmentProcessTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fulfillmentProcessId' is set
    if (fulfillmentProcessId == null) {
      throw new ApiException(400, "Missing the required parameter 'fulfillmentProcessId' when calling addFulfillmentProcessTag");
    }
    
    // verify the required parameter 'fulfillmentProcessTag' is set
    if (fulfillmentProcessTag == null) {
      throw new ApiException(400, "Missing the required parameter 'fulfillmentProcessTag' when calling addFulfillmentProcessTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/fulfillmentProcess/{fulfillmentProcessId}/tag/{fulfillmentProcessTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fulfillmentProcessId" + "\\}", apiClient.escapeString(fulfillmentProcessId.toString()))
      .replaceAll("\\{" + "fulfillmentProcessTag" + "\\}", apiClient.escapeString(fulfillmentProcessTag.toString()));

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
   * Delete a tag for a fulfillmentProcess.
   * Deletes an existing fulfillmentProcess tag using the specified data.
   * @param fulfillmentProcessId Id of the fulfillmentProcess to remove tag from (required)
   * @param fulfillmentProcessTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFulfillmentProcessTag(Integer fulfillmentProcessId, String fulfillmentProcessTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fulfillmentProcessId' is set
    if (fulfillmentProcessId == null) {
      throw new ApiException(400, "Missing the required parameter 'fulfillmentProcessId' when calling deleteFulfillmentProcessTag");
    }
    
    // verify the required parameter 'fulfillmentProcessTag' is set
    if (fulfillmentProcessTag == null) {
      throw new ApiException(400, "Missing the required parameter 'fulfillmentProcessTag' when calling deleteFulfillmentProcessTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/fulfillmentProcess/{fulfillmentProcessId}/tag/{fulfillmentProcessTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fulfillmentProcessId" + "\\}", apiClient.escapeString(fulfillmentProcessId.toString()))
      .replaceAll("\\{" + "fulfillmentProcessTag" + "\\}", apiClient.escapeString(fulfillmentProcessTag.toString()));

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
   * Get a duplicated a fulfillmentProcess by id
   * Returns a duplicated fulfillmentProcess identified by the specified id.
   * @param fulfillmentProcessId Id of the fulfillmentProcess to be duplicated. (required)
   * @return FulfillmentProcess
   * @throws ApiException if fails to make API call
   */
  public FulfillmentProcess getDuplicateFulfillmentProcessById(Integer fulfillmentProcessId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fulfillmentProcessId' is set
    if (fulfillmentProcessId == null) {
      throw new ApiException(400, "Missing the required parameter 'fulfillmentProcessId' when calling getDuplicateFulfillmentProcessById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/fulfillmentProcess/duplicate/{fulfillmentProcessId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fulfillmentProcessId" + "\\}", apiClient.escapeString(fulfillmentProcessId.toString()));

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

    
    GenericType<FulfillmentProcess> localVarReturnType = new GenericType<FulfillmentProcess>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search fulfillmentProcesses by filter
   * Returns the list of fulfillmentProcesses that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<FulfillmentProcess>
   * @throws ApiException if fails to make API call
   */
  public List<FulfillmentProcess> getFulfillmentProcessByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/fulfillmentProcess/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<FulfillmentProcess>> localVarReturnType = new GenericType<List<FulfillmentProcess>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a fulfillmentProcess by id
   * Returns the fulfillmentProcess identified by the specified id.
   * @param fulfillmentProcessId Id of the fulfillmentProcess to be returned. (required)
   * @return FulfillmentProcess
   * @throws ApiException if fails to make API call
   */
  public FulfillmentProcess getFulfillmentProcessById(Integer fulfillmentProcessId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fulfillmentProcessId' is set
    if (fulfillmentProcessId == null) {
      throw new ApiException(400, "Missing the required parameter 'fulfillmentProcessId' when calling getFulfillmentProcessById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/fulfillmentProcess/{fulfillmentProcessId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fulfillmentProcessId" + "\\}", apiClient.escapeString(fulfillmentProcessId.toString()));

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

    
    GenericType<FulfillmentProcess> localVarReturnType = new GenericType<FulfillmentProcess>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a fulfillmentProcess.
   * Get all existing fulfillmentProcess tags.
   * @param fulfillmentProcessId Id of the fulfillmentProcess to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getFulfillmentProcessTags(Integer fulfillmentProcessId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fulfillmentProcessId' is set
    if (fulfillmentProcessId == null) {
      throw new ApiException(400, "Missing the required parameter 'fulfillmentProcessId' when calling getFulfillmentProcessTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/fulfillmentProcess/{fulfillmentProcessId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fulfillmentProcessId" + "\\}", apiClient.escapeString(fulfillmentProcessId.toString()));

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
   * Update a fulfillmentProcess custom fields
   * Updates an existing fulfillmentProcess custom fields using the specified data.
   * @param body FulfillmentProcess to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateFulfillmentProcessCustomFields(FulfillmentProcess body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateFulfillmentProcessCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/fulfillmentProcess/customFields".replaceAll("\\{format\\}","json");

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
