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
public class PerpetualInventoryLog   {
  
  private Integer id = null;
  private Integer itemReceiptLocationId = null;
  private Integer itemReceiptId = null;
  private Integer skuId = null;
  private Integer asnId = null;
  private Integer lobId = null;
  private String legacyPoNo = null;
  private Integer warehouseId = null;
  private Integer currentQuantity = null;
  private String address = null;
  private Integer warehouseLocationId = null;
  private String locationStatus = null;
  private Date orderDate = null;
  private String receiptStatus = null;
  private BigDecimal factCost = null;
  private BigDecimal mlCost = null;
  private String sku = null;
  private Integer orderQuantity = null;
  private Date requestedDeliveryDate = null;
  private String unitCode = null;
  private String wrapCode = null;
  private Integer unitsPerWrap = null;
  private BigDecimal cost = null;
  private BigDecimal sell = null;
  private String pricingPer = null;
  private BigDecimal maxFreight = null;
  private String chargeFreight = null;
  private BigDecimal maxOther = null;
  private Date distDate = null;
  private Date voidDate = null;
  private String freezeAction = null;
  private String revDate = null;
  private String artBack = null;
  private String origin = null;
  private Integer sample = null;
  private String sampleTo = null;
  private Integer maxOvers = null;
  private Integer maxUnders = null;
  private Integer receivedSfp = null;
  private String budgetCode = null;
  private String accountingCode = null;
  private String taxExempt = null;
  private String capitalize = null;
  private String accrual = null;
  private Integer oddQuantity = null;
  private BigDecimal freightCost = null;
  private Date receivedDate = null;
  private Integer receivedQuantity = null;
  private Integer fromProd = null;
  private String sfpComplete = null;
  private Integer endQuantity = null;
  private BigDecimal endVal = null;
  private BigDecimal endFact = null;
  private Integer interimQuantity = null;
  private BigDecimal interimVal = null;
  private BigDecimal interimFact = null;
  private Date lastAct = null;
  private BigDecimal weightPerWrap = null;
  private String norcs = null;
  private Integer vendorId = null;
  private Integer bsVendor = null;
  private Integer mlVendor = null;
  private Integer receiptNo = null;
  private String paidFull = null;
  private String enteredBy = null;
  private String receivedBy = null;
  private Integer lineNo = null;
  private String prodLot = null;
  private String productIdTag = null;
  private Integer unitsPerCase = null;
  private BigDecimal caseWeight = null;
  private BigDecimal height = null;
  private BigDecimal width = null;
  private BigDecimal length = null;
  private Date dockDate = null;
  private Integer impressions = null;
  private Integer asnLine = null;
  private Date updatedAt = null;
  private String itemForwardLotMixingRule = null;
  private String itemStorageLotMixingRule = null;
  private String itemForwardItemMixingRule = null;
  private String itemStorageItemMixingRule = null;
  private String itemAllocationRule = null;
  private String itemBarcodeField = null;
  private String itemWarehouseDisplayField = null;
  private Integer itemProductIdTagSchemeId = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemReceiptLocationId")
  public Integer getItemReceiptLocationId() {
    return itemReceiptLocationId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemReceiptId")
  public Integer getItemReceiptId() {
    return itemReceiptId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skuId")
  public Integer getSkuId() {
    return skuId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("asnId")
  public Integer getAsnId() {
    return asnId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }

  
  /**
   **/
  public PerpetualInventoryLog legacyPoNo(String legacyPoNo) {
    this.legacyPoNo = legacyPoNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("legacyPoNo")
  public String getLegacyPoNo() {
    return legacyPoNo;
  }
  public void setLegacyPoNo(String legacyPoNo) {
    this.legacyPoNo = legacyPoNo;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("currentQuantity")
  public Integer getCurrentQuantity() {
    return currentQuantity;
  }

  
  /**
   **/
  public PerpetualInventoryLog address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationId")
  public Integer getWarehouseLocationId() {
    return warehouseLocationId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("locationStatus")
  public String getLocationStatus() {
    return locationStatus;
  }

  
  /**
   **/
  public PerpetualInventoryLog orderDate(Date orderDate) {
    this.orderDate = orderDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderDate")
  public Date getOrderDate() {
    return orderDate;
  }
  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  
  /**
   **/
  public PerpetualInventoryLog receiptStatus(String receiptStatus) {
    this.receiptStatus = receiptStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiptStatus")
  public String getReceiptStatus() {
    return receiptStatus;
  }
  public void setReceiptStatus(String receiptStatus) {
    this.receiptStatus = receiptStatus;
  }

  
  /**
   **/
  public PerpetualInventoryLog factCost(BigDecimal factCost) {
    this.factCost = factCost;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factCost")
  public BigDecimal getFactCost() {
    return factCost;
  }
  public void setFactCost(BigDecimal factCost) {
    this.factCost = factCost;
  }

  
  /**
   **/
  public PerpetualInventoryLog mlCost(BigDecimal mlCost) {
    this.mlCost = mlCost;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mlCost")
  public BigDecimal getMlCost() {
    return mlCost;
  }
  public void setMlCost(BigDecimal mlCost) {
    this.mlCost = mlCost;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }

  
  /**
   **/
  public PerpetualInventoryLog orderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderQuantity")
  public Integer getOrderQuantity() {
    return orderQuantity;
  }
  public void setOrderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
  }

  
  /**
   **/
  public PerpetualInventoryLog requestedDeliveryDate(Date requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requestedDeliveryDate")
  public Date getRequestedDeliveryDate() {
    return requestedDeliveryDate;
  }
  public void setRequestedDeliveryDate(Date requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
  }

  
  /**
   **/
  public PerpetualInventoryLog unitCode(String unitCode) {
    this.unitCode = unitCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unitCode")
  public String getUnitCode() {
    return unitCode;
  }
  public void setUnitCode(String unitCode) {
    this.unitCode = unitCode;
  }

  
  /**
   **/
  public PerpetualInventoryLog wrapCode(String wrapCode) {
    this.wrapCode = wrapCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapCode")
  public String getWrapCode() {
    return wrapCode;
  }
  public void setWrapCode(String wrapCode) {
    this.wrapCode = wrapCode;
  }

  
  /**
   **/
  public PerpetualInventoryLog unitsPerWrap(Integer unitsPerWrap) {
    this.unitsPerWrap = unitsPerWrap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unitsPerWrap")
  public Integer getUnitsPerWrap() {
    return unitsPerWrap;
  }
  public void setUnitsPerWrap(Integer unitsPerWrap) {
    this.unitsPerWrap = unitsPerWrap;
  }

  
  /**
   **/
  public PerpetualInventoryLog cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cost")
  public BigDecimal getCost() {
    return cost;
  }
  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  
  /**
   **/
  public PerpetualInventoryLog sell(BigDecimal sell) {
    this.sell = sell;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sell")
  public BigDecimal getSell() {
    return sell;
  }
  public void setSell(BigDecimal sell) {
    this.sell = sell;
  }

  
  /**
   **/
  public PerpetualInventoryLog pricingPer(String pricingPer) {
    this.pricingPer = pricingPer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pricingPer")
  public String getPricingPer() {
    return pricingPer;
  }
  public void setPricingPer(String pricingPer) {
    this.pricingPer = pricingPer;
  }

  
  /**
   **/
  public PerpetualInventoryLog maxFreight(BigDecimal maxFreight) {
    this.maxFreight = maxFreight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxFreight")
  public BigDecimal getMaxFreight() {
    return maxFreight;
  }
  public void setMaxFreight(BigDecimal maxFreight) {
    this.maxFreight = maxFreight;
  }

  
  /**
   **/
  public PerpetualInventoryLog chargeFreight(String chargeFreight) {
    this.chargeFreight = chargeFreight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chargeFreight")
  public String getChargeFreight() {
    return chargeFreight;
  }
  public void setChargeFreight(String chargeFreight) {
    this.chargeFreight = chargeFreight;
  }

  
  /**
   **/
  public PerpetualInventoryLog maxOther(BigDecimal maxOther) {
    this.maxOther = maxOther;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxOther")
  public BigDecimal getMaxOther() {
    return maxOther;
  }
  public void setMaxOther(BigDecimal maxOther) {
    this.maxOther = maxOther;
  }

  
  /**
   **/
  public PerpetualInventoryLog distDate(Date distDate) {
    this.distDate = distDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("distDate")
  public Date getDistDate() {
    return distDate;
  }
  public void setDistDate(Date distDate) {
    this.distDate = distDate;
  }

  
  /**
   **/
  public PerpetualInventoryLog voidDate(Date voidDate) {
    this.voidDate = voidDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("voidDate")
  public Date getVoidDate() {
    return voidDate;
  }
  public void setVoidDate(Date voidDate) {
    this.voidDate = voidDate;
  }

  
  /**
   **/
  public PerpetualInventoryLog freezeAction(String freezeAction) {
    this.freezeAction = freezeAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("freezeAction")
  public String getFreezeAction() {
    return freezeAction;
  }
  public void setFreezeAction(String freezeAction) {
    this.freezeAction = freezeAction;
  }

  
  /**
   **/
  public PerpetualInventoryLog revDate(String revDate) {
    this.revDate = revDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("revDate")
  public String getRevDate() {
    return revDate;
  }
  public void setRevDate(String revDate) {
    this.revDate = revDate;
  }

  
  /**
   **/
  public PerpetualInventoryLog artBack(String artBack) {
    this.artBack = artBack;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("artBack")
  public String getArtBack() {
    return artBack;
  }
  public void setArtBack(String artBack) {
    this.artBack = artBack;
  }

  
  /**
   **/
  public PerpetualInventoryLog origin(String origin) {
    this.origin = origin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("origin")
  public String getOrigin() {
    return origin;
  }
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  
  /**
   **/
  public PerpetualInventoryLog sample(Integer sample) {
    this.sample = sample;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sample")
  public Integer getSample() {
    return sample;
  }
  public void setSample(Integer sample) {
    this.sample = sample;
  }

  
  /**
   **/
  public PerpetualInventoryLog sampleTo(String sampleTo) {
    this.sampleTo = sampleTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sampleTo")
  public String getSampleTo() {
    return sampleTo;
  }
  public void setSampleTo(String sampleTo) {
    this.sampleTo = sampleTo;
  }

  
  /**
   **/
  public PerpetualInventoryLog maxOvers(Integer maxOvers) {
    this.maxOvers = maxOvers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxOvers")
  public Integer getMaxOvers() {
    return maxOvers;
  }
  public void setMaxOvers(Integer maxOvers) {
    this.maxOvers = maxOvers;
  }

  
  /**
   **/
  public PerpetualInventoryLog maxUnders(Integer maxUnders) {
    this.maxUnders = maxUnders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxUnders")
  public Integer getMaxUnders() {
    return maxUnders;
  }
  public void setMaxUnders(Integer maxUnders) {
    this.maxUnders = maxUnders;
  }

  
  /**
   **/
  public PerpetualInventoryLog receivedSfp(Integer receivedSfp) {
    this.receivedSfp = receivedSfp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receivedSfp")
  public Integer getReceivedSfp() {
    return receivedSfp;
  }
  public void setReceivedSfp(Integer receivedSfp) {
    this.receivedSfp = receivedSfp;
  }

  
  /**
   **/
  public PerpetualInventoryLog budgetCode(String budgetCode) {
    this.budgetCode = budgetCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("budgetCode")
  public String getBudgetCode() {
    return budgetCode;
  }
  public void setBudgetCode(String budgetCode) {
    this.budgetCode = budgetCode;
  }

  
  /**
   **/
  public PerpetualInventoryLog accountingCode(String accountingCode) {
    this.accountingCode = accountingCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("accountingCode")
  public String getAccountingCode() {
    return accountingCode;
  }
  public void setAccountingCode(String accountingCode) {
    this.accountingCode = accountingCode;
  }

  
  /**
   **/
  public PerpetualInventoryLog taxExempt(String taxExempt) {
    this.taxExempt = taxExempt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("taxExempt")
  public String getTaxExempt() {
    return taxExempt;
  }
  public void setTaxExempt(String taxExempt) {
    this.taxExempt = taxExempt;
  }

  
  /**
   **/
  public PerpetualInventoryLog capitalize(String capitalize) {
    this.capitalize = capitalize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("capitalize")
  public String getCapitalize() {
    return capitalize;
  }
  public void setCapitalize(String capitalize) {
    this.capitalize = capitalize;
  }

  
  /**
   **/
  public PerpetualInventoryLog accrual(String accrual) {
    this.accrual = accrual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("accrual")
  public String getAccrual() {
    return accrual;
  }
  public void setAccrual(String accrual) {
    this.accrual = accrual;
  }

  
  /**
   **/
  public PerpetualInventoryLog oddQuantity(Integer oddQuantity) {
    this.oddQuantity = oddQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("oddQuantity")
  public Integer getOddQuantity() {
    return oddQuantity;
  }
  public void setOddQuantity(Integer oddQuantity) {
    this.oddQuantity = oddQuantity;
  }

  
  /**
   **/
  public PerpetualInventoryLog freightCost(BigDecimal freightCost) {
    this.freightCost = freightCost;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("freightCost")
  public BigDecimal getFreightCost() {
    return freightCost;
  }
  public void setFreightCost(BigDecimal freightCost) {
    this.freightCost = freightCost;
  }

  
  /**
   **/
  public PerpetualInventoryLog receivedDate(Date receivedDate) {
    this.receivedDate = receivedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receivedDate")
  public Date getReceivedDate() {
    return receivedDate;
  }
  public void setReceivedDate(Date receivedDate) {
    this.receivedDate = receivedDate;
  }

  
  /**
   **/
  public PerpetualInventoryLog receivedQuantity(Integer receivedQuantity) {
    this.receivedQuantity = receivedQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receivedQuantity")
  public Integer getReceivedQuantity() {
    return receivedQuantity;
  }
  public void setReceivedQuantity(Integer receivedQuantity) {
    this.receivedQuantity = receivedQuantity;
  }

  
  /**
   **/
  public PerpetualInventoryLog fromProd(Integer fromProd) {
    this.fromProd = fromProd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fromProd")
  public Integer getFromProd() {
    return fromProd;
  }
  public void setFromProd(Integer fromProd) {
    this.fromProd = fromProd;
  }

  
  /**
   **/
  public PerpetualInventoryLog sfpComplete(String sfpComplete) {
    this.sfpComplete = sfpComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sfpComplete")
  public String getSfpComplete() {
    return sfpComplete;
  }
  public void setSfpComplete(String sfpComplete) {
    this.sfpComplete = sfpComplete;
  }

  
  /**
   **/
  public PerpetualInventoryLog endQuantity(Integer endQuantity) {
    this.endQuantity = endQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endQuantity")
  public Integer getEndQuantity() {
    return endQuantity;
  }
  public void setEndQuantity(Integer endQuantity) {
    this.endQuantity = endQuantity;
  }

  
  /**
   **/
  public PerpetualInventoryLog endVal(BigDecimal endVal) {
    this.endVal = endVal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endVal")
  public BigDecimal getEndVal() {
    return endVal;
  }
  public void setEndVal(BigDecimal endVal) {
    this.endVal = endVal;
  }

  
  /**
   **/
  public PerpetualInventoryLog endFact(BigDecimal endFact) {
    this.endFact = endFact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endFact")
  public BigDecimal getEndFact() {
    return endFact;
  }
  public void setEndFact(BigDecimal endFact) {
    this.endFact = endFact;
  }

  
  /**
   **/
  public PerpetualInventoryLog interimQuantity(Integer interimQuantity) {
    this.interimQuantity = interimQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interimQuantity")
  public Integer getInterimQuantity() {
    return interimQuantity;
  }
  public void setInterimQuantity(Integer interimQuantity) {
    this.interimQuantity = interimQuantity;
  }

  
  /**
   **/
  public PerpetualInventoryLog interimVal(BigDecimal interimVal) {
    this.interimVal = interimVal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interimVal")
  public BigDecimal getInterimVal() {
    return interimVal;
  }
  public void setInterimVal(BigDecimal interimVal) {
    this.interimVal = interimVal;
  }

  
  /**
   **/
  public PerpetualInventoryLog interimFact(BigDecimal interimFact) {
    this.interimFact = interimFact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interimFact")
  public BigDecimal getInterimFact() {
    return interimFact;
  }
  public void setInterimFact(BigDecimal interimFact) {
    this.interimFact = interimFact;
  }

  
  /**
   **/
  public PerpetualInventoryLog lastAct(Date lastAct) {
    this.lastAct = lastAct;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastAct")
  public Date getLastAct() {
    return lastAct;
  }
  public void setLastAct(Date lastAct) {
    this.lastAct = lastAct;
  }

  
  /**
   **/
  public PerpetualInventoryLog weightPerWrap(BigDecimal weightPerWrap) {
    this.weightPerWrap = weightPerWrap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weightPerWrap")
  public BigDecimal getWeightPerWrap() {
    return weightPerWrap;
  }
  public void setWeightPerWrap(BigDecimal weightPerWrap) {
    this.weightPerWrap = weightPerWrap;
  }

  
  /**
   **/
  public PerpetualInventoryLog norcs(String norcs) {
    this.norcs = norcs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("norcs")
  public String getNorcs() {
    return norcs;
  }
  public void setNorcs(String norcs) {
    this.norcs = norcs;
  }

  
  /**
   **/
  public PerpetualInventoryLog vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorId")
  public Integer getVendorId() {
    return vendorId;
  }
  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }

  
  /**
   **/
  public PerpetualInventoryLog bsVendor(Integer bsVendor) {
    this.bsVendor = bsVendor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bsVendor")
  public Integer getBsVendor() {
    return bsVendor;
  }
  public void setBsVendor(Integer bsVendor) {
    this.bsVendor = bsVendor;
  }

  
  /**
   **/
  public PerpetualInventoryLog mlVendor(Integer mlVendor) {
    this.mlVendor = mlVendor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mlVendor")
  public Integer getMlVendor() {
    return mlVendor;
  }
  public void setMlVendor(Integer mlVendor) {
    this.mlVendor = mlVendor;
  }

  
  /**
   **/
  public PerpetualInventoryLog receiptNo(Integer receiptNo) {
    this.receiptNo = receiptNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiptNo")
  public Integer getReceiptNo() {
    return receiptNo;
  }
  public void setReceiptNo(Integer receiptNo) {
    this.receiptNo = receiptNo;
  }

  
  /**
   **/
  public PerpetualInventoryLog paidFull(String paidFull) {
    this.paidFull = paidFull;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("paidFull")
  public String getPaidFull() {
    return paidFull;
  }
  public void setPaidFull(String paidFull) {
    this.paidFull = paidFull;
  }

  
  /**
   **/
  public PerpetualInventoryLog enteredBy(String enteredBy) {
    this.enteredBy = enteredBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enteredBy")
  public String getEnteredBy() {
    return enteredBy;
  }
  public void setEnteredBy(String enteredBy) {
    this.enteredBy = enteredBy;
  }

  
  /**
   **/
  public PerpetualInventoryLog receivedBy(String receivedBy) {
    this.receivedBy = receivedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receivedBy")
  public String getReceivedBy() {
    return receivedBy;
  }
  public void setReceivedBy(String receivedBy) {
    this.receivedBy = receivedBy;
  }

  
  /**
   **/
  public PerpetualInventoryLog lineNo(Integer lineNo) {
    this.lineNo = lineNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lineNo")
  public Integer getLineNo() {
    return lineNo;
  }
  public void setLineNo(Integer lineNo) {
    this.lineNo = lineNo;
  }

  
  /**
   **/
  public PerpetualInventoryLog prodLot(String prodLot) {
    this.prodLot = prodLot;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("prodLot")
  public String getProdLot() {
    return prodLot;
  }
  public void setProdLot(String prodLot) {
    this.prodLot = prodLot;
  }

  
  /**
   **/
  public PerpetualInventoryLog productIdTag(String productIdTag) {
    this.productIdTag = productIdTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("productIdTag")
  public String getProductIdTag() {
    return productIdTag;
  }
  public void setProductIdTag(String productIdTag) {
    this.productIdTag = productIdTag;
  }

  
  /**
   **/
  public PerpetualInventoryLog unitsPerCase(Integer unitsPerCase) {
    this.unitsPerCase = unitsPerCase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unitsPerCase")
  public Integer getUnitsPerCase() {
    return unitsPerCase;
  }
  public void setUnitsPerCase(Integer unitsPerCase) {
    this.unitsPerCase = unitsPerCase;
  }

  
  /**
   **/
  public PerpetualInventoryLog caseWeight(BigDecimal caseWeight) {
    this.caseWeight = caseWeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("caseWeight")
  public BigDecimal getCaseWeight() {
    return caseWeight;
  }
  public void setCaseWeight(BigDecimal caseWeight) {
    this.caseWeight = caseWeight;
  }

  
  /**
   **/
  public PerpetualInventoryLog height(BigDecimal height) {
    this.height = height;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("height")
  public BigDecimal getHeight() {
    return height;
  }
  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  
  /**
   **/
  public PerpetualInventoryLog width(BigDecimal width) {
    this.width = width;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("width")
  public BigDecimal getWidth() {
    return width;
  }
  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  
  /**
   **/
  public PerpetualInventoryLog length(BigDecimal length) {
    this.length = length;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("length")
  public BigDecimal getLength() {
    return length;
  }
  public void setLength(BigDecimal length) {
    this.length = length;
  }

  
  /**
   **/
  public PerpetualInventoryLog dockDate(Date dockDate) {
    this.dockDate = dockDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dockDate")
  public Date getDockDate() {
    return dockDate;
  }
  public void setDockDate(Date dockDate) {
    this.dockDate = dockDate;
  }

  
  /**
   **/
  public PerpetualInventoryLog impressions(Integer impressions) {
    this.impressions = impressions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("impressions")
  public Integer getImpressions() {
    return impressions;
  }
  public void setImpressions(Integer impressions) {
    this.impressions = impressions;
  }

  
  /**
   **/
  public PerpetualInventoryLog asnLine(Integer asnLine) {
    this.asnLine = asnLine;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("asnLine")
  public Integer getAsnLine() {
    return asnLine;
  }
  public void setAsnLine(Integer asnLine) {
    this.asnLine = asnLine;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("itemForwardLotMixingRule")
  public String getItemForwardLotMixingRule() {
    return itemForwardLotMixingRule;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("itemStorageLotMixingRule")
  public String getItemStorageLotMixingRule() {
    return itemStorageLotMixingRule;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("itemForwardItemMixingRule")
  public String getItemForwardItemMixingRule() {
    return itemForwardItemMixingRule;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("itemStorageItemMixingRule")
  public String getItemStorageItemMixingRule() {
    return itemStorageItemMixingRule;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("itemAllocationRule")
  public String getItemAllocationRule() {
    return itemAllocationRule;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemBarcodeField")
  public String getItemBarcodeField() {
    return itemBarcodeField;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemWarehouseDisplayField")
  public String getItemWarehouseDisplayField() {
    return itemWarehouseDisplayField;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemProductIdTagSchemeId")
  public Integer getItemProductIdTagSchemeId() {
    return itemProductIdTagSchemeId;
  }

  
  /**
   **/
  public PerpetualInventoryLog customFields(Map<String, Object> customFields) {
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
    PerpetualInventoryLog perpetualInventoryLog = (PerpetualInventoryLog) o;
    return Objects.equals(this.id, perpetualInventoryLog.id) &&
        Objects.equals(this.itemReceiptLocationId, perpetualInventoryLog.itemReceiptLocationId) &&
        Objects.equals(this.itemReceiptId, perpetualInventoryLog.itemReceiptId) &&
        Objects.equals(this.skuId, perpetualInventoryLog.skuId) &&
        Objects.equals(this.asnId, perpetualInventoryLog.asnId) &&
        Objects.equals(this.lobId, perpetualInventoryLog.lobId) &&
        Objects.equals(this.legacyPoNo, perpetualInventoryLog.legacyPoNo) &&
        Objects.equals(this.warehouseId, perpetualInventoryLog.warehouseId) &&
        Objects.equals(this.currentQuantity, perpetualInventoryLog.currentQuantity) &&
        Objects.equals(this.address, perpetualInventoryLog.address) &&
        Objects.equals(this.warehouseLocationId, perpetualInventoryLog.warehouseLocationId) &&
        Objects.equals(this.locationStatus, perpetualInventoryLog.locationStatus) &&
        Objects.equals(this.orderDate, perpetualInventoryLog.orderDate) &&
        Objects.equals(this.receiptStatus, perpetualInventoryLog.receiptStatus) &&
        Objects.equals(this.factCost, perpetualInventoryLog.factCost) &&
        Objects.equals(this.mlCost, perpetualInventoryLog.mlCost) &&
        Objects.equals(this.sku, perpetualInventoryLog.sku) &&
        Objects.equals(this.orderQuantity, perpetualInventoryLog.orderQuantity) &&
        Objects.equals(this.requestedDeliveryDate, perpetualInventoryLog.requestedDeliveryDate) &&
        Objects.equals(this.unitCode, perpetualInventoryLog.unitCode) &&
        Objects.equals(this.wrapCode, perpetualInventoryLog.wrapCode) &&
        Objects.equals(this.unitsPerWrap, perpetualInventoryLog.unitsPerWrap) &&
        Objects.equals(this.cost, perpetualInventoryLog.cost) &&
        Objects.equals(this.sell, perpetualInventoryLog.sell) &&
        Objects.equals(this.pricingPer, perpetualInventoryLog.pricingPer) &&
        Objects.equals(this.maxFreight, perpetualInventoryLog.maxFreight) &&
        Objects.equals(this.chargeFreight, perpetualInventoryLog.chargeFreight) &&
        Objects.equals(this.maxOther, perpetualInventoryLog.maxOther) &&
        Objects.equals(this.distDate, perpetualInventoryLog.distDate) &&
        Objects.equals(this.voidDate, perpetualInventoryLog.voidDate) &&
        Objects.equals(this.freezeAction, perpetualInventoryLog.freezeAction) &&
        Objects.equals(this.revDate, perpetualInventoryLog.revDate) &&
        Objects.equals(this.artBack, perpetualInventoryLog.artBack) &&
        Objects.equals(this.origin, perpetualInventoryLog.origin) &&
        Objects.equals(this.sample, perpetualInventoryLog.sample) &&
        Objects.equals(this.sampleTo, perpetualInventoryLog.sampleTo) &&
        Objects.equals(this.maxOvers, perpetualInventoryLog.maxOvers) &&
        Objects.equals(this.maxUnders, perpetualInventoryLog.maxUnders) &&
        Objects.equals(this.receivedSfp, perpetualInventoryLog.receivedSfp) &&
        Objects.equals(this.budgetCode, perpetualInventoryLog.budgetCode) &&
        Objects.equals(this.accountingCode, perpetualInventoryLog.accountingCode) &&
        Objects.equals(this.taxExempt, perpetualInventoryLog.taxExempt) &&
        Objects.equals(this.capitalize, perpetualInventoryLog.capitalize) &&
        Objects.equals(this.accrual, perpetualInventoryLog.accrual) &&
        Objects.equals(this.oddQuantity, perpetualInventoryLog.oddQuantity) &&
        Objects.equals(this.freightCost, perpetualInventoryLog.freightCost) &&
        Objects.equals(this.receivedDate, perpetualInventoryLog.receivedDate) &&
        Objects.equals(this.receivedQuantity, perpetualInventoryLog.receivedQuantity) &&
        Objects.equals(this.fromProd, perpetualInventoryLog.fromProd) &&
        Objects.equals(this.sfpComplete, perpetualInventoryLog.sfpComplete) &&
        Objects.equals(this.endQuantity, perpetualInventoryLog.endQuantity) &&
        Objects.equals(this.endVal, perpetualInventoryLog.endVal) &&
        Objects.equals(this.endFact, perpetualInventoryLog.endFact) &&
        Objects.equals(this.interimQuantity, perpetualInventoryLog.interimQuantity) &&
        Objects.equals(this.interimVal, perpetualInventoryLog.interimVal) &&
        Objects.equals(this.interimFact, perpetualInventoryLog.interimFact) &&
        Objects.equals(this.lastAct, perpetualInventoryLog.lastAct) &&
        Objects.equals(this.weightPerWrap, perpetualInventoryLog.weightPerWrap) &&
        Objects.equals(this.norcs, perpetualInventoryLog.norcs) &&
        Objects.equals(this.vendorId, perpetualInventoryLog.vendorId) &&
        Objects.equals(this.bsVendor, perpetualInventoryLog.bsVendor) &&
        Objects.equals(this.mlVendor, perpetualInventoryLog.mlVendor) &&
        Objects.equals(this.receiptNo, perpetualInventoryLog.receiptNo) &&
        Objects.equals(this.paidFull, perpetualInventoryLog.paidFull) &&
        Objects.equals(this.enteredBy, perpetualInventoryLog.enteredBy) &&
        Objects.equals(this.receivedBy, perpetualInventoryLog.receivedBy) &&
        Objects.equals(this.lineNo, perpetualInventoryLog.lineNo) &&
        Objects.equals(this.prodLot, perpetualInventoryLog.prodLot) &&
        Objects.equals(this.productIdTag, perpetualInventoryLog.productIdTag) &&
        Objects.equals(this.unitsPerCase, perpetualInventoryLog.unitsPerCase) &&
        Objects.equals(this.caseWeight, perpetualInventoryLog.caseWeight) &&
        Objects.equals(this.height, perpetualInventoryLog.height) &&
        Objects.equals(this.width, perpetualInventoryLog.width) &&
        Objects.equals(this.length, perpetualInventoryLog.length) &&
        Objects.equals(this.dockDate, perpetualInventoryLog.dockDate) &&
        Objects.equals(this.impressions, perpetualInventoryLog.impressions) &&
        Objects.equals(this.asnLine, perpetualInventoryLog.asnLine) &&
        Objects.equals(this.updatedAt, perpetualInventoryLog.updatedAt) &&
        Objects.equals(this.itemForwardLotMixingRule, perpetualInventoryLog.itemForwardLotMixingRule) &&
        Objects.equals(this.itemStorageLotMixingRule, perpetualInventoryLog.itemStorageLotMixingRule) &&
        Objects.equals(this.itemForwardItemMixingRule, perpetualInventoryLog.itemForwardItemMixingRule) &&
        Objects.equals(this.itemStorageItemMixingRule, perpetualInventoryLog.itemStorageItemMixingRule) &&
        Objects.equals(this.itemAllocationRule, perpetualInventoryLog.itemAllocationRule) &&
        Objects.equals(this.itemBarcodeField, perpetualInventoryLog.itemBarcodeField) &&
        Objects.equals(this.itemWarehouseDisplayField, perpetualInventoryLog.itemWarehouseDisplayField) &&
        Objects.equals(this.itemProductIdTagSchemeId, perpetualInventoryLog.itemProductIdTagSchemeId) &&
        Objects.equals(this.customFields, perpetualInventoryLog.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, itemReceiptLocationId, itemReceiptId, skuId, asnId, lobId, legacyPoNo, warehouseId, currentQuantity, address, warehouseLocationId, locationStatus, orderDate, receiptStatus, factCost, mlCost, sku, orderQuantity, requestedDeliveryDate, unitCode, wrapCode, unitsPerWrap, cost, sell, pricingPer, maxFreight, chargeFreight, maxOther, distDate, voidDate, freezeAction, revDate, artBack, origin, sample, sampleTo, maxOvers, maxUnders, receivedSfp, budgetCode, accountingCode, taxExempt, capitalize, accrual, oddQuantity, freightCost, receivedDate, receivedQuantity, fromProd, sfpComplete, endQuantity, endVal, endFact, interimQuantity, interimVal, interimFact, lastAct, weightPerWrap, norcs, vendorId, bsVendor, mlVendor, receiptNo, paidFull, enteredBy, receivedBy, lineNo, prodLot, productIdTag, unitsPerCase, caseWeight, height, width, length, dockDate, impressions, asnLine, updatedAt, itemForwardLotMixingRule, itemStorageLotMixingRule, itemForwardItemMixingRule, itemStorageItemMixingRule, itemAllocationRule, itemBarcodeField, itemWarehouseDisplayField, itemProductIdTagSchemeId, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerpetualInventoryLog {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemReceiptLocationId: ").append(toIndentedString(itemReceiptLocationId)).append("\n");
    sb.append("    itemReceiptId: ").append(toIndentedString(itemReceiptId)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    asnId: ").append(toIndentedString(asnId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    legacyPoNo: ").append(toIndentedString(legacyPoNo)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    currentQuantity: ").append(toIndentedString(currentQuantity)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    warehouseLocationId: ").append(toIndentedString(warehouseLocationId)).append("\n");
    sb.append("    locationStatus: ").append(toIndentedString(locationStatus)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    receiptStatus: ").append(toIndentedString(receiptStatus)).append("\n");
    sb.append("    factCost: ").append(toIndentedString(factCost)).append("\n");
    sb.append("    mlCost: ").append(toIndentedString(mlCost)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    orderQuantity: ").append(toIndentedString(orderQuantity)).append("\n");
    sb.append("    requestedDeliveryDate: ").append(toIndentedString(requestedDeliveryDate)).append("\n");
    sb.append("    unitCode: ").append(toIndentedString(unitCode)).append("\n");
    sb.append("    wrapCode: ").append(toIndentedString(wrapCode)).append("\n");
    sb.append("    unitsPerWrap: ").append(toIndentedString(unitsPerWrap)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    sell: ").append(toIndentedString(sell)).append("\n");
    sb.append("    pricingPer: ").append(toIndentedString(pricingPer)).append("\n");
    sb.append("    maxFreight: ").append(toIndentedString(maxFreight)).append("\n");
    sb.append("    chargeFreight: ").append(toIndentedString(chargeFreight)).append("\n");
    sb.append("    maxOther: ").append(toIndentedString(maxOther)).append("\n");
    sb.append("    distDate: ").append(toIndentedString(distDate)).append("\n");
    sb.append("    voidDate: ").append(toIndentedString(voidDate)).append("\n");
    sb.append("    freezeAction: ").append(toIndentedString(freezeAction)).append("\n");
    sb.append("    revDate: ").append(toIndentedString(revDate)).append("\n");
    sb.append("    artBack: ").append(toIndentedString(artBack)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
    sb.append("    sampleTo: ").append(toIndentedString(sampleTo)).append("\n");
    sb.append("    maxOvers: ").append(toIndentedString(maxOvers)).append("\n");
    sb.append("    maxUnders: ").append(toIndentedString(maxUnders)).append("\n");
    sb.append("    receivedSfp: ").append(toIndentedString(receivedSfp)).append("\n");
    sb.append("    budgetCode: ").append(toIndentedString(budgetCode)).append("\n");
    sb.append("    accountingCode: ").append(toIndentedString(accountingCode)).append("\n");
    sb.append("    taxExempt: ").append(toIndentedString(taxExempt)).append("\n");
    sb.append("    capitalize: ").append(toIndentedString(capitalize)).append("\n");
    sb.append("    accrual: ").append(toIndentedString(accrual)).append("\n");
    sb.append("    oddQuantity: ").append(toIndentedString(oddQuantity)).append("\n");
    sb.append("    freightCost: ").append(toIndentedString(freightCost)).append("\n");
    sb.append("    receivedDate: ").append(toIndentedString(receivedDate)).append("\n");
    sb.append("    receivedQuantity: ").append(toIndentedString(receivedQuantity)).append("\n");
    sb.append("    fromProd: ").append(toIndentedString(fromProd)).append("\n");
    sb.append("    sfpComplete: ").append(toIndentedString(sfpComplete)).append("\n");
    sb.append("    endQuantity: ").append(toIndentedString(endQuantity)).append("\n");
    sb.append("    endVal: ").append(toIndentedString(endVal)).append("\n");
    sb.append("    endFact: ").append(toIndentedString(endFact)).append("\n");
    sb.append("    interimQuantity: ").append(toIndentedString(interimQuantity)).append("\n");
    sb.append("    interimVal: ").append(toIndentedString(interimVal)).append("\n");
    sb.append("    interimFact: ").append(toIndentedString(interimFact)).append("\n");
    sb.append("    lastAct: ").append(toIndentedString(lastAct)).append("\n");
    sb.append("    weightPerWrap: ").append(toIndentedString(weightPerWrap)).append("\n");
    sb.append("    norcs: ").append(toIndentedString(norcs)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    bsVendor: ").append(toIndentedString(bsVendor)).append("\n");
    sb.append("    mlVendor: ").append(toIndentedString(mlVendor)).append("\n");
    sb.append("    receiptNo: ").append(toIndentedString(receiptNo)).append("\n");
    sb.append("    paidFull: ").append(toIndentedString(paidFull)).append("\n");
    sb.append("    enteredBy: ").append(toIndentedString(enteredBy)).append("\n");
    sb.append("    receivedBy: ").append(toIndentedString(receivedBy)).append("\n");
    sb.append("    lineNo: ").append(toIndentedString(lineNo)).append("\n");
    sb.append("    prodLot: ").append(toIndentedString(prodLot)).append("\n");
    sb.append("    productIdTag: ").append(toIndentedString(productIdTag)).append("\n");
    sb.append("    unitsPerCase: ").append(toIndentedString(unitsPerCase)).append("\n");
    sb.append("    caseWeight: ").append(toIndentedString(caseWeight)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    dockDate: ").append(toIndentedString(dockDate)).append("\n");
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
    sb.append("    asnLine: ").append(toIndentedString(asnLine)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    itemForwardLotMixingRule: ").append(toIndentedString(itemForwardLotMixingRule)).append("\n");
    sb.append("    itemStorageLotMixingRule: ").append(toIndentedString(itemStorageLotMixingRule)).append("\n");
    sb.append("    itemForwardItemMixingRule: ").append(toIndentedString(itemForwardItemMixingRule)).append("\n");
    sb.append("    itemStorageItemMixingRule: ").append(toIndentedString(itemStorageItemMixingRule)).append("\n");
    sb.append("    itemAllocationRule: ").append(toIndentedString(itemAllocationRule)).append("\n");
    sb.append("    itemBarcodeField: ").append(toIndentedString(itemBarcodeField)).append("\n");
    sb.append("    itemWarehouseDisplayField: ").append(toIndentedString(itemWarehouseDisplayField)).append("\n");
    sb.append("    itemProductIdTagSchemeId: ").append(toIndentedString(itemProductIdTagSchemeId)).append("\n");
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

