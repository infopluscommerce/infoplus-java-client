package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Shipment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class ShipmentApi {
  private ApiClient apiClient;

  public ShipmentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ShipmentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a shipment
   * Adds an audit to an existing shipment.
   * @param shipmentId Id of the shipment to add an audit to (required)
   * @param shipmentAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addShipmentAudit(Integer shipmentId, String shipmentAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipmentId' is set
    if (shipmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'shipmentId' when calling addShipmentAudit");
    }
    
    // verify the required parameter 'shipmentAudit' is set
    if (shipmentAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'shipmentAudit' when calling addShipmentAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shipment/{shipmentId}/audit/{shipmentAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()))
      .replaceAll("\\{" + "shipmentAudit" + "\\}", apiClient.escapeString(shipmentAudit.toString()));

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
   * Add new tags for a shipment.
   * Adds a tag to an existing shipment.
   * @param shipmentId Id of the shipment to add a tag to (required)
   * @param shipmentTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addShipmentTag(Integer shipmentId, String shipmentTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipmentId' is set
    if (shipmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'shipmentId' when calling addShipmentTag");
    }
    
    // verify the required parameter 'shipmentTag' is set
    if (shipmentTag == null) {
      throw new ApiException(400, "Missing the required parameter 'shipmentTag' when calling addShipmentTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shipment/{shipmentId}/tag/{shipmentTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()))
      .replaceAll("\\{" + "shipmentTag" + "\\}", apiClient.escapeString(shipmentTag.toString()));

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
   * Delete a tag for a shipment.
   * Deletes an existing shipment tag using the specified data.
   * @param shipmentId Id of the shipment to remove tag from (required)
   * @param shipmentTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteShipmentTag(Integer shipmentId, String shipmentTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipmentId' is set
    if (shipmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'shipmentId' when calling deleteShipmentTag");
    }
    
    // verify the required parameter 'shipmentTag' is set
    if (shipmentTag == null) {
      throw new ApiException(400, "Missing the required parameter 'shipmentTag' when calling deleteShipmentTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shipment/{shipmentId}/tag/{shipmentTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()))
      .replaceAll("\\{" + "shipmentTag" + "\\}", apiClient.escapeString(shipmentTag.toString()));

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
   * Get a duplicated a shipment by id
   * Returns a duplicated shipment identified by the specified id.
   * @param shipmentId Id of the shipment to be duplicated. (required)
   * @return Shipment
   * @throws ApiException if fails to make API call
   */
  public Shipment getDuplicateShipmentById(Integer shipmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipmentId' is set
    if (shipmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'shipmentId' when calling getDuplicateShipmentById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shipment/duplicate/{shipmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));

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

    
    GenericType<Shipment> localVarReturnType = new GenericType<Shipment>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search shipments by filter
   * Returns the list of shipments that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<Shipment>
   * @throws ApiException if fails to make API call
   */
  public List<Shipment> getShipmentByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/shipment/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Shipment>> localVarReturnType = new GenericType<List<Shipment>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a shipment by id
   * Returns the shipment identified by the specified id.
   * @param shipmentId Id of the shipment to be returned. (required)
   * @return Shipment
   * @throws ApiException if fails to make API call
   */
  public Shipment getShipmentById(Integer shipmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipmentId' is set
    if (shipmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'shipmentId' when calling getShipmentById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shipment/{shipmentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));

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

    
    GenericType<Shipment> localVarReturnType = new GenericType<Shipment>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a shipment.
   * Get all existing shipment tags.
   * @param shipmentId Id of the shipment to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getShipmentTags(Integer shipmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'shipmentId' is set
    if (shipmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'shipmentId' when calling getShipmentTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shipment/{shipmentId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));

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
   * Update a shipment custom fields
   * Updates an existing shipment custom fields using the specified data.
   * @param body Shipment to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateShipmentCustomFields(Shipment body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateShipmentCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/shipment/customFields".replaceAll("\\{format\\}","json");

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
