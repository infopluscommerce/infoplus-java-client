package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.infopluscommerce.model.OrderExtraLineItemData;
import com.infopluscommerce.model.OrderExtraOrderData;
import com.infopluscommerce.model.OrderLine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
public class Order   {
  
  private BigDecimal orderNo = null;
  private String customerOrderNo = null;
  private Integer lobId = null;
  private Integer warehouseId = null;
  private Date orderDate = null;
  private String customerNo = null;
  private Integer useOrderNoRoot = null;
  private Date firstShipDate = null;
  private Date lastShipDate = null;
  private Date deliverOnDate = null;
  private Date needByDate = null;
  private Integer carrierId = null;
  private String serviceTypeId = null;
  private String shipVia = null;
  private String mediaCode = null;
  private String legacyRestrictionType = null;
  private String alcoholOrderType = null;
  private String alternateUsage = null;
  private BigDecimal authorizationAmount = null;
  private String authorizedBy = null;
  private BigDecimal balanceDue = null;
  private String batchNo = null;
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
  private Integer numberOfCartons = null;
  private Integer numberOfPallets = null;
  private String completionStatus = null;
  private Integer parcelAccountId = null;
  private String costCenter = null;
  private Date createDate = null;
  private String customerPONo = null;
  private String distributionChannel = null;
  private BigDecimal distributionCharges = null;
  private Integer division = null;
  private String enteredBy = null;
  private BigDecimal estimatedWeightLbs = null;
  private BigDecimal freight = null;
  private String giftMessage = null;
  private BigDecimal groupOrderId = null;
  private String holdCode = null;
  private Integer integrationPartnerId = null;
  private Integer numberOfLineItems = null;
  private Date modifyDate = null;
  private Integer omsOrderNo = null;
  private Integer omsCustomerId = null;
  private Integer orderLoadProgramId = null;
  private String orderMessage = null;
  private Integer orderReason = null;
  private Integer orderSourceId = null;
  private Integer packingSlipTemplateId = null;
  private Integer orderConfirmationEmailTemplateId = null;
  private Integer shipmentConfirmationEmailTemplateId = null;
  private String priceLevel = null;
  private Integer priorityCode = null;
  private Integer fulfillmentProcessId = null;
  private Date shipBy = null;
  private String shipCode = null;
  private Date shipDate = null;
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
  private BigDecimal shippingCharge = null;
  private String status = null;
  private String stopBackOrders = null;
  private BigDecimal subtotal = null;
  private BigDecimal tax = null;
  private BigDecimal total = null;
  private BigDecimal totalPaid = null;
  private Integer totalQty = null;
  private BigDecimal weightLbs = null;
  private List<OrderLine> lineItems = new ArrayList<OrderLine>();
  private List<OrderExtraOrderData> extraOrderData = new ArrayList<OrderExtraOrderData>();
  private List<OrderExtraLineItemData> extraLineItemData = new ArrayList<OrderExtraLineItemData>();
  private Integer externalShippingSystemId = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderNo")
  public BigDecimal getOrderNo() {
    return orderNo;
  }

  
  /**
   **/
  public Order customerOrderNo(String customerOrderNo) {
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
  public Order lobId(Integer lobId) {
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
  public Order warehouseId(Integer warehouseId) {
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
  public Order orderDate(Date orderDate) {
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

  
  /**
   **/
  public Order customerNo(String customerNo) {
    this.customerNo = customerNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerNo")
  public String getCustomerNo() {
    return customerNo;
  }
  public void setCustomerNo(String customerNo) {
    this.customerNo = customerNo;
  }

  
  /**
   **/
  public Order useOrderNoRoot(Integer useOrderNoRoot) {
    this.useOrderNoRoot = useOrderNoRoot;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("useOrderNoRoot")
  public Integer getUseOrderNoRoot() {
    return useOrderNoRoot;
  }
  public void setUseOrderNoRoot(Integer useOrderNoRoot) {
    this.useOrderNoRoot = useOrderNoRoot;
  }

  
  /**
   **/
  public Order firstShipDate(Date firstShipDate) {
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
  public Order lastShipDate(Date lastShipDate) {
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
  public Order deliverOnDate(Date deliverOnDate) {
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
  public Order needByDate(Date needByDate) {
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
  public Order carrierId(Integer carrierId) {
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
  public Order serviceTypeId(String serviceTypeId) {
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
  public Order shipVia(String shipVia) {
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
  public Order mediaCode(String mediaCode) {
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
  public Order legacyRestrictionType(String legacyRestrictionType) {
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
  public Order alcoholOrderType(String alcoholOrderType) {
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
  public Order alternateUsage(String alternateUsage) {
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
  @JsonProperty("authorizationAmount")
  public BigDecimal getAuthorizationAmount() {
    return authorizationAmount;
  }

  
  /**
   **/
  public Order authorizedBy(String authorizedBy) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("balanceDue")
  public BigDecimal getBalanceDue() {
    return balanceDue;
  }

  
  /**
   **/
  public Order batchNo(String batchNo) {
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
  public Order billToAttention(String billToAttention) {
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
  public Order billToCompany(String billToCompany) {
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
  public Order billToStreet(String billToStreet) {
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
  public Order billToStreet2(String billToStreet2) {
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
  public Order billToStreet3(String billToStreet3) {
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
  public Order billToCity(String billToCity) {
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
  public Order billToState(String billToState) {
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
  public Order billToZip(String billToZip) {
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
  public Order billToCountry(String billToCountry) {
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
  public Order billToPhone(String billToPhone) {
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
  public Order billToEmail(String billToEmail) {
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
  @JsonProperty("completionStatus")
  public String getCompletionStatus() {
    return completionStatus;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parcelAccountId")
  public Integer getParcelAccountId() {
    return parcelAccountId;
  }

  
  /**
   **/
  public Order costCenter(String costCenter) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }

  
  /**
   **/
  public Order customerPONo(String customerPONo) {
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
  public Order distributionChannel(String distributionChannel) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("distributionCharges")
  public BigDecimal getDistributionCharges() {
    return distributionCharges;
  }

  
  /**
   **/
  public Order division(Integer division) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enteredBy")
  public String getEnteredBy() {
    return enteredBy;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("estimatedWeightLbs")
  public BigDecimal getEstimatedWeightLbs() {
    return estimatedWeightLbs;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("freight")
  public BigDecimal getFreight() {
    return freight;
  }

  
  /**
   **/
  public Order giftMessage(String giftMessage) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("groupOrderId")
  public BigDecimal getGroupOrderId() {
    return groupOrderId;
  }

  
  /**
   **/
  public Order holdCode(String holdCode) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("integrationPartnerId")
  public Integer getIntegrationPartnerId() {
    return integrationPartnerId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfLineItems")
  public Integer getNumberOfLineItems() {
    return numberOfLineItems;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderLoadProgramId")
  public Integer getOrderLoadProgramId() {
    return orderLoadProgramId;
  }

  
  /**
   **/
  public Order orderMessage(String orderMessage) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderReason")
  public Integer getOrderReason() {
    return orderReason;
  }

  
  /**
   **/
  public Order orderSourceId(Integer orderSourceId) {
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
  public Order packingSlipTemplateId(Integer packingSlipTemplateId) {
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
  public Order orderConfirmationEmailTemplateId(Integer orderConfirmationEmailTemplateId) {
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
  public Order shipmentConfirmationEmailTemplateId(Integer shipmentConfirmationEmailTemplateId) {
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
  public Order priceLevel(String priceLevel) {
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

  
  /**
   **/
  public Order priorityCode(Integer priorityCode) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fulfillmentProcessId")
  public Integer getFulfillmentProcessId() {
    return fulfillmentProcessId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipBy")
  public Date getShipBy() {
    return shipBy;
  }

  
  /**
   **/
  public Order shipCode(String shipCode) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipDate")
  public Date getShipDate() {
    return shipDate;
  }

  
  /**
   **/
  public Order shipToAttention(String shipToAttention) {
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
  public Order shipToCompany(String shipToCompany) {
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
  public Order shipToStreet(String shipToStreet) {
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
  public Order shipToStreet2(String shipToStreet2) {
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
  public Order shipToStreet3(String shipToStreet3) {
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
  public Order shipToCity(String shipToCity) {
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
  public Order shipToState(String shipToState) {
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
  public Order shipToZip(String shipToZip) {
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
  public Order shipToCountry(String shipToCountry) {
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
  public Order shipToPhone(String shipToPhone) {
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
  public Order shipToEmail(String shipToEmail) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shippingCharge")
  public BigDecimal getShippingCharge() {
    return shippingCharge;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stopBackOrders")
  public String getStopBackOrders() {
    return stopBackOrders;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("subtotal")
  public BigDecimal getSubtotal() {
    return subtotal;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tax")
  public BigDecimal getTax() {
    return tax;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalPaid")
  public BigDecimal getTotalPaid() {
    return totalPaid;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalQty")
  public Integer getTotalQty() {
    return totalQty;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weightLbs")
  public BigDecimal getWeightLbs() {
    return weightLbs;
  }

  
  /**
   **/
  public Order lineItems(List<OrderLine> lineItems) {
    this.lineItems = lineItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("lineItems")
  public List<OrderLine> getLineItems() {
    return lineItems;
  }
  public void setLineItems(List<OrderLine> lineItems) {
    this.lineItems = lineItems;
  }

  
  /**
   **/
  public Order extraOrderData(List<OrderExtraOrderData> extraOrderData) {
    this.extraOrderData = extraOrderData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraOrderData")
  public List<OrderExtraOrderData> getExtraOrderData() {
    return extraOrderData;
  }
  public void setExtraOrderData(List<OrderExtraOrderData> extraOrderData) {
    this.extraOrderData = extraOrderData;
  }

  
  /**
   **/
  public Order extraLineItemData(List<OrderExtraLineItemData> extraLineItemData) {
    this.extraLineItemData = extraLineItemData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraLineItemData")
  public List<OrderExtraLineItemData> getExtraLineItemData() {
    return extraLineItemData;
  }
  public void setExtraLineItemData(List<OrderExtraLineItemData> extraLineItemData) {
    this.extraLineItemData = extraLineItemData;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalShippingSystemId")
  public Integer getExternalShippingSystemId() {
    return externalShippingSystemId;
  }

  
  /**
   **/
  public Order customFields(Map<String, Object> customFields) {
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
    Order order = (Order) o;
    return Objects.equals(this.orderNo, order.orderNo) &&
        Objects.equals(this.customerOrderNo, order.customerOrderNo) &&
        Objects.equals(this.lobId, order.lobId) &&
        Objects.equals(this.warehouseId, order.warehouseId) &&
        Objects.equals(this.orderDate, order.orderDate) &&
        Objects.equals(this.customerNo, order.customerNo) &&
        Objects.equals(this.useOrderNoRoot, order.useOrderNoRoot) &&
        Objects.equals(this.firstShipDate, order.firstShipDate) &&
        Objects.equals(this.lastShipDate, order.lastShipDate) &&
        Objects.equals(this.deliverOnDate, order.deliverOnDate) &&
        Objects.equals(this.needByDate, order.needByDate) &&
        Objects.equals(this.carrierId, order.carrierId) &&
        Objects.equals(this.serviceTypeId, order.serviceTypeId) &&
        Objects.equals(this.shipVia, order.shipVia) &&
        Objects.equals(this.mediaCode, order.mediaCode) &&
        Objects.equals(this.legacyRestrictionType, order.legacyRestrictionType) &&
        Objects.equals(this.alcoholOrderType, order.alcoholOrderType) &&
        Objects.equals(this.alternateUsage, order.alternateUsage) &&
        Objects.equals(this.authorizationAmount, order.authorizationAmount) &&
        Objects.equals(this.authorizedBy, order.authorizedBy) &&
        Objects.equals(this.balanceDue, order.balanceDue) &&
        Objects.equals(this.batchNo, order.batchNo) &&
        Objects.equals(this.billToAttention, order.billToAttention) &&
        Objects.equals(this.billToCompany, order.billToCompany) &&
        Objects.equals(this.billToStreet, order.billToStreet) &&
        Objects.equals(this.billToStreet2, order.billToStreet2) &&
        Objects.equals(this.billToStreet3, order.billToStreet3) &&
        Objects.equals(this.billToCity, order.billToCity) &&
        Objects.equals(this.billToState, order.billToState) &&
        Objects.equals(this.billToZip, order.billToZip) &&
        Objects.equals(this.billToCountry, order.billToCountry) &&
        Objects.equals(this.billToPhone, order.billToPhone) &&
        Objects.equals(this.billToEmail, order.billToEmail) &&
        Objects.equals(this.numberOfCartons, order.numberOfCartons) &&
        Objects.equals(this.numberOfPallets, order.numberOfPallets) &&
        Objects.equals(this.completionStatus, order.completionStatus) &&
        Objects.equals(this.parcelAccountId, order.parcelAccountId) &&
        Objects.equals(this.costCenter, order.costCenter) &&
        Objects.equals(this.createDate, order.createDate) &&
        Objects.equals(this.customerPONo, order.customerPONo) &&
        Objects.equals(this.distributionChannel, order.distributionChannel) &&
        Objects.equals(this.distributionCharges, order.distributionCharges) &&
        Objects.equals(this.division, order.division) &&
        Objects.equals(this.enteredBy, order.enteredBy) &&
        Objects.equals(this.estimatedWeightLbs, order.estimatedWeightLbs) &&
        Objects.equals(this.freight, order.freight) &&
        Objects.equals(this.giftMessage, order.giftMessage) &&
        Objects.equals(this.groupOrderId, order.groupOrderId) &&
        Objects.equals(this.holdCode, order.holdCode) &&
        Objects.equals(this.integrationPartnerId, order.integrationPartnerId) &&
        Objects.equals(this.numberOfLineItems, order.numberOfLineItems) &&
        Objects.equals(this.modifyDate, order.modifyDate) &&
        Objects.equals(this.omsOrderNo, order.omsOrderNo) &&
        Objects.equals(this.omsCustomerId, order.omsCustomerId) &&
        Objects.equals(this.orderLoadProgramId, order.orderLoadProgramId) &&
        Objects.equals(this.orderMessage, order.orderMessage) &&
        Objects.equals(this.orderReason, order.orderReason) &&
        Objects.equals(this.orderSourceId, order.orderSourceId) &&
        Objects.equals(this.packingSlipTemplateId, order.packingSlipTemplateId) &&
        Objects.equals(this.orderConfirmationEmailTemplateId, order.orderConfirmationEmailTemplateId) &&
        Objects.equals(this.shipmentConfirmationEmailTemplateId, order.shipmentConfirmationEmailTemplateId) &&
        Objects.equals(this.priceLevel, order.priceLevel) &&
        Objects.equals(this.priorityCode, order.priorityCode) &&
        Objects.equals(this.fulfillmentProcessId, order.fulfillmentProcessId) &&
        Objects.equals(this.shipBy, order.shipBy) &&
        Objects.equals(this.shipCode, order.shipCode) &&
        Objects.equals(this.shipDate, order.shipDate) &&
        Objects.equals(this.shipToAttention, order.shipToAttention) &&
        Objects.equals(this.shipToCompany, order.shipToCompany) &&
        Objects.equals(this.shipToStreet, order.shipToStreet) &&
        Objects.equals(this.shipToStreet2, order.shipToStreet2) &&
        Objects.equals(this.shipToStreet3, order.shipToStreet3) &&
        Objects.equals(this.shipToCity, order.shipToCity) &&
        Objects.equals(this.shipToState, order.shipToState) &&
        Objects.equals(this.shipToZip, order.shipToZip) &&
        Objects.equals(this.shipToCountry, order.shipToCountry) &&
        Objects.equals(this.shipToPhone, order.shipToPhone) &&
        Objects.equals(this.shipToEmail, order.shipToEmail) &&
        Objects.equals(this.shippingCharge, order.shippingCharge) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.stopBackOrders, order.stopBackOrders) &&
        Objects.equals(this.subtotal, order.subtotal) &&
        Objects.equals(this.tax, order.tax) &&
        Objects.equals(this.total, order.total) &&
        Objects.equals(this.totalPaid, order.totalPaid) &&
        Objects.equals(this.totalQty, order.totalQty) &&
        Objects.equals(this.weightLbs, order.weightLbs) &&
        Objects.equals(this.lineItems, order.lineItems) &&
        Objects.equals(this.extraOrderData, order.extraOrderData) &&
        Objects.equals(this.extraLineItemData, order.extraLineItemData) &&
        Objects.equals(this.externalShippingSystemId, order.externalShippingSystemId) &&
        Objects.equals(this.customFields, order.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNo, customerOrderNo, lobId, warehouseId, orderDate, customerNo, useOrderNoRoot, firstShipDate, lastShipDate, deliverOnDate, needByDate, carrierId, serviceTypeId, shipVia, mediaCode, legacyRestrictionType, alcoholOrderType, alternateUsage, authorizationAmount, authorizedBy, balanceDue, batchNo, billToAttention, billToCompany, billToStreet, billToStreet2, billToStreet3, billToCity, billToState, billToZip, billToCountry, billToPhone, billToEmail, numberOfCartons, numberOfPallets, completionStatus, parcelAccountId, costCenter, createDate, customerPONo, distributionChannel, distributionCharges, division, enteredBy, estimatedWeightLbs, freight, giftMessage, groupOrderId, holdCode, integrationPartnerId, numberOfLineItems, modifyDate, omsOrderNo, omsCustomerId, orderLoadProgramId, orderMessage, orderReason, orderSourceId, packingSlipTemplateId, orderConfirmationEmailTemplateId, shipmentConfirmationEmailTemplateId, priceLevel, priorityCode, fulfillmentProcessId, shipBy, shipCode, shipDate, shipToAttention, shipToCompany, shipToStreet, shipToStreet2, shipToStreet3, shipToCity, shipToState, shipToZip, shipToCountry, shipToPhone, shipToEmail, shippingCharge, status, stopBackOrders, subtotal, tax, total, totalPaid, totalQty, weightLbs, lineItems, extraOrderData, extraLineItemData, externalShippingSystemId, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    customerOrderNo: ").append(toIndentedString(customerOrderNo)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    customerNo: ").append(toIndentedString(customerNo)).append("\n");
    sb.append("    useOrderNoRoot: ").append(toIndentedString(useOrderNoRoot)).append("\n");
    sb.append("    firstShipDate: ").append(toIndentedString(firstShipDate)).append("\n");
    sb.append("    lastShipDate: ").append(toIndentedString(lastShipDate)).append("\n");
    sb.append("    deliverOnDate: ").append(toIndentedString(deliverOnDate)).append("\n");
    sb.append("    needByDate: ").append(toIndentedString(needByDate)).append("\n");
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    serviceTypeId: ").append(toIndentedString(serviceTypeId)).append("\n");
    sb.append("    shipVia: ").append(toIndentedString(shipVia)).append("\n");
    sb.append("    mediaCode: ").append(toIndentedString(mediaCode)).append("\n");
    sb.append("    legacyRestrictionType: ").append(toIndentedString(legacyRestrictionType)).append("\n");
    sb.append("    alcoholOrderType: ").append(toIndentedString(alcoholOrderType)).append("\n");
    sb.append("    alternateUsage: ").append(toIndentedString(alternateUsage)).append("\n");
    sb.append("    authorizationAmount: ").append(toIndentedString(authorizationAmount)).append("\n");
    sb.append("    authorizedBy: ").append(toIndentedString(authorizedBy)).append("\n");
    sb.append("    balanceDue: ").append(toIndentedString(balanceDue)).append("\n");
    sb.append("    batchNo: ").append(toIndentedString(batchNo)).append("\n");
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
    sb.append("    numberOfCartons: ").append(toIndentedString(numberOfCartons)).append("\n");
    sb.append("    numberOfPallets: ").append(toIndentedString(numberOfPallets)).append("\n");
    sb.append("    completionStatus: ").append(toIndentedString(completionStatus)).append("\n");
    sb.append("    parcelAccountId: ").append(toIndentedString(parcelAccountId)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    customerPONo: ").append(toIndentedString(customerPONo)).append("\n");
    sb.append("    distributionChannel: ").append(toIndentedString(distributionChannel)).append("\n");
    sb.append("    distributionCharges: ").append(toIndentedString(distributionCharges)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    enteredBy: ").append(toIndentedString(enteredBy)).append("\n");
    sb.append("    estimatedWeightLbs: ").append(toIndentedString(estimatedWeightLbs)).append("\n");
    sb.append("    freight: ").append(toIndentedString(freight)).append("\n");
    sb.append("    giftMessage: ").append(toIndentedString(giftMessage)).append("\n");
    sb.append("    groupOrderId: ").append(toIndentedString(groupOrderId)).append("\n");
    sb.append("    holdCode: ").append(toIndentedString(holdCode)).append("\n");
    sb.append("    integrationPartnerId: ").append(toIndentedString(integrationPartnerId)).append("\n");
    sb.append("    numberOfLineItems: ").append(toIndentedString(numberOfLineItems)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    omsOrderNo: ").append(toIndentedString(omsOrderNo)).append("\n");
    sb.append("    omsCustomerId: ").append(toIndentedString(omsCustomerId)).append("\n");
    sb.append("    orderLoadProgramId: ").append(toIndentedString(orderLoadProgramId)).append("\n");
    sb.append("    orderMessage: ").append(toIndentedString(orderMessage)).append("\n");
    sb.append("    orderReason: ").append(toIndentedString(orderReason)).append("\n");
    sb.append("    orderSourceId: ").append(toIndentedString(orderSourceId)).append("\n");
    sb.append("    packingSlipTemplateId: ").append(toIndentedString(packingSlipTemplateId)).append("\n");
    sb.append("    orderConfirmationEmailTemplateId: ").append(toIndentedString(orderConfirmationEmailTemplateId)).append("\n");
    sb.append("    shipmentConfirmationEmailTemplateId: ").append(toIndentedString(shipmentConfirmationEmailTemplateId)).append("\n");
    sb.append("    priceLevel: ").append(toIndentedString(priceLevel)).append("\n");
    sb.append("    priorityCode: ").append(toIndentedString(priorityCode)).append("\n");
    sb.append("    fulfillmentProcessId: ").append(toIndentedString(fulfillmentProcessId)).append("\n");
    sb.append("    shipBy: ").append(toIndentedString(shipBy)).append("\n");
    sb.append("    shipCode: ").append(toIndentedString(shipCode)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
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
    sb.append("    shippingCharge: ").append(toIndentedString(shippingCharge)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stopBackOrders: ").append(toIndentedString(stopBackOrders)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalPaid: ").append(toIndentedString(totalPaid)).append("\n");
    sb.append("    totalQty: ").append(toIndentedString(totalQty)).append("\n");
    sb.append("    weightLbs: ").append(toIndentedString(weightLbs)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    extraOrderData: ").append(toIndentedString(extraOrderData)).append("\n");
    sb.append("    extraLineItemData: ").append(toIndentedString(extraLineItemData)).append("\n");
    sb.append("    externalShippingSystemId: ").append(toIndentedString(externalShippingSystemId)).append("\n");
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

