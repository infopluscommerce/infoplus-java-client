package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.CartonType;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class CartonTypeApi {
  private ApiClient apiClient;

  public CartonTypeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CartonTypeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a cartonType
   * Inserts a new cartonType using the specified data.
   * @param body CartonType to be inserted. (required)
   * @return CartonType
   * @throws ApiException if fails to make API call
   */
  public CartonType addCartonType(CartonType body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addCartonType");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonType".replaceAll("\\{format\\}","json");

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

    
    GenericType<CartonType> localVarReturnType = new GenericType<CartonType>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a cartonType
   * Adds an audit to an existing cartonType.
   * @param cartonTypeId Id of the cartonType to add an audit to (required)
   * @param cartonTypeAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addCartonTypeAudit(Integer cartonTypeId, String cartonTypeAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonTypeId' is set
    if (cartonTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonTypeId' when calling addCartonTypeAudit");
    }
    
    // verify the required parameter 'cartonTypeAudit' is set
    if (cartonTypeAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonTypeAudit' when calling addCartonTypeAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonType/{cartonTypeId}/audit/{cartonTypeAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonTypeId" + "\\}", apiClient.escapeString(cartonTypeId.toString()))
      .replaceAll("\\{" + "cartonTypeAudit" + "\\}", apiClient.escapeString(cartonTypeAudit.toString()));

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
   * Add new tags for a cartonType.
   * Adds a tag to an existing cartonType.
   * @param cartonTypeId Id of the cartonType to add a tag to (required)
   * @param cartonTypeTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addCartonTypeTag(Integer cartonTypeId, String cartonTypeTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonTypeId' is set
    if (cartonTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonTypeId' when calling addCartonTypeTag");
    }
    
    // verify the required parameter 'cartonTypeTag' is set
    if (cartonTypeTag == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonTypeTag' when calling addCartonTypeTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonType/{cartonTypeId}/tag/{cartonTypeTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonTypeId" + "\\}", apiClient.escapeString(cartonTypeId.toString()))
      .replaceAll("\\{" + "cartonTypeTag" + "\\}", apiClient.escapeString(cartonTypeTag.toString()));

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
   * Delete a cartonType
   * Deletes the cartonType identified by the specified id.
   * @param cartonTypeId Id of the cartonType to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCartonType(Integer cartonTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonTypeId' is set
    if (cartonTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonTypeId' when calling deleteCartonType");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonType/{cartonTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonTypeId" + "\\}", apiClient.escapeString(cartonTypeId.toString()));

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
   * Delete a tag for a cartonType.
   * Deletes an existing cartonType tag using the specified data.
   * @param cartonTypeId Id of the cartonType to remove tag from (required)
   * @param cartonTypeTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCartonTypeTag(Integer cartonTypeId, String cartonTypeTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonTypeId' is set
    if (cartonTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonTypeId' when calling deleteCartonTypeTag");
    }
    
    // verify the required parameter 'cartonTypeTag' is set
    if (cartonTypeTag == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonTypeTag' when calling deleteCartonTypeTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonType/{cartonTypeId}/tag/{cartonTypeTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonTypeId" + "\\}", apiClient.escapeString(cartonTypeId.toString()))
      .replaceAll("\\{" + "cartonTypeTag" + "\\}", apiClient.escapeString(cartonTypeTag.toString()));

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
   * Search cartonTypes by filter
   * Returns the list of cartonTypes that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<CartonType>
   * @throws ApiException if fails to make API call
   */
  public List<CartonType> getCartonTypeByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/cartonType/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<CartonType>> localVarReturnType = new GenericType<List<CartonType>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a cartonType by id
   * Returns the cartonType identified by the specified id.
   * @param cartonTypeId Id of the cartonType to be returned. (required)
   * @return CartonType
   * @throws ApiException if fails to make API call
   */
  public CartonType getCartonTypeById(Integer cartonTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonTypeId' is set
    if (cartonTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonTypeId' when calling getCartonTypeById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonType/{cartonTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonTypeId" + "\\}", apiClient.escapeString(cartonTypeId.toString()));

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

    
    GenericType<CartonType> localVarReturnType = new GenericType<CartonType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a cartonType.
   * Get all existing cartonType tags.
   * @param cartonTypeId Id of the cartonType to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getCartonTypeTags(Integer cartonTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonTypeId' is set
    if (cartonTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonTypeId' when calling getCartonTypeTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonType/{cartonTypeId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonTypeId" + "\\}", apiClient.escapeString(cartonTypeId.toString()));

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
   * Get a duplicated a cartonType by id
   * Returns a duplicated cartonType identified by the specified id.
   * @param cartonTypeId Id of the cartonType to be duplicated. (required)
   * @return CartonType
   * @throws ApiException if fails to make API call
   */
  public CartonType getDuplicateCartonTypeById(Integer cartonTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonTypeId' is set
    if (cartonTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonTypeId' when calling getDuplicateCartonTypeById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonType/duplicate/{cartonTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonTypeId" + "\\}", apiClient.escapeString(cartonTypeId.toString()));

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

    
    GenericType<CartonType> localVarReturnType = new GenericType<CartonType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a cartonType
   * Updates an existing cartonType using the specified data.
   * @param body CartonType to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateCartonType(CartonType body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCartonType");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonType".replaceAll("\\{format\\}","json");

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
   * Update a cartonType custom fields
   * Updates an existing cartonType custom fields using the specified data.
   * @param body CartonType to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateCartonTypeCustomFields(CartonType body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCartonTypeCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonType/customFields".replaceAll("\\{format\\}","json");

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
