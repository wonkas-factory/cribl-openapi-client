# SchemasApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**libSchemasGet**](SchemasApi.md#libSchemasGet) | **GET** /lib/schemas | Get a list of Schema objects
[**libSchemasIdDelete**](SchemasApi.md#libSchemasIdDelete) | **DELETE** /lib/schemas/{id} | Delete Schema
[**libSchemasIdGet**](SchemasApi.md#libSchemasIdGet) | **GET** /lib/schemas/{id} | Get Schema by ID
[**libSchemasIdPatch**](SchemasApi.md#libSchemasIdPatch) | **PATCH** /lib/schemas/{id} | Update Schema
[**libSchemasPost**](SchemasApi.md#libSchemasPost) | **POST** /lib/schemas | Create Schema

<a name="libSchemasGet"></a>
# **libSchemasGet**
> InlineResponse20022 libSchemasGet()

Get a list of Schema objects

Get a list of Schema objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SchemasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SchemasApi apiInstance = new SchemasApi();
try {
    InlineResponse20022 result = apiInstance.libSchemasGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemasApi#libSchemasGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="libSchemasIdDelete"></a>
# **libSchemasIdDelete**
> InlineResponse20022 libSchemasIdDelete(id)

Delete Schema

Delete Schema

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SchemasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SchemasApi apiInstance = new SchemasApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20022 result = apiInstance.libSchemasIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemasApi#libSchemasIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="libSchemasIdGet"></a>
# **libSchemasIdGet**
> InlineResponse20022 libSchemasIdGet(id)

Get Schema by ID

Get Schema by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SchemasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SchemasApi apiInstance = new SchemasApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20022 result = apiInstance.libSchemasIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemasApi#libSchemasIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="libSchemasIdPatch"></a>
# **libSchemasIdPatch**
> InlineResponse20022 libSchemasIdPatch(id, body)

Update Schema

Update Schema

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SchemasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SchemasApi apiInstance = new SchemasApi();
String id = "id_example"; // String | Unique ID
Map<String, Object> body = new Map(); // Map<String, Object> | Schema object to be updated
try {
    InlineResponse20022 result = apiInstance.libSchemasIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemasApi#libSchemasIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)| Schema object to be updated | [optional]

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="libSchemasPost"></a>
# **libSchemasPost**
> InlineResponse20022 libSchemasPost(body)

Create Schema

Create Schema

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SchemasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SchemasApi apiInstance = new SchemasApi();
Map<String, Object> body = new Map(); // Map<String, Object> | New Schema object
try {
    InlineResponse20022 result = apiInstance.libSchemasPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemasApi#libSchemasPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Map&lt;String, Object&gt;**](Map.md)| New Schema object | [optional]

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

