# InputSplunkContentConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentType** | **String** | Office 365 Management Activity API Content Type |  [optional]
**description** | **String** | If interval type is minutes the value entered must evenly divisible by 60 or save will fail |  [optional]
**interval** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**logLevel** | [**LogLevelEnum**](#LogLevelEnum) | Collector runtime Log Level |  [optional]
**enabled** | **Boolean** |  |  [optional]

<a name="LogLevelEnum"></a>
## Enum: LogLevelEnum
Name | Value
---- | -----
ERROR | &quot;error&quot;
WARN | &quot;warn&quot;
INFO | &quot;info&quot;
DEBUG | &quot;debug&quot;
