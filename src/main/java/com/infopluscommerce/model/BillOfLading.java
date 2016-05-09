package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.infopluscommerce.model.BillOfLadingCarrierInfoLine;
import com.infopluscommerce.model.BillOfLadingOrderInfoLine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class BillOfLading   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer lobId = null;
  private String bolNo = null;
  private Date bolDate = null;
  private String shipFromName = null;
  private String shipFromAddress = null;
  private String shipFromCity = null;
  private String shipFromState = null;
  private String shipFromZip = null;
  private String sid = null;
  private Boolean isShipFromFOB = false;
  private String shipToName = null;
  private String shipToAddress = null;
  private String shipToCity = null;
  private String shipToState = null;
  private String shipToZip = null;
  private String shipToLocationNo = null;
  private String cid = null;
  private Boolean isShipToFOB = false;
  private String billToName = null;
  private String billToAddress = null;
  private String billToCity = null;
  private String billToState = null;
  private String billToZip = null;
  private Boolean isTrailerLoadedByShipper = false;
  private Boolean byDriver = false;
  private Double codAmount = null;
  private Boolean feeTermsCollect = false;
  private Boolean feeTermsPrepaid = false;
  private Boolean customerCheckAcceptable = false;
  private String carrierName = null;
  private String trailerNo = null;
  private String sealNo = null;
  private String scac = null;
  private String proNo = null;
  private Boolean prepaid = false;
  private Boolean collect = false;
  private Boolean thirdParty = false;
  private Boolean isThisAMasterBOL = false;
  private Integer masterBOLId = null;
  private Boolean isFreightCountedByShipper = false;
  private Boolean byDriverPallets = false;
  private Boolean byDriverPieces = false;
  private String specialInstructions = null;
  private List<BillOfLadingOrderInfoLine> orderInfoLines = new ArrayList<BillOfLadingOrderInfoLine>();
  private List<BillOfLadingCarrierInfoLine> carrierInfoLines = new ArrayList<BillOfLadingCarrierInfoLine>();

  
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
  @JsonProperty("bolNo")
  public String getBolNo() {
    return bolNo;
  }
  public void setBolNo(String bolNo) {
    this.bolNo = bolNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bolDate")
  public Date getBolDate() {
    return bolDate;
  }
  public void setBolDate(Date bolDate) {
    this.bolDate = bolDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipFromName")
  public String getShipFromName() {
    return shipFromName;
  }
  public void setShipFromName(String shipFromName) {
    this.shipFromName = shipFromName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipFromAddress")
  public String getShipFromAddress() {
    return shipFromAddress;
  }
  public void setShipFromAddress(String shipFromAddress) {
    this.shipFromAddress = shipFromAddress;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipFromCity")
  public String getShipFromCity() {
    return shipFromCity;
  }
  public void setShipFromCity(String shipFromCity) {
    this.shipFromCity = shipFromCity;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipFromState")
  public String getShipFromState() {
    return shipFromState;
  }
  public void setShipFromState(String shipFromState) {
    this.shipFromState = shipFromState;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipFromZip")
  public String getShipFromZip() {
    return shipFromZip;
  }
  public void setShipFromZip(String shipFromZip) {
    this.shipFromZip = shipFromZip;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sid")
  public String getSid() {
    return sid;
  }
  public void setSid(String sid) {
    this.sid = sid;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isShipFromFOB")
  public Boolean getIsShipFromFOB() {
    return isShipFromFOB;
  }
  public void setIsShipFromFOB(Boolean isShipFromFOB) {
    this.isShipFromFOB = isShipFromFOB;
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
  @JsonProperty("shipToZip")
  public String getShipToZip() {
    return shipToZip;
  }
  public void setShipToZip(String shipToZip) {
    this.shipToZip = shipToZip;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipToLocationNo")
  public String getShipToLocationNo() {
    return shipToLocationNo;
  }
  public void setShipToLocationNo(String shipToLocationNo) {
    this.shipToLocationNo = shipToLocationNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cid")
  public String getCid() {
    return cid;
  }
  public void setCid(String cid) {
    this.cid = cid;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isShipToFOB")
  public Boolean getIsShipToFOB() {
    return isShipToFOB;
  }
  public void setIsShipToFOB(Boolean isShipToFOB) {
    this.isShipToFOB = isShipToFOB;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billToName")
  public String getBillToName() {
    return billToName;
  }
  public void setBillToName(String billToName) {
    this.billToName = billToName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billToAddress")
  public String getBillToAddress() {
    return billToAddress;
  }
  public void setBillToAddress(String billToAddress) {
    this.billToAddress = billToAddress;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billToCity")
  public String getBillToCity() {
    return billToCity;
  }
  public void setBillToCity(String billToCity) {
    this.billToCity = billToCity;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billToState")
  public String getBillToState() {
    return billToState;
  }
  public void setBillToState(String billToState) {
    this.billToState = billToState;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billToZip")
  public String getBillToZip() {
    return billToZip;
  }
  public void setBillToZip(String billToZip) {
    this.billToZip = billToZip;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isTrailerLoadedByShipper")
  public Boolean getIsTrailerLoadedByShipper() {
    return isTrailerLoadedByShipper;
  }
  public void setIsTrailerLoadedByShipper(Boolean isTrailerLoadedByShipper) {
    this.isTrailerLoadedByShipper = isTrailerLoadedByShipper;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("byDriver")
  public Boolean getByDriver() {
    return byDriver;
  }
  public void setByDriver(Boolean byDriver) {
    this.byDriver = byDriver;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codAmount")
  public Double getCodAmount() {
    return codAmount;
  }
  public void setCodAmount(Double codAmount) {
    this.codAmount = codAmount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("feeTermsCollect")
  public Boolean getFeeTermsCollect() {
    return feeTermsCollect;
  }
  public void setFeeTermsCollect(Boolean feeTermsCollect) {
    this.feeTermsCollect = feeTermsCollect;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("feeTermsPrepaid")
  public Boolean getFeeTermsPrepaid() {
    return feeTermsPrepaid;
  }
  public void setFeeTermsPrepaid(Boolean feeTermsPrepaid) {
    this.feeTermsPrepaid = feeTermsPrepaid;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customerCheckAcceptable")
  public Boolean getCustomerCheckAcceptable() {
    return customerCheckAcceptable;
  }
  public void setCustomerCheckAcceptable(Boolean customerCheckAcceptable) {
    this.customerCheckAcceptable = customerCheckAcceptable;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("carrierName")
  public String getCarrierName() {
    return carrierName;
  }
  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trailerNo")
  public String getTrailerNo() {
    return trailerNo;
  }
  public void setTrailerNo(String trailerNo) {
    this.trailerNo = trailerNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sealNo")
  public String getSealNo() {
    return sealNo;
  }
  public void setSealNo(String sealNo) {
    this.sealNo = sealNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scac")
  public String getScac() {
    return scac;
  }
  public void setScac(String scac) {
    this.scac = scac;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("proNo")
  public String getProNo() {
    return proNo;
  }
  public void setProNo(String proNo) {
    this.proNo = proNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prepaid")
  public Boolean getPrepaid() {
    return prepaid;
  }
  public void setPrepaid(Boolean prepaid) {
    this.prepaid = prepaid;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("collect")
  public Boolean getCollect() {
    return collect;
  }
  public void setCollect(Boolean collect) {
    this.collect = collect;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thirdParty")
  public Boolean getThirdParty() {
    return thirdParty;
  }
  public void setThirdParty(Boolean thirdParty) {
    this.thirdParty = thirdParty;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isThisAMasterBOL")
  public Boolean getIsThisAMasterBOL() {
    return isThisAMasterBOL;
  }
  public void setIsThisAMasterBOL(Boolean isThisAMasterBOL) {
    this.isThisAMasterBOL = isThisAMasterBOL;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("masterBOLId")
  public Integer getMasterBOLId() {
    return masterBOLId;
  }
  public void setMasterBOLId(Integer masterBOLId) {
    this.masterBOLId = masterBOLId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isFreightCountedByShipper")
  public Boolean getIsFreightCountedByShipper() {
    return isFreightCountedByShipper;
  }
  public void setIsFreightCountedByShipper(Boolean isFreightCountedByShipper) {
    this.isFreightCountedByShipper = isFreightCountedByShipper;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("byDriverPallets")
  public Boolean getByDriverPallets() {
    return byDriverPallets;
  }
  public void setByDriverPallets(Boolean byDriverPallets) {
    this.byDriverPallets = byDriverPallets;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("byDriverPieces")
  public Boolean getByDriverPieces() {
    return byDriverPieces;
  }
  public void setByDriverPieces(Boolean byDriverPieces) {
    this.byDriverPieces = byDriverPieces;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("specialInstructions")
  public String getSpecialInstructions() {
    return specialInstructions;
  }
  public void setSpecialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderInfoLines")
  public List<BillOfLadingOrderInfoLine> getOrderInfoLines() {
    return orderInfoLines;
  }
  public void setOrderInfoLines(List<BillOfLadingOrderInfoLine> orderInfoLines) {
    this.orderInfoLines = orderInfoLines;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("carrierInfoLines")
  public List<BillOfLadingCarrierInfoLine> getCarrierInfoLines() {
    return carrierInfoLines;
  }
  public void setCarrierInfoLines(List<BillOfLadingCarrierInfoLine> carrierInfoLines) {
    this.carrierInfoLines = carrierInfoLines;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillOfLading billOfLading = (BillOfLading) o;
    return Objects.equals(id, billOfLading.id) &&
        Objects.equals(createDate, billOfLading.createDate) &&
        Objects.equals(modifyDate, billOfLading.modifyDate) &&
        Objects.equals(lobId, billOfLading.lobId) &&
        Objects.equals(bolNo, billOfLading.bolNo) &&
        Objects.equals(bolDate, billOfLading.bolDate) &&
        Objects.equals(shipFromName, billOfLading.shipFromName) &&
        Objects.equals(shipFromAddress, billOfLading.shipFromAddress) &&
        Objects.equals(shipFromCity, billOfLading.shipFromCity) &&
        Objects.equals(shipFromState, billOfLading.shipFromState) &&
        Objects.equals(shipFromZip, billOfLading.shipFromZip) &&
        Objects.equals(sid, billOfLading.sid) &&
        Objects.equals(isShipFromFOB, billOfLading.isShipFromFOB) &&
        Objects.equals(shipToName, billOfLading.shipToName) &&
        Objects.equals(shipToAddress, billOfLading.shipToAddress) &&
        Objects.equals(shipToCity, billOfLading.shipToCity) &&
        Objects.equals(shipToState, billOfLading.shipToState) &&
        Objects.equals(shipToZip, billOfLading.shipToZip) &&
        Objects.equals(shipToLocationNo, billOfLading.shipToLocationNo) &&
        Objects.equals(cid, billOfLading.cid) &&
        Objects.equals(isShipToFOB, billOfLading.isShipToFOB) &&
        Objects.equals(billToName, billOfLading.billToName) &&
        Objects.equals(billToAddress, billOfLading.billToAddress) &&
        Objects.equals(billToCity, billOfLading.billToCity) &&
        Objects.equals(billToState, billOfLading.billToState) &&
        Objects.equals(billToZip, billOfLading.billToZip) &&
        Objects.equals(isTrailerLoadedByShipper, billOfLading.isTrailerLoadedByShipper) &&
        Objects.equals(byDriver, billOfLading.byDriver) &&
        Objects.equals(codAmount, billOfLading.codAmount) &&
        Objects.equals(feeTermsCollect, billOfLading.feeTermsCollect) &&
        Objects.equals(feeTermsPrepaid, billOfLading.feeTermsPrepaid) &&
        Objects.equals(customerCheckAcceptable, billOfLading.customerCheckAcceptable) &&
        Objects.equals(carrierName, billOfLading.carrierName) &&
        Objects.equals(trailerNo, billOfLading.trailerNo) &&
        Objects.equals(sealNo, billOfLading.sealNo) &&
        Objects.equals(scac, billOfLading.scac) &&
        Objects.equals(proNo, billOfLading.proNo) &&
        Objects.equals(prepaid, billOfLading.prepaid) &&
        Objects.equals(collect, billOfLading.collect) &&
        Objects.equals(thirdParty, billOfLading.thirdParty) &&
        Objects.equals(isThisAMasterBOL, billOfLading.isThisAMasterBOL) &&
        Objects.equals(masterBOLId, billOfLading.masterBOLId) &&
        Objects.equals(isFreightCountedByShipper, billOfLading.isFreightCountedByShipper) &&
        Objects.equals(byDriverPallets, billOfLading.byDriverPallets) &&
        Objects.equals(byDriverPieces, billOfLading.byDriverPieces) &&
        Objects.equals(specialInstructions, billOfLading.specialInstructions) &&
        Objects.equals(orderInfoLines, billOfLading.orderInfoLines) &&
        Objects.equals(carrierInfoLines, billOfLading.carrierInfoLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, lobId, bolNo, bolDate, shipFromName, shipFromAddress, shipFromCity, shipFromState, shipFromZip, sid, isShipFromFOB, shipToName, shipToAddress, shipToCity, shipToState, shipToZip, shipToLocationNo, cid, isShipToFOB, billToName, billToAddress, billToCity, billToState, billToZip, isTrailerLoadedByShipper, byDriver, codAmount, feeTermsCollect, feeTermsPrepaid, customerCheckAcceptable, carrierName, trailerNo, sealNo, scac, proNo, prepaid, collect, thirdParty, isThisAMasterBOL, masterBOLId, isFreightCountedByShipper, byDriverPallets, byDriverPieces, specialInstructions, orderInfoLines, carrierInfoLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillOfLading {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    bolNo: ").append(toIndentedString(bolNo)).append("\n");
    sb.append("    bolDate: ").append(toIndentedString(bolDate)).append("\n");
    sb.append("    shipFromName: ").append(toIndentedString(shipFromName)).append("\n");
    sb.append("    shipFromAddress: ").append(toIndentedString(shipFromAddress)).append("\n");
    sb.append("    shipFromCity: ").append(toIndentedString(shipFromCity)).append("\n");
    sb.append("    shipFromState: ").append(toIndentedString(shipFromState)).append("\n");
    sb.append("    shipFromZip: ").append(toIndentedString(shipFromZip)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    isShipFromFOB: ").append(toIndentedString(isShipFromFOB)).append("\n");
    sb.append("    shipToName: ").append(toIndentedString(shipToName)).append("\n");
    sb.append("    shipToAddress: ").append(toIndentedString(shipToAddress)).append("\n");
    sb.append("    shipToCity: ").append(toIndentedString(shipToCity)).append("\n");
    sb.append("    shipToState: ").append(toIndentedString(shipToState)).append("\n");
    sb.append("    shipToZip: ").append(toIndentedString(shipToZip)).append("\n");
    sb.append("    shipToLocationNo: ").append(toIndentedString(shipToLocationNo)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    isShipToFOB: ").append(toIndentedString(isShipToFOB)).append("\n");
    sb.append("    billToName: ").append(toIndentedString(billToName)).append("\n");
    sb.append("    billToAddress: ").append(toIndentedString(billToAddress)).append("\n");
    sb.append("    billToCity: ").append(toIndentedString(billToCity)).append("\n");
    sb.append("    billToState: ").append(toIndentedString(billToState)).append("\n");
    sb.append("    billToZip: ").append(toIndentedString(billToZip)).append("\n");
    sb.append("    isTrailerLoadedByShipper: ").append(toIndentedString(isTrailerLoadedByShipper)).append("\n");
    sb.append("    byDriver: ").append(toIndentedString(byDriver)).append("\n");
    sb.append("    codAmount: ").append(toIndentedString(codAmount)).append("\n");
    sb.append("    feeTermsCollect: ").append(toIndentedString(feeTermsCollect)).append("\n");
    sb.append("    feeTermsPrepaid: ").append(toIndentedString(feeTermsPrepaid)).append("\n");
    sb.append("    customerCheckAcceptable: ").append(toIndentedString(customerCheckAcceptable)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    trailerNo: ").append(toIndentedString(trailerNo)).append("\n");
    sb.append("    sealNo: ").append(toIndentedString(sealNo)).append("\n");
    sb.append("    scac: ").append(toIndentedString(scac)).append("\n");
    sb.append("    proNo: ").append(toIndentedString(proNo)).append("\n");
    sb.append("    prepaid: ").append(toIndentedString(prepaid)).append("\n");
    sb.append("    collect: ").append(toIndentedString(collect)).append("\n");
    sb.append("    thirdParty: ").append(toIndentedString(thirdParty)).append("\n");
    sb.append("    isThisAMasterBOL: ").append(toIndentedString(isThisAMasterBOL)).append("\n");
    sb.append("    masterBOLId: ").append(toIndentedString(masterBOLId)).append("\n");
    sb.append("    isFreightCountedByShipper: ").append(toIndentedString(isFreightCountedByShipper)).append("\n");
    sb.append("    byDriverPallets: ").append(toIndentedString(byDriverPallets)).append("\n");
    sb.append("    byDriverPieces: ").append(toIndentedString(byDriverPieces)).append("\n");
    sb.append("    specialInstructions: ").append(toIndentedString(specialInstructions)).append("\n");
    sb.append("    orderInfoLines: ").append(toIndentedString(orderInfoLines)).append("\n");
    sb.append("    carrierInfoLines: ").append(toIndentedString(carrierInfoLines)).append("\n");
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

