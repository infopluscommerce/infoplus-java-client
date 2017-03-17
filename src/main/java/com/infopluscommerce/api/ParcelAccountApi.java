package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ParcelAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class ParcelAccountApi {
  private ApiClient apiClient;

  public ParcelAccountApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ParcelAccountApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a parcelAccount
   * Adds an audit to an existing parcelAccount.
   * @param parcelAccountId Id of the parcelAccount to add an audit to (required)
   * @param parcelAccountAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addParcelAccountAudit(Integer parcelAccountId, String parcelAccountAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelAccountId' is set
    if (parcelAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelAccountId' when calling addParcelAccountAudit");
    }
    
    // verify the required parameter 'parcelAccountAudit' is set
    if (parcelAccountAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelAccountAudit' when calling addParcelAccountAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelAccount/{parcelAccountId}/audit/{parcelAccountAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelAccountId" + "\\}", apiClient.escapeString(parcelAccountId.toString()))
      .replaceAll("\\{" + "parcelAccountAudit" + "\\}", apiClient.escapeString(parcelAccountAudit.toString()));

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
   * Add new tags for a parcelAccount.
   * Adds a tag to an existing parcelAccount.
   * @param parcelAccountId Id of the parcelAccount to add a tag to (required)
   * @param parcelAccountTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addParcelAccountTag(Integer parcelAccountId, String parcelAccountTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelAccountId' is set
    if (parcelAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelAccountId' when calling addParcelAccountTag");
    }
    
    // verify the required parameter 'parcelAccountTag' is set
    if (parcelAccountTag == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelAccountTag' when calling addParcelAccountTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelAccount/{parcelAccountId}/tag/{parcelAccountTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelAccountId" + "\\}", apiClient.escapeString(parcelAccountId.toString()))
      .replaceAll("\\{" + "parcelAccountTag" + "\\}", apiClient.escapeString(parcelAccountTag.toString()));

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
   * Delete a tag for a parcelAccount.
   * Deletes an existing parcelAccount tag using the specified data.
   * @param parcelAccountId Id of the parcelAccount to remove tag from (required)
   * @param parcelAccountTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteParcelAccountTag(Integer parcelAccountId, String parcelAccountTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelAccountId' is set
    if (parcelAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelAccountId' when calling deleteParcelAccountTag");
    }
    
    // verify the required parameter 'parcelAccountTag' is set
    if (parcelAccountTag == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelAccountTag' when calling deleteParcelAccountTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelAccount/{parcelAccountId}/tag/{parcelAccountTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelAccountId" + "\\}", apiClient.escapeString(parcelAccountId.toString()))
      .replaceAll("\\{" + "parcelAccountTag" + "\\}", apiClient.escapeString(parcelAccountTag.toString()));

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
   * Get a duplicated a parcelAccount by id
   * Returns a duplicated parcelAccount identified by the specified id.
   * @param parcelAccountId Id of the parcelAccount to be duplicated. (required)
   * @return ParcelAccount
   * @throws ApiException if fails to make API call
   */
  public ParcelAccount getDuplicateParcelAccountById(Integer parcelAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelAccountId' is set
    if (parcelAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelAccountId' when calling getDuplicateParcelAccountById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelAccount/duplicate/{parcelAccountId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelAccountId" + "\\}", apiClient.escapeString(parcelAccountId.toString()));

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

    
    GenericType<ParcelAccount> localVarReturnType = new GenericType<ParcelAccount>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search parcelAccounts by filter
   * Returns the list of parcelAccounts that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ParcelAccount>
   * @throws ApiException if fails to make API call
   */
  public List<ParcelAccount> getParcelAccountByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/parcelAccount/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ParcelAccount>> localVarReturnType = new GenericType<List<ParcelAccount>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a parcelAccount by id
   * Returns the parcelAccount identified by the specified id.
   * @param parcelAccountId Id of the parcelAccount to be returned. (required)
   * @return ParcelAccount
   * @throws ApiException if fails to make API call
   */
  public ParcelAccount getParcelAccountById(Integer parcelAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelAccountId' is set
    if (parcelAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelAccountId' when calling getParcelAccountById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelAccount/{parcelAccountId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelAccountId" + "\\}", apiClient.escapeString(parcelAccountId.toString()));

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

    
    GenericType<ParcelAccount> localVarReturnType = new GenericType<ParcelAccount>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a parcelAccount.
   * Get all existing parcelAccount tags.
   * @param parcelAccountId Id of the parcelAccount to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getParcelAccountTags(Integer parcelAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'parcelAccountId' is set
    if (parcelAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'parcelAccountId' when calling getParcelAccountTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelAccount/{parcelAccountId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "parcelAccountId" + "\\}", apiClient.escapeString(parcelAccountId.toString()));

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
   * Update a parcelAccount custom fields
   * Updates an existing parcelAccount custom fields using the specified data.
   * @param body ParcelAccount to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateParcelAccountCustomFields(ParcelAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateParcelAccountCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/parcelAccount/customFields".replaceAll("\\{format\\}","json");

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
