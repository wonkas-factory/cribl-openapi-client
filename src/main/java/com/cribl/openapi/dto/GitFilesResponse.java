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
import com.cribl.openapi.dto.GitFile;
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
 * GitFilesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class GitFilesResponse {
  @SerializedName("commitMessage")
  private Map<String, Object> commitMessage = null;

  @SerializedName("count")
  private BigDecimal count = null;

  @SerializedName("items")
  private List<GitFile> items = null;

  public GitFilesResponse commitMessage(Map<String, Object> commitMessage) {
    this.commitMessage = commitMessage;
    return this;
  }

  public GitFilesResponse putCommitMessageItem(String key, Object commitMessageItem) {
    if (this.commitMessage == null) {
      this.commitMessage = new HashMap<>();
    }
    this.commitMessage.put(key, commitMessageItem);
    return this;
  }

   /**
   * Get commitMessage
   * @return commitMessage
  **/
  @Schema(description = "")
  public Map<String, Object> getCommitMessage() {
    return commitMessage;
  }

  public void setCommitMessage(Map<String, Object> commitMessage) {
    this.commitMessage = commitMessage;
  }

  public GitFilesResponse count(BigDecimal count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(description = "")
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }

  public GitFilesResponse items(List<GitFile> items) {
    this.items = items;
    return this;
  }

  public GitFilesResponse addItemsItem(GitFile itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<GitFile> getItems() {
    return items;
  }

  public void setItems(List<GitFile> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitFilesResponse gitFilesResponse = (GitFilesResponse) o;
    return Objects.equals(this.commitMessage, gitFilesResponse.commitMessage) &&
        Objects.equals(this.count, gitFilesResponse.count) &&
        Objects.equals(this.items, gitFilesResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitMessage, count, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitFilesResponse {\n");
    
    sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
