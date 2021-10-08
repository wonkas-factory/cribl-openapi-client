# MetricsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemMetricsEnumPost**](MetricsApi.md#systemMetricsEnumPost) | **POST** /system/metrics/enum | Enumerate all internal system metrics
[**systemMetricsGet**](MetricsApi.md#systemMetricsGet) | **GET** /system/metrics | Query raw internal system metrics
[**systemMetricsQueryPost**](MetricsApi.md#systemMetricsQueryPost) | **POST** /system/metrics/query | Aggregate raw internal system metrics

<a name="systemMetricsEnumPost"></a>
# **systemMetricsEnumPost**
> InlineResponse20044 systemMetricsEnumPost(body)

Enumerate all internal system metrics

Enumerate all internal system metrics

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.MetricsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MetricsApi apiInstance = new MetricsApi();
GetNamesOpts body = new GetNamesOpts(); // GetNamesOpts | GetNamesOpts object
try {
    InlineResponse20044 result = apiInstance.systemMetricsEnumPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#systemMetricsEnumPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetNamesOpts**](GetNamesOpts.md)| GetNamesOpts object | [optional]

### Return type

[**InlineResponse20044**](InlineResponse20044.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemMetricsGet"></a>
# **systemMetricsGet**
> InlineResponse20015 systemMetricsGet(numBuckets, earliest, latest, metricNameFilter, filterExpr)

Query raw internal system metrics

Query raw internal system metrics

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.MetricsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MetricsApi apiInstance = new MetricsApi();
BigDecimal numBuckets = new BigDecimal(); // BigDecimal | buckets in the past to include in the query results
BigDecimal earliest = new BigDecimal(); // BigDecimal | earliest time to query against
BigDecimal latest = new BigDecimal(); // BigDecimal | latest time to query against
String metricNameFilter = "metricNameFilter_example"; // String | can be a regex or an array of metric names
String filterExpr = "filterExpr_example"; // String | a js expression to apply against the metrics returned (can filter dimensions)
try {
    InlineResponse20015 result = apiInstance.systemMetricsGet(numBuckets, earliest, latest, metricNameFilter, filterExpr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#systemMetricsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numBuckets** | **BigDecimal**| buckets in the past to include in the query results | [optional]
 **earliest** | **BigDecimal**| earliest time to query against | [optional]
 **latest** | **BigDecimal**| latest time to query against | [optional]
 **metricNameFilter** | **String**| can be a regex or an array of metric names | [optional]
 **filterExpr** | **String**| a js expression to apply against the metrics returned (can filter dimensions) | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemMetricsQueryPost"></a>
# **systemMetricsQueryPost**
> InlineResponse20015 systemMetricsQueryPost(body)

Aggregate raw internal system metrics

Aggregate raw internal system metrics

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.MetricsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MetricsApi apiInstance = new MetricsApi();
MetricsAggOpts body = new MetricsAggOpts(); // MetricsAggOpts | MetricsAggOpts object
try {
    InlineResponse20015 result = apiInstance.systemMetricsQueryPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#systemMetricsQueryPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MetricsAggOpts**](MetricsAggOpts.md)| MetricsAggOpts object | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

