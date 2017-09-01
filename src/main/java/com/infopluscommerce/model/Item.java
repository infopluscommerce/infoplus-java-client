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
public class Item   {
  
  private Integer id = null;
  private Integer accountCodeId = null;
  private Integer lowStockContactId = null;
  private Integer legacyLowLevelContactId = null;
  private Integer lowStockCodeId = null;
  private Integer majorGroupId = null;
  private Integer subGroupId = null;
  private Integer productCodeId = null;
  private Integer summaryCodeId = null;
  private Integer buyerId = null;
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
  private BigDecimal sellPrice = null;
  private String pricingPer = null;
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
  private BigDecimal weightPerWrap = null;
  private Date voidDate = null;
  private String wrapCode = null;
  private String extrinsicText1 = null;
  private String extrinsicText2 = null;
  private String extrinsicText3 = null;
  private Integer extrinsicNumber1 = null;
  private Integer extrinsicNumber2 = null;
  private BigDecimal extrinsicDecimal1 = null;
  private BigDecimal extrinsicDecimal2 = null;
  private String casebreakEnabled = null;
  private Integer vendorId = null;
  private BigDecimal vendorPrice = null;
  private String vendorPer = null;
  private Date modifyDate = null;
  private String forwardLotMixingRule = null;
  private String storageLotMixingRule = null;
  private String forwardItemMixingRule = null;
  private String storageItemMixingRule = null;
  private String allocationRule = null;
  private String barcodeField = null;
  private String warehouseDisplayField = null;
  private Integer productIdTagSchemeId = null;
  private String hazmat = null;
  private Boolean isAlcohol = false;
  private String alcoholType = null;
  private BigDecimal alcoholContent = null;
  private String alcoholContainer = null;
  private String alcoholVintageYear = null;
  private String alcoholCountry = null;
  private String alcoholState = null;
  private String alcoholRegion = null;
  private String alcoholBrand = null;
  private String alcoholUPCCode = null;
  private String alcoholNAMBCACode = null;
  private String alcoholUNIMERCCode = null;
  private String alcoholSCCCode = null;
  private BigDecimal length = null;
  private BigDecimal width = null;
  private BigDecimal height = null;
  private Boolean topUp = false;
  private Boolean shipSolo = false;
  private Date inventoryUpdateTimestamp = null;
  private Integer availableQuantity = null;
  private Integer damagedQuantity = null;
  private Integer inFulfillmentProcessQuantity = null;
  private Integer onHandQuantity = null;
  private Integer openOrderQuantity = null;
  private Integer openPOQuantity = null;
  private Integer orderableQuantity = null;
  private Integer unallocatableQuantity = null;
  private Integer unavailableQuantity = null;
  private Integer overallDaysOnHand = null;
  private String overallStockStatus = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public Item accountCodeId(Integer accountCodeId) {
    this.accountCodeId = accountCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("accountCodeId")
  public Integer getAccountCodeId() {
    return accountCodeId;
  }
  public void setAccountCodeId(Integer accountCodeId) {
    this.accountCodeId = accountCodeId;
  }

  
  /**
   **/
  public Item lowStockContactId(Integer lowStockContactId) {
    this.lowStockContactId = lowStockContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lowStockContactId")
  public Integer getLowStockContactId() {
    return lowStockContactId;
  }
  public void setLowStockContactId(Integer lowStockContactId) {
    this.lowStockContactId = lowStockContactId;
  }

  
  /**
   **/
  public Item legacyLowLevelContactId(Integer legacyLowLevelContactId) {
    this.legacyLowLevelContactId = legacyLowLevelContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("legacyLowLevelContactId")
  public Integer getLegacyLowLevelContactId() {
    return legacyLowLevelContactId;
  }
  public void setLegacyLowLevelContactId(Integer legacyLowLevelContactId) {
    this.legacyLowLevelContactId = legacyLowLevelContactId;
  }

  
  /**
   **/
  public Item lowStockCodeId(Integer lowStockCodeId) {
    this.lowStockCodeId = lowStockCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lowStockCodeId")
  public Integer getLowStockCodeId() {
    return lowStockCodeId;
  }
  public void setLowStockCodeId(Integer lowStockCodeId) {
    this.lowStockCodeId = lowStockCodeId;
  }

  
  /**
   **/
  public Item majorGroupId(Integer majorGroupId) {
    this.majorGroupId = majorGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("majorGroupId")
  public Integer getMajorGroupId() {
    return majorGroupId;
  }
  public void setMajorGroupId(Integer majorGroupId) {
    this.majorGroupId = majorGroupId;
  }

  
  /**
   **/
  public Item subGroupId(Integer subGroupId) {
    this.subGroupId = subGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("subGroupId")
  public Integer getSubGroupId() {
    return subGroupId;
  }
  public void setSubGroupId(Integer subGroupId) {
    this.subGroupId = subGroupId;
  }

  
  /**
   **/
  public Item productCodeId(Integer productCodeId) {
    this.productCodeId = productCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("productCodeId")
  public Integer getProductCodeId() {
    return productCodeId;
  }
  public void setProductCodeId(Integer productCodeId) {
    this.productCodeId = productCodeId;
  }

  
  /**
   **/
  public Item summaryCodeId(Integer summaryCodeId) {
    this.summaryCodeId = summaryCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("summaryCodeId")
  public Integer getSummaryCodeId() {
    return summaryCodeId;
  }
  public void setSummaryCodeId(Integer summaryCodeId) {
    this.summaryCodeId = summaryCodeId;
  }

  
  /**
   **/
  public Item buyerId(Integer buyerId) {
    this.buyerId = buyerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("buyerId")
  public Integer getBuyerId() {
    return buyerId;
  }
  public void setBuyerId(Integer buyerId) {
    this.buyerId = buyerId;
  }

  
  /**
   **/
  public Item lobId(Integer lobId) {
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
  public Item sku(String sku) {
    this.sku = sku;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  
  /**
   **/
  public Item vendorSKU(String vendorSKU) {
    this.vendorSKU = vendorSKU;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorSKU")
  public String getVendorSKU() {
    return vendorSKU;
  }
  public void setVendorSKU(String vendorSKU) {
    this.vendorSKU = vendorSKU;
  }

  
  /**
   **/
  public Item upc(String upc) {
    this.upc = upc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("upc")
  public String getUpc() {
    return upc;
  }
  public void setUpc(String upc) {
    this.upc = upc;
  }

  
  /**
   **/
  public Item itemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("itemDescription")
  public String getItemDescription() {
    return itemDescription;
  }
  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  
  /**
   **/
  public Item packingSlipDescription(String packingSlipDescription) {
    this.packingSlipDescription = packingSlipDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("packingSlipDescription")
  public String getPackingSlipDescription() {
    return packingSlipDescription;
  }
  public void setPackingSlipDescription(String packingSlipDescription) {
    this.packingSlipDescription = packingSlipDescription;
  }

  
  /**
   **/
  public Item absoluteMax(String absoluteMax) {
    this.absoluteMax = absoluteMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("absoluteMax")
  public String getAbsoluteMax() {
    return absoluteMax;
  }
  public void setAbsoluteMax(String absoluteMax) {
    this.absoluteMax = absoluteMax;
  }

  
  /**
   **/
  public Item additionalDescription(String additionalDescription) {
    this.additionalDescription = additionalDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalDescription")
  public String getAdditionalDescription() {
    return additionalDescription;
  }
  public void setAdditionalDescription(String additionalDescription) {
    this.additionalDescription = additionalDescription;
  }

  
  /**
   **/
  public Item backorder(String backorder) {
    this.backorder = backorder;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("backorder")
  public String getBackorder() {
    return backorder;
  }
  public void setBackorder(String backorder) {
    this.backorder = backorder;
  }

  
  /**
   **/
  public Item chargeCode(String chargeCode) {
    this.chargeCode = chargeCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("chargeCode")
  public String getChargeCode() {
    return chargeCode;
  }
  public void setChargeCode(String chargeCode) {
    this.chargeCode = chargeCode;
  }

  
  /**
   **/
  public Item commodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("commodityCode")
  public String getCommodityCode() {
    return commodityCode;
  }
  public void setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
  }

  
  /**
   **/
  public Item compCode(Integer compCode) {
    this.compCode = compCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("compCode")
  public Integer getCompCode() {
    return compCode;
  }
  public void setCompCode(Integer compCode) {
    this.compCode = compCode;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }

  
  /**
   **/
  public Item criticalAmount(Integer criticalAmount) {
    this.criticalAmount = criticalAmount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("criticalAmount")
  public Integer getCriticalAmount() {
    return criticalAmount;
  }
  public void setCriticalAmount(Integer criticalAmount) {
    this.criticalAmount = criticalAmount;
  }

  
  /**
   **/
  public Item overallFixedReorderPoint(Integer overallFixedReorderPoint) {
    this.overallFixedReorderPoint = overallFixedReorderPoint;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("overallFixedReorderPoint")
  public Integer getOverallFixedReorderPoint() {
    return overallFixedReorderPoint;
  }
  public void setOverallFixedReorderPoint(Integer overallFixedReorderPoint) {
    this.overallFixedReorderPoint = overallFixedReorderPoint;
  }

  
  /**
   **/
  public Item overallLeadTime(Integer overallLeadTime) {
    this.overallLeadTime = overallLeadTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("overallLeadTime")
  public Integer getOverallLeadTime() {
    return overallLeadTime;
  }
  public void setOverallLeadTime(Integer overallLeadTime) {
    this.overallLeadTime = overallLeadTime;
  }

  
  /**
   **/
  public Item sellPrice(BigDecimal sellPrice) {
    this.sellPrice = sellPrice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sellPrice")
  public BigDecimal getSellPrice() {
    return sellPrice;
  }
  public void setSellPrice(BigDecimal sellPrice) {
    this.sellPrice = sellPrice;
  }

  
  /**
   **/
  public Item pricingPer(String pricingPer) {
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
  public Item lotControlFlag(String lotControlFlag) {
    this.lotControlFlag = lotControlFlag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lotControlFlag")
  public String getLotControlFlag() {
    return lotControlFlag;
  }
  public void setLotControlFlag(String lotControlFlag) {
    this.lotControlFlag = lotControlFlag;
  }

  
  /**
   **/
  public Item maxCycle(Integer maxCycle) {
    this.maxCycle = maxCycle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("maxCycle")
  public Integer getMaxCycle() {
    return maxCycle;
  }
  public void setMaxCycle(Integer maxCycle) {
    this.maxCycle = maxCycle;
  }

  
  /**
   **/
  public Item maxInterim(Integer maxInterim) {
    this.maxInterim = maxInterim;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("maxInterim")
  public Integer getMaxInterim() {
    return maxInterim;
  }
  public void setMaxInterim(Integer maxInterim) {
    this.maxInterim = maxInterim;
  }

  
  /**
   **/
  public Item numericSortOrder(Integer numericSortOrder) {
    this.numericSortOrder = numericSortOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numericSortOrder")
  public Integer getNumericSortOrder() {
    return numericSortOrder;
  }
  public void setNumericSortOrder(Integer numericSortOrder) {
    this.numericSortOrder = numericSortOrder;
  }

  
  /**
   **/
  public Item outsideVendor(Integer outsideVendor) {
    this.outsideVendor = outsideVendor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outsideVendor")
  public Integer getOutsideVendor() {
    return outsideVendor;
  }
  public void setOutsideVendor(Integer outsideVendor) {
    this.outsideVendor = outsideVendor;
  }

  
  /**
   **/
  public Item pickNo(String pickNo) {
    this.pickNo = pickNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pickNo")
  public String getPickNo() {
    return pickNo;
  }
  public void setPickNo(String pickNo) {
    this.pickNo = pickNo;
  }

  
  /**
   **/
  public Item podOrderSuffix(Integer podOrderSuffix) {
    this.podOrderSuffix = podOrderSuffix;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("podOrderSuffix")
  public Integer getPodOrderSuffix() {
    return podOrderSuffix;
  }
  public void setPodOrderSuffix(Integer podOrderSuffix) {
    this.podOrderSuffix = podOrderSuffix;
  }

  
  /**
   **/
  public Item podRevDate(String podRevDate) {
    this.podRevDate = podRevDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("podRevDate")
  public String getPodRevDate() {
    return podRevDate;
  }
  public void setPodRevDate(String podRevDate) {
    this.podRevDate = podRevDate;
  }

  
  /**
   **/
  public Item status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  public Item seasonalItem(String seasonalItem) {
    this.seasonalItem = seasonalItem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("seasonalItem")
  public String getSeasonalItem() {
    return seasonalItem;
  }
  public void setSeasonalItem(String seasonalItem) {
    this.seasonalItem = seasonalItem;
  }

  
  /**
   **/
  public Item requiresProductionLot(String requiresProductionLot) {
    this.requiresProductionLot = requiresProductionLot;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requiresProductionLot")
  public String getRequiresProductionLot() {
    return requiresProductionLot;
  }
  public void setRequiresProductionLot(String requiresProductionLot) {
    this.requiresProductionLot = requiresProductionLot;
  }

  
  /**
   **/
  public Item sector(String sector) {
    this.sector = sector;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sector")
  public String getSector() {
    return sector;
  }
  public void setSector(String sector) {
    this.sector = sector;
  }

  
  /**
   **/
  public Item secure(String secure) {
    this.secure = secure;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("secure")
  public String getSecure() {
    return secure;
  }
  public void setSecure(String secure) {
    this.secure = secure;
  }

  
  /**
   **/
  public Item serialCode(String serialCode) {
    this.serialCode = serialCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("serialCode")
  public String getSerialCode() {
    return serialCode;
  }
  public void setSerialCode(String serialCode) {
    this.serialCode = serialCode;
  }

  
  /**
   **/
  public Item unitCode(String unitCode) {
    this.unitCode = unitCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("unitCode")
  public String getUnitCode() {
    return unitCode;
  }
  public void setUnitCode(String unitCode) {
    this.unitCode = unitCode;
  }

  
  /**
   **/
  public Item unitsPerWrap(Integer unitsPerWrap) {
    this.unitsPerWrap = unitsPerWrap;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("unitsPerWrap")
  public Integer getUnitsPerWrap() {
    return unitsPerWrap;
  }
  public void setUnitsPerWrap(Integer unitsPerWrap) {
    this.unitsPerWrap = unitsPerWrap;
  }

  
  /**
   **/
  public Item weightPerWrap(BigDecimal weightPerWrap) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("voidDate")
  public Date getVoidDate() {
    return voidDate;
  }

  
  /**
   **/
  public Item wrapCode(String wrapCode) {
    this.wrapCode = wrapCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("wrapCode")
  public String getWrapCode() {
    return wrapCode;
  }
  public void setWrapCode(String wrapCode) {
    this.wrapCode = wrapCode;
  }

  
  /**
   **/
  public Item extrinsicText1(String extrinsicText1) {
    this.extrinsicText1 = extrinsicText1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicText1")
  public String getExtrinsicText1() {
    return extrinsicText1;
  }
  public void setExtrinsicText1(String extrinsicText1) {
    this.extrinsicText1 = extrinsicText1;
  }

  
  /**
   **/
  public Item extrinsicText2(String extrinsicText2) {
    this.extrinsicText2 = extrinsicText2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicText2")
  public String getExtrinsicText2() {
    return extrinsicText2;
  }
  public void setExtrinsicText2(String extrinsicText2) {
    this.extrinsicText2 = extrinsicText2;
  }

  
  /**
   **/
  public Item extrinsicText3(String extrinsicText3) {
    this.extrinsicText3 = extrinsicText3;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicText3")
  public String getExtrinsicText3() {
    return extrinsicText3;
  }
  public void setExtrinsicText3(String extrinsicText3) {
    this.extrinsicText3 = extrinsicText3;
  }

  
  /**
   **/
  public Item extrinsicNumber1(Integer extrinsicNumber1) {
    this.extrinsicNumber1 = extrinsicNumber1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicNumber1")
  public Integer getExtrinsicNumber1() {
    return extrinsicNumber1;
  }
  public void setExtrinsicNumber1(Integer extrinsicNumber1) {
    this.extrinsicNumber1 = extrinsicNumber1;
  }

  
  /**
   **/
  public Item extrinsicNumber2(Integer extrinsicNumber2) {
    this.extrinsicNumber2 = extrinsicNumber2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicNumber2")
  public Integer getExtrinsicNumber2() {
    return extrinsicNumber2;
  }
  public void setExtrinsicNumber2(Integer extrinsicNumber2) {
    this.extrinsicNumber2 = extrinsicNumber2;
  }

  
  /**
   **/
  public Item extrinsicDecimal1(BigDecimal extrinsicDecimal1) {
    this.extrinsicDecimal1 = extrinsicDecimal1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicDecimal1")
  public BigDecimal getExtrinsicDecimal1() {
    return extrinsicDecimal1;
  }
  public void setExtrinsicDecimal1(BigDecimal extrinsicDecimal1) {
    this.extrinsicDecimal1 = extrinsicDecimal1;
  }

  
  /**
   **/
  public Item extrinsicDecimal2(BigDecimal extrinsicDecimal2) {
    this.extrinsicDecimal2 = extrinsicDecimal2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicDecimal2")
  public BigDecimal getExtrinsicDecimal2() {
    return extrinsicDecimal2;
  }
  public void setExtrinsicDecimal2(BigDecimal extrinsicDecimal2) {
    this.extrinsicDecimal2 = extrinsicDecimal2;
  }

  
  /**
   **/
  public Item casebreakEnabled(String casebreakEnabled) {
    this.casebreakEnabled = casebreakEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("casebreakEnabled")
  public String getCasebreakEnabled() {
    return casebreakEnabled;
  }
  public void setCasebreakEnabled(String casebreakEnabled) {
    this.casebreakEnabled = casebreakEnabled;
  }

  
  /**
   **/
  public Item vendorId(Integer vendorId) {
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
  public Item vendorPrice(BigDecimal vendorPrice) {
    this.vendorPrice = vendorPrice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorPrice")
  public BigDecimal getVendorPrice() {
    return vendorPrice;
  }
  public void setVendorPrice(BigDecimal vendorPrice) {
    this.vendorPrice = vendorPrice;
  }

  
  /**
   **/
  public Item vendorPer(String vendorPer) {
    this.vendorPer = vendorPer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorPer")
  public String getVendorPer() {
    return vendorPer;
  }
  public void setVendorPer(String vendorPer) {
    this.vendorPer = vendorPer;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }

  
  /**
   **/
  public Item forwardLotMixingRule(String forwardLotMixingRule) {
    this.forwardLotMixingRule = forwardLotMixingRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("forwardLotMixingRule")
  public String getForwardLotMixingRule() {
    return forwardLotMixingRule;
  }
  public void setForwardLotMixingRule(String forwardLotMixingRule) {
    this.forwardLotMixingRule = forwardLotMixingRule;
  }

  
  /**
   **/
  public Item storageLotMixingRule(String storageLotMixingRule) {
    this.storageLotMixingRule = storageLotMixingRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("storageLotMixingRule")
  public String getStorageLotMixingRule() {
    return storageLotMixingRule;
  }
  public void setStorageLotMixingRule(String storageLotMixingRule) {
    this.storageLotMixingRule = storageLotMixingRule;
  }

  
  /**
   **/
  public Item forwardItemMixingRule(String forwardItemMixingRule) {
    this.forwardItemMixingRule = forwardItemMixingRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("forwardItemMixingRule")
  public String getForwardItemMixingRule() {
    return forwardItemMixingRule;
  }
  public void setForwardItemMixingRule(String forwardItemMixingRule) {
    this.forwardItemMixingRule = forwardItemMixingRule;
  }

  
  /**
   **/
  public Item storageItemMixingRule(String storageItemMixingRule) {
    this.storageItemMixingRule = storageItemMixingRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("storageItemMixingRule")
  public String getStorageItemMixingRule() {
    return storageItemMixingRule;
  }
  public void setStorageItemMixingRule(String storageItemMixingRule) {
    this.storageItemMixingRule = storageItemMixingRule;
  }

  
  /**
   **/
  public Item allocationRule(String allocationRule) {
    this.allocationRule = allocationRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("allocationRule")
  public String getAllocationRule() {
    return allocationRule;
  }
  public void setAllocationRule(String allocationRule) {
    this.allocationRule = allocationRule;
  }

  
  /**
   **/
  public Item barcodeField(String barcodeField) {
    this.barcodeField = barcodeField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("barcodeField")
  public String getBarcodeField() {
    return barcodeField;
  }
  public void setBarcodeField(String barcodeField) {
    this.barcodeField = barcodeField;
  }

  
  /**
   **/
  public Item warehouseDisplayField(String warehouseDisplayField) {
    this.warehouseDisplayField = warehouseDisplayField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseDisplayField")
  public String getWarehouseDisplayField() {
    return warehouseDisplayField;
  }
  public void setWarehouseDisplayField(String warehouseDisplayField) {
    this.warehouseDisplayField = warehouseDisplayField;
  }

  
  /**
   **/
  public Item productIdTagSchemeId(Integer productIdTagSchemeId) {
    this.productIdTagSchemeId = productIdTagSchemeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("productIdTagSchemeId")
  public Integer getProductIdTagSchemeId() {
    return productIdTagSchemeId;
  }
  public void setProductIdTagSchemeId(Integer productIdTagSchemeId) {
    this.productIdTagSchemeId = productIdTagSchemeId;
  }

  
  /**
   **/
  public Item hazmat(String hazmat) {
    this.hazmat = hazmat;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("hazmat")
  public String getHazmat() {
    return hazmat;
  }
  public void setHazmat(String hazmat) {
    this.hazmat = hazmat;
  }

  
  /**
   **/
  public Item isAlcohol(Boolean isAlcohol) {
    this.isAlcohol = isAlcohol;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isAlcohol")
  public Boolean getIsAlcohol() {
    return isAlcohol;
  }
  public void setIsAlcohol(Boolean isAlcohol) {
    this.isAlcohol = isAlcohol;
  }

  
  /**
   **/
  public Item alcoholType(String alcoholType) {
    this.alcoholType = alcoholType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholType")
  public String getAlcoholType() {
    return alcoholType;
  }
  public void setAlcoholType(String alcoholType) {
    this.alcoholType = alcoholType;
  }

  
  /**
   **/
  public Item alcoholContent(BigDecimal alcoholContent) {
    this.alcoholContent = alcoholContent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholContent")
  public BigDecimal getAlcoholContent() {
    return alcoholContent;
  }
  public void setAlcoholContent(BigDecimal alcoholContent) {
    this.alcoholContent = alcoholContent;
  }

  
  /**
   **/
  public Item alcoholContainer(String alcoholContainer) {
    this.alcoholContainer = alcoholContainer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholContainer")
  public String getAlcoholContainer() {
    return alcoholContainer;
  }
  public void setAlcoholContainer(String alcoholContainer) {
    this.alcoholContainer = alcoholContainer;
  }

  
  /**
   **/
  public Item alcoholVintageYear(String alcoholVintageYear) {
    this.alcoholVintageYear = alcoholVintageYear;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholVintageYear")
  public String getAlcoholVintageYear() {
    return alcoholVintageYear;
  }
  public void setAlcoholVintageYear(String alcoholVintageYear) {
    this.alcoholVintageYear = alcoholVintageYear;
  }

  
  /**
   **/
  public Item alcoholCountry(String alcoholCountry) {
    this.alcoholCountry = alcoholCountry;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholCountry")
  public String getAlcoholCountry() {
    return alcoholCountry;
  }
  public void setAlcoholCountry(String alcoholCountry) {
    this.alcoholCountry = alcoholCountry;
  }

  
  /**
   **/
  public Item alcoholState(String alcoholState) {
    this.alcoholState = alcoholState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholState")
  public String getAlcoholState() {
    return alcoholState;
  }
  public void setAlcoholState(String alcoholState) {
    this.alcoholState = alcoholState;
  }

  
  /**
   **/
  public Item alcoholRegion(String alcoholRegion) {
    this.alcoholRegion = alcoholRegion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholRegion")
  public String getAlcoholRegion() {
    return alcoholRegion;
  }
  public void setAlcoholRegion(String alcoholRegion) {
    this.alcoholRegion = alcoholRegion;
  }

  
  /**
   **/
  public Item alcoholBrand(String alcoholBrand) {
    this.alcoholBrand = alcoholBrand;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholBrand")
  public String getAlcoholBrand() {
    return alcoholBrand;
  }
  public void setAlcoholBrand(String alcoholBrand) {
    this.alcoholBrand = alcoholBrand;
  }

  
  /**
   **/
  public Item alcoholUPCCode(String alcoholUPCCode) {
    this.alcoholUPCCode = alcoholUPCCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholUPCCode")
  public String getAlcoholUPCCode() {
    return alcoholUPCCode;
  }
  public void setAlcoholUPCCode(String alcoholUPCCode) {
    this.alcoholUPCCode = alcoholUPCCode;
  }

  
  /**
   **/
  public Item alcoholNAMBCACode(String alcoholNAMBCACode) {
    this.alcoholNAMBCACode = alcoholNAMBCACode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholNAMBCACode")
  public String getAlcoholNAMBCACode() {
    return alcoholNAMBCACode;
  }
  public void setAlcoholNAMBCACode(String alcoholNAMBCACode) {
    this.alcoholNAMBCACode = alcoholNAMBCACode;
  }

  
  /**
   **/
  public Item alcoholUNIMERCCode(String alcoholUNIMERCCode) {
    this.alcoholUNIMERCCode = alcoholUNIMERCCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholUNIMERCCode")
  public String getAlcoholUNIMERCCode() {
    return alcoholUNIMERCCode;
  }
  public void setAlcoholUNIMERCCode(String alcoholUNIMERCCode) {
    this.alcoholUNIMERCCode = alcoholUNIMERCCode;
  }

  
  /**
   **/
  public Item alcoholSCCCode(String alcoholSCCCode) {
    this.alcoholSCCCode = alcoholSCCCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholSCCCode")
  public String getAlcoholSCCCode() {
    return alcoholSCCCode;
  }
  public void setAlcoholSCCCode(String alcoholSCCCode) {
    this.alcoholSCCCode = alcoholSCCCode;
  }

  
  /**
   **/
  public Item length(BigDecimal length) {
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
  public Item width(BigDecimal width) {
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
  public Item height(BigDecimal height) {
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
  public Item topUp(Boolean topUp) {
    this.topUp = topUp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("topUp")
  public Boolean getTopUp() {
    return topUp;
  }
  public void setTopUp(Boolean topUp) {
    this.topUp = topUp;
  }

  
  /**
   **/
  public Item shipSolo(Boolean shipSolo) {
    this.shipSolo = shipSolo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipSolo")
  public Boolean getShipSolo() {
    return shipSolo;
  }
  public void setShipSolo(Boolean shipSolo) {
    this.shipSolo = shipSolo;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inventoryUpdateTimestamp")
  public Date getInventoryUpdateTimestamp() {
    return inventoryUpdateTimestamp;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("availableQuantity")
  public Integer getAvailableQuantity() {
    return availableQuantity;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("damagedQuantity")
  public Integer getDamagedQuantity() {
    return damagedQuantity;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inFulfillmentProcessQuantity")
  public Integer getInFulfillmentProcessQuantity() {
    return inFulfillmentProcessQuantity;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("onHandQuantity")
  public Integer getOnHandQuantity() {
    return onHandQuantity;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("openOrderQuantity")
  public Integer getOpenOrderQuantity() {
    return openOrderQuantity;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("openPOQuantity")
  public Integer getOpenPOQuantity() {
    return openPOQuantity;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderableQuantity")
  public Integer getOrderableQuantity() {
    return orderableQuantity;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unallocatableQuantity")
  public Integer getUnallocatableQuantity() {
    return unallocatableQuantity;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unavailableQuantity")
  public Integer getUnavailableQuantity() {
    return unavailableQuantity;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("overallDaysOnHand")
  public Integer getOverallDaysOnHand() {
    return overallDaysOnHand;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("overallStockStatus")
  public String getOverallStockStatus() {
    return overallStockStatus;
  }

  
  /**
   **/
  public Item customFields(Map<String, Object> customFields) {
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
    Item item = (Item) o;
    return Objects.equals(this.id, item.id) &&
        Objects.equals(this.accountCodeId, item.accountCodeId) &&
        Objects.equals(this.lowStockContactId, item.lowStockContactId) &&
        Objects.equals(this.legacyLowLevelContactId, item.legacyLowLevelContactId) &&
        Objects.equals(this.lowStockCodeId, item.lowStockCodeId) &&
        Objects.equals(this.majorGroupId, item.majorGroupId) &&
        Objects.equals(this.subGroupId, item.subGroupId) &&
        Objects.equals(this.productCodeId, item.productCodeId) &&
        Objects.equals(this.summaryCodeId, item.summaryCodeId) &&
        Objects.equals(this.buyerId, item.buyerId) &&
        Objects.equals(this.lobId, item.lobId) &&
        Objects.equals(this.sku, item.sku) &&
        Objects.equals(this.vendorSKU, item.vendorSKU) &&
        Objects.equals(this.upc, item.upc) &&
        Objects.equals(this.itemDescription, item.itemDescription) &&
        Objects.equals(this.packingSlipDescription, item.packingSlipDescription) &&
        Objects.equals(this.absoluteMax, item.absoluteMax) &&
        Objects.equals(this.additionalDescription, item.additionalDescription) &&
        Objects.equals(this.backorder, item.backorder) &&
        Objects.equals(this.chargeCode, item.chargeCode) &&
        Objects.equals(this.commodityCode, item.commodityCode) &&
        Objects.equals(this.compCode, item.compCode) &&
        Objects.equals(this.createDate, item.createDate) &&
        Objects.equals(this.criticalAmount, item.criticalAmount) &&
        Objects.equals(this.overallFixedReorderPoint, item.overallFixedReorderPoint) &&
        Objects.equals(this.overallLeadTime, item.overallLeadTime) &&
        Objects.equals(this.sellPrice, item.sellPrice) &&
        Objects.equals(this.pricingPer, item.pricingPer) &&
        Objects.equals(this.lotControlFlag, item.lotControlFlag) &&
        Objects.equals(this.maxCycle, item.maxCycle) &&
        Objects.equals(this.maxInterim, item.maxInterim) &&
        Objects.equals(this.numericSortOrder, item.numericSortOrder) &&
        Objects.equals(this.outsideVendor, item.outsideVendor) &&
        Objects.equals(this.pickNo, item.pickNo) &&
        Objects.equals(this.podOrderSuffix, item.podOrderSuffix) &&
        Objects.equals(this.podRevDate, item.podRevDate) &&
        Objects.equals(this.status, item.status) &&
        Objects.equals(this.seasonalItem, item.seasonalItem) &&
        Objects.equals(this.requiresProductionLot, item.requiresProductionLot) &&
        Objects.equals(this.sector, item.sector) &&
        Objects.equals(this.secure, item.secure) &&
        Objects.equals(this.serialCode, item.serialCode) &&
        Objects.equals(this.unitCode, item.unitCode) &&
        Objects.equals(this.unitsPerWrap, item.unitsPerWrap) &&
        Objects.equals(this.weightPerWrap, item.weightPerWrap) &&
        Objects.equals(this.voidDate, item.voidDate) &&
        Objects.equals(this.wrapCode, item.wrapCode) &&
        Objects.equals(this.extrinsicText1, item.extrinsicText1) &&
        Objects.equals(this.extrinsicText2, item.extrinsicText2) &&
        Objects.equals(this.extrinsicText3, item.extrinsicText3) &&
        Objects.equals(this.extrinsicNumber1, item.extrinsicNumber1) &&
        Objects.equals(this.extrinsicNumber2, item.extrinsicNumber2) &&
        Objects.equals(this.extrinsicDecimal1, item.extrinsicDecimal1) &&
        Objects.equals(this.extrinsicDecimal2, item.extrinsicDecimal2) &&
        Objects.equals(this.casebreakEnabled, item.casebreakEnabled) &&
        Objects.equals(this.vendorId, item.vendorId) &&
        Objects.equals(this.vendorPrice, item.vendorPrice) &&
        Objects.equals(this.vendorPer, item.vendorPer) &&
        Objects.equals(this.modifyDate, item.modifyDate) &&
        Objects.equals(this.forwardLotMixingRule, item.forwardLotMixingRule) &&
        Objects.equals(this.storageLotMixingRule, item.storageLotMixingRule) &&
        Objects.equals(this.forwardItemMixingRule, item.forwardItemMixingRule) &&
        Objects.equals(this.storageItemMixingRule, item.storageItemMixingRule) &&
        Objects.equals(this.allocationRule, item.allocationRule) &&
        Objects.equals(this.barcodeField, item.barcodeField) &&
        Objects.equals(this.warehouseDisplayField, item.warehouseDisplayField) &&
        Objects.equals(this.productIdTagSchemeId, item.productIdTagSchemeId) &&
        Objects.equals(this.hazmat, item.hazmat) &&
        Objects.equals(this.isAlcohol, item.isAlcohol) &&
        Objects.equals(this.alcoholType, item.alcoholType) &&
        Objects.equals(this.alcoholContent, item.alcoholContent) &&
        Objects.equals(this.alcoholContainer, item.alcoholContainer) &&
        Objects.equals(this.alcoholVintageYear, item.alcoholVintageYear) &&
        Objects.equals(this.alcoholCountry, item.alcoholCountry) &&
        Objects.equals(this.alcoholState, item.alcoholState) &&
        Objects.equals(this.alcoholRegion, item.alcoholRegion) &&
        Objects.equals(this.alcoholBrand, item.alcoholBrand) &&
        Objects.equals(this.alcoholUPCCode, item.alcoholUPCCode) &&
        Objects.equals(this.alcoholNAMBCACode, item.alcoholNAMBCACode) &&
        Objects.equals(this.alcoholUNIMERCCode, item.alcoholUNIMERCCode) &&
        Objects.equals(this.alcoholSCCCode, item.alcoholSCCCode) &&
        Objects.equals(this.length, item.length) &&
        Objects.equals(this.width, item.width) &&
        Objects.equals(this.height, item.height) &&
        Objects.equals(this.topUp, item.topUp) &&
        Objects.equals(this.shipSolo, item.shipSolo) &&
        Objects.equals(this.inventoryUpdateTimestamp, item.inventoryUpdateTimestamp) &&
        Objects.equals(this.availableQuantity, item.availableQuantity) &&
        Objects.equals(this.damagedQuantity, item.damagedQuantity) &&
        Objects.equals(this.inFulfillmentProcessQuantity, item.inFulfillmentProcessQuantity) &&
        Objects.equals(this.onHandQuantity, item.onHandQuantity) &&
        Objects.equals(this.openOrderQuantity, item.openOrderQuantity) &&
        Objects.equals(this.openPOQuantity, item.openPOQuantity) &&
        Objects.equals(this.orderableQuantity, item.orderableQuantity) &&
        Objects.equals(this.unallocatableQuantity, item.unallocatableQuantity) &&
        Objects.equals(this.unavailableQuantity, item.unavailableQuantity) &&
        Objects.equals(this.overallDaysOnHand, item.overallDaysOnHand) &&
        Objects.equals(this.overallStockStatus, item.overallStockStatus) &&
        Objects.equals(this.customFields, item.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountCodeId, lowStockContactId, legacyLowLevelContactId, lowStockCodeId, majorGroupId, subGroupId, productCodeId, summaryCodeId, buyerId, lobId, sku, vendorSKU, upc, itemDescription, packingSlipDescription, absoluteMax, additionalDescription, backorder, chargeCode, commodityCode, compCode, createDate, criticalAmount, overallFixedReorderPoint, overallLeadTime, sellPrice, pricingPer, lotControlFlag, maxCycle, maxInterim, numericSortOrder, outsideVendor, pickNo, podOrderSuffix, podRevDate, status, seasonalItem, requiresProductionLot, sector, secure, serialCode, unitCode, unitsPerWrap, weightPerWrap, voidDate, wrapCode, extrinsicText1, extrinsicText2, extrinsicText3, extrinsicNumber1, extrinsicNumber2, extrinsicDecimal1, extrinsicDecimal2, casebreakEnabled, vendorId, vendorPrice, vendorPer, modifyDate, forwardLotMixingRule, storageLotMixingRule, forwardItemMixingRule, storageItemMixingRule, allocationRule, barcodeField, warehouseDisplayField, productIdTagSchemeId, hazmat, isAlcohol, alcoholType, alcoholContent, alcoholContainer, alcoholVintageYear, alcoholCountry, alcoholState, alcoholRegion, alcoholBrand, alcoholUPCCode, alcoholNAMBCACode, alcoholUNIMERCCode, alcoholSCCCode, length, width, height, topUp, shipSolo, inventoryUpdateTimestamp, availableQuantity, damagedQuantity, inFulfillmentProcessQuantity, onHandQuantity, openOrderQuantity, openPOQuantity, orderableQuantity, unallocatableQuantity, unavailableQuantity, overallDaysOnHand, overallStockStatus, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountCodeId: ").append(toIndentedString(accountCodeId)).append("\n");
    sb.append("    lowStockContactId: ").append(toIndentedString(lowStockContactId)).append("\n");
    sb.append("    legacyLowLevelContactId: ").append(toIndentedString(legacyLowLevelContactId)).append("\n");
    sb.append("    lowStockCodeId: ").append(toIndentedString(lowStockCodeId)).append("\n");
    sb.append("    majorGroupId: ").append(toIndentedString(majorGroupId)).append("\n");
    sb.append("    subGroupId: ").append(toIndentedString(subGroupId)).append("\n");
    sb.append("    productCodeId: ").append(toIndentedString(productCodeId)).append("\n");
    sb.append("    summaryCodeId: ").append(toIndentedString(summaryCodeId)).append("\n");
    sb.append("    buyerId: ").append(toIndentedString(buyerId)).append("\n");
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
    sb.append("    sellPrice: ").append(toIndentedString(sellPrice)).append("\n");
    sb.append("    pricingPer: ").append(toIndentedString(pricingPer)).append("\n");
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
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    vendorPrice: ").append(toIndentedString(vendorPrice)).append("\n");
    sb.append("    vendorPer: ").append(toIndentedString(vendorPer)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    forwardLotMixingRule: ").append(toIndentedString(forwardLotMixingRule)).append("\n");
    sb.append("    storageLotMixingRule: ").append(toIndentedString(storageLotMixingRule)).append("\n");
    sb.append("    forwardItemMixingRule: ").append(toIndentedString(forwardItemMixingRule)).append("\n");
    sb.append("    storageItemMixingRule: ").append(toIndentedString(storageItemMixingRule)).append("\n");
    sb.append("    allocationRule: ").append(toIndentedString(allocationRule)).append("\n");
    sb.append("    barcodeField: ").append(toIndentedString(barcodeField)).append("\n");
    sb.append("    warehouseDisplayField: ").append(toIndentedString(warehouseDisplayField)).append("\n");
    sb.append("    productIdTagSchemeId: ").append(toIndentedString(productIdTagSchemeId)).append("\n");
    sb.append("    hazmat: ").append(toIndentedString(hazmat)).append("\n");
    sb.append("    isAlcohol: ").append(toIndentedString(isAlcohol)).append("\n");
    sb.append("    alcoholType: ").append(toIndentedString(alcoholType)).append("\n");
    sb.append("    alcoholContent: ").append(toIndentedString(alcoholContent)).append("\n");
    sb.append("    alcoholContainer: ").append(toIndentedString(alcoholContainer)).append("\n");
    sb.append("    alcoholVintageYear: ").append(toIndentedString(alcoholVintageYear)).append("\n");
    sb.append("    alcoholCountry: ").append(toIndentedString(alcoholCountry)).append("\n");
    sb.append("    alcoholState: ").append(toIndentedString(alcoholState)).append("\n");
    sb.append("    alcoholRegion: ").append(toIndentedString(alcoholRegion)).append("\n");
    sb.append("    alcoholBrand: ").append(toIndentedString(alcoholBrand)).append("\n");
    sb.append("    alcoholUPCCode: ").append(toIndentedString(alcoholUPCCode)).append("\n");
    sb.append("    alcoholNAMBCACode: ").append(toIndentedString(alcoholNAMBCACode)).append("\n");
    sb.append("    alcoholUNIMERCCode: ").append(toIndentedString(alcoholUNIMERCCode)).append("\n");
    sb.append("    alcoholSCCCode: ").append(toIndentedString(alcoholSCCCode)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    topUp: ").append(toIndentedString(topUp)).append("\n");
    sb.append("    shipSolo: ").append(toIndentedString(shipSolo)).append("\n");
    sb.append("    inventoryUpdateTimestamp: ").append(toIndentedString(inventoryUpdateTimestamp)).append("\n");
    sb.append("    availableQuantity: ").append(toIndentedString(availableQuantity)).append("\n");
    sb.append("    damagedQuantity: ").append(toIndentedString(damagedQuantity)).append("\n");
    sb.append("    inFulfillmentProcessQuantity: ").append(toIndentedString(inFulfillmentProcessQuantity)).append("\n");
    sb.append("    onHandQuantity: ").append(toIndentedString(onHandQuantity)).append("\n");
    sb.append("    openOrderQuantity: ").append(toIndentedString(openOrderQuantity)).append("\n");
    sb.append("    openPOQuantity: ").append(toIndentedString(openPOQuantity)).append("\n");
    sb.append("    orderableQuantity: ").append(toIndentedString(orderableQuantity)).append("\n");
    sb.append("    unallocatableQuantity: ").append(toIndentedString(unallocatableQuantity)).append("\n");
    sb.append("    unavailableQuantity: ").append(toIndentedString(unavailableQuantity)).append("\n");
    sb.append("    overallDaysOnHand: ").append(toIndentedString(overallDaysOnHand)).append("\n");
    sb.append("    overallStockStatus: ").append(toIndentedString(overallStockStatus)).append("\n");
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

