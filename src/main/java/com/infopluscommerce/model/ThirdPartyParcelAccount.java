package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
public class ThirdPartyParcelAccount   {
  
  private Integer id = null;
  private Integer lobId = null;
  private String carrier = null;
  private String accountNo = null;
  private String accountName = null;
  private String billingCompany = null;
  private String attention = null;
  private String street1 = null;
  private String street2 = null;
  private String street3 = null;
  private String city = null;
  private String state = null;
  private String country = null;
  private String zipCode = null;
  private String phone = null;
  private String active = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public ThirdPartyParcelAccount lobId(Integer lobId) {
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
  public ThirdPartyParcelAccount carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  
  /**
   **/
  public ThirdPartyParcelAccount accountNo(String accountNo) {
    this.accountNo = accountNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("accountNo")
  public String getAccountNo() {
    return accountNo;
  }
  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  
  /**
   **/
  public ThirdPartyParcelAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  
  /**
   **/
  public ThirdPartyParcelAccount billingCompany(String billingCompany) {
    this.billingCompany = billingCompany;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("billingCompany")
  public String getBillingCompany() {
    return billingCompany;
  }
  public void setBillingCompany(String billingCompany) {
    this.billingCompany = billingCompany;
  }

  
  /**
   **/
  public ThirdPartyParcelAccount attention(String attention) {
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
  public ThirdPartyParcelAccount street1(String street1) {
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
  public ThirdPartyParcelAccount street2(String street2) {
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
  public ThirdPartyParcelAccount street3(String street3) {
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
  public ThirdPartyParcelAccount city(String city) {
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
  public ThirdPartyParcelAccount state(String state) {
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
  public ThirdPartyParcelAccount country(String country) {
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
  public ThirdPartyParcelAccount zipCode(String zipCode) {
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
  public ThirdPartyParcelAccount phone(String phone) {
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
  public ThirdPartyParcelAccount active(String active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("active")
  public String getActive() {
    return active;
  }
  public void setActive(String active) {
    this.active = active;
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
  public ThirdPartyParcelAccount customFields(Map<String, Object> customFields) {
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
    ThirdPartyParcelAccount thirdPartyParcelAccount = (ThirdPartyParcelAccount) o;
    return Objects.equals(this.id, thirdPartyParcelAccount.id) &&
        Objects.equals(this.lobId, thirdPartyParcelAccount.lobId) &&
        Objects.equals(this.carrier, thirdPartyParcelAccount.carrier) &&
        Objects.equals(this.accountNo, thirdPartyParcelAccount.accountNo) &&
        Objects.equals(this.accountName, thirdPartyParcelAccount.accountName) &&
        Objects.equals(this.billingCompany, thirdPartyParcelAccount.billingCompany) &&
        Objects.equals(this.attention, thirdPartyParcelAccount.attention) &&
        Objects.equals(this.street1, thirdPartyParcelAccount.street1) &&
        Objects.equals(this.street2, thirdPartyParcelAccount.street2) &&
        Objects.equals(this.street3, thirdPartyParcelAccount.street3) &&
        Objects.equals(this.city, thirdPartyParcelAccount.city) &&
        Objects.equals(this.state, thirdPartyParcelAccount.state) &&
        Objects.equals(this.country, thirdPartyParcelAccount.country) &&
        Objects.equals(this.zipCode, thirdPartyParcelAccount.zipCode) &&
        Objects.equals(this.phone, thirdPartyParcelAccount.phone) &&
        Objects.equals(this.active, thirdPartyParcelAccount.active) &&
        Objects.equals(this.createDate, thirdPartyParcelAccount.createDate) &&
        Objects.equals(this.modifyDate, thirdPartyParcelAccount.modifyDate) &&
        Objects.equals(this.customFields, thirdPartyParcelAccount.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lobId, carrier, accountNo, accountName, billingCompany, attention, street1, street2, street3, city, state, country, zipCode, phone, active, createDate, modifyDate, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyParcelAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    billingCompany: ").append(toIndentedString(billingCompany)).append("\n");
    sb.append("    attention: ").append(toIndentedString(attention)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    street3: ").append(toIndentedString(street3)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

