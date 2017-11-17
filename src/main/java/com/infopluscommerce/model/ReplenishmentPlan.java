package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class ReplenishmentPlan   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer warehouseId = null;
  private Integer pickFaceAssignmentSmartFilterId = null;
  private String name = null;
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
  public ReplenishmentPlan warehouseId(Integer warehouseId) {
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
  public ReplenishmentPlan pickFaceAssignmentSmartFilterId(Integer pickFaceAssignmentSmartFilterId) {
    this.pickFaceAssignmentSmartFilterId = pickFaceAssignmentSmartFilterId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("pickFaceAssignmentSmartFilterId")
  public Integer getPickFaceAssignmentSmartFilterId() {
    return pickFaceAssignmentSmartFilterId;
  }
  public void setPickFaceAssignmentSmartFilterId(Integer pickFaceAssignmentSmartFilterId) {
    this.pickFaceAssignmentSmartFilterId = pickFaceAssignmentSmartFilterId;
  }

  
  /**
   **/
  public ReplenishmentPlan name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public ReplenishmentPlan customFields(Map<String, Object> customFields) {
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

