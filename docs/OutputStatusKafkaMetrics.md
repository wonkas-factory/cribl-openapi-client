# OutputStatusKafkaMetrics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**persistentQueueSize** | [**BigDecimal**](BigDecimal.md) | The number of bytes stored in the persistent queue |  [optional]
**flushInProgress** | **Boolean** | Whether or not the buffer is flushing to Kafka |  [optional]
**lastFlushTime** | [**BigDecimal**](BigDecimal.md) | Time when buffer was last flushed. |  [optional]
**currentBufferLength** | [**BigDecimal**](BigDecimal.md) | The number of characters stored in the buffer |  [optional]
**currentBufferEventCount** | [**BigDecimal**](BigDecimal.md) | The number of events currently stored in the buffer |  [optional]
