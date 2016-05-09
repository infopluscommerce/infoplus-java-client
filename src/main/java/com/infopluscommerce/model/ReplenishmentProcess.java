package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class ReplenishmentProcess   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer warehouseId = null;
  private Integer replenishmentPlanId = null;
  private String status = null;
  private Integer estimatedWork = null;

  
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
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("replenishmentPlanId")
  public Integer getReplenishmentPlanId() {
    return replenishmentPlanId;
  }
  public void setReplenishmentPlanId(Integer replenishmentPlanId) {
    this.replenishmentPlanId = replenishmentPlanId;
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedWork")
  public Integer getEstimatedWork() {
    return estimatedWork;
  }
  public void setEstimatedWork(Integer estimatedWork) {
    this.estimatedWork = estimatedWork;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplenishmentProcess replenishmentProcess = (ReplenishmentProcess) o;
    return Objects.equals(id, replenishmentProcess.id) &&
        Objects.equals(createDate, replenishmentProcess.createDate) &&
        Objects.equals(modifyDate, replenishmentProcess.modifyDate) &&
        Objects.equals(warehouseId, replenishmentProcess.warehouseId) &&
        Objects.equals(replenishmentPlanId, replenishmentProcess.replenishmentPlanId) &&
        Objects.equals(status, replenishmentProcess.status) &&
        Objects.equals(estimatedWork, replenishmentProcess.estimatedWork);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

