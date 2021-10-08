# NotificationTargetWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**url** | **String** | URL to send events to. | 
**method** | [**MethodEnum**](#MethodEnum) | The method to use when sending events. Defaults to POST. |  [optional]
**format** | [**FormatEnum**](#FormatEnum) | Specifies how to format events before sending out. Defaults to NDJSON. |  [optional]
**concurrency** | [**BigDecimal**](BigDecimal.md) | Maximum number of ongoing requests before blocking. |  [optional]
**maxPayloadSizeKB** | [**BigDecimal**](BigDecimal.md) | Maximum size, in KB, of the request body. |  [optional]
**maxPayloadEvents** | [**BigDecimal**](BigDecimal.md) | Max number of events to include in the request body. Default is 0 (unlimited). |  [optional]
**compress** | **Boolean** | Whether to compress the payload body before sending. |  [optional]
**rejectUnauthorized** | **Boolean** | Reject certs that are not authorized by a CA in the CA certificate path, or by another trusted CA (e.g., the system&#x27;s CA). Defaults to No. |  [optional]
**timeoutSec** | [**BigDecimal**](BigDecimal.md) | Amount of time, in seconds, to wait for a request to complete before aborting it. |  [optional]
**flushPeriodSec** | [**BigDecimal**](BigDecimal.md) | Maximum time between requests. Small values could cause the payload size to be smaller than the configured Max body size. |  [optional]
**extraHttpHeaders** | [**List&lt;NotificationTargetWebhookExtraHttpHeaders&gt;**](NotificationTargetWebhookExtraHttpHeaders.md) | Extra HTTP Headers. |  [optional]
**useRoundRobinDns** | **Boolean** | Enable to use round-robin DNS lookup. When a DNS server returns multiple addresses, this will cause LogStream to cycle through them in the order returned. |  [optional]
**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | The authentication method to use for the HTTP request. Defaults to None. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
WEBHOOK | &quot;webhook&quot;

<a name="MethodEnum"></a>
## Enum: MethodEnum
Name | Value
---- | -----
POST | &quot;POST&quot;
PUT | &quot;PUT&quot;
PATCH | &quot;PATCH&quot;

<a name="FormatEnum"></a>
## Enum: FormatEnum
Name | Value
---- | -----
NDJSON | &quot;ndjson&quot;
JSON_ARRAY | &quot;json_array&quot;
CUSTOM | &quot;custom&quot;

<a name="AuthTypeEnum"></a>
## Enum: AuthTypeEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
BASIC | &quot;basic&quot;
CREDENTIALSSECRET | &quot;credentialsSecret&quot;
TOKEN | &quot;token&quot;
TEXTSECRET | &quot;textSecret&quot;
