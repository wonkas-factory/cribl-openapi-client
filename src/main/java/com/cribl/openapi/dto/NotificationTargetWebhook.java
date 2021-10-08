/*
 * Cribl LogStream
 * REST API Reference of available endpoints and their supported operations for accessing, updating, creating, or deleting resources. Product documentation available at [docs.cribl.io](http://docs.cribl.io).
 *
 * OpenAPI spec version: 3.1.2-abb571bc
 * Contact: support@cribl.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.cribl.openapi.dto;

import java.util.Objects;
import java.util.Arrays;
import com.cribl.openapi.dto.NotificationTargetWebhookExtraHttpHeaders;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * NotificationTargetWebhook
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class NotificationTargetWebhook {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    WEBHOOK("webhook");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("url")
  private String url = null;

  /**
   * The method to use when sending events. Defaults to POST.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    POST("POST"),
    PUT("PUT"),
    PATCH("PATCH");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MethodEnum fromValue(String text) {
      for (MethodEnum b : MethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return MethodEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("method")
  private MethodEnum method = MethodEnum.POST;

  /**
   * Specifies how to format events before sending out. Defaults to NDJSON.
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    NDJSON("ndjson"),
    JSON_ARRAY("json_array"),
    CUSTOM("custom");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FormatEnum fromValue(String text) {
      for (FormatEnum b : FormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FormatEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("format")
  private FormatEnum format = FormatEnum.NDJSON;

  @SerializedName("concurrency")
  private BigDecimal concurrency = new BigDecimal(5);

  @SerializedName("maxPayloadSizeKB")
  private BigDecimal maxPayloadSizeKB = new BigDecimal(4096);

  @SerializedName("maxPayloadEvents")
  private BigDecimal maxPayloadEvents = new BigDecimal(0);

  @SerializedName("compress")
  private Boolean compress = false;

  @SerializedName("rejectUnauthorized")
  private Boolean rejectUnauthorized = false;

  @SerializedName("timeoutSec")
  private BigDecimal timeoutSec = new BigDecimal(30);

  @SerializedName("flushPeriodSec")
  private BigDecimal flushPeriodSec = new BigDecimal(1);

  @SerializedName("extraHttpHeaders")
  private List<NotificationTargetWebhookExtraHttpHeaders> extraHttpHeaders = null;

  @SerializedName("useRoundRobinDns")
  private Boolean useRoundRobinDns = false;

  /**
   * The authentication method to use for the HTTP request. Defaults to None.
   */
  @JsonAdapter(AuthTypeEnum.Adapter.class)
  public enum AuthTypeEnum {
    NONE("none"),
    BASIC("basic"),
    CREDENTIALSSECRET("credentialsSecret"),
    TOKEN("token"),
    TEXTSECRET("textSecret");

    private String value;

    AuthTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AuthTypeEnum fromValue(String text) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AuthTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AuthTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("authType")
  private AuthTypeEnum authType = AuthTypeEnum.NONE;

  public NotificationTargetWebhook type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public NotificationTargetWebhook url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL to send events to.
   * @return url
  **/
  @Schema(required = true, description = "URL to send events to.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public NotificationTargetWebhook method(MethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * The method to use when sending events. Defaults to POST.
   * @return method
  **/
  @Schema(description = "The method to use when sending events. Defaults to POST.")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public NotificationTargetWebhook format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * Specifies how to format events before sending out. Defaults to NDJSON.
   * @return format
  **/
  @Schema(description = "Specifies how to format events before sending out. Defaults to NDJSON.")
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public NotificationTargetWebhook concurrency(BigDecimal concurrency) {
    this.concurrency = concurrency;
    return this;
  }

   /**
   * Maximum number of ongoing requests before blocking.
   * minimum: 1
   * maximum: 32
   * @return concurrency
  **/
  @Schema(description = "Maximum number of ongoing requests before blocking.")
  public BigDecimal getConcurrency() {
    return concurrency;
  }

  public void setConcurrency(BigDecimal concurrency) {
    this.concurrency = concurrency;
  }

  public NotificationTargetWebhook maxPayloadSizeKB(BigDecimal maxPayloadSizeKB) {
    this.maxPayloadSizeKB = maxPayloadSizeKB;
    return this;
  }

   /**
   * Maximum size, in KB, of the request body.
   * minimum: 1024
   * maximum: 10240
   * @return maxPayloadSizeKB
  **/
  @Schema(description = "Maximum size, in KB, of the request body.")
  public BigDecimal getMaxPayloadSizeKB() {
    return maxPayloadSizeKB;
  }

  public void setMaxPayloadSizeKB(BigDecimal maxPayloadSizeKB) {
    this.maxPayloadSizeKB = maxPayloadSizeKB;
  }

  public NotificationTargetWebhook maxPayloadEvents(BigDecimal maxPayloadEvents) {
    this.maxPayloadEvents = maxPayloadEvents;
    return this;
  }

   /**
   * Max number of events to include in the request body. Default is 0 (unlimited).
   * minimum: 0
   * @return maxPayloadEvents
  **/
  @Schema(description = "Max number of events to include in the request body. Default is 0 (unlimited).")
  public BigDecimal getMaxPayloadEvents() {
    return maxPayloadEvents;
  }

  public void setMaxPayloadEvents(BigDecimal maxPayloadEvents) {
    this.maxPayloadEvents = maxPayloadEvents;
  }

  public NotificationTargetWebhook compress(Boolean compress) {
    this.compress = compress;
    return this;
  }

   /**
   * Whether to compress the payload body before sending.
   * @return compress
  **/
  @Schema(description = "Whether to compress the payload body before sending.")
  public Boolean isCompress() {
    return compress;
  }

  public void setCompress(Boolean compress) {
    this.compress = compress;
  }

  public NotificationTargetWebhook rejectUnauthorized(Boolean rejectUnauthorized) {
    this.rejectUnauthorized = rejectUnauthorized;
    return this;
  }

   /**
   * Reject certs that are not authorized by a CA in the CA certificate path, or by another trusted CA (e.g., the system&#x27;s CA). Defaults to No.
   * @return rejectUnauthorized
  **/
  @Schema(description = "Reject certs that are not authorized by a CA in the CA certificate path, or by another trusted CA (e.g., the system's CA). Defaults to No.")
  public Boolean isRejectUnauthorized() {
    return rejectUnauthorized;
  }

  public void setRejectUnauthorized(Boolean rejectUnauthorized) {
    this.rejectUnauthorized = rejectUnauthorized;
  }

  public NotificationTargetWebhook timeoutSec(BigDecimal timeoutSec) {
    this.timeoutSec = timeoutSec;
    return this;
  }

   /**
   * Amount of time, in seconds, to wait for a request to complete before aborting it.
   * minimum: 1
   * maximum: 9007199254740991
   * @return timeoutSec
  **/
  @Schema(description = "Amount of time, in seconds, to wait for a request to complete before aborting it.")
  public BigDecimal getTimeoutSec() {
    return timeoutSec;
  }

  public void setTimeoutSec(BigDecimal timeoutSec) {
    this.timeoutSec = timeoutSec;
  }

  public NotificationTargetWebhook flushPeriodSec(BigDecimal flushPeriodSec) {
    this.flushPeriodSec = flushPeriodSec;
    return this;
  }

   /**
   * Maximum time between requests. Small values could cause the payload size to be smaller than the configured Max body size.
   * @return flushPeriodSec
  **/
  @Schema(description = "Maximum time between requests. Small values could cause the payload size to be smaller than the configured Max body size.")
  public BigDecimal getFlushPeriodSec() {
    return flushPeriodSec;
  }

  public void setFlushPeriodSec(BigDecimal flushPeriodSec) {
    this.flushPeriodSec = flushPeriodSec;
  }

  public NotificationTargetWebhook extraHttpHeaders(List<NotificationTargetWebhookExtraHttpHeaders> extraHttpHeaders) {
    this.extraHttpHeaders = extraHttpHeaders;
    return this;
  }

  public NotificationTargetWebhook addExtraHttpHeadersItem(NotificationTargetWebhookExtraHttpHeaders extraHttpHeadersItem) {
    if (this.extraHttpHeaders == null) {
      this.extraHttpHeaders = new ArrayList<>();
    }
    this.extraHttpHeaders.add(extraHttpHeadersItem);
    return this;
  }

   /**
   * Extra HTTP Headers.
   * @return extraHttpHeaders
  **/
  @Schema(description = "Extra HTTP Headers.")
  public List<NotificationTargetWebhookExtraHttpHeaders> getExtraHttpHeaders() {
    return extraHttpHeaders;
  }

  public void setExtraHttpHeaders(List<NotificationTargetWebhookExtraHttpHeaders> extraHttpHeaders) {
    this.extraHttpHeaders = extraHttpHeaders;
  }

  public NotificationTargetWebhook useRoundRobinDns(Boolean useRoundRobinDns) {
    this.useRoundRobinDns = useRoundRobinDns;
    return this;
  }

   /**
   * Enable to use round-robin DNS lookup. When a DNS server returns multiple addresses, this will cause LogStream to cycle through them in the order returned.
   * @return useRoundRobinDns
  **/
  @Schema(description = "Enable to use round-robin DNS lookup. When a DNS server returns multiple addresses, this will cause LogStream to cycle through them in the order returned.")
  public Boolean isUseRoundRobinDns() {
    return useRoundRobinDns;
  }

  public void setUseRoundRobinDns(Boolean useRoundRobinDns) {
    this.useRoundRobinDns = useRoundRobinDns;
  }

  public NotificationTargetWebhook authType(AuthTypeEnum authType) {
    this.authType = authType;
    return this;
  }

   /**
   * The authentication method to use for the HTTP request. Defaults to None.
   * @return authType
  **/
  @Schema(description = "The authentication method to use for the HTTP request. Defaults to None.")
  public AuthTypeEnum getAuthType() {
    return authType;
  }

  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationTargetWebhook notificationTargetWebhook = (NotificationTargetWebhook) o;
    return Objects.equals(this.type, notificationTargetWebhook.type) &&
        Objects.equals(this.url, notificationTargetWebhook.url) &&
        Objects.equals(this.method, notificationTargetWebhook.method) &&
        Objects.equals(this.format, notificationTargetWebhook.format) &&
        Objects.equals(this.concurrency, notificationTargetWebhook.concurrency) &&
        Objects.equals(this.maxPayloadSizeKB, notificationTargetWebhook.maxPayloadSizeKB) &&
        Objects.equals(this.maxPayloadEvents, notificationTargetWebhook.maxPayloadEvents) &&
        Objects.equals(this.compress, notificationTargetWebhook.compress) &&
        Objects.equals(this.rejectUnauthorized, notificationTargetWebhook.rejectUnauthorized) &&
        Objects.equals(this.timeoutSec, notificationTargetWebhook.timeoutSec) &&
        Objects.equals(this.flushPeriodSec, notificationTargetWebhook.flushPeriodSec) &&
        Objects.equals(this.extraHttpHeaders, notificationTargetWebhook.extraHttpHeaders) &&
        Objects.equals(this.useRoundRobinDns, notificationTargetWebhook.useRoundRobinDns) &&
        Objects.equals(this.authType, notificationTargetWebhook.authType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url, method, format, concurrency, maxPayloadSizeKB, maxPayloadEvents, compress, rejectUnauthorized, timeoutSec, flushPeriodSec, extraHttpHeaders, useRoundRobinDns, authType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationTargetWebhook {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    concurrency: ").append(toIndentedString(concurrency)).append("\n");
    sb.append("    maxPayloadSizeKB: ").append(toIndentedString(maxPayloadSizeKB)).append("\n");
    sb.append("    maxPayloadEvents: ").append(toIndentedString(maxPayloadEvents)).append("\n");
    sb.append("    compress: ").append(toIndentedString(compress)).append("\n");
    sb.append("    rejectUnauthorized: ").append(toIndentedString(rejectUnauthorized)).append("\n");
    sb.append("    timeoutSec: ").append(toIndentedString(timeoutSec)).append("\n");
    sb.append("    flushPeriodSec: ").append(toIndentedString(flushPeriodSec)).append("\n");
    sb.append("    extraHttpHeaders: ").append(toIndentedString(extraHttpHeaders)).append("\n");
    sb.append("    useRoundRobinDns: ").append(toIndentedString(useRoundRobinDns)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}