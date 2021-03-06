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
 * OutputStatusNewrelicEventsMetrics
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class OutputStatusNewrelicEventsMetrics implements OneOfOutputStatusStatusMetrics {
  @SerializedName("persistentQueueSize")
  private BigDecimal persistentQueueSize = null;

  @SerializedName("numBytesInBuffer")
  private BigDecimal numBytesInBuffer = null;

  @SerializedName("numEventsInBuffer")
  private BigDecimal numEventsInBuffer = null;

  @SerializedName("concurrentRequests")
  private BigDecimal concurrentRequests = null;

  @SerializedName("lastFlushTime")
  private BigDecimal lastFlushTime = null;

  @SerializedName("sentCount")
  private BigDecimal sentCount = null;

  @SerializedName("numDropped")
  private BigDecimal numDropped = null;

  @SerializedName("parseErrorCount")
  private BigDecimal parseErrorCount = null;

  public OutputStatusNewrelicEventsMetrics persistentQueueSize(BigDecimal persistentQueueSize) {
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

  public OutputStatusNewrelicEventsMetrics numBytesInBuffer(BigDecimal numBytesInBuffer) {
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

  public OutputStatusNewrelicEventsMetrics numEventsInBuffer(BigDecimal numEventsInBuffer) {
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

  public OutputStatusNewrelicEventsMetrics concurrentRequests(BigDecimal concurrentRequests) {
    this.concurrentRequests = concurrentRequests;
    return this;
  }

   /**
   * The number of currently running requests
   * @return concurrentRequests
  **/
  @Schema(description = "The number of currently running requests")
  public BigDecimal getConcurrentRequests() {
    return concurrentRequests;
  }

  public void setConcurrentRequests(BigDecimal concurrentRequests) {
    this.concurrentRequests = concurrentRequests;
  }

  public OutputStatusNewrelicEventsMetrics lastFlushTime(BigDecimal lastFlushTime) {
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

  public OutputStatusNewrelicEventsMetrics sentCount(BigDecimal sentCount) {
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

  public OutputStatusNewrelicEventsMetrics numDropped(BigDecimal numDropped) {
    this.numDropped = numDropped;
    return this;
  }

   /**
   * The number of requests dropped
   * @return numDropped
  **/
  @Schema(description = "The number of requests dropped")
  public BigDecimal getNumDropped() {
    return numDropped;
  }

  public void setNumDropped(BigDecimal numDropped) {
    this.numDropped = numDropped;
  }

  public OutputStatusNewrelicEventsMetrics parseErrorCount(BigDecimal parseErrorCount) {
    this.parseErrorCount = parseErrorCount;
    return this;
  }

   /**
   * The number of errors stemming from parsing events.
   * @return parseErrorCount
  **/
  @Schema(description = "The number of errors stemming from parsing events.")
  public BigDecimal getParseErrorCount() {
    return parseErrorCount;
  }

  public void setParseErrorCount(BigDecimal parseErrorCount) {
    this.parseErrorCount = parseErrorCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputStatusNewrelicEventsMetrics outputStatusNewrelicEventsMetrics = (OutputStatusNewrelicEventsMetrics) o;
    return Objects.equals(this.persistentQueueSize, outputStatusNewrelicEventsMetrics.persistentQueueSize) &&
        Objects.equals(this.numBytesInBuffer, outputStatusNewrelicEventsMetrics.numBytesInBuffer) &&
        Objects.equals(this.numEventsInBuffer, outputStatusNewrelicEventsMetrics.numEventsInBuffer) &&
        Objects.equals(this.concurrentRequests, outputStatusNewrelicEventsMetrics.concurrentRequests) &&
        Objects.equals(this.lastFlushTime, outputStatusNewrelicEventsMetrics.lastFlushTime) &&
        Objects.equals(this.sentCount, outputStatusNewrelicEventsMetrics.sentCount) &&
        Objects.equals(this.numDropped, outputStatusNewrelicEventsMetrics.numDropped) &&
        Objects.equals(this.parseErrorCount, outputStatusNewrelicEventsMetrics.parseErrorCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persistentQueueSize, numBytesInBuffer, numEventsInBuffer, concurrentRequests, lastFlushTime, sentCount, numDropped, parseErrorCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputStatusNewrelicEventsMetrics {\n");
    
    sb.append("    persistentQueueSize: ").append(toIndentedString(persistentQueueSize)).append("\n");
    sb.append("    numBytesInBuffer: ").append(toIndentedString(numBytesInBuffer)).append("\n");
    sb.append("    numEventsInBuffer: ").append(toIndentedString(numEventsInBuffer)).append("\n");
    sb.append("    concurrentRequests: ").append(toIndentedString(concurrentRequests)).append("\n");
    sb.append("    lastFlushTime: ").append(toIndentedString(lastFlushTime)).append("\n");
    sb.append("    sentCount: ").append(toIndentedString(sentCount)).append("\n");
    sb.append("    numDropped: ").append(toIndentedString(numDropped)).append("\n");
    sb.append("    parseErrorCount: ").append(toIndentedString(parseErrorCount)).append("\n");
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
