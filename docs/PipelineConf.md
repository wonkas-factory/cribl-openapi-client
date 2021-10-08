# PipelineConf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asyncFuncTimeout** | **Integer** | Time (in ms) to wait for an async function to complete processing a data item |  [optional]
**output** | **String** | The output destination for events processed by this pipeline |  [optional]
**description** | **String** | Simple description of this pipeline |  [optional]
**functions** | [**List&lt;PipelineFunctionConf&gt;**](PipelineFunctionConf.md) | List of functions to pass data through |  [optional]
**groups** | [**Map&lt;String, PipelineConfGroups&gt;**](PipelineConfGroups.md) |  |  [optional]
