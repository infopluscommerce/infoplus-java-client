package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.EmailTemplate;
import com.infopluscommerce.model.ApiResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class EmailTemplateApi {
  private ApiClient apiClient;

  public EmailTemplateApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EmailTemplateApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update an emailTemplate
   * Updates an existing emailTemplate using the specified data.
   * @param body EmailTemplate to be updated.
   * @return void
   */
  public void updateEmailTemplate(EmailTemplate body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateEmailTemplate");
     }
     
    // create path and map variables
    String path = "/v1.0/emailTemplate".replaceAll("\\{format\\}","json");

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
   * Create an emailTemplate
   * Inserts a new emailTemplate using the specified data.
   * @param body EmailTemplate to be inserted.
   * @return EmailTemplate
   */
  public EmailTemplate addEmailTemplate(EmailTemplate body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addEmailTemplate");
     }
     
    // create path and map variables
    String path = "/v1.0/emailTemplate".replaceAll("\\{format\\}","json");

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

    
    GenericType<EmailTemplate> returnType = new GenericType<EmailTemplate>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search emailTemplates by filter
   * Returns the list of emailTemplates that match the given filter.
   * @param filter Query string, used to filter results.
   * @param page Result page number.  Defaults to 1.
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250.
   * @param sort Sort results by specified field.
   * @return List<EmailTemplate>
   */
  public List<EmailTemplate> getEmailTemplateByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1.0/emailTemplate/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<EmailTemplate>> returnType = new GenericType<List<EmailTemplate>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get an emailTemplate by id
   * Returns the emailTemplate identified by the specified id.
   * @param emailTemplateId Id of the emailTemplate to be returned.
   * @return EmailTemplate
   */
  public EmailTemplate getEmailTemplateById(Integer emailTemplateId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'emailTemplateId' is set
     if (emailTemplateId == null) {
        throw new ApiException(400, "Missing the required parameter 'emailTemplateId' when calling getEmailTemplateById");
     }
     
    // create path and map variables
    String path = "/v1.0/emailTemplate/{emailTemplateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailTemplateId" + "\\}", apiClient.escapeString(emailTemplateId.toString()));

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

    
    GenericType<EmailTemplate> returnType = new GenericType<EmailTemplate>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete an emailTemplate
   * Deletes the emailTemplate identified by the specified id.
   * @param emailTemplateId Id of the emailTemplate to be deleted.
   * @return void
   */
  public void deleteEmailTemplate(Integer emailTemplateId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'emailTemplateId' is set
     if (emailTemplateId == null) {
        throw new ApiException(400, "Missing the required parameter 'emailTemplateId' when calling deleteEmailTemplate");
     }
     
    // create path and map variables
    String path = "/v1.0/emailTemplate/{emailTemplateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailTemplateId" + "\\}", apiClient.escapeString(emailTemplateId.toString()));

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
