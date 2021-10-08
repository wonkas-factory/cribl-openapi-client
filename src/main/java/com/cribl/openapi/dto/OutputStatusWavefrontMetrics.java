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
 * OutputStatusWavefrontMetrics
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class OutputStatusWavefrontMetrics implements OneOfOutputStatusStatusMetrics {
  @SerializedName("persistentQueueSize")
  private BigDecimal persistentQueueSize = null;

  @SerializedName("numBytesInBuffer")
  private BigDecimal numBytesInBuffer = null;

  @SerializedName("numEventsInBuffer")
  private BigDecimal numEventsInBuffer = null;

  @SerializedName("lastFlushTime")
  private BigDecimal lastFlushTime = null;

  @SerializedName("lastFlushBytes")
  private BigDecimal lastFlushBytes = null;

  @SerializedName("connected")
  private Boolean connected = null;

  @SerializedName("closed")
  private Boolean closed = null;

  @SerializedName("lastConnectTime")
  private BigDecimal lastConnectTime = null;

  @SerializedName("sentCount")
  private BigDecimal sentCount = null;

  @SerializedName("sentBytes")
  private BigDecimal sentBytes = null;

  @SerializedName("dropBytes")
  private BigDecimal dropBytes = null;

  public OutputStatusWavefrontMetrics persistentQueueSize(BigDecimal persistentQueueSize) {
    this.persistentQueueSize = persistentQueueSize;
    return this;
  }

   /**
   * The number of bytes stored in the persistent queue
   * @return persistentQueueSize
  **/
  @Schema(description = "The number of bytes stored in the persistent queue")
  public BigDecimal getPersistentQueueSize() {
    return persistentQueueSize;
  }

  public void setPersistentQueueSize(BigDecimal persistentQueueSize) {
    this.persistentQueueSize = persistentQueueSize;
  }

  public OutputStatusWavefrontMetrics numBytesInBuffer(BigDecimal numBytesInBuffer) {
    this.numBytesInBuffer = numBytesInBuffer;
    return this;
  }

   /**
   * Number of bytes in buffer.
   * @return numBytesInBuffer
  **/
  @Schema(description = "Number of bytes in buffer.")
  public BigDecimal getNumBytesInBuffer() {
    return numBytesInBuffer;
  }

  public void setNumBytesInBuffer(BigDecimal numBytesInBuffer) {
    this.numBytesInBuffer = numBytesInBuffer;
  }

  public OutputStatusWavefrontMetrics numEventsInBuffer(BigDecimal numEventsInBuffer) {
    this.numEventsInBuffer = numEventsInBuffer;
    return this;
  }

   /**
   * Number of events in buffer.
   * @return numEventsInBuffer
  **/
  @Schema(description = "Number of events in buffer.")
  public BigDecimal getNumEventsInBuffer() {
    return numEventsInBuffer;
  }

  public void setNumEventsInBuffer(BigDecimal numEventsInBuffer) {
    this.numEventsInBuffer = numEventsInBuffer;
  }

  public OutputStatusWavefrontMetrics lastFlushTime(BigDecimal lastFlushTime) {
    this.lastFlushTime = lastFlushTime;
    return this;
  }

   /**
   * Time when buffer was last flushed.
   * @return lastFlushTime
  **/
  @Schema(description = "Time when buffer was last flushed.")
  public BigDecimal getLastFlushTime() {
    return lastFlushTime;
  }

  public void setLastFlushTime(BigDecimal lastFlushTime) {
    this.lastFlushTime = lastFlushTime;
  }

  public OutputStatusWavefrontMetrics lastFlushBytes(BigDecimal lastFlushBytes) {
    this.lastFlushBytes = lastFlushBytes;
    return this;
  }

   /**
   * Number of last flushed bytes.
   * @return lastFlushBytes
  **/
  @Schema(description = "Number of last flushed bytes.")
  public BigDecimal getLastFlushBytes() {
    return lastFlushBytes;
  }

  public void setLastFlushBytes(BigDecimal lastFlushBytes) {
    this.lastFlushBytes = lastFlushBytes;
  }

  public OutputStatusWavefrontMetrics connected(Boolean connected) {
    this.connected = connected;
    return this;
  }

   /**
   * Connection established to destination.
   * @return connected
  **/
  @Schema(description = "Connection established to destination.")
  public Boolean isConnected() {
    return connected;
  }

  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  public OutputStatusWavefrontMetrics closed(Boolean closed) {
    this.closed = closed;
    return this;
  }

   /**
   * Connection to destination has been closed.
   * @return closed
  **/
  @Schema(description = "Connection to destination has been closed.")
  public Boolean isClosed() {
    return closed;
  }

  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public OutputStatusWavefrontMetrics lastConnectTime(BigDecimal lastConnectTime) {
    this.lastConnectTime = lastConnectTime;
    return this;
  }

   /**
   * Time of last connection.
   * @return lastConnectTime
  **/
  @Schema(description = "Time of last connection.")
  public BigDecimal getLastConnectTime() {
    return lastConnectTime;
  }

  public void setLastConnectTime(BigDecimal lastConnectTime) {
    this.lastConnectTime = lastConnectTime;
  }

  public OutputStatusWavefrontMetrics sentCount(BigDecimal sentCount) {
    this.sentCount = sentCount;
    return this;
  }

   /**
   * Events sent since last restart.
   * @return sentCount
  **/
  @Schema(description = "Events sent since last restart.")
  public BigDecimal getSentCount() {
    return sentCount;
  }

  public void setSentCount(BigDecimal sentCount) {
    this.sentCount = sentCount;
  }

  public OutputStatusWavefrontMetrics sentBytes(BigDecimal sentBytes) {
    this.sentBytes = sentBytes;
    return this;
  }

   /**
   * Bytes sent since last restart.
   * @return sentBytes
  **/
  @Schema(description = "Bytes sent since last restart.")
  public BigDecimal getSentBytes() {
    return sentBytes;
  }

  public void setSentBytes(BigDecimal sentBytes) {
    this.sentBytes = sentBytes;
  }

  public OutputStatusWavefrontMetrics dropBytes(BigDecimal dropBytes) {
    this.dropBytes = dropBytes;
    return this;
  }

   /**
   * Bytes dropped since last restart.
   * @return dropBytes
  **/
  @Schema(description = "Bytes dropped since last restart.")
  public BigDecimal getDropBytes() {
    return dropBytes;
  }

  public void setDropBytes(BigDecimal dropBytes) {
    this.dropBytes = dropBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputStatusWavefrontMetrics outputStatusWavefrontMetrics = (OutputStatusWavefrontMetrics) o;
    return Objects.equals(this.persistentQueueSize, outputStatusWavefrontMetrics.persistentQueueSize) &&
        Objects.equals(this.numBytesInBuffer, outputStatusWavefrontMetrics.numBytesInBuffer) &&
        Objects.equals(this.numEventsInBuffer, outputStatusWavefrontMetrics.numEventsInBuffer) &&
        Objects.equals(this.lastFlushTime, outputStatusWavefrontMetrics.lastFlushTime) &&
        Objects.equals(this.lastFlushBytes, outputStatusWavefrontMetrics.lastFlushBytes) &&
        Objects.equals(this.connected, outputStatusWavefrontMetrics.connected) &&
        Objects.equals(this.closed, outputStatusWavefrontMetrics.closed) &&
        Objects.equals(this.lastConnectTime, outputStatusWavefrontMetrics.lastConnectTime) &&
        Objects.equals(this.sentCount, outputStatusWavefrontMetrics.sentCount) &&
        Objects.equals(this.sentBytes, outputStatusWavefrontMetrics.sentBytes) &&
        Objects.equals(this.dropBytes, outputStatusWavefrontMetrics.dropBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persistentQueueSize, numBytesInBuffer, numEventsInBuffer, lastFlushTime, lastFlushBytes, connected, closed, lastConnectTime, sentCount, sentBytes, dropBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputStatusWavefrontMetrics {\n");
    
    sb.append("    persistentQueueSize: ").append(toIndentedString(persistentQueueSize)).append("\n");
    sb.append("    numBytesInBuffer: ").append(toIndentedString(numBytesInBuffer)).append("\n");
    sb.append("    numEventsInBuffer: ").append(toIndentedString(numEventsInBuffer)).append("\n");
    sb.append("    lastFlushTime: ").append(toIndentedString(lastFlushTime)).append("\n");
    sb.append("    lastFlushBytes: ").append(toIndentedString(lastFlushBytes)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    lastConnectTime: ").append(toIndentedString(lastConnectTime)).append("\n");
    sb.append("    sentCount: ").append(toIndentedString(sentCount)).append("\n");
    sb.append("    sentBytes: ").append(toIndentedString(sentBytes)).append("\n");
    sb.append("    dropBytes: ").append(toIndentedString(dropBytes)).append("\n");
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
