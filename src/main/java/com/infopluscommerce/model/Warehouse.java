package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("client")
  public Integer getClient() {
    return client;
  }
  public void setClient(Integer client) {
    this.client = client;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("company")
  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("street1")
  public String getStreet1() {
    return street1;
  }
  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("street2")
  public String getStreet2() {
    return street2;
  }
  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("street3")
  public String getStreet3() {
    return street3;
  }
  public void setStreet3(String street3) {
    this.street3 = street3;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("zip")
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationBarcodePrefix")
  public String getLocationBarcodePrefix() {
    return locationBarcodePrefix;
  }
  public void setLocationBarcodePrefix(String locationBarcodePrefix) {
    this.locationBarcodePrefix = locationBarcodePrefix;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lpnPrefix")
  public String getLpnPrefix() {
    return lpnPrefix;
  }
  public void setLpnPrefix(String lpnPrefix) {
    this.lpnPrefix = lpnPrefix;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }
  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Warehouse warehouse = (Warehouse) o;
    return Objects.equals(id, warehouse.id) &&
        Objects.equals(client, warehouse.client) &&
        Objects.equals(name, warehouse.name) &&
        Objects.equals(address, warehouse.address) &&
        Objects.equals(company, warehouse.company) &&
        Objects.equals(street1, warehouse.street1) &&
        Objects.equals(street2, warehouse.street2) &&
        Objects.equals(street3, warehouse.street3) &&
        Objects.equals(city, warehouse.city) &&
        Objects.equals(state, warehouse.state) &&
        Objects.equals(zip, warehouse.zip) &&
        Objects.equals(country, warehouse.country) &&
        Objects.equals(phone, warehouse.phone) &&
        Objects.equals(locationBarcodePrefix, warehouse.locationBarcodePrefix) &&
        Objects.equals(lpnPrefix, warehouse.lpnPrefix) &&
        Objects.equals(createDate, warehouse.createDate) &&
        Objects.equals(modifyDate, warehouse.modifyDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, client, name, address, company, street1, street2, street3, city, state, zip, country, phone, locationBarcodePrefix, lpnPrefix, createDate, modifyDate);
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
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

