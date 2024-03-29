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
import com.infopluscommerce.model.CustomerInvoiceTemplateLine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * CustomerInvoiceTemplate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-16T13:04:33.234-06:00")
public class CustomerInvoiceTemplate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("poNo")
  private String poNo = null;

  @SerializedName("costCenter")
  private String costCenter = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("terms")
  private String terms = null;

  @SerializedName("specialInstructions")
  private String specialInstructions = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("billingPeriod")
  private String billingPeriod = null;

  @SerializedName("remitToAttention")
  private String remitToAttention = null;

  @SerializedName("remitToCompany")
  private String remitToCompany = null;

  @SerializedName("remitToStreet")
  private String remitToStreet = null;

  @SerializedName("remitToStreet2")
  private String remitToStreet2 = null;

  @SerializedName("remitToStreet3")
  private String remitToStreet3 = null;

  @SerializedName("remitToCity")
  private String remitToCity = null;

  @SerializedName("remitToState")
  private String remitToState = null;

  @SerializedName("remitToZip")
  private String remitToZip = null;

  @SerializedName("remitToCountry")
  private String remitToCountry = null;

  @SerializedName("remitToPhone")
  private String remitToPhone = null;

  @SerializedName("remitToEmail")
  private String remitToEmail = null;

  @SerializedName("billToAttention")
  private String billToAttention = null;

  @SerializedName("billToCompany")
  private String billToCompany = null;

  @SerializedName("billToStreet")
  private String billToStreet = null;

  @SerializedName("billToStreet2")
  private String billToStreet2 = null;

  @SerializedName("billToStreet3")
  private String billToStreet3 = null;

  @SerializedName("billToCity")
  private String billToCity = null;

  @SerializedName("billToState")
  private String billToState = null;

  @SerializedName("billToZip")
  private String billToZip = null;

  @SerializedName("billToCountry")
  private String billToCountry = null;

  @SerializedName("billToPhone")
  private String billToPhone = null;

  @SerializedName("billToEmail")
  private String billToEmail = null;

  @SerializedName("lineItems")
  private List<CustomerInvoiceTemplateLine> lineItems = null;

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

  public CustomerInvoiceTemplate name(String name) {
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

  public CustomerInvoiceTemplate poNo(String poNo) {
    this.poNo = poNo;
    return this;
  }

   /**
   * Get poNo
   * @return poNo
  **/
  @ApiModelProperty(value = "")
  public String getPoNo() {
    return poNo;
  }

  public void setPoNo(String poNo) {
    this.poNo = poNo;
  }

  public CustomerInvoiceTemplate costCenter(String costCenter) {
    this.costCenter = costCenter;
    return this;
  }

   /**
   * Get costCenter
   * @return costCenter
  **/
  @ApiModelProperty(value = "")
  public String getCostCenter() {
    return costCenter;
  }

  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }

  public CustomerInvoiceTemplate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomerInvoiceTemplate notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public CustomerInvoiceTemplate terms(String terms) {
    this.terms = terms;
    return this;
  }

   /**
   * Get terms
   * @return terms
  **/
  @ApiModelProperty(value = "")
  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  public CustomerInvoiceTemplate specialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
    return this;
  }

   /**
   * Get specialInstructions
   * @return specialInstructions
  **/
  @ApiModelProperty(value = "")
  public String getSpecialInstructions() {
    return specialInstructions;
  }

  public void setSpecialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
  }

  public CustomerInvoiceTemplate lobId(Integer lobId) {
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

  public CustomerInvoiceTemplate billingPeriod(String billingPeriod) {
    this.billingPeriod = billingPeriod;
    return this;
  }

   /**
   * Get billingPeriod
   * @return billingPeriod
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBillingPeriod() {
    return billingPeriod;
  }

  public void setBillingPeriod(String billingPeriod) {
    this.billingPeriod = billingPeriod;
  }

  public CustomerInvoiceTemplate remitToAttention(String remitToAttention) {
    this.remitToAttention = remitToAttention;
    return this;
  }

   /**
   * Get remitToAttention
   * @return remitToAttention
  **/
  @ApiModelProperty(value = "")
  public String getRemitToAttention() {
    return remitToAttention;
  }

  public void setRemitToAttention(String remitToAttention) {
    this.remitToAttention = remitToAttention;
  }

  public CustomerInvoiceTemplate remitToCompany(String remitToCompany) {
    this.remitToCompany = remitToCompany;
    return this;
  }

   /**
   * Get remitToCompany
   * @return remitToCompany
  **/
  @ApiModelProperty(value = "")
  public String getRemitToCompany() {
    return remitToCompany;
  }

  public void setRemitToCompany(String remitToCompany) {
    this.remitToCompany = remitToCompany;
  }

  public CustomerInvoiceTemplate remitToStreet(String remitToStreet) {
    this.remitToStreet = remitToStreet;
    return this;
  }

   /**
   * Get remitToStreet
   * @return remitToStreet
  **/
  @ApiModelProperty(value = "")
  public String getRemitToStreet() {
    return remitToStreet;
  }

  public void setRemitToStreet(String remitToStreet) {
    this.remitToStreet = remitToStreet;
  }

  public CustomerInvoiceTemplate remitToStreet2(String remitToStreet2) {
    this.remitToStreet2 = remitToStreet2;
    return this;
  }

   /**
   * Get remitToStreet2
   * @return remitToStreet2
  **/
  @ApiModelProperty(value = "")
  public String getRemitToStreet2() {
    return remitToStreet2;
  }

  public void setRemitToStreet2(String remitToStreet2) {
    this.remitToStreet2 = remitToStreet2;
  }

  public CustomerInvoiceTemplate remitToStreet3(String remitToStreet3) {
    this.remitToStreet3 = remitToStreet3;
    return this;
  }

   /**
   * Get remitToStreet3
   * @return remitToStreet3
  **/
  @ApiModelProperty(value = "")
  public String getRemitToStreet3() {
    return remitToStreet3;
  }

  public void setRemitToStreet3(String remitToStreet3) {
    this.remitToStreet3 = remitToStreet3;
  }

  public CustomerInvoiceTemplate remitToCity(String remitToCity) {
    this.remitToCity = remitToCity;
    return this;
  }

   /**
   * Get remitToCity
   * @return remitToCity
  **/
  @ApiModelProperty(value = "")
  public String getRemitToCity() {
    return remitToCity;
  }

  public void setRemitToCity(String remitToCity) {
    this.remitToCity = remitToCity;
  }

  public CustomerInvoiceTemplate remitToState(String remitToState) {
    this.remitToState = remitToState;
    return this;
  }

   /**
   * Get remitToState
   * @return remitToState
  **/
  @ApiModelProperty(value = "")
  public String getRemitToState() {
    return remitToState;
  }

  public void setRemitToState(String remitToState) {
    this.remitToState = remitToState;
  }

  public CustomerInvoiceTemplate remitToZip(String remitToZip) {
    this.remitToZip = remitToZip;
    return this;
  }

   /**
   * Get remitToZip
   * @return remitToZip
  **/
  @ApiModelProperty(value = "")
  public String getRemitToZip() {
    return remitToZip;
  }

  public void setRemitToZip(String remitToZip) {
    this.remitToZip = remitToZip;
  }

  public CustomerInvoiceTemplate remitToCountry(String remitToCountry) {
    this.remitToCountry = remitToCountry;
    return this;
  }

   /**
   * Get remitToCountry
   * @return remitToCountry
  **/
  @ApiModelProperty(value = "")
  public String getRemitToCountry() {
    return remitToCountry;
  }

  public void setRemitToCountry(String remitToCountry) {
    this.remitToCountry = remitToCountry;
  }

  public CustomerInvoiceTemplate remitToPhone(String remitToPhone) {
    this.remitToPhone = remitToPhone;
    return this;
  }

   /**
   * Get remitToPhone
   * @return remitToPhone
  **/
  @ApiModelProperty(value = "")
  public String getRemitToPhone() {
    return remitToPhone;
  }

  public void setRemitToPhone(String remitToPhone) {
    this.remitToPhone = remitToPhone;
  }

  public CustomerInvoiceTemplate remitToEmail(String remitToEmail) {
    this.remitToEmail = remitToEmail;
    return this;
  }

   /**
   * Get remitToEmail
   * @return remitToEmail
  **/
  @ApiModelProperty(value = "")
  public String getRemitToEmail() {
    return remitToEmail;
  }

  public void setRemitToEmail(String remitToEmail) {
    this.remitToEmail = remitToEmail;
  }

  public CustomerInvoiceTemplate billToAttention(String billToAttention) {
    this.billToAttention = billToAttention;
    return this;
  }

   /**
   * Get billToAttention
   * @return billToAttention
  **/
  @ApiModelProperty(value = "")
  public String getBillToAttention() {
    return billToAttention;
  }

  public void setBillToAttention(String billToAttention) {
    this.billToAttention = billToAttention;
  }

  public CustomerInvoiceTemplate billToCompany(String billToCompany) {
    this.billToCompany = billToCompany;
    return this;
  }

   /**
   * Get billToCompany
   * @return billToCompany
  **/
  @ApiModelProperty(value = "")
  public String getBillToCompany() {
    return billToCompany;
  }

  public void setBillToCompany(String billToCompany) {
    this.billToCompany = billToCompany;
  }

  public CustomerInvoiceTemplate billToStreet(String billToStreet) {
    this.billToStreet = billToStreet;
    return this;
  }

   /**
   * Get billToStreet
   * @return billToStreet
  **/
  @ApiModelProperty(value = "")
  public String getBillToStreet() {
    return billToStreet;
  }

  public void setBillToStreet(String billToStreet) {
    this.billToStreet = billToStreet;
  }

  public CustomerInvoiceTemplate billToStreet2(String billToStreet2) {
    this.billToStreet2 = billToStreet2;
    return this;
  }

   /**
   * Get billToStreet2
   * @return billToStreet2
  **/
  @ApiModelProperty(value = "")
  public String getBillToStreet2() {
    return billToStreet2;
  }

  public void setBillToStreet2(String billToStreet2) {
    this.billToStreet2 = billToStreet2;
  }

  public CustomerInvoiceTemplate billToStreet3(String billToStreet3) {
    this.billToStreet3 = billToStreet3;
    return this;
  }

   /**
   * Get billToStreet3
   * @return billToStreet3
  **/
  @ApiModelProperty(value = "")
  public String getBillToStreet3() {
    return billToStreet3;
  }

  public void setBillToStreet3(String billToStreet3) {
    this.billToStreet3 = billToStreet3;
  }

  public CustomerInvoiceTemplate billToCity(String billToCity) {
    this.billToCity = billToCity;
    return this;
  }

   /**
   * Get billToCity
   * @return billToCity
  **/
  @ApiModelProperty(value = "")
  public String getBillToCity() {
    return billToCity;
  }

  public void setBillToCity(String billToCity) {
    this.billToCity = billToCity;
  }

  public CustomerInvoiceTemplate billToState(String billToState) {
    this.billToState = billToState;
    return this;
  }

   /**
   * Get billToState
   * @return billToState
  **/
  @ApiModelProperty(value = "")
  public String getBillToState() {
    return billToState;
  }

  public void setBillToState(String billToState) {
    this.billToState = billToState;
  }

  public CustomerInvoiceTemplate billToZip(String billToZip) {
    this.billToZip = billToZip;
    return this;
  }

   /**
   * Get billToZip
   * @return billToZip
  **/
  @ApiModelProperty(value = "")
  public String getBillToZip() {
    return billToZip;
  }

  public void setBillToZip(String billToZip) {
    this.billToZip = billToZip;
  }

  public CustomerInvoiceTemplate billToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
    return this;
  }

   /**
   * Get billToCountry
   * @return billToCountry
  **/
  @ApiModelProperty(value = "")
  public String getBillToCountry() {
    return billToCountry;
  }

  public void setBillToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
  }

  public CustomerInvoiceTemplate billToPhone(String billToPhone) {
    this.billToPhone = billToPhone;
    return this;
  }

   /**
   * Get billToPhone
   * @return billToPhone
  **/
  @ApiModelProperty(value = "")
  public String getBillToPhone() {
    return billToPhone;
  }

  public void setBillToPhone(String billToPhone) {
    this.billToPhone = billToPhone;
  }

  public CustomerInvoiceTemplate billToEmail(String billToEmail) {
    this.billToEmail = billToEmail;
    return this;
  }

   /**
   * Get billToEmail
   * @return billToEmail
  **/
  @ApiModelProperty(value = "")
  public String getBillToEmail() {
    return billToEmail;
  }

  public void setBillToEmail(String billToEmail) {
    this.billToEmail = billToEmail;
  }

  public CustomerInvoiceTemplate lineItems(List<CustomerInvoiceTemplateLine> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public CustomerInvoiceTemplate addLineItemsItem(CustomerInvoiceTemplateLine lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<CustomerInvoiceTemplateLine>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<CustomerInvoiceTemplateLine> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<CustomerInvoiceTemplateLine> lineItems) {
    this.lineItems = lineItems;
  }

  public CustomerInvoiceTemplate customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public CustomerInvoiceTemplate putCustomFieldsItem(String key, Object customFieldsItem) {
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
        Objects.equals(this.lineItems, customerInvoiceTemplate.lineItems) &&
        Objects.equals(this.customFields, customerInvoiceTemplate.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, name, poNo, costCenter, description, notes, terms, specialInstructions, lobId, billingPeriod, remitToAttention, remitToCompany, remitToStreet, remitToStreet2, remitToStreet3, remitToCity, remitToState, remitToZip, remitToCountry, remitToPhone, remitToEmail, billToAttention, billToCompany, billToStreet, billToStreet2, billToStreet3, billToCity, billToState, billToZip, billToCountry, billToPhone, billToEmail, lineItems, customFields);
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
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
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

