package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
  private Integer workBatchId = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sourceWarehouseId")
  public Integer getSourceWarehouseId() {
    return sourceWarehouseId;
  }
  public void setSourceWarehouseId(Integer sourceWarehouseId) {
    this.sourceWarehouseId = sourceWarehouseId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sourceBuildingId")
  public Integer getSourceBuildingId() {
    return sourceBuildingId;
  }
  public void setSourceBuildingId(Integer sourceBuildingId) {
    this.sourceBuildingId = sourceBuildingId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sourceLocation")
  public String getSourceLocation() {
    return sourceLocation;
  }
  public void setSourceLocation(String sourceLocation) {
    this.sourceLocation = sourceLocation;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("destinationWarehouseId")
  public Integer getDestinationWarehouseId() {
    return destinationWarehouseId;
  }
  public void setDestinationWarehouseId(Integer destinationWarehouseId) {
    this.destinationWarehouseId = destinationWarehouseId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("destinationBuildingId")
  public Integer getDestinationBuildingId() {
    return destinationBuildingId;
  }
  public void setDestinationBuildingId(Integer destinationBuildingId) {
    this.destinationBuildingId = destinationBuildingId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("destinationLocation")
  public String getDestinationLocation() {
    return destinationLocation;
  }
  public void setDestinationLocation(String destinationLocation) {
    this.destinationLocation = destinationLocation;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }
  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("priorityCode")
  public Integer getPriorityCode() {
    return priorityCode;
  }
  public void setPriorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("workBatchId")
  public Integer getWorkBatchId() {
    return workBatchId;
  }
  public void setWorkBatchId(Integer workBatchId) {
    this.workBatchId = workBatchId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Work work = (Work) o;
    return Objects.equals(id, work.id) &&
        Objects.equals(sourceWarehouseId, work.sourceWarehouseId) &&
        Objects.equals(sourceBuildingId, work.sourceBuildingId) &&
        Objects.equals(sourceLocation, work.sourceLocation) &&
        Objects.equals(destinationWarehouseId, work.destinationWarehouseId) &&
        Objects.equals(destinationBuildingId, work.destinationBuildingId) &&
        Objects.equals(destinationLocation, work.destinationLocation) &&
        Objects.equals(type, work.type) &&
        Objects.equals(createDate, work.createDate) &&
        Objects.equals(modifyDate, work.modifyDate) &&
        Objects.equals(priorityCode, work.priorityCode) &&
        Objects.equals(status, work.status) &&
        Objects.equals(userId, work.userId) &&
        Objects.equals(workBatchId, work.workBatchId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sourceWarehouseId, sourceBuildingId, sourceLocation, destinationWarehouseId, destinationBuildingId, destinationLocation, type, createDate, modifyDate, priorityCode, status, userId, workBatchId);
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
    sb.append("    workBatchId: ").append(toIndentedString(workBatchId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

