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
import java.util.List;
import java.util.Map;
/**
 * OutputTestResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class OutputTestResponse {
  @SerializedName("error")
  private String error = null;

  @SerializedName("errorDetail")
  private Map<String, Object> errorDetail = null;

  @SerializedName("outputId")
  private String outputId = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("successDetail")
  private String successDetail = null;

  public OutputTestResponse error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Schema(description = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public OutputTestResponse errorDetail(Map<String, Object> errorDetail) {
    this.errorDetail = errorDetail;
    return this;
  }

  public OutputTestResponse putErrorDetailItem(String key, Object errorDetailItem) {
    if (this.errorDetail == null) {
      this.errorDetail = new HashMap<>();
    }
    this.errorDetail.put(key, errorDetailItem);
    return this;
  }

   /**
   * Get errorDetail
   * @return errorDetail
  **/
  @Schema(description = "")
  public Map<String, Object> getErrorDetail() {
    return errorDetail;
  }

  public void setErrorDetail(Map<String, Object> errorDetail) {
    this.errorDetail = errorDetail;
  }

  public OutputTestResponse outputId(String outputId) {
    this.outputId = outputId;
    return this;
  }

   /**
   * Get outputId
   * @return outputId
  **/
  @Schema(description = "")
  public String getOutputId() {
    return outputId;
  }

  public void setOutputId(String outputId) {
    this.outputId = outputId;
  }

  public OutputTestResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @Schema(description = "")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public OutputTestResponse successDetail(String successDetail) {
    this.successDetail = successDetail;
    return this;
  }

   /**
   * Get successDetail
   * @return successDetail
  **/
  @Schema(description = "")
  public String getSuccessDetail() {
    return successDetail;
  }

  public void setSuccessDetail(String successDetail) {
    this.successDetail = successDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputTestResponse outputTestResponse = (OutputTestResponse) o;
    return Objects.equals(this.error, outputTestResponse.error) &&
        Objects.equals(this.errorDetail, outputTestResponse.errorDetail) &&
        Objects.equals(this.outputId, outputTestResponse.outputId) &&
        Objects.equals(this.success, outputTestResponse.success) &&
        Objects.equals(this.successDetail, outputTestResponse.successDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDetail, outputId, success, successDetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputTestResponse {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
    sb.append("    outputId: ").append(toIndentedString(outputId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    successDetail: ").append(toIndentedString(successDetail)).append("\n");
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
