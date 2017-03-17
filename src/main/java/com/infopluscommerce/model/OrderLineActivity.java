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
public class OrderLineActivity   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private BigDecimal orderNo = null;
  private Integer lobId = null;
  private String sku = null;
  private Integer poNoId = null;
  private Integer crossDock = null;
  private Integer processNo = null;
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
  @JsonProperty("crossDock")
  public Integer getCrossDock() {
    return crossDock;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("processNo")
  public Integer getProcessNo() {
    return processNo;
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
        Objects.equals(this.crossDock, orderLineActivity.crossDock) &&
        Objects.equals(this.processNo, orderLineActivity.processNo) &&
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
        Objects.equals(this.customFields, orderLineActivity.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, orderNo, lobId, sku, poNoId, crossDock, processNo, orderedQty, allowedQty, shippedQty, backorderQty, adjustCode, processFlag, revDate, restrictionRule, unitCost, unitSell, unitDiscount, extendedCost, extendedSell, extendedDiscount, ncExtendedSell, per, chargeCode, distributionCode, upc, vendorSKU, orderSourceSKU, itemMajorGroupId, masterMajorGroupName, itemSubGroupId, masterSubGroupName, itemProductCodeId, masterProductionCodeName, itemAccountCodeId, masterAccountCodeName, itemSummaryCodeId, masterSummaryCodeName, itemLegacyLowStockContactId, lowStockContactName, sector, weightPerWrap, itemWeight, productionLot, customFields);
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
    sb.append("    crossDock: ").append(toIndentedString(crossDock)).append("\n");
    sb.append("    processNo: ").append(toIndentedString(processNo)).append("\n");
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

