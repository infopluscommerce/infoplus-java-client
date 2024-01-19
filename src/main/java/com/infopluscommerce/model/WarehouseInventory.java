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
 * WarehouseInventory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-19T12:05:52.234-06:00")
public class WarehouseInventory {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("onHandQuantity")
  private Integer onHandQuantity = null;

  @SerializedName("unavailableQuantity")
  private Integer unavailableQuantity = null;

  @SerializedName("openPOQuantity")
  private Integer openPOQuantity = null;

  @SerializedName("openOrderQuantity")
  private Integer openOrderQuantity = null;

  @SerializedName("availableQuantity")
  private Integer availableQuantity = null;

  @SerializedName("damagedQuantity")
  private Integer damagedQuantity = null;

  @SerializedName("inFulfillmentProcessQuantity")
  private Integer inFulfillmentProcessQuantity = null;

  @SerializedName("orderableQuantity")
  private Integer orderableQuantity = null;

  @SerializedName("unallocatableQuantity")
  private Integer unallocatableQuantity = null;

  @SerializedName("daysOnHand")
  private Integer daysOnHand = null;

  @SerializedName("stockStatus")
  private String stockStatus = null;

  @SerializedName("availableQuantityCases")
  private Integer availableQuantityCases = null;

  @SerializedName("availableQuantityInnerPacks")
  private Integer availableQuantityInnerPacks = null;

  @SerializedName("availableQuantityPallets")
  private Integer availableQuantityPallets = null;

  @SerializedName("damagedQuantityCases")
  private Integer damagedQuantityCases = null;

  @SerializedName("damagedQuantityInnerPacks")
  private Integer damagedQuantityInnerPacks = null;

  @SerializedName("damagedQuantityPallets")
  private Integer damagedQuantityPallets = null;

  @SerializedName("inFulfillmentProcessQuantityCases")
  private Integer inFulfillmentProcessQuantityCases = null;

  @SerializedName("inFulfillmentProcessQuantityInnerPacks")
  private Integer inFulfillmentProcessQuantityInnerPacks = null;

  @SerializedName("inFulfillmentProcessQuantityPallets")
  private Integer inFulfillmentProcessQuantityPallets = null;

  @SerializedName("onHandQuantityCases")
  private Integer onHandQuantityCases = null;

  @SerializedName("onHandQuantityInnerPacks")
  private Integer onHandQuantityInnerPacks = null;

  @SerializedName("onHandQuantityPallets")
  private Integer onHandQuantityPallets = null;

  @SerializedName("openOrderQuantityCases")
  private Integer openOrderQuantityCases = null;

  @SerializedName("openOrderQuantityInnerPacks")
  private Integer openOrderQuantityInnerPacks = null;

  @SerializedName("openOrderQuantityPallets")
  private Integer openOrderQuantityPallets = null;

  @SerializedName("openPOQuantityCases")
  private Integer openPOQuantityCases = null;

  @SerializedName("openPOQuantityInnerPacks")
  private Integer openPOQuantityInnerPacks = null;

  @SerializedName("openPOQuantityPallets")
  private Integer openPOQuantityPallets = null;

  @SerializedName("orderableQuantityCases")
  private Integer orderableQuantityCases = null;

  @SerializedName("orderableQuantityInnerPacks")
  private Integer orderableQuantityInnerPacks = null;

  @SerializedName("orderableQuantityPallets")
  private Integer orderableQuantityPallets = null;

  @SerializedName("unallocatableQuantityCases")
  private Integer unallocatableQuantityCases = null;

  @SerializedName("unallocatableQuantityInnerPacks")
  private Integer unallocatableQuantityInnerPacks = null;

  @SerializedName("unallocatableQuantityPallets")
  private Integer unallocatableQuantityPallets = null;

  @SerializedName("unavailableQuantityCases")
  private Integer unavailableQuantityCases = null;

  @SerializedName("unavailableQuantityInnerPacks")
  private Integer unavailableQuantityInnerPacks = null;

  @SerializedName("unavailableQuantityPallets")
  private Integer unavailableQuantityPallets = null;

  @SerializedName("totalDemand")
  private Integer totalDemand = null;

  @SerializedName("nextRequestDeliveryDate")
  private OffsetDateTime nextRequestDeliveryDate = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

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
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
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
   * Get warehouseId
   * @return warehouseId
  **/
  @ApiModelProperty(value = "")
  public Integer getWarehouseId() {
    return warehouseId;
  }

   /**
   * Get onHandQuantity
   * @return onHandQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getOnHandQuantity() {
    return onHandQuantity;
  }

   /**
   * Get unavailableQuantity
   * @return unavailableQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getUnavailableQuantity() {
    return unavailableQuantity;
  }

   /**
   * Get openPOQuantity
   * @return openPOQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getOpenPOQuantity() {
    return openPOQuantity;
  }

   /**
   * Get openOrderQuantity
   * @return openOrderQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getOpenOrderQuantity() {
    return openOrderQuantity;
  }

   /**
   * Get availableQuantity
   * @return availableQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getAvailableQuantity() {
    return availableQuantity;
  }

   /**
   * Get damagedQuantity
   * @return damagedQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getDamagedQuantity() {
    return damagedQuantity;
  }

   /**
   * Get inFulfillmentProcessQuantity
   * @return inFulfillmentProcessQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getInFulfillmentProcessQuantity() {
    return inFulfillmentProcessQuantity;
  }

   /**
   * Get orderableQuantity
   * @return orderableQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderableQuantity() {
    return orderableQuantity;
  }

   /**
   * Get unallocatableQuantity
   * @return unallocatableQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getUnallocatableQuantity() {
    return unallocatableQuantity;
  }

   /**
   * Get daysOnHand
   * @return daysOnHand
  **/
  @ApiModelProperty(value = "")
  public Integer getDaysOnHand() {
    return daysOnHand;
  }

  public WarehouseInventory stockStatus(String stockStatus) {
    this.stockStatus = stockStatus;
    return this;
  }

   /**
   * Get stockStatus
   * @return stockStatus
  **/
  @ApiModelProperty(value = "")
  public String getStockStatus() {
    return stockStatus;
  }

  public void setStockStatus(String stockStatus) {
    this.stockStatus = stockStatus;
  }

   /**
   * Get availableQuantityCases
   * @return availableQuantityCases
  **/
  @ApiModelProperty(value = "")
  public Integer getAvailableQuantityCases() {
    return availableQuantityCases;
  }

   /**
   * Get availableQuantityInnerPacks
   * @return availableQuantityInnerPacks
  **/
  @ApiModelProperty(value = "")
  public Integer getAvailableQuantityInnerPacks() {
    return availableQuantityInnerPacks;
  }

   /**
   * Get availableQuantityPallets
   * @return availableQuantityPallets
  **/
  @ApiModelProperty(value = "")
  public Integer getAvailableQuantityPallets() {
    return availableQuantityPallets;
  }

   /**
   * Get damagedQuantityCases
   * @return damagedQuantityCases
  **/
  @ApiModelProperty(value = "")
  public Integer getDamagedQuantityCases() {
    return damagedQuantityCases;
  }

   /**
   * Get damagedQuantityInnerPacks
   * @return damagedQuantityInnerPacks
  **/
  @ApiModelProperty(value = "")
  public Integer getDamagedQuantityInnerPacks() {
    return damagedQuantityInnerPacks;
  }

   /**
   * Get damagedQuantityPallets
   * @return damagedQuantityPallets
  **/
  @ApiModelProperty(value = "")
  public Integer getDamagedQuantityPallets() {
    return damagedQuantityPallets;
  }

   /**
   * Get inFulfillmentProcessQuantityCases
   * @return inFulfillmentProcessQuantityCases
  **/
  @ApiModelProperty(value = "")
  public Integer getInFulfillmentProcessQuantityCases() {
    return inFulfillmentProcessQuantityCases;
  }

   /**
   * Get inFulfillmentProcessQuantityInnerPacks
   * @return inFulfillmentProcessQuantityInnerPacks
  **/
  @ApiModelProperty(value = "")
  public Integer getInFulfillmentProcessQuantityInnerPacks() {
    return inFulfillmentProcessQuantityInnerPacks;
  }

   /**
   * Get inFulfillmentProcessQuantityPallets
   * @return inFulfillmentProcessQuantityPallets
  **/
  @ApiModelProperty(value = "")
  public Integer getInFulfillmentProcessQuantityPallets() {
    return inFulfillmentProcessQuantityPallets;
  }

   /**
   * Get onHandQuantityCases
   * @return onHandQuantityCases
  **/
  @ApiModelProperty(value = "")
  public Integer getOnHandQuantityCases() {
    return onHandQuantityCases;
  }

   /**
   * Get onHandQuantityInnerPacks
   * @return onHandQuantityInnerPacks
  **/
  @ApiModelProperty(value = "")
  public Integer getOnHandQuantityInnerPacks() {
    return onHandQuantityInnerPacks;
  }

   /**
   * Get onHandQuantityPallets
   * @return onHandQuantityPallets
  **/
  @ApiModelProperty(value = "")
  public Integer getOnHandQuantityPallets() {
    return onHandQuantityPallets;
  }

   /**
   * Get openOrderQuantityCases
   * @return openOrderQuantityCases
  **/
  @ApiModelProperty(value = "")
  public Integer getOpenOrderQuantityCases() {
    return openOrderQuantityCases;
  }

   /**
   * Get openOrderQuantityInnerPacks
   * @return openOrderQuantityInnerPacks
  **/
  @ApiModelProperty(value = "")
  public Integer getOpenOrderQuantityInnerPacks() {
    return openOrderQuantityInnerPacks;
  }

   /**
   * Get openOrderQuantityPallets
   * @return openOrderQuantityPallets
  **/
  @ApiModelProperty(value = "")
  public Integer getOpenOrderQuantityPallets() {
    return openOrderQuantityPallets;
  }

   /**
   * Get openPOQuantityCases
   * @return openPOQuantityCases
  **/
  @ApiModelProperty(value = "")
  public Integer getOpenPOQuantityCases() {
    return openPOQuantityCases;
  }

   /**
   * Get openPOQuantityInnerPacks
   * @return openPOQuantityInnerPacks
  **/
  @ApiModelProperty(value = "")
  public Integer getOpenPOQuantityInnerPacks() {
    return openPOQuantityInnerPacks;
  }

   /**
   * Get openPOQuantityPallets
   * @return openPOQuantityPallets
  **/
  @ApiModelProperty(value = "")
  public Integer getOpenPOQuantityPallets() {
    return openPOQuantityPallets;
  }

   /**
   * Get orderableQuantityCases
   * @return orderableQuantityCases
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderableQuantityCases() {
    return orderableQuantityCases;
  }

   /**
   * Get orderableQuantityInnerPacks
   * @return orderableQuantityInnerPacks
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderableQuantityInnerPacks() {
    return orderableQuantityInnerPacks;
  }

   /**
   * Get orderableQuantityPallets
   * @return orderableQuantityPallets
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderableQuantityPallets() {
    return orderableQuantityPallets;
  }

   /**
   * Get unallocatableQuantityCases
   * @return unallocatableQuantityCases
  **/
  @ApiModelProperty(value = "")
  public Integer getUnallocatableQuantityCases() {
    return unallocatableQuantityCases;
  }

   /**
   * Get unallocatableQuantityInnerPacks
   * @return unallocatableQuantityInnerPacks
  **/
  @ApiModelProperty(value = "")
  public Integer getUnallocatableQuantityInnerPacks() {
    return unallocatableQuantityInnerPacks;
  }

   /**
   * Get unallocatableQuantityPallets
   * @return unallocatableQuantityPallets
  **/
  @ApiModelProperty(value = "")
  public Integer getUnallocatableQuantityPallets() {
    return unallocatableQuantityPallets;
  }

   /**
   * Get unavailableQuantityCases
   * @return unavailableQuantityCases
  **/
  @ApiModelProperty(value = "")
  public Integer getUnavailableQuantityCases() {
    return unavailableQuantityCases;
  }

   /**
   * Get unavailableQuantityInnerPacks
   * @return unavailableQuantityInnerPacks
  **/
  @ApiModelProperty(value = "")
  public Integer getUnavailableQuantityInnerPacks() {
    return unavailableQuantityInnerPacks;
  }

   /**
   * Get unavailableQuantityPallets
   * @return unavailableQuantityPallets
  **/
  @ApiModelProperty(value = "")
  public Integer getUnavailableQuantityPallets() {
    return unavailableQuantityPallets;
  }

   /**
   * Get totalDemand
   * @return totalDemand
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalDemand() {
    return totalDemand;
  }

   /**
   * Get nextRequestDeliveryDate
   * @return nextRequestDeliveryDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getNextRequestDeliveryDate() {
    return nextRequestDeliveryDate;
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

  public WarehouseInventory customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public WarehouseInventory putCustomFieldsItem(String key, Object customFieldsItem) {
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
    WarehouseInventory warehouseInventory = (WarehouseInventory) o;
    return Objects.equals(this.id, warehouseInventory.id) &&
        Objects.equals(this.sku, warehouseInventory.sku) &&
        Objects.equals(this.lobId, warehouseInventory.lobId) &&
        Objects.equals(this.warehouseId, warehouseInventory.warehouseId) &&
        Objects.equals(this.onHandQuantity, warehouseInventory.onHandQuantity) &&
        Objects.equals(this.unavailableQuantity, warehouseInventory.unavailableQuantity) &&
        Objects.equals(this.openPOQuantity, warehouseInventory.openPOQuantity) &&
        Objects.equals(this.openOrderQuantity, warehouseInventory.openOrderQuantity) &&
        Objects.equals(this.availableQuantity, warehouseInventory.availableQuantity) &&
        Objects.equals(this.damagedQuantity, warehouseInventory.damagedQuantity) &&
        Objects.equals(this.inFulfillmentProcessQuantity, warehouseInventory.inFulfillmentProcessQuantity) &&
        Objects.equals(this.orderableQuantity, warehouseInventory.orderableQuantity) &&
        Objects.equals(this.unallocatableQuantity, warehouseInventory.unallocatableQuantity) &&
        Objects.equals(this.daysOnHand, warehouseInventory.daysOnHand) &&
        Objects.equals(this.stockStatus, warehouseInventory.stockStatus) &&
        Objects.equals(this.availableQuantityCases, warehouseInventory.availableQuantityCases) &&
        Objects.equals(this.availableQuantityInnerPacks, warehouseInventory.availableQuantityInnerPacks) &&
        Objects.equals(this.availableQuantityPallets, warehouseInventory.availableQuantityPallets) &&
        Objects.equals(this.damagedQuantityCases, warehouseInventory.damagedQuantityCases) &&
        Objects.equals(this.damagedQuantityInnerPacks, warehouseInventory.damagedQuantityInnerPacks) &&
        Objects.equals(this.damagedQuantityPallets, warehouseInventory.damagedQuantityPallets) &&
        Objects.equals(this.inFulfillmentProcessQuantityCases, warehouseInventory.inFulfillmentProcessQuantityCases) &&
        Objects.equals(this.inFulfillmentProcessQuantityInnerPacks, warehouseInventory.inFulfillmentProcessQuantityInnerPacks) &&
        Objects.equals(this.inFulfillmentProcessQuantityPallets, warehouseInventory.inFulfillmentProcessQuantityPallets) &&
        Objects.equals(this.onHandQuantityCases, warehouseInventory.onHandQuantityCases) &&
        Objects.equals(this.onHandQuantityInnerPacks, warehouseInventory.onHandQuantityInnerPacks) &&
        Objects.equals(this.onHandQuantityPallets, warehouseInventory.onHandQuantityPallets) &&
        Objects.equals(this.openOrderQuantityCases, warehouseInventory.openOrderQuantityCases) &&
        Objects.equals(this.openOrderQuantityInnerPacks, warehouseInventory.openOrderQuantityInnerPacks) &&
        Objects.equals(this.openOrderQuantityPallets, warehouseInventory.openOrderQuantityPallets) &&
        Objects.equals(this.openPOQuantityCases, warehouseInventory.openPOQuantityCases) &&
        Objects.equals(this.openPOQuantityInnerPacks, warehouseInventory.openPOQuantityInnerPacks) &&
        Objects.equals(this.openPOQuantityPallets, warehouseInventory.openPOQuantityPallets) &&
        Objects.equals(this.orderableQuantityCases, warehouseInventory.orderableQuantityCases) &&
        Objects.equals(this.orderableQuantityInnerPacks, warehouseInventory.orderableQuantityInnerPacks) &&
        Objects.equals(this.orderableQuantityPallets, warehouseInventory.orderableQuantityPallets) &&
        Objects.equals(this.unallocatableQuantityCases, warehouseInventory.unallocatableQuantityCases) &&
        Objects.equals(this.unallocatableQuantityInnerPacks, warehouseInventory.unallocatableQuantityInnerPacks) &&
        Objects.equals(this.unallocatableQuantityPallets, warehouseInventory.unallocatableQuantityPallets) &&
        Objects.equals(this.unavailableQuantityCases, warehouseInventory.unavailableQuantityCases) &&
        Objects.equals(this.unavailableQuantityInnerPacks, warehouseInventory.unavailableQuantityInnerPacks) &&
        Objects.equals(this.unavailableQuantityPallets, warehouseInventory.unavailableQuantityPallets) &&
        Objects.equals(this.totalDemand, warehouseInventory.totalDemand) &&
        Objects.equals(this.nextRequestDeliveryDate, warehouseInventory.nextRequestDeliveryDate) &&
        Objects.equals(this.createDate, warehouseInventory.createDate) &&
        Objects.equals(this.modifyDate, warehouseInventory.modifyDate) &&
        Objects.equals(this.customFields, warehouseInventory.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sku, lobId, warehouseId, onHandQuantity, unavailableQuantity, openPOQuantity, openOrderQuantity, availableQuantity, damagedQuantity, inFulfillmentProcessQuantity, orderableQuantity, unallocatableQuantity, daysOnHand, stockStatus, availableQuantityCases, availableQuantityInnerPacks, availableQuantityPallets, damagedQuantityCases, damagedQuantityInnerPacks, damagedQuantityPallets, inFulfillmentProcessQuantityCases, inFulfillmentProcessQuantityInnerPacks, inFulfillmentProcessQuantityPallets, onHandQuantityCases, onHandQuantityInnerPacks, onHandQuantityPallets, openOrderQuantityCases, openOrderQuantityInnerPacks, openOrderQuantityPallets, openPOQuantityCases, openPOQuantityInnerPacks, openPOQuantityPallets, orderableQuantityCases, orderableQuantityInnerPacks, orderableQuantityPallets, unallocatableQuantityCases, unallocatableQuantityInnerPacks, unallocatableQuantityPallets, unavailableQuantityCases, unavailableQuantityInnerPacks, unavailableQuantityPallets, totalDemand, nextRequestDeliveryDate, createDate, modifyDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarehouseInventory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    onHandQuantity: ").append(toIndentedString(onHandQuantity)).append("\n");
    sb.append("    unavailableQuantity: ").append(toIndentedString(unavailableQuantity)).append("\n");
    sb.append("    openPOQuantity: ").append(toIndentedString(openPOQuantity)).append("\n");
    sb.append("    openOrderQuantity: ").append(toIndentedString(openOrderQuantity)).append("\n");
    sb.append("    availableQuantity: ").append(toIndentedString(availableQuantity)).append("\n");
    sb.append("    damagedQuantity: ").append(toIndentedString(damagedQuantity)).append("\n");
    sb.append("    inFulfillmentProcessQuantity: ").append(toIndentedString(inFulfillmentProcessQuantity)).append("\n");
    sb.append("    orderableQuantity: ").append(toIndentedString(orderableQuantity)).append("\n");
    sb.append("    unallocatableQuantity: ").append(toIndentedString(unallocatableQuantity)).append("\n");
    sb.append("    daysOnHand: ").append(toIndentedString(daysOnHand)).append("\n");
    sb.append("    stockStatus: ").append(toIndentedString(stockStatus)).append("\n");
    sb.append("    availableQuantityCases: ").append(toIndentedString(availableQuantityCases)).append("\n");
    sb.append("    availableQuantityInnerPacks: ").append(toIndentedString(availableQuantityInnerPacks)).append("\n");
    sb.append("    availableQuantityPallets: ").append(toIndentedString(availableQuantityPallets)).append("\n");
    sb.append("    damagedQuantityCases: ").append(toIndentedString(damagedQuantityCases)).append("\n");
    sb.append("    damagedQuantityInnerPacks: ").append(toIndentedString(damagedQuantityInnerPacks)).append("\n");
    sb.append("    damagedQuantityPallets: ").append(toIndentedString(damagedQuantityPallets)).append("\n");
    sb.append("    inFulfillmentProcessQuantityCases: ").append(toIndentedString(inFulfillmentProcessQuantityCases)).append("\n");
    sb.append("    inFulfillmentProcessQuantityInnerPacks: ").append(toIndentedString(inFulfillmentProcessQuantityInnerPacks)).append("\n");
    sb.append("    inFulfillmentProcessQuantityPallets: ").append(toIndentedString(inFulfillmentProcessQuantityPallets)).append("\n");
    sb.append("    onHandQuantityCases: ").append(toIndentedString(onHandQuantityCases)).append("\n");
    sb.append("    onHandQuantityInnerPacks: ").append(toIndentedString(onHandQuantityInnerPacks)).append("\n");
    sb.append("    onHandQuantityPallets: ").append(toIndentedString(onHandQuantityPallets)).append("\n");
    sb.append("    openOrderQuantityCases: ").append(toIndentedString(openOrderQuantityCases)).append("\n");
    sb.append("    openOrderQuantityInnerPacks: ").append(toIndentedString(openOrderQuantityInnerPacks)).append("\n");
    sb.append("    openOrderQuantityPallets: ").append(toIndentedString(openOrderQuantityPallets)).append("\n");
    sb.append("    openPOQuantityCases: ").append(toIndentedString(openPOQuantityCases)).append("\n");
    sb.append("    openPOQuantityInnerPacks: ").append(toIndentedString(openPOQuantityInnerPacks)).append("\n");
    sb.append("    openPOQuantityPallets: ").append(toIndentedString(openPOQuantityPallets)).append("\n");
    sb.append("    orderableQuantityCases: ").append(toIndentedString(orderableQuantityCases)).append("\n");
    sb.append("    orderableQuantityInnerPacks: ").append(toIndentedString(orderableQuantityInnerPacks)).append("\n");
    sb.append("    orderableQuantityPallets: ").append(toIndentedString(orderableQuantityPallets)).append("\n");
    sb.append("    unallocatableQuantityCases: ").append(toIndentedString(unallocatableQuantityCases)).append("\n");
    sb.append("    unallocatableQuantityInnerPacks: ").append(toIndentedString(unallocatableQuantityInnerPacks)).append("\n");
    sb.append("    unallocatableQuantityPallets: ").append(toIndentedString(unallocatableQuantityPallets)).append("\n");
    sb.append("    unavailableQuantityCases: ").append(toIndentedString(unavailableQuantityCases)).append("\n");
    sb.append("    unavailableQuantityInnerPacks: ").append(toIndentedString(unavailableQuantityInnerPacks)).append("\n");
    sb.append("    unavailableQuantityPallets: ").append(toIndentedString(unavailableQuantityPallets)).append("\n");
    sb.append("    totalDemand: ").append(toIndentedString(totalDemand)).append("\n");
    sb.append("    nextRequestDeliveryDate: ").append(toIndentedString(nextRequestDeliveryDate)).append("\n");
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

