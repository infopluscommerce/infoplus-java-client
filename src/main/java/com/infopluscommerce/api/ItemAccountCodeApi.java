package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ApiResponse;
import com.infopluscommerce.model.ItemAccountCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class ItemAccountCodeApi {
  private ApiClient apiClient;

  public ItemAccountCodeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemAccountCodeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an itemAccountCode
   * Inserts a new itemAccountCode using the specified data.
   * @param body ItemAccountCode to be inserted. (required)
   * @return ItemAccountCode
   * @throws ApiException if fails to make API call
   */
  public ItemAccountCode addItemAccountCode(ItemAccountCode body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addItemAccountCode");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemAccountCode".replaceAll("\\{format\\}","json");

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

    
    GenericType<ItemAccountCode> localVarReturnType = new GenericType<ItemAccountCode>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an itemAccountCode
   * Adds an audit to an existing itemAccountCode.
   * @param itemAccountCodeId Id of the itemAccountCode to add an audit to (required)
   * @param itemAccountCodeAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addItemAccountCodeAudit(Integer itemAccountCodeId, String itemAccountCodeAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemAccountCodeId' is set
    if (itemAccountCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemAccountCodeId' when calling addItemAccountCodeAudit");
    }
    
    // verify the required parameter 'itemAccountCodeAudit' is set
    if (itemAccountCodeAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'itemAccountCodeAudit' when calling addItemAccountCodeAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemAccountCode/{itemAccountCodeId}/audit/{itemAccountCodeAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemAccountCodeId" + "\\}", apiClient.escapeString(itemAccountCodeId.toString()))
      .replaceAll("\\{" + "itemAccountCodeAudit" + "\\}", apiClient.escapeString(itemAccountCodeAudit.toString()));

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
   * Add new tags for an itemAccountCode.
   * Adds a tag to an existing itemAccountCode.
   * @param itemAccountCodeId Id of the itemAccountCode to add a tag to (required)
   * @param itemAccountCodeTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addItemAccountCodeTag(Integer itemAccountCodeId, String itemAccountCodeTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemAccountCodeId' is set
    if (itemAccountCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemAccountCodeId' when calling addItemAccountCodeTag");
    }
    
    // verify the required parameter 'itemAccountCodeTag' is set
    if (itemAccountCodeTag == null) {
      throw new ApiException(400, "Missing the required parameter 'itemAccountCodeTag' when calling addItemAccountCodeTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemAccountCode/{itemAccountCodeId}/tag/{itemAccountCodeTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemAccountCodeId" + "\\}", apiClient.escapeString(itemAccountCodeId.toString()))
      .replaceAll("\\{" + "itemAccountCodeTag" + "\\}", apiClient.escapeString(itemAccountCodeTag.toString()));

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
   * Delete an itemAccountCode
   * Deletes the itemAccountCode identified by the specified id.
   * @param itemAccountCodeId Id of the itemAccountCode to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemAccountCode(Integer itemAccountCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemAccountCodeId' is set
    if (itemAccountCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemAccountCodeId' when calling deleteItemAccountCode");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemAccountCode/{itemAccountCodeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemAccountCodeId" + "\\}", apiClient.escapeString(itemAccountCodeId.toString()));

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
   * Delete a tag for an itemAccountCode.
   * Deletes an existing itemAccountCode tag using the specified data.
   * @param itemAccountCodeId Id of the itemAccountCode to remove tag from (required)
   * @param itemAccountCodeTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemAccountCodeTag(Integer itemAccountCodeId, String itemAccountCodeTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemAccountCodeId' is set
    if (itemAccountCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemAccountCodeId' when calling deleteItemAccountCodeTag");
    }
    
    // verify the required parameter 'itemAccountCodeTag' is set
    if (itemAccountCodeTag == null) {
      throw new ApiException(400, "Missing the required parameter 'itemAccountCodeTag' when calling deleteItemAccountCodeTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemAccountCode/{itemAccountCodeId}/tag/{itemAccountCodeTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemAccountCodeId" + "\\}", apiClient.escapeString(itemAccountCodeId.toString()))
      .replaceAll("\\{" + "itemAccountCodeTag" + "\\}", apiClient.escapeString(itemAccountCodeTag.toString()));

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
   * Get a duplicated an itemAccountCode by id
   * Returns a duplicated itemAccountCode identified by the specified id.
   * @param itemAccountCodeId Id of the itemAccountCode to be duplicated. (required)
   * @return ItemAccountCode
   * @throws ApiException if fails to make API call
   */
  public ItemAccountCode getDuplicateItemAccountCodeById(Integer itemAccountCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemAccountCodeId' is set
    if (itemAccountCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemAccountCodeId' when calling getDuplicateItemAccountCodeById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemAccountCode/duplicate/{itemAccountCodeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemAccountCodeId" + "\\}", apiClient.escapeString(itemAccountCodeId.toString()));

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

    
    GenericType<ItemAccountCode> localVarReturnType = new GenericType<ItemAccountCode>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search itemAccountCodes by filter
   * Returns the list of itemAccountCodes that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ItemAccountCode>
   * @throws ApiException if fails to make API call
   */
  public List<ItemAccountCode> getItemAccountCodeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/itemAccountCode/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ItemAccountCode>> localVarReturnType = new GenericType<List<ItemAccountCode>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an itemAccountCode by id
   * Returns the itemAccountCode identified by the specified id.
   * @param itemAccountCodeId Id of the itemAccountCode to be returned. (required)
   * @return ItemAccountCode
   * @throws ApiException if fails to make API call
   */
  public ItemAccountCode getItemAccountCodeById(Integer itemAccountCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemAccountCodeId' is set
    if (itemAccountCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemAccountCodeId' when calling getItemAccountCodeById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemAccountCode/{itemAccountCodeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemAccountCodeId" + "\\}", apiClient.escapeString(itemAccountCodeId.toString()));

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

    
    GenericType<ItemAccountCode> localVarReturnType = new GenericType<ItemAccountCode>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an itemAccountCode.
   * Get all existing itemAccountCode tags.
   * @param itemAccountCodeId Id of the itemAccountCode to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getItemAccountCodeTags(Integer itemAccountCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemAccountCodeId' is set
    if (itemAccountCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemAccountCodeId' when calling getItemAccountCodeTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemAccountCode/{itemAccountCodeId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemAccountCodeId" + "\\}", apiClient.escapeString(itemAccountCodeId.toString()));

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
   * Update an itemAccountCode
   * Updates an existing itemAccountCode using the specified data.
   * @param body ItemAccountCode to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateItemAccountCode(ItemAccountCode body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateItemAccountCode");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemAccountCode".replaceAll("\\{format\\}","json");

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
