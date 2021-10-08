# GlobalVar

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Global variable name. | 
**lib** | **String** |  |  [optional]
**description** | **String** | Brief description of this variable. Optional. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of variable. | 
**value** | **String** | Value of variable | 
**tags** | **String** | One more tags related to this variable. Optional. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
STRING | &quot;string&quot;
NUMBER | &quot;number&quot;
BOOLEAN | &quot;boolean&quot;
ARRAY | &quot;array&quot;
OBJECT | &quot;object&quot;
EXPRESSION | &quot;expression&quot;
ANY | &quot;any&quot;
