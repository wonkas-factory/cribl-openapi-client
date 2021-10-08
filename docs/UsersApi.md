# UsersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemUsersGet**](UsersApi.md#systemUsersGet) | **GET** /system/users | Get a list of User objects
[**systemUsersIdDelete**](UsersApi.md#systemUsersIdDelete) | **DELETE** /system/users/{id} | Delete User
[**systemUsersIdGet**](UsersApi.md#systemUsersIdGet) | **GET** /system/users/{id} | Get User by ID
[**systemUsersIdPatch**](UsersApi.md#systemUsersIdPatch) | **PATCH** /system/users/{id} | Update User
[**systemUsersPost**](UsersApi.md#systemUsersPost) | **POST** /system/users | Create User
[**systemUsersidInfoPatch**](UsersApi.md#systemUsersidInfoPatch) | **PATCH** /system/users/:id/info | Update user except for their roles

<a name="systemUsersGet"></a>
# **systemUsersGet**
> InlineResponse20011 systemUsersGet()

Get a list of User objects

Get a list of User objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UsersApi apiInstance = new UsersApi();
try {
    InlineResponse20011 result = apiInstance.systemUsersGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#systemUsersGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemUsersIdDelete"></a>
# **systemUsersIdDelete**
> InlineResponse20011 systemUsersIdDelete(id)

Delete User

Delete User

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UsersApi apiInstance = new UsersApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20011 result = apiInstance.systemUsersIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#systemUsersIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemUsersIdGet"></a>
# **systemUsersIdGet**
> InlineResponse20011 systemUsersIdGet(id)

Get User by ID

Get User by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UsersApi apiInstance = new UsersApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20011 result = apiInstance.systemUsersIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#systemUsersIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemUsersIdPatch"></a>
# **systemUsersIdPatch**
> InlineResponse20011 systemUsersIdPatch(id, body)

Update User

Update User

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UsersApi apiInstance = new UsersApi();
String id = "id_example"; // String | Unique ID
User body = new User(); // User | User object to be updated
try {
    InlineResponse20011 result = apiInstance.systemUsersIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#systemUsersIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**User**](User.md)| User object to be updated | [optional]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemUsersPost"></a>
# **systemUsersPost**
> InlineResponse20011 systemUsersPost(body)

Create User

Create User

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UsersApi apiInstance = new UsersApi();
User body = new User(); // User | New User object
try {
    InlineResponse20011 result = apiInstance.systemUsersPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#systemUsersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| New User object | [optional]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemUsersidInfoPatch"></a>
# **systemUsersidInfoPatch**
> InlineResponse20011 systemUsersidInfoPatch()

Update user except for their roles

Update user except for their roles

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UsersApi apiInstance = new UsersApi();
try {
    InlineResponse20011 result = apiInstance.systemUsersidInfoPatch();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#systemUsersidInfoPatch");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

