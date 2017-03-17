package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class OverrideReturnAddress   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer lobId = null;
  private Integer warehouseId = null;
  private Integer orderSourceId = null;
  private String name = null;
  private String attention = null;
  private String street = null;
  private String street2 = null;
  private String city = null;
  private String state = null;
  private String zip = null;
  private String country = null;
  private String phone = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }

  
  /**
   **/
  public OverrideReturnAddress lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }
  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  
  /**
   **/
  public OverrideReturnAddress warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  
  /**
   **/
  public OverrideReturnAddress orderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("orderSourceId")
  public Integer getOrderSourceId() {
    return orderSourceId;
  }
  public void setOrderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
  }

  
  /**
   **/
  public OverrideReturnAddress name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public OverrideReturnAddress attention(String attention) {
    this.attention = attention;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attention")
  public String getAttention() {
    return attention;
  }
  public void setAttention(String attention) {
    this.attention = attention;
  }

  
  /**
   **/
  public OverrideReturnAddress street(String street) {
    this.street = street;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  
  /**
   **/
  public OverrideReturnAddress street2(String street2) {
    this.street2 = street2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("street2")
  public String getStreet2() {
    return street2;
  }
  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  
  /**
   **/
  public OverrideReturnAddress city(String city) {
    this.city = city;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   **/
  public OverrideReturnAddress state(String state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   **/
  public OverrideReturnAddress zip(String zip) {
    this.zip = zip;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("zip")
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }

  
  /**
   **/
  public OverrideReturnAddress country(String country) {
    this.country = country;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   **/
  public OverrideReturnAddress phone(String phone) {
    this.phone = phone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   **/
  public OverrideReturnAddress customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customFields")
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
        Objects.equals(this.city, overrideReturnAddress.city) &&
        Objects.equals(this.state, overrideReturnAddress.state) &&
        Objects.equals(this.zip, overrideReturnAddress.zip) &&
        Objects.equals(this.country, overrideReturnAddress.country) &&
        Objects.equals(this.phone, overrideReturnAddress.phone) &&
        Objects.equals(this.customFields, overrideReturnAddress.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, lobId, warehouseId, orderSourceId, name, attention, street, street2, city, state, zip, country, phone, customFields);
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

