package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ProductionLot;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
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
   * Create a productionLot
   * Inserts a new productionLot using the specified data.
   * @param body ProductionLot to be inserted. (required)
   * @return ProductionLot
   * @throws ApiException if fails to make API call
   */
  public ProductionLot addProductionLot(ProductionLot body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addProductionLot");
    }
    
    // create path and map variables
    String localVarPath = "/beta/productionLot".replaceAll("\\{format\\}","json");

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

    
    GenericType<ProductionLot> localVarReturnType = new GenericType<ProductionLot>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a productionLot
   * Adds an audit to an existing productionLot.
   * @param productionLotId Id of the productionLot to add an audit to (required)
   * @param productionLotAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addProductionLotAudit(Integer productionLotId, String productionLotAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productionLotId' is set
    if (productionLotId == null) {
      throw new ApiException(400, "Missing the required parameter 'productionLotId' when calling addProductionLotAudit");
    }
    
    // verify the required parameter 'productionLotAudit' is set
    if (productionLotAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'productionLotAudit' when calling addProductionLotAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/productionLot/{productionLotId}/audit/{productionLotAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "productionLotId" + "\\}", apiClient.escapeString(productionLotId.toString()))
      .replaceAll("\\{" + "productionLotAudit" + "\\}", apiClient.escapeString(productionLotAudit.toString()));

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
   * Add new tags for a productionLot.
   * Adds a tag to an existing productionLot.
   * @param productionLotId Id of the productionLot to add a tag to (required)
   * @param productionLotTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addProductionLotTag(Integer productionLotId, String productionLotTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productionLotId' is set
    if (productionLotId == null) {
      throw new ApiException(400, "Missing the required parameter 'productionLotId' when calling addProductionLotTag");
    }
    
    // verify the required parameter 'productionLotTag' is set
    if (productionLotTag == null) {
      throw new ApiException(400, "Missing the required parameter 'productionLotTag' when calling addProductionLotTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/productionLot/{productionLotId}/tag/{productionLotTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "productionLotId" + "\\}", apiClient.escapeString(productionLotId.toString()))
      .replaceAll("\\{" + "productionLotTag" + "\\}", apiClient.escapeString(productionLotTag.toString()));

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
   * Delete a productionLot
   * Deletes the productionLot identified by the specified id.
   * @param productionLotId Id of the productionLot to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteProductionLot(Integer productionLotId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productionLotId' is set
    if (productionLotId == null) {
      throw new ApiException(400, "Missing the required parameter 'productionLotId' when calling deleteProductionLot");
    }
    
    // create path and map variables
    String localVarPath = "/beta/productionLot/{productionLotId}".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete a tag for a productionLot.
   * Deletes an existing productionLot tag using the specified data.
   * @param productionLotId Id of the productionLot to remove tag from (required)
   * @param productionLotTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteProductionLotTag(Integer productionLotId, String productionLotTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productionLotId' is set
    if (productionLotId == null) {
      throw new ApiException(400, "Missing the required parameter 'productionLotId' when calling deleteProductionLotTag");
    }
    
    // verify the required parameter 'productionLotTag' is set
    if (productionLotTag == null) {
      throw new ApiException(400, "Missing the required parameter 'productionLotTag' when calling deleteProductionLotTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/productionLot/{productionLotId}/tag/{productionLotTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "productionLotId" + "\\}", apiClient.escapeString(productionLotId.toString()))
      .replaceAll("\\{" + "productionLotTag" + "\\}", apiClient.escapeString(productionLotTag.toString()));

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
    String localVarPath = "/beta/productionLot/duplicate/{productionLotId}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/beta/productionLot/search".replaceAll("\\{format\\}","json");

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
    String localVarPath = "/beta/productionLot/{productionLotId}".replaceAll("\\{format\\}","json")
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
   * Get the tags for a productionLot.
   * Get all existing productionLot tags.
   * @param productionLotId Id of the productionLot to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getProductionLotTags(Integer productionLotId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productionLotId' is set
    if (productionLotId == null) {
      throw new ApiException(400, "Missing the required parameter 'productionLotId' when calling getProductionLotTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/productionLot/{productionLotId}/tag".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Update a productionLot
   * Updates an existing productionLot using the specified data.
   * @param body ProductionLot to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateProductionLot(ProductionLot body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateProductionLot");
    }
    
    // create path and map variables
    String localVarPath = "/beta/productionLot".replaceAll("\\{format\\}","json");

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
    String localVarPath = "/beta/productionLot/customFields".replaceAll("\\{format\\}","json");

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
