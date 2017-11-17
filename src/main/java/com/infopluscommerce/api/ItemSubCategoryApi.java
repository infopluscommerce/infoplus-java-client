package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ItemSubCategory;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class ItemSubCategoryApi {
  private ApiClient apiClient;

  public ItemSubCategoryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemSubCategoryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an itemSubCategory
   * Inserts a new itemSubCategory using the specified data.
   * @param body ItemSubCategory to be inserted. (required)
   * @return ItemSubCategory
   * @throws ApiException if fails to make API call
   */
  public ItemSubCategory addItemSubCategory(ItemSubCategory body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addItemSubCategory");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSubCategory".replaceAll("\\{format\\}","json");

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

    
    GenericType<ItemSubCategory> localVarReturnType = new GenericType<ItemSubCategory>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an itemSubCategory
   * Adds an audit to an existing itemSubCategory.
   * @param itemSubCategoryId Id of the itemSubCategory to add an audit to (required)
   * @param itemSubCategoryAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addItemSubCategoryAudit(Integer itemSubCategoryId, String itemSubCategoryAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSubCategoryId' is set
    if (itemSubCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSubCategoryId' when calling addItemSubCategoryAudit");
    }
    
    // verify the required parameter 'itemSubCategoryAudit' is set
    if (itemSubCategoryAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSubCategoryAudit' when calling addItemSubCategoryAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSubCategory/{itemSubCategoryId}/audit/{itemSubCategoryAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSubCategoryId" + "\\}", apiClient.escapeString(itemSubCategoryId.toString()))
      .replaceAll("\\{" + "itemSubCategoryAudit" + "\\}", apiClient.escapeString(itemSubCategoryAudit.toString()));

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
   * Add new tags for an itemSubCategory.
   * Adds a tag to an existing itemSubCategory.
   * @param itemSubCategoryId Id of the itemSubCategory to add a tag to (required)
   * @param itemSubCategoryTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addItemSubCategoryTag(Integer itemSubCategoryId, String itemSubCategoryTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSubCategoryId' is set
    if (itemSubCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSubCategoryId' when calling addItemSubCategoryTag");
    }
    
    // verify the required parameter 'itemSubCategoryTag' is set
    if (itemSubCategoryTag == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSubCategoryTag' when calling addItemSubCategoryTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSubCategory/{itemSubCategoryId}/tag/{itemSubCategoryTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSubCategoryId" + "\\}", apiClient.escapeString(itemSubCategoryId.toString()))
      .replaceAll("\\{" + "itemSubCategoryTag" + "\\}", apiClient.escapeString(itemSubCategoryTag.toString()));

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
   * Delete an itemSubCategory
   * Deletes the itemSubCategory identified by the specified id.
   * @param itemSubCategoryId Id of the itemSubCategory to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemSubCategory(Integer itemSubCategoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSubCategoryId' is set
    if (itemSubCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSubCategoryId' when calling deleteItemSubCategory");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSubCategory/{itemSubCategoryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSubCategoryId" + "\\}", apiClient.escapeString(itemSubCategoryId.toString()));

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
   * Delete a tag for an itemSubCategory.
   * Deletes an existing itemSubCategory tag using the specified data.
   * @param itemSubCategoryId Id of the itemSubCategory to remove tag from (required)
   * @param itemSubCategoryTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteItemSubCategoryTag(Integer itemSubCategoryId, String itemSubCategoryTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSubCategoryId' is set
    if (itemSubCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSubCategoryId' when calling deleteItemSubCategoryTag");
    }
    
    // verify the required parameter 'itemSubCategoryTag' is set
    if (itemSubCategoryTag == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSubCategoryTag' when calling deleteItemSubCategoryTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSubCategory/{itemSubCategoryId}/tag/{itemSubCategoryTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSubCategoryId" + "\\}", apiClient.escapeString(itemSubCategoryId.toString()))
      .replaceAll("\\{" + "itemSubCategoryTag" + "\\}", apiClient.escapeString(itemSubCategoryTag.toString()));

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
   * Get a duplicated an itemSubCategory by id
   * Returns a duplicated itemSubCategory identified by the specified id.
   * @param itemSubCategoryId Id of the itemSubCategory to be duplicated. (required)
   * @return ItemSubCategory
   * @throws ApiException if fails to make API call
   */
  public ItemSubCategory getDuplicateItemSubCategoryById(Integer itemSubCategoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSubCategoryId' is set
    if (itemSubCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSubCategoryId' when calling getDuplicateItemSubCategoryById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSubCategory/duplicate/{itemSubCategoryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSubCategoryId" + "\\}", apiClient.escapeString(itemSubCategoryId.toString()));

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

    
    GenericType<ItemSubCategory> localVarReturnType = new GenericType<ItemSubCategory>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search itemSubCategorys by filter
   * Returns the list of itemSubCategorys that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ItemSubCategory>
   * @throws ApiException if fails to make API call
   */
  public List<ItemSubCategory> getItemSubCategoryByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/itemSubCategory/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ItemSubCategory>> localVarReturnType = new GenericType<List<ItemSubCategory>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an itemSubCategory by id
   * Returns the itemSubCategory identified by the specified id.
   * @param itemSubCategoryId Id of the itemSubCategory to be returned. (required)
   * @return ItemSubCategory
   * @throws ApiException if fails to make API call
   */
  public ItemSubCategory getItemSubCategoryById(Integer itemSubCategoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSubCategoryId' is set
    if (itemSubCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSubCategoryId' when calling getItemSubCategoryById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSubCategory/{itemSubCategoryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSubCategoryId" + "\\}", apiClient.escapeString(itemSubCategoryId.toString()));

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

    
    GenericType<ItemSubCategory> localVarReturnType = new GenericType<ItemSubCategory>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an itemSubCategory.
   * Get all existing itemSubCategory tags.
   * @param itemSubCategoryId Id of the itemSubCategory to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getItemSubCategoryTags(Integer itemSubCategoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'itemSubCategoryId' is set
    if (itemSubCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemSubCategoryId' when calling getItemSubCategoryTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSubCategory/{itemSubCategoryId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "itemSubCategoryId" + "\\}", apiClient.escapeString(itemSubCategoryId.toString()));

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
   * Update an itemSubCategory
   * Updates an existing itemSubCategory using the specified data.
   * @param body ItemSubCategory to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateItemSubCategory(ItemSubCategory body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateItemSubCategory");
    }
    
    // create path and map variables
    String localVarPath = "/beta/itemSubCategory".replaceAll("\\{format\\}","json");

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
