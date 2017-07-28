package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.CartonActivity;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class CartonActivityApi {
  private ApiClient apiClient;

  public CartonActivityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CartonActivityApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a cartonActivity
   * Inserts a new cartonActivity using the specified data.
   * @param body CartonActivity to be inserted. (required)
   * @return CartonActivity
   * @throws ApiException if fails to make API call
   */
  public CartonActivity addCartonActivity(CartonActivity body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addCartonActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonActivity".replaceAll("\\{format\\}","json");

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

    
    GenericType<CartonActivity> localVarReturnType = new GenericType<CartonActivity>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a cartonActivity
   * Adds an audit to an existing cartonActivity.
   * @param cartonActivityId Id of the cartonActivity to add an audit to (required)
   * @param cartonActivityAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addCartonActivityAudit(Integer cartonActivityId, String cartonActivityAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonActivityId' is set
    if (cartonActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonActivityId' when calling addCartonActivityAudit");
    }
    
    // verify the required parameter 'cartonActivityAudit' is set
    if (cartonActivityAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonActivityAudit' when calling addCartonActivityAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonActivity/{cartonActivityId}/audit/{cartonActivityAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonActivityId" + "\\}", apiClient.escapeString(cartonActivityId.toString()))
      .replaceAll("\\{" + "cartonActivityAudit" + "\\}", apiClient.escapeString(cartonActivityAudit.toString()));

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
   * Add new tags for a cartonActivity.
   * Adds a tag to an existing cartonActivity.
   * @param cartonActivityId Id of the cartonActivity to add a tag to (required)
   * @param cartonActivityTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addCartonActivityTag(Integer cartonActivityId, String cartonActivityTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonActivityId' is set
    if (cartonActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonActivityId' when calling addCartonActivityTag");
    }
    
    // verify the required parameter 'cartonActivityTag' is set
    if (cartonActivityTag == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonActivityTag' when calling addCartonActivityTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonActivity/{cartonActivityId}/tag/{cartonActivityTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonActivityId" + "\\}", apiClient.escapeString(cartonActivityId.toString()))
      .replaceAll("\\{" + "cartonActivityTag" + "\\}", apiClient.escapeString(cartonActivityTag.toString()));

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
   * Delete a cartonActivity
   * Deletes the cartonActivity identified by the specified id.
   * @param cartonActivityId Id of the cartonActivity to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCartonActivity(Integer cartonActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonActivityId' is set
    if (cartonActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonActivityId' when calling deleteCartonActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonActivity/{cartonActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonActivityId" + "\\}", apiClient.escapeString(cartonActivityId.toString()));

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
   * Delete a tag for a cartonActivity.
   * Deletes an existing cartonActivity tag using the specified data.
   * @param cartonActivityId Id of the cartonActivity to remove tag from (required)
   * @param cartonActivityTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCartonActivityTag(Integer cartonActivityId, String cartonActivityTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonActivityId' is set
    if (cartonActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonActivityId' when calling deleteCartonActivityTag");
    }
    
    // verify the required parameter 'cartonActivityTag' is set
    if (cartonActivityTag == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonActivityTag' when calling deleteCartonActivityTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonActivity/{cartonActivityId}/tag/{cartonActivityTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonActivityId" + "\\}", apiClient.escapeString(cartonActivityId.toString()))
      .replaceAll("\\{" + "cartonActivityTag" + "\\}", apiClient.escapeString(cartonActivityTag.toString()));

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
   * Search cartonActivitys by filter
   * Returns the list of cartonActivitys that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<CartonActivity>
   * @throws ApiException if fails to make API call
   */
  public List<CartonActivity> getCartonActivityByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/cartonActivity/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<CartonActivity>> localVarReturnType = new GenericType<List<CartonActivity>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a cartonActivity by id
   * Returns the cartonActivity identified by the specified id.
   * @param cartonActivityId Id of the cartonActivity to be returned. (required)
   * @return CartonActivity
   * @throws ApiException if fails to make API call
   */
  public CartonActivity getCartonActivityById(Integer cartonActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonActivityId' is set
    if (cartonActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonActivityId' when calling getCartonActivityById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonActivity/{cartonActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonActivityId" + "\\}", apiClient.escapeString(cartonActivityId.toString()));

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

    
    GenericType<CartonActivity> localVarReturnType = new GenericType<CartonActivity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a cartonActivity.
   * Get all existing cartonActivity tags.
   * @param cartonActivityId Id of the cartonActivity to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getCartonActivityTags(Integer cartonActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonActivityId' is set
    if (cartonActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonActivityId' when calling getCartonActivityTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonActivity/{cartonActivityId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonActivityId" + "\\}", apiClient.escapeString(cartonActivityId.toString()));

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
   * Get a duplicated a cartonActivity by id
   * Returns a duplicated cartonActivity identified by the specified id.
   * @param cartonActivityId Id of the cartonActivity to be duplicated. (required)
   * @return CartonActivity
   * @throws ApiException if fails to make API call
   */
  public CartonActivity getDuplicateCartonActivityById(Integer cartonActivityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonActivityId' is set
    if (cartonActivityId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonActivityId' when calling getDuplicateCartonActivityById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonActivity/duplicate/{cartonActivityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonActivityId" + "\\}", apiClient.escapeString(cartonActivityId.toString()));

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

    
    GenericType<CartonActivity> localVarReturnType = new GenericType<CartonActivity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a cartonActivity
   * Updates an existing cartonActivity using the specified data.
   * @param body CartonActivity to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateCartonActivity(CartonActivity body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCartonActivity");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonActivity".replaceAll("\\{format\\}","json");

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
