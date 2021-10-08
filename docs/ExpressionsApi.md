# ExpressionsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**libExpressionGet**](ExpressionsApi.md#libExpressionGet) | **GET** /lib/expression | Evaluate JavaScript expression

<a name="libExpressionGet"></a>
# **libExpressionGet**
> InlineResponse20032 libExpressionGet()

Evaluate JavaScript expression

Evaluate JavaScript expression

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ExpressionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExpressionsApi apiInstance = new ExpressionsApi();
try {
    InlineResponse20032 result = apiInstance.libExpressionGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpressionsApi#libExpressionGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20032**](InlineResponse20032.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

