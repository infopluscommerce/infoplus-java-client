package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T15:40:30.367-05:00")
public class ParcelShipment   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Date shipDate = null;
  private Date deliveredDate = null;
  private String trackingNo = null;
  private Integer warehouseId = null;
  private Integer lobId = null;
  private Double orderNo = null;
  private Integer cartonNo = null;
  private Integer numberOfCartons = null;
  private String status = null;
  private Boolean shipped = false;
  private Integer carrierServiceId = null;
  private Double dim1In = null;
  private Double dim2In = null;
  private Double dim3In = null;
  private String estimatedZone = null;
  private String parcelAccountNo = null;
  private String thirdPartyParcelAccountNo = null;
  private Integer manifestId = null;
  private Boolean residential = false;
  private String billingOption = null;
  private Double weightLbs = null;
  private Double dimWeight = null;
  private String licensePlateNumber = null;
  private Double chargedFreightAmount = null;
  private Double publishedFreightAmount = null;
  private Double retailFreightAmount = null;

  
  /**
   **/
  public ParcelShipment id(Integer id) {
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
  public ParcelShipment warehouseId(Integer warehouseId) {
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
  public Double getOrderNo() {
    return orderNo;
  }

  
  /**
   **/
  public ParcelShipment cartonNo(Integer cartonNo) {
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
  public ParcelShipment numberOfCartons(Integer numberOfCartons) {
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
  public ParcelShipment shipped(Boolean shipped) {
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
  public ParcelShipment carrierServiceId(Integer carrierServiceId) {
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
  public ParcelShipment dim1In(Double dim1In) {
    this.dim1In = dim1In;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dim1In")
  public Double getDim1In() {
    return dim1In;
  }
  public void setDim1In(Double dim1In) {
    this.dim1In = dim1In;
  }

  
  /**
   **/
  public ParcelShipment dim2In(Double dim2In) {
    this.dim2In = dim2In;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dim2In")
  public Double getDim2In() {
    return dim2In;
  }
  public void setDim2In(Double dim2In) {
    this.dim2In = dim2In;
  }

  
  /**
   **/
  public ParcelShipment dim3In(Double dim3In) {
    this.dim3In = dim3In;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dim3In")
  public Double getDim3In() {
    return dim3In;
  }
  public void setDim3In(Double dim3In) {
    this.dim3In = dim3In;
  }

  
  /**
   **/
  public ParcelShipment estimatedZone(String estimatedZone) {
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
  public Double getWeightLbs() {
    return weightLbs;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dimWeight")
  public Double getDimWeight() {
    return dimWeight;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("licensePlateNumber")
  public String getLicensePlateNumber() {
    return licensePlateNumber;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chargedFreightAmount")
  public Double getChargedFreightAmount() {
    return chargedFreightAmount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("publishedFreightAmount")
  public Double getPublishedFreightAmount() {
    return publishedFreightAmount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("retailFreightAmount")
  public Double getRetailFreightAmount() {
    return retailFreightAmount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelShipment parcelShipment = (ParcelShipment) o;
    return Objects.equals(this.id, parcelShipment.id) &&
        Objects.equals(this.createDate, parcelShipment.createDate) &&
        Objects.equals(this.modifyDate, parcelShipment.modifyDate) &&
        Objects.equals(this.shipDate, parcelShipment.shipDate) &&
        Objects.equals(this.deliveredDate, parcelShipment.deliveredDate) &&
        Objects.equals(this.trackingNo, parcelShipment.trackingNo) &&
        Objects.equals(this.warehouseId, parcelShipment.warehouseId) &&
        Objects.equals(this.lobId, parcelShipment.lobId) &&
        Objects.equals(this.orderNo, parcelShipment.orderNo) &&
        Objects.equals(this.cartonNo, parcelShipment.cartonNo) &&
        Objects.equals(this.numberOfCartons, parcelShipment.numberOfCartons) &&
        Objects.equals(this.status, parcelShipment.status) &&
        Objects.equals(this.shipped, parcelShipment.shipped) &&
        Objects.equals(this.carrierServiceId, parcelShipment.carrierServiceId) &&
        Objects.equals(this.dim1In, parcelShipment.dim1In) &&
        Objects.equals(this.dim2In, parcelShipment.dim2In) &&
        Objects.equals(this.dim3In, parcelShipment.dim3In) &&
        Objects.equals(this.estimatedZone, parcelShipment.estimatedZone) &&
        Objects.equals(this.parcelAccountNo, parcelShipment.parcelAccountNo) &&
        Objects.equals(this.thirdPartyParcelAccountNo, parcelShipment.thirdPartyParcelAccountNo) &&
        Objects.equals(this.manifestId, parcelShipment.manifestId) &&
        Objects.equals(this.residential, parcelShipment.residential) &&
        Objects.equals(this.billingOption, parcelShipment.billingOption) &&
        Objects.equals(this.weightLbs, parcelShipment.weightLbs) &&
        Objects.equals(this.dimWeight, parcelShipment.dimWeight) &&
        Objects.equals(this.licensePlateNumber, parcelShipment.licensePlateNumber) &&
        Objects.equals(this.chargedFreightAmount, parcelShipment.chargedFreightAmount) &&
        Objects.equals(this.publishedFreightAmount, parcelShipment.publishedFreightAmount) &&
        Objects.equals(this.retailFreightAmount, parcelShipment.retailFreightAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, shipDate, deliveredDate, trackingNo, warehouseId, lobId, orderNo, cartonNo, numberOfCartons, status, shipped, carrierServiceId, dim1In, dim2In, dim3In, estimatedZone, parcelAccountNo, thirdPartyParcelAccountNo, manifestId, residential, billingOption, weightLbs, dimWeight, licensePlateNumber, chargedFreightAmount, publishedFreightAmount, retailFreightAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelShipment {\n");
    
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

