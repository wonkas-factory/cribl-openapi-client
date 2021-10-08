# LoggerApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemLoggerGet**](LoggerApi.md#systemLoggerGet) | **GET** /system/logger | Get a list of LoggerConfig objects
[**systemLoggerIdGet**](LoggerApi.md#systemLoggerIdGet) | **GET** /system/logger/{id} | Get LoggerConfig by ID
[**systemLoggerIdPatch**](LoggerApi.md#systemLoggerIdPatch) | **PATCH** /system/logger/{id} | Update LoggerConfig

<a name="systemLoggerGet"></a>
# **systemLoggerGet**
> InlineResponse20037 systemLoggerGet()

Get a list of LoggerConfig objects

Get a list of LoggerConfig objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.LoggerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LoggerApi apiInstance = new LoggerApi();
try {
    InlineResponse20037 result = apiInstance.systemLoggerGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggerApi#systemLoggerGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20037**](InlineResponse20037.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemLoggerIdGet"></a>
# **systemLoggerIdGet**
> InlineResponse20037 systemLoggerIdGet(id)

Get LoggerConfig by ID

Get LoggerConfig by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.LoggerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LoggerApi apiInstance = new LoggerApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20037 result = apiInstance.systemLoggerIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggerApi#systemLoggerIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20037**](InlineResponse20037.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemLoggerIdPatch"></a>
# **systemLoggerIdPatch**
> InlineResponse20037 systemLoggerIdPatch(id, body)

Update LoggerConfig

Update LoggerConfig

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.LoggerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LoggerApi apiInstance = new LoggerApi();
String id = "id_example"; // String | Unique ID
LoggerConfig body = new LoggerConfig(); // LoggerConfig | LoggerConfig object to be updated
try {
    InlineResponse20037 result = apiInstance.systemLoggerIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggerApi#systemLoggerIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**LoggerConfig**](LoggerConfig.md)| LoggerConfig object to be updated | [optional]

### Return type

[**InlineResponse20037**](InlineResponse20037.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

