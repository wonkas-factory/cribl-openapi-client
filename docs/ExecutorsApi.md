# ExecutorsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executorsGet**](ExecutorsApi.md#executorsGet) | **GET** /executors | Get a list of Executor objects
[**executorsIdGet**](ExecutorsApi.md#executorsIdGet) | **GET** /executors/{id} | Get Executor by ID

<a name="executorsGet"></a>
# **executorsGet**
> InlineResponse20052 executorsGet()

Get a list of Executor objects

Get a list of Executor objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ExecutorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExecutorsApi apiInstance = new ExecutorsApi();
try {
    InlineResponse20052 result = apiInstance.executorsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutorsApi#executorsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20052**](InlineResponse20052.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="executorsIdGet"></a>
# **executorsIdGet**
> InlineResponse20052 executorsIdGet(id)

Get Executor by ID

Get Executor by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ExecutorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExecutorsApi apiInstance = new ExecutorsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20052 result = apiInstance.executorsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutorsApi#executorsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20052**](InlineResponse20052.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

