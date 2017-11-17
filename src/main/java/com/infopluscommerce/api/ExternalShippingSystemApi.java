package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ExternalShippingSystem;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
public class ExternalShippingSystemApi {
  private ApiClient apiClient;

  public ExternalShippingSystemApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExternalShippingSystemApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create an externalShippingSystem
   * Inserts a new externalShippingSystem using the specified data.
   * @param body ExternalShippingSystem to be inserted. (required)
   * @return ExternalShippingSystem
   * @throws ApiException if fails to make API call
   */
  public ExternalShippingSystem addExternalShippingSystem(ExternalShippingSystem body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addExternalShippingSystem");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/externalShippingSystem".replaceAll("\\{format\\}","json");

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

    
    GenericType<ExternalShippingSystem> localVarReturnType = new GenericType<ExternalShippingSystem>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete an externalShippingSystem
   * Deletes the externalShippingSystem identified by the specified id.
   * @param externalShippingSystemId Id of the externalShippingSystem to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteExternalShippingSystem(Integer externalShippingSystemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalShippingSystemId' is set
    if (externalShippingSystemId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalShippingSystemId' when calling deleteExternalShippingSystem");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/externalShippingSystem/{externalShippingSystemId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalShippingSystemId" + "\\}", apiClient.escapeString(externalShippingSystemId.toString()));

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
   * Get a duplicated an externalShippingSystem by id
   * Returns a duplicated externalShippingSystem identified by the specified id.
   * @param externalShippingSystemId Id of the externalShippingSystem to be duplicated. (required)
   * @return ExternalShippingSystem
   * @throws ApiException if fails to make API call
   */
  public ExternalShippingSystem getDuplicateExternalShippingSystemById(Integer externalShippingSystemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalShippingSystemId' is set
    if (externalShippingSystemId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalShippingSystemId' when calling getDuplicateExternalShippingSystemById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/externalShippingSystem/duplicate/{externalShippingSystemId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalShippingSystemId" + "\\}", apiClient.escapeString(externalShippingSystemId.toString()));

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

    
    GenericType<ExternalShippingSystem> localVarReturnType = new GenericType<ExternalShippingSystem>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search externalShippingSystems by filter
   * Returns the list of externalShippingSystems that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ExternalShippingSystem>
   * @throws ApiException if fails to make API call
   */
  public List<ExternalShippingSystem> getExternalShippingSystemByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2.0/externalShippingSystem/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ExternalShippingSystem>> localVarReturnType = new GenericType<List<ExternalShippingSystem>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an externalShippingSystem by id
   * Returns the externalShippingSystem identified by the specified id.
   * @param externalShippingSystemId Id of the externalShippingSystem to be returned. (required)
   * @return ExternalShippingSystem
   * @throws ApiException if fails to make API call
   */
  public ExternalShippingSystem getExternalShippingSystemById(Integer externalShippingSystemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalShippingSystemId' is set
    if (externalShippingSystemId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalShippingSystemId' when calling getExternalShippingSystemById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/externalShippingSystem/{externalShippingSystemId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalShippingSystemId" + "\\}", apiClient.escapeString(externalShippingSystemId.toString()));

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

    
    GenericType<ExternalShippingSystem> localVarReturnType = new GenericType<ExternalShippingSystem>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update an externalShippingSystem
   * Updates an existing externalShippingSystem using the specified data.
   * @param body ExternalShippingSystem to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateExternalShippingSystem(ExternalShippingSystem body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateExternalShippingSystem");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/externalShippingSystem".replaceAll("\\{format\\}","json");

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
   * Update an externalShippingSystem custom fields
   * Updates an existing externalShippingSystem custom fields using the specified data.
   * @param body ExternalShippingSystem to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateExternalShippingSystemCustomFields(ExternalShippingSystem body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateExternalShippingSystemCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/externalShippingSystem/customFields".replaceAll("\\{format\\}","json");

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
