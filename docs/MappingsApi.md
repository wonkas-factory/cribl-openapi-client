# MappingsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mappingsGet**](MappingsApi.md#mappingsGet) | **GET** /mappings | Get a list of MappingRuleset objects
[**mappingsIdDelete**](MappingsApi.md#mappingsIdDelete) | **DELETE** /mappings/{id} | Delete MappingRuleset
[**mappingsIdGet**](MappingsApi.md#mappingsIdGet) | **GET** /mappings/{id} | Get MappingRuleset by ID
[**mappingsIdPatch**](MappingsApi.md#mappingsIdPatch) | **PATCH** /mappings/{id} | Update MappingRuleset
[**mappingsPost**](MappingsApi.md#mappingsPost) | **POST** /mappings | Create MappingRuleset

<a name="mappingsGet"></a>
# **mappingsGet**
> InlineResponse2003 mappingsGet()

Get a list of MappingRuleset objects

Get a list of MappingRuleset objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.MappingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MappingsApi apiInstance = new MappingsApi();
try {
    InlineResponse2003 result = apiInstance.mappingsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingsApi#mappingsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="mappingsIdDelete"></a>
# **mappingsIdDelete**
> InlineResponse2003 mappingsIdDelete(id)

Delete MappingRuleset

Delete MappingRuleset

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.MappingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MappingsApi apiInstance = new MappingsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2003 result = apiInstance.mappingsIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingsApi#mappingsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="mappingsIdGet"></a>
# **mappingsIdGet**
> InlineResponse2003 mappingsIdGet(id)

Get MappingRuleset by ID

Get MappingRuleset by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.MappingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MappingsApi apiInstance = new MappingsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2003 result = apiInstance.mappingsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingsApi#mappingsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="mappingsIdPatch"></a>
# **mappingsIdPatch**
> InlineResponse2003 mappingsIdPatch(id, body)

Update MappingRuleset

Update MappingRuleset

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.MappingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MappingsApi apiInstance = new MappingsApi();
String id = "id_example"; // String | Unique ID
MappingRuleset body = new MappingRuleset(); // MappingRuleset | MappingRuleset object to be updated
try {
    InlineResponse2003 result = apiInstance.mappingsIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingsApi#mappingsIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**MappingRuleset**](MappingRuleset.md)| MappingRuleset object to be updated | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mappingsPost"></a>
# **mappingsPost**
> InlineResponse2003 mappingsPost(body)

Create MappingRuleset

Create MappingRuleset

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.MappingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MappingsApi apiInstance = new MappingsApi();
MappingRuleset body = new MappingRuleset(); // MappingRuleset | New MappingRuleset object
try {
    InlineResponse2003 result = apiInstance.mappingsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingsApi#mappingsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MappingRuleset**](MappingRuleset.md)| New MappingRuleset object | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

