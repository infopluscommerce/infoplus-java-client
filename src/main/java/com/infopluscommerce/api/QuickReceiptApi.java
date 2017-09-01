package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.QuickReceipt;
import com.infopluscommerce.model.ApiResponse;
import com.infopluscommerce.model.ProcessOutputAPIModel;
import com.infopluscommerce.model.ExecuteQuickReceiptInputAPIModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class QuickReceiptApi {
  private ApiClient apiClient;

  public QuickReceiptApi() {
    this(Configuration.getDefaultApiClient());
  }

  public QuickReceiptApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a quickReceipt
   * Inserts a new quickReceipt using the specified data.
   * @param body QuickReceipt to be inserted. (required)
   * @return QuickReceipt
   * @throws ApiException if fails to make API call
   */
  public QuickReceipt addQuickReceipt(QuickReceipt body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addQuickReceipt");
    }
    
    // create path and map variables
    String localVarPath = "/beta/quickReceipt".replaceAll("\\{format\\}","json");

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

    
    GenericType<QuickReceipt> localVarReturnType = new GenericType<QuickReceipt>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a quickReceipt
   * Adds an audit to an existing quickReceipt.
   * @param quickReceiptId Id of the quickReceipt to add an audit to (required)
   * @param quickReceiptAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addQuickReceiptAudit(Integer quickReceiptId, String quickReceiptAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'quickReceiptId' is set
    if (quickReceiptId == null) {
      throw new ApiException(400, "Missing the required parameter 'quickReceiptId' when calling addQuickReceiptAudit");
    }
    
    // verify the required parameter 'quickReceiptAudit' is set
    if (quickReceiptAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'quickReceiptAudit' when calling addQuickReceiptAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/quickReceipt/{quickReceiptId}/audit/{quickReceiptAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "quickReceiptId" + "\\}", apiClient.escapeString(quickReceiptId.toString()))
      .replaceAll("\\{" + "quickReceiptAudit" + "\\}", apiClient.escapeString(quickReceiptAudit.toString()));

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
   * Add new tags for a quickReceipt.
   * Adds a tag to an existing quickReceipt.
   * @param quickReceiptId Id of the quickReceipt to add a tag to (required)
   * @param quickReceiptTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addQuickReceiptTag(Integer quickReceiptId, String quickReceiptTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'quickReceiptId' is set
    if (quickReceiptId == null) {
      throw new ApiException(400, "Missing the required parameter 'quickReceiptId' when calling addQuickReceiptTag");
    }
    
    // verify the required parameter 'quickReceiptTag' is set
    if (quickReceiptTag == null) {
      throw new ApiException(400, "Missing the required parameter 'quickReceiptTag' when calling addQuickReceiptTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/quickReceipt/{quickReceiptId}/tag/{quickReceiptTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "quickReceiptId" + "\\}", apiClient.escapeString(quickReceiptId.toString()))
      .replaceAll("\\{" + "quickReceiptTag" + "\\}", apiClient.escapeString(quickReceiptTag.toString()));

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
   * Delete a quickReceipt
   * Deletes the quickReceipt identified by the specified id.
   * @param quickReceiptId Id of the quickReceipt to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteQuickReceipt(Integer quickReceiptId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'quickReceiptId' is set
    if (quickReceiptId == null) {
      throw new ApiException(400, "Missing the required parameter 'quickReceiptId' when calling deleteQuickReceipt");
    }
    
    // create path and map variables
    String localVarPath = "/beta/quickReceipt/{quickReceiptId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "quickReceiptId" + "\\}", apiClient.escapeString(quickReceiptId.toString()));

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
   * Delete a tag for a quickReceipt.
   * Deletes an existing quickReceipt tag using the specified data.
   * @param quickReceiptId Id of the quickReceipt to remove tag from (required)
   * @param quickReceiptTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteQuickReceiptTag(Integer quickReceiptId, String quickReceiptTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'quickReceiptId' is set
    if (quickReceiptId == null) {
      throw new ApiException(400, "Missing the required parameter 'quickReceiptId' when calling deleteQuickReceiptTag");
    }
    
    // verify the required parameter 'quickReceiptTag' is set
    if (quickReceiptTag == null) {
      throw new ApiException(400, "Missing the required parameter 'quickReceiptTag' when calling deleteQuickReceiptTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/quickReceipt/{quickReceiptId}/tag/{quickReceiptTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "quickReceiptId" + "\\}", apiClient.escapeString(quickReceiptId.toString()))
      .replaceAll("\\{" + "quickReceiptTag" + "\\}", apiClient.escapeString(quickReceiptTag.toString()));

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
   * Run the ExecuteQuickReceipt process.
   * 
   * @param body Input data for ExecuteQuickReceipt process. (required)
   * @return List<ProcessOutputAPIModel>
   * @throws ApiException if fails to make API call
   */
  public List<ProcessOutputAPIModel> executeQuickReceipt(ExecuteQuickReceiptInputAPIModel body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling executeQuickReceipt");
    }
    
    // create path and map variables
    String localVarPath = "/beta/quickReceipt/executeQuickReceipt".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ProcessOutputAPIModel>> localVarReturnType = new GenericType<List<ProcessOutputAPIModel>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a duplicated a quickReceipt by id
   * Returns a duplicated quickReceipt identified by the specified id.
   * @param quickReceiptId Id of the quickReceipt to be duplicated. (required)
   * @return QuickReceipt
   * @throws ApiException if fails to make API call
   */
  public QuickReceipt getDuplicateQuickReceiptById(Integer quickReceiptId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'quickReceiptId' is set
    if (quickReceiptId == null) {
      throw new ApiException(400, "Missing the required parameter 'quickReceiptId' when calling getDuplicateQuickReceiptById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/quickReceipt/duplicate/{quickReceiptId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "quickReceiptId" + "\\}", apiClient.escapeString(quickReceiptId.toString()));

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

    
    GenericType<QuickReceipt> localVarReturnType = new GenericType<QuickReceipt>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search quickReceipts by filter
   * Returns the list of quickReceipts that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<QuickReceipt>
   * @throws ApiException if fails to make API call
   */
  public List<QuickReceipt> getQuickReceiptByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/quickReceipt/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<QuickReceipt>> localVarReturnType = new GenericType<List<QuickReceipt>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a quickReceipt by id
   * Returns the quickReceipt identified by the specified id.
   * @param quickReceiptId Id of the quickReceipt to be returned. (required)
   * @return QuickReceipt
   * @throws ApiException if fails to make API call
   */
  public QuickReceipt getQuickReceiptById(Integer quickReceiptId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'quickReceiptId' is set
    if (quickReceiptId == null) {
      throw new ApiException(400, "Missing the required parameter 'quickReceiptId' when calling getQuickReceiptById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/quickReceipt/{quickReceiptId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "quickReceiptId" + "\\}", apiClient.escapeString(quickReceiptId.toString()));

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

    
    GenericType<QuickReceipt> localVarReturnType = new GenericType<QuickReceipt>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a quickReceipt.
   * Get all existing quickReceipt tags.
   * @param quickReceiptId Id of the quickReceipt to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getQuickReceiptTags(Integer quickReceiptId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'quickReceiptId' is set
    if (quickReceiptId == null) {
      throw new ApiException(400, "Missing the required parameter 'quickReceiptId' when calling getQuickReceiptTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/quickReceipt/{quickReceiptId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "quickReceiptId" + "\\}", apiClient.escapeString(quickReceiptId.toString()));

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
   * Update a quickReceipt
   * Updates an existing quickReceipt using the specified data.
   * @param body QuickReceipt to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateQuickReceipt(QuickReceipt body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateQuickReceipt");
    }
    
    // create path and map variables
    String localVarPath = "/beta/quickReceipt".replaceAll("\\{format\\}","json");

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
   * Update a quickReceipt custom fields
   * Updates an existing quickReceipt custom fields using the specified data.
   * @param body QuickReceipt to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateQuickReceiptCustomFields(QuickReceipt body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateQuickReceiptCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/quickReceipt/customFields".replaceAll("\\{format\\}","json");

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
