package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
  private Double weightPerWrap = null;
  private Integer unitsPerWrap = null;
  private Integer unitsPerCase = null;
  private Integer casesPerPallet = null;
  private Double caseWeight = null;
  private String productionLot = null;
  private String revisionDate = null;
  private String origin = null;
  private Double cartonLength = null;
  private Double cartonWidth = null;
  private Double cartonHeight = null;
  private Double cost = null;
  private Double sell = null;
  private String pricingPer = null;
  private String sku = null;

  
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
  @JsonProperty("createdBy")
  public Integer getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
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
  @JsonProperty("locationId")
  public Integer getLocationId() {
    return locationId;
  }
  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
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
  @JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(String carrier) {
    this.carrier = carrier;
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
  @JsonProperty("weightPerWrap")
  public Double getWeightPerWrap() {
    return weightPerWrap;
  }
  public void setWeightPerWrap(Double weightPerWrap) {
    this.weightPerWrap = weightPerWrap;
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
  @JsonProperty("casesPerPallet")
  public Integer getCasesPerPallet() {
    return casesPerPallet;
  }
  public void setCasesPerPallet(Integer casesPerPallet) {
    this.casesPerPallet = casesPerPallet;
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
  @JsonProperty("productionLot")
  public String getProductionLot() {
    return productionLot;
  }
  public void setProductionLot(String productionLot) {
    this.productionLot = productionLot;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("revisionDate")
  public String getRevisionDate() {
    return revisionDate;
  }
  public void setRevisionDate(String revisionDate) {
    this.revisionDate = revisionDate;
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
  @JsonProperty("cartonLength")
  public Double getCartonLength() {
    return cartonLength;
  }
  public void setCartonLength(Double cartonLength) {
    this.cartonLength = cartonLength;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cartonWidth")
  public Double getCartonWidth() {
    return cartonWidth;
  }
  public void setCartonWidth(Double cartonWidth) {
    this.cartonWidth = cartonWidth;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cartonHeight")
  public Double getCartonHeight() {
    return cartonHeight;
  }
  public void setCartonHeight(Double cartonHeight) {
    this.cartonHeight = cartonHeight;
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
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuickReceipt quickReceipt = (QuickReceipt) o;
    return Objects.equals(id, quickReceipt.id) &&
        Objects.equals(createdBy, quickReceipt.createdBy) &&
        Objects.equals(createDate, quickReceipt.createDate) &&
        Objects.equals(modifyDate, quickReceipt.modifyDate) &&
        Objects.equals(warehouseId, quickReceipt.warehouseId) &&
        Objects.equals(lobId, quickReceipt.lobId) &&
        Objects.equals(locationId, quickReceipt.locationId) &&
        Objects.equals(quantity, quickReceipt.quantity) &&
        Objects.equals(vendorId, quickReceipt.vendorId) &&
        Objects.equals(carrier, quickReceipt.carrier) &&
        Objects.equals(status, quickReceipt.status) &&
        Objects.equals(unitCode, quickReceipt.unitCode) &&
        Objects.equals(wrapCode, quickReceipt.wrapCode) &&
        Objects.equals(weightPerWrap, quickReceipt.weightPerWrap) &&
        Objects.equals(unitsPerWrap, quickReceipt.unitsPerWrap) &&
        Objects.equals(unitsPerCase, quickReceipt.unitsPerCase) &&
        Objects.equals(casesPerPallet, quickReceipt.casesPerPallet) &&
        Objects.equals(caseWeight, quickReceipt.caseWeight) &&
        Objects.equals(productionLot, quickReceipt.productionLot) &&
        Objects.equals(revisionDate, quickReceipt.revisionDate) &&
        Objects.equals(origin, quickReceipt.origin) &&
        Objects.equals(cartonLength, quickReceipt.cartonLength) &&
        Objects.equals(cartonWidth, quickReceipt.cartonWidth) &&
        Objects.equals(cartonHeight, quickReceipt.cartonHeight) &&
        Objects.equals(cost, quickReceipt.cost) &&
        Objects.equals(sell, quickReceipt.sell) &&
        Objects.equals(pricingPer, quickReceipt.pricingPer) &&
        Objects.equals(sku, quickReceipt.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdBy, createDate, modifyDate, warehouseId, lobId, locationId, quantity, vendorId, carrier, status, unitCode, wrapCode, weightPerWrap, unitsPerWrap, unitsPerCase, casesPerPallet, caseWeight, productionLot, revisionDate, origin, cartonLength, cartonWidth, cartonHeight, cost, sell, pricingPer, sku);
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
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

