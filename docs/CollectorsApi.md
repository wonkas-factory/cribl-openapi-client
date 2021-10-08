# CollectorsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**collectorsGet**](CollectorsApi.md#collectorsGet) | **GET** /collectors | Get a list of Collector objects
[**collectorsIdGet**](CollectorsApi.md#collectorsIdGet) | **GET** /collectors/{id} | Get Collector by ID

<a name="collectorsGet"></a>
# **collectorsGet**
> InlineResponse20051 collectorsGet()

Get a list of Collector objects

Get a list of Collector objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.CollectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CollectorsApi apiInstance = new CollectorsApi();
try {
    InlineResponse20051 result = apiInstance.collectorsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectorsApi#collectorsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20051**](InlineResponse20051.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectorsIdGet"></a>
# **collectorsIdGet**
> InlineResponse20051 collectorsIdGet(id)

Get Collector by ID

Get Collector by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.CollectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CollectorsApi apiInstance = new CollectorsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20051 result = apiInstance.collectorsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectorsApi#collectorsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20051**](InlineResponse20051.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

