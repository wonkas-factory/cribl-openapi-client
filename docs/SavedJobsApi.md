# SavedJobsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**libJobsGet**](SavedJobsApi.md#libJobsGet) | **GET** /lib/jobs | Get a list of SavedJob objects
[**libJobsIdDelete**](SavedJobsApi.md#libJobsIdDelete) | **DELETE** /lib/jobs/{id} | Delete SavedJob
[**libJobsIdGet**](SavedJobsApi.md#libJobsIdGet) | **GET** /lib/jobs/{id} | Get SavedJob by ID
[**libJobsIdPatch**](SavedJobsApi.md#libJobsIdPatch) | **PATCH** /lib/jobs/{id} | Update SavedJob
[**libJobsPost**](SavedJobsApi.md#libJobsPost) | **POST** /lib/jobs | Create SavedJob

<a name="libJobsGet"></a>
# **libJobsGet**
> InlineResponse2009 libJobsGet()

Get a list of SavedJob objects

Get a list of SavedJob objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SavedJobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SavedJobsApi apiInstance = new SavedJobsApi();
try {
    InlineResponse2009 result = apiInstance.libJobsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedJobsApi#libJobsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="libJobsIdDelete"></a>
# **libJobsIdDelete**
> InlineResponse2009 libJobsIdDelete(id)

Delete SavedJob

Delete SavedJob

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SavedJobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SavedJobsApi apiInstance = new SavedJobsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2009 result = apiInstance.libJobsIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedJobsApi#libJobsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="libJobsIdGet"></a>
# **libJobsIdGet**
> InlineResponse2009 libJobsIdGet(id)

Get SavedJob by ID

Get SavedJob by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SavedJobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SavedJobsApi apiInstance = new SavedJobsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2009 result = apiInstance.libJobsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedJobsApi#libJobsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="libJobsIdPatch"></a>
# **libJobsIdPatch**
> InlineResponse2009 libJobsIdPatch(id, body)

Update SavedJob

Update SavedJob

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SavedJobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SavedJobsApi apiInstance = new SavedJobsApi();
String id = "id_example"; // String | Unique ID
SavedJob body = new SavedJob(); // SavedJob | SavedJob object to be updated
try {
    InlineResponse2009 result = apiInstance.libJobsIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedJobsApi#libJobsIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**SavedJob**](SavedJob.md)| SavedJob object to be updated | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="libJobsPost"></a>
# **libJobsPost**
> InlineResponse2009 libJobsPost(body)

Create SavedJob

Create SavedJob

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SavedJobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SavedJobsApi apiInstance = new SavedJobsApi();
SavedJob body = new SavedJob(); // SavedJob | New SavedJob object
try {
    InlineResponse2009 result = apiInstance.libJobsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedJobsApi#libJobsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SavedJob**](SavedJob.md)| New SavedJob object | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

