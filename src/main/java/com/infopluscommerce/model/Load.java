/*
 * Infoplus API
 * Infoplus API.
 *
 * OpenAPI spec version: beta
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Load
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-16T13:04:33.234-06:00")
public class Load {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("lpn")
  private String lpn = null;

  @SerializedName("behaviorType")
  private String behaviorType = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("locationId")
  private Integer locationId = null;

  @SerializedName("parentLoadId")
  private Integer parentLoadId = null;

  @SerializedName("palletTypeId")
  private Integer palletTypeId = null;

  @SerializedName("cartonTypeId")
  private Integer cartonTypeId = null;

  @SerializedName("orderNoList")
  private List<BigDecimal> orderNoList = null;

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

  public Load lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(value = "")
  public Integer getLobId() {
    return lobId;
  }

  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  public Load lpn(String lpn) {
    this.lpn = lpn;
    return this;
  }

   /**
   * Get lpn
   * @return lpn
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLpn() {
    return lpn;
  }

  public void setLpn(String lpn) {
    this.lpn = lpn;
  }

  public Load behaviorType(String behaviorType) {
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

  public Load warehouseId(Integer warehouseId) {
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

  public Load locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @ApiModelProperty(value = "")
  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  public Load parentLoadId(Integer parentLoadId) {
    this.parentLoadId = parentLoadId;
    return this;
  }

   /**
   * Get parentLoadId
   * @return parentLoadId
  **/
  @ApiModelProperty(value = "")
  public Integer getParentLoadId() {
    return parentLoadId;
  }

  public void setParentLoadId(Integer parentLoadId) {
    this.parentLoadId = parentLoadId;
  }

  public Load palletTypeId(Integer palletTypeId) {
    this.palletTypeId = palletTypeId;
    return this;
  }

   /**
   * Get palletTypeId
   * @return palletTypeId
  **/
  @ApiModelProperty(value = "")
  public Integer getPalletTypeId() {
    return palletTypeId;
  }

  public void setPalletTypeId(Integer palletTypeId) {
    this.palletTypeId = palletTypeId;
  }

  public Load cartonTypeId(Integer cartonTypeId) {
    this.cartonTypeId = cartonTypeId;
    return this;
  }

   /**
   * Get cartonTypeId
   * @return cartonTypeId
  **/
  @ApiModelProperty(value = "")
  public Integer getCartonTypeId() {
    return cartonTypeId;
  }

  public void setCartonTypeId(Integer cartonTypeId) {
    this.cartonTypeId = cartonTypeId;
  }

  public Load orderNoList(List<BigDecimal> orderNoList) {
    this.orderNoList = orderNoList;
    return this;
  }

  public Load addOrderNoListItem(BigDecimal orderNoListItem) {
    if (this.orderNoList == null) {
      this.orderNoList = new ArrayList<BigDecimal>();
    }
    this.orderNoList.add(orderNoListItem);
    return this;
  }

   /**
   * Get orderNoList
   * @return orderNoList
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getOrderNoList() {
    return orderNoList;
  }

  public void setOrderNoList(List<BigDecimal> orderNoList) {
    this.orderNoList = orderNoList;
  }

  public Load customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Load putCustomFieldsItem(String key, Object customFieldsItem) {
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
    Load load = (Load) o;
    return Objects.equals(this.id, load.id) &&
        Objects.equals(this.createDate, load.createDate) &&
        Objects.equals(this.modifyDate, load.modifyDate) &&
        Objects.equals(this.lobId, load.lobId) &&
        Objects.equals(this.lpn, load.lpn) &&
        Objects.equals(this.behaviorType, load.behaviorType) &&
        Objects.equals(this.warehouseId, load.warehouseId) &&
        Objects.equals(this.locationId, load.locationId) &&
        Objects.equals(this.parentLoadId, load.parentLoadId) &&
        Objects.equals(this.palletTypeId, load.palletTypeId) &&
        Objects.equals(this.cartonTypeId, load.cartonTypeId) &&
        Objects.equals(this.orderNoList, load.orderNoList) &&
        Objects.equals(this.customFields, load.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, lobId, lpn, behaviorType, warehouseId, locationId, parentLoadId, palletTypeId, cartonTypeId, orderNoList, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Load {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    lpn: ").append(toIndentedString(lpn)).append("\n");
    sb.append("    behaviorType: ").append(toIndentedString(behaviorType)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    parentLoadId: ").append(toIndentedString(parentLoadId)).append("\n");
    sb.append("    palletTypeId: ").append(toIndentedString(palletTypeId)).append("\n");
    sb.append("    cartonTypeId: ").append(toIndentedString(cartonTypeId)).append("\n");
    sb.append("    orderNoList: ").append(toIndentedString(orderNoList)).append("\n");
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

