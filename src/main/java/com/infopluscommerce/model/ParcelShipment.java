package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipDate")
  public Date getShipDate() {
    return shipDate;
  }
  public void setShipDate(Date shipDate) {
    this.shipDate = shipDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deliveredDate")
  public Date getDeliveredDate() {
    return deliveredDate;
  }
  public void setDeliveredDate(Date deliveredDate) {
    this.deliveredDate = deliveredDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trackingNo")
  public String getTrackingNo() {
    return trackingNo;
  }
  public void setTrackingNo(String trackingNo) {
    this.trackingNo = trackingNo;
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }
  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderNo")
  public Double getOrderNo() {
    return orderNo;
  }
  public void setOrderNo(Double orderNo) {
    this.orderNo = orderNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cartonNo")
  public Integer getCartonNo() {
    return cartonNo;
  }
  public void setCartonNo(Integer cartonNo) {
    this.cartonNo = cartonNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numberOfCartons")
  public Integer getNumberOfCartons() {
    return numberOfCartons;
  }
  public void setNumberOfCartons(Integer numberOfCartons) {
    this.numberOfCartons = numberOfCartons;
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipped")
  public Boolean getShipped() {
    return shipped;
  }
  public void setShipped(Boolean shipped) {
    this.shipped = shipped;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("carrierServiceId")
  public Integer getCarrierServiceId() {
    return carrierServiceId;
  }
  public void setCarrierServiceId(Integer carrierServiceId) {
    this.carrierServiceId = carrierServiceId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dim1In")
  public Double getDim1In() {
    return dim1In;
  }
  public void setDim1In(Double dim1In) {
    this.dim1In = dim1In;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dim2In")
  public Double getDim2In() {
    return dim2In;
  }
  public void setDim2In(Double dim2In) {
    this.dim2In = dim2In;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dim3In")
  public Double getDim3In() {
    return dim3In;
  }
  public void setDim3In(Double dim3In) {
    this.dim3In = dim3In;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedZone")
  public String getEstimatedZone() {
    return estimatedZone;
  }
  public void setEstimatedZone(String estimatedZone) {
    this.estimatedZone = estimatedZone;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parcelAccountNo")
  public String getParcelAccountNo() {
    return parcelAccountNo;
  }
  public void setParcelAccountNo(String parcelAccountNo) {
    this.parcelAccountNo = parcelAccountNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thirdPartyParcelAccountNo")
  public String getThirdPartyParcelAccountNo() {
    return thirdPartyParcelAccountNo;
  }
  public void setThirdPartyParcelAccountNo(String thirdPartyParcelAccountNo) {
    this.thirdPartyParcelAccountNo = thirdPartyParcelAccountNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("manifestId")
  public Integer getManifestId() {
    return manifestId;
  }
  public void setManifestId(Integer manifestId) {
    this.manifestId = manifestId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("residential")
  public Boolean getResidential() {
    return residential;
  }
  public void setResidential(Boolean residential) {
    this.residential = residential;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billingOption")
  public String getBillingOption() {
    return billingOption;
  }
  public void setBillingOption(String billingOption) {
    this.billingOption = billingOption;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("weightLbs")
  public Double getWeightLbs() {
    return weightLbs;
  }
  public void setWeightLbs(Double weightLbs) {
    this.weightLbs = weightLbs;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dimWeight")
  public Double getDimWeight() {
    return dimWeight;
  }
  public void setDimWeight(Double dimWeight) {
    this.dimWeight = dimWeight;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("licensePlateNumber")
  public String getLicensePlateNumber() {
    return licensePlateNumber;
  }
  public void setLicensePlateNumber(String licensePlateNumber) {
    this.licensePlateNumber = licensePlateNumber;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("chargedFreightAmount")
  public Double getChargedFreightAmount() {
    return chargedFreightAmount;
  }
  public void setChargedFreightAmount(Double chargedFreightAmount) {
    this.chargedFreightAmount = chargedFreightAmount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publishedFreightAmount")
  public Double getPublishedFreightAmount() {
    return publishedFreightAmount;
  }
  public void setPublishedFreightAmount(Double publishedFreightAmount) {
    this.publishedFreightAmount = publishedFreightAmount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailFreightAmount")
  public Double getRetailFreightAmount() {
    return retailFreightAmount;
  }
  public void setRetailFreightAmount(Double retailFreightAmount) {
    this.retailFreightAmount = retailFreightAmount;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelShipment parcelShipment = (ParcelShipment) o;
    return Objects.equals(id, parcelShipment.id) &&
        Objects.equals(createDate, parcelShipment.createDate) &&
        Objects.equals(modifyDate, parcelShipment.modifyDate) &&
        Objects.equals(shipDate, parcelShipment.shipDate) &&
        Objects.equals(deliveredDate, parcelShipment.deliveredDate) &&
        Objects.equals(trackingNo, parcelShipment.trackingNo) &&
        Objects.equals(warehouseId, parcelShipment.warehouseId) &&
        Objects.equals(lobId, parcelShipment.lobId) &&
        Objects.equals(orderNo, parcelShipment.orderNo) &&
        Objects.equals(cartonNo, parcelShipment.cartonNo) &&
        Objects.equals(numberOfCartons, parcelShipment.numberOfCartons) &&
        Objects.equals(status, parcelShipment.status) &&
        Objects.equals(shipped, parcelShipment.shipped) &&
        Objects.equals(carrierServiceId, parcelShipment.carrierServiceId) &&
        Objects.equals(dim1In, parcelShipment.dim1In) &&
        Objects.equals(dim2In, parcelShipment.dim2In) &&
        Objects.equals(dim3In, parcelShipment.dim3In) &&
        Objects.equals(estimatedZone, parcelShipment.estimatedZone) &&
        Objects.equals(parcelAccountNo, parcelShipment.parcelAccountNo) &&
        Objects.equals(thirdPartyParcelAccountNo, parcelShipment.thirdPartyParcelAccountNo) &&
        Objects.equals(manifestId, parcelShipment.manifestId) &&
        Objects.equals(residential, parcelShipment.residential) &&
        Objects.equals(billingOption, parcelShipment.billingOption) &&
        Objects.equals(weightLbs, parcelShipment.weightLbs) &&
        Objects.equals(dimWeight, parcelShipment.dimWeight) &&
        Objects.equals(licensePlateNumber, parcelShipment.licensePlateNumber) &&
        Objects.equals(chargedFreightAmount, parcelShipment.chargedFreightAmount) &&
        Objects.equals(publishedFreightAmount, parcelShipment.publishedFreightAmount) &&
        Objects.equals(retailFreightAmount, parcelShipment.retailFreightAmount);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

