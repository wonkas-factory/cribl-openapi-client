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


import com.cribl.openapi.dto.CrudEntityBase;
import com.cribl.openapi.dto.Error;
import com.cribl.openapi.dto.InlineResponse20015;
import com.cribl.openapi.dto.InlineResponse20039;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PacksApi {
    private ApiClient apiClient;

    public PacksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PacksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for packsGet
     * @param mode Export mode, one of \&quot;merge_safe\&quot;, \&quot;merge\&quot;, \&quot;default_only\&quot; (required)
     * @param dest Override name of the exported pack (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call packsGetCall(String mode, String dest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/packs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (mode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("mode", mode));
        if (dest != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dest", dest));

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
    private com.squareup.okhttp.Call packsGetValidateBeforeCall(String mode, String dest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'mode' is set
        if (mode == null) {
            throw new ApiException("Missing the required parameter 'mode' when calling packsGet(Async)");
        }
        
        com.squareup.okhttp.Call call = packsGetCall(mode, dest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Export Pack
     * Export Pack
     * @param mode Export mode, one of \&quot;merge_safe\&quot;, \&quot;merge\&quot;, \&quot;default_only\&quot; (required)
     * @param dest Override name of the exported pack (optional)
     * @return InlineResponse20015
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20015 packsGet(String mode, String dest) throws ApiException {
        ApiResponse<InlineResponse20015> resp = packsGetWithHttpInfo(mode, dest);
        return resp.getData();
    }

    /**
     * Export Pack
     * Export Pack
     * @param mode Export mode, one of \&quot;merge_safe\&quot;, \&quot;merge\&quot;, \&quot;default_only\&quot; (required)
     * @param dest Override name of the exported pack (optional)
     * @return ApiResponse&lt;InlineResponse20015&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20015> packsGetWithHttpInfo(String mode, String dest) throws ApiException {
        com.squareup.okhttp.Call call = packsGetValidateBeforeCall(mode, dest, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20015>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export Pack (asynchronously)
     * Export Pack
     * @param mode Export mode, one of \&quot;merge_safe\&quot;, \&quot;merge\&quot;, \&quot;default_only\&quot; (required)
     * @param dest Override name of the exported pack (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call packsGetAsync(String mode, String dest, final ApiCallback<InlineResponse20015> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = packsGetValidateBeforeCall(mode, dest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20015>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for packsIdDelete
     * @param id Pack name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call packsIdDeleteCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/packs/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call packsIdDeleteValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling packsIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = packsIdDeleteCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Uninstall Pack from the system
     * Uninstall Pack from the system
     * @param id Pack name (required)
     * @return InlineResponse20039
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20039 packsIdDelete(String id) throws ApiException {
        ApiResponse<InlineResponse20039> resp = packsIdDeleteWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Uninstall Pack from the system
     * Uninstall Pack from the system
     * @param id Pack name (required)
     * @return ApiResponse&lt;InlineResponse20039&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20039> packsIdDeleteWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = packsIdDeleteValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20039>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Uninstall Pack from the system (asynchronously)
     * Uninstall Pack from the system
     * @param id Pack name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call packsIdDeleteAsync(String id, final ApiCallback<InlineResponse20039> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = packsIdDeleteValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20039>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for packsIdPatch
     * @param id Pack name (required)
     * @param source body string required Pack source (optional)
     * @param minor body boolean optional Only upgrade to minor/patch versions (optional)
     * @param spec body string optional Specify a branch, tag or a semver spec (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call packsIdPatchCall(String id, String source, String minor, String spec, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/packs/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));
        if (minor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("minor", minor));
        if (spec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spec", spec));

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
    private com.squareup.okhttp.Call packsIdPatchValidateBeforeCall(String id, String source, String minor, String spec, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling packsIdPatch(Async)");
        }
        
        com.squareup.okhttp.Call call = packsIdPatchCall(id, source, minor, spec, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Upgrade Pack
     * Upgrade Pack
     * @param id Pack name (required)
     * @param source body string required Pack source (optional)
     * @param minor body boolean optional Only upgrade to minor/patch versions (optional)
     * @param spec body string optional Specify a branch, tag or a semver spec (optional)
     * @return InlineResponse20039
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20039 packsIdPatch(String id, String source, String minor, String spec) throws ApiException {
        ApiResponse<InlineResponse20039> resp = packsIdPatchWithHttpInfo(id, source, minor, spec);
        return resp.getData();
    }

    /**
     * Upgrade Pack
     * Upgrade Pack
     * @param id Pack name (required)
     * @param source body string required Pack source (optional)
     * @param minor body boolean optional Only upgrade to minor/patch versions (optional)
     * @param spec body string optional Specify a branch, tag or a semver spec (optional)
     * @return ApiResponse&lt;InlineResponse20039&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20039> packsIdPatchWithHttpInfo(String id, String source, String minor, String spec) throws ApiException {
        com.squareup.okhttp.Call call = packsIdPatchValidateBeforeCall(id, source, minor, spec, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20039>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upgrade Pack (asynchronously)
     * Upgrade Pack
     * @param id Pack name (required)
     * @param source body string required Pack source (optional)
     * @param minor body boolean optional Only upgrade to minor/patch versions (optional)
     * @param spec body string optional Specify a branch, tag or a semver spec (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call packsIdPatchAsync(String id, String source, String minor, String spec, final ApiCallback<InlineResponse20039> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = packsIdPatchValidateBeforeCall(id, source, minor, spec, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20039>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for packsPost
     * @param body CrudEntityBase object (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call packsPostCall(CrudEntityBase body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/packs";

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
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call packsPostValidateBeforeCall(CrudEntityBase body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = packsPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Install Pack
     * Install Pack
     * @param body CrudEntityBase object (optional)
     * @return InlineResponse20039
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20039 packsPost(CrudEntityBase body) throws ApiException {
        ApiResponse<InlineResponse20039> resp = packsPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Install Pack
     * Install Pack
     * @param body CrudEntityBase object (optional)
     * @return ApiResponse&lt;InlineResponse20039&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20039> packsPostWithHttpInfo(CrudEntityBase body) throws ApiException {
        com.squareup.okhttp.Call call = packsPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20039>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Install Pack (asynchronously)
     * Install Pack
     * @param body CrudEntityBase object (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call packsPostAsync(CrudEntityBase body, final ApiCallback<InlineResponse20039> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = packsPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20039>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for packsPut
     * @param filename the file to upload (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call packsPutCall(String filename, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/packs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filename != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filename", filename));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call packsPutValidateBeforeCall(String filename, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = packsPutCall(filename, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Upload Pack
     * Upload Pack
     * @param filename the file to upload (optional)
     * @return InlineResponse20015
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20015 packsPut(String filename) throws ApiException {
        ApiResponse<InlineResponse20015> resp = packsPutWithHttpInfo(filename);
        return resp.getData();
    }

    /**
     * Upload Pack
     * Upload Pack
     * @param filename the file to upload (optional)
     * @return ApiResponse&lt;InlineResponse20015&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20015> packsPutWithHttpInfo(String filename) throws ApiException {
        com.squareup.okhttp.Call call = packsPutValidateBeforeCall(filename, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20015>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upload Pack (asynchronously)
     * Upload Pack
     * @param filename the file to upload (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call packsPutAsync(String filename, final ApiCallback<InlineResponse20015> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = packsPutValidateBeforeCall(filename, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20015>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
