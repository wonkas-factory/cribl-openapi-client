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
 * InputStatusPrometheusMetrics
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class InputStatusPrometheusMetrics implements OneOfInputStatusStatusMetrics {
  @SerializedName("persistentQueueSize")
  private BigDecimal persistentQueueSize = null;

  public InputStatusPrometheusMetrics persistentQueueSize(BigDecimal persistentQueueSize) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputStatusPrometheusMetrics inputStatusPrometheusMetrics = (InputStatusPrometheusMetrics) o;
    return Objects.equals(this.persistentQueueSize, inputStatusPrometheusMetrics.persistentQueueSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persistentQueueSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputStatusPrometheusMetrics {\n");
    
    sb.append("    persistentQueueSize: ").append(toIndentedString(persistentQueueSize)).append("\n");
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
