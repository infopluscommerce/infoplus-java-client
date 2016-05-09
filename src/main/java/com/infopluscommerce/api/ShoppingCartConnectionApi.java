package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ShoppingCartConnection;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class ShoppingCartConnectionApi {
  private ApiClient apiClient;

  public ShoppingCartConnectionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ShoppingCartConnectionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update a shoppingCartConnection
   * Updates an existing shoppingCartConnection using the specified data.
   * @param body ShoppingCartConnection to be updated.
   * @return void
   */
  public void updateShoppingCartConnection(ShoppingCartConnection body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateShoppingCartConnection");
     }
     
    // create path and map variables
    String path = "/v1.0/shoppingCartConnection".replaceAll("\\{format\\}","json");

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
   * Create a shoppingCartConnection
   * Inserts a new shoppingCartConnection using the specified data.
   * @param body ShoppingCartConnection to be inserted.
   * @return ShoppingCartConnection
   */
  public ShoppingCartConnection addShoppingCartConnection(ShoppingCartConnection body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addShoppingCartConnection");
     }
     
    // create path and map variables
    String path = "/v1.0/shoppingCartConnection".replaceAll("\\{format\\}","json");

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

    
    GenericType<ShoppingCartConnection> returnType = new GenericType<ShoppingCartConnection>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search shoppingCartConnections by filter
   * Returns the list of shoppingCartConnections that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<ShoppingCartConnection>
   */
  public List<ShoppingCartConnection> getShoppingCartConnectionByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/shoppingCartConnection/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ShoppingCartConnection>> returnType = new GenericType<List<ShoppingCartConnection>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a shoppingCartConnection by id
   * Returns the shoppingCartConnection identified by the specified id.
   * @param shoppingCartConnectionId Id of the shoppingCartConnection to be returned.
   * @return ShoppingCartConnection
   */
  public ShoppingCartConnection getShoppingCartConnectionById(Integer shoppingCartConnectionId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'shoppingCartConnectionId' is set
     if (shoppingCartConnectionId == null) {
        throw new ApiException(400, "Missing the required parameter 'shoppingCartConnectionId' when calling getShoppingCartConnectionById");
     }
     
    // create path and map variables
    String path = "/v1.0/shoppingCartConnection/{shoppingCartConnectionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shoppingCartConnectionId" + "\\}", apiClient.escapeString(shoppingCartConnectionId.toString()));

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

    
    GenericType<ShoppingCartConnection> returnType = new GenericType<ShoppingCartConnection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a shoppingCartConnection
   * Deletes the shoppingCartConnection identified by the specified id.
   * @param shoppingCartConnectionId Id of the shoppingCartConnection to be deleted.
   * @return void
   */
  public void deleteShoppingCartConnection(Integer shoppingCartConnectionId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'shoppingCartConnectionId' is set
     if (shoppingCartConnectionId == null) {
        throw new ApiException(400, "Missing the required parameter 'shoppingCartConnectionId' when calling deleteShoppingCartConnection");
     }
     
    // create path and map variables
    String path = "/v1.0/shoppingCartConnection/{shoppingCartConnectionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shoppingCartConnectionId" + "\\}", apiClient.escapeString(shoppingCartConnectionId.toString()));

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
