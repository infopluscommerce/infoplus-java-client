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
 * Work
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-18T10:42:48.989-05:00")
public class Work {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("sourceWarehouseId")
  private Integer sourceWarehouseId = null;

  @SerializedName("sourceBuildingId")
  private Integer sourceBuildingId = null;

  @SerializedName("sourceLocation")
  private String sourceLocation = null;

  @SerializedName("destinationWarehouseId")
  private Integer destinationWarehouseId = null;

  @SerializedName("destinationBuildingId")
  private Integer destinationBuildingId = null;

  @SerializedName("destinationLocation")
  private String destinationLocation = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("priorityCode")
  private Integer priorityCode = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("workBatchId")
  private Integer workBatchId = null;

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

  public Work sourceWarehouseId(Integer sourceWarehouseId) {
    this.sourceWarehouseId = sourceWarehouseId;
    return this;
  }

   /**
   * Get sourceWarehouseId
   * @return sourceWarehouseId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getSourceWarehouseId() {
    return sourceWarehouseId;
  }

  public void setSourceWarehouseId(Integer sourceWarehouseId) {
    this.sourceWarehouseId = sourceWarehouseId;
  }

  public Work sourceBuildingId(Integer sourceBuildingId) {
    this.sourceBuildingId = sourceBuildingId;
    return this;
  }

   /**
   * Get sourceBuildingId
   * @return sourceBuildingId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getSourceBuildingId() {
    return sourceBuildingId;
  }

  public void setSourceBuildingId(Integer sourceBuildingId) {
    this.sourceBuildingId = sourceBuildingId;
  }

  public Work sourceLocation(String sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }

   /**
   * Get sourceLocation
   * @return sourceLocation
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSourceLocation() {
    return sourceLocation;
  }

  public void setSourceLocation(String sourceLocation) {
    this.sourceLocation = sourceLocation;
  }

  public Work destinationWarehouseId(Integer destinationWarehouseId) {
    this.destinationWarehouseId = destinationWarehouseId;
    return this;
  }

   /**
   * Get destinationWarehouseId
   * @return destinationWarehouseId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getDestinationWarehouseId() {
    return destinationWarehouseId;
  }

  public void setDestinationWarehouseId(Integer destinationWarehouseId) {
    this.destinationWarehouseId = destinationWarehouseId;
  }

  public Work destinationBuildingId(Integer destinationBuildingId) {
    this.destinationBuildingId = destinationBuildingId;
    return this;
  }

   /**
   * Get destinationBuildingId
   * @return destinationBuildingId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getDestinationBuildingId() {
    return destinationBuildingId;
  }

  public void setDestinationBuildingId(Integer destinationBuildingId) {
    this.destinationBuildingId = destinationBuildingId;
  }

  public Work destinationLocation(String destinationLocation) {
    this.destinationLocation = destinationLocation;
    return this;
  }

   /**
   * Get destinationLocation
   * @return destinationLocation
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDestinationLocation() {
    return destinationLocation;
  }

  public void setDestinationLocation(String destinationLocation) {
    this.destinationLocation = destinationLocation;
  }

  public Work type(String type) {
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

  public Work priorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
    return this;
  }

   /**
   * Get priorityCode
   * @return priorityCode
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPriorityCode() {
    return priorityCode;
  }

  public void setPriorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
  }

  public Work status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Work userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(value = "")
  public Integer getLobId() {
    return lobId;
  }

  public Work workBatchId(Integer workBatchId) {
    this.workBatchId = workBatchId;
    return this;
  }

   /**
   * Get workBatchId
   * @return workBatchId
  **/
  @ApiModelProperty(value = "")
  public Integer getWorkBatchId() {
    return workBatchId;
  }

  public void setWorkBatchId(Integer workBatchId) {
    this.workBatchId = workBatchId;
  }

  public Work customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Work putCustomFieldsItem(String key, Object customFieldsItem) {
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
    Work work = (Work) o;
    return Objects.equals(this.id, work.id) &&
        Objects.equals(this.sourceWarehouseId, work.sourceWarehouseId) &&
        Objects.equals(this.sourceBuildingId, work.sourceBuildingId) &&
        Objects.equals(this.sourceLocation, work.sourceLocation) &&
        Objects.equals(this.destinationWarehouseId, work.destinationWarehouseId) &&
        Objects.equals(this.destinationBuildingId, work.destinationBuildingId) &&
        Objects.equals(this.destinationLocation, work.destinationLocation) &&
        Objects.equals(this.type, work.type) &&
        Objects.equals(this.createDate, work.createDate) &&
        Objects.equals(this.modifyDate, work.modifyDate) &&
        Objects.equals(this.priorityCode, work.priorityCode) &&
        Objects.equals(this.status, work.status) &&
        Objects.equals(this.userId, work.userId) &&
        Objects.equals(this.lobId, work.lobId) &&
        Objects.equals(this.workBatchId, work.workBatchId) &&
        Objects.equals(this.customFields, work.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sourceWarehouseId, sourceBuildingId, sourceLocation, destinationWarehouseId, destinationBuildingId, destinationLocation, type, createDate, modifyDate, priorityCode, status, userId, lobId, workBatchId, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Work {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceWarehouseId: ").append(toIndentedString(sourceWarehouseId)).append("\n");
    sb.append("    sourceBuildingId: ").append(toIndentedString(sourceBuildingId)).append("\n");
    sb.append("    sourceLocation: ").append(toIndentedString(sourceLocation)).append("\n");
    sb.append("    destinationWarehouseId: ").append(toIndentedString(destinationWarehouseId)).append("\n");
    sb.append("    destinationBuildingId: ").append(toIndentedString(destinationBuildingId)).append("\n");
    sb.append("    destinationLocation: ").append(toIndentedString(destinationLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    priorityCode: ").append(toIndentedString(priorityCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    workBatchId: ").append(toIndentedString(workBatchId)).append("\n");
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

