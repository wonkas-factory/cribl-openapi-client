# UiStateApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uiKeyGet**](UiStateApi.md#uiKeyGet) | **GET** /ui/{key} | Get UI state by key
[**uiKeyPatch**](UiStateApi.md#uiKeyPatch) | **PATCH** /ui/{key} | Update UI state by key

<a name="uiKeyGet"></a>
# **uiKeyGet**
> InlineResponse20015 uiKeyGet(key)

Get UI state by key

Get UI state by key

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.UiStateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UiStateApi apiInstance = new UiStateApi();
String key = "key_example"; // String | UI state key
try {
    InlineResponse20015 result = apiInstance.uiKeyGet(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiStateApi#uiKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| UI state key |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uiKeyPatch"></a>
# **uiKeyPatch**
> InlineResponse20015 uiKeyPatch(key)

Update UI state by key

Update UI state by key

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.UiStateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UiStateApi apiInstance = new UiStateApi();
String key = "key_example"; // String | UI state key
try {
    InlineResponse20015 result = apiInstance.uiKeyPatch(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UiStateApi#uiKeyPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| UI state key |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

