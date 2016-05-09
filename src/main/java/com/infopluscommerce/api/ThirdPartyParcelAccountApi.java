package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ThirdPartyParcelAccount;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class ThirdPartyParcelAccountApi {
  private ApiClient apiClient;

  public ThirdPartyParcelAccountApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ThirdPartyParcelAccountApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update a thirdPartyParcelAccount
   * Updates an existing thirdPartyParcelAccount using the specified data.
   * @param body ThirdPartyParcelAccount to be updated.
   * @return void
   */
  public void updateThirdPartyParcelAccount(ThirdPartyParcelAccount body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateThirdPartyParcelAccount");
     }
     
    // create path and map variables
    String path = "/v1.0/thirdPartyParcelAccount".replaceAll("\\{format\\}","json");

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
   * Create a thirdPartyParcelAccount
   * Inserts a new thirdPartyParcelAccount using the specified data.
   * @param body ThirdPartyParcelAccount to be inserted.
   * @return ThirdPartyParcelAccount
   */
  public ThirdPartyParcelAccount addThirdPartyParcelAccount(ThirdPartyParcelAccount body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addThirdPartyParcelAccount");
     }
     
    // create path and map variables
    String path = "/v1.0/thirdPartyParcelAccount".replaceAll("\\{format\\}","json");

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

    
    GenericType<ThirdPartyParcelAccount> returnType = new GenericType<ThirdPartyParcelAccount>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search thirdPartyParcelAccounts by filter
   * Returns the list of thirdPartyParcelAccounts that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<ThirdPartyParcelAccount>
   */
  public List<ThirdPartyParcelAccount> getThirdPartyParcelAccountByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/thirdPartyParcelAccount/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ThirdPartyParcelAccount>> returnType = new GenericType<List<ThirdPartyParcelAccount>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a thirdPartyParcelAccount by id
   * Returns the thirdPartyParcelAccount identified by the specified id.
   * @param thirdPartyParcelAccountId Id of the thirdPartyParcelAccount to be returned.
   * @return ThirdPartyParcelAccount
   */
  public ThirdPartyParcelAccount getThirdPartyParcelAccountById(Integer thirdPartyParcelAccountId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'thirdPartyParcelAccountId' is set
     if (thirdPartyParcelAccountId == null) {
        throw new ApiException(400, "Missing the required parameter 'thirdPartyParcelAccountId' when calling getThirdPartyParcelAccountById");
     }
     
    // create path and map variables
    String path = "/v1.0/thirdPartyParcelAccount/{thirdPartyParcelAccountId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "thirdPartyParcelAccountId" + "\\}", apiClient.escapeString(thirdPartyParcelAccountId.toString()));

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

    
    GenericType<ThirdPartyParcelAccount> returnType = new GenericType<ThirdPartyParcelAccount>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a thirdPartyParcelAccount
   * Deletes the thirdPartyParcelAccount identified by the specified id.
   * @param thirdPartyParcelAccountId Id of the thirdPartyParcelAccount to be deleted.
   * @return void
   */
  public void deleteThirdPartyParcelAccount(Integer thirdPartyParcelAccountId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'thirdPartyParcelAccountId' is set
     if (thirdPartyParcelAccountId == null) {
        throw new ApiException(400, "Missing the required parameter 'thirdPartyParcelAccountId' when calling deleteThirdPartyParcelAccount");
     }
     
    // create path and map variables
    String path = "/v1.0/thirdPartyParcelAccount/{thirdPartyParcelAccountId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "thirdPartyParcelAccountId" + "\\}", apiClient.escapeString(thirdPartyParcelAccountId.toString()));

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
