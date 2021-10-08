# NotificationTargetPagerDuty

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**routingKey** | **String** | This is the 32 character Integration Key for an integration on a service or on a global ruleset. | 
**group** | **String** | Optional, default group value |  [optional]
**propertyClass** | **String** | Optional, default class value |  [optional]
**component** | **String** | Optional, default component value |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | Default value for message severity, will be overwritten by value of __severity if set. Defaults to info. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PAGER_DUTY | &quot;pager_duty&quot;

<a name="SeverityEnum"></a>
## Enum: SeverityEnum
Name | Value
---- | -----
ERROR | &quot;error&quot;
WARNING | &quot;warning&quot;
INFO | &quot;info&quot;
CRITICAL | &quot;critical&quot;
