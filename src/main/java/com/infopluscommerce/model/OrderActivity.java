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
public class OrderActivity   {
  
  private BigDecimal orderNo = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String alternateUsage = null;
  private BigDecimal groupOrderId = null;
  private String status = null;
  private String reqStatusName = null;
  private Integer fulfillmentProcessId = null;
  private Integer carrierId = null;
  private String carrierName = null;
  private Integer lobId = null;
  private String mediaCode = null;
  private String legacyRestrictionType = null;
  private String reqTypeName = null;
  private String serviceTypeId = null;
  private String serviceTypeName = null;
  private String alcoholOrderType = null;
  private String distributionChannel = null;
  private String distributionChannelName = null;
  private Integer priorityCode = null;
  private Date orderDate = null;
  private String enteredBy = null;
  private Integer orderReason = null;
  private String customerOrderNo = null;
  private String priceLevel = null;
  private Date orderCreateDate = null;
  private Date orderModifyDate = null;
  private Date shipBy = null;
  private String stopBackOrders = null;
  private Integer warehouseId = null;
  private Integer orderSourceId = null;
  private String orderSourceName = null;
  private Integer integrationPartnerId = null;
  private String integrationPartnerName = null;
  private Integer orderLoadProgramId = null;
  private String orderLoadProgramName = null;
  private Integer omsOrderNo = null;
  private Integer omsCustomerId = null;
  private String shipToAttention = null;
  private String shipToCompany = null;
  private String shipToStreet = null;
  private String shipToStreet2 = null;
  private String shipToStreet3 = null;
  private String shipToCity = null;
  private String shipToState = null;
  private String shipToZip = null;
  private String shipToCountry = null;
  private String shipToPhone = null;
  private String shipToEmail = null;
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
  private Date shipDate = null;
  private BigDecimal freight = null;
  private BigDecimal weightLbs = null;
  private BigDecimal estimatedWeightLbs = null;
  private Integer numberOfCartons = null;
  private Integer numberOfPallets = null;
  private Integer numberOfLineItems = null;
  private String completionStatus = null;
  private String holdCode = null;
  private String shipCode = null;
  private String orderMessage = null;
  private Integer division = null;
  private String costCenter = null;
  private String authorizedBy = null;
  private String batchNo = null;
  private Date firstShipDate = null;
  private Date lastShipDate = null;
  private Date deliverOnDate = null;
  private String customerPONo = null;
  private String shipVia = null;
  private Date needByDate = null;
  private BigDecimal total = null;
  private BigDecimal balanceDue = null;
  private BigDecimal totalPaid = null;
  private BigDecimal authorizationAmount = null;
  private BigDecimal subtotal = null;
  private BigDecimal taxOnFreight = null;
  private BigDecimal tax = null;
  private BigDecimal distributionCharges = null;
  private BigDecimal shippingCharge = null;
  private BigDecimal totalDiscount = null;
  private Integer parcelAccountId = null;
  private Integer packingSlipTemplateId = null;
  private String giftMessage = null;
  private String branchSector = null;
  private String branchArea = null;
  private String branchCustomerType = null;
  private String branchId = null;
  private String orderCode = null;
  private String leadPackageId = null;
  private Date deliveredDate = null;
  private Integer totalQty = null;
  private Integer numberOfWraps = null;
  private Integer numberOfCases = null;
  private Integer numberOfTouches = null;
  private Integer estimatedNumberOfPicks = null;
  private Integer orderConfirmationEmailTemplateId = null;
  private Integer shipmentConfirmationEmailTemplateId = null;
  private Integer externalShippingSystemId = null;
  private String shippingSystemName = null;
  private Integer orderInvoiceTemplateId = null;
  private String priceMode = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderNo")
  public BigDecimal getOrderNo() {
    return orderNo;
  }

  
  /**
   **/
  public OrderActivity createDate(Date createDate) {
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
  public OrderActivity modifyDate(Date modifyDate) {
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
  public OrderActivity alternateUsage(String alternateUsage) {
    this.alternateUsage = alternateUsage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alternateUsage")
  public String getAlternateUsage() {
    return alternateUsage;
  }
  public void setAlternateUsage(String alternateUsage) {
    this.alternateUsage = alternateUsage;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("groupOrderId")
  public BigDecimal getGroupOrderId() {
    return groupOrderId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  
  /**
   **/
  public OrderActivity reqStatusName(String reqStatusName) {
    this.reqStatusName = reqStatusName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reqStatusName")
  public String getReqStatusName() {
    return reqStatusName;
  }
  public void setReqStatusName(String reqStatusName) {
    this.reqStatusName = reqStatusName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fulfillmentProcessId")
  public Integer getFulfillmentProcessId() {
    return fulfillmentProcessId;
  }

  
  /**
   **/
  public OrderActivity carrierId(Integer carrierId) {
    this.carrierId = carrierId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("carrierId")
  public Integer getCarrierId() {
    return carrierId;
  }
  public void setCarrierId(Integer carrierId) {
    this.carrierId = carrierId;
  }

  
  /**
   **/
  public OrderActivity carrierName(String carrierName) {
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
  public OrderActivity lobId(Integer lobId) {
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
  public OrderActivity mediaCode(String mediaCode) {
    this.mediaCode = mediaCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("mediaCode")
  public String getMediaCode() {
    return mediaCode;
  }
  public void setMediaCode(String mediaCode) {
    this.mediaCode = mediaCode;
  }

  
  /**
   **/
  public OrderActivity legacyRestrictionType(String legacyRestrictionType) {
    this.legacyRestrictionType = legacyRestrictionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("legacyRestrictionType")
  public String getLegacyRestrictionType() {
    return legacyRestrictionType;
  }
  public void setLegacyRestrictionType(String legacyRestrictionType) {
    this.legacyRestrictionType = legacyRestrictionType;
  }

  
  /**
   **/
  public OrderActivity reqTypeName(String reqTypeName) {
    this.reqTypeName = reqTypeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reqTypeName")
  public String getReqTypeName() {
    return reqTypeName;
  }
  public void setReqTypeName(String reqTypeName) {
    this.reqTypeName = reqTypeName;
  }

  
  /**
   **/
  public OrderActivity serviceTypeId(String serviceTypeId) {
    this.serviceTypeId = serviceTypeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceTypeId")
  public String getServiceTypeId() {
    return serviceTypeId;
  }
  public void setServiceTypeId(String serviceTypeId) {
    this.serviceTypeId = serviceTypeId;
  }

  
  /**
   **/
  public OrderActivity serviceTypeName(String serviceTypeName) {
    this.serviceTypeName = serviceTypeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceTypeName")
  public String getServiceTypeName() {
    return serviceTypeName;
  }
  public void setServiceTypeName(String serviceTypeName) {
    this.serviceTypeName = serviceTypeName;
  }

  
  /**
   **/
  public OrderActivity alcoholOrderType(String alcoholOrderType) {
    this.alcoholOrderType = alcoholOrderType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholOrderType")
  public String getAlcoholOrderType() {
    return alcoholOrderType;
  }
  public void setAlcoholOrderType(String alcoholOrderType) {
    this.alcoholOrderType = alcoholOrderType;
  }

  
  /**
   **/
  public OrderActivity distributionChannel(String distributionChannel) {
    this.distributionChannel = distributionChannel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("distributionChannel")
  public String getDistributionChannel() {
    return distributionChannel;
  }
  public void setDistributionChannel(String distributionChannel) {
    this.distributionChannel = distributionChannel;
  }

  
  /**
   **/
  public OrderActivity distributionChannelName(String distributionChannelName) {
    this.distributionChannelName = distributionChannelName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("distributionChannelName")
  public String getDistributionChannelName() {
    return distributionChannelName;
  }
  public void setDistributionChannelName(String distributionChannelName) {
    this.distributionChannelName = distributionChannelName;
  }

  
  /**
   **/
  public OrderActivity priorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("priorityCode")
  public Integer getPriorityCode() {
    return priorityCode;
  }
  public void setPriorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
  }

  
  /**
   **/
  public OrderActivity orderDate(Date orderDate) {
    this.orderDate = orderDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("orderDate")
  public Date getOrderDate() {
    return orderDate;
  }
  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enteredBy")
  public String getEnteredBy() {
    return enteredBy;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderReason")
  public Integer getOrderReason() {
    return orderReason;
  }

  
  /**
   **/
  public OrderActivity customerOrderNo(String customerOrderNo) {
    this.customerOrderNo = customerOrderNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerOrderNo")
  public String getCustomerOrderNo() {
    return customerOrderNo;
  }
  public void setCustomerOrderNo(String customerOrderNo) {
    this.customerOrderNo = customerOrderNo;
  }

  
  /**
   **/
  public OrderActivity priceLevel(String priceLevel) {
    this.priceLevel = priceLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("priceLevel")
  public String getPriceLevel() {
    return priceLevel;
  }
  public void setPriceLevel(String priceLevel) {
    this.priceLevel = priceLevel;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderCreateDate")
  public Date getOrderCreateDate() {
    return orderCreateDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderModifyDate")
  public Date getOrderModifyDate() {
    return orderModifyDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipBy")
  public Date getShipBy() {
    return shipBy;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stopBackOrders")
  public String getStopBackOrders() {
    return stopBackOrders;
  }

  
  /**
   **/
  public OrderActivity warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  
  /**
   **/
  public OrderActivity orderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderSourceId")
  public Integer getOrderSourceId() {
    return orderSourceId;
  }
  public void setOrderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
  }

  
  /**
   **/
  public OrderActivity orderSourceName(String orderSourceName) {
    this.orderSourceName = orderSourceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderSourceName")
  public String getOrderSourceName() {
    return orderSourceName;
  }
  public void setOrderSourceName(String orderSourceName) {
    this.orderSourceName = orderSourceName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("integrationPartnerId")
  public Integer getIntegrationPartnerId() {
    return integrationPartnerId;
  }

  
  /**
   **/
  public OrderActivity integrationPartnerName(String integrationPartnerName) {
    this.integrationPartnerName = integrationPartnerName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("integrationPartnerName")
  public String getIntegrationPartnerName() {
    return integrationPartnerName;
  }
  public void setIntegrationPartnerName(String integrationPartnerName) {
    this.integrationPartnerName = integrationPartnerName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderLoadProgramId")
  public Integer getOrderLoadProgramId() {
    return orderLoadProgramId;
  }

  
  /**
   **/
  public OrderActivity orderLoadProgramName(String orderLoadProgramName) {
    this.orderLoadProgramName = orderLoadProgramName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderLoadProgramName")
  public String getOrderLoadProgramName() {
    return orderLoadProgramName;
  }
  public void setOrderLoadProgramName(String orderLoadProgramName) {
    this.orderLoadProgramName = orderLoadProgramName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("omsOrderNo")
  public Integer getOmsOrderNo() {
    return omsOrderNo;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("omsCustomerId")
  public Integer getOmsCustomerId() {
    return omsCustomerId;
  }

  
  /**
   **/
  public OrderActivity shipToAttention(String shipToAttention) {
    this.shipToAttention = shipToAttention;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToAttention")
  public String getShipToAttention() {
    return shipToAttention;
  }
  public void setShipToAttention(String shipToAttention) {
    this.shipToAttention = shipToAttention;
  }

  
  /**
   **/
  public OrderActivity shipToCompany(String shipToCompany) {
    this.shipToCompany = shipToCompany;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToCompany")
  public String getShipToCompany() {
    return shipToCompany;
  }
  public void setShipToCompany(String shipToCompany) {
    this.shipToCompany = shipToCompany;
  }

  
  /**
   **/
  public OrderActivity shipToStreet(String shipToStreet) {
    this.shipToStreet = shipToStreet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToStreet")
  public String getShipToStreet() {
    return shipToStreet;
  }
  public void setShipToStreet(String shipToStreet) {
    this.shipToStreet = shipToStreet;
  }

  
  /**
   **/
  public OrderActivity shipToStreet2(String shipToStreet2) {
    this.shipToStreet2 = shipToStreet2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToStreet2")
  public String getShipToStreet2() {
    return shipToStreet2;
  }
  public void setShipToStreet2(String shipToStreet2) {
    this.shipToStreet2 = shipToStreet2;
  }

  
  /**
   **/
  public OrderActivity shipToStreet3(String shipToStreet3) {
    this.shipToStreet3 = shipToStreet3;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToStreet3")
  public String getShipToStreet3() {
    return shipToStreet3;
  }
  public void setShipToStreet3(String shipToStreet3) {
    this.shipToStreet3 = shipToStreet3;
  }

  
  /**
   **/
  public OrderActivity shipToCity(String shipToCity) {
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
  public OrderActivity shipToState(String shipToState) {
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
  public OrderActivity shipToZip(String shipToZip) {
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
  public OrderActivity shipToCountry(String shipToCountry) {
    this.shipToCountry = shipToCountry;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToCountry")
  public String getShipToCountry() {
    return shipToCountry;
  }
  public void setShipToCountry(String shipToCountry) {
    this.shipToCountry = shipToCountry;
  }

  
  /**
   **/
  public OrderActivity shipToPhone(String shipToPhone) {
    this.shipToPhone = shipToPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToPhone")
  public String getShipToPhone() {
    return shipToPhone;
  }
  public void setShipToPhone(String shipToPhone) {
    this.shipToPhone = shipToPhone;
  }

  
  /**
   **/
  public OrderActivity shipToEmail(String shipToEmail) {
    this.shipToEmail = shipToEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToEmail")
  public String getShipToEmail() {
    return shipToEmail;
  }
  public void setShipToEmail(String shipToEmail) {
    this.shipToEmail = shipToEmail;
  }

  
  /**
   **/
  public OrderActivity billToAttention(String billToAttention) {
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
  public OrderActivity billToCompany(String billToCompany) {
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
  public OrderActivity billToStreet(String billToStreet) {
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
  public OrderActivity billToStreet2(String billToStreet2) {
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
  public OrderActivity billToStreet3(String billToStreet3) {
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
  public OrderActivity billToCity(String billToCity) {
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
  public OrderActivity billToState(String billToState) {
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
  public OrderActivity billToZip(String billToZip) {
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
  public OrderActivity billToCountry(String billToCountry) {
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
  public OrderActivity billToPhone(String billToPhone) {
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
  public OrderActivity billToEmail(String billToEmail) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipDate")
  public Date getShipDate() {
    return shipDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("freight")
  public BigDecimal getFreight() {
    return freight;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weightLbs")
  public BigDecimal getWeightLbs() {
    return weightLbs;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("estimatedWeightLbs")
  public BigDecimal getEstimatedWeightLbs() {
    return estimatedWeightLbs;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfCartons")
  public Integer getNumberOfCartons() {
    return numberOfCartons;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfPallets")
  public Integer getNumberOfPallets() {
    return numberOfPallets;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfLineItems")
  public Integer getNumberOfLineItems() {
    return numberOfLineItems;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("completionStatus")
  public String getCompletionStatus() {
    return completionStatus;
  }

  
  /**
   **/
  public OrderActivity holdCode(String holdCode) {
    this.holdCode = holdCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("holdCode")
  public String getHoldCode() {
    return holdCode;
  }
  public void setHoldCode(String holdCode) {
    this.holdCode = holdCode;
  }

  
  /**
   **/
  public OrderActivity shipCode(String shipCode) {
    this.shipCode = shipCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipCode")
  public String getShipCode() {
    return shipCode;
  }
  public void setShipCode(String shipCode) {
    this.shipCode = shipCode;
  }

  
  /**
   **/
  public OrderActivity orderMessage(String orderMessage) {
    this.orderMessage = orderMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderMessage")
  public String getOrderMessage() {
    return orderMessage;
  }
  public void setOrderMessage(String orderMessage) {
    this.orderMessage = orderMessage;
  }

  
  /**
   **/
  public OrderActivity division(Integer division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public Integer getDivision() {
    return division;
  }
  public void setDivision(Integer division) {
    this.division = division;
  }

  
  /**
   **/
  public OrderActivity costCenter(String costCenter) {
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
  public OrderActivity authorizedBy(String authorizedBy) {
    this.authorizedBy = authorizedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("authorizedBy")
  public String getAuthorizedBy() {
    return authorizedBy;
  }
  public void setAuthorizedBy(String authorizedBy) {
    this.authorizedBy = authorizedBy;
  }

  
  /**
   **/
  public OrderActivity batchNo(String batchNo) {
    this.batchNo = batchNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("batchNo")
  public String getBatchNo() {
    return batchNo;
  }
  public void setBatchNo(String batchNo) {
    this.batchNo = batchNo;
  }

  
  /**
   **/
  public OrderActivity firstShipDate(Date firstShipDate) {
    this.firstShipDate = firstShipDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("firstShipDate")
  public Date getFirstShipDate() {
    return firstShipDate;
  }
  public void setFirstShipDate(Date firstShipDate) {
    this.firstShipDate = firstShipDate;
  }

  
  /**
   **/
  public OrderActivity lastShipDate(Date lastShipDate) {
    this.lastShipDate = lastShipDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastShipDate")
  public Date getLastShipDate() {
    return lastShipDate;
  }
  public void setLastShipDate(Date lastShipDate) {
    this.lastShipDate = lastShipDate;
  }

  
  /**
   **/
  public OrderActivity deliverOnDate(Date deliverOnDate) {
    this.deliverOnDate = deliverOnDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deliverOnDate")
  public Date getDeliverOnDate() {
    return deliverOnDate;
  }
  public void setDeliverOnDate(Date deliverOnDate) {
    this.deliverOnDate = deliverOnDate;
  }

  
  /**
   **/
  public OrderActivity customerPONo(String customerPONo) {
    this.customerPONo = customerPONo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerPONo")
  public String getCustomerPONo() {
    return customerPONo;
  }
  public void setCustomerPONo(String customerPONo) {
    this.customerPONo = customerPONo;
  }

  
  /**
   **/
  public OrderActivity shipVia(String shipVia) {
    this.shipVia = shipVia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipVia")
  public String getShipVia() {
    return shipVia;
  }
  public void setShipVia(String shipVia) {
    this.shipVia = shipVia;
  }

  
  /**
   **/
  public OrderActivity needByDate(Date needByDate) {
    this.needByDate = needByDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("needByDate")
  public Date getNeedByDate() {
    return needByDate;
  }
  public void setNeedByDate(Date needByDate) {
    this.needByDate = needByDate;
  }

  
  /**
   **/
  public OrderActivity total(BigDecimal total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }
  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("balanceDue")
  public BigDecimal getBalanceDue() {
    return balanceDue;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalPaid")
  public BigDecimal getTotalPaid() {
    return totalPaid;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("authorizationAmount")
  public BigDecimal getAuthorizationAmount() {
    return authorizationAmount;
  }

  
  /**
   **/
  public OrderActivity subtotal(BigDecimal subtotal) {
    this.subtotal = subtotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("subtotal")
  public BigDecimal getSubtotal() {
    return subtotal;
  }
  public void setSubtotal(BigDecimal subtotal) {
    this.subtotal = subtotal;
  }

  
  /**
   **/
  public OrderActivity taxOnFreight(BigDecimal taxOnFreight) {
    this.taxOnFreight = taxOnFreight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("taxOnFreight")
  public BigDecimal getTaxOnFreight() {
    return taxOnFreight;
  }
  public void setTaxOnFreight(BigDecimal taxOnFreight) {
    this.taxOnFreight = taxOnFreight;
  }

  
  /**
   **/
  public OrderActivity tax(BigDecimal tax) {
    this.tax = tax;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tax")
  public BigDecimal getTax() {
    return tax;
  }
  public void setTax(BigDecimal tax) {
    this.tax = tax;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("distributionCharges")
  public BigDecimal getDistributionCharges() {
    return distributionCharges;
  }

  
  /**
   **/
  public OrderActivity shippingCharge(BigDecimal shippingCharge) {
    this.shippingCharge = shippingCharge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shippingCharge")
  public BigDecimal getShippingCharge() {
    return shippingCharge;
  }
  public void setShippingCharge(BigDecimal shippingCharge) {
    this.shippingCharge = shippingCharge;
  }

  
  /**
   **/
  public OrderActivity totalDiscount(BigDecimal totalDiscount) {
    this.totalDiscount = totalDiscount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalDiscount")
  public BigDecimal getTotalDiscount() {
    return totalDiscount;
  }
  public void setTotalDiscount(BigDecimal totalDiscount) {
    this.totalDiscount = totalDiscount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parcelAccountId")
  public Integer getParcelAccountId() {
    return parcelAccountId;
  }

  
  /**
   **/
  public OrderActivity packingSlipTemplateId(Integer packingSlipTemplateId) {
    this.packingSlipTemplateId = packingSlipTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("packingSlipTemplateId")
  public Integer getPackingSlipTemplateId() {
    return packingSlipTemplateId;
  }
  public void setPackingSlipTemplateId(Integer packingSlipTemplateId) {
    this.packingSlipTemplateId = packingSlipTemplateId;
  }

  
  /**
   **/
  public OrderActivity giftMessage(String giftMessage) {
    this.giftMessage = giftMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("giftMessage")
  public String getGiftMessage() {
    return giftMessage;
  }
  public void setGiftMessage(String giftMessage) {
    this.giftMessage = giftMessage;
  }

  
  /**
   **/
  public OrderActivity branchSector(String branchSector) {
    this.branchSector = branchSector;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("branchSector")
  public String getBranchSector() {
    return branchSector;
  }
  public void setBranchSector(String branchSector) {
    this.branchSector = branchSector;
  }

  
  /**
   **/
  public OrderActivity branchArea(String branchArea) {
    this.branchArea = branchArea;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("branchArea")
  public String getBranchArea() {
    return branchArea;
  }
  public void setBranchArea(String branchArea) {
    this.branchArea = branchArea;
  }

  
  /**
   **/
  public OrderActivity branchCustomerType(String branchCustomerType) {
    this.branchCustomerType = branchCustomerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("branchCustomerType")
  public String getBranchCustomerType() {
    return branchCustomerType;
  }
  public void setBranchCustomerType(String branchCustomerType) {
    this.branchCustomerType = branchCustomerType;
  }

  
  /**
   **/
  public OrderActivity branchId(String branchId) {
    this.branchId = branchId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("branchId")
  public String getBranchId() {
    return branchId;
  }
  public void setBranchId(String branchId) {
    this.branchId = branchId;
  }

  
  /**
   **/
  public OrderActivity orderCode(String orderCode) {
    this.orderCode = orderCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderCode")
  public String getOrderCode() {
    return orderCode;
  }
  public void setOrderCode(String orderCode) {
    this.orderCode = orderCode;
  }

  
  /**
   **/
  public OrderActivity leadPackageId(String leadPackageId) {
    this.leadPackageId = leadPackageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("leadPackageId")
  public String getLeadPackageId() {
    return leadPackageId;
  }
  public void setLeadPackageId(String leadPackageId) {
    this.leadPackageId = leadPackageId;
  }

  
  /**
   **/
  public OrderActivity deliveredDate(Date deliveredDate) {
    this.deliveredDate = deliveredDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deliveredDate")
  public Date getDeliveredDate() {
    return deliveredDate;
  }
  public void setDeliveredDate(Date deliveredDate) {
    this.deliveredDate = deliveredDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalQty")
  public Integer getTotalQty() {
    return totalQty;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfWraps")
  public Integer getNumberOfWraps() {
    return numberOfWraps;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfCases")
  public Integer getNumberOfCases() {
    return numberOfCases;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfTouches")
  public Integer getNumberOfTouches() {
    return numberOfTouches;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("estimatedNumberOfPicks")
  public Integer getEstimatedNumberOfPicks() {
    return estimatedNumberOfPicks;
  }

  
  /**
   **/
  public OrderActivity orderConfirmationEmailTemplateId(Integer orderConfirmationEmailTemplateId) {
    this.orderConfirmationEmailTemplateId = orderConfirmationEmailTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderConfirmationEmailTemplateId")
  public Integer getOrderConfirmationEmailTemplateId() {
    return orderConfirmationEmailTemplateId;
  }
  public void setOrderConfirmationEmailTemplateId(Integer orderConfirmationEmailTemplateId) {
    this.orderConfirmationEmailTemplateId = orderConfirmationEmailTemplateId;
  }

  
  /**
   **/
  public OrderActivity shipmentConfirmationEmailTemplateId(Integer shipmentConfirmationEmailTemplateId) {
    this.shipmentConfirmationEmailTemplateId = shipmentConfirmationEmailTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipmentConfirmationEmailTemplateId")
  public Integer getShipmentConfirmationEmailTemplateId() {
    return shipmentConfirmationEmailTemplateId;
  }
  public void setShipmentConfirmationEmailTemplateId(Integer shipmentConfirmationEmailTemplateId) {
    this.shipmentConfirmationEmailTemplateId = shipmentConfirmationEmailTemplateId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalShippingSystemId")
  public Integer getExternalShippingSystemId() {
    return externalShippingSystemId;
  }

  
  /**
   **/
  public OrderActivity shippingSystemName(String shippingSystemName) {
    this.shippingSystemName = shippingSystemName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shippingSystemName")
  public String getShippingSystemName() {
    return shippingSystemName;
  }
  public void setShippingSystemName(String shippingSystemName) {
    this.shippingSystemName = shippingSystemName;
  }

  
  /**
   **/
  public OrderActivity orderInvoiceTemplateId(Integer orderInvoiceTemplateId) {
    this.orderInvoiceTemplateId = orderInvoiceTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderInvoiceTemplateId")
  public Integer getOrderInvoiceTemplateId() {
    return orderInvoiceTemplateId;
  }
  public void setOrderInvoiceTemplateId(Integer orderInvoiceTemplateId) {
    this.orderInvoiceTemplateId = orderInvoiceTemplateId;
  }

  
  /**
   **/
  public OrderActivity priceMode(String priceMode) {
    this.priceMode = priceMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("priceMode")
  public String getPriceMode() {
    return priceMode;
  }
  public void setPriceMode(String priceMode) {
    this.priceMode = priceMode;
  }

  
  /**
   **/
  public OrderActivity customFields(Map<String, Object> customFields) {
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
    OrderActivity orderActivity = (OrderActivity) o;
    return Objects.equals(this.orderNo, orderActivity.orderNo) &&
        Objects.equals(this.createDate, orderActivity.createDate) &&
        Objects.equals(this.modifyDate, orderActivity.modifyDate) &&
        Objects.equals(this.alternateUsage, orderActivity.alternateUsage) &&
        Objects.equals(this.groupOrderId, orderActivity.groupOrderId) &&
        Objects.equals(this.status, orderActivity.status) &&
        Objects.equals(this.reqStatusName, orderActivity.reqStatusName) &&
        Objects.equals(this.fulfillmentProcessId, orderActivity.fulfillmentProcessId) &&
        Objects.equals(this.carrierId, orderActivity.carrierId) &&
        Objects.equals(this.carrierName, orderActivity.carrierName) &&
        Objects.equals(this.lobId, orderActivity.lobId) &&
        Objects.equals(this.mediaCode, orderActivity.mediaCode) &&
        Objects.equals(this.legacyRestrictionType, orderActivity.legacyRestrictionType) &&
        Objects.equals(this.reqTypeName, orderActivity.reqTypeName) &&
        Objects.equals(this.serviceTypeId, orderActivity.serviceTypeId) &&
        Objects.equals(this.serviceTypeName, orderActivity.serviceTypeName) &&
        Objects.equals(this.alcoholOrderType, orderActivity.alcoholOrderType) &&
        Objects.equals(this.distributionChannel, orderActivity.distributionChannel) &&
        Objects.equals(this.distributionChannelName, orderActivity.distributionChannelName) &&
        Objects.equals(this.priorityCode, orderActivity.priorityCode) &&
        Objects.equals(this.orderDate, orderActivity.orderDate) &&
        Objects.equals(this.enteredBy, orderActivity.enteredBy) &&
        Objects.equals(this.orderReason, orderActivity.orderReason) &&
        Objects.equals(this.customerOrderNo, orderActivity.customerOrderNo) &&
        Objects.equals(this.priceLevel, orderActivity.priceLevel) &&
        Objects.equals(this.orderCreateDate, orderActivity.orderCreateDate) &&
        Objects.equals(this.orderModifyDate, orderActivity.orderModifyDate) &&
        Objects.equals(this.shipBy, orderActivity.shipBy) &&
        Objects.equals(this.stopBackOrders, orderActivity.stopBackOrders) &&
        Objects.equals(this.warehouseId, orderActivity.warehouseId) &&
        Objects.equals(this.orderSourceId, orderActivity.orderSourceId) &&
        Objects.equals(this.orderSourceName, orderActivity.orderSourceName) &&
        Objects.equals(this.integrationPartnerId, orderActivity.integrationPartnerId) &&
        Objects.equals(this.integrationPartnerName, orderActivity.integrationPartnerName) &&
        Objects.equals(this.orderLoadProgramId, orderActivity.orderLoadProgramId) &&
        Objects.equals(this.orderLoadProgramName, orderActivity.orderLoadProgramName) &&
        Objects.equals(this.omsOrderNo, orderActivity.omsOrderNo) &&
        Objects.equals(this.omsCustomerId, orderActivity.omsCustomerId) &&
        Objects.equals(this.shipToAttention, orderActivity.shipToAttention) &&
        Objects.equals(this.shipToCompany, orderActivity.shipToCompany) &&
        Objects.equals(this.shipToStreet, orderActivity.shipToStreet) &&
        Objects.equals(this.shipToStreet2, orderActivity.shipToStreet2) &&
        Objects.equals(this.shipToStreet3, orderActivity.shipToStreet3) &&
        Objects.equals(this.shipToCity, orderActivity.shipToCity) &&
        Objects.equals(this.shipToState, orderActivity.shipToState) &&
        Objects.equals(this.shipToZip, orderActivity.shipToZip) &&
        Objects.equals(this.shipToCountry, orderActivity.shipToCountry) &&
        Objects.equals(this.shipToPhone, orderActivity.shipToPhone) &&
        Objects.equals(this.shipToEmail, orderActivity.shipToEmail) &&
        Objects.equals(this.billToAttention, orderActivity.billToAttention) &&
        Objects.equals(this.billToCompany, orderActivity.billToCompany) &&
        Objects.equals(this.billToStreet, orderActivity.billToStreet) &&
        Objects.equals(this.billToStreet2, orderActivity.billToStreet2) &&
        Objects.equals(this.billToStreet3, orderActivity.billToStreet3) &&
        Objects.equals(this.billToCity, orderActivity.billToCity) &&
        Objects.equals(this.billToState, orderActivity.billToState) &&
        Objects.equals(this.billToZip, orderActivity.billToZip) &&
        Objects.equals(this.billToCountry, orderActivity.billToCountry) &&
        Objects.equals(this.billToPhone, orderActivity.billToPhone) &&
        Objects.equals(this.billToEmail, orderActivity.billToEmail) &&
        Objects.equals(this.shipDate, orderActivity.shipDate) &&
        Objects.equals(this.freight, orderActivity.freight) &&
        Objects.equals(this.weightLbs, orderActivity.weightLbs) &&
        Objects.equals(this.estimatedWeightLbs, orderActivity.estimatedWeightLbs) &&
        Objects.equals(this.numberOfCartons, orderActivity.numberOfCartons) &&
        Objects.equals(this.numberOfPallets, orderActivity.numberOfPallets) &&
        Objects.equals(this.numberOfLineItems, orderActivity.numberOfLineItems) &&
        Objects.equals(this.completionStatus, orderActivity.completionStatus) &&
        Objects.equals(this.holdCode, orderActivity.holdCode) &&
        Objects.equals(this.shipCode, orderActivity.shipCode) &&
        Objects.equals(this.orderMessage, orderActivity.orderMessage) &&
        Objects.equals(this.division, orderActivity.division) &&
        Objects.equals(this.costCenter, orderActivity.costCenter) &&
        Objects.equals(this.authorizedBy, orderActivity.authorizedBy) &&
        Objects.equals(this.batchNo, orderActivity.batchNo) &&
        Objects.equals(this.firstShipDate, orderActivity.firstShipDate) &&
        Objects.equals(this.lastShipDate, orderActivity.lastShipDate) &&
        Objects.equals(this.deliverOnDate, orderActivity.deliverOnDate) &&
        Objects.equals(this.customerPONo, orderActivity.customerPONo) &&
        Objects.equals(this.shipVia, orderActivity.shipVia) &&
        Objects.equals(this.needByDate, orderActivity.needByDate) &&
        Objects.equals(this.total, orderActivity.total) &&
        Objects.equals(this.balanceDue, orderActivity.balanceDue) &&
        Objects.equals(this.totalPaid, orderActivity.totalPaid) &&
        Objects.equals(this.authorizationAmount, orderActivity.authorizationAmount) &&
        Objects.equals(this.subtotal, orderActivity.subtotal) &&
        Objects.equals(this.taxOnFreight, orderActivity.taxOnFreight) &&
        Objects.equals(this.tax, orderActivity.tax) &&
        Objects.equals(this.distributionCharges, orderActivity.distributionCharges) &&
        Objects.equals(this.shippingCharge, orderActivity.shippingCharge) &&
        Objects.equals(this.totalDiscount, orderActivity.totalDiscount) &&
        Objects.equals(this.parcelAccountId, orderActivity.parcelAccountId) &&
        Objects.equals(this.packingSlipTemplateId, orderActivity.packingSlipTemplateId) &&
        Objects.equals(this.giftMessage, orderActivity.giftMessage) &&
        Objects.equals(this.branchSector, orderActivity.branchSector) &&
        Objects.equals(this.branchArea, orderActivity.branchArea) &&
        Objects.equals(this.branchCustomerType, orderActivity.branchCustomerType) &&
        Objects.equals(this.branchId, orderActivity.branchId) &&
        Objects.equals(this.orderCode, orderActivity.orderCode) &&
        Objects.equals(this.leadPackageId, orderActivity.leadPackageId) &&
        Objects.equals(this.deliveredDate, orderActivity.deliveredDate) &&
        Objects.equals(this.totalQty, orderActivity.totalQty) &&
        Objects.equals(this.numberOfWraps, orderActivity.numberOfWraps) &&
        Objects.equals(this.numberOfCases, orderActivity.numberOfCases) &&
        Objects.equals(this.numberOfTouches, orderActivity.numberOfTouches) &&
        Objects.equals(this.estimatedNumberOfPicks, orderActivity.estimatedNumberOfPicks) &&
        Objects.equals(this.orderConfirmationEmailTemplateId, orderActivity.orderConfirmationEmailTemplateId) &&
        Objects.equals(this.shipmentConfirmationEmailTemplateId, orderActivity.shipmentConfirmationEmailTemplateId) &&
        Objects.equals(this.externalShippingSystemId, orderActivity.externalShippingSystemId) &&
        Objects.equals(this.shippingSystemName, orderActivity.shippingSystemName) &&
        Objects.equals(this.orderInvoiceTemplateId, orderActivity.orderInvoiceTemplateId) &&
        Objects.equals(this.priceMode, orderActivity.priceMode) &&
        Objects.equals(this.customFields, orderActivity.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNo, createDate, modifyDate, alternateUsage, groupOrderId, status, reqStatusName, fulfillmentProcessId, carrierId, carrierName, lobId, mediaCode, legacyRestrictionType, reqTypeName, serviceTypeId, serviceTypeName, alcoholOrderType, distributionChannel, distributionChannelName, priorityCode, orderDate, enteredBy, orderReason, customerOrderNo, priceLevel, orderCreateDate, orderModifyDate, shipBy, stopBackOrders, warehouseId, orderSourceId, orderSourceName, integrationPartnerId, integrationPartnerName, orderLoadProgramId, orderLoadProgramName, omsOrderNo, omsCustomerId, shipToAttention, shipToCompany, shipToStreet, shipToStreet2, shipToStreet3, shipToCity, shipToState, shipToZip, shipToCountry, shipToPhone, shipToEmail, billToAttention, billToCompany, billToStreet, billToStreet2, billToStreet3, billToCity, billToState, billToZip, billToCountry, billToPhone, billToEmail, shipDate, freight, weightLbs, estimatedWeightLbs, numberOfCartons, numberOfPallets, numberOfLineItems, completionStatus, holdCode, shipCode, orderMessage, division, costCenter, authorizedBy, batchNo, firstShipDate, lastShipDate, deliverOnDate, customerPONo, shipVia, needByDate, total, balanceDue, totalPaid, authorizationAmount, subtotal, taxOnFreight, tax, distributionCharges, shippingCharge, totalDiscount, parcelAccountId, packingSlipTemplateId, giftMessage, branchSector, branchArea, branchCustomerType, branchId, orderCode, leadPackageId, deliveredDate, totalQty, numberOfWraps, numberOfCases, numberOfTouches, estimatedNumberOfPicks, orderConfirmationEmailTemplateId, shipmentConfirmationEmailTemplateId, externalShippingSystemId, shippingSystemName, orderInvoiceTemplateId, priceMode, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderActivity {\n");
    
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    alternateUsage: ").append(toIndentedString(alternateUsage)).append("\n");
    sb.append("    groupOrderId: ").append(toIndentedString(groupOrderId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reqStatusName: ").append(toIndentedString(reqStatusName)).append("\n");
    sb.append("    fulfillmentProcessId: ").append(toIndentedString(fulfillmentProcessId)).append("\n");
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    mediaCode: ").append(toIndentedString(mediaCode)).append("\n");
    sb.append("    legacyRestrictionType: ").append(toIndentedString(legacyRestrictionType)).append("\n");
    sb.append("    reqTypeName: ").append(toIndentedString(reqTypeName)).append("\n");
    sb.append("    serviceTypeId: ").append(toIndentedString(serviceTypeId)).append("\n");
    sb.append("    serviceTypeName: ").append(toIndentedString(serviceTypeName)).append("\n");
    sb.append("    alcoholOrderType: ").append(toIndentedString(alcoholOrderType)).append("\n");
    sb.append("    distributionChannel: ").append(toIndentedString(distributionChannel)).append("\n");
    sb.append("    distributionChannelName: ").append(toIndentedString(distributionChannelName)).append("\n");
    sb.append("    priorityCode: ").append(toIndentedString(priorityCode)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    enteredBy: ").append(toIndentedString(enteredBy)).append("\n");
    sb.append("    orderReason: ").append(toIndentedString(orderReason)).append("\n");
    sb.append("    customerOrderNo: ").append(toIndentedString(customerOrderNo)).append("\n");
    sb.append("    priceLevel: ").append(toIndentedString(priceLevel)).append("\n");
    sb.append("    orderCreateDate: ").append(toIndentedString(orderCreateDate)).append("\n");
    sb.append("    orderModifyDate: ").append(toIndentedString(orderModifyDate)).append("\n");
    sb.append("    shipBy: ").append(toIndentedString(shipBy)).append("\n");
    sb.append("    stopBackOrders: ").append(toIndentedString(stopBackOrders)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    orderSourceId: ").append(toIndentedString(orderSourceId)).append("\n");
    sb.append("    orderSourceName: ").append(toIndentedString(orderSourceName)).append("\n");
    sb.append("    integrationPartnerId: ").append(toIndentedString(integrationPartnerId)).append("\n");
    sb.append("    integrationPartnerName: ").append(toIndentedString(integrationPartnerName)).append("\n");
    sb.append("    orderLoadProgramId: ").append(toIndentedString(orderLoadProgramId)).append("\n");
    sb.append("    orderLoadProgramName: ").append(toIndentedString(orderLoadProgramName)).append("\n");
    sb.append("    omsOrderNo: ").append(toIndentedString(omsOrderNo)).append("\n");
    sb.append("    omsCustomerId: ").append(toIndentedString(omsCustomerId)).append("\n");
    sb.append("    shipToAttention: ").append(toIndentedString(shipToAttention)).append("\n");
    sb.append("    shipToCompany: ").append(toIndentedString(shipToCompany)).append("\n");
    sb.append("    shipToStreet: ").append(toIndentedString(shipToStreet)).append("\n");
    sb.append("    shipToStreet2: ").append(toIndentedString(shipToStreet2)).append("\n");
    sb.append("    shipToStreet3: ").append(toIndentedString(shipToStreet3)).append("\n");
    sb.append("    shipToCity: ").append(toIndentedString(shipToCity)).append("\n");
    sb.append("    shipToState: ").append(toIndentedString(shipToState)).append("\n");
    sb.append("    shipToZip: ").append(toIndentedString(shipToZip)).append("\n");
    sb.append("    shipToCountry: ").append(toIndentedString(shipToCountry)).append("\n");
    sb.append("    shipToPhone: ").append(toIndentedString(shipToPhone)).append("\n");
    sb.append("    shipToEmail: ").append(toIndentedString(shipToEmail)).append("\n");
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
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    freight: ").append(toIndentedString(freight)).append("\n");
    sb.append("    weightLbs: ").append(toIndentedString(weightLbs)).append("\n");
    sb.append("    estimatedWeightLbs: ").append(toIndentedString(estimatedWeightLbs)).append("\n");
    sb.append("    numberOfCartons: ").append(toIndentedString(numberOfCartons)).append("\n");
    sb.append("    numberOfPallets: ").append(toIndentedString(numberOfPallets)).append("\n");
    sb.append("    numberOfLineItems: ").append(toIndentedString(numberOfLineItems)).append("\n");
    sb.append("    completionStatus: ").append(toIndentedString(completionStatus)).append("\n");
    sb.append("    holdCode: ").append(toIndentedString(holdCode)).append("\n");
    sb.append("    shipCode: ").append(toIndentedString(shipCode)).append("\n");
    sb.append("    orderMessage: ").append(toIndentedString(orderMessage)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    authorizedBy: ").append(toIndentedString(authorizedBy)).append("\n");
    sb.append("    batchNo: ").append(toIndentedString(batchNo)).append("\n");
    sb.append("    firstShipDate: ").append(toIndentedString(firstShipDate)).append("\n");
    sb.append("    lastShipDate: ").append(toIndentedString(lastShipDate)).append("\n");
    sb.append("    deliverOnDate: ").append(toIndentedString(deliverOnDate)).append("\n");
    sb.append("    customerPONo: ").append(toIndentedString(customerPONo)).append("\n");
    sb.append("    shipVia: ").append(toIndentedString(shipVia)).append("\n");
    sb.append("    needByDate: ").append(toIndentedString(needByDate)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    balanceDue: ").append(toIndentedString(balanceDue)).append("\n");
    sb.append("    totalPaid: ").append(toIndentedString(totalPaid)).append("\n");
    sb.append("    authorizationAmount: ").append(toIndentedString(authorizationAmount)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    taxOnFreight: ").append(toIndentedString(taxOnFreight)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    distributionCharges: ").append(toIndentedString(distributionCharges)).append("\n");
    sb.append("    shippingCharge: ").append(toIndentedString(shippingCharge)).append("\n");
    sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
    sb.append("    parcelAccountId: ").append(toIndentedString(parcelAccountId)).append("\n");
    sb.append("    packingSlipTemplateId: ").append(toIndentedString(packingSlipTemplateId)).append("\n");
    sb.append("    giftMessage: ").append(toIndentedString(giftMessage)).append("\n");
    sb.append("    branchSector: ").append(toIndentedString(branchSector)).append("\n");
    sb.append("    branchArea: ").append(toIndentedString(branchArea)).append("\n");
    sb.append("    branchCustomerType: ").append(toIndentedString(branchCustomerType)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    orderCode: ").append(toIndentedString(orderCode)).append("\n");
    sb.append("    leadPackageId: ").append(toIndentedString(leadPackageId)).append("\n");
    sb.append("    deliveredDate: ").append(toIndentedString(deliveredDate)).append("\n");
    sb.append("    totalQty: ").append(toIndentedString(totalQty)).append("\n");
    sb.append("    numberOfWraps: ").append(toIndentedString(numberOfWraps)).append("\n");
    sb.append("    numberOfCases: ").append(toIndentedString(numberOfCases)).append("\n");
    sb.append("    numberOfTouches: ").append(toIndentedString(numberOfTouches)).append("\n");
    sb.append("    estimatedNumberOfPicks: ").append(toIndentedString(estimatedNumberOfPicks)).append("\n");
    sb.append("    orderConfirmationEmailTemplateId: ").append(toIndentedString(orderConfirmationEmailTemplateId)).append("\n");
    sb.append("    shipmentConfirmationEmailTemplateId: ").append(toIndentedString(shipmentConfirmationEmailTemplateId)).append("\n");
    sb.append("    externalShippingSystemId: ").append(toIndentedString(externalShippingSystemId)).append("\n");
    sb.append("    shippingSystemName: ").append(toIndentedString(shippingSystemName)).append("\n");
    sb.append("    orderInvoiceTemplateId: ").append(toIndentedString(orderInvoiceTemplateId)).append("\n");
    sb.append("    priceMode: ").append(toIndentedString(priceMode)).append("\n");
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

