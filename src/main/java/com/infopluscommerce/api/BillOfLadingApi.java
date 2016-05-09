package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.BillOfLading;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class BillOfLadingApi {
  private ApiClient apiClient;

  public BillOfLadingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BillOfLadingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update a billOfLading
   * Updates an existing billOfLading using the specified data.
   * @param body BillOfLading to be updated.
   * @return void
   */
  public void updateBillOfLading(BillOfLading body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateBillOfLading");
     }
     
    // create path and map variables
    String path = "/v1.0/billOfLading".replaceAll("\\{format\\}","json");

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
   * Create a billOfLading
   * Inserts a new billOfLading using the specified data.
   * @param body BillOfLading to be inserted.
   * @return BillOfLading
   */
  public BillOfLading addBillOfLading(BillOfLading body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addBillOfLading");
     }
     
    // create path and map variables
    String path = "/v1.0/billOfLading".replaceAll("\\{format\\}","json");

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

    
    GenericType<BillOfLading> returnType = new GenericType<BillOfLading>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search billOfLadings by filter
   * Returns the list of billOfLadings that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<BillOfLading>
   */
  public List<BillOfLading> getBillOfLadingByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/billOfLading/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<BillOfLading>> returnType = new GenericType<List<BillOfLading>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a billOfLading by id
   * Returns the billOfLading identified by the specified id.
   * @param billOfLadingId Id of the billOfLading to be returned.
   * @return BillOfLading
   */
  public BillOfLading getBillOfLadingById(Integer billOfLadingId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'billOfLadingId' is set
     if (billOfLadingId == null) {
        throw new ApiException(400, "Missing the required parameter 'billOfLadingId' when calling getBillOfLadingById");
     }
     
    // create path and map variables
    String path = "/v1.0/billOfLading/{billOfLadingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billOfLadingId" + "\\}", apiClient.escapeString(billOfLadingId.toString()));

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

    
    GenericType<BillOfLading> returnType = new GenericType<BillOfLading>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a billOfLading
   * Deletes the billOfLading identified by the specified id.
   * @param billOfLadingId Id of the billOfLading to be deleted.
   * @return void
   */
  public void deleteBillOfLading(Integer billOfLadingId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'billOfLadingId' is set
     if (billOfLadingId == null) {
        throw new ApiException(400, "Missing the required parameter 'billOfLadingId' when calling deleteBillOfLading");
     }
     
    // create path and map variables
    String path = "/v1.0/billOfLading/{billOfLadingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billOfLadingId" + "\\}", apiClient.escapeString(billOfLadingId.toString()));

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
