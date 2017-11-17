package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.BillingCodeType;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
public class BillingCodeTypeApi {
  private ApiClient apiClient;

  public BillingCodeTypeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BillingCodeTypeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a billingCodeType
   * Inserts a new billingCodeType using the specified data.
   * @param body BillingCodeType to be inserted. (required)
   * @return BillingCodeType
   * @throws ApiException if fails to make API call
   */
  public BillingCodeType addBillingCodeType(BillingCodeType body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addBillingCodeType");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/billingCodeType".replaceAll("\\{format\\}","json");

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

    
    GenericType<BillingCodeType> localVarReturnType = new GenericType<BillingCodeType>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete a billingCodeType
   * Deletes the billingCodeType identified by the specified id.
   * @param billingCodeTypeId Id of the billingCodeType to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBillingCodeType(Integer billingCodeTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'billingCodeTypeId' is set
    if (billingCodeTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'billingCodeTypeId' when calling deleteBillingCodeType");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/billingCodeType/{billingCodeTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billingCodeTypeId" + "\\}", apiClient.escapeString(billingCodeTypeId.toString()));

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
   * Search billingCodeTypes by filter
   * Returns the list of billingCodeTypes that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<BillingCodeType>
   * @throws ApiException if fails to make API call
   */
  public List<BillingCodeType> getBillingCodeTypeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2.0/billingCodeType/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<BillingCodeType>> localVarReturnType = new GenericType<List<BillingCodeType>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a billingCodeType by id
   * Returns the billingCodeType identified by the specified id.
   * @param billingCodeTypeId Id of the billingCodeType to be returned. (required)
   * @return BillingCodeType
   * @throws ApiException if fails to make API call
   */
  public BillingCodeType getBillingCodeTypeById(Integer billingCodeTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'billingCodeTypeId' is set
    if (billingCodeTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'billingCodeTypeId' when calling getBillingCodeTypeById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/billingCodeType/{billingCodeTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billingCodeTypeId" + "\\}", apiClient.escapeString(billingCodeTypeId.toString()));

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

    
    GenericType<BillingCodeType> localVarReturnType = new GenericType<BillingCodeType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a duplicated a billingCodeType by id
   * Returns a duplicated billingCodeType identified by the specified id.
   * @param billingCodeTypeId Id of the billingCodeType to be duplicated. (required)
   * @return BillingCodeType
   * @throws ApiException if fails to make API call
   */
  public BillingCodeType getDuplicateBillingCodeTypeById(Integer billingCodeTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'billingCodeTypeId' is set
    if (billingCodeTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'billingCodeTypeId' when calling getDuplicateBillingCodeTypeById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/billingCodeType/duplicate/{billingCodeTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billingCodeTypeId" + "\\}", apiClient.escapeString(billingCodeTypeId.toString()));

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

    
    GenericType<BillingCodeType> localVarReturnType = new GenericType<BillingCodeType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a billingCodeType
   * Updates an existing billingCodeType using the specified data.
   * @param body BillingCodeType to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateBillingCodeType(BillingCodeType body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateBillingCodeType");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/billingCodeType".replaceAll("\\{format\\}","json");

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
   * Update a billingCodeType custom fields
   * Updates an existing billingCodeType custom fields using the specified data.
   * @param body BillingCodeType to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateBillingCodeTypeCustomFields(BillingCodeType body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateBillingCodeTypeCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/billingCodeType/customFields".replaceAll("\\{format\\}","json");

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
