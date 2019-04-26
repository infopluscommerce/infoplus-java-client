/*
 * Infoplus API
 * Infoplus API.
 *
 * OpenAPI spec version: beta
 * Contact: api@infopluscommerce.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infopluscommerce.api;

import com.infopluscommerce.ApiCallback;
import com.infopluscommerce.ApiClient;
import com.infopluscommerce.ApiException;
import com.infopluscommerce.ApiResponse;
import com.infopluscommerce.Configuration;
import com.infopluscommerce.Pair;
import com.infopluscommerce.ProgressRequestBody;
import com.infopluscommerce.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.infopluscommerce.model.ItemActivityType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemActivityTypeApi {
    private ApiClient apiClient;

    public ItemActivityTypeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ItemActivityTypeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getItemActivityTypeById
     * @param itemActivityTypeId Id of itemActivityType to be returned. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemActivityTypeByIdCall(String itemActivityTypeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/beta/itemActivityType/{itemActivityTypeId}"
            .replaceAll("\\{" + "itemActivityTypeId" + "\\}", apiClient.escapeString(itemActivityTypeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemActivityTypeByIdValidateBeforeCall(String itemActivityTypeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'itemActivityTypeId' is set
        if (itemActivityTypeId == null) {
            throw new ApiException("Missing the required parameter 'itemActivityTypeId' when calling getItemActivityTypeById(Async)");
        }
        

        com.squareup.okhttp.Call call = getItemActivityTypeByIdCall(itemActivityTypeId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get an itemActivityType by id
     * Returns the itemActivityType identified by the specified id.
     * @param itemActivityTypeId Id of itemActivityType to be returned. (required)
     * @return ItemActivityType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemActivityType getItemActivityTypeById(String itemActivityTypeId) throws ApiException {
        ApiResponse<ItemActivityType> resp = getItemActivityTypeByIdWithHttpInfo(itemActivityTypeId);
        return resp.getData();
    }

    /**
     * Get an itemActivityType by id
     * Returns the itemActivityType identified by the specified id.
     * @param itemActivityTypeId Id of itemActivityType to be returned. (required)
     * @return ApiResponse&lt;ItemActivityType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ItemActivityType> getItemActivityTypeByIdWithHttpInfo(String itemActivityTypeId) throws ApiException {
        com.squareup.okhttp.Call call = getItemActivityTypeByIdValidateBeforeCall(itemActivityTypeId, null, null);
        Type localVarReturnType = new TypeToken<ItemActivityType>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an itemActivityType by id (asynchronously)
     * Returns the itemActivityType identified by the specified id.
     * @param itemActivityTypeId Id of itemActivityType to be returned. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemActivityTypeByIdAsync(String itemActivityTypeId, final ApiCallback<ItemActivityType> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getItemActivityTypeByIdValidateBeforeCall(itemActivityTypeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ItemActivityType>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemActivityTypeBySearchText
     * @param searchText Search text, used to filter results. (optional)
     * @param page Result page number.  Defaults to 1. (optional)
     * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemActivityTypeBySearchTextCall(String searchText, Integer page, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/beta/itemActivityType/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (searchText != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("searchText", searchText));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemActivityTypeBySearchTextValidateBeforeCall(String searchText, Integer page, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getItemActivityTypeBySearchTextCall(searchText, page, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search itemActivityTypes
     * Returns the list of itemActivityTypes that match the given searchText.
     * @param searchText Search text, used to filter results. (optional)
     * @param page Result page number.  Defaults to 1. (optional)
     * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
     * @return List&lt;ItemActivityType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ItemActivityType> getItemActivityTypeBySearchText(String searchText, Integer page, Integer limit) throws ApiException {
        ApiResponse<List<ItemActivityType>> resp = getItemActivityTypeBySearchTextWithHttpInfo(searchText, page, limit);
        return resp.getData();
    }

    /**
     * Search itemActivityTypes
     * Returns the list of itemActivityTypes that match the given searchText.
     * @param searchText Search text, used to filter results. (optional)
     * @param page Result page number.  Defaults to 1. (optional)
     * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
     * @return ApiResponse&lt;List&lt;ItemActivityType&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ItemActivityType>> getItemActivityTypeBySearchTextWithHttpInfo(String searchText, Integer page, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = getItemActivityTypeBySearchTextValidateBeforeCall(searchText, page, limit, null, null);
        Type localVarReturnType = new TypeToken<List<ItemActivityType>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search itemActivityTypes (asynchronously)
     * Returns the list of itemActivityTypes that match the given searchText.
     * @param searchText Search text, used to filter results. (optional)
     * @param page Result page number.  Defaults to 1. (optional)
     * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemActivityTypeBySearchTextAsync(String searchText, Integer page, Integer limit, final ApiCallback<List<ItemActivityType>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getItemActivityTypeBySearchTextValidateBeforeCall(searchText, page, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ItemActivityType>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}