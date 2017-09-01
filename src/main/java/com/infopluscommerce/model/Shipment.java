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
public class Shipment   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Date shipDate = null;
  private Date deliveredDate = null;
  private String trackingNo = null;
  private Integer warehouseId = null;
  private Integer lobId = null;
  private BigDecimal orderNo = null;
  private Integer cartonNo = null;
  private Integer numberOfCartons = null;
  private String status = null;
  private Boolean shipped = false;
  private Integer carrierServiceId = null;
  private BigDecimal dim1In = null;
  private BigDecimal dim2In = null;
  private BigDecimal dim3In = null;
  private String estimatedZone = null;
  private String parcelAccountNo = null;
  private String thirdPartyParcelAccountNo = null;
  private Integer manifestId = null;
  private Boolean residential = false;
  private String billingOption = null;
  private BigDecimal weightLbs = null;
  private BigDecimal dimWeight = null;
  private String licensePlateNumber = null;
  private BigDecimal chargedFreightAmount = null;
  private BigDecimal publishedFreightAmount = null;
  private BigDecimal retailFreightAmount = null;
  private Integer externalShippingSystemId = null;
  private String shipmentType = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  /**
   **/
  public Shipment id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipDate")
  public Date getShipDate() {
    return shipDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deliveredDate")
  public Date getDeliveredDate() {
    return deliveredDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trackingNo")
  public String getTrackingNo() {
    return trackingNo;
  }

  
  /**
   **/
  public Shipment warehouseId(Integer warehouseId) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderNo")
  public BigDecimal getOrderNo() {
    return orderNo;
  }

  
  /**
   **/
  public Shipment cartonNo(Integer cartonNo) {
    this.cartonNo = cartonNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cartonNo")
  public Integer getCartonNo() {
    return cartonNo;
  }
  public void setCartonNo(Integer cartonNo) {
    this.cartonNo = cartonNo;
  }

  
  /**
   **/
  public Shipment numberOfCartons(Integer numberOfCartons) {
    this.numberOfCartons = numberOfCartons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfCartons")
  public Integer getNumberOfCartons() {
    return numberOfCartons;
  }
  public void setNumberOfCartons(Integer numberOfCartons) {
    this.numberOfCartons = numberOfCartons;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  
  /**
   **/
  public Shipment shipped(Boolean shipped) {
    this.shipped = shipped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipped")
  public Boolean getShipped() {
    return shipped;
  }
  public void setShipped(Boolean shipped) {
    this.shipped = shipped;
  }

  
  /**
   **/
  public Shipment carrierServiceId(Integer carrierServiceId) {
    this.carrierServiceId = carrierServiceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("carrierServiceId")
  public Integer getCarrierServiceId() {
    return carrierServiceId;
  }
  public void setCarrierServiceId(Integer carrierServiceId) {
    this.carrierServiceId = carrierServiceId;
  }

  
  /**
   **/
  public Shipment dim1In(BigDecimal dim1In) {
    this.dim1In = dim1In;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dim1In")
  public BigDecimal getDim1In() {
    return dim1In;
  }
  public void setDim1In(BigDecimal dim1In) {
    this.dim1In = dim1In;
  }

  
  /**
   **/
  public Shipment dim2In(BigDecimal dim2In) {
    this.dim2In = dim2In;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dim2In")
  public BigDecimal getDim2In() {
    return dim2In;
  }
  public void setDim2In(BigDecimal dim2In) {
    this.dim2In = dim2In;
  }

  
  /**
   **/
  public Shipment dim3In(BigDecimal dim3In) {
    this.dim3In = dim3In;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dim3In")
  public BigDecimal getDim3In() {
    return dim3In;
  }
  public void setDim3In(BigDecimal dim3In) {
    this.dim3In = dim3In;
  }

  
  /**
   **/
  public Shipment estimatedZone(String estimatedZone) {
    this.estimatedZone = estimatedZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("estimatedZone")
  public String getEstimatedZone() {
    return estimatedZone;
  }
  public void setEstimatedZone(String estimatedZone) {
    this.estimatedZone = estimatedZone;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parcelAccountNo")
  public String getParcelAccountNo() {
    return parcelAccountNo;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thirdPartyParcelAccountNo")
  public String getThirdPartyParcelAccountNo() {
    return thirdPartyParcelAccountNo;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("manifestId")
  public Integer getManifestId() {
    return manifestId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("residential")
  public Boolean getResidential() {
    return residential;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billingOption")
  public String getBillingOption() {
    return billingOption;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weightLbs")
  public BigDecimal getWeightLbs() {
    return weightLbs;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dimWeight")
  public BigDecimal getDimWeight() {
    return dimWeight;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("licensePlateNumber")
  public String getLicensePlateNumber() {
    return licensePlateNumber;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chargedFreightAmount")
  public BigDecimal getChargedFreightAmount() {
    return chargedFreightAmount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("publishedFreightAmount")
  public BigDecimal getPublishedFreightAmount() {
    return publishedFreightAmount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("retailFreightAmount")
  public BigDecimal getRetailFreightAmount() {
    return retailFreightAmount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalShippingSystemId")
  public Integer getExternalShippingSystemId() {
    return externalShippingSystemId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipmentType")
  public String getShipmentType() {
    return shipmentType;
  }

  
  /**
   **/
  public Shipment customFields(Map<String, Object> customFields) {
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
    Shipment shipment = (Shipment) o;
    return Objects.equals(this.id, shipment.id) &&
        Objects.equals(this.createDate, shipment.createDate) &&
        Objects.equals(this.modifyDate, shipment.modifyDate) &&
        Objects.equals(this.shipDate, shipment.shipDate) &&
        Objects.equals(this.deliveredDate, shipment.deliveredDate) &&
        Objects.equals(this.trackingNo, shipment.trackingNo) &&
        Objects.equals(this.warehouseId, shipment.warehouseId) &&
        Objects.equals(this.lobId, shipment.lobId) &&
        Objects.equals(this.orderNo, shipment.orderNo) &&
        Objects.equals(this.cartonNo, shipment.cartonNo) &&
        Objects.equals(this.numberOfCartons, shipment.numberOfCartons) &&
        Objects.equals(this.status, shipment.status) &&
        Objects.equals(this.shipped, shipment.shipped) &&
        Objects.equals(this.carrierServiceId, shipment.carrierServiceId) &&
        Objects.equals(this.dim1In, shipment.dim1In) &&
        Objects.equals(this.dim2In, shipment.dim2In) &&
        Objects.equals(this.dim3In, shipment.dim3In) &&
        Objects.equals(this.estimatedZone, shipment.estimatedZone) &&
        Objects.equals(this.parcelAccountNo, shipment.parcelAccountNo) &&
        Objects.equals(this.thirdPartyParcelAccountNo, shipment.thirdPartyParcelAccountNo) &&
        Objects.equals(this.manifestId, shipment.manifestId) &&
        Objects.equals(this.residential, shipment.residential) &&
        Objects.equals(this.billingOption, shipment.billingOption) &&
        Objects.equals(this.weightLbs, shipment.weightLbs) &&
        Objects.equals(this.dimWeight, shipment.dimWeight) &&
        Objects.equals(this.licensePlateNumber, shipment.licensePlateNumber) &&
        Objects.equals(this.chargedFreightAmount, shipment.chargedFreightAmount) &&
        Objects.equals(this.publishedFreightAmount, shipment.publishedFreightAmount) &&
        Objects.equals(this.retailFreightAmount, shipment.retailFreightAmount) &&
        Objects.equals(this.externalShippingSystemId, shipment.externalShippingSystemId) &&
        Objects.equals(this.shipmentType, shipment.shipmentType) &&
        Objects.equals(this.customFields, shipment.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, shipDate, deliveredDate, trackingNo, warehouseId, lobId, orderNo, cartonNo, numberOfCartons, status, shipped, carrierServiceId, dim1In, dim2In, dim3In, estimatedZone, parcelAccountNo, thirdPartyParcelAccountNo, manifestId, residential, billingOption, weightLbs, dimWeight, licensePlateNumber, chargedFreightAmount, publishedFreightAmount, retailFreightAmount, externalShippingSystemId, shipmentType, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    deliveredDate: ").append(toIndentedString(deliveredDate)).append("\n");
    sb.append("    trackingNo: ").append(toIndentedString(trackingNo)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    cartonNo: ").append(toIndentedString(cartonNo)).append("\n");
    sb.append("    numberOfCartons: ").append(toIndentedString(numberOfCartons)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    shipped: ").append(toIndentedString(shipped)).append("\n");
    sb.append("    carrierServiceId: ").append(toIndentedString(carrierServiceId)).append("\n");
    sb.append("    dim1In: ").append(toIndentedString(dim1In)).append("\n");
    sb.append("    dim2In: ").append(toIndentedString(dim2In)).append("\n");
    sb.append("    dim3In: ").append(toIndentedString(dim3In)).append("\n");
    sb.append("    estimatedZone: ").append(toIndentedString(estimatedZone)).append("\n");
    sb.append("    parcelAccountNo: ").append(toIndentedString(parcelAccountNo)).append("\n");
    sb.append("    thirdPartyParcelAccountNo: ").append(toIndentedString(thirdPartyParcelAccountNo)).append("\n");
    sb.append("    manifestId: ").append(toIndentedString(manifestId)).append("\n");
    sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
    sb.append("    billingOption: ").append(toIndentedString(billingOption)).append("\n");
    sb.append("    weightLbs: ").append(toIndentedString(weightLbs)).append("\n");
    sb.append("    dimWeight: ").append(toIndentedString(dimWeight)).append("\n");
    sb.append("    licensePlateNumber: ").append(toIndentedString(licensePlateNumber)).append("\n");
    sb.append("    chargedFreightAmount: ").append(toIndentedString(chargedFreightAmount)).append("\n");
    sb.append("    publishedFreightAmount: ").append(toIndentedString(publishedFreightAmount)).append("\n");
    sb.append("    retailFreightAmount: ").append(toIndentedString(retailFreightAmount)).append("\n");
    sb.append("    externalShippingSystemId: ").append(toIndentedString(externalShippingSystemId)).append("\n");
    sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
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

