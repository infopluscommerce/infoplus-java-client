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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * ReplenishmentPlan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-21T23:57:39.841-06:00")
public class ReplenishmentPlan {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("pickFaceAssignmentSmartFilterId")
  private Integer pickFaceAssignmentSmartFilterId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

   /**
   * Get modifyDate
   * @return modifyDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifyDate() {
    return modifyDate;
  }

  public ReplenishmentPlan warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

   /**
   * Get warehouseId
   * @return warehouseId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  public ReplenishmentPlan pickFaceAssignmentSmartFilterId(Integer pickFaceAssignmentSmartFilterId) {
    this.pickFaceAssignmentSmartFilterId = pickFaceAssignmentSmartFilterId;
    return this;
  }

   /**
   * Get pickFaceAssignmentSmartFilterId
   * @return pickFaceAssignmentSmartFilterId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPickFaceAssignmentSmartFilterId() {
    return pickFaceAssignmentSmartFilterId;
  }

  public void setPickFaceAssignmentSmartFilterId(Integer pickFaceAssignmentSmartFilterId) {
    this.pickFaceAssignmentSmartFilterId = pickFaceAssignmentSmartFilterId;
  }

  public ReplenishmentPlan name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReplenishmentPlan customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ReplenishmentPlan putCustomFieldsItem(String key, Object customFieldsItem) {
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
    ReplenishmentPlan replenishmentPlan = (ReplenishmentPlan) o;
    return Objects.equals(this.id, replenishmentPlan.id) &&
        Objects.equals(this.createDate, replenishmentPlan.createDate) &&
        Objects.equals(this.modifyDate, replenishmentPlan.modifyDate) &&
        Objects.equals(this.warehouseId, replenishmentPlan.warehouseId) &&
        Objects.equals(this.pickFaceAssignmentSmartFilterId, replenishmentPlan.pickFaceAssignmentSmartFilterId) &&
        Objects.equals(this.name, replenishmentPlan.name) &&
        Objects.equals(this.customFields, replenishmentPlan.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, warehouseId, pickFaceAssignmentSmartFilterId, name, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplenishmentPlan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    pickFaceAssignmentSmartFilterId: ").append(toIndentedString(pickFaceAssignmentSmartFilterId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

