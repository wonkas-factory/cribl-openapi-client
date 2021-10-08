# PoliciesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemPoliciesGet**](PoliciesApi.md#systemPoliciesGet) | **GET** /system/policies | Get a list of PolicyRule objects
[**systemPoliciesIdDelete**](PoliciesApi.md#systemPoliciesIdDelete) | **DELETE** /system/policies/{id} | Delete PolicyRule
[**systemPoliciesIdGet**](PoliciesApi.md#systemPoliciesIdGet) | **GET** /system/policies/{id} | Get PolicyRule by ID
[**systemPoliciesIdPatch**](PoliciesApi.md#systemPoliciesIdPatch) | **PATCH** /system/policies/{id} | Update PolicyRule
[**systemPoliciesPost**](PoliciesApi.md#systemPoliciesPost) | **POST** /system/policies | Create PolicyRule

<a name="systemPoliciesGet"></a>
# **systemPoliciesGet**
> InlineResponse2007 systemPoliciesGet()

Get a list of PolicyRule objects

Get a list of PolicyRule objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PoliciesApi apiInstance = new PoliciesApi();
try {
    InlineResponse2007 result = apiInstance.systemPoliciesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#systemPoliciesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemPoliciesIdDelete"></a>
# **systemPoliciesIdDelete**
> InlineResponse2007 systemPoliciesIdDelete(id)

Delete PolicyRule

Delete PolicyRule

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PoliciesApi apiInstance = new PoliciesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2007 result = apiInstance.systemPoliciesIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#systemPoliciesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemPoliciesIdGet"></a>
# **systemPoliciesIdGet**
> InlineResponse2007 systemPoliciesIdGet(id)

Get PolicyRule by ID

Get PolicyRule by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PoliciesApi apiInstance = new PoliciesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2007 result = apiInstance.systemPoliciesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#systemPoliciesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemPoliciesIdPatch"></a>
# **systemPoliciesIdPatch**
> InlineResponse2007 systemPoliciesIdPatch(id, body)

Update PolicyRule

Update PolicyRule

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PoliciesApi apiInstance = new PoliciesApi();
String id = "id_example"; // String | Unique ID
PolicyRule body = new PolicyRule(); // PolicyRule | PolicyRule object to be updated
try {
    InlineResponse2007 result = apiInstance.systemPoliciesIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#systemPoliciesIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**PolicyRule**](PolicyRule.md)| PolicyRule object to be updated | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemPoliciesPost"></a>
# **systemPoliciesPost**
> InlineResponse2007 systemPoliciesPost(body)

Create PolicyRule

Create PolicyRule

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PoliciesApi apiInstance = new PoliciesApi();
PolicyRule body = new PolicyRule(); // PolicyRule | New PolicyRule object
try {
    InlineResponse2007 result = apiInstance.systemPoliciesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoliciesApi#systemPoliciesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PolicyRule**](PolicyRule.md)| New PolicyRule object | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

