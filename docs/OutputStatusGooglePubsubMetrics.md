# OutputStatusGooglePubsubMetrics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**persistentQueueSize** | [**BigDecimal**](BigDecimal.md) | The number of bytes stored in the persistent queue |  [optional]
**lastFlushTime** | [**BigDecimal**](BigDecimal.md) | Time when buffer was last flushed. |  [optional]
**currentBufferLength** | [**BigDecimal**](BigDecimal.md) | The number of characters stored in the buffer |  [optional]
**currentBufferEventCount** | [**BigDecimal**](BigDecimal.md) | The number of events currently stored in the buffer |  [optional]
**totalSent** | [**BigDecimal**](BigDecimal.md) | The number of events sent |  [optional]
**bytesSent** | [**BigDecimal**](BigDecimal.md) | The number of bytes sent |  [optional]
**errorCount** | [**BigDecimal**](BigDecimal.md) | The number of errors |  [optional]
**numDropped** | [**BigDecimal**](BigDecimal.md) | The number of events dropped because topic does not exist |  [optional]
