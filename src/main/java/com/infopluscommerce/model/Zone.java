package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class Zone   {
  
  private Integer id = null;
  private Integer warehouseId = null;
  private String name = null;
  private String address = null;
  private Boolean isClimateControlled = false;
  private Boolean isFoodGrade = false;
  private Boolean isSecure = false;
  private Boolean isFrozen = false;
  private Boolean isRefrigerated = false;
  private Date createDate = null;
  private Date modifyDate = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public Zone warehouseId(Integer warehouseId) {
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
  public Zone name(String name) {
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
  public Zone address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   **/
  public Zone isClimateControlled(Boolean isClimateControlled) {
    this.isClimateControlled = isClimateControlled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isClimateControlled")
  public Boolean getIsClimateControlled() {
    return isClimateControlled;
  }
  public void setIsClimateControlled(Boolean isClimateControlled) {
    this.isClimateControlled = isClimateControlled;
  }

  
  /**
   **/
  public Zone isFoodGrade(Boolean isFoodGrade) {
    this.isFoodGrade = isFoodGrade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isFoodGrade")
  public Boolean getIsFoodGrade() {
    return isFoodGrade;
  }
  public void setIsFoodGrade(Boolean isFoodGrade) {
    this.isFoodGrade = isFoodGrade;
  }

  
  /**
   **/
  public Zone isSecure(Boolean isSecure) {
    this.isSecure = isSecure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isSecure")
  public Boolean getIsSecure() {
    return isSecure;
  }
  public void setIsSecure(Boolean isSecure) {
    this.isSecure = isSecure;
  }

  
  /**
   **/
  public Zone isFrozen(Boolean isFrozen) {
    this.isFrozen = isFrozen;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isFrozen")
  public Boolean getIsFrozen() {
    return isFrozen;
  }
  public void setIsFrozen(Boolean isFrozen) {
    this.isFrozen = isFrozen;
  }

  
  /**
   **/
  public Zone isRefrigerated(Boolean isRefrigerated) {
    this.isRefrigerated = isRefrigerated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isRefrigerated")
  public Boolean getIsRefrigerated() {
    return isRefrigerated;
  }
  public void setIsRefrigerated(Boolean isRefrigerated) {
    this.isRefrigerated = isRefrigerated;
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
  public Zone customFields(Map<String, Object> customFields) {
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
    Zone zone = (Zone) o;
    return Objects.equals(this.id, zone.id) &&
        Objects.equals(this.warehouseId, zone.warehouseId) &&
        Objects.equals(this.name, zone.name) &&
        Objects.equals(this.address, zone.address) &&
        Objects.equals(this.isClimateControlled, zone.isClimateControlled) &&
        Objects.equals(this.isFoodGrade, zone.isFoodGrade) &&
        Objects.equals(this.isSecure, zone.isSecure) &&
        Objects.equals(this.isFrozen, zone.isFrozen) &&
        Objects.equals(this.isRefrigerated, zone.isRefrigerated) &&
        Objects.equals(this.createDate, zone.createDate) &&
        Objects.equals(this.modifyDate, zone.modifyDate) &&
        Objects.equals(this.customFields, zone.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, name, address, isClimateControlled, isFoodGrade, isSecure, isFrozen, isRefrigerated, createDate, modifyDate, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Zone {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    isClimateControlled: ").append(toIndentedString(isClimateControlled)).append("\n");
    sb.append("    isFoodGrade: ").append(toIndentedString(isFoodGrade)).append("\n");
    sb.append("    isSecure: ").append(toIndentedString(isSecure)).append("\n");
    sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
    sb.append("    isRefrigerated: ").append(toIndentedString(isRefrigerated)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
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

