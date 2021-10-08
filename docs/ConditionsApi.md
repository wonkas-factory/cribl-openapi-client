# ConditionsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conditionsGet**](ConditionsApi.md#conditionsGet) | **GET** /conditions | Get a list of Condition objects
[**conditionsIdGet**](ConditionsApi.md#conditionsIdGet) | **GET** /conditions/{id} | Get Condition by ID

<a name="conditionsGet"></a>
# **conditionsGet**
> InlineResponse20031 conditionsGet()

Get a list of Condition objects

Get a list of Condition objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ConditionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConditionsApi apiInstance = new ConditionsApi();
try {
    InlineResponse20031 result = apiInstance.conditionsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConditionsApi#conditionsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20031**](InlineResponse20031.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conditionsIdGet"></a>
# **conditionsIdGet**
> InlineResponse20031 conditionsIdGet(id)

Get Condition by ID

Get Condition by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ConditionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConditionsApi apiInstance = new ConditionsApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20031 result = apiInstance.conditionsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConditionsApi#conditionsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20031**](InlineResponse20031.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

