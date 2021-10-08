# SystemApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changelogViewedPatch**](SystemApi.md#changelogViewedPatch) | **PATCH** /changelog/viewed | Update changelog viewed state
[**systemDistributedUpgradeCancelGroupPost**](SystemApi.md#systemDistributedUpgradeCancelGroupPost) | **POST** /system/distributed/upgrade/cancel/{group} | Cancel a running group upgrade
[**systemDistributedUpgradeDownloadFileGet**](SystemApi.md#systemDistributedUpgradeDownloadFileGet) | **GET** /system/distributed/upgrade/download/{file} | Get the previously downloaded logstream package
[**systemDistributedUpgradeGroupPost**](SystemApi.md#systemDistributedUpgradeGroupPost) | **POST** /system/distributed/upgrade/{group} | Execute distributed group upgrade
[**systemDistributedUpgradeStageGroupPost**](SystemApi.md#systemDistributedUpgradeStageGroupPost) | **POST** /system/distributed/upgrade/stage/{group} | Stage distributed group upgrade
[**systemSettingsGet**](SystemApi.md#systemSettingsGet) | **GET** /system/settings | Get Cribl system settings
[**systemSettingsPatch**](SystemApi.md#systemSettingsPatch) | **PATCH** /system/settings | Update Cribl system settings
[**systemSettingsReloadPost**](SystemApi.md#systemSettingsReloadPost) | **POST** /system/settings/reload | Reload Cribl settings from the filesystem
[**systemSettingsRestartPost**](SystemApi.md#systemSettingsRestartPost) | **POST** /system/settings/restart | Restart Cribl LogStream server
[**systemSettingsUpgradeFromPackagePost**](SystemApi.md#systemSettingsUpgradeFromPackagePost) | **POST** /system/settings/upgrade-from-package | Upgrade master node with the provided package
[**systemSettingsUpgradeGet**](SystemApi.md#systemSettingsUpgradeGet) | **GET** /system/settings/upgrade | Get a list of Cribl versions available for upgrade
[**systemSettingsUpgradeVersionPost**](SystemApi.md#systemSettingsUpgradeVersionPost) | **POST** /system/settings/upgrade/{version} | Upgrage Cribl to a given version

<a name="changelogViewedPatch"></a>
# **changelogViewedPatch**
> InlineResponse20029 changelogViewedPatch()

Update changelog viewed state

Update changelog viewed state

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SystemApi apiInstance = new SystemApi();
try {
    InlineResponse20029 result = apiInstance.changelogViewedPatch();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#changelogViewedPatch");
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

<a name="systemDistributedUpgradeCancelGroupPost"></a>
# **systemDistributedUpgradeCancelGroupPost**
> InlineResponse20015 systemDistributedUpgradeCancelGroupPost(group)

Cancel a running group upgrade

Cancel a running group upgrade

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SystemApi apiInstance = new SystemApi();
String group = "group_example"; // String | id of the group
try {
    InlineResponse20015 result = apiInstance.systemDistributedUpgradeCancelGroupPost(group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemDistributedUpgradeCancelGroupPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| id of the group |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemDistributedUpgradeDownloadFileGet"></a>
# **systemDistributedUpgradeDownloadFileGet**
> InlineResponse20015 systemDistributedUpgradeDownloadFileGet(file)

Get the previously downloaded logstream package

Get the previously downloaded logstream package

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SystemApi apiInstance = new SystemApi();
String file = "file_example"; // String | Name of the file to be downloaded
try {
    InlineResponse20015 result = apiInstance.systemDistributedUpgradeDownloadFileGet(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemDistributedUpgradeDownloadFileGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **String**| Name of the file to be downloaded |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemDistributedUpgradeGroupPost"></a>
# **systemDistributedUpgradeGroupPost**
> InlineResponse20015 systemDistributedUpgradeGroupPost(group, url, hashUrl, upgradePercentage)

Execute distributed group upgrade

Execute distributed group upgrade

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SystemApi apiInstance = new SystemApi();
String group = "group_example"; // String | Group to upgrade
String url = "url_example"; // String | body string url of the package to install
String hashUrl = "hashUrl_example"; // String | body string url of the package verification hash
String upgradePercentage = "upgradePercentage_example"; // String | body number percentage of nodes on the worker group to upgrade
try {
    InlineResponse20015 result = apiInstance.systemDistributedUpgradeGroupPost(group, url, hashUrl, upgradePercentage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemDistributedUpgradeGroupPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| Group to upgrade |
 **url** | **String**| body string url of the package to install | [optional]
 **hashUrl** | **String**| body string url of the package verification hash | [optional]
 **upgradePercentage** | **String**| body number percentage of nodes on the worker group to upgrade | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemDistributedUpgradeStageGroupPost"></a>
# **systemDistributedUpgradeStageGroupPost**
> InlineResponse20015 systemDistributedUpgradeStageGroupPost(group, upgradePercentage)

Stage distributed group upgrade

Stage distributed group upgrade

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SystemApi apiInstance = new SystemApi();
String group = "group_example"; // String | Group to upgrade
String upgradePercentage = "upgradePercentage_example"; // String | body number percentage of nodes on the worker group to upgrade
try {
    InlineResponse20015 result = apiInstance.systemDistributedUpgradeStageGroupPost(group, upgradePercentage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemDistributedUpgradeStageGroupPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| Group to upgrade |
 **upgradePercentage** | **String**| body number percentage of nodes on the worker group to upgrade | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemSettingsGet"></a>
# **systemSettingsGet**
> InlineResponse20045 systemSettingsGet()

Get Cribl system settings

Get Cribl system settings

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SystemApi apiInstance = new SystemApi();
try {
    InlineResponse20045 result = apiInstance.systemSettingsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemSettingsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20045**](InlineResponse20045.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemSettingsPatch"></a>
# **systemSettingsPatch**
> InlineResponse20045 systemSettingsPatch()

Update Cribl system settings

Update Cribl system settings

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SystemApi apiInstance = new SystemApi();
try {
    InlineResponse20045 result = apiInstance.systemSettingsPatch();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemSettingsPatch");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20045**](InlineResponse20045.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemSettingsReloadPost"></a>
# **systemSettingsReloadPost**
> systemSettingsReloadPost()

Reload Cribl settings from the filesystem

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SystemApi apiInstance = new SystemApi();
try {
    apiInstance.systemSettingsReloadPost();
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemSettingsReloadPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="systemSettingsRestartPost"></a>
# **systemSettingsRestartPost**
> systemSettingsRestartPost()

Restart Cribl LogStream server

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SystemApi apiInstance = new SystemApi();
try {
    apiInstance.systemSettingsRestartPost();
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemSettingsRestartPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="systemSettingsUpgradeFromPackagePost"></a>
# **systemSettingsUpgradeFromPackagePost**
> InlineResponse20028 systemSettingsUpgradeFromPackagePost(packageUrl, hashUrl)

Upgrade master node with the provided package

Upgrade master node with the provided package

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SystemApi apiInstance = new SystemApi();
String packageUrl = "packageUrl_example"; // String | body string url of the package to install
String hashUrl = "hashUrl_example"; // String | body string url of the package hash
try {
    InlineResponse20028 result = apiInstance.systemSettingsUpgradeFromPackagePost(packageUrl, hashUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemSettingsUpgradeFromPackagePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageUrl** | **String**| body string url of the package to install | [optional]
 **hashUrl** | **String**| body string url of the package hash | [optional]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemSettingsUpgradeGet"></a>
# **systemSettingsUpgradeGet**
> InlineResponse20046 systemSettingsUpgradeGet()

Get a list of Cribl versions available for upgrade

Get a list of Cribl versions available for upgrade

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SystemApi apiInstance = new SystemApi();
try {
    InlineResponse20046 result = apiInstance.systemSettingsUpgradeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemSettingsUpgradeGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="systemSettingsUpgradeVersionPost"></a>
# **systemSettingsUpgradeVersionPost**
> InlineResponse20028 systemSettingsUpgradeVersionPost(version)

Upgrage Cribl to a given version

Upgrage Cribl to a given version

### Example
```java
// Import classes:
//import com.cribl.openapi.client.ApiClient;
//import com.cribl.openapi.client.ApiException;
//import com.cribl.openapi.client.Configuration;
//import com.cribl.openapi.client.auth.*;
//import com.cribl.openapi.service.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SystemApi apiInstance = new SystemApi();
String version = "version_example"; // String | Version number
try {
    InlineResponse20028 result = apiInstance.systemSettingsUpgradeVersionPost(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemSettingsUpgradeVersionPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| Version number |

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

