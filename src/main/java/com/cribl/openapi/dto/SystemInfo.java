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
import com.cribl.openapi.dto.BulletinMessage;
import com.cribl.openapi.dto.LicenseInfo;
import com.cribl.openapi.dto.SystemInfoConf;
import com.cribl.openapi.dto.SystemInfoCpus;
import com.cribl.openapi.dto.SystemInfoDiskUsage;
import com.cribl.openapi.dto.SystemInfoLimits;
import com.cribl.openapi.dto.SystemInfoMemory;
import com.cribl.openapi.dto.SystemInfoOs;
import com.cribl.openapi.dto.SystemInfoSystemConf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * SystemInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class SystemInfo {
  @SerializedName("BUILD")
  private Map<String, Object> BUILD = null;

  @SerializedName("apiPort")
  private BigDecimal apiPort = null;

  @SerializedName("conf")
  private SystemInfoConf conf = null;

  @SerializedName("configPath")
  private String configPath = null;

  @SerializedName("cpus")
  private List<SystemInfoCpus> cpus = null;

  @SerializedName("diskUsage")
  private SystemInfoDiskUsage diskUsage = null;

  @SerializedName("env")
  private Object env = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("installPath")
  private String installPath = null;

  @SerializedName("license")
  private LicenseInfo license = null;

  @SerializedName("limits")
  private SystemInfoLimits limits = null;

  @SerializedName("loadavg")
  private List<BigDecimal> loadavg = null;

  @SerializedName("memory")
  private SystemInfoMemory memory = null;

  @SerializedName("messages")
  private List<BulletinMessage> messages = null;

  @SerializedName("net")
  private Map<String, Object> net = null;

  @SerializedName("os")
  private SystemInfoOs os = null;

  @SerializedName("systemConf")
  private SystemInfoSystemConf systemConf = null;

  @SerializedName("uptime")
  private BigDecimal uptime = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("workerProcesses")
  private BigDecimal workerProcesses = null;

  public SystemInfo BUILD(Map<String, Object> BUILD) {
    this.BUILD = BUILD;
    return this;
  }

  public SystemInfo putBUILDItem(String key, Object BUILDItem) {
    if (this.BUILD == null) {
      this.BUILD = new HashMap<>();
    }
    this.BUILD.put(key, BUILDItem);
    return this;
  }

   /**
   * Get BUILD
   * @return BUILD
  **/
  @Schema(description = "")
  public Map<String, Object> getBUILD() {
    return BUILD;
  }

  public void setBUILD(Map<String, Object> BUILD) {
    this.BUILD = BUILD;
  }

  public SystemInfo apiPort(BigDecimal apiPort) {
    this.apiPort = apiPort;
    return this;
  }

   /**
   * Get apiPort
   * @return apiPort
  **/
  @Schema(description = "")
  public BigDecimal getApiPort() {
    return apiPort;
  }

  public void setApiPort(BigDecimal apiPort) {
    this.apiPort = apiPort;
  }

  public SystemInfo conf(SystemInfoConf conf) {
    this.conf = conf;
    return this;
  }

   /**
   * Get conf
   * @return conf
  **/
  @Schema(description = "")
  public SystemInfoConf getConf() {
    return conf;
  }

  public void setConf(SystemInfoConf conf) {
    this.conf = conf;
  }

  public SystemInfo configPath(String configPath) {
    this.configPath = configPath;
    return this;
  }

   /**
   * Get configPath
   * @return configPath
  **/
  @Schema(description = "")
  public String getConfigPath() {
    return configPath;
  }

  public void setConfigPath(String configPath) {
    this.configPath = configPath;
  }

  public SystemInfo cpus(List<SystemInfoCpus> cpus) {
    this.cpus = cpus;
    return this;
  }

  public SystemInfo addCpusItem(SystemInfoCpus cpusItem) {
    if (this.cpus == null) {
      this.cpus = new ArrayList<>();
    }
    this.cpus.add(cpusItem);
    return this;
  }

   /**
   * Get cpus
   * @return cpus
  **/
  @Schema(description = "")
  public List<SystemInfoCpus> getCpus() {
    return cpus;
  }

  public void setCpus(List<SystemInfoCpus> cpus) {
    this.cpus = cpus;
  }

  public SystemInfo diskUsage(SystemInfoDiskUsage diskUsage) {
    this.diskUsage = diskUsage;
    return this;
  }

   /**
   * Get diskUsage
   * @return diskUsage
  **/
  @Schema(description = "")
  public SystemInfoDiskUsage getDiskUsage() {
    return diskUsage;
  }

  public void setDiskUsage(SystemInfoDiskUsage diskUsage) {
    this.diskUsage = diskUsage;
  }

  public SystemInfo env(Object env) {
    this.env = env;
    return this;
  }

   /**
   * Get env
   * @return env
  **/
  @Schema(description = "")
  public Object getEnv() {
    return env;
  }

  public void setEnv(Object env) {
    this.env = env;
  }

  public SystemInfo guid(String guid) {
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

  public SystemInfo hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @Schema(description = "")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public SystemInfo installPath(String installPath) {
    this.installPath = installPath;
    return this;
  }

   /**
   * Get installPath
   * @return installPath
  **/
  @Schema(description = "")
  public String getInstallPath() {
    return installPath;
  }

  public void setInstallPath(String installPath) {
    this.installPath = installPath;
  }

  public SystemInfo license(LicenseInfo license) {
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @Schema(description = "")
  public LicenseInfo getLicense() {
    return license;
  }

  public void setLicense(LicenseInfo license) {
    this.license = license;
  }

  public SystemInfo limits(SystemInfoLimits limits) {
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @Schema(description = "")
  public SystemInfoLimits getLimits() {
    return limits;
  }

  public void setLimits(SystemInfoLimits limits) {
    this.limits = limits;
  }

  public SystemInfo loadavg(List<BigDecimal> loadavg) {
    this.loadavg = loadavg;
    return this;
  }

  public SystemInfo addLoadavgItem(BigDecimal loadavgItem) {
    if (this.loadavg == null) {
      this.loadavg = new ArrayList<>();
    }
    this.loadavg.add(loadavgItem);
    return this;
  }

   /**
   * Get loadavg
   * @return loadavg
  **/
  @Schema(description = "")
  public List<BigDecimal> getLoadavg() {
    return loadavg;
  }

  public void setLoadavg(List<BigDecimal> loadavg) {
    this.loadavg = loadavg;
  }

  public SystemInfo memory(SystemInfoMemory memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @Schema(description = "")
  public SystemInfoMemory getMemory() {
    return memory;
  }

  public void setMemory(SystemInfoMemory memory) {
    this.memory = memory;
  }

  public SystemInfo messages(List<BulletinMessage> messages) {
    this.messages = messages;
    return this;
  }

  public SystemInfo addMessagesItem(BulletinMessage messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @Schema(description = "")
  public List<BulletinMessage> getMessages() {
    return messages;
  }

  public void setMessages(List<BulletinMessage> messages) {
    this.messages = messages;
  }

  public SystemInfo net(Map<String, Object> net) {
    this.net = net;
    return this;
  }

  public SystemInfo putNetItem(String key, Object netItem) {
    if (this.net == null) {
      this.net = new HashMap<>();
    }
    this.net.put(key, netItem);
    return this;
  }

   /**
   * Get net
   * @return net
  **/
  @Schema(description = "")
  public Map<String, Object> getNet() {
    return net;
  }

  public void setNet(Map<String, Object> net) {
    this.net = net;
  }

  public SystemInfo os(SystemInfoOs os) {
    this.os = os;
    return this;
  }

   /**
   * Get os
   * @return os
  **/
  @Schema(description = "")
  public SystemInfoOs getOs() {
    return os;
  }

  public void setOs(SystemInfoOs os) {
    this.os = os;
  }

  public SystemInfo systemConf(SystemInfoSystemConf systemConf) {
    this.systemConf = systemConf;
    return this;
  }

   /**
   * Get systemConf
   * @return systemConf
  **/
  @Schema(description = "")
  public SystemInfoSystemConf getSystemConf() {
    return systemConf;
  }

  public void setSystemConf(SystemInfoSystemConf systemConf) {
    this.systemConf = systemConf;
  }

  public SystemInfo uptime(BigDecimal uptime) {
    this.uptime = uptime;
    return this;
  }

   /**
   * Get uptime
   * @return uptime
  **/
  @Schema(description = "")
  public BigDecimal getUptime() {
    return uptime;
  }

  public void setUptime(BigDecimal uptime) {
    this.uptime = uptime;
  }

  public SystemInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public SystemInfo workerProcesses(BigDecimal workerProcesses) {
    this.workerProcesses = workerProcesses;
    return this;
  }

   /**
   * Get workerProcesses
   * @return workerProcesses
  **/
  @Schema(description = "")
  public BigDecimal getWorkerProcesses() {
    return workerProcesses;
  }

  public void setWorkerProcesses(BigDecimal workerProcesses) {
    this.workerProcesses = workerProcesses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemInfo systemInfo = (SystemInfo) o;
    return Objects.equals(this.BUILD, systemInfo.BUILD) &&
        Objects.equals(this.apiPort, systemInfo.apiPort) &&
        Objects.equals(this.conf, systemInfo.conf) &&
        Objects.equals(this.configPath, systemInfo.configPath) &&
        Objects.equals(this.cpus, systemInfo.cpus) &&
        Objects.equals(this.diskUsage, systemInfo.diskUsage) &&
        Objects.equals(this.env, systemInfo.env) &&
        Objects.equals(this.guid, systemInfo.guid) &&
        Objects.equals(this.hostname, systemInfo.hostname) &&
        Objects.equals(this.installPath, systemInfo.installPath) &&
        Objects.equals(this.license, systemInfo.license) &&
        Objects.equals(this.limits, systemInfo.limits) &&
        Objects.equals(this.loadavg, systemInfo.loadavg) &&
        Objects.equals(this.memory, systemInfo.memory) &&
        Objects.equals(this.messages, systemInfo.messages) &&
        Objects.equals(this.net, systemInfo.net) &&
        Objects.equals(this.os, systemInfo.os) &&
        Objects.equals(this.systemConf, systemInfo.systemConf) &&
        Objects.equals(this.uptime, systemInfo.uptime) &&
        Objects.equals(this.version, systemInfo.version) &&
        Objects.equals(this.workerProcesses, systemInfo.workerProcesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(BUILD, apiPort, conf, configPath, cpus, diskUsage, env, guid, hostname, installPath, license, limits, loadavg, memory, messages, net, os, systemConf, uptime, version, workerProcesses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfo {\n");
    
    sb.append("    BUILD: ").append(toIndentedString(BUILD)).append("\n");
    sb.append("    apiPort: ").append(toIndentedString(apiPort)).append("\n");
    sb.append("    conf: ").append(toIndentedString(conf)).append("\n");
    sb.append("    configPath: ").append(toIndentedString(configPath)).append("\n");
    sb.append("    cpus: ").append(toIndentedString(cpus)).append("\n");
    sb.append("    diskUsage: ").append(toIndentedString(diskUsage)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    installPath: ").append(toIndentedString(installPath)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    loadavg: ").append(toIndentedString(loadavg)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    systemConf: ").append(toIndentedString(systemConf)).append("\n");
    sb.append("    uptime: ").append(toIndentedString(uptime)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    workerProcesses: ").append(toIndentedString(workerProcesses)).append("\n");
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
