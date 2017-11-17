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





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class OrderLineActivity   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private BigDecimal orderNo = null;
  private Integer lobId = null;
  private String sku = null;
  private Integer poNoId = null;
  private Date orderCreateDate = null;
  private Date orderModifyDate = null;
  private Integer crossDock = null;
  private Integer processNoId = null;
  private Integer orderedQty = null;
  private Integer allowedQty = null;
  private Integer shippedQty = null;
  private Integer backorderQty = null;
  private Integer adjustCode = null;
  private String processFlag = null;
  private String revDate = null;
  private Integer restrictionRule = null;
  private BigDecimal unitCost = null;
  private BigDecimal unitSell = null;
  private BigDecimal unitDiscount = null;
  private BigDecimal extendedCost = null;
  private BigDecimal extendedSell = null;
  private BigDecimal extendedDiscount = null;
  private BigDecimal ncExtendedSell = null;
  private String per = null;
  private String chargeCode = null;
  private String distributionCode = null;
  private String upc = null;
  private String vendorSKU = null;
  private String orderSourceSKU = null;
  private Integer itemMajorGroupId = null;
  private String masterMajorGroupName = null;
  private Integer itemSubGroupId = null;
  private String masterSubGroupName = null;
  private Integer itemProductCodeId = null;
  private String masterProductionCodeName = null;
  private Integer itemAccountCodeId = null;
  private String masterAccountCodeName = null;
  private Integer itemSummaryCodeId = null;
  private String masterSummaryCodeName = null;
  private Integer itemLegacyLowStockContactId = null;
  private String lowStockContactName = null;
  private String sector = null;
  private BigDecimal weightPerWrap = null;
  private BigDecimal itemWeight = null;
  private String productionLot = null;
  private Integer numberOfWraps = null;
  private Integer numberOfCases = null;
  private Integer numberOfTouches = null;
  private Integer alcoholTypeId = null;
  private String alcoholTypeName = null;
  private BigDecimal alcoholContent = null;
  private Integer alcoholContainerId = null;
  private String alcoholContainerName = null;
  private Integer alcoholContainerVolume = null;
  private String alcoholVintageYear = null;
  private Integer alcoholCountryId = null;
  private String alcoholCountryName = null;
  private String alcoholState = null;
  private String alcoholRegion = null;
  private String alcoholBrand = null;
  private String alcoholUPCCode = null;
  private String alcoholNABCACode = null;
  private String alcoholUNIMERCCode = null;
  private String alcoholSCCCode = null;
  private String alternateUsage = null;
  private BigDecimal groupOrderId = null;
  private String orderStatus = null;
  private String orderStatusName = null;
  private Integer carrierId = null;
  private String carrierName = null;
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
  private Date shipBy = null;
  private String stopBackOrders = null;
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
  private Date orderShipDate = null;
  private BigDecimal freight = null;
  private BigDecimal orderWeightLbs = null;
  private BigDecimal orderEstimatedWeightLbs = null;
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
  private Integer totalQty = null;
  private Integer estimatedNumberOfPicks = null;
  private Integer orderConfirmationEmailTemplateId = null;
  private Integer shipmentConfirmationEmailTemplateId = null;
  private Integer orderInvoiceTemplateId = null;
  private String priceMode = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public OrderLineActivity createDate(Date createDate) {
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
  public OrderLineActivity modifyDate(Date modifyDate) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderNo")
  public BigDecimal getOrderNo() {
    return orderNo;
  }

  
  /**
   **/
  public OrderLineActivity lobId(Integer lobId) {
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

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("poNoId")
  public Integer getPoNoId() {
    return poNoId;
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
  @JsonProperty("crossDock")
  public Integer getCrossDock() {
    return crossDock;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("processNoId")
  public Integer getProcessNoId() {
    return processNoId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderedQty")
  public Integer getOrderedQty() {
    return orderedQty;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("allowedQty")
  public Integer getAllowedQty() {
    return allowedQty;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shippedQty")
  public Integer getShippedQty() {
    return shippedQty;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("backorderQty")
  public Integer getBackorderQty() {
    return backorderQty;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("adjustCode")
  public Integer getAdjustCode() {
    return adjustCode;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("processFlag")
  public String getProcessFlag() {
    return processFlag;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("revDate")
  public String getRevDate() {
    return revDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("restrictionRule")
  public Integer getRestrictionRule() {
    return restrictionRule;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unitCost")
  public BigDecimal getUnitCost() {
    return unitCost;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unitSell")
  public BigDecimal getUnitSell() {
    return unitSell;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unitDiscount")
  public BigDecimal getUnitDiscount() {
    return unitDiscount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extendedCost")
  public BigDecimal getExtendedCost() {
    return extendedCost;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extendedSell")
  public BigDecimal getExtendedSell() {
    return extendedSell;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extendedDiscount")
  public BigDecimal getExtendedDiscount() {
    return extendedDiscount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ncExtendedSell")
  public BigDecimal getNcExtendedSell() {
    return ncExtendedSell;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("per")
  public String getPer() {
    return per;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chargeCode")
  public String getChargeCode() {
    return chargeCode;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("distributionCode")
  public String getDistributionCode() {
    return distributionCode;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("upc")
  public String getUpc() {
    return upc;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorSKU")
  public String getVendorSKU() {
    return vendorSKU;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderSourceSKU")
  public String getOrderSourceSKU() {
    return orderSourceSKU;
  }

  
  /**
   **/
  public OrderLineActivity itemMajorGroupId(Integer itemMajorGroupId) {
    this.itemMajorGroupId = itemMajorGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("itemMajorGroupId")
  public Integer getItemMajorGroupId() {
    return itemMajorGroupId;
  }
  public void setItemMajorGroupId(Integer itemMajorGroupId) {
    this.itemMajorGroupId = itemMajorGroupId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("masterMajorGroupName")
  public String getMasterMajorGroupName() {
    return masterMajorGroupName;
  }

  
  /**
   **/
  public OrderLineActivity itemSubGroupId(Integer itemSubGroupId) {
    this.itemSubGroupId = itemSubGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("itemSubGroupId")
  public Integer getItemSubGroupId() {
    return itemSubGroupId;
  }
  public void setItemSubGroupId(Integer itemSubGroupId) {
    this.itemSubGroupId = itemSubGroupId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("masterSubGroupName")
  public String getMasterSubGroupName() {
    return masterSubGroupName;
  }

  
  /**
   **/
  public OrderLineActivity itemProductCodeId(Integer itemProductCodeId) {
    this.itemProductCodeId = itemProductCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemProductCodeId")
  public Integer getItemProductCodeId() {
    return itemProductCodeId;
  }
  public void setItemProductCodeId(Integer itemProductCodeId) {
    this.itemProductCodeId = itemProductCodeId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("masterProductionCodeName")
  public String getMasterProductionCodeName() {
    return masterProductionCodeName;
  }

  
  /**
   **/
  public OrderLineActivity itemAccountCodeId(Integer itemAccountCodeId) {
    this.itemAccountCodeId = itemAccountCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("itemAccountCodeId")
  public Integer getItemAccountCodeId() {
    return itemAccountCodeId;
  }
  public void setItemAccountCodeId(Integer itemAccountCodeId) {
    this.itemAccountCodeId = itemAccountCodeId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("masterAccountCodeName")
  public String getMasterAccountCodeName() {
    return masterAccountCodeName;
  }

  
  /**
   **/
  public OrderLineActivity itemSummaryCodeId(Integer itemSummaryCodeId) {
    this.itemSummaryCodeId = itemSummaryCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("itemSummaryCodeId")
  public Integer getItemSummaryCodeId() {
    return itemSummaryCodeId;
  }
  public void setItemSummaryCodeId(Integer itemSummaryCodeId) {
    this.itemSummaryCodeId = itemSummaryCodeId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("masterSummaryCodeName")
  public String getMasterSummaryCodeName() {
    return masterSummaryCodeName;
  }

  
  /**
   **/
  public OrderLineActivity itemLegacyLowStockContactId(Integer itemLegacyLowStockContactId) {
    this.itemLegacyLowStockContactId = itemLegacyLowStockContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("itemLegacyLowStockContactId")
  public Integer getItemLegacyLowStockContactId() {
    return itemLegacyLowStockContactId;
  }
  public void setItemLegacyLowStockContactId(Integer itemLegacyLowStockContactId) {
    this.itemLegacyLowStockContactId = itemLegacyLowStockContactId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lowStockContactName")
  public String getLowStockContactName() {
    return lowStockContactName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sector")
  public String getSector() {
    return sector;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weightPerWrap")
  public BigDecimal getWeightPerWrap() {
    return weightPerWrap;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemWeight")
  public BigDecimal getItemWeight() {
    return itemWeight;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("productionLot")
  public String getProductionLot() {
    return productionLot;
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
  @JsonProperty("alcoholTypeId")
  public Integer getAlcoholTypeId() {
    return alcoholTypeId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholTypeName")
  public String getAlcoholTypeName() {
    return alcoholTypeName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholContent")
  public BigDecimal getAlcoholContent() {
    return alcoholContent;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholContainerId")
  public Integer getAlcoholContainerId() {
    return alcoholContainerId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholContainerName")
  public String getAlcoholContainerName() {
    return alcoholContainerName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholContainerVolume")
  public Integer getAlcoholContainerVolume() {
    return alcoholContainerVolume;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholVintageYear")
  public String getAlcoholVintageYear() {
    return alcoholVintageYear;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholCountryId")
  public Integer getAlcoholCountryId() {
    return alcoholCountryId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholCountryName")
  public String getAlcoholCountryName() {
    return alcoholCountryName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholState")
  public String getAlcoholState() {
    return alcoholState;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholRegion")
  public String getAlcoholRegion() {
    return alcoholRegion;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholBrand")
  public String getAlcoholBrand() {
    return alcoholBrand;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholUPCCode")
  public String getAlcoholUPCCode() {
    return alcoholUPCCode;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholNABCACode")
  public String getAlcoholNABCACode() {
    return alcoholNABCACode;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholUNIMERCCode")
  public String getAlcoholUNIMERCCode() {
    return alcoholUNIMERCCode;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholSCCCode")
  public String getAlcoholSCCCode() {
    return alcoholSCCCode;
  }

  
  /**
   **/
  public OrderLineActivity alternateUsage(String alternateUsage) {
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
  @JsonProperty("orderStatus")
  public String getOrderStatus() {
    return orderStatus;
  }

  
  /**
   **/
  public OrderLineActivity orderStatusName(String orderStatusName) {
    this.orderStatusName = orderStatusName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderStatusName")
  public String getOrderStatusName() {
    return orderStatusName;
  }
  public void setOrderStatusName(String orderStatusName) {
    this.orderStatusName = orderStatusName;
  }

  
  /**
   **/
  public OrderLineActivity carrierId(Integer carrierId) {
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
  public OrderLineActivity carrierName(String carrierName) {
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
  public OrderLineActivity mediaCode(String mediaCode) {
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
  public OrderLineActivity legacyRestrictionType(String legacyRestrictionType) {
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
  public OrderLineActivity reqTypeName(String reqTypeName) {
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
  public OrderLineActivity serviceTypeId(String serviceTypeId) {
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
  public OrderLineActivity serviceTypeName(String serviceTypeName) {
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
  public OrderLineActivity alcoholOrderType(String alcoholOrderType) {
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
  public OrderLineActivity distributionChannel(String distributionChannel) {
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
  public OrderLineActivity distributionChannelName(String distributionChannelName) {
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
  public OrderLineActivity priorityCode(Integer priorityCode) {
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
  public OrderLineActivity orderDate(Date orderDate) {
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
  public OrderLineActivity customerOrderNo(String customerOrderNo) {
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
  public OrderLineActivity priceLevel(String priceLevel) {
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
  public OrderLineActivity orderSourceId(Integer orderSourceId) {
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
  public OrderLineActivity orderSourceName(String orderSourceName) {
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
  public OrderLineActivity integrationPartnerName(String integrationPartnerName) {
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
  public OrderLineActivity orderLoadProgramName(String orderLoadProgramName) {
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
  public OrderLineActivity shipToAttention(String shipToAttention) {
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
  public OrderLineActivity shipToCompany(String shipToCompany) {
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
  public OrderLineActivity shipToStreet(String shipToStreet) {
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
  public OrderLineActivity shipToStreet2(String shipToStreet2) {
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
  public OrderLineActivity shipToStreet3(String shipToStreet3) {
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
  public OrderLineActivity shipToCity(String shipToCity) {
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
  public OrderLineActivity shipToState(String shipToState) {
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
  public OrderLineActivity shipToZip(String shipToZip) {
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
  public OrderLineActivity shipToCountry(String shipToCountry) {
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
  public OrderLineActivity shipToPhone(String shipToPhone) {
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
  public OrderLineActivity shipToEmail(String shipToEmail) {
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
  public OrderLineActivity billToAttention(String billToAttention) {
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
  public OrderLineActivity billToCompany(String billToCompany) {
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
  public OrderLineActivity billToStreet(String billToStreet) {
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
  public OrderLineActivity billToStreet2(String billToStreet2) {
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
  public OrderLineActivity billToStreet3(String billToStreet3) {
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
  public OrderLineActivity billToCity(String billToCity) {
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
  public OrderLineActivity billToState(String billToState) {
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
  public OrderLineActivity billToZip(String billToZip) {
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
  public OrderLineActivity billToCountry(String billToCountry) {
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
  public OrderLineActivity billToPhone(String billToPhone) {
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
  public OrderLineActivity billToEmail(String billToEmail) {
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
  @JsonProperty("orderShipDate")
  public Date getOrderShipDate() {
    return orderShipDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("freight")
  public BigDecimal getFreight() {
    return freight;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderWeightLbs")
  public BigDecimal getOrderWeightLbs() {
    return orderWeightLbs;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderEstimatedWeightLbs")
  public BigDecimal getOrderEstimatedWeightLbs() {
    return orderEstimatedWeightLbs;
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
  public OrderLineActivity holdCode(String holdCode) {
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
  public OrderLineActivity shipCode(String shipCode) {
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
  public OrderLineActivity orderMessage(String orderMessage) {
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
  public OrderLineActivity division(Integer division) {
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
  public OrderLineActivity costCenter(String costCenter) {
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
  public OrderLineActivity authorizedBy(String authorizedBy) {
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
  public OrderLineActivity batchNo(String batchNo) {
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
  public OrderLineActivity firstShipDate(Date firstShipDate) {
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
  public OrderLineActivity lastShipDate(Date lastShipDate) {
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
  public OrderLineActivity deliverOnDate(Date deliverOnDate) {
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
  public OrderLineActivity customerPONo(String customerPONo) {
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
  public OrderLineActivity shipVia(String shipVia) {
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
  public OrderLineActivity needByDate(Date needByDate) {
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
  public OrderLineActivity total(BigDecimal total) {
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
  public OrderLineActivity subtotal(BigDecimal subtotal) {
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
  public OrderLineActivity taxOnFreight(BigDecimal taxOnFreight) {
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
  public OrderLineActivity tax(BigDecimal tax) {
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
  public OrderLineActivity shippingCharge(BigDecimal shippingCharge) {
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
  public OrderLineActivity totalDiscount(BigDecimal totalDiscount) {
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
  public OrderLineActivity packingSlipTemplateId(Integer packingSlipTemplateId) {
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
  public OrderLineActivity giftMessage(String giftMessage) {
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
  public OrderLineActivity branchSector(String branchSector) {
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
  public OrderLineActivity branchArea(String branchArea) {
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
  public OrderLineActivity branchCustomerType(String branchCustomerType) {
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
  public OrderLineActivity branchId(String branchId) {
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
  public OrderLineActivity orderCode(String orderCode) {
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
  public OrderLineActivity leadPackageId(String leadPackageId) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalQty")
  public Integer getTotalQty() {
    return totalQty;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("estimatedNumberOfPicks")
  public Integer getEstimatedNumberOfPicks() {
    return estimatedNumberOfPicks;
  }

  
  /**
   **/
  public OrderLineActivity orderConfirmationEmailTemplateId(Integer orderConfirmationEmailTemplateId) {
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
  public OrderLineActivity shipmentConfirmationEmailTemplateId(Integer shipmentConfirmationEmailTemplateId) {
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

  
  /**
   **/
  public OrderLineActivity orderInvoiceTemplateId(Integer orderInvoiceTemplateId) {
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
  public OrderLineActivity priceMode(String priceMode) {
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
  public OrderLineActivity customFields(Map<String, Object> customFields) {
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
    OrderLineActivity orderLineActivity = (OrderLineActivity) o;
    return Objects.equals(this.id, orderLineActivity.id) &&
        Objects.equals(this.createDate, orderLineActivity.createDate) &&
        Objects.equals(this.modifyDate, orderLineActivity.modifyDate) &&
        Objects.equals(this.orderNo, orderLineActivity.orderNo) &&
        Objects.equals(this.lobId, orderLineActivity.lobId) &&
        Objects.equals(this.sku, orderLineActivity.sku) &&
        Objects.equals(this.poNoId, orderLineActivity.poNoId) &&
        Objects.equals(this.orderCreateDate, orderLineActivity.orderCreateDate) &&
        Objects.equals(this.orderModifyDate, orderLineActivity.orderModifyDate) &&
        Objects.equals(this.crossDock, orderLineActivity.crossDock) &&
        Objects.equals(this.processNoId, orderLineActivity.processNoId) &&
        Objects.equals(this.orderedQty, orderLineActivity.orderedQty) &&
        Objects.equals(this.allowedQty, orderLineActivity.allowedQty) &&
        Objects.equals(this.shippedQty, orderLineActivity.shippedQty) &&
        Objects.equals(this.backorderQty, orderLineActivity.backorderQty) &&
        Objects.equals(this.adjustCode, orderLineActivity.adjustCode) &&
        Objects.equals(this.processFlag, orderLineActivity.processFlag) &&
        Objects.equals(this.revDate, orderLineActivity.revDate) &&
        Objects.equals(this.restrictionRule, orderLineActivity.restrictionRule) &&
        Objects.equals(this.unitCost, orderLineActivity.unitCost) &&
        Objects.equals(this.unitSell, orderLineActivity.unitSell) &&
        Objects.equals(this.unitDiscount, orderLineActivity.unitDiscount) &&
        Objects.equals(this.extendedCost, orderLineActivity.extendedCost) &&
        Objects.equals(this.extendedSell, orderLineActivity.extendedSell) &&
        Objects.equals(this.extendedDiscount, orderLineActivity.extendedDiscount) &&
        Objects.equals(this.ncExtendedSell, orderLineActivity.ncExtendedSell) &&
        Objects.equals(this.per, orderLineActivity.per) &&
        Objects.equals(this.chargeCode, orderLineActivity.chargeCode) &&
        Objects.equals(this.distributionCode, orderLineActivity.distributionCode) &&
        Objects.equals(this.upc, orderLineActivity.upc) &&
        Objects.equals(this.vendorSKU, orderLineActivity.vendorSKU) &&
        Objects.equals(this.orderSourceSKU, orderLineActivity.orderSourceSKU) &&
        Objects.equals(this.itemMajorGroupId, orderLineActivity.itemMajorGroupId) &&
        Objects.equals(this.masterMajorGroupName, orderLineActivity.masterMajorGroupName) &&
        Objects.equals(this.itemSubGroupId, orderLineActivity.itemSubGroupId) &&
        Objects.equals(this.masterSubGroupName, orderLineActivity.masterSubGroupName) &&
        Objects.equals(this.itemProductCodeId, orderLineActivity.itemProductCodeId) &&
        Objects.equals(this.masterProductionCodeName, orderLineActivity.masterProductionCodeName) &&
        Objects.equals(this.itemAccountCodeId, orderLineActivity.itemAccountCodeId) &&
        Objects.equals(this.masterAccountCodeName, orderLineActivity.masterAccountCodeName) &&
        Objects.equals(this.itemSummaryCodeId, orderLineActivity.itemSummaryCodeId) &&
        Objects.equals(this.masterSummaryCodeName, orderLineActivity.masterSummaryCodeName) &&
        Objects.equals(this.itemLegacyLowStockContactId, orderLineActivity.itemLegacyLowStockContactId) &&
        Objects.equals(this.lowStockContactName, orderLineActivity.lowStockContactName) &&
        Objects.equals(this.sector, orderLineActivity.sector) &&
        Objects.equals(this.weightPerWrap, orderLineActivity.weightPerWrap) &&
        Objects.equals(this.itemWeight, orderLineActivity.itemWeight) &&
        Objects.equals(this.productionLot, orderLineActivity.productionLot) &&
        Objects.equals(this.numberOfWraps, orderLineActivity.numberOfWraps) &&
        Objects.equals(this.numberOfCases, orderLineActivity.numberOfCases) &&
        Objects.equals(this.numberOfTouches, orderLineActivity.numberOfTouches) &&
        Objects.equals(this.alcoholTypeId, orderLineActivity.alcoholTypeId) &&
        Objects.equals(this.alcoholTypeName, orderLineActivity.alcoholTypeName) &&
        Objects.equals(this.alcoholContent, orderLineActivity.alcoholContent) &&
        Objects.equals(this.alcoholContainerId, orderLineActivity.alcoholContainerId) &&
        Objects.equals(this.alcoholContainerName, orderLineActivity.alcoholContainerName) &&
        Objects.equals(this.alcoholContainerVolume, orderLineActivity.alcoholContainerVolume) &&
        Objects.equals(this.alcoholVintageYear, orderLineActivity.alcoholVintageYear) &&
        Objects.equals(this.alcoholCountryId, orderLineActivity.alcoholCountryId) &&
        Objects.equals(this.alcoholCountryName, orderLineActivity.alcoholCountryName) &&
        Objects.equals(this.alcoholState, orderLineActivity.alcoholState) &&
        Objects.equals(this.alcoholRegion, orderLineActivity.alcoholRegion) &&
        Objects.equals(this.alcoholBrand, orderLineActivity.alcoholBrand) &&
        Objects.equals(this.alcoholUPCCode, orderLineActivity.alcoholUPCCode) &&
        Objects.equals(this.alcoholNABCACode, orderLineActivity.alcoholNABCACode) &&
        Objects.equals(this.alcoholUNIMERCCode, orderLineActivity.alcoholUNIMERCCode) &&
        Objects.equals(this.alcoholSCCCode, orderLineActivity.alcoholSCCCode) &&
        Objects.equals(this.alternateUsage, orderLineActivity.alternateUsage) &&
        Objects.equals(this.groupOrderId, orderLineActivity.groupOrderId) &&
        Objects.equals(this.orderStatus, orderLineActivity.orderStatus) &&
        Objects.equals(this.orderStatusName, orderLineActivity.orderStatusName) &&
        Objects.equals(this.carrierId, orderLineActivity.carrierId) &&
        Objects.equals(this.carrierName, orderLineActivity.carrierName) &&
        Objects.equals(this.mediaCode, orderLineActivity.mediaCode) &&
        Objects.equals(this.legacyRestrictionType, orderLineActivity.legacyRestrictionType) &&
        Objects.equals(this.reqTypeName, orderLineActivity.reqTypeName) &&
        Objects.equals(this.serviceTypeId, orderLineActivity.serviceTypeId) &&
        Objects.equals(this.serviceTypeName, orderLineActivity.serviceTypeName) &&
        Objects.equals(this.alcoholOrderType, orderLineActivity.alcoholOrderType) &&
        Objects.equals(this.distributionChannel, orderLineActivity.distributionChannel) &&
        Objects.equals(this.distributionChannelName, orderLineActivity.distributionChannelName) &&
        Objects.equals(this.priorityCode, orderLineActivity.priorityCode) &&
        Objects.equals(this.orderDate, orderLineActivity.orderDate) &&
        Objects.equals(this.enteredBy, orderLineActivity.enteredBy) &&
        Objects.equals(this.orderReason, orderLineActivity.orderReason) &&
        Objects.equals(this.customerOrderNo, orderLineActivity.customerOrderNo) &&
        Objects.equals(this.priceLevel, orderLineActivity.priceLevel) &&
        Objects.equals(this.shipBy, orderLineActivity.shipBy) &&
        Objects.equals(this.stopBackOrders, orderLineActivity.stopBackOrders) &&
        Objects.equals(this.orderSourceId, orderLineActivity.orderSourceId) &&
        Objects.equals(this.orderSourceName, orderLineActivity.orderSourceName) &&
        Objects.equals(this.integrationPartnerId, orderLineActivity.integrationPartnerId) &&
        Objects.equals(this.integrationPartnerName, orderLineActivity.integrationPartnerName) &&
        Objects.equals(this.orderLoadProgramId, orderLineActivity.orderLoadProgramId) &&
        Objects.equals(this.orderLoadProgramName, orderLineActivity.orderLoadProgramName) &&
        Objects.equals(this.omsOrderNo, orderLineActivity.omsOrderNo) &&
        Objects.equals(this.omsCustomerId, orderLineActivity.omsCustomerId) &&
        Objects.equals(this.shipToAttention, orderLineActivity.shipToAttention) &&
        Objects.equals(this.shipToCompany, orderLineActivity.shipToCompany) &&
        Objects.equals(this.shipToStreet, orderLineActivity.shipToStreet) &&
        Objects.equals(this.shipToStreet2, orderLineActivity.shipToStreet2) &&
        Objects.equals(this.shipToStreet3, orderLineActivity.shipToStreet3) &&
        Objects.equals(this.shipToCity, orderLineActivity.shipToCity) &&
        Objects.equals(this.shipToState, orderLineActivity.shipToState) &&
        Objects.equals(this.shipToZip, orderLineActivity.shipToZip) &&
        Objects.equals(this.shipToCountry, orderLineActivity.shipToCountry) &&
        Objects.equals(this.shipToPhone, orderLineActivity.shipToPhone) &&
        Objects.equals(this.shipToEmail, orderLineActivity.shipToEmail) &&
        Objects.equals(this.billToAttention, orderLineActivity.billToAttention) &&
        Objects.equals(this.billToCompany, orderLineActivity.billToCompany) &&
        Objects.equals(this.billToStreet, orderLineActivity.billToStreet) &&
        Objects.equals(this.billToStreet2, orderLineActivity.billToStreet2) &&
        Objects.equals(this.billToStreet3, orderLineActivity.billToStreet3) &&
        Objects.equals(this.billToCity, orderLineActivity.billToCity) &&
        Objects.equals(this.billToState, orderLineActivity.billToState) &&
        Objects.equals(this.billToZip, orderLineActivity.billToZip) &&
        Objects.equals(this.billToCountry, orderLineActivity.billToCountry) &&
        Objects.equals(this.billToPhone, orderLineActivity.billToPhone) &&
        Objects.equals(this.billToEmail, orderLineActivity.billToEmail) &&
        Objects.equals(this.orderShipDate, orderLineActivity.orderShipDate) &&
        Objects.equals(this.freight, orderLineActivity.freight) &&
        Objects.equals(this.orderWeightLbs, orderLineActivity.orderWeightLbs) &&
        Objects.equals(this.orderEstimatedWeightLbs, orderLineActivity.orderEstimatedWeightLbs) &&
        Objects.equals(this.numberOfPallets, orderLineActivity.numberOfPallets) &&
        Objects.equals(this.numberOfLineItems, orderLineActivity.numberOfLineItems) &&
        Objects.equals(this.completionStatus, orderLineActivity.completionStatus) &&
        Objects.equals(this.holdCode, orderLineActivity.holdCode) &&
        Objects.equals(this.shipCode, orderLineActivity.shipCode) &&
        Objects.equals(this.orderMessage, orderLineActivity.orderMessage) &&
        Objects.equals(this.division, orderLineActivity.division) &&
        Objects.equals(this.costCenter, orderLineActivity.costCenter) &&
        Objects.equals(this.authorizedBy, orderLineActivity.authorizedBy) &&
        Objects.equals(this.batchNo, orderLineActivity.batchNo) &&
        Objects.equals(this.firstShipDate, orderLineActivity.firstShipDate) &&
        Objects.equals(this.lastShipDate, orderLineActivity.lastShipDate) &&
        Objects.equals(this.deliverOnDate, orderLineActivity.deliverOnDate) &&
        Objects.equals(this.customerPONo, orderLineActivity.customerPONo) &&
        Objects.equals(this.shipVia, orderLineActivity.shipVia) &&
        Objects.equals(this.needByDate, orderLineActivity.needByDate) &&
        Objects.equals(this.total, orderLineActivity.total) &&
        Objects.equals(this.balanceDue, orderLineActivity.balanceDue) &&
        Objects.equals(this.totalPaid, orderLineActivity.totalPaid) &&
        Objects.equals(this.authorizationAmount, orderLineActivity.authorizationAmount) &&
        Objects.equals(this.subtotal, orderLineActivity.subtotal) &&
        Objects.equals(this.taxOnFreight, orderLineActivity.taxOnFreight) &&
        Objects.equals(this.tax, orderLineActivity.tax) &&
        Objects.equals(this.distributionCharges, orderLineActivity.distributionCharges) &&
        Objects.equals(this.shippingCharge, orderLineActivity.shippingCharge) &&
        Objects.equals(this.totalDiscount, orderLineActivity.totalDiscount) &&
        Objects.equals(this.parcelAccountId, orderLineActivity.parcelAccountId) &&
        Objects.equals(this.packingSlipTemplateId, orderLineActivity.packingSlipTemplateId) &&
        Objects.equals(this.giftMessage, orderLineActivity.giftMessage) &&
        Objects.equals(this.branchSector, orderLineActivity.branchSector) &&
        Objects.equals(this.branchArea, orderLineActivity.branchArea) &&
        Objects.equals(this.branchCustomerType, orderLineActivity.branchCustomerType) &&
        Objects.equals(this.branchId, orderLineActivity.branchId) &&
        Objects.equals(this.orderCode, orderLineActivity.orderCode) &&
        Objects.equals(this.leadPackageId, orderLineActivity.leadPackageId) &&
        Objects.equals(this.totalQty, orderLineActivity.totalQty) &&
        Objects.equals(this.estimatedNumberOfPicks, orderLineActivity.estimatedNumberOfPicks) &&
        Objects.equals(this.orderConfirmationEmailTemplateId, orderLineActivity.orderConfirmationEmailTemplateId) &&
        Objects.equals(this.shipmentConfirmationEmailTemplateId, orderLineActivity.shipmentConfirmationEmailTemplateId) &&
        Objects.equals(this.orderInvoiceTemplateId, orderLineActivity.orderInvoiceTemplateId) &&
        Objects.equals(this.priceMode, orderLineActivity.priceMode) &&
        Objects.equals(this.customFields, orderLineActivity.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, orderNo, lobId, sku, poNoId, orderCreateDate, orderModifyDate, crossDock, processNoId, orderedQty, allowedQty, shippedQty, backorderQty, adjustCode, processFlag, revDate, restrictionRule, unitCost, unitSell, unitDiscount, extendedCost, extendedSell, extendedDiscount, ncExtendedSell, per, chargeCode, distributionCode, upc, vendorSKU, orderSourceSKU, itemMajorGroupId, masterMajorGroupName, itemSubGroupId, masterSubGroupName, itemProductCodeId, masterProductionCodeName, itemAccountCodeId, masterAccountCodeName, itemSummaryCodeId, masterSummaryCodeName, itemLegacyLowStockContactId, lowStockContactName, sector, weightPerWrap, itemWeight, productionLot, numberOfWraps, numberOfCases, numberOfTouches, alcoholTypeId, alcoholTypeName, alcoholContent, alcoholContainerId, alcoholContainerName, alcoholContainerVolume, alcoholVintageYear, alcoholCountryId, alcoholCountryName, alcoholState, alcoholRegion, alcoholBrand, alcoholUPCCode, alcoholNABCACode, alcoholUNIMERCCode, alcoholSCCCode, alternateUsage, groupOrderId, orderStatus, orderStatusName, carrierId, carrierName, mediaCode, legacyRestrictionType, reqTypeName, serviceTypeId, serviceTypeName, alcoholOrderType, distributionChannel, distributionChannelName, priorityCode, orderDate, enteredBy, orderReason, customerOrderNo, priceLevel, shipBy, stopBackOrders, orderSourceId, orderSourceName, integrationPartnerId, integrationPartnerName, orderLoadProgramId, orderLoadProgramName, omsOrderNo, omsCustomerId, shipToAttention, shipToCompany, shipToStreet, shipToStreet2, shipToStreet3, shipToCity, shipToState, shipToZip, shipToCountry, shipToPhone, shipToEmail, billToAttention, billToCompany, billToStreet, billToStreet2, billToStreet3, billToCity, billToState, billToZip, billToCountry, billToPhone, billToEmail, orderShipDate, freight, orderWeightLbs, orderEstimatedWeightLbs, numberOfPallets, numberOfLineItems, completionStatus, holdCode, shipCode, orderMessage, division, costCenter, authorizedBy, batchNo, firstShipDate, lastShipDate, deliverOnDate, customerPONo, shipVia, needByDate, total, balanceDue, totalPaid, authorizationAmount, subtotal, taxOnFreight, tax, distributionCharges, shippingCharge, totalDiscount, parcelAccountId, packingSlipTemplateId, giftMessage, branchSector, branchArea, branchCustomerType, branchId, orderCode, leadPackageId, totalQty, estimatedNumberOfPicks, orderConfirmationEmailTemplateId, shipmentConfirmationEmailTemplateId, orderInvoiceTemplateId, priceMode, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    poNoId: ").append(toIndentedString(poNoId)).append("\n");
    sb.append("    orderCreateDate: ").append(toIndentedString(orderCreateDate)).append("\n");
    sb.append("    orderModifyDate: ").append(toIndentedString(orderModifyDate)).append("\n");
    sb.append("    crossDock: ").append(toIndentedString(crossDock)).append("\n");
    sb.append("    processNoId: ").append(toIndentedString(processNoId)).append("\n");
    sb.append("    orderedQty: ").append(toIndentedString(orderedQty)).append("\n");
    sb.append("    allowedQty: ").append(toIndentedString(allowedQty)).append("\n");
    sb.append("    shippedQty: ").append(toIndentedString(shippedQty)).append("\n");
    sb.append("    backorderQty: ").append(toIndentedString(backorderQty)).append("\n");
    sb.append("    adjustCode: ").append(toIndentedString(adjustCode)).append("\n");
    sb.append("    processFlag: ").append(toIndentedString(processFlag)).append("\n");
    sb.append("    revDate: ").append(toIndentedString(revDate)).append("\n");
    sb.append("    restrictionRule: ").append(toIndentedString(restrictionRule)).append("\n");
    sb.append("    unitCost: ").append(toIndentedString(unitCost)).append("\n");
    sb.append("    unitSell: ").append(toIndentedString(unitSell)).append("\n");
    sb.append("    unitDiscount: ").append(toIndentedString(unitDiscount)).append("\n");
    sb.append("    extendedCost: ").append(toIndentedString(extendedCost)).append("\n");
    sb.append("    extendedSell: ").append(toIndentedString(extendedSell)).append("\n");
    sb.append("    extendedDiscount: ").append(toIndentedString(extendedDiscount)).append("\n");
    sb.append("    ncExtendedSell: ").append(toIndentedString(ncExtendedSell)).append("\n");
    sb.append("    per: ").append(toIndentedString(per)).append("\n");
    sb.append("    chargeCode: ").append(toIndentedString(chargeCode)).append("\n");
    sb.append("    distributionCode: ").append(toIndentedString(distributionCode)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    vendorSKU: ").append(toIndentedString(vendorSKU)).append("\n");
    sb.append("    orderSourceSKU: ").append(toIndentedString(orderSourceSKU)).append("\n");
    sb.append("    itemMajorGroupId: ").append(toIndentedString(itemMajorGroupId)).append("\n");
    sb.append("    masterMajorGroupName: ").append(toIndentedString(masterMajorGroupName)).append("\n");
    sb.append("    itemSubGroupId: ").append(toIndentedString(itemSubGroupId)).append("\n");
    sb.append("    masterSubGroupName: ").append(toIndentedString(masterSubGroupName)).append("\n");
    sb.append("    itemProductCodeId: ").append(toIndentedString(itemProductCodeId)).append("\n");
    sb.append("    masterProductionCodeName: ").append(toIndentedString(masterProductionCodeName)).append("\n");
    sb.append("    itemAccountCodeId: ").append(toIndentedString(itemAccountCodeId)).append("\n");
    sb.append("    masterAccountCodeName: ").append(toIndentedString(masterAccountCodeName)).append("\n");
    sb.append("    itemSummaryCodeId: ").append(toIndentedString(itemSummaryCodeId)).append("\n");
    sb.append("    masterSummaryCodeName: ").append(toIndentedString(masterSummaryCodeName)).append("\n");
    sb.append("    itemLegacyLowStockContactId: ").append(toIndentedString(itemLegacyLowStockContactId)).append("\n");
    sb.append("    lowStockContactName: ").append(toIndentedString(lowStockContactName)).append("\n");
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
    sb.append("    weightPerWrap: ").append(toIndentedString(weightPerWrap)).append("\n");
    sb.append("    itemWeight: ").append(toIndentedString(itemWeight)).append("\n");
    sb.append("    productionLot: ").append(toIndentedString(productionLot)).append("\n");
    sb.append("    numberOfWraps: ").append(toIndentedString(numberOfWraps)).append("\n");
    sb.append("    numberOfCases: ").append(toIndentedString(numberOfCases)).append("\n");
    sb.append("    numberOfTouches: ").append(toIndentedString(numberOfTouches)).append("\n");
    sb.append("    alcoholTypeId: ").append(toIndentedString(alcoholTypeId)).append("\n");
    sb.append("    alcoholTypeName: ").append(toIndentedString(alcoholTypeName)).append("\n");
    sb.append("    alcoholContent: ").append(toIndentedString(alcoholContent)).append("\n");
    sb.append("    alcoholContainerId: ").append(toIndentedString(alcoholContainerId)).append("\n");
    sb.append("    alcoholContainerName: ").append(toIndentedString(alcoholContainerName)).append("\n");
    sb.append("    alcoholContainerVolume: ").append(toIndentedString(alcoholContainerVolume)).append("\n");
    sb.append("    alcoholVintageYear: ").append(toIndentedString(alcoholVintageYear)).append("\n");
    sb.append("    alcoholCountryId: ").append(toIndentedString(alcoholCountryId)).append("\n");
    sb.append("    alcoholCountryName: ").append(toIndentedString(alcoholCountryName)).append("\n");
    sb.append("    alcoholState: ").append(toIndentedString(alcoholState)).append("\n");
    sb.append("    alcoholRegion: ").append(toIndentedString(alcoholRegion)).append("\n");
    sb.append("    alcoholBrand: ").append(toIndentedString(alcoholBrand)).append("\n");
    sb.append("    alcoholUPCCode: ").append(toIndentedString(alcoholUPCCode)).append("\n");
    sb.append("    alcoholNABCACode: ").append(toIndentedString(alcoholNABCACode)).append("\n");
    sb.append("    alcoholUNIMERCCode: ").append(toIndentedString(alcoholUNIMERCCode)).append("\n");
    sb.append("    alcoholSCCCode: ").append(toIndentedString(alcoholSCCCode)).append("\n");
    sb.append("    alternateUsage: ").append(toIndentedString(alternateUsage)).append("\n");
    sb.append("    groupOrderId: ").append(toIndentedString(groupOrderId)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    orderStatusName: ").append(toIndentedString(orderStatusName)).append("\n");
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
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
    sb.append("    shipBy: ").append(toIndentedString(shipBy)).append("\n");
    sb.append("    stopBackOrders: ").append(toIndentedString(stopBackOrders)).append("\n");
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
    sb.append("    orderShipDate: ").append(toIndentedString(orderShipDate)).append("\n");
    sb.append("    freight: ").append(toIndentedString(freight)).append("\n");
    sb.append("    orderWeightLbs: ").append(toIndentedString(orderWeightLbs)).append("\n");
    sb.append("    orderEstimatedWeightLbs: ").append(toIndentedString(orderEstimatedWeightLbs)).append("\n");
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
    sb.append("    totalQty: ").append(toIndentedString(totalQty)).append("\n");
    sb.append("    estimatedNumberOfPicks: ").append(toIndentedString(estimatedNumberOfPicks)).append("\n");
    sb.append("    orderConfirmationEmailTemplateId: ").append(toIndentedString(orderConfirmationEmailTemplateId)).append("\n");
    sb.append("    shipmentConfirmationEmailTemplateId: ").append(toIndentedString(shipmentConfirmationEmailTemplateId)).append("\n");
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

