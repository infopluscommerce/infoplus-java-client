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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-04T22:56:01.104-05:00")
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
