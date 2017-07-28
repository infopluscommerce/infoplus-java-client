package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.InvoiceWorksheet;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class InvoiceWorksheetApi {
  private ApiClient apiClient;

  public InvoiceWorksheetApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InvoiceWorksheetApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an invoiceWorksheet
   * Inserts a new invoiceWorksheet using the specified data.
   * @param body InvoiceWorksheet to be inserted. (required)
   * @return InvoiceWorksheet
   * @throws ApiException if fails to make API call
   */
  public InvoiceWorksheet addInvoiceWorksheet(InvoiceWorksheet body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addInvoiceWorksheet");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheet".replaceAll("\\{format\\}","json");

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

    
    GenericType<InvoiceWorksheet> localVarReturnType = new GenericType<InvoiceWorksheet>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an invoiceWorksheet
   * Adds an audit to an existing invoiceWorksheet.
   * @param invoiceWorksheetId Id of the invoiceWorksheet to add an audit to (required)
   * @param invoiceWorksheetAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addInvoiceWorksheetAudit(Integer invoiceWorksheetId, String invoiceWorksheetAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceWorksheetId' is set
    if (invoiceWorksheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetId' when calling addInvoiceWorksheetAudit");
    }
    
    // verify the required parameter 'invoiceWorksheetAudit' is set
    if (invoiceWorksheetAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetAudit' when calling addInvoiceWorksheetAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheet/{invoiceWorksheetId}/audit/{invoiceWorksheetAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invoiceWorksheetId" + "\\}", apiClient.escapeString(invoiceWorksheetId.toString()))
      .replaceAll("\\{" + "invoiceWorksheetAudit" + "\\}", apiClient.escapeString(invoiceWorksheetAudit.toString()));

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
   * Add new tags for an invoiceWorksheet.
   * Adds a tag to an existing invoiceWorksheet.
   * @param invoiceWorksheetId Id of the invoiceWorksheet to add a tag to (required)
   * @param invoiceWorksheetTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addInvoiceWorksheetTag(Integer invoiceWorksheetId, String invoiceWorksheetTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceWorksheetId' is set
    if (invoiceWorksheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetId' when calling addInvoiceWorksheetTag");
    }
    
    // verify the required parameter 'invoiceWorksheetTag' is set
    if (invoiceWorksheetTag == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetTag' when calling addInvoiceWorksheetTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheet/{invoiceWorksheetId}/tag/{invoiceWorksheetTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invoiceWorksheetId" + "\\}", apiClient.escapeString(invoiceWorksheetId.toString()))
      .replaceAll("\\{" + "invoiceWorksheetTag" + "\\}", apiClient.escapeString(invoiceWorksheetTag.toString()));

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
   * Delete an invoiceWorksheet
   * Deletes the invoiceWorksheet identified by the specified id.
   * @param invoiceWorksheetId Id of the invoiceWorksheet to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteInvoiceWorksheet(Integer invoiceWorksheetId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceWorksheetId' is set
    if (invoiceWorksheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetId' when calling deleteInvoiceWorksheet");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheet/{invoiceWorksheetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invoiceWorksheetId" + "\\}", apiClient.escapeString(invoiceWorksheetId.toString()));

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
   * Delete a tag for an invoiceWorksheet.
   * Deletes an existing invoiceWorksheet tag using the specified data.
   * @param invoiceWorksheetId Id of the invoiceWorksheet to remove tag from (required)
   * @param invoiceWorksheetTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteInvoiceWorksheetTag(Integer invoiceWorksheetId, String invoiceWorksheetTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceWorksheetId' is set
    if (invoiceWorksheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetId' when calling deleteInvoiceWorksheetTag");
    }
    
    // verify the required parameter 'invoiceWorksheetTag' is set
    if (invoiceWorksheetTag == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetTag' when calling deleteInvoiceWorksheetTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheet/{invoiceWorksheetId}/tag/{invoiceWorksheetTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invoiceWorksheetId" + "\\}", apiClient.escapeString(invoiceWorksheetId.toString()))
      .replaceAll("\\{" + "invoiceWorksheetTag" + "\\}", apiClient.escapeString(invoiceWorksheetTag.toString()));

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
   * Get a duplicated an invoiceWorksheet by id
   * Returns a duplicated invoiceWorksheet identified by the specified id.
   * @param invoiceWorksheetId Id of the invoiceWorksheet to be duplicated. (required)
   * @return InvoiceWorksheet
   * @throws ApiException if fails to make API call
   */
  public InvoiceWorksheet getDuplicateInvoiceWorksheetById(Integer invoiceWorksheetId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceWorksheetId' is set
    if (invoiceWorksheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetId' when calling getDuplicateInvoiceWorksheetById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheet/duplicate/{invoiceWorksheetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invoiceWorksheetId" + "\\}", apiClient.escapeString(invoiceWorksheetId.toString()));

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

    
    GenericType<InvoiceWorksheet> localVarReturnType = new GenericType<InvoiceWorksheet>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search invoiceWorksheets by filter
   * Returns the list of invoiceWorksheets that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<InvoiceWorksheet>
   * @throws ApiException if fails to make API call
   */
  public List<InvoiceWorksheet> getInvoiceWorksheetByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheet/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<InvoiceWorksheet>> localVarReturnType = new GenericType<List<InvoiceWorksheet>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an invoiceWorksheet by id
   * Returns the invoiceWorksheet identified by the specified id.
   * @param invoiceWorksheetId Id of the invoiceWorksheet to be returned. (required)
   * @return InvoiceWorksheet
   * @throws ApiException if fails to make API call
   */
  public InvoiceWorksheet getInvoiceWorksheetById(Integer invoiceWorksheetId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceWorksheetId' is set
    if (invoiceWorksheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetId' when calling getInvoiceWorksheetById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheet/{invoiceWorksheetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invoiceWorksheetId" + "\\}", apiClient.escapeString(invoiceWorksheetId.toString()));

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

    
    GenericType<InvoiceWorksheet> localVarReturnType = new GenericType<InvoiceWorksheet>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an invoiceWorksheet.
   * Get all existing invoiceWorksheet tags.
   * @param invoiceWorksheetId Id of the invoiceWorksheet to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getInvoiceWorksheetTags(Integer invoiceWorksheetId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceWorksheetId' is set
    if (invoiceWorksheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetId' when calling getInvoiceWorksheetTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheet/{invoiceWorksheetId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invoiceWorksheetId" + "\\}", apiClient.escapeString(invoiceWorksheetId.toString()));

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
   * Update an invoiceWorksheet
   * Updates an existing invoiceWorksheet using the specified data.
   * @param body InvoiceWorksheet to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateInvoiceWorksheet(InvoiceWorksheet body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateInvoiceWorksheet");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheet".replaceAll("\\{format\\}","json");

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
