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
 * InventoryDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T22:44:50.237-05:00")
public class InventoryDetail {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("warehouseLocationId")
  private Integer warehouseLocationId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("outstandingPickQuantity")
  private Integer outstandingPickQuantity = null;

  @SerializedName("distributionDate")
  private OffsetDateTime distributionDate = null;

  @SerializedName("expirationDate")
  private OffsetDateTime expirationDate = null;

  @SerializedName("quantityPerInnerPack")
  private Integer quantityPerInnerPack = null;

  @SerializedName("quantityPerCase")
  private Integer quantityPerCase = null;

  @SerializedName("quantityPerPallet")
  private Integer quantityPerPallet = null;

  @SerializedName("estimatedInnerPacks")
  private Integer estimatedInnerPacks = null;

  @SerializedName("estimatedCases")
  private Integer estimatedCases = null;

  @SerializedName("estimatedPallets")
  private Integer estimatedPallets = null;

  @SerializedName("unitsPerWrap")
  private Integer unitsPerWrap = null;

  @SerializedName("revisionDate")
  private String revisionDate = null;

  @SerializedName("productionLot")
  private String productionLot = null;

  @SerializedName("oldestReceiptDate")
  private OffsetDateTime oldestReceiptDate = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("poNo")
  private String poNo = null;

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

  public InventoryDetail warehouseLocationId(Integer warehouseLocationId) {
    this.warehouseLocationId = warehouseLocationId;
    return this;
  }

   /**
   * Get warehouseLocationId
   * @return warehouseLocationId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getWarehouseLocationId() {
    return warehouseLocationId;
  }

  public void setWarehouseLocationId(Integer warehouseLocationId) {
    this.warehouseLocationId = warehouseLocationId;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(value = "")
  public Integer getLobId() {
    return lobId;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

   /**
   * Get outstandingPickQuantity
   * @return outstandingPickQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getOutstandingPickQuantity() {
    return outstandingPickQuantity;
  }

   /**
   * Get distributionDate
   * @return distributionDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDistributionDate() {
    return distributionDate;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

   /**
   * Get quantityPerInnerPack
   * @return quantityPerInnerPack
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantityPerInnerPack() {
    return quantityPerInnerPack;
  }

   /**
   * Get quantityPerCase
   * @return quantityPerCase
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantityPerCase() {
    return quantityPerCase;
  }

   /**
   * Get quantityPerPallet
   * @return quantityPerPallet
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantityPerPallet() {
    return quantityPerPallet;
  }

   /**
   * Get estimatedInnerPacks
   * @return estimatedInnerPacks
  **/
  @ApiModelProperty(value = "")
  public Integer getEstimatedInnerPacks() {
    return estimatedInnerPacks;
  }

   /**
   * Get estimatedCases
   * @return estimatedCases
  **/
  @ApiModelProperty(value = "")
  public Integer getEstimatedCases() {
    return estimatedCases;
  }

   /**
   * Get estimatedPallets
   * @return estimatedPallets
  **/
  @ApiModelProperty(value = "")
  public Integer getEstimatedPallets() {
    return estimatedPallets;
  }

   /**
   * Get unitsPerWrap
   * @return unitsPerWrap
  **/
  @ApiModelProperty(value = "")
  public Integer getUnitsPerWrap() {
    return unitsPerWrap;
  }

   /**
   * Get revisionDate
   * @return revisionDate
  **/
  @ApiModelProperty(value = "")
  public String getRevisionDate() {
    return revisionDate;
  }

   /**
   * Get productionLot
   * @return productionLot
  **/
  @ApiModelProperty(value = "")
  public String getProductionLot() {
    return productionLot;
  }

   /**
   * Get oldestReceiptDate
   * @return oldestReceiptDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getOldestReceiptDate() {
    return oldestReceiptDate;
  }

  public InventoryDetail createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public InventoryDetail modifyDate(OffsetDateTime modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }

   /**
   * Get modifyDate
   * @return modifyDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(OffsetDateTime modifyDate) {
    this.modifyDate = modifyDate;
  }

   /**
   * Get poNo
   * @return poNo
  **/
  @ApiModelProperty(value = "")
  public String getPoNo() {
    return poNo;
  }

  public InventoryDetail customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public InventoryDetail putCustomFieldsItem(String key, Object customFieldsItem) {
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
    InventoryDetail inventoryDetail = (InventoryDetail) o;
    return Objects.equals(this.id, inventoryDetail.id) &&
        Objects.equals(this.warehouseLocationId, inventoryDetail.warehouseLocationId) &&
        Objects.equals(this.lobId, inventoryDetail.lobId) &&
        Objects.equals(this.sku, inventoryDetail.sku) &&
        Objects.equals(this.quantity, inventoryDetail.quantity) &&
        Objects.equals(this.outstandingPickQuantity, inventoryDetail.outstandingPickQuantity) &&
        Objects.equals(this.distributionDate, inventoryDetail.distributionDate) &&
        Objects.equals(this.expirationDate, inventoryDetail.expirationDate) &&
        Objects.equals(this.quantityPerInnerPack, inventoryDetail.quantityPerInnerPack) &&
        Objects.equals(this.quantityPerCase, inventoryDetail.quantityPerCase) &&
        Objects.equals(this.quantityPerPallet, inventoryDetail.quantityPerPallet) &&
        Objects.equals(this.estimatedInnerPacks, inventoryDetail.estimatedInnerPacks) &&
        Objects.equals(this.estimatedCases, inventoryDetail.estimatedCases) &&
        Objects.equals(this.estimatedPallets, inventoryDetail.estimatedPallets) &&
        Objects.equals(this.unitsPerWrap, inventoryDetail.unitsPerWrap) &&
        Objects.equals(this.revisionDate, inventoryDetail.revisionDate) &&
        Objects.equals(this.productionLot, inventoryDetail.productionLot) &&
        Objects.equals(this.oldestReceiptDate, inventoryDetail.oldestReceiptDate) &&
        Objects.equals(this.createDate, inventoryDetail.createDate) &&
        Objects.equals(this.modifyDate, inventoryDetail.modifyDate) &&
        Objects.equals(this.poNo, inventoryDetail.poNo) &&
        Objects.equals(this.customFields, inventoryDetail.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseLocationId, lobId, sku, quantity, outstandingPickQuantity, distributionDate, expirationDate, quantityPerInnerPack, quantityPerCase, quantityPerPallet, estimatedInnerPacks, estimatedCases, estimatedPallets, unitsPerWrap, revisionDate, productionLot, oldestReceiptDate, createDate, modifyDate, poNo, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouseLocationId: ").append(toIndentedString(warehouseLocationId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    outstandingPickQuantity: ").append(toIndentedString(outstandingPickQuantity)).append("\n");
    sb.append("    distributionDate: ").append(toIndentedString(distributionDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    quantityPerInnerPack: ").append(toIndentedString(quantityPerInnerPack)).append("\n");
    sb.append("    quantityPerCase: ").append(toIndentedString(quantityPerCase)).append("\n");
    sb.append("    quantityPerPallet: ").append(toIndentedString(quantityPerPallet)).append("\n");
    sb.append("    estimatedInnerPacks: ").append(toIndentedString(estimatedInnerPacks)).append("\n");
    sb.append("    estimatedCases: ").append(toIndentedString(estimatedCases)).append("\n");
    sb.append("    estimatedPallets: ").append(toIndentedString(estimatedPallets)).append("\n");
    sb.append("    unitsPerWrap: ").append(toIndentedString(unitsPerWrap)).append("\n");
    sb.append("    revisionDate: ").append(toIndentedString(revisionDate)).append("\n");
    sb.append("    productionLot: ").append(toIndentedString(productionLot)).append("\n");
    sb.append("    oldestReceiptDate: ").append(toIndentedString(oldestReceiptDate)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    poNo: ").append(toIndentedString(poNo)).append("\n");
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

