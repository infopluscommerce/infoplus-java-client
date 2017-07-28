package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class ReplenishmentProcess   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer warehouseId = null;
  private Integer replenishmentPlanId = null;
  private String status = null;
  private Integer estimatedWork = null;
  private Integer workBatchId = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
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
  public ReplenishmentProcess warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  
  /**
   **/
  public ReplenishmentProcess replenishmentPlanId(Integer replenishmentPlanId) {
    this.replenishmentPlanId = replenishmentPlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("replenishmentPlanId")
  public Integer getReplenishmentPlanId() {
    return replenishmentPlanId;
  }
  public void setReplenishmentPlanId(Integer replenishmentPlanId) {
    this.replenishmentPlanId = replenishmentPlanId;
  }

  
  /**
   **/
  public ReplenishmentProcess status(String status) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("estimatedWork")
  public Integer getEstimatedWork() {
    return estimatedWork;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workBatchId")
  public Integer getWorkBatchId() {
    return workBatchId;
  }

  
  /**
   **/
  public ReplenishmentProcess customFields(Map<String, Object> customFields) {
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
    ReplenishmentProcess replenishmentProcess = (ReplenishmentProcess) o;
    return Objects.equals(this.id, replenishmentProcess.id) &&
        Objects.equals(this.createDate, replenishmentProcess.createDate) &&
        Objects.equals(this.modifyDate, replenishmentProcess.modifyDate) &&
        Objects.equals(this.warehouseId, replenishmentProcess.warehouseId) &&
        Objects.equals(this.replenishmentPlanId, replenishmentProcess.replenishmentPlanId) &&
        Objects.equals(this.status, replenishmentProcess.status) &&
        Objects.equals(this.estimatedWork, replenishmentProcess.estimatedWork) &&
        Objects.equals(this.workBatchId, replenishmentProcess.workBatchId) &&
        Objects.equals(this.customFields, replenishmentProcess.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, warehouseId, replenishmentPlanId, status, estimatedWork, workBatchId, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplenishmentProcess {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    replenishmentPlanId: ").append(toIndentedString(replenishmentPlanId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    estimatedWork: ").append(toIndentedString(estimatedWork)).append("\n");
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

