# KeysApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemKeysGet**](KeysApi.md#systemKeysGet) | **GET** /system/keys | Get a list of KeyMetadataEntity objects
[**systemKeysIdDelete**](KeysApi.md#systemKeysIdDelete) | **DELETE** /system/keys/{id} | Delete KeyMetadataEntity
[**systemKeysIdGet**](KeysApi.md#systemKeysIdGet) | **GET** /system/keys/{id} | Get KeyMetadataEntity by ID
[**systemKeysIdPatch**](KeysApi.md#systemKeysIdPatch) | **PATCH** /system/keys/{id} | Update KeyMetadataEntity
[**systemKeysPost**](KeysApi.md#systemKeysPost) | **POST** /system/keys | Create KeyMetadataEntity

<a name="systemKeysGet"></a>
# **systemKeysGet**
> InlineResponse2002 systemKeysGet()

Get a list of KeyMetadataEntity objects

Get a list of KeyMetadataEntity objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.KeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


KeysApi apiInstance = new KeysApi();
try {
    InlineResponse2002 result = apiInstance.systemKeysGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeysApi#systemKeysGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemKeysIdDelete"></a>
# **systemKeysIdDelete**
> InlineResponse2002 systemKeysIdDelete(id)

Delete KeyMetadataEntity

Delete KeyMetadataEntity

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.KeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


KeysApi apiInstance = new KeysApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2002 result = apiInstance.systemKeysIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeysApi#systemKeysIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemKeysIdGet"></a>
# **systemKeysIdGet**
> InlineResponse2002 systemKeysIdGet(id)

Get KeyMetadataEntity by ID

Get KeyMetadataEntity by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.KeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


KeysApi apiInstance = new KeysApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2002 result = apiInstance.systemKeysIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeysApi#systemKeysIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemKeysIdPatch"></a>
# **systemKeysIdPatch**
> InlineResponse2002 systemKeysIdPatch(id, body)

Update KeyMetadataEntity

Update KeyMetadataEntity

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.KeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


KeysApi apiInstance = new KeysApi();
String id = "id_example"; // String | Unique ID
KeyMetadataEntity body = new KeyMetadataEntity(); // KeyMetadataEntity | KeyMetadataEntity object to be updated
try {
    InlineResponse2002 result = apiInstance.systemKeysIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeysApi#systemKeysIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**KeyMetadataEntity**](KeyMetadataEntity.md)| KeyMetadataEntity object to be updated | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemKeysPost"></a>
# **systemKeysPost**
> InlineResponse2002 systemKeysPost(body)

Create KeyMetadataEntity

Create KeyMetadataEntity

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.KeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


KeysApi apiInstance = new KeysApi();
KeyMetadataEntity body = new KeyMetadataEntity(); // KeyMetadataEntity | New KeyMetadataEntity object
try {
    InlineResponse2002 result = apiInstance.systemKeysPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeysApi#systemKeysPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KeyMetadataEntity**](KeyMetadataEntity.md)| New KeyMetadataEntity object | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

