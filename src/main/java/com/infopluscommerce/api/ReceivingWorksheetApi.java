package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ReceivingWorksheet;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class ReceivingWorksheetApi {
  private ApiClient apiClient;

  public ReceivingWorksheetApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReceivingWorksheetApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a receivingWorksheet
   * Inserts a new receivingWorksheet using the specified data.
   * @param body ReceivingWorksheet to be inserted. (required)
   * @return ReceivingWorksheet
   * @throws ApiException if fails to make API call
   */
  public ReceivingWorksheet addReceivingWorksheet(ReceivingWorksheet body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addReceivingWorksheet");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingWorksheet".replaceAll("\\{format\\}","json");

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

    
    GenericType<ReceivingWorksheet> localVarReturnType = new GenericType<ReceivingWorksheet>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a receivingWorksheet
   * Adds an audit to an existing receivingWorksheet.
   * @param receivingWorksheetId Id of the receivingWorksheet to add an audit to (required)
   * @param receivingWorksheetAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addReceivingWorksheetAudit(Integer receivingWorksheetId, String receivingWorksheetAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'receivingWorksheetId' is set
    if (receivingWorksheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingWorksheetId' when calling addReceivingWorksheetAudit");
    }
    
    // verify the required parameter 'receivingWorksheetAudit' is set
    if (receivingWorksheetAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingWorksheetAudit' when calling addReceivingWorksheetAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingWorksheet/{receivingWorksheetId}/audit/{receivingWorksheetAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "receivingWorksheetId" + "\\}", apiClient.escapeString(receivingWorksheetId.toString()))
      .replaceAll("\\{" + "receivingWorksheetAudit" + "\\}", apiClient.escapeString(receivingWorksheetAudit.toString()));

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
   * Add new tags for a receivingWorksheet.
   * Adds a tag to an existing receivingWorksheet.
   * @param receivingWorksheetId Id of the receivingWorksheet to add a tag to (required)
   * @param receivingWorksheetTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addReceivingWorksheetTag(Integer receivingWorksheetId, String receivingWorksheetTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'receivingWorksheetId' is set
    if (receivingWorksheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingWorksheetId' when calling addReceivingWorksheetTag");
    }
    
    // verify the required parameter 'receivingWorksheetTag' is set
    if (receivingWorksheetTag == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingWorksheetTag' when calling addReceivingWorksheetTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingWorksheet/{receivingWorksheetId}/tag/{receivingWorksheetTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "receivingWorksheetId" + "\\}", apiClient.escapeString(receivingWorksheetId.toString()))
      .replaceAll("\\{" + "receivingWorksheetTag" + "\\}", apiClient.escapeString(receivingWorksheetTag.toString()));

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
   * Delete a receivingWorksheet
   * Deletes the receivingWorksheet identified by the specified id.
   * @param receivingWorksheetId Id of the receivingWorksheet to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteReceivingWorksheet(Integer receivingWorksheetId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'receivingWorksheetId' is set
    if (receivingWorksheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingWorksheetId' when calling deleteReceivingWorksheet");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingWorksheet/{receivingWorksheetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "receivingWorksheetId" + "\\}", apiClient.escapeString(receivingWorksheetId.toString()));

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
   * Delete a tag for a receivingWorksheet.
   * Deletes an existing receivingWorksheet tag using the specified data.
   * @param receivingWorksheetId Id of the receivingWorksheet to remove tag from (required)
   * @param receivingWorksheetTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteReceivingWorksheetTag(Integer receivingWorksheetId, String receivingWorksheetTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'receivingWorksheetId' is set
    if (receivingWorksheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingWorksheetId' when calling deleteReceivingWorksheetTag");
    }
    
    // verify the required parameter 'receivingWorksheetTag' is set
    if (receivingWorksheetTag == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingWorksheetTag' when calling deleteReceivingWorksheetTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingWorksheet/{receivingWorksheetId}/tag/{receivingWorksheetTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "receivingWorksheetId" + "\\}", apiClient.escapeString(receivingWorksheetId.toString()))
      .replaceAll("\\{" + "receivingWorksheetTag" + "\\}", apiClient.escapeString(receivingWorksheetTag.toString()));

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
   * Get a duplicated a receivingWorksheet by id
   * Returns a duplicated receivingWorksheet identified by the specified id.
   * @param receivingWorksheetId Id of the receivingWorksheet to be duplicated. (required)
   * @return ReceivingWorksheet
   * @throws ApiException if fails to make API call
   */
  public ReceivingWorksheet getDuplicateReceivingWorksheetById(Integer receivingWorksheetId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'receivingWorksheetId' is set
    if (receivingWorksheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingWorksheetId' when calling getDuplicateReceivingWorksheetById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingWorksheet/duplicate/{receivingWorksheetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "receivingWorksheetId" + "\\}", apiClient.escapeString(receivingWorksheetId.toString()));

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

    
    GenericType<ReceivingWorksheet> localVarReturnType = new GenericType<ReceivingWorksheet>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search receivingWorksheets by filter
   * Returns the list of receivingWorksheets that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ReceivingWorksheet>
   * @throws ApiException if fails to make API call
   */
  public List<ReceivingWorksheet> getReceivingWorksheetByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/receivingWorksheet/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ReceivingWorksheet>> localVarReturnType = new GenericType<List<ReceivingWorksheet>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a receivingWorksheet by id
   * Returns the receivingWorksheet identified by the specified id.
   * @param receivingWorksheetId Id of the receivingWorksheet to be returned. (required)
   * @return ReceivingWorksheet
   * @throws ApiException if fails to make API call
   */
  public ReceivingWorksheet getReceivingWorksheetById(Integer receivingWorksheetId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'receivingWorksheetId' is set
    if (receivingWorksheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingWorksheetId' when calling getReceivingWorksheetById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingWorksheet/{receivingWorksheetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "receivingWorksheetId" + "\\}", apiClient.escapeString(receivingWorksheetId.toString()));

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

    
    GenericType<ReceivingWorksheet> localVarReturnType = new GenericType<ReceivingWorksheet>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a receivingWorksheet.
   * Get all existing receivingWorksheet tags.
   * @param receivingWorksheetId Id of the receivingWorksheet to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getReceivingWorksheetTags(Integer receivingWorksheetId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'receivingWorksheetId' is set
    if (receivingWorksheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'receivingWorksheetId' when calling getReceivingWorksheetTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingWorksheet/{receivingWorksheetId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "receivingWorksheetId" + "\\}", apiClient.escapeString(receivingWorksheetId.toString()));

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
   * Update a receivingWorksheet
   * Updates an existing receivingWorksheet using the specified data.
   * @param body ReceivingWorksheet to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateReceivingWorksheet(ReceivingWorksheet body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateReceivingWorksheet");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingWorksheet".replaceAll("\\{format\\}","json");

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
   * Update a receivingWorksheet custom fields
   * Updates an existing receivingWorksheet custom fields using the specified data.
   * @param body ReceivingWorksheet to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateReceivingWorksheetCustomFields(ReceivingWorksheet body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateReceivingWorksheetCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/receivingWorksheet/customFields".replaceAll("\\{format\\}","json");

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
