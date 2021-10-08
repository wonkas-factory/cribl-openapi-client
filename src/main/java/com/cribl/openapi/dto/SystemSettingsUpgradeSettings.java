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
 * SystemSettingsUpgradeSettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class SystemSettingsUpgradeSettings {
  @SerializedName("packageHashUrl")
  private String packageHashUrl = null;

  @SerializedName("packageUrl")
  private String packageUrl = null;

  @SerializedName("upgradeSource")
  private String upgradeSource = null;

  public SystemSettingsUpgradeSettings packageHashUrl(String packageHashUrl) {
    this.packageHashUrl = packageHashUrl;
    return this;
  }

   /**
   * Get packageHashUrl
   * @return packageHashUrl
  **/
  @Schema(description = "")
  public String getPackageHashUrl() {
    return packageHashUrl;
  }

  public void setPackageHashUrl(String packageHashUrl) {
    this.packageHashUrl = packageHashUrl;
  }

  public SystemSettingsUpgradeSettings packageUrl(String packageUrl) {
    this.packageUrl = packageUrl;
    return this;
  }

   /**
   * Get packageUrl
   * @return packageUrl
  **/
  @Schema(description = "")
  public String getPackageUrl() {
    return packageUrl;
  }

  public void setPackageUrl(String packageUrl) {
    this.packageUrl = packageUrl;
  }

  public SystemSettingsUpgradeSettings upgradeSource(String upgradeSource) {
    this.upgradeSource = upgradeSource;
    return this;
  }

   /**
   * Get upgradeSource
   * @return upgradeSource
  **/
  @Schema(description = "")
  public String getUpgradeSource() {
    return upgradeSource;
  }

  public void setUpgradeSource(String upgradeSource) {
    this.upgradeSource = upgradeSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemSettingsUpgradeSettings systemSettingsUpgradeSettings = (SystemSettingsUpgradeSettings) o;
    return Objects.equals(this.packageHashUrl, systemSettingsUpgradeSettings.packageHashUrl) &&
        Objects.equals(this.packageUrl, systemSettingsUpgradeSettings.packageUrl) &&
        Objects.equals(this.upgradeSource, systemSettingsUpgradeSettings.upgradeSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageHashUrl, packageUrl, upgradeSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemSettingsUpgradeSettings {\n");
    
    sb.append("    packageHashUrl: ").append(toIndentedString(packageHashUrl)).append("\n");
    sb.append("    packageUrl: ").append(toIndentedString(packageUrl)).append("\n");
    sb.append("    upgradeSource: ").append(toIndentedString(upgradeSource)).append("\n");
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