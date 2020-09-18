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
 * LowStock
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T13:20:03.871-05:00")
public class LowStock {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("lowLevelDate")
  private OffsetDateTime lowLevelDate = null;

  @SerializedName("lowStockMessage")
  private String lowStockMessage = null;

  @SerializedName("printFlag")
  private String printFlag = null;

  @SerializedName("isDelayed")
  private Boolean isDelayed = false;

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

  public LowStock warehouseId(Integer warehouseId) {
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

   /**
   * Get lowLevelDate
   * @return lowLevelDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLowLevelDate() {
    return lowLevelDate;
  }

   /**
   * Get lowStockMessage
   * @return lowStockMessage
  **/
  @ApiModelProperty(value = "")
  public String getLowStockMessage() {
    return lowStockMessage;
  }

   /**
   * Get printFlag
   * @return printFlag
  **/
  @ApiModelProperty(value = "")
  public String getPrintFlag() {
    return printFlag;
  }

   /**
   * Get isDelayed
   * @return isDelayed
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDelayed() {
    return isDelayed;
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

  public LowStock customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public LowStock putCustomFieldsItem(String key, Object customFieldsItem) {
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

  public LowStock sku(String sku) {
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
    LowStock lowStock = (LowStock) o;
    return Objects.equals(this.id, lowStock.id) &&
        Objects.equals(this.warehouseId, lowStock.warehouseId) &&
        Objects.equals(this.lowLevelDate, lowStock.lowLevelDate) &&
        Objects.equals(this.lowStockMessage, lowStock.lowStockMessage) &&
        Objects.equals(this.printFlag, lowStock.printFlag) &&
        Objects.equals(this.isDelayed, lowStock.isDelayed) &&
        Objects.equals(this.createDate, lowStock.createDate) &&
        Objects.equals(this.modifyDate, lowStock.modifyDate) &&
        Objects.equals(this.customFields, lowStock.customFields) &&
        Objects.equals(this.sku, lowStock.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, lowLevelDate, lowStockMessage, printFlag, isDelayed, createDate, modifyDate, customFields, sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LowStock {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    lowLevelDate: ").append(toIndentedString(lowLevelDate)).append("\n");
    sb.append("    lowStockMessage: ").append(toIndentedString(lowStockMessage)).append("\n");
    sb.append("    printFlag: ").append(toIndentedString(printFlag)).append("\n");
    sb.append("    isDelayed: ").append(toIndentedString(isDelayed)).append("\n");
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

