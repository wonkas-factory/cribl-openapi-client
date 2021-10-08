# OutputSignalfx

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique ID for this output |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**pipeline** | **String** | Pipeline to process data before sending out to this output. |  [optional]
**systemFields** | **List&lt;String&gt;** | Set of fields to automatically add to events using this output. E.g.: cribl_pipe, c*. Wildcards supported. These fields are added as labels to generated logs. |  [optional]
**defaultId** | **String** | ID of the default output. This will be used whenever a nonexistent/deleted output is referenced. |  [optional]
**host** | **String** | Name of the host to send with logs. When you send logs as JSON objects, the event&#x27;s &#x27;host&#x27; field (if set) will override this value. |  [optional]
**port** | [**BigDecimal**](BigDecimal.md) | Destination port. |  [optional]
**compression** | [**CompressionEnum**](#CompressionEnum) | Codec to use to compress the data before sending to Kafka. |  [optional]
**throttleRatePerSec** | **String** | Rate (in bytes per second) to throttle while writing to an output. Also takes values with multiple-byte units, such as KB, MB, GB, etc. (E.g., 42 MB.) Default value of 0 specifies no throttling. |  [optional]
**tls** | [**TLSSettingsClientSide**](TLSSettingsClientSide.md) |  |  [optional]
**connectionTimeout** | [**BigDecimal**](BigDecimal.md) | Amount of time (milliseconds) to wait for the connection to establish before retrying |  [optional]
**writeTimeout** | [**BigDecimal**](BigDecimal.md) | Amount of time (milliseconds) to wait for a write to complete before assuming connection is dead |  [optional]
**onBackpressure** | [**OnBackpressureEnum**](#OnBackpressureEnum) | Whether to block, drop, or queue events when all receivers in this group are exerting backpressure. |  [optional]
**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | The authentication method to use for the HTTP requests |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Protocol to use when communicating with the destination. |  [optional]
**facility** | [**FacilityEnum**](#FacilityEnum) | Default value for message facility, will be overwritten by value of __facility if set. Defaults to user. |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | Default value for message severity. When you send logs as JSON objects, the event&#x27;s &#x27;__severity&#x27; field (if set) will override this value. |  [optional]
**appName** | **String** | Default value for application name, will be overwritten by value of __appname if set. Defaults to Cribl. |  [optional]
**messageFormat** | [**MessageFormatEnum**](#MessageFormatEnum) | Which format to use when sending logs to Loki (Protobuf or JSON).  Defaults to Protobuf. |  [optional]
**timestampFormat** | [**TimestampFormatEnum**](#TimestampFormatEnum) | Timestamp format to use when serializing event&#x27;s time field |  [optional]
**nestedFields** | [**NestedFieldsEnum**](#NestedFieldsEnum) | Specifies how to serialize nested fields into index-time fields. |  [optional]
**enableMultiMetrics** | **Boolean** | Output metrics in multiple-metric format, supported in Splunk 8.0 and above to allow multiple metrics in a single event. |  [optional]
**enableACK** | **Boolean** | Check if indexer is shutting down and stop sending data. This helps minimize data loss during shutdown. |  [optional]
**dnsResolvePeriodSec** | [**BigDecimal**](BigDecimal.md) | Re-resolve any hostnames every this many seconds and pick up destinations from A records. |  [optional]
**loadBalanceStatsPeriodSec** | [**BigDecimal**](BigDecimal.md) | How far back in time to keep traffic stats for load balancing purposes. |  [optional]
**maxConcurrentSenders** | [**BigDecimal**](BigDecimal.md) | Maximum number of concurrent connections (per worker process). A random set of IPs will be picked on every DNS resolution period. Use 0 for unlimited. |  [optional]
**indexerDiscovery** | **Boolean** | Automatically discover indexers in indexer clustering environment. |  [optional]
**url** | **String** | The endpoint to send logs to. | 
**nextQueue** | **String** | Which Splunk processing queue to send the events after HEC processing |  [optional]
**tcpRouting** | **String** | Set the value of _TCP_ROUTING for events that does not have _ctrl._TCP_ROUTING set |  [optional]
**concurrency** | [**BigDecimal**](BigDecimal.md) | Maximum number of ongoing requests before blocking. Warning: Setting this value &gt; 1 can cause Loki to complain about entries being delivered out of order. |  [optional]
**maxPayloadSizeKB** | [**BigDecimal**](BigDecimal.md) | Maximum size, in KB, of the request body. Warning: Setting this too low can increase the number of ongoing requests (depending on the value of &#x27;Request concurrency&#x27;); this can cause Loki to complain about entries being delivered out of order. |  [optional]
**maxPayloadEvents** | [**BigDecimal**](BigDecimal.md) | Maximum number of events to include in the request body. Defaults to 0 (unlimited). Warning: Setting this too low can increase the number of ongoing requests (depending on the value of &#x27;Request concurrency&#x27;); this can cause Loki to complain about entries being delivered out of order. |  [optional]
**compress** | **Boolean** | Whether to compress the payload body before sending. |  [optional]
**rejectUnauthorized** | **Boolean** | Reject certs that are not authorized by a CA in the CA certificate path, or by another trusted CA (e.g., the system&#x27;s CA). Defaults to No. |  [optional]
**timeoutSec** | [**BigDecimal**](BigDecimal.md) | Amount of time, in seconds, to wait for a request to complete before aborting it. |  [optional]
**flushPeriodSec** | [**BigDecimal**](BigDecimal.md) | Maximum time between requests. Small values could cause the payload size to be smaller than the configured Maximum time between requests. Small values can reduce the payload size below the configured &#x27;Max record size&#x27; and &#x27;Max events per request&#x27;. Warning: Setting this too low can increase the number of ongoing requests (depending on the value of &#x27;Request concurrency&#x27;); this can cause Loki to complain about entries being delivered out of order. |  [optional]
**extraHttpHeaders** | [**List&lt;NotificationTargetWebhookExtraHttpHeaders&gt;**](NotificationTargetWebhookExtraHttpHeaders.md) | Extra HTTP Headers. |  [optional]
**useRoundRobinDns** | **Boolean** | Enable to use round-robin DNS lookup. When a DNS server returns multiple addresses, this will cause LogStream to cycle through them in the order returned. |  [optional]
**domain** | **String** | WaveFront domain name, e.g. \&quot;longboard\&quot; |  [optional]
**realm** | **String** | SignalFx realm name, e.g. \&quot;us0\&quot; |  [optional]
**destPath** | **String** | Prefix to append to files before uploading. Must be a JavaScript expression (which can evaluate to a constant value), enclosed in quotes or backticks. Can be evaluated only at init time. E.g., referencing a Global Variable: &#x60;myKeyPrefix-${C.vars.myVar}&#x60;. | 
**stagePath** | **String** | Filesystem location in which to buffer files, before compressing and moving to final destination. Use performant stable storage. | 
**addIdToStagePath** | **Boolean** | Append output&#x27;s ID to staging location. |  [optional]
**removeEmptyDirs** | **Boolean** | Remove empty staging directories after moving files. |  [optional]
**partitionExpr** | **String** | JS expression to define how files are partitioned and organized. If left blank, Cribl LogStream will fallback on event.__partition. |  [optional]
**format** | [**FormatEnum**](#FormatEnum) | Specifies how to format events before sending out. Defaults to NDJSON. |  [optional]
**baseFileName** | **String** | JavaScript expression to define the output filename prefix (can be constant). |  [optional]
**maxFileSizeMB** | [**BigDecimal**](BigDecimal.md) | Maximum uncompressed output file size. Files of this size will be closed and moved to final output location. |  [optional]
**maxFileOpenTimeSec** | [**BigDecimal**](BigDecimal.md) | Maximum amount of time to write to a file. Files open for longer than this will be closed and moved to final output location. |  [optional]
**maxFileIdleTimeSec** | [**BigDecimal**](BigDecimal.md) | Maximum amount of time to keep inactive files open. Files open for longer than this will be closed and moved to final output location. |  [optional]
**maxOpenFiles** | [**BigDecimal**](BigDecimal.md) | Maximum number of files to keep open concurrently. When over, the oldest open files will be closed and moved to final output location. |  [optional]
**bucket** | **String** | Name of the destination Bucket. This value can be a constant or a JavaScript expression that can only be evaluated at init time. E.g. referencing a Global Variable: &#x60;myBucket-${C.vars.myVar}&#x60;. |  [optional]
**region** | [**RegionEnum**](#RegionEnum) | Region to publish messages to. Select &#x27;default&#x27; to allow Google to auto-select the nearest region. When using ordered delivery, the selected region must be allowed by message storage policy. | 
**awsAuthenticationMethod** | [**AwsAuthenticationMethodEnum**](#AwsAuthenticationMethodEnum) | AWS authentication method. Choose Auto to use IAM roles. |  [optional]
**awsSecretKey** | **String** | Secret key |  [optional]
**endpoint** | **String** | Google Cloud Storage service endpoint. | 
**signatureVersion** | [**SignatureVersionEnum**](#SignatureVersionEnum) | Signature version to use for signing Google Cloud Storage requests. |  [optional]
**reuseConnections** | **Boolean** | Whether to reuse connections between requests, which can improve performance. |  [optional]
**enableAssumeRole** | **Boolean** | Use Assume Role credentials to access SQS |  [optional]
**assumeRoleArn** | **String** | Amazon Resource Name (ARN) of the role to assume |  [optional]
**assumeRoleExternalId** | **String** | External ID to use when assuming role |  [optional]
**objectACL** | [**ObjectACLEnum**](#ObjectACLEnum) | Object ACL to assign to uploaded objects. |  [optional]
**storageClass** | [**StorageClassEnum**](#StorageClassEnum) | Storage class to select for uploaded objects. |  [optional]
**serverSideEncryption** | [**ServerSideEncryptionEnum**](#ServerSideEncryptionEnum) | Server-side encryption for uploaded objects. |  [optional]
**kmsKeyId** | **Object** |  |  [optional]
**containerName** | **String** | A container organizes a set of blobs, similar to a directory in a file system. |  [optional]
**createContainer** | **Boolean** | Creates the configured container in Azure Blob Storage if it does not already exist. |  [optional]
**logType** | [**LogTypeEnum**](#LogTypeEnum) | Log type value to send to Chronicle. Can be overwritten by event field __logType. |  [optional]
**resourceId** | **String** | Optional Resource ID of the Azure resource the data should be associated with, can be overridden by event field __resourceId. This populates the _ResourceId property and allows the data to be included in resource-centric queries. If this field isn&#x27;t specified, the data will not be included in resource-centric queries. |  [optional]
**streamName** | **String** | Kinesis stream name where to send events. |  [optional]
**maxRecordSizeKB** | [**BigDecimal**](BigDecimal.md) | Maximum size (KB) of batches to send. |  [optional]
**dataset** | **String** | Name of the dataset to send events to – e.g., observability |  [optional]
**messageField** | **String** | Name of field to send as log message value. If not present, event will be serialized and sent as JSON. |  [optional]
**metadata** | [**List&lt;OutputDefaultMetadata&gt;**](OutputDefaultMetadata.md) | Fields to add. |  [optional]
**accountId** | **String** | New Relic account ID |  [optional]
**eventType** | **String** | Default eventType to use when not present in an event. For more information, see [here](https://docs.newrelic.com/docs/telemetry-data-platform/custom-data/custom-events/data-requirements-limits-custom-event-data/#reserved-words). |  [optional]
**index** | **String** | Index where to send events. Can be overwritten by an event&#x27;s __index field |  [optional]
**docType** | **String** | Document type to use for events. Can be overwritten by an event&#x27;s __type field |  [optional]
**auth** | [**OutputDefaultAuth**](OutputDefaultAuth.md) |  |  [optional]
**elasticVersion** | [**ElasticVersionEnum**](#ElasticVersionEnum) | Optional Elasticsearch version, used to format events. If not specified, will auto-discover version. |  [optional]
**brokers** | **List&lt;String&gt;** | List of Event Hubs Kafka brokers to connect to, eg. yourdomain.servicebus.windows.net:9093. The hostname can be found in the host portion of the primary or secondary connection string in Shared Access Policies. |  [optional]
**topic** | **String** | The name of the Event Hub (a.k.a. Kafka Topic) to publish events. Can be overwritten using field __topicOut. |  [optional]
**ack** | [**AckEnum**](#AckEnum) | Control the number of required acknowledgments |  [optional]
**flushEventCount** | [**BigDecimal**](BigDecimal.md) | Maximum number of events in a batch before forcing a flush. |  [optional]
**kafkaSchemaRegistry** | [**KafkaSchemaRegistryAuthentication**](KafkaSchemaRegistryAuthentication.md) |  |  [optional]
**sasl** | [**Authentication**](Authentication.md) |  |  [optional]
**database** | **String** | The database where to write data points. |  [optional]
**timestampPrecision** | [**TimestampPrecisionEnum**](#TimestampPrecisionEnum) | Sets the precision for the supplied Unix time values. Defaults to milliseconds. |  [optional]
**dynamicValueFieldName** | **Boolean** | Enabling this will pull the value field from the metric name (ex. db.query.user will use db.query as the measurement and user as the value field). |  [optional]
**valueFieldName** | **String** | The name of the field to store the metric in when sending to InfluxDb. Will be used as a fallback if dynamic generation is enabled and fails. |  [optional]
**logGroupName** | **String** | CloudWatch log group to associate events with |  [optional]
**logStreamName** | **String** | Prefix for CloudWatch log stream name. This prefix will be used to generate a unique log stream name per cribl instance, for example: myStream_myHost_myOutputId |  [optional]
**maxQueueSize** | [**BigDecimal**](BigDecimal.md) | Maximum number of queued batches before blocking. |  [optional]
**mtu** | [**BigDecimal**](BigDecimal.md) | Used when Protocol is UDP, to specify the maximum size of packets sent to the destination. Also known as the MTU for the network path to the destination system. |  [optional]
**rules** | [**List&lt;NotificationTargetRouterRules&gt;**](NotificationTargetRouterRules.md) | Event routing rules |  [optional]
**queueName** | **String** | The name, URL, or ARN of the SQS queue to send events to. When a non-AWS URL is specified, format must be: &#x27;{url}/myQueueName&#x27;. E.g., &#x27;https://host:port/myQueueName&#x27;. Must be a JavaScript expression (which can evaluate to a constant value), enclosed in quotes or backticks. Can be evaluated only at init time. E.g., referencing a Global Variable: &#x60;https://host:port/myQueue-${C.vars.myVar}&#x60;. |  [optional]
**queueType** | [**QueueTypeEnum**](#QueueTypeEnum) | The queue type used (or created). Defaults to Standard. |  [optional]
**awsAccountId** | **String** | SQS queue owner&#x27;s AWS account ID. Leave empty if SQS queue is in same AWS account. |  [optional]
**messageGroupId** | **String** | This parameter applies only to FIFO queues. The tag that specifies that a message belongs to a specific message group. Messages that belong to the same message group are processed in a FIFO manner. Use event field __messageGroupId to override this value. |  [optional]
**createQueue** | **Boolean** | Create queue if it does not exist. |  [optional]
**maxInProgress** | [**BigDecimal**](BigDecimal.md) | The maximum number of in-progress API requests before backpressure is applied. |  [optional]
**hosts** | [**List&lt;OutputDefaultHosts&gt;**](OutputDefaultHosts.md) | One or more SNMP destinations to forward traps to |  [optional]
**customSource** | **String** | Optionally, override the source name configured on the Sumo Logic HTTP collector. |  [optional]
**customCategory** | **String** | Optionally, override the source category configured on the Sumo Logic HTTP collector. |  [optional]
**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | The content type to use when sending logs. |  [optional]
**message** | **String** | Name of the event field that contains the message to send. If not specified, LogStream sends a JSON representation of the whole event. |  [optional]
**source** | **String** | Name of the source to send with logs. When you send logs as JSON objects, the event&#x27;s &#x27;source&#x27; field (if set) will override this value. |  [optional]
**service** | **String** | Name of the service to send with logs. When you send logs as JSON objects, the event&#x27;s &#x27;__service&#x27; field (if set) will override this value. |  [optional]
**tags** | **List&lt;String&gt;** | List of tags to send with logs (e.g., &#x27;env:prod&#x27;, &#x27;env_staging:east&#x27;). |  [optional]
**metricRenameExpr** | **String** | A JS expression that can be used to rename metrics. E.g.: name.replace(/\\./g, &#x27;_&#x27;) will replace all &#x27;.&#x27; characters in a metric&#x27;s name with the supported &#x27;_&#x27; character. Use the &#x27;name&#x27; global variable to access the metric&#x27;s name.  You can access event fields&#x27; values via __e.&lt;fieldName&gt;. |  [optional]
**sendMetadata** | **Boolean** | Whether to generate and send metadata (&#x60;type&#x60; and &#x60;metricFamilyName&#x60;) requests. |  [optional]
**method** | [**MethodEnum**](#MethodEnum) | The method to use when sending events. Defaults to POST. |  [optional]
**topicName** | **String** | ID of the topic to send events to. |  [optional]
**createTopic** | **Boolean** | If enabled, create topic if it does not exist. |  [optional]
**orderedDelivery** | **Boolean** | If enabled, send events in the order they were added to the queue. For this to work correctly, the process receiving events must have ordering enabled. |  [optional]
**googleAuthMethod** | [**GoogleAuthMethodEnum**](#GoogleAuthMethodEnum) | Google authentication method. Choose Auto to use environment variables PUBSUB_PROJECT and PUBSUB_CREDENTIALS. |  [optional]
**serviceAccountCredentials** | **Object** |  |  [optional]
**secret** | **Object** |  |  [optional]
**batchSize** | [**BigDecimal**](BigDecimal.md) | The maximum number of items the Google API should batch before it sends them to the topic. |  [optional]
**batchTimeout** | [**BigDecimal**](BigDecimal.md) | The maximum amount of time, in milliseconds, that the Google API should wait to send a batch (if the Batch size is not reached). |  [optional]
**authenticationMethod** | [**AuthenticationMethodEnum**](#AuthenticationMethodEnum) |  |  [optional]
**logTextField** | **String** | Name of the event field that contains the log text to send. If not specified, LogStream sends a JSON representation of the whole event. |  [optional]
**logFormatType** | [**LogFormatTypeEnum**](#LogFormatTypeEnum) |  |  [optional]
**lokiUrl** | **String** | The endpoint to send logs to. |  [optional]
**prometheusUrl** | **String** | The remote_write endpoint to send Prometheus metrics to. |  [optional]
**labels** | [**List&lt;OutputDefaultLabels&gt;**](OutputDefaultLabels.md) | List of labels to send with logs. Labels define Loki streams, so use static labels to avoid proliferating label value combinations and streams. Can be merged and/or overridden by the event&#x27;s __labels field (e.g.: &#x27;__labels: {host: \&quot;cribl.io\&quot;, level: \&quot;error\&quot;}&#x27;). |  [optional]
**prometheusAuth** | [**OutputDefaultPrometheusAuth**](OutputDefaultPrometheusAuth.md) |  |  [optional]
**lokiAuth** | [**OutputDefaultPrometheusAuth**](OutputDefaultPrometheusAuth.md) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
LOKI | &quot;loki&quot;
ROUTER | &quot;router&quot;
TCPJSON | &quot;tcpjson&quot;
SPLUNK | &quot;splunk&quot;
SPLUNK_LB | &quot;splunk_lb&quot;
SPLUNK_HEC | &quot;splunk_hec&quot;
SYSLOG | &quot;syslog&quot;
FILESYSTEM | &quot;filesystem&quot;
S3 | &quot;s3&quot;
AZURE_BLOB | &quot;azure_blob&quot;
AZURE_LOGS | &quot;azure_logs&quot;
KAFKA | &quot;kafka&quot;
KINESIS | &quot;kinesis&quot;
ELASTIC | &quot;elastic&quot;
HONEYCOMB | &quot;honeycomb&quot;
NEWRELIC | &quot;newrelic&quot;
NEWRELIC_EVENTS | &quot;newrelic_events&quot;
SNMP | &quot;snmp&quot;
INFLUXDB | &quot;influxdb&quot;
MINIO | &quot;minio&quot;
DEVNULL | &quot;devnull&quot;
CLOUDWATCH | &quot;cloudwatch&quot;
AZURE_EVENTHUB | &quot;azure_eventhub&quot;
STATSD | &quot;statsd&quot;
STATSD_EXT | &quot;statsd_ext&quot;
GRAPHITE | &quot;graphite&quot;
WAVEFRONT | &quot;wavefront&quot;
SIGNALFX | &quot;signalfx&quot;
SQS | &quot;sqs&quot;
GOOGLE_CLOUD_STORAGE | &quot;google_cloud_storage&quot;
SUMO_LOGIC | &quot;sumo_logic&quot;
DATADOG | &quot;datadog&quot;
WEBHOOK | &quot;webhook&quot;
PROMETHEUS | &quot;prometheus&quot;
GOOGLE_PUBSUB | &quot;google_pubsub&quot;
GOOGLE_CHRONICLE | &quot;google_chronicle&quot;
GRAFANA_CLOUD | &quot;grafana_cloud&quot;
LOKI_37 | &quot;loki&quot;

<a name="CompressionEnum"></a>
## Enum: CompressionEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
GZIP | &quot;gzip&quot;
SNAPPY | &quot;snappy&quot;

<a name="OnBackpressureEnum"></a>
## Enum: OnBackpressureEnum
Name | Value
---- | -----
BLOCK | &quot;block&quot;
DROP | &quot;drop&quot;
QUEUE | &quot;queue&quot;

<a name="AuthTypeEnum"></a>
## Enum: AuthTypeEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
TOKEN | &quot;token&quot;
TEXTSECRET | &quot;textSecret&quot;
BASIC | &quot;basic&quot;
CREDENTIALSSECRET | &quot;credentialsSecret&quot;

<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
UDP | &quot;udp&quot;
TCP | &quot;tcp&quot;

<a name="FacilityEnum"></a>
## Enum: FacilityEnum
Name | Value
---- | -----
NUMBER_0 | new BigDecimal(0)
NUMBER_1 | new BigDecimal(1)
NUMBER_2 | new BigDecimal(2)
NUMBER_3 | new BigDecimal(3)
NUMBER_4 | new BigDecimal(4)
NUMBER_5 | new BigDecimal(5)
NUMBER_6 | new BigDecimal(6)
NUMBER_7 | new BigDecimal(7)
NUMBER_8 | new BigDecimal(8)
NUMBER_9 | new BigDecimal(9)
NUMBER_10 | new BigDecimal(10)
NUMBER_11 | new BigDecimal(11)
NUMBER_12 | new BigDecimal(12)
NUMBER_13 | new BigDecimal(13)
NUMBER_14 | new BigDecimal(14)
NUMBER_15 | new BigDecimal(15)
NUMBER_16 | new BigDecimal(16)
NUMBER_17 | new BigDecimal(17)
NUMBER_18 | new BigDecimal(18)
NUMBER_19 | new BigDecimal(19)
NUMBER_20 | new BigDecimal(20)
NUMBER_21 | new BigDecimal(21)

<a name="SeverityEnum"></a>
## Enum: SeverityEnum
Name | Value
---- | -----
EMERGENCY | &quot;emergency&quot;
ALERT | &quot;alert&quot;
CRITICAL | &quot;critical&quot;
ERROR | &quot;error&quot;
WARNING | &quot;warning&quot;
NOTICE | &quot;notice&quot;
INFO | &quot;info&quot;
DEBUG | &quot;debug&quot;

<a name="MessageFormatEnum"></a>
## Enum: MessageFormatEnum
Name | Value
---- | -----
PROTOBUF | &quot;protobuf&quot;
JSON | &quot;json&quot;

<a name="TimestampFormatEnum"></a>
## Enum: TimestampFormatEnum
Name | Value
---- | -----
SYSLOG | &quot;syslog&quot;
ISO8601 | &quot;iso8601&quot;

<a name="NestedFieldsEnum"></a>
## Enum: NestedFieldsEnum
Name | Value
---- | -----
JSON | &quot;json&quot;
NONE | &quot;none&quot;

<a name="FormatEnum"></a>
## Enum: FormatEnum
Name | Value
---- | -----
NDJSON | &quot;ndjson&quot;
JSON_ARRAY | &quot;json_array&quot;
CUSTOM | &quot;custom&quot;

<a name="RegionEnum"></a>
## Enum: RegionEnum
Name | Value
---- | -----
PUBSUB_GOOGLEAPIS_COM | &quot;pubsub.googleapis.com&quot;
US_EAST1_PUBSUB_GOOGLEAPIS_COM | &quot;us-east1-pubsub.googleapis.com&quot;
US_EAST4_PUBSUB_GOOGLEAPIS_COM | &quot;us-east4-pubsub.googleapis.com&quot;
US_CENTRAL1_PUBSUB_GOOGLEAPIS_COM | &quot;us-central1-pubsub.googleapis.com&quot;
US_CENTRAL2_PUBSUB_GOOGLEAPIS_COM | &quot;us-central2-pubsub.googleapis.com&quot;
US_WEST1_PUBSUB_GOOGLEAPIS_COM | &quot;us-west1-pubsub.googleapis.com&quot;
US_WEST2_PUBSUB_GOOGLEAPIS_COM | &quot;us-west2-pubsub.googleapis.com&quot;
US_WEST3_PUBSUB_GOOGLEAPIS_COM | &quot;us-west3-pubsub.googleapis.com&quot;
SOUTHAMERICA_EAST1_PUBSUB_GOOGLEAPIS_COM | &quot;southamerica-east1-pubsub.googleapis.com&quot;
NORTHAMERICA_NORTHEAST1_PUBSUB_GOOGLEAPIS_COM | &quot;northamerica-northeast1-pubsub.googleapis.com&quot;
EUROPE_WEST6_PUBSUB_GOOGLEAPIS_COM | &quot;europe-west6-pubsub.googleapis.com&quot;
EUROPE_WEST4_PUBSUB_GOOGLEAPIS_COM | &quot;europe-west4-pubsub.googleapis.com&quot;
EUROPE_WEST3_PUBSUB_GOOGLEAPIS_COM | &quot;europe-west3-pubsub.googleapis.com&quot;
EUROPE_WEST2_PUBSUB_GOOGLEAPIS_COM | &quot;europe-west2-pubsub.googleapis.com&quot;
EUROPE_WEST1_PUBSUB_GOOGLEAPIS_COM | &quot;europe-west1-pubsub.googleapis.com&quot;
EUROPE_NORTH1_PUBSUB_GOOGLEAPIS_COM | &quot;europe-north1-pubsub.googleapis.com&quot;
AUSTRALIA_SOUTHEAST1_PUBSUB_GOOGLEAPIS_COM | &quot;australia-southeast1-pubsub.googleapis.com&quot;
ASIA_SOUTHEAST1_PUBSUB_GOOGLEAPIS_COM | &quot;asia-southeast1-pubsub.googleapis.com&quot;
ASIA_SOUTH1_PUBSUB_GOOGLEAPIS_COM | &quot;asia-south1-pubsub.googleapis.com&quot;
ASIA_NORTHEAST3_PUBSUB_GOOGLEAPIS_COM | &quot;asia-northeast3-pubsub.googleapis.com&quot;
ASIA_NORTHEAST2_PUBSUB_GOOGLEAPIS_COM | &quot;asia-northeast2-pubsub.googleapis.com&quot;
ASIA_NORTHEAST1_PUBSUB_GOOGLEAPIS_COM | &quot;asia-northeast1-pubsub.googleapis.com&quot;
ASIA_EAST2_PUBSUB_GOOGLEAPIS_COM | &quot;asia-east2-pubsub.googleapis.com&quot;
ASIA_EAST1_PUBSUB_GOOGLEAPIS_COM | &quot;asia-east1-pubsub.googleapis.com&quot;
ASIA | &quot;ASIA&quot;
EU | &quot;EU&quot;
US | &quot;US&quot;
ASIA1 | &quot;ASIA1&quot;
EUR4 | &quot;EUR4&quot;
NAM4 | &quot;NAM4&quot;

<a name="AwsAuthenticationMethodEnum"></a>
## Enum: AwsAuthenticationMethodEnum
Name | Value
---- | -----
MANUAL | &quot;manual&quot;
SECRET | &quot;secret&quot;
SECRET_2 | &quot;secret&quot;

<a name="SignatureVersionEnum"></a>
## Enum: SignatureVersionEnum
Name | Value
---- | -----
V2 | &quot;v2&quot;
V4 | &quot;v4&quot;

<a name="ObjectACLEnum"></a>
## Enum: ObjectACLEnum
Name | Value
---- | -----
PRIVATE | &quot;private&quot;
BUCKET_OWNER_READ | &quot;bucket-owner-read&quot;
BUCKET_OWNER_FULL_CONTROL | &quot;bucket-owner-full-control&quot;
PROJECT_PRIVATE | &quot;project-private&quot;
AUTHENTICATED_READ | &quot;authenticated-read&quot;
PUBLIC_READ | &quot;public-read&quot;
BUCKET_OWNER_FULL_CONTROL_6 | &quot;bucket-owner-full-control&quot;

<a name="StorageClassEnum"></a>
## Enum: StorageClassEnum
Name | Value
---- | -----
STANDARD | &quot;STANDARD&quot;
NEARLINE | &quot;NEARLINE&quot;
COLDLINE | &quot;COLDLINE&quot;
ARCHIVE | &quot;ARCHIVE&quot;
INTELLIGENT_TIERING | &quot;INTELLIGENT_TIERING&quot;
GLACIER | &quot;GLACIER&quot;
DEEP_ARCHIVE | &quot;DEEP_ARCHIVE&quot;

<a name="ServerSideEncryptionEnum"></a>
## Enum: ServerSideEncryptionEnum
Name | Value
---- | -----
AES256 | &quot;AES256&quot;
AWS_KMS | &quot;aws:kms&quot;

<a name="LogTypeEnum"></a>
## Enum: LogTypeEnum
Name | Value
---- | -----
ABNORMAL_SECURITY | &quot;ABNORMAL_SECURITY&quot;
ABSOLUTE | &quot;ABSOLUTE&quot;
ACALVIO | &quot;ACALVIO&quot;
ACCELLION | &quot;ACCELLION&quot;
ACTIVE_SYNC | &quot;ACTIVE_SYNC&quot;
ADAUDIT_PLUS | &quot;ADAUDIT_PLUS&quot;
ADFS | &quot;ADFS&quot;
ADMANAGER_PLUS | &quot;ADMANAGER_PLUS&quot;
AIRWATCH | &quot;AIRWATCH&quot;
AI_HUNTER | &quot;AI_HUNTER&quot;
AKAMAI_CLOUD_MONITOR | &quot;AKAMAI_CLOUD_MONITOR&quot;
AKAMAI_DDOS | &quot;AKAMAI_DDOS&quot;
AKAMAI_DHCP | &quot;AKAMAI_DHCP&quot;
AKAMAI_DNS | &quot;AKAMAI_DNS&quot;
AKAMAI_WAF | &quot;AKAMAI_WAF&quot;
ALGOSEC | &quot;ALGOSEC&quot;
ALLOT_NETENFORCER | &quot;ALLOT_NETENFORCER&quot;
ANOMALI_IOC | &quot;ANOMALI_IOC&quot;
APACHE | &quot;APACHE&quot;
APC_SMART_UPS | &quot;APC_SMART_UPS&quot;
AQUA_SECURITY | &quot;AQUA_SECURITY&quot;
ARBOR_EDGE_DEFENSE | &quot;ARBOR_EDGE_DEFENSE&quot;
ARKIME_PCAP | &quot;ARKIME_PCAP&quot;
ARMIS | &quot;ARMIS&quot;
ARRAYNETWORKS_VPN | &quot;ARRAYNETWORKS_VPN&quot;
ARUBA_AIRWAVE | &quot;ARUBA_AIRWAVE&quot;
ARUBA_WIRELESS | &quot;ARUBA_WIRELESS&quot;
ASOC_ALERT | &quot;ASOC_ALERT&quot;
ASSET_STATIC_IP | &quot;ASSET_STATIC_IP&quot;
ATTIVO | &quot;ATTIVO&quot;
ATT_NETBOND | &quot;ATT_NETBOND&quot;
AUDITD | &quot;AUDITD&quot;
AUTHENTIC8_SILO | &quot;AUTHENTIC8_SILO&quot;
AUTHX | &quot;AUTHX&quot;
AUTH_ZERO | &quot;AUTH_ZERO&quot;
AUTOMATION_ANYWHERE | &quot;AUTOMATION_ANYWHERE&quot;
AUTOMOX_EPM | &quot;AUTOMOX_EPM&quot;
AVANAN_EMAIL | &quot;AVANAN_EMAIL&quot;
AVATIER | &quot;AVATIER&quot;
AVAYA_WIRELESS | &quot;AVAYA_WIRELESS&quot;
AWS_CLOUDFRONT | &quot;AWS_CLOUDFRONT&quot;
AWS_CLOUDTRAIL | &quot;AWS_CLOUDTRAIL&quot;
AWS_CLOUDWATCH | &quot;AWS_CLOUDWATCH&quot;
AWS_CONFIG | &quot;AWS_CONFIG&quot;
AWS_CONTROL_TOWER | &quot;AWS_CONTROL_TOWER&quot;
AWS_ELB | &quot;AWS_ELB&quot;
AWS_MACIE | &quot;AWS_MACIE&quot;
AWS_ROUTE_53 | &quot;AWS_ROUTE_53&quot;
AWS_SECURITY_HUB | &quot;AWS_SECURITY_HUB&quot;
AWS_SESSION_MANAGER | &quot;AWS_SESSION_MANAGER&quot;
AWS_VPC_FLOW | &quot;AWS_VPC_FLOW&quot;
AWS_WAF | &quot;AWS_WAF&quot;
AZURE | &quot;AZURE&quot;
AZURE_ACTIVITY | &quot;AZURE_ACTIVITY&quot;
AZURE_AD | &quot;AZURE_AD&quot;
AZURE_AD_CONTEXT | &quot;AZURE_AD_CONTEXT&quot;
AZURE_ATP | &quot;AZURE_ATP&quot;
AZURE_MDM_INTUNE | &quot;AZURE_MDM_INTUNE&quot;
AZURE_NSG_FLOW | &quot;AZURE_NSG_FLOW&quot;
AZURE_RESOURCE_LOGS | &quot;AZURE_RESOURCE_LOGS&quot;
BARRACUDA_CLOUDGEN_ACCESS | &quot;BARRACUDA_CLOUDGEN_ACCESS&quot;
BARRACUDA_EMAIL | &quot;BARRACUDA_EMAIL&quot;
BARRACUDA_WAF | &quot;BARRACUDA_WAF&quot;
BIGSWITCH_BCF | &quot;BIGSWITCH_BCF&quot;
BIND_DNS | &quot;BIND_DNS&quot;
BITDEFENDER | &quot;BITDEFENDER&quot;
BLUECAT_DDI | &quot;BLUECAT_DDI&quot;
BLUECOAT_WEBPROXY | &quot;BLUECOAT_WEBPROXY&quot;
BMC_AMI_DEFENDER | &quot;BMC_AMI_DEFENDER&quot;
BOMGAR | &quot;BOMGAR&quot;
BOX | &quot;BOX&quot;
BRIVO | &quot;BRIVO&quot;
BROCADE_SERVERIRON | &quot;BROCADE_SERVERIRON&quot;
BROCADE_SWITCH | &quot;BROCADE_SWITCH&quot;
BRO_DHCP | &quot;BRO_DHCP&quot;
BRO_HTTP | &quot;BRO_HTTP&quot;
BRO_JSON | &quot;BRO_JSON&quot;
BRO_TSV | &quot;BRO_TSV&quot;
BT_IPCONTROL | &quot;BT_IPCONTROL&quot;
CATO_NETWORKS | &quot;CATO_NETWORKS&quot;
CATO_SDWAN | &quot;CATO_SDWAN&quot;
CA_ACF2 | &quot;CA_ACF2&quot;
CA_LDAP | &quot;CA_LDAP&quot;
CA_SSO_WEB | &quot;CA_SSO_WEB&quot;
CB_APP_CONTROL | &quot;CB_APP_CONTROL&quot;
CB_EDR | &quot;CB_EDR&quot;
CENTRIFY_SSO | &quot;CENTRIFY_SSO&quot;
CENTRIPETAL_IOC | &quot;CENTRIPETAL_IOC&quot;
CHECKPOINT_EDR | &quot;CHECKPOINT_EDR&quot;
CHECKPOINT_EMAIL | &quot;CHECKPOINT_EMAIL&quot;
CHECKPOINT_FIREWALL | &quot;CHECKPOINT_FIREWALL&quot;
CISCO_ACE | &quot;CISCO_ACE&quot;
CISCO_ACI | &quot;CISCO_ACI&quot;
CISCO_ACS | &quot;CISCO_ACS&quot;
CISCO_AMP | &quot;CISCO_AMP&quot;
CISCO_ASA_FIREWALL | &quot;CISCO_ASA_FIREWALL&quot;
CISCO_CTS | &quot;CISCO_CTS&quot;
CISCO_DHCP | &quot;CISCO_DHCP&quot;
CISCO_DNS | &quot;CISCO_DNS&quot;
CISCO_EMAIL_SECURITY | &quot;CISCO_EMAIL_SECURITY&quot;
CISCO_FIREPOWER_FIREWALL | &quot;CISCO_FIREPOWER_FIREWALL&quot;
CISCO_FIRESIGHT | &quot;CISCO_FIRESIGHT&quot;
CISCO_IOS | &quot;CISCO_IOS&quot;
CISCO_ISE | &quot;CISCO_ISE&quot;
CISCO_MERAKI | &quot;CISCO_MERAKI&quot;
CISCO_NX_OS | &quot;CISCO_NX_OS&quot;
CISCO_PRIME | &quot;CISCO_PRIME&quot;
CISCO_ROUTER | &quot;CISCO_ROUTER&quot;
CISCO_SMA | &quot;CISCO_SMA&quot;
CISCO_SWITCH | &quot;CISCO_SWITCH&quot;
CISCO_TACACS | &quot;CISCO_TACACS&quot;
CISCO_UCM | &quot;CISCO_UCM&quot;
CISCO_UCS | &quot;CISCO_UCS&quot;
CISCO_VPN | &quot;CISCO_VPN&quot;
CISCO_WIRELESS | &quot;CISCO_WIRELESS&quot;
CISCO_WSA | &quot;CISCO_WSA&quot;
CIS_ALBERT_ALERT | &quot;CIS_ALBERT_ALERT&quot;
CITRIX_NETSCALER | &quot;CITRIX_NETSCALER&quot;
CITRIX_NETSCALER_WEB_LOGS | &quot;CITRIX_NETSCALER_WEB_LOGS&quot;
CITRIX_SDWAN | &quot;CITRIX_SDWAN&quot;
CITRIX_STOREFRONT | &quot;CITRIX_STOREFRONT&quot;
CITRIX_WEB_GATEWAY | &quot;CITRIX_WEB_GATEWAY&quot;
CITRIX_WORKSPACE | &quot;CITRIX_WORKSPACE&quot;
CLAM_AV | &quot;CLAM_AV&quot;
CLEARPASS | &quot;CLEARPASS&quot;
CLOUDFLARE | &quot;CLOUDFLARE&quot;
CLOUDGENIX_SDWAN | &quot;CLOUDGENIX_SDWAN&quot;
CLOUDIAN_HYPERSTORE | &quot;CLOUDIAN_HYPERSTORE&quot;
CLOUDM | &quot;CLOUDM&quot;
CLOUDPASSAGE_CSM | &quot;CLOUDPASSAGE_CSM&quot;
CLOUDPASSAGE_FIM | &quot;CLOUDPASSAGE_FIM&quot;
CLOUDPASSAGE_LIDS | &quot;CLOUDPASSAGE_LIDS&quot;
CLOUDPASSAGE_SVM | &quot;CLOUDPASSAGE_SVM&quot;
CLOUD_IDENTITY_CONTEXT | &quot;CLOUD_IDENTITY_CONTEXT&quot;
CLOUD_PASSAGE | &quot;CLOUD_PASSAGE&quot;
CMD | &quot;CMD&quot;
CODE42 | &quot;CODE42&quot;
CODE_WORLDWIDE | &quot;CODE_WORLDWIDE&quot;
COFENSE_TRIAGE | &quot;COFENSE_TRIAGE&quot;
COFENSE_VISION | &quot;COFENSE_VISION&quot;
COHESITY | &quot;COHESITY&quot;
COMODO_AV | &quot;COMODO_AV&quot;
CORELIGHT | &quot;CORELIGHT&quot;
CORTEX_XDR | &quot;CORTEX_XDR&quot;
COVID_CTC_IOC | &quot;COVID_CTC_IOC&quot;
CROWDSTRIKE_IOC | &quot;CROWDSTRIKE_IOC&quot;
CSV_CUSTOM_IOC | &quot;CSV_CUSTOM_IOC&quot;
CS_CEF_EDR | &quot;CS_CEF_EDR&quot;
CS_EDR | &quot;CS_EDR&quot;
CS_STREAM | &quot;CS_STREAM&quot;
CUSTOMER_ALERT | &quot;CUSTOMER_ALERT&quot;
CUSTOM_SECURITY_DATA_ANALYTICS | &quot;CUSTOM_SECURITY_DATA_ANALYTICS&quot;
CYBERARK | &quot;CYBERARK&quot;
CYBEREASON_EDR | &quot;CYBEREASON_EDR&quot;
CYLANCE | &quot;CYLANCE&quot;
CYLANCE_PROTECT | &quot;CYLANCE_PROTECT&quot;
D3_SECURITY | &quot;D3_SECURITY&quot;
DARKTRACE | &quot;DARKTRACE&quot;
DATAWATCH | &quot;DATAWATCH&quot;
DB2_DB | &quot;DB2_DB&quot;
DELL_EMC_NAS | &quot;DELL_EMC_NAS&quot;
DELL_SWITCH | &quot;DELL_SWITCH&quot;
DHS_IOC | &quot;DHS_IOC&quot;
DIGITALGUARDIAN_EDR | &quot;DIGITALGUARDIAN_EDR&quot;
DIGITAL_SHADOWS_IOC | &quot;DIGITAL_SHADOWS_IOC&quot;
DMP_ENTRE | &quot;DMP_ENTRE&quot;
DROPBOX | &quot;DROPBOX&quot;
DUO_AUTH | &quot;DUO_AUTH&quot;
DUO_CASB | &quot;DUO_CASB&quot;
DUO_NETWORK_GATEWAY | &quot;DUO_NETWORK_GATEWAY&quot;
DUO_USER_CONTEXT | &quot;DUO_USER_CONTEXT&quot;
ECAR | &quot;ECAR&quot;
ECAR_BRO | &quot;ECAR_BRO&quot;
EFFICIENTIP_DDI | &quot;EFFICIENTIP_DDI&quot;
EIQ_EDR | &quot;EIQ_EDR&quot;
ELASTIC_FILEBEAT | &quot;ELASTIC_FILEBEAT&quot;
ELASTIC_METRICBEAT | &quot;ELASTIC_METRICBEAT&quot;
ELASTIC_PACKETBEATS | &quot;ELASTIC_PACKETBEATS&quot;
ELASTIC_SEARCH | &quot;ELASTIC_SEARCH&quot;
ELASTIC_WINLOGBEAT | &quot;ELASTIC_WINLOGBEAT&quot;
ENDGAME_EDR | &quot;ENDGAME_EDR&quot;
ESET_AV | &quot;ESET_AV&quot;
ESET_EDR | &quot;ESET_EDR&quot;
ESET_IOC | &quot;ESET_IOC&quot;
ET_PRO_IOC | &quot;ET_PRO_IOC&quot;
EXCHANGE_MAIL | &quot;EXCHANGE_MAIL&quot;
EXTRAHOP | &quot;EXTRAHOP&quot;
EXTRAHOP_DHCP | &quot;EXTRAHOP_DHCP&quot;
EXTRAHOP_DNS | &quot;EXTRAHOP_DNS&quot;
F5_ASM | &quot;F5_ASM&quot;
F5_BIGIP_LTM | &quot;F5_BIGIP_LTM&quot;
F5_DNS | &quot;F5_DNS&quot;
F5_VPN | &quot;F5_VPN&quot;
FALCO_IDS | &quot;FALCO_IDS&quot;
FIDELIS_ENDPOINT | &quot;FIDELIS_ENDPOINT&quot;
FIDELIS_NETWORK | &quot;FIDELIS_NETWORK&quot;
FILEZILLA_FTP | &quot;FILEZILLA_FTP&quot;
FIREEYE_ALERT | &quot;FIREEYE_ALERT&quot;
FIREEYE_ETP | &quot;FIREEYE_ETP&quot;
FIREEYE_HX | &quot;FIREEYE_HX&quot;
FIREEYE_NX | &quot;FIREEYE_NX&quot;
FLUENTD | &quot;FLUENTD&quot;
FORCEPOINT_DLP | &quot;FORCEPOINT_DLP&quot;
FORCEPOINT_WEBPROXY | &quot;FORCEPOINT_WEBPROXY&quot;
FORESCOUT_NAC | &quot;FORESCOUT_NAC&quot;
FORSETI | &quot;FORSETI&quot;
FORTINET_DHCP | &quot;FORTINET_DHCP&quot;
FORTINET_FIREWALL | &quot;FORTINET_FIREWALL&quot;
FORTINET_FORTIEDR | &quot;FORTINET_FORTIEDR&quot;
FORTINET_FORTINAC | &quot;FORTINET_FORTINAC&quot;
FORTINET_SANDBOX | &quot;FORTINET_SANDBOX&quot;
FORTINET_WEBPROXY | &quot;FORTINET_WEBPROXY&quot;
FOX_IT_STIX | &quot;FOX_IT_STIX&quot;
FREEIPA | &quot;FREEIPA&quot;
FREERADIUS | &quot;FREERADIUS&quot;
FRONTLINE_VM | &quot;FRONTLINE_VM&quot;
FUTUREX_HSM | &quot;FUTUREX_HSM&quot;
GCP | &quot;GCP&quot;
GCP_APIGEE | &quot;GCP_APIGEE&quot;
GCP_CLOUD_NAT | &quot;GCP_CLOUD_NAT&quot;
GCP_CSCC | &quot;GCP_CSCC&quot;
GCP_DNS | &quot;GCP_DNS&quot;
GCP_FIREWALL | &quot;GCP_FIREWALL&quot;
GCP_THREAT_DETECTION | &quot;GCP_THREAT_DETECTION&quot;
GCP_VPC_FLOW | &quot;GCP_VPC_FLOW&quot;
GIGAMON | &quot;GIGAMON&quot;
GITHUB | &quot;GITHUB&quot;
GLOBALSCAPE_SFTP | &quot;GLOBALSCAPE_SFTP&quot;
GLUSTER_FS | &quot;GLUSTER_FS&quot;
GMAIL_LOGS | &quot;GMAIL_LOGS&quot;
GREATHORN | &quot;GREATHORN&quot;
GSUITE_ADMIN | &quot;GSUITE_ADMIN&quot;
GSUITE_AUDIT | &quot;GSUITE_AUDIT&quot;
GUARDDUTY | &quot;GUARDDUTY&quot;
HAPROXY | &quot;HAPROXY&quot;
HASHICORP | &quot;HASHICORP&quot;
HITACHI_ID_PAM | &quot;HITACHI_ID_PAM&quot;
HONEYD | &quot;HONEYD&quot;
HP_PROCURVE | &quot;HP_PROCURVE&quot;
IBM_AS400 | &quot;IBM_AS400&quot;
IBM_CICS | &quot;IBM_CICS&quot;
IBM_MAAS360 | &quot;IBM_MAAS360&quot;
IBM_SWITCH | &quot;IBM_SWITCH&quot;
IBM_TIVOLI | &quot;IBM_TIVOLI&quot;
IBM_WEBSPHERE_APP_SERVER | &quot;IBM_WEBSPHERE_APP_SERVER&quot;
IBM_ZOS | &quot;IBM_ZOS&quot;
IBOSS_WEBPROXY | &quot;IBOSS_WEBPROXY&quot;
IDRAC | &quot;IDRAC&quot;
IIS | &quot;IIS&quot;
IMPERVA_DB | &quot;IMPERVA_DB&quot;
IMPERVA_WAF | &quot;IMPERVA_WAF&quot;
INFOBLOX | &quot;INFOBLOX&quot;
INFOBLOX_DHCP | &quot;INFOBLOX_DHCP&quot;
INFOBLOX_DNS | &quot;INFOBLOX_DNS&quot;
INFOBLOX_LOADBALANCER | &quot;INFOBLOX_LOADBALANCER&quot;
INFOBLOX_NETMRI | &quot;INFOBLOX_NETMRI&quot;
INFOBLOX_RPZ | &quot;INFOBLOX_RPZ&quot;
IPSWITCH_MOVEIT_AUTOMATION | &quot;IPSWITCH_MOVEIT_AUTOMATION&quot;
IPSWITCH_MOVEIT_TRANSFER | &quot;IPSWITCH_MOVEIT_TRANSFER&quot;
IPSWITCH_SFTP | &quot;IPSWITCH_SFTP&quot;
ISC_DHCP | &quot;ISC_DHCP&quot;
JAMF | &quot;JAMF&quot;
JUMPCLOUD_DAAS | &quot;JUMPCLOUD_DAAS&quot;
JUNIPER_FIREWALL | &quot;JUNIPER_FIREWALL&quot;
JUNIPER_IPS | &quot;JUNIPER_IPS&quot;
JUNIPER_MX | &quot;JUNIPER_MX&quot;
KASEYA | &quot;KASEYA&quot;
KASPERSKY_AV | &quot;KASPERSKY_AV&quot;
KEA_DHCP | &quot;KEA_DHCP&quot;
KEEPER | &quot;KEEPER&quot;
KEMP_LOADBALANCER | &quot;KEMP_LOADBALANCER&quot;
KNOWBE4_PHISHER | &quot;KNOWBE4_PHISHER&quot;
KUBERNETES_AUTH_PROXY | &quot;KUBERNETES_AUTH_PROXY&quot;
KUBERNETES_NODE | &quot;KUBERNETES_NODE&quot;
KYRIBA | &quot;KYRIBA&quot;
LACEWORK | &quot;LACEWORK&quot;
LIMACHARLIE_EDR | &quot;LIMACHARLIE_EDR&quot;
LINUX_DHCP | &quot;LINUX_DHCP&quot;
LOGICMONITOR | &quot;LOGICMONITOR&quot;
LOOKINGGLASS_IPS | &quot;LOOKINGGLASS_IPS&quot;
LOOKING_GLASS_IOC | &quot;LOOKING_GLASS_IOC&quot;
MALWAREBYTES_EDR | &quot;MALWAREBYTES_EDR&quot;
MANGOAPPS | &quot;MANGOAPPS&quot;
MATERIAL_SECURITY | &quot;MATERIAL_SECURITY&quot;
MCAFEE_DLP | &quot;MCAFEE_DLP&quot;
MCAFEE_EDR | &quot;MCAFEE_EDR&quot;
MCAFEE_EPO | &quot;MCAFEE_EPO&quot;
MCAFEE_ESM | &quot;MCAFEE_ESM&quot;
MCAFEE_IPS | &quot;MCAFEE_IPS&quot;
MCAFEE_MVISION_CASB | &quot;MCAFEE_MVISION_CASB&quot;
MCAFEE_UCE | &quot;MCAFEE_UCE&quot;
MCAFEE_WEBPROXY | &quot;MCAFEE_WEBPROXY&quot;
MCAFEE_WEB_PROTECTION | &quot;MCAFEE_WEB_PROTECTION&quot;
MEDIGATE_CMDB | &quot;MEDIGATE_CMDB&quot;
MEDIGATE_IOT | &quot;MEDIGATE_IOT&quot;
MENLO_SECURITY | &quot;MENLO_SECURITY&quot;
MICROSOFT_ATA | &quot;MICROSOFT_ATA&quot;
MICROSOFT_CASB | &quot;MICROSOFT_CASB&quot;
MICROSOFT_GRAPH_ALERT | &quot;MICROSOFT_GRAPH_ALERT&quot;
MICROSOFT_SCEP | &quot;MICROSOFT_SCEP&quot;
MICROSOFT_SECURITY_CENTER_ALERT | &quot;MICROSOFT_SECURITY_CENTER_ALERT&quot;
MICROSOFT_SQL | &quot;MICROSOFT_SQL&quot;
MIMECAST_MAIL | &quot;MIMECAST_MAIL&quot;
MIMECAST_WEBPROXY | &quot;MIMECAST_WEBPROXY&quot;
MINERVA_AV | &quot;MINERVA_AV&quot;
MISP_IOC | &quot;MISP_IOC&quot;
MONGO_DB | &quot;MONGO_DB&quot;
MULESOFT | &quot;MULESOFT&quot;
MYSQL | &quot;MYSQL&quot;
NAGIOS | &quot;NAGIOS&quot;
NASUNI_FILE_SERVICES | &quot;NASUNI_FILE_SERVICES&quot;
NCR_DIGITAL_INSIGHT_FSG | &quot;NCR_DIGITAL_INSIGHT_FSG&quot;
NCR_DIGITAL_INSIGHT_GL | &quot;NCR_DIGITAL_INSIGHT_GL&quot;
NETAPP_SAN | &quot;NETAPP_SAN&quot;
NETDISCO | &quot;NETDISCO&quot;
NETMOTION | &quot;NETMOTION&quot;
NETSKOPE_ALERT | &quot;NETSKOPE_ALERT&quot;
NETSKOPE_WEBPROXY | &quot;NETSKOPE_WEBPROXY&quot;
NGINX | &quot;NGINX&quot;
NIMBLE_OS | &quot;NIMBLE_OS&quot;
NIX_SYSTEM | &quot;NIX_SYSTEM&quot;
NUCLEUS_ASSET | &quot;NUCLEUS_ASSET&quot;
NUCLEUS_VULNERABILITY | &quot;NUCLEUS_VULNERABILITY&quot;
NUCLEUS_VULNERABILITY_DELTA | &quot;NUCLEUS_VULNERABILITY_DELTA&quot;
NUTANIX_PRISM | &quot;NUTANIX_PRISM&quot;
OBSERVEIT | &quot;OBSERVEIT&quot;
OBSIDIAN | &quot;OBSIDIAN&quot;
OFFICE_365 | &quot;OFFICE_365&quot;
OKTA | &quot;OKTA&quot;
OKTA_ACCESS_GATEWAY | &quot;OKTA_ACCESS_GATEWAY&quot;
OKTA_USER_CONTEXT | &quot;OKTA_USER_CONTEXT&quot;
ONBASE_CMS | &quot;ONBASE_CMS&quot;
ONEIDENTITY_ARS | &quot;ONEIDENTITY_ARS&quot;
ONEIDENTITY_CHANGE_AUDITOR | &quot;ONEIDENTITY_CHANGE_AUDITOR&quot;
ONEIDENTITY_DEFENDER | &quot;ONEIDENTITY_DEFENDER&quot;
ONEIDENTITY_TPAM | &quot;ONEIDENTITY_TPAM&quot;
ONELOGIN_SSO | &quot;ONELOGIN_SSO&quot;
OPENAM | &quot;OPENAM&quot;
OPENDJ | &quot;OPENDJ&quot;
OPENGEAR | &quot;OPENGEAR&quot;
OPENPATH | &quot;OPENPATH&quot;
OPENSSH | &quot;OPENSSH&quot;
OPEN_VPN | &quot;OPEN_VPN&quot;
ORACLE_DB | &quot;ORACLE_DB&quot;
ORDR_IOT | &quot;ORDR_IOT&quot;
OSINT_IOC | &quot;OSINT_IOC&quot;
OSQUERY_EDR | &quot;OSQUERY_EDR&quot;
OSSEC | &quot;OSSEC&quot;
PAN_CASB | &quot;PAN_CASB&quot;
PAN_EDR | &quot;PAN_EDR&quot;
PAN_FIREWALL | &quot;PAN_FIREWALL&quot;
PAN_IOC | &quot;PAN_IOC&quot;
PAN_PRISMA_CLOUD | &quot;PAN_PRISMA_CLOUD&quot;
PASSIVE_DNS | &quot;PASSIVE_DNS&quot;
PCAP_SSL_CLIENT_HELLO | &quot;PCAP_SSL_CLIENT_HELLO&quot;
PEOPLESOFT | &quot;PEOPLESOFT&quot;
PEPLINK_LOADBALANCER | &quot;PEPLINK_LOADBALANCER&quot;
PEPLINK_ROUTER | &quot;PEPLINK_ROUTER&quot;
PEPLINK_SWITCH | &quot;PEPLINK_SWITCH&quot;
PERIMETERX_BOT_PROTECTION | &quot;PERIMETERX_BOT_PROTECTION&quot;
PFSENSE | &quot;PFSENSE&quot;
PHISHEYE_ALERT | &quot;PHISHEYE_ALERT&quot;
PING | &quot;PING&quot;
PIVOTAL | &quot;PIVOTAL&quot;
PLIXER_SCRUTINIZER | &quot;PLIXER_SCRUTINIZER&quot;
POSTFIX_MAIL | &quot;POSTFIX_MAIL&quot;
POWERSHELL | &quot;POWERSHELL&quot;
POWER_DNS | &quot;POWER_DNS&quot;
PREEMPT | &quot;PREEMPT&quot;
PREEMPT_AUTH | &quot;PREEMPT_AUTH&quot;
PROOFID | &quot;PROOFID&quot;
PROOFPOINT_CASB | &quot;PROOFPOINT_CASB&quot;
PROOFPOINT_MAIL | &quot;PROOFPOINT_MAIL&quot;
PROOFPOINT_MAIL_FILTER | &quot;PROOFPOINT_MAIL_FILTER&quot;
PROOFPOINT_ON_DEMAND | &quot;PROOFPOINT_ON_DEMAND&quot;
PROOFPOINT_TRAP | &quot;PROOFPOINT_TRAP&quot;
PROOFPOINT_WEB_BROWSER_ISOLATION | &quot;PROOFPOINT_WEB_BROWSER_ISOLATION&quot;
PROWATCH | &quot;PROWATCH&quot;
PULSE_SECURE_VPN | &quot;PULSE_SECURE_VPN&quot;
QUALYS_CONTINUOUS_MONITORING | &quot;QUALYS_CONTINUOUS_MONITORING&quot;
QUALYS_VM | &quot;QUALYS_VM&quot;
RADIUS | &quot;RADIUS&quot;
RADWARE_FIREWALL | &quot;RADWARE_FIREWALL&quot;
RAPID7_INSIGHT | &quot;RAPID7_INSIGHT&quot;
RAPID7_NEXPOSE | &quot;RAPID7_NEXPOSE&quot;
RECORDED_FUTURE_IOC | &quot;RECORDED_FUTURE_IOC&quot;
REDCANARY_CLOUD_PROTECTION_RAW | &quot;REDCANARY_CLOUD_PROTECTION_RAW&quot;
REDCANARY_EDR | &quot;REDCANARY_EDR&quot;
RH_ISAC_IOC | &quot;RH_ISAC_IOC&quot;
RING_CENTRAL | &quot;RING_CENTRAL&quot;
RISKIQ_DIGITAL_FOOTPRINT | &quot;RISKIQ_DIGITAL_FOOTPRINT&quot;
RSA_AUTH_MANAGER | &quot;RSA_AUTH_MANAGER&quot;
SAFECONNECT_NAC | &quot;SAFECONNECT_NAC&quot;
SAILPOINT_IAM | &quot;SAILPOINT_IAM&quot;
SALESFORCE | &quot;SALESFORCE&quot;
SECUREAUTH_SSO | &quot;SECUREAUTH_SSO&quot;
SECURELINK | &quot;SECURELINK&quot;
SEMPERIS_ADFR | &quot;SEMPERIS_ADFR&quot;
SEMPERIS_DSP | &quot;SEMPERIS_DSP&quot;
SENDMAIL | &quot;SENDMAIL&quot;
SENTINEL_DV | &quot;SENTINEL_DV&quot;
SENTINEL_EDR | &quot;SENTINEL_EDR&quot;
SEP | &quot;SEP&quot;
SERVICENOW_CMDB | &quot;SERVICENOW_CMDB&quot;
SERVICENOW_SECURITY | &quot;SERVICENOW_SECURITY&quot;
SHAREPOINT | &quot;SHAREPOINT&quot;
SHIBBOLETH_IDP | &quot;SHIBBOLETH_IDP&quot;
SHODAN_IO | &quot;SHODAN_IO&quot;
SIGNAL_SCIENCES_WAF | &quot;SIGNAL_SCIENCES_WAF&quot;
SITEMINDER_SSO | &quot;SITEMINDER_SSO&quot;
SLACK_AUDIT | &quot;SLACK_AUDIT&quot;
SNIPE_IT | &quot;SNIPE_IT&quot;
SNORT_IDS | &quot;SNORT_IDS&quot;
SONIC_FIREWALL | &quot;SONIC_FIREWALL&quot;
SOPHOS_AV | &quot;SOPHOS_AV&quot;
SOPHOS_DHCP | &quot;SOPHOS_DHCP&quot;
SOPHOS_UTM | &quot;SOPHOS_UTM&quot;
SOURCEFIRE_IDS | &quot;SOURCEFIRE_IDS&quot;
SPLUNK_DNS | &quot;SPLUNK_DNS&quot;
SQUID_WEBPROXY | &quot;SQUID_WEBPROXY&quot;
STEALTHBITS_AUDIT | &quot;STEALTHBITS_AUDIT&quot;
STEALTHBITS_DEFEND | &quot;STEALTHBITS_DEFEND&quot;
STEELHEAD | &quot;STEELHEAD&quot;
STREAMALERT | &quot;STREAMALERT&quot;
STRONGSWAN_VPN | &quot;STRONGSWAN_VPN&quot;
SURICATA_EVE | &quot;SURICATA_EVE&quot;
SURICATA_IDS | &quot;SURICATA_IDS&quot;
SYMANTEC_CASB | &quot;SYMANTEC_CASB&quot;
SYMANTEC_DLP | &quot;SYMANTEC_DLP&quot;
SYMANTEC_EDR | &quot;SYMANTEC_EDR&quot;
SYMANTEC_MAIL | &quot;SYMANTEC_MAIL&quot;
SYMANTEC_VIP | &quot;SYMANTEC_VIP&quot;
SYMANTEC_WEB_ISOLATION | &quot;SYMANTEC_WEB_ISOLATION&quot;
SYMANTEC_WSS | &quot;SYMANTEC_WSS&quot;
TANIUM_ASSET | &quot;TANIUM_ASSET&quot;
TANIUM_AUDIT | &quot;TANIUM_AUDIT&quot;
TANIUM_DISCOVER | &quot;TANIUM_DISCOVER&quot;
TANIUM_INSIGHT | &quot;TANIUM_INSIGHT&quot;
TANIUM_PATCH | &quot;TANIUM_PATCH&quot;
TANIUM_QUESTION | &quot;TANIUM_QUESTION&quot;
TANIUM_REVEAL | &quot;TANIUM_REVEAL&quot;
TANIUM_TH | &quot;TANIUM_TH&quot;
TANIUM_THREAT_RESPONSE | &quot;TANIUM_THREAT_RESPONSE&quot;
TENABLE_IO | &quot;TENABLE_IO&quot;
TENABLE_SC | &quot;TENABLE_SC&quot;
TGDETECT | &quot;TGDETECT&quot;
THALES_MFA | &quot;THALES_MFA&quot;
THINKST_CANARY | &quot;THINKST_CANARY&quot;
THYCOTIC | &quot;THYCOTIC&quot;
THYCOTIC_DEVOPS_SECRETVAULT | &quot;THYCOTIC_DEVOPS_SECRETVAULT&quot;
TIPPING_POINT | &quot;TIPPING_POINT&quot;
TOMCAT | &quot;TOMCAT&quot;
TRENDMICRO_AV | &quot;TRENDMICRO_AV&quot;
TRENDMICRO_EDR | &quot;TRENDMICRO_EDR&quot;
TRENDMICRO_WEBPROXY | &quot;TRENDMICRO_WEBPROXY&quot;
TRIPWIRE_FIM | &quot;TRIPWIRE_FIM&quot;
UDM | &quot;UDM&quot;
ULTRADNS | &quot;ULTRADNS&quot;
UMBRELLA_DNS | &quot;UMBRELLA_DNS&quot;
UMBRELLA_FIREWALL | &quot;UMBRELLA_FIREWALL&quot;
UMBRELLA_IP | &quot;UMBRELLA_IP&quot;
UMBRELLA_WEBPROXY | &quot;UMBRELLA_WEBPROXY&quot;
UNBOUND_DNS | &quot;UNBOUND_DNS&quot;
UPTYCS_EDR | &quot;UPTYCS_EDR&quot;
VANDYKE_SFTP | &quot;VANDYKE_SFTP&quot;
VARONIS | &quot;VARONIS&quot;
VECTRA_DETECT | &quot;VECTRA_DETECT&quot;
VECTRA_STREAM | &quot;VECTRA_STREAM&quot;
VEEAM | &quot;VEEAM&quot;
VERIZON_NDR | &quot;VERIZON_NDR&quot;
VITALQIP | &quot;VITALQIP&quot;
VMRAY_FLOG_XML | &quot;VMRAY_FLOG_XML&quot;
VMWARE_AVINETWORKS_IWAF | &quot;VMWARE_AVINETWORKS_IWAF&quot;
VMWARE_ESX | &quot;VMWARE_ESX&quot;
VMWARE_VCENTER | &quot;VMWARE_VCENTER&quot;
VMWARE_VSHIELD | &quot;VMWARE_VSHIELD&quot;
VORMETRIC | &quot;VORMETRIC&quot;
WATCHGUARD | &quot;WATCHGUARD&quot;
WAZUH | &quot;WAZUH&quot;
WHITECLOUD_EDR | &quot;WHITECLOUD_EDR&quot;
WINDOWS_AD | &quot;WINDOWS_AD&quot;
WINDOWS_APPLOCKER | &quot;WINDOWS_APPLOCKER&quot;
WINDOWS_DEFENDER_ATP | &quot;WINDOWS_DEFENDER_ATP&quot;
WINDOWS_DEFENDER_AV | &quot;WINDOWS_DEFENDER_AV&quot;
WINDOWS_DHCP | &quot;WINDOWS_DHCP&quot;
WINDOWS_DNS | &quot;WINDOWS_DNS&quot;
WINDOWS_NET_POLICY_SERVER | &quot;WINDOWS_NET_POLICY_SERVER&quot;
WINDOWS_SYSMON | &quot;WINDOWS_SYSMON&quot;
WINEVTLOG | &quot;WINEVTLOG&quot;
WINEVTLOG_XML | &quot;WINEVTLOG_XML&quot;
WORKDAY | &quot;WORKDAY&quot;
WORKDAY_AUDIT | &quot;WORKDAY_AUDIT&quot;
WP_ENGINE | &quot;WP_ENGINE&quot;
ZSCALER_DNS | &quot;ZSCALER_DNS&quot;
ZSCALER_FIREWALL | &quot;ZSCALER_FIREWALL&quot;
ZSCALER_VPN | &quot;ZSCALER_VPN&quot;
ZSCALER_WEBPROXY | &quot;ZSCALER_WEBPROXY&quot;

<a name="ElasticVersionEnum"></a>
## Enum: ElasticVersionEnum
Name | Value
---- | -----
AUTO | &quot;auto&quot;
_6 | &quot;6&quot;
_7 | &quot;7&quot;

<a name="AckEnum"></a>
## Enum: AckEnum
Name | Value
---- | -----
NUMBER_1 | new BigDecimal(1)
NUMBER_0 | new BigDecimal(0)
NUMBER_MINUS_1 | new BigDecimal(-1)

<a name="TimestampPrecisionEnum"></a>
## Enum: TimestampPrecisionEnum
Name | Value
---- | -----
NS | &quot;ns&quot;
U | &quot;u&quot;
MS | &quot;ms&quot;
S | &quot;s&quot;
M | &quot;m&quot;
H | &quot;h&quot;

<a name="QueueTypeEnum"></a>
## Enum: QueueTypeEnum
Name | Value
---- | -----
STANDARD | &quot;standard&quot;
FIFO | &quot;fifo&quot;

<a name="ContentTypeEnum"></a>
## Enum: ContentTypeEnum
Name | Value
---- | -----
TEXT | &quot;text&quot;
JSON | &quot;json&quot;

<a name="MethodEnum"></a>
## Enum: MethodEnum
Name | Value
---- | -----
POST | &quot;POST&quot;
PUT | &quot;PUT&quot;
PATCH | &quot;PATCH&quot;

<a name="GoogleAuthMethodEnum"></a>
## Enum: GoogleAuthMethodEnum
Name | Value
---- | -----
AUTO | &quot;auto&quot;
MANUAL | &quot;manual&quot;
SECRET | &quot;secret&quot;

<a name="AuthenticationMethodEnum"></a>
## Enum: AuthenticationMethodEnum
Name | Value
---- | -----
MANUAL | &quot;manual&quot;
SECRET | &quot;secret&quot;

<a name="LogFormatTypeEnum"></a>
## Enum: LogFormatTypeEnum
Name | Value
---- | -----
UNSTRUCTURED | &quot;unstructured&quot;
UDM | &quot;udm&quot;
