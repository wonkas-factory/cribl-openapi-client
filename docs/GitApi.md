# GitApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**versionCommitPost**](GitApi.md#versionCommitPost) | **POST** /version/commit | create a new commit containing the current configs the given log message describing the changes.
[**versionCountGet**](GitApi.md#versionCountGet) | **GET** /version/count | get the count of files of changed
[**versionDiffGet**](GitApi.md#versionDiffGet) | **GET** /version/diff | get the textual diff for given commit
[**versionFilesGet**](GitApi.md#versionFilesGet) | **GET** /version/files | get the files changed
[**versionInfoGet**](GitApi.md#versionInfoGet) | **GET** /version/info | Get info about versioning availability
[**versionPushPost**](GitApi.md#versionPushPost) | **POST** /version/push | push the current configs to the remote repository.
[**versionShowGet**](GitApi.md#versionShowGet) | **GET** /version/show | get the log message and textual diff for given commit
[**versionStatusGet**](GitApi.md#versionStatusGet) | **GET** /version/status | get the the working tree status

<a name="versionCommitPost"></a>
# **versionCommitPost**
> InlineResponse20047 versionCommitPost()

create a new commit containing the current configs the given log message describing the changes.

create a new commit containing the current configs the given log message describing the changes.

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GitApi apiInstance = new GitApi();
try {
    InlineResponse20047 result = apiInstance.versionCommitPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitApi#versionCommitPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20047**](InlineResponse20047.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="versionCountGet"></a>
# **versionCountGet**
> InlineResponse20015 versionCountGet(group)

get the count of files of changed

get the count of files of changed

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GitApi apiInstance = new GitApi();
String group = "group_example"; // String | Group ID
try {
    InlineResponse20015 result = apiInstance.versionCountGet(group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitApi#versionCountGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| Group ID | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="versionDiffGet"></a>
# **versionDiffGet**
> InlineResponse20015 versionDiffGet(commit, group)

get the textual diff for given commit

get the textual diff for given commit

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GitApi apiInstance = new GitApi();
String commit = "commit_example"; // String | Commit hash (default is HEAD)
String group = "group_example"; // String | Group ID
try {
    InlineResponse20015 result = apiInstance.versionDiffGet(commit, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitApi#versionDiffGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commit** | **String**| Commit hash (default is HEAD) | [optional]
 **group** | **String**| Group ID | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="versionFilesGet"></a>
# **versionFilesGet**
> InlineResponse20048 versionFilesGet(group)

get the files changed

get the files changed

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GitApi apiInstance = new GitApi();
String group = "group_example"; // String | Group ID
try {
    InlineResponse20048 result = apiInstance.versionFilesGet(group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitApi#versionFilesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| Group ID | [optional]

### Return type

[**InlineResponse20048**](InlineResponse20048.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="versionInfoGet"></a>
# **versionInfoGet**
> InlineResponse20049 versionInfoGet()

Get info about versioning availability

Get info about versioning availability

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GitApi apiInstance = new GitApi();
try {
    InlineResponse20049 result = apiInstance.versionInfoGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitApi#versionInfoGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20049**](InlineResponse20049.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="versionPushPost"></a>
# **versionPushPost**
> InlineResponse20015 versionPushPost()

push the current configs to the remote repository.

push the current configs to the remote repository.

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GitApi apiInstance = new GitApi();
try {
    InlineResponse20015 result = apiInstance.versionPushPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitApi#versionPushPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="versionShowGet"></a>
# **versionShowGet**
> InlineResponse20015 versionShowGet(commit, group)

get the log message and textual diff for given commit

get the log message and textual diff for given commit

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GitApi apiInstance = new GitApi();
String commit = "commit_example"; // String | Commit hash (default is HEAD)
String group = "group_example"; // String | Group ID
try {
    InlineResponse20015 result = apiInstance.versionShowGet(commit, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitApi#versionShowGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commit** | **String**| Commit hash (default is HEAD) | [optional]
 **group** | **String**| Group ID | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="versionStatusGet"></a>
# **versionStatusGet**
> InlineResponse20050 versionStatusGet(group)

get the the working tree status

get the the working tree status

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GitApi apiInstance = new GitApi();
String group = "group_example"; // String | Group ID
try {
    InlineResponse20050 result = apiInstance.versionStatusGet(group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitApi#versionStatusGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| Group ID | [optional]

### Return type

[**InlineResponse20050**](InlineResponse20050.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

