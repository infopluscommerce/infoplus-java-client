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
import com.infopluscommerce.model.WorkProduct;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Work
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-02T22:06:08.200-06:00")
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

  @SerializedName("userDefinedMessage")
  private String userDefinedMessage = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("workBatchId")
  private Integer workBatchId = null;

  @SerializedName("workProductList")
  private List<WorkProduct> workProductList = null;

  @SerializedName("fulfillmentProcessId")
  private Integer fulfillmentProcessId = null;

  @SerializedName("pickLineId")
  private Integer pickLineId = null;

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
   * Get sourceWarehouseId
   * @return sourceWarehouseId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getSourceWarehouseId() {
    return sourceWarehouseId;
  }

   /**
   * Get sourceBuildingId
   * @return sourceBuildingId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getSourceBuildingId() {
    return sourceBuildingId;
  }

   /**
   * Get sourceLocation
   * @return sourceLocation
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSourceLocation() {
    return sourceLocation;
  }

   /**
   * Get destinationWarehouseId
   * @return destinationWarehouseId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getDestinationWarehouseId() {
    return destinationWarehouseId;
  }

   /**
   * Get destinationBuildingId
   * @return destinationBuildingId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getDestinationBuildingId() {
    return destinationBuildingId;
  }

   /**
   * Get destinationLocation
   * @return destinationLocation
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDestinationLocation() {
    return destinationLocation;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
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

   /**
   * Get priorityCode
   * @return priorityCode
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPriorityCode() {
    return priorityCode;
  }

  public Work userDefinedMessage(String userDefinedMessage) {
    this.userDefinedMessage = userDefinedMessage;
    return this;
  }

   /**
   * Get userDefinedMessage
   * @return userDefinedMessage
  **/
  @ApiModelProperty(value = "")
  public String getUserDefinedMessage() {
    return userDefinedMessage;
  }

  public void setUserDefinedMessage(String userDefinedMessage) {
    this.userDefinedMessage = userDefinedMessage;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getUserId() {
    return userId;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(value = "")
  public Integer getLobId() {
    return lobId;
  }

   /**
   * Get workBatchId
   * @return workBatchId
  **/
  @ApiModelProperty(value = "")
  public Integer getWorkBatchId() {
    return workBatchId;
  }

  public Work workProductList(List<WorkProduct> workProductList) {
    this.workProductList = workProductList;
    return this;
  }

  public Work addWorkProductListItem(WorkProduct workProductListItem) {
    if (this.workProductList == null) {
      this.workProductList = new ArrayList<WorkProduct>();
    }
    this.workProductList.add(workProductListItem);
    return this;
  }

   /**
   * Get workProductList
   * @return workProductList
  **/
  @ApiModelProperty(value = "")
  public List<WorkProduct> getWorkProductList() {
    return workProductList;
  }

  public void setWorkProductList(List<WorkProduct> workProductList) {
    this.workProductList = workProductList;
  }

   /**
   * Get fulfillmentProcessId
   * @return fulfillmentProcessId
  **/
  @ApiModelProperty(value = "")
  public Integer getFulfillmentProcessId() {
    return fulfillmentProcessId;
  }

   /**
   * Get pickLineId
   * @return pickLineId
  **/
  @ApiModelProperty(value = "")
  public Integer getPickLineId() {
    return pickLineId;
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
        Objects.equals(this.userDefinedMessage, work.userDefinedMessage) &&
        Objects.equals(this.status, work.status) &&
        Objects.equals(this.userId, work.userId) &&
        Objects.equals(this.lobId, work.lobId) &&
        Objects.equals(this.workBatchId, work.workBatchId) &&
        Objects.equals(this.workProductList, work.workProductList) &&
        Objects.equals(this.fulfillmentProcessId, work.fulfillmentProcessId) &&
        Objects.equals(this.pickLineId, work.pickLineId) &&
        Objects.equals(this.customFields, work.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sourceWarehouseId, sourceBuildingId, sourceLocation, destinationWarehouseId, destinationBuildingId, destinationLocation, type, createDate, modifyDate, priorityCode, userDefinedMessage, status, userId, lobId, workBatchId, workProductList, fulfillmentProcessId, pickLineId, customFields);
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
    sb.append("    userDefinedMessage: ").append(toIndentedString(userDefinedMessage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    workBatchId: ").append(toIndentedString(workBatchId)).append("\n");
    sb.append("    workProductList: ").append(toIndentedString(workProductList)).append("\n");
    sb.append("    fulfillmentProcessId: ").append(toIndentedString(fulfillmentProcessId)).append("\n");
    sb.append("    pickLineId: ").append(toIndentedString(pickLineId)).append("\n");
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

