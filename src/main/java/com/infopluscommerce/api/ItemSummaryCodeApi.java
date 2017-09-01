package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ItemSummaryCode;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class ItemSummaryCodeApi {
  private ApiClient apiClient;

  public ItemSummaryCodeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemSummaryCodeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an itemSummaryCode
   * Inserts a new itemSummaryCode using the specified data.
   * @param body ItemSummaryCode to be inserted. (required)
   * @return ItemSummaryCode
   * @throws ApiException if fails to make API call
   */
  public ItemSummaryCode addItemSummaryCode(ItemSummaryCode body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addItemSummaryCode");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSummaryCode".replaceAll("\\{format\\}","json");

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

    
    GenericType<ItemSummaryCode> localVarReturnType = new GenericType<ItemSummaryCode>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an itemSummaryCode
   * Adds an audit to an existing itemSummaryCode.
   * @param itemSummaryCodeId Id of the itemSummaryCode to add an audit to (required)
   * @param itemSummaryCodeAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addItemSummaryCodeAudit(Integer itemSummaryCodeId, String itemSummaryCodeAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSummaryCodeId' is set
    if (itemSummaryCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSummaryCodeId' when calling addItemSummaryCodeAudit");
    }
    
    // verify the required parameter 'itemSummaryCodeAudit' is set
    if (itemSummaryCodeAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSummaryCodeAudit' when calling addItemSummaryCodeAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSummaryCode/{itemSummaryCodeId}/audit/{itemSummaryCodeAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSummaryCodeId" + "\\}", apiClient.escapeString(itemSummaryCodeId.toString()))
      .replaceAll("\\{" + "itemSummaryCodeAudit" + "\\}", apiClient.escapeString(itemSummaryCodeAudit.toString()));

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
   * Add new tags for an itemSummaryCode.
   * Adds a tag to an existing itemSummaryCode.
   * @param itemSummaryCodeId Id of the itemSummaryCode to add a tag to (required)
   * @param itemSummaryCodeTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addItemSummaryCodeTag(Integer itemSummaryCodeId, String itemSummaryCodeTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSummaryCodeId' is set
    if (itemSummaryCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSummaryCodeId' when calling addItemSummaryCodeTag");
    }
    
    // verify the required parameter 'itemSummaryCodeTag' is set
    if (itemSummaryCodeTag == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSummaryCodeTag' when calling addItemSummaryCodeTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSummaryCode/{itemSummaryCodeId}/tag/{itemSummaryCodeTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSummaryCodeId" + "\\}", apiClient.escapeString(itemSummaryCodeId.toString()))
      .replaceAll("\\{" + "itemSummaryCodeTag" + "\\}", apiClient.escapeString(itemSummaryCodeTag.toString()));

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
   * Delete an itemSummaryCode
   * Deletes the itemSummaryCode identified by the specified id.
   * @param itemSummaryCodeId Id of the itemSummaryCode to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemSummaryCode(Integer itemSummaryCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSummaryCodeId' is set
    if (itemSummaryCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSummaryCodeId' when calling deleteItemSummaryCode");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSummaryCode/{itemSummaryCodeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSummaryCodeId" + "\\}", apiClient.escapeString(itemSummaryCodeId.toString()));

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
   * Delete a tag for an itemSummaryCode.
   * Deletes an existing itemSummaryCode tag using the specified data.
   * @param itemSummaryCodeId Id of the itemSummaryCode to remove tag from (required)
   * @param itemSummaryCodeTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemSummaryCodeTag(Integer itemSummaryCodeId, String itemSummaryCodeTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSummaryCodeId' is set
    if (itemSummaryCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSummaryCodeId' when calling deleteItemSummaryCodeTag");
    }
    
    // verify the required parameter 'itemSummaryCodeTag' is set
    if (itemSummaryCodeTag == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSummaryCodeTag' when calling deleteItemSummaryCodeTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSummaryCode/{itemSummaryCodeId}/tag/{itemSummaryCodeTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSummaryCodeId" + "\\}", apiClient.escapeString(itemSummaryCodeId.toString()))
      .replaceAll("\\{" + "itemSummaryCodeTag" + "\\}", apiClient.escapeString(itemSummaryCodeTag.toString()));

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
   * Get a duplicated an itemSummaryCode by id
   * Returns a duplicated itemSummaryCode identified by the specified id.
   * @param itemSummaryCodeId Id of the itemSummaryCode to be duplicated. (required)
   * @return ItemSummaryCode
   * @throws ApiException if fails to make API call
   */
  public ItemSummaryCode getDuplicateItemSummaryCodeById(Integer itemSummaryCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSummaryCodeId' is set
    if (itemSummaryCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSummaryCodeId' when calling getDuplicateItemSummaryCodeById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSummaryCode/duplicate/{itemSummaryCodeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSummaryCodeId" + "\\}", apiClient.escapeString(itemSummaryCodeId.toString()));

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

    
    GenericType<ItemSummaryCode> localVarReturnType = new GenericType<ItemSummaryCode>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search itemSummaryCodes by filter
   * Returns the list of itemSummaryCodes that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ItemSummaryCode>
   * @throws ApiException if fails to make API call
   */
  public List<ItemSummaryCode> getItemSummaryCodeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/itemSummaryCode/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ItemSummaryCode>> localVarReturnType = new GenericType<List<ItemSummaryCode>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an itemSummaryCode by id
   * Returns the itemSummaryCode identified by the specified id.
   * @param itemSummaryCodeId Id of the itemSummaryCode to be returned. (required)
   * @return ItemSummaryCode
   * @throws ApiException if fails to make API call
   */
  public ItemSummaryCode getItemSummaryCodeById(Integer itemSummaryCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSummaryCodeId' is set
    if (itemSummaryCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSummaryCodeId' when calling getItemSummaryCodeById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSummaryCode/{itemSummaryCodeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSummaryCodeId" + "\\}", apiClient.escapeString(itemSummaryCodeId.toString()));

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

    
    GenericType<ItemSummaryCode> localVarReturnType = new GenericType<ItemSummaryCode>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an itemSummaryCode.
   * Get all existing itemSummaryCode tags.
   * @param itemSummaryCodeId Id of the itemSummaryCode to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getItemSummaryCodeTags(Integer itemSummaryCodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSummaryCodeId' is set
    if (itemSummaryCodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSummaryCodeId' when calling getItemSummaryCodeTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSummaryCode/{itemSummaryCodeId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSummaryCodeId" + "\\}", apiClient.escapeString(itemSummaryCodeId.toString()));

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
   * Update an itemSummaryCode
   * Updates an existing itemSummaryCode using the specified data.
   * @param body ItemSummaryCode to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateItemSummaryCode(ItemSummaryCode body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateItemSummaryCode");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSummaryCode".replaceAll("\\{format\\}","json");

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
