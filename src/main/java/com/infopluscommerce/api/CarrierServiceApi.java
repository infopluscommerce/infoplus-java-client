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


import com.infopluscommerce.model.CarrierService;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarrierServiceApi {
    private ApiClient apiClient;

    public CarrierServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CarrierServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCarrierServiceById
     * @param carrierServiceId Id of carrierService to be returned. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCarrierServiceByIdCall(String carrierServiceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/beta/carrierService/{carrierServiceId}"
            .replaceAll("\\{" + "carrierServiceId" + "\\}", apiClient.escapeString(carrierServiceId.toString()));

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
    private com.squareup.okhttp.Call getCarrierServiceByIdValidateBeforeCall(String carrierServiceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'carrierServiceId' is set
        if (carrierServiceId == null) {
            throw new ApiException("Missing the required parameter 'carrierServiceId' when calling getCarrierServiceById(Async)");
        }
        

        com.squareup.okhttp.Call call = getCarrierServiceByIdCall(carrierServiceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a carrierService by id
     * Returns the carrierService identified by the specified id.
     * @param carrierServiceId Id of carrierService to be returned. (required)
     * @return CarrierService
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CarrierService getCarrierServiceById(String carrierServiceId) throws ApiException {
        ApiResponse<CarrierService> resp = getCarrierServiceByIdWithHttpInfo(carrierServiceId);
        return resp.getData();
    }

    /**
     * Get a carrierService by id
     * Returns the carrierService identified by the specified id.
     * @param carrierServiceId Id of carrierService to be returned. (required)
     * @return ApiResponse&lt;CarrierService&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CarrierService> getCarrierServiceByIdWithHttpInfo(String carrierServiceId) throws ApiException {
        com.squareup.okhttp.Call call = getCarrierServiceByIdValidateBeforeCall(carrierServiceId, null, null);
        Type localVarReturnType = new TypeToken<CarrierService>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a carrierService by id (asynchronously)
     * Returns the carrierService identified by the specified id.
     * @param carrierServiceId Id of carrierService to be returned. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCarrierServiceByIdAsync(String carrierServiceId, final ApiCallback<CarrierService> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCarrierServiceByIdValidateBeforeCall(carrierServiceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CarrierService>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCarrierServiceBySearchText
     * @param searchText Search text, used to filter results. (optional)
     * @param page Result page number.  Defaults to 1. (optional)
     * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCarrierServiceBySearchTextCall(String searchText, Integer page, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/beta/carrierService/search";

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
    private com.squareup.okhttp.Call getCarrierServiceBySearchTextValidateBeforeCall(String searchText, Integer page, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCarrierServiceBySearchTextCall(searchText, page, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search carrierServices
     * Returns the list of carrierServices that match the given searchText.
     * @param searchText Search text, used to filter results. (optional)
     * @param page Result page number.  Defaults to 1. (optional)
     * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
     * @return List&lt;CarrierService&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CarrierService> getCarrierServiceBySearchText(String searchText, Integer page, Integer limit) throws ApiException {
        ApiResponse<List<CarrierService>> resp = getCarrierServiceBySearchTextWithHttpInfo(searchText, page, limit);
        return resp.getData();
    }

    /**
     * Search carrierServices
     * Returns the list of carrierServices that match the given searchText.
     * @param searchText Search text, used to filter results. (optional)
     * @param page Result page number.  Defaults to 1. (optional)
     * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
     * @return ApiResponse&lt;List&lt;CarrierService&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CarrierService>> getCarrierServiceBySearchTextWithHttpInfo(String searchText, Integer page, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = getCarrierServiceBySearchTextValidateBeforeCall(searchText, page, limit, null, null);
        Type localVarReturnType = new TypeToken<List<CarrierService>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search carrierServices (asynchronously)
     * Returns the list of carrierServices that match the given searchText.
     * @param searchText Search text, used to filter results. (optional)
     * @param page Result page number.  Defaults to 1. (optional)
     * @param limit Maximum results per page.  Defaults to 20.  Max allowed value is 250. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCarrierServiceBySearchTextAsync(String searchText, Integer page, Integer limit, final ApiCallback<List<CarrierService>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCarrierServiceBySearchTextValidateBeforeCall(searchText, page, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CarrierService>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
