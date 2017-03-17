package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class Work   {
  
  private Integer id = null;
  private Integer sourceWarehouseId = null;
  private Integer sourceBuildingId = null;
  private String sourceLocation = null;
  private Integer destinationWarehouseId = null;
  private Integer destinationBuildingId = null;
  private String destinationLocation = null;
  private String type = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer priorityCode = null;
  private String status = null;
  private Integer userId = null;
  private Integer lobId = null;
  private Integer workBatchId = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public Work sourceWarehouseId(Integer sourceWarehouseId) {
    this.sourceWarehouseId = sourceWarehouseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceWarehouseId")
  public Integer getSourceWarehouseId() {
    return sourceWarehouseId;
  }
  public void setSourceWarehouseId(Integer sourceWarehouseId) {
    this.sourceWarehouseId = sourceWarehouseId;
  }

  
  /**
   **/
  public Work sourceBuildingId(Integer sourceBuildingId) {
    this.sourceBuildingId = sourceBuildingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceBuildingId")
  public Integer getSourceBuildingId() {
    return sourceBuildingId;
  }
  public void setSourceBuildingId(Integer sourceBuildingId) {
    this.sourceBuildingId = sourceBuildingId;
  }

  
  /**
   **/
  public Work sourceLocation(String sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceLocation")
  public String getSourceLocation() {
    return sourceLocation;
  }
  public void setSourceLocation(String sourceLocation) {
    this.sourceLocation = sourceLocation;
  }

  
  /**
   **/
  public Work destinationWarehouseId(Integer destinationWarehouseId) {
    this.destinationWarehouseId = destinationWarehouseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationWarehouseId")
  public Integer getDestinationWarehouseId() {
    return destinationWarehouseId;
  }
  public void setDestinationWarehouseId(Integer destinationWarehouseId) {
    this.destinationWarehouseId = destinationWarehouseId;
  }

  
  /**
   **/
  public Work destinationBuildingId(Integer destinationBuildingId) {
    this.destinationBuildingId = destinationBuildingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationBuildingId")
  public Integer getDestinationBuildingId() {
    return destinationBuildingId;
  }
  public void setDestinationBuildingId(Integer destinationBuildingId) {
    this.destinationBuildingId = destinationBuildingId;
  }

  
  /**
   **/
  public Work destinationLocation(String destinationLocation) {
    this.destinationLocation = destinationLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationLocation")
  public String getDestinationLocation() {
    return destinationLocation;
  }
  public void setDestinationLocation(String destinationLocation) {
    this.destinationLocation = destinationLocation;
  }

  
  /**
   **/
  public Work type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }

  
  /**
   **/
  public Work priorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("priorityCode")
  public Integer getPriorityCode() {
    return priorityCode;
  }
  public void setPriorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
  }

  
  /**
   **/
  public Work status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  public Work userId(Integer userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }

  
  /**
   **/
  public Work workBatchId(Integer workBatchId) {
    this.workBatchId = workBatchId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workBatchId")
  public Integer getWorkBatchId() {
    return workBatchId;
  }
  public void setWorkBatchId(Integer workBatchId) {
    this.workBatchId = workBatchId;
  }

  
  /**
   **/
  public Work customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customFields")
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

