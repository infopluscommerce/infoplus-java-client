package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.OverrideReturnAddress;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class OverrideReturnAddressApi {
  private ApiClient apiClient;

  public OverrideReturnAddressApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OverrideReturnAddressApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update an overrideReturnAddress
   * Updates an existing overrideReturnAddress using the specified data.
   * @param body OverrideReturnAddress to be updated.
   * @return void
   */
  public void updateOverrideReturnAddress(OverrideReturnAddress body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateOverrideReturnAddress");
     }
     
    // create path and map variables
    String path = "/v1.0/overrideReturnAddress".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Create an overrideReturnAddress
   * Inserts a new overrideReturnAddress using the specified data.
   * @param body OverrideReturnAddress to be inserted.
   * @return OverrideReturnAddress
   */
  public OverrideReturnAddress addOverrideReturnAddress(OverrideReturnAddress body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addOverrideReturnAddress");
     }
     
    // create path and map variables
    String path = "/v1.0/overrideReturnAddress".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<OverrideReturnAddress> returnType = new GenericType<OverrideReturnAddress>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search overrideReturnAddresses by filter
   * Returns the list of overrideReturnAddresses that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<OverrideReturnAddress>
   */
  public List<OverrideReturnAddress> getOverrideReturnAddressByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/overrideReturnAddress/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<List<OverrideReturnAddress>> returnType = new GenericType<List<OverrideReturnAddress>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get an overrideReturnAddress by id
   * Returns the overrideReturnAddress identified by the specified id.
   * @param overrideReturnAddressId Id of the overrideReturnAddress to be returned.
   * @return OverrideReturnAddress
   */
  public OverrideReturnAddress getOverrideReturnAddressById(Integer overrideReturnAddressId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'overrideReturnAddressId' is set
     if (overrideReturnAddressId == null) {
        throw new ApiException(400, "Missing the required parameter 'overrideReturnAddressId' when calling getOverrideReturnAddressById");
     }
     
    // create path and map variables
    String path = "/v1.0/overrideReturnAddress/{overrideReturnAddressId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "overrideReturnAddressId" + "\\}", apiClient.escapeString(overrideReturnAddressId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<OverrideReturnAddress> returnType = new GenericType<OverrideReturnAddress>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete an overrideReturnAddress
   * Deletes the overrideReturnAddress identified by the specified id.
   * @param overrideReturnAddressId Id of the overrideReturnAddress to be deleted.
   * @return void
   */
  public void deleteOverrideReturnAddress(Integer overrideReturnAddressId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'overrideReturnAddressId' is set
     if (overrideReturnAddressId == null) {
        throw new ApiException(400, "Missing the required parameter 'overrideReturnAddressId' when calling deleteOverrideReturnAddress");
     }
     
    // create path and map variables
    String path = "/v1.0/overrideReturnAddress/{overrideReturnAddressId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "overrideReturnAddressId" + "\\}", apiClient.escapeString(overrideReturnAddressId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
}
