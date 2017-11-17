package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ProductionLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
public class ProductionLotApi {
  private ApiClient apiClient;

  public ProductionLotApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProductionLotApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get a duplicated a productionLot by id
   * Returns a duplicated productionLot identified by the specified id.
   * @param productionLotId Id of the productionLot to be duplicated. (required)
   * @return ProductionLot
   * @throws ApiException if fails to make API call
   */
  public ProductionLot getDuplicateProductionLotById(Integer productionLotId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productionLotId' is set
    if (productionLotId == null) {
      throw new ApiException(400, "Missing the required parameter 'productionLotId' when calling getDuplicateProductionLotById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/productionLot/duplicate/{productionLotId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "productionLotId" + "\\}", apiClient.escapeString(productionLotId.toString()));

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

    
    GenericType<ProductionLot> localVarReturnType = new GenericType<ProductionLot>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search productionLots by filter
   * Returns the list of productionLots that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<ProductionLot>
   * @throws ApiException if fails to make API call
   */
  public List<ProductionLot> getProductionLotByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2.0/productionLot/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<ProductionLot>> localVarReturnType = new GenericType<List<ProductionLot>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a productionLot by id
   * Returns the productionLot identified by the specified id.
   * @param productionLotId Id of the productionLot to be returned. (required)
   * @return ProductionLot
   * @throws ApiException if fails to make API call
   */
  public ProductionLot getProductionLotById(Integer productionLotId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productionLotId' is set
    if (productionLotId == null) {
      throw new ApiException(400, "Missing the required parameter 'productionLotId' when calling getProductionLotById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/productionLot/{productionLotId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "productionLotId" + "\\}", apiClient.escapeString(productionLotId.toString()));

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

    
    GenericType<ProductionLot> localVarReturnType = new GenericType<ProductionLot>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a productionLot custom fields
   * Updates an existing productionLot custom fields using the specified data.
   * @param body ProductionLot to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateProductionLotCustomFields(ProductionLot body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateProductionLotCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.0/productionLot/customFields".replaceAll("\\{format\\}","json");

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
