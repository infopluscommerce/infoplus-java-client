package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
  @JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accountNo")
  public String getAccountNo() {
    return accountNo;
  }
  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("billingCompany")
  public String getBillingCompany() {
    return billingCompany;
  }
  public void setBillingCompany(String billingCompany) {
    this.billingCompany = billingCompany;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("attention")
  public String getAttention() {
    return attention;
  }
  public void setAttention(String attention) {
    this.attention = attention;
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
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("active")
  public String getActive() {
    return active;
  }
  public void setActive(String active) {
    this.active = active;
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
    ThirdPartyParcelAccount thirdPartyParcelAccount = (ThirdPartyParcelAccount) o;
    return Objects.equals(id, thirdPartyParcelAccount.id) &&
        Objects.equals(lobId, thirdPartyParcelAccount.lobId) &&
        Objects.equals(carrier, thirdPartyParcelAccount.carrier) &&
        Objects.equals(accountNo, thirdPartyParcelAccount.accountNo) &&
        Objects.equals(accountName, thirdPartyParcelAccount.accountName) &&
        Objects.equals(billingCompany, thirdPartyParcelAccount.billingCompany) &&
        Objects.equals(attention, thirdPartyParcelAccount.attention) &&
        Objects.equals(street1, thirdPartyParcelAccount.street1) &&
        Objects.equals(street2, thirdPartyParcelAccount.street2) &&
        Objects.equals(street3, thirdPartyParcelAccount.street3) &&
        Objects.equals(city, thirdPartyParcelAccount.city) &&
        Objects.equals(state, thirdPartyParcelAccount.state) &&
        Objects.equals(country, thirdPartyParcelAccount.country) &&
        Objects.equals(zipCode, thirdPartyParcelAccount.zipCode) &&
        Objects.equals(phone, thirdPartyParcelAccount.phone) &&
        Objects.equals(active, thirdPartyParcelAccount.active) &&
        Objects.equals(createDate, thirdPartyParcelAccount.createDate) &&
        Objects.equals(modifyDate, thirdPartyParcelAccount.modifyDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lobId, carrier, accountNo, accountName, billingCompany, attention, street1, street2, street3, city, state, country, zipCode, phone, active, createDate, modifyDate);
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

