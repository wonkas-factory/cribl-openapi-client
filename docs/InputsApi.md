# InputsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemInputsGet**](InputsApi.md#systemInputsGet) | **GET** /system/inputs | Get a list of Input objects
[**systemInputsIdDelete**](InputsApi.md#systemInputsIdDelete) | **DELETE** /system/inputs/{id} | Delete Input
[**systemInputsIdGet**](InputsApi.md#systemInputsIdGet) | **GET** /system/inputs/{id} | Get Input by ID
[**systemInputsIdHectokenPost**](InputsApi.md#systemInputsIdHectokenPost) | **POST** /system/inputs/{id}/hectoken | Add token and optional metadata to an existing hec input
[**systemInputsIdHectokenTokenPatch**](InputsApi.md#systemInputsIdHectokenTokenPatch) | **PATCH** /system/inputs/{id}/hectoken/{token} | Update token metadata on existing hec input
[**systemInputsIdPatch**](InputsApi.md#systemInputsIdPatch) | **PATCH** /system/inputs/{id} | Update Input
[**systemInputsPost**](InputsApi.md#systemInputsPost) | **POST** /system/inputs | Create Input
[**systemStatusInputsGet**](InputsApi.md#systemStatusInputsGet) | **GET** /system/status/inputs | Get a list of InputStatus objects
[**systemStatusInputsIdGet**](InputsApi.md#systemStatusInputsIdGet) | **GET** /system/status/inputs/{id} | Get InputStatus by ID

<a name="systemInputsGet"></a>
# **systemInputsGet**
> InlineResponse20014 systemInputsGet()

Get a list of Input objects

Get a list of Input objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.InputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InputsApi apiInstance = new InputsApi();
try {
    InlineResponse20014 result = apiInstance.systemInputsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputsApi#systemInputsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemInputsIdDelete"></a>
# **systemInputsIdDelete**
> InlineResponse20014 systemInputsIdDelete(id)

Delete Input

Delete Input

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.InputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InputsApi apiInstance = new InputsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20014 result = apiInstance.systemInputsIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputsApi#systemInputsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemInputsIdGet"></a>
# **systemInputsIdGet**
> InlineResponse20014 systemInputsIdGet(id)

Get Input by ID

Get Input by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.InputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InputsApi apiInstance = new InputsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20014 result = apiInstance.systemInputsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputsApi#systemInputsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemInputsIdHectokenPost"></a>
# **systemInputsIdHectokenPost**
> InlineResponse20015 systemInputsIdHectokenPost(id, body)

Add token and optional metadata to an existing hec input

Add token and optional metadata to an existing hec input

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.InputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InputsApi apiInstance = new InputsApi();
String id = "id_example"; // String | hec input id
AddHecTokenRequest body = new AddHecTokenRequest(); // AddHecTokenRequest | AddHecTokenRequest object
try {
    InlineResponse20015 result = apiInstance.systemInputsIdHectokenPost(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputsApi#systemInputsIdHectokenPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| hec input id |
 **body** | [**AddHecTokenRequest**](AddHecTokenRequest.md)| AddHecTokenRequest object | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemInputsIdHectokenTokenPatch"></a>
# **systemInputsIdHectokenTokenPatch**
> InlineResponse20015 systemInputsIdHectokenTokenPatch(id, token, body)

Update token metadata on existing hec input

Update token metadata on existing hec input

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.InputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InputsApi apiInstance = new InputsApi();
String id = "id_example"; // String | hec input id
String token = "token_example"; // String | token to update
UpdateHecTokenRequest body = new UpdateHecTokenRequest(); // UpdateHecTokenRequest | UpdateHecTokenRequest object
try {
    InlineResponse20015 result = apiInstance.systemInputsIdHectokenTokenPatch(id, token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputsApi#systemInputsIdHectokenTokenPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| hec input id |
 **token** | **String**| token to update |
 **body** | [**UpdateHecTokenRequest**](UpdateHecTokenRequest.md)| UpdateHecTokenRequest object | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemInputsIdPatch"></a>
# **systemInputsIdPatch**
> InlineResponse20014 systemInputsIdPatch(id, body)

Update Input

Update Input

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.InputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InputsApi apiInstance = new InputsApi();
String id = "id_example"; // String | Unique ID
Input body = new Input(); // Input | Input object to be updated
try {
    InlineResponse20014 result = apiInstance.systemInputsIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputsApi#systemInputsIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**Input**](Input.md)| Input object to be updated | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemInputsPost"></a>
# **systemInputsPost**
> InlineResponse20014 systemInputsPost(body)

Create Input

Create Input

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.InputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InputsApi apiInstance = new InputsApi();
Input body = new Input(); // Input | New Input object
try {
    InlineResponse20014 result = apiInstance.systemInputsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputsApi#systemInputsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Input**](Input.md)| New Input object | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemStatusInputsGet"></a>
# **systemStatusInputsGet**
> InlineResponse20024 systemStatusInputsGet()

Get a list of InputStatus objects

Get a list of InputStatus objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.InputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InputsApi apiInstance = new InputsApi();
try {
    InlineResponse20024 result = apiInstance.systemStatusInputsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputsApi#systemStatusInputsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemStatusInputsIdGet"></a>
# **systemStatusInputsIdGet**
> InlineResponse20024 systemStatusInputsIdGet(id)

Get InputStatus by ID

Get InputStatus by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.InputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InputsApi apiInstance = new InputsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20024 result = apiInstance.systemStatusInputsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputsApi#systemStatusInputsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

