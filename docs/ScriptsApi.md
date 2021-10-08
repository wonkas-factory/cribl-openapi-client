# ScriptsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemScriptsGet**](ScriptsApi.md#systemScriptsGet) | **GET** /system/scripts | Get a list of Script objects
[**systemScriptsIdDelete**](ScriptsApi.md#systemScriptsIdDelete) | **DELETE** /system/scripts/{id} | Delete Script
[**systemScriptsIdGet**](ScriptsApi.md#systemScriptsIdGet) | **GET** /system/scripts/{id} | Get Script by ID
[**systemScriptsIdPatch**](ScriptsApi.md#systemScriptsIdPatch) | **PATCH** /system/scripts/{id} | Update Script
[**systemScriptsPost**](ScriptsApi.md#systemScriptsPost) | **POST** /system/scripts | Create Script

<a name="systemScriptsGet"></a>
# **systemScriptsGet**
> InlineResponse20010 systemScriptsGet()

Get a list of Script objects

Get a list of Script objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ScriptsApi apiInstance = new ScriptsApi();
try {
    InlineResponse20010 result = apiInstance.systemScriptsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#systemScriptsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemScriptsIdDelete"></a>
# **systemScriptsIdDelete**
> InlineResponse20010 systemScriptsIdDelete(id)

Delete Script

Delete Script

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ScriptsApi apiInstance = new ScriptsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20010 result = apiInstance.systemScriptsIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#systemScriptsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemScriptsIdGet"></a>
# **systemScriptsIdGet**
> InlineResponse20010 systemScriptsIdGet(id)

Get Script by ID

Get Script by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ScriptsApi apiInstance = new ScriptsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20010 result = apiInstance.systemScriptsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#systemScriptsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemScriptsIdPatch"></a>
# **systemScriptsIdPatch**
> InlineResponse20010 systemScriptsIdPatch(id, body)

Update Script

Update Script

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ScriptsApi apiInstance = new ScriptsApi();
String id = "id_example"; // String | Unique ID
Map<String, Object> body = new Map(); // Map<String, Object> | Script object to be updated
try {
    InlineResponse20010 result = apiInstance.systemScriptsIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#systemScriptsIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)| Script object to be updated | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemScriptsPost"></a>
# **systemScriptsPost**
> InlineResponse20010 systemScriptsPost(body)

Create Script

Create Script

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ScriptsApi apiInstance = new ScriptsApi();
Map<String, Object> body = new Map(); // Map<String, Object> | New Script object
try {
    InlineResponse20010 result = apiInstance.systemScriptsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#systemScriptsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Map&lt;String, Object&gt;**](Map.md)| New Script object | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

