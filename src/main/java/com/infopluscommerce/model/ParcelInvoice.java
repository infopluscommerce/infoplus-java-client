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





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class ParcelInvoice   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String carrier = null;
  private String invoiceNo = null;
  private String accountNo = null;
  private Date invoiceDate = null;
  private BigDecimal invoiceAmount = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public ParcelInvoice createDate(Date createDate) {
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
  public ParcelInvoice modifyDate(Date modifyDate) {
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
  public ParcelInvoice carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  
  /**
   **/
  public ParcelInvoice invoiceNo(String invoiceNo) {
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
  public ParcelInvoice accountNo(String accountNo) {
    this.accountNo = accountNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("accountNo")
  public String getAccountNo() {
    return accountNo;
  }
  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  
  /**
   **/
  public ParcelInvoice invoiceDate(Date invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("invoiceDate")
  public Date getInvoiceDate() {
    return invoiceDate;
  }
  public void setInvoiceDate(Date invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  
  /**
   **/
  public ParcelInvoice invoiceAmount(BigDecimal invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("invoiceAmount")
  public BigDecimal getInvoiceAmount() {
    return invoiceAmount;
  }
  public void setInvoiceAmount(BigDecimal invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }

  
  /**
   **/
  public ParcelInvoice customFields(Map<String, Object> customFields) {
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
    ParcelInvoice parcelInvoice = (ParcelInvoice) o;
    return Objects.equals(this.id, parcelInvoice.id) &&
        Objects.equals(this.createDate, parcelInvoice.createDate) &&
        Objects.equals(this.modifyDate, parcelInvoice.modifyDate) &&
        Objects.equals(this.carrier, parcelInvoice.carrier) &&
        Objects.equals(this.invoiceNo, parcelInvoice.invoiceNo) &&
        Objects.equals(this.accountNo, parcelInvoice.accountNo) &&
        Objects.equals(this.invoiceDate, parcelInvoice.invoiceDate) &&
        Objects.equals(this.invoiceAmount, parcelInvoice.invoiceAmount) &&
        Objects.equals(this.customFields, parcelInvoice.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, carrier, invoiceNo, accountNo, invoiceDate, invoiceAmount, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelInvoice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
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

