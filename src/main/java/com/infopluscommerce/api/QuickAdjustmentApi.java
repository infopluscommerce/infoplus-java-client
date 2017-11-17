package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.QuickAdjustment;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
public class QuickAdjustmentApi {
  private ApiClient apiClient;

  public QuickAdjustmentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public QuickAdjustmentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a quickAdjustment
   * Inserts a new quickAdjustment using the specified data.
   * @param body QuickAdjustment to be inserted. (required)
   * @return QuickAdjustment
   * @throws ApiException if fails to make API call
   */
  public QuickAdjustment addQuickAdjustment(QuickAdjustment body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addQuickAdjustment");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/quickAdjustment".replaceAll("\\{format\\}","json");

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

    
    GenericType<QuickAdjustment> localVarReturnType = new GenericType<QuickAdjustment>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete a quickAdjustment
   * Deletes the quickAdjustment identified by the specified id.
   * @param quickAdjustmentId Id of the quickAdjustment to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteQuickAdjustment(Integer quickAdjustmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'quickAdjustmentId' is set
    if (quickAdjustmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'quickAdjustmentId' when calling deleteQuickAdjustment");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/quickAdjustment/{quickAdjustmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "quickAdjustmentId" + "\\}", apiClient.escapeString(quickAdjustmentId.toString()));

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
   * Get a duplicated a quickAdjustment by id
   * Returns a duplicated quickAdjustment identified by the specified id.
   * @param quickAdjustmentId Id of the quickAdjustment to be duplicated. (required)
   * @return QuickAdjustment
   * @throws ApiException if fails to make API call
   */
  public QuickAdjustment getDuplicateQuickAdjustmentById(Integer quickAdjustmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'quickAdjustmentId' is set
    if (quickAdjustmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'quickAdjustmentId' when calling getDuplicateQuickAdjustmentById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/quickAdjustment/duplicate/{quickAdjustmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "quickAdjustmentId" + "\\}", apiClient.escapeString(quickAdjustmentId.toString()));

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

    
    GenericType<QuickAdjustment> localVarReturnType = new GenericType<QuickAdjustment>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search quickAdjustments by filter
   * Returns the list of quickAdjustments that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<QuickAdjustment>
   * @throws ApiException if fails to make API call
   */
  public List<QuickAdjustment> getQuickAdjustmentByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2.0/quickAdjustment/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<QuickAdjustment>> localVarReturnType = new GenericType<List<QuickAdjustment>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a quickAdjustment by id
   * Returns the quickAdjustment identified by the specified id.
   * @param quickAdjustmentId Id of the quickAdjustment to be returned. (required)
   * @return QuickAdjustment
   * @throws ApiException if fails to make API call
   */
  public QuickAdjustment getQuickAdjustmentById(Integer quickAdjustmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'quickAdjustmentId' is set
    if (quickAdjustmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'quickAdjustmentId' when calling getQuickAdjustmentById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/quickAdjustment/{quickAdjustmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "quickAdjustmentId" + "\\}", apiClient.escapeString(quickAdjustmentId.toString()));

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

    
    GenericType<QuickAdjustment> localVarReturnType = new GenericType<QuickAdjustment>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a quickAdjustment
   * Updates an existing quickAdjustment using the specified data.
   * @param body QuickAdjustment to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateQuickAdjustment(QuickAdjustment body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateQuickAdjustment");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/quickAdjustment".replaceAll("\\{format\\}","json");

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
   * Update a quickAdjustment custom fields
   * Updates an existing quickAdjustment custom fields using the specified data.
   * @param body QuickAdjustment to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateQuickAdjustmentCustomFields(QuickAdjustment body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateQuickAdjustmentCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/quickAdjustment/customFields".replaceAll("\\{format\\}","json");

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
