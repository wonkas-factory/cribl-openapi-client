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
/**
 * ConfigGroup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class ConfigGroup {
  @SerializedName("configVersion")
  private String configVersion = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("sourceGroupId")
  private String sourceGroupId = null;

  @SerializedName("tags")
  private String tags = null;

  public ConfigGroup configVersion(String configVersion) {
    this.configVersion = configVersion;
    return this;
  }

   /**
   * Get configVersion
   * @return configVersion
  **/
  @Schema(description = "")
  public String getConfigVersion() {
    return configVersion;
  }

  public void setConfigVersion(String configVersion) {
    this.configVersion = configVersion;
  }

  public ConfigGroup description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConfigGroup id(String id) {
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

  public ConfigGroup sourceGroupId(String sourceGroupId) {
    this.sourceGroupId = sourceGroupId;
    return this;
  }

   /**
   * Get sourceGroupId
   * @return sourceGroupId
  **/
  @Schema(description = "")
  public String getSourceGroupId() {
    return sourceGroupId;
  }

  public void setSourceGroupId(String sourceGroupId) {
    this.sourceGroupId = sourceGroupId;
  }

  public ConfigGroup tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigGroup configGroup = (ConfigGroup) o;
    return Objects.equals(this.configVersion, configGroup.configVersion) &&
        Objects.equals(this.description, configGroup.description) &&
        Objects.equals(this.id, configGroup.id) &&
        Objects.equals(this.sourceGroupId, configGroup.sourceGroupId) &&
        Objects.equals(this.tags, configGroup.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configVersion, description, id, sourceGroupId, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigGroup {\n");
    
    sb.append("    configVersion: ").append(toIndentedString(configVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceGroupId: ").append(toIndentedString(sourceGroupId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
