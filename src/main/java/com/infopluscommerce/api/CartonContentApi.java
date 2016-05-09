package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.CartonContent;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
   * Update a cartonContent
   * Updates an existing cartonContent using the specified data.
   * @param body CartonContent to be updated.
   * @return void
   */
  public void updateCartonContent(CartonContent body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateCartonContent");
     }
     
    // create path and map variables
    String path = "/v1.0/cartonContent".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Create a cartonContent
   * Inserts a new cartonContent using the specified data.
   * @param body CartonContent to be inserted.
   * @return CartonContent
   */
  public CartonContent addCartonContent(CartonContent body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addCartonContent");
     }
     
    // create path and map variables
    String path = "/v1.0/cartonContent".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<CartonContent> returnType = new GenericType<CartonContent>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search cartonContents by filter
   * Returns the list of cartonContents that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<CartonContent>
   */
  public List<CartonContent> getCartonContentByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/cartonContent/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<List<CartonContent>> returnType = new GenericType<List<CartonContent>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a cartonContent by id
   * Returns the cartonContent identified by the specified id.
   * @param cartonContentId Id of the cartonContent to be returned.
   * @return CartonContent
   */
  public CartonContent getCartonContentById(Integer cartonContentId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'cartonContentId' is set
     if (cartonContentId == null) {
        throw new ApiException(400, "Missing the required parameter 'cartonContentId' when calling getCartonContentById");
     }
     
    // create path and map variables
    String path = "/v1.0/cartonContent/{cartonContentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonContentId" + "\\}", apiClient.escapeString(cartonContentId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<CartonContent> returnType = new GenericType<CartonContent>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a cartonContent
   * Deletes the cartonContent identified by the specified id.
   * @param cartonContentId Id of the cartonContent to be deleted.
   * @return void
   */
  public void deleteCartonContent(Integer cartonContentId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'cartonContentId' is set
     if (cartonContentId == null) {
        throw new ApiException(400, "Missing the required parameter 'cartonContentId' when calling deleteCartonContent");
     }
     
    // create path and map variables
    String path = "/v1.0/cartonContent/{cartonContentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cartonContentId" + "\\}", apiClient.escapeString(cartonContentId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
}
