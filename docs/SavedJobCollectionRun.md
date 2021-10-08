# SavedJobCollectionRun

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rescheduleDroppedTasks** | **Boolean** | Reschedule tasks that failed with non-fatal errors. |  [optional]
**maxTaskReschedule** | [**BigDecimal**](BigDecimal.md) | Max number of times a task can be rescheduled. |  [optional]
**logLevel** | [**LogLevelEnum**](#LogLevelEnum) | Level at which to set task logging. |  [optional]
**jobTimeout** | **String** | Maximum time the job is allowed to run (e.g., 30, 45s or 15m). Units are seconds, if not specified. Enter 0 for unlimited time. |  [optional]
**mode** | **String** | Job run mode. Preview will either return up to N matching results, or will run until capture time T is reached. Discovery will gather the list of files to turn into streaming tasks, without running the data collection job. Full Run will run the collection job. | 
**timeRangeType** | **String** | Time range for scheduled job. |  [optional]
**earliest** | [**BigDecimal**](BigDecimal.md) | Earliest time, in local time. |  [optional]
**latest** | [**BigDecimal**](BigDecimal.md) | Latest time, in local time. |  [optional]
**expression** | **String** | A filter for tokens in the provided collect path and/or the events being collected |  [optional]
**minTaskSize** | **String** | Limits the bundle size for small tasks. E.g., bundle five 200KB files into one 1M task. |  [optional]
**maxTaskSize** | **String** | Limits the bundle size for files above the Lower task bundle size. E.g., bundle five 2MB files into one 10MB task bundle. Files greater than this size will be assigned to individual tasks. |  [optional]

<a name="LogLevelEnum"></a>
## Enum: LogLevelEnum
Name | Value
---- | -----
ERROR | &quot;error&quot;
WARN | &quot;warn&quot;
INFO | &quot;info&quot;
DEBUG | &quot;debug&quot;
