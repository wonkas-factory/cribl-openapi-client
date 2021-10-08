# LoggingApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemJobsLogsIdGroupIdGet**](LoggingApi.md#systemJobsLogsIdGroupIdGet) | **GET** /system/jobs/logs/{id}/{groupId} | Get contents of the log file
[**systemLogsGet**](LoggingApi.md#systemLogsGet) | **GET** /system/logs | Get a list of log files
[**systemLogsIdGet**](LoggingApi.md#systemLogsIdGet) | **GET** /system/logs/{id} | Get contents of the log file
[**systemLogsSearchGet**](LoggingApi.md#systemLogsSearchGet) | **GET** /system/logs/search | Get contents of the log file

<a name="systemJobsLogsIdGroupIdGet"></a>
# **systemJobsLogsIdGroupIdGet**
> InlineResponse20015 systemJobsLogsIdGroupIdGet(id, groupId, limit, offset, endOffset, et, lt, filter)

Get contents of the log file

Get contents of the log file

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.LoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LoggingApi apiInstance = new LoggingApi();
String id = "id_example"; // String | Job id
String groupId = "groupId_example"; // String | Group ID (optional)
Integer limit = 56; // Integer | Maximum number of log lines to retrieve starting from offset.
Integer offset = 56; // Integer | Offset in the current log file to fetch the log events from.
Integer endOffset = 56; // Integer | in the current log file to fetch the log events upto.
Integer et = 56; // Integer | Epoch timestamp of the earliest event (includes rolled files present on disk)
Integer lt = 56; // Integer | Epoch timestamp of the latest event (includes rolled files present on disk)
String filter = "filter_example"; // String | Filter
try {
    InlineResponse20015 result = apiInstance.systemJobsLogsIdGroupIdGet(id, groupId, limit, offset, endOffset, et, lt, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggingApi#systemJobsLogsIdGroupIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Job id |
 **groupId** | **String**| Group ID (optional) |
 **limit** | **Integer**| Maximum number of log lines to retrieve starting from offset. | [optional]
 **offset** | **Integer**| Offset in the current log file to fetch the log events from. | [optional]
 **endOffset** | **Integer**| in the current log file to fetch the log events upto. | [optional]
 **et** | **Integer**| Epoch timestamp of the earliest event (includes rolled files present on disk) | [optional]
 **lt** | **Integer**| Epoch timestamp of the latest event (includes rolled files present on disk) | [optional]
 **filter** | **String**| Filter | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemLogsGet"></a>
# **systemLogsGet**
> InlineResponse20038 systemLogsGet()

Get a list of log files

Get a list of log files

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.LoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LoggingApi apiInstance = new LoggingApi();
try {
    InlineResponse20038 result = apiInstance.systemLogsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggingApi#systemLogsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20038**](InlineResponse20038.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemLogsIdGet"></a>
# **systemLogsIdGet**
> InlineResponse20015 systemLogsIdGet(id, limit, endOffset, et, lt, filter)

Get contents of the log file

Get contents of the log file

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.LoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LoggingApi apiInstance = new LoggingApi();
String id = "id_example"; // String | Log ID
Integer limit = 56; // Integer | Maximum number of log lines to retrieve starting from offset.
Integer endOffset = 56; // Integer | in the current log file to fetch the log events upto.
Integer et = 56; // Integer | Epoch timestamp of the earliest event (includes rolled files present on disk)
Integer lt = 56; // Integer | Epoch timestamp of the latest event (includes rolled files present on disk)
String filter = "filter_example"; // String | Filter
try {
    InlineResponse20015 result = apiInstance.systemLogsIdGet(id, limit, endOffset, et, lt, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggingApi#systemLogsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Log ID |
 **limit** | **Integer**| Maximum number of log lines to retrieve starting from offset. | [optional]
 **endOffset** | **Integer**| in the current log file to fetch the log events upto. | [optional]
 **et** | **Integer**| Epoch timestamp of the earliest event (includes rolled files present on disk) | [optional]
 **lt** | **Integer**| Epoch timestamp of the latest event (includes rolled files present on disk) | [optional]
 **filter** | **String**| Filter | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemLogsSearchGet"></a>
# **systemLogsSearchGet**
> InlineResponse20015 systemLogsSearchGet(type, groupId, files, limit, et, lt, filter)

Get contents of the log file

Get contents of the log file

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.LoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LoggingApi apiInstance = new LoggingApi();
String type = "type_example"; // String | type of logs request single multi group
String groupId = "groupId_example"; // String | id of the group to query
String files = "files_example"; // String | query string[] optional file or files to query
Integer limit = 56; // Integer | Maximum number of log lines to retrieve starting from offset.
Integer et = 56; // Integer | Epoch timestamp of the earliest event (includes rolled files present on disk)
Integer lt = 56; // Integer | Epoch timestamp of the latest event (includes rolled files present on disk)
String filter = "filter_example"; // String | Filter
try {
    InlineResponse20015 result = apiInstance.systemLogsSearchGet(type, groupId, files, limit, et, lt, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggingApi#systemLogsSearchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| type of logs request single multi group |
 **groupId** | **String**| id of the group to query | [optional]
 **files** | **String**| query string[] optional file or files to query | [optional]
 **limit** | **Integer**| Maximum number of log lines to retrieve starting from offset. | [optional]
 **et** | **Integer**| Epoch timestamp of the earliest event (includes rolled files present on disk) | [optional]
 **lt** | **Integer**| Epoch timestamp of the latest event (includes rolled files present on disk) | [optional]
 **filter** | **String**| Filter | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

