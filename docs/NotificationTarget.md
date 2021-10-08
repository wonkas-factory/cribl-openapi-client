# NotificationTarget

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique ID for this output | 
**type** | [**TypeEnum**](#TypeEnum) |  | 
**systemFields** | **List&lt;String&gt;** | Set of fields to automatically add to events using this output. E.g.: cribl_pipe, c*. Wildcards supported. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
DEFAULT | &quot;default&quot;
WEBHOOK | &quot;webhook&quot;
BULLETIN_MESSAGE | &quot;bulletin_message&quot;
ROUTER | &quot;router&quot;
NOTIFICATIONS_LOG | &quot;notifications_log&quot;
PAGER_DUTY | &quot;pager_duty&quot;
