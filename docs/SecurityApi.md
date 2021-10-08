# SecurityApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**securityKmsConfigGet**](SecurityApi.md#securityKmsConfigGet) | **GET** /security/kms/config | Get Cribl KMS config
[**securityKmsConfigPatch**](SecurityApi.md#securityKmsConfigPatch) | **PATCH** /security/kms/config | Update Cribl KMS config

<a name="securityKmsConfigGet"></a>
# **securityKmsConfigGet**
> InlineResponse20041 securityKmsConfigGet()

Get Cribl KMS config

Get Cribl KMS config

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SecurityApi apiInstance = new SecurityApi();
try {
    InlineResponse20041 result = apiInstance.securityKmsConfigGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#securityKmsConfigGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20041**](InlineResponse20041.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="securityKmsConfigPatch"></a>
# **securityKmsConfigPatch**
> InlineResponse20041 securityKmsConfigPatch(body)

Update Cribl KMS config

Update Cribl KMS config

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SecurityApi apiInstance = new SecurityApi();
IKMSProviderConfig body = new IKMSProviderConfig(); // IKMSProviderConfig | IKMSProviderConfig object
try {
    InlineResponse20041 result = apiInstance.securityKmsConfigPatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#securityKmsConfigPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IKMSProviderConfig**](IKMSProviderConfig.md)| IKMSProviderConfig object | [optional]

### Return type

[**InlineResponse20041**](InlineResponse20041.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

