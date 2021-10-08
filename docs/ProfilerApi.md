# ProfilerApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemProfilerGet**](ProfilerApi.md#systemProfilerGet) | **GET** /system/profiler | Get a list of ProfilerItem objects
[**systemProfilerIdDelete**](ProfilerApi.md#systemProfilerIdDelete) | **DELETE** /system/profiler/{id} | Delete ProfilerItem
[**systemProfilerIdGet**](ProfilerApi.md#systemProfilerIdGet) | **GET** /system/profiler/{id} | Get ProfilerItem by ID
[**systemProfilerIdPatch**](ProfilerApi.md#systemProfilerIdPatch) | **PATCH** /system/profiler/{id} | Update ProfilerItem
[**systemProfilerPost**](ProfilerApi.md#systemProfilerPost) | **POST** /system/profiler | Create ProfilerItem

<a name="systemProfilerGet"></a>
# **systemProfilerGet**
> InlineResponse20020 systemProfilerGet()

Get a list of ProfilerItem objects

Get a list of ProfilerItem objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ProfilerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProfilerApi apiInstance = new ProfilerApi();
try {
    InlineResponse20020 result = apiInstance.systemProfilerGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilerApi#systemProfilerGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemProfilerIdDelete"></a>
# **systemProfilerIdDelete**
> InlineResponse20020 systemProfilerIdDelete(id)

Delete ProfilerItem

Delete ProfilerItem

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ProfilerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProfilerApi apiInstance = new ProfilerApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20020 result = apiInstance.systemProfilerIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilerApi#systemProfilerIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemProfilerIdGet"></a>
# **systemProfilerIdGet**
> InlineResponse20020 systemProfilerIdGet(id)

Get ProfilerItem by ID

Get ProfilerItem by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ProfilerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProfilerApi apiInstance = new ProfilerApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20020 result = apiInstance.systemProfilerIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilerApi#systemProfilerIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemProfilerIdPatch"></a>
# **systemProfilerIdPatch**
> InlineResponse20020 systemProfilerIdPatch(id, body)

Update ProfilerItem

Update ProfilerItem

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ProfilerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProfilerApi apiInstance = new ProfilerApi();
String id = "id_example"; // String | Unique ID
ProfilerItem body = new ProfilerItem(); // ProfilerItem | ProfilerItem object to be updated
try {
    InlineResponse20020 result = apiInstance.systemProfilerIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilerApi#systemProfilerIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**ProfilerItem**](ProfilerItem.md)| ProfilerItem object to be updated | [optional]

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemProfilerPost"></a>
# **systemProfilerPost**
> InlineResponse20020 systemProfilerPost(body)

Create ProfilerItem

Create ProfilerItem

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ProfilerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProfilerApi apiInstance = new ProfilerApi();
ProfilerItem body = new ProfilerItem(); // ProfilerItem | New ProfilerItem object
try {
    InlineResponse20020 result = apiInstance.systemProfilerPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilerApi#systemProfilerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProfilerItem**](ProfilerItem.md)| New ProfilerItem object | [optional]

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

