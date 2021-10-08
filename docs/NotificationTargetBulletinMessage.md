# NotificationTargetBulletinMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | Default value for message severity, will be overwritten by value of __severity if set. Defaults to warn. |  [optional]
**text** | **String** | Text of the message |  [optional]
**title** | **String** | Title of the message |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
BULLETIN_MESSAGE | &quot;bulletin_message&quot;

<a name="SeverityEnum"></a>
## Enum: SeverityEnum
Name | Value
---- | -----
ERROR | &quot;error&quot;
WARN | &quot;warn&quot;
INFO | &quot;info&quot;
FATAL | &quot;fatal&quot;
