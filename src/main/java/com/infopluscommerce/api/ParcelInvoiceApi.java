package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ParcelInvoice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class ParcelInvoiceApi {
  private ApiClient apiClient;

  public ParcelInvoiceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ParcelInvoiceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a parcelInvoice
   * Adds an audit to an existing parcelInvoice.
   * @param parcelInvoiceId Id of the parcelInvoice to add an audit to (required)
   * @param parcelInvoiceAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addParcelInvoiceAudit(Integer parcelInvoiceId, String parcelInvoiceAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelInvoiceId' is set
    if (parcelInvoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceId' when calling addParcelInvoiceAudit");
    }
    
    // verify the required parameter 'parcelInvoiceAudit' is set
    if (parcelInvoiceAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceAudit' when calling addParcelInvoiceAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelInvoice/{parcelInvoiceId}/audit/{parcelInvoiceAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelInvoiceId" + "\\}", apiClient.escapeString(parcelInvoiceId.toString()))
      .replaceAll("\\{" + "parcelInvoiceAudit" + "\\}", apiClient.escapeString(parcelInvoiceAudit.toString()));

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
   * Add new tags for a parcelInvoice.
   * Adds a tag to an existing parcelInvoice.
   * @param parcelInvoiceId Id of the parcelInvoice to add a tag to (required)
   * @param parcelInvoiceTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addParcelInvoiceTag(Integer parcelInvoiceId, String parcelInvoiceTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelInvoiceId' is set
    if (parcelInvoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceId' when calling addParcelInvoiceTag");
    }
    
    // verify the required parameter 'parcelInvoiceTag' is set
    if (parcelInvoiceTag == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceTag' when calling addParcelInvoiceTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelInvoice/{parcelInvoiceId}/tag/{parcelInvoiceTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelInvoiceId" + "\\}", apiClient.escapeString(parcelInvoiceId.toString()))
      .replaceAll("\\{" + "parcelInvoiceTag" + "\\}", apiClient.escapeString(parcelInvoiceTag.toString()));

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
   * Delete a parcelInvoice
   * Deletes the parcelInvoice identified by the specified id.
   * @param parcelInvoiceId Id of the parcelInvoice to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteParcelInvoice(Integer parcelInvoiceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelInvoiceId' is set
    if (parcelInvoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceId' when calling deleteParcelInvoice");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelInvoice/{parcelInvoiceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelInvoiceId" + "\\}", apiClient.escapeString(parcelInvoiceId.toString()));

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
   * Delete a tag for a parcelInvoice.
   * Deletes an existing parcelInvoice tag using the specified data.
   * @param parcelInvoiceId Id of the parcelInvoice to remove tag from (required)
   * @param parcelInvoiceTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteParcelInvoiceTag(Integer parcelInvoiceId, String parcelInvoiceTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelInvoiceId' is set
    if (parcelInvoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceId' when calling deleteParcelInvoiceTag");
    }
    
    // verify the required parameter 'parcelInvoiceTag' is set
    if (parcelInvoiceTag == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceTag' when calling deleteParcelInvoiceTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelInvoice/{parcelInvoiceId}/tag/{parcelInvoiceTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelInvoiceId" + "\\}", apiClient.escapeString(parcelInvoiceId.toString()))
      .replaceAll("\\{" + "parcelInvoiceTag" + "\\}", apiClient.escapeString(parcelInvoiceTag.toString()));

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
   * Get a duplicated a parcelInvoice by id
   * Returns a duplicated parcelInvoice identified by the specified id.
   * @param parcelInvoiceId Id of the parcelInvoice to be duplicated. (required)
   * @return ParcelInvoice
   * @throws ApiException if fails to make API call
   */
  public ParcelInvoice getDuplicateParcelInvoiceById(Integer parcelInvoiceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelInvoiceId' is set
    if (parcelInvoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceId' when calling getDuplicateParcelInvoiceById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelInvoice/duplicate/{parcelInvoiceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelInvoiceId" + "\\}", apiClient.escapeString(parcelInvoiceId.toString()));

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

    
    GenericType<ParcelInvoice> localVarReturnType = new GenericType<ParcelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search parcelInvoices by filter
   * Returns the list of parcelInvoices that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ParcelInvoice>
   * @throws ApiException if fails to make API call
   */
  public List<ParcelInvoice> getParcelInvoiceByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/parcelInvoice/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ParcelInvoice>> localVarReturnType = new GenericType<List<ParcelInvoice>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a parcelInvoice by id
   * Returns the parcelInvoice identified by the specified id.
   * @param parcelInvoiceId Id of the parcelInvoice to be returned. (required)
   * @return ParcelInvoice
   * @throws ApiException if fails to make API call
   */
  public ParcelInvoice getParcelInvoiceById(Integer parcelInvoiceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelInvoiceId' is set
    if (parcelInvoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceId' when calling getParcelInvoiceById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelInvoice/{parcelInvoiceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelInvoiceId" + "\\}", apiClient.escapeString(parcelInvoiceId.toString()));

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

    
    GenericType<ParcelInvoice> localVarReturnType = new GenericType<ParcelInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a parcelInvoice.
   * Get all existing parcelInvoice tags.
   * @param parcelInvoiceId Id of the parcelInvoice to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getParcelInvoiceTags(Integer parcelInvoiceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelInvoiceId' is set
    if (parcelInvoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelInvoiceId' when calling getParcelInvoiceTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelInvoice/{parcelInvoiceId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelInvoiceId" + "\\}", apiClient.escapeString(parcelInvoiceId.toString()));

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
  
}
