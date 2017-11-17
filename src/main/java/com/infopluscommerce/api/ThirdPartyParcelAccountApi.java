package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ApiResponse;
import com.infopluscommerce.model.ThirdPartyParcelAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class ThirdPartyParcelAccountApi {
  private ApiClient apiClient;

  public ThirdPartyParcelAccountApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ThirdPartyParcelAccountApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a thirdPartyParcelAccount
   * Inserts a new thirdPartyParcelAccount using the specified data.
   * @param body ThirdPartyParcelAccount to be inserted. (required)
   * @return ThirdPartyParcelAccount
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyParcelAccount addThirdPartyParcelAccount(ThirdPartyParcelAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addThirdPartyParcelAccount");
    }
    
    // create path and map variables
    String localVarPath = "/beta/thirdPartyParcelAccount".replaceAll("\\{format\\}","json");

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

    
    GenericType<ThirdPartyParcelAccount> localVarReturnType = new GenericType<ThirdPartyParcelAccount>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a thirdPartyParcelAccount
   * Adds an audit to an existing thirdPartyParcelAccount.
   * @param thirdPartyParcelAccountId Id of the thirdPartyParcelAccount to add an audit to (required)
   * @param thirdPartyParcelAccountAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addThirdPartyParcelAccountAudit(Integer thirdPartyParcelAccountId, String thirdPartyParcelAccountAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'thirdPartyParcelAccountId' is set
    if (thirdPartyParcelAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'thirdPartyParcelAccountId' when calling addThirdPartyParcelAccountAudit");
    }
    
    // verify the required parameter 'thirdPartyParcelAccountAudit' is set
    if (thirdPartyParcelAccountAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'thirdPartyParcelAccountAudit' when calling addThirdPartyParcelAccountAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/audit/{thirdPartyParcelAccountAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "thirdPartyParcelAccountId" + "\\}", apiClient.escapeString(thirdPartyParcelAccountId.toString()))
      .replaceAll("\\{" + "thirdPartyParcelAccountAudit" + "\\}", apiClient.escapeString(thirdPartyParcelAccountAudit.toString()));

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
   * Add new tags for a thirdPartyParcelAccount.
   * Adds a tag to an existing thirdPartyParcelAccount.
   * @param thirdPartyParcelAccountId Id of the thirdPartyParcelAccount to add a tag to (required)
   * @param thirdPartyParcelAccountTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addThirdPartyParcelAccountTag(Integer thirdPartyParcelAccountId, String thirdPartyParcelAccountTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'thirdPartyParcelAccountId' is set
    if (thirdPartyParcelAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'thirdPartyParcelAccountId' when calling addThirdPartyParcelAccountTag");
    }
    
    // verify the required parameter 'thirdPartyParcelAccountTag' is set
    if (thirdPartyParcelAccountTag == null) {
      throw new ApiException(400, "Missing the required parameter 'thirdPartyParcelAccountTag' when calling addThirdPartyParcelAccountTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/tag/{thirdPartyParcelAccountTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "thirdPartyParcelAccountId" + "\\}", apiClient.escapeString(thirdPartyParcelAccountId.toString()))
      .replaceAll("\\{" + "thirdPartyParcelAccountTag" + "\\}", apiClient.escapeString(thirdPartyParcelAccountTag.toString()));

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
   * Delete a thirdPartyParcelAccount
   * Deletes the thirdPartyParcelAccount identified by the specified id.
   * @param thirdPartyParcelAccountId Id of the thirdPartyParcelAccount to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteThirdPartyParcelAccount(Integer thirdPartyParcelAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'thirdPartyParcelAccountId' is set
    if (thirdPartyParcelAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'thirdPartyParcelAccountId' when calling deleteThirdPartyParcelAccount");
    }
    
    // create path and map variables
    String localVarPath = "/beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "thirdPartyParcelAccountId" + "\\}", apiClient.escapeString(thirdPartyParcelAccountId.toString()));

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
   * Delete a tag for a thirdPartyParcelAccount.
   * Deletes an existing thirdPartyParcelAccount tag using the specified data.
   * @param thirdPartyParcelAccountId Id of the thirdPartyParcelAccount to remove tag from (required)
   * @param thirdPartyParcelAccountTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteThirdPartyParcelAccountTag(Integer thirdPartyParcelAccountId, String thirdPartyParcelAccountTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'thirdPartyParcelAccountId' is set
    if (thirdPartyParcelAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'thirdPartyParcelAccountId' when calling deleteThirdPartyParcelAccountTag");
    }
    
    // verify the required parameter 'thirdPartyParcelAccountTag' is set
    if (thirdPartyParcelAccountTag == null) {
      throw new ApiException(400, "Missing the required parameter 'thirdPartyParcelAccountTag' when calling deleteThirdPartyParcelAccountTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/tag/{thirdPartyParcelAccountTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "thirdPartyParcelAccountId" + "\\}", apiClient.escapeString(thirdPartyParcelAccountId.toString()))
      .replaceAll("\\{" + "thirdPartyParcelAccountTag" + "\\}", apiClient.escapeString(thirdPartyParcelAccountTag.toString()));

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
   * Get a duplicated a thirdPartyParcelAccount by id
   * Returns a duplicated thirdPartyParcelAccount identified by the specified id.
   * @param thirdPartyParcelAccountId Id of the thirdPartyParcelAccount to be duplicated. (required)
   * @return ThirdPartyParcelAccount
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyParcelAccount getDuplicateThirdPartyParcelAccountById(Integer thirdPartyParcelAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'thirdPartyParcelAccountId' is set
    if (thirdPartyParcelAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'thirdPartyParcelAccountId' when calling getDuplicateThirdPartyParcelAccountById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/thirdPartyParcelAccount/duplicate/{thirdPartyParcelAccountId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "thirdPartyParcelAccountId" + "\\}", apiClient.escapeString(thirdPartyParcelAccountId.toString()));

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

    
    GenericType<ThirdPartyParcelAccount> localVarReturnType = new GenericType<ThirdPartyParcelAccount>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search thirdPartyParcelAccounts by filter
   * Returns the list of thirdPartyParcelAccounts that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ThirdPartyParcelAccount>
   * @throws ApiException if fails to make API call
   */
  public List<ThirdPartyParcelAccount> getThirdPartyParcelAccountByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/thirdPartyParcelAccount/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ThirdPartyParcelAccount>> localVarReturnType = new GenericType<List<ThirdPartyParcelAccount>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a thirdPartyParcelAccount by id
   * Returns the thirdPartyParcelAccount identified by the specified id.
   * @param thirdPartyParcelAccountId Id of the thirdPartyParcelAccount to be returned. (required)
   * @return ThirdPartyParcelAccount
   * @throws ApiException if fails to make API call
   */
  public ThirdPartyParcelAccount getThirdPartyParcelAccountById(Integer thirdPartyParcelAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'thirdPartyParcelAccountId' is set
    if (thirdPartyParcelAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'thirdPartyParcelAccountId' when calling getThirdPartyParcelAccountById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "thirdPartyParcelAccountId" + "\\}", apiClient.escapeString(thirdPartyParcelAccountId.toString()));

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

    
    GenericType<ThirdPartyParcelAccount> localVarReturnType = new GenericType<ThirdPartyParcelAccount>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a thirdPartyParcelAccount.
   * Get all existing thirdPartyParcelAccount tags.
   * @param thirdPartyParcelAccountId Id of the thirdPartyParcelAccount to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getThirdPartyParcelAccountTags(Integer thirdPartyParcelAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'thirdPartyParcelAccountId' is set
    if (thirdPartyParcelAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'thirdPartyParcelAccountId' when calling getThirdPartyParcelAccountTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "thirdPartyParcelAccountId" + "\\}", apiClient.escapeString(thirdPartyParcelAccountId.toString()));

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
   * Update a thirdPartyParcelAccount
   * Updates an existing thirdPartyParcelAccount using the specified data.
   * @param body ThirdPartyParcelAccount to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateThirdPartyParcelAccount(ThirdPartyParcelAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateThirdPartyParcelAccount");
    }
    
    // create path and map variables
    String localVarPath = "/beta/thirdPartyParcelAccount".replaceAll("\\{format\\}","json");

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
   * Update a thirdPartyParcelAccount custom fields
   * Updates an existing thirdPartyParcelAccount custom fields using the specified data.
   * @param body ThirdPartyParcelAccount to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateThirdPartyParcelAccountCustomFields(ThirdPartyParcelAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateThirdPartyParcelAccountCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/thirdPartyParcelAccount/customFields".replaceAll("\\{format\\}","json");

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
