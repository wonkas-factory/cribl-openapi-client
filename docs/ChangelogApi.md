# ChangelogApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changelogViewedGet**](ChangelogApi.md#changelogViewedGet) | **GET** /changelog/viewed | Get changelog viewed state

<a name="changelogViewedGet"></a>
# **changelogViewedGet**
> InlineResponse20029 changelogViewedGet()

Get changelog viewed state

Get changelog viewed state

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.ChangelogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChangelogApi apiInstance = new ChangelogApi();
try {
    InlineResponse20029 result = apiInstance.changelogViewedGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChangelogApi#changelogViewedGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

