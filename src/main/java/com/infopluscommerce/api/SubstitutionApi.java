package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Substitution;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class SubstitutionApi {
  private ApiClient apiClient;

  public SubstitutionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubstitutionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a substitution
   * Inserts a new substitution using the specified data.
   * @param body Substitution to be inserted. (required)
   * @return Substitution
   * @throws ApiException if fails to make API call
   */
  public Substitution addSubstitution(Substitution body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addSubstitution");
    }
    
    // create path and map variables
    String localVarPath = "/beta/substitution".replaceAll("\\{format\\}","json");

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

    
    GenericType<Substitution> localVarReturnType = new GenericType<Substitution>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a substitution
   * Adds an audit to an existing substitution.
   * @param substitutionId Id of the substitution to add an audit to (required)
   * @param substitutionAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addSubstitutionAudit(Integer substitutionId, String substitutionAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'substitutionId' is set
    if (substitutionId == null) {
      throw new ApiException(400, "Missing the required parameter 'substitutionId' when calling addSubstitutionAudit");
    }
    
    // verify the required parameter 'substitutionAudit' is set
    if (substitutionAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'substitutionAudit' when calling addSubstitutionAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/substitution/{substitutionId}/audit/{substitutionAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "substitutionId" + "\\}", apiClient.escapeString(substitutionId.toString()))
      .replaceAll("\\{" + "substitutionAudit" + "\\}", apiClient.escapeString(substitutionAudit.toString()));

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
   * Add new tags for a substitution.
   * Adds a tag to an existing substitution.
   * @param substitutionId Id of the substitution to add a tag to (required)
   * @param substitutionTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addSubstitutionTag(Integer substitutionId, String substitutionTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'substitutionId' is set
    if (substitutionId == null) {
      throw new ApiException(400, "Missing the required parameter 'substitutionId' when calling addSubstitutionTag");
    }
    
    // verify the required parameter 'substitutionTag' is set
    if (substitutionTag == null) {
      throw new ApiException(400, "Missing the required parameter 'substitutionTag' when calling addSubstitutionTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/substitution/{substitutionId}/tag/{substitutionTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "substitutionId" + "\\}", apiClient.escapeString(substitutionId.toString()))
      .replaceAll("\\{" + "substitutionTag" + "\\}", apiClient.escapeString(substitutionTag.toString()));

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
   * Delete a substitution
   * Deletes the substitution identified by the specified id.
   * @param substitutionId Id of the substitution to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSubstitution(Integer substitutionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'substitutionId' is set
    if (substitutionId == null) {
      throw new ApiException(400, "Missing the required parameter 'substitutionId' when calling deleteSubstitution");
    }
    
    // create path and map variables
    String localVarPath = "/beta/substitution/{substitutionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "substitutionId" + "\\}", apiClient.escapeString(substitutionId.toString()));

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
   * Delete a tag for a substitution.
   * Deletes an existing substitution tag using the specified data.
   * @param substitutionId Id of the substitution to remove tag from (required)
   * @param substitutionTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSubstitutionTag(Integer substitutionId, String substitutionTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'substitutionId' is set
    if (substitutionId == null) {
      throw new ApiException(400, "Missing the required parameter 'substitutionId' when calling deleteSubstitutionTag");
    }
    
    // verify the required parameter 'substitutionTag' is set
    if (substitutionTag == null) {
      throw new ApiException(400, "Missing the required parameter 'substitutionTag' when calling deleteSubstitutionTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/substitution/{substitutionId}/tag/{substitutionTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "substitutionId" + "\\}", apiClient.escapeString(substitutionId.toString()))
      .replaceAll("\\{" + "substitutionTag" + "\\}", apiClient.escapeString(substitutionTag.toString()));

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
   * Get a duplicated a substitution by id
   * Returns a duplicated substitution identified by the specified id.
   * @param substitutionId Id of the substitution to be duplicated. (required)
   * @return Substitution
   * @throws ApiException if fails to make API call
   */
  public Substitution getDuplicateSubstitutionById(Integer substitutionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'substitutionId' is set
    if (substitutionId == null) {
      throw new ApiException(400, "Missing the required parameter 'substitutionId' when calling getDuplicateSubstitutionById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/substitution/duplicate/{substitutionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "substitutionId" + "\\}", apiClient.escapeString(substitutionId.toString()));

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

    
    GenericType<Substitution> localVarReturnType = new GenericType<Substitution>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search substitutions by filter
   * Returns the list of substitutions that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<Substitution>
   * @throws ApiException if fails to make API call
   */
  public List<Substitution> getSubstitutionByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/substitution/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Substitution>> localVarReturnType = new GenericType<List<Substitution>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a substitution by id
   * Returns the substitution identified by the specified id.
   * @param substitutionId Id of the substitution to be returned. (required)
   * @return Substitution
   * @throws ApiException if fails to make API call
   */
  public Substitution getSubstitutionById(Integer substitutionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'substitutionId' is set
    if (substitutionId == null) {
      throw new ApiException(400, "Missing the required parameter 'substitutionId' when calling getSubstitutionById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/substitution/{substitutionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "substitutionId" + "\\}", apiClient.escapeString(substitutionId.toString()));

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

    
    GenericType<Substitution> localVarReturnType = new GenericType<Substitution>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a substitution.
   * Get all existing substitution tags.
   * @param substitutionId Id of the substitution to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getSubstitutionTags(Integer substitutionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'substitutionId' is set
    if (substitutionId == null) {
      throw new ApiException(400, "Missing the required parameter 'substitutionId' when calling getSubstitutionTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/substitution/{substitutionId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "substitutionId" + "\\}", apiClient.escapeString(substitutionId.toString()));

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
   * Update a substitution
   * Updates an existing substitution using the specified data.
   * @param body Substitution to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateSubstitution(Substitution body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateSubstitution");
    }
    
    // create path and map variables
    String localVarPath = "/beta/substitution".replaceAll("\\{format\\}","json");

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
   * Update a substitution custom fields
   * Updates an existing substitution custom fields using the specified data.
   * @param body Substitution to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateSubstitutionCustomFields(Substitution body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateSubstitutionCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/substitution/customFields".replaceAll("\\{format\\}","json");

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
