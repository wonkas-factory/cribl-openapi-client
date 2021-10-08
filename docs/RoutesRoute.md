# RoutesRoute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**name** | **String** |  | 
**disabled** | **Boolean** | Whether this routing rule is disabled |  [optional]
**filter** | **String** | Expression (JS) to select data to route |  [optional]
**pipeline** | **String** | Pipeline to send the matching data to | 
**output** | **String** | Output destination to send events to, after they are processed by the Pipeline |  [optional]
**description** | **String** | Short description of this Route |  [optional]
**_final** | **Boolean** | Flag to control whether the event gets consumed by this Route (Final), or cloned into it. |  [optional]
