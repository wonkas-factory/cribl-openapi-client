# InputStatusSnmpMetrics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**received** | [**BigDecimal**](BigDecimal.md) | Number of messages received |  [optional]
**buffered** | [**BigDecimal**](BigDecimal.md) | Number of events in the buffer |  [optional]
**dropped** | [**BigDecimal**](BigDecimal.md) | Number of messages dropped because buffer full (see Max Buffer Size) or allowlist exclusions (see IP Allowlist Regex) |  [optional]
**numIgnored** | [**BigDecimal**](BigDecimal.md) | Number messages ignored (invalid SNMP format or not trap PDU) |  [optional]
**numErrors** | [**BigDecimal**](BigDecimal.md) | Number packet parse errors |  [optional]
**numBytes** | [**BigDecimal**](BigDecimal.md) | Number bytes received |  [optional]
**numV1** | [**BigDecimal**](BigDecimal.md) | Number SNMP V1 traps received |  [optional]
**numV2c** | [**BigDecimal**](BigDecimal.md) | Number SNMP V2c traps received |  [optional]
**numV3** | [**BigDecimal**](BigDecimal.md) | Number SNMP V3 traps received |  [optional]
