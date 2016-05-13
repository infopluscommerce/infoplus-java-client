package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.infopluscommerce.model.ReceivingWorksheetPutAwayPlan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T15:40:30.367-05:00")
public class ReceivingWorksheetLineItem   {
  
  private String sku = null;
  private String fullDescription = null;
  private Integer orderedQty = null;
  private Integer prevReceivedQty = null;
  private Integer unreceivedQty = null;
  private Integer receivingQty = null;
  private String unitCode = null;
  private String wrapCode = null;
  private Integer unitsPerWrap = null;
  private Integer unitsPerCase = null;
  private Integer casesPerPallet = null;
  private Double weightPerWrap = null;
  private Double weightPerCase = null;
  private String productionLot = null;
  private String revisionDate = null;
  private String origin = null;
  private Double cartonLength = null;
  private Double cartonWidth = null;
  private Double cartonHeight = null;
  private List<ReceivingWorksheetPutAwayPlan> putAwayPlans = new ArrayList<ReceivingWorksheetPutAwayPlan>();
  private Integer quantity = null;

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fullDescription")
  public String getFullDescription() {
    return fullDescription;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderedQty")
  public Integer getOrderedQty() {
    return orderedQty;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("prevReceivedQty")
  public Integer getPrevReceivedQty() {
    return prevReceivedQty;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unreceivedQty")
  public Integer getUnreceivedQty() {
    return unreceivedQty;
  }

  
  /**
   **/
  public ReceivingWorksheetLineItem receivingQty(Integer receivingQty) {
    this.receivingQty = receivingQty;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("receivingQty")
  public Integer getReceivingQty() {
    return receivingQty;
  }
  public void setReceivingQty(Integer receivingQty) {
    this.receivingQty = receivingQty;
  }

  
  /**
   **/
  public ReceivingWorksheetLineItem unitCode(String unitCode) {
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
  public ReceivingWorksheetLineItem wrapCode(String wrapCode) {
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
  public ReceivingWorksheetLineItem unitsPerWrap(Integer unitsPerWrap) {
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
  public ReceivingWorksheetLineItem unitsPerCase(Integer unitsPerCase) {
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
  public ReceivingWorksheetLineItem casesPerPallet(Integer casesPerPallet) {
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
  public ReceivingWorksheetLineItem weightPerWrap(Double weightPerWrap) {
    this.weightPerWrap = weightPerWrap;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("weightPerWrap")
  public Double getWeightPerWrap() {
    return weightPerWrap;
  }
  public void setWeightPerWrap(Double weightPerWrap) {
    this.weightPerWrap = weightPerWrap;
  }

  
  /**
   **/
  public ReceivingWorksheetLineItem weightPerCase(Double weightPerCase) {
    this.weightPerCase = weightPerCase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weightPerCase")
  public Double getWeightPerCase() {
    return weightPerCase;
  }
  public void setWeightPerCase(Double weightPerCase) {
    this.weightPerCase = weightPerCase;
  }

  
  /**
   **/
  public ReceivingWorksheetLineItem productionLot(String productionLot) {
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
  public ReceivingWorksheetLineItem revisionDate(String revisionDate) {
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
  public ReceivingWorksheetLineItem origin(String origin) {
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
  public ReceivingWorksheetLineItem cartonLength(Double cartonLength) {
    this.cartonLength = cartonLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cartonLength")
  public Double getCartonLength() {
    return cartonLength;
  }
  public void setCartonLength(Double cartonLength) {
    this.cartonLength = cartonLength;
  }

  
  /**
   **/
  public ReceivingWorksheetLineItem cartonWidth(Double cartonWidth) {
    this.cartonWidth = cartonWidth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cartonWidth")
  public Double getCartonWidth() {
    return cartonWidth;
  }
  public void setCartonWidth(Double cartonWidth) {
    this.cartonWidth = cartonWidth;
  }

  
  /**
   **/
  public ReceivingWorksheetLineItem cartonHeight(Double cartonHeight) {
    this.cartonHeight = cartonHeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cartonHeight")
  public Double getCartonHeight() {
    return cartonHeight;
  }
  public void setCartonHeight(Double cartonHeight) {
    this.cartonHeight = cartonHeight;
  }

  
  /**
   **/
  public ReceivingWorksheetLineItem putAwayPlans(List<ReceivingWorksheetPutAwayPlan> putAwayPlans) {
    this.putAwayPlans = putAwayPlans;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("putAwayPlans")
  public List<ReceivingWorksheetPutAwayPlan> getPutAwayPlans() {
    return putAwayPlans;
  }
  public void setPutAwayPlans(List<ReceivingWorksheetPutAwayPlan> putAwayPlans) {
    this.putAwayPlans = putAwayPlans;
  }

  
  /**
   **/
  public ReceivingWorksheetLineItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceivingWorksheetLineItem receivingWorksheetLineItem = (ReceivingWorksheetLineItem) o;
    return Objects.equals(this.sku, receivingWorksheetLineItem.sku) &&
        Objects.equals(this.fullDescription, receivingWorksheetLineItem.fullDescription) &&
        Objects.equals(this.orderedQty, receivingWorksheetLineItem.orderedQty) &&
        Objects.equals(this.prevReceivedQty, receivingWorksheetLineItem.prevReceivedQty) &&
        Objects.equals(this.unreceivedQty, receivingWorksheetLineItem.unreceivedQty) &&
        Objects.equals(this.receivingQty, receivingWorksheetLineItem.receivingQty) &&
        Objects.equals(this.unitCode, receivingWorksheetLineItem.unitCode) &&
        Objects.equals(this.wrapCode, receivingWorksheetLineItem.wrapCode) &&
        Objects.equals(this.unitsPerWrap, receivingWorksheetLineItem.unitsPerWrap) &&
        Objects.equals(this.unitsPerCase, receivingWorksheetLineItem.unitsPerCase) &&
        Objects.equals(this.casesPerPallet, receivingWorksheetLineItem.casesPerPallet) &&
        Objects.equals(this.weightPerWrap, receivingWorksheetLineItem.weightPerWrap) &&
        Objects.equals(this.weightPerCase, receivingWorksheetLineItem.weightPerCase) &&
        Objects.equals(this.productionLot, receivingWorksheetLineItem.productionLot) &&
        Objects.equals(this.revisionDate, receivingWorksheetLineItem.revisionDate) &&
        Objects.equals(this.origin, receivingWorksheetLineItem.origin) &&
        Objects.equals(this.cartonLength, receivingWorksheetLineItem.cartonLength) &&
        Objects.equals(this.cartonWidth, receivingWorksheetLineItem.cartonWidth) &&
        Objects.equals(this.cartonHeight, receivingWorksheetLineItem.cartonHeight) &&
        Objects.equals(this.putAwayPlans, receivingWorksheetLineItem.putAwayPlans) &&
        Objects.equals(this.quantity, receivingWorksheetLineItem.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, fullDescription, orderedQty, prevReceivedQty, unreceivedQty, receivingQty, unitCode, wrapCode, unitsPerWrap, unitsPerCase, casesPerPallet, weightPerWrap, weightPerCase, productionLot, revisionDate, origin, cartonLength, cartonWidth, cartonHeight, putAwayPlans, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivingWorksheetLineItem {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    fullDescription: ").append(toIndentedString(fullDescription)).append("\n");
    sb.append("    orderedQty: ").append(toIndentedString(orderedQty)).append("\n");
    sb.append("    prevReceivedQty: ").append(toIndentedString(prevReceivedQty)).append("\n");
    sb.append("    unreceivedQty: ").append(toIndentedString(unreceivedQty)).append("\n");
    sb.append("    receivingQty: ").append(toIndentedString(receivingQty)).append("\n");
    sb.append("    unitCode: ").append(toIndentedString(unitCode)).append("\n");
    sb.append("    wrapCode: ").append(toIndentedString(wrapCode)).append("\n");
    sb.append("    unitsPerWrap: ").append(toIndentedString(unitsPerWrap)).append("\n");
    sb.append("    unitsPerCase: ").append(toIndentedString(unitsPerCase)).append("\n");
    sb.append("    casesPerPallet: ").append(toIndentedString(casesPerPallet)).append("\n");
    sb.append("    weightPerWrap: ").append(toIndentedString(weightPerWrap)).append("\n");
    sb.append("    weightPerCase: ").append(toIndentedString(weightPerCase)).append("\n");
    sb.append("    productionLot: ").append(toIndentedString(productionLot)).append("\n");
    sb.append("    revisionDate: ").append(toIndentedString(revisionDate)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    cartonLength: ").append(toIndentedString(cartonLength)).append("\n");
    sb.append("    cartonWidth: ").append(toIndentedString(cartonWidth)).append("\n");
    sb.append("    cartonHeight: ").append(toIndentedString(cartonHeight)).append("\n");
    sb.append("    putAwayPlans: ").append(toIndentedString(putAwayPlans)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

