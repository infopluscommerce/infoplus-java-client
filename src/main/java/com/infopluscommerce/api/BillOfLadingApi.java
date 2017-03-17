package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.BillOfLading;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
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
   * Create a billOfLading
   * Inserts a new billOfLading using the specified data.
   * @param body BillOfLading to be inserted. (required)
   * @return BillOfLading
   * @throws ApiException if fails to make API call
   */
  public BillOfLading addBillOfLading(BillOfLading body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addBillOfLading");
    }
    
    // create path and map variables
    String localVarPath = "/beta/billOfLading".replaceAll("\\{format\\}","json");

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

    
    GenericType<BillOfLading> localVarReturnType = new GenericType<BillOfLading>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a billOfLading
   * Adds an audit to an existing billOfLading.
   * @param billOfLadingId Id of the billOfLading to add an audit to (required)
   * @param billOfLadingAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addBillOfLadingAudit(Integer billOfLadingId, String billOfLadingAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'billOfLadingId' is set
    if (billOfLadingId == null) {
      throw new ApiException(400, "Missing the required parameter 'billOfLadingId' when calling addBillOfLadingAudit");
    }
    
    // verify the required parameter 'billOfLadingAudit' is set
    if (billOfLadingAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'billOfLadingAudit' when calling addBillOfLadingAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/billOfLading/{billOfLadingId}/audit/{billOfLadingAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billOfLadingId" + "\\}", apiClient.escapeString(billOfLadingId.toString()))
      .replaceAll("\\{" + "billOfLadingAudit" + "\\}", apiClient.escapeString(billOfLadingAudit.toString()));

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
   * Add new tags for a billOfLading.
   * Adds a tag to an existing billOfLading.
   * @param billOfLadingId Id of the billOfLading to add a tag to (required)
   * @param billOfLadingTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addBillOfLadingTag(Integer billOfLadingId, String billOfLadingTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'billOfLadingId' is set
    if (billOfLadingId == null) {
      throw new ApiException(400, "Missing the required parameter 'billOfLadingId' when calling addBillOfLadingTag");
    }
    
    // verify the required parameter 'billOfLadingTag' is set
    if (billOfLadingTag == null) {
      throw new ApiException(400, "Missing the required parameter 'billOfLadingTag' when calling addBillOfLadingTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/billOfLading/{billOfLadingId}/tag/{billOfLadingTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billOfLadingId" + "\\}", apiClient.escapeString(billOfLadingId.toString()))
      .replaceAll("\\{" + "billOfLadingTag" + "\\}", apiClient.escapeString(billOfLadingTag.toString()));

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
   * Delete a billOfLading
   * Deletes the billOfLading identified by the specified id.
   * @param billOfLadingId Id of the billOfLading to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBillOfLading(Integer billOfLadingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'billOfLadingId' is set
    if (billOfLadingId == null) {
      throw new ApiException(400, "Missing the required parameter 'billOfLadingId' when calling deleteBillOfLading");
    }
    
    // create path and map variables
    String localVarPath = "/beta/billOfLading/{billOfLadingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billOfLadingId" + "\\}", apiClient.escapeString(billOfLadingId.toString()));

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
   * Delete a tag for a billOfLading.
   * Deletes an existing billOfLading tag using the specified data.
   * @param billOfLadingId Id of the billOfLading to remove tag from (required)
   * @param billOfLadingTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBillOfLadingTag(Integer billOfLadingId, String billOfLadingTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'billOfLadingId' is set
    if (billOfLadingId == null) {
      throw new ApiException(400, "Missing the required parameter 'billOfLadingId' when calling deleteBillOfLadingTag");
    }
    
    // verify the required parameter 'billOfLadingTag' is set
    if (billOfLadingTag == null) {
      throw new ApiException(400, "Missing the required parameter 'billOfLadingTag' when calling deleteBillOfLadingTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/billOfLading/{billOfLadingId}/tag/{billOfLadingTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billOfLadingId" + "\\}", apiClient.escapeString(billOfLadingId.toString()))
      .replaceAll("\\{" + "billOfLadingTag" + "\\}", apiClient.escapeString(billOfLadingTag.toString()));

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
   * Search billOfLadings by filter
   * Returns the list of billOfLadings that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<BillOfLading>
   * @throws ApiException if fails to make API call
   */
  public List<BillOfLading> getBillOfLadingByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/billOfLading/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<BillOfLading>> localVarReturnType = new GenericType<List<BillOfLading>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a billOfLading by id
   * Returns the billOfLading identified by the specified id.
   * @param billOfLadingId Id of the billOfLading to be returned. (required)
   * @return BillOfLading
   * @throws ApiException if fails to make API call
   */
  public BillOfLading getBillOfLadingById(Integer billOfLadingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'billOfLadingId' is set
    if (billOfLadingId == null) {
      throw new ApiException(400, "Missing the required parameter 'billOfLadingId' when calling getBillOfLadingById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/billOfLading/{billOfLadingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billOfLadingId" + "\\}", apiClient.escapeString(billOfLadingId.toString()));

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

    
    GenericType<BillOfLading> localVarReturnType = new GenericType<BillOfLading>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a billOfLading.
   * Get all existing billOfLading tags.
   * @param billOfLadingId Id of the billOfLading to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getBillOfLadingTags(Integer billOfLadingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'billOfLadingId' is set
    if (billOfLadingId == null) {
      throw new ApiException(400, "Missing the required parameter 'billOfLadingId' when calling getBillOfLadingTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/billOfLading/{billOfLadingId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billOfLadingId" + "\\}", apiClient.escapeString(billOfLadingId.toString()));

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
   * Get a duplicated a billOfLading by id
   * Returns a duplicated billOfLading identified by the specified id.
   * @param billOfLadingId Id of the billOfLading to be duplicated. (required)
   * @return BillOfLading
   * @throws ApiException if fails to make API call
   */
  public BillOfLading getDuplicateBillOfLadingById(Integer billOfLadingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'billOfLadingId' is set
    if (billOfLadingId == null) {
      throw new ApiException(400, "Missing the required parameter 'billOfLadingId' when calling getDuplicateBillOfLadingById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/billOfLading/duplicate/{billOfLadingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "billOfLadingId" + "\\}", apiClient.escapeString(billOfLadingId.toString()));

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

    
    GenericType<BillOfLading> localVarReturnType = new GenericType<BillOfLading>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a billOfLading
   * Updates an existing billOfLading using the specified data.
   * @param body BillOfLading to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateBillOfLading(BillOfLading body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateBillOfLading");
    }
    
    // create path and map variables
    String localVarPath = "/beta/billOfLading".replaceAll("\\{format\\}","json");

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
   * Update a billOfLading custom fields
   * Updates an existing billOfLading custom fields using the specified data.
   * @param body BillOfLading to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateBillOfLadingCustomFields(BillOfLading body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateBillOfLadingCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/billOfLading/customFields".replaceAll("\\{format\\}","json");

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
