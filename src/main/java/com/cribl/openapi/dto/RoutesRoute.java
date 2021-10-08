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
import java.util.HashMap;
import java.util.Map;
/**
 * RoutesRoute
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class RoutesRoute extends HashMap<String, Object> {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  @SerializedName("filter")
  private String filter = "true";

  @SerializedName("pipeline")
  private String pipeline = null;

  @SerializedName("output")
  private String output = "";

  @SerializedName("description")
  private String description = null;

  @SerializedName("final")
  private Boolean _final = true;

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public RoutesRoute name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RoutesRoute disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Whether this routing rule is disabled
   * @return disabled
  **/
  @Schema(description = "Whether this routing rule is disabled")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public RoutesRoute filter(String filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Expression (JS) to select data to route
   * @return filter
  **/
  @Schema(description = "Expression (JS) to select data to route")
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public RoutesRoute pipeline(String pipeline) {
    this.pipeline = pipeline;
    return this;
  }

   /**
   * Pipeline to send the matching data to
   * @return pipeline
  **/
  @Schema(required = true, description = "Pipeline to send the matching data to")
  public String getPipeline() {
    return pipeline;
  }

  public void setPipeline(String pipeline) {
    this.pipeline = pipeline;
  }

  public RoutesRoute output(String output) {
    this.output = output;
    return this;
  }

   /**
   * Output destination to send events to, after they are processed by the Pipeline
   * @return output
  **/
  @Schema(description = "Output destination to send events to, after they are processed by the Pipeline")
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }

  public RoutesRoute description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Short description of this Route
   * @return description
  **/
  @Schema(description = "Short description of this Route")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RoutesRoute _final(Boolean _final) {
    this._final = _final;
    return this;
  }

   /**
   * Flag to control whether the event gets consumed by this Route (Final), or cloned into it.
   * @return _final
  **/
  @Schema(description = "Flag to control whether the event gets consumed by this Route (Final), or cloned into it.")
  public Boolean isFinal() {
    return _final;
  }

  public void setFinal(Boolean _final) {
    this._final = _final;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutesRoute routesRoute = (RoutesRoute) o;
    return Objects.equals(this.id, routesRoute.id) &&
        Objects.equals(this.name, routesRoute.name) &&
        Objects.equals(this.disabled, routesRoute.disabled) &&
        Objects.equals(this.filter, routesRoute.filter) &&
        Objects.equals(this.pipeline, routesRoute.pipeline) &&
        Objects.equals(this.output, routesRoute.output) &&
        Objects.equals(this.description, routesRoute.description) &&
        Objects.equals(this._final, routesRoute._final) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, disabled, filter, pipeline, output, description, _final, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutesRoute {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _final: ").append(toIndentedString(_final)).append("\n");
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