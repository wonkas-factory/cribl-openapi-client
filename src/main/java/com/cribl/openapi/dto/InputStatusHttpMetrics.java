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
 * InputStatusHttpMetrics
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class InputStatusHttpMetrics implements OneOfInputStatusStatusMetrics {
  @SerializedName("persistentQueueSize")
  private BigDecimal persistentQueueSize = null;

  @SerializedName("numRequests")
  private BigDecimal numRequests = null;

  @SerializedName("numPushed")
  private BigDecimal numPushed = null;

  @SerializedName("numHealth")
  private BigDecimal numHealth = null;

  @SerializedName("numDropped")
  private BigDecimal numDropped = null;

  @SerializedName("numErrors")
  private BigDecimal numErrors = null;

  @SerializedName("numInProgress")
  private BigDecimal numInProgress = null;

  public InputStatusHttpMetrics persistentQueueSize(BigDecimal persistentQueueSize) {
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

  public InputStatusHttpMetrics numRequests(BigDecimal numRequests) {
    this.numRequests = numRequests;
    return this;
  }

   /**
   * The total number HTTP requests received
   * @return numRequests
  **/
  @Schema(description = "The total number HTTP requests received")
  public BigDecimal getNumRequests() {
    return numRequests;
  }

  public void setNumRequests(BigDecimal numRequests) {
    this.numRequests = numRequests;
  }

  public InputStatusHttpMetrics numPushed(BigDecimal numPushed) {
    this.numPushed = numPushed;
    return this;
  }

   /**
   * The total number of events pushed send downstream for processing. Depending on the endpoint, these events may pass through an event breaker additional processing
   * @return numPushed
  **/
  @Schema(description = "The total number of events pushed send downstream for processing. Depending on the endpoint, these events may pass through an event breaker additional processing")
  public BigDecimal getNumPushed() {
    return numPushed;
  }

  public void setNumPushed(BigDecimal numPushed) {
    this.numPushed = numPushed;
  }

  public InputStatusHttpMetrics numHealth(BigDecimal numHealth) {
    this.numHealth = numHealth;
    return this;
  }

   /**
   * The number of health endpoint invocations. The health endpoint will respond with status but not send events upstream for processing
   * @return numHealth
  **/
  @Schema(description = "The number of health endpoint invocations. The health endpoint will respond with status but not send events upstream for processing")
  public BigDecimal getNumHealth() {
    return numHealth;
  }

  public void setNumHealth(BigDecimal numHealth) {
    this.numHealth = numHealth;
  }

  public InputStatusHttpMetrics numDropped(BigDecimal numDropped) {
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

  public InputStatusHttpMetrics numErrors(BigDecimal numErrors) {
    this.numErrors = numErrors;
    return this;
  }

   /**
   * The total number errors that have occurred
   * @return numErrors
  **/
  @Schema(description = "The total number errors that have occurred")
  public BigDecimal getNumErrors() {
    return numErrors;
  }

  public void setNumErrors(BigDecimal numErrors) {
    this.numErrors = numErrors;
  }

  public InputStatusHttpMetrics numInProgress(BigDecimal numInProgress) {
    this.numInProgress = numInProgress;
    return this;
  }

   /**
   * The total number of in progress requests
   * @return numInProgress
  **/
  @Schema(description = "The total number of in progress requests")
  public BigDecimal getNumInProgress() {
    return numInProgress;
  }

  public void setNumInProgress(BigDecimal numInProgress) {
    this.numInProgress = numInProgress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputStatusHttpMetrics inputStatusHttpMetrics = (InputStatusHttpMetrics) o;
    return Objects.equals(this.persistentQueueSize, inputStatusHttpMetrics.persistentQueueSize) &&
        Objects.equals(this.numRequests, inputStatusHttpMetrics.numRequests) &&
        Objects.equals(this.numPushed, inputStatusHttpMetrics.numPushed) &&
        Objects.equals(this.numHealth, inputStatusHttpMetrics.numHealth) &&
        Objects.equals(this.numDropped, inputStatusHttpMetrics.numDropped) &&
        Objects.equals(this.numErrors, inputStatusHttpMetrics.numErrors) &&
        Objects.equals(this.numInProgress, inputStatusHttpMetrics.numInProgress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persistentQueueSize, numRequests, numPushed, numHealth, numDropped, numErrors, numInProgress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputStatusHttpMetrics {\n");
    
    sb.append("    persistentQueueSize: ").append(toIndentedString(persistentQueueSize)).append("\n");
    sb.append("    numRequests: ").append(toIndentedString(numRequests)).append("\n");
    sb.append("    numPushed: ").append(toIndentedString(numPushed)).append("\n");
    sb.append("    numHealth: ").append(toIndentedString(numHealth)).append("\n");
    sb.append("    numDropped: ").append(toIndentedString(numDropped)).append("\n");
    sb.append("    numErrors: ").append(toIndentedString(numErrors)).append("\n");
    sb.append("    numInProgress: ").append(toIndentedString(numInProgress)).append("\n");
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
