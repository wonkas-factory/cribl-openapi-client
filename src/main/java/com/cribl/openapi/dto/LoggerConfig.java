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
import com.cribl.openapi.dto.LoggerEntry;
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
 * LoggerConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class LoggerConfig {
  @SerializedName("channels")
  private List<LoggerEntry> channels = null;

  @SerializedName("defaultRedactFields")
  private List<String> defaultRedactFields = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("redactFields")
  private List<String> redactFields = null;

  @SerializedName("redactLabel")
  private String redactLabel = null;

  public LoggerConfig channels(List<LoggerEntry> channels) {
    this.channels = channels;
    return this;
  }

  public LoggerConfig addChannelsItem(LoggerEntry channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @Schema(description = "")
  public List<LoggerEntry> getChannels() {
    return channels;
  }

  public void setChannels(List<LoggerEntry> channels) {
    this.channels = channels;
  }

  public LoggerConfig defaultRedactFields(List<String> defaultRedactFields) {
    this.defaultRedactFields = defaultRedactFields;
    return this;
  }

  public LoggerConfig addDefaultRedactFieldsItem(String defaultRedactFieldsItem) {
    if (this.defaultRedactFields == null) {
      this.defaultRedactFields = new ArrayList<>();
    }
    this.defaultRedactFields.add(defaultRedactFieldsItem);
    return this;
  }

   /**
   * Get defaultRedactFields
   * @return defaultRedactFields
  **/
  @Schema(description = "")
  public List<String> getDefaultRedactFields() {
    return defaultRedactFields;
  }

  public void setDefaultRedactFields(List<String> defaultRedactFields) {
    this.defaultRedactFields = defaultRedactFields;
  }

  public LoggerConfig id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoggerConfig redactFields(List<String> redactFields) {
    this.redactFields = redactFields;
    return this;
  }

  public LoggerConfig addRedactFieldsItem(String redactFieldsItem) {
    if (this.redactFields == null) {
      this.redactFields = new ArrayList<>();
    }
    this.redactFields.add(redactFieldsItem);
    return this;
  }

   /**
   * Get redactFields
   * @return redactFields
  **/
  @Schema(description = "")
  public List<String> getRedactFields() {
    return redactFields;
  }

  public void setRedactFields(List<String> redactFields) {
    this.redactFields = redactFields;
  }

  public LoggerConfig redactLabel(String redactLabel) {
    this.redactLabel = redactLabel;
    return this;
  }

   /**
   * Get redactLabel
   * @return redactLabel
  **/
  @Schema(description = "")
  public String getRedactLabel() {
    return redactLabel;
  }

  public void setRedactLabel(String redactLabel) {
    this.redactLabel = redactLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoggerConfig loggerConfig = (LoggerConfig) o;
    return Objects.equals(this.channels, loggerConfig.channels) &&
        Objects.equals(this.defaultRedactFields, loggerConfig.defaultRedactFields) &&
        Objects.equals(this.id, loggerConfig.id) &&
        Objects.equals(this.redactFields, loggerConfig.redactFields) &&
        Objects.equals(this.redactLabel, loggerConfig.redactLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels, defaultRedactFields, id, redactFields, redactLabel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoggerConfig {\n");
    
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    defaultRedactFields: ").append(toIndentedString(defaultRedactFields)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    redactFields: ").append(toIndentedString(redactFields)).append("\n");
    sb.append("    redactLabel: ").append(toIndentedString(redactLabel)).append("\n");
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
