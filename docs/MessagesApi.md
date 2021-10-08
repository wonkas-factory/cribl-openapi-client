# MessagesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemMessagesGet**](MessagesApi.md#systemMessagesGet) | **GET** /system/messages | Get a list of BulletinMessage objects
[**systemMessagesIdDelete**](MessagesApi.md#systemMessagesIdDelete) | **DELETE** /system/messages/{id} | Delete BulletinMessage
[**systemMessagesIdGet**](MessagesApi.md#systemMessagesIdGet) | **GET** /system/messages/{id} | Get BulletinMessage by ID
[**systemMessagesPost**](MessagesApi.md#systemMessagesPost) | **POST** /system/messages | Create BulletinMessage

<a name="systemMessagesGet"></a>
# **systemMessagesGet**
> InlineResponse2004 systemMessagesGet()

Get a list of BulletinMessage objects

Get a list of BulletinMessage objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
try {
    InlineResponse2004 result = apiInstance.systemMessagesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#systemMessagesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemMessagesIdDelete"></a>
# **systemMessagesIdDelete**
> InlineResponse2004 systemMessagesIdDelete(id)

Delete BulletinMessage

Delete BulletinMessage

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2004 result = apiInstance.systemMessagesIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#systemMessagesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemMessagesIdGet"></a>
# **systemMessagesIdGet**
> InlineResponse2004 systemMessagesIdGet(id)

Get BulletinMessage by ID

Get BulletinMessage by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2004 result = apiInstance.systemMessagesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#systemMessagesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemMessagesPost"></a>
# **systemMessagesPost**
> InlineResponse2004 systemMessagesPost(body)

Create BulletinMessage

Create BulletinMessage

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
BulletinMessage body = new BulletinMessage(); // BulletinMessage | New BulletinMessage object
try {
    InlineResponse2004 result = apiInstance.systemMessagesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#systemMessagesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulletinMessage**](BulletinMessage.md)| New BulletinMessage object | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

