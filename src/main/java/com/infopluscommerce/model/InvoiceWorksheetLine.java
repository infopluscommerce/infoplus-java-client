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





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class InvoiceWorksheetLine   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer lobId = null;
  private Integer seqNo = null;
  private String description = null;
  private String accountCode = null;
  private String department = null;
  private String itemCode = null;
  private BigDecimal quantity = null;
  private BigDecimal chargeRate = null;
  private BigDecimal extendedCharge = null;
  private Integer backupFile = null;
  private String backupFileUrl = null;
  private Integer invoiceWorksheetId = null;
  private Integer invoiceTemplateLineId = null;
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
  public InvoiceWorksheetLine lobId(Integer lobId) {
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
  public InvoiceWorksheetLine seqNo(Integer seqNo) {
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
  public InvoiceWorksheetLine description(String description) {
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
  public InvoiceWorksheetLine accountCode(String accountCode) {
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
  public InvoiceWorksheetLine department(String department) {
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
  public InvoiceWorksheetLine itemCode(String itemCode) {
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
  public InvoiceWorksheetLine quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quantity")
  public BigDecimal getQuantity() {
    return quantity;
  }
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  
  /**
   **/
  public InvoiceWorksheetLine chargeRate(BigDecimal chargeRate) {
    this.chargeRate = chargeRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chargeRate")
  public BigDecimal getChargeRate() {
    return chargeRate;
  }
  public void setChargeRate(BigDecimal chargeRate) {
    this.chargeRate = chargeRate;
  }

  
  /**
   **/
  public InvoiceWorksheetLine extendedCharge(BigDecimal extendedCharge) {
    this.extendedCharge = extendedCharge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extendedCharge")
  public BigDecimal getExtendedCharge() {
    return extendedCharge;
  }
  public void setExtendedCharge(BigDecimal extendedCharge) {
    this.extendedCharge = extendedCharge;
  }

  
  /**
   **/
  public InvoiceWorksheetLine backupFile(Integer backupFile) {
    this.backupFile = backupFile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("backupFile")
  public Integer getBackupFile() {
    return backupFile;
  }
  public void setBackupFile(Integer backupFile) {
    this.backupFile = backupFile;
  }

  
  /**
   **/
  public InvoiceWorksheetLine backupFileUrl(String backupFileUrl) {
    this.backupFileUrl = backupFileUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("backupFileUrl")
  public String getBackupFileUrl() {
    return backupFileUrl;
  }
  public void setBackupFileUrl(String backupFileUrl) {
    this.backupFileUrl = backupFileUrl;
  }

  
  /**
   **/
  public InvoiceWorksheetLine invoiceWorksheetId(Integer invoiceWorksheetId) {
    this.invoiceWorksheetId = invoiceWorksheetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("invoiceWorksheetId")
  public Integer getInvoiceWorksheetId() {
    return invoiceWorksheetId;
  }
  public void setInvoiceWorksheetId(Integer invoiceWorksheetId) {
    this.invoiceWorksheetId = invoiceWorksheetId;
  }

  
  /**
   **/
  public InvoiceWorksheetLine invoiceTemplateLineId(Integer invoiceTemplateLineId) {
    this.invoiceTemplateLineId = invoiceTemplateLineId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("invoiceTemplateLineId")
  public Integer getInvoiceTemplateLineId() {
    return invoiceTemplateLineId;
  }
  public void setInvoiceTemplateLineId(Integer invoiceTemplateLineId) {
    this.invoiceTemplateLineId = invoiceTemplateLineId;
  }

  
  /**
   **/
  public InvoiceWorksheetLine customFields(Map<String, Object> customFields) {
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
    InvoiceWorksheetLine invoiceWorksheetLine = (InvoiceWorksheetLine) o;
    return Objects.equals(this.id, invoiceWorksheetLine.id) &&
        Objects.equals(this.createDate, invoiceWorksheetLine.createDate) &&
        Objects.equals(this.modifyDate, invoiceWorksheetLine.modifyDate) &&
        Objects.equals(this.lobId, invoiceWorksheetLine.lobId) &&
        Objects.equals(this.seqNo, invoiceWorksheetLine.seqNo) &&
        Objects.equals(this.description, invoiceWorksheetLine.description) &&
        Objects.equals(this.accountCode, invoiceWorksheetLine.accountCode) &&
        Objects.equals(this.department, invoiceWorksheetLine.department) &&
        Objects.equals(this.itemCode, invoiceWorksheetLine.itemCode) &&
        Objects.equals(this.quantity, invoiceWorksheetLine.quantity) &&
        Objects.equals(this.chargeRate, invoiceWorksheetLine.chargeRate) &&
        Objects.equals(this.extendedCharge, invoiceWorksheetLine.extendedCharge) &&
        Objects.equals(this.backupFile, invoiceWorksheetLine.backupFile) &&
        Objects.equals(this.backupFileUrl, invoiceWorksheetLine.backupFileUrl) &&
        Objects.equals(this.invoiceWorksheetId, invoiceWorksheetLine.invoiceWorksheetId) &&
        Objects.equals(this.invoiceTemplateLineId, invoiceWorksheetLine.invoiceTemplateLineId) &&
        Objects.equals(this.customFields, invoiceWorksheetLine.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, lobId, seqNo, description, accountCode, department, itemCode, quantity, chargeRate, extendedCharge, backupFile, backupFileUrl, invoiceWorksheetId, invoiceTemplateLineId, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceWorksheetLine {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    seqNo: ").append(toIndentedString(seqNo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    chargeRate: ").append(toIndentedString(chargeRate)).append("\n");
    sb.append("    extendedCharge: ").append(toIndentedString(extendedCharge)).append("\n");
    sb.append("    backupFile: ").append(toIndentedString(backupFile)).append("\n");
    sb.append("    backupFileUrl: ").append(toIndentedString(backupFileUrl)).append("\n");
    sb.append("    invoiceWorksheetId: ").append(toIndentedString(invoiceWorksheetId)).append("\n");
    sb.append("    invoiceTemplateLineId: ").append(toIndentedString(invoiceTemplateLineId)).append("\n");
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

