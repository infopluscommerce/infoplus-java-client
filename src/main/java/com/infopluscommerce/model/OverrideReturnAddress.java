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
 * OverrideReturnAddress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-03T23:21:42.819-05:00")
public class OverrideReturnAddress {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("orderSourceId")
  private Integer orderSourceId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("attention")
  private String attention = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("street2")
  private String street2 = null;

  @SerializedName("street3Province")
  private String street3Province = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zip")
  private String zip = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("phone")
  private String phone = null;

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

  public OverrideReturnAddress lobId(Integer lobId) {
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

  public OverrideReturnAddress warehouseId(Integer warehouseId) {
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

  public OverrideReturnAddress orderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
    return this;
  }

   /**
   * Get orderSourceId
   * @return orderSourceId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getOrderSourceId() {
    return orderSourceId;
  }

  public void setOrderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
  }

  public OverrideReturnAddress name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OverrideReturnAddress attention(String attention) {
    this.attention = attention;
    return this;
  }

   /**
   * Get attention
   * @return attention
  **/
  @ApiModelProperty(value = "")
  public String getAttention() {
    return attention;
  }

  public void setAttention(String attention) {
    this.attention = attention;
  }

  public OverrideReturnAddress street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public OverrideReturnAddress street2(String street2) {
    this.street2 = street2;
    return this;
  }

   /**
   * Get street2
   * @return street2
  **/
  @ApiModelProperty(value = "")
  public String getStreet2() {
    return street2;
  }

  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  public OverrideReturnAddress street3Province(String street3Province) {
    this.street3Province = street3Province;
    return this;
  }

   /**
   * Get street3Province
   * @return street3Province
  **/
  @ApiModelProperty(value = "")
  public String getStreet3Province() {
    return street3Province;
  }

  public void setStreet3Province(String street3Province) {
    this.street3Province = street3Province;
  }

  public OverrideReturnAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OverrideReturnAddress state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public OverrideReturnAddress zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @ApiModelProperty(required = true, value = "")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public OverrideReturnAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OverrideReturnAddress phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public OverrideReturnAddress customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public OverrideReturnAddress putCustomFieldsItem(String key, Object customFieldsItem) {
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
    OverrideReturnAddress overrideReturnAddress = (OverrideReturnAddress) o;
    return Objects.equals(this.id, overrideReturnAddress.id) &&
        Objects.equals(this.createDate, overrideReturnAddress.createDate) &&
        Objects.equals(this.modifyDate, overrideReturnAddress.modifyDate) &&
        Objects.equals(this.lobId, overrideReturnAddress.lobId) &&
        Objects.equals(this.warehouseId, overrideReturnAddress.warehouseId) &&
        Objects.equals(this.orderSourceId, overrideReturnAddress.orderSourceId) &&
        Objects.equals(this.name, overrideReturnAddress.name) &&
        Objects.equals(this.attention, overrideReturnAddress.attention) &&
        Objects.equals(this.street, overrideReturnAddress.street) &&
        Objects.equals(this.street2, overrideReturnAddress.street2) &&
        Objects.equals(this.street3Province, overrideReturnAddress.street3Province) &&
        Objects.equals(this.city, overrideReturnAddress.city) &&
        Objects.equals(this.state, overrideReturnAddress.state) &&
        Objects.equals(this.zip, overrideReturnAddress.zip) &&
        Objects.equals(this.country, overrideReturnAddress.country) &&
        Objects.equals(this.phone, overrideReturnAddress.phone) &&
        Objects.equals(this.customFields, overrideReturnAddress.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, lobId, warehouseId, orderSourceId, name, attention, street, street2, street3Province, city, state, zip, country, phone, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverrideReturnAddress {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    orderSourceId: ").append(toIndentedString(orderSourceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    attention: ").append(toIndentedString(attention)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    street3Province: ").append(toIndentedString(street3Province)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

