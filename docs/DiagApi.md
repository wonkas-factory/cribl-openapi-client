# DiagApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthGet**](DiagApi.md#healthGet) | **GET** /health | Provides information about the REST server&#x27;s health
[**systemDiagDelete**](DiagApi.md#systemDiagDelete) | **DELETE** /system/diag | Remove diag bundle
[**systemDiagDownloadGet**](DiagApi.md#systemDiagDownloadGet) | **GET** /system/diag/download | Returns a diag bundle as a tar.gz archive
[**systemDiagGet**](DiagApi.md#systemDiagGet) | **GET** /system/diag | Get list of existing diag bundles
[**systemDiagSendPost**](DiagApi.md#systemDiagSendPost) | **POST** /system/diag/send | Send a diag bundle (tar.gz archive) to Cribl
[**systemInfoGet**](DiagApi.md#systemInfoGet) | **GET** /system/info | Get basic system information

<a name="healthGet"></a>
# **healthGet**
> HealthStatus healthGet()

Provides information about the REST server&#x27;s health

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.service.DiagApi;


DiagApi apiInstance = new DiagApi();
try {
    HealthStatus result = apiInstance.healthGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagApi#healthGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HealthStatus**](HealthStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemDiagDelete"></a>
# **systemDiagDelete**
> InlineResponse20015 systemDiagDelete(path)

Remove diag bundle

Remove diag bundle

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.DiagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DiagApi apiInstance = new DiagApi();
String path = "path_example"; // String | Diag bundle path
try {
    InlineResponse20015 result = apiInstance.systemDiagDelete(path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagApi#systemDiagDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Diag bundle path |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemDiagDownloadGet"></a>
# **systemDiagDownloadGet**
> File systemDiagDownloadGet()

Returns a diag bundle as a tar.gz archive

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.DiagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DiagApi apiInstance = new DiagApi();
try {
    File result = apiInstance.systemDiagDownloadGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagApi#systemDiagDownloadGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/tar+gzip

<a name="systemDiagGet"></a>
# **systemDiagGet**
> InlineResponse20043 systemDiagGet()

Get list of existing diag bundles

Get list of existing diag bundles

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.DiagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DiagApi apiInstance = new DiagApi();
try {
    InlineResponse20043 result = apiInstance.systemDiagGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagApi#systemDiagGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20043**](InlineResponse20043.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemDiagSendPost"></a>
# **systemDiagSendPost**
> InlineResponse20015 systemDiagSendPost(body)

Send a diag bundle (tar.gz archive) to Cribl

Send a diag bundle (tar.gz archive) to Cribl

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.DiagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DiagApi apiInstance = new DiagApi();
SendDiagBundle body = new SendDiagBundle(); // SendDiagBundle | SendDiagBundle object
try {
    InlineResponse20015 result = apiInstance.systemDiagSendPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagApi#systemDiagSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendDiagBundle**](SendDiagBundle.md)| SendDiagBundle object | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemInfoGet"></a>
# **systemInfoGet**
> InlineResponse20042 systemInfoGet()

Get basic system information

Get basic system information

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.DiagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DiagApi apiInstance = new DiagApi();
try {
    InlineResponse20042 result = apiInstance.systemInfoGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagApi#systemInfoGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20042**](InlineResponse20042.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

