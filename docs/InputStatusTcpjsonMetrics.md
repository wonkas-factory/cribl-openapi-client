# InputStatusTcpjsonMetrics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | IP address for this connection |  [optional]
**persistentQueueSize** | [**BigDecimal**](BigDecimal.md) | The number of bytes stored in the persistent queue |  [optional]
**activeSockets** | [**BigDecimal**](BigDecimal.md) | The number of active sockets |  [optional]
**activeBreakers** | [**BigDecimal**](BigDecimal.md) | The number of active event breakers |  [optional]
**received** | [**BigDecimal**](BigDecimal.md) | The number of events that have been received with this input |  [optional]
**broken** | [**BigDecimal**](BigDecimal.md) | The number of events generated from event breaking |  [optional]
**tcpJsonParseErrors** | [**BigDecimal**](BigDecimal.md) | Event parsing errors that have occurred since connection |  [optional]
**tcpJsonEvents** | [**BigDecimal**](BigDecimal.md) | The total number of events that have been sent since connection |  [optional]
**tcpJsonAuthed** | **Boolean** | Has this connection been authenticated? |  [optional]
**tcpJsonCommonFields** | **List&lt;String&gt;** | Fields that appear in all events from this connection. |  [optional]
**tcpJsonClosed** | **Boolean** | The connection has been closed an no longer accepting events. |  [optional]
