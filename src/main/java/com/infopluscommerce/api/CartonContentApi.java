package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.CartonContent;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class CartonContentApi {
  private ApiClient apiClient;

  public CartonContentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CartonContentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a cartonContent
   * Inserts a new cartonContent using the specified data.
   * @param body CartonContent to be inserted. (required)
   * @return CartonContent
   * @throws ApiException if fails to make API call
   */
  public CartonContent addCartonContent(CartonContent body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addCartonContent");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonContent".replaceAll("\\{format\\}","json");

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

    
    GenericType<CartonContent> localVarReturnType = new GenericType<CartonContent>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a cartonContent
   * Adds an audit to an existing cartonContent.
   * @param cartonContentId Id of the cartonContent to add an audit to (required)
   * @param cartonContentAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addCartonContentAudit(Integer cartonContentId, String cartonContentAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonContentId' is set
    if (cartonContentId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonContentId' when calling addCartonContentAudit");
    }
    
    // verify the required parameter 'cartonContentAudit' is set
    if (cartonContentAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonContentAudit' when calling addCartonContentAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonContent/{cartonContentId}/audit/{cartonContentAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonContentId" + "\\}", apiClient.escapeString(cartonContentId.toString()))
      .replaceAll("\\{" + "cartonContentAudit" + "\\}", apiClient.escapeString(cartonContentAudit.toString()));

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
   * Add new tags for a cartonContent.
   * Adds a tag to an existing cartonContent.
   * @param cartonContentId Id of the cartonContent to add a tag to (required)
   * @param cartonContentTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addCartonContentTag(Integer cartonContentId, String cartonContentTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonContentId' is set
    if (cartonContentId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonContentId' when calling addCartonContentTag");
    }
    
    // verify the required parameter 'cartonContentTag' is set
    if (cartonContentTag == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonContentTag' when calling addCartonContentTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonContent/{cartonContentId}/tag/{cartonContentTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonContentId" + "\\}", apiClient.escapeString(cartonContentId.toString()))
      .replaceAll("\\{" + "cartonContentTag" + "\\}", apiClient.escapeString(cartonContentTag.toString()));

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
   * Delete a cartonContent
   * Deletes the cartonContent identified by the specified id.
   * @param cartonContentId Id of the cartonContent to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCartonContent(Integer cartonContentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonContentId' is set
    if (cartonContentId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonContentId' when calling deleteCartonContent");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonContent/{cartonContentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonContentId" + "\\}", apiClient.escapeString(cartonContentId.toString()));

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
   * Delete a tag for a cartonContent.
   * Deletes an existing cartonContent tag using the specified data.
   * @param cartonContentId Id of the cartonContent to remove tag from (required)
   * @param cartonContentTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCartonContentTag(Integer cartonContentId, String cartonContentTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonContentId' is set
    if (cartonContentId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonContentId' when calling deleteCartonContentTag");
    }
    
    // verify the required parameter 'cartonContentTag' is set
    if (cartonContentTag == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonContentTag' when calling deleteCartonContentTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonContent/{cartonContentId}/tag/{cartonContentTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonContentId" + "\\}", apiClient.escapeString(cartonContentId.toString()))
      .replaceAll("\\{" + "cartonContentTag" + "\\}", apiClient.escapeString(cartonContentTag.toString()));

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
   * Search cartonContents by filter
   * Returns the list of cartonContents that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<CartonContent>
   * @throws ApiException if fails to make API call
   */
  public List<CartonContent> getCartonContentByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/cartonContent/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<CartonContent>> localVarReturnType = new GenericType<List<CartonContent>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a cartonContent by id
   * Returns the cartonContent identified by the specified id.
   * @param cartonContentId Id of the cartonContent to be returned. (required)
   * @return CartonContent
   * @throws ApiException if fails to make API call
   */
  public CartonContent getCartonContentById(Integer cartonContentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonContentId' is set
    if (cartonContentId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonContentId' when calling getCartonContentById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonContent/{cartonContentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonContentId" + "\\}", apiClient.escapeString(cartonContentId.toString()));

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

    
    GenericType<CartonContent> localVarReturnType = new GenericType<CartonContent>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a cartonContent.
   * Get all existing cartonContent tags.
   * @param cartonContentId Id of the cartonContent to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getCartonContentTags(Integer cartonContentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonContentId' is set
    if (cartonContentId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonContentId' when calling getCartonContentTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonContent/{cartonContentId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonContentId" + "\\}", apiClient.escapeString(cartonContentId.toString()));

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
   * Get a duplicated a cartonContent by id
   * Returns a duplicated cartonContent identified by the specified id.
   * @param cartonContentId Id of the cartonContent to be duplicated. (required)
   * @return CartonContent
   * @throws ApiException if fails to make API call
   */
  public CartonContent getDuplicateCartonContentById(Integer cartonContentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cartonContentId' is set
    if (cartonContentId == null) {
      throw new ApiException(400, "Missing the required parameter 'cartonContentId' when calling getDuplicateCartonContentById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonContent/duplicate/{cartonContentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonContentId" + "\\}", apiClient.escapeString(cartonContentId.toString()));

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

    
    GenericType<CartonContent> localVarReturnType = new GenericType<CartonContent>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a cartonContent
   * Updates an existing cartonContent using the specified data.
   * @param body CartonContent to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateCartonContent(CartonContent body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCartonContent");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonContent".replaceAll("\\{format\\}","json");

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
   * Update a cartonContent custom fields
   * Updates an existing cartonContent custom fields using the specified data.
   * @param body CartonContent to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateCartonContentCustomFields(CartonContent body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCartonContentCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/cartonContent/customFields".replaceAll("\\{format\\}","json");

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
