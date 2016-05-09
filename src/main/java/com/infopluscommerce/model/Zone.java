package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isClimateControlled")
  public Boolean getIsClimateControlled() {
    return isClimateControlled;
  }
  public void setIsClimateControlled(Boolean isClimateControlled) {
    this.isClimateControlled = isClimateControlled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isFoodGrade")
  public Boolean getIsFoodGrade() {
    return isFoodGrade;
  }
  public void setIsFoodGrade(Boolean isFoodGrade) {
    this.isFoodGrade = isFoodGrade;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isSecure")
  public Boolean getIsSecure() {
    return isSecure;
  }
  public void setIsSecure(Boolean isSecure) {
    this.isSecure = isSecure;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isFrozen")
  public Boolean getIsFrozen() {
    return isFrozen;
  }
  public void setIsFrozen(Boolean isFrozen) {
    this.isFrozen = isFrozen;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isRefrigerated")
  public Boolean getIsRefrigerated() {
    return isRefrigerated;
  }
  public void setIsRefrigerated(Boolean isRefrigerated) {
    this.isRefrigerated = isRefrigerated;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Zone zone = (Zone) o;
    return Objects.equals(id, zone.id) &&
        Objects.equals(warehouseId, zone.warehouseId) &&
        Objects.equals(name, zone.name) &&
        Objects.equals(address, zone.address) &&
        Objects.equals(isClimateControlled, zone.isClimateControlled) &&
        Objects.equals(isFoodGrade, zone.isFoodGrade) &&
        Objects.equals(isSecure, zone.isSecure) &&
        Objects.equals(isFrozen, zone.isFrozen) &&
        Objects.equals(isRefrigerated, zone.isRefrigerated) &&
        Objects.equals(createDate, zone.createDate) &&
        Objects.equals(modifyDate, zone.modifyDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, name, address, isClimateControlled, isFoodGrade, isSecure, isFrozen, isRefrigerated, createDate, modifyDate);
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

