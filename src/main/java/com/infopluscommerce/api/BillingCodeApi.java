package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.BillingCode;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
public class BillingCodeApi {
  private ApiClient apiClient;

  public BillingCodeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BillingCodeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a billingCode
   * Inserts a new billingCode using the specified data.
   * @param body BillingCode to be inserted. (required)
   * @return BillingCode
   * @throws ApiException if fails to make API call
   */
  public BillingCode addBillingCode(BillingCode body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addBillingCode");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/billingCode".replaceAll("\\{format\\}","json");

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

    
    GenericType<BillingCode> localVarReturnType = new GenericType<BillingCode>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete a billingCode
   * Deletes the billingCode identified by the specified id.
   * @param billingCodeId Id of the billingCode to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBillingCode(Integer billingCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'billingCodeId' is set
    if (billingCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'billingCodeId' when calling deleteBillingCode");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/billingCode/{billingCodeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billingCodeId" + "\\}", apiClient.escapeString(billingCodeId.toString()));

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
   * Search billingCodes by filter
   * Returns the list of billingCodes that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<BillingCode>
   * @throws ApiException if fails to make API call
   */
  public List<BillingCode> getBillingCodeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2.0/billingCode/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<BillingCode>> localVarReturnType = new GenericType<List<BillingCode>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a billingCode by id
   * Returns the billingCode identified by the specified id.
   * @param billingCodeId Id of the billingCode to be returned. (required)
   * @return BillingCode
   * @throws ApiException if fails to make API call
   */
  public BillingCode getBillingCodeById(Integer billingCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'billingCodeId' is set
    if (billingCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'billingCodeId' when calling getBillingCodeById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/billingCode/{billingCodeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billingCodeId" + "\\}", apiClient.escapeString(billingCodeId.toString()));

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

    
    GenericType<BillingCode> localVarReturnType = new GenericType<BillingCode>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a duplicated a billingCode by id
   * Returns a duplicated billingCode identified by the specified id.
   * @param billingCodeId Id of the billingCode to be duplicated. (required)
   * @return BillingCode
   * @throws ApiException if fails to make API call
   */
  public BillingCode getDuplicateBillingCodeById(Integer billingCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'billingCodeId' is set
    if (billingCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'billingCodeId' when calling getDuplicateBillingCodeById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/billingCode/duplicate/{billingCodeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billingCodeId" + "\\}", apiClient.escapeString(billingCodeId.toString()));

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

    
    GenericType<BillingCode> localVarReturnType = new GenericType<BillingCode>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a billingCode
   * Updates an existing billingCode using the specified data.
   * @param body BillingCode to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateBillingCode(BillingCode body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateBillingCode");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/billingCode".replaceAll("\\{format\\}","json");

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
   * Update a billingCode custom fields
   * Updates an existing billingCode custom fields using the specified data.
   * @param body BillingCode to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateBillingCodeCustomFields(BillingCode body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateBillingCodeCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/billingCode/customFields".replaceAll("\\{format\\}","json");

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
