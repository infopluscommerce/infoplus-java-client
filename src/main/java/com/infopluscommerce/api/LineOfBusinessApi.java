package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.LineOfBusiness;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
   * Search lineOfBusinesses
   * Returns the list of lineOfBusinesses that match the given searchText.
   * @param searchText Search text, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @return List<LineOfBusiness>
   */
  public List<LineOfBusiness> getLineOfBusinessBySearchText(String searchText, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/lineOfBusiness/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "searchText", searchText));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<List<LineOfBusiness>> returnType = new GenericType<List<LineOfBusiness>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a lineOfBusiness by id
   * Returns the lineOfBusiness identified by the specified id.
   * @param lineOfBusinessId Id of lineOfBusiness to be returned.
   * @return LineOfBusiness
   */
  public LineOfBusiness getLineOfBusinessById(String lineOfBusinessId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'lineOfBusinessId' is set
     if (lineOfBusinessId == null) {
        throw new ApiException(400, "Missing the required parameter 'lineOfBusinessId' when calling getLineOfBusinessById");
     }
     
    // create path and map variables
    String path = "/v1.0/lineOfBusiness/{lineOfBusinessId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "lineOfBusinessId" + "\\}", apiClient.escapeString(lineOfBusinessId.toString()));

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

    
    GenericType<LineOfBusiness> returnType = new GenericType<LineOfBusiness>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
