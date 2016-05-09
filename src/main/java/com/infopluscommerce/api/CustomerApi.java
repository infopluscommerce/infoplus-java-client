package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.Customer;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class CustomerApi {
  private ApiClient apiClient;

  public CustomerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update a customer
   * Updates an existing customer using the specified data.
   * @param body Customer to be updated.
   * @return void
   */
  public void updateCustomer(Customer body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateCustomer");
     }
     
    // create path and map variables
    String path = "/v1.0/customer".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Create a customer
   * Inserts a new customer using the specified data.
   * @param body Customer to be inserted.
   * @return Customer
   */
  public Customer addCustomer(Customer body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addCustomer");
     }
     
    // create path and map variables
    String path = "/v1.0/customer".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<Customer> returnType = new GenericType<Customer>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a customer by Customer No
   * Returns the customer identified by the specified parameters.
   * @param lobId lobId of the customer to be returned.
   * @param customerNo customerNo of the customer to be returned.
   * @return Customer
   */
  public Customer getCustomerBygetByCustomerNo(Integer lobId, String customerNo) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'lobId' is set
     if (lobId == null) {
        throw new ApiException(400, "Missing the required parameter 'lobId' when calling getCustomerBygetByCustomerNo");
     }
     
     // verify the required parameter 'customerNo' is set
     if (customerNo == null) {
        throw new ApiException(400, "Missing the required parameter 'customerNo' when calling getCustomerBygetByCustomerNo");
     }
     
    // create path and map variables
    String path = "/v1.0/customer/getByCustomerNo".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "lobId", lobId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "customerNo", customerNo));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<Customer> returnType = new GenericType<Customer>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search customers by filter
   * Returns the list of customers that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<Customer>
   */
  public List<Customer> getCustomerByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/customer/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "api_key" };

    
    GenericType<List<Customer>> returnType = new GenericType<List<Customer>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get a customer by id
   * Returns the customer identified by the specified id.
   * @param customerId Id of the customer to be returned.
   * @return Customer
   */
  public Customer getCustomerById(Integer customerId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'customerId' is set
     if (customerId == null) {
        throw new ApiException(400, "Missing the required parameter 'customerId' when calling getCustomerById");
     }
     
    // create path and map variables
    String path = "/v1.0/customer/{customerId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerId" + "\\}", apiClient.escapeString(customerId.toString()));

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

    
    GenericType<Customer> returnType = new GenericType<Customer>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a customer
   * Deletes the customer identified by the specified id.
   * @param customerId Id of the customer to be deleted.
   * @return void
   */
  public void deleteCustomer(Integer customerId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'customerId' is set
     if (customerId == null) {
        throw new ApiException(400, "Missing the required parameter 'customerId' when calling deleteCustomer");
     }
     
    // create path and map variables
    String path = "/v1.0/customer/{customerId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerId" + "\\}", apiClient.escapeString(customerId.toString()));

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

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
}
