# KeyMetadataEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyId** | **String** |  | 
**description** | **String** |  |  [optional]
**algorithm** | [**AlgorithmEnum**](#AlgorithmEnum) |  | 
**kms** | [**KmsEnum**](#KmsEnum) |  | 
**keyclass** | [**BigDecimal**](BigDecimal.md) |  | 
**created** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**expires** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**plainKey** | **String** |  |  [optional]
**cipherKey** | **String** |  |  [optional]

<a name="AlgorithmEnum"></a>
## Enum: AlgorithmEnum
Name | Value
---- | -----
AES_256_CBC | &quot;aes-256-cbc&quot;

<a name="KmsEnum"></a>
## Enum: KmsEnum
Name | Value
---- | -----
LOCAL | &quot;local&quot;
