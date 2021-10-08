# EventBreakerRulesetRules

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Rule Name. | 
**condition** | **String** | Filter expression (JS) that matches data to apply rule to. To test your sample, use the maximize icon on the right. | 
**type** | [**TypeEnum**](#TypeEnum) | Event Breaker Type | 
**timestampAnchorRegex** | **String** | Regex to match before attempting timestamp extraction. Use $ (end of string anchor) to not perform extraction. | 
**timestamp** | [**TimestampFormat**](TimestampFormat.md) |  | 
**timestampTimezone** | **String** | Timezone to assign to timestamps without timezone info. |  [optional]
**timestampEarliest** | **String** | The earliest timestamp value allowed relative to now. E.g., -42years. Parsed values prior to this date will be set to current time. |  [optional]
**timestampLatest** | **String** | The latest timestamp value allowed relative to now. E.g., +42days. Parsed values after this date will be set to current time. |  [optional]
**maxEventBytes** | [**BigDecimal**](BigDecimal.md) | The maximum number of bytes that an event can be before being flushed to the pipelines |  [optional]
**fields** | [**List&lt;EventBreakerRulesetFields&gt;**](EventBreakerRulesetFields.md) | Key value pairs to be added to each event. |  [optional]
**disabled** | **Boolean** | Allows breaker rule to be enabled or disabled, default is enabled. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
REGEX | &quot;regex&quot;
JSON | &quot;json&quot;
JSON_ARRAY | &quot;json_array&quot;
HEADER | &quot;header&quot;
TIMESTAMP | &quot;timestamp&quot;
CSV | &quot;csv&quot;
