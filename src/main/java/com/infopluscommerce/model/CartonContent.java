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
 * CartonContent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-16T13:04:33.234-06:00")
public class CartonContent {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("groupOrderId")
  private BigDecimal groupOrderId = null;

  @SerializedName("orderNo")
  private BigDecimal orderNo = null;

  @SerializedName("cartonNo")
  private Integer cartonNo = null;

  @SerializedName("cartonId")
  private Integer cartonId = null;

  @SerializedName("lineItemId")
  private Integer lineItemId = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("quantityScanned")
  private Integer quantityScanned = null;

  @SerializedName("completed")
  private OffsetDateTime completed = null;

  @SerializedName("toteId")
  private String toteId = null;

  @SerializedName("pickerId")
  private String pickerId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("lobId")
  private Integer lobId = null;

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

  public CartonContent groupOrderId(BigDecimal groupOrderId) {
    this.groupOrderId = groupOrderId;
    return this;
  }

   /**
   * Get groupOrderId
   * @return groupOrderId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getGroupOrderId() {
    return groupOrderId;
  }

  public void setGroupOrderId(BigDecimal groupOrderId) {
    this.groupOrderId = groupOrderId;
  }

  public CartonContent orderNo(BigDecimal orderNo) {
    this.orderNo = orderNo;
    return this;
  }

   /**
   * Get orderNo
   * @return orderNo
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(BigDecimal orderNo) {
    this.orderNo = orderNo;
  }

   /**
   * Get cartonNo
   * @return cartonNo
  **/
  @ApiModelProperty(value = "")
  public Integer getCartonNo() {
    return cartonNo;
  }

  public CartonContent cartonId(Integer cartonId) {
    this.cartonId = cartonId;
    return this;
  }

   /**
   * Get cartonId
   * @return cartonId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCartonId() {
    return cartonId;
  }

  public void setCartonId(Integer cartonId) {
    this.cartonId = cartonId;
  }

  public CartonContent lineItemId(Integer lineItemId) {
    this.lineItemId = lineItemId;
    return this;
  }

   /**
   * Get lineItemId
   * @return lineItemId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLineItemId() {
    return lineItemId;
  }

  public void setLineItemId(Integer lineItemId) {
    this.lineItemId = lineItemId;
  }

  public CartonContent sku(String sku) {
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

  public CartonContent location(String location) {
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

  public CartonContent quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public CartonContent quantityScanned(Integer quantityScanned) {
    this.quantityScanned = quantityScanned;
    return this;
  }

   /**
   * Get quantityScanned
   * @return quantityScanned
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantityScanned() {
    return quantityScanned;
  }

  public void setQuantityScanned(Integer quantityScanned) {
    this.quantityScanned = quantityScanned;
  }

  public CartonContent completed(OffsetDateTime completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCompleted() {
    return completed;
  }

  public void setCompleted(OffsetDateTime completed) {
    this.completed = completed;
  }

  public CartonContent toteId(String toteId) {
    this.toteId = toteId;
    return this;
  }

   /**
   * Get toteId
   * @return toteId
  **/
  @ApiModelProperty(value = "")
  public String getToteId() {
    return toteId;
  }

  public void setToteId(String toteId) {
    this.toteId = toteId;
  }

  public CartonContent pickerId(String pickerId) {
    this.pickerId = pickerId;
    return this;
  }

   /**
   * Get pickerId
   * @return pickerId
  **/
  @ApiModelProperty(value = "")
  public String getPickerId() {
    return pickerId;
  }

  public void setPickerId(String pickerId) {
    this.pickerId = pickerId;
  }

  public CartonContent status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CartonContent lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLobId() {
    return lobId;
  }

  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  public CartonContent customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public CartonContent putCustomFieldsItem(String key, Object customFieldsItem) {
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
    CartonContent cartonContent = (CartonContent) o;
    return Objects.equals(this.id, cartonContent.id) &&
        Objects.equals(this.groupOrderId, cartonContent.groupOrderId) &&
        Objects.equals(this.orderNo, cartonContent.orderNo) &&
        Objects.equals(this.cartonNo, cartonContent.cartonNo) &&
        Objects.equals(this.cartonId, cartonContent.cartonId) &&
        Objects.equals(this.lineItemId, cartonContent.lineItemId) &&
        Objects.equals(this.sku, cartonContent.sku) &&
        Objects.equals(this.location, cartonContent.location) &&
        Objects.equals(this.quantity, cartonContent.quantity) &&
        Objects.equals(this.quantityScanned, cartonContent.quantityScanned) &&
        Objects.equals(this.completed, cartonContent.completed) &&
        Objects.equals(this.toteId, cartonContent.toteId) &&
        Objects.equals(this.pickerId, cartonContent.pickerId) &&
        Objects.equals(this.status, cartonContent.status) &&
        Objects.equals(this.lobId, cartonContent.lobId) &&
        Objects.equals(this.customFields, cartonContent.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupOrderId, orderNo, cartonNo, cartonId, lineItemId, sku, location, quantity, quantityScanned, completed, toteId, pickerId, status, lobId, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartonContent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupOrderId: ").append(toIndentedString(groupOrderId)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    cartonNo: ").append(toIndentedString(cartonNo)).append("\n");
    sb.append("    cartonId: ").append(toIndentedString(cartonId)).append("\n");
    sb.append("    lineItemId: ").append(toIndentedString(lineItemId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityScanned: ").append(toIndentedString(quantityScanned)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    toteId: ").append(toIndentedString(toteId)).append("\n");
    sb.append("    pickerId: ").append(toIndentedString(pickerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
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

