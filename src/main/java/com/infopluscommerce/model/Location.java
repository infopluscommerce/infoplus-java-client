package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class Location   {
  
  private Integer id = null;
  private Integer warehouseId = null;
  private Integer buildingId = null;
  private Integer zoneId = null;
  private Integer aisleId = null;
  private Integer billingTypeId = null;
  private String behaviorType = null;
  private Integer footprintId = null;
  private Integer addressSchemeId = null;
  private Integer origin = null;
  private String address = null;
  private Integer level = null;
  private Integer bay = null;
  private Integer number = null;
  private Boolean online = false;
  private Integer priorityCode = null;
  private Boolean allowItemMixing = false;
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("buildingId")
  public Integer getBuildingId() {
    return buildingId;
  }
  public void setBuildingId(Integer buildingId) {
    this.buildingId = buildingId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("zoneId")
  public Integer getZoneId() {
    return zoneId;
  }
  public void setZoneId(Integer zoneId) {
    this.zoneId = zoneId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("aisleId")
  public Integer getAisleId() {
    return aisleId;
  }
  public void setAisleId(Integer aisleId) {
    this.aisleId = aisleId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("billingTypeId")
  public Integer getBillingTypeId() {
    return billingTypeId;
  }
  public void setBillingTypeId(Integer billingTypeId) {
    this.billingTypeId = billingTypeId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("behaviorType")
  public String getBehaviorType() {
    return behaviorType;
  }
  public void setBehaviorType(String behaviorType) {
    this.behaviorType = behaviorType;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("footprintId")
  public Integer getFootprintId() {
    return footprintId;
  }
  public void setFootprintId(Integer footprintId) {
    this.footprintId = footprintId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("addressSchemeId")
  public Integer getAddressSchemeId() {
    return addressSchemeId;
  }
  public void setAddressSchemeId(Integer addressSchemeId) {
    this.addressSchemeId = addressSchemeId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("origin")
  public Integer getOrigin() {
    return origin;
  }
  public void setOrigin(Integer origin) {
    this.origin = origin;
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
  @JsonProperty("level")
  public Integer getLevel() {
    return level;
  }
  public void setLevel(Integer level) {
    this.level = level;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bay")
  public Integer getBay() {
    return bay;
  }
  public void setBay(Integer bay) {
    this.bay = bay;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("online")
  public Boolean getOnline() {
    return online;
  }
  public void setOnline(Boolean online) {
    this.online = online;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("priorityCode")
  public Integer getPriorityCode() {
    return priorityCode;
  }
  public void setPriorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("allowItemMixing")
  public Boolean getAllowItemMixing() {
    return allowItemMixing;
  }
  public void setAllowItemMixing(Boolean allowItemMixing) {
    this.allowItemMixing = allowItemMixing;
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
    Location location = (Location) o;
    return Objects.equals(id, location.id) &&
        Objects.equals(warehouseId, location.warehouseId) &&
        Objects.equals(buildingId, location.buildingId) &&
        Objects.equals(zoneId, location.zoneId) &&
        Objects.equals(aisleId, location.aisleId) &&
        Objects.equals(billingTypeId, location.billingTypeId) &&
        Objects.equals(behaviorType, location.behaviorType) &&
        Objects.equals(footprintId, location.footprintId) &&
        Objects.equals(addressSchemeId, location.addressSchemeId) &&
        Objects.equals(origin, location.origin) &&
        Objects.equals(address, location.address) &&
        Objects.equals(level, location.level) &&
        Objects.equals(bay, location.bay) &&
        Objects.equals(number, location.number) &&
        Objects.equals(online, location.online) &&
        Objects.equals(priorityCode, location.priorityCode) &&
        Objects.equals(allowItemMixing, location.allowItemMixing) &&
        Objects.equals(createDate, location.createDate) &&
        Objects.equals(modifyDate, location.modifyDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, buildingId, zoneId, aisleId, billingTypeId, behaviorType, footprintId, addressSchemeId, origin, address, level, bay, number, online, priorityCode, allowItemMixing, createDate, modifyDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    buildingId: ").append(toIndentedString(buildingId)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    aisleId: ").append(toIndentedString(aisleId)).append("\n");
    sb.append("    billingTypeId: ").append(toIndentedString(billingTypeId)).append("\n");
    sb.append("    behaviorType: ").append(toIndentedString(behaviorType)).append("\n");
    sb.append("    footprintId: ").append(toIndentedString(footprintId)).append("\n");
    sb.append("    addressSchemeId: ").append(toIndentedString(addressSchemeId)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    bay: ").append(toIndentedString(bay)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    priorityCode: ").append(toIndentedString(priorityCode)).append("\n");
    sb.append("    allowItemMixing: ").append(toIndentedString(allowItemMixing)).append("\n");
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

