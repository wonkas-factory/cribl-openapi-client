# EventBreakerRulesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**libBreakersGet**](EventBreakerRulesApi.md#libBreakersGet) | **GET** /lib/breakers | Get a list of Event Breaker Ruleset objects
[**libBreakersIdDelete**](EventBreakerRulesApi.md#libBreakersIdDelete) | **DELETE** /lib/breakers/{id} | Delete Event Breaker Ruleset
[**libBreakersIdGet**](EventBreakerRulesApi.md#libBreakersIdGet) | **GET** /lib/breakers/{id} | Get Event Breaker Ruleset by ID
[**libBreakersIdPatch**](EventBreakerRulesApi.md#libBreakersIdPatch) | **PATCH** /lib/breakers/{id} | Update Event Breaker Ruleset
[**libBreakersPost**](EventBreakerRulesApi.md#libBreakersPost) | **POST** /lib/breakers | Create Event Breaker Ruleset

<a name="libBreakersGet"></a>
# **libBreakersGet**
> InlineResponse20012 libBreakersGet()

Get a list of Event Breaker Ruleset objects

Get a list of Event Breaker Ruleset objects

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.EventBreakerRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EventBreakerRulesApi apiInstance = new EventBreakerRulesApi();
try {
    InlineResponse20012 result = apiInstance.libBreakersGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventBreakerRulesApi#libBreakersGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="libBreakersIdDelete"></a>
# **libBreakersIdDelete**
> InlineResponse20012 libBreakersIdDelete(id)

Delete Event Breaker Ruleset

Delete Event Breaker Ruleset

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.EventBreakerRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EventBreakerRulesApi apiInstance = new EventBreakerRulesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20012 result = apiInstance.libBreakersIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventBreakerRulesApi#libBreakersIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="libBreakersIdGet"></a>
# **libBreakersIdGet**
> InlineResponse20012 libBreakersIdGet(id)

Get Event Breaker Ruleset by ID

Get Event Breaker Ruleset by ID

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.EventBreakerRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EventBreakerRulesApi apiInstance = new EventBreakerRulesApi();
String id = "id_example"; // String | Unique ID
try {
    InlineResponse20012 result = apiInstance.libBreakersIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventBreakerRulesApi#libBreakersIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="libBreakersIdPatch"></a>
# **libBreakersIdPatch**
> InlineResponse20012 libBreakersIdPatch(id, body)

Update Event Breaker Ruleset

Update Event Breaker Ruleset

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.EventBreakerRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EventBreakerRulesApi apiInstance = new EventBreakerRulesApi();
String id = "id_example"; // String | Unique ID
EventBreakerRuleset body = new EventBreakerRuleset(); // EventBreakerRuleset | Event Breaker Ruleset object to be updated
try {
    InlineResponse20012 result = apiInstance.libBreakersIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventBreakerRulesApi#libBreakersIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique ID |
 **body** | [**EventBreakerRuleset**](EventBreakerRuleset.md)| Event Breaker Ruleset object to be updated | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="libBreakersPost"></a>
# **libBreakersPost**
> InlineResponse20012 libBreakersPost(body)

Create Event Breaker Ruleset

Create Event Breaker Ruleset

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.EventBreakerRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EventBreakerRulesApi apiInstance = new EventBreakerRulesApi();
EventBreakerRuleset body = new EventBreakerRuleset(); // EventBreakerRuleset | New Event Breaker Ruleset object
try {
    InlineResponse20012 result = apiInstance.libBreakersPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventBreakerRulesApi#libBreakersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EventBreakerRuleset**](EventBreakerRuleset.md)| New Event Breaker Ruleset object | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

