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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * InputStatusSnmpMetrics
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class InputStatusSnmpMetrics implements OneOfInputStatusStatusMetrics {
  @SerializedName("received")
  private BigDecimal received = null;

  @SerializedName("buffered")
  private BigDecimal buffered = null;

  @SerializedName("dropped")
  private BigDecimal dropped = null;

  @SerializedName("numIgnored")
  private BigDecimal numIgnored = null;

  @SerializedName("numErrors")
  private BigDecimal numErrors = null;

  @SerializedName("numBytes")
  private BigDecimal numBytes = null;

  @SerializedName("numV1")
  private BigDecimal numV1 = null;

  @SerializedName("numV2c")
  private BigDecimal numV2c = null;

  @SerializedName("numV3")
  private BigDecimal numV3 = null;

  public InputStatusSnmpMetrics received(BigDecimal received) {
    this.received = received;
    return this;
  }

   /**
   * Number of messages received
   * @return received
  **/
  @Schema(description = "Number of messages received")
  public BigDecimal getReceived() {
    return received;
  }

  public void setReceived(BigDecimal received) {
    this.received = received;
  }

  public InputStatusSnmpMetrics buffered(BigDecimal buffered) {
    this.buffered = buffered;
    return this;
  }

   /**
   * Number of events in the buffer
   * @return buffered
  **/
  @Schema(description = "Number of events in the buffer")
  public BigDecimal getBuffered() {
    return buffered;
  }

  public void setBuffered(BigDecimal buffered) {
    this.buffered = buffered;
  }

  public InputStatusSnmpMetrics dropped(BigDecimal dropped) {
    this.dropped = dropped;
    return this;
  }

   /**
   * Number of messages dropped because buffer full (see Max Buffer Size) or allowlist exclusions (see IP Allowlist Regex)
   * @return dropped
  **/
  @Schema(description = "Number of messages dropped because buffer full (see Max Buffer Size) or allowlist exclusions (see IP Allowlist Regex)")
  public BigDecimal getDropped() {
    return dropped;
  }

  public void setDropped(BigDecimal dropped) {
    this.dropped = dropped;
  }

  public InputStatusSnmpMetrics numIgnored(BigDecimal numIgnored) {
    this.numIgnored = numIgnored;
    return this;
  }

   /**
   * Number messages ignored (invalid SNMP format or not trap PDU)
   * @return numIgnored
  **/
  @Schema(description = "Number messages ignored (invalid SNMP format or not trap PDU)")
  public BigDecimal getNumIgnored() {
    return numIgnored;
  }

  public void setNumIgnored(BigDecimal numIgnored) {
    this.numIgnored = numIgnored;
  }

  public InputStatusSnmpMetrics numErrors(BigDecimal numErrors) {
    this.numErrors = numErrors;
    return this;
  }

   /**
   * Number packet parse errors
   * @return numErrors
  **/
  @Schema(description = "Number packet parse errors")
  public BigDecimal getNumErrors() {
    return numErrors;
  }

  public void setNumErrors(BigDecimal numErrors) {
    this.numErrors = numErrors;
  }

  public InputStatusSnmpMetrics numBytes(BigDecimal numBytes) {
    this.numBytes = numBytes;
    return this;
  }

   /**
   * Number bytes received
   * @return numBytes
  **/
  @Schema(description = "Number bytes received")
  public BigDecimal getNumBytes() {
    return numBytes;
  }

  public void setNumBytes(BigDecimal numBytes) {
    this.numBytes = numBytes;
  }

  public InputStatusSnmpMetrics numV1(BigDecimal numV1) {
    this.numV1 = numV1;
    return this;
  }

   /**
   * Number SNMP V1 traps received
   * @return numV1
  **/
  @Schema(description = "Number SNMP V1 traps received")
  public BigDecimal getNumV1() {
    return numV1;
  }

  public void setNumV1(BigDecimal numV1) {
    this.numV1 = numV1;
  }

  public InputStatusSnmpMetrics numV2c(BigDecimal numV2c) {
    this.numV2c = numV2c;
    return this;
  }

   /**
   * Number SNMP V2c traps received
   * @return numV2c
  **/
  @Schema(description = "Number SNMP V2c traps received")
  public BigDecimal getNumV2c() {
    return numV2c;
  }

  public void setNumV2c(BigDecimal numV2c) {
    this.numV2c = numV2c;
  }

  public InputStatusSnmpMetrics numV3(BigDecimal numV3) {
    this.numV3 = numV3;
    return this;
  }

   /**
   * Number SNMP V3 traps received
   * @return numV3
  **/
  @Schema(description = "Number SNMP V3 traps received")
  public BigDecimal getNumV3() {
    return numV3;
  }

  public void setNumV3(BigDecimal numV3) {
    this.numV3 = numV3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputStatusSnmpMetrics inputStatusSnmpMetrics = (InputStatusSnmpMetrics) o;
    return Objects.equals(this.received, inputStatusSnmpMetrics.received) &&
        Objects.equals(this.buffered, inputStatusSnmpMetrics.buffered) &&
        Objects.equals(this.dropped, inputStatusSnmpMetrics.dropped) &&
        Objects.equals(this.numIgnored, inputStatusSnmpMetrics.numIgnored) &&
        Objects.equals(this.numErrors, inputStatusSnmpMetrics.numErrors) &&
        Objects.equals(this.numBytes, inputStatusSnmpMetrics.numBytes) &&
        Objects.equals(this.numV1, inputStatusSnmpMetrics.numV1) &&
        Objects.equals(this.numV2c, inputStatusSnmpMetrics.numV2c) &&
        Objects.equals(this.numV3, inputStatusSnmpMetrics.numV3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(received, buffered, dropped, numIgnored, numErrors, numBytes, numV1, numV2c, numV3);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputStatusSnmpMetrics {\n");
    
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    buffered: ").append(toIndentedString(buffered)).append("\n");
    sb.append("    dropped: ").append(toIndentedString(dropped)).append("\n");
    sb.append("    numIgnored: ").append(toIndentedString(numIgnored)).append("\n");
    sb.append("    numErrors: ").append(toIndentedString(numErrors)).append("\n");
    sb.append("    numBytes: ").append(toIndentedString(numBytes)).append("\n");
    sb.append("    numV1: ").append(toIndentedString(numV1)).append("\n");
    sb.append("    numV2c: ").append(toIndentedString(numV2c)).append("\n");
    sb.append("    numV3: ").append(toIndentedString(numV3)).append("\n");
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
