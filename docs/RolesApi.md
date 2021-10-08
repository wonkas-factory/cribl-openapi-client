# RolesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemRolesGet**](RolesApi.md#systemRolesGet) | **GET** /system/roles | Get a list of Role objects
[**systemRolesIdDelete**](RolesApi.md#systemRolesIdDelete) | **DELETE** /system/roles/{id} | Delete Role
[**systemRolesIdGet**](RolesApi.md#systemRolesIdGet) | **GET** /system/roles/{id} | Get Role by ID
[**systemRolesIdPatch**](RolesApi.md#systemRolesIdPatch) | **PATCH** /system/roles/{id} | Update Role
[**systemRolesPost**](RolesApi.md#systemRolesPost) | **POST** /system/roles | Create Role

<a name="systemRolesGet"></a>
# **systemRolesGet**
> InlineResponse2008 systemRolesGet()

Get a list of Role objects

Get a list of Role objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.RolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RolesApi apiInstance = new RolesApi();
try {
    InlineResponse2008 result = apiInstance.systemRolesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#systemRolesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemRolesIdDelete"></a>
# **systemRolesIdDelete**
> InlineResponse2008 systemRolesIdDelete(id)

Delete Role

Delete Role

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.RolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RolesApi apiInstance = new RolesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2008 result = apiInstance.systemRolesIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#systemRolesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemRolesIdGet"></a>
# **systemRolesIdGet**
> InlineResponse2008 systemRolesIdGet(id)

Get Role by ID

Get Role by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.RolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RolesApi apiInstance = new RolesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2008 result = apiInstance.systemRolesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#systemRolesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemRolesIdPatch"></a>
# **systemRolesIdPatch**
> InlineResponse2008 systemRolesIdPatch(id, body)

Update Role

Update Role

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.RolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RolesApi apiInstance = new RolesApi();
String id = "id_example"; // String | Unique ID
Role body = new Role(); // Role | Role object to be updated
try {
    InlineResponse2008 result = apiInstance.systemRolesIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#systemRolesIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**Role**](Role.md)| Role object to be updated | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemRolesPost"></a>
# **systemRolesPost**
> InlineResponse2008 systemRolesPost(body)

Create Role

Create Role

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.RolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RolesApi apiInstance = new RolesApi();
Role body = new Role(); // Role | New Role object
try {
    InlineResponse2008 result = apiInstance.systemRolesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#systemRolesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Role**](Role.md)| New Role object | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

