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
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public Vendor vendorNo(Integer vendorNo) {
    this.vendorNo = vendorNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("vendorNo")
  public Integer getVendorNo() {
    return vendorNo;
  }
  public void setVendorNo(Integer vendorNo) {
    this.vendorNo = vendorNo;
  }

  
  /**
   **/
  public Vendor lobId(Integer lobId) {
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
  public Vendor name(String name) {
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
  public Vendor street(String street) {
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
  public Vendor street2(String street2) {
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
  public Vendor city(String city) {
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
  public Vendor state(String state) {
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
  public Vendor country(String country) {
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
  public Vendor zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("zipCode")
  public String getZipCode() {
    return zipCode;
  }
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  
  /**
   **/
  public Vendor contact(String contact) {
    this.contact = contact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contact")
  public String getContact() {
    return contact;
  }
  public void setContact(String contact) {
    this.contact = contact;
  }

  
  /**
   **/
  public Vendor phone(String phone) {
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
  public Vendor fax(String fax) {
    this.fax = fax;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fax")
  public String getFax() {
    return fax;
  }
  public void setFax(String fax) {
    this.fax = fax;
  }

  
  /**
   **/
  public Vendor externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  /**
   **/
  public Vendor terms(String terms) {
    this.terms = terms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("terms")
  public String getTerms() {
    return terms;
  }
  public void setTerms(String terms) {
    this.terms = terms;
  }

  
  /**
   **/
  public Vendor fob(String fob) {
    this.fob = fob;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fob")
  public String getFob() {
    return fob;
  }
  public void setFob(String fob) {
    this.fob = fob;
  }

  
  /**
   **/
  public Vendor shipVia(Integer shipVia) {
    this.shipVia = shipVia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipVia")
  public Integer getShipVia() {
    return shipVia;
  }
  public void setShipVia(Integer shipVia) {
    this.shipVia = shipVia;
  }

  
  /**
   **/
  public Vendor requestDays(Integer requestDays) {
    this.requestDays = requestDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requestDays")
  public Integer getRequestDays() {
    return requestDays;
  }
  public void setRequestDays(Integer requestDays) {
    this.requestDays = requestDays;
  }

  
  /**
   **/
  public Vendor actualDays(Integer actualDays) {
    this.actualDays = actualDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actualDays")
  public Integer getActualDays() {
    return actualDays;
  }
  public void setActualDays(Integer actualDays) {
    this.actualDays = actualDays;
  }

  
  /**
   **/
  public Vendor salesTaxCode(String salesTaxCode) {
    this.salesTaxCode = salesTaxCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("salesTaxCode")
  public String getSalesTaxCode() {
    return salesTaxCode;
  }
  public void setSalesTaxCode(String salesTaxCode) {
    this.salesTaxCode = salesTaxCode;
  }

  
  /**
   **/
  public Vendor product1(Integer product1) {
    this.product1 = product1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("product1")
  public Integer getProduct1() {
    return product1;
  }
  public void setProduct1(Integer product1) {
    this.product1 = product1;
  }

  
  /**
   **/
  public Vendor product2(Integer product2) {
    this.product2 = product2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("product2")
  public Integer getProduct2() {
    return product2;
  }
  public void setProduct2(Integer product2) {
    this.product2 = product2;
  }

  
  /**
   **/
  public Vendor product3(Integer product3) {
    this.product3 = product3;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("product3")
  public Integer getProduct3() {
    return product3;
  }
  public void setProduct3(Integer product3) {
    this.product3 = product3;
  }

  
  /**
   **/
  public Vendor product4(Integer product4) {
    this.product4 = product4;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("product4")
  public Integer getProduct4() {
    return product4;
  }
  public void setProduct4(Integer product4) {
    this.product4 = product4;
  }

  
  /**
   **/
  public Vendor product5(Integer product5) {
    this.product5 = product5;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("product5")
  public Integer getProduct5() {
    return product5;
  }
  public void setProduct5(Integer product5) {
    this.product5 = product5;
  }

  
  /**
   **/
  public Vendor product6(Integer product6) {
    this.product6 = product6;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("product6")
  public Integer getProduct6() {
    return product6;
  }
  public void setProduct6(Integer product6) {
    this.product6 = product6;
  }

  
  /**
   **/
  public Vendor product7(Integer product7) {
    this.product7 = product7;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("product7")
  public Integer getProduct7() {
    return product7;
  }
  public void setProduct7(Integer product7) {
    this.product7 = product7;
  }

  
  /**
   **/
  public Vendor product8(Integer product8) {
    this.product8 = product8;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("product8")
  public Integer getProduct8() {
    return product8;
  }
  public void setProduct8(Integer product8) {
    this.product8 = product8;
  }

  
  /**
   **/
  public Vendor product9(Integer product9) {
    this.product9 = product9;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("product9")
  public Integer getProduct9() {
    return product9;
  }
  public void setProduct9(Integer product9) {
    this.product9 = product9;
  }

  
  /**
   **/
  public Vendor podDays(Integer podDays) {
    this.podDays = podDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("podDays")
  public Integer getPodDays() {
    return podDays;
  }
  public void setPodDays(Integer podDays) {
    this.podDays = podDays;
  }

  
  /**
   **/
  public Vendor chargeOut(String chargeOut) {
    this.chargeOut = chargeOut;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chargeOut")
  public String getChargeOut() {
    return chargeOut;
  }
  public void setChargeOut(String chargeOut) {
    this.chargeOut = chargeOut;
  }

  
  /**
   **/
  public Vendor arEmail(String arEmail) {
    this.arEmail = arEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("arEmail")
  public String getArEmail() {
    return arEmail;
  }
  public void setArEmail(String arEmail) {
    this.arEmail = arEmail;
  }

  
  /**
   **/
  public Vendor orderEmail(String orderEmail) {
    this.orderEmail = orderEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderEmail")
  public String getOrderEmail() {
    return orderEmail;
  }
  public void setOrderEmail(String orderEmail) {
    this.orderEmail = orderEmail;
  }

  
  /**
   **/
  public Vendor orderAttach(String orderAttach) {
    this.orderAttach = orderAttach;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderAttach")
  public String getOrderAttach() {
    return orderAttach;
  }
  public void setOrderAttach(String orderAttach) {
    this.orderAttach = orderAttach;
  }

  
  /**
   **/
  public Vendor sendQuantityType(String sendQuantityType) {
    this.sendQuantityType = sendQuantityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sendQuantityType")
  public String getSendQuantityType() {
    return sendQuantityType;
  }
  public void setSendQuantityType(String sendQuantityType) {
    this.sendQuantityType = sendQuantityType;
  }

  
  /**
   **/
  public Vendor minority(String minority) {
    this.minority = minority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minority")
  public String getMinority() {
    return minority;
  }
  public void setMinority(String minority) {
    this.minority = minority;
  }

  
  /**
   **/
  public Vendor sendOutside(String sendOutside) {
    this.sendOutside = sendOutside;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sendOutside")
  public String getSendOutside() {
    return sendOutside;
  }
  public void setSendOutside(String sendOutside) {
    this.sendOutside = sendOutside;
  }

  
  /**
   **/
  public Vendor podOrderSuffix(Integer podOrderSuffix) {
    this.podOrderSuffix = podOrderSuffix;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("podOrderSuffix")
  public Integer getPodOrderSuffix() {
    return podOrderSuffix;
  }
  public void setPodOrderSuffix(Integer podOrderSuffix) {
    this.podOrderSuffix = podOrderSuffix;
  }

  
  /**
   **/
  public Vendor podEmail(String podEmail) {
    this.podEmail = podEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("podEmail")
  public String getPodEmail() {
    return podEmail;
  }
  public void setPodEmail(String podEmail) {
    this.podEmail = podEmail;
  }

  
  /**
   **/
  public Vendor createDate(Date createDate) {
    this.createDate = createDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  
  /**
   **/
  public Vendor modifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }
  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

  
  /**
   **/
  public Vendor inactive(String inactive) {
    this.inactive = inactive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("inactive")
  public String getInactive() {
    return inactive;
  }
  public void setInactive(String inactive) {
    this.inactive = inactive;
  }

  
  /**
   **/
  public Vendor customFields(Map<String, Object> customFields) {
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
    Vendor vendor = (Vendor) o;
    return Objects.equals(this.id, vendor.id) &&
        Objects.equals(this.vendorNo, vendor.vendorNo) &&
        Objects.equals(this.lobId, vendor.lobId) &&
        Objects.equals(this.name, vendor.name) &&
        Objects.equals(this.street, vendor.street) &&
        Objects.equals(this.street2, vendor.street2) &&
        Objects.equals(this.city, vendor.city) &&
        Objects.equals(this.state, vendor.state) &&
        Objects.equals(this.country, vendor.country) &&
        Objects.equals(this.zipCode, vendor.zipCode) &&
        Objects.equals(this.contact, vendor.contact) &&
        Objects.equals(this.phone, vendor.phone) &&
        Objects.equals(this.fax, vendor.fax) &&
        Objects.equals(this.externalId, vendor.externalId) &&
        Objects.equals(this.terms, vendor.terms) &&
        Objects.equals(this.fob, vendor.fob) &&
        Objects.equals(this.shipVia, vendor.shipVia) &&
        Objects.equals(this.requestDays, vendor.requestDays) &&
        Objects.equals(this.actualDays, vendor.actualDays) &&
        Objects.equals(this.salesTaxCode, vendor.salesTaxCode) &&
        Objects.equals(this.product1, vendor.product1) &&
        Objects.equals(this.product2, vendor.product2) &&
        Objects.equals(this.product3, vendor.product3) &&
        Objects.equals(this.product4, vendor.product4) &&
        Objects.equals(this.product5, vendor.product5) &&
        Objects.equals(this.product6, vendor.product6) &&
        Objects.equals(this.product7, vendor.product7) &&
        Objects.equals(this.product8, vendor.product8) &&
        Objects.equals(this.product9, vendor.product9) &&
        Objects.equals(this.podDays, vendor.podDays) &&
        Objects.equals(this.chargeOut, vendor.chargeOut) &&
        Objects.equals(this.arEmail, vendor.arEmail) &&
        Objects.equals(this.orderEmail, vendor.orderEmail) &&
        Objects.equals(this.orderAttach, vendor.orderAttach) &&
        Objects.equals(this.sendQuantityType, vendor.sendQuantityType) &&
        Objects.equals(this.minority, vendor.minority) &&
        Objects.equals(this.sendOutside, vendor.sendOutside) &&
        Objects.equals(this.podOrderSuffix, vendor.podOrderSuffix) &&
        Objects.equals(this.podEmail, vendor.podEmail) &&
        Objects.equals(this.createDate, vendor.createDate) &&
        Objects.equals(this.modifyDate, vendor.modifyDate) &&
        Objects.equals(this.inactive, vendor.inactive) &&
        Objects.equals(this.customFields, vendor.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vendorNo, lobId, name, street, street2, city, state, country, zipCode, contact, phone, fax, externalId, terms, fob, shipVia, requestDays, actualDays, salesTaxCode, product1, product2, product3, product4, product5, product6, product7, product8, product9, podDays, chargeOut, arEmail, orderEmail, orderAttach, sendQuantityType, minority, sendOutside, podOrderSuffix, podEmail, createDate, modifyDate, inactive, customFields);
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

