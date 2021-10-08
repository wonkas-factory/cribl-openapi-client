# CluiApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cluiGet**](CluiApi.md#cluiGet) | **GET** /clui | Get CLUI search results

<a name="cluiGet"></a>
# **cluiGet**
> InlineResponse20030 cluiGet(query)

Get CLUI search results

Get CLUI search results

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.CluiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CluiApi apiInstance = new CluiApi();
String query = "query_example"; // String | Search query
try {
    InlineResponse20030 result = apiInstance.cluiGet(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CluiApi#cluiGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| Search query |

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

