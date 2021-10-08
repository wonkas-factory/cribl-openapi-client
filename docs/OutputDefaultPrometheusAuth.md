# OutputDefaultPrometheusAuth

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | The authentication method to use for the HTTP requests |  [optional]

<a name="AuthTypeEnum"></a>
## Enum: AuthTypeEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
TOKEN | &quot;token&quot;
TEXTSECRET | &quot;textSecret&quot;
BASIC | &quot;basic&quot;
CREDENTIALSSECRET | &quot;credentialsSecret&quot;
