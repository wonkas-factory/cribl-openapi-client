# ProcessesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemProcessesGet**](ProcessesApi.md#systemProcessesGet) | **GET** /system/processes | Get a list of processes under management

<a name="systemProcessesGet"></a>
# **systemProcessesGet**
> InlineResponse20040 systemProcessesGet()

Get a list of processes under management

Get a list of processes under management

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ProcessesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProcessesApi apiInstance = new ProcessesApi();
try {
    InlineResponse20040 result = apiInstance.systemProcessesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessesApi#systemProcessesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20040**](InlineResponse20040.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

