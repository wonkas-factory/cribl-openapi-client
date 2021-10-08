# PacksApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**packsGet**](PacksApi.md#packsGet) | **GET** /packs | Export Pack
[**packsIdDelete**](PacksApi.md#packsIdDelete) | **DELETE** /packs/{id} | Uninstall Pack from the system
[**packsIdPatch**](PacksApi.md#packsIdPatch) | **PATCH** /packs/{id} | Upgrade Pack
[**packsPost**](PacksApi.md#packsPost) | **POST** /packs | Install Pack
[**packsPut**](PacksApi.md#packsPut) | **PUT** /packs | Upload Pack

<a name="packsGet"></a>
# **packsGet**
> InlineResponse20015 packsGet(mode, dest)

Export Pack

Export Pack

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PacksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PacksApi apiInstance = new PacksApi();
String mode = "mode_example"; // String | Export mode, one of \"merge_safe\", \"merge\", \"default_only\"
String dest = "dest_example"; // String | Override name of the exported pack
try {
    InlineResponse20015 result = apiInstance.packsGet(mode, dest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PacksApi#packsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mode** | **String**| Export mode, one of \&quot;merge_safe\&quot;, \&quot;merge\&quot;, \&quot;default_only\&quot; |
 **dest** | **String**| Override name of the exported pack | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="packsIdDelete"></a>
# **packsIdDelete**
> InlineResponse20039 packsIdDelete(id)

Uninstall Pack from the system

Uninstall Pack from the system

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PacksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PacksApi apiInstance = new PacksApi();
String id = "id_example"; // String | Pack name
try {
    InlineResponse20039 result = apiInstance.packsIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PacksApi#packsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Pack name |

### Return type

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="packsIdPatch"></a>
# **packsIdPatch**
> InlineResponse20039 packsIdPatch(id, source, minor, spec)

Upgrade Pack

Upgrade Pack

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PacksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PacksApi apiInstance = new PacksApi();
String id = "id_example"; // String | Pack name
String source = "source_example"; // String | body string required Pack source
String minor = "minor_example"; // String | body boolean optional Only upgrade to minor/patch versions
String spec = "spec_example"; // String | body string optional Specify a branch, tag or a semver spec
try {
    InlineResponse20039 result = apiInstance.packsIdPatch(id, source, minor, spec);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PacksApi#packsIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Pack name |
 **source** | **String**| body string required Pack source | [optional]
 **minor** | **String**| body boolean optional Only upgrade to minor/patch versions | [optional]
 **spec** | **String**| body string optional Specify a branch, tag or a semver spec | [optional]

### Return type

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="packsPost"></a>
# **packsPost**
> InlineResponse20039 packsPost(body)

Install Pack

Install Pack

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PacksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PacksApi apiInstance = new PacksApi();
CrudEntityBase body = new CrudEntityBase(); // CrudEntityBase | CrudEntityBase object
try {
    InlineResponse20039 result = apiInstance.packsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PacksApi#packsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CrudEntityBase**](CrudEntityBase.md)| CrudEntityBase object | [optional]

### Return type

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packsPut"></a>
# **packsPut**
> InlineResponse20015 packsPut(filename)

Upload Pack

Upload Pack

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PacksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PacksApi apiInstance = new PacksApi();
String filename = "filename_example"; // String | the file to upload
try {
    InlineResponse20015 result = apiInstance.packsPut(filename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PacksApi#packsPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **String**| the file to upload | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

