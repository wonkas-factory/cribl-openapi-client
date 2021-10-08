# InputEventhub

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique ID for this input |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**disabled** | **Boolean** | Enable/disable this input |  [optional]
**pipeline** | **String** | Pipeline to process data from this Source before sending it through the Routes. |  [optional]
**host** | **String** | Address to bind on. Defaults to 0.0.0.0 (all addresses). |  [optional]
**port** | [**BigDecimal**](BigDecimal.md) | Port to listen to. |  [optional]
**tls** | [**TLSSettingsServerSide**](TLSSettingsServerSide.md) |  |  [optional]
**ipWhitelistRegex** | **String** | Regex matching IP addresses that are allowed to establish a connection. |  [optional]
**maxActiveCxn** | [**BigDecimal**](BigDecimal.md) | Maximum number of active connections allowed per worker process, use 0 for unlimited |  [optional]
**enableProxyHeader** | **Boolean** | Enable if the connection is proxied by a device that supports Proxy Protocol V1 or V2. |  [optional]
**metadata** | [**List&lt;NotificationMetadata&gt;**](NotificationMetadata.md) | Fields to add. |  [optional]
**breakerRulesets** | **List&lt;String&gt;** | A list of event breaking rulesets that will be applied, in order, to the input data stream. |  [optional]
**staleChannelFlushMs** | [**BigDecimal**](BigDecimal.md) | The amount of time (in milliseconds) the Event Breaker will wait for new data to be sent to a specific channel, before flushing the data stream out, as-is, to the Pipelines. |  [optional]
**authTokens** | **List&lt;String&gt;** | Shared secrets to be provided by any client (Authorization: &lt;token&gt;). If empty, unauthed access is permitted. |  [optional]
**maxActiveReq** | [**BigDecimal**](BigDecimal.md) | Maximum number of active requests allowed for this source, per worker process. Use 0 for unlimited. |  [optional]
**activityLogSampleRate** | [**BigDecimal**](BigDecimal.md) | How often request activity is logged at the &#x60;info&#x60; level. A value of 1 would log every request, 10 every 10th request, etc. |  [optional]
**elasticAPI** | **String** | Absolute path where to listen for the Elasticsearch API requests. At the moment only _bulk (default /elastic/_bulk) is available. Use empty string to disable |  [optional]
**splunkHecAPI** | **String** | Absolute path where to listen for the Splunk HTTP Event Collector API requests. Use empty string to disable. |  [optional]
**allowedIndexes** | **List&lt;String&gt;** | List values allowed in HEC event index field, allows wildcards. Leave blank to skip validation. |  [optional]
**splunkHecAcks** | **Boolean** | Whether to enable Splunk HEC acknowledgements |  [optional]
**udpPort** | [**BigDecimal**](BigDecimal.md) | Enter UDP port number to listen on. Not required if listening on TCP. |  [optional]
**tcpPort** | [**BigDecimal**](BigDecimal.md) | Enter TCP port number to listen on. Not required if listening on UDP. |  [optional]
**maxBufferSize** | [**BigDecimal**](BigDecimal.md) | Maximum number of events to buffer when downstream is blocking. |  [optional]
**timestampTimezone** | **String** | Timezone to assign to timestamps without timezone info. |  [optional]
**singleMsgUdpPackets** | **Boolean** | Whether to treat UDP packet data received as full syslog message |  [optional]
**keepFieldsList** | **List&lt;String&gt;** | Wildcard list of fields to keep from source data, * &#x3D; ALL (default) |  [optional]
**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | Enter a token directly, or provide a secret referencing a token |  [optional]
**criblAPI** | **String** | Absolute path where to listen for the Cribl HTTP API requests. At the moment only _bulk (default /cribl/_bulk) is available. Use empty string to disable. |  [optional]
**allowedPaths** | **List&lt;String&gt;** | List of URI paths accepted by this input, wildcards are supported, e.g /api/v*_/hook. Defaults to allow all. |  [optional]
**allowedMethods** | **List&lt;String&gt;** | List of HTTP methods accepted by this input, wildcards are supported, e.g. P*, GET. Defaults to allow all. |  [optional]
**brokers** | **List&lt;String&gt;** | List of Event Hubs Kafka brokers to connect to, e.g., yourdomain.servicebus.windows.net:9093. The hostname can be found in the host portion of the primary or secondary connection string in Shared Access Policies. |  [optional]
**topics** | **List&lt;String&gt;** | The name of the Event Hub (a.k.a. Kafka Topic) to subscribe to. |  [optional]
**groupId** | **String** | Specifies the consumer group this instance belongs to, default is &#x27;Cribl&#x27;. |  [optional]
**fromBeginning** | **Boolean** | Whether to start reading from earliest available data, relevant only during initial subscription. |  [optional]
**kafkaSchemaRegistry** | [**KafkaSchemaRegistryAuthentication**](KafkaSchemaRegistryAuthentication.md) |  |  [optional]
**sasl** | [**Authentication**](Authentication.md) |  |  [optional]
**sessionTimeout** | [**BigDecimal**](BigDecimal.md) |        Timeout (a.k.a session.timeout.ms in Kafka domain) used to detect client failures when using Kafka&#x27;s group management facilities.       If the client sends the broker no heartbeats before this timeout expires, the broker will remove this client from the group, and will initiate a rebalance.       Value must be lower than rebalanceTimeout.       See details [here](https://github.com/Azure/azure-event-hubs-for-kafka/blob/master/CONFIGURATION.md). |  [optional]
**rebalanceTimeout** | [**BigDecimal**](BigDecimal.md) |        Maximum allowed time (a.k.a rebalance.timeout.ms in Kafka domain) for each worker to join the group after a rebalance has begun.       If the timeout is exceeded, the coordinator broker will remove the worker from the group.       See details [here](https://github.com/Azure/azure-event-hubs-for-kafka/blob/master/CONFIGURATION.md). |  [optional]
**heartbeatInterval** | [**BigDecimal**](BigDecimal.md) |        Expected time (a.k.a heartbeat.interval.ms in Kafka domain) between heartbeats to the consumer coordinator when using Kafka&#x27;s group management facilities.       Value must be lower than sessionTimeout, and typically should not exceed 1/3 of the sessionTimeout value.       See details [here](https://github.com/Azure/azure-event-hubs-for-kafka/blob/master/CONFIGURATION.md). |  [optional]
**streamName** | **String** | Kinesis stream name to read data from. |  [optional]
**serviceInterval** | [**BigDecimal**](BigDecimal.md) | Time interval in minutes between consecutive service calls |  [optional]
**shardExpr** | **String** | A JS expression to be called with each shardId for the stream, if the expression evalutates to a truthy value the shard will be processed. |  [optional]
**shardIteratorType** | [**ShardIteratorTypeEnum**](#ShardIteratorTypeEnum) | Location where to start reading a shard for the first time. |  [optional]
**payloadFormat** | [**PayloadFormatEnum**](#PayloadFormatEnum) | Format of data inside the Kinesis Stream records. Gzip compression is automatically detected. |  [optional]
**awsAuthenticationMethod** | [**AwsAuthenticationMethodEnum**](#AwsAuthenticationMethodEnum) | AWS authentication method. Choose Auto to use IAM roles. |  [optional]
**awsSecretKey** | **String** | Secret key |  [optional]
**region** | [**RegionEnum**](#RegionEnum) | Region to retrieve messages from. Select &#x27;default&#x27; to allow Google to auto-select the nearest region. When using ordered delivery, the selected region must be allowed by message storage policy. |  [optional]
**endpoint** | **String** | S3 service endpoint. If empty, defaults to AWS&#x27; Region-specific endpoint. Otherwise, it must point to S3-compatible endpoint. |  [optional]
**signatureVersion** | [**SignatureVersionEnum**](#SignatureVersionEnum) | Signature version to use for signing S3 requests. |  [optional]
**reuseConnections** | **Boolean** | Whether to reuse connections between requests, which can improve performance. |  [optional]
**rejectUnauthorized** | **Boolean** | Whether to accept certificates which cannot be verified against a valid CA (e.g. self-signed certificates). |  [optional]
**enableAssumeRole** | **Boolean** | Use Assume Role credentials to access S3 |  [optional]
**assumeRoleArn** | **String** | Amazon Resource Name (ARN) of the role to assume |  [optional]
**assumeRoleExternalId** | **String** | External ID to use when assuming role |  [optional]
**verifyKPLCheckSums** | **Boolean** | Verify Kinesis Producer Library (KPL) event checksums |  [optional]
**queueName** | **String** | The name, URL, or ARN of the SQS queue to read notifications from. When a non-AWS URL is specified, format must be: &#x27;{url}/myQueueName&#x27;. E.g., &#x27;https://host:port/myQueueName&#x27;. Value must be a JavaScript expression (which can evaluate to a constant value), enclosed in quotes or backticks. Can be evaluated only at init time. E.g., referencing a Global Variable: &#x60;https://host:port/myQueue-${C.vars.myVar}&#x60;. |  [optional]
**fileFilter** | **String** | Regex matching file names to download and process. Defaults to: .* |  [optional]
**visibilityTimeout** | [**BigDecimal**](BigDecimal.md) | The duration (in seconds) that received messages are hidden from subsequent retrieve requests, after being retrieved by a ReceiveMessage request. This value also automatically extends this duration, to prevent it from expiring before processing completes. |  [optional]
**numReceivers** | [**BigDecimal**](BigDecimal.md) | The Number of receiver processes to run, the higher the number the better throughput at the expense of CPU overhead |  [optional]
**maxMessages** | [**BigDecimal**](BigDecimal.md) | The maximum number of messages SQS should return in a poll request. Amazon SQS never returns more messages than this value (however, fewer messages might be returned). Valid values: 1 to 10. |  [optional]
**servicePeriodSecs** | [**BigDecimal**](BigDecimal.md) | The duration (in seconds) which pollers should be validated and restarted if exited |  [optional]
**skipOnError** | **Boolean** | Toggle to Yes to skip files that trigger a processing error. Defaults to No, which enables retries after processing errors. |  [optional]
**prefix** | **String** | A prefix that is applied to the metrics provided by Cribl LogStream |  [optional]
**queueType** | [**QueueTypeEnum**](#QueueTypeEnum) | The queue type used (or created). Defaults to Standard |  [optional]
**awsAccountId** | **String** | SQS queue owner&#x27;s AWS account ID. Leave empty if SQS queue is in same AWS account. |  [optional]
**createQueue** | **Boolean** | Create queue if it does not exist. |  [optional]
**samples** | [**List&lt;InputSplunkSamples&gt;**](InputSplunkSamples.md) | List of datagens |  [optional]
**socketTimeout** | [**BigDecimal**](BigDecimal.md) | Socket inactivity timeout (in seconds). Increase this value if timeouts occur due to backpressure. |  [optional]
**enableSQSAssumeRole** | **Boolean** | Use Assume Role credentials when accessing SQS. |  [optional]
**preprocess** | [**SavedJobCollectionInputPreprocess**](SavedJobCollectionInputPreprocess.md) |  |  [optional]
**enableHeader** | **Boolean** | If enabled, client will pass the header record with every new connection. The header can contain an authToken, and an object with a list of fields and values to add to every event. These fields can be used to simplify Event Breaker selection, routing, etc. Header has this format, and must be followed by a newline: { \&quot;authToken\&quot; : \&quot;myToken\&quot;, \&quot;fields\&quot;: { \&quot;field1\&quot;: \&quot;value1\&quot;, \&quot;field2\&quot;: \&quot;value2\&quot; } } |  [optional]
**sendToRoutes** | **Boolean** | If set to Yes, events will be sent to normal routing and event processing. Set to No if you want to select a specific Pipeline/Destination combination. |  [optional]
**throttleRatePerSec** | **String** | Rate (in bytes per second) to throttle while writing to an output. Also takes values with multiple-byte units, such as KB, MB, GB, etc. (E.g., 42 MB.) Default value of 0 specifies no throttling. |  [optional]
**tenantId** | **String** | Office 365 Azure Tenant ID |  [optional]
**appId** | **String** | Office 365 Azure Application ID |  [optional]
**timeout** | [**BigDecimal**](BigDecimal.md) | HTTP request inactivity timeout, use 0 to disable |  [optional]
**keepAliveTime** | [**BigDecimal**](BigDecimal.md) | How often workers should check in with the scheduler to keep job subscription alive |  [optional]
**maxMissedKeepAlives** | [**BigDecimal**](BigDecimal.md) | The number of Keep Alive Time periods before an inactive worker will have its job subscription revoked. |  [optional]
**contentConfig** | [**List&lt;InputSplunkContentConfig&gt;**](InputSplunkContentConfig.md) | Enable Office 365 Management Activity API content types and polling intervals. Polling intervals are used to set up search date range and cron schedule, e.g.: *_/${interval} * * * *. Because of this, intervals entered must be evenly divisible by 60 to give a predictable schedule. |  [optional]
**planType** | [**PlanTypeEnum**](#PlanTypeEnum) | Office 365 subscription plan for your organization, typically Enterprise |  [optional]
**publisherIdentifier** | **String** | Optional Publisher Identifier to use in API requests, defaults to tenant id if not defined. For more information see [here](https://docs.microsoft.com/en-us/office/office-365-management-api/office-365-management-activity-api-reference#start-a-subscription) |  [optional]
**url** | **String** | URL to use when retrieving report data. |  [optional]
**interval** | [**BigDecimal**](BigDecimal.md) | How often in minutes to scrape targets for metrics, 60 must be evenly divisible by the value or save will fail. |  [optional]
**startDate** | **String** | The relative time in the past for the search date range. (E.g., -3h@h) Message trace data is delayed; this parameter (with Date range end) compensates for delay and gaps. |  [optional]
**endDate** | **String** | The relative time in the past for the search date range. (E.g., -2h@h) Message trace data is delayed; this parameter (with Date range start) compensates for delay and gaps. |  [optional]
**logLevel** | [**LogLevelEnum**](#LogLevelEnum) | Collector runtime Log Level |  [optional]
**disableTimeFilter** | **Boolean** | Used to disable collector event time filtering when a date range is specified. |  [optional]
**dimensionList** | **List&lt;String&gt;** | Other dimensions to include in events |  [optional]
**discoveryType** | [**DiscoveryTypeEnum**](#DiscoveryTypeEnum) | Target discovery mechanism, use static to manually enter a list of targets |  [optional]
**prometheusAPI** | **String** | Absolute path on which to listen for Grafana Agent&#x27;s Remote Write requests. Defaults to /api/prom/push, which will expand as: http://&lt;your‑upstream‑URL&gt;:&lt;your‑port&gt;/api/prom/push. |  [optional]
**keepAliveTimeout** | [**BigDecimal**](BigDecimal.md) | Maximum time to wait for additional data, after the last response was sent, before closing a socket connection. This can be very useful when Grafana Agent remote write&#x27;s request frequency is high so, reusing connections, would help mitigating the cost of creating a new connection per request. Note that Grafana Agent&#x27;s embedded Prometheus would attempt to keep connections open for up to 5 minutes. |  [optional]
**lokiAPI** | **String** | Absolute path on which to listen for Loki logs requests. Defaults to /loki/api/v1/push, which will (in this example) expand as: &#x27;http://&lt;your‑upstream‑URL&gt;:&lt;your‑port&gt;/loki/api/v1/push&#x27;. | 
**prometheusAuth** | [**InputSplunkPrometheusAuth**](InputSplunkPrometheusAuth.md) |  |  [optional]
**lokiAuth** | [**InputSplunkLokiAuth**](InputSplunkLokiAuth.md) |  |  [optional]
**topicName** | **String** | ID of the topic to receive events from. | 
**subscriptionName** | **String** | ID of the subscription to use when receiving events. | 
**createTopic** | **Boolean** | If enabled, create topic if it does not exist |  [optional]
**createSubscription** | **Boolean** | If enabled, create subscription if it does not exist |  [optional]
**googleAuthMethod** | [**GoogleAuthMethodEnum**](#GoogleAuthMethodEnum) | Google authentication method. Choose Auto to use environment variables PUBSUB_PROJECT and PUBSUB_CREDENTIALS. |  [optional]
**serviceAccountCredentials** | **Object** |  |  [optional]
**secret** | **Object** |  |  [optional]
**maxBacklog** | [**BigDecimal**](BigDecimal.md) | Maximum number of events waiting to be processed before backpressure is applied. |  [optional]
**requestTimeout** | [**BigDecimal**](BigDecimal.md) | Pull request timeout, in milliseconds. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
GOOGLE_PUBSUB | &quot;google_pubsub&quot;
SPLUNK_HEC | &quot;splunk_hec&quot;
SYSLOG | &quot;syslog&quot;
TCPJSON | &quot;tcpjson&quot;
GRAFANA | &quot;grafana&quot;
LOKI | &quot;loki&quot;
HTTP | &quot;http&quot;
HTTP_RAW | &quot;http_raw&quot;
FIREHOSE | &quot;firehose&quot;
ELASTIC | &quot;elastic&quot;
KAFKA | &quot;kafka&quot;
KINESIS | &quot;kinesis&quot;
EVENTHUB | &quot;eventhub&quot;
AZURE_BLOB | &quot;azure_blob&quot;
METRICS | &quot;metrics&quot;
SQS | &quot;sqs&quot;
S3 | &quot;s3&quot;
SNMP | &quot;snmp&quot;
TCP | &quot;tcp&quot;
OFFICE365_SERVICE | &quot;office365_service&quot;
OFFICE365_MGMT | &quot;office365_mgmt&quot;
OFFICE365_MSG_TRACE | &quot;office365_msg_trace&quot;
PROMETHEUS | &quot;prometheus&quot;
PROMETHEUS_RW | &quot;prometheus_rw&quot;
DATAGEN | &quot;datagen&quot;
APPSCOPE | &quot;appscope&quot;
GOOGLE_PUBSUB_26 | &quot;google_pubsub&quot;
CRIBL | &quot;cribl&quot;
CRIBLMETRICS | &quot;criblmetrics&quot;

<a name="AuthTypeEnum"></a>
## Enum: AuthTypeEnum
Name | Value
---- | -----
MANUAL | &quot;manual&quot;
SECRET | &quot;secret&quot;
CREDENTIALSSECRET | &quot;credentialsSecret&quot;
TOKEN | &quot;token&quot;
TEXTSECRET | &quot;textSecret&quot;

<a name="ShardIteratorTypeEnum"></a>
## Enum: ShardIteratorTypeEnum
Name | Value
---- | -----
TRIM_HORIZON | &quot;TRIM_HORIZON&quot;
LATEST | &quot;LATEST&quot;

<a name="PayloadFormatEnum"></a>
## Enum: PayloadFormatEnum
Name | Value
---- | -----
CRIBL | &quot;cribl&quot;
NDJSON | &quot;ndjson&quot;
CLOUDWATCH | &quot;cloudwatch&quot;
LINE | &quot;line&quot;

<a name="AwsAuthenticationMethodEnum"></a>
## Enum: AwsAuthenticationMethodEnum
Name | Value
---- | -----
AUTO | &quot;auto&quot;
MANUAL | &quot;manual&quot;
SECRET | &quot;secret&quot;

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

<a name="SignatureVersionEnum"></a>
## Enum: SignatureVersionEnum
Name | Value
---- | -----
V2 | &quot;v2&quot;
V4 | &quot;v4&quot;

<a name="QueueTypeEnum"></a>
## Enum: QueueTypeEnum
Name | Value
---- | -----
STANDARD | &quot;standard&quot;
FIFO | &quot;fifo&quot;

<a name="PlanTypeEnum"></a>
## Enum: PlanTypeEnum
Name | Value
---- | -----
ENTERPRISE_GCC | &quot;enterprise_gcc&quot;
GCC | &quot;gcc&quot;
GCC_HIGH | &quot;gcc_high&quot;
DOD | &quot;dod&quot;

<a name="LogLevelEnum"></a>
## Enum: LogLevelEnum
Name | Value
---- | -----
ERROR | &quot;error&quot;
WARN | &quot;warn&quot;
INFO | &quot;info&quot;
DEBUG | &quot;debug&quot;

<a name="DiscoveryTypeEnum"></a>
## Enum: DiscoveryTypeEnum
Name | Value
---- | -----
STATIC | &quot;static&quot;
DNS | &quot;dns&quot;
EC2 | &quot;ec2&quot;

<a name="GoogleAuthMethodEnum"></a>
## Enum: GoogleAuthMethodEnum
Name | Value
---- | -----
AUTO | &quot;auto&quot;
MANUAL | &quot;manual&quot;
SECRET | &quot;secret&quot;
