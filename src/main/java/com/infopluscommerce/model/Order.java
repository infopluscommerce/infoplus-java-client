package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.infopluscommerce.model.OrderLine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class Order   {
  
  private Double orderNo = null;
  private String customerOrderNo = null;
  private Integer lobId = null;
  private Integer warehouseId = null;
  private Date orderDate = null;
  private String customerNo = null;
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
  private Double authorizationAmount = null;
  private String authorizedBy = null;
  private Double balanceDue = null;
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
  private Double distributionCharges = null;
  private Integer division = null;
  private String enteredBy = null;
  private Double estimatedWeightLbs = null;
  private Double freight = null;
  private String giftMessage = null;
  private Double groupOrderId = null;
  private String holdCode = null;
  private Integer integrationPartnerId = null;
  private Integer numberOfLineItems = null;
  private Date modifyDate = null;
  private Integer omsOrderId = null;
  private Integer omsOrderNo = null;
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
  private Double shippingCharge = null;
  private String status = null;
  private String stopBackOrders = null;
  private Double subtotal = null;
  private Double tax = null;
  private Double total = null;
  private Double totalPaid = null;
  private Integer totalQty = null;
  private Double weightLbs = null;
  private List<OrderLine> lineItems = new ArrayList<OrderLine>();

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderNo")
  public Double getOrderNo() {
    return orderNo;
  }
  public void setOrderNo(Double orderNo) {
    this.orderNo = orderNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customerOrderNo")
  public String getCustomerOrderNo() {
    return customerOrderNo;
  }
  public void setCustomerOrderNo(String customerOrderNo) {
    this.customerOrderNo = customerOrderNo;
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
  @JsonProperty("customerNo")
  public String getCustomerNo() {
    return customerNo;
  }
  public void setCustomerNo(String customerNo) {
    this.customerNo = customerNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("firstShipDate")
  public Date getFirstShipDate() {
    return firstShipDate;
  }
  public void setFirstShipDate(Date firstShipDate) {
    this.firstShipDate = firstShipDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastShipDate")
  public Date getLastShipDate() {
    return lastShipDate;
  }
  public void setLastShipDate(Date lastShipDate) {
    this.lastShipDate = lastShipDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deliverOnDate")
  public Date getDeliverOnDate() {
    return deliverOnDate;
  }
  public void setDeliverOnDate(Date deliverOnDate) {
    this.deliverOnDate = deliverOnDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("needByDate")
  public Date getNeedByDate() {
    return needByDate;
  }
  public void setNeedByDate(Date needByDate) {
    this.needByDate = needByDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("carrierId")
  public Integer getCarrierId() {
    return carrierId;
  }
  public void setCarrierId(Integer carrierId) {
    this.carrierId = carrierId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceTypeId")
  public String getServiceTypeId() {
    return serviceTypeId;
  }
  public void setServiceTypeId(String serviceTypeId) {
    this.serviceTypeId = serviceTypeId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipVia")
  public String getShipVia() {
    return shipVia;
  }
  public void setShipVia(String shipVia) {
    this.shipVia = shipVia;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("mediaCode")
  public String getMediaCode() {
    return mediaCode;
  }
  public void setMediaCode(String mediaCode) {
    this.mediaCode = mediaCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("legacyRestrictionType")
  public String getLegacyRestrictionType() {
    return legacyRestrictionType;
  }
  public void setLegacyRestrictionType(String legacyRestrictionType) {
    this.legacyRestrictionType = legacyRestrictionType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("alcoholOrderType")
  public String getAlcoholOrderType() {
    return alcoholOrderType;
  }
  public void setAlcoholOrderType(String alcoholOrderType) {
    this.alcoholOrderType = alcoholOrderType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("alternateUsage")
  public String getAlternateUsage() {
    return alternateUsage;
  }
  public void setAlternateUsage(String alternateUsage) {
    this.alternateUsage = alternateUsage;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authorizationAmount")
  public Double getAuthorizationAmount() {
    return authorizationAmount;
  }
  public void setAuthorizationAmount(Double authorizationAmount) {
    this.authorizationAmount = authorizationAmount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authorizedBy")
  public String getAuthorizedBy() {
    return authorizedBy;
  }
  public void setAuthorizedBy(String authorizedBy) {
    this.authorizedBy = authorizedBy;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("balanceDue")
  public Double getBalanceDue() {
    return balanceDue;
  }
  public void setBalanceDue(Double balanceDue) {
    this.balanceDue = balanceDue;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("batchNo")
  public String getBatchNo() {
    return batchNo;
  }
  public void setBatchNo(String batchNo) {
    this.batchNo = batchNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billToAttention")
  public String getBillToAttention() {
    return billToAttention;
  }
  public void setBillToAttention(String billToAttention) {
    this.billToAttention = billToAttention;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billToCompany")
  public String getBillToCompany() {
    return billToCompany;
  }
  public void setBillToCompany(String billToCompany) {
    this.billToCompany = billToCompany;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billToStreet")
  public String getBillToStreet() {
    return billToStreet;
  }
  public void setBillToStreet(String billToStreet) {
    this.billToStreet = billToStreet;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billToStreet2")
  public String getBillToStreet2() {
    return billToStreet2;
  }
  public void setBillToStreet2(String billToStreet2) {
    this.billToStreet2 = billToStreet2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billToStreet3")
  public String getBillToStreet3() {
    return billToStreet3;
  }
  public void setBillToStreet3(String billToStreet3) {
    this.billToStreet3 = billToStreet3;
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
  @JsonProperty("billToCountry")
  public String getBillToCountry() {
    return billToCountry;
  }
  public void setBillToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billToPhone")
  public String getBillToPhone() {
    return billToPhone;
  }
  public void setBillToPhone(String billToPhone) {
    this.billToPhone = billToPhone;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billToEmail")
  public String getBillToEmail() {
    return billToEmail;
  }
  public void setBillToEmail(String billToEmail) {
    this.billToEmail = billToEmail;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numberOfCartons")
  public Integer getNumberOfCartons() {
    return numberOfCartons;
  }
  public void setNumberOfCartons(Integer numberOfCartons) {
    this.numberOfCartons = numberOfCartons;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numberOfPallets")
  public Integer getNumberOfPallets() {
    return numberOfPallets;
  }
  public void setNumberOfPallets(Integer numberOfPallets) {
    this.numberOfPallets = numberOfPallets;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("completionStatus")
  public String getCompletionStatus() {
    return completionStatus;
  }
  public void setCompletionStatus(String completionStatus) {
    this.completionStatus = completionStatus;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parcelAccountId")
  public Integer getParcelAccountId() {
    return parcelAccountId;
  }
  public void setParcelAccountId(Integer parcelAccountId) {
    this.parcelAccountId = parcelAccountId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("costCenter")
  public String getCostCenter() {
    return costCenter;
  }
  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
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
  @JsonProperty("customerPONo")
  public String getCustomerPONo() {
    return customerPONo;
  }
  public void setCustomerPONo(String customerPONo) {
    this.customerPONo = customerPONo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("distributionChannel")
  public String getDistributionChannel() {
    return distributionChannel;
  }
  public void setDistributionChannel(String distributionChannel) {
    this.distributionChannel = distributionChannel;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("distributionCharges")
  public Double getDistributionCharges() {
    return distributionCharges;
  }
  public void setDistributionCharges(Double distributionCharges) {
    this.distributionCharges = distributionCharges;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("division")
  public Integer getDivision() {
    return division;
  }
  public void setDivision(Integer division) {
    this.division = division;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enteredBy")
  public String getEnteredBy() {
    return enteredBy;
  }
  public void setEnteredBy(String enteredBy) {
    this.enteredBy = enteredBy;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedWeightLbs")
  public Double getEstimatedWeightLbs() {
    return estimatedWeightLbs;
  }
  public void setEstimatedWeightLbs(Double estimatedWeightLbs) {
    this.estimatedWeightLbs = estimatedWeightLbs;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("freight")
  public Double getFreight() {
    return freight;
  }
  public void setFreight(Double freight) {
    this.freight = freight;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("giftMessage")
  public String getGiftMessage() {
    return giftMessage;
  }
  public void setGiftMessage(String giftMessage) {
    this.giftMessage = giftMessage;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("groupOrderId")
  public Double getGroupOrderId() {
    return groupOrderId;
  }
  public void setGroupOrderId(Double groupOrderId) {
    this.groupOrderId = groupOrderId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("holdCode")
  public String getHoldCode() {
    return holdCode;
  }
  public void setHoldCode(String holdCode) {
    this.holdCode = holdCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("integrationPartnerId")
  public Integer getIntegrationPartnerId() {
    return integrationPartnerId;
  }
  public void setIntegrationPartnerId(Integer integrationPartnerId) {
    this.integrationPartnerId = integrationPartnerId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numberOfLineItems")
  public Integer getNumberOfLineItems() {
    return numberOfLineItems;
  }
  public void setNumberOfLineItems(Integer numberOfLineItems) {
    this.numberOfLineItems = numberOfLineItems;
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("omsOrderId")
  public Integer getOmsOrderId() {
    return omsOrderId;
  }
  public void setOmsOrderId(Integer omsOrderId) {
    this.omsOrderId = omsOrderId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("omsOrderNo")
  public Integer getOmsOrderNo() {
    return omsOrderNo;
  }
  public void setOmsOrderNo(Integer omsOrderNo) {
    this.omsOrderNo = omsOrderNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderLoadProgramId")
  public Integer getOrderLoadProgramId() {
    return orderLoadProgramId;
  }
  public void setOrderLoadProgramId(Integer orderLoadProgramId) {
    this.orderLoadProgramId = orderLoadProgramId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderMessage")
  public String getOrderMessage() {
    return orderMessage;
  }
  public void setOrderMessage(String orderMessage) {
    this.orderMessage = orderMessage;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderReason")
  public Integer getOrderReason() {
    return orderReason;
  }
  public void setOrderReason(Integer orderReason) {
    this.orderReason = orderReason;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderSourceId")
  public Integer getOrderSourceId() {
    return orderSourceId;
  }
  public void setOrderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("packingSlipTemplateId")
  public Integer getPackingSlipTemplateId() {
    return packingSlipTemplateId;
  }
  public void setPackingSlipTemplateId(Integer packingSlipTemplateId) {
    this.packingSlipTemplateId = packingSlipTemplateId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderConfirmationEmailTemplateId")
  public Integer getOrderConfirmationEmailTemplateId() {
    return orderConfirmationEmailTemplateId;
  }
  public void setOrderConfirmationEmailTemplateId(Integer orderConfirmationEmailTemplateId) {
    this.orderConfirmationEmailTemplateId = orderConfirmationEmailTemplateId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipmentConfirmationEmailTemplateId")
  public Integer getShipmentConfirmationEmailTemplateId() {
    return shipmentConfirmationEmailTemplateId;
  }
  public void setShipmentConfirmationEmailTemplateId(Integer shipmentConfirmationEmailTemplateId) {
    this.shipmentConfirmationEmailTemplateId = shipmentConfirmationEmailTemplateId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("priceLevel")
  public String getPriceLevel() {
    return priceLevel;
  }
  public void setPriceLevel(String priceLevel) {
    this.priceLevel = priceLevel;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("priorityCode")
  public Integer getPriorityCode() {
    return priorityCode;
  }
  public void setPriorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fulfillmentProcessId")
  public Integer getFulfillmentProcessId() {
    return fulfillmentProcessId;
  }
  public void setFulfillmentProcessId(Integer fulfillmentProcessId) {
    this.fulfillmentProcessId = fulfillmentProcessId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipBy")
  public Date getShipBy() {
    return shipBy;
  }
  public void setShipBy(Date shipBy) {
    this.shipBy = shipBy;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipCode")
  public String getShipCode() {
    return shipCode;
  }
  public void setShipCode(String shipCode) {
    this.shipCode = shipCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipDate")
  public Date getShipDate() {
    return shipDate;
  }
  public void setShipDate(Date shipDate) {
    this.shipDate = shipDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipToAttention")
  public String getShipToAttention() {
    return shipToAttention;
  }
  public void setShipToAttention(String shipToAttention) {
    this.shipToAttention = shipToAttention;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipToCompany")
  public String getShipToCompany() {
    return shipToCompany;
  }
  public void setShipToCompany(String shipToCompany) {
    this.shipToCompany = shipToCompany;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipToStreet")
  public String getShipToStreet() {
    return shipToStreet;
  }
  public void setShipToStreet(String shipToStreet) {
    this.shipToStreet = shipToStreet;
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
  @JsonProperty("shipToStreet3")
  public String getShipToStreet3() {
    return shipToStreet3;
  }
  public void setShipToStreet3(String shipToStreet3) {
    this.shipToStreet3 = shipToStreet3;
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
  @JsonProperty("shipToCountry")
  public String getShipToCountry() {
    return shipToCountry;
  }
  public void setShipToCountry(String shipToCountry) {
    this.shipToCountry = shipToCountry;
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
  @JsonProperty("shipToEmail")
  public String getShipToEmail() {
    return shipToEmail;
  }
  public void setShipToEmail(String shipToEmail) {
    this.shipToEmail = shipToEmail;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shippingCharge")
  public Double getShippingCharge() {
    return shippingCharge;
  }
  public void setShippingCharge(Double shippingCharge) {
    this.shippingCharge = shippingCharge;
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

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stopBackOrders")
  public String getStopBackOrders() {
    return stopBackOrders;
  }
  public void setStopBackOrders(String stopBackOrders) {
    this.stopBackOrders = stopBackOrders;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subtotal")
  public Double getSubtotal() {
    return subtotal;
  }
  public void setSubtotal(Double subtotal) {
    this.subtotal = subtotal;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tax")
  public Double getTax() {
    return tax;
  }
  public void setTax(Double tax) {
    this.tax = tax;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("total")
  public Double getTotal() {
    return total;
  }
  public void setTotal(Double total) {
    this.total = total;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalPaid")
  public Double getTotalPaid() {
    return totalPaid;
  }
  public void setTotalPaid(Double totalPaid) {
    this.totalPaid = totalPaid;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalQty")
  public Integer getTotalQty() {
    return totalQty;
  }
  public void setTotalQty(Integer totalQty) {
    this.totalQty = totalQty;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("weightLbs")
  public Double getWeightLbs() {
    return weightLbs;
  }
  public void setWeightLbs(Double weightLbs) {
    this.weightLbs = weightLbs;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("lineItems")
  public List<OrderLine> getLineItems() {
    return lineItems;
  }
  public void setLineItems(List<OrderLine> lineItems) {
    this.lineItems = lineItems;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(orderNo, order.orderNo) &&
        Objects.equals(customerOrderNo, order.customerOrderNo) &&
        Objects.equals(lobId, order.lobId) &&
        Objects.equals(warehouseId, order.warehouseId) &&
        Objects.equals(orderDate, order.orderDate) &&
        Objects.equals(customerNo, order.customerNo) &&
        Objects.equals(firstShipDate, order.firstShipDate) &&
        Objects.equals(lastShipDate, order.lastShipDate) &&
        Objects.equals(deliverOnDate, order.deliverOnDate) &&
        Objects.equals(needByDate, order.needByDate) &&
        Objects.equals(carrierId, order.carrierId) &&
        Objects.equals(serviceTypeId, order.serviceTypeId) &&
        Objects.equals(shipVia, order.shipVia) &&
        Objects.equals(mediaCode, order.mediaCode) &&
        Objects.equals(legacyRestrictionType, order.legacyRestrictionType) &&
        Objects.equals(alcoholOrderType, order.alcoholOrderType) &&
        Objects.equals(alternateUsage, order.alternateUsage) &&
        Objects.equals(authorizationAmount, order.authorizationAmount) &&
        Objects.equals(authorizedBy, order.authorizedBy) &&
        Objects.equals(balanceDue, order.balanceDue) &&
        Objects.equals(batchNo, order.batchNo) &&
        Objects.equals(billToAttention, order.billToAttention) &&
        Objects.equals(billToCompany, order.billToCompany) &&
        Objects.equals(billToStreet, order.billToStreet) &&
        Objects.equals(billToStreet2, order.billToStreet2) &&
        Objects.equals(billToStreet3, order.billToStreet3) &&
        Objects.equals(billToCity, order.billToCity) &&
        Objects.equals(billToState, order.billToState) &&
        Objects.equals(billToZip, order.billToZip) &&
        Objects.equals(billToCountry, order.billToCountry) &&
        Objects.equals(billToPhone, order.billToPhone) &&
        Objects.equals(billToEmail, order.billToEmail) &&
        Objects.equals(numberOfCartons, order.numberOfCartons) &&
        Objects.equals(numberOfPallets, order.numberOfPallets) &&
        Objects.equals(completionStatus, order.completionStatus) &&
        Objects.equals(parcelAccountId, order.parcelAccountId) &&
        Objects.equals(costCenter, order.costCenter) &&
        Objects.equals(createDate, order.createDate) &&
        Objects.equals(customerPONo, order.customerPONo) &&
        Objects.equals(distributionChannel, order.distributionChannel) &&
        Objects.equals(distributionCharges, order.distributionCharges) &&
        Objects.equals(division, order.division) &&
        Objects.equals(enteredBy, order.enteredBy) &&
        Objects.equals(estimatedWeightLbs, order.estimatedWeightLbs) &&
        Objects.equals(freight, order.freight) &&
        Objects.equals(giftMessage, order.giftMessage) &&
        Objects.equals(groupOrderId, order.groupOrderId) &&
        Objects.equals(holdCode, order.holdCode) &&
        Objects.equals(integrationPartnerId, order.integrationPartnerId) &&
        Objects.equals(numberOfLineItems, order.numberOfLineItems) &&
        Objects.equals(modifyDate, order.modifyDate) &&
        Objects.equals(omsOrderId, order.omsOrderId) &&
        Objects.equals(omsOrderNo, order.omsOrderNo) &&
        Objects.equals(orderLoadProgramId, order.orderLoadProgramId) &&
        Objects.equals(orderMessage, order.orderMessage) &&
        Objects.equals(orderReason, order.orderReason) &&
        Objects.equals(orderSourceId, order.orderSourceId) &&
        Objects.equals(packingSlipTemplateId, order.packingSlipTemplateId) &&
        Objects.equals(orderConfirmationEmailTemplateId, order.orderConfirmationEmailTemplateId) &&
        Objects.equals(shipmentConfirmationEmailTemplateId, order.shipmentConfirmationEmailTemplateId) &&
        Objects.equals(priceLevel, order.priceLevel) &&
        Objects.equals(priorityCode, order.priorityCode) &&
        Objects.equals(fulfillmentProcessId, order.fulfillmentProcessId) &&
        Objects.equals(shipBy, order.shipBy) &&
        Objects.equals(shipCode, order.shipCode) &&
        Objects.equals(shipDate, order.shipDate) &&
        Objects.equals(shipToAttention, order.shipToAttention) &&
        Objects.equals(shipToCompany, order.shipToCompany) &&
        Objects.equals(shipToStreet, order.shipToStreet) &&
        Objects.equals(shipToStreet2, order.shipToStreet2) &&
        Objects.equals(shipToStreet3, order.shipToStreet3) &&
        Objects.equals(shipToCity, order.shipToCity) &&
        Objects.equals(shipToState, order.shipToState) &&
        Objects.equals(shipToZip, order.shipToZip) &&
        Objects.equals(shipToCountry, order.shipToCountry) &&
        Objects.equals(shipToPhone, order.shipToPhone) &&
        Objects.equals(shipToEmail, order.shipToEmail) &&
        Objects.equals(shippingCharge, order.shippingCharge) &&
        Objects.equals(status, order.status) &&
        Objects.equals(stopBackOrders, order.stopBackOrders) &&
        Objects.equals(subtotal, order.subtotal) &&
        Objects.equals(tax, order.tax) &&
        Objects.equals(total, order.total) &&
        Objects.equals(totalPaid, order.totalPaid) &&
        Objects.equals(totalQty, order.totalQty) &&
        Objects.equals(weightLbs, order.weightLbs) &&
        Objects.equals(lineItems, order.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNo, customerOrderNo, lobId, warehouseId, orderDate, customerNo, firstShipDate, lastShipDate, deliverOnDate, needByDate, carrierId, serviceTypeId, shipVia, mediaCode, legacyRestrictionType, alcoholOrderType, alternateUsage, authorizationAmount, authorizedBy, balanceDue, batchNo, billToAttention, billToCompany, billToStreet, billToStreet2, billToStreet3, billToCity, billToState, billToZip, billToCountry, billToPhone, billToEmail, numberOfCartons, numberOfPallets, completionStatus, parcelAccountId, costCenter, createDate, customerPONo, distributionChannel, distributionCharges, division, enteredBy, estimatedWeightLbs, freight, giftMessage, groupOrderId, holdCode, integrationPartnerId, numberOfLineItems, modifyDate, omsOrderId, omsOrderNo, orderLoadProgramId, orderMessage, orderReason, orderSourceId, packingSlipTemplateId, orderConfirmationEmailTemplateId, shipmentConfirmationEmailTemplateId, priceLevel, priorityCode, fulfillmentProcessId, shipBy, shipCode, shipDate, shipToAttention, shipToCompany, shipToStreet, shipToStreet2, shipToStreet3, shipToCity, shipToState, shipToZip, shipToCountry, shipToPhone, shipToEmail, shippingCharge, status, stopBackOrders, subtotal, tax, total, totalPaid, totalQty, weightLbs, lineItems);
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
    sb.append("    omsOrderId: ").append(toIndentedString(omsOrderId)).append("\n");
    sb.append("    omsOrderNo: ").append(toIndentedString(omsOrderNo)).append("\n");
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

