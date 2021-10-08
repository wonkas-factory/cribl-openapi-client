# RunnableJobExecutor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique ID for this Job. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Job type. |  [optional]
**ttl** | **String** | Time to keep the job&#x27;s artifacts on disk after job completion. This also affects how long a job is listed in the Job Inspector. |  [optional]
**removeFields** | **List&lt;String&gt;** | List of fields to remove from Discover results. Wildcards (e.g.: aws*) are allowed. This is useful when discovery returns sensitive fields that should not be exposed in the Jobs user interface. |  [optional]
**resumeOnBoot** | **Boolean** | Resumes the ad hoc job if a failure condition causes LogStream to restart during job execution. |  [optional]
**schedule** | [**Schedule**](Schedule.md) |  |  [optional]
**collector** | [**SavedJobCollectionCollector**](SavedJobCollectionCollector.md) |  |  [optional]
**input** | [**SavedJobCollectionInput**](SavedJobCollectionInput.md) |  |  [optional]
**executor** | [**SavedJobCollectionExecutor**](SavedJobCollectionExecutor.md) |  | 
**run** | [**SavedJobCollectionRun**](SavedJobCollectionRun.md) |  | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
COLLECTION | &quot;collection&quot;
EXECUTOR | &quot;executor&quot;
