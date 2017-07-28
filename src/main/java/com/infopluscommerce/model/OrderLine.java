package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class OrderLine   {
  
  private Integer id = null;
  private BigDecimal orderNo = null;
  private Integer lobId = null;
  private String sku = null;
  private Integer poNoId = null;
  private Integer orderedQty = null;
  private Integer allowedQty = null;
  private Integer shippedQty = null;
  private Integer backorderQty = null;
  private String revDate = null;
  private String chargeCode = null;
  private String distributionCode = null;
  private String upc = null;
  private String vendorSKU = null;
  private String orderSourceSKU = null;
  private BigDecimal unitCost = null;
  private BigDecimal unitSell = null;
  private BigDecimal unitDiscount = null;
  private BigDecimal extendedCost = null;
  private BigDecimal extendedSell = null;
  private BigDecimal extendedDiscount = null;
  private BigDecimal ncExtendedSell = null;
  private BigDecimal itemWeight = null;
  private String productionLot = null;
  private BigDecimal weightPerWrap = null;
  private String sector = null;
  private String orderAssemblyInstructions = null;
  private Integer itemAccountCodeId = null;
  private Integer itemLegacyLowStockContactId = null;
  private Integer itemMajorGroupId = null;
  private Integer itemSubGroupId = null;
  private Integer itemProductCodeId = null;
  private Integer itemSummaryCodeId = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("orderNo")
  public BigDecimal getOrderNo() {
    return orderNo;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
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
  @JsonProperty("revDate")
  public String getRevDate() {
    return revDate;
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
  @JsonProperty("weightPerWrap")
  public BigDecimal getWeightPerWrap() {
    return weightPerWrap;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sector")
  public String getSector() {
    return sector;
  }

  
  /**
   **/
  public OrderLine orderAssemblyInstructions(String orderAssemblyInstructions) {
    this.orderAssemblyInstructions = orderAssemblyInstructions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderAssemblyInstructions")
  public String getOrderAssemblyInstructions() {
    return orderAssemblyInstructions;
  }
  public void setOrderAssemblyInstructions(String orderAssemblyInstructions) {
    this.orderAssemblyInstructions = orderAssemblyInstructions;
  }

  
  /**
   **/
  public OrderLine itemAccountCodeId(Integer itemAccountCodeId) {
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

  
  /**
   **/
  public OrderLine itemLegacyLowStockContactId(Integer itemLegacyLowStockContactId) {
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

  
  /**
   **/
  public OrderLine itemMajorGroupId(Integer itemMajorGroupId) {
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

  
  /**
   **/
  public OrderLine itemSubGroupId(Integer itemSubGroupId) {
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

  
  /**
   **/
  public OrderLine itemProductCodeId(Integer itemProductCodeId) {
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

  
  /**
   **/
  public OrderLine itemSummaryCodeId(Integer itemSummaryCodeId) {
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

  
  /**
   **/
  public OrderLine customFields(Map<String, Object> customFields) {
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
    OrderLine orderLine = (OrderLine) o;
    return Objects.equals(this.id, orderLine.id) &&
        Objects.equals(this.orderNo, orderLine.orderNo) &&
        Objects.equals(this.lobId, orderLine.lobId) &&
        Objects.equals(this.sku, orderLine.sku) &&
        Objects.equals(this.poNoId, orderLine.poNoId) &&
        Objects.equals(this.orderedQty, orderLine.orderedQty) &&
        Objects.equals(this.allowedQty, orderLine.allowedQty) &&
        Objects.equals(this.shippedQty, orderLine.shippedQty) &&
        Objects.equals(this.backorderQty, orderLine.backorderQty) &&
        Objects.equals(this.revDate, orderLine.revDate) &&
        Objects.equals(this.chargeCode, orderLine.chargeCode) &&
        Objects.equals(this.distributionCode, orderLine.distributionCode) &&
        Objects.equals(this.upc, orderLine.upc) &&
        Objects.equals(this.vendorSKU, orderLine.vendorSKU) &&
        Objects.equals(this.orderSourceSKU, orderLine.orderSourceSKU) &&
        Objects.equals(this.unitCost, orderLine.unitCost) &&
        Objects.equals(this.unitSell, orderLine.unitSell) &&
        Objects.equals(this.unitDiscount, orderLine.unitDiscount) &&
        Objects.equals(this.extendedCost, orderLine.extendedCost) &&
        Objects.equals(this.extendedSell, orderLine.extendedSell) &&
        Objects.equals(this.extendedDiscount, orderLine.extendedDiscount) &&
        Objects.equals(this.ncExtendedSell, orderLine.ncExtendedSell) &&
        Objects.equals(this.itemWeight, orderLine.itemWeight) &&
        Objects.equals(this.productionLot, orderLine.productionLot) &&
        Objects.equals(this.weightPerWrap, orderLine.weightPerWrap) &&
        Objects.equals(this.sector, orderLine.sector) &&
        Objects.equals(this.orderAssemblyInstructions, orderLine.orderAssemblyInstructions) &&
        Objects.equals(this.itemAccountCodeId, orderLine.itemAccountCodeId) &&
        Objects.equals(this.itemLegacyLowStockContactId, orderLine.itemLegacyLowStockContactId) &&
        Objects.equals(this.itemMajorGroupId, orderLine.itemMajorGroupId) &&
        Objects.equals(this.itemSubGroupId, orderLine.itemSubGroupId) &&
        Objects.equals(this.itemProductCodeId, orderLine.itemProductCodeId) &&
        Objects.equals(this.itemSummaryCodeId, orderLine.itemSummaryCodeId) &&
        Objects.equals(this.customFields, orderLine.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderNo, lobId, sku, poNoId, orderedQty, allowedQty, shippedQty, backorderQty, revDate, chargeCode, distributionCode, upc, vendorSKU, orderSourceSKU, unitCost, unitSell, unitDiscount, extendedCost, extendedSell, extendedDiscount, ncExtendedSell, itemWeight, productionLot, weightPerWrap, sector, orderAssemblyInstructions, itemAccountCodeId, itemLegacyLowStockContactId, itemMajorGroupId, itemSubGroupId, itemProductCodeId, itemSummaryCodeId, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLine {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    poNoId: ").append(toIndentedString(poNoId)).append("\n");
    sb.append("    orderedQty: ").append(toIndentedString(orderedQty)).append("\n");
    sb.append("    allowedQty: ").append(toIndentedString(allowedQty)).append("\n");
    sb.append("    shippedQty: ").append(toIndentedString(shippedQty)).append("\n");
    sb.append("    backorderQty: ").append(toIndentedString(backorderQty)).append("\n");
    sb.append("    revDate: ").append(toIndentedString(revDate)).append("\n");
    sb.append("    chargeCode: ").append(toIndentedString(chargeCode)).append("\n");
    sb.append("    distributionCode: ").append(toIndentedString(distributionCode)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    vendorSKU: ").append(toIndentedString(vendorSKU)).append("\n");
    sb.append("    orderSourceSKU: ").append(toIndentedString(orderSourceSKU)).append("\n");
    sb.append("    unitCost: ").append(toIndentedString(unitCost)).append("\n");
    sb.append("    unitSell: ").append(toIndentedString(unitSell)).append("\n");
    sb.append("    unitDiscount: ").append(toIndentedString(unitDiscount)).append("\n");
    sb.append("    extendedCost: ").append(toIndentedString(extendedCost)).append("\n");
    sb.append("    extendedSell: ").append(toIndentedString(extendedSell)).append("\n");
    sb.append("    extendedDiscount: ").append(toIndentedString(extendedDiscount)).append("\n");
    sb.append("    ncExtendedSell: ").append(toIndentedString(ncExtendedSell)).append("\n");
    sb.append("    itemWeight: ").append(toIndentedString(itemWeight)).append("\n");
    sb.append("    productionLot: ").append(toIndentedString(productionLot)).append("\n");
    sb.append("    weightPerWrap: ").append(toIndentedString(weightPerWrap)).append("\n");
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
    sb.append("    orderAssemblyInstructions: ").append(toIndentedString(orderAssemblyInstructions)).append("\n");
    sb.append("    itemAccountCodeId: ").append(toIndentedString(itemAccountCodeId)).append("\n");
    sb.append("    itemLegacyLowStockContactId: ").append(toIndentedString(itemLegacyLowStockContactId)).append("\n");
    sb.append("    itemMajorGroupId: ").append(toIndentedString(itemMajorGroupId)).append("\n");
    sb.append("    itemSubGroupId: ").append(toIndentedString(itemSubGroupId)).append("\n");
    sb.append("    itemProductCodeId: ").append(toIndentedString(itemProductCodeId)).append("\n");
    sb.append("    itemSummaryCodeId: ").append(toIndentedString(itemSummaryCodeId)).append("\n");
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

