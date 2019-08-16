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
 * OmsOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-16T09:13:36.110-05:00")
public class OmsOrder {
  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("omsOrderNo")
  private Integer omsOrderNo = null;

  @SerializedName("total")
  private BigDecimal total = null;

  @SerializedName("orderStatus")
  private String orderStatus = null;

  @SerializedName("orderEntryProgramId")
  private Integer orderEntryProgramId = null;

  @SerializedName("legacyUserId")
  private Integer legacyUserId = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("nextOMSOrderId")
  private Integer nextOMSOrderId = null;

  @SerializedName("customerId")
  private Integer customerId = null;

  @SerializedName("tax")
  private BigDecimal tax = null;

  @SerializedName("shippingHandling")
  private BigDecimal shippingHandling = null;

  @SerializedName("shOverrideAmount")
  private BigDecimal shOverrideAmount = null;

  @SerializedName("integrationPartnerId")
  private Integer integrationPartnerId = null;

  @SerializedName("orderSourceId")
  private Integer orderSourceId = null;

  @SerializedName("batchNo")
  private String batchNo = null;

  @SerializedName("isGift")
  private Boolean isGift = false;

  @SerializedName("giftMessage")
  private String giftMessage = null;

  @SerializedName("emailRecipient")
  private Boolean emailRecipient = false;

  @SerializedName("mailRecipient")
  private Boolean mailRecipient = false;

  @SerializedName("keyCode")
  private String keyCode = null;

  @SerializedName("keyCodeDescription")
  private String keyCodeDescription = null;

  @SerializedName("distCharges")
  private BigDecimal distCharges = null;

  @SerializedName("subTotal")
  private BigDecimal subTotal = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  public OmsOrder lobId(Integer lobId) {
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

  public OmsOrder externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(value = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public OmsOrder omsOrderNo(Integer omsOrderNo) {
    this.omsOrderNo = omsOrderNo;
    return this;
  }

   /**
   * Get omsOrderNo
   * @return omsOrderNo
  **/
  @ApiModelProperty(value = "")
  public Integer getOmsOrderNo() {
    return omsOrderNo;
  }

  public void setOmsOrderNo(Integer omsOrderNo) {
    this.omsOrderNo = omsOrderNo;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotal() {
    return total;
  }

  public OmsOrder orderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * Get orderStatus
   * @return orderStatus
  **/
  @ApiModelProperty(value = "")
  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

   /**
   * Get orderEntryProgramId
   * @return orderEntryProgramId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderEntryProgramId() {
    return orderEntryProgramId;
  }

   /**
   * Get legacyUserId
   * @return legacyUserId
  **/
  @ApiModelProperty(value = "")
  public Integer getLegacyUserId() {
    return legacyUserId;
  }

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

  public OmsOrder nextOMSOrderId(Integer nextOMSOrderId) {
    this.nextOMSOrderId = nextOMSOrderId;
    return this;
  }

   /**
   * Get nextOMSOrderId
   * @return nextOMSOrderId
  **/
  @ApiModelProperty(value = "")
  public Integer getNextOMSOrderId() {
    return nextOMSOrderId;
  }

  public void setNextOMSOrderId(Integer nextOMSOrderId) {
    this.nextOMSOrderId = nextOMSOrderId;
  }

  public OmsOrder customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public OmsOrder tax(BigDecimal tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTax() {
    return tax;
  }

  public void setTax(BigDecimal tax) {
    this.tax = tax;
  }

   /**
   * Get shippingHandling
   * @return shippingHandling
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getShippingHandling() {
    return shippingHandling;
  }

  public OmsOrder shOverrideAmount(BigDecimal shOverrideAmount) {
    this.shOverrideAmount = shOverrideAmount;
    return this;
  }

   /**
   * Get shOverrideAmount
   * @return shOverrideAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getShOverrideAmount() {
    return shOverrideAmount;
  }

  public void setShOverrideAmount(BigDecimal shOverrideAmount) {
    this.shOverrideAmount = shOverrideAmount;
  }

   /**
   * Get integrationPartnerId
   * @return integrationPartnerId
  **/
  @ApiModelProperty(value = "")
  public Integer getIntegrationPartnerId() {
    return integrationPartnerId;
  }

  public OmsOrder orderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
    return this;
  }

   /**
   * Get orderSourceId
   * @return orderSourceId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderSourceId() {
    return orderSourceId;
  }

  public void setOrderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
  }

  public OmsOrder batchNo(String batchNo) {
    this.batchNo = batchNo;
    return this;
  }

   /**
   * Get batchNo
   * @return batchNo
  **/
  @ApiModelProperty(value = "")
  public String getBatchNo() {
    return batchNo;
  }

  public void setBatchNo(String batchNo) {
    this.batchNo = batchNo;
  }

  public OmsOrder isGift(Boolean isGift) {
    this.isGift = isGift;
    return this;
  }

   /**
   * Get isGift
   * @return isGift
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsGift() {
    return isGift;
  }

  public void setIsGift(Boolean isGift) {
    this.isGift = isGift;
  }

  public OmsOrder giftMessage(String giftMessage) {
    this.giftMessage = giftMessage;
    return this;
  }

   /**
   * Get giftMessage
   * @return giftMessage
  **/
  @ApiModelProperty(value = "")
  public String getGiftMessage() {
    return giftMessage;
  }

  public void setGiftMessage(String giftMessage) {
    this.giftMessage = giftMessage;
  }

  public OmsOrder emailRecipient(Boolean emailRecipient) {
    this.emailRecipient = emailRecipient;
    return this;
  }

   /**
   * Get emailRecipient
   * @return emailRecipient
  **/
  @ApiModelProperty(value = "")
  public Boolean isEmailRecipient() {
    return emailRecipient;
  }

  public void setEmailRecipient(Boolean emailRecipient) {
    this.emailRecipient = emailRecipient;
  }

  public OmsOrder mailRecipient(Boolean mailRecipient) {
    this.mailRecipient = mailRecipient;
    return this;
  }

   /**
   * Get mailRecipient
   * @return mailRecipient
  **/
  @ApiModelProperty(value = "")
  public Boolean isMailRecipient() {
    return mailRecipient;
  }

  public void setMailRecipient(Boolean mailRecipient) {
    this.mailRecipient = mailRecipient;
  }

  public OmsOrder keyCode(String keyCode) {
    this.keyCode = keyCode;
    return this;
  }

   /**
   * Get keyCode
   * @return keyCode
  **/
  @ApiModelProperty(value = "")
  public String getKeyCode() {
    return keyCode;
  }

  public void setKeyCode(String keyCode) {
    this.keyCode = keyCode;
  }

   /**
   * Get keyCodeDescription
   * @return keyCodeDescription
  **/
  @ApiModelProperty(value = "")
  public String getKeyCodeDescription() {
    return keyCodeDescription;
  }

   /**
   * Get distCharges
   * @return distCharges
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDistCharges() {
    return distCharges;
  }

   /**
   * Get subTotal
   * @return subTotal
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSubTotal() {
    return subTotal;
  }

  public OmsOrder customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public OmsOrder putCustomFieldsItem(String key, Object customFieldsItem) {
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
    OmsOrder omsOrder = (OmsOrder) o;
    return Objects.equals(this.lobId, omsOrder.lobId) &&
        Objects.equals(this.externalId, omsOrder.externalId) &&
        Objects.equals(this.omsOrderNo, omsOrder.omsOrderNo) &&
        Objects.equals(this.total, omsOrder.total) &&
        Objects.equals(this.orderStatus, omsOrder.orderStatus) &&
        Objects.equals(this.orderEntryProgramId, omsOrder.orderEntryProgramId) &&
        Objects.equals(this.legacyUserId, omsOrder.legacyUserId) &&
        Objects.equals(this.id, omsOrder.id) &&
        Objects.equals(this.createDate, omsOrder.createDate) &&
        Objects.equals(this.modifyDate, omsOrder.modifyDate) &&
        Objects.equals(this.nextOMSOrderId, omsOrder.nextOMSOrderId) &&
        Objects.equals(this.customerId, omsOrder.customerId) &&
        Objects.equals(this.tax, omsOrder.tax) &&
        Objects.equals(this.shippingHandling, omsOrder.shippingHandling) &&
        Objects.equals(this.shOverrideAmount, omsOrder.shOverrideAmount) &&
        Objects.equals(this.integrationPartnerId, omsOrder.integrationPartnerId) &&
        Objects.equals(this.orderSourceId, omsOrder.orderSourceId) &&
        Objects.equals(this.batchNo, omsOrder.batchNo) &&
        Objects.equals(this.isGift, omsOrder.isGift) &&
        Objects.equals(this.giftMessage, omsOrder.giftMessage) &&
        Objects.equals(this.emailRecipient, omsOrder.emailRecipient) &&
        Objects.equals(this.mailRecipient, omsOrder.mailRecipient) &&
        Objects.equals(this.keyCode, omsOrder.keyCode) &&
        Objects.equals(this.keyCodeDescription, omsOrder.keyCodeDescription) &&
        Objects.equals(this.distCharges, omsOrder.distCharges) &&
        Objects.equals(this.subTotal, omsOrder.subTotal) &&
        Objects.equals(this.customFields, omsOrder.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lobId, externalId, omsOrderNo, total, orderStatus, orderEntryProgramId, legacyUserId, id, createDate, modifyDate, nextOMSOrderId, customerId, tax, shippingHandling, shOverrideAmount, integrationPartnerId, orderSourceId, batchNo, isGift, giftMessage, emailRecipient, mailRecipient, keyCode, keyCodeDescription, distCharges, subTotal, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmsOrder {\n");
    
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    omsOrderNo: ").append(toIndentedString(omsOrderNo)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    orderEntryProgramId: ").append(toIndentedString(orderEntryProgramId)).append("\n");
    sb.append("    legacyUserId: ").append(toIndentedString(legacyUserId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    nextOMSOrderId: ").append(toIndentedString(nextOMSOrderId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    shippingHandling: ").append(toIndentedString(shippingHandling)).append("\n");
    sb.append("    shOverrideAmount: ").append(toIndentedString(shOverrideAmount)).append("\n");
    sb.append("    integrationPartnerId: ").append(toIndentedString(integrationPartnerId)).append("\n");
    sb.append("    orderSourceId: ").append(toIndentedString(orderSourceId)).append("\n");
    sb.append("    batchNo: ").append(toIndentedString(batchNo)).append("\n");
    sb.append("    isGift: ").append(toIndentedString(isGift)).append("\n");
    sb.append("    giftMessage: ").append(toIndentedString(giftMessage)).append("\n");
    sb.append("    emailRecipient: ").append(toIndentedString(emailRecipient)).append("\n");
    sb.append("    mailRecipient: ").append(toIndentedString(mailRecipient)).append("\n");
    sb.append("    keyCode: ").append(toIndentedString(keyCode)).append("\n");
    sb.append("    keyCodeDescription: ").append(toIndentedString(keyCodeDescription)).append("\n");
    sb.append("    distCharges: ").append(toIndentedString(distCharges)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
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

