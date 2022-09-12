/*
 * Infoplus API
 * Infoplus API.
 *
 * OpenAPI spec version: beta
 * Contact: api@infopluscommerce.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infopluscommerce.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Supplement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T22:44:50.237-05:00")
public class Supplement {
  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("originalSKUId")
  private Integer originalSKUId = null;

  @SerializedName("supplementSKUId")
  private Integer supplementSKUId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("supplementQuantity")
  private BigDecimal supplementQuantity = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  public Supplement lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLobId() {
    return lobId;
  }

  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public Supplement createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public Supplement modifyDate(OffsetDateTime modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }

   /**
   * Get modifyDate
   * @return modifyDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(OffsetDateTime modifyDate) {
    this.modifyDate = modifyDate;
  }

  public Supplement originalSKUId(Integer originalSKUId) {
    this.originalSKUId = originalSKUId;
    return this;
  }

   /**
   * Get originalSKUId
   * @return originalSKUId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getOriginalSKUId() {
    return originalSKUId;
  }

  public void setOriginalSKUId(Integer originalSKUId) {
    this.originalSKUId = originalSKUId;
  }

  public Supplement supplementSKUId(Integer supplementSKUId) {
    this.supplementSKUId = supplementSKUId;
    return this;
  }

   /**
   * Get supplementSKUId
   * @return supplementSKUId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getSupplementSKUId() {
    return supplementSKUId;
  }

  public void setSupplementSKUId(Integer supplementSKUId) {
    this.supplementSKUId = supplementSKUId;
  }

  public Supplement type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Supplement supplementQuantity(BigDecimal supplementQuantity) {
    this.supplementQuantity = supplementQuantity;
    return this;
  }

   /**
   * Get supplementQuantity
   * @return supplementQuantity
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getSupplementQuantity() {
    return supplementQuantity;
  }

  public void setSupplementQuantity(BigDecimal supplementQuantity) {
    this.supplementQuantity = supplementQuantity;
  }

  public Supplement customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Supplement putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<String, Object>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Supplement supplement = (Supplement) o;
    return Objects.equals(this.lobId, supplement.lobId) &&
        Objects.equals(this.id, supplement.id) &&
        Objects.equals(this.createDate, supplement.createDate) &&
        Objects.equals(this.modifyDate, supplement.modifyDate) &&
        Objects.equals(this.originalSKUId, supplement.originalSKUId) &&
        Objects.equals(this.supplementSKUId, supplement.supplementSKUId) &&
        Objects.equals(this.type, supplement.type) &&
        Objects.equals(this.supplementQuantity, supplement.supplementQuantity) &&
        Objects.equals(this.customFields, supplement.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lobId, id, createDate, modifyDate, originalSKUId, supplementSKUId, type, supplementQuantity, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Supplement {\n");
    
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    originalSKUId: ").append(toIndentedString(originalSKUId)).append("\n");
    sb.append("    supplementSKUId: ").append(toIndentedString(supplementSKUId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    supplementQuantity: ").append(toIndentedString(supplementQuantity)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

