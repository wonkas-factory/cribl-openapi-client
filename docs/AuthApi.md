# AuthApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authGroupsGet**](AuthApi.md#authGroupsGet) | **GET** /auth/groups | get the external authentication system&#x27;s groups
[**authLoginPost**](AuthApi.md#authLoginPost) | **POST** /auth/login | Log in and get authentication token
[**authLogoutPost**](AuthApi.md#authLogoutPost) | **POST** /auth/logout | Log out current user

<a name="authGroupsGet"></a>
# **authGroupsGet**
> InlineResponse20026 authGroupsGet()

get the external authentication system&#x27;s groups

get the external authentication system&#x27;s groups

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AuthApi apiInstance = new AuthApi();
try {
    InlineResponse20026 result = apiInstance.authGroupsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#authGroupsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="authLoginPost"></a>
# **authLoginPost**
> AuthToken authLoginPost(body)

Log in and get authentication token

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.service.AuthApi;


AuthApi apiInstance = new AuthApi();
LoginInfo body = new LoginInfo(); // LoginInfo | 
try {
    AuthToken result = apiInstance.authLoginPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#authLoginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginInfo**](LoginInfo.md)|  | [optional]

### Return type

[**AuthToken**](AuthToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authLogoutPost"></a>
# **authLogoutPost**
> authLogoutPost()

Log out current user

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AuthApi apiInstance = new AuthApi();
try {
    apiInstance.authLogoutPost();
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#authLogoutPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

