package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
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
  private Integer cost = null;
  private Boolean allowItemMixing = false;
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
  public Location warehouseId(Integer warehouseId) {
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
  public Location buildingId(Integer buildingId) {
    this.buildingId = buildingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("buildingId")
  public Integer getBuildingId() {
    return buildingId;
  }
  public void setBuildingId(Integer buildingId) {
    this.buildingId = buildingId;
  }

  
  /**
   **/
  public Location zoneId(Integer zoneId) {
    this.zoneId = zoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("zoneId")
  public Integer getZoneId() {
    return zoneId;
  }
  public void setZoneId(Integer zoneId) {
    this.zoneId = zoneId;
  }

  
  /**
   **/
  public Location aisleId(Integer aisleId) {
    this.aisleId = aisleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("aisleId")
  public Integer getAisleId() {
    return aisleId;
  }
  public void setAisleId(Integer aisleId) {
    this.aisleId = aisleId;
  }

  
  /**
   **/
  public Location billingTypeId(Integer billingTypeId) {
    this.billingTypeId = billingTypeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("billingTypeId")
  public Integer getBillingTypeId() {
    return billingTypeId;
  }
  public void setBillingTypeId(Integer billingTypeId) {
    this.billingTypeId = billingTypeId;
  }

  
  /**
   **/
  public Location behaviorType(String behaviorType) {
    this.behaviorType = behaviorType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("behaviorType")
  public String getBehaviorType() {
    return behaviorType;
  }
  public void setBehaviorType(String behaviorType) {
    this.behaviorType = behaviorType;
  }

  
  /**
   **/
  public Location footprintId(Integer footprintId) {
    this.footprintId = footprintId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("footprintId")
  public Integer getFootprintId() {
    return footprintId;
  }
  public void setFootprintId(Integer footprintId) {
    this.footprintId = footprintId;
  }

  
  /**
   **/
  public Location addressSchemeId(Integer addressSchemeId) {
    this.addressSchemeId = addressSchemeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressSchemeId")
  public Integer getAddressSchemeId() {
    return addressSchemeId;
  }
  public void setAddressSchemeId(Integer addressSchemeId) {
    this.addressSchemeId = addressSchemeId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("origin")
  public Integer getOrigin() {
    return origin;
  }

  
  /**
   **/
  public Location address(String address) {
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
  public Location level(Integer level) {
    this.level = level;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("level")
  public Integer getLevel() {
    return level;
  }
  public void setLevel(Integer level) {
    this.level = level;
  }

  
  /**
   **/
  public Location bay(Integer bay) {
    this.bay = bay;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bay")
  public Integer getBay() {
    return bay;
  }
  public void setBay(Integer bay) {
    this.bay = bay;
  }

  
  /**
   **/
  public Location number(Integer number) {
    this.number = number;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }

  
  /**
   **/
  public Location online(Boolean online) {
    this.online = online;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("online")
  public Boolean getOnline() {
    return online;
  }
  public void setOnline(Boolean online) {
    this.online = online;
  }

  
  /**
   **/
  public Location priorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("priorityCode")
  public Integer getPriorityCode() {
    return priorityCode;
  }
  public void setPriorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
  }

  
  /**
   **/
  public Location cost(Integer cost) {
    this.cost = cost;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cost")
  public Integer getCost() {
    return cost;
  }
  public void setCost(Integer cost) {
    this.cost = cost;
  }

  
  /**
   **/
  public Location allowItemMixing(Boolean allowItemMixing) {
    this.allowItemMixing = allowItemMixing;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("allowItemMixing")
  public Boolean getAllowItemMixing() {
    return allowItemMixing;
  }
  public void setAllowItemMixing(Boolean allowItemMixing) {
    this.allowItemMixing = allowItemMixing;
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
  public Location customFields(Map<String, Object> customFields) {
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
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.warehouseId, location.warehouseId) &&
        Objects.equals(this.buildingId, location.buildingId) &&
        Objects.equals(this.zoneId, location.zoneId) &&
        Objects.equals(this.aisleId, location.aisleId) &&
        Objects.equals(this.billingTypeId, location.billingTypeId) &&
        Objects.equals(this.behaviorType, location.behaviorType) &&
        Objects.equals(this.footprintId, location.footprintId) &&
        Objects.equals(this.addressSchemeId, location.addressSchemeId) &&
        Objects.equals(this.origin, location.origin) &&
        Objects.equals(this.address, location.address) &&
        Objects.equals(this.level, location.level) &&
        Objects.equals(this.bay, location.bay) &&
        Objects.equals(this.number, location.number) &&
        Objects.equals(this.online, location.online) &&
        Objects.equals(this.priorityCode, location.priorityCode) &&
        Objects.equals(this.cost, location.cost) &&
        Objects.equals(this.allowItemMixing, location.allowItemMixing) &&
        Objects.equals(this.createDate, location.createDate) &&
        Objects.equals(this.modifyDate, location.modifyDate) &&
        Objects.equals(this.customFields, location.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, buildingId, zoneId, aisleId, billingTypeId, behaviorType, footprintId, addressSchemeId, origin, address, level, bay, number, online, priorityCode, cost, allowItemMixing, createDate, modifyDate, customFields);
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
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    allowItemMixing: ").append(toIndentedString(allowItemMixing)).append("\n");
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

