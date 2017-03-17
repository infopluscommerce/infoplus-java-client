package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class Customer   {
  
  private Integer id = null;
  private Integer lobId = null;
  private String customerNo = null;
  private String name = null;
  private String attention = null;
  private String street = null;
  private String street2 = null;
  private String street3Province = null;
  private String city = null;
  private String state = null;
  private String zipCode = null;
  private String country = null;
  private String phone = null;
  private String fax = null;
  private String email = null;
  private String bossBranch = null;
  private Integer packageCarrierId = null;
  private Integer truckCarrierId = null;
  private Integer weightBreak = null;
  private String sector = null;
  private Integer division = null;
  private String costCenter = null;
  private String county = null;
  private String area = null;
  private String customerType = null;
  private String massLevel = null;
  private BigDecimal massFactor = null;
  private String priceLevel = null;
  private Date openDate = null;
  private Date closeDate = null;
  private Integer restrictionPercent = null;
  private String externalId = null;
  private Date cycleDate = null;
  private String manager = null;
  private Integer alternateInventory = null;
  private String pin = null;
  private String faxGone = null;
  private String residential = null;
  private String csrBranch = null;
  private String extrinsicText1 = null;
  private String extrinsicText2 = null;
  private String extrinsicText3 = null;
  private Integer extrinsicNumber1 = null;
  private Integer extrinsicNumber2 = null;
  private BigDecimal extrinsicDecimal1 = null;
  private BigDecimal extrinsicDecimal2 = null;
  private Date modifyDate = null;
  private Integer omsCustomerId = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public Customer lobId(Integer lobId) {
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
  public Customer customerNo(String customerNo) {
    this.customerNo = customerNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("customerNo")
  public String getCustomerNo() {
    return customerNo;
  }
  public void setCustomerNo(String customerNo) {
    this.customerNo = customerNo;
  }

  
  /**
   **/
  public Customer name(String name) {
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
  public Customer attention(String attention) {
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
  public Customer street(String street) {
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
  public Customer street2(String street2) {
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
  public Customer street3Province(String street3Province) {
    this.street3Province = street3Province;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("street3Province")
  public String getStreet3Province() {
    return street3Province;
  }
  public void setStreet3Province(String street3Province) {
    this.street3Province = street3Province;
  }

  
  /**
   **/
  public Customer city(String city) {
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
  public Customer state(String state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   **/
  public Customer zipCode(String zipCode) {
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
  public Customer country(String country) {
    this.country = country;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   **/
  public Customer phone(String phone) {
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
  public Customer fax(String fax) {
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
  public Customer email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  public Customer bossBranch(String bossBranch) {
    this.bossBranch = bossBranch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bossBranch")
  public String getBossBranch() {
    return bossBranch;
  }
  public void setBossBranch(String bossBranch) {
    this.bossBranch = bossBranch;
  }

  
  /**
   **/
  public Customer packageCarrierId(Integer packageCarrierId) {
    this.packageCarrierId = packageCarrierId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("packageCarrierId")
  public Integer getPackageCarrierId() {
    return packageCarrierId;
  }
  public void setPackageCarrierId(Integer packageCarrierId) {
    this.packageCarrierId = packageCarrierId;
  }

  
  /**
   **/
  public Customer truckCarrierId(Integer truckCarrierId) {
    this.truckCarrierId = truckCarrierId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("truckCarrierId")
  public Integer getTruckCarrierId() {
    return truckCarrierId;
  }
  public void setTruckCarrierId(Integer truckCarrierId) {
    this.truckCarrierId = truckCarrierId;
  }

  
  /**
   **/
  public Customer weightBreak(Integer weightBreak) {
    this.weightBreak = weightBreak;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("weightBreak")
  public Integer getWeightBreak() {
    return weightBreak;
  }
  public void setWeightBreak(Integer weightBreak) {
    this.weightBreak = weightBreak;
  }

  
  /**
   **/
  public Customer sector(String sector) {
    this.sector = sector;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sector")
  public String getSector() {
    return sector;
  }
  public void setSector(String sector) {
    this.sector = sector;
  }

  
  /**
   **/
  public Customer division(Integer division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public Integer getDivision() {
    return division;
  }
  public void setDivision(Integer division) {
    this.division = division;
  }

  
  /**
   **/
  public Customer costCenter(String costCenter) {
    this.costCenter = costCenter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("costCenter")
  public String getCostCenter() {
    return costCenter;
  }
  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }

  
  /**
   **/
  public Customer county(String county) {
    this.county = county;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("county")
  public String getCounty() {
    return county;
  }
  public void setCounty(String county) {
    this.county = county;
  }

  
  /**
   **/
  public Customer area(String area) {
    this.area = area;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("area")
  public String getArea() {
    return area;
  }
  public void setArea(String area) {
    this.area = area;
  }

  
  /**
   **/
  public Customer customerType(String customerType) {
    this.customerType = customerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerType")
  public String getCustomerType() {
    return customerType;
  }
  public void setCustomerType(String customerType) {
    this.customerType = customerType;
  }

  
  /**
   **/
  public Customer massLevel(String massLevel) {
    this.massLevel = massLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("massLevel")
  public String getMassLevel() {
    return massLevel;
  }
  public void setMassLevel(String massLevel) {
    this.massLevel = massLevel;
  }

  
  /**
   **/
  public Customer massFactor(BigDecimal massFactor) {
    this.massFactor = massFactor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("massFactor")
  public BigDecimal getMassFactor() {
    return massFactor;
  }
  public void setMassFactor(BigDecimal massFactor) {
    this.massFactor = massFactor;
  }

  
  /**
   **/
  public Customer priceLevel(String priceLevel) {
    this.priceLevel = priceLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("priceLevel")
  public String getPriceLevel() {
    return priceLevel;
  }
  public void setPriceLevel(String priceLevel) {
    this.priceLevel = priceLevel;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("openDate")
  public Date getOpenDate() {
    return openDate;
  }

  
  /**
   **/
  public Customer closeDate(Date closeDate) {
    this.closeDate = closeDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("closeDate")
  public Date getCloseDate() {
    return closeDate;
  }
  public void setCloseDate(Date closeDate) {
    this.closeDate = closeDate;
  }

  
  /**
   **/
  public Customer restrictionPercent(Integer restrictionPercent) {
    this.restrictionPercent = restrictionPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("restrictionPercent")
  public Integer getRestrictionPercent() {
    return restrictionPercent;
  }
  public void setRestrictionPercent(Integer restrictionPercent) {
    this.restrictionPercent = restrictionPercent;
  }

  
  /**
   **/
  public Customer externalId(String externalId) {
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
  public Customer cycleDate(Date cycleDate) {
    this.cycleDate = cycleDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cycleDate")
  public Date getCycleDate() {
    return cycleDate;
  }
  public void setCycleDate(Date cycleDate) {
    this.cycleDate = cycleDate;
  }

  
  /**
   **/
  public Customer manager(String manager) {
    this.manager = manager;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("manager")
  public String getManager() {
    return manager;
  }
  public void setManager(String manager) {
    this.manager = manager;
  }

  
  /**
   **/
  public Customer alternateInventory(Integer alternateInventory) {
    this.alternateInventory = alternateInventory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alternateInventory")
  public Integer getAlternateInventory() {
    return alternateInventory;
  }
  public void setAlternateInventory(Integer alternateInventory) {
    this.alternateInventory = alternateInventory;
  }

  
  /**
   **/
  public Customer pin(String pin) {
    this.pin = pin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pin")
  public String getPin() {
    return pin;
  }
  public void setPin(String pin) {
    this.pin = pin;
  }

  
  /**
   **/
  public Customer faxGone(String faxGone) {
    this.faxGone = faxGone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("faxGone")
  public String getFaxGone() {
    return faxGone;
  }
  public void setFaxGone(String faxGone) {
    this.faxGone = faxGone;
  }

  
  /**
   **/
  public Customer residential(String residential) {
    this.residential = residential;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("residential")
  public String getResidential() {
    return residential;
  }
  public void setResidential(String residential) {
    this.residential = residential;
  }

  
  /**
   **/
  public Customer csrBranch(String csrBranch) {
    this.csrBranch = csrBranch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("csrBranch")
  public String getCsrBranch() {
    return csrBranch;
  }
  public void setCsrBranch(String csrBranch) {
    this.csrBranch = csrBranch;
  }

  
  /**
   **/
  public Customer extrinsicText1(String extrinsicText1) {
    this.extrinsicText1 = extrinsicText1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicText1")
  public String getExtrinsicText1() {
    return extrinsicText1;
  }
  public void setExtrinsicText1(String extrinsicText1) {
    this.extrinsicText1 = extrinsicText1;
  }

  
  /**
   **/
  public Customer extrinsicText2(String extrinsicText2) {
    this.extrinsicText2 = extrinsicText2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicText2")
  public String getExtrinsicText2() {
    return extrinsicText2;
  }
  public void setExtrinsicText2(String extrinsicText2) {
    this.extrinsicText2 = extrinsicText2;
  }

  
  /**
   **/
  public Customer extrinsicText3(String extrinsicText3) {
    this.extrinsicText3 = extrinsicText3;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicText3")
  public String getExtrinsicText3() {
    return extrinsicText3;
  }
  public void setExtrinsicText3(String extrinsicText3) {
    this.extrinsicText3 = extrinsicText3;
  }

  
  /**
   **/
  public Customer extrinsicNumber1(Integer extrinsicNumber1) {
    this.extrinsicNumber1 = extrinsicNumber1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicNumber1")
  public Integer getExtrinsicNumber1() {
    return extrinsicNumber1;
  }
  public void setExtrinsicNumber1(Integer extrinsicNumber1) {
    this.extrinsicNumber1 = extrinsicNumber1;
  }

  
  /**
   **/
  public Customer extrinsicNumber2(Integer extrinsicNumber2) {
    this.extrinsicNumber2 = extrinsicNumber2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicNumber2")
  public Integer getExtrinsicNumber2() {
    return extrinsicNumber2;
  }
  public void setExtrinsicNumber2(Integer extrinsicNumber2) {
    this.extrinsicNumber2 = extrinsicNumber2;
  }

  
  /**
   **/
  public Customer extrinsicDecimal1(BigDecimal extrinsicDecimal1) {
    this.extrinsicDecimal1 = extrinsicDecimal1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicDecimal1")
  public BigDecimal getExtrinsicDecimal1() {
    return extrinsicDecimal1;
  }
  public void setExtrinsicDecimal1(BigDecimal extrinsicDecimal1) {
    this.extrinsicDecimal1 = extrinsicDecimal1;
  }

  
  /**
   **/
  public Customer extrinsicDecimal2(BigDecimal extrinsicDecimal2) {
    this.extrinsicDecimal2 = extrinsicDecimal2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicDecimal2")
  public BigDecimal getExtrinsicDecimal2() {
    return extrinsicDecimal2;
  }
  public void setExtrinsicDecimal2(BigDecimal extrinsicDecimal2) {
    this.extrinsicDecimal2 = extrinsicDecimal2;
  }

  
  /**
   **/
  public Customer modifyDate(Date modifyDate) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("omsCustomerId")
  public Integer getOmsCustomerId() {
    return omsCustomerId;
  }

  
  /**
   **/
  public Customer customFields(Map<String, Object> customFields) {
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
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.lobId, customer.lobId) &&
        Objects.equals(this.customerNo, customer.customerNo) &&
        Objects.equals(this.name, customer.name) &&
        Objects.equals(this.attention, customer.attention) &&
        Objects.equals(this.street, customer.street) &&
        Objects.equals(this.street2, customer.street2) &&
        Objects.equals(this.street3Province, customer.street3Province) &&
        Objects.equals(this.city, customer.city) &&
        Objects.equals(this.state, customer.state) &&
        Objects.equals(this.zipCode, customer.zipCode) &&
        Objects.equals(this.country, customer.country) &&
        Objects.equals(this.phone, customer.phone) &&
        Objects.equals(this.fax, customer.fax) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.bossBranch, customer.bossBranch) &&
        Objects.equals(this.packageCarrierId, customer.packageCarrierId) &&
        Objects.equals(this.truckCarrierId, customer.truckCarrierId) &&
        Objects.equals(this.weightBreak, customer.weightBreak) &&
        Objects.equals(this.sector, customer.sector) &&
        Objects.equals(this.division, customer.division) &&
        Objects.equals(this.costCenter, customer.costCenter) &&
        Objects.equals(this.county, customer.county) &&
        Objects.equals(this.area, customer.area) &&
        Objects.equals(this.customerType, customer.customerType) &&
        Objects.equals(this.massLevel, customer.massLevel) &&
        Objects.equals(this.massFactor, customer.massFactor) &&
        Objects.equals(this.priceLevel, customer.priceLevel) &&
        Objects.equals(this.openDate, customer.openDate) &&
        Objects.equals(this.closeDate, customer.closeDate) &&
        Objects.equals(this.restrictionPercent, customer.restrictionPercent) &&
        Objects.equals(this.externalId, customer.externalId) &&
        Objects.equals(this.cycleDate, customer.cycleDate) &&
        Objects.equals(this.manager, customer.manager) &&
        Objects.equals(this.alternateInventory, customer.alternateInventory) &&
        Objects.equals(this.pin, customer.pin) &&
        Objects.equals(this.faxGone, customer.faxGone) &&
        Objects.equals(this.residential, customer.residential) &&
        Objects.equals(this.csrBranch, customer.csrBranch) &&
        Objects.equals(this.extrinsicText1, customer.extrinsicText1) &&
        Objects.equals(this.extrinsicText2, customer.extrinsicText2) &&
        Objects.equals(this.extrinsicText3, customer.extrinsicText3) &&
        Objects.equals(this.extrinsicNumber1, customer.extrinsicNumber1) &&
        Objects.equals(this.extrinsicNumber2, customer.extrinsicNumber2) &&
        Objects.equals(this.extrinsicDecimal1, customer.extrinsicDecimal1) &&
        Objects.equals(this.extrinsicDecimal2, customer.extrinsicDecimal2) &&
        Objects.equals(this.modifyDate, customer.modifyDate) &&
        Objects.equals(this.omsCustomerId, customer.omsCustomerId) &&
        Objects.equals(this.customFields, customer.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lobId, customerNo, name, attention, street, street2, street3Province, city, state, zipCode, country, phone, fax, email, bossBranch, packageCarrierId, truckCarrierId, weightBreak, sector, division, costCenter, county, area, customerType, massLevel, massFactor, priceLevel, openDate, closeDate, restrictionPercent, externalId, cycleDate, manager, alternateInventory, pin, faxGone, residential, csrBranch, extrinsicText1, extrinsicText2, extrinsicText3, extrinsicNumber1, extrinsicNumber2, extrinsicDecimal1, extrinsicDecimal2, modifyDate, omsCustomerId, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    customerNo: ").append(toIndentedString(customerNo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    attention: ").append(toIndentedString(attention)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    street3Province: ").append(toIndentedString(street3Province)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    bossBranch: ").append(toIndentedString(bossBranch)).append("\n");
    sb.append("    packageCarrierId: ").append(toIndentedString(packageCarrierId)).append("\n");
    sb.append("    truckCarrierId: ").append(toIndentedString(truckCarrierId)).append("\n");
    sb.append("    weightBreak: ").append(toIndentedString(weightBreak)).append("\n");
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    massLevel: ").append(toIndentedString(massLevel)).append("\n");
    sb.append("    massFactor: ").append(toIndentedString(massFactor)).append("\n");
    sb.append("    priceLevel: ").append(toIndentedString(priceLevel)).append("\n");
    sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
    sb.append("    closeDate: ").append(toIndentedString(closeDate)).append("\n");
    sb.append("    restrictionPercent: ").append(toIndentedString(restrictionPercent)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    cycleDate: ").append(toIndentedString(cycleDate)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    alternateInventory: ").append(toIndentedString(alternateInventory)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    faxGone: ").append(toIndentedString(faxGone)).append("\n");
    sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
    sb.append("    csrBranch: ").append(toIndentedString(csrBranch)).append("\n");
    sb.append("    extrinsicText1: ").append(toIndentedString(extrinsicText1)).append("\n");
    sb.append("    extrinsicText2: ").append(toIndentedString(extrinsicText2)).append("\n");
    sb.append("    extrinsicText3: ").append(toIndentedString(extrinsicText3)).append("\n");
    sb.append("    extrinsicNumber1: ").append(toIndentedString(extrinsicNumber1)).append("\n");
    sb.append("    extrinsicNumber2: ").append(toIndentedString(extrinsicNumber2)).append("\n");
    sb.append("    extrinsicDecimal1: ").append(toIndentedString(extrinsicDecimal1)).append("\n");
    sb.append("    extrinsicDecimal2: ").append(toIndentedString(extrinsicDecimal2)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    omsCustomerId: ").append(toIndentedString(omsCustomerId)).append("\n");
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

