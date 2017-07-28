package com.infopluscommerce.api;

import com.sun.jersey.api.client.GenericType;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;

import com.infopluscommerce.model.EmailTemplate;
import com.infopluscommerce.model.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
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
   * Create an emailTemplate
   * Inserts a new emailTemplate using the specified data.
   * @param body EmailTemplate to be inserted. (required)
   * @return EmailTemplate
   * @throws ApiException if fails to make API call
   */
  public EmailTemplate addEmailTemplate(EmailTemplate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addEmailTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/beta/emailTemplate".replaceAll("\\{format\\}","json");

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

    
    GenericType<EmailTemplate> localVarReturnType = new GenericType<EmailTemplate>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add new audit for an emailTemplate
   * Adds an audit to an existing emailTemplate.
   * @param emailTemplateId Id of the emailTemplate to add an audit to (required)
   * @param emailTemplateAudit The audit to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addEmailTemplateAudit(Integer emailTemplateId, String emailTemplateAudit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'emailTemplateId' is set
    if (emailTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailTemplateId' when calling addEmailTemplateAudit");
    }
    
    // verify the required parameter 'emailTemplateAudit' is set
    if (emailTemplateAudit == null) {
      throw new ApiException(400, "Missing the required parameter 'emailTemplateAudit' when calling addEmailTemplateAudit");
    }
    
    // create path and map variables
    String localVarPath = "/beta/emailTemplate/{emailTemplateId}/audit/{emailTemplateAudit}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailTemplateId" + "\\}", apiClient.escapeString(emailTemplateId.toString()))
      .replaceAll("\\{" + "emailTemplateAudit" + "\\}", apiClient.escapeString(emailTemplateAudit.toString()));

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
   * Add new tags for an emailTemplate.
   * Adds a tag to an existing emailTemplate.
   * @param emailTemplateId Id of the emailTemplate to add a tag to (required)
   * @param emailTemplateTag The tag to add (required)
   * @throws ApiException if fails to make API call
   */
  public void addEmailTemplateTag(Integer emailTemplateId, String emailTemplateTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'emailTemplateId' is set
    if (emailTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailTemplateId' when calling addEmailTemplateTag");
    }
    
    // verify the required parameter 'emailTemplateTag' is set
    if (emailTemplateTag == null) {
      throw new ApiException(400, "Missing the required parameter 'emailTemplateTag' when calling addEmailTemplateTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/emailTemplate/{emailTemplateId}/tag/{emailTemplateTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailTemplateId" + "\\}", apiClient.escapeString(emailTemplateId.toString()))
      .replaceAll("\\{" + "emailTemplateTag" + "\\}", apiClient.escapeString(emailTemplateTag.toString()));

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
   * Delete an emailTemplate
   * Deletes the emailTemplate identified by the specified id.
   * @param emailTemplateId Id of the emailTemplate to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteEmailTemplate(Integer emailTemplateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'emailTemplateId' is set
    if (emailTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailTemplateId' when calling deleteEmailTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/beta/emailTemplate/{emailTemplateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailTemplateId" + "\\}", apiClient.escapeString(emailTemplateId.toString()));

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
   * Delete a tag for an emailTemplate.
   * Deletes an existing emailTemplate tag using the specified data.
   * @param emailTemplateId Id of the emailTemplate to remove tag from (required)
   * @param emailTemplateTag The tag to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteEmailTemplateTag(Integer emailTemplateId, String emailTemplateTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'emailTemplateId' is set
    if (emailTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailTemplateId' when calling deleteEmailTemplateTag");
    }
    
    // verify the required parameter 'emailTemplateTag' is set
    if (emailTemplateTag == null) {
      throw new ApiException(400, "Missing the required parameter 'emailTemplateTag' when calling deleteEmailTemplateTag");
    }
    
    // create path and map variables
    String localVarPath = "/beta/emailTemplate/{emailTemplateId}/tag/{emailTemplateTag}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailTemplateId" + "\\}", apiClient.escapeString(emailTemplateId.toString()))
      .replaceAll("\\{" + "emailTemplateTag" + "\\}", apiClient.escapeString(emailTemplateTag.toString()));

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
   * Get a duplicated an emailTemplate by id
   * Returns a duplicated emailTemplate identified by the specified id.
   * @param emailTemplateId Id of the emailTemplate to be duplicated. (required)
   * @return EmailTemplate
   * @throws ApiException if fails to make API call
   */
  public EmailTemplate getDuplicateEmailTemplateById(Integer emailTemplateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'emailTemplateId' is set
    if (emailTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailTemplateId' when calling getDuplicateEmailTemplateById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/emailTemplate/duplicate/{emailTemplateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailTemplateId" + "\\}", apiClient.escapeString(emailTemplateId.toString()));

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

    
    GenericType<EmailTemplate> localVarReturnType = new GenericType<EmailTemplate>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Search emailTemplates by filter
   * Returns the list of emailTemplates that match the given filter.
   * @param filter Query string, used to filter results. (optional)
   * @param page Result page number.  Defaults to 1. (optional)
   * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
   * @param sort Sort results by specified field. (optional)
   * @return List<EmailTemplate>
   * @throws ApiException if fails to make API call
   */
  public List<EmailTemplate> getEmailTemplateByFilter(String filter, Integer page, Integer limit, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/beta/emailTemplate/search".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<EmailTemplate>> localVarReturnType = new GenericType<List<EmailTemplate>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an emailTemplate by id
   * Returns the emailTemplate identified by the specified id.
   * @param emailTemplateId Id of the emailTemplate to be returned. (required)
   * @return EmailTemplate
   * @throws ApiException if fails to make API call
   */
  public EmailTemplate getEmailTemplateById(Integer emailTemplateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'emailTemplateId' is set
    if (emailTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailTemplateId' when calling getEmailTemplateById");
    }
    
    // create path and map variables
    String localVarPath = "/beta/emailTemplate/{emailTemplateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailTemplateId" + "\\}", apiClient.escapeString(emailTemplateId.toString()));

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

    
    GenericType<EmailTemplate> localVarReturnType = new GenericType<EmailTemplate>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the tags for an emailTemplate.
   * Get all existing emailTemplate tags.
   * @param emailTemplateId Id of the emailTemplate to get tags for (required)
   * @throws ApiException if fails to make API call
   */
  public void getEmailTemplateTags(Integer emailTemplateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'emailTemplateId' is set
    if (emailTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'emailTemplateId' when calling getEmailTemplateTags");
    }
    
    // create path and map variables
    String localVarPath = "/beta/emailTemplate/{emailTemplateId}/tag".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailTemplateId" + "\\}", apiClient.escapeString(emailTemplateId.toString()));

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
   * Update an emailTemplate
   * Updates an existing emailTemplate using the specified data.
   * @param body EmailTemplate to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateEmailTemplate(EmailTemplate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateEmailTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/beta/emailTemplate".replaceAll("\\{format\\}","json");

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
   * Update an emailTemplate custom fields
   * Updates an existing emailTemplate custom fields using the specified data.
   * @param body EmailTemplate to be updated. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateEmailTemplateCustomFields(EmailTemplate body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateEmailTemplateCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/beta/emailTemplate/customFields".replaceAll("\\{format\\}","json");

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
