# PipelinesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pipelinesGet**](PipelinesApi.md#pipelinesGet) | **GET** /pipelines | Get a list of Pipeline objects
[**pipelinesIdDelete**](PipelinesApi.md#pipelinesIdDelete) | **DELETE** /pipelines/{id} | Delete Pipeline
[**pipelinesIdGet**](PipelinesApi.md#pipelinesIdGet) | **GET** /pipelines/{id} | Get Pipeline by ID
[**pipelinesIdPatch**](PipelinesApi.md#pipelinesIdPatch) | **PATCH** /pipelines/{id} | Update Pipeline
[**pipelinesPost**](PipelinesApi.md#pipelinesPost) | **POST** /pipelines | Create Pipeline

<a name="pipelinesGet"></a>
# **pipelinesGet**
> InlineResponse20019 pipelinesGet()

Get a list of Pipeline objects

Get a list of Pipeline objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PipelinesApi apiInstance = new PipelinesApi();
try {
    InlineResponse20019 result = apiInstance.pipelinesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#pipelinesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pipelinesIdDelete"></a>
# **pipelinesIdDelete**
> InlineResponse20019 pipelinesIdDelete(id)

Delete Pipeline

Delete Pipeline

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PipelinesApi apiInstance = new PipelinesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20019 result = apiInstance.pipelinesIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#pipelinesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pipelinesIdGet"></a>
# **pipelinesIdGet**
> InlineResponse20019 pipelinesIdGet(id)

Get Pipeline by ID

Get Pipeline by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PipelinesApi apiInstance = new PipelinesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20019 result = apiInstance.pipelinesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#pipelinesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pipelinesIdPatch"></a>
# **pipelinesIdPatch**
> InlineResponse20019 pipelinesIdPatch(id, body)

Update Pipeline

Update Pipeline

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PipelinesApi apiInstance = new PipelinesApi();
String id = "id_example"; // String | Unique ID
Pipeline body = new Pipeline(); // Pipeline | Pipeline object to be updated
try {
    InlineResponse20019 result = apiInstance.pipelinesIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#pipelinesIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**Pipeline**](Pipeline.md)| Pipeline object to be updated | [optional]

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pipelinesPost"></a>
# **pipelinesPost**
> InlineResponse20019 pipelinesPost(body)

Create Pipeline

Create Pipeline

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PipelinesApi apiInstance = new PipelinesApi();
Pipeline body = new Pipeline(); // Pipeline | New Pipeline object
try {
    InlineResponse20019 result = apiInstance.pipelinesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#pipelinesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pipeline**](Pipeline.md)| New Pipeline object | [optional]

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

