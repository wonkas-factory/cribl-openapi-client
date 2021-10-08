# GlobalVariablesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**libVarsGet**](GlobalVariablesApi.md#libVarsGet) | **GET** /lib/vars | Get a list of Global Variable objects
[**libVarsIdDelete**](GlobalVariablesApi.md#libVarsIdDelete) | **DELETE** /lib/vars/{id} | Delete Global Variable
[**libVarsIdGet**](GlobalVariablesApi.md#libVarsIdGet) | **GET** /lib/vars/{id} | Get Global Variable by ID
[**libVarsIdPatch**](GlobalVariablesApi.md#libVarsIdPatch) | **PATCH** /lib/vars/{id} | Update Global Variable
[**libVarsPost**](GlobalVariablesApi.md#libVarsPost) | **POST** /lib/vars | Create Global Variable

<a name="libVarsGet"></a>
# **libVarsGet**
> InlineResponse20013 libVarsGet()

Get a list of Global Variable objects

Get a list of Global Variable objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GlobalVariablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GlobalVariablesApi apiInstance = new GlobalVariablesApi();
try {
    InlineResponse20013 result = apiInstance.libVarsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalVariablesApi#libVarsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="libVarsIdDelete"></a>
# **libVarsIdDelete**
> InlineResponse20013 libVarsIdDelete(id)

Delete Global Variable

Delete Global Variable

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GlobalVariablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GlobalVariablesApi apiInstance = new GlobalVariablesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20013 result = apiInstance.libVarsIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalVariablesApi#libVarsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="libVarsIdGet"></a>
# **libVarsIdGet**
> InlineResponse20013 libVarsIdGet(id)

Get Global Variable by ID

Get Global Variable by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GlobalVariablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GlobalVariablesApi apiInstance = new GlobalVariablesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20013 result = apiInstance.libVarsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalVariablesApi#libVarsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="libVarsIdPatch"></a>
# **libVarsIdPatch**
> InlineResponse20013 libVarsIdPatch(id, body)

Update Global Variable

Update Global Variable

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GlobalVariablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GlobalVariablesApi apiInstance = new GlobalVariablesApi();
String id = "id_example"; // String | Unique ID
GlobalVar body = new GlobalVar(); // GlobalVar | Global Variable object to be updated
try {
    InlineResponse20013 result = apiInstance.libVarsIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalVariablesApi#libVarsIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**GlobalVar**](GlobalVar.md)| Global Variable object to be updated | [optional]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="libVarsPost"></a>
# **libVarsPost**
> InlineResponse20013 libVarsPost(body)

Create Global Variable

Create Global Variable

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GlobalVariablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GlobalVariablesApi apiInstance = new GlobalVariablesApi();
GlobalVar body = new GlobalVar(); // GlobalVar | New Global Variable object
try {
    InlineResponse20013 result = apiInstance.libVarsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalVariablesApi#libVarsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GlobalVar**](GlobalVar.md)| New Global Variable object | [optional]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

