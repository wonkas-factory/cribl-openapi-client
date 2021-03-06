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
 * KeyMetadataEntity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-08T00:23:34.796-04:00[America/New_York]")
public class KeyMetadataEntity {
  @SerializedName("keyId")
  private String keyId = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Gets or Sets algorithm
   */
  @JsonAdapter(AlgorithmEnum.Adapter.class)
  public enum AlgorithmEnum {
    AES_256_CBC("aes-256-cbc");

    private String value;

    AlgorithmEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AlgorithmEnum fromValue(String text) {
      for (AlgorithmEnum b : AlgorithmEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AlgorithmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlgorithmEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlgorithmEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AlgorithmEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("algorithm")
  private AlgorithmEnum algorithm = AlgorithmEnum.AES_256_CBC;

  /**
   * Gets or Sets kms
   */
  @JsonAdapter(KmsEnum.Adapter.class)
  public enum KmsEnum {
    LOCAL("local");

    private String value;

    KmsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static KmsEnum fromValue(String text) {
      for (KmsEnum b : KmsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<KmsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KmsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KmsEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return KmsEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("kms")
  private KmsEnum kms = KmsEnum.LOCAL;

  @SerializedName("keyclass")
  private BigDecimal keyclass = new BigDecimal(0);

  @SerializedName("created")
  private BigDecimal created = null;

  @SerializedName("expires")
  private BigDecimal expires = null;

  @SerializedName("plainKey")
  private String plainKey = null;

  @SerializedName("cipherKey")
  private String cipherKey = null;

  public KeyMetadataEntity keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * Get keyId
   * @return keyId
  **/
  @Schema(required = true, description = "")
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public KeyMetadataEntity description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public KeyMetadataEntity algorithm(AlgorithmEnum algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * Get algorithm
   * @return algorithm
  **/
  @Schema(required = true, description = "")
  public AlgorithmEnum getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(AlgorithmEnum algorithm) {
    this.algorithm = algorithm;
  }

  public KeyMetadataEntity kms(KmsEnum kms) {
    this.kms = kms;
    return this;
  }

   /**
   * Get kms
   * @return kms
  **/
  @Schema(required = true, description = "")
  public KmsEnum getKms() {
    return kms;
  }

  public void setKms(KmsEnum kms) {
    this.kms = kms;
  }

  public KeyMetadataEntity keyclass(BigDecimal keyclass) {
    this.keyclass = keyclass;
    return this;
  }

   /**
   * Get keyclass
   * minimum: 0
   * @return keyclass
  **/
  @Schema(required = true, description = "")
  public BigDecimal getKeyclass() {
    return keyclass;
  }

  public void setKeyclass(BigDecimal keyclass) {
    this.keyclass = keyclass;
  }

  public KeyMetadataEntity created(BigDecimal created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(description = "")
  public BigDecimal getCreated() {
    return created;
  }

  public void setCreated(BigDecimal created) {
    this.created = created;
  }

  public KeyMetadataEntity expires(BigDecimal expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @Schema(description = "")
  public BigDecimal getExpires() {
    return expires;
  }

  public void setExpires(BigDecimal expires) {
    this.expires = expires;
  }

  public KeyMetadataEntity plainKey(String plainKey) {
    this.plainKey = plainKey;
    return this;
  }

   /**
   * Get plainKey
   * @return plainKey
  **/
  @Schema(description = "")
  public String getPlainKey() {
    return plainKey;
  }

  public void setPlainKey(String plainKey) {
    this.plainKey = plainKey;
  }

  public KeyMetadataEntity cipherKey(String cipherKey) {
    this.cipherKey = cipherKey;
    return this;
  }

   /**
   * Get cipherKey
   * @return cipherKey
  **/
  @Schema(description = "")
  public String getCipherKey() {
    return cipherKey;
  }

  public void setCipherKey(String cipherKey) {
    this.cipherKey = cipherKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyMetadataEntity keyMetadataEntity = (KeyMetadataEntity) o;
    return Objects.equals(this.keyId, keyMetadataEntity.keyId) &&
        Objects.equals(this.description, keyMetadataEntity.description) &&
        Objects.equals(this.algorithm, keyMetadataEntity.algorithm) &&
        Objects.equals(this.kms, keyMetadataEntity.kms) &&
        Objects.equals(this.keyclass, keyMetadataEntity.keyclass) &&
        Objects.equals(this.created, keyMetadataEntity.created) &&
        Objects.equals(this.expires, keyMetadataEntity.expires) &&
        Objects.equals(this.plainKey, keyMetadataEntity.plainKey) &&
        Objects.equals(this.cipherKey, keyMetadataEntity.cipherKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyId, description, algorithm, kms, keyclass, created, expires, plainKey, cipherKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyMetadataEntity {\n");
    
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    kms: ").append(toIndentedString(kms)).append("\n");
    sb.append("    keyclass: ").append(toIndentedString(keyclass)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    plainKey: ").append(toIndentedString(plainKey)).append("\n");
    sb.append("    cipherKey: ").append(toIndentedString(cipherKey)).append("\n");
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
