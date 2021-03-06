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
import com.cribl.openapi.dto.PartialEvalRewrite;
import com.cribl.openapi.dto.TraverseCallback;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * ExpressionOptions
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class ExpressionOptions {
  @SerializedName("allowInternal")
  private Boolean allowInternal = null;

  @SerializedName("args")
  private List<String> args = null;

  @SerializedName("astTraverseCallback")
  private TraverseCallback astTraverseCallback = null;

  @SerializedName("context")
  private String context = null;

  @SerializedName("disallowAssign")
  private Boolean disallowAssign = null;

  @SerializedName("insecure")
  private Boolean insecure = null;

  @SerializedName("maxNumOfAllowedIterations")
  private BigDecimal maxNumOfAllowedIterations = null;

  @SerializedName("partialEval")
  private PartialEvalRewrite partialEval = null;

  @SerializedName("replaceLiterals")
  private Boolean replaceLiterals = null;

  @SerializedName("unprotected")
  private Boolean unprotected = null;

  public ExpressionOptions allowInternal(Boolean allowInternal) {
    this.allowInternal = allowInternal;
    return this;
  }

   /**
   * Get allowInternal
   * @return allowInternal
  **/
  @Schema(description = "")
  public Boolean isAllowInternal() {
    return allowInternal;
  }

  public void setAllowInternal(Boolean allowInternal) {
    this.allowInternal = allowInternal;
  }

  public ExpressionOptions args(List<String> args) {
    this.args = args;
    return this;
  }

  public ExpressionOptions addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @Schema(description = "")
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public ExpressionOptions astTraverseCallback(TraverseCallback astTraverseCallback) {
    this.astTraverseCallback = astTraverseCallback;
    return this;
  }

   /**
   * Get astTraverseCallback
   * @return astTraverseCallback
  **/
  @Schema(description = "")
  public TraverseCallback getAstTraverseCallback() {
    return astTraverseCallback;
  }

  public void setAstTraverseCallback(TraverseCallback astTraverseCallback) {
    this.astTraverseCallback = astTraverseCallback;
  }

  public ExpressionOptions context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @Schema(description = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public ExpressionOptions disallowAssign(Boolean disallowAssign) {
    this.disallowAssign = disallowAssign;
    return this;
  }

   /**
   * Get disallowAssign
   * @return disallowAssign
  **/
  @Schema(description = "")
  public Boolean isDisallowAssign() {
    return disallowAssign;
  }

  public void setDisallowAssign(Boolean disallowAssign) {
    this.disallowAssign = disallowAssign;
  }

  public ExpressionOptions insecure(Boolean insecure) {
    this.insecure = insecure;
    return this;
  }

   /**
   * Get insecure
   * @return insecure
  **/
  @Schema(description = "")
  public Boolean isInsecure() {
    return insecure;
  }

  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }

  public ExpressionOptions maxNumOfAllowedIterations(BigDecimal maxNumOfAllowedIterations) {
    this.maxNumOfAllowedIterations = maxNumOfAllowedIterations;
    return this;
  }

   /**
   * Get maxNumOfAllowedIterations
   * @return maxNumOfAllowedIterations
  **/
  @Schema(description = "")
  public BigDecimal getMaxNumOfAllowedIterations() {
    return maxNumOfAllowedIterations;
  }

  public void setMaxNumOfAllowedIterations(BigDecimal maxNumOfAllowedIterations) {
    this.maxNumOfAllowedIterations = maxNumOfAllowedIterations;
  }

  public ExpressionOptions partialEval(PartialEvalRewrite partialEval) {
    this.partialEval = partialEval;
    return this;
  }

   /**
   * Get partialEval
   * @return partialEval
  **/
  @Schema(description = "")
  public PartialEvalRewrite getPartialEval() {
    return partialEval;
  }

  public void setPartialEval(PartialEvalRewrite partialEval) {
    this.partialEval = partialEval;
  }

  public ExpressionOptions replaceLiterals(Boolean replaceLiterals) {
    this.replaceLiterals = replaceLiterals;
    return this;
  }

   /**
   * Get replaceLiterals
   * @return replaceLiterals
  **/
  @Schema(description = "")
  public Boolean isReplaceLiterals() {
    return replaceLiterals;
  }

  public void setReplaceLiterals(Boolean replaceLiterals) {
    this.replaceLiterals = replaceLiterals;
  }

  public ExpressionOptions unprotected(Boolean unprotected) {
    this.unprotected = unprotected;
    return this;
  }

   /**
   * Get unprotected
   * @return unprotected
  **/
  @Schema(description = "")
  public Boolean isUnprotected() {
    return unprotected;
  }

  public void setUnprotected(Boolean unprotected) {
    this.unprotected = unprotected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpressionOptions expressionOptions = (ExpressionOptions) o;
    return Objects.equals(this.allowInternal, expressionOptions.allowInternal) &&
        Objects.equals(this.args, expressionOptions.args) &&
        Objects.equals(this.astTraverseCallback, expressionOptions.astTraverseCallback) &&
        Objects.equals(this.context, expressionOptions.context) &&
        Objects.equals(this.disallowAssign, expressionOptions.disallowAssign) &&
        Objects.equals(this.insecure, expressionOptions.insecure) &&
        Objects.equals(this.maxNumOfAllowedIterations, expressionOptions.maxNumOfAllowedIterations) &&
        Objects.equals(this.partialEval, expressionOptions.partialEval) &&
        Objects.equals(this.replaceLiterals, expressionOptions.replaceLiterals) &&
        Objects.equals(this.unprotected, expressionOptions.unprotected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowInternal, args, astTraverseCallback, context, disallowAssign, insecure, maxNumOfAllowedIterations, partialEval, replaceLiterals, unprotected);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressionOptions {\n");
    
    sb.append("    allowInternal: ").append(toIndentedString(allowInternal)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    astTraverseCallback: ").append(toIndentedString(astTraverseCallback)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    disallowAssign: ").append(toIndentedString(disallowAssign)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
    sb.append("    maxNumOfAllowedIterations: ").append(toIndentedString(maxNumOfAllowedIterations)).append("\n");
    sb.append("    partialEval: ").append(toIndentedString(partialEval)).append("\n");
    sb.append("    replaceLiterals: ").append(toIndentedString(replaceLiterals)).append("\n");
    sb.append("    unprotected: ").append(toIndentedString(unprotected)).append("\n");
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
