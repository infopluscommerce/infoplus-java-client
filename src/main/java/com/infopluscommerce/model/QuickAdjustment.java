package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class QuickAdjustment   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer warehouseId = null;
  private Integer locationId = null;
  private String adjustmentCode = null;
  private Integer totalQuantity = null;
  private String message = null;
  private String status = null;
  private String sku = null;

  
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
  @JsonProperty("locationId")
  public Integer getLocationId() {
    return locationId;
  }
  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("adjustmentCode")
  public String getAdjustmentCode() {
    return adjustmentCode;
  }
  public void setAdjustmentCode(String adjustmentCode) {
    this.adjustmentCode = adjustmentCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("totalQuantity")
  public Integer getTotalQuantity() {
    return totalQuantity;
  }
  public void setTotalQuantity(Integer totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
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
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuickAdjustment quickAdjustment = (QuickAdjustment) o;
    return Objects.equals(id, quickAdjustment.id) &&
        Objects.equals(createDate, quickAdjustment.createDate) &&
        Objects.equals(modifyDate, quickAdjustment.modifyDate) &&
        Objects.equals(warehouseId, quickAdjustment.warehouseId) &&
        Objects.equals(locationId, quickAdjustment.locationId) &&
        Objects.equals(adjustmentCode, quickAdjustment.adjustmentCode) &&
        Objects.equals(totalQuantity, quickAdjustment.totalQuantity) &&
        Objects.equals(message, quickAdjustment.message) &&
        Objects.equals(status, quickAdjustment.status) &&
        Objects.equals(sku, quickAdjustment.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, warehouseId, locationId, adjustmentCode, totalQuantity, message, status, sku);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuickAdjustment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    adjustmentCode: ").append(toIndentedString(adjustmentCode)).append("\n");
    sb.append("    totalQuantity: ").append(toIndentedString(totalQuantity)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

