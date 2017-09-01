package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.LegacyLowstockContact;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class LegacyLowstockContactApi {
  private ApiClient apiClient;

  public LegacyLowstockContactApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LegacyLowstockContactApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a legacyLowstockContact
   * Inserts a new legacyLowstockContact using the specified data.
   * @param body LegacyLowstockContact to be inserted. (required)
   * @return LegacyLowstockContact
   * @throws ApiException if fails to make API call
   */
  public LegacyLowstockContact addLegacyLowstockContact(LegacyLowstockContact body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addLegacyLowstockContact");
    }
    
    // create path and map variables
    String localVarPath = "/beta/legacyLowstockContact".replaceAll("\\{format\\}","json");

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

    
    GenericType<LegacyLowstockContact> localVarReturnType = new GenericType<LegacyLowstockContact>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a legacyLowstockContact
   * Adds an audit to an existing legacyLowstockContact.
   * @param legacyLowstockContactId Id of the legacyLowstockContact to add an audit to (required)
   * @param legacyLowstockContactAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addLegacyLowstockContactAudit(Integer legacyLowstockContactId, String legacyLowstockContactAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'legacyLowstockContactId' is set
    if (legacyLowstockContactId == null) {
      throw new ApiException(400, "Missing the required parameter 'legacyLowstockContactId' when calling addLegacyLowstockContactAudit");
    }
    
    // verify the required parameter 'legacyLowstockContactAudit' is set
    if (legacyLowstockContactAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'legacyLowstockContactAudit' when calling addLegacyLowstockContactAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/legacyLowstockContact/{legacyLowstockContactId}/audit/{legacyLowstockContactAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "legacyLowstockContactId" + "\\}", apiClient.escapeString(legacyLowstockContactId.toString()))
      .replaceAll("\\{" + "legacyLowstockContactAudit" + "\\}", apiClient.escapeString(legacyLowstockContactAudit.toString()));

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
   * Add new tags for a legacyLowstockContact.
   * Adds a tag to an existing legacyLowstockContact.
   * @param legacyLowstockContactId Id of the legacyLowstockContact to add a tag to (required)
   * @param legacyLowstockContactTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addLegacyLowstockContactTag(Integer legacyLowstockContactId, String legacyLowstockContactTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'legacyLowstockContactId' is set
    if (legacyLowstockContactId == null) {
      throw new ApiException(400, "Missing the required parameter 'legacyLowstockContactId' when calling addLegacyLowstockContactTag");
    }
    
    // verify the required parameter 'legacyLowstockContactTag' is set
    if (legacyLowstockContactTag == null) {
      throw new ApiException(400, "Missing the required parameter 'legacyLowstockContactTag' when calling addLegacyLowstockContactTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/legacyLowstockContact/{legacyLowstockContactId}/tag/{legacyLowstockContactTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "legacyLowstockContactId" + "\\}", apiClient.escapeString(legacyLowstockContactId.toString()))
      .replaceAll("\\{" + "legacyLowstockContactTag" + "\\}", apiClient.escapeString(legacyLowstockContactTag.toString()));

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
   * Delete a legacyLowstockContact
   * Deletes the legacyLowstockContact identified by the specified id.
   * @param legacyLowstockContactId Id of the legacyLowstockContact to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLegacyLowstockContact(Integer legacyLowstockContactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'legacyLowstockContactId' is set
    if (legacyLowstockContactId == null) {
      throw new ApiException(400, "Missing the required parameter 'legacyLowstockContactId' when calling deleteLegacyLowstockContact");
    }
    
    // create path and map variables
    String localVarPath = "/beta/legacyLowstockContact/{legacyLowstockContactId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "legacyLowstockContactId" + "\\}", apiClient.escapeString(legacyLowstockContactId.toString()));

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
   * Delete a tag for a legacyLowstockContact.
   * Deletes an existing legacyLowstockContact tag using the specified data.
   * @param legacyLowstockContactId Id of the legacyLowstockContact to remove tag from (required)
   * @param legacyLowstockContactTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLegacyLowstockContactTag(Integer legacyLowstockContactId, String legacyLowstockContactTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'legacyLowstockContactId' is set
    if (legacyLowstockContactId == null) {
      throw new ApiException(400, "Missing the required parameter 'legacyLowstockContactId' when calling deleteLegacyLowstockContactTag");
    }
    
    // verify the required parameter 'legacyLowstockContactTag' is set
    if (legacyLowstockContactTag == null) {
      throw new ApiException(400, "Missing the required parameter 'legacyLowstockContactTag' when calling deleteLegacyLowstockContactTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/legacyLowstockContact/{legacyLowstockContactId}/tag/{legacyLowstockContactTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "legacyLowstockContactId" + "\\}", apiClient.escapeString(legacyLowstockContactId.toString()))
      .replaceAll("\\{" + "legacyLowstockContactTag" + "\\}", apiClient.escapeString(legacyLowstockContactTag.toString()));

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
   * Get a duplicated a legacyLowstockContact by id
   * Returns a duplicated legacyLowstockContact identified by the specified id.
   * @param legacyLowstockContactId Id of the legacyLowstockContact to be duplicated. (required)
   * @return LegacyLowstockContact
   * @throws ApiException if fails to make API call
   */
  public LegacyLowstockContact getDuplicateLegacyLowstockContactById(Integer legacyLowstockContactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'legacyLowstockContactId' is set
    if (legacyLowstockContactId == null) {
      throw new ApiException(400, "Missing the required parameter 'legacyLowstockContactId' when calling getDuplicateLegacyLowstockContactById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/legacyLowstockContact/duplicate/{legacyLowstockContactId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "legacyLowstockContactId" + "\\}", apiClient.escapeString(legacyLowstockContactId.toString()));

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

    
    GenericType<LegacyLowstockContact> localVarReturnType = new GenericType<LegacyLowstockContact>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search legacyLowstockContacts by filter
   * Returns the list of legacyLowstockContacts that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<LegacyLowstockContact>
   * @throws ApiException if fails to make API call
   */
  public List<LegacyLowstockContact> getLegacyLowstockContactByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/legacyLowstockContact/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<LegacyLowstockContact>> localVarReturnType = new GenericType<List<LegacyLowstockContact>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a legacyLowstockContact by id
   * Returns the legacyLowstockContact identified by the specified id.
   * @param legacyLowstockContactId Id of the legacyLowstockContact to be returned. (required)
   * @return LegacyLowstockContact
   * @throws ApiException if fails to make API call
   */
  public LegacyLowstockContact getLegacyLowstockContactById(Integer legacyLowstockContactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'legacyLowstockContactId' is set
    if (legacyLowstockContactId == null) {
      throw new ApiException(400, "Missing the required parameter 'legacyLowstockContactId' when calling getLegacyLowstockContactById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/legacyLowstockContact/{legacyLowstockContactId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "legacyLowstockContactId" + "\\}", apiClient.escapeString(legacyLowstockContactId.toString()));

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

    
    GenericType<LegacyLowstockContact> localVarReturnType = new GenericType<LegacyLowstockContact>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a legacyLowstockContact.
   * Get all existing legacyLowstockContact tags.
   * @param legacyLowstockContactId Id of the legacyLowstockContact to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getLegacyLowstockContactTags(Integer legacyLowstockContactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'legacyLowstockContactId' is set
    if (legacyLowstockContactId == null) {
      throw new ApiException(400, "Missing the required parameter 'legacyLowstockContactId' when calling getLegacyLowstockContactTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/legacyLowstockContact/{legacyLowstockContactId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "legacyLowstockContactId" + "\\}", apiClient.escapeString(legacyLowstockContactId.toString()));

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
   * Update a legacyLowstockContact
   * Updates an existing legacyLowstockContact using the specified data.
   * @param body LegacyLowstockContact to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateLegacyLowstockContact(LegacyLowstockContact body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLegacyLowstockContact");
    }
    
    // create path and map variables
    String localVarPath = "/beta/legacyLowstockContact".replaceAll("\\{format\\}","json");

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
