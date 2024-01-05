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

/**
 * OrderLineItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-05T12:20:58.280-06:00")
public class OrderLineItem {
  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("price")
  private BigDecimal price = null;

  @SerializedName("discount")
  private BigDecimal discount = null;

  @SerializedName("subTotal")
  private BigDecimal subTotal = null;

  @SerializedName("originalPrice")
  private BigDecimal originalPrice = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("majorGroup")
  private String majorGroup = null;

  @SerializedName("subGroup")
  private String subGroup = null;

  @SerializedName("available")
  private Integer available = null;

  @SerializedName("onHand")
  private Integer onHand = null;

  @SerializedName("onOrder")
  private Integer onOrder = null;

  @SerializedName("discountType")
  private String discountType = null;

  @SerializedName("discountPercent")
  private BigDecimal discountPercent = null;

  @SerializedName("customPrice")
  private BigDecimal customPrice = null;

  @SerializedName("discountedPrice")
  private BigDecimal discountedPrice = null;

  @SerializedName("alternateSKU")
  private String alternateSKU = null;

  @SerializedName("isGiftCard")
  private Boolean isGiftCard = false;

  @SerializedName("giftCardAmount")
  private BigDecimal giftCardAmount = null;

  @SerializedName("giftCardTo")
  private String giftCardTo = null;

  @SerializedName("giftCardEmail")
  private String giftCardEmail = null;

  @SerializedName("giftCardMessage")
  private String giftCardMessage = null;

  @SerializedName("account")
  private String account = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  public OrderLineItem quantity(Integer quantity) {
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

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrice() {
    return price;
  }

  public OrderLineItem discount(BigDecimal discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDiscount() {
    return discount;
  }

  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

   /**
   * Get subTotal
   * @return subTotal
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSubTotal() {
    return subTotal;
  }

   /**
   * Get originalPrice
   * @return originalPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOriginalPrice() {
    return originalPrice;
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
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

   /**
   * Get majorGroup
   * @return majorGroup
  **/
  @ApiModelProperty(value = "")
  public String getMajorGroup() {
    return majorGroup;
  }

   /**
   * Get subGroup
   * @return subGroup
  **/
  @ApiModelProperty(value = "")
  public String getSubGroup() {
    return subGroup;
  }

   /**
   * Get available
   * @return available
  **/
  @ApiModelProperty(value = "")
  public Integer getAvailable() {
    return available;
  }

   /**
   * Get onHand
   * @return onHand
  **/
  @ApiModelProperty(value = "")
  public Integer getOnHand() {
    return onHand;
  }

   /**
   * Get onOrder
   * @return onOrder
  **/
  @ApiModelProperty(value = "")
  public Integer getOnOrder() {
    return onOrder;
  }

  public OrderLineItem discountType(String discountType) {
    this.discountType = discountType;
    return this;
  }

   /**
   * Get discountType
   * @return discountType
  **/
  @ApiModelProperty(value = "")
  public String getDiscountType() {
    return discountType;
  }

  public void setDiscountType(String discountType) {
    this.discountType = discountType;
  }

  public OrderLineItem discountPercent(BigDecimal discountPercent) {
    this.discountPercent = discountPercent;
    return this;
  }

   /**
   * Get discountPercent
   * @return discountPercent
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(BigDecimal discountPercent) {
    this.discountPercent = discountPercent;
  }

  public OrderLineItem customPrice(BigDecimal customPrice) {
    this.customPrice = customPrice;
    return this;
  }

   /**
   * Get customPrice
   * @return customPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCustomPrice() {
    return customPrice;
  }

  public void setCustomPrice(BigDecimal customPrice) {
    this.customPrice = customPrice;
  }

   /**
   * Get discountedPrice
   * @return discountedPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDiscountedPrice() {
    return discountedPrice;
  }

  public OrderLineItem alternateSKU(String alternateSKU) {
    this.alternateSKU = alternateSKU;
    return this;
  }

   /**
   * Get alternateSKU
   * @return alternateSKU
  **/
  @ApiModelProperty(value = "")
  public String getAlternateSKU() {
    return alternateSKU;
  }

  public void setAlternateSKU(String alternateSKU) {
    this.alternateSKU = alternateSKU;
  }

   /**
   * Get isGiftCard
   * @return isGiftCard
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsGiftCard() {
    return isGiftCard;
  }

  public OrderLineItem giftCardAmount(BigDecimal giftCardAmount) {
    this.giftCardAmount = giftCardAmount;
    return this;
  }

   /**
   * Get giftCardAmount
   * @return giftCardAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getGiftCardAmount() {
    return giftCardAmount;
  }

  public void setGiftCardAmount(BigDecimal giftCardAmount) {
    this.giftCardAmount = giftCardAmount;
  }

  public OrderLineItem giftCardTo(String giftCardTo) {
    this.giftCardTo = giftCardTo;
    return this;
  }

   /**
   * Get giftCardTo
   * @return giftCardTo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getGiftCardTo() {
    return giftCardTo;
  }

  public void setGiftCardTo(String giftCardTo) {
    this.giftCardTo = giftCardTo;
  }

  public OrderLineItem giftCardEmail(String giftCardEmail) {
    this.giftCardEmail = giftCardEmail;
    return this;
  }

   /**
   * Get giftCardEmail
   * @return giftCardEmail
  **/
  @ApiModelProperty(required = true, value = "")
  public String getGiftCardEmail() {
    return giftCardEmail;
  }

  public void setGiftCardEmail(String giftCardEmail) {
    this.giftCardEmail = giftCardEmail;
  }

  public OrderLineItem giftCardMessage(String giftCardMessage) {
    this.giftCardMessage = giftCardMessage;
    return this;
  }

   /**
   * Get giftCardMessage
   * @return giftCardMessage
  **/
  @ApiModelProperty(required = true, value = "")
  public String getGiftCardMessage() {
    return giftCardMessage;
  }

  public void setGiftCardMessage(String giftCardMessage) {
    this.giftCardMessage = giftCardMessage;
  }

  public OrderLineItem account(String account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public OrderLineItem customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public OrderLineItem putCustomFieldsItem(String key, Object customFieldsItem) {
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
    OrderLineItem orderLineItem = (OrderLineItem) o;
    return Objects.equals(this.quantity, orderLineItem.quantity) &&
        Objects.equals(this.price, orderLineItem.price) &&
        Objects.equals(this.discount, orderLineItem.discount) &&
        Objects.equals(this.subTotal, orderLineItem.subTotal) &&
        Objects.equals(this.originalPrice, orderLineItem.originalPrice) &&
        Objects.equals(this.id, orderLineItem.id) &&
        Objects.equals(this.sku, orderLineItem.sku) &&
        Objects.equals(this.description, orderLineItem.description) &&
        Objects.equals(this.majorGroup, orderLineItem.majorGroup) &&
        Objects.equals(this.subGroup, orderLineItem.subGroup) &&
        Objects.equals(this.available, orderLineItem.available) &&
        Objects.equals(this.onHand, orderLineItem.onHand) &&
        Objects.equals(this.onOrder, orderLineItem.onOrder) &&
        Objects.equals(this.discountType, orderLineItem.discountType) &&
        Objects.equals(this.discountPercent, orderLineItem.discountPercent) &&
        Objects.equals(this.customPrice, orderLineItem.customPrice) &&
        Objects.equals(this.discountedPrice, orderLineItem.discountedPrice) &&
        Objects.equals(this.alternateSKU, orderLineItem.alternateSKU) &&
        Objects.equals(this.isGiftCard, orderLineItem.isGiftCard) &&
        Objects.equals(this.giftCardAmount, orderLineItem.giftCardAmount) &&
        Objects.equals(this.giftCardTo, orderLineItem.giftCardTo) &&
        Objects.equals(this.giftCardEmail, orderLineItem.giftCardEmail) &&
        Objects.equals(this.giftCardMessage, orderLineItem.giftCardMessage) &&
        Objects.equals(this.account, orderLineItem.account) &&
        Objects.equals(this.customFields, orderLineItem.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, price, discount, subTotal, originalPrice, id, sku, description, majorGroup, subGroup, available, onHand, onOrder, discountType, discountPercent, customPrice, discountedPrice, alternateSKU, isGiftCard, giftCardAmount, giftCardTo, giftCardEmail, giftCardMessage, account, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineItem {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    majorGroup: ").append(toIndentedString(majorGroup)).append("\n");
    sb.append("    subGroup: ").append(toIndentedString(subGroup)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    onHand: ").append(toIndentedString(onHand)).append("\n");
    sb.append("    onOrder: ").append(toIndentedString(onOrder)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    sb.append("    customPrice: ").append(toIndentedString(customPrice)).append("\n");
    sb.append("    discountedPrice: ").append(toIndentedString(discountedPrice)).append("\n");
    sb.append("    alternateSKU: ").append(toIndentedString(alternateSKU)).append("\n");
    sb.append("    isGiftCard: ").append(toIndentedString(isGiftCard)).append("\n");
    sb.append("    giftCardAmount: ").append(toIndentedString(giftCardAmount)).append("\n");
    sb.append("    giftCardTo: ").append(toIndentedString(giftCardTo)).append("\n");
    sb.append("    giftCardEmail: ").append(toIndentedString(giftCardEmail)).append("\n");
    sb.append("    giftCardMessage: ").append(toIndentedString(giftCardMessage)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

