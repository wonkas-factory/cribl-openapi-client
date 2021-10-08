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
import com.cribl.openapi.dto.LicenseType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * LicenseInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class LicenseInfo {
  @SerializedName("effectiveClass")
  private LicenseType effectiveClass = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("expiration")
  private BigDecimal expiration = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("isSplunkApp")
  private Boolean isSplunkApp = null;

  @SerializedName("licenseEnforceReason")
  private String licenseEnforceReason = null;

  @SerializedName("limits")
  private Map<String, Object> limits = null;

  @SerializedName("phoneHome")
  private Boolean phoneHome = null;

  @SerializedName("phoneHomeGrace")
  private BigDecimal phoneHomeGrace = null;

  @SerializedName("quota")
  private BigDecimal quota = null;

  public LicenseInfo effectiveClass(LicenseType effectiveClass) {
    this.effectiveClass = effectiveClass;
    return this;
  }

   /**
   * Get effectiveClass
   * @return effectiveClass
  **/
  @Schema(description = "")
  public LicenseType getEffectiveClass() {
    return effectiveClass;
  }

  public void setEffectiveClass(LicenseType effectiveClass) {
    this.effectiveClass = effectiveClass;
  }

  public LicenseInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LicenseInfo expiration(BigDecimal expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @Schema(description = "")
  public BigDecimal getExpiration() {
    return expiration;
  }

  public void setExpiration(BigDecimal expiration) {
    this.expiration = expiration;
  }

  public LicenseInfo guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @Schema(description = "")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public LicenseInfo isSplunkApp(Boolean isSplunkApp) {
    this.isSplunkApp = isSplunkApp;
    return this;
  }

   /**
   * Get isSplunkApp
   * @return isSplunkApp
  **/
  @Schema(description = "")
  public Boolean isIsSplunkApp() {
    return isSplunkApp;
  }

  public void setIsSplunkApp(Boolean isSplunkApp) {
    this.isSplunkApp = isSplunkApp;
  }

  public LicenseInfo licenseEnforceReason(String licenseEnforceReason) {
    this.licenseEnforceReason = licenseEnforceReason;
    return this;
  }

   /**
   * Get licenseEnforceReason
   * @return licenseEnforceReason
  **/
  @Schema(description = "")
  public String getLicenseEnforceReason() {
    return licenseEnforceReason;
  }

  public void setLicenseEnforceReason(String licenseEnforceReason) {
    this.licenseEnforceReason = licenseEnforceReason;
  }

  public LicenseInfo limits(Map<String, Object> limits) {
    this.limits = limits;
    return this;
  }

  public LicenseInfo putLimitsItem(String key, Object limitsItem) {
    if (this.limits == null) {
      this.limits = new HashMap<>();
    }
    this.limits.put(key, limitsItem);
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @Schema(description = "")
  public Map<String, Object> getLimits() {
    return limits;
  }

  public void setLimits(Map<String, Object> limits) {
    this.limits = limits;
  }

  public LicenseInfo phoneHome(Boolean phoneHome) {
    this.phoneHome = phoneHome;
    return this;
  }

   /**
   * Get phoneHome
   * @return phoneHome
  **/
  @Schema(description = "")
  public Boolean isPhoneHome() {
    return phoneHome;
  }

  public void setPhoneHome(Boolean phoneHome) {
    this.phoneHome = phoneHome;
  }

  public LicenseInfo phoneHomeGrace(BigDecimal phoneHomeGrace) {
    this.phoneHomeGrace = phoneHomeGrace;
    return this;
  }

   /**
   * Get phoneHomeGrace
   * @return phoneHomeGrace
  **/
  @Schema(description = "")
  public BigDecimal getPhoneHomeGrace() {
    return phoneHomeGrace;
  }

  public void setPhoneHomeGrace(BigDecimal phoneHomeGrace) {
    this.phoneHomeGrace = phoneHomeGrace;
  }

  public LicenseInfo quota(BigDecimal quota) {
    this.quota = quota;
    return this;
  }

   /**
   * Get quota
   * @return quota
  **/
  @Schema(description = "")
  public BigDecimal getQuota() {
    return quota;
  }

  public void setQuota(BigDecimal quota) {
    this.quota = quota;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseInfo licenseInfo = (LicenseInfo) o;
    return Objects.equals(this.effectiveClass, licenseInfo.effectiveClass) &&
        Objects.equals(this.email, licenseInfo.email) &&
        Objects.equals(this.expiration, licenseInfo.expiration) &&
        Objects.equals(this.guid, licenseInfo.guid) &&
        Objects.equals(this.isSplunkApp, licenseInfo.isSplunkApp) &&
        Objects.equals(this.licenseEnforceReason, licenseInfo.licenseEnforceReason) &&
        Objects.equals(this.limits, licenseInfo.limits) &&
        Objects.equals(this.phoneHome, licenseInfo.phoneHome) &&
        Objects.equals(this.phoneHomeGrace, licenseInfo.phoneHomeGrace) &&
        Objects.equals(this.quota, licenseInfo.quota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveClass, email, expiration, guid, isSplunkApp, licenseEnforceReason, limits, phoneHome, phoneHomeGrace, quota);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseInfo {\n");
    
    sb.append("    effectiveClass: ").append(toIndentedString(effectiveClass)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    isSplunkApp: ").append(toIndentedString(isSplunkApp)).append("\n");
    sb.append("    licenseEnforceReason: ").append(toIndentedString(licenseEnforceReason)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    phoneHome: ").append(toIndentedString(phoneHome)).append("\n");
    sb.append("    phoneHomeGrace: ").append(toIndentedString(phoneHomeGrace)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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
