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
 * InputStatusTcpMetrics
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class InputStatusTcpMetrics implements OneOfInputStatusStatusMetrics {
  @SerializedName("activeSockets")
  private BigDecimal activeSockets = null;

  @SerializedName("activeBreakers")
  private BigDecimal activeBreakers = null;

  @SerializedName("received")
  private BigDecimal received = null;

  @SerializedName("broken")
  private BigDecimal broken = null;

  public InputStatusTcpMetrics activeSockets(BigDecimal activeSockets) {
    this.activeSockets = activeSockets;
    return this;
  }

   /**
   * The number of active sockets
   * @return activeSockets
  **/
  @Schema(description = "The number of active sockets")
  public BigDecimal getActiveSockets() {
    return activeSockets;
  }

  public void setActiveSockets(BigDecimal activeSockets) {
    this.activeSockets = activeSockets;
  }

  public InputStatusTcpMetrics activeBreakers(BigDecimal activeBreakers) {
    this.activeBreakers = activeBreakers;
    return this;
  }

   /**
   * The number of active event breakers
   * @return activeBreakers
  **/
  @Schema(description = "The number of active event breakers")
  public BigDecimal getActiveBreakers() {
    return activeBreakers;
  }

  public void setActiveBreakers(BigDecimal activeBreakers) {
    this.activeBreakers = activeBreakers;
  }

  public InputStatusTcpMetrics received(BigDecimal received) {
    this.received = received;
    return this;
  }

   /**
   * The number of events that have been received with this input
   * @return received
  **/
  @Schema(description = "The number of events that have been received with this input")
  public BigDecimal getReceived() {
    return received;
  }

  public void setReceived(BigDecimal received) {
    this.received = received;
  }

  public InputStatusTcpMetrics broken(BigDecimal broken) {
    this.broken = broken;
    return this;
  }

   /**
   * The number of events generated from event breaking
   * @return broken
  **/
  @Schema(description = "The number of events generated from event breaking")
  public BigDecimal getBroken() {
    return broken;
  }

  public void setBroken(BigDecimal broken) {
    this.broken = broken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputStatusTcpMetrics inputStatusTcpMetrics = (InputStatusTcpMetrics) o;
    return Objects.equals(this.activeSockets, inputStatusTcpMetrics.activeSockets) &&
        Objects.equals(this.activeBreakers, inputStatusTcpMetrics.activeBreakers) &&
        Objects.equals(this.received, inputStatusTcpMetrics.received) &&
        Objects.equals(this.broken, inputStatusTcpMetrics.broken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeSockets, activeBreakers, received, broken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputStatusTcpMetrics {\n");
    
    sb.append("    activeSockets: ").append(toIndentedString(activeSockets)).append("\n");
    sb.append("    activeBreakers: ").append(toIndentedString(activeBreakers)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    broken: ").append(toIndentedString(broken)).append("\n");
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