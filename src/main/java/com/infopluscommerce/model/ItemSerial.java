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
 * ItemSerial
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-21T23:57:39.841-06:00")
public class ItemSerial {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("itemReceiptId")
  private Integer itemReceiptId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("asnId")
  private Integer asnId = null;

  @SerializedName("orderNoId")
  private BigDecimal orderNoId = null;

  @SerializedName("serial")
  private String serial = null;

  @SerializedName("receivedDate")
  private OffsetDateTime receivedDate = null;

  @SerializedName("shippedDate")
  private OffsetDateTime shippedDate = null;

  @SerializedName("inInventory")
  private Boolean inInventory = false;

  @SerializedName("s0")
  private String s0 = null;

  @SerializedName("s1")
  private String s1 = null;

  @SerializedName("s2")
  private String s2 = null;

  @SerializedName("s3")
  private String s3 = null;

  @SerializedName("s4")
  private String s4 = null;

  @SerializedName("s5")
  private String s5 = null;

  @SerializedName("s6")
  private String s6 = null;

  @SerializedName("s7")
  private String s7 = null;

  @SerializedName("s8")
  private String s8 = null;

  @SerializedName("s9")
  private String s9 = null;

  @SerializedName("s10")
  private String s10 = null;

  @SerializedName("s11")
  private String s11 = null;

  @SerializedName("s12")
  private String s12 = null;

  @SerializedName("s13")
  private String s13 = null;

  @SerializedName("s14")
  private String s14 = null;

  @SerializedName("s15")
  private String s15 = null;

  @SerializedName("s16")
  private String s16 = null;

  @SerializedName("s17")
  private String s17 = null;

  @SerializedName("s18")
  private String s18 = null;

  @SerializedName("s19")
  private String s19 = null;

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

  public ItemSerial itemReceiptId(Integer itemReceiptId) {
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

  public ItemSerial lobId(Integer lobId) {
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

  public ItemSerial asnId(Integer asnId) {
    this.asnId = asnId;
    return this;
  }

   /**
   * Get asnId
   * @return asnId
  **/
  @ApiModelProperty(value = "")
  public Integer getAsnId() {
    return asnId;
  }

  public void setAsnId(Integer asnId) {
    this.asnId = asnId;
  }

  public ItemSerial orderNoId(BigDecimal orderNoId) {
    this.orderNoId = orderNoId;
    return this;
  }

   /**
   * Get orderNoId
   * @return orderNoId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOrderNoId() {
    return orderNoId;
  }

  public void setOrderNoId(BigDecimal orderNoId) {
    this.orderNoId = orderNoId;
  }

  public ItemSerial serial(String serial) {
    this.serial = serial;
    return this;
  }

   /**
   * Get serial
   * @return serial
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

   /**
   * Get receivedDate
   * @return receivedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getReceivedDate() {
    return receivedDate;
  }

   /**
   * Get shippedDate
   * @return shippedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getShippedDate() {
    return shippedDate;
  }

   /**
   * Get inInventory
   * @return inInventory
  **/
  @ApiModelProperty(value = "")
  public Boolean isInInventory() {
    return inInventory;
  }

  public ItemSerial s0(String s0) {
    this.s0 = s0;
    return this;
  }

   /**
   * Get s0
   * @return s0
  **/
  @ApiModelProperty(value = "")
  public String getS0() {
    return s0;
  }

  public void setS0(String s0) {
    this.s0 = s0;
  }

  public ItemSerial s1(String s1) {
    this.s1 = s1;
    return this;
  }

   /**
   * Get s1
   * @return s1
  **/
  @ApiModelProperty(value = "")
  public String getS1() {
    return s1;
  }

  public void setS1(String s1) {
    this.s1 = s1;
  }

  public ItemSerial s2(String s2) {
    this.s2 = s2;
    return this;
  }

   /**
   * Get s2
   * @return s2
  **/
  @ApiModelProperty(value = "")
  public String getS2() {
    return s2;
  }

  public void setS2(String s2) {
    this.s2 = s2;
  }

  public ItemSerial s3(String s3) {
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @ApiModelProperty(value = "")
  public String getS3() {
    return s3;
  }

  public void setS3(String s3) {
    this.s3 = s3;
  }

  public ItemSerial s4(String s4) {
    this.s4 = s4;
    return this;
  }

   /**
   * Get s4
   * @return s4
  **/
  @ApiModelProperty(value = "")
  public String getS4() {
    return s4;
  }

  public void setS4(String s4) {
    this.s4 = s4;
  }

  public ItemSerial s5(String s5) {
    this.s5 = s5;
    return this;
  }

   /**
   * Get s5
   * @return s5
  **/
  @ApiModelProperty(value = "")
  public String getS5() {
    return s5;
  }

  public void setS5(String s5) {
    this.s5 = s5;
  }

  public ItemSerial s6(String s6) {
    this.s6 = s6;
    return this;
  }

   /**
   * Get s6
   * @return s6
  **/
  @ApiModelProperty(value = "")
  public String getS6() {
    return s6;
  }

  public void setS6(String s6) {
    this.s6 = s6;
  }

  public ItemSerial s7(String s7) {
    this.s7 = s7;
    return this;
  }

   /**
   * Get s7
   * @return s7
  **/
  @ApiModelProperty(value = "")
  public String getS7() {
    return s7;
  }

  public void setS7(String s7) {
    this.s7 = s7;
  }

  public ItemSerial s8(String s8) {
    this.s8 = s8;
    return this;
  }

   /**
   * Get s8
   * @return s8
  **/
  @ApiModelProperty(value = "")
  public String getS8() {
    return s8;
  }

  public void setS8(String s8) {
    this.s8 = s8;
  }

  public ItemSerial s9(String s9) {
    this.s9 = s9;
    return this;
  }

   /**
   * Get s9
   * @return s9
  **/
  @ApiModelProperty(value = "")
  public String getS9() {
    return s9;
  }

  public void setS9(String s9) {
    this.s9 = s9;
  }

  public ItemSerial s10(String s10) {
    this.s10 = s10;
    return this;
  }

   /**
   * Get s10
   * @return s10
  **/
  @ApiModelProperty(value = "")
  public String getS10() {
    return s10;
  }

  public void setS10(String s10) {
    this.s10 = s10;
  }

  public ItemSerial s11(String s11) {
    this.s11 = s11;
    return this;
  }

   /**
   * Get s11
   * @return s11
  **/
  @ApiModelProperty(value = "")
  public String getS11() {
    return s11;
  }

  public void setS11(String s11) {
    this.s11 = s11;
  }

  public ItemSerial s12(String s12) {
    this.s12 = s12;
    return this;
  }

   /**
   * Get s12
   * @return s12
  **/
  @ApiModelProperty(value = "")
  public String getS12() {
    return s12;
  }

  public void setS12(String s12) {
    this.s12 = s12;
  }

  public ItemSerial s13(String s13) {
    this.s13 = s13;
    return this;
  }

   /**
   * Get s13
   * @return s13
  **/
  @ApiModelProperty(value = "")
  public String getS13() {
    return s13;
  }

  public void setS13(String s13) {
    this.s13 = s13;
  }

  public ItemSerial s14(String s14) {
    this.s14 = s14;
    return this;
  }

   /**
   * Get s14
   * @return s14
  **/
  @ApiModelProperty(value = "")
  public String getS14() {
    return s14;
  }

  public void setS14(String s14) {
    this.s14 = s14;
  }

  public ItemSerial s15(String s15) {
    this.s15 = s15;
    return this;
  }

   /**
   * Get s15
   * @return s15
  **/
  @ApiModelProperty(value = "")
  public String getS15() {
    return s15;
  }

  public void setS15(String s15) {
    this.s15 = s15;
  }

  public ItemSerial s16(String s16) {
    this.s16 = s16;
    return this;
  }

   /**
   * Get s16
   * @return s16
  **/
  @ApiModelProperty(value = "")
  public String getS16() {
    return s16;
  }

  public void setS16(String s16) {
    this.s16 = s16;
  }

  public ItemSerial s17(String s17) {
    this.s17 = s17;
    return this;
  }

   /**
   * Get s17
   * @return s17
  **/
  @ApiModelProperty(value = "")
  public String getS17() {
    return s17;
  }

  public void setS17(String s17) {
    this.s17 = s17;
  }

  public ItemSerial s18(String s18) {
    this.s18 = s18;
    return this;
  }

   /**
   * Get s18
   * @return s18
  **/
  @ApiModelProperty(value = "")
  public String getS18() {
    return s18;
  }

  public void setS18(String s18) {
    this.s18 = s18;
  }

  public ItemSerial s19(String s19) {
    this.s19 = s19;
    return this;
  }

   /**
   * Get s19
   * @return s19
  **/
  @ApiModelProperty(value = "")
  public String getS19() {
    return s19;
  }

  public void setS19(String s19) {
    this.s19 = s19;
  }

  public ItemSerial customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ItemSerial putCustomFieldsItem(String key, Object customFieldsItem) {
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

  public ItemSerial sku(String sku) {
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
    ItemSerial itemSerial = (ItemSerial) o;
    return Objects.equals(this.id, itemSerial.id) &&
        Objects.equals(this.createDate, itemSerial.createDate) &&
        Objects.equals(this.modifyDate, itemSerial.modifyDate) &&
        Objects.equals(this.itemReceiptId, itemSerial.itemReceiptId) &&
        Objects.equals(this.lobId, itemSerial.lobId) &&
        Objects.equals(this.asnId, itemSerial.asnId) &&
        Objects.equals(this.orderNoId, itemSerial.orderNoId) &&
        Objects.equals(this.serial, itemSerial.serial) &&
        Objects.equals(this.receivedDate, itemSerial.receivedDate) &&
        Objects.equals(this.shippedDate, itemSerial.shippedDate) &&
        Objects.equals(this.inInventory, itemSerial.inInventory) &&
        Objects.equals(this.s0, itemSerial.s0) &&
        Objects.equals(this.s1, itemSerial.s1) &&
        Objects.equals(this.s2, itemSerial.s2) &&
        Objects.equals(this.s3, itemSerial.s3) &&
        Objects.equals(this.s4, itemSerial.s4) &&
        Objects.equals(this.s5, itemSerial.s5) &&
        Objects.equals(this.s6, itemSerial.s6) &&
        Objects.equals(this.s7, itemSerial.s7) &&
        Objects.equals(this.s8, itemSerial.s8) &&
        Objects.equals(this.s9, itemSerial.s9) &&
        Objects.equals(this.s10, itemSerial.s10) &&
        Objects.equals(this.s11, itemSerial.s11) &&
        Objects.equals(this.s12, itemSerial.s12) &&
        Objects.equals(this.s13, itemSerial.s13) &&
        Objects.equals(this.s14, itemSerial.s14) &&
        Objects.equals(this.s15, itemSerial.s15) &&
        Objects.equals(this.s16, itemSerial.s16) &&
        Objects.equals(this.s17, itemSerial.s17) &&
        Objects.equals(this.s18, itemSerial.s18) &&
        Objects.equals(this.s19, itemSerial.s19) &&
        Objects.equals(this.customFields, itemSerial.customFields) &&
        Objects.equals(this.sku, itemSerial.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, itemReceiptId, lobId, asnId, orderNoId, serial, receivedDate, shippedDate, inInventory, s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, customFields, sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemSerial {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    itemReceiptId: ").append(toIndentedString(itemReceiptId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    asnId: ").append(toIndentedString(asnId)).append("\n");
    sb.append("    orderNoId: ").append(toIndentedString(orderNoId)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    receivedDate: ").append(toIndentedString(receivedDate)).append("\n");
    sb.append("    shippedDate: ").append(toIndentedString(shippedDate)).append("\n");
    sb.append("    inInventory: ").append(toIndentedString(inInventory)).append("\n");
    sb.append("    s0: ").append(toIndentedString(s0)).append("\n");
    sb.append("    s1: ").append(toIndentedString(s1)).append("\n");
    sb.append("    s2: ").append(toIndentedString(s2)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
    sb.append("    s4: ").append(toIndentedString(s4)).append("\n");
    sb.append("    s5: ").append(toIndentedString(s5)).append("\n");
    sb.append("    s6: ").append(toIndentedString(s6)).append("\n");
    sb.append("    s7: ").append(toIndentedString(s7)).append("\n");
    sb.append("    s8: ").append(toIndentedString(s8)).append("\n");
    sb.append("    s9: ").append(toIndentedString(s9)).append("\n");
    sb.append("    s10: ").append(toIndentedString(s10)).append("\n");
    sb.append("    s11: ").append(toIndentedString(s11)).append("\n");
    sb.append("    s12: ").append(toIndentedString(s12)).append("\n");
    sb.append("    s13: ").append(toIndentedString(s13)).append("\n");
    sb.append("    s14: ").append(toIndentedString(s14)).append("\n");
    sb.append("    s15: ").append(toIndentedString(s15)).append("\n");
    sb.append("    s16: ").append(toIndentedString(s16)).append("\n");
    sb.append("    s17: ").append(toIndentedString(s17)).append("\n");
    sb.append("    s18: ").append(toIndentedString(s18)).append("\n");
    sb.append("    s19: ").append(toIndentedString(s19)).append("\n");
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

