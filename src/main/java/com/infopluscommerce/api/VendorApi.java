package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Vendor;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class VendorApi {
  private ApiClient apiClient;

  public VendorApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VendorApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a vendor
   * Inserts a new vendor using the specified data.
   * @param body Vendor to be inserted. (required)
   * @return Vendor
   * @throws ApiException if fails to make API call
   */
  public Vendor addVendor(Vendor body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addVendor");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendor".replaceAll("\\{format\\}","json");

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

    
    GenericType<Vendor> localVarReturnType = new GenericType<Vendor>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a vendor
   * Adds an audit to an existing vendor.
   * @param vendorId Id of the vendor to add an audit to (required)
   * @param vendorAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addVendorAudit(Integer vendorId, String vendorAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vendorId' is set
    if (vendorId == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorId' when calling addVendorAudit");
    }
    
    // verify the required parameter 'vendorAudit' is set
    if (vendorAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorAudit' when calling addVendorAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendor/{vendorId}/audit/{vendorAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vendorId" + "\\}", apiClient.escapeString(vendorId.toString()))
      .replaceAll("\\{" + "vendorAudit" + "\\}", apiClient.escapeString(vendorAudit.toString()));

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
   * Add new tags for a vendor.
   * Adds a tag to an existing vendor.
   * @param vendorId Id of the vendor to add a tag to (required)
   * @param vendorTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addVendorTag(Integer vendorId, String vendorTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vendorId' is set
    if (vendorId == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorId' when calling addVendorTag");
    }
    
    // verify the required parameter 'vendorTag' is set
    if (vendorTag == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorTag' when calling addVendorTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendor/{vendorId}/tag/{vendorTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vendorId" + "\\}", apiClient.escapeString(vendorId.toString()))
      .replaceAll("\\{" + "vendorTag" + "\\}", apiClient.escapeString(vendorTag.toString()));

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
   * Delete a vendor
   * Deletes the vendor identified by the specified id.
   * @param vendorId Id of the vendor to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteVendor(Integer vendorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vendorId' is set
    if (vendorId == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorId' when calling deleteVendor");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendor/{vendorId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vendorId" + "\\}", apiClient.escapeString(vendorId.toString()));

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
   * Delete a tag for a vendor.
   * Deletes an existing vendor tag using the specified data.
   * @param vendorId Id of the vendor to remove tag from (required)
   * @param vendorTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteVendorTag(Integer vendorId, String vendorTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vendorId' is set
    if (vendorId == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorId' when calling deleteVendorTag");
    }
    
    // verify the required parameter 'vendorTag' is set
    if (vendorTag == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorTag' when calling deleteVendorTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendor/{vendorId}/tag/{vendorTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vendorId" + "\\}", apiClient.escapeString(vendorId.toString()))
      .replaceAll("\\{" + "vendorTag" + "\\}", apiClient.escapeString(vendorTag.toString()));

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
   * Get a duplicated a vendor by id
   * Returns a duplicated vendor identified by the specified id.
   * @param vendorId Id of the vendor to be duplicated. (required)
   * @return Vendor
   * @throws ApiException if fails to make API call
   */
  public Vendor getDuplicateVendorById(Integer vendorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vendorId' is set
    if (vendorId == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorId' when calling getDuplicateVendorById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendor/duplicate/{vendorId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vendorId" + "\\}", apiClient.escapeString(vendorId.toString()));

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

    
    GenericType<Vendor> localVarReturnType = new GenericType<Vendor>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search vendors by filter
   * Returns the list of vendors that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<Vendor>
   * @throws ApiException if fails to make API call
   */
  public List<Vendor> getVendorByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/vendor/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Vendor>> localVarReturnType = new GenericType<List<Vendor>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a vendor by id
   * Returns the vendor identified by the specified id.
   * @param vendorId Id of the vendor to be returned. (required)
   * @return Vendor
   * @throws ApiException if fails to make API call
   */
  public Vendor getVendorById(Integer vendorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vendorId' is set
    if (vendorId == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorId' when calling getVendorById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendor/{vendorId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vendorId" + "\\}", apiClient.escapeString(vendorId.toString()));

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

    
    GenericType<Vendor> localVarReturnType = new GenericType<Vendor>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a vendor.
   * Get all existing vendor tags.
   * @param vendorId Id of the vendor to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getVendorTags(Integer vendorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vendorId' is set
    if (vendorId == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorId' when calling getVendorTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendor/{vendorId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vendorId" + "\\}", apiClient.escapeString(vendorId.toString()));

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
   * Update a vendor
   * Updates an existing vendor using the specified data.
   * @param body Vendor to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateVendor(Vendor body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateVendor");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendor".replaceAll("\\{format\\}","json");

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
   * Update a vendor custom fields
   * Updates an existing vendor custom fields using the specified data.
   * @param body Vendor to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateVendorCustomFields(Vendor body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateVendorCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendor/customFields".replaceAll("\\{format\\}","json");

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
