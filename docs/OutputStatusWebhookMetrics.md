# OutputStatusWebhookMetrics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**persistentQueueSize** | [**BigDecimal**](BigDecimal.md) | The number of bytes stored in the persistent queue |  [optional]
**numBytesInBuffer** | [**BigDecimal**](BigDecimal.md) | Number of bytes in buffer. |  [optional]
**numEventsInBuffer** | [**BigDecimal**](BigDecimal.md) | Number of events in buffer. |  [optional]
**concurrentRequests** | [**BigDecimal**](BigDecimal.md) | The number of currently running requests |  [optional]
**lastFlushTime** | [**BigDecimal**](BigDecimal.md) | Time when buffer was last flushed. |  [optional]
**sentCount** | [**BigDecimal**](BigDecimal.md) | Events sent since last restart. |  [optional]
**numDropped** | [**BigDecimal**](BigDecimal.md) | The number of requests dropped |  [optional]
**parseErrorCount** | [**BigDecimal**](BigDecimal.md) | The number of errors stemming from parsing events. |  [optional]
