package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-04T22:56:01.104-05:00")
public class Warehouse   {
  
  private Integer id = null;
  private Integer client = null;
  private String name = null;
  private String address = null;
  private String company = null;
  private String street1 = null;
  private String street2 = null;
  private String street3 = null;
  private String city = null;
  private String state = null;
  private String zip = null;
  private String country = null;
  private String phone = null;
  private String locationBarcodePrefix = null;
  private String lpnPrefix = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("client")
  public Integer getClient() {
    return client;
  }

  
  /**
   **/
  public Warehouse name(String name) {
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
  public Warehouse address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   **/
  public Warehouse company(String company) {
    this.company = company;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("company")
  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
  }

  
  /**
   **/
  public Warehouse street1(String street1) {
    this.street1 = street1;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("street1")
  public String getStreet1() {
    return street1;
  }
  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  
  /**
   **/
  public Warehouse street2(String street2) {
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
  public Warehouse street3(String street3) {
    this.street3 = street3;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("street3")
  public String getStreet3() {
    return street3;
  }
  public void setStreet3(String street3) {
    this.street3 = street3;
  }

  
  /**
   **/
  public Warehouse city(String city) {
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
  public Warehouse state(String state) {
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
  public Warehouse zip(String zip) {
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
  public Warehouse country(String country) {
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
  public Warehouse phone(String phone) {
    this.phone = phone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   **/
  public Warehouse locationBarcodePrefix(String locationBarcodePrefix) {
    this.locationBarcodePrefix = locationBarcodePrefix;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("locationBarcodePrefix")
  public String getLocationBarcodePrefix() {
    return locationBarcodePrefix;
  }
  public void setLocationBarcodePrefix(String locationBarcodePrefix) {
    this.locationBarcodePrefix = locationBarcodePrefix;
  }

  
  /**
   **/
  public Warehouse lpnPrefix(String lpnPrefix) {
    this.lpnPrefix = lpnPrefix;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lpnPrefix")
  public String getLpnPrefix() {
    return lpnPrefix;
  }
  public void setLpnPrefix(String lpnPrefix) {
    this.lpnPrefix = lpnPrefix;
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
  public Warehouse customFields(Map<String, Object> customFields) {
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
    Warehouse warehouse = (Warehouse) o;
    return Objects.equals(this.id, warehouse.id) &&
        Objects.equals(this.client, warehouse.client) &&
        Objects.equals(this.name, warehouse.name) &&
        Objects.equals(this.address, warehouse.address) &&
        Objects.equals(this.company, warehouse.company) &&
        Objects.equals(this.street1, warehouse.street1) &&
        Objects.equals(this.street2, warehouse.street2) &&
        Objects.equals(this.street3, warehouse.street3) &&
        Objects.equals(this.city, warehouse.city) &&
        Objects.equals(this.state, warehouse.state) &&
        Objects.equals(this.zip, warehouse.zip) &&
        Objects.equals(this.country, warehouse.country) &&
        Objects.equals(this.phone, warehouse.phone) &&
        Objects.equals(this.locationBarcodePrefix, warehouse.locationBarcodePrefix) &&
        Objects.equals(this.lpnPrefix, warehouse.lpnPrefix) &&
        Objects.equals(this.createDate, warehouse.createDate) &&
        Objects.equals(this.modifyDate, warehouse.modifyDate) &&
        Objects.equals(this.customFields, warehouse.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, client, name, address, company, street1, street2, street3, city, state, zip, country, phone, locationBarcodePrefix, lpnPrefix, createDate, modifyDate, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Warehouse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    street3: ").append(toIndentedString(street3)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    locationBarcodePrefix: ").append(toIndentedString(locationBarcodePrefix)).append("\n");
    sb.append("    lpnPrefix: ").append(toIndentedString(lpnPrefix)).append("\n");
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

