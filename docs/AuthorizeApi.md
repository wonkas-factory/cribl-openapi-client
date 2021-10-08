# AuthorizeApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorizePolicyGet**](AuthorizeApi.md#authorizePolicyGet) | **GET** /authorize/policy | get the client&#x27;s authorization policy
[**authorizeRolesGet**](AuthorizeApi.md#authorizeRolesGet) | **GET** /authorize/roles | get the client&#x27;s LogStream roles

<a name="authorizePolicyGet"></a>
# **authorizePolicyGet**
> InlineResponse20027 authorizePolicyGet()

get the client&#x27;s authorization policy

get the client&#x27;s authorization policy

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.AuthorizeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AuthorizeApi apiInstance = new AuthorizeApi();
try {
    InlineResponse20027 result = apiInstance.authorizePolicyGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizeApi#authorizePolicyGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="authorizeRolesGet"></a>
# **authorizeRolesGet**
> InlineResponse20028 authorizeRolesGet()

get the client&#x27;s LogStream roles

get the client&#x27;s LogStream roles

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.AuthorizeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AuthorizeApi apiInstance = new AuthorizeApi();
try {
    InlineResponse20028 result = apiInstance.authorizeRolesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizeApi#authorizeRolesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

