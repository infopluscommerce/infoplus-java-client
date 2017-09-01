package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.ApiResponse;
import com.infopluscommerce.model.VendorComplianceSurvey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class VendorComplianceSurveyApi {
  private ApiClient apiClient;

  public VendorComplianceSurveyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VendorComplianceSurveyApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a vendorComplianceSurvey
   * Inserts a new vendorComplianceSurvey using the specified data.
   * @param body VendorComplianceSurvey to be inserted. (required)
   * @return VendorComplianceSurvey
   * @throws ApiException if fails to make API call
   */
  public VendorComplianceSurvey addVendorComplianceSurvey(VendorComplianceSurvey body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addVendorComplianceSurvey");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendorComplianceSurvey".replaceAll("\\{format\\}","json");

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

    
    GenericType<VendorComplianceSurvey> localVarReturnType = new GenericType<VendorComplianceSurvey>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a vendorComplianceSurvey
   * Adds an audit to an existing vendorComplianceSurvey.
   * @param vendorComplianceSurveyId Id of the vendorComplianceSurvey to add an audit to (required)
   * @param vendorComplianceSurveyAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addVendorComplianceSurveyAudit(Integer vendorComplianceSurveyId, String vendorComplianceSurveyAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vendorComplianceSurveyId' is set
    if (vendorComplianceSurveyId == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorComplianceSurveyId' when calling addVendorComplianceSurveyAudit");
    }
    
    // verify the required parameter 'vendorComplianceSurveyAudit' is set
    if (vendorComplianceSurveyAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorComplianceSurveyAudit' when calling addVendorComplianceSurveyAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendorComplianceSurvey/{vendorComplianceSurveyId}/audit/{vendorComplianceSurveyAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vendorComplianceSurveyId" + "\\}", apiClient.escapeString(vendorComplianceSurveyId.toString()))
      .replaceAll("\\{" + "vendorComplianceSurveyAudit" + "\\}", apiClient.escapeString(vendorComplianceSurveyAudit.toString()));

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
   * Add new tags for a vendorComplianceSurvey.
   * Adds a tag to an existing vendorComplianceSurvey.
   * @param vendorComplianceSurveyId Id of the vendorComplianceSurvey to add a tag to (required)
   * @param vendorComplianceSurveyTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addVendorComplianceSurveyTag(Integer vendorComplianceSurveyId, String vendorComplianceSurveyTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vendorComplianceSurveyId' is set
    if (vendorComplianceSurveyId == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorComplianceSurveyId' when calling addVendorComplianceSurveyTag");
    }
    
    // verify the required parameter 'vendorComplianceSurveyTag' is set
    if (vendorComplianceSurveyTag == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorComplianceSurveyTag' when calling addVendorComplianceSurveyTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendorComplianceSurvey/{vendorComplianceSurveyId}/tag/{vendorComplianceSurveyTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vendorComplianceSurveyId" + "\\}", apiClient.escapeString(vendorComplianceSurveyId.toString()))
      .replaceAll("\\{" + "vendorComplianceSurveyTag" + "\\}", apiClient.escapeString(vendorComplianceSurveyTag.toString()));

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
   * Delete a vendorComplianceSurvey
   * Deletes the vendorComplianceSurvey identified by the specified id.
   * @param vendorComplianceSurveyId Id of the vendorComplianceSurvey to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteVendorComplianceSurvey(Integer vendorComplianceSurveyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vendorComplianceSurveyId' is set
    if (vendorComplianceSurveyId == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorComplianceSurveyId' when calling deleteVendorComplianceSurvey");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendorComplianceSurvey/{vendorComplianceSurveyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vendorComplianceSurveyId" + "\\}", apiClient.escapeString(vendorComplianceSurveyId.toString()));

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
   * Delete a tag for a vendorComplianceSurvey.
   * Deletes an existing vendorComplianceSurvey tag using the specified data.
   * @param vendorComplianceSurveyId Id of the vendorComplianceSurvey to remove tag from (required)
   * @param vendorComplianceSurveyTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteVendorComplianceSurveyTag(Integer vendorComplianceSurveyId, String vendorComplianceSurveyTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vendorComplianceSurveyId' is set
    if (vendorComplianceSurveyId == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorComplianceSurveyId' when calling deleteVendorComplianceSurveyTag");
    }
    
    // verify the required parameter 'vendorComplianceSurveyTag' is set
    if (vendorComplianceSurveyTag == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorComplianceSurveyTag' when calling deleteVendorComplianceSurveyTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendorComplianceSurvey/{vendorComplianceSurveyId}/tag/{vendorComplianceSurveyTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vendorComplianceSurveyId" + "\\}", apiClient.escapeString(vendorComplianceSurveyId.toString()))
      .replaceAll("\\{" + "vendorComplianceSurveyTag" + "\\}", apiClient.escapeString(vendorComplianceSurveyTag.toString()));

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
   * Get a duplicated a vendorComplianceSurvey by id
   * Returns a duplicated vendorComplianceSurvey identified by the specified id.
   * @param vendorComplianceSurveyId Id of the vendorComplianceSurvey to be duplicated. (required)
   * @return VendorComplianceSurvey
   * @throws ApiException if fails to make API call
   */
  public VendorComplianceSurvey getDuplicateVendorComplianceSurveyById(Integer vendorComplianceSurveyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vendorComplianceSurveyId' is set
    if (vendorComplianceSurveyId == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorComplianceSurveyId' when calling getDuplicateVendorComplianceSurveyById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendorComplianceSurvey/duplicate/{vendorComplianceSurveyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vendorComplianceSurveyId" + "\\}", apiClient.escapeString(vendorComplianceSurveyId.toString()));

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

    
    GenericType<VendorComplianceSurvey> localVarReturnType = new GenericType<VendorComplianceSurvey>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search vendorComplianceSurveys by filter
   * Returns the list of vendorComplianceSurveys that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<VendorComplianceSurvey>
   * @throws ApiException if fails to make API call
   */
  public List<VendorComplianceSurvey> getVendorComplianceSurveyByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/vendorComplianceSurvey/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<VendorComplianceSurvey>> localVarReturnType = new GenericType<List<VendorComplianceSurvey>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a vendorComplianceSurvey by id
   * Returns the vendorComplianceSurvey identified by the specified id.
   * @param vendorComplianceSurveyId Id of the vendorComplianceSurvey to be returned. (required)
   * @return VendorComplianceSurvey
   * @throws ApiException if fails to make API call
   */
  public VendorComplianceSurvey getVendorComplianceSurveyById(Integer vendorComplianceSurveyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vendorComplianceSurveyId' is set
    if (vendorComplianceSurveyId == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorComplianceSurveyId' when calling getVendorComplianceSurveyById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendorComplianceSurvey/{vendorComplianceSurveyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vendorComplianceSurveyId" + "\\}", apiClient.escapeString(vendorComplianceSurveyId.toString()));

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

    
    GenericType<VendorComplianceSurvey> localVarReturnType = new GenericType<VendorComplianceSurvey>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a vendorComplianceSurvey.
   * Get all existing vendorComplianceSurvey tags.
   * @param vendorComplianceSurveyId Id of the vendorComplianceSurvey to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getVendorComplianceSurveyTags(Integer vendorComplianceSurveyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vendorComplianceSurveyId' is set
    if (vendorComplianceSurveyId == null) {
      throw new ApiException(400, "Missing the required parameter 'vendorComplianceSurveyId' when calling getVendorComplianceSurveyTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendorComplianceSurvey/{vendorComplianceSurveyId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vendorComplianceSurveyId" + "\\}", apiClient.escapeString(vendorComplianceSurveyId.toString()));

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
   * Update a vendorComplianceSurvey
   * Updates an existing vendorComplianceSurvey using the specified data.
   * @param body VendorComplianceSurvey to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateVendorComplianceSurvey(VendorComplianceSurvey body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateVendorComplianceSurvey");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendorComplianceSurvey".replaceAll("\\{format\\}","json");

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
   * Update a vendorComplianceSurvey custom fields
   * Updates an existing vendorComplianceSurvey custom fields using the specified data.
   * @param body VendorComplianceSurvey to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateVendorComplianceSurveyCustomFields(VendorComplianceSurvey body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateVendorComplianceSurveyCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/vendorComplianceSurvey/customFields".replaceAll("\\{format\\}","json");

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
