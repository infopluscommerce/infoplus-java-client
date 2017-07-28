package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.InvoiceWorksheetLine;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class InvoiceWorksheetLineApi {
  private ApiClient apiClient;

  public InvoiceWorksheetLineApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InvoiceWorksheetLineApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an invoiceWorksheetLine
   * Inserts a new invoiceWorksheetLine using the specified data.
   * @param body InvoiceWorksheetLine to be inserted. (required)
   * @return InvoiceWorksheetLine
   * @throws ApiException if fails to make API call
   */
  public InvoiceWorksheetLine addInvoiceWorksheetLine(InvoiceWorksheetLine body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addInvoiceWorksheetLine");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheetLine".replaceAll("\\{format\\}","json");

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

    
    GenericType<InvoiceWorksheetLine> localVarReturnType = new GenericType<InvoiceWorksheetLine>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an invoiceWorksheetLine
   * Adds an audit to an existing invoiceWorksheetLine.
   * @param invoiceWorksheetLineId Id of the invoiceWorksheetLine to add an audit to (required)
   * @param invoiceWorksheetLineAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addInvoiceWorksheetLineAudit(Integer invoiceWorksheetLineId, String invoiceWorksheetLineAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceWorksheetLineId' is set
    if (invoiceWorksheetLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetLineId' when calling addInvoiceWorksheetLineAudit");
    }
    
    // verify the required parameter 'invoiceWorksheetLineAudit' is set
    if (invoiceWorksheetLineAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetLineAudit' when calling addInvoiceWorksheetLineAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/audit/{invoiceWorksheetLineAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invoiceWorksheetLineId" + "\\}", apiClient.escapeString(invoiceWorksheetLineId.toString()))
      .replaceAll("\\{" + "invoiceWorksheetLineAudit" + "\\}", apiClient.escapeString(invoiceWorksheetLineAudit.toString()));

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
   * Add new tags for an invoiceWorksheetLine.
   * Adds a tag to an existing invoiceWorksheetLine.
   * @param invoiceWorksheetLineId Id of the invoiceWorksheetLine to add a tag to (required)
   * @param invoiceWorksheetLineTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addInvoiceWorksheetLineTag(Integer invoiceWorksheetLineId, String invoiceWorksheetLineTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceWorksheetLineId' is set
    if (invoiceWorksheetLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetLineId' when calling addInvoiceWorksheetLineTag");
    }
    
    // verify the required parameter 'invoiceWorksheetLineTag' is set
    if (invoiceWorksheetLineTag == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetLineTag' when calling addInvoiceWorksheetLineTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/tag/{invoiceWorksheetLineTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invoiceWorksheetLineId" + "\\}", apiClient.escapeString(invoiceWorksheetLineId.toString()))
      .replaceAll("\\{" + "invoiceWorksheetLineTag" + "\\}", apiClient.escapeString(invoiceWorksheetLineTag.toString()));

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
   * Delete an invoiceWorksheetLine
   * Deletes the invoiceWorksheetLine identified by the specified id.
   * @param invoiceWorksheetLineId Id of the invoiceWorksheetLine to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteInvoiceWorksheetLine(Integer invoiceWorksheetLineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceWorksheetLineId' is set
    if (invoiceWorksheetLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetLineId' when calling deleteInvoiceWorksheetLine");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheetLine/{invoiceWorksheetLineId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invoiceWorksheetLineId" + "\\}", apiClient.escapeString(invoiceWorksheetLineId.toString()));

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
   * Delete a tag for an invoiceWorksheetLine.
   * Deletes an existing invoiceWorksheetLine tag using the specified data.
   * @param invoiceWorksheetLineId Id of the invoiceWorksheetLine to remove tag from (required)
   * @param invoiceWorksheetLineTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteInvoiceWorksheetLineTag(Integer invoiceWorksheetLineId, String invoiceWorksheetLineTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceWorksheetLineId' is set
    if (invoiceWorksheetLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetLineId' when calling deleteInvoiceWorksheetLineTag");
    }
    
    // verify the required parameter 'invoiceWorksheetLineTag' is set
    if (invoiceWorksheetLineTag == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetLineTag' when calling deleteInvoiceWorksheetLineTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/tag/{invoiceWorksheetLineTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invoiceWorksheetLineId" + "\\}", apiClient.escapeString(invoiceWorksheetLineId.toString()))
      .replaceAll("\\{" + "invoiceWorksheetLineTag" + "\\}", apiClient.escapeString(invoiceWorksheetLineTag.toString()));

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
   * Get a duplicated an invoiceWorksheetLine by id
   * Returns a duplicated invoiceWorksheetLine identified by the specified id.
   * @param invoiceWorksheetLineId Id of the invoiceWorksheetLine to be duplicated. (required)
   * @return InvoiceWorksheetLine
   * @throws ApiException if fails to make API call
   */
  public InvoiceWorksheetLine getDuplicateInvoiceWorksheetLineById(Integer invoiceWorksheetLineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceWorksheetLineId' is set
    if (invoiceWorksheetLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetLineId' when calling getDuplicateInvoiceWorksheetLineById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheetLine/duplicate/{invoiceWorksheetLineId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invoiceWorksheetLineId" + "\\}", apiClient.escapeString(invoiceWorksheetLineId.toString()));

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

    
    GenericType<InvoiceWorksheetLine> localVarReturnType = new GenericType<InvoiceWorksheetLine>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search invoiceWorksheetLines by filter
   * Returns the list of invoiceWorksheetLines that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<InvoiceWorksheetLine>
   * @throws ApiException if fails to make API call
   */
  public List<InvoiceWorksheetLine> getInvoiceWorksheetLineByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheetLine/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<InvoiceWorksheetLine>> localVarReturnType = new GenericType<List<InvoiceWorksheetLine>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an invoiceWorksheetLine by id
   * Returns the invoiceWorksheetLine identified by the specified id.
   * @param invoiceWorksheetLineId Id of the invoiceWorksheetLine to be returned. (required)
   * @return InvoiceWorksheetLine
   * @throws ApiException if fails to make API call
   */
  public InvoiceWorksheetLine getInvoiceWorksheetLineById(Integer invoiceWorksheetLineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceWorksheetLineId' is set
    if (invoiceWorksheetLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetLineId' when calling getInvoiceWorksheetLineById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheetLine/{invoiceWorksheetLineId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invoiceWorksheetLineId" + "\\}", apiClient.escapeString(invoiceWorksheetLineId.toString()));

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

    
    GenericType<InvoiceWorksheetLine> localVarReturnType = new GenericType<InvoiceWorksheetLine>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an invoiceWorksheetLine.
   * Get all existing invoiceWorksheetLine tags.
   * @param invoiceWorksheetLineId Id of the invoiceWorksheetLine to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getInvoiceWorksheetLineTags(Integer invoiceWorksheetLineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceWorksheetLineId' is set
    if (invoiceWorksheetLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceWorksheetLineId' when calling getInvoiceWorksheetLineTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invoiceWorksheetLineId" + "\\}", apiClient.escapeString(invoiceWorksheetLineId.toString()));

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
   * Update an invoiceWorksheetLine
   * Updates an existing invoiceWorksheetLine using the specified data.
   * @param body InvoiceWorksheetLine to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateInvoiceWorksheetLine(InvoiceWorksheetLine body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateInvoiceWorksheetLine");
    }
    
    // create path and map variables
    String localVarPath = "/beta/invoiceWorksheetLine".replaceAll("\\{format\\}","json");

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
