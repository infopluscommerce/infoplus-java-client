package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Asn;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class AsnApi {
  private ApiClient apiClient;

  public AsnApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AsnApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an asn
   * Inserts a new asn using the specified data.
   * @param body Asn to be inserted. (required)
   * @return Asn
   * @throws ApiException if fails to make API call
   */
  public Asn addAsn(Asn body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addAsn");
    }
    
    // create path and map variables
    String localVarPath = "/beta/asn".replaceAll("\\{format\\}","json");

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

    
    GenericType<Asn> localVarReturnType = new GenericType<Asn>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an asn
   * Adds an audit to an existing asn.
   * @param asnId Id of the asn to add an audit to (required)
   * @param asnAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addAsnAudit(Integer asnId, String asnAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asnId' is set
    if (asnId == null) {
      throw new ApiException(400, "Missing the required parameter 'asnId' when calling addAsnAudit");
    }
    
    // verify the required parameter 'asnAudit' is set
    if (asnAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'asnAudit' when calling addAsnAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/asn/{asnId}/audit/{asnAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "asnId" + "\\}", apiClient.escapeString(asnId.toString()))
      .replaceAll("\\{" + "asnAudit" + "\\}", apiClient.escapeString(asnAudit.toString()));

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
   * Add new tags for an asn.
   * Adds a tag to an existing asn.
   * @param asnId Id of the asn to add a tag to (required)
   * @param asnTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addAsnTag(Integer asnId, String asnTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asnId' is set
    if (asnId == null) {
      throw new ApiException(400, "Missing the required parameter 'asnId' when calling addAsnTag");
    }
    
    // verify the required parameter 'asnTag' is set
    if (asnTag == null) {
      throw new ApiException(400, "Missing the required parameter 'asnTag' when calling addAsnTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/asn/{asnId}/tag/{asnTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "asnId" + "\\}", apiClient.escapeString(asnId.toString()))
      .replaceAll("\\{" + "asnTag" + "\\}", apiClient.escapeString(asnTag.toString()));

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
   * Delete an asn
   * Deletes the asn identified by the specified id.
   * @param asnId Id of the asn to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAsn(Integer asnId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asnId' is set
    if (asnId == null) {
      throw new ApiException(400, "Missing the required parameter 'asnId' when calling deleteAsn");
    }
    
    // create path and map variables
    String localVarPath = "/beta/asn/{asnId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "asnId" + "\\}", apiClient.escapeString(asnId.toString()));

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
   * Delete a tag for an asn.
   * Deletes an existing asn tag using the specified data.
   * @param asnId Id of the asn to remove tag from (required)
   * @param asnTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAsnTag(Integer asnId, String asnTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asnId' is set
    if (asnId == null) {
      throw new ApiException(400, "Missing the required parameter 'asnId' when calling deleteAsnTag");
    }
    
    // verify the required parameter 'asnTag' is set
    if (asnTag == null) {
      throw new ApiException(400, "Missing the required parameter 'asnTag' when calling deleteAsnTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/asn/{asnId}/tag/{asnTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "asnId" + "\\}", apiClient.escapeString(asnId.toString()))
      .replaceAll("\\{" + "asnTag" + "\\}", apiClient.escapeString(asnTag.toString()));

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
   * Search asns by filter
   * Returns the list of asns that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<Asn>
   * @throws ApiException if fails to make API call
   */
  public List<Asn> getAsnByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/asn/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Asn>> localVarReturnType = new GenericType<List<Asn>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an asn by id
   * Returns the asn identified by the specified id.
   * @param asnId Id of the asn to be returned. (required)
   * @return Asn
   * @throws ApiException if fails to make API call
   */
  public Asn getAsnById(Integer asnId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asnId' is set
    if (asnId == null) {
      throw new ApiException(400, "Missing the required parameter 'asnId' when calling getAsnById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/asn/{asnId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "asnId" + "\\}", apiClient.escapeString(asnId.toString()));

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

    
    GenericType<Asn> localVarReturnType = new GenericType<Asn>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an asn.
   * Get all existing asn tags.
   * @param asnId Id of the asn to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getAsnTags(Integer asnId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asnId' is set
    if (asnId == null) {
      throw new ApiException(400, "Missing the required parameter 'asnId' when calling getAsnTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/asn/{asnId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "asnId" + "\\}", apiClient.escapeString(asnId.toString()));

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
   * Get a duplicated an asn by id
   * Returns a duplicated asn identified by the specified id.
   * @param asnId Id of the asn to be duplicated. (required)
   * @return Asn
   * @throws ApiException if fails to make API call
   */
  public Asn getDuplicateAsnById(Integer asnId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asnId' is set
    if (asnId == null) {
      throw new ApiException(400, "Missing the required parameter 'asnId' when calling getDuplicateAsnById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/asn/duplicate/{asnId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "asnId" + "\\}", apiClient.escapeString(asnId.toString()));

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

    
    GenericType<Asn> localVarReturnType = new GenericType<Asn>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update an asn
   * Updates an existing asn using the specified data.
   * @param body Asn to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateAsn(Asn body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateAsn");
    }
    
    // create path and map variables
    String localVarPath = "/beta/asn".replaceAll("\\{format\\}","json");

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
   * Update an asn custom fields
   * Updates an existing asn custom fields using the specified data.
   * @param body Asn to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateAsnCustomFields(Asn body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateAsnCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/asn/customFields".replaceAll("\\{format\\}","json");

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
