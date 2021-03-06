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
import com.cribl.openapi.dto.IKMSProviderConfigAuth;
import com.cribl.openapi.dto.IKMSProviderConfigEngine;
import com.cribl.openapi.dto.SECRETPROVIDER;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * IKMSProviderConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class IKMSProviderConfig {
  @SerializedName("auth")
  private IKMSProviderConfigAuth auth = null;

  @SerializedName("enableHealthCheck")
  private Boolean enableHealthCheck = null;

  @SerializedName("engine")
  private IKMSProviderConfigEngine engine = null;

  @SerializedName("healthCheckEndpoint")
  private String healthCheckEndpoint = null;

  @SerializedName("provider")
  private SECRETPROVIDER provider = null;

  @SerializedName("secretDir")
  private String secretDir = null;

  @SerializedName("url")
  private String url = null;

  public IKMSProviderConfig auth(IKMSProviderConfigAuth auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @Schema(description = "")
  public IKMSProviderConfigAuth getAuth() {
    return auth;
  }

  public void setAuth(IKMSProviderConfigAuth auth) {
    this.auth = auth;
  }

  public IKMSProviderConfig enableHealthCheck(Boolean enableHealthCheck) {
    this.enableHealthCheck = enableHealthCheck;
    return this;
  }

   /**
   * Get enableHealthCheck
   * @return enableHealthCheck
  **/
  @Schema(description = "")
  public Boolean isEnableHealthCheck() {
    return enableHealthCheck;
  }

  public void setEnableHealthCheck(Boolean enableHealthCheck) {
    this.enableHealthCheck = enableHealthCheck;
  }

  public IKMSProviderConfig engine(IKMSProviderConfigEngine engine) {
    this.engine = engine;
    return this;
  }

   /**
   * Get engine
   * @return engine
  **/
  @Schema(description = "")
  public IKMSProviderConfigEngine getEngine() {
    return engine;
  }

  public void setEngine(IKMSProviderConfigEngine engine) {
    this.engine = engine;
  }

  public IKMSProviderConfig healthCheckEndpoint(String healthCheckEndpoint) {
    this.healthCheckEndpoint = healthCheckEndpoint;
    return this;
  }

   /**
   * Get healthCheckEndpoint
   * @return healthCheckEndpoint
  **/
  @Schema(description = "")
  public String getHealthCheckEndpoint() {
    return healthCheckEndpoint;
  }

  public void setHealthCheckEndpoint(String healthCheckEndpoint) {
    this.healthCheckEndpoint = healthCheckEndpoint;
  }

  public IKMSProviderConfig provider(SECRETPROVIDER provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @Schema(description = "")
  public SECRETPROVIDER getProvider() {
    return provider;
  }

  public void setProvider(SECRETPROVIDER provider) {
    this.provider = provider;
  }

  public IKMSProviderConfig secretDir(String secretDir) {
    this.secretDir = secretDir;
    return this;
  }

   /**
   * Get secretDir
   * @return secretDir
  **/
  @Schema(description = "")
  public String getSecretDir() {
    return secretDir;
  }

  public void setSecretDir(String secretDir) {
    this.secretDir = secretDir;
  }

  public IKMSProviderConfig url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IKMSProviderConfig ikMSProviderConfig = (IKMSProviderConfig) o;
    return Objects.equals(this.auth, ikMSProviderConfig.auth) &&
        Objects.equals(this.enableHealthCheck, ikMSProviderConfig.enableHealthCheck) &&
        Objects.equals(this.engine, ikMSProviderConfig.engine) &&
        Objects.equals(this.healthCheckEndpoint, ikMSProviderConfig.healthCheckEndpoint) &&
        Objects.equals(this.provider, ikMSProviderConfig.provider) &&
        Objects.equals(this.secretDir, ikMSProviderConfig.secretDir) &&
        Objects.equals(this.url, ikMSProviderConfig.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, enableHealthCheck, engine, healthCheckEndpoint, provider, secretDir, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IKMSProviderConfig {\n");
    
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    enableHealthCheck: ").append(toIndentedString(enableHealthCheck)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    healthCheckEndpoint: ").append(toIndentedString(healthCheckEndpoint)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    secretDir: ").append(toIndentedString(secretDir)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
