package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T15:40:30.367-05:00")
public class ReplenishmentProcess   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer warehouseId = null;
  private Integer replenishmentPlanId = null;
  private String status = null;
  private Integer estimatedWork = null;

  
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
        Objects.equals(this.estimatedWork, replenishmentProcess.estimatedWork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, warehouseId, replenishmentPlanId, status, estimatedWork);
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

