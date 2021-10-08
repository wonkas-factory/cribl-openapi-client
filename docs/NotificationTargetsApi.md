# NotificationTargetsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationTargetsGet**](NotificationTargetsApi.md#notificationTargetsGet) | **GET** /notification-targets | Get a list of NotificationTarget objects
[**notificationTargetsIdDelete**](NotificationTargetsApi.md#notificationTargetsIdDelete) | **DELETE** /notification-targets/{id} | Delete NotificationTarget
[**notificationTargetsIdGet**](NotificationTargetsApi.md#notificationTargetsIdGet) | **GET** /notification-targets/{id} | Get NotificationTarget by ID
[**notificationTargetsIdPatch**](NotificationTargetsApi.md#notificationTargetsIdPatch) | **PATCH** /notification-targets/{id} | Update NotificationTarget
[**notificationTargetsPost**](NotificationTargetsApi.md#notificationTargetsPost) | **POST** /notification-targets | Create NotificationTarget

<a name="notificationTargetsGet"></a>
# **notificationTargetsGet**
> InlineResponse2005 notificationTargetsGet()

Get a list of NotificationTarget objects

Get a list of NotificationTarget objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.NotificationTargetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationTargetsApi apiInstance = new NotificationTargetsApi();
try {
    InlineResponse2005 result = apiInstance.notificationTargetsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationTargetsApi#notificationTargetsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notificationTargetsIdDelete"></a>
# **notificationTargetsIdDelete**
> InlineResponse2005 notificationTargetsIdDelete(id)

Delete NotificationTarget

Delete NotificationTarget

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.NotificationTargetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationTargetsApi apiInstance = new NotificationTargetsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2005 result = apiInstance.notificationTargetsIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationTargetsApi#notificationTargetsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notificationTargetsIdGet"></a>
# **notificationTargetsIdGet**
> InlineResponse2005 notificationTargetsIdGet(id)

Get NotificationTarget by ID

Get NotificationTarget by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.NotificationTargetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationTargetsApi apiInstance = new NotificationTargetsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2005 result = apiInstance.notificationTargetsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationTargetsApi#notificationTargetsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notificationTargetsIdPatch"></a>
# **notificationTargetsIdPatch**
> InlineResponse2005 notificationTargetsIdPatch(id, body)

Update NotificationTarget

Update NotificationTarget

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.NotificationTargetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationTargetsApi apiInstance = new NotificationTargetsApi();
String id = "id_example"; // String | Unique ID
NotificationTarget body = new NotificationTarget(); // NotificationTarget | NotificationTarget object to be updated
try {
    InlineResponse2005 result = apiInstance.notificationTargetsIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationTargetsApi#notificationTargetsIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**NotificationTarget**](NotificationTarget.md)| NotificationTarget object to be updated | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="notificationTargetsPost"></a>
# **notificationTargetsPost**
> InlineResponse2005 notificationTargetsPost(body)

Create NotificationTarget

Create NotificationTarget

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.NotificationTargetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationTargetsApi apiInstance = new NotificationTargetsApi();
NotificationTarget body = new NotificationTarget(); // NotificationTarget | New NotificationTarget object
try {
    InlineResponse2005 result = apiInstance.notificationTargetsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationTargetsApi#notificationTargetsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NotificationTarget**](NotificationTarget.md)| New NotificationTarget object | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

