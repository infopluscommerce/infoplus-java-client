package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.infopluscommerce.model.InvoiceWorksheetLine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class InvoiceWorksheet   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String name = null;
  private String invoiceNo = null;
  private String poNo = null;
  private String costCenter = null;
  private String description = null;
  private String notes = null;
  private String terms = null;
  private String specialInstructions = null;
  private BigDecimal total = null;
  private Integer lobId = null;
  private Integer customerInvoiceTemplateId = null;
  private Date startDate = null;
  private Date endDate = null;
  private Date issueDate = null;
  private String status = null;
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
  private List<InvoiceWorksheetLine> invoiceWorksheetLineItemList = new ArrayList<InvoiceWorksheetLine>();
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
  public InvoiceWorksheet name(String name) {
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
  public InvoiceWorksheet invoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("invoiceNo")
  public String getInvoiceNo() {
    return invoiceNo;
  }
  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  
  /**
   **/
  public InvoiceWorksheet poNo(String poNo) {
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
  public InvoiceWorksheet costCenter(String costCenter) {
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
  public InvoiceWorksheet description(String description) {
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
  public InvoiceWorksheet notes(String notes) {
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
  public InvoiceWorksheet terms(String terms) {
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
  public InvoiceWorksheet specialInstructions(String specialInstructions) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }

  
  /**
   **/
  public InvoiceWorksheet lobId(Integer lobId) {
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
  public InvoiceWorksheet customerInvoiceTemplateId(Integer customerInvoiceTemplateId) {
    this.customerInvoiceTemplateId = customerInvoiceTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerInvoiceTemplateId")
  public Integer getCustomerInvoiceTemplateId() {
    return customerInvoiceTemplateId;
  }
  public void setCustomerInvoiceTemplateId(Integer customerInvoiceTemplateId) {
    this.customerInvoiceTemplateId = customerInvoiceTemplateId;
  }

  
  /**
   **/
  public InvoiceWorksheet startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   **/
  public InvoiceWorksheet endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   **/
  public InvoiceWorksheet issueDate(Date issueDate) {
    this.issueDate = issueDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("issueDate")
  public Date getIssueDate() {
    return issueDate;
  }
  public void setIssueDate(Date issueDate) {
    this.issueDate = issueDate;
  }

  
  /**
   **/
  public InvoiceWorksheet status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  public InvoiceWorksheet remitToAttention(String remitToAttention) {
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
  public InvoiceWorksheet remitToCompany(String remitToCompany) {
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
  public InvoiceWorksheet remitToStreet(String remitToStreet) {
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
  public InvoiceWorksheet remitToStreet2(String remitToStreet2) {
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
  public InvoiceWorksheet remitToStreet3(String remitToStreet3) {
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
  public InvoiceWorksheet remitToCity(String remitToCity) {
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
  public InvoiceWorksheet remitToState(String remitToState) {
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
  public InvoiceWorksheet remitToZip(String remitToZip) {
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
  public InvoiceWorksheet remitToCountry(String remitToCountry) {
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
  public InvoiceWorksheet remitToPhone(String remitToPhone) {
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
  public InvoiceWorksheet remitToEmail(String remitToEmail) {
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
  public InvoiceWorksheet billToAttention(String billToAttention) {
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
  public InvoiceWorksheet billToCompany(String billToCompany) {
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
  public InvoiceWorksheet billToStreet(String billToStreet) {
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
  public InvoiceWorksheet billToStreet2(String billToStreet2) {
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
  public InvoiceWorksheet billToStreet3(String billToStreet3) {
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
  public InvoiceWorksheet billToCity(String billToCity) {
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
  public InvoiceWorksheet billToState(String billToState) {
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
  public InvoiceWorksheet billToZip(String billToZip) {
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
  public InvoiceWorksheet billToCountry(String billToCountry) {
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
  public InvoiceWorksheet billToPhone(String billToPhone) {
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
  public InvoiceWorksheet billToEmail(String billToEmail) {
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
  public InvoiceWorksheet invoiceWorksheetLineItemList(List<InvoiceWorksheetLine> invoiceWorksheetLineItemList) {
    this.invoiceWorksheetLineItemList = invoiceWorksheetLineItemList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("invoiceWorksheetLineItemList")
  public List<InvoiceWorksheetLine> getInvoiceWorksheetLineItemList() {
    return invoiceWorksheetLineItemList;
  }
  public void setInvoiceWorksheetLineItemList(List<InvoiceWorksheetLine> invoiceWorksheetLineItemList) {
    this.invoiceWorksheetLineItemList = invoiceWorksheetLineItemList;
  }

  
  /**
   **/
  public InvoiceWorksheet customFields(Map<String, Object> customFields) {
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
    InvoiceWorksheet invoiceWorksheet = (InvoiceWorksheet) o;
    return Objects.equals(this.id, invoiceWorksheet.id) &&
        Objects.equals(this.createDate, invoiceWorksheet.createDate) &&
        Objects.equals(this.modifyDate, invoiceWorksheet.modifyDate) &&
        Objects.equals(this.name, invoiceWorksheet.name) &&
        Objects.equals(this.invoiceNo, invoiceWorksheet.invoiceNo) &&
        Objects.equals(this.poNo, invoiceWorksheet.poNo) &&
        Objects.equals(this.costCenter, invoiceWorksheet.costCenter) &&
        Objects.equals(this.description, invoiceWorksheet.description) &&
        Objects.equals(this.notes, invoiceWorksheet.notes) &&
        Objects.equals(this.terms, invoiceWorksheet.terms) &&
        Objects.equals(this.specialInstructions, invoiceWorksheet.specialInstructions) &&
        Objects.equals(this.total, invoiceWorksheet.total) &&
        Objects.equals(this.lobId, invoiceWorksheet.lobId) &&
        Objects.equals(this.customerInvoiceTemplateId, invoiceWorksheet.customerInvoiceTemplateId) &&
        Objects.equals(this.startDate, invoiceWorksheet.startDate) &&
        Objects.equals(this.endDate, invoiceWorksheet.endDate) &&
        Objects.equals(this.issueDate, invoiceWorksheet.issueDate) &&
        Objects.equals(this.status, invoiceWorksheet.status) &&
        Objects.equals(this.remitToAttention, invoiceWorksheet.remitToAttention) &&
        Objects.equals(this.remitToCompany, invoiceWorksheet.remitToCompany) &&
        Objects.equals(this.remitToStreet, invoiceWorksheet.remitToStreet) &&
        Objects.equals(this.remitToStreet2, invoiceWorksheet.remitToStreet2) &&
        Objects.equals(this.remitToStreet3, invoiceWorksheet.remitToStreet3) &&
        Objects.equals(this.remitToCity, invoiceWorksheet.remitToCity) &&
        Objects.equals(this.remitToState, invoiceWorksheet.remitToState) &&
        Objects.equals(this.remitToZip, invoiceWorksheet.remitToZip) &&
        Objects.equals(this.remitToCountry, invoiceWorksheet.remitToCountry) &&
        Objects.equals(this.remitToPhone, invoiceWorksheet.remitToPhone) &&
        Objects.equals(this.remitToEmail, invoiceWorksheet.remitToEmail) &&
        Objects.equals(this.billToAttention, invoiceWorksheet.billToAttention) &&
        Objects.equals(this.billToCompany, invoiceWorksheet.billToCompany) &&
        Objects.equals(this.billToStreet, invoiceWorksheet.billToStreet) &&
        Objects.equals(this.billToStreet2, invoiceWorksheet.billToStreet2) &&
        Objects.equals(this.billToStreet3, invoiceWorksheet.billToStreet3) &&
        Objects.equals(this.billToCity, invoiceWorksheet.billToCity) &&
        Objects.equals(this.billToState, invoiceWorksheet.billToState) &&
        Objects.equals(this.billToZip, invoiceWorksheet.billToZip) &&
        Objects.equals(this.billToCountry, invoiceWorksheet.billToCountry) &&
        Objects.equals(this.billToPhone, invoiceWorksheet.billToPhone) &&
        Objects.equals(this.billToEmail, invoiceWorksheet.billToEmail) &&
        Objects.equals(this.invoiceWorksheetLineItemList, invoiceWorksheet.invoiceWorksheetLineItemList) &&
        Objects.equals(this.customFields, invoiceWorksheet.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, name, invoiceNo, poNo, costCenter, description, notes, terms, specialInstructions, total, lobId, customerInvoiceTemplateId, startDate, endDate, issueDate, status, remitToAttention, remitToCompany, remitToStreet, remitToStreet2, remitToStreet3, remitToCity, remitToState, remitToZip, remitToCountry, remitToPhone, remitToEmail, billToAttention, billToCompany, billToStreet, billToStreet2, billToStreet3, billToCity, billToState, billToZip, billToCountry, billToPhone, billToEmail, invoiceWorksheetLineItemList, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceWorksheet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
    sb.append("    poNo: ").append(toIndentedString(poNo)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    specialInstructions: ").append(toIndentedString(specialInstructions)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    customerInvoiceTemplateId: ").append(toIndentedString(customerInvoiceTemplateId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    sb.append("    invoiceWorksheetLineItemList: ").append(toIndentedString(invoiceWorksheetLineItemList)).append("\n");
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

