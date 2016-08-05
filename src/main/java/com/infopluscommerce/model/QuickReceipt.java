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





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-04T22:56:01.104-05:00")
public class QuickReceipt   {
  
  private Integer id = null;
  private Integer createdBy = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer warehouseId = null;
  private Integer lobId = null;
  private Integer locationId = null;
  private Integer quantity = null;
  private Integer vendorId = null;
  private String carrier = null;
  private String status = null;
  private String unitCode = null;
  private String wrapCode = null;
  private BigDecimal weightPerWrap = null;
  private Integer unitsPerWrap = null;
  private Integer unitsPerCase = null;
  private Integer casesPerPallet = null;
  private BigDecimal caseWeight = null;
  private String productionLot = null;
  private String revisionDate = null;
  private String origin = null;
  private BigDecimal cartonLength = null;
  private BigDecimal cartonWidth = null;
  private BigDecimal cartonHeight = null;
  private BigDecimal cost = null;
  private BigDecimal sell = null;
  private String pricingPer = null;
  private Integer generatedItemReceiptId = null;
  private Integer generatedASNId = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();
  private String sku = null;

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public Integer getCreatedBy() {
    return createdBy;
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
  public QuickReceipt warehouseId(Integer warehouseId) {
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
  public QuickReceipt lobId(Integer lobId) {
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
  public QuickReceipt locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("locationId")
  public Integer getLocationId() {
    return locationId;
  }
  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  
  /**
   **/
  public QuickReceipt quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  /**
   **/
  public QuickReceipt vendorId(Integer vendorId) {
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
  public QuickReceipt carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  
  /**
   **/
  public QuickReceipt unitCode(String unitCode) {
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
  public QuickReceipt wrapCode(String wrapCode) {
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
  public QuickReceipt weightPerWrap(BigDecimal weightPerWrap) {
    this.weightPerWrap = weightPerWrap;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("weightPerWrap")
  public BigDecimal getWeightPerWrap() {
    return weightPerWrap;
  }
  public void setWeightPerWrap(BigDecimal weightPerWrap) {
    this.weightPerWrap = weightPerWrap;
  }

  
  /**
   **/
  public QuickReceipt unitsPerWrap(Integer unitsPerWrap) {
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
  public QuickReceipt unitsPerCase(Integer unitsPerCase) {
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
  public QuickReceipt casesPerPallet(Integer casesPerPallet) {
    this.casesPerPallet = casesPerPallet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("casesPerPallet")
  public Integer getCasesPerPallet() {
    return casesPerPallet;
  }
  public void setCasesPerPallet(Integer casesPerPallet) {
    this.casesPerPallet = casesPerPallet;
  }

  
  /**
   **/
  public QuickReceipt caseWeight(BigDecimal caseWeight) {
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
  public QuickReceipt productionLot(String productionLot) {
    this.productionLot = productionLot;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("productionLot")
  public String getProductionLot() {
    return productionLot;
  }
  public void setProductionLot(String productionLot) {
    this.productionLot = productionLot;
  }

  
  /**
   **/
  public QuickReceipt revisionDate(String revisionDate) {
    this.revisionDate = revisionDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("revisionDate")
  public String getRevisionDate() {
    return revisionDate;
  }
  public void setRevisionDate(String revisionDate) {
    this.revisionDate = revisionDate;
  }

  
  /**
   **/
  public QuickReceipt origin(String origin) {
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
  public QuickReceipt cartonLength(BigDecimal cartonLength) {
    this.cartonLength = cartonLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cartonLength")
  public BigDecimal getCartonLength() {
    return cartonLength;
  }
  public void setCartonLength(BigDecimal cartonLength) {
    this.cartonLength = cartonLength;
  }

  
  /**
   **/
  public QuickReceipt cartonWidth(BigDecimal cartonWidth) {
    this.cartonWidth = cartonWidth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cartonWidth")
  public BigDecimal getCartonWidth() {
    return cartonWidth;
  }
  public void setCartonWidth(BigDecimal cartonWidth) {
    this.cartonWidth = cartonWidth;
  }

  
  /**
   **/
  public QuickReceipt cartonHeight(BigDecimal cartonHeight) {
    this.cartonHeight = cartonHeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cartonHeight")
  public BigDecimal getCartonHeight() {
    return cartonHeight;
  }
  public void setCartonHeight(BigDecimal cartonHeight) {
    this.cartonHeight = cartonHeight;
  }

  
  /**
   **/
  public QuickReceipt cost(BigDecimal cost) {
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
  public QuickReceipt sell(BigDecimal sell) {
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
  public QuickReceipt pricingPer(String pricingPer) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("generatedItemReceiptId")
  public Integer getGeneratedItemReceiptId() {
    return generatedItemReceiptId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("generatedASNId")
  public Integer getGeneratedASNId() {
    return generatedASNId;
  }

  
  /**
   **/
  public QuickReceipt customFields(Map<String, Object> customFields) {
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

  
  /**
   **/
  public QuickReceipt sku(String sku) {
    this.sku = sku;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuickReceipt quickReceipt = (QuickReceipt) o;
    return Objects.equals(this.id, quickReceipt.id) &&
        Objects.equals(this.createdBy, quickReceipt.createdBy) &&
        Objects.equals(this.createDate, quickReceipt.createDate) &&
        Objects.equals(this.modifyDate, quickReceipt.modifyDate) &&
        Objects.equals(this.warehouseId, quickReceipt.warehouseId) &&
        Objects.equals(this.lobId, quickReceipt.lobId) &&
        Objects.equals(this.locationId, quickReceipt.locationId) &&
        Objects.equals(this.quantity, quickReceipt.quantity) &&
        Objects.equals(this.vendorId, quickReceipt.vendorId) &&
        Objects.equals(this.carrier, quickReceipt.carrier) &&
        Objects.equals(this.status, quickReceipt.status) &&
        Objects.equals(this.unitCode, quickReceipt.unitCode) &&
        Objects.equals(this.wrapCode, quickReceipt.wrapCode) &&
        Objects.equals(this.weightPerWrap, quickReceipt.weightPerWrap) &&
        Objects.equals(this.unitsPerWrap, quickReceipt.unitsPerWrap) &&
        Objects.equals(this.unitsPerCase, quickReceipt.unitsPerCase) &&
        Objects.equals(this.casesPerPallet, quickReceipt.casesPerPallet) &&
        Objects.equals(this.caseWeight, quickReceipt.caseWeight) &&
        Objects.equals(this.productionLot, quickReceipt.productionLot) &&
        Objects.equals(this.revisionDate, quickReceipt.revisionDate) &&
        Objects.equals(this.origin, quickReceipt.origin) &&
        Objects.equals(this.cartonLength, quickReceipt.cartonLength) &&
        Objects.equals(this.cartonWidth, quickReceipt.cartonWidth) &&
        Objects.equals(this.cartonHeight, quickReceipt.cartonHeight) &&
        Objects.equals(this.cost, quickReceipt.cost) &&
        Objects.equals(this.sell, quickReceipt.sell) &&
        Objects.equals(this.pricingPer, quickReceipt.pricingPer) &&
        Objects.equals(this.generatedItemReceiptId, quickReceipt.generatedItemReceiptId) &&
        Objects.equals(this.generatedASNId, quickReceipt.generatedASNId) &&
        Objects.equals(this.customFields, quickReceipt.customFields) &&
        Objects.equals(this.sku, quickReceipt.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdBy, createDate, modifyDate, warehouseId, lobId, locationId, quantity, vendorId, carrier, status, unitCode, wrapCode, weightPerWrap, unitsPerWrap, unitsPerCase, casesPerPallet, caseWeight, productionLot, revisionDate, origin, cartonLength, cartonWidth, cartonHeight, cost, sell, pricingPer, generatedItemReceiptId, generatedASNId, customFields, sku);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuickReceipt {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    unitCode: ").append(toIndentedString(unitCode)).append("\n");
    sb.append("    wrapCode: ").append(toIndentedString(wrapCode)).append("\n");
    sb.append("    weightPerWrap: ").append(toIndentedString(weightPerWrap)).append("\n");
    sb.append("    unitsPerWrap: ").append(toIndentedString(unitsPerWrap)).append("\n");
    sb.append("    unitsPerCase: ").append(toIndentedString(unitsPerCase)).append("\n");
    sb.append("    casesPerPallet: ").append(toIndentedString(casesPerPallet)).append("\n");
    sb.append("    caseWeight: ").append(toIndentedString(caseWeight)).append("\n");
    sb.append("    productionLot: ").append(toIndentedString(productionLot)).append("\n");
    sb.append("    revisionDate: ").append(toIndentedString(revisionDate)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    cartonLength: ").append(toIndentedString(cartonLength)).append("\n");
    sb.append("    cartonWidth: ").append(toIndentedString(cartonWidth)).append("\n");
    sb.append("    cartonHeight: ").append(toIndentedString(cartonHeight)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    sell: ").append(toIndentedString(sell)).append("\n");
    sb.append("    pricingPer: ").append(toIndentedString(pricingPer)).append("\n");
    sb.append("    generatedItemReceiptId: ").append(toIndentedString(generatedItemReceiptId)).append("\n");
    sb.append("    generatedASNId: ").append(toIndentedString(generatedASNId)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

