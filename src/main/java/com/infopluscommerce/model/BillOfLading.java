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
import com.infopluscommerce.model.BillOfLadingCarrierInfoLine;
import com.infopluscommerce.model.BillOfLadingOrderInfoLine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * BillOfLading
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T00:04:31.249-05:00")
public class BillOfLading {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("orderNo")
  private BigDecimal orderNo = null;

  @SerializedName("bolNo")
  private String bolNo = null;

  @SerializedName("bolDate")
  private OffsetDateTime bolDate = null;

  @SerializedName("shipFromName")
  private String shipFromName = null;

  @SerializedName("shipFromAttention")
  private String shipFromAttention = null;

  @SerializedName("shipFromAddress")
  private String shipFromAddress = null;

  @SerializedName("shipFromCity")
  private String shipFromCity = null;

  @SerializedName("shipFromState")
  private String shipFromState = null;

  @SerializedName("shipFromZip")
  private String shipFromZip = null;

  @SerializedName("shipFromCountry")
  private String shipFromCountry = null;

  @SerializedName("sid")
  private String sid = null;

  @SerializedName("isShipFromFOB")
  private Boolean isShipFromFOB = false;

  @SerializedName("shipToName")
  private String shipToName = null;

  @SerializedName("shipToAttention")
  private String shipToAttention = null;

  @SerializedName("shipToAddress")
  private String shipToAddress = null;

  @SerializedName("shipToCity")
  private String shipToCity = null;

  @SerializedName("shipToState")
  private String shipToState = null;

  @SerializedName("shipToZip")
  private String shipToZip = null;

  @SerializedName("shipToCountry")
  private String shipToCountry = null;

  @SerializedName("shipToLocationNo")
  private String shipToLocationNo = null;

  @SerializedName("cid")
  private String cid = null;

  @SerializedName("isShipToFOB")
  private Boolean isShipToFOB = false;

  @SerializedName("billToName")
  private String billToName = null;

  @SerializedName("billToAttention")
  private String billToAttention = null;

  @SerializedName("billToAddress")
  private String billToAddress = null;

  @SerializedName("billToCity")
  private String billToCity = null;

  @SerializedName("billToState")
  private String billToState = null;

  @SerializedName("billToZip")
  private String billToZip = null;

  @SerializedName("billToCountry")
  private String billToCountry = null;

  @SerializedName("isTrailerLoadedByShipper")
  private Boolean isTrailerLoadedByShipper = false;

  @SerializedName("byDriver")
  private Boolean byDriver = false;

  @SerializedName("codAmount")
  private BigDecimal codAmount = null;

  @SerializedName("feeTermsCollect")
  private Boolean feeTermsCollect = false;

  @SerializedName("feeTermsPrepaid")
  private Boolean feeTermsPrepaid = false;

  @SerializedName("customerCheckAcceptable")
  private Boolean customerCheckAcceptable = false;

  @SerializedName("carrierName")
  private String carrierName = null;

  @SerializedName("trailerNo")
  private String trailerNo = null;

  @SerializedName("sealNo")
  private String sealNo = null;

  @SerializedName("scac")
  private String scac = null;

  @SerializedName("proNo")
  private String proNo = null;

  @SerializedName("prepaid")
  private Boolean prepaid = false;

  @SerializedName("collect")
  private Boolean collect = false;

  @SerializedName("thirdParty")
  private Boolean thirdParty = false;

  @SerializedName("isThisAMasterBOL")
  private Boolean isThisAMasterBOL = false;

  @SerializedName("masterBOLId")
  private Integer masterBOLId = null;

  @SerializedName("isFreightCountedByShipper")
  private Boolean isFreightCountedByShipper = false;

  @SerializedName("byDriverPallets")
  private Boolean byDriverPallets = false;

  @SerializedName("byDriverPieces")
  private Boolean byDriverPieces = false;

  @SerializedName("specialInstructions")
  private String specialInstructions = null;

  @SerializedName("orderInfoLines")
  private List<BillOfLadingOrderInfoLine> orderInfoLines = null;

  @SerializedName("carrierInfoLines")
  private List<BillOfLadingCarrierInfoLine> carrierInfoLines = null;

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

  public BillOfLading lobId(Integer lobId) {
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

  public BillOfLading orderNo(BigDecimal orderNo) {
    this.orderNo = orderNo;
    return this;
  }

   /**
   * Get orderNo
   * @return orderNo
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(BigDecimal orderNo) {
    this.orderNo = orderNo;
  }

  public BillOfLading bolNo(String bolNo) {
    this.bolNo = bolNo;
    return this;
  }

   /**
   * Get bolNo
   * @return bolNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBolNo() {
    return bolNo;
  }

  public void setBolNo(String bolNo) {
    this.bolNo = bolNo;
  }

  public BillOfLading bolDate(OffsetDateTime bolDate) {
    this.bolDate = bolDate;
    return this;
  }

   /**
   * Get bolDate
   * @return bolDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getBolDate() {
    return bolDate;
  }

  public void setBolDate(OffsetDateTime bolDate) {
    this.bolDate = bolDate;
  }

  public BillOfLading shipFromName(String shipFromName) {
    this.shipFromName = shipFromName;
    return this;
  }

   /**
   * Get shipFromName
   * @return shipFromName
  **/
  @ApiModelProperty(value = "")
  public String getShipFromName() {
    return shipFromName;
  }

  public void setShipFromName(String shipFromName) {
    this.shipFromName = shipFromName;
  }

  public BillOfLading shipFromAttention(String shipFromAttention) {
    this.shipFromAttention = shipFromAttention;
    return this;
  }

   /**
   * Get shipFromAttention
   * @return shipFromAttention
  **/
  @ApiModelProperty(value = "")
  public String getShipFromAttention() {
    return shipFromAttention;
  }

  public void setShipFromAttention(String shipFromAttention) {
    this.shipFromAttention = shipFromAttention;
  }

  public BillOfLading shipFromAddress(String shipFromAddress) {
    this.shipFromAddress = shipFromAddress;
    return this;
  }

   /**
   * Get shipFromAddress
   * @return shipFromAddress
  **/
  @ApiModelProperty(value = "")
  public String getShipFromAddress() {
    return shipFromAddress;
  }

  public void setShipFromAddress(String shipFromAddress) {
    this.shipFromAddress = shipFromAddress;
  }

  public BillOfLading shipFromCity(String shipFromCity) {
    this.shipFromCity = shipFromCity;
    return this;
  }

   /**
   * Get shipFromCity
   * @return shipFromCity
  **/
  @ApiModelProperty(value = "")
  public String getShipFromCity() {
    return shipFromCity;
  }

  public void setShipFromCity(String shipFromCity) {
    this.shipFromCity = shipFromCity;
  }

  public BillOfLading shipFromState(String shipFromState) {
    this.shipFromState = shipFromState;
    return this;
  }

   /**
   * Get shipFromState
   * @return shipFromState
  **/
  @ApiModelProperty(value = "")
  public String getShipFromState() {
    return shipFromState;
  }

  public void setShipFromState(String shipFromState) {
    this.shipFromState = shipFromState;
  }

  public BillOfLading shipFromZip(String shipFromZip) {
    this.shipFromZip = shipFromZip;
    return this;
  }

   /**
   * Get shipFromZip
   * @return shipFromZip
  **/
  @ApiModelProperty(value = "")
  public String getShipFromZip() {
    return shipFromZip;
  }

  public void setShipFromZip(String shipFromZip) {
    this.shipFromZip = shipFromZip;
  }

  public BillOfLading shipFromCountry(String shipFromCountry) {
    this.shipFromCountry = shipFromCountry;
    return this;
  }

   /**
   * Get shipFromCountry
   * @return shipFromCountry
  **/
  @ApiModelProperty(value = "")
  public String getShipFromCountry() {
    return shipFromCountry;
  }

  public void setShipFromCountry(String shipFromCountry) {
    this.shipFromCountry = shipFromCountry;
  }

  public BillOfLading sid(String sid) {
    this.sid = sid;
    return this;
  }

   /**
   * Get sid
   * @return sid
  **/
  @ApiModelProperty(value = "")
  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }

  public BillOfLading isShipFromFOB(Boolean isShipFromFOB) {
    this.isShipFromFOB = isShipFromFOB;
    return this;
  }

   /**
   * Get isShipFromFOB
   * @return isShipFromFOB
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsShipFromFOB() {
    return isShipFromFOB;
  }

  public void setIsShipFromFOB(Boolean isShipFromFOB) {
    this.isShipFromFOB = isShipFromFOB;
  }

  public BillOfLading shipToName(String shipToName) {
    this.shipToName = shipToName;
    return this;
  }

   /**
   * Get shipToName
   * @return shipToName
  **/
  @ApiModelProperty(value = "")
  public String getShipToName() {
    return shipToName;
  }

  public void setShipToName(String shipToName) {
    this.shipToName = shipToName;
  }

  public BillOfLading shipToAttention(String shipToAttention) {
    this.shipToAttention = shipToAttention;
    return this;
  }

   /**
   * Get shipToAttention
   * @return shipToAttention
  **/
  @ApiModelProperty(value = "")
  public String getShipToAttention() {
    return shipToAttention;
  }

  public void setShipToAttention(String shipToAttention) {
    this.shipToAttention = shipToAttention;
  }

  public BillOfLading shipToAddress(String shipToAddress) {
    this.shipToAddress = shipToAddress;
    return this;
  }

   /**
   * Get shipToAddress
   * @return shipToAddress
  **/
  @ApiModelProperty(value = "")
  public String getShipToAddress() {
    return shipToAddress;
  }

  public void setShipToAddress(String shipToAddress) {
    this.shipToAddress = shipToAddress;
  }

  public BillOfLading shipToCity(String shipToCity) {
    this.shipToCity = shipToCity;
    return this;
  }

   /**
   * Get shipToCity
   * @return shipToCity
  **/
  @ApiModelProperty(value = "")
  public String getShipToCity() {
    return shipToCity;
  }

  public void setShipToCity(String shipToCity) {
    this.shipToCity = shipToCity;
  }

  public BillOfLading shipToState(String shipToState) {
    this.shipToState = shipToState;
    return this;
  }

   /**
   * Get shipToState
   * @return shipToState
  **/
  @ApiModelProperty(value = "")
  public String getShipToState() {
    return shipToState;
  }

  public void setShipToState(String shipToState) {
    this.shipToState = shipToState;
  }

  public BillOfLading shipToZip(String shipToZip) {
    this.shipToZip = shipToZip;
    return this;
  }

   /**
   * Get shipToZip
   * @return shipToZip
  **/
  @ApiModelProperty(value = "")
  public String getShipToZip() {
    return shipToZip;
  }

  public void setShipToZip(String shipToZip) {
    this.shipToZip = shipToZip;
  }

  public BillOfLading shipToCountry(String shipToCountry) {
    this.shipToCountry = shipToCountry;
    return this;
  }

   /**
   * Get shipToCountry
   * @return shipToCountry
  **/
  @ApiModelProperty(value = "")
  public String getShipToCountry() {
    return shipToCountry;
  }

  public void setShipToCountry(String shipToCountry) {
    this.shipToCountry = shipToCountry;
  }

  public BillOfLading shipToLocationNo(String shipToLocationNo) {
    this.shipToLocationNo = shipToLocationNo;
    return this;
  }

   /**
   * Get shipToLocationNo
   * @return shipToLocationNo
  **/
  @ApiModelProperty(value = "")
  public String getShipToLocationNo() {
    return shipToLocationNo;
  }

  public void setShipToLocationNo(String shipToLocationNo) {
    this.shipToLocationNo = shipToLocationNo;
  }

  public BillOfLading cid(String cid) {
    this.cid = cid;
    return this;
  }

   /**
   * Get cid
   * @return cid
  **/
  @ApiModelProperty(value = "")
  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  public BillOfLading isShipToFOB(Boolean isShipToFOB) {
    this.isShipToFOB = isShipToFOB;
    return this;
  }

   /**
   * Get isShipToFOB
   * @return isShipToFOB
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsShipToFOB() {
    return isShipToFOB;
  }

  public void setIsShipToFOB(Boolean isShipToFOB) {
    this.isShipToFOB = isShipToFOB;
  }

  public BillOfLading billToName(String billToName) {
    this.billToName = billToName;
    return this;
  }

   /**
   * Get billToName
   * @return billToName
  **/
  @ApiModelProperty(value = "")
  public String getBillToName() {
    return billToName;
  }

  public void setBillToName(String billToName) {
    this.billToName = billToName;
  }

  public BillOfLading billToAttention(String billToAttention) {
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

  public BillOfLading billToAddress(String billToAddress) {
    this.billToAddress = billToAddress;
    return this;
  }

   /**
   * Get billToAddress
   * @return billToAddress
  **/
  @ApiModelProperty(value = "")
  public String getBillToAddress() {
    return billToAddress;
  }

  public void setBillToAddress(String billToAddress) {
    this.billToAddress = billToAddress;
  }

  public BillOfLading billToCity(String billToCity) {
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

  public BillOfLading billToState(String billToState) {
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

  public BillOfLading billToZip(String billToZip) {
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

  public BillOfLading billToCountry(String billToCountry) {
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

  public BillOfLading isTrailerLoadedByShipper(Boolean isTrailerLoadedByShipper) {
    this.isTrailerLoadedByShipper = isTrailerLoadedByShipper;
    return this;
  }

   /**
   * Get isTrailerLoadedByShipper
   * @return isTrailerLoadedByShipper
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsTrailerLoadedByShipper() {
    return isTrailerLoadedByShipper;
  }

  public void setIsTrailerLoadedByShipper(Boolean isTrailerLoadedByShipper) {
    this.isTrailerLoadedByShipper = isTrailerLoadedByShipper;
  }

  public BillOfLading byDriver(Boolean byDriver) {
    this.byDriver = byDriver;
    return this;
  }

   /**
   * Get byDriver
   * @return byDriver
  **/
  @ApiModelProperty(value = "")
  public Boolean isByDriver() {
    return byDriver;
  }

  public void setByDriver(Boolean byDriver) {
    this.byDriver = byDriver;
  }

  public BillOfLading codAmount(BigDecimal codAmount) {
    this.codAmount = codAmount;
    return this;
  }

   /**
   * Get codAmount
   * @return codAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCodAmount() {
    return codAmount;
  }

  public void setCodAmount(BigDecimal codAmount) {
    this.codAmount = codAmount;
  }

  public BillOfLading feeTermsCollect(Boolean feeTermsCollect) {
    this.feeTermsCollect = feeTermsCollect;
    return this;
  }

   /**
   * Get feeTermsCollect
   * @return feeTermsCollect
  **/
  @ApiModelProperty(value = "")
  public Boolean isFeeTermsCollect() {
    return feeTermsCollect;
  }

  public void setFeeTermsCollect(Boolean feeTermsCollect) {
    this.feeTermsCollect = feeTermsCollect;
  }

  public BillOfLading feeTermsPrepaid(Boolean feeTermsPrepaid) {
    this.feeTermsPrepaid = feeTermsPrepaid;
    return this;
  }

   /**
   * Get feeTermsPrepaid
   * @return feeTermsPrepaid
  **/
  @ApiModelProperty(value = "")
  public Boolean isFeeTermsPrepaid() {
    return feeTermsPrepaid;
  }

  public void setFeeTermsPrepaid(Boolean feeTermsPrepaid) {
    this.feeTermsPrepaid = feeTermsPrepaid;
  }

  public BillOfLading customerCheckAcceptable(Boolean customerCheckAcceptable) {
    this.customerCheckAcceptable = customerCheckAcceptable;
    return this;
  }

   /**
   * Get customerCheckAcceptable
   * @return customerCheckAcceptable
  **/
  @ApiModelProperty(value = "")
  public Boolean isCustomerCheckAcceptable() {
    return customerCheckAcceptable;
  }

  public void setCustomerCheckAcceptable(Boolean customerCheckAcceptable) {
    this.customerCheckAcceptable = customerCheckAcceptable;
  }

  public BillOfLading carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

   /**
   * Get carrierName
   * @return carrierName
  **/
  @ApiModelProperty(value = "")
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  public BillOfLading trailerNo(String trailerNo) {
    this.trailerNo = trailerNo;
    return this;
  }

   /**
   * Get trailerNo
   * @return trailerNo
  **/
  @ApiModelProperty(value = "")
  public String getTrailerNo() {
    return trailerNo;
  }

  public void setTrailerNo(String trailerNo) {
    this.trailerNo = trailerNo;
  }

  public BillOfLading sealNo(String sealNo) {
    this.sealNo = sealNo;
    return this;
  }

   /**
   * Get sealNo
   * @return sealNo
  **/
  @ApiModelProperty(value = "")
  public String getSealNo() {
    return sealNo;
  }

  public void setSealNo(String sealNo) {
    this.sealNo = sealNo;
  }

  public BillOfLading scac(String scac) {
    this.scac = scac;
    return this;
  }

   /**
   * Get scac
   * @return scac
  **/
  @ApiModelProperty(value = "")
  public String getScac() {
    return scac;
  }

  public void setScac(String scac) {
    this.scac = scac;
  }

  public BillOfLading proNo(String proNo) {
    this.proNo = proNo;
    return this;
  }

   /**
   * Get proNo
   * @return proNo
  **/
  @ApiModelProperty(value = "")
  public String getProNo() {
    return proNo;
  }

  public void setProNo(String proNo) {
    this.proNo = proNo;
  }

  public BillOfLading prepaid(Boolean prepaid) {
    this.prepaid = prepaid;
    return this;
  }

   /**
   * Get prepaid
   * @return prepaid
  **/
  @ApiModelProperty(value = "")
  public Boolean isPrepaid() {
    return prepaid;
  }

  public void setPrepaid(Boolean prepaid) {
    this.prepaid = prepaid;
  }

  public BillOfLading collect(Boolean collect) {
    this.collect = collect;
    return this;
  }

   /**
   * Get collect
   * @return collect
  **/
  @ApiModelProperty(value = "")
  public Boolean isCollect() {
    return collect;
  }

  public void setCollect(Boolean collect) {
    this.collect = collect;
  }

  public BillOfLading thirdParty(Boolean thirdParty) {
    this.thirdParty = thirdParty;
    return this;
  }

   /**
   * Get thirdParty
   * @return thirdParty
  **/
  @ApiModelProperty(value = "")
  public Boolean isThirdParty() {
    return thirdParty;
  }

  public void setThirdParty(Boolean thirdParty) {
    this.thirdParty = thirdParty;
  }

  public BillOfLading isThisAMasterBOL(Boolean isThisAMasterBOL) {
    this.isThisAMasterBOL = isThisAMasterBOL;
    return this;
  }

   /**
   * Get isThisAMasterBOL
   * @return isThisAMasterBOL
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsThisAMasterBOL() {
    return isThisAMasterBOL;
  }

  public void setIsThisAMasterBOL(Boolean isThisAMasterBOL) {
    this.isThisAMasterBOL = isThisAMasterBOL;
  }

  public BillOfLading masterBOLId(Integer masterBOLId) {
    this.masterBOLId = masterBOLId;
    return this;
  }

   /**
   * Get masterBOLId
   * @return masterBOLId
  **/
  @ApiModelProperty(value = "")
  public Integer getMasterBOLId() {
    return masterBOLId;
  }

  public void setMasterBOLId(Integer masterBOLId) {
    this.masterBOLId = masterBOLId;
  }

  public BillOfLading isFreightCountedByShipper(Boolean isFreightCountedByShipper) {
    this.isFreightCountedByShipper = isFreightCountedByShipper;
    return this;
  }

   /**
   * Get isFreightCountedByShipper
   * @return isFreightCountedByShipper
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsFreightCountedByShipper() {
    return isFreightCountedByShipper;
  }

  public void setIsFreightCountedByShipper(Boolean isFreightCountedByShipper) {
    this.isFreightCountedByShipper = isFreightCountedByShipper;
  }

  public BillOfLading byDriverPallets(Boolean byDriverPallets) {
    this.byDriverPallets = byDriverPallets;
    return this;
  }

   /**
   * Get byDriverPallets
   * @return byDriverPallets
  **/
  @ApiModelProperty(value = "")
  public Boolean isByDriverPallets() {
    return byDriverPallets;
  }

  public void setByDriverPallets(Boolean byDriverPallets) {
    this.byDriverPallets = byDriverPallets;
  }

  public BillOfLading byDriverPieces(Boolean byDriverPieces) {
    this.byDriverPieces = byDriverPieces;
    return this;
  }

   /**
   * Get byDriverPieces
   * @return byDriverPieces
  **/
  @ApiModelProperty(value = "")
  public Boolean isByDriverPieces() {
    return byDriverPieces;
  }

  public void setByDriverPieces(Boolean byDriverPieces) {
    this.byDriverPieces = byDriverPieces;
  }

  public BillOfLading specialInstructions(String specialInstructions) {
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

  public BillOfLading orderInfoLines(List<BillOfLadingOrderInfoLine> orderInfoLines) {
    this.orderInfoLines = orderInfoLines;
    return this;
  }

  public BillOfLading addOrderInfoLinesItem(BillOfLadingOrderInfoLine orderInfoLinesItem) {
    if (this.orderInfoLines == null) {
      this.orderInfoLines = new ArrayList<BillOfLadingOrderInfoLine>();
    }
    this.orderInfoLines.add(orderInfoLinesItem);
    return this;
  }

   /**
   * Get orderInfoLines
   * @return orderInfoLines
  **/
  @ApiModelProperty(value = "")
  public List<BillOfLadingOrderInfoLine> getOrderInfoLines() {
    return orderInfoLines;
  }

  public void setOrderInfoLines(List<BillOfLadingOrderInfoLine> orderInfoLines) {
    this.orderInfoLines = orderInfoLines;
  }

  public BillOfLading carrierInfoLines(List<BillOfLadingCarrierInfoLine> carrierInfoLines) {
    this.carrierInfoLines = carrierInfoLines;
    return this;
  }

  public BillOfLading addCarrierInfoLinesItem(BillOfLadingCarrierInfoLine carrierInfoLinesItem) {
    if (this.carrierInfoLines == null) {
      this.carrierInfoLines = new ArrayList<BillOfLadingCarrierInfoLine>();
    }
    this.carrierInfoLines.add(carrierInfoLinesItem);
    return this;
  }

   /**
   * Get carrierInfoLines
   * @return carrierInfoLines
  **/
  @ApiModelProperty(value = "")
  public List<BillOfLadingCarrierInfoLine> getCarrierInfoLines() {
    return carrierInfoLines;
  }

  public void setCarrierInfoLines(List<BillOfLadingCarrierInfoLine> carrierInfoLines) {
    this.carrierInfoLines = carrierInfoLines;
  }

  public BillOfLading customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public BillOfLading putCustomFieldsItem(String key, Object customFieldsItem) {
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
    BillOfLading billOfLading = (BillOfLading) o;
    return Objects.equals(this.id, billOfLading.id) &&
        Objects.equals(this.createDate, billOfLading.createDate) &&
        Objects.equals(this.modifyDate, billOfLading.modifyDate) &&
        Objects.equals(this.lobId, billOfLading.lobId) &&
        Objects.equals(this.orderNo, billOfLading.orderNo) &&
        Objects.equals(this.bolNo, billOfLading.bolNo) &&
        Objects.equals(this.bolDate, billOfLading.bolDate) &&
        Objects.equals(this.shipFromName, billOfLading.shipFromName) &&
        Objects.equals(this.shipFromAttention, billOfLading.shipFromAttention) &&
        Objects.equals(this.shipFromAddress, billOfLading.shipFromAddress) &&
        Objects.equals(this.shipFromCity, billOfLading.shipFromCity) &&
        Objects.equals(this.shipFromState, billOfLading.shipFromState) &&
        Objects.equals(this.shipFromZip, billOfLading.shipFromZip) &&
        Objects.equals(this.shipFromCountry, billOfLading.shipFromCountry) &&
        Objects.equals(this.sid, billOfLading.sid) &&
        Objects.equals(this.isShipFromFOB, billOfLading.isShipFromFOB) &&
        Objects.equals(this.shipToName, billOfLading.shipToName) &&
        Objects.equals(this.shipToAttention, billOfLading.shipToAttention) &&
        Objects.equals(this.shipToAddress, billOfLading.shipToAddress) &&
        Objects.equals(this.shipToCity, billOfLading.shipToCity) &&
        Objects.equals(this.shipToState, billOfLading.shipToState) &&
        Objects.equals(this.shipToZip, billOfLading.shipToZip) &&
        Objects.equals(this.shipToCountry, billOfLading.shipToCountry) &&
        Objects.equals(this.shipToLocationNo, billOfLading.shipToLocationNo) &&
        Objects.equals(this.cid, billOfLading.cid) &&
        Objects.equals(this.isShipToFOB, billOfLading.isShipToFOB) &&
        Objects.equals(this.billToName, billOfLading.billToName) &&
        Objects.equals(this.billToAttention, billOfLading.billToAttention) &&
        Objects.equals(this.billToAddress, billOfLading.billToAddress) &&
        Objects.equals(this.billToCity, billOfLading.billToCity) &&
        Objects.equals(this.billToState, billOfLading.billToState) &&
        Objects.equals(this.billToZip, billOfLading.billToZip) &&
        Objects.equals(this.billToCountry, billOfLading.billToCountry) &&
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
        Objects.equals(this.carrierInfoLines, billOfLading.carrierInfoLines) &&
        Objects.equals(this.customFields, billOfLading.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, lobId, orderNo, bolNo, bolDate, shipFromName, shipFromAttention, shipFromAddress, shipFromCity, shipFromState, shipFromZip, shipFromCountry, sid, isShipFromFOB, shipToName, shipToAttention, shipToAddress, shipToCity, shipToState, shipToZip, shipToCountry, shipToLocationNo, cid, isShipToFOB, billToName, billToAttention, billToAddress, billToCity, billToState, billToZip, billToCountry, isTrailerLoadedByShipper, byDriver, codAmount, feeTermsCollect, feeTermsPrepaid, customerCheckAcceptable, carrierName, trailerNo, sealNo, scac, proNo, prepaid, collect, thirdParty, isThisAMasterBOL, masterBOLId, isFreightCountedByShipper, byDriverPallets, byDriverPieces, specialInstructions, orderInfoLines, carrierInfoLines, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillOfLading {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    bolNo: ").append(toIndentedString(bolNo)).append("\n");
    sb.append("    bolDate: ").append(toIndentedString(bolDate)).append("\n");
    sb.append("    shipFromName: ").append(toIndentedString(shipFromName)).append("\n");
    sb.append("    shipFromAttention: ").append(toIndentedString(shipFromAttention)).append("\n");
    sb.append("    shipFromAddress: ").append(toIndentedString(shipFromAddress)).append("\n");
    sb.append("    shipFromCity: ").append(toIndentedString(shipFromCity)).append("\n");
    sb.append("    shipFromState: ").append(toIndentedString(shipFromState)).append("\n");
    sb.append("    shipFromZip: ").append(toIndentedString(shipFromZip)).append("\n");
    sb.append("    shipFromCountry: ").append(toIndentedString(shipFromCountry)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    isShipFromFOB: ").append(toIndentedString(isShipFromFOB)).append("\n");
    sb.append("    shipToName: ").append(toIndentedString(shipToName)).append("\n");
    sb.append("    shipToAttention: ").append(toIndentedString(shipToAttention)).append("\n");
    sb.append("    shipToAddress: ").append(toIndentedString(shipToAddress)).append("\n");
    sb.append("    shipToCity: ").append(toIndentedString(shipToCity)).append("\n");
    sb.append("    shipToState: ").append(toIndentedString(shipToState)).append("\n");
    sb.append("    shipToZip: ").append(toIndentedString(shipToZip)).append("\n");
    sb.append("    shipToCountry: ").append(toIndentedString(shipToCountry)).append("\n");
    sb.append("    shipToLocationNo: ").append(toIndentedString(shipToLocationNo)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    isShipToFOB: ").append(toIndentedString(isShipToFOB)).append("\n");
    sb.append("    billToName: ").append(toIndentedString(billToName)).append("\n");
    sb.append("    billToAttention: ").append(toIndentedString(billToAttention)).append("\n");
    sb.append("    billToAddress: ").append(toIndentedString(billToAddress)).append("\n");
    sb.append("    billToCity: ").append(toIndentedString(billToCity)).append("\n");
    sb.append("    billToState: ").append(toIndentedString(billToState)).append("\n");
    sb.append("    billToZip: ").append(toIndentedString(billToZip)).append("\n");
    sb.append("    billToCountry: ").append(toIndentedString(billToCountry)).append("\n");
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

