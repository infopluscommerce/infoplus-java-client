/*
 * Infoplus API
 * Infoplus API.
 *
 * OpenAPI spec version: v3.0
 * Contact: api@infopluscommerce.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infopluscommerce.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Location
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-10T19:19:49.972-05:00")
public class Location {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("buildingId")
  private Integer buildingId = null;

  @SerializedName("zoneId")
  private Integer zoneId = null;

  @SerializedName("aisleId")
  private Integer aisleId = null;

  @SerializedName("billingTypeId")
  private Integer billingTypeId = null;

  @SerializedName("behaviorType")
  private String behaviorType = null;

  @SerializedName("footprintId")
  private Integer footprintId = null;

  @SerializedName("addressSchemeId")
  private Integer addressSchemeId = null;

  @SerializedName("origin")
  private Integer origin = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("level")
  private Integer level = null;

  @SerializedName("bay")
  private Integer bay = null;

  @SerializedName("number")
  private Integer number = null;

  @SerializedName("online")
  private Boolean online = false;

  @SerializedName("priorityCode")
  private Integer priorityCode = null;

  @SerializedName("cost")
  private Integer cost = null;

  @SerializedName("allowItemMixing")
  private Boolean allowItemMixing = false;

  @SerializedName("contentMixingRule")
  private String contentMixingRule = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public Location warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

   /**
   * Get warehouseId
   * @return warehouseId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  public Location buildingId(Integer buildingId) {
    this.buildingId = buildingId;
    return this;
  }

   /**
   * Get buildingId
   * @return buildingId
  **/
  @ApiModelProperty(value = "")
  public Integer getBuildingId() {
    return buildingId;
  }

  public void setBuildingId(Integer buildingId) {
    this.buildingId = buildingId;
  }

  public Location zoneId(Integer zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @ApiModelProperty(value = "")
  public Integer getZoneId() {
    return zoneId;
  }

  public void setZoneId(Integer zoneId) {
    this.zoneId = zoneId;
  }

  public Location aisleId(Integer aisleId) {
    this.aisleId = aisleId;
    return this;
  }

   /**
   * Get aisleId
   * @return aisleId
  **/
  @ApiModelProperty(value = "")
  public Integer getAisleId() {
    return aisleId;
  }

  public void setAisleId(Integer aisleId) {
    this.aisleId = aisleId;
  }

  public Location billingTypeId(Integer billingTypeId) {
    this.billingTypeId = billingTypeId;
    return this;
  }

   /**
   * Get billingTypeId
   * @return billingTypeId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getBillingTypeId() {
    return billingTypeId;
  }

  public void setBillingTypeId(Integer billingTypeId) {
    this.billingTypeId = billingTypeId;
  }

  public Location behaviorType(String behaviorType) {
    this.behaviorType = behaviorType;
    return this;
  }

   /**
   * Get behaviorType
   * @return behaviorType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBehaviorType() {
    return behaviorType;
  }

  public void setBehaviorType(String behaviorType) {
    this.behaviorType = behaviorType;
  }

  public Location footprintId(Integer footprintId) {
    this.footprintId = footprintId;
    return this;
  }

   /**
   * Get footprintId
   * @return footprintId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getFootprintId() {
    return footprintId;
  }

  public void setFootprintId(Integer footprintId) {
    this.footprintId = footprintId;
  }

  public Location addressSchemeId(Integer addressSchemeId) {
    this.addressSchemeId = addressSchemeId;
    return this;
  }

   /**
   * Get addressSchemeId
   * @return addressSchemeId
  **/
  @ApiModelProperty(value = "")
  public Integer getAddressSchemeId() {
    return addressSchemeId;
  }

  public void setAddressSchemeId(Integer addressSchemeId) {
    this.addressSchemeId = addressSchemeId;
  }

   /**
   * Get origin
   * @return origin
  **/
  @ApiModelProperty(value = "")
  public Integer getOrigin() {
    return origin;
  }

  public Location address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Location level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public Location bay(Integer bay) {
    this.bay = bay;
    return this;
  }

   /**
   * Get bay
   * @return bay
  **/
  @ApiModelProperty(value = "")
  public Integer getBay() {
    return bay;
  }

  public void setBay(Integer bay) {
    this.bay = bay;
  }

  public Location number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public Location online(Boolean online) {
    this.online = online;
    return this;
  }

   /**
   * Get online
   * @return online
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isOnline() {
    return online;
  }

  public void setOnline(Boolean online) {
    this.online = online;
  }

  public Location priorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
    return this;
  }

   /**
   * Get priorityCode
   * @return priorityCode
  **/
  @ApiModelProperty(value = "")
  public Integer getPriorityCode() {
    return priorityCode;
  }

  public void setPriorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
  }

  public Location cost(Integer cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(value = "")
  public Integer getCost() {
    return cost;
  }

  public void setCost(Integer cost) {
    this.cost = cost;
  }

  public Location allowItemMixing(Boolean allowItemMixing) {
    this.allowItemMixing = allowItemMixing;
    return this;
  }

   /**
   * Get allowItemMixing
   * @return allowItemMixing
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isAllowItemMixing() {
    return allowItemMixing;
  }

  public void setAllowItemMixing(Boolean allowItemMixing) {
    this.allowItemMixing = allowItemMixing;
  }

  public Location contentMixingRule(String contentMixingRule) {
    this.contentMixingRule = contentMixingRule;
    return this;
  }

   /**
   * Get contentMixingRule
   * @return contentMixingRule
  **/
  @ApiModelProperty(value = "")
  public String getContentMixingRule() {
    return contentMixingRule;
  }

  public void setContentMixingRule(String contentMixingRule) {
    this.contentMixingRule = contentMixingRule;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

   /**
   * Get modifyDate
   * @return modifyDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifyDate() {
    return modifyDate;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public Location customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Location putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<String, Object>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
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
        Objects.equals(this.contentMixingRule, location.contentMixingRule) &&
        Objects.equals(this.createDate, location.createDate) &&
        Objects.equals(this.modifyDate, location.modifyDate) &&
        Objects.equals(this.quantity, location.quantity) &&
        Objects.equals(this.customFields, location.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, buildingId, zoneId, aisleId, billingTypeId, behaviorType, footprintId, addressSchemeId, origin, address, level, bay, number, online, priorityCode, cost, allowItemMixing, contentMixingRule, createDate, modifyDate, quantity, customFields);
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
    sb.append("    contentMixingRule: ").append(toIndentedString(contentMixingRule)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

