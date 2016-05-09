package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.infopluscommerce.model.ItemReceipt;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class Asn   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer lobId = null;
  private String poNo = null;
  private Integer vendorId = null;
  private Integer warehouseId = null;
  private Date orderDate = null;
  private String type = null;
  private String billingName = null;
  private String billingAttention = null;
  private String billingStreet1 = null;
  private String billingStreet2 = null;
  private String billingCity = null;
  private String billingState = null;
  private String billingZipCode = null;
  private String billingPhone = null;
  private String shipToName = null;
  private String shipToAddress = null;
  private String shipToStreet1 = null;
  private String shipToStreet2 = null;
  private String shipToCity = null;
  private String shipToState = null;
  private String shipToZipCode = null;
  private String shipToPhone = null;
  private String corporateName = null;
  private String corporateAttention = null;
  private String corporateStreet1 = null;
  private String corporateStreet2 = null;
  private String corporateCity = null;
  private String corporateState = null;
  private String corporateZipCode = null;
  private String accountCode = null;
  private Integer buyer = null;
  private Integer carrier = null;
  private String confTo = null;
  private String fob = null;
  private String printed = null;
  private Integer projectNo = null;
  private String remarks = null;
  private String requestBy = null;
  private String terms = null;
  private String usedBy = null;
  private List<ItemReceipt> lineItems = new ArrayList<ItemReceipt>();
  private String status = null;

  
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
  @JsonProperty("poNo")
  public String getPoNo() {
    return poNo;
  }
  public void setPoNo(String poNo) {
    this.poNo = poNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("vendorId")
  public Integer getVendorId() {
    return vendorId;
  }
  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("orderDate")
  public Date getOrderDate() {
    return orderDate;
  }
  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billingName")
  public String getBillingName() {
    return billingName;
  }
  public void setBillingName(String billingName) {
    this.billingName = billingName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billingAttention")
  public String getBillingAttention() {
    return billingAttention;
  }
  public void setBillingAttention(String billingAttention) {
    this.billingAttention = billingAttention;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billingStreet1")
  public String getBillingStreet1() {
    return billingStreet1;
  }
  public void setBillingStreet1(String billingStreet1) {
    this.billingStreet1 = billingStreet1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billingStreet2")
  public String getBillingStreet2() {
    return billingStreet2;
  }
  public void setBillingStreet2(String billingStreet2) {
    this.billingStreet2 = billingStreet2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billingCity")
  public String getBillingCity() {
    return billingCity;
  }
  public void setBillingCity(String billingCity) {
    this.billingCity = billingCity;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billingState")
  public String getBillingState() {
    return billingState;
  }
  public void setBillingState(String billingState) {
    this.billingState = billingState;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billingZipCode")
  public String getBillingZipCode() {
    return billingZipCode;
  }
  public void setBillingZipCode(String billingZipCode) {
    this.billingZipCode = billingZipCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billingPhone")
  public String getBillingPhone() {
    return billingPhone;
  }
  public void setBillingPhone(String billingPhone) {
    this.billingPhone = billingPhone;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipToName")
  public String getShipToName() {
    return shipToName;
  }
  public void setShipToName(String shipToName) {
    this.shipToName = shipToName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipToAddress")
  public String getShipToAddress() {
    return shipToAddress;
  }
  public void setShipToAddress(String shipToAddress) {
    this.shipToAddress = shipToAddress;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipToStreet1")
  public String getShipToStreet1() {
    return shipToStreet1;
  }
  public void setShipToStreet1(String shipToStreet1) {
    this.shipToStreet1 = shipToStreet1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipToStreet2")
  public String getShipToStreet2() {
    return shipToStreet2;
  }
  public void setShipToStreet2(String shipToStreet2) {
    this.shipToStreet2 = shipToStreet2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipToCity")
  public String getShipToCity() {
    return shipToCity;
  }
  public void setShipToCity(String shipToCity) {
    this.shipToCity = shipToCity;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipToState")
  public String getShipToState() {
    return shipToState;
  }
  public void setShipToState(String shipToState) {
    this.shipToState = shipToState;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipToZipCode")
  public String getShipToZipCode() {
    return shipToZipCode;
  }
  public void setShipToZipCode(String shipToZipCode) {
    this.shipToZipCode = shipToZipCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipToPhone")
  public String getShipToPhone() {
    return shipToPhone;
  }
  public void setShipToPhone(String shipToPhone) {
    this.shipToPhone = shipToPhone;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("corporateName")
  public String getCorporateName() {
    return corporateName;
  }
  public void setCorporateName(String corporateName) {
    this.corporateName = corporateName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("corporateAttention")
  public String getCorporateAttention() {
    return corporateAttention;
  }
  public void setCorporateAttention(String corporateAttention) {
    this.corporateAttention = corporateAttention;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("corporateStreet1")
  public String getCorporateStreet1() {
    return corporateStreet1;
  }
  public void setCorporateStreet1(String corporateStreet1) {
    this.corporateStreet1 = corporateStreet1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("corporateStreet2")
  public String getCorporateStreet2() {
    return corporateStreet2;
  }
  public void setCorporateStreet2(String corporateStreet2) {
    this.corporateStreet2 = corporateStreet2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("corporateCity")
  public String getCorporateCity() {
    return corporateCity;
  }
  public void setCorporateCity(String corporateCity) {
    this.corporateCity = corporateCity;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("corporateState")
  public String getCorporateState() {
    return corporateState;
  }
  public void setCorporateState(String corporateState) {
    this.corporateState = corporateState;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("corporateZipCode")
  public String getCorporateZipCode() {
    return corporateZipCode;
  }
  public void setCorporateZipCode(String corporateZipCode) {
    this.corporateZipCode = corporateZipCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountCode")
  public String getAccountCode() {
    return accountCode;
  }
  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("buyer")
  public Integer getBuyer() {
    return buyer;
  }
  public void setBuyer(Integer buyer) {
    this.buyer = buyer;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("carrier")
  public Integer getCarrier() {
    return carrier;
  }
  public void setCarrier(Integer carrier) {
    this.carrier = carrier;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("confTo")
  public String getConfTo() {
    return confTo;
  }
  public void setConfTo(String confTo) {
    this.confTo = confTo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fob")
  public String getFob() {
    return fob;
  }
  public void setFob(String fob) {
    this.fob = fob;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("printed")
  public String getPrinted() {
    return printed;
  }
  public void setPrinted(String printed) {
    this.printed = printed;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("projectNo")
  public Integer getProjectNo() {
    return projectNo;
  }
  public void setProjectNo(Integer projectNo) {
    this.projectNo = projectNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("remarks")
  public String getRemarks() {
    return remarks;
  }
  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("requestBy")
  public String getRequestBy() {
    return requestBy;
  }
  public void setRequestBy(String requestBy) {
    this.requestBy = requestBy;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("terms")
  public String getTerms() {
    return terms;
  }
  public void setTerms(String terms) {
    this.terms = terms;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("usedBy")
  public String getUsedBy() {
    return usedBy;
  }
  public void setUsedBy(String usedBy) {
    this.usedBy = usedBy;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lineItems")
  public List<ItemReceipt> getLineItems() {
    return lineItems;
  }
  public void setLineItems(List<ItemReceipt> lineItems) {
    this.lineItems = lineItems;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Asn asn = (Asn) o;
    return Objects.equals(id, asn.id) &&
        Objects.equals(createDate, asn.createDate) &&
        Objects.equals(modifyDate, asn.modifyDate) &&
        Objects.equals(lobId, asn.lobId) &&
        Objects.equals(poNo, asn.poNo) &&
        Objects.equals(vendorId, asn.vendorId) &&
        Objects.equals(warehouseId, asn.warehouseId) &&
        Objects.equals(orderDate, asn.orderDate) &&
        Objects.equals(type, asn.type) &&
        Objects.equals(billingName, asn.billingName) &&
        Objects.equals(billingAttention, asn.billingAttention) &&
        Objects.equals(billingStreet1, asn.billingStreet1) &&
        Objects.equals(billingStreet2, asn.billingStreet2) &&
        Objects.equals(billingCity, asn.billingCity) &&
        Objects.equals(billingState, asn.billingState) &&
        Objects.equals(billingZipCode, asn.billingZipCode) &&
        Objects.equals(billingPhone, asn.billingPhone) &&
        Objects.equals(shipToName, asn.shipToName) &&
        Objects.equals(shipToAddress, asn.shipToAddress) &&
        Objects.equals(shipToStreet1, asn.shipToStreet1) &&
        Objects.equals(shipToStreet2, asn.shipToStreet2) &&
        Objects.equals(shipToCity, asn.shipToCity) &&
        Objects.equals(shipToState, asn.shipToState) &&
        Objects.equals(shipToZipCode, asn.shipToZipCode) &&
        Objects.equals(shipToPhone, asn.shipToPhone) &&
        Objects.equals(corporateName, asn.corporateName) &&
        Objects.equals(corporateAttention, asn.corporateAttention) &&
        Objects.equals(corporateStreet1, asn.corporateStreet1) &&
        Objects.equals(corporateStreet2, asn.corporateStreet2) &&
        Objects.equals(corporateCity, asn.corporateCity) &&
        Objects.equals(corporateState, asn.corporateState) &&
        Objects.equals(corporateZipCode, asn.corporateZipCode) &&
        Objects.equals(accountCode, asn.accountCode) &&
        Objects.equals(buyer, asn.buyer) &&
        Objects.equals(carrier, asn.carrier) &&
        Objects.equals(confTo, asn.confTo) &&
        Objects.equals(fob, asn.fob) &&
        Objects.equals(printed, asn.printed) &&
        Objects.equals(projectNo, asn.projectNo) &&
        Objects.equals(remarks, asn.remarks) &&
        Objects.equals(requestBy, asn.requestBy) &&
        Objects.equals(terms, asn.terms) &&
        Objects.equals(usedBy, asn.usedBy) &&
        Objects.equals(lineItems, asn.lineItems) &&
        Objects.equals(status, asn.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, lobId, poNo, vendorId, warehouseId, orderDate, type, billingName, billingAttention, billingStreet1, billingStreet2, billingCity, billingState, billingZipCode, billingPhone, shipToName, shipToAddress, shipToStreet1, shipToStreet2, shipToCity, shipToState, shipToZipCode, shipToPhone, corporateName, corporateAttention, corporateStreet1, corporateStreet2, corporateCity, corporateState, corporateZipCode, accountCode, buyer, carrier, confTo, fob, printed, projectNo, remarks, requestBy, terms, usedBy, lineItems, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asn {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    poNo: ").append(toIndentedString(poNo)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    billingName: ").append(toIndentedString(billingName)).append("\n");
    sb.append("    billingAttention: ").append(toIndentedString(billingAttention)).append("\n");
    sb.append("    billingStreet1: ").append(toIndentedString(billingStreet1)).append("\n");
    sb.append("    billingStreet2: ").append(toIndentedString(billingStreet2)).append("\n");
    sb.append("    billingCity: ").append(toIndentedString(billingCity)).append("\n");
    sb.append("    billingState: ").append(toIndentedString(billingState)).append("\n");
    sb.append("    billingZipCode: ").append(toIndentedString(billingZipCode)).append("\n");
    sb.append("    billingPhone: ").append(toIndentedString(billingPhone)).append("\n");
    sb.append("    shipToName: ").append(toIndentedString(shipToName)).append("\n");
    sb.append("    shipToAddress: ").append(toIndentedString(shipToAddress)).append("\n");
    sb.append("    shipToStreet1: ").append(toIndentedString(shipToStreet1)).append("\n");
    sb.append("    shipToStreet2: ").append(toIndentedString(shipToStreet2)).append("\n");
    sb.append("    shipToCity: ").append(toIndentedString(shipToCity)).append("\n");
    sb.append("    shipToState: ").append(toIndentedString(shipToState)).append("\n");
    sb.append("    shipToZipCode: ").append(toIndentedString(shipToZipCode)).append("\n");
    sb.append("    shipToPhone: ").append(toIndentedString(shipToPhone)).append("\n");
    sb.append("    corporateName: ").append(toIndentedString(corporateName)).append("\n");
    sb.append("    corporateAttention: ").append(toIndentedString(corporateAttention)).append("\n");
    sb.append("    corporateStreet1: ").append(toIndentedString(corporateStreet1)).append("\n");
    sb.append("    corporateStreet2: ").append(toIndentedString(corporateStreet2)).append("\n");
    sb.append("    corporateCity: ").append(toIndentedString(corporateCity)).append("\n");
    sb.append("    corporateState: ").append(toIndentedString(corporateState)).append("\n");
    sb.append("    corporateZipCode: ").append(toIndentedString(corporateZipCode)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    confTo: ").append(toIndentedString(confTo)).append("\n");
    sb.append("    fob: ").append(toIndentedString(fob)).append("\n");
    sb.append("    printed: ").append(toIndentedString(printed)).append("\n");
    sb.append("    projectNo: ").append(toIndentedString(projectNo)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    requestBy: ").append(toIndentedString(requestBy)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

