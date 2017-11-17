package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ReceivingProcess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class ReceivingProcessApi {
  private ApiClient apiClient;

  public ReceivingProcessApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReceivingProcessApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a receivingProcess
   * Adds an audit to an existing receivingProcess.
   * @param receivingProcessId Id of the receivingProcess to add an audit to (required)
   * @param receivingProcessAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addReceivingProcessAudit(Integer receivingProcessId, String receivingProcessAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'receivingProcessId' is set
    if (receivingProcessId == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingProcessId' when calling addReceivingProcessAudit");
    }
    
    // verify the required parameter 'receivingProcessAudit' is set
    if (receivingProcessAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingProcessAudit' when calling addReceivingProcessAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingProcess/{receivingProcessId}/audit/{receivingProcessAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "receivingProcessId" + "\\}", apiClient.escapeString(receivingProcessId.toString()))
      .replaceAll("\\{" + "receivingProcessAudit" + "\\}", apiClient.escapeString(receivingProcessAudit.toString()));

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
   * Add new tags for a receivingProcess.
   * Adds a tag to an existing receivingProcess.
   * @param receivingProcessId Id of the receivingProcess to add a tag to (required)
   * @param receivingProcessTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addReceivingProcessTag(Integer receivingProcessId, String receivingProcessTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'receivingProcessId' is set
    if (receivingProcessId == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingProcessId' when calling addReceivingProcessTag");
    }
    
    // verify the required parameter 'receivingProcessTag' is set
    if (receivingProcessTag == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingProcessTag' when calling addReceivingProcessTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingProcess/{receivingProcessId}/tag/{receivingProcessTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "receivingProcessId" + "\\}", apiClient.escapeString(receivingProcessId.toString()))
      .replaceAll("\\{" + "receivingProcessTag" + "\\}", apiClient.escapeString(receivingProcessTag.toString()));

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
   * Delete a receivingProcess
   * Deletes the receivingProcess identified by the specified id.
   * @param receivingProcessId Id of the receivingProcess to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteReceivingProcess(Integer receivingProcessId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'receivingProcessId' is set
    if (receivingProcessId == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingProcessId' when calling deleteReceivingProcess");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingProcess/{receivingProcessId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "receivingProcessId" + "\\}", apiClient.escapeString(receivingProcessId.toString()));

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
   * Delete a tag for a receivingProcess.
   * Deletes an existing receivingProcess tag using the specified data.
   * @param receivingProcessId Id of the receivingProcess to remove tag from (required)
   * @param receivingProcessTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteReceivingProcessTag(Integer receivingProcessId, String receivingProcessTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'receivingProcessId' is set
    if (receivingProcessId == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingProcessId' when calling deleteReceivingProcessTag");
    }
    
    // verify the required parameter 'receivingProcessTag' is set
    if (receivingProcessTag == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingProcessTag' when calling deleteReceivingProcessTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingProcess/{receivingProcessId}/tag/{receivingProcessTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "receivingProcessId" + "\\}", apiClient.escapeString(receivingProcessId.toString()))
      .replaceAll("\\{" + "receivingProcessTag" + "\\}", apiClient.escapeString(receivingProcessTag.toString()));

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
   * Get a duplicated a receivingProcess by id
   * Returns a duplicated receivingProcess identified by the specified id.
   * @param receivingProcessId Id of the receivingProcess to be duplicated. (required)
   * @return ReceivingProcess
   * @throws ApiException if fails to make API call
   */
  public ReceivingProcess getDuplicateReceivingProcessById(Integer receivingProcessId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'receivingProcessId' is set
    if (receivingProcessId == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingProcessId' when calling getDuplicateReceivingProcessById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingProcess/duplicate/{receivingProcessId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "receivingProcessId" + "\\}", apiClient.escapeString(receivingProcessId.toString()));

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

    
    GenericType<ReceivingProcess> localVarReturnType = new GenericType<ReceivingProcess>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search receivingProcesses by filter
   * Returns the list of receivingProcesses that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ReceivingProcess>
   * @throws ApiException if fails to make API call
   */
  public List<ReceivingProcess> getReceivingProcessByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/receivingProcess/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ReceivingProcess>> localVarReturnType = new GenericType<List<ReceivingProcess>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a receivingProcess by id
   * Returns the receivingProcess identified by the specified id.
   * @param receivingProcessId Id of the receivingProcess to be returned. (required)
   * @return ReceivingProcess
   * @throws ApiException if fails to make API call
   */
  public ReceivingProcess getReceivingProcessById(Integer receivingProcessId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'receivingProcessId' is set
    if (receivingProcessId == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingProcessId' when calling getReceivingProcessById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingProcess/{receivingProcessId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "receivingProcessId" + "\\}", apiClient.escapeString(receivingProcessId.toString()));

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

    
    GenericType<ReceivingProcess> localVarReturnType = new GenericType<ReceivingProcess>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a receivingProcess.
   * Get all existing receivingProcess tags.
   * @param receivingProcessId Id of the receivingProcess to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getReceivingProcessTags(Integer receivingProcessId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'receivingProcessId' is set
    if (receivingProcessId == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingProcessId' when calling getReceivingProcessTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingProcess/{receivingProcessId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "receivingProcessId" + "\\}", apiClient.escapeString(receivingProcessId.toString()));

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
   * Update a receivingProcess custom fields
   * Updates an existing receivingProcess custom fields using the specified data.
   * @param body ReceivingProcess to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateReceivingProcessCustomFields(ReceivingProcess body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateReceivingProcessCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingProcess/customFields".replaceAll("\\{format\\}","json");

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
