# OutputStatusSignalfxMetrics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**persistentQueueSize** | [**BigDecimal**](BigDecimal.md) | The number of bytes stored in the persistent queue |  [optional]
**numBytesInBuffer** | [**BigDecimal**](BigDecimal.md) | Number of bytes in buffer. |  [optional]
**numEventsInBuffer** | [**BigDecimal**](BigDecimal.md) | Number of events in buffer. |  [optional]
**lastFlushTime** | [**BigDecimal**](BigDecimal.md) | Time when buffer was last flushed. |  [optional]
**lastFlushBytes** | [**BigDecimal**](BigDecimal.md) | Number of last flushed bytes. |  [optional]
**connected** | **Boolean** | Connection established to destination. |  [optional]
**closed** | **Boolean** | Connection to destination has been closed. |  [optional]
**lastConnectTime** | [**BigDecimal**](BigDecimal.md) | Time of last connection. |  [optional]
**sentCount** | [**BigDecimal**](BigDecimal.md) | Events sent since last restart. |  [optional]
**sentBytes** | [**BigDecimal**](BigDecimal.md) | Bytes sent since last restart. |  [optional]
**dropBytes** | [**BigDecimal**](BigDecimal.md) | Bytes dropped since last restart. |  [optional]
