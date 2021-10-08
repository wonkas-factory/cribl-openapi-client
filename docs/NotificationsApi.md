# NotificationsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationsGet**](NotificationsApi.md#notificationsGet) | **GET** /notifications | Get a list of Notification objects
[**notificationsIdDelete**](NotificationsApi.md#notificationsIdDelete) | **DELETE** /notifications/{id} | Delete Notification
[**notificationsIdGet**](NotificationsApi.md#notificationsIdGet) | **GET** /notifications/{id} | Get Notification by ID
[**notificationsIdPatch**](NotificationsApi.md#notificationsIdPatch) | **PATCH** /notifications/{id} | Update Notification
[**notificationsPost**](NotificationsApi.md#notificationsPost) | **POST** /notifications | Create Notification

<a name="notificationsGet"></a>
# **notificationsGet**
> InlineResponse2006 notificationsGet()

Get a list of Notification objects

Get a list of Notification objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationsApi apiInstance = new NotificationsApi();
try {
    InlineResponse2006 result = apiInstance.notificationsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#notificationsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notificationsIdDelete"></a>
# **notificationsIdDelete**
> InlineResponse2006 notificationsIdDelete(id)

Delete Notification

Delete Notification

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationsApi apiInstance = new NotificationsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2006 result = apiInstance.notificationsIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#notificationsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notificationsIdGet"></a>
# **notificationsIdGet**
> InlineResponse2006 notificationsIdGet(id)

Get Notification by ID

Get Notification by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationsApi apiInstance = new NotificationsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2006 result = apiInstance.notificationsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#notificationsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notificationsIdPatch"></a>
# **notificationsIdPatch**
> InlineResponse2006 notificationsIdPatch(id, body)

Update Notification

Update Notification

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationsApi apiInstance = new NotificationsApi();
String id = "id_example"; // String | Unique ID
Notification body = new Notification(); // Notification | Notification object to be updated
try {
    InlineResponse2006 result = apiInstance.notificationsIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#notificationsIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**Notification**](Notification.md)| Notification object to be updated | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="notificationsPost"></a>
# **notificationsPost**
> InlineResponse2006 notificationsPost(body)

Create Notification

Create Notification

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NotificationsApi apiInstance = new NotificationsApi();
Notification body = new Notification(); // Notification | New Notification object
try {
    InlineResponse2006 result = apiInstance.notificationsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#notificationsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Notification**](Notification.md)| New Notification object | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

