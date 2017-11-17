package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
public class Replenishment   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer replenishmentProcess = null;
  private Integer pickFaceAssignment = null;
  private Integer locationId = null;
  private Integer quantity = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();
  private String sku = null;

  
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("replenishmentProcess")
  public Integer getReplenishmentProcess() {
    return replenishmentProcess;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pickFaceAssignment")
  public Integer getPickFaceAssignment() {
    return pickFaceAssignment;
  }

  
  /**
   **/
  public Replenishment locationId(Integer locationId) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  
  /**
   **/
  public Replenishment customFields(Map<String, Object> customFields) {
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

  
  /**
   **/
  public Replenishment sku(String sku) {
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
    Replenishment replenishment = (Replenishment) o;
    return Objects.equals(this.id, replenishment.id) &&
        Objects.equals(this.createDate, replenishment.createDate) &&
        Objects.equals(this.modifyDate, replenishment.modifyDate) &&
        Objects.equals(this.replenishmentProcess, replenishment.replenishmentProcess) &&
        Objects.equals(this.pickFaceAssignment, replenishment.pickFaceAssignment) &&
        Objects.equals(this.locationId, replenishment.locationId) &&
        Objects.equals(this.quantity, replenishment.quantity) &&
        Objects.equals(this.customFields, replenishment.customFields) &&
        Objects.equals(this.sku, replenishment.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, replenishmentProcess, pickFaceAssignment, locationId, quantity, customFields, sku);
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
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

