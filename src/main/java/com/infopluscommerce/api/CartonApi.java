package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Carton;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class CartonApi {
  private ApiClient apiClient;

  public CartonApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CartonApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a carton
   * Inserts a new carton using the specified data.
   * @param body Carton to be inserted. (required)
   * @return Carton
   * @throws ApiException if fails to make API call
   */
  public Carton addCarton(Carton body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addCarton");
    }
    
    // create path and map variables
    String localVarPath = "/beta/carton".replaceAll("\\{format\\}","json");

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

    
    GenericType<Carton> localVarReturnType = new GenericType<Carton>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a carton
   * Adds an audit to an existing carton.
   * @param cartonId Id of the carton to add an audit to (required)
   * @param cartonAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addCartonAudit(Integer cartonId, String cartonAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonId' is set
    if (cartonId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonId' when calling addCartonAudit");
    }
    
    // verify the required parameter 'cartonAudit' is set
    if (cartonAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonAudit' when calling addCartonAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/carton/{cartonId}/audit/{cartonAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonId" + "\\}", apiClient.escapeString(cartonId.toString()))
      .replaceAll("\\{" + "cartonAudit" + "\\}", apiClient.escapeString(cartonAudit.toString()));

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
   * Add new tags for a carton.
   * Adds a tag to an existing carton.
   * @param cartonId Id of the carton to add a tag to (required)
   * @param cartonTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addCartonTag(Integer cartonId, String cartonTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonId' is set
    if (cartonId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonId' when calling addCartonTag");
    }
    
    // verify the required parameter 'cartonTag' is set
    if (cartonTag == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonTag' when calling addCartonTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/carton/{cartonId}/tag/{cartonTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonId" + "\\}", apiClient.escapeString(cartonId.toString()))
      .replaceAll("\\{" + "cartonTag" + "\\}", apiClient.escapeString(cartonTag.toString()));

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
   * Delete a carton
   * Deletes the carton identified by the specified id.
   * @param cartonId Id of the carton to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCarton(Integer cartonId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonId' is set
    if (cartonId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonId' when calling deleteCarton");
    }
    
    // create path and map variables
    String localVarPath = "/beta/carton/{cartonId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonId" + "\\}", apiClient.escapeString(cartonId.toString()));

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
   * Delete a tag for a carton.
   * Deletes an existing carton tag using the specified data.
   * @param cartonId Id of the carton to remove tag from (required)
   * @param cartonTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCartonTag(Integer cartonId, String cartonTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonId' is set
    if (cartonId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonId' when calling deleteCartonTag");
    }
    
    // verify the required parameter 'cartonTag' is set
    if (cartonTag == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonTag' when calling deleteCartonTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/carton/{cartonId}/tag/{cartonTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonId" + "\\}", apiClient.escapeString(cartonId.toString()))
      .replaceAll("\\{" + "cartonTag" + "\\}", apiClient.escapeString(cartonTag.toString()));

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
   * Search cartons by filter
   * Returns the list of cartons that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<Carton>
   * @throws ApiException if fails to make API call
   */
  public List<Carton> getCartonByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/carton/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Carton>> localVarReturnType = new GenericType<List<Carton>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a carton by id
   * Returns the carton identified by the specified id.
   * @param cartonId Id of the carton to be returned. (required)
   * @return Carton
   * @throws ApiException if fails to make API call
   */
  public Carton getCartonById(Integer cartonId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonId' is set
    if (cartonId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonId' when calling getCartonById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/carton/{cartonId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonId" + "\\}", apiClient.escapeString(cartonId.toString()));

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

    
    GenericType<Carton> localVarReturnType = new GenericType<Carton>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a carton.
   * Get all existing carton tags.
   * @param cartonId Id of the carton to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getCartonTags(Integer cartonId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonId' is set
    if (cartonId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonId' when calling getCartonTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/carton/{cartonId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonId" + "\\}", apiClient.escapeString(cartonId.toString()));

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
   * Get a duplicated a carton by id
   * Returns a duplicated carton identified by the specified id.
   * @param cartonId Id of the carton to be duplicated. (required)
   * @return Carton
   * @throws ApiException if fails to make API call
   */
  public Carton getDuplicateCartonById(Integer cartonId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonId' is set
    if (cartonId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonId' when calling getDuplicateCartonById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/carton/duplicate/{cartonId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonId" + "\\}", apiClient.escapeString(cartonId.toString()));

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

    
    GenericType<Carton> localVarReturnType = new GenericType<Carton>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a carton
   * Updates an existing carton using the specified data.
   * @param body Carton to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateCarton(Carton body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCarton");
    }
    
    // create path and map variables
    String localVarPath = "/beta/carton".replaceAll("\\{format\\}","json");

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
   * Update a carton custom fields
   * Updates an existing carton custom fields using the specified data.
   * @param body Carton to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateCartonCustomFields(Carton body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCartonCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/carton/customFields".replaceAll("\\{format\\}","json");

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
