# JobsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobsGet**](JobsApi.md#jobsGet) | **GET** /jobs | Get info on jobs
[**jobsIdCancelPatch**](JobsApi.md#jobsIdCancelPatch) | **PATCH** /jobs/{id}/cancel | Cancel a job by instance id
[**jobsIdDelete**](JobsApi.md#jobsIdDelete) | **DELETE** /jobs/{id} | Remove job from job inspector by instance id
[**jobsIdErrorsGet**](JobsApi.md#jobsIdErrorsGet) | **GET** /jobs/{id}/errors/ | Get Task errors for a job by id
[**jobsIdErrorsGroupGet**](JobsApi.md#jobsIdErrorsGroupGet) | **GET** /jobs/{id}/errors/{group} | Get Task errors for a job by id
[**jobsIdGet**](JobsApi.md#jobsIdGet) | **GET** /jobs/{id} | Get job info by instance id
[**jobsIdKeepPatch**](JobsApi.md#jobsIdKeepPatch) | **PATCH** /jobs/{id}/keep | prevent job from being deleted automatically
[**jobsIdPausePatch**](JobsApi.md#jobsIdPausePatch) | **PATCH** /jobs/{id}/pause | Pause a job by instance id
[**jobsIdResultsGet**](JobsApi.md#jobsIdResultsGet) | **GET** /jobs/{id}/results/ | Get results for a discover job by instance id
[**jobsIdResultsGroupGet**](JobsApi.md#jobsIdResultsGroupGet) | **GET** /jobs/{id}/results/{group} | Get results for a discover job by instance id
[**jobsIdResumePatch**](JobsApi.md#jobsIdResumePatch) | **PATCH** /jobs/{id}/resume | Resume a job by instance id

<a name="jobsGet"></a>
# **jobsGet**
> InlineResponse20034 jobsGet(offset, limit, runType, state, id, collectorId)

Get info on jobs

Get info on jobs

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


JobsApi apiInstance = new JobsApi();
Integer offset = 56; // Integer | Pagination offset
Integer limit = 56; // Integer | Maximum number of items to return
String runType = "runType_example"; // String | Filter by job run type, one of \"adhoc\", \"scheduled\", \"system\"
String state = "state_example"; // String | Filter by current job state, e.g. \"running\"
String id = "id_example"; // String | Filter by job id, e.g. \"id=1608713335.3&id=1608713326.1\"
String collectorId = "collectorId_example"; // String | Filter by collector id, e.g. \"collectorId=Prometheus-in\"
try {
    InlineResponse20034 result = apiInstance.jobsGet(offset, limit, runType, state, id, collectorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| Pagination offset | [optional]
 **limit** | **Integer**| Maximum number of items to return | [optional]
 **runType** | **String**| Filter by job run type, one of \&quot;adhoc\&quot;, \&quot;scheduled\&quot;, \&quot;system\&quot; | [optional]
 **state** | **String**| Filter by current job state, e.g. \&quot;running\&quot; | [optional]
 **id** | **String**| Filter by job id, e.g. \&quot;id&#x3D;1608713335.3&amp;id&#x3D;1608713326.1\&quot; | [optional]
 **collectorId** | **String**| Filter by collector id, e.g. \&quot;collectorId&#x3D;Prometheus-in\&quot; | [optional]

### Return type

[**InlineResponse20034**](InlineResponse20034.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="jobsIdCancelPatch"></a>
# **jobsIdCancelPatch**
> InlineResponse20015 jobsIdCancelPatch(id)

Cancel a job by instance id

Cancel a job by instance id

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


JobsApi apiInstance = new JobsApi();
String id = "id_example"; // String | Job instance id
try {
    InlineResponse20015 result = apiInstance.jobsIdCancelPatch(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsIdCancelPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Job instance id |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="jobsIdDelete"></a>
# **jobsIdDelete**
> InlineResponse20015 jobsIdDelete(id)

Remove job from job inspector by instance id

Remove job from job inspector by instance id

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


JobsApi apiInstance = new JobsApi();
String id = "id_example"; // String | Job instance id
try {
    InlineResponse20015 result = apiInstance.jobsIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Job instance id |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="jobsIdErrorsGet"></a>
# **jobsIdErrorsGet**
> InlineResponse20015 jobsIdErrorsGet(id)

Get Task errors for a job by id

Get Task errors for a job by id

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


JobsApi apiInstance = new JobsApi();
String id = "id_example"; // String | Instance id of the job to get results for
try {
    InlineResponse20015 result = apiInstance.jobsIdErrorsGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsIdErrorsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Instance id of the job to get results for |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="jobsIdErrorsGroupGet"></a>
# **jobsIdErrorsGroupGet**
> InlineResponse20015 jobsIdErrorsGroupGet(id, group)

Get Task errors for a job by id

Get Task errors for a job by id

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


JobsApi apiInstance = new JobsApi();
String id = "id_example"; // String | Instance id of the job to get results for
String group = "group_example"; // String | Group the job belongs to
try {
    InlineResponse20015 result = apiInstance.jobsIdErrorsGroupGet(id, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsIdErrorsGroupGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Instance id of the job to get results for |
 **group** | **String**| Group the job belongs to |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="jobsIdGet"></a>
# **jobsIdGet**
> InlineResponse20033 jobsIdGet(id)

Get job info by instance id

Get job info by instance id

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


JobsApi apiInstance = new JobsApi();
String id = "id_example"; // String | Job instance id
try {
    InlineResponse20033 result = apiInstance.jobsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Job instance id |

### Return type

[**InlineResponse20033**](InlineResponse20033.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="jobsIdKeepPatch"></a>
# **jobsIdKeepPatch**
> InlineResponse20033 jobsIdKeepPatch(id)

prevent job from being deleted automatically

prevent job from being deleted automatically

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


JobsApi apiInstance = new JobsApi();
String id = "id_example"; // String | Job Instance id
try {
    InlineResponse20033 result = apiInstance.jobsIdKeepPatch(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsIdKeepPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Job Instance id |

### Return type

[**InlineResponse20033**](InlineResponse20033.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="jobsIdPausePatch"></a>
# **jobsIdPausePatch**
> InlineResponse20015 jobsIdPausePatch(id)

Pause a job by instance id

Pause a job by instance id

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


JobsApi apiInstance = new JobsApi();
String id = "id_example"; // String | Job instance id
try {
    InlineResponse20015 result = apiInstance.jobsIdPausePatch(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsIdPausePatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Job instance id |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="jobsIdResultsGet"></a>
# **jobsIdResultsGet**
> InlineResponse20015 jobsIdResultsGet(id)

Get results for a discover job by instance id

Get results for a discover job by instance id

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


JobsApi apiInstance = new JobsApi();
String id = "id_example"; // String | Instance id of the job to get results for
try {
    InlineResponse20015 result = apiInstance.jobsIdResultsGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsIdResultsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Instance id of the job to get results for |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="jobsIdResultsGroupGet"></a>
# **jobsIdResultsGroupGet**
> InlineResponse20015 jobsIdResultsGroupGet(id, group)

Get results for a discover job by instance id

Get results for a discover job by instance id

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


JobsApi apiInstance = new JobsApi();
String id = "id_example"; // String | Instance id of the job to get results for
String group = "group_example"; // String | Group the job belongs to
try {
    InlineResponse20015 result = apiInstance.jobsIdResultsGroupGet(id, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsIdResultsGroupGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Instance id of the job to get results for |
 **group** | **String**| Group the job belongs to |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="jobsIdResumePatch"></a>
# **jobsIdResumePatch**
> InlineResponse20015 jobsIdResumePatch(id)

Resume a job by instance id

Resume a job by instance id

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


JobsApi apiInstance = new JobsApi();
String id = "id_example"; // String | Job instance id
try {
    InlineResponse20015 result = apiInstance.jobsIdResumePatch(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#jobsIdResumePatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Job instance id |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

