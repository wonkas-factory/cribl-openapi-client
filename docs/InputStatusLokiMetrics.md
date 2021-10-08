# InputStatusLokiMetrics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**persistentQueueSize** | [**BigDecimal**](BigDecimal.md) | The number of bytes stored in the persistent queue |  [optional]
**numRequests** | [**BigDecimal**](BigDecimal.md) | The total number HTTP requests received |  [optional]
**numPushed** | [**BigDecimal**](BigDecimal.md) | The total number of events pushed send downstream for processing. Depending on the endpoint, these events may pass through an event breaker additional processing |  [optional]
**numHealth** | [**BigDecimal**](BigDecimal.md) | The number of health endpoint invocations. The health endpoint will respond with status but not send events upstream for processing |  [optional]
**numDropped** | [**BigDecimal**](BigDecimal.md) | The number of requests dropped |  [optional]
**numErrors** | [**BigDecimal**](BigDecimal.md) | The total number errors that have occurred |  [optional]
**numInProgress** | [**BigDecimal**](BigDecimal.md) | The total number of in progress requests |  [optional]
