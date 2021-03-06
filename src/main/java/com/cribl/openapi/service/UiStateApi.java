/*
 * Cribl LogStream
 * REST API Reference of available endpoints and their supported operations for accessing, updating, creating, or deleting resources. Product documentation available at [docs.cribl.io](http://docs.cribl.io).
 *
 * OpenAPI spec version: 3.1.2-abb571bc
 * Contact: support@cribl.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.cribl.openapi.service;

import com.cribl.openapi.client.ApiCallback;
import com.cribl.openapi.client.ApiClient;
import com.cribl.openapi.client.ApiException;
import com.cribl.openapi.client.ApiResponse;
import com.cribl.openapi.client.Configuration;
import com.cribl.openapi.client.Pair;
import com.cribl.openapi.client.ProgressRequestBody;
import com.cribl.openapi.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.cribl.openapi.dto.Error;
import com.cribl.openapi.dto.InlineResponse20015;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UiStateApi {
    private ApiClient apiClient;

    public UiStateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UiStateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for uiKeyGet
     * @param key UI state key (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uiKeyGetCall(String key, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ui/{key}"
            .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call uiKeyGetValidateBeforeCall(String key, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new ApiException("Missing the required parameter 'key' when calling uiKeyGet(Async)");
        }
        
        com.squareup.okhttp.Call call = uiKeyGetCall(key, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get UI state by key
     * Get UI state by key
     * @param key UI state key (required)
     * @return InlineResponse20015
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20015 uiKeyGet(String key) throws ApiException {
        ApiResponse<InlineResponse20015> resp = uiKeyGetWithHttpInfo(key);
        return resp.getData();
    }

    /**
     * Get UI state by key
     * Get UI state by key
     * @param key UI state key (required)
     * @return ApiResponse&lt;InlineResponse20015&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20015> uiKeyGetWithHttpInfo(String key) throws ApiException {
        com.squareup.okhttp.Call call = uiKeyGetValidateBeforeCall(key, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20015>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get UI state by key (asynchronously)
     * Get UI state by key
     * @param key UI state key (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uiKeyGetAsync(String key, final ApiCallback<InlineResponse20015> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = uiKeyGetValidateBeforeCall(key, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20015>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for uiKeyPatch
     * @param key UI state key (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uiKeyPatchCall(String key, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ui/{key}"
            .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call uiKeyPatchValidateBeforeCall(String key, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new ApiException("Missing the required parameter 'key' when calling uiKeyPatch(Async)");
        }
        
        com.squareup.okhttp.Call call = uiKeyPatchCall(key, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update UI state by key
     * Update UI state by key
     * @param key UI state key (required)
     * @return InlineResponse20015
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20015 uiKeyPatch(String key) throws ApiException {
        ApiResponse<InlineResponse20015> resp = uiKeyPatchWithHttpInfo(key);
        return resp.getData();
    }

    /**
     * Update UI state by key
     * Update UI state by key
     * @param key UI state key (required)
     * @return ApiResponse&lt;InlineResponse20015&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20015> uiKeyPatchWithHttpInfo(String key) throws ApiException {
        com.squareup.okhttp.Call call = uiKeyPatchValidateBeforeCall(key, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20015>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update UI state by key (asynchronously)
     * Update UI state by key
     * @param key UI state key (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uiKeyPatchAsync(String key, final ApiCallback<InlineResponse20015> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = uiKeyPatchValidateBeforeCall(key, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20015>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
