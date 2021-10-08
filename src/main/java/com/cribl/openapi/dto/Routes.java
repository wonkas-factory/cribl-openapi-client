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
import com.cribl.openapi.dto.PipelineConfGroups;
import com.cribl.openapi.dto.RoutesRoute;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Routes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class Routes {
  @SerializedName("id")
  private String id = null;

  @SerializedName("routes")
  private List<RoutesRoute> routes = new ArrayList<>();

  @SerializedName("groups")
  private Map<String, PipelineConfGroups> groups = null;

  public Routes id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Routes ID
   * @return id
  **/
  @Schema(description = "Routes ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Routes routes(List<RoutesRoute> routes) {
    this.routes = routes;
    return this;
  }

  public Routes addRoutesItem(RoutesRoute routesItem) {
    this.routes.add(routesItem);
    return this;
  }

   /**
   * Pipeline routing rules
   * @return routes
  **/
  @Schema(required = true, description = "Pipeline routing rules")
  public List<RoutesRoute> getRoutes() {
    return routes;
  }

  public void setRoutes(List<RoutesRoute> routes) {
    this.routes = routes;
  }

  public Routes groups(Map<String, PipelineConfGroups> groups) {
    this.groups = groups;
    return this;
  }

  public Routes putGroupsItem(String key, PipelineConfGroups groupsItem) {
    if (this.groups == null) {
      this.groups = new HashMap<>();
    }
    this.groups.put(key, groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @Schema(description = "")
  public Map<String, PipelineConfGroups> getGroups() {
    return groups;
  }

  public void setGroups(Map<String, PipelineConfGroups> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Routes routes = (Routes) o;
    return Objects.equals(this.id, routes.id) &&
        Objects.equals(this.routes, routes.routes) &&
        Objects.equals(this.groups, routes.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, routes, groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Routes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
