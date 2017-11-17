package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class CustomerInvoiceTemplate   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String name = null;
  private String poNo = null;
  private String costCenter = null;
  private String description = null;
  private String notes = null;
  private String terms = null;
  private String specialInstructions = null;
  private Integer lobId = null;
  private String billingPeriod = null;
  private String remitToAttention = null;
  private String remitToCompany = null;
  private String remitToStreet = null;
  private String remitToStreet2 = null;
  private String remitToStreet3 = null;
  private String remitToCity = null;
  private String remitToState = null;
  private String remitToZip = null;
  private String remitToCountry = null;
  private String remitToPhone = null;
  private String remitToEmail = null;
  private String billToAttention = null;
  private String billToCompany = null;
  private String billToStreet = null;
  private String billToStreet2 = null;
  private String billToStreet3 = null;
  private String billToCity = null;
  private String billToState = null;
  private String billToZip = null;
  private String billToCountry = null;
  private String billToPhone = null;
  private String billToEmail = null;
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
  public CustomerInvoiceTemplate name(String name) {
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
  public CustomerInvoiceTemplate poNo(String poNo) {
    this.poNo = poNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("poNo")
  public String getPoNo() {
    return poNo;
  }
  public void setPoNo(String poNo) {
    this.poNo = poNo;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate costCenter(String costCenter) {
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
  public CustomerInvoiceTemplate description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate terms(String terms) {
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
  public CustomerInvoiceTemplate specialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("specialInstructions")
  public String getSpecialInstructions() {
    return specialInstructions;
  }
  public void setSpecialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate lobId(Integer lobId) {
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
  public CustomerInvoiceTemplate billingPeriod(String billingPeriod) {
    this.billingPeriod = billingPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("billingPeriod")
  public String getBillingPeriod() {
    return billingPeriod;
  }
  public void setBillingPeriod(String billingPeriod) {
    this.billingPeriod = billingPeriod;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate remitToAttention(String remitToAttention) {
    this.remitToAttention = remitToAttention;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remitToAttention")
  public String getRemitToAttention() {
    return remitToAttention;
  }
  public void setRemitToAttention(String remitToAttention) {
    this.remitToAttention = remitToAttention;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate remitToCompany(String remitToCompany) {
    this.remitToCompany = remitToCompany;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remitToCompany")
  public String getRemitToCompany() {
    return remitToCompany;
  }
  public void setRemitToCompany(String remitToCompany) {
    this.remitToCompany = remitToCompany;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate remitToStreet(String remitToStreet) {
    this.remitToStreet = remitToStreet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remitToStreet")
  public String getRemitToStreet() {
    return remitToStreet;
  }
  public void setRemitToStreet(String remitToStreet) {
    this.remitToStreet = remitToStreet;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate remitToStreet2(String remitToStreet2) {
    this.remitToStreet2 = remitToStreet2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remitToStreet2")
  public String getRemitToStreet2() {
    return remitToStreet2;
  }
  public void setRemitToStreet2(String remitToStreet2) {
    this.remitToStreet2 = remitToStreet2;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate remitToStreet3(String remitToStreet3) {
    this.remitToStreet3 = remitToStreet3;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remitToStreet3")
  public String getRemitToStreet3() {
    return remitToStreet3;
  }
  public void setRemitToStreet3(String remitToStreet3) {
    this.remitToStreet3 = remitToStreet3;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate remitToCity(String remitToCity) {
    this.remitToCity = remitToCity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remitToCity")
  public String getRemitToCity() {
    return remitToCity;
  }
  public void setRemitToCity(String remitToCity) {
    this.remitToCity = remitToCity;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate remitToState(String remitToState) {
    this.remitToState = remitToState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remitToState")
  public String getRemitToState() {
    return remitToState;
  }
  public void setRemitToState(String remitToState) {
    this.remitToState = remitToState;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate remitToZip(String remitToZip) {
    this.remitToZip = remitToZip;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remitToZip")
  public String getRemitToZip() {
    return remitToZip;
  }
  public void setRemitToZip(String remitToZip) {
    this.remitToZip = remitToZip;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate remitToCountry(String remitToCountry) {
    this.remitToCountry = remitToCountry;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remitToCountry")
  public String getRemitToCountry() {
    return remitToCountry;
  }
  public void setRemitToCountry(String remitToCountry) {
    this.remitToCountry = remitToCountry;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate remitToPhone(String remitToPhone) {
    this.remitToPhone = remitToPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remitToPhone")
  public String getRemitToPhone() {
    return remitToPhone;
  }
  public void setRemitToPhone(String remitToPhone) {
    this.remitToPhone = remitToPhone;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate remitToEmail(String remitToEmail) {
    this.remitToEmail = remitToEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("remitToEmail")
  public String getRemitToEmail() {
    return remitToEmail;
  }
  public void setRemitToEmail(String remitToEmail) {
    this.remitToEmail = remitToEmail;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate billToAttention(String billToAttention) {
    this.billToAttention = billToAttention;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billToAttention")
  public String getBillToAttention() {
    return billToAttention;
  }
  public void setBillToAttention(String billToAttention) {
    this.billToAttention = billToAttention;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate billToCompany(String billToCompany) {
    this.billToCompany = billToCompany;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billToCompany")
  public String getBillToCompany() {
    return billToCompany;
  }
  public void setBillToCompany(String billToCompany) {
    this.billToCompany = billToCompany;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate billToStreet(String billToStreet) {
    this.billToStreet = billToStreet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billToStreet")
  public String getBillToStreet() {
    return billToStreet;
  }
  public void setBillToStreet(String billToStreet) {
    this.billToStreet = billToStreet;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate billToStreet2(String billToStreet2) {
    this.billToStreet2 = billToStreet2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billToStreet2")
  public String getBillToStreet2() {
    return billToStreet2;
  }
  public void setBillToStreet2(String billToStreet2) {
    this.billToStreet2 = billToStreet2;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate billToStreet3(String billToStreet3) {
    this.billToStreet3 = billToStreet3;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billToStreet3")
  public String getBillToStreet3() {
    return billToStreet3;
  }
  public void setBillToStreet3(String billToStreet3) {
    this.billToStreet3 = billToStreet3;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate billToCity(String billToCity) {
    this.billToCity = billToCity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billToCity")
  public String getBillToCity() {
    return billToCity;
  }
  public void setBillToCity(String billToCity) {
    this.billToCity = billToCity;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate billToState(String billToState) {
    this.billToState = billToState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billToState")
  public String getBillToState() {
    return billToState;
  }
  public void setBillToState(String billToState) {
    this.billToState = billToState;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate billToZip(String billToZip) {
    this.billToZip = billToZip;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billToZip")
  public String getBillToZip() {
    return billToZip;
  }
  public void setBillToZip(String billToZip) {
    this.billToZip = billToZip;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate billToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billToCountry")
  public String getBillToCountry() {
    return billToCountry;
  }
  public void setBillToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate billToPhone(String billToPhone) {
    this.billToPhone = billToPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billToPhone")
  public String getBillToPhone() {
    return billToPhone;
  }
  public void setBillToPhone(String billToPhone) {
    this.billToPhone = billToPhone;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate billToEmail(String billToEmail) {
    this.billToEmail = billToEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billToEmail")
  public String getBillToEmail() {
    return billToEmail;
  }
  public void setBillToEmail(String billToEmail) {
    this.billToEmail = billToEmail;
  }

  
  /**
   **/
  public CustomerInvoiceTemplate customFields(Map<String, Object> customFields) {
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
    CustomerInvoiceTemplate customerInvoiceTemplate = (CustomerInvoiceTemplate) o;
    return Objects.equals(this.id, customerInvoiceTemplate.id) &&
        Objects.equals(this.createDate, customerInvoiceTemplate.createDate) &&
        Objects.equals(this.modifyDate, customerInvoiceTemplate.modifyDate) &&
        Objects.equals(this.name, customerInvoiceTemplate.name) &&
        Objects.equals(this.poNo, customerInvoiceTemplate.poNo) &&
        Objects.equals(this.costCenter, customerInvoiceTemplate.costCenter) &&
        Objects.equals(this.description, customerInvoiceTemplate.description) &&
        Objects.equals(this.notes, customerInvoiceTemplate.notes) &&
        Objects.equals(this.terms, customerInvoiceTemplate.terms) &&
        Objects.equals(this.specialInstructions, customerInvoiceTemplate.specialInstructions) &&
        Objects.equals(this.lobId, customerInvoiceTemplate.lobId) &&
        Objects.equals(this.billingPeriod, customerInvoiceTemplate.billingPeriod) &&
        Objects.equals(this.remitToAttention, customerInvoiceTemplate.remitToAttention) &&
        Objects.equals(this.remitToCompany, customerInvoiceTemplate.remitToCompany) &&
        Objects.equals(this.remitToStreet, customerInvoiceTemplate.remitToStreet) &&
        Objects.equals(this.remitToStreet2, customerInvoiceTemplate.remitToStreet2) &&
        Objects.equals(this.remitToStreet3, customerInvoiceTemplate.remitToStreet3) &&
        Objects.equals(this.remitToCity, customerInvoiceTemplate.remitToCity) &&
        Objects.equals(this.remitToState, customerInvoiceTemplate.remitToState) &&
        Objects.equals(this.remitToZip, customerInvoiceTemplate.remitToZip) &&
        Objects.equals(this.remitToCountry, customerInvoiceTemplate.remitToCountry) &&
        Objects.equals(this.remitToPhone, customerInvoiceTemplate.remitToPhone) &&
        Objects.equals(this.remitToEmail, customerInvoiceTemplate.remitToEmail) &&
        Objects.equals(this.billToAttention, customerInvoiceTemplate.billToAttention) &&
        Objects.equals(this.billToCompany, customerInvoiceTemplate.billToCompany) &&
        Objects.equals(this.billToStreet, customerInvoiceTemplate.billToStreet) &&
        Objects.equals(this.billToStreet2, customerInvoiceTemplate.billToStreet2) &&
        Objects.equals(this.billToStreet3, customerInvoiceTemplate.billToStreet3) &&
        Objects.equals(this.billToCity, customerInvoiceTemplate.billToCity) &&
        Objects.equals(this.billToState, customerInvoiceTemplate.billToState) &&
        Objects.equals(this.billToZip, customerInvoiceTemplate.billToZip) &&
        Objects.equals(this.billToCountry, customerInvoiceTemplate.billToCountry) &&
        Objects.equals(this.billToPhone, customerInvoiceTemplate.billToPhone) &&
        Objects.equals(this.billToEmail, customerInvoiceTemplate.billToEmail) &&
        Objects.equals(this.customFields, customerInvoiceTemplate.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, name, poNo, costCenter, description, notes, terms, specialInstructions, lobId, billingPeriod, remitToAttention, remitToCompany, remitToStreet, remitToStreet2, remitToStreet3, remitToCity, remitToState, remitToZip, remitToCountry, remitToPhone, remitToEmail, billToAttention, billToCompany, billToStreet, billToStreet2, billToStreet3, billToCity, billToState, billToZip, billToCountry, billToPhone, billToEmail, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerInvoiceTemplate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    poNo: ").append(toIndentedString(poNo)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    specialInstructions: ").append(toIndentedString(specialInstructions)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
    sb.append("    remitToAttention: ").append(toIndentedString(remitToAttention)).append("\n");
    sb.append("    remitToCompany: ").append(toIndentedString(remitToCompany)).append("\n");
    sb.append("    remitToStreet: ").append(toIndentedString(remitToStreet)).append("\n");
    sb.append("    remitToStreet2: ").append(toIndentedString(remitToStreet2)).append("\n");
    sb.append("    remitToStreet3: ").append(toIndentedString(remitToStreet3)).append("\n");
    sb.append("    remitToCity: ").append(toIndentedString(remitToCity)).append("\n");
    sb.append("    remitToState: ").append(toIndentedString(remitToState)).append("\n");
    sb.append("    remitToZip: ").append(toIndentedString(remitToZip)).append("\n");
    sb.append("    remitToCountry: ").append(toIndentedString(remitToCountry)).append("\n");
    sb.append("    remitToPhone: ").append(toIndentedString(remitToPhone)).append("\n");
    sb.append("    remitToEmail: ").append(toIndentedString(remitToEmail)).append("\n");
    sb.append("    billToAttention: ").append(toIndentedString(billToAttention)).append("\n");
    sb.append("    billToCompany: ").append(toIndentedString(billToCompany)).append("\n");
    sb.append("    billToStreet: ").append(toIndentedString(billToStreet)).append("\n");
    sb.append("    billToStreet2: ").append(toIndentedString(billToStreet2)).append("\n");
    sb.append("    billToStreet3: ").append(toIndentedString(billToStreet3)).append("\n");
    sb.append("    billToCity: ").append(toIndentedString(billToCity)).append("\n");
    sb.append("    billToState: ").append(toIndentedString(billToState)).append("\n");
    sb.append("    billToZip: ").append(toIndentedString(billToZip)).append("\n");
    sb.append("    billToCountry: ").append(toIndentedString(billToCountry)).append("\n");
    sb.append("    billToPhone: ").append(toIndentedString(billToPhone)).append("\n");
    sb.append("    billToEmail: ").append(toIndentedString(billToEmail)).append("\n");
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

