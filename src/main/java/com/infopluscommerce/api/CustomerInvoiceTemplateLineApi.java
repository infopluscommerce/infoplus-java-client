package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.CustomerInvoiceTemplateLine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class CustomerInvoiceTemplateLineApi {
  private ApiClient apiClient;

  public CustomerInvoiceTemplateLineApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomerInvoiceTemplateLineApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add new audit for a customerInvoiceTemplateLine
   * Adds an audit to an existing customerInvoiceTemplateLine.
   * @param customerInvoiceTemplateLineId Id of the customerInvoiceTemplateLine to add an audit to (required)
   * @param customerInvoiceTemplateLineAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addCustomerInvoiceTemplateLineAudit(Integer customerInvoiceTemplateLineId, String customerInvoiceTemplateLineAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customerInvoiceTemplateLineId' is set
    if (customerInvoiceTemplateLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateLineId' when calling addCustomerInvoiceTemplateLineAudit");
    }
    
    // verify the required parameter 'customerInvoiceTemplateLineAudit' is set
    if (customerInvoiceTemplateLineAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateLineAudit' when calling addCustomerInvoiceTemplateLineAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/audit/{customerInvoiceTemplateLineAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerInvoiceTemplateLineId" + "\\}", apiClient.escapeString(customerInvoiceTemplateLineId.toString()))
      .replaceAll("\\{" + "customerInvoiceTemplateLineAudit" + "\\}", apiClient.escapeString(customerInvoiceTemplateLineAudit.toString()));

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
   * Add new tags for a customerInvoiceTemplateLine.
   * Adds a tag to an existing customerInvoiceTemplateLine.
   * @param customerInvoiceTemplateLineId Id of the customerInvoiceTemplateLine to add a tag to (required)
   * @param customerInvoiceTemplateLineTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addCustomerInvoiceTemplateLineTag(Integer customerInvoiceTemplateLineId, String customerInvoiceTemplateLineTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customerInvoiceTemplateLineId' is set
    if (customerInvoiceTemplateLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateLineId' when calling addCustomerInvoiceTemplateLineTag");
    }
    
    // verify the required parameter 'customerInvoiceTemplateLineTag' is set
    if (customerInvoiceTemplateLineTag == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateLineTag' when calling addCustomerInvoiceTemplateLineTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/tag/{customerInvoiceTemplateLineTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerInvoiceTemplateLineId" + "\\}", apiClient.escapeString(customerInvoiceTemplateLineId.toString()))
      .replaceAll("\\{" + "customerInvoiceTemplateLineTag" + "\\}", apiClient.escapeString(customerInvoiceTemplateLineTag.toString()));

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
   * Delete a customerInvoiceTemplateLine
   * Deletes the customerInvoiceTemplateLine identified by the specified id.
   * @param customerInvoiceTemplateLineId Id of the customerInvoiceTemplateLine to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCustomerInvoiceTemplateLine(Integer customerInvoiceTemplateLineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customerInvoiceTemplateLineId' is set
    if (customerInvoiceTemplateLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateLineId' when calling deleteCustomerInvoiceTemplateLine");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerInvoiceTemplateLineId" + "\\}", apiClient.escapeString(customerInvoiceTemplateLineId.toString()));

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
   * Delete a tag for a customerInvoiceTemplateLine.
   * Deletes an existing customerInvoiceTemplateLine tag using the specified data.
   * @param customerInvoiceTemplateLineId Id of the customerInvoiceTemplateLine to remove tag from (required)
   * @param customerInvoiceTemplateLineTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCustomerInvoiceTemplateLineTag(Integer customerInvoiceTemplateLineId, String customerInvoiceTemplateLineTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customerInvoiceTemplateLineId' is set
    if (customerInvoiceTemplateLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateLineId' when calling deleteCustomerInvoiceTemplateLineTag");
    }
    
    // verify the required parameter 'customerInvoiceTemplateLineTag' is set
    if (customerInvoiceTemplateLineTag == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateLineTag' when calling deleteCustomerInvoiceTemplateLineTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/tag/{customerInvoiceTemplateLineTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerInvoiceTemplateLineId" + "\\}", apiClient.escapeString(customerInvoiceTemplateLineId.toString()))
      .replaceAll("\\{" + "customerInvoiceTemplateLineTag" + "\\}", apiClient.escapeString(customerInvoiceTemplateLineTag.toString()));

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
   * Search customerInvoiceTemplateLines by filter
   * Returns the list of customerInvoiceTemplateLines that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<CustomerInvoiceTemplateLine>
   * @throws ApiException if fails to make API call
   */
  public List<CustomerInvoiceTemplateLine> getCustomerInvoiceTemplateLineByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplateLine/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<CustomerInvoiceTemplateLine>> localVarReturnType = new GenericType<List<CustomerInvoiceTemplateLine>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a customerInvoiceTemplateLine by id
   * Returns the customerInvoiceTemplateLine identified by the specified id.
   * @param customerInvoiceTemplateLineId Id of the customerInvoiceTemplateLine to be returned. (required)
   * @return CustomerInvoiceTemplateLine
   * @throws ApiException if fails to make API call
   */
  public CustomerInvoiceTemplateLine getCustomerInvoiceTemplateLineById(Integer customerInvoiceTemplateLineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customerInvoiceTemplateLineId' is set
    if (customerInvoiceTemplateLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateLineId' when calling getCustomerInvoiceTemplateLineById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerInvoiceTemplateLineId" + "\\}", apiClient.escapeString(customerInvoiceTemplateLineId.toString()));

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

    
    GenericType<CustomerInvoiceTemplateLine> localVarReturnType = new GenericType<CustomerInvoiceTemplateLine>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for a customerInvoiceTemplateLine.
   * Get all existing customerInvoiceTemplateLine tags.
   * @param customerInvoiceTemplateLineId Id of the customerInvoiceTemplateLine to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getCustomerInvoiceTemplateLineTags(Integer customerInvoiceTemplateLineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customerInvoiceTemplateLineId' is set
    if (customerInvoiceTemplateLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateLineId' when calling getCustomerInvoiceTemplateLineTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerInvoiceTemplateLineId" + "\\}", apiClient.escapeString(customerInvoiceTemplateLineId.toString()));

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
   * Get a duplicated a customerInvoiceTemplateLine by id
   * Returns a duplicated customerInvoiceTemplateLine identified by the specified id.
   * @param customerInvoiceTemplateLineId Id of the customerInvoiceTemplateLine to be duplicated. (required)
   * @return CustomerInvoiceTemplateLine
   * @throws ApiException if fails to make API call
   */
  public CustomerInvoiceTemplateLine getDuplicateCustomerInvoiceTemplateLineById(Integer customerInvoiceTemplateLineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customerInvoiceTemplateLineId' is set
    if (customerInvoiceTemplateLineId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerInvoiceTemplateLineId' when calling getDuplicateCustomerInvoiceTemplateLineById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplateLine/duplicate/{customerInvoiceTemplateLineId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerInvoiceTemplateLineId" + "\\}", apiClient.escapeString(customerInvoiceTemplateLineId.toString()));

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

    
    GenericType<CustomerInvoiceTemplateLine> localVarReturnType = new GenericType<CustomerInvoiceTemplateLine>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a customerInvoiceTemplateLine
   * Updates an existing customerInvoiceTemplateLine using the specified data.
   * @param body CustomerInvoiceTemplateLine to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateCustomerInvoiceTemplateLine(CustomerInvoiceTemplateLine body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCustomerInvoiceTemplateLine");
    }
    
    // create path and map variables
    String localVarPath = "/beta/customerInvoiceTemplateLine".replaceAll("\\{format\\}","json");

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
