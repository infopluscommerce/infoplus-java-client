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
 * PackingDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T13:20:03.871-05:00")
public class PackingDetail {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("orderId")
  private BigDecimal orderId = null;

  @SerializedName("palletId")
  private Integer palletId = null;

  @SerializedName("masterCartonId")
  private Integer masterCartonId = null;

  @SerializedName("cartonId")
  private Integer cartonId = null;

  @SerializedName("skuId")
  private Integer skuId = null;

  @SerializedName("itemReceiptId")
  private Integer itemReceiptId = null;

  @SerializedName("lineItemId")
  private Integer lineItemId = null;

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

  public PackingDetail lobId(Integer lobId) {
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

  public PackingDetail orderId(BigDecimal orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOrderId() {
    return orderId;
  }

  public void setOrderId(BigDecimal orderId) {
    this.orderId = orderId;
  }

  public PackingDetail palletId(Integer palletId) {
    this.palletId = palletId;
    return this;
  }

   /**
   * Get palletId
   * @return palletId
  **/
  @ApiModelProperty(value = "")
  public Integer getPalletId() {
    return palletId;
  }

  public void setPalletId(Integer palletId) {
    this.palletId = palletId;
  }

  public PackingDetail masterCartonId(Integer masterCartonId) {
    this.masterCartonId = masterCartonId;
    return this;
  }

   /**
   * Get masterCartonId
   * @return masterCartonId
  **/
  @ApiModelProperty(value = "")
  public Integer getMasterCartonId() {
    return masterCartonId;
  }

  public void setMasterCartonId(Integer masterCartonId) {
    this.masterCartonId = masterCartonId;
  }

  public PackingDetail cartonId(Integer cartonId) {
    this.cartonId = cartonId;
    return this;
  }

   /**
   * Get cartonId
   * @return cartonId
  **/
  @ApiModelProperty(value = "")
  public Integer getCartonId() {
    return cartonId;
  }

  public void setCartonId(Integer cartonId) {
    this.cartonId = cartonId;
  }

  public PackingDetail skuId(Integer skuId) {
    this.skuId = skuId;
    return this;
  }

   /**
   * Get skuId
   * @return skuId
  **/
  @ApiModelProperty(value = "")
  public Integer getSkuId() {
    return skuId;
  }

  public void setSkuId(Integer skuId) {
    this.skuId = skuId;
  }

  public PackingDetail itemReceiptId(Integer itemReceiptId) {
    this.itemReceiptId = itemReceiptId;
    return this;
  }

   /**
   * Get itemReceiptId
   * @return itemReceiptId
  **/
  @ApiModelProperty(value = "")
  public Integer getItemReceiptId() {
    return itemReceiptId;
  }

  public void setItemReceiptId(Integer itemReceiptId) {
    this.itemReceiptId = itemReceiptId;
  }

  public PackingDetail lineItemId(Integer lineItemId) {
    this.lineItemId = lineItemId;
    return this;
  }

   /**
   * Get lineItemId
   * @return lineItemId
  **/
  @ApiModelProperty(value = "")
  public Integer getLineItemId() {
    return lineItemId;
  }

  public void setLineItemId(Integer lineItemId) {
    this.lineItemId = lineItemId;
  }

  public PackingDetail quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public PackingDetail customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public PackingDetail putCustomFieldsItem(String key, Object customFieldsItem) {
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
    PackingDetail packingDetail = (PackingDetail) o;
    return Objects.equals(this.id, packingDetail.id) &&
        Objects.equals(this.createDate, packingDetail.createDate) &&
        Objects.equals(this.modifyDate, packingDetail.modifyDate) &&
        Objects.equals(this.lobId, packingDetail.lobId) &&
        Objects.equals(this.orderId, packingDetail.orderId) &&
        Objects.equals(this.palletId, packingDetail.palletId) &&
        Objects.equals(this.masterCartonId, packingDetail.masterCartonId) &&
        Objects.equals(this.cartonId, packingDetail.cartonId) &&
        Objects.equals(this.skuId, packingDetail.skuId) &&
        Objects.equals(this.itemReceiptId, packingDetail.itemReceiptId) &&
        Objects.equals(this.lineItemId, packingDetail.lineItemId) &&
        Objects.equals(this.quantity, packingDetail.quantity) &&
        Objects.equals(this.customFields, packingDetail.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, lobId, orderId, palletId, masterCartonId, cartonId, skuId, itemReceiptId, lineItemId, quantity, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackingDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    palletId: ").append(toIndentedString(palletId)).append("\n");
    sb.append("    masterCartonId: ").append(toIndentedString(masterCartonId)).append("\n");
    sb.append("    cartonId: ").append(toIndentedString(cartonId)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    itemReceiptId: ").append(toIndentedString(itemReceiptId)).append("\n");
    sb.append("    lineItemId: ").append(toIndentedString(lineItemId)).append("\n");
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

