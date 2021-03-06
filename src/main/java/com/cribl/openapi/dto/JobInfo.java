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
import com.cribl.openapi.dto.JobStatus;
import com.cribl.openapi.dto.RunnableJob;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * JobInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class JobInfo {
  @SerializedName("args")
  private RunnableJob args = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("keep")
  private Boolean keep = null;

  @SerializedName("status")
  private JobStatus status = null;

  public JobInfo args(RunnableJob args) {
    this.args = args;
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @Schema(description = "")
  public RunnableJob getArgs() {
    return args;
  }

  public void setArgs(RunnableJob args) {
    this.args = args;
  }

  public JobInfo id(String id) {
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

  public JobInfo keep(Boolean keep) {
    this.keep = keep;
    return this;
  }

   /**
   * Get keep
   * @return keep
  **/
  @Schema(description = "")
  public Boolean isKeep() {
    return keep;
  }

  public void setKeep(Boolean keep) {
    this.keep = keep;
  }

  public JobInfo status(JobStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public JobStatus getStatus() {
    return status;
  }

  public void setStatus(JobStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobInfo jobInfo = (JobInfo) o;
    return Objects.equals(this.args, jobInfo.args) &&
        Objects.equals(this.id, jobInfo.id) &&
        Objects.equals(this.keep, jobInfo.keep) &&
        Objects.equals(this.status, jobInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, id, keep, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobInfo {\n");
    
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keep: ").append(toIndentedString(keep)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
