package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ExternalShipment;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class ExternalShipmentApi {
  private ApiClient apiClient;

  public ExternalShipmentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExternalShipmentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an externalShipment
   * Inserts a new externalShipment using the specified data.
   * @param body ExternalShipment to be inserted. (required)
   * @return ExternalShipment
   * @throws ApiException if fails to make API call
   */
  public ExternalShipment addExternalShipment(ExternalShipment body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addExternalShipment");
    }
    
    // create path and map variables
    String localVarPath = "/beta/externalShipment".replaceAll("\\{format\\}","json");

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

    
    GenericType<ExternalShipment> localVarReturnType = new GenericType<ExternalShipment>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an externalShipment
   * Adds an audit to an existing externalShipment.
   * @param externalShipmentId Id of the externalShipment to add an audit to (required)
   * @param externalShipmentAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addExternalShipmentAudit(Integer externalShipmentId, String externalShipmentAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalShipmentId' is set
    if (externalShipmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalShipmentId' when calling addExternalShipmentAudit");
    }
    
    // verify the required parameter 'externalShipmentAudit' is set
    if (externalShipmentAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'externalShipmentAudit' when calling addExternalShipmentAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/externalShipment/{externalShipmentId}/audit/{externalShipmentAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalShipmentId" + "\\}", apiClient.escapeString(externalShipmentId.toString()))
      .replaceAll("\\{" + "externalShipmentAudit" + "\\}", apiClient.escapeString(externalShipmentAudit.toString()));

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
   * Add new tags for an externalShipment.
   * Adds a tag to an existing externalShipment.
   * @param externalShipmentId Id of the externalShipment to add a tag to (required)
   * @param externalShipmentTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addExternalShipmentTag(Integer externalShipmentId, String externalShipmentTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalShipmentId' is set
    if (externalShipmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalShipmentId' when calling addExternalShipmentTag");
    }
    
    // verify the required parameter 'externalShipmentTag' is set
    if (externalShipmentTag == null) {
      throw new ApiException(400, "Missing the required parameter 'externalShipmentTag' when calling addExternalShipmentTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/externalShipment/{externalShipmentId}/tag/{externalShipmentTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalShipmentId" + "\\}", apiClient.escapeString(externalShipmentId.toString()))
      .replaceAll("\\{" + "externalShipmentTag" + "\\}", apiClient.escapeString(externalShipmentTag.toString()));

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
   * Delete an externalShipment
   * Deletes the externalShipment identified by the specified id.
   * @param externalShipmentId Id of the externalShipment to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteExternalShipment(Integer externalShipmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalShipmentId' is set
    if (externalShipmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalShipmentId' when calling deleteExternalShipment");
    }
    
    // create path and map variables
    String localVarPath = "/beta/externalShipment/{externalShipmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalShipmentId" + "\\}", apiClient.escapeString(externalShipmentId.toString()));

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
   * Delete a tag for an externalShipment.
   * Deletes an existing externalShipment tag using the specified data.
   * @param externalShipmentId Id of the externalShipment to remove tag from (required)
   * @param externalShipmentTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteExternalShipmentTag(Integer externalShipmentId, String externalShipmentTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalShipmentId' is set
    if (externalShipmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalShipmentId' when calling deleteExternalShipmentTag");
    }
    
    // verify the required parameter 'externalShipmentTag' is set
    if (externalShipmentTag == null) {
      throw new ApiException(400, "Missing the required parameter 'externalShipmentTag' when calling deleteExternalShipmentTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/externalShipment/{externalShipmentId}/tag/{externalShipmentTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalShipmentId" + "\\}", apiClient.escapeString(externalShipmentId.toString()))
      .replaceAll("\\{" + "externalShipmentTag" + "\\}", apiClient.escapeString(externalShipmentTag.toString()));

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
   * Get a duplicated an externalShipment by id
   * Returns a duplicated externalShipment identified by the specified id.
   * @param externalShipmentId Id of the externalShipment to be duplicated. (required)
   * @return ExternalShipment
   * @throws ApiException if fails to make API call
   */
  public ExternalShipment getDuplicateExternalShipmentById(Integer externalShipmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalShipmentId' is set
    if (externalShipmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalShipmentId' when calling getDuplicateExternalShipmentById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/externalShipment/duplicate/{externalShipmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalShipmentId" + "\\}", apiClient.escapeString(externalShipmentId.toString()));

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

    
    GenericType<ExternalShipment> localVarReturnType = new GenericType<ExternalShipment>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search externalShipments by filter
   * Returns the list of externalShipments that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ExternalShipment>
   * @throws ApiException if fails to make API call
   */
  public List<ExternalShipment> getExternalShipmentByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/externalShipment/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ExternalShipment>> localVarReturnType = new GenericType<List<ExternalShipment>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an externalShipment by id
   * Returns the externalShipment identified by the specified id.
   * @param externalShipmentId Id of the externalShipment to be returned. (required)
   * @return ExternalShipment
   * @throws ApiException if fails to make API call
   */
  public ExternalShipment getExternalShipmentById(Integer externalShipmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalShipmentId' is set
    if (externalShipmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalShipmentId' when calling getExternalShipmentById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/externalShipment/{externalShipmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalShipmentId" + "\\}", apiClient.escapeString(externalShipmentId.toString()));

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

    
    GenericType<ExternalShipment> localVarReturnType = new GenericType<ExternalShipment>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an externalShipment.
   * Get all existing externalShipment tags.
   * @param externalShipmentId Id of the externalShipment to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getExternalShipmentTags(Integer externalShipmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalShipmentId' is set
    if (externalShipmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalShipmentId' when calling getExternalShipmentTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/externalShipment/{externalShipmentId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalShipmentId" + "\\}", apiClient.escapeString(externalShipmentId.toString()));

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
   * Update an externalShipment
   * Updates an existing externalShipment using the specified data.
   * @param body ExternalShipment to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateExternalShipment(ExternalShipment body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateExternalShipment");
    }
    
    // create path and map variables
    String localVarPath = "/beta/externalShipment".replaceAll("\\{format\\}","json");

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
   * Update an externalShipment custom fields
   * Updates an existing externalShipment custom fields using the specified data.
   * @param body ExternalShipment to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateExternalShipmentCustomFields(ExternalShipment body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateExternalShipmentCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/externalShipment/customFields".replaceAll("\\{format\\}","json");

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
