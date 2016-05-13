package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T15:40:30.367-05:00")
public class PickFaceAssignment   {
  
  private Integer id = null;
  private Integer warehouseId = null;
  private Integer locationId = null;
  private Integer replenishmentPoint = null;
  private Integer maxQuantity = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String sku = null;

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public PickFaceAssignment warehouseId(Integer warehouseId) {
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
  public PickFaceAssignment locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("locationId")
  public Integer getLocationId() {
    return locationId;
  }
  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  
  /**
   **/
  public PickFaceAssignment replenishmentPoint(Integer replenishmentPoint) {
    this.replenishmentPoint = replenishmentPoint;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("replenishmentPoint")
  public Integer getReplenishmentPoint() {
    return replenishmentPoint;
  }
  public void setReplenishmentPoint(Integer replenishmentPoint) {
    this.replenishmentPoint = replenishmentPoint;
  }

  
  /**
   **/
  public PickFaceAssignment maxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("maxQuantity")
  public Integer getMaxQuantity() {
    return maxQuantity;
  }
  public void setMaxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
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
  public PickFaceAssignment sku(String sku) {
    this.sku = sku;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PickFaceAssignment pickFaceAssignment = (PickFaceAssignment) o;
    return Objects.equals(this.id, pickFaceAssignment.id) &&
        Objects.equals(this.warehouseId, pickFaceAssignment.warehouseId) &&
        Objects.equals(this.locationId, pickFaceAssignment.locationId) &&
        Objects.equals(this.replenishmentPoint, pickFaceAssignment.replenishmentPoint) &&
        Objects.equals(this.maxQuantity, pickFaceAssignment.maxQuantity) &&
        Objects.equals(this.createDate, pickFaceAssignment.createDate) &&
        Objects.equals(this.modifyDate, pickFaceAssignment.modifyDate) &&
        Objects.equals(this.sku, pickFaceAssignment.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, locationId, replenishmentPoint, maxQuantity, createDate, modifyDate, sku);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PickFaceAssignment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    replenishmentPoint: ").append(toIndentedString(replenishmentPoint)).append("\n");
    sb.append("    maxQuantity: ").append(toIndentedString(maxQuantity)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

