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
 * SavedJobCollectionRun
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class SavedJobCollectionRun {
  @SerializedName("rescheduleDroppedTasks")
  private Boolean rescheduleDroppedTasks = true;

  @SerializedName("maxTaskReschedule")
  private BigDecimal maxTaskReschedule = new BigDecimal(1);

  /**
   * Level at which to set task logging.
   */
  @JsonAdapter(LogLevelEnum.Adapter.class)
  public enum LogLevelEnum {
    ERROR("error"),
    WARN("warn"),
    INFO("info"),
    DEBUG("debug");

    private String value;

    LogLevelEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static LogLevelEnum fromValue(String text) {
      for (LogLevelEnum b : LogLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LogLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LogLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LogLevelEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return LogLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("logLevel")
  private LogLevelEnum logLevel = LogLevelEnum.INFO;

  @SerializedName("jobTimeout")
  private String jobTimeout = "0";

  @SerializedName("mode")
  private String mode = "list";

  @SerializedName("timeRangeType")
  private String timeRangeType = "relative";

  @SerializedName("earliest")
  private BigDecimal earliest = null;

  @SerializedName("latest")
  private BigDecimal latest = null;

  @SerializedName("expression")
  private String expression = "true";

  @SerializedName("minTaskSize")
  private String minTaskSize = "1MB";

  @SerializedName("maxTaskSize")
  private String maxTaskSize = "10MB";

  public SavedJobCollectionRun rescheduleDroppedTasks(Boolean rescheduleDroppedTasks) {
    this.rescheduleDroppedTasks = rescheduleDroppedTasks;
    return this;
  }

   /**
   * Reschedule tasks that failed with non-fatal errors.
   * @return rescheduleDroppedTasks
  **/
  @Schema(description = "Reschedule tasks that failed with non-fatal errors.")
  public Boolean isRescheduleDroppedTasks() {
    return rescheduleDroppedTasks;
  }

  public void setRescheduleDroppedTasks(Boolean rescheduleDroppedTasks) {
    this.rescheduleDroppedTasks = rescheduleDroppedTasks;
  }

  public SavedJobCollectionRun maxTaskReschedule(BigDecimal maxTaskReschedule) {
    this.maxTaskReschedule = maxTaskReschedule;
    return this;
  }

   /**
   * Max number of times a task can be rescheduled.
   * minimum: 1
   * @return maxTaskReschedule
  **/
  @Schema(description = "Max number of times a task can be rescheduled.")
  public BigDecimal getMaxTaskReschedule() {
    return maxTaskReschedule;
  }

  public void setMaxTaskReschedule(BigDecimal maxTaskReschedule) {
    this.maxTaskReschedule = maxTaskReschedule;
  }

  public SavedJobCollectionRun logLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
    return this;
  }

   /**
   * Level at which to set task logging.
   * @return logLevel
  **/
  @Schema(description = "Level at which to set task logging.")
  public LogLevelEnum getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
  }

  public SavedJobCollectionRun jobTimeout(String jobTimeout) {
    this.jobTimeout = jobTimeout;
    return this;
  }

   /**
   * Maximum time the job is allowed to run (e.g., 30, 45s or 15m). Units are seconds, if not specified. Enter 0 for unlimited time.
   * @return jobTimeout
  **/
  @Schema(description = "Maximum time the job is allowed to run (e.g., 30, 45s or 15m). Units are seconds, if not specified. Enter 0 for unlimited time.")
  public String getJobTimeout() {
    return jobTimeout;
  }

  public void setJobTimeout(String jobTimeout) {
    this.jobTimeout = jobTimeout;
  }

  public SavedJobCollectionRun mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Job run mode. Preview will either return up to N matching results, or will run until capture time T is reached. Discovery will gather the list of files to turn into streaming tasks, without running the data collection job. Full Run will run the collection job.
   * @return mode
  **/
  @Schema(required = true, description = "Job run mode. Preview will either return up to N matching results, or will run until capture time T is reached. Discovery will gather the list of files to turn into streaming tasks, without running the data collection job. Full Run will run the collection job.")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public SavedJobCollectionRun timeRangeType(String timeRangeType) {
    this.timeRangeType = timeRangeType;
    return this;
  }

   /**
   * Time range for scheduled job.
   * @return timeRangeType
  **/
  @Schema(description = "Time range for scheduled job.")
  public String getTimeRangeType() {
    return timeRangeType;
  }

  public void setTimeRangeType(String timeRangeType) {
    this.timeRangeType = timeRangeType;
  }

  public SavedJobCollectionRun earliest(BigDecimal earliest) {
    this.earliest = earliest;
    return this;
  }

   /**
   * Earliest time, in local time.
   * @return earliest
  **/
  @Schema(description = "Earliest time, in local time.")
  public BigDecimal getEarliest() {
    return earliest;
  }

  public void setEarliest(BigDecimal earliest) {
    this.earliest = earliest;
  }

  public SavedJobCollectionRun latest(BigDecimal latest) {
    this.latest = latest;
    return this;
  }

   /**
   * Latest time, in local time.
   * @return latest
  **/
  @Schema(description = "Latest time, in local time.")
  public BigDecimal getLatest() {
    return latest;
  }

  public void setLatest(BigDecimal latest) {
    this.latest = latest;
  }

  public SavedJobCollectionRun expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * A filter for tokens in the provided collect path and/or the events being collected
   * @return expression
  **/
  @Schema(description = "A filter for tokens in the provided collect path and/or the events being collected")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public SavedJobCollectionRun minTaskSize(String minTaskSize) {
    this.minTaskSize = minTaskSize;
    return this;
  }

   /**
   * Limits the bundle size for small tasks. E.g., bundle five 200KB files into one 1M task.
   * @return minTaskSize
  **/
  @Schema(description = "Limits the bundle size for small tasks. E.g., bundle five 200KB files into one 1M task.")
  public String getMinTaskSize() {
    return minTaskSize;
  }

  public void setMinTaskSize(String minTaskSize) {
    this.minTaskSize = minTaskSize;
  }

  public SavedJobCollectionRun maxTaskSize(String maxTaskSize) {
    this.maxTaskSize = maxTaskSize;
    return this;
  }

   /**
   * Limits the bundle size for files above the Lower task bundle size. E.g., bundle five 2MB files into one 10MB task bundle. Files greater than this size will be assigned to individual tasks.
   * @return maxTaskSize
  **/
  @Schema(description = "Limits the bundle size for files above the Lower task bundle size. E.g., bundle five 2MB files into one 10MB task bundle. Files greater than this size will be assigned to individual tasks.")
  public String getMaxTaskSize() {
    return maxTaskSize;
  }

  public void setMaxTaskSize(String maxTaskSize) {
    this.maxTaskSize = maxTaskSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedJobCollectionRun savedJobCollectionRun = (SavedJobCollectionRun) o;
    return Objects.equals(this.rescheduleDroppedTasks, savedJobCollectionRun.rescheduleDroppedTasks) &&
        Objects.equals(this.maxTaskReschedule, savedJobCollectionRun.maxTaskReschedule) &&
        Objects.equals(this.logLevel, savedJobCollectionRun.logLevel) &&
        Objects.equals(this.jobTimeout, savedJobCollectionRun.jobTimeout) &&
        Objects.equals(this.mode, savedJobCollectionRun.mode) &&
        Objects.equals(this.timeRangeType, savedJobCollectionRun.timeRangeType) &&
        Objects.equals(this.earliest, savedJobCollectionRun.earliest) &&
        Objects.equals(this.latest, savedJobCollectionRun.latest) &&
        Objects.equals(this.expression, savedJobCollectionRun.expression) &&
        Objects.equals(this.minTaskSize, savedJobCollectionRun.minTaskSize) &&
        Objects.equals(this.maxTaskSize, savedJobCollectionRun.maxTaskSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rescheduleDroppedTasks, maxTaskReschedule, logLevel, jobTimeout, mode, timeRangeType, earliest, latest, expression, minTaskSize, maxTaskSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedJobCollectionRun {\n");
    
    sb.append("    rescheduleDroppedTasks: ").append(toIndentedString(rescheduleDroppedTasks)).append("\n");
    sb.append("    maxTaskReschedule: ").append(toIndentedString(maxTaskReschedule)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    jobTimeout: ").append(toIndentedString(jobTimeout)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    timeRangeType: ").append(toIndentedString(timeRangeType)).append("\n");
    sb.append("    earliest: ").append(toIndentedString(earliest)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    minTaskSize: ").append(toIndentedString(minTaskSize)).append("\n");
    sb.append("    maxTaskSize: ").append(toIndentedString(maxTaskSize)).append("\n");
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
