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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * InventoryAdjustment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-19T12:05:52.234-06:00")
public class InventoryAdjustment {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("poNoId")
  private Integer poNoId = null;

  @SerializedName("adjustmentDate")
  private OffsetDateTime adjustmentDate = null;

  @SerializedName("adjustmentTime")
  private String adjustmentTime = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("qty")
  private Integer qty = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("authorizedBy")
  private String authorizedBy = null;

  @SerializedName("printed")
  private String printed = null;

  @SerializedName("orderNo")
  private BigDecimal orderNo = null;

  @SerializedName("adjustmentCode")
  private String adjustmentCode = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  public InventoryAdjustment id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InventoryAdjustment lobId(Integer lobId) {
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

  public InventoryAdjustment sku(String sku) {
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

  public InventoryAdjustment poNoId(Integer poNoId) {
    this.poNoId = poNoId;
    return this;
  }

   /**
   * Get poNoId
   * @return poNoId
  **/
  @ApiModelProperty(value = "")
  public Integer getPoNoId() {
    return poNoId;
  }

  public void setPoNoId(Integer poNoId) {
    this.poNoId = poNoId;
  }

  public InventoryAdjustment adjustmentDate(OffsetDateTime adjustmentDate) {
    this.adjustmentDate = adjustmentDate;
    return this;
  }

   /**
   * Get adjustmentDate
   * @return adjustmentDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAdjustmentDate() {
    return adjustmentDate;
  }

  public void setAdjustmentDate(OffsetDateTime adjustmentDate) {
    this.adjustmentDate = adjustmentDate;
  }

  public InventoryAdjustment adjustmentTime(String adjustmentTime) {
    this.adjustmentTime = adjustmentTime;
    return this;
  }

   /**
   * Get adjustmentTime
   * @return adjustmentTime
  **/
  @ApiModelProperty(value = "")
  public String getAdjustmentTime() {
    return adjustmentTime;
  }

  public void setAdjustmentTime(String adjustmentTime) {
    this.adjustmentTime = adjustmentTime;
  }

  public InventoryAdjustment location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public InventoryAdjustment qty(Integer qty) {
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @ApiModelProperty(value = "")
  public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

  public InventoryAdjustment note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public InventoryAdjustment authorizedBy(String authorizedBy) {
    this.authorizedBy = authorizedBy;
    return this;
  }

   /**
   * Get authorizedBy
   * @return authorizedBy
  **/
  @ApiModelProperty(value = "")
  public String getAuthorizedBy() {
    return authorizedBy;
  }

  public void setAuthorizedBy(String authorizedBy) {
    this.authorizedBy = authorizedBy;
  }

  public InventoryAdjustment printed(String printed) {
    this.printed = printed;
    return this;
  }

   /**
   * Get printed
   * @return printed
  **/
  @ApiModelProperty(value = "")
  public String getPrinted() {
    return printed;
  }

  public void setPrinted(String printed) {
    this.printed = printed;
  }

  public InventoryAdjustment orderNo(BigDecimal orderNo) {
    this.orderNo = orderNo;
    return this;
  }

   /**
   * Get orderNo
   * @return orderNo
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(BigDecimal orderNo) {
    this.orderNo = orderNo;
  }

  public InventoryAdjustment adjustmentCode(String adjustmentCode) {
    this.adjustmentCode = adjustmentCode;
    return this;
  }

   /**
   * Get adjustmentCode
   * @return adjustmentCode
  **/
  @ApiModelProperty(value = "")
  public String getAdjustmentCode() {
    return adjustmentCode;
  }

  public void setAdjustmentCode(String adjustmentCode) {
    this.adjustmentCode = adjustmentCode;
  }

  public InventoryAdjustment customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public InventoryAdjustment putCustomFieldsItem(String key, Object customFieldsItem) {
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
    InventoryAdjustment inventoryAdjustment = (InventoryAdjustment) o;
    return Objects.equals(this.id, inventoryAdjustment.id) &&
        Objects.equals(this.lobId, inventoryAdjustment.lobId) &&
        Objects.equals(this.sku, inventoryAdjustment.sku) &&
        Objects.equals(this.poNoId, inventoryAdjustment.poNoId) &&
        Objects.equals(this.adjustmentDate, inventoryAdjustment.adjustmentDate) &&
        Objects.equals(this.adjustmentTime, inventoryAdjustment.adjustmentTime) &&
        Objects.equals(this.location, inventoryAdjustment.location) &&
        Objects.equals(this.qty, inventoryAdjustment.qty) &&
        Objects.equals(this.note, inventoryAdjustment.note) &&
        Objects.equals(this.authorizedBy, inventoryAdjustment.authorizedBy) &&
        Objects.equals(this.printed, inventoryAdjustment.printed) &&
        Objects.equals(this.orderNo, inventoryAdjustment.orderNo) &&
        Objects.equals(this.adjustmentCode, inventoryAdjustment.adjustmentCode) &&
        Objects.equals(this.customFields, inventoryAdjustment.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lobId, sku, poNoId, adjustmentDate, adjustmentTime, location, qty, note, authorizedBy, printed, orderNo, adjustmentCode, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryAdjustment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    poNoId: ").append(toIndentedString(poNoId)).append("\n");
    sb.append("    adjustmentDate: ").append(toIndentedString(adjustmentDate)).append("\n");
    sb.append("    adjustmentTime: ").append(toIndentedString(adjustmentTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    authorizedBy: ").append(toIndentedString(authorizedBy)).append("\n");
    sb.append("    printed: ").append(toIndentedString(printed)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    adjustmentCode: ").append(toIndentedString(adjustmentCode)).append("\n");
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

