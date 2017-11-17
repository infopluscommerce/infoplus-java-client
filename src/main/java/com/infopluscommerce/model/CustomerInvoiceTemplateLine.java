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
public class CustomerInvoiceTemplateLine   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer lobId = null;
  private String description = null;
  private Integer seqNo = null;
  private String accountCode = null;
  private Boolean active = false;
  private Boolean includeIfZero = false;
  private String department = null;
  private String itemCode = null;
  private Integer invoiceTemplateId = null;
  private Integer billingRuleId = null;
  private String priceLevelMode = null;
  private Integer scriptId = null;
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
  public CustomerInvoiceTemplateLine lobId(Integer lobId) {
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
  public CustomerInvoiceTemplateLine description(String description) {
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
  public CustomerInvoiceTemplateLine seqNo(Integer seqNo) {
    this.seqNo = seqNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("seqNo")
  public Integer getSeqNo() {
    return seqNo;
  }
  public void setSeqNo(Integer seqNo) {
    this.seqNo = seqNo;
  }

  
  /**
   **/
  public CustomerInvoiceTemplateLine accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("accountCode")
  public String getAccountCode() {
    return accountCode;
  }
  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  
  /**
   **/
  public CustomerInvoiceTemplateLine active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   **/
  public CustomerInvoiceTemplateLine includeIfZero(Boolean includeIfZero) {
    this.includeIfZero = includeIfZero;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("includeIfZero")
  public Boolean getIncludeIfZero() {
    return includeIfZero;
  }
  public void setIncludeIfZero(Boolean includeIfZero) {
    this.includeIfZero = includeIfZero;
  }

  
  /**
   **/
  public CustomerInvoiceTemplateLine department(String department) {
    this.department = department;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("department")
  public String getDepartment() {
    return department;
  }
  public void setDepartment(String department) {
    this.department = department;
  }

  
  /**
   **/
  public CustomerInvoiceTemplateLine itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemCode")
  public String getItemCode() {
    return itemCode;
  }
  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  
  /**
   **/
  public CustomerInvoiceTemplateLine invoiceTemplateId(Integer invoiceTemplateId) {
    this.invoiceTemplateId = invoiceTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("invoiceTemplateId")
  public Integer getInvoiceTemplateId() {
    return invoiceTemplateId;
  }
  public void setInvoiceTemplateId(Integer invoiceTemplateId) {
    this.invoiceTemplateId = invoiceTemplateId;
  }

  
  /**
   **/
  public CustomerInvoiceTemplateLine billingRuleId(Integer billingRuleId) {
    this.billingRuleId = billingRuleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("billingRuleId")
  public Integer getBillingRuleId() {
    return billingRuleId;
  }
  public void setBillingRuleId(Integer billingRuleId) {
    this.billingRuleId = billingRuleId;
  }

  
  /**
   **/
  public CustomerInvoiceTemplateLine priceLevelMode(String priceLevelMode) {
    this.priceLevelMode = priceLevelMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("priceLevelMode")
  public String getPriceLevelMode() {
    return priceLevelMode;
  }
  public void setPriceLevelMode(String priceLevelMode) {
    this.priceLevelMode = priceLevelMode;
  }

  
  /**
   **/
  public CustomerInvoiceTemplateLine scriptId(Integer scriptId) {
    this.scriptId = scriptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scriptId")
  public Integer getScriptId() {
    return scriptId;
  }
  public void setScriptId(Integer scriptId) {
    this.scriptId = scriptId;
  }

  
  /**
   **/
  public CustomerInvoiceTemplateLine customFields(Map<String, Object> customFields) {
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
    CustomerInvoiceTemplateLine customerInvoiceTemplateLine = (CustomerInvoiceTemplateLine) o;
    return Objects.equals(this.id, customerInvoiceTemplateLine.id) &&
        Objects.equals(this.createDate, customerInvoiceTemplateLine.createDate) &&
        Objects.equals(this.modifyDate, customerInvoiceTemplateLine.modifyDate) &&
        Objects.equals(this.lobId, customerInvoiceTemplateLine.lobId) &&
        Objects.equals(this.description, customerInvoiceTemplateLine.description) &&
        Objects.equals(this.seqNo, customerInvoiceTemplateLine.seqNo) &&
        Objects.equals(this.accountCode, customerInvoiceTemplateLine.accountCode) &&
        Objects.equals(this.active, customerInvoiceTemplateLine.active) &&
        Objects.equals(this.includeIfZero, customerInvoiceTemplateLine.includeIfZero) &&
        Objects.equals(this.department, customerInvoiceTemplateLine.department) &&
        Objects.equals(this.itemCode, customerInvoiceTemplateLine.itemCode) &&
        Objects.equals(this.invoiceTemplateId, customerInvoiceTemplateLine.invoiceTemplateId) &&
        Objects.equals(this.billingRuleId, customerInvoiceTemplateLine.billingRuleId) &&
        Objects.equals(this.priceLevelMode, customerInvoiceTemplateLine.priceLevelMode) &&
        Objects.equals(this.scriptId, customerInvoiceTemplateLine.scriptId) &&
        Objects.equals(this.customFields, customerInvoiceTemplateLine.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, lobId, description, seqNo, accountCode, active, includeIfZero, department, itemCode, invoiceTemplateId, billingRuleId, priceLevelMode, scriptId, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerInvoiceTemplateLine {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    seqNo: ").append(toIndentedString(seqNo)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    includeIfZero: ").append(toIndentedString(includeIfZero)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    invoiceTemplateId: ").append(toIndentedString(invoiceTemplateId)).append("\n");
    sb.append("    billingRuleId: ").append(toIndentedString(billingRuleId)).append("\n");
    sb.append("    priceLevelMode: ").append(toIndentedString(priceLevelMode)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
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

