# GroupsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**masterGroupsGet**](GroupsApi.md#masterGroupsGet) | **GET** /master/groups | Get a list of ConfigGroup objects
[**masterGroupsIdDelete**](GroupsApi.md#masterGroupsIdDelete) | **DELETE** /master/groups/{id} | Delete ConfigGroup
[**masterGroupsIdGet**](GroupsApi.md#masterGroupsIdGet) | **GET** /master/groups/{id} | Get ConfigGroup by ID
[**masterGroupsIdPatch**](GroupsApi.md#masterGroupsIdPatch) | **PATCH** /master/groups/{id} | Update ConfigGroup
[**masterGroupsPost**](GroupsApi.md#masterGroupsPost) | **POST** /master/groups | Create ConfigGroup

<a name="masterGroupsGet"></a>
# **masterGroupsGet**
> InlineResponse2001 masterGroupsGet()

Get a list of ConfigGroup objects

Get a list of ConfigGroup objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GroupsApi apiInstance = new GroupsApi();
try {
    InlineResponse2001 result = apiInstance.masterGroupsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#masterGroupsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="masterGroupsIdDelete"></a>
# **masterGroupsIdDelete**
> InlineResponse2001 masterGroupsIdDelete(id)

Delete ConfigGroup

Delete ConfigGroup

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GroupsApi apiInstance = new GroupsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2001 result = apiInstance.masterGroupsIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#masterGroupsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="masterGroupsIdGet"></a>
# **masterGroupsIdGet**
> InlineResponse2001 masterGroupsIdGet(id)

Get ConfigGroup by ID

Get ConfigGroup by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GroupsApi apiInstance = new GroupsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse2001 result = apiInstance.masterGroupsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#masterGroupsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="masterGroupsIdPatch"></a>
# **masterGroupsIdPatch**
> InlineResponse2001 masterGroupsIdPatch(id, body)

Update ConfigGroup

Update ConfigGroup

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GroupsApi apiInstance = new GroupsApi();
String id = "id_example"; // String | Unique ID
ConfigGroup body = new ConfigGroup(); // ConfigGroup | ConfigGroup object to be updated
try {
    InlineResponse2001 result = apiInstance.masterGroupsIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#masterGroupsIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**ConfigGroup**](ConfigGroup.md)| ConfigGroup object to be updated | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="masterGroupsPost"></a>
# **masterGroupsPost**
> InlineResponse2001 masterGroupsPost(body)

Create ConfigGroup

Create ConfigGroup

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GroupsApi apiInstance = new GroupsApi();
ConfigGroup body = new ConfigGroup(); // ConfigGroup | New ConfigGroup object
try {
    InlineResponse2001 result = apiInstance.masterGroupsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#masterGroupsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigGroup**](ConfigGroup.md)| New ConfigGroup object | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

