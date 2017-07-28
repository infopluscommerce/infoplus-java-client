package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ParcelInvoiceLine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class ParcelInvoiceLineApi {
  private ApiClient apiClient;

  public ParcelInvoiceLineApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ParcelInvoiceLineApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a parcelInvoiceLine
   * Adds an audit to an existing parcelInvoiceLine.
   * @param parcelInvoiceLineId Id of the parcelInvoiceLine to add an audit to (required)
   * @param parcelInvoiceLineAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addParcelInvoiceLineAudit(Integer parcelInvoiceLineId, String parcelInvoiceLineAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelInvoiceLineId' is set
    if (parcelInvoiceLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceLineId' when calling addParcelInvoiceLineAudit");
    }
    
    // verify the required parameter 'parcelInvoiceLineAudit' is set
    if (parcelInvoiceLineAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceLineAudit' when calling addParcelInvoiceLineAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelInvoiceLine/{parcelInvoiceLineId}/audit/{parcelInvoiceLineAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelInvoiceLineId" + "\\}", apiClient.escapeString(parcelInvoiceLineId.toString()))
      .replaceAll("\\{" + "parcelInvoiceLineAudit" + "\\}", apiClient.escapeString(parcelInvoiceLineAudit.toString()));

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
   * Add new tags for a parcelInvoiceLine.
   * Adds a tag to an existing parcelInvoiceLine.
   * @param parcelInvoiceLineId Id of the parcelInvoiceLine to add a tag to (required)
   * @param parcelInvoiceLineTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addParcelInvoiceLineTag(Integer parcelInvoiceLineId, String parcelInvoiceLineTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelInvoiceLineId' is set
    if (parcelInvoiceLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceLineId' when calling addParcelInvoiceLineTag");
    }
    
    // verify the required parameter 'parcelInvoiceLineTag' is set
    if (parcelInvoiceLineTag == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceLineTag' when calling addParcelInvoiceLineTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelInvoiceLine/{parcelInvoiceLineId}/tag/{parcelInvoiceLineTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelInvoiceLineId" + "\\}", apiClient.escapeString(parcelInvoiceLineId.toString()))
      .replaceAll("\\{" + "parcelInvoiceLineTag" + "\\}", apiClient.escapeString(parcelInvoiceLineTag.toString()));

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
   * Delete a tag for a parcelInvoiceLine.
   * Deletes an existing parcelInvoiceLine tag using the specified data.
   * @param parcelInvoiceLineId Id of the parcelInvoiceLine to remove tag from (required)
   * @param parcelInvoiceLineTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteParcelInvoiceLineTag(Integer parcelInvoiceLineId, String parcelInvoiceLineTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelInvoiceLineId' is set
    if (parcelInvoiceLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceLineId' when calling deleteParcelInvoiceLineTag");
    }
    
    // verify the required parameter 'parcelInvoiceLineTag' is set
    if (parcelInvoiceLineTag == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceLineTag' when calling deleteParcelInvoiceLineTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelInvoiceLine/{parcelInvoiceLineId}/tag/{parcelInvoiceLineTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelInvoiceLineId" + "\\}", apiClient.escapeString(parcelInvoiceLineId.toString()))
      .replaceAll("\\{" + "parcelInvoiceLineTag" + "\\}", apiClient.escapeString(parcelInvoiceLineTag.toString()));

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
   * Get a duplicated a parcelInvoiceLine by id
   * Returns a duplicated parcelInvoiceLine identified by the specified id.
   * @param parcelInvoiceLineId Id of the parcelInvoiceLine to be duplicated. (required)
   * @return ParcelInvoiceLine
   * @throws ApiException if fails to make API call
   */
  public ParcelInvoiceLine getDuplicateParcelInvoiceLineById(Integer parcelInvoiceLineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelInvoiceLineId' is set
    if (parcelInvoiceLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceLineId' when calling getDuplicateParcelInvoiceLineById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelInvoiceLine/duplicate/{parcelInvoiceLineId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelInvoiceLineId" + "\\}", apiClient.escapeString(parcelInvoiceLineId.toString()));

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

    
    GenericType<ParcelInvoiceLine> localVarReturnType = new GenericType<ParcelInvoiceLine>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search parcelInvoiceLines by filter
   * Returns the list of parcelInvoiceLines that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ParcelInvoiceLine>
   * @throws ApiException if fails to make API call
   */
  public List<ParcelInvoiceLine> getParcelInvoiceLineByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/parcelInvoiceLine/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ParcelInvoiceLine>> localVarReturnType = new GenericType<List<ParcelInvoiceLine>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a parcelInvoiceLine by id
   * Returns the parcelInvoiceLine identified by the specified id.
   * @param parcelInvoiceLineId Id of the parcelInvoiceLine to be returned. (required)
   * @return ParcelInvoiceLine
   * @throws ApiException if fails to make API call
   */
  public ParcelInvoiceLine getParcelInvoiceLineById(Integer parcelInvoiceLineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelInvoiceLineId' is set
    if (parcelInvoiceLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceLineId' when calling getParcelInvoiceLineById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelInvoiceLine/{parcelInvoiceLineId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelInvoiceLineId" + "\\}", apiClient.escapeString(parcelInvoiceLineId.toString()));

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

    
    GenericType<ParcelInvoiceLine> localVarReturnType = new GenericType<ParcelInvoiceLine>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a parcelInvoiceLine.
   * Get all existing parcelInvoiceLine tags.
   * @param parcelInvoiceLineId Id of the parcelInvoiceLine to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getParcelInvoiceLineTags(Integer parcelInvoiceLineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelInvoiceLineId' is set
    if (parcelInvoiceLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceLineId' when calling getParcelInvoiceLineTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelInvoiceLine/{parcelInvoiceLineId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelInvoiceLineId" + "\\}", apiClient.escapeString(parcelInvoiceLineId.toString()));

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
   * Update a parcelInvoiceLine
   * Updates an existing parcelInvoiceLine using the specified data.
   * @param body ParcelInvoiceLine to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateParcelInvoiceLine(ParcelInvoiceLine body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateParcelInvoiceLine");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelInvoiceLine".replaceAll("\\{format\\}","json");

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
