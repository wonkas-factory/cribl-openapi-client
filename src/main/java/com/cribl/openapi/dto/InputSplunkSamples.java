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
 * InputSplunkSamples
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class InputSplunkSamples {
  @SerializedName("sample")
  private String sample = null;

  @SerializedName("eventsPerSec")
  private BigDecimal eventsPerSec = new BigDecimal(10);

  public InputSplunkSamples sample(String sample) {
    this.sample = sample;
    return this;
  }

   /**
   * Name of the datagen file
   * @return sample
  **/
  @Schema(required = true, description = "Name of the datagen file")
  public String getSample() {
    return sample;
  }

  public void setSample(String sample) {
    this.sample = sample;
  }

  public InputSplunkSamples eventsPerSec(BigDecimal eventsPerSec) {
    this.eventsPerSec = eventsPerSec;
    return this;
  }

   /**
   * Maximum no. of events to generate per second per worker node. Defaults to 10.
   * minimum: 1
   * @return eventsPerSec
  **/
  @Schema(required = true, description = "Maximum no. of events to generate per second per worker node. Defaults to 10.")
  public BigDecimal getEventsPerSec() {
    return eventsPerSec;
  }

  public void setEventsPerSec(BigDecimal eventsPerSec) {
    this.eventsPerSec = eventsPerSec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputSplunkSamples inputSplunkSamples = (InputSplunkSamples) o;
    return Objects.equals(this.sample, inputSplunkSamples.sample) &&
        Objects.equals(this.eventsPerSec, inputSplunkSamples.eventsPerSec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sample, eventsPerSec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputSplunkSamples {\n");
    
    sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
    sb.append("    eventsPerSec: ").append(toIndentedString(eventsPerSec)).append("\n");
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
