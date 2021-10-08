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
 * VersionInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class VersionInfo {
  @SerializedName("architecture")
  private String architecture = null;

  @SerializedName("build")
  private String build = null;

  @SerializedName("downloadUrl")
  private String downloadUrl = null;

  @SerializedName("fullVersion")
  private String fullVersion = null;

  @SerializedName("major")
  private BigDecimal major = null;

  @SerializedName("minor")
  private BigDecimal minor = null;

  @SerializedName("platform")
  private String platform = null;

  @SerializedName("point")
  private BigDecimal point = null;

  @SerializedName("preRelease")
  private String preRelease = null;

  public VersionInfo architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

   /**
   * Get architecture
   * @return architecture
  **/
  @Schema(description = "")
  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public VersionInfo build(String build) {
    this.build = build;
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @Schema(description = "")
  public String getBuild() {
    return build;
  }

  public void setBuild(String build) {
    this.build = build;
  }

  public VersionInfo downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  @Schema(description = "")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public VersionInfo fullVersion(String fullVersion) {
    this.fullVersion = fullVersion;
    return this;
  }

   /**
   * Get fullVersion
   * @return fullVersion
  **/
  @Schema(description = "")
  public String getFullVersion() {
    return fullVersion;
  }

  public void setFullVersion(String fullVersion) {
    this.fullVersion = fullVersion;
  }

  public VersionInfo major(BigDecimal major) {
    this.major = major;
    return this;
  }

   /**
   * Get major
   * @return major
  **/
  @Schema(description = "")
  public BigDecimal getMajor() {
    return major;
  }

  public void setMajor(BigDecimal major) {
    this.major = major;
  }

  public VersionInfo minor(BigDecimal minor) {
    this.minor = minor;
    return this;
  }

   /**
   * Get minor
   * @return minor
  **/
  @Schema(description = "")
  public BigDecimal getMinor() {
    return minor;
  }

  public void setMinor(BigDecimal minor) {
    this.minor = minor;
  }

  public VersionInfo platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @Schema(description = "")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public VersionInfo point(BigDecimal point) {
    this.point = point;
    return this;
  }

   /**
   * Get point
   * @return point
  **/
  @Schema(description = "")
  public BigDecimal getPoint() {
    return point;
  }

  public void setPoint(BigDecimal point) {
    this.point = point;
  }

  public VersionInfo preRelease(String preRelease) {
    this.preRelease = preRelease;
    return this;
  }

   /**
   * Get preRelease
   * @return preRelease
  **/
  @Schema(description = "")
  public String getPreRelease() {
    return preRelease;
  }

  public void setPreRelease(String preRelease) {
    this.preRelease = preRelease;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionInfo versionInfo = (VersionInfo) o;
    return Objects.equals(this.architecture, versionInfo.architecture) &&
        Objects.equals(this.build, versionInfo.build) &&
        Objects.equals(this.downloadUrl, versionInfo.downloadUrl) &&
        Objects.equals(this.fullVersion, versionInfo.fullVersion) &&
        Objects.equals(this.major, versionInfo.major) &&
        Objects.equals(this.minor, versionInfo.minor) &&
        Objects.equals(this.platform, versionInfo.platform) &&
        Objects.equals(this.point, versionInfo.point) &&
        Objects.equals(this.preRelease, versionInfo.preRelease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, build, downloadUrl, fullVersion, major, minor, platform, point, preRelease);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionInfo {\n");
    
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    fullVersion: ").append(toIndentedString(fullVersion)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    preRelease: ").append(toIndentedString(preRelease)).append("\n");
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