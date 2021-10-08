# SecretsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemSecretsGet**](SecretsApi.md#systemSecretsGet) | **GET** /system/secrets | Get a list of RestSecret objects
[**systemSecretsIdDelete**](SecretsApi.md#systemSecretsIdDelete) | **DELETE** /system/secrets/{id} | Delete RestSecret
[**systemSecretsIdGet**](SecretsApi.md#systemSecretsIdGet) | **GET** /system/secrets/{id} | Get RestSecret by ID
[**systemSecretsIdPatch**](SecretsApi.md#systemSecretsIdPatch) | **PATCH** /system/secrets/{id} | Update RestSecret
[**systemSecretsPost**](SecretsApi.md#systemSecretsPost) | **POST** /system/secrets | Create RestSecret

<a name="systemSecretsGet"></a>
# **systemSecretsGet**
> InlineResponse20023 systemSecretsGet()

Get a list of RestSecret objects

Get a list of RestSecret objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SecretsApi apiInstance = new SecretsApi();
try {
    InlineResponse20023 result = apiInstance.systemSecretsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#systemSecretsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemSecretsIdDelete"></a>
# **systemSecretsIdDelete**
> InlineResponse20023 systemSecretsIdDelete(id)

Delete RestSecret

Delete RestSecret

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SecretsApi apiInstance = new SecretsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20023 result = apiInstance.systemSecretsIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#systemSecretsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemSecretsIdGet"></a>
# **systemSecretsIdGet**
> InlineResponse20023 systemSecretsIdGet(id)

Get RestSecret by ID

Get RestSecret by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SecretsApi apiInstance = new SecretsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20023 result = apiInstance.systemSecretsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#systemSecretsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemSecretsIdPatch"></a>
# **systemSecretsIdPatch**
> InlineResponse20023 systemSecretsIdPatch(id, body)

Update RestSecret

Update RestSecret

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SecretsApi apiInstance = new SecretsApi();
String id = "id_example"; // String | Unique ID
RestSecret body = new RestSecret(); // RestSecret | RestSecret object to be updated
try {
    InlineResponse20023 result = apiInstance.systemSecretsIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#systemSecretsIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**RestSecret**](RestSecret.md)| RestSecret object to be updated | [optional]

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemSecretsPost"></a>
# **systemSecretsPost**
> InlineResponse20023 systemSecretsPost(body)

Create RestSecret

Create RestSecret

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SecretsApi apiInstance = new SecretsApi();
RestSecret body = new RestSecret(); // RestSecret | New RestSecret object
try {
    InlineResponse20023 result = apiInstance.systemSecretsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#systemSecretsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RestSecret**](RestSecret.md)| New RestSecret object | [optional]

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

