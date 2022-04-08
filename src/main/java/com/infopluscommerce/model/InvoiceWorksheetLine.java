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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * InvoiceWorksheetLine
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-08T11:12:35.752-05:00")
public class InvoiceWorksheetLine {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("seqNo")
  private Integer seqNo = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("accountCode")
  private String accountCode = null;

  @SerializedName("department")
  private String department = null;

  @SerializedName("itemCode")
  private String itemCode = null;

  @SerializedName("quantity")
  private BigDecimal quantity = null;

  @SerializedName("chargeRate")
  private BigDecimal chargeRate = null;

  @SerializedName("extendedCharge")
  private BigDecimal extendedCharge = null;

  @SerializedName("backupFile")
  private Integer backupFile = null;

  @SerializedName("backupDocument")
  private String backupDocument = null;

  @SerializedName("invoiceWorksheetId")
  private Integer invoiceWorksheetId = null;

  @SerializedName("invoiceTemplateLineId")
  private Integer invoiceTemplateLineId = null;

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

  public InvoiceWorksheetLine lobId(Integer lobId) {
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

  public InvoiceWorksheetLine seqNo(Integer seqNo) {
    this.seqNo = seqNo;
    return this;
  }

   /**
   * Get seqNo
   * @return seqNo
  **/
  @ApiModelProperty(value = "")
  public Integer getSeqNo() {
    return seqNo;
  }

  public void setSeqNo(Integer seqNo) {
    this.seqNo = seqNo;
  }

  public InvoiceWorksheetLine description(String description) {
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

  public InvoiceWorksheetLine accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

   /**
   * Get accountCode
   * @return accountCode
  **/
  @ApiModelProperty(value = "")
  public String getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  public InvoiceWorksheetLine department(String department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @ApiModelProperty(value = "")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public InvoiceWorksheetLine itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

   /**
   * Get itemCode
   * @return itemCode
  **/
  @ApiModelProperty(value = "")
  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  public InvoiceWorksheetLine quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public InvoiceWorksheetLine chargeRate(BigDecimal chargeRate) {
    this.chargeRate = chargeRate;
    return this;
  }

   /**
   * Get chargeRate
   * @return chargeRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getChargeRate() {
    return chargeRate;
  }

  public void setChargeRate(BigDecimal chargeRate) {
    this.chargeRate = chargeRate;
  }

  public InvoiceWorksheetLine extendedCharge(BigDecimal extendedCharge) {
    this.extendedCharge = extendedCharge;
    return this;
  }

   /**
   * Get extendedCharge
   * @return extendedCharge
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getExtendedCharge() {
    return extendedCharge;
  }

  public void setExtendedCharge(BigDecimal extendedCharge) {
    this.extendedCharge = extendedCharge;
  }

  public InvoiceWorksheetLine backupFile(Integer backupFile) {
    this.backupFile = backupFile;
    return this;
  }

   /**
   * Get backupFile
   * @return backupFile
  **/
  @ApiModelProperty(value = "")
  public Integer getBackupFile() {
    return backupFile;
  }

  public void setBackupFile(Integer backupFile) {
    this.backupFile = backupFile;
  }

   /**
   * Get backupDocument
   * @return backupDocument
  **/
  @ApiModelProperty(value = "")
  public String getBackupDocument() {
    return backupDocument;
  }

  public InvoiceWorksheetLine invoiceWorksheetId(Integer invoiceWorksheetId) {
    this.invoiceWorksheetId = invoiceWorksheetId;
    return this;
  }

   /**
   * Get invoiceWorksheetId
   * @return invoiceWorksheetId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getInvoiceWorksheetId() {
    return invoiceWorksheetId;
  }

  public void setInvoiceWorksheetId(Integer invoiceWorksheetId) {
    this.invoiceWorksheetId = invoiceWorksheetId;
  }

  public InvoiceWorksheetLine invoiceTemplateLineId(Integer invoiceTemplateLineId) {
    this.invoiceTemplateLineId = invoiceTemplateLineId;
    return this;
  }

   /**
   * Get invoiceTemplateLineId
   * @return invoiceTemplateLineId
  **/
  @ApiModelProperty(value = "")
  public Integer getInvoiceTemplateLineId() {
    return invoiceTemplateLineId;
  }

  public void setInvoiceTemplateLineId(Integer invoiceTemplateLineId) {
    this.invoiceTemplateLineId = invoiceTemplateLineId;
  }

  public InvoiceWorksheetLine customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public InvoiceWorksheetLine putCustomFieldsItem(String key, Object customFieldsItem) {
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
        Objects.equals(this.backupDocument, invoiceWorksheetLine.backupDocument) &&
        Objects.equals(this.invoiceWorksheetId, invoiceWorksheetLine.invoiceWorksheetId) &&
        Objects.equals(this.invoiceTemplateLineId, invoiceWorksheetLine.invoiceTemplateLineId) &&
        Objects.equals(this.customFields, invoiceWorksheetLine.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, lobId, seqNo, description, accountCode, department, itemCode, quantity, chargeRate, extendedCharge, backupFile, backupDocument, invoiceWorksheetId, invoiceTemplateLineId, customFields);
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
    sb.append("    backupDocument: ").append(toIndentedString(backupDocument)).append("\n");
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

