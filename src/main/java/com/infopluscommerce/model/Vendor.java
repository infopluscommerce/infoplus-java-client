package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class Vendor   {
  
  private Integer id = null;
  private Integer vendorNo = null;
  private Integer lobId = null;
  private String name = null;
  private String street = null;
  private String street2 = null;
  private String city = null;
  private String state = null;
  private String country = null;
  private String zipCode = null;
  private String contact = null;
  private String phone = null;
  private String fax = null;
  private String externalId = null;
  private String terms = null;
  private String fob = null;
  private Integer shipVia = null;
  private Integer requestDays = null;
  private Integer actualDays = null;
  private String salesTaxCode = null;
  private Integer product1 = null;
  private Integer product2 = null;
  private Integer product3 = null;
  private Integer product4 = null;
  private Integer product5 = null;
  private Integer product6 = null;
  private Integer product7 = null;
  private Integer product8 = null;
  private Integer product9 = null;
  private Integer podDays = null;
  private String chargeOut = null;
  private String arEmail = null;
  private String orderEmail = null;
  private String orderAttach = null;
  private String sendQuantityType = null;
  private String minority = null;
  private String sendOutside = null;
  private Integer podOrderSuffix = null;
  private String podEmail = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String inactive = null;

  
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
  @JsonProperty("vendorNo")
  public Integer getVendorNo() {
    return vendorNo;
  }
  public void setVendorNo(Integer vendorNo) {
    this.vendorNo = vendorNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }
  public void setLobId(Integer lobId) {
    this.lobId = lobId;
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("zipCode")
  public String getZipCode() {
    return zipCode;
  }
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contact")
  public String getContact() {
    return contact;
  }
  public void setContact(String contact) {
    this.contact = contact;
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
  @JsonProperty("fax")
  public String getFax() {
    return fax;
  }
  public void setFax(String fax) {
    this.fax = fax;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("terms")
  public String getTerms() {
    return terms;
  }
  public void setTerms(String terms) {
    this.terms = terms;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fob")
  public String getFob() {
    return fob;
  }
  public void setFob(String fob) {
    this.fob = fob;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipVia")
  public Integer getShipVia() {
    return shipVia;
  }
  public void setShipVia(Integer shipVia) {
    this.shipVia = shipVia;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("requestDays")
  public Integer getRequestDays() {
    return requestDays;
  }
  public void setRequestDays(Integer requestDays) {
    this.requestDays = requestDays;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("actualDays")
  public Integer getActualDays() {
    return actualDays;
  }
  public void setActualDays(Integer actualDays) {
    this.actualDays = actualDays;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("salesTaxCode")
  public String getSalesTaxCode() {
    return salesTaxCode;
  }
  public void setSalesTaxCode(String salesTaxCode) {
    this.salesTaxCode = salesTaxCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("product1")
  public Integer getProduct1() {
    return product1;
  }
  public void setProduct1(Integer product1) {
    this.product1 = product1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("product2")
  public Integer getProduct2() {
    return product2;
  }
  public void setProduct2(Integer product2) {
    this.product2 = product2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("product3")
  public Integer getProduct3() {
    return product3;
  }
  public void setProduct3(Integer product3) {
    this.product3 = product3;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("product4")
  public Integer getProduct4() {
    return product4;
  }
  public void setProduct4(Integer product4) {
    this.product4 = product4;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("product5")
  public Integer getProduct5() {
    return product5;
  }
  public void setProduct5(Integer product5) {
    this.product5 = product5;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("product6")
  public Integer getProduct6() {
    return product6;
  }
  public void setProduct6(Integer product6) {
    this.product6 = product6;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("product7")
  public Integer getProduct7() {
    return product7;
  }
  public void setProduct7(Integer product7) {
    this.product7 = product7;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("product8")
  public Integer getProduct8() {
    return product8;
  }
  public void setProduct8(Integer product8) {
    this.product8 = product8;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("product9")
  public Integer getProduct9() {
    return product9;
  }
  public void setProduct9(Integer product9) {
    this.product9 = product9;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("podDays")
  public Integer getPodDays() {
    return podDays;
  }
  public void setPodDays(Integer podDays) {
    this.podDays = podDays;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("chargeOut")
  public String getChargeOut() {
    return chargeOut;
  }
  public void setChargeOut(String chargeOut) {
    this.chargeOut = chargeOut;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("arEmail")
  public String getArEmail() {
    return arEmail;
  }
  public void setArEmail(String arEmail) {
    this.arEmail = arEmail;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderEmail")
  public String getOrderEmail() {
    return orderEmail;
  }
  public void setOrderEmail(String orderEmail) {
    this.orderEmail = orderEmail;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderAttach")
  public String getOrderAttach() {
    return orderAttach;
  }
  public void setOrderAttach(String orderAttach) {
    this.orderAttach = orderAttach;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sendQuantityType")
  public String getSendQuantityType() {
    return sendQuantityType;
  }
  public void setSendQuantityType(String sendQuantityType) {
    this.sendQuantityType = sendQuantityType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minority")
  public String getMinority() {
    return minority;
  }
  public void setMinority(String minority) {
    this.minority = minority;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sendOutside")
  public String getSendOutside() {
    return sendOutside;
  }
  public void setSendOutside(String sendOutside) {
    this.sendOutside = sendOutside;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("podOrderSuffix")
  public Integer getPodOrderSuffix() {
    return podOrderSuffix;
  }
  public void setPodOrderSuffix(Integer podOrderSuffix) {
    this.podOrderSuffix = podOrderSuffix;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("podEmail")
  public String getPodEmail() {
    return podEmail;
  }
  public void setPodEmail(String podEmail) {
    this.podEmail = podEmail;
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

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("inactive")
  public String getInactive() {
    return inactive;
  }
  public void setInactive(String inactive) {
    this.inactive = inactive;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vendor vendor = (Vendor) o;
    return Objects.equals(id, vendor.id) &&
        Objects.equals(vendorNo, vendor.vendorNo) &&
        Objects.equals(lobId, vendor.lobId) &&
        Objects.equals(name, vendor.name) &&
        Objects.equals(street, vendor.street) &&
        Objects.equals(street2, vendor.street2) &&
        Objects.equals(city, vendor.city) &&
        Objects.equals(state, vendor.state) &&
        Objects.equals(country, vendor.country) &&
        Objects.equals(zipCode, vendor.zipCode) &&
        Objects.equals(contact, vendor.contact) &&
        Objects.equals(phone, vendor.phone) &&
        Objects.equals(fax, vendor.fax) &&
        Objects.equals(externalId, vendor.externalId) &&
        Objects.equals(terms, vendor.terms) &&
        Objects.equals(fob, vendor.fob) &&
        Objects.equals(shipVia, vendor.shipVia) &&
        Objects.equals(requestDays, vendor.requestDays) &&
        Objects.equals(actualDays, vendor.actualDays) &&
        Objects.equals(salesTaxCode, vendor.salesTaxCode) &&
        Objects.equals(product1, vendor.product1) &&
        Objects.equals(product2, vendor.product2) &&
        Objects.equals(product3, vendor.product3) &&
        Objects.equals(product4, vendor.product4) &&
        Objects.equals(product5, vendor.product5) &&
        Objects.equals(product6, vendor.product6) &&
        Objects.equals(product7, vendor.product7) &&
        Objects.equals(product8, vendor.product8) &&
        Objects.equals(product9, vendor.product9) &&
        Objects.equals(podDays, vendor.podDays) &&
        Objects.equals(chargeOut, vendor.chargeOut) &&
        Objects.equals(arEmail, vendor.arEmail) &&
        Objects.equals(orderEmail, vendor.orderEmail) &&
        Objects.equals(orderAttach, vendor.orderAttach) &&
        Objects.equals(sendQuantityType, vendor.sendQuantityType) &&
        Objects.equals(minority, vendor.minority) &&
        Objects.equals(sendOutside, vendor.sendOutside) &&
        Objects.equals(podOrderSuffix, vendor.podOrderSuffix) &&
        Objects.equals(podEmail, vendor.podEmail) &&
        Objects.equals(createDate, vendor.createDate) &&
        Objects.equals(modifyDate, vendor.modifyDate) &&
        Objects.equals(inactive, vendor.inactive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vendorNo, lobId, name, street, street2, city, state, country, zipCode, contact, phone, fax, externalId, terms, fob, shipVia, requestDays, actualDays, salesTaxCode, product1, product2, product3, product4, product5, product6, product7, product8, product9, podDays, chargeOut, arEmail, orderEmail, orderAttach, sendQuantityType, minority, sendOutside, podOrderSuffix, podEmail, createDate, modifyDate, inactive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vendor {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vendorNo: ").append(toIndentedString(vendorNo)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    fob: ").append(toIndentedString(fob)).append("\n");
    sb.append("    shipVia: ").append(toIndentedString(shipVia)).append("\n");
    sb.append("    requestDays: ").append(toIndentedString(requestDays)).append("\n");
    sb.append("    actualDays: ").append(toIndentedString(actualDays)).append("\n");
    sb.append("    salesTaxCode: ").append(toIndentedString(salesTaxCode)).append("\n");
    sb.append("    product1: ").append(toIndentedString(product1)).append("\n");
    sb.append("    product2: ").append(toIndentedString(product2)).append("\n");
    sb.append("    product3: ").append(toIndentedString(product3)).append("\n");
    sb.append("    product4: ").append(toIndentedString(product4)).append("\n");
    sb.append("    product5: ").append(toIndentedString(product5)).append("\n");
    sb.append("    product6: ").append(toIndentedString(product6)).append("\n");
    sb.append("    product7: ").append(toIndentedString(product7)).append("\n");
    sb.append("    product8: ").append(toIndentedString(product8)).append("\n");
    sb.append("    product9: ").append(toIndentedString(product9)).append("\n");
    sb.append("    podDays: ").append(toIndentedString(podDays)).append("\n");
    sb.append("    chargeOut: ").append(toIndentedString(chargeOut)).append("\n");
    sb.append("    arEmail: ").append(toIndentedString(arEmail)).append("\n");
    sb.append("    orderEmail: ").append(toIndentedString(orderEmail)).append("\n");
    sb.append("    orderAttach: ").append(toIndentedString(orderAttach)).append("\n");
    sb.append("    sendQuantityType: ").append(toIndentedString(sendQuantityType)).append("\n");
    sb.append("    minority: ").append(toIndentedString(minority)).append("\n");
    sb.append("    sendOutside: ").append(toIndentedString(sendOutside)).append("\n");
    sb.append("    podOrderSuffix: ").append(toIndentedString(podOrderSuffix)).append("\n");
    sb.append("    podEmail: ").append(toIndentedString(podEmail)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    inactive: ").append(toIndentedString(inactive)).append("\n");
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

