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
import com.cribl.openapi.dto.MetricNameInfoDims;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * MetricNameInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class MetricNameInfo {
  @SerializedName("dims")
  private List<MetricNameInfoDims> dims = null;

  @SerializedName("name")
  private String name = null;

  public MetricNameInfo dims(List<MetricNameInfoDims> dims) {
    this.dims = dims;
    return this;
  }

  public MetricNameInfo addDimsItem(MetricNameInfoDims dimsItem) {
    if (this.dims == null) {
      this.dims = new ArrayList<>();
    }
    this.dims.add(dimsItem);
    return this;
  }

   /**
   * Get dims
   * @return dims
  **/
  @Schema(description = "")
  public List<MetricNameInfoDims> getDims() {
    return dims;
  }

  public void setDims(List<MetricNameInfoDims> dims) {
    this.dims = dims;
  }

  public MetricNameInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricNameInfo metricNameInfo = (MetricNameInfo) o;
    return Objects.equals(this.dims, metricNameInfo.dims) &&
        Objects.equals(this.name, metricNameInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dims, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricNameInfo {\n");
    
    sb.append("    dims: ").append(toIndentedString(dims)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
