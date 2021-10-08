# FunctionsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**functionsGet**](FunctionsApi.md#functionsGet) | **GET** /functions | Get a list of Function objects
[**functionsIdGet**](FunctionsApi.md#functionsIdGet) | **GET** /functions/{id} | Get Function by ID

<a name="functionsGet"></a>
# **functionsGet**
> InlineResponse20053 functionsGet()

Get a list of Function objects

Get a list of Function objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.FunctionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FunctionsApi apiInstance = new FunctionsApi();
try {
    InlineResponse20053 result = apiInstance.functionsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FunctionsApi#functionsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20053**](InlineResponse20053.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="functionsIdGet"></a>
# **functionsIdGet**
> InlineResponse20053 functionsIdGet(id)

Get Function by ID

Get Function by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.FunctionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FunctionsApi apiInstance = new FunctionsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20053 result = apiInstance.functionsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FunctionsApi#functionsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20053**](InlineResponse20053.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

