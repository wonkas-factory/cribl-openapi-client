# LicensesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemLicensesGet**](LicensesApi.md#systemLicensesGet) | **GET** /system/licenses | Get a list of License objects
[**systemLicensesIdDelete**](LicensesApi.md#systemLicensesIdDelete) | **DELETE** /system/licenses/{id} | Delete License
[**systemLicensesIdGet**](LicensesApi.md#systemLicensesIdGet) | **GET** /system/licenses/{id} | Get License by ID
[**systemLicensesPost**](LicensesApi.md#systemLicensesPost) | **POST** /system/licenses | Create License
[**systemLicensesUsageGet**](LicensesApi.md#systemLicensesUsageGet) | **GET** /system/licenses/usage | Get license usage metrics, aggregated by day, up to last 90 days

<a name="systemLicensesGet"></a>
# **systemLicensesGet**
> InlineResponse20035 systemLicensesGet()

Get a list of License objects

Get a list of License objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.LicensesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LicensesApi apiInstance = new LicensesApi();
try {
    InlineResponse20035 result = apiInstance.systemLicensesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#systemLicensesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20035**](InlineResponse20035.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemLicensesIdDelete"></a>
# **systemLicensesIdDelete**
> InlineResponse20035 systemLicensesIdDelete(id)

Delete License

Delete License

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.LicensesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LicensesApi apiInstance = new LicensesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20035 result = apiInstance.systemLicensesIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#systemLicensesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20035**](InlineResponse20035.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemLicensesIdGet"></a>
# **systemLicensesIdGet**
> InlineResponse20035 systemLicensesIdGet(id)

Get License by ID

Get License by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.LicensesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LicensesApi apiInstance = new LicensesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20035 result = apiInstance.systemLicensesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#systemLicensesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20035**](InlineResponse20035.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemLicensesPost"></a>
# **systemLicensesPost**
> InlineResponse20035 systemLicensesPost(body)

Create License

Create License

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.LicensesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LicensesApi apiInstance = new LicensesApi();
License body = new License(); // License | New License object
try {
    InlineResponse20035 result = apiInstance.systemLicensesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#systemLicensesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**License**](License.md)| New License object | [optional]

### Return type

[**InlineResponse20035**](InlineResponse20035.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemLicensesUsageGet"></a>
# **systemLicensesUsageGet**
> InlineResponse20036 systemLicensesUsageGet()

Get license usage metrics, aggregated by day, up to last 90 days

Get license usage metrics, aggregated by day, up to last 90 days

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.LicensesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LicensesApi apiInstance = new LicensesApi();
try {
    InlineResponse20036 result = apiInstance.systemLicensesUsageGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#systemLicensesUsageGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20036**](InlineResponse20036.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

