package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class OrderLine   {
  
  private Integer id = null;
  private Double orderNo = null;
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
  private Double unitCost = null;
  private Double unitSell = null;
  private Double extendedCost = null;
  private Double extendedSell = null;
  private Double ncExtendedSell = null;
  private Double itemWeight = null;
  private Double weightPerWrap = null;
  private String sector = null;
  private String accountCode = null;
  private String lowStockContact = null;
  private String majorGroup = null;
  private String subGroup = null;
  private String productionCode = null;
  private String summaryCode = null;

  
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("orderNo")
  public Double getOrderNo() {
    return orderNo;
  }
  public void setOrderNo(Double orderNo) {
    this.orderNo = orderNo;
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
  @JsonProperty("poNoId")
  public Integer getPoNoId() {
    return poNoId;
  }
  public void setPoNoId(Integer poNoId) {
    this.poNoId = poNoId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderedQty")
  public Integer getOrderedQty() {
    return orderedQty;
  }
  public void setOrderedQty(Integer orderedQty) {
    this.orderedQty = orderedQty;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowedQty")
  public Integer getAllowedQty() {
    return allowedQty;
  }
  public void setAllowedQty(Integer allowedQty) {
    this.allowedQty = allowedQty;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shippedQty")
  public Integer getShippedQty() {
    return shippedQty;
  }
  public void setShippedQty(Integer shippedQty) {
    this.shippedQty = shippedQty;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("backorderQty")
  public Integer getBackorderQty() {
    return backorderQty;
  }
  public void setBackorderQty(Integer backorderQty) {
    this.backorderQty = backorderQty;
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
  @JsonProperty("distributionCode")
  public String getDistributionCode() {
    return distributionCode;
  }
  public void setDistributionCode(String distributionCode) {
    this.distributionCode = distributionCode;
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
  @JsonProperty("orderSourceSKU")
  public String getOrderSourceSKU() {
    return orderSourceSKU;
  }
  public void setOrderSourceSKU(String orderSourceSKU) {
    this.orderSourceSKU = orderSourceSKU;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unitCost")
  public Double getUnitCost() {
    return unitCost;
  }
  public void setUnitCost(Double unitCost) {
    this.unitCost = unitCost;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unitSell")
  public Double getUnitSell() {
    return unitSell;
  }
  public void setUnitSell(Double unitSell) {
    this.unitSell = unitSell;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extendedCost")
  public Double getExtendedCost() {
    return extendedCost;
  }
  public void setExtendedCost(Double extendedCost) {
    this.extendedCost = extendedCost;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extendedSell")
  public Double getExtendedSell() {
    return extendedSell;
  }
  public void setExtendedSell(Double extendedSell) {
    this.extendedSell = extendedSell;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ncExtendedSell")
  public Double getNcExtendedSell() {
    return ncExtendedSell;
  }
  public void setNcExtendedSell(Double ncExtendedSell) {
    this.ncExtendedSell = ncExtendedSell;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("itemWeight")
  public Double getItemWeight() {
    return itemWeight;
  }
  public void setItemWeight(Double itemWeight) {
    this.itemWeight = itemWeight;
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
  @JsonProperty("accountCode")
  public String getAccountCode() {
    return accountCode;
  }
  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("lowStockContact")
  public String getLowStockContact() {
    return lowStockContact;
  }
  public void setLowStockContact(String lowStockContact) {
    this.lowStockContact = lowStockContact;
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("summaryCode")
  public String getSummaryCode() {
    return summaryCode;
  }
  public void setSummaryCode(String summaryCode) {
    this.summaryCode = summaryCode;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLine orderLine = (OrderLine) o;
    return Objects.equals(id, orderLine.id) &&
        Objects.equals(orderNo, orderLine.orderNo) &&
        Objects.equals(lobId, orderLine.lobId) &&
        Objects.equals(sku, orderLine.sku) &&
        Objects.equals(poNoId, orderLine.poNoId) &&
        Objects.equals(orderedQty, orderLine.orderedQty) &&
        Objects.equals(allowedQty, orderLine.allowedQty) &&
        Objects.equals(shippedQty, orderLine.shippedQty) &&
        Objects.equals(backorderQty, orderLine.backorderQty) &&
        Objects.equals(revDate, orderLine.revDate) &&
        Objects.equals(chargeCode, orderLine.chargeCode) &&
        Objects.equals(distributionCode, orderLine.distributionCode) &&
        Objects.equals(upc, orderLine.upc) &&
        Objects.equals(vendorSKU, orderLine.vendorSKU) &&
        Objects.equals(orderSourceSKU, orderLine.orderSourceSKU) &&
        Objects.equals(unitCost, orderLine.unitCost) &&
        Objects.equals(unitSell, orderLine.unitSell) &&
        Objects.equals(extendedCost, orderLine.extendedCost) &&
        Objects.equals(extendedSell, orderLine.extendedSell) &&
        Objects.equals(ncExtendedSell, orderLine.ncExtendedSell) &&
        Objects.equals(itemWeight, orderLine.itemWeight) &&
        Objects.equals(weightPerWrap, orderLine.weightPerWrap) &&
        Objects.equals(sector, orderLine.sector) &&
        Objects.equals(accountCode, orderLine.accountCode) &&
        Objects.equals(lowStockContact, orderLine.lowStockContact) &&
        Objects.equals(majorGroup, orderLine.majorGroup) &&
        Objects.equals(subGroup, orderLine.subGroup) &&
        Objects.equals(productionCode, orderLine.productionCode) &&
        Objects.equals(summaryCode, orderLine.summaryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderNo, lobId, sku, poNoId, orderedQty, allowedQty, shippedQty, backorderQty, revDate, chargeCode, distributionCode, upc, vendorSKU, orderSourceSKU, unitCost, unitSell, extendedCost, extendedSell, ncExtendedSell, itemWeight, weightPerWrap, sector, accountCode, lowStockContact, majorGroup, subGroup, productionCode, summaryCode);
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
    sb.append("    extendedCost: ").append(toIndentedString(extendedCost)).append("\n");
    sb.append("    extendedSell: ").append(toIndentedString(extendedSell)).append("\n");
    sb.append("    ncExtendedSell: ").append(toIndentedString(ncExtendedSell)).append("\n");
    sb.append("    itemWeight: ").append(toIndentedString(itemWeight)).append("\n");
    sb.append("    weightPerWrap: ").append(toIndentedString(weightPerWrap)).append("\n");
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    lowStockContact: ").append(toIndentedString(lowStockContact)).append("\n");
    sb.append("    majorGroup: ").append(toIndentedString(majorGroup)).append("\n");
    sb.append("    subGroup: ").append(toIndentedString(subGroup)).append("\n");
    sb.append("    productionCode: ").append(toIndentedString(productionCode)).append("\n");
    sb.append("    summaryCode: ").append(toIndentedString(summaryCode)).append("\n");
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

