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
 * PackingPlanDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-05T12:20:58.280-06:00")
public class PackingPlanDetail {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("packingPlanId")
  private Integer packingPlanId = null;

  @SerializedName("palletNo")
  private Integer palletNo = null;

  @SerializedName("palletTypeId")
  private Integer palletTypeId = null;

  @SerializedName("masterCartonNo")
  private Integer masterCartonNo = null;

  @SerializedName("masterCartonTypeId")
  private Integer masterCartonTypeId = null;

  @SerializedName("cartonNo")
  private Integer cartonNo = null;

  @SerializedName("cartonTypeId")
  private Integer cartonTypeId = null;

  @SerializedName("cartonId")
  private Integer cartonId = null;

  @SerializedName("orderId")
  private BigDecimal orderId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("skuId")
  private Integer skuId = null;

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

  public PackingPlanDetail packingPlanId(Integer packingPlanId) {
    this.packingPlanId = packingPlanId;
    return this;
  }

   /**
   * Get packingPlanId
   * @return packingPlanId
  **/
  @ApiModelProperty(value = "")
  public Integer getPackingPlanId() {
    return packingPlanId;
  }

  public void setPackingPlanId(Integer packingPlanId) {
    this.packingPlanId = packingPlanId;
  }

  public PackingPlanDetail palletNo(Integer palletNo) {
    this.palletNo = palletNo;
    return this;
  }

   /**
   * Get palletNo
   * @return palletNo
  **/
  @ApiModelProperty(value = "")
  public Integer getPalletNo() {
    return palletNo;
  }

  public void setPalletNo(Integer palletNo) {
    this.palletNo = palletNo;
  }

  public PackingPlanDetail palletTypeId(Integer palletTypeId) {
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

  public PackingPlanDetail masterCartonNo(Integer masterCartonNo) {
    this.masterCartonNo = masterCartonNo;
    return this;
  }

   /**
   * Get masterCartonNo
   * @return masterCartonNo
  **/
  @ApiModelProperty(value = "")
  public Integer getMasterCartonNo() {
    return masterCartonNo;
  }

  public void setMasterCartonNo(Integer masterCartonNo) {
    this.masterCartonNo = masterCartonNo;
  }

  public PackingPlanDetail masterCartonTypeId(Integer masterCartonTypeId) {
    this.masterCartonTypeId = masterCartonTypeId;
    return this;
  }

   /**
   * Get masterCartonTypeId
   * @return masterCartonTypeId
  **/
  @ApiModelProperty(value = "")
  public Integer getMasterCartonTypeId() {
    return masterCartonTypeId;
  }

  public void setMasterCartonTypeId(Integer masterCartonTypeId) {
    this.masterCartonTypeId = masterCartonTypeId;
  }

  public PackingPlanDetail cartonNo(Integer cartonNo) {
    this.cartonNo = cartonNo;
    return this;
  }

   /**
   * Get cartonNo
   * @return cartonNo
  **/
  @ApiModelProperty(value = "")
  public Integer getCartonNo() {
    return cartonNo;
  }

  public void setCartonNo(Integer cartonNo) {
    this.cartonNo = cartonNo;
  }

  public PackingPlanDetail cartonTypeId(Integer cartonTypeId) {
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

  public PackingPlanDetail cartonId(Integer cartonId) {
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

  public PackingPlanDetail orderId(BigDecimal orderId) {
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

  public PackingPlanDetail lobId(Integer lobId) {
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

  public PackingPlanDetail skuId(Integer skuId) {
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

  public PackingPlanDetail lineItemId(Integer lineItemId) {
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

  public PackingPlanDetail quantity(Integer quantity) {
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

  public PackingPlanDetail customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public PackingPlanDetail putCustomFieldsItem(String key, Object customFieldsItem) {
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
    PackingPlanDetail packingPlanDetail = (PackingPlanDetail) o;
    return Objects.equals(this.id, packingPlanDetail.id) &&
        Objects.equals(this.createDate, packingPlanDetail.createDate) &&
        Objects.equals(this.modifyDate, packingPlanDetail.modifyDate) &&
        Objects.equals(this.packingPlanId, packingPlanDetail.packingPlanId) &&
        Objects.equals(this.palletNo, packingPlanDetail.palletNo) &&
        Objects.equals(this.palletTypeId, packingPlanDetail.palletTypeId) &&
        Objects.equals(this.masterCartonNo, packingPlanDetail.masterCartonNo) &&
        Objects.equals(this.masterCartonTypeId, packingPlanDetail.masterCartonTypeId) &&
        Objects.equals(this.cartonNo, packingPlanDetail.cartonNo) &&
        Objects.equals(this.cartonTypeId, packingPlanDetail.cartonTypeId) &&
        Objects.equals(this.cartonId, packingPlanDetail.cartonId) &&
        Objects.equals(this.orderId, packingPlanDetail.orderId) &&
        Objects.equals(this.lobId, packingPlanDetail.lobId) &&
        Objects.equals(this.skuId, packingPlanDetail.skuId) &&
        Objects.equals(this.lineItemId, packingPlanDetail.lineItemId) &&
        Objects.equals(this.quantity, packingPlanDetail.quantity) &&
        Objects.equals(this.customFields, packingPlanDetail.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, packingPlanId, palletNo, palletTypeId, masterCartonNo, masterCartonTypeId, cartonNo, cartonTypeId, cartonId, orderId, lobId, skuId, lineItemId, quantity, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackingPlanDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    packingPlanId: ").append(toIndentedString(packingPlanId)).append("\n");
    sb.append("    palletNo: ").append(toIndentedString(palletNo)).append("\n");
    sb.append("    palletTypeId: ").append(toIndentedString(palletTypeId)).append("\n");
    sb.append("    masterCartonNo: ").append(toIndentedString(masterCartonNo)).append("\n");
    sb.append("    masterCartonTypeId: ").append(toIndentedString(masterCartonTypeId)).append("\n");
    sb.append("    cartonNo: ").append(toIndentedString(cartonNo)).append("\n");
    sb.append("    cartonTypeId: ").append(toIndentedString(cartonTypeId)).append("\n");
    sb.append("    cartonId: ").append(toIndentedString(cartonId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
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

