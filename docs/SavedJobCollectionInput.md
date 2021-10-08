# SavedJobCollectionInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**breakerRulesets** | **List&lt;String&gt;** | A list of event breaking rulesets that will be applied, in order, to the input data stream. |  [optional]
**staleChannelFlushMs** | [**BigDecimal**](BigDecimal.md) | The amount of time (in milliseconds) the Event Breaker will wait for new data to be sent to a specific channel, before flushing the data stream out, as-is, to the Pipelines. |  [optional]
**sendToRoutes** | **Boolean** | If set to Yes, events will be sent to normal routing and event processing. Set to No if you want to select a specific Pipeline/Destination combination. |  [optional]
**preprocess** | [**SavedJobCollectionInputPreprocess**](SavedJobCollectionInputPreprocess.md) |  |  [optional]
**throttleRatePerSec** | **String** | Rate (in bytes per second) to throttle while writing to an output. Also takes values with multiple-byte units, such as KB, MB, GB, etc. (E.g., 42 MB.) Default value of 0 specifies no throttling. |  [optional]
**metadata** | [**List&lt;NotificationMetadata&gt;**](NotificationMetadata.md) | Fields to add. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
COLLECTION | &quot;collection&quot;
