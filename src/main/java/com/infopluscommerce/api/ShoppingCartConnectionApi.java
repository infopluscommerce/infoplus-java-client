package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ShoppingCartConnection;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
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
   * Create a shoppingCartConnection
   * Inserts a new shoppingCartConnection using the specified data.
   * @param body ShoppingCartConnection to be inserted. (required)
   * @return ShoppingCartConnection
   * @throws ApiException if fails to make API call
   */
  public ShoppingCartConnection addShoppingCartConnection(ShoppingCartConnection body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addShoppingCartConnection");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shoppingCartConnection".replaceAll("\\{format\\}","json");

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

    
    GenericType<ShoppingCartConnection> localVarReturnType = new GenericType<ShoppingCartConnection>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a shoppingCartConnection
   * Adds an audit to an existing shoppingCartConnection.
   * @param shoppingCartConnectionId Id of the shoppingCartConnection to add an audit to (required)
   * @param shoppingCartConnectionAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addShoppingCartConnectionAudit(Integer shoppingCartConnectionId, String shoppingCartConnectionAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shoppingCartConnectionId' is set
    if (shoppingCartConnectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'shoppingCartConnectionId' when calling addShoppingCartConnectionAudit");
    }
    
    // verify the required parameter 'shoppingCartConnectionAudit' is set
    if (shoppingCartConnectionAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'shoppingCartConnectionAudit' when calling addShoppingCartConnectionAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shoppingCartConnection/{shoppingCartConnectionId}/audit/{shoppingCartConnectionAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shoppingCartConnectionId" + "\\}", apiClient.escapeString(shoppingCartConnectionId.toString()))
      .replaceAll("\\{" + "shoppingCartConnectionAudit" + "\\}", apiClient.escapeString(shoppingCartConnectionAudit.toString()));

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
   * Add new tags for a shoppingCartConnection.
   * Adds a tag to an existing shoppingCartConnection.
   * @param shoppingCartConnectionId Id of the shoppingCartConnection to add a tag to (required)
   * @param shoppingCartConnectionTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addShoppingCartConnectionTag(Integer shoppingCartConnectionId, String shoppingCartConnectionTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shoppingCartConnectionId' is set
    if (shoppingCartConnectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'shoppingCartConnectionId' when calling addShoppingCartConnectionTag");
    }
    
    // verify the required parameter 'shoppingCartConnectionTag' is set
    if (shoppingCartConnectionTag == null) {
      throw new ApiException(400, "Missing the required parameter 'shoppingCartConnectionTag' when calling addShoppingCartConnectionTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shoppingCartConnection/{shoppingCartConnectionId}/tag/{shoppingCartConnectionTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shoppingCartConnectionId" + "\\}", apiClient.escapeString(shoppingCartConnectionId.toString()))
      .replaceAll("\\{" + "shoppingCartConnectionTag" + "\\}", apiClient.escapeString(shoppingCartConnectionTag.toString()));

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
   * Delete a shoppingCartConnection
   * Deletes the shoppingCartConnection identified by the specified id.
   * @param shoppingCartConnectionId Id of the shoppingCartConnection to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteShoppingCartConnection(Integer shoppingCartConnectionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shoppingCartConnectionId' is set
    if (shoppingCartConnectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'shoppingCartConnectionId' when calling deleteShoppingCartConnection");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shoppingCartConnection/{shoppingCartConnectionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shoppingCartConnectionId" + "\\}", apiClient.escapeString(shoppingCartConnectionId.toString()));

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
   * Delete a tag for a shoppingCartConnection.
   * Deletes an existing shoppingCartConnection tag using the specified data.
   * @param shoppingCartConnectionId Id of the shoppingCartConnection to remove tag from (required)
   * @param shoppingCartConnectionTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteShoppingCartConnectionTag(Integer shoppingCartConnectionId, String shoppingCartConnectionTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shoppingCartConnectionId' is set
    if (shoppingCartConnectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'shoppingCartConnectionId' when calling deleteShoppingCartConnectionTag");
    }
    
    // verify the required parameter 'shoppingCartConnectionTag' is set
    if (shoppingCartConnectionTag == null) {
      throw new ApiException(400, "Missing the required parameter 'shoppingCartConnectionTag' when calling deleteShoppingCartConnectionTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shoppingCartConnection/{shoppingCartConnectionId}/tag/{shoppingCartConnectionTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shoppingCartConnectionId" + "\\}", apiClient.escapeString(shoppingCartConnectionId.toString()))
      .replaceAll("\\{" + "shoppingCartConnectionTag" + "\\}", apiClient.escapeString(shoppingCartConnectionTag.toString()));

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
   * Get a duplicated a shoppingCartConnection by id
   * Returns a duplicated shoppingCartConnection identified by the specified id.
   * @param shoppingCartConnectionId Id of the shoppingCartConnection to be duplicated. (required)
   * @return ShoppingCartConnection
   * @throws ApiException if fails to make API call
   */
  public ShoppingCartConnection getDuplicateShoppingCartConnectionById(Integer shoppingCartConnectionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shoppingCartConnectionId' is set
    if (shoppingCartConnectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'shoppingCartConnectionId' when calling getDuplicateShoppingCartConnectionById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shoppingCartConnection/duplicate/{shoppingCartConnectionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shoppingCartConnectionId" + "\\}", apiClient.escapeString(shoppingCartConnectionId.toString()));

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

    
    GenericType<ShoppingCartConnection> localVarReturnType = new GenericType<ShoppingCartConnection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search shoppingCartConnections by filter
   * Returns the list of shoppingCartConnections that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ShoppingCartConnection>
   * @throws ApiException if fails to make API call
   */
  public List<ShoppingCartConnection> getShoppingCartConnectionByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/shoppingCartConnection/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ShoppingCartConnection>> localVarReturnType = new GenericType<List<ShoppingCartConnection>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a shoppingCartConnection by id
   * Returns the shoppingCartConnection identified by the specified id.
   * @param shoppingCartConnectionId Id of the shoppingCartConnection to be returned. (required)
   * @return ShoppingCartConnection
   * @throws ApiException if fails to make API call
   */
  public ShoppingCartConnection getShoppingCartConnectionById(Integer shoppingCartConnectionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shoppingCartConnectionId' is set
    if (shoppingCartConnectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'shoppingCartConnectionId' when calling getShoppingCartConnectionById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shoppingCartConnection/{shoppingCartConnectionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shoppingCartConnectionId" + "\\}", apiClient.escapeString(shoppingCartConnectionId.toString()));

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

    
    GenericType<ShoppingCartConnection> localVarReturnType = new GenericType<ShoppingCartConnection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a shoppingCartConnection.
   * Get all existing shoppingCartConnection tags.
   * @param shoppingCartConnectionId Id of the shoppingCartConnection to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getShoppingCartConnectionTags(Integer shoppingCartConnectionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shoppingCartConnectionId' is set
    if (shoppingCartConnectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'shoppingCartConnectionId' when calling getShoppingCartConnectionTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shoppingCartConnection/{shoppingCartConnectionId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shoppingCartConnectionId" + "\\}", apiClient.escapeString(shoppingCartConnectionId.toString()));

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

    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Update a shoppingCartConnection
   * Updates an existing shoppingCartConnection using the specified data.
   * @param body ShoppingCartConnection to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateShoppingCartConnection(ShoppingCartConnection body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateShoppingCartConnection");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shoppingCartConnection".replaceAll("\\{format\\}","json");

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
   * Update a shoppingCartConnection custom fields
   * Updates an existing shoppingCartConnection custom fields using the specified data.
   * @param body ShoppingCartConnection to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateShoppingCartConnectionCustomFields(ShoppingCartConnection body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateShoppingCartConnectionCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shoppingCartConnection/customFields".replaceAll("\\{format\\}","json");

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
