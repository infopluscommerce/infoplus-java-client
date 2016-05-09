package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class Item   {
  
  private Integer id = null;
  private String accountCode = null;
  private Integer lowStockContactId = null;
  private String legacyLowStockContact = null;
  private String lowStockCode = null;
  private String majorGroup = null;
  private String subGroup = null;
  private String productionCode = null;
  private String summaryCode = null;
  private String buyer = null;
  private Integer lobId = null;
  private String sku = null;
  private String vendorSKU = null;
  private String upc = null;
  private String itemDescription = null;
  private String packingSlipDescription = null;
  private String absoluteMax = null;
  private String additionalDescription = null;
  private String backorder = null;
  private String chargeCode = null;
  private String commodityCode = null;
  private Integer compCode = null;
  private Date createDate = null;
  private Integer criticalAmount = null;
  private Integer overallFixedReorderPoint = null;
  private Integer overallLeadTime = null;
  private Double listPrice = null;
  private String lotControlFlag = null;
  private Integer maxCycle = null;
  private Integer maxInterim = null;
  private Integer numericSortOrder = null;
  private Integer outsideVendor = null;
  private String pickNo = null;
  private Integer podOrderSuffix = null;
  private String podRevDate = null;
  private String status = null;
  private String seasonalItem = null;
  private String requiresProductionLot = null;
  private String sector = null;
  private String secure = null;
  private String serialCode = null;
  private String unitCode = null;
  private Integer unitsPerWrap = null;
  private Double weightPerWrap = null;
  private Date voidDate = null;
  private String wrapCode = null;
  private String extrinsicText1 = null;
  private String extrinsicText2 = null;
  private String extrinsicText3 = null;
  private Integer extrinsicNumber1 = null;
  private Integer extrinsicNumber2 = null;
  private Double extrinsicDecimal1 = null;
  private Double extrinsicDecimal2 = null;
  private String casebreakEnabled = null;
  private Date modifyDate = null;
  private String forwardLotMixingRule = null;
  private String storageLotMixingRule = null;
  private String forwardItemMixingRule = null;
  private String storageItemMixingRule = null;
  private String allocationRule = null;
  private String hazmat = null;

  
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
  @JsonProperty("accountCode")
  public String getAccountCode() {
    return accountCode;
  }
  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lowStockContactId")
  public Integer getLowStockContactId() {
    return lowStockContactId;
  }
  public void setLowStockContactId(Integer lowStockContactId) {
    this.lowStockContactId = lowStockContactId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("legacyLowStockContact")
  public String getLegacyLowStockContact() {
    return legacyLowStockContact;
  }
  public void setLegacyLowStockContact(String legacyLowStockContact) {
    this.legacyLowStockContact = legacyLowStockContact;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lowStockCode")
  public String getLowStockCode() {
    return lowStockCode;
  }
  public void setLowStockCode(String lowStockCode) {
    this.lowStockCode = lowStockCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("majorGroup")
  public String getMajorGroup() {
    return majorGroup;
  }
  public void setMajorGroup(String majorGroup) {
    this.majorGroup = majorGroup;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("subGroup")
  public String getSubGroup() {
    return subGroup;
  }
  public void setSubGroup(String subGroup) {
    this.subGroup = subGroup;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("productionCode")
  public String getProductionCode() {
    return productionCode;
  }
  public void setProductionCode(String productionCode) {
    this.productionCode = productionCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("summaryCode")
  public String getSummaryCode() {
    return summaryCode;
  }
  public void setSummaryCode(String summaryCode) {
    this.summaryCode = summaryCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("buyer")
  public String getBuyer() {
    return buyer;
  }
  public void setBuyer(String buyer) {
    this.buyer = buyer;
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
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("vendorSKU")
  public String getVendorSKU() {
    return vendorSKU;
  }
  public void setVendorSKU(String vendorSKU) {
    this.vendorSKU = vendorSKU;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("upc")
  public String getUpc() {
    return upc;
  }
  public void setUpc(String upc) {
    this.upc = upc;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("itemDescription")
  public String getItemDescription() {
    return itemDescription;
  }
  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("packingSlipDescription")
  public String getPackingSlipDescription() {
    return packingSlipDescription;
  }
  public void setPackingSlipDescription(String packingSlipDescription) {
    this.packingSlipDescription = packingSlipDescription;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("absoluteMax")
  public String getAbsoluteMax() {
    return absoluteMax;
  }
  public void setAbsoluteMax(String absoluteMax) {
    this.absoluteMax = absoluteMax;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("additionalDescription")
  public String getAdditionalDescription() {
    return additionalDescription;
  }
  public void setAdditionalDescription(String additionalDescription) {
    this.additionalDescription = additionalDescription;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("backorder")
  public String getBackorder() {
    return backorder;
  }
  public void setBackorder(String backorder) {
    this.backorder = backorder;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("chargeCode")
  public String getChargeCode() {
    return chargeCode;
  }
  public void setChargeCode(String chargeCode) {
    this.chargeCode = chargeCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("commodityCode")
  public String getCommodityCode() {
    return commodityCode;
  }
  public void setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("compCode")
  public Integer getCompCode() {
    return compCode;
  }
  public void setCompCode(Integer compCode) {
    this.compCode = compCode;
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("criticalAmount")
  public Integer getCriticalAmount() {
    return criticalAmount;
  }
  public void setCriticalAmount(Integer criticalAmount) {
    this.criticalAmount = criticalAmount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("overallFixedReorderPoint")
  public Integer getOverallFixedReorderPoint() {
    return overallFixedReorderPoint;
  }
  public void setOverallFixedReorderPoint(Integer overallFixedReorderPoint) {
    this.overallFixedReorderPoint = overallFixedReorderPoint;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("overallLeadTime")
  public Integer getOverallLeadTime() {
    return overallLeadTime;
  }
  public void setOverallLeadTime(Integer overallLeadTime) {
    this.overallLeadTime = overallLeadTime;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("listPrice")
  public Double getListPrice() {
    return listPrice;
  }
  public void setListPrice(Double listPrice) {
    this.listPrice = listPrice;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lotControlFlag")
  public String getLotControlFlag() {
    return lotControlFlag;
  }
  public void setLotControlFlag(String lotControlFlag) {
    this.lotControlFlag = lotControlFlag;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("maxCycle")
  public Integer getMaxCycle() {
    return maxCycle;
  }
  public void setMaxCycle(Integer maxCycle) {
    this.maxCycle = maxCycle;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("maxInterim")
  public Integer getMaxInterim() {
    return maxInterim;
  }
  public void setMaxInterim(Integer maxInterim) {
    this.maxInterim = maxInterim;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numericSortOrder")
  public Integer getNumericSortOrder() {
    return numericSortOrder;
  }
  public void setNumericSortOrder(Integer numericSortOrder) {
    this.numericSortOrder = numericSortOrder;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("outsideVendor")
  public Integer getOutsideVendor() {
    return outsideVendor;
  }
  public void setOutsideVendor(Integer outsideVendor) {
    this.outsideVendor = outsideVendor;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickNo")
  public String getPickNo() {
    return pickNo;
  }
  public void setPickNo(String pickNo) {
    this.pickNo = pickNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("podOrderSuffix")
  public Integer getPodOrderSuffix() {
    return podOrderSuffix;
  }
  public void setPodOrderSuffix(Integer podOrderSuffix) {
    this.podOrderSuffix = podOrderSuffix;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("podRevDate")
  public String getPodRevDate() {
    return podRevDate;
  }
  public void setPodRevDate(String podRevDate) {
    this.podRevDate = podRevDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("seasonalItem")
  public String getSeasonalItem() {
    return seasonalItem;
  }
  public void setSeasonalItem(String seasonalItem) {
    this.seasonalItem = seasonalItem;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("requiresProductionLot")
  public String getRequiresProductionLot() {
    return requiresProductionLot;
  }
  public void setRequiresProductionLot(String requiresProductionLot) {
    this.requiresProductionLot = requiresProductionLot;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sector")
  public String getSector() {
    return sector;
  }
  public void setSector(String sector) {
    this.sector = sector;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("secure")
  public String getSecure() {
    return secure;
  }
  public void setSecure(String secure) {
    this.secure = secure;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("serialCode")
  public String getSerialCode() {
    return serialCode;
  }
  public void setSerialCode(String serialCode) {
    this.serialCode = serialCode;
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
  @JsonProperty("wrapCode")
  public String getWrapCode() {
    return wrapCode;
  }
  public void setWrapCode(String wrapCode) {
    this.wrapCode = wrapCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extrinsicText1")
  public String getExtrinsicText1() {
    return extrinsicText1;
  }
  public void setExtrinsicText1(String extrinsicText1) {
    this.extrinsicText1 = extrinsicText1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extrinsicText2")
  public String getExtrinsicText2() {
    return extrinsicText2;
  }
  public void setExtrinsicText2(String extrinsicText2) {
    this.extrinsicText2 = extrinsicText2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extrinsicText3")
  public String getExtrinsicText3() {
    return extrinsicText3;
  }
  public void setExtrinsicText3(String extrinsicText3) {
    this.extrinsicText3 = extrinsicText3;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extrinsicNumber1")
  public Integer getExtrinsicNumber1() {
    return extrinsicNumber1;
  }
  public void setExtrinsicNumber1(Integer extrinsicNumber1) {
    this.extrinsicNumber1 = extrinsicNumber1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extrinsicNumber2")
  public Integer getExtrinsicNumber2() {
    return extrinsicNumber2;
  }
  public void setExtrinsicNumber2(Integer extrinsicNumber2) {
    this.extrinsicNumber2 = extrinsicNumber2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extrinsicDecimal1")
  public Double getExtrinsicDecimal1() {
    return extrinsicDecimal1;
  }
  public void setExtrinsicDecimal1(Double extrinsicDecimal1) {
    this.extrinsicDecimal1 = extrinsicDecimal1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extrinsicDecimal2")
  public Double getExtrinsicDecimal2() {
    return extrinsicDecimal2;
  }
  public void setExtrinsicDecimal2(Double extrinsicDecimal2) {
    this.extrinsicDecimal2 = extrinsicDecimal2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("casebreakEnabled")
  public String getCasebreakEnabled() {
    return casebreakEnabled;
  }
  public void setCasebreakEnabled(String casebreakEnabled) {
    this.casebreakEnabled = casebreakEnabled;
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
  @JsonProperty("forwardLotMixingRule")
  public String getForwardLotMixingRule() {
    return forwardLotMixingRule;
  }
  public void setForwardLotMixingRule(String forwardLotMixingRule) {
    this.forwardLotMixingRule = forwardLotMixingRule;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("storageLotMixingRule")
  public String getStorageLotMixingRule() {
    return storageLotMixingRule;
  }
  public void setStorageLotMixingRule(String storageLotMixingRule) {
    this.storageLotMixingRule = storageLotMixingRule;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("forwardItemMixingRule")
  public String getForwardItemMixingRule() {
    return forwardItemMixingRule;
  }
  public void setForwardItemMixingRule(String forwardItemMixingRule) {
    this.forwardItemMixingRule = forwardItemMixingRule;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("storageItemMixingRule")
  public String getStorageItemMixingRule() {
    return storageItemMixingRule;
  }
  public void setStorageItemMixingRule(String storageItemMixingRule) {
    this.storageItemMixingRule = storageItemMixingRule;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("allocationRule")
  public String getAllocationRule() {
    return allocationRule;
  }
  public void setAllocationRule(String allocationRule) {
    this.allocationRule = allocationRule;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hazmat")
  public String getHazmat() {
    return hazmat;
  }
  public void setHazmat(String hazmat) {
    this.hazmat = hazmat;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(id, item.id) &&
        Objects.equals(accountCode, item.accountCode) &&
        Objects.equals(lowStockContactId, item.lowStockContactId) &&
        Objects.equals(legacyLowStockContact, item.legacyLowStockContact) &&
        Objects.equals(lowStockCode, item.lowStockCode) &&
        Objects.equals(majorGroup, item.majorGroup) &&
        Objects.equals(subGroup, item.subGroup) &&
        Objects.equals(productionCode, item.productionCode) &&
        Objects.equals(summaryCode, item.summaryCode) &&
        Objects.equals(buyer, item.buyer) &&
        Objects.equals(lobId, item.lobId) &&
        Objects.equals(sku, item.sku) &&
        Objects.equals(vendorSKU, item.vendorSKU) &&
        Objects.equals(upc, item.upc) &&
        Objects.equals(itemDescription, item.itemDescription) &&
        Objects.equals(packingSlipDescription, item.packingSlipDescription) &&
        Objects.equals(absoluteMax, item.absoluteMax) &&
        Objects.equals(additionalDescription, item.additionalDescription) &&
        Objects.equals(backorder, item.backorder) &&
        Objects.equals(chargeCode, item.chargeCode) &&
        Objects.equals(commodityCode, item.commodityCode) &&
        Objects.equals(compCode, item.compCode) &&
        Objects.equals(createDate, item.createDate) &&
        Objects.equals(criticalAmount, item.criticalAmount) &&
        Objects.equals(overallFixedReorderPoint, item.overallFixedReorderPoint) &&
        Objects.equals(overallLeadTime, item.overallLeadTime) &&
        Objects.equals(listPrice, item.listPrice) &&
        Objects.equals(lotControlFlag, item.lotControlFlag) &&
        Objects.equals(maxCycle, item.maxCycle) &&
        Objects.equals(maxInterim, item.maxInterim) &&
        Objects.equals(numericSortOrder, item.numericSortOrder) &&
        Objects.equals(outsideVendor, item.outsideVendor) &&
        Objects.equals(pickNo, item.pickNo) &&
        Objects.equals(podOrderSuffix, item.podOrderSuffix) &&
        Objects.equals(podRevDate, item.podRevDate) &&
        Objects.equals(status, item.status) &&
        Objects.equals(seasonalItem, item.seasonalItem) &&
        Objects.equals(requiresProductionLot, item.requiresProductionLot) &&
        Objects.equals(sector, item.sector) &&
        Objects.equals(secure, item.secure) &&
        Objects.equals(serialCode, item.serialCode) &&
        Objects.equals(unitCode, item.unitCode) &&
        Objects.equals(unitsPerWrap, item.unitsPerWrap) &&
        Objects.equals(weightPerWrap, item.weightPerWrap) &&
        Objects.equals(voidDate, item.voidDate) &&
        Objects.equals(wrapCode, item.wrapCode) &&
        Objects.equals(extrinsicText1, item.extrinsicText1) &&
        Objects.equals(extrinsicText2, item.extrinsicText2) &&
        Objects.equals(extrinsicText3, item.extrinsicText3) &&
        Objects.equals(extrinsicNumber1, item.extrinsicNumber1) &&
        Objects.equals(extrinsicNumber2, item.extrinsicNumber2) &&
        Objects.equals(extrinsicDecimal1, item.extrinsicDecimal1) &&
        Objects.equals(extrinsicDecimal2, item.extrinsicDecimal2) &&
        Objects.equals(casebreakEnabled, item.casebreakEnabled) &&
        Objects.equals(modifyDate, item.modifyDate) &&
        Objects.equals(forwardLotMixingRule, item.forwardLotMixingRule) &&
        Objects.equals(storageLotMixingRule, item.storageLotMixingRule) &&
        Objects.equals(forwardItemMixingRule, item.forwardItemMixingRule) &&
        Objects.equals(storageItemMixingRule, item.storageItemMixingRule) &&
        Objects.equals(allocationRule, item.allocationRule) &&
        Objects.equals(hazmat, item.hazmat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountCode, lowStockContactId, legacyLowStockContact, lowStockCode, majorGroup, subGroup, productionCode, summaryCode, buyer, lobId, sku, vendorSKU, upc, itemDescription, packingSlipDescription, absoluteMax, additionalDescription, backorder, chargeCode, commodityCode, compCode, createDate, criticalAmount, overallFixedReorderPoint, overallLeadTime, listPrice, lotControlFlag, maxCycle, maxInterim, numericSortOrder, outsideVendor, pickNo, podOrderSuffix, podRevDate, status, seasonalItem, requiresProductionLot, sector, secure, serialCode, unitCode, unitsPerWrap, weightPerWrap, voidDate, wrapCode, extrinsicText1, extrinsicText2, extrinsicText3, extrinsicNumber1, extrinsicNumber2, extrinsicDecimal1, extrinsicDecimal2, casebreakEnabled, modifyDate, forwardLotMixingRule, storageLotMixingRule, forwardItemMixingRule, storageItemMixingRule, allocationRule, hazmat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    lowStockContactId: ").append(toIndentedString(lowStockContactId)).append("\n");
    sb.append("    legacyLowStockContact: ").append(toIndentedString(legacyLowStockContact)).append("\n");
    sb.append("    lowStockCode: ").append(toIndentedString(lowStockCode)).append("\n");
    sb.append("    majorGroup: ").append(toIndentedString(majorGroup)).append("\n");
    sb.append("    subGroup: ").append(toIndentedString(subGroup)).append("\n");
    sb.append("    productionCode: ").append(toIndentedString(productionCode)).append("\n");
    sb.append("    summaryCode: ").append(toIndentedString(summaryCode)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    vendorSKU: ").append(toIndentedString(vendorSKU)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    packingSlipDescription: ").append(toIndentedString(packingSlipDescription)).append("\n");
    sb.append("    absoluteMax: ").append(toIndentedString(absoluteMax)).append("\n");
    sb.append("    additionalDescription: ").append(toIndentedString(additionalDescription)).append("\n");
    sb.append("    backorder: ").append(toIndentedString(backorder)).append("\n");
    sb.append("    chargeCode: ").append(toIndentedString(chargeCode)).append("\n");
    sb.append("    commodityCode: ").append(toIndentedString(commodityCode)).append("\n");
    sb.append("    compCode: ").append(toIndentedString(compCode)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    criticalAmount: ").append(toIndentedString(criticalAmount)).append("\n");
    sb.append("    overallFixedReorderPoint: ").append(toIndentedString(overallFixedReorderPoint)).append("\n");
    sb.append("    overallLeadTime: ").append(toIndentedString(overallLeadTime)).append("\n");
    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
    sb.append("    lotControlFlag: ").append(toIndentedString(lotControlFlag)).append("\n");
    sb.append("    maxCycle: ").append(toIndentedString(maxCycle)).append("\n");
    sb.append("    maxInterim: ").append(toIndentedString(maxInterim)).append("\n");
    sb.append("    numericSortOrder: ").append(toIndentedString(numericSortOrder)).append("\n");
    sb.append("    outsideVendor: ").append(toIndentedString(outsideVendor)).append("\n");
    sb.append("    pickNo: ").append(toIndentedString(pickNo)).append("\n");
    sb.append("    podOrderSuffix: ").append(toIndentedString(podOrderSuffix)).append("\n");
    sb.append("    podRevDate: ").append(toIndentedString(podRevDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    seasonalItem: ").append(toIndentedString(seasonalItem)).append("\n");
    sb.append("    requiresProductionLot: ").append(toIndentedString(requiresProductionLot)).append("\n");
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    serialCode: ").append(toIndentedString(serialCode)).append("\n");
    sb.append("    unitCode: ").append(toIndentedString(unitCode)).append("\n");
    sb.append("    unitsPerWrap: ").append(toIndentedString(unitsPerWrap)).append("\n");
    sb.append("    weightPerWrap: ").append(toIndentedString(weightPerWrap)).append("\n");
    sb.append("    voidDate: ").append(toIndentedString(voidDate)).append("\n");
    sb.append("    wrapCode: ").append(toIndentedString(wrapCode)).append("\n");
    sb.append("    extrinsicText1: ").append(toIndentedString(extrinsicText1)).append("\n");
    sb.append("    extrinsicText2: ").append(toIndentedString(extrinsicText2)).append("\n");
    sb.append("    extrinsicText3: ").append(toIndentedString(extrinsicText3)).append("\n");
    sb.append("    extrinsicNumber1: ").append(toIndentedString(extrinsicNumber1)).append("\n");
    sb.append("    extrinsicNumber2: ").append(toIndentedString(extrinsicNumber2)).append("\n");
    sb.append("    extrinsicDecimal1: ").append(toIndentedString(extrinsicDecimal1)).append("\n");
    sb.append("    extrinsicDecimal2: ").append(toIndentedString(extrinsicDecimal2)).append("\n");
    sb.append("    casebreakEnabled: ").append(toIndentedString(casebreakEnabled)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    forwardLotMixingRule: ").append(toIndentedString(forwardLotMixingRule)).append("\n");
    sb.append("    storageLotMixingRule: ").append(toIndentedString(storageLotMixingRule)).append("\n");
    sb.append("    forwardItemMixingRule: ").append(toIndentedString(forwardItemMixingRule)).append("\n");
    sb.append("    storageItemMixingRule: ").append(toIndentedString(storageItemMixingRule)).append("\n");
    sb.append("    allocationRule: ").append(toIndentedString(allocationRule)).append("\n");
    sb.append("    hazmat: ").append(toIndentedString(hazmat)).append("\n");
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

