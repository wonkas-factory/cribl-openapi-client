# RoutesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**routesGet**](RoutesApi.md#routesGet) | **GET** /routes | Get a list of Routes objects
[**routesIdGet**](RoutesApi.md#routesIdGet) | **GET** /routes/{id} | Get Routes by ID
[**routesIdPatch**](RoutesApi.md#routesIdPatch) | **PATCH** /routes/{id} | Update Routes

<a name="routesGet"></a>
# **routesGet**
> InlineResponse20021 routesGet()

Get a list of Routes objects

Get a list of Routes objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.RoutesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RoutesApi apiInstance = new RoutesApi();
try {
    InlineResponse20021 result = apiInstance.routesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#routesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="routesIdGet"></a>
# **routesIdGet**
> InlineResponse20021 routesIdGet(id)

Get Routes by ID

Get Routes by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.RoutesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RoutesApi apiInstance = new RoutesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20021 result = apiInstance.routesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#routesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="routesIdPatch"></a>
# **routesIdPatch**
> InlineResponse20021 routesIdPatch(id, body)

Update Routes

Update Routes

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.RoutesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RoutesApi apiInstance = new RoutesApi();
String id = "id_example"; // String | Unique ID
Routes body = new Routes(); // Routes | Routes object to be updated
try {
    InlineResponse20021 result = apiInstance.routesIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#routesIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**Routes**](Routes.md)| Routes object to be updated | [optional]

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

