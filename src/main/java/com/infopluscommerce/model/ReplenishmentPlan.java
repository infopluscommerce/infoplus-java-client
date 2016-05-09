package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class ReplenishmentPlan   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer warehouseId = null;
  private Integer pickFaceAssignmentSmartFilterId = null;
  private String name = null;

  
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
  @JsonProperty("pickFaceAssignmentSmartFilterId")
  public Integer getPickFaceAssignmentSmartFilterId() {
    return pickFaceAssignmentSmartFilterId;
  }
  public void setPickFaceAssignmentSmartFilterId(Integer pickFaceAssignmentSmartFilterId) {
    this.pickFaceAssignmentSmartFilterId = pickFaceAssignmentSmartFilterId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplenishmentPlan replenishmentPlan = (ReplenishmentPlan) o;
    return Objects.equals(id, replenishmentPlan.id) &&
        Objects.equals(createDate, replenishmentPlan.createDate) &&
        Objects.equals(modifyDate, replenishmentPlan.modifyDate) &&
        Objects.equals(warehouseId, replenishmentPlan.warehouseId) &&
        Objects.equals(pickFaceAssignmentSmartFilterId, replenishmentPlan.pickFaceAssignmentSmartFilterId) &&
        Objects.equals(name, replenishmentPlan.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, warehouseId, pickFaceAssignmentSmartFilterId, name);
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

