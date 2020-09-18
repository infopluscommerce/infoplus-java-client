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
 * WorkBatch
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T13:20:03.871-05:00")
public class WorkBatch {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("batchPriorityCode")
  private Integer batchPriorityCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("assignedUserId")
  private Integer assignedUserId = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

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
   * Get warehouseId
   * @return warehouseId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getWarehouseId() {
    return warehouseId;
  }

  public WorkBatch batchPriorityCode(Integer batchPriorityCode) {
    this.batchPriorityCode = batchPriorityCode;
    return this;
  }

   /**
   * Get batchPriorityCode
   * @return batchPriorityCode
  **/
  @ApiModelProperty(value = "")
  public Integer getBatchPriorityCode() {
    return batchPriorityCode;
  }

  public void setBatchPriorityCode(Integer batchPriorityCode) {
    this.batchPriorityCode = batchPriorityCode;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public WorkBatch assignedUserId(Integer assignedUserId) {
    this.assignedUserId = assignedUserId;
    return this;
  }

   /**
   * Get assignedUserId
   * @return assignedUserId
  **/
  @ApiModelProperty(value = "")
  public Integer getAssignedUserId() {
    return assignedUserId;
  }

  public void setAssignedUserId(Integer assignedUserId) {
    this.assignedUserId = assignedUserId;
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

  public WorkBatch customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public WorkBatch putCustomFieldsItem(String key, Object customFieldsItem) {
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
    WorkBatch workBatch = (WorkBatch) o;
    return Objects.equals(this.id, workBatch.id) &&
        Objects.equals(this.warehouseId, workBatch.warehouseId) &&
        Objects.equals(this.batchPriorityCode, workBatch.batchPriorityCode) &&
        Objects.equals(this.description, workBatch.description) &&
        Objects.equals(this.assignedUserId, workBatch.assignedUserId) &&
        Objects.equals(this.createDate, workBatch.createDate) &&
        Objects.equals(this.modifyDate, workBatch.modifyDate) &&
        Objects.equals(this.customFields, workBatch.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, batchPriorityCode, description, assignedUserId, createDate, modifyDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkBatch {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    batchPriorityCode: ").append(toIndentedString(batchPriorityCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    assignedUserId: ").append(toIndentedString(assignedUserId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
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

