package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class ExternalShipment   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Double orderId = null;
  private Integer carrierId = null;
  private Integer parcelAccountId = null;
  private Integer thirdPartyParcelAccountId = null;
  private Double freight = null;
  private String trackingNo = null;
  private Double dim1In = null;
  private Double dim2In = null;
  private Double dim3In = null;
  private Double weightLbs = null;
  private Double dimWeight = null;
  private Boolean residential = false;
  private String zone = null;
  private String status = null;

  
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("orderId")
  public Double getOrderId() {
    return orderId;
  }
  public void setOrderId(Double orderId) {
    this.orderId = orderId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("carrierId")
  public Integer getCarrierId() {
    return carrierId;
  }
  public void setCarrierId(Integer carrierId) {
    this.carrierId = carrierId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("parcelAccountId")
  public Integer getParcelAccountId() {
    return parcelAccountId;
  }
  public void setParcelAccountId(Integer parcelAccountId) {
    this.parcelAccountId = parcelAccountId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thirdPartyParcelAccountId")
  public Integer getThirdPartyParcelAccountId() {
    return thirdPartyParcelAccountId;
  }
  public void setThirdPartyParcelAccountId(Integer thirdPartyParcelAccountId) {
    this.thirdPartyParcelAccountId = thirdPartyParcelAccountId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("freight")
  public Double getFreight() {
    return freight;
  }
  public void setFreight(Double freight) {
    this.freight = freight;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("trackingNo")
  public String getTrackingNo() {
    return trackingNo;
  }
  public void setTrackingNo(String trackingNo) {
    this.trackingNo = trackingNo;
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
  @JsonProperty("zone")
  public String getZone() {
    return zone;
  }
  public void setZone(String zone) {
    this.zone = zone;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalShipment externalShipment = (ExternalShipment) o;
    return Objects.equals(id, externalShipment.id) &&
        Objects.equals(createDate, externalShipment.createDate) &&
        Objects.equals(modifyDate, externalShipment.modifyDate) &&
        Objects.equals(orderId, externalShipment.orderId) &&
        Objects.equals(carrierId, externalShipment.carrierId) &&
        Objects.equals(parcelAccountId, externalShipment.parcelAccountId) &&
        Objects.equals(thirdPartyParcelAccountId, externalShipment.thirdPartyParcelAccountId) &&
        Objects.equals(freight, externalShipment.freight) &&
        Objects.equals(trackingNo, externalShipment.trackingNo) &&
        Objects.equals(dim1In, externalShipment.dim1In) &&
        Objects.equals(dim2In, externalShipment.dim2In) &&
        Objects.equals(dim3In, externalShipment.dim3In) &&
        Objects.equals(weightLbs, externalShipment.weightLbs) &&
        Objects.equals(dimWeight, externalShipment.dimWeight) &&
        Objects.equals(residential, externalShipment.residential) &&
        Objects.equals(zone, externalShipment.zone) &&
        Objects.equals(status, externalShipment.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, orderId, carrierId, parcelAccountId, thirdPartyParcelAccountId, freight, trackingNo, dim1In, dim2In, dim3In, weightLbs, dimWeight, residential, zone, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalShipment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    parcelAccountId: ").append(toIndentedString(parcelAccountId)).append("\n");
    sb.append("    thirdPartyParcelAccountId: ").append(toIndentedString(thirdPartyParcelAccountId)).append("\n");
    sb.append("    freight: ").append(toIndentedString(freight)).append("\n");
    sb.append("    trackingNo: ").append(toIndentedString(trackingNo)).append("\n");
    sb.append("    dim1In: ").append(toIndentedString(dim1In)).append("\n");
    sb.append("    dim2In: ").append(toIndentedString(dim2In)).append("\n");
    sb.append("    dim3In: ").append(toIndentedString(dim3In)).append("\n");
    sb.append("    weightLbs: ").append(toIndentedString(weightLbs)).append("\n");
    sb.append("    dimWeight: ").append(toIndentedString(dimWeight)).append("\n");
    sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

