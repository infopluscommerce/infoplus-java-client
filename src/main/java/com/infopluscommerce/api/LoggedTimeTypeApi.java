package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.LoggedTimeType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T15:40:30.367-05:00")
public class LoggedTimeTypeApi {
  private ApiClient apiClient;

  public LoggedTimeTypeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LoggedTimeTypeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get a loggedTimeType by id
   * Returns the loggedTimeType identified by the specified id.
   * @param loggedTimeTypeId Id of loggedTimeType to be returned. (required)
   * @return LoggedTimeType
   * @throws ApiException if fails to make API call
   */
  public LoggedTimeType getLoggedTimeTypeById(String loggedTimeTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'loggedTimeTypeId' is set
    if (loggedTimeTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'loggedTimeTypeId' when calling getLoggedTimeTypeById");
    }
    
    // create path and map variables
    String localVarPath = "/v1.0/loggedTimeType/{loggedTimeTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "loggedTimeTypeId" + "\\}", apiClient.escapeString(loggedTimeTypeId.toString()));

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

    
    GenericType<LoggedTimeType> localVarReturnType = new GenericType<LoggedTimeType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search loggedTimeTypes
   * Returns the list of loggedTimeTypes that match the given searchText.
   * @param searchText Search text, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @return List<LoggedTimeType>
   * @throws ApiException if fails to make API call
   */
  public List<LoggedTimeType> getLoggedTimeTypeBySearchText(String searchText, Integer page, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1.0/loggedTimeType/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchText", searchText));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    
    GenericType<List<LoggedTimeType>> localVarReturnType = new GenericType<List<LoggedTimeType>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
