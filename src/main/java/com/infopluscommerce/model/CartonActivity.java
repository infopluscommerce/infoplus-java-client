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





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class CartonActivity   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer lobId = null;
  private BigDecimal orderNo = null;
  private Date shipDate = null;
  private Date deliveredDate = null;
  private String trackingNo = null;
  private Integer warehouseId = null;
  private String warehouseName = null;
  private Integer cartonNo = null;
  private Integer numberOfCartons = null;
  private String status = null;
  private Boolean shipped = false;
  private Integer carrierServiceId = null;
  private BigDecimal dim1In = null;
  private BigDecimal dim2In = null;
  private BigDecimal dim3In = null;
  private String estimatedZone = null;
  private String parcelAccountNo = null;
  private String thirdPartyParcelAccountNo = null;
  private Integer manifestId = null;
  private Boolean residential = false;
  private String billingOption = null;
  private BigDecimal weightLbs = null;
  private BigDecimal dimWeight = null;
  private String licensePlateNumber = null;
  private BigDecimal chargedFreightAmount = null;
  private BigDecimal publishedFreightAmount = null;
  private BigDecimal retailFreightAmount = null;
  private String alternateUsage = null;
  private BigDecimal groupOrderId = null;
  private String orderStatus = null;
  private String orderStatusName = null;
  private Integer fulfillmentProcessId = null;
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
  private Date orderCreateDate = null;
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
  private Integer externalShippingSystemId = null;
  private String shippingSystemName = null;
  private Integer orderInvoiceTemplateId = null;
  private String priceMode = null;
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
  public CartonActivity lobId(Integer lobId) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderNo")
  public BigDecimal getOrderNo() {
    return orderNo;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipDate")
  public Date getShipDate() {
    return shipDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deliveredDate")
  public Date getDeliveredDate() {
    return deliveredDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trackingNo")
  public String getTrackingNo() {
    return trackingNo;
  }

  
  /**
   **/
  public CartonActivity warehouseId(Integer warehouseId) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseName")
  public String getWarehouseName() {
    return warehouseName;
  }

  
  /**
   **/
  public CartonActivity cartonNo(Integer cartonNo) {
    this.cartonNo = cartonNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cartonNo")
  public Integer getCartonNo() {
    return cartonNo;
  }
  public void setCartonNo(Integer cartonNo) {
    this.cartonNo = cartonNo;
  }

  
  /**
   **/
  public CartonActivity numberOfCartons(Integer numberOfCartons) {
    this.numberOfCartons = numberOfCartons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfCartons")
  public Integer getNumberOfCartons() {
    return numberOfCartons;
  }
  public void setNumberOfCartons(Integer numberOfCartons) {
    this.numberOfCartons = numberOfCartons;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  
  /**
   **/
  public CartonActivity shipped(Boolean shipped) {
    this.shipped = shipped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipped")
  public Boolean getShipped() {
    return shipped;
  }
  public void setShipped(Boolean shipped) {
    this.shipped = shipped;
  }

  
  /**
   **/
  public CartonActivity carrierServiceId(Integer carrierServiceId) {
    this.carrierServiceId = carrierServiceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("carrierServiceId")
  public Integer getCarrierServiceId() {
    return carrierServiceId;
  }
  public void setCarrierServiceId(Integer carrierServiceId) {
    this.carrierServiceId = carrierServiceId;
  }

  
  /**
   **/
  public CartonActivity dim1In(BigDecimal dim1In) {
    this.dim1In = dim1In;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dim1In")
  public BigDecimal getDim1In() {
    return dim1In;
  }
  public void setDim1In(BigDecimal dim1In) {
    this.dim1In = dim1In;
  }

  
  /**
   **/
  public CartonActivity dim2In(BigDecimal dim2In) {
    this.dim2In = dim2In;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dim2In")
  public BigDecimal getDim2In() {
    return dim2In;
  }
  public void setDim2In(BigDecimal dim2In) {
    this.dim2In = dim2In;
  }

  
  /**
   **/
  public CartonActivity dim3In(BigDecimal dim3In) {
    this.dim3In = dim3In;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dim3In")
  public BigDecimal getDim3In() {
    return dim3In;
  }
  public void setDim3In(BigDecimal dim3In) {
    this.dim3In = dim3In;
  }

  
  /**
   **/
  public CartonActivity estimatedZone(String estimatedZone) {
    this.estimatedZone = estimatedZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("estimatedZone")
  public String getEstimatedZone() {
    return estimatedZone;
  }
  public void setEstimatedZone(String estimatedZone) {
    this.estimatedZone = estimatedZone;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parcelAccountNo")
  public String getParcelAccountNo() {
    return parcelAccountNo;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thirdPartyParcelAccountNo")
  public String getThirdPartyParcelAccountNo() {
    return thirdPartyParcelAccountNo;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("manifestId")
  public Integer getManifestId() {
    return manifestId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("residential")
  public Boolean getResidential() {
    return residential;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billingOption")
  public String getBillingOption() {
    return billingOption;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weightLbs")
  public BigDecimal getWeightLbs() {
    return weightLbs;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dimWeight")
  public BigDecimal getDimWeight() {
    return dimWeight;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("licensePlateNumber")
  public String getLicensePlateNumber() {
    return licensePlateNumber;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chargedFreightAmount")
  public BigDecimal getChargedFreightAmount() {
    return chargedFreightAmount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("publishedFreightAmount")
  public BigDecimal getPublishedFreightAmount() {
    return publishedFreightAmount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("retailFreightAmount")
  public BigDecimal getRetailFreightAmount() {
    return retailFreightAmount;
  }

  
  /**
   **/
  public CartonActivity alternateUsage(String alternateUsage) {
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
  public CartonActivity orderStatusName(String orderStatusName) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fulfillmentProcessId")
  public Integer getFulfillmentProcessId() {
    return fulfillmentProcessId;
  }

  
  /**
   **/
  public CartonActivity carrierId(Integer carrierId) {
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
  public CartonActivity carrierName(String carrierName) {
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
  public CartonActivity mediaCode(String mediaCode) {
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
  public CartonActivity legacyRestrictionType(String legacyRestrictionType) {
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
  public CartonActivity reqTypeName(String reqTypeName) {
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
  public CartonActivity serviceTypeId(String serviceTypeId) {
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
  public CartonActivity serviceTypeName(String serviceTypeName) {
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
  public CartonActivity alcoholOrderType(String alcoholOrderType) {
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
  public CartonActivity distributionChannel(String distributionChannel) {
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
  public CartonActivity distributionChannelName(String distributionChannelName) {
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
  public CartonActivity priorityCode(Integer priorityCode) {
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
  public CartonActivity orderDate(Date orderDate) {
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
  public CartonActivity customerOrderNo(String customerOrderNo) {
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
  public CartonActivity priceLevel(String priceLevel) {
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
  public CartonActivity orderSourceId(Integer orderSourceId) {
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
  public CartonActivity orderSourceName(String orderSourceName) {
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
  public CartonActivity integrationPartnerName(String integrationPartnerName) {
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
  public CartonActivity orderLoadProgramName(String orderLoadProgramName) {
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
  public CartonActivity shipToAttention(String shipToAttention) {
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
  public CartonActivity shipToCompany(String shipToCompany) {
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
  public CartonActivity shipToStreet(String shipToStreet) {
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
  public CartonActivity shipToStreet2(String shipToStreet2) {
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
  public CartonActivity shipToStreet3(String shipToStreet3) {
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
  public CartonActivity shipToCity(String shipToCity) {
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
  public CartonActivity shipToState(String shipToState) {
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
  public CartonActivity shipToZip(String shipToZip) {
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
  public CartonActivity shipToCountry(String shipToCountry) {
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
  public CartonActivity shipToPhone(String shipToPhone) {
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
  public CartonActivity shipToEmail(String shipToEmail) {
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
  public CartonActivity billToAttention(String billToAttention) {
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
  public CartonActivity billToCompany(String billToCompany) {
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
  public CartonActivity billToStreet(String billToStreet) {
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
  public CartonActivity billToStreet2(String billToStreet2) {
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
  public CartonActivity billToStreet3(String billToStreet3) {
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
  public CartonActivity billToCity(String billToCity) {
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
  public CartonActivity billToState(String billToState) {
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
  public CartonActivity billToZip(String billToZip) {
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
  public CartonActivity billToCountry(String billToCountry) {
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
  public CartonActivity billToPhone(String billToPhone) {
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
  public CartonActivity billToEmail(String billToEmail) {
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
  public CartonActivity holdCode(String holdCode) {
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
  public CartonActivity shipCode(String shipCode) {
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
  public CartonActivity orderMessage(String orderMessage) {
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
  public CartonActivity division(Integer division) {
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
  public CartonActivity costCenter(String costCenter) {
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
  public CartonActivity authorizedBy(String authorizedBy) {
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
  public CartonActivity batchNo(String batchNo) {
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
  public CartonActivity firstShipDate(Date firstShipDate) {
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
  public CartonActivity lastShipDate(Date lastShipDate) {
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
  public CartonActivity deliverOnDate(Date deliverOnDate) {
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
  public CartonActivity customerPONo(String customerPONo) {
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
  public CartonActivity shipVia(String shipVia) {
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
  public CartonActivity needByDate(Date needByDate) {
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
  public CartonActivity total(BigDecimal total) {
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
  public CartonActivity subtotal(BigDecimal subtotal) {
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
  public CartonActivity taxOnFreight(BigDecimal taxOnFreight) {
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
  public CartonActivity tax(BigDecimal tax) {
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
  public CartonActivity shippingCharge(BigDecimal shippingCharge) {
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
  public CartonActivity totalDiscount(BigDecimal totalDiscount) {
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
  public CartonActivity packingSlipTemplateId(Integer packingSlipTemplateId) {
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
  public CartonActivity giftMessage(String giftMessage) {
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
  public CartonActivity branchSector(String branchSector) {
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
  public CartonActivity branchArea(String branchArea) {
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
  public CartonActivity branchCustomerType(String branchCustomerType) {
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
  public CartonActivity branchId(String branchId) {
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
  public CartonActivity orderCode(String orderCode) {
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
  public CartonActivity leadPackageId(String leadPackageId) {
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
  public CartonActivity orderConfirmationEmailTemplateId(Integer orderConfirmationEmailTemplateId) {
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
  public CartonActivity shipmentConfirmationEmailTemplateId(Integer shipmentConfirmationEmailTemplateId) {
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
  public CartonActivity shippingSystemName(String shippingSystemName) {
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
  public CartonActivity orderInvoiceTemplateId(Integer orderInvoiceTemplateId) {
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
  public CartonActivity priceMode(String priceMode) {
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
  public CartonActivity customFields(Map<String, Object> customFields) {
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
    CartonActivity cartonActivity = (CartonActivity) o;
    return Objects.equals(this.id, cartonActivity.id) &&
        Objects.equals(this.createDate, cartonActivity.createDate) &&
        Objects.equals(this.modifyDate, cartonActivity.modifyDate) &&
        Objects.equals(this.lobId, cartonActivity.lobId) &&
        Objects.equals(this.orderNo, cartonActivity.orderNo) &&
        Objects.equals(this.shipDate, cartonActivity.shipDate) &&
        Objects.equals(this.deliveredDate, cartonActivity.deliveredDate) &&
        Objects.equals(this.trackingNo, cartonActivity.trackingNo) &&
        Objects.equals(this.warehouseId, cartonActivity.warehouseId) &&
        Objects.equals(this.warehouseName, cartonActivity.warehouseName) &&
        Objects.equals(this.cartonNo, cartonActivity.cartonNo) &&
        Objects.equals(this.numberOfCartons, cartonActivity.numberOfCartons) &&
        Objects.equals(this.status, cartonActivity.status) &&
        Objects.equals(this.shipped, cartonActivity.shipped) &&
        Objects.equals(this.carrierServiceId, cartonActivity.carrierServiceId) &&
        Objects.equals(this.dim1In, cartonActivity.dim1In) &&
        Objects.equals(this.dim2In, cartonActivity.dim2In) &&
        Objects.equals(this.dim3In, cartonActivity.dim3In) &&
        Objects.equals(this.estimatedZone, cartonActivity.estimatedZone) &&
        Objects.equals(this.parcelAccountNo, cartonActivity.parcelAccountNo) &&
        Objects.equals(this.thirdPartyParcelAccountNo, cartonActivity.thirdPartyParcelAccountNo) &&
        Objects.equals(this.manifestId, cartonActivity.manifestId) &&
        Objects.equals(this.residential, cartonActivity.residential) &&
        Objects.equals(this.billingOption, cartonActivity.billingOption) &&
        Objects.equals(this.weightLbs, cartonActivity.weightLbs) &&
        Objects.equals(this.dimWeight, cartonActivity.dimWeight) &&
        Objects.equals(this.licensePlateNumber, cartonActivity.licensePlateNumber) &&
        Objects.equals(this.chargedFreightAmount, cartonActivity.chargedFreightAmount) &&
        Objects.equals(this.publishedFreightAmount, cartonActivity.publishedFreightAmount) &&
        Objects.equals(this.retailFreightAmount, cartonActivity.retailFreightAmount) &&
        Objects.equals(this.alternateUsage, cartonActivity.alternateUsage) &&
        Objects.equals(this.groupOrderId, cartonActivity.groupOrderId) &&
        Objects.equals(this.orderStatus, cartonActivity.orderStatus) &&
        Objects.equals(this.orderStatusName, cartonActivity.orderStatusName) &&
        Objects.equals(this.fulfillmentProcessId, cartonActivity.fulfillmentProcessId) &&
        Objects.equals(this.carrierId, cartonActivity.carrierId) &&
        Objects.equals(this.carrierName, cartonActivity.carrierName) &&
        Objects.equals(this.mediaCode, cartonActivity.mediaCode) &&
        Objects.equals(this.legacyRestrictionType, cartonActivity.legacyRestrictionType) &&
        Objects.equals(this.reqTypeName, cartonActivity.reqTypeName) &&
        Objects.equals(this.serviceTypeId, cartonActivity.serviceTypeId) &&
        Objects.equals(this.serviceTypeName, cartonActivity.serviceTypeName) &&
        Objects.equals(this.alcoholOrderType, cartonActivity.alcoholOrderType) &&
        Objects.equals(this.distributionChannel, cartonActivity.distributionChannel) &&
        Objects.equals(this.distributionChannelName, cartonActivity.distributionChannelName) &&
        Objects.equals(this.priorityCode, cartonActivity.priorityCode) &&
        Objects.equals(this.orderDate, cartonActivity.orderDate) &&
        Objects.equals(this.enteredBy, cartonActivity.enteredBy) &&
        Objects.equals(this.orderReason, cartonActivity.orderReason) &&
        Objects.equals(this.customerOrderNo, cartonActivity.customerOrderNo) &&
        Objects.equals(this.priceLevel, cartonActivity.priceLevel) &&
        Objects.equals(this.orderCreateDate, cartonActivity.orderCreateDate) &&
        Objects.equals(this.shipBy, cartonActivity.shipBy) &&
        Objects.equals(this.stopBackOrders, cartonActivity.stopBackOrders) &&
        Objects.equals(this.orderSourceId, cartonActivity.orderSourceId) &&
        Objects.equals(this.orderSourceName, cartonActivity.orderSourceName) &&
        Objects.equals(this.integrationPartnerId, cartonActivity.integrationPartnerId) &&
        Objects.equals(this.integrationPartnerName, cartonActivity.integrationPartnerName) &&
        Objects.equals(this.orderLoadProgramId, cartonActivity.orderLoadProgramId) &&
        Objects.equals(this.orderLoadProgramName, cartonActivity.orderLoadProgramName) &&
        Objects.equals(this.omsOrderNo, cartonActivity.omsOrderNo) &&
        Objects.equals(this.omsCustomerId, cartonActivity.omsCustomerId) &&
        Objects.equals(this.shipToAttention, cartonActivity.shipToAttention) &&
        Objects.equals(this.shipToCompany, cartonActivity.shipToCompany) &&
        Objects.equals(this.shipToStreet, cartonActivity.shipToStreet) &&
        Objects.equals(this.shipToStreet2, cartonActivity.shipToStreet2) &&
        Objects.equals(this.shipToStreet3, cartonActivity.shipToStreet3) &&
        Objects.equals(this.shipToCity, cartonActivity.shipToCity) &&
        Objects.equals(this.shipToState, cartonActivity.shipToState) &&
        Objects.equals(this.shipToZip, cartonActivity.shipToZip) &&
        Objects.equals(this.shipToCountry, cartonActivity.shipToCountry) &&
        Objects.equals(this.shipToPhone, cartonActivity.shipToPhone) &&
        Objects.equals(this.shipToEmail, cartonActivity.shipToEmail) &&
        Objects.equals(this.billToAttention, cartonActivity.billToAttention) &&
        Objects.equals(this.billToCompany, cartonActivity.billToCompany) &&
        Objects.equals(this.billToStreet, cartonActivity.billToStreet) &&
        Objects.equals(this.billToStreet2, cartonActivity.billToStreet2) &&
        Objects.equals(this.billToStreet3, cartonActivity.billToStreet3) &&
        Objects.equals(this.billToCity, cartonActivity.billToCity) &&
        Objects.equals(this.billToState, cartonActivity.billToState) &&
        Objects.equals(this.billToZip, cartonActivity.billToZip) &&
        Objects.equals(this.billToCountry, cartonActivity.billToCountry) &&
        Objects.equals(this.billToPhone, cartonActivity.billToPhone) &&
        Objects.equals(this.billToEmail, cartonActivity.billToEmail) &&
        Objects.equals(this.orderShipDate, cartonActivity.orderShipDate) &&
        Objects.equals(this.freight, cartonActivity.freight) &&
        Objects.equals(this.orderWeightLbs, cartonActivity.orderWeightLbs) &&
        Objects.equals(this.orderEstimatedWeightLbs, cartonActivity.orderEstimatedWeightLbs) &&
        Objects.equals(this.numberOfPallets, cartonActivity.numberOfPallets) &&
        Objects.equals(this.numberOfLineItems, cartonActivity.numberOfLineItems) &&
        Objects.equals(this.completionStatus, cartonActivity.completionStatus) &&
        Objects.equals(this.holdCode, cartonActivity.holdCode) &&
        Objects.equals(this.shipCode, cartonActivity.shipCode) &&
        Objects.equals(this.orderMessage, cartonActivity.orderMessage) &&
        Objects.equals(this.division, cartonActivity.division) &&
        Objects.equals(this.costCenter, cartonActivity.costCenter) &&
        Objects.equals(this.authorizedBy, cartonActivity.authorizedBy) &&
        Objects.equals(this.batchNo, cartonActivity.batchNo) &&
        Objects.equals(this.firstShipDate, cartonActivity.firstShipDate) &&
        Objects.equals(this.lastShipDate, cartonActivity.lastShipDate) &&
        Objects.equals(this.deliverOnDate, cartonActivity.deliverOnDate) &&
        Objects.equals(this.customerPONo, cartonActivity.customerPONo) &&
        Objects.equals(this.shipVia, cartonActivity.shipVia) &&
        Objects.equals(this.needByDate, cartonActivity.needByDate) &&
        Objects.equals(this.total, cartonActivity.total) &&
        Objects.equals(this.balanceDue, cartonActivity.balanceDue) &&
        Objects.equals(this.totalPaid, cartonActivity.totalPaid) &&
        Objects.equals(this.authorizationAmount, cartonActivity.authorizationAmount) &&
        Objects.equals(this.subtotal, cartonActivity.subtotal) &&
        Objects.equals(this.taxOnFreight, cartonActivity.taxOnFreight) &&
        Objects.equals(this.tax, cartonActivity.tax) &&
        Objects.equals(this.distributionCharges, cartonActivity.distributionCharges) &&
        Objects.equals(this.shippingCharge, cartonActivity.shippingCharge) &&
        Objects.equals(this.totalDiscount, cartonActivity.totalDiscount) &&
        Objects.equals(this.parcelAccountId, cartonActivity.parcelAccountId) &&
        Objects.equals(this.packingSlipTemplateId, cartonActivity.packingSlipTemplateId) &&
        Objects.equals(this.giftMessage, cartonActivity.giftMessage) &&
        Objects.equals(this.branchSector, cartonActivity.branchSector) &&
        Objects.equals(this.branchArea, cartonActivity.branchArea) &&
        Objects.equals(this.branchCustomerType, cartonActivity.branchCustomerType) &&
        Objects.equals(this.branchId, cartonActivity.branchId) &&
        Objects.equals(this.orderCode, cartonActivity.orderCode) &&
        Objects.equals(this.leadPackageId, cartonActivity.leadPackageId) &&
        Objects.equals(this.totalQty, cartonActivity.totalQty) &&
        Objects.equals(this.estimatedNumberOfPicks, cartonActivity.estimatedNumberOfPicks) &&
        Objects.equals(this.orderConfirmationEmailTemplateId, cartonActivity.orderConfirmationEmailTemplateId) &&
        Objects.equals(this.shipmentConfirmationEmailTemplateId, cartonActivity.shipmentConfirmationEmailTemplateId) &&
        Objects.equals(this.externalShippingSystemId, cartonActivity.externalShippingSystemId) &&
        Objects.equals(this.shippingSystemName, cartonActivity.shippingSystemName) &&
        Objects.equals(this.orderInvoiceTemplateId, cartonActivity.orderInvoiceTemplateId) &&
        Objects.equals(this.priceMode, cartonActivity.priceMode) &&
        Objects.equals(this.customFields, cartonActivity.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, lobId, orderNo, shipDate, deliveredDate, trackingNo, warehouseId, warehouseName, cartonNo, numberOfCartons, status, shipped, carrierServiceId, dim1In, dim2In, dim3In, estimatedZone, parcelAccountNo, thirdPartyParcelAccountNo, manifestId, residential, billingOption, weightLbs, dimWeight, licensePlateNumber, chargedFreightAmount, publishedFreightAmount, retailFreightAmount, alternateUsage, groupOrderId, orderStatus, orderStatusName, fulfillmentProcessId, carrierId, carrierName, mediaCode, legacyRestrictionType, reqTypeName, serviceTypeId, serviceTypeName, alcoholOrderType, distributionChannel, distributionChannelName, priorityCode, orderDate, enteredBy, orderReason, customerOrderNo, priceLevel, orderCreateDate, shipBy, stopBackOrders, orderSourceId, orderSourceName, integrationPartnerId, integrationPartnerName, orderLoadProgramId, orderLoadProgramName, omsOrderNo, omsCustomerId, shipToAttention, shipToCompany, shipToStreet, shipToStreet2, shipToStreet3, shipToCity, shipToState, shipToZip, shipToCountry, shipToPhone, shipToEmail, billToAttention, billToCompany, billToStreet, billToStreet2, billToStreet3, billToCity, billToState, billToZip, billToCountry, billToPhone, billToEmail, orderShipDate, freight, orderWeightLbs, orderEstimatedWeightLbs, numberOfPallets, numberOfLineItems, completionStatus, holdCode, shipCode, orderMessage, division, costCenter, authorizedBy, batchNo, firstShipDate, lastShipDate, deliverOnDate, customerPONo, shipVia, needByDate, total, balanceDue, totalPaid, authorizationAmount, subtotal, taxOnFreight, tax, distributionCharges, shippingCharge, totalDiscount, parcelAccountId, packingSlipTemplateId, giftMessage, branchSector, branchArea, branchCustomerType, branchId, orderCode, leadPackageId, totalQty, estimatedNumberOfPicks, orderConfirmationEmailTemplateId, shipmentConfirmationEmailTemplateId, externalShippingSystemId, shippingSystemName, orderInvoiceTemplateId, priceMode, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartonActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    deliveredDate: ").append(toIndentedString(deliveredDate)).append("\n");
    sb.append("    trackingNo: ").append(toIndentedString(trackingNo)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    warehouseName: ").append(toIndentedString(warehouseName)).append("\n");
    sb.append("    cartonNo: ").append(toIndentedString(cartonNo)).append("\n");
    sb.append("    numberOfCartons: ").append(toIndentedString(numberOfCartons)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    shipped: ").append(toIndentedString(shipped)).append("\n");
    sb.append("    carrierServiceId: ").append(toIndentedString(carrierServiceId)).append("\n");
    sb.append("    dim1In: ").append(toIndentedString(dim1In)).append("\n");
    sb.append("    dim2In: ").append(toIndentedString(dim2In)).append("\n");
    sb.append("    dim3In: ").append(toIndentedString(dim3In)).append("\n");
    sb.append("    estimatedZone: ").append(toIndentedString(estimatedZone)).append("\n");
    sb.append("    parcelAccountNo: ").append(toIndentedString(parcelAccountNo)).append("\n");
    sb.append("    thirdPartyParcelAccountNo: ").append(toIndentedString(thirdPartyParcelAccountNo)).append("\n");
    sb.append("    manifestId: ").append(toIndentedString(manifestId)).append("\n");
    sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
    sb.append("    billingOption: ").append(toIndentedString(billingOption)).append("\n");
    sb.append("    weightLbs: ").append(toIndentedString(weightLbs)).append("\n");
    sb.append("    dimWeight: ").append(toIndentedString(dimWeight)).append("\n");
    sb.append("    licensePlateNumber: ").append(toIndentedString(licensePlateNumber)).append("\n");
    sb.append("    chargedFreightAmount: ").append(toIndentedString(chargedFreightAmount)).append("\n");
    sb.append("    publishedFreightAmount: ").append(toIndentedString(publishedFreightAmount)).append("\n");
    sb.append("    retailFreightAmount: ").append(toIndentedString(retailFreightAmount)).append("\n");
    sb.append("    alternateUsage: ").append(toIndentedString(alternateUsage)).append("\n");
    sb.append("    groupOrderId: ").append(toIndentedString(groupOrderId)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    orderStatusName: ").append(toIndentedString(orderStatusName)).append("\n");
    sb.append("    fulfillmentProcessId: ").append(toIndentedString(fulfillmentProcessId)).append("\n");
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
    sb.append("    orderCreateDate: ").append(toIndentedString(orderCreateDate)).append("\n");
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

