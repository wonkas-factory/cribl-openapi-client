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
 * SystemInfoDiskUsage
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class SystemInfoDiskUsage {
  @SerializedName("bytesAvailable")
  private BigDecimal bytesAvailable = null;

  @SerializedName("bytesUsed")
  private BigDecimal bytesUsed = null;

  @SerializedName("diskPath")
  private String diskPath = null;

  @SerializedName("totalDiskSize")
  private BigDecimal totalDiskSize = null;

  public SystemInfoDiskUsage bytesAvailable(BigDecimal bytesAvailable) {
    this.bytesAvailable = bytesAvailable;
    return this;
  }

   /**
   * Get bytesAvailable
   * @return bytesAvailable
  **/
  @Schema(description = "")
  public BigDecimal getBytesAvailable() {
    return bytesAvailable;
  }

  public void setBytesAvailable(BigDecimal bytesAvailable) {
    this.bytesAvailable = bytesAvailable;
  }

  public SystemInfoDiskUsage bytesUsed(BigDecimal bytesUsed) {
    this.bytesUsed = bytesUsed;
    return this;
  }

   /**
   * Get bytesUsed
   * @return bytesUsed
  **/
  @Schema(description = "")
  public BigDecimal getBytesUsed() {
    return bytesUsed;
  }

  public void setBytesUsed(BigDecimal bytesUsed) {
    this.bytesUsed = bytesUsed;
  }

  public SystemInfoDiskUsage diskPath(String diskPath) {
    this.diskPath = diskPath;
    return this;
  }

   /**
   * Get diskPath
   * @return diskPath
  **/
  @Schema(description = "")
  public String getDiskPath() {
    return diskPath;
  }

  public void setDiskPath(String diskPath) {
    this.diskPath = diskPath;
  }

  public SystemInfoDiskUsage totalDiskSize(BigDecimal totalDiskSize) {
    this.totalDiskSize = totalDiskSize;
    return this;
  }

   /**
   * Get totalDiskSize
   * @return totalDiskSize
  **/
  @Schema(description = "")
  public BigDecimal getTotalDiskSize() {
    return totalDiskSize;
  }

  public void setTotalDiskSize(BigDecimal totalDiskSize) {
    this.totalDiskSize = totalDiskSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemInfoDiskUsage systemInfoDiskUsage = (SystemInfoDiskUsage) o;
    return Objects.equals(this.bytesAvailable, systemInfoDiskUsage.bytesAvailable) &&
        Objects.equals(this.bytesUsed, systemInfoDiskUsage.bytesUsed) &&
        Objects.equals(this.diskPath, systemInfoDiskUsage.diskPath) &&
        Objects.equals(this.totalDiskSize, systemInfoDiskUsage.totalDiskSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytesAvailable, bytesUsed, diskPath, totalDiskSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfoDiskUsage {\n");
    
    sb.append("    bytesAvailable: ").append(toIndentedString(bytesAvailable)).append("\n");
    sb.append("    bytesUsed: ").append(toIndentedString(bytesUsed)).append("\n");
    sb.append("    diskPath: ").append(toIndentedString(diskPath)).append("\n");
    sb.append("    totalDiskSize: ").append(toIndentedString(totalDiskSize)).append("\n");
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
