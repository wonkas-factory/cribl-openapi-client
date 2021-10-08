# OutputsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemOutputsGet**](OutputsApi.md#systemOutputsGet) | **GET** /system/outputs | Get a list of Output objects
[**systemOutputsIdDelete**](OutputsApi.md#systemOutputsIdDelete) | **DELETE** /system/outputs/{id} | Delete Output
[**systemOutputsIdGet**](OutputsApi.md#systemOutputsIdGet) | **GET** /system/outputs/{id} | Get Output by ID
[**systemOutputsIdPatch**](OutputsApi.md#systemOutputsIdPatch) | **PATCH** /system/outputs/{id} | Update Output
[**systemOutputsIdSamplesGet**](OutputsApi.md#systemOutputsIdSamplesGet) | **GET** /system/outputs/{id}/samples | Retrieve samples data for the specified output. Used to get sample data for the test action.
[**systemOutputsIdTestPost**](OutputsApi.md#systemOutputsIdTestPost) | **POST** /system/outputs/{id}/test | Send sample data to an output to validate configuration or test connectivity
[**systemOutputsPost**](OutputsApi.md#systemOutputsPost) | **POST** /system/outputs | Create Output
[**systemStatusOutputsGet**](OutputsApi.md#systemStatusOutputsGet) | **GET** /system/status/outputs | Get a list of OutputStatus objects
[**systemStatusOutputsIdGet**](OutputsApi.md#systemStatusOutputsIdGet) | **GET** /system/status/outputs/{id} | Get OutputStatus by ID

<a name="systemOutputsGet"></a>
# **systemOutputsGet**
> InlineResponse20016 systemOutputsGet()

Get a list of Output objects

Get a list of Output objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.OutputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


OutputsApi apiInstance = new OutputsApi();
try {
    InlineResponse20016 result = apiInstance.systemOutputsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputsApi#systemOutputsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemOutputsIdDelete"></a>
# **systemOutputsIdDelete**
> InlineResponse20016 systemOutputsIdDelete(id)

Delete Output

Delete Output

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.OutputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


OutputsApi apiInstance = new OutputsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20016 result = apiInstance.systemOutputsIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputsApi#systemOutputsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemOutputsIdGet"></a>
# **systemOutputsIdGet**
> InlineResponse20016 systemOutputsIdGet(id)

Get Output by ID

Get Output by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.OutputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


OutputsApi apiInstance = new OutputsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20016 result = apiInstance.systemOutputsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputsApi#systemOutputsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemOutputsIdPatch"></a>
# **systemOutputsIdPatch**
> InlineResponse20016 systemOutputsIdPatch(id, body)

Update Output

Update Output

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.OutputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


OutputsApi apiInstance = new OutputsApi();
String id = "id_example"; // String | Unique ID
Output body = new Output(); // Output | Output object to be updated
try {
    InlineResponse20016 result = apiInstance.systemOutputsIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputsApi#systemOutputsIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**Output**](Output.md)| Output object to be updated | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemOutputsIdSamplesGet"></a>
# **systemOutputsIdSamplesGet**
> InlineResponse20017 systemOutputsIdSamplesGet(id)

Retrieve samples data for the specified output. Used to get sample data for the test action.

Retrieve samples data for the specified output. Used to get sample data for the test action.

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.OutputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


OutputsApi apiInstance = new OutputsApi();
String id = "id_example"; // String | Output Id
try {
    InlineResponse20017 result = apiInstance.systemOutputsIdSamplesGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputsApi#systemOutputsIdSamplesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Output Id |

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemOutputsIdTestPost"></a>
# **systemOutputsIdTestPost**
> InlineResponse20018 systemOutputsIdTestPost(id, body)

Send sample data to an output to validate configuration or test connectivity

Send sample data to an output to validate configuration or test connectivity

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.OutputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


OutputsApi apiInstance = new OutputsApi();
String id = "id_example"; // String | Output Id
OutputTestRequest body = new OutputTestRequest(); // OutputTestRequest | OutputTestRequest object
try {
    InlineResponse20018 result = apiInstance.systemOutputsIdTestPost(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputsApi#systemOutputsIdTestPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Output Id |
 **body** | [**OutputTestRequest**](OutputTestRequest.md)| OutputTestRequest object | [optional]

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemOutputsPost"></a>
# **systemOutputsPost**
> InlineResponse20016 systemOutputsPost(body)

Create Output

Create Output

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.OutputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


OutputsApi apiInstance = new OutputsApi();
Output body = new Output(); // Output | New Output object
try {
    InlineResponse20016 result = apiInstance.systemOutputsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputsApi#systemOutputsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Output**](Output.md)| New Output object | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemStatusOutputsGet"></a>
# **systemStatusOutputsGet**
> InlineResponse20025 systemStatusOutputsGet()

Get a list of OutputStatus objects

Get a list of OutputStatus objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.OutputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


OutputsApi apiInstance = new OutputsApi();
try {
    InlineResponse20025 result = apiInstance.systemStatusOutputsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputsApi#systemStatusOutputsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemStatusOutputsIdGet"></a>
# **systemStatusOutputsIdGet**
> InlineResponse20025 systemStatusOutputsIdGet(id)

Get OutputStatus by ID

Get OutputStatus by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.OutputsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


OutputsApi apiInstance = new OutputsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20025 result = apiInstance.systemStatusOutputsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputsApi#systemStatusOutputsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

