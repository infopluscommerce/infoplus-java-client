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
 * FulfillmentProcessLog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T22:44:50.237-05:00")
public class FulfillmentProcessLog {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("processId")
  private Integer processId = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("orderNo")
  private BigDecimal orderNo = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("locationId")
  private Integer locationId = null;

  @SerializedName("itemReceiptId")
  private Integer itemReceiptId = null;

  @SerializedName("allocationIssueType")
  private String allocationIssueType = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  public FulfillmentProcessLog id(Integer id) {
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

  public FulfillmentProcessLog createDate(OffsetDateTime createDate) {
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

  public FulfillmentProcessLog modifyDate(OffsetDateTime modifyDate) {
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

  public FulfillmentProcessLog processId(Integer processId) {
    this.processId = processId;
    return this;
  }

   /**
   * Get processId
   * @return processId
  **/
  @ApiModelProperty(value = "")
  public Integer getProcessId() {
    return processId;
  }

  public void setProcessId(Integer processId) {
    this.processId = processId;
  }

  public FulfillmentProcessLog warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

   /**
   * Get warehouseId
   * @return warehouseId
  **/
  @ApiModelProperty(value = "")
  public Integer getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  public FulfillmentProcessLog orderNo(BigDecimal orderNo) {
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

  public FulfillmentProcessLog lobId(Integer lobId) {
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

  public FulfillmentProcessLog sku(String sku) {
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

  public FulfillmentProcessLog locationId(Integer locationId) {
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

  public FulfillmentProcessLog itemReceiptId(Integer itemReceiptId) {
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

  public FulfillmentProcessLog allocationIssueType(String allocationIssueType) {
    this.allocationIssueType = allocationIssueType;
    return this;
  }

   /**
   * Get allocationIssueType
   * @return allocationIssueType
  **/
  @ApiModelProperty(value = "")
  public String getAllocationIssueType() {
    return allocationIssueType;
  }

  public void setAllocationIssueType(String allocationIssueType) {
    this.allocationIssueType = allocationIssueType;
  }

  public FulfillmentProcessLog message(String message) {
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

  public FulfillmentProcessLog customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public FulfillmentProcessLog putCustomFieldsItem(String key, Object customFieldsItem) {
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
    FulfillmentProcessLog fulfillmentProcessLog = (FulfillmentProcessLog) o;
    return Objects.equals(this.id, fulfillmentProcessLog.id) &&
        Objects.equals(this.createDate, fulfillmentProcessLog.createDate) &&
        Objects.equals(this.modifyDate, fulfillmentProcessLog.modifyDate) &&
        Objects.equals(this.processId, fulfillmentProcessLog.processId) &&
        Objects.equals(this.warehouseId, fulfillmentProcessLog.warehouseId) &&
        Objects.equals(this.orderNo, fulfillmentProcessLog.orderNo) &&
        Objects.equals(this.lobId, fulfillmentProcessLog.lobId) &&
        Objects.equals(this.sku, fulfillmentProcessLog.sku) &&
        Objects.equals(this.locationId, fulfillmentProcessLog.locationId) &&
        Objects.equals(this.itemReceiptId, fulfillmentProcessLog.itemReceiptId) &&
        Objects.equals(this.allocationIssueType, fulfillmentProcessLog.allocationIssueType) &&
        Objects.equals(this.message, fulfillmentProcessLog.message) &&
        Objects.equals(this.customFields, fulfillmentProcessLog.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, processId, warehouseId, orderNo, lobId, sku, locationId, itemReceiptId, allocationIssueType, message, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentProcessLog {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    itemReceiptId: ").append(toIndentedString(itemReceiptId)).append("\n");
    sb.append("    allocationIssueType: ").append(toIndentedString(allocationIssueType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

