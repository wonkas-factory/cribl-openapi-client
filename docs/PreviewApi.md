# PreviewApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**previewPost**](PreviewApi.md#previewPost) | **POST** /preview | Sends sample events through a pipeline and returns the results
[**systemCapturePost**](PreviewApi.md#systemCapturePost) | **POST** /system/capture | Capture live incoming data

<a name="previewPost"></a>
# **previewPost**
> InlineResponse20015 previewPost(body)

Sends sample events through a pipeline and returns the results

Sends sample events through a pipeline and returns the results

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PreviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PreviewApi apiInstance = new PreviewApi();
PreviewDataParams body = new PreviewDataParams(); // PreviewDataParams | PreviewDataParams object
try {
    InlineResponse20015 result = apiInstance.previewPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreviewApi#previewPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PreviewDataParams**](PreviewDataParams.md)| PreviewDataParams object | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="systemCapturePost"></a>
# **systemCapturePost**
> InlineResponse20015 systemCapturePost(body)

Capture live incoming data

Capture live incoming data

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.PreviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PreviewApi apiInstance = new PreviewApi();
CaptureParams body = new CaptureParams(); // CaptureParams | CaptureParams object
try {
    InlineResponse20015 result = apiInstance.systemCapturePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreviewApi#systemCapturePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CaptureParams**](CaptureParams.md)| CaptureParams object | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

