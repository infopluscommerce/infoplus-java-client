package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.BusinessTransaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
public class BusinessTransactionApi {
  private ApiClient apiClient;

  public BusinessTransactionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BusinessTransactionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Search businessTransactions by filter
   * Returns the list of businessTransactions that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<BusinessTransaction>
   * @throws ApiException if fails to make API call
   */
  public List<BusinessTransaction> getBusinessTransactionByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2.0/businessTransaction/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<BusinessTransaction>> localVarReturnType = new GenericType<List<BusinessTransaction>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a businessTransaction by id
   * Returns the businessTransaction identified by the specified id.
   * @param businessTransactionId Id of the businessTransaction to be returned. (required)
   * @return BusinessTransaction
   * @throws ApiException if fails to make API call
   */
  public BusinessTransaction getBusinessTransactionById(Integer businessTransactionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessTransactionId' is set
    if (businessTransactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'businessTransactionId' when calling getBusinessTransactionById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/businessTransaction/{businessTransactionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "businessTransactionId" + "\\}", apiClient.escapeString(businessTransactionId.toString()));

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

    
    GenericType<BusinessTransaction> localVarReturnType = new GenericType<BusinessTransaction>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a duplicated a businessTransaction by id
   * Returns a duplicated businessTransaction identified by the specified id.
   * @param businessTransactionId Id of the businessTransaction to be duplicated. (required)
   * @return BusinessTransaction
   * @throws ApiException if fails to make API call
   */
  public BusinessTransaction getDuplicateBusinessTransactionById(Integer businessTransactionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'businessTransactionId' is set
    if (businessTransactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'businessTransactionId' when calling getDuplicateBusinessTransactionById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/businessTransaction/duplicate/{businessTransactionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "businessTransactionId" + "\\}", apiClient.escapeString(businessTransactionId.toString()));

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

    
    GenericType<BusinessTransaction> localVarReturnType = new GenericType<BusinessTransaction>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a businessTransaction custom fields
   * Updates an existing businessTransaction custom fields using the specified data.
   * @param body BusinessTransaction to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateBusinessTransactionCustomFields(BusinessTransaction body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateBusinessTransactionCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/businessTransaction/customFields".replaceAll("\\{format\\}","json");

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
