package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.VendorComplianceSurvey;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class VendorComplianceSurveyApi {
  private ApiClient apiClient;

  public VendorComplianceSurveyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VendorComplianceSurveyApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update a vendorComplianceSurvey
   * Updates an existing vendorComplianceSurvey using the specified data.
   * @param body VendorComplianceSurvey to be updated.
   * @return void
   */
  public void updateVendorComplianceSurvey(VendorComplianceSurvey body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateVendorComplianceSurvey");
     }
     
    // create path and map variables
    String path = "/v1.0/vendorComplianceSurvey".replaceAll("\\{format\\}","json");

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
   * Create a vendorComplianceSurvey
   * Inserts a new vendorComplianceSurvey using the specified data.
   * @param body VendorComplianceSurvey to be inserted.
   * @return VendorComplianceSurvey
   */
  public VendorComplianceSurvey addVendorComplianceSurvey(VendorComplianceSurvey body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addVendorComplianceSurvey");
     }
     
    // create path and map variables
    String path = "/v1.0/vendorComplianceSurvey".replaceAll("\\{format\\}","json");

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

    
    GenericType<VendorComplianceSurvey> returnType = new GenericType<VendorComplianceSurvey>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search vendorComplianceSurveys by filter
   * Returns the list of vendorComplianceSurveys that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<VendorComplianceSurvey>
   */
  public List<VendorComplianceSurvey> getVendorComplianceSurveyByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/vendorComplianceSurvey/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<VendorComplianceSurvey>> returnType = new GenericType<List<VendorComplianceSurvey>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a vendorComplianceSurvey by id
   * Returns the vendorComplianceSurvey identified by the specified id.
   * @param vendorComplianceSurveyId Id of the vendorComplianceSurvey to be returned.
   * @return VendorComplianceSurvey
   */
  public VendorComplianceSurvey getVendorComplianceSurveyById(Integer vendorComplianceSurveyId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'vendorComplianceSurveyId' is set
     if (vendorComplianceSurveyId == null) {
        throw new ApiException(400, "Missing the required parameter 'vendorComplianceSurveyId' when calling getVendorComplianceSurveyById");
     }
     
    // create path and map variables
    String path = "/v1.0/vendorComplianceSurvey/{vendorComplianceSurveyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vendorComplianceSurveyId" + "\\}", apiClient.escapeString(vendorComplianceSurveyId.toString()));

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

    
    GenericType<VendorComplianceSurvey> returnType = new GenericType<VendorComplianceSurvey>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a vendorComplianceSurvey
   * Deletes the vendorComplianceSurvey identified by the specified id.
   * @param vendorComplianceSurveyId Id of the vendorComplianceSurvey to be deleted.
   * @return void
   */
  public void deleteVendorComplianceSurvey(Integer vendorComplianceSurveyId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'vendorComplianceSurveyId' is set
     if (vendorComplianceSurveyId == null) {
        throw new ApiException(400, "Missing the required parameter 'vendorComplianceSurveyId' when calling deleteVendorComplianceSurvey");
     }
     
    // create path and map variables
    String path = "/v1.0/vendorComplianceSurvey/{vendorComplianceSurveyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vendorComplianceSurveyId" + "\\}", apiClient.escapeString(vendorComplianceSurveyId.toString()));

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
