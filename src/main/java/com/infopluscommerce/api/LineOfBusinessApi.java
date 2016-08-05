package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.LineOfBusiness;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-04T22:56:01.104-05:00")
public class LineOfBusinessApi {
  private ApiClient apiClient;

  public LineOfBusinessApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LineOfBusinessApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get a lineOfBusiness by id
   * Returns the lineOfBusiness identified by the specified id.
   * @param lineOfBusinessId Id of lineOfBusiness to be returned. (required)
   * @return LineOfBusiness
   * @throws ApiException if fails to make API call
   */
  public LineOfBusiness getLineOfBusinessById(String lineOfBusinessId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'lineOfBusinessId' is set
    if (lineOfBusinessId == null) {
      throw new ApiException(400, "Missing the required parameter 'lineOfBusinessId' when calling getLineOfBusinessById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/lineOfBusiness/{lineOfBusinessId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "lineOfBusinessId" + "\\}", apiClient.escapeString(lineOfBusinessId.toString()));

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

    
    GenericType<LineOfBusiness> localVarReturnType = new GenericType<LineOfBusiness>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search lineOfBusinesses
   * Returns the list of lineOfBusinesses that match the given searchText.
   * @param searchText Search text, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @return List<LineOfBusiness>
   * @throws ApiException if fails to make API call
   */
  public List<LineOfBusiness> getLineOfBusinessBySearchText(String searchText, Integer page, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/lineOfBusiness/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<LineOfBusiness>> localVarReturnType = new GenericType<List<LineOfBusiness>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
