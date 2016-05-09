package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class ItemReceipt   {
  
  private Integer id = null;
  private String poNo = null;
  private Integer lobId = null;
  private String legacyPoNo = null;
  private Integer warehouseId = null;
  private Date orderDate = null;
  private Double factCost = null;
  private Double mlCost = null;
  private String sku = null;
  private Integer orderQuantity = null;
  private Date requestedDeliveryDate = null;
  private String unitCode = null;
  private String wrapCode = null;
  private Integer unitsPerWrap = null;
  private Double cost = null;
  private Double sell = null;
  private String pricingPer = null;
  private Double maxFreight = null;
  private String chargeFreight = null;
  private Double maxOther = null;
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
  private Double freightCost = null;
  private Date receivedDate = null;
  private Integer receivedQuantity = null;
  private Integer fromProd = null;
  private String sfpComplete = null;
  private Integer endQuantity = null;
  private Double endVal = null;
  private Double endFact = null;
  private Integer interimQuantity = null;
  private Double interimVal = null;
  private Double interimFact = null;
  private Date lastAct = null;
  private Double weightPerWrap = null;
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
  private Integer unitsPerCase = null;
  private Double caseWeight = null;
  private Double height = null;
  private Double width = null;
  private Double length = null;
  private Date dockTime = null;
  private Date modifyDate = null;
  private Integer impressions = null;
  private Integer asnLine = null;

  
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
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }
  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("legacyPoNo")
  public String getLegacyPoNo() {
    return legacyPoNo;
  }
  public void setLegacyPoNo(String legacyPoNo) {
    this.legacyPoNo = legacyPoNo;
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderDate")
  public Date getOrderDate() {
    return orderDate;
  }
  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("factCost")
  public Double getFactCost() {
    return factCost;
  }
  public void setFactCost(Double factCost) {
    this.factCost = factCost;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mlCost")
  public Double getMlCost() {
    return mlCost;
  }
  public void setMlCost(Double mlCost) {
    this.mlCost = mlCost;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("orderQuantity")
  public Integer getOrderQuantity() {
    return orderQuantity;
  }
  public void setOrderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("requestedDeliveryDate")
  public Date getRequestedDeliveryDate() {
    return requestedDeliveryDate;
  }
  public void setRequestedDeliveryDate(Date requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("unitCode")
  public String getUnitCode() {
    return unitCode;
  }
  public void setUnitCode(String unitCode) {
    this.unitCode = unitCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("wrapCode")
  public String getWrapCode() {
    return wrapCode;
  }
  public void setWrapCode(String wrapCode) {
    this.wrapCode = wrapCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("unitsPerWrap")
  public Integer getUnitsPerWrap() {
    return unitsPerWrap;
  }
  public void setUnitsPerWrap(Integer unitsPerWrap) {
    this.unitsPerWrap = unitsPerWrap;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cost")
  public Double getCost() {
    return cost;
  }
  public void setCost(Double cost) {
    this.cost = cost;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sell")
  public Double getSell() {
    return sell;
  }
  public void setSell(Double sell) {
    this.sell = sell;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pricingPer")
  public String getPricingPer() {
    return pricingPer;
  }
  public void setPricingPer(String pricingPer) {
    this.pricingPer = pricingPer;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxFreight")
  public Double getMaxFreight() {
    return maxFreight;
  }
  public void setMaxFreight(Double maxFreight) {
    this.maxFreight = maxFreight;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("chargeFreight")
  public String getChargeFreight() {
    return chargeFreight;
  }
  public void setChargeFreight(String chargeFreight) {
    this.chargeFreight = chargeFreight;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxOther")
  public Double getMaxOther() {
    return maxOther;
  }
  public void setMaxOther(Double maxOther) {
    this.maxOther = maxOther;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("distDate")
  public Date getDistDate() {
    return distDate;
  }
  public void setDistDate(Date distDate) {
    this.distDate = distDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("voidDate")
  public Date getVoidDate() {
    return voidDate;
  }
  public void setVoidDate(Date voidDate) {
    this.voidDate = voidDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("freezeAction")
  public String getFreezeAction() {
    return freezeAction;
  }
  public void setFreezeAction(String freezeAction) {
    this.freezeAction = freezeAction;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("revDate")
  public String getRevDate() {
    return revDate;
  }
  public void setRevDate(String revDate) {
    this.revDate = revDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("artBack")
  public String getArtBack() {
    return artBack;
  }
  public void setArtBack(String artBack) {
    this.artBack = artBack;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("origin")
  public String getOrigin() {
    return origin;
  }
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sample")
  public Integer getSample() {
    return sample;
  }
  public void setSample(Integer sample) {
    this.sample = sample;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sampleTo")
  public String getSampleTo() {
    return sampleTo;
  }
  public void setSampleTo(String sampleTo) {
    this.sampleTo = sampleTo;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("maxOvers")
  public Integer getMaxOvers() {
    return maxOvers;
  }
  public void setMaxOvers(Integer maxOvers) {
    this.maxOvers = maxOvers;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("maxUnders")
  public Integer getMaxUnders() {
    return maxUnders;
  }
  public void setMaxUnders(Integer maxUnders) {
    this.maxUnders = maxUnders;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("receivedSfp")
  public Integer getReceivedSfp() {
    return receivedSfp;
  }
  public void setReceivedSfp(Integer receivedSfp) {
    this.receivedSfp = receivedSfp;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("budgetCode")
  public String getBudgetCode() {
    return budgetCode;
  }
  public void setBudgetCode(String budgetCode) {
    this.budgetCode = budgetCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountingCode")
  public String getAccountingCode() {
    return accountingCode;
  }
  public void setAccountingCode(String accountingCode) {
    this.accountingCode = accountingCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("taxExempt")
  public String getTaxExempt() {
    return taxExempt;
  }
  public void setTaxExempt(String taxExempt) {
    this.taxExempt = taxExempt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("capitalize")
  public String getCapitalize() {
    return capitalize;
  }
  public void setCapitalize(String capitalize) {
    this.capitalize = capitalize;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accrual")
  public String getAccrual() {
    return accrual;
  }
  public void setAccrual(String accrual) {
    this.accrual = accrual;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oddQuantity")
  public Integer getOddQuantity() {
    return oddQuantity;
  }
  public void setOddQuantity(Integer oddQuantity) {
    this.oddQuantity = oddQuantity;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("freightCost")
  public Double getFreightCost() {
    return freightCost;
  }
  public void setFreightCost(Double freightCost) {
    this.freightCost = freightCost;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("receivedDate")
  public Date getReceivedDate() {
    return receivedDate;
  }
  public void setReceivedDate(Date receivedDate) {
    this.receivedDate = receivedDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("receivedQuantity")
  public Integer getReceivedQuantity() {
    return receivedQuantity;
  }
  public void setReceivedQuantity(Integer receivedQuantity) {
    this.receivedQuantity = receivedQuantity;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fromProd")
  public Integer getFromProd() {
    return fromProd;
  }
  public void setFromProd(Integer fromProd) {
    this.fromProd = fromProd;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sfpComplete")
  public String getSfpComplete() {
    return sfpComplete;
  }
  public void setSfpComplete(String sfpComplete) {
    this.sfpComplete = sfpComplete;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endQuantity")
  public Integer getEndQuantity() {
    return endQuantity;
  }
  public void setEndQuantity(Integer endQuantity) {
    this.endQuantity = endQuantity;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endVal")
  public Double getEndVal() {
    return endVal;
  }
  public void setEndVal(Double endVal) {
    this.endVal = endVal;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endFact")
  public Double getEndFact() {
    return endFact;
  }
  public void setEndFact(Double endFact) {
    this.endFact = endFact;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("interimQuantity")
  public Integer getInterimQuantity() {
    return interimQuantity;
  }
  public void setInterimQuantity(Integer interimQuantity) {
    this.interimQuantity = interimQuantity;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("interimVal")
  public Double getInterimVal() {
    return interimVal;
  }
  public void setInterimVal(Double interimVal) {
    this.interimVal = interimVal;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("interimFact")
  public Double getInterimFact() {
    return interimFact;
  }
  public void setInterimFact(Double interimFact) {
    this.interimFact = interimFact;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastAct")
  public Date getLastAct() {
    return lastAct;
  }
  public void setLastAct(Date lastAct) {
    this.lastAct = lastAct;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("weightPerWrap")
  public Double getWeightPerWrap() {
    return weightPerWrap;
  }
  public void setWeightPerWrap(Double weightPerWrap) {
    this.weightPerWrap = weightPerWrap;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("norcs")
  public String getNorcs() {
    return norcs;
  }
  public void setNorcs(String norcs) {
    this.norcs = norcs;
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("bsVendor")
  public Integer getBsVendor() {
    return bsVendor;
  }
  public void setBsVendor(Integer bsVendor) {
    this.bsVendor = bsVendor;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mlVendor")
  public Integer getMlVendor() {
    return mlVendor;
  }
  public void setMlVendor(Integer mlVendor) {
    this.mlVendor = mlVendor;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("receiptNo")
  public Integer getReceiptNo() {
    return receiptNo;
  }
  public void setReceiptNo(Integer receiptNo) {
    this.receiptNo = receiptNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paidFull")
  public String getPaidFull() {
    return paidFull;
  }
  public void setPaidFull(String paidFull) {
    this.paidFull = paidFull;
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
  @JsonProperty("receivedBy")
  public String getReceivedBy() {
    return receivedBy;
  }
  public void setReceivedBy(String receivedBy) {
    this.receivedBy = receivedBy;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lineNo")
  public Integer getLineNo() {
    return lineNo;
  }
  public void setLineNo(Integer lineNo) {
    this.lineNo = lineNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prodLot")
  public String getProdLot() {
    return prodLot;
  }
  public void setProdLot(String prodLot) {
    this.prodLot = prodLot;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unitsPerCase")
  public Integer getUnitsPerCase() {
    return unitsPerCase;
  }
  public void setUnitsPerCase(Integer unitsPerCase) {
    this.unitsPerCase = unitsPerCase;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("caseWeight")
  public Double getCaseWeight() {
    return caseWeight;
  }
  public void setCaseWeight(Double caseWeight) {
    this.caseWeight = caseWeight;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("height")
  public Double getHeight() {
    return height;
  }
  public void setHeight(Double height) {
    this.height = height;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("width")
  public Double getWidth() {
    return width;
  }
  public void setWidth(Double width) {
    this.width = width;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("length")
  public Double getLength() {
    return length;
  }
  public void setLength(Double length) {
    this.length = length;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dockTime")
  public Date getDockTime() {
    return dockTime;
  }
  public void setDockTime(Date dockTime) {
    this.dockTime = dockTime;
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
  @JsonProperty("impressions")
  public Integer getImpressions() {
    return impressions;
  }
  public void setImpressions(Integer impressions) {
    this.impressions = impressions;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asnLine")
  public Integer getAsnLine() {
    return asnLine;
  }
  public void setAsnLine(Integer asnLine) {
    this.asnLine = asnLine;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemReceipt itemReceipt = (ItemReceipt) o;
    return Objects.equals(id, itemReceipt.id) &&
        Objects.equals(poNo, itemReceipt.poNo) &&
        Objects.equals(lobId, itemReceipt.lobId) &&
        Objects.equals(legacyPoNo, itemReceipt.legacyPoNo) &&
        Objects.equals(warehouseId, itemReceipt.warehouseId) &&
        Objects.equals(orderDate, itemReceipt.orderDate) &&
        Objects.equals(factCost, itemReceipt.factCost) &&
        Objects.equals(mlCost, itemReceipt.mlCost) &&
        Objects.equals(sku, itemReceipt.sku) &&
        Objects.equals(orderQuantity, itemReceipt.orderQuantity) &&
        Objects.equals(requestedDeliveryDate, itemReceipt.requestedDeliveryDate) &&
        Objects.equals(unitCode, itemReceipt.unitCode) &&
        Objects.equals(wrapCode, itemReceipt.wrapCode) &&
        Objects.equals(unitsPerWrap, itemReceipt.unitsPerWrap) &&
        Objects.equals(cost, itemReceipt.cost) &&
        Objects.equals(sell, itemReceipt.sell) &&
        Objects.equals(pricingPer, itemReceipt.pricingPer) &&
        Objects.equals(maxFreight, itemReceipt.maxFreight) &&
        Objects.equals(chargeFreight, itemReceipt.chargeFreight) &&
        Objects.equals(maxOther, itemReceipt.maxOther) &&
        Objects.equals(distDate, itemReceipt.distDate) &&
        Objects.equals(voidDate, itemReceipt.voidDate) &&
        Objects.equals(freezeAction, itemReceipt.freezeAction) &&
        Objects.equals(revDate, itemReceipt.revDate) &&
        Objects.equals(artBack, itemReceipt.artBack) &&
        Objects.equals(origin, itemReceipt.origin) &&
        Objects.equals(sample, itemReceipt.sample) &&
        Objects.equals(sampleTo, itemReceipt.sampleTo) &&
        Objects.equals(maxOvers, itemReceipt.maxOvers) &&
        Objects.equals(maxUnders, itemReceipt.maxUnders) &&
        Objects.equals(receivedSfp, itemReceipt.receivedSfp) &&
        Objects.equals(budgetCode, itemReceipt.budgetCode) &&
        Objects.equals(accountingCode, itemReceipt.accountingCode) &&
        Objects.equals(taxExempt, itemReceipt.taxExempt) &&
        Objects.equals(capitalize, itemReceipt.capitalize) &&
        Objects.equals(accrual, itemReceipt.accrual) &&
        Objects.equals(oddQuantity, itemReceipt.oddQuantity) &&
        Objects.equals(freightCost, itemReceipt.freightCost) &&
        Objects.equals(receivedDate, itemReceipt.receivedDate) &&
        Objects.equals(receivedQuantity, itemReceipt.receivedQuantity) &&
        Objects.equals(fromProd, itemReceipt.fromProd) &&
        Objects.equals(sfpComplete, itemReceipt.sfpComplete) &&
        Objects.equals(endQuantity, itemReceipt.endQuantity) &&
        Objects.equals(endVal, itemReceipt.endVal) &&
        Objects.equals(endFact, itemReceipt.endFact) &&
        Objects.equals(interimQuantity, itemReceipt.interimQuantity) &&
        Objects.equals(interimVal, itemReceipt.interimVal) &&
        Objects.equals(interimFact, itemReceipt.interimFact) &&
        Objects.equals(lastAct, itemReceipt.lastAct) &&
        Objects.equals(weightPerWrap, itemReceipt.weightPerWrap) &&
        Objects.equals(norcs, itemReceipt.norcs) &&
        Objects.equals(vendorId, itemReceipt.vendorId) &&
        Objects.equals(bsVendor, itemReceipt.bsVendor) &&
        Objects.equals(mlVendor, itemReceipt.mlVendor) &&
        Objects.equals(receiptNo, itemReceipt.receiptNo) &&
        Objects.equals(paidFull, itemReceipt.paidFull) &&
        Objects.equals(enteredBy, itemReceipt.enteredBy) &&
        Objects.equals(receivedBy, itemReceipt.receivedBy) &&
        Objects.equals(lineNo, itemReceipt.lineNo) &&
        Objects.equals(prodLot, itemReceipt.prodLot) &&
        Objects.equals(unitsPerCase, itemReceipt.unitsPerCase) &&
        Objects.equals(caseWeight, itemReceipt.caseWeight) &&
        Objects.equals(height, itemReceipt.height) &&
        Objects.equals(width, itemReceipt.width) &&
        Objects.equals(length, itemReceipt.length) &&
        Objects.equals(dockTime, itemReceipt.dockTime) &&
        Objects.equals(modifyDate, itemReceipt.modifyDate) &&
        Objects.equals(impressions, itemReceipt.impressions) &&
        Objects.equals(asnLine, itemReceipt.asnLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, poNo, lobId, legacyPoNo, warehouseId, orderDate, factCost, mlCost, sku, orderQuantity, requestedDeliveryDate, unitCode, wrapCode, unitsPerWrap, cost, sell, pricingPer, maxFreight, chargeFreight, maxOther, distDate, voidDate, freezeAction, revDate, artBack, origin, sample, sampleTo, maxOvers, maxUnders, receivedSfp, budgetCode, accountingCode, taxExempt, capitalize, accrual, oddQuantity, freightCost, receivedDate, receivedQuantity, fromProd, sfpComplete, endQuantity, endVal, endFact, interimQuantity, interimVal, interimFact, lastAct, weightPerWrap, norcs, vendorId, bsVendor, mlVendor, receiptNo, paidFull, enteredBy, receivedBy, lineNo, prodLot, unitsPerCase, caseWeight, height, width, length, dockTime, modifyDate, impressions, asnLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemReceipt {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    poNo: ").append(toIndentedString(poNo)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    legacyPoNo: ").append(toIndentedString(legacyPoNo)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
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
    sb.append("    unitsPerCase: ").append(toIndentedString(unitsPerCase)).append("\n");
    sb.append("    caseWeight: ").append(toIndentedString(caseWeight)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    dockTime: ").append(toIndentedString(dockTime)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
    sb.append("    asnLine: ").append(toIndentedString(asnLine)).append("\n");
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

