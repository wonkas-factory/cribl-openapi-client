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
import java.util.ArrayList;
import java.util.List;
/**
 * SavedJobCollectionInputPreprocess
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class SavedJobCollectionInputPreprocess {
  @SerializedName("disabled")
  private Boolean disabled = true;

  @SerializedName("command")
  private String command = null;

  @SerializedName("args")
  private List<String> args = null;

  public SavedJobCollectionInputPreprocess disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Enable Custom Command
   * @return disabled
  **/
  @Schema(required = true, description = "Enable Custom Command")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public SavedJobCollectionInputPreprocess command(String command) {
    this.command = command;
    return this;
  }

   /**
   * Command to feed the data through (via stdin) and process its output (stdout)
   * @return command
  **/
  @Schema(description = "Command to feed the data through (via stdin) and process its output (stdout)")
  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public SavedJobCollectionInputPreprocess args(List<String> args) {
    this.args = args;
    return this;
  }

  public SavedJobCollectionInputPreprocess addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Arguments
   * @return args
  **/
  @Schema(description = "Arguments")
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedJobCollectionInputPreprocess savedJobCollectionInputPreprocess = (SavedJobCollectionInputPreprocess) o;
    return Objects.equals(this.disabled, savedJobCollectionInputPreprocess.disabled) &&
        Objects.equals(this.command, savedJobCollectionInputPreprocess.command) &&
        Objects.equals(this.args, savedJobCollectionInputPreprocess.args);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, command, args);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedJobCollectionInputPreprocess {\n");
    
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
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
