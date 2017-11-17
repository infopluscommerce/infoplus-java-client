package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.CustomerInvoiceTemplate;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class CustomerInvoiceTemplateApi {
  private ApiClient apiClient;

  public CustomerInvoiceTemplateApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomerInvoiceTemplateApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a customerInvoiceTemplate
   * Inserts a new customerInvoiceTemplate using the specified data.
   * @param body CustomerInvoiceTemplate to be inserted. (required)
   * @return CustomerInvoiceTemplate
   * @throws ApiException if fails to make API call
   */
  public CustomerInvoiceTemplate addCustomerInvoiceTemplate(CustomerInvoiceTemplate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addCustomerInvoiceTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplate".replaceAll("\\{format\\}","json");

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

    
    GenericType<CustomerInvoiceTemplate> localVarReturnType = new GenericType<CustomerInvoiceTemplate>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for a customerInvoiceTemplate
   * Adds an audit to an existing customerInvoiceTemplate.
   * @param customerInvoiceTemplateId Id of the customerInvoiceTemplate to add an audit to (required)
   * @param customerInvoiceTemplateAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addCustomerInvoiceTemplateAudit(Integer customerInvoiceTemplateId, String customerInvoiceTemplateAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customerInvoiceTemplateId' is set
    if (customerInvoiceTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateId' when calling addCustomerInvoiceTemplateAudit");
    }
    
    // verify the required parameter 'customerInvoiceTemplateAudit' is set
    if (customerInvoiceTemplateAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateAudit' when calling addCustomerInvoiceTemplateAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/audit/{customerInvoiceTemplateAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerInvoiceTemplateId" + "\\}", apiClient.escapeString(customerInvoiceTemplateId.toString()))
      .replaceAll("\\{" + "customerInvoiceTemplateAudit" + "\\}", apiClient.escapeString(customerInvoiceTemplateAudit.toString()));

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
   * Add new tags for a customerInvoiceTemplate.
   * Adds a tag to an existing customerInvoiceTemplate.
   * @param customerInvoiceTemplateId Id of the customerInvoiceTemplate to add a tag to (required)
   * @param customerInvoiceTemplateTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addCustomerInvoiceTemplateTag(Integer customerInvoiceTemplateId, String customerInvoiceTemplateTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customerInvoiceTemplateId' is set
    if (customerInvoiceTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateId' when calling addCustomerInvoiceTemplateTag");
    }
    
    // verify the required parameter 'customerInvoiceTemplateTag' is set
    if (customerInvoiceTemplateTag == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateTag' when calling addCustomerInvoiceTemplateTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/tag/{customerInvoiceTemplateTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerInvoiceTemplateId" + "\\}", apiClient.escapeString(customerInvoiceTemplateId.toString()))
      .replaceAll("\\{" + "customerInvoiceTemplateTag" + "\\}", apiClient.escapeString(customerInvoiceTemplateTag.toString()));

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
   * Delete a customerInvoiceTemplate
   * Deletes the customerInvoiceTemplate identified by the specified id.
   * @param customerInvoiceTemplateId Id of the customerInvoiceTemplate to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCustomerInvoiceTemplate(Integer customerInvoiceTemplateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customerInvoiceTemplateId' is set
    if (customerInvoiceTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateId' when calling deleteCustomerInvoiceTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplate/{customerInvoiceTemplateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerInvoiceTemplateId" + "\\}", apiClient.escapeString(customerInvoiceTemplateId.toString()));

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
   * Delete a tag for a customerInvoiceTemplate.
   * Deletes an existing customerInvoiceTemplate tag using the specified data.
   * @param customerInvoiceTemplateId Id of the customerInvoiceTemplate to remove tag from (required)
   * @param customerInvoiceTemplateTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCustomerInvoiceTemplateTag(Integer customerInvoiceTemplateId, String customerInvoiceTemplateTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customerInvoiceTemplateId' is set
    if (customerInvoiceTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateId' when calling deleteCustomerInvoiceTemplateTag");
    }
    
    // verify the required parameter 'customerInvoiceTemplateTag' is set
    if (customerInvoiceTemplateTag == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateTag' when calling deleteCustomerInvoiceTemplateTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/tag/{customerInvoiceTemplateTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerInvoiceTemplateId" + "\\}", apiClient.escapeString(customerInvoiceTemplateId.toString()))
      .replaceAll("\\{" + "customerInvoiceTemplateTag" + "\\}", apiClient.escapeString(customerInvoiceTemplateTag.toString()));

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
   * Search customerInvoiceTemplates by filter
   * Returns the list of customerInvoiceTemplates that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<CustomerInvoiceTemplate>
   * @throws ApiException if fails to make API call
   */
  public List<CustomerInvoiceTemplate> getCustomerInvoiceTemplateByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplate/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<CustomerInvoiceTemplate>> localVarReturnType = new GenericType<List<CustomerInvoiceTemplate>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a customerInvoiceTemplate by id
   * Returns the customerInvoiceTemplate identified by the specified id.
   * @param customerInvoiceTemplateId Id of the customerInvoiceTemplate to be returned. (required)
   * @return CustomerInvoiceTemplate
   * @throws ApiException if fails to make API call
   */
  public CustomerInvoiceTemplate getCustomerInvoiceTemplateById(Integer customerInvoiceTemplateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customerInvoiceTemplateId' is set
    if (customerInvoiceTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateId' when calling getCustomerInvoiceTemplateById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplate/{customerInvoiceTemplateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerInvoiceTemplateId" + "\\}", apiClient.escapeString(customerInvoiceTemplateId.toString()));

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

    
    GenericType<CustomerInvoiceTemplate> localVarReturnType = new GenericType<CustomerInvoiceTemplate>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a customerInvoiceTemplate.
   * Get all existing customerInvoiceTemplate tags.
   * @param customerInvoiceTemplateId Id of the customerInvoiceTemplate to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getCustomerInvoiceTemplateTags(Integer customerInvoiceTemplateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customerInvoiceTemplateId' is set
    if (customerInvoiceTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateId' when calling getCustomerInvoiceTemplateTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerInvoiceTemplateId" + "\\}", apiClient.escapeString(customerInvoiceTemplateId.toString()));

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
   * Get a duplicated a customerInvoiceTemplate by id
   * Returns a duplicated customerInvoiceTemplate identified by the specified id.
   * @param customerInvoiceTemplateId Id of the customerInvoiceTemplate to be duplicated. (required)
   * @return CustomerInvoiceTemplate
   * @throws ApiException if fails to make API call
   */
  public CustomerInvoiceTemplate getDuplicateCustomerInvoiceTemplateById(Integer customerInvoiceTemplateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customerInvoiceTemplateId' is set
    if (customerInvoiceTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateId' when calling getDuplicateCustomerInvoiceTemplateById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplate/duplicate/{customerInvoiceTemplateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerInvoiceTemplateId" + "\\}", apiClient.escapeString(customerInvoiceTemplateId.toString()));

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

    
    GenericType<CustomerInvoiceTemplate> localVarReturnType = new GenericType<CustomerInvoiceTemplate>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a customerInvoiceTemplate
   * Updates an existing customerInvoiceTemplate using the specified data.
   * @param body CustomerInvoiceTemplate to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateCustomerInvoiceTemplate(CustomerInvoiceTemplate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCustomerInvoiceTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplate".replaceAll("\\{format\\}","json");

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
