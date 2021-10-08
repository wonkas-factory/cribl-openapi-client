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
 * SystemInfoSystemConf
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class SystemInfoSystemConf {
  @SerializedName("installType")
  private String installType = null;

  @SerializedName("restart")
  private String restart = null;

  @SerializedName("upgrade")
  private String upgrade = null;

  public SystemInfoSystemConf installType(String installType) {
    this.installType = installType;
    return this;
  }

   /**
   * Get installType
   * @return installType
  **/
  @Schema(description = "")
  public String getInstallType() {
    return installType;
  }

  public void setInstallType(String installType) {
    this.installType = installType;
  }

  public SystemInfoSystemConf restart(String restart) {
    this.restart = restart;
    return this;
  }

   /**
   * Get restart
   * @return restart
  **/
  @Schema(description = "")
  public String getRestart() {
    return restart;
  }

  public void setRestart(String restart) {
    this.restart = restart;
  }

  public SystemInfoSystemConf upgrade(String upgrade) {
    this.upgrade = upgrade;
    return this;
  }

   /**
   * Get upgrade
   * @return upgrade
  **/
  @Schema(description = "")
  public String getUpgrade() {
    return upgrade;
  }

  public void setUpgrade(String upgrade) {
    this.upgrade = upgrade;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemInfoSystemConf systemInfoSystemConf = (SystemInfoSystemConf) o;
    return Objects.equals(this.installType, systemInfoSystemConf.installType) &&
        Objects.equals(this.restart, systemInfoSystemConf.restart) &&
        Objects.equals(this.upgrade, systemInfoSystemConf.upgrade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installType, restart, upgrade);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfoSystemConf {\n");
    
    sb.append("    installType: ").append(toIndentedString(installType)).append("\n");
    sb.append("    restart: ").append(toIndentedString(restart)).append("\n");
    sb.append("    upgrade: ").append(toIndentedString(upgrade)).append("\n");
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