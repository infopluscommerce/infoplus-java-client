package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class Replenishment   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer replenishmentProcess = null;
  private Integer pickFaceAssignment = null;
  private Integer locationId = null;
  private Integer quantity = null;
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("replenishmentProcess")
  public Integer getReplenishmentProcess() {
    return replenishmentProcess;
  }
  public void setReplenishmentProcess(Integer replenishmentProcess) {
    this.replenishmentProcess = replenishmentProcess;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickFaceAssignment")
  public Integer getPickFaceAssignment() {
    return pickFaceAssignment;
  }
  public void setPickFaceAssignment(Integer pickFaceAssignment) {
    this.pickFaceAssignment = pickFaceAssignment;
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
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
    Replenishment replenishment = (Replenishment) o;
    return Objects.equals(id, replenishment.id) &&
        Objects.equals(createDate, replenishment.createDate) &&
        Objects.equals(modifyDate, replenishment.modifyDate) &&
        Objects.equals(replenishmentProcess, replenishment.replenishmentProcess) &&
        Objects.equals(pickFaceAssignment, replenishment.pickFaceAssignment) &&
        Objects.equals(locationId, replenishment.locationId) &&
        Objects.equals(quantity, replenishment.quantity) &&
        Objects.equals(sku, replenishment.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, replenishmentProcess, pickFaceAssignment, locationId, quantity, sku);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Replenishment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    replenishmentProcess: ").append(toIndentedString(replenishmentProcess)).append("\n");
    sb.append("    pickFaceAssignment: ").append(toIndentedString(pickFaceAssignment)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

