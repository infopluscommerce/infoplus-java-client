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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * QuickAdjustment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-18T12:17:58.676-06:00")
public class QuickAdjustment {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("locationId")
  private Integer locationId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("adjustmentCode")
  private String adjustmentCode = null;

  @SerializedName("totalQuantity")
  private Integer totalQuantity = null;

  @SerializedName("changeQuantity")
  private Integer changeQuantity = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("productIdTag")
  private String productIdTag = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  @SerializedName("sku")
  private String sku = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public QuickAdjustment warehouseId(Integer warehouseId) {
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

  public QuickAdjustment locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  public QuickAdjustment lobId(Integer lobId) {
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

  public QuickAdjustment adjustmentCode(String adjustmentCode) {
    this.adjustmentCode = adjustmentCode;
    return this;
  }

   /**
   * Get adjustmentCode
   * @return adjustmentCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAdjustmentCode() {
    return adjustmentCode;
  }

  public void setAdjustmentCode(String adjustmentCode) {
    this.adjustmentCode = adjustmentCode;
  }

  public QuickAdjustment totalQuantity(Integer totalQuantity) {
    this.totalQuantity = totalQuantity;
    return this;
  }

   /**
   * Get totalQuantity
   * @return totalQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalQuantity() {
    return totalQuantity;
  }

  public void setTotalQuantity(Integer totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  public QuickAdjustment changeQuantity(Integer changeQuantity) {
    this.changeQuantity = changeQuantity;
    return this;
  }

   /**
   * Get changeQuantity
   * @return changeQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getChangeQuantity() {
    return changeQuantity;
  }

  public void setChangeQuantity(Integer changeQuantity) {
    this.changeQuantity = changeQuantity;
  }

  public QuickAdjustment message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public QuickAdjustment productIdTag(String productIdTag) {
    this.productIdTag = productIdTag;
    return this;
  }

   /**
   * Get productIdTag
   * @return productIdTag
  **/
  @ApiModelProperty(value = "")
  public String getProductIdTag() {
    return productIdTag;
  }

  public void setProductIdTag(String productIdTag) {
    this.productIdTag = productIdTag;
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

  public QuickAdjustment customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public QuickAdjustment putCustomFieldsItem(String key, Object customFieldsItem) {
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

  public QuickAdjustment sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(value = "")
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
    QuickAdjustment quickAdjustment = (QuickAdjustment) o;
    return Objects.equals(this.id, quickAdjustment.id) &&
        Objects.equals(this.warehouseId, quickAdjustment.warehouseId) &&
        Objects.equals(this.locationId, quickAdjustment.locationId) &&
        Objects.equals(this.lobId, quickAdjustment.lobId) &&
        Objects.equals(this.adjustmentCode, quickAdjustment.adjustmentCode) &&
        Objects.equals(this.totalQuantity, quickAdjustment.totalQuantity) &&
        Objects.equals(this.changeQuantity, quickAdjustment.changeQuantity) &&
        Objects.equals(this.message, quickAdjustment.message) &&
        Objects.equals(this.status, quickAdjustment.status) &&
        Objects.equals(this.productIdTag, quickAdjustment.productIdTag) &&
        Objects.equals(this.createDate, quickAdjustment.createDate) &&
        Objects.equals(this.modifyDate, quickAdjustment.modifyDate) &&
        Objects.equals(this.customFields, quickAdjustment.customFields) &&
        Objects.equals(this.sku, quickAdjustment.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, locationId, lobId, adjustmentCode, totalQuantity, changeQuantity, message, status, productIdTag, createDate, modifyDate, customFields, sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuickAdjustment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    adjustmentCode: ").append(toIndentedString(adjustmentCode)).append("\n");
    sb.append("    totalQuantity: ").append(toIndentedString(totalQuantity)).append("\n");
    sb.append("    changeQuantity: ").append(toIndentedString(changeQuantity)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    productIdTag: ").append(toIndentedString(productIdTag)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
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

