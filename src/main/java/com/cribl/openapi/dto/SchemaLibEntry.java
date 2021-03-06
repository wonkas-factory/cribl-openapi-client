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
 * SchemaLibEntry
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class SchemaLibEntry extends HashMap<String, Object> {
  @SerializedName("id")
  private String id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("schema")
  private String schema = null;

  public SchemaLibEntry id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Schema ID.
   * @return id
  **/
  @Schema(required = true, description = "Schema ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SchemaLibEntry description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Brief description of this schema. Optional.
   * @return description
  **/
  @Schema(description = "Brief description of this schema. Optional.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SchemaLibEntry schema(String schema) {
    this.schema = schema;
    return this;
  }

   /**
   * JSON schema matching standards of draft version 2019-09.
   * @return schema
  **/
  @Schema(required = true, description = "JSON schema matching standards of draft version 2019-09.")
  public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaLibEntry schemaLibEntry = (SchemaLibEntry) o;
    return Objects.equals(this.id, schemaLibEntry.id) &&
        Objects.equals(this.description, schemaLibEntry.description) &&
        Objects.equals(this.schema, schemaLibEntry.schema) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, schema, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaLibEntry {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
