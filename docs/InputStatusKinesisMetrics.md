# InputStatusKinesisMetrics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**persistentQueueSize** | [**BigDecimal**](BigDecimal.md) | The number of bytes stored in the persistent queue |  [optional]
**shards** | [**BigDecimal**](BigDecimal.md) | The number of shards that are actively being listened to for incoming records |  [optional]
**records** | [**BigDecimal**](BigDecimal.md) | The number of records that have been received by Cribl |  [optional]
**events** | [**BigDecimal**](BigDecimal.md) | The number of events that have been parsed from received records |  [optional]
**errors** | [**BigDecimal**](BigDecimal.md) | The number of errors that have occurred while receiving data from Kinesis |  [optional]
