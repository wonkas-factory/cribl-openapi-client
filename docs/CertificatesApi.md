# CertificatesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemCertificatesGet**](CertificatesApi.md#systemCertificatesGet) | **GET** /system/certificates | Get a list of Certificate objects
[**systemCertificatesIdDelete**](CertificatesApi.md#systemCertificatesIdDelete) | **DELETE** /system/certificates/{id} | Delete Certificate
[**systemCertificatesIdGet**](CertificatesApi.md#systemCertificatesIdGet) | **GET** /system/certificates/{id} | Get Certificate by ID
[**systemCertificatesIdPatch**](CertificatesApi.md#systemCertificatesIdPatch) | **PATCH** /system/certificates/{id} | Update Certificate
[**systemCertificatesPost**](CertificatesApi.md#systemCertificatesPost) | **POST** /system/certificates | Create Certificate

<a name="systemCertificatesGet"></a>
# **systemCertificatesGet**
> InlineResponse200 systemCertificatesGet()

Get a list of Certificate objects

Get a list of Certificate objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.CertificatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CertificatesApi apiInstance = new CertificatesApi();
try {
    InlineResponse200 result = apiInstance.systemCertificatesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesApi#systemCertificatesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemCertificatesIdDelete"></a>
# **systemCertificatesIdDelete**
> InlineResponse200 systemCertificatesIdDelete(id)

Delete Certificate

Delete Certificate

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.CertificatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CertificatesApi apiInstance = new CertificatesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse200 result = apiInstance.systemCertificatesIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesApi#systemCertificatesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemCertificatesIdGet"></a>
# **systemCertificatesIdGet**
> InlineResponse200 systemCertificatesIdGet(id)

Get Certificate by ID

Get Certificate by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.CertificatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CertificatesApi apiInstance = new CertificatesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse200 result = apiInstance.systemCertificatesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesApi#systemCertificatesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemCertificatesIdPatch"></a>
# **systemCertificatesIdPatch**
> InlineResponse200 systemCertificatesIdPatch(id, body)

Update Certificate

Update Certificate

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.CertificatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CertificatesApi apiInstance = new CertificatesApi();
String id = "id_example"; // String | Unique ID
Certificate body = new Certificate(); // Certificate | Certificate object to be updated
try {
    InlineResponse200 result = apiInstance.systemCertificatesIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesApi#systemCertificatesIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**Certificate**](Certificate.md)| Certificate object to be updated | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemCertificatesPost"></a>
# **systemCertificatesPost**
> InlineResponse200 systemCertificatesPost(body)

Create Certificate

Create Certificate

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.CertificatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CertificatesApi apiInstance = new CertificatesApi();
Certificate body = new Certificate(); // Certificate | New Certificate object
try {
    InlineResponse200 result = apiInstance.systemCertificatesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesApi#systemCertificatesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Certificate**](Certificate.md)| New Certificate object | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

