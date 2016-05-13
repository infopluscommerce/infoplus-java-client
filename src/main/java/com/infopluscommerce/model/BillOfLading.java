package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.infopluscommerce.model.BillOfLadingCarrierInfoLine;
import com.infopluscommerce.model.BillOfLadingOrderInfoLine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T15:40:30.367-05:00")
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
  public BillOfLading lobId(Integer lobId) {
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
  public BillOfLading bolNo(String bolNo) {
    this.bolNo = bolNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("bolNo")
  public String getBolNo() {
    return bolNo;
  }
  public void setBolNo(String bolNo) {
    this.bolNo = bolNo;
  }

  
  /**
   **/
  public BillOfLading bolDate(Date bolDate) {
    this.bolDate = bolDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bolDate")
  public Date getBolDate() {
    return bolDate;
  }
  public void setBolDate(Date bolDate) {
    this.bolDate = bolDate;
  }

  
  /**
   **/
  public BillOfLading shipFromName(String shipFromName) {
    this.shipFromName = shipFromName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipFromName")
  public String getShipFromName() {
    return shipFromName;
  }
  public void setShipFromName(String shipFromName) {
    this.shipFromName = shipFromName;
  }

  
  /**
   **/
  public BillOfLading shipFromAddress(String shipFromAddress) {
    this.shipFromAddress = shipFromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipFromAddress")
  public String getShipFromAddress() {
    return shipFromAddress;
  }
  public void setShipFromAddress(String shipFromAddress) {
    this.shipFromAddress = shipFromAddress;
  }

  
  /**
   **/
  public BillOfLading shipFromCity(String shipFromCity) {
    this.shipFromCity = shipFromCity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipFromCity")
  public String getShipFromCity() {
    return shipFromCity;
  }
  public void setShipFromCity(String shipFromCity) {
    this.shipFromCity = shipFromCity;
  }

  
  /**
   **/
  public BillOfLading shipFromState(String shipFromState) {
    this.shipFromState = shipFromState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipFromState")
  public String getShipFromState() {
    return shipFromState;
  }
  public void setShipFromState(String shipFromState) {
    this.shipFromState = shipFromState;
  }

  
  /**
   **/
  public BillOfLading shipFromZip(String shipFromZip) {
    this.shipFromZip = shipFromZip;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipFromZip")
  public String getShipFromZip() {
    return shipFromZip;
  }
  public void setShipFromZip(String shipFromZip) {
    this.shipFromZip = shipFromZip;
  }

  
  /**
   **/
  public BillOfLading sid(String sid) {
    this.sid = sid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sid")
  public String getSid() {
    return sid;
  }
  public void setSid(String sid) {
    this.sid = sid;
  }

  
  /**
   **/
  public BillOfLading isShipFromFOB(Boolean isShipFromFOB) {
    this.isShipFromFOB = isShipFromFOB;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isShipFromFOB")
  public Boolean getIsShipFromFOB() {
    return isShipFromFOB;
  }
  public void setIsShipFromFOB(Boolean isShipFromFOB) {
    this.isShipFromFOB = isShipFromFOB;
  }

  
  /**
   **/
  public BillOfLading shipToName(String shipToName) {
    this.shipToName = shipToName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToName")
  public String getShipToName() {
    return shipToName;
  }
  public void setShipToName(String shipToName) {
    this.shipToName = shipToName;
  }

  
  /**
   **/
  public BillOfLading shipToAddress(String shipToAddress) {
    this.shipToAddress = shipToAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToAddress")
  public String getShipToAddress() {
    return shipToAddress;
  }
  public void setShipToAddress(String shipToAddress) {
    this.shipToAddress = shipToAddress;
  }

  
  /**
   **/
  public BillOfLading shipToCity(String shipToCity) {
    this.shipToCity = shipToCity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToCity")
  public String getShipToCity() {
    return shipToCity;
  }
  public void setShipToCity(String shipToCity) {
    this.shipToCity = shipToCity;
  }

  
  /**
   **/
  public BillOfLading shipToState(String shipToState) {
    this.shipToState = shipToState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToState")
  public String getShipToState() {
    return shipToState;
  }
  public void setShipToState(String shipToState) {
    this.shipToState = shipToState;
  }

  
  /**
   **/
  public BillOfLading shipToZip(String shipToZip) {
    this.shipToZip = shipToZip;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToZip")
  public String getShipToZip() {
    return shipToZip;
  }
  public void setShipToZip(String shipToZip) {
    this.shipToZip = shipToZip;
  }

  
  /**
   **/
  public BillOfLading shipToLocationNo(String shipToLocationNo) {
    this.shipToLocationNo = shipToLocationNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToLocationNo")
  public String getShipToLocationNo() {
    return shipToLocationNo;
  }
  public void setShipToLocationNo(String shipToLocationNo) {
    this.shipToLocationNo = shipToLocationNo;
  }

  
  /**
   **/
  public BillOfLading cid(String cid) {
    this.cid = cid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cid")
  public String getCid() {
    return cid;
  }
  public void setCid(String cid) {
    this.cid = cid;
  }

  
  /**
   **/
  public BillOfLading isShipToFOB(Boolean isShipToFOB) {
    this.isShipToFOB = isShipToFOB;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isShipToFOB")
  public Boolean getIsShipToFOB() {
    return isShipToFOB;
  }
  public void setIsShipToFOB(Boolean isShipToFOB) {
    this.isShipToFOB = isShipToFOB;
  }

  
  /**
   **/
  public BillOfLading billToName(String billToName) {
    this.billToName = billToName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billToName")
  public String getBillToName() {
    return billToName;
  }
  public void setBillToName(String billToName) {
    this.billToName = billToName;
  }

  
  /**
   **/
  public BillOfLading billToAddress(String billToAddress) {
    this.billToAddress = billToAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billToAddress")
  public String getBillToAddress() {
    return billToAddress;
  }
  public void setBillToAddress(String billToAddress) {
    this.billToAddress = billToAddress;
  }

  
  /**
   **/
  public BillOfLading billToCity(String billToCity) {
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
  public BillOfLading billToState(String billToState) {
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
  public BillOfLading billToZip(String billToZip) {
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
  public BillOfLading isTrailerLoadedByShipper(Boolean isTrailerLoadedByShipper) {
    this.isTrailerLoadedByShipper = isTrailerLoadedByShipper;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isTrailerLoadedByShipper")
  public Boolean getIsTrailerLoadedByShipper() {
    return isTrailerLoadedByShipper;
  }
  public void setIsTrailerLoadedByShipper(Boolean isTrailerLoadedByShipper) {
    this.isTrailerLoadedByShipper = isTrailerLoadedByShipper;
  }

  
  /**
   **/
  public BillOfLading byDriver(Boolean byDriver) {
    this.byDriver = byDriver;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("byDriver")
  public Boolean getByDriver() {
    return byDriver;
  }
  public void setByDriver(Boolean byDriver) {
    this.byDriver = byDriver;
  }

  
  /**
   **/
  public BillOfLading codAmount(Double codAmount) {
    this.codAmount = codAmount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codAmount")
  public Double getCodAmount() {
    return codAmount;
  }
  public void setCodAmount(Double codAmount) {
    this.codAmount = codAmount;
  }

  
  /**
   **/
  public BillOfLading feeTermsCollect(Boolean feeTermsCollect) {
    this.feeTermsCollect = feeTermsCollect;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("feeTermsCollect")
  public Boolean getFeeTermsCollect() {
    return feeTermsCollect;
  }
  public void setFeeTermsCollect(Boolean feeTermsCollect) {
    this.feeTermsCollect = feeTermsCollect;
  }

  
  /**
   **/
  public BillOfLading feeTermsPrepaid(Boolean feeTermsPrepaid) {
    this.feeTermsPrepaid = feeTermsPrepaid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("feeTermsPrepaid")
  public Boolean getFeeTermsPrepaid() {
    return feeTermsPrepaid;
  }
  public void setFeeTermsPrepaid(Boolean feeTermsPrepaid) {
    this.feeTermsPrepaid = feeTermsPrepaid;
  }

  
  /**
   **/
  public BillOfLading customerCheckAcceptable(Boolean customerCheckAcceptable) {
    this.customerCheckAcceptable = customerCheckAcceptable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerCheckAcceptable")
  public Boolean getCustomerCheckAcceptable() {
    return customerCheckAcceptable;
  }
  public void setCustomerCheckAcceptable(Boolean customerCheckAcceptable) {
    this.customerCheckAcceptable = customerCheckAcceptable;
  }

  
  /**
   **/
  public BillOfLading carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("carrierName")
  public String getCarrierName() {
    return carrierName;
  }
  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  
  /**
   **/
  public BillOfLading trailerNo(String trailerNo) {
    this.trailerNo = trailerNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trailerNo")
  public String getTrailerNo() {
    return trailerNo;
  }
  public void setTrailerNo(String trailerNo) {
    this.trailerNo = trailerNo;
  }

  
  /**
   **/
  public BillOfLading sealNo(String sealNo) {
    this.sealNo = sealNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sealNo")
  public String getSealNo() {
    return sealNo;
  }
  public void setSealNo(String sealNo) {
    this.sealNo = sealNo;
  }

  
  /**
   **/
  public BillOfLading scac(String scac) {
    this.scac = scac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scac")
  public String getScac() {
    return scac;
  }
  public void setScac(String scac) {
    this.scac = scac;
  }

  
  /**
   **/
  public BillOfLading proNo(String proNo) {
    this.proNo = proNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("proNo")
  public String getProNo() {
    return proNo;
  }
  public void setProNo(String proNo) {
    this.proNo = proNo;
  }

  
  /**
   **/
  public BillOfLading prepaid(Boolean prepaid) {
    this.prepaid = prepaid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("prepaid")
  public Boolean getPrepaid() {
    return prepaid;
  }
  public void setPrepaid(Boolean prepaid) {
    this.prepaid = prepaid;
  }

  
  /**
   **/
  public BillOfLading collect(Boolean collect) {
    this.collect = collect;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("collect")
  public Boolean getCollect() {
    return collect;
  }
  public void setCollect(Boolean collect) {
    this.collect = collect;
  }

  
  /**
   **/
  public BillOfLading thirdParty(Boolean thirdParty) {
    this.thirdParty = thirdParty;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thirdParty")
  public Boolean getThirdParty() {
    return thirdParty;
  }
  public void setThirdParty(Boolean thirdParty) {
    this.thirdParty = thirdParty;
  }

  
  /**
   **/
  public BillOfLading isThisAMasterBOL(Boolean isThisAMasterBOL) {
    this.isThisAMasterBOL = isThisAMasterBOL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isThisAMasterBOL")
  public Boolean getIsThisAMasterBOL() {
    return isThisAMasterBOL;
  }
  public void setIsThisAMasterBOL(Boolean isThisAMasterBOL) {
    this.isThisAMasterBOL = isThisAMasterBOL;
  }

  
  /**
   **/
  public BillOfLading masterBOLId(Integer masterBOLId) {
    this.masterBOLId = masterBOLId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("masterBOLId")
  public Integer getMasterBOLId() {
    return masterBOLId;
  }
  public void setMasterBOLId(Integer masterBOLId) {
    this.masterBOLId = masterBOLId;
  }

  
  /**
   **/
  public BillOfLading isFreightCountedByShipper(Boolean isFreightCountedByShipper) {
    this.isFreightCountedByShipper = isFreightCountedByShipper;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isFreightCountedByShipper")
  public Boolean getIsFreightCountedByShipper() {
    return isFreightCountedByShipper;
  }
  public void setIsFreightCountedByShipper(Boolean isFreightCountedByShipper) {
    this.isFreightCountedByShipper = isFreightCountedByShipper;
  }

  
  /**
   **/
  public BillOfLading byDriverPallets(Boolean byDriverPallets) {
    this.byDriverPallets = byDriverPallets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("byDriverPallets")
  public Boolean getByDriverPallets() {
    return byDriverPallets;
  }
  public void setByDriverPallets(Boolean byDriverPallets) {
    this.byDriverPallets = byDriverPallets;
  }

  
  /**
   **/
  public BillOfLading byDriverPieces(Boolean byDriverPieces) {
    this.byDriverPieces = byDriverPieces;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("byDriverPieces")
  public Boolean getByDriverPieces() {
    return byDriverPieces;
  }
  public void setByDriverPieces(Boolean byDriverPieces) {
    this.byDriverPieces = byDriverPieces;
  }

  
  /**
   **/
  public BillOfLading specialInstructions(String specialInstructions) {
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
  public BillOfLading orderInfoLines(List<BillOfLadingOrderInfoLine> orderInfoLines) {
    this.orderInfoLines = orderInfoLines;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderInfoLines")
  public List<BillOfLadingOrderInfoLine> getOrderInfoLines() {
    return orderInfoLines;
  }
  public void setOrderInfoLines(List<BillOfLadingOrderInfoLine> orderInfoLines) {
    this.orderInfoLines = orderInfoLines;
  }

  
  /**
   **/
  public BillOfLading carrierInfoLines(List<BillOfLadingCarrierInfoLine> carrierInfoLines) {
    this.carrierInfoLines = carrierInfoLines;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("carrierInfoLines")
  public List<BillOfLadingCarrierInfoLine> getCarrierInfoLines() {
    return carrierInfoLines;
  }
  public void setCarrierInfoLines(List<BillOfLadingCarrierInfoLine> carrierInfoLines) {
    this.carrierInfoLines = carrierInfoLines;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillOfLading billOfLading = (BillOfLading) o;
    return Objects.equals(this.id, billOfLading.id) &&
        Objects.equals(this.createDate, billOfLading.createDate) &&
        Objects.equals(this.modifyDate, billOfLading.modifyDate) &&
        Objects.equals(this.lobId, billOfLading.lobId) &&
        Objects.equals(this.bolNo, billOfLading.bolNo) &&
        Objects.equals(this.bolDate, billOfLading.bolDate) &&
        Objects.equals(this.shipFromName, billOfLading.shipFromName) &&
        Objects.equals(this.shipFromAddress, billOfLading.shipFromAddress) &&
        Objects.equals(this.shipFromCity, billOfLading.shipFromCity) &&
        Objects.equals(this.shipFromState, billOfLading.shipFromState) &&
        Objects.equals(this.shipFromZip, billOfLading.shipFromZip) &&
        Objects.equals(this.sid, billOfLading.sid) &&
        Objects.equals(this.isShipFromFOB, billOfLading.isShipFromFOB) &&
        Objects.equals(this.shipToName, billOfLading.shipToName) &&
        Objects.equals(this.shipToAddress, billOfLading.shipToAddress) &&
        Objects.equals(this.shipToCity, billOfLading.shipToCity) &&
        Objects.equals(this.shipToState, billOfLading.shipToState) &&
        Objects.equals(this.shipToZip, billOfLading.shipToZip) &&
        Objects.equals(this.shipToLocationNo, billOfLading.shipToLocationNo) &&
        Objects.equals(this.cid, billOfLading.cid) &&
        Objects.equals(this.isShipToFOB, billOfLading.isShipToFOB) &&
        Objects.equals(this.billToName, billOfLading.billToName) &&
        Objects.equals(this.billToAddress, billOfLading.billToAddress) &&
        Objects.equals(this.billToCity, billOfLading.billToCity) &&
        Objects.equals(this.billToState, billOfLading.billToState) &&
        Objects.equals(this.billToZip, billOfLading.billToZip) &&
        Objects.equals(this.isTrailerLoadedByShipper, billOfLading.isTrailerLoadedByShipper) &&
        Objects.equals(this.byDriver, billOfLading.byDriver) &&
        Objects.equals(this.codAmount, billOfLading.codAmount) &&
        Objects.equals(this.feeTermsCollect, billOfLading.feeTermsCollect) &&
        Objects.equals(this.feeTermsPrepaid, billOfLading.feeTermsPrepaid) &&
        Objects.equals(this.customerCheckAcceptable, billOfLading.customerCheckAcceptable) &&
        Objects.equals(this.carrierName, billOfLading.carrierName) &&
        Objects.equals(this.trailerNo, billOfLading.trailerNo) &&
        Objects.equals(this.sealNo, billOfLading.sealNo) &&
        Objects.equals(this.scac, billOfLading.scac) &&
        Objects.equals(this.proNo, billOfLading.proNo) &&
        Objects.equals(this.prepaid, billOfLading.prepaid) &&
        Objects.equals(this.collect, billOfLading.collect) &&
        Objects.equals(this.thirdParty, billOfLading.thirdParty) &&
        Objects.equals(this.isThisAMasterBOL, billOfLading.isThisAMasterBOL) &&
        Objects.equals(this.masterBOLId, billOfLading.masterBOLId) &&
        Objects.equals(this.isFreightCountedByShipper, billOfLading.isFreightCountedByShipper) &&
        Objects.equals(this.byDriverPallets, billOfLading.byDriverPallets) &&
        Objects.equals(this.byDriverPieces, billOfLading.byDriverPieces) &&
        Objects.equals(this.specialInstructions, billOfLading.specialInstructions) &&
        Objects.equals(this.orderInfoLines, billOfLading.orderInfoLines) &&
        Objects.equals(this.carrierInfoLines, billOfLading.carrierInfoLines);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

