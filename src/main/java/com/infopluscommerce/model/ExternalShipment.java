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
public class ExternalShipment   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private BigDecimal orderId = null;
  private Integer carrierId = null;
  private Integer parcelAccountId = null;
  private Integer thirdPartyParcelAccountId = null;
  private BigDecimal freight = null;
  private String trackingNo = null;
  private BigDecimal dim1In = null;
  private BigDecimal dim2In = null;
  private BigDecimal dim3In = null;
  private BigDecimal weightLbs = null;
  private BigDecimal dimWeight = null;
  private Boolean residential = false;
  private String zone = null;
  private String status = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
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
  public ExternalShipment orderId(BigDecimal orderId) {
    this.orderId = orderId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("orderId")
  public BigDecimal getOrderId() {
    return orderId;
  }
  public void setOrderId(BigDecimal orderId) {
    this.orderId = orderId;
  }

  
  /**
   **/
  public ExternalShipment carrierId(Integer carrierId) {
    this.carrierId = carrierId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("carrierId")
  public Integer getCarrierId() {
    return carrierId;
  }
  public void setCarrierId(Integer carrierId) {
    this.carrierId = carrierId;
  }

  
  /**
   **/
  public ExternalShipment parcelAccountId(Integer parcelAccountId) {
    this.parcelAccountId = parcelAccountId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("parcelAccountId")
  public Integer getParcelAccountId() {
    return parcelAccountId;
  }
  public void setParcelAccountId(Integer parcelAccountId) {
    this.parcelAccountId = parcelAccountId;
  }

  
  /**
   **/
  public ExternalShipment thirdPartyParcelAccountId(Integer thirdPartyParcelAccountId) {
    this.thirdPartyParcelAccountId = thirdPartyParcelAccountId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thirdPartyParcelAccountId")
  public Integer getThirdPartyParcelAccountId() {
    return thirdPartyParcelAccountId;
  }
  public void setThirdPartyParcelAccountId(Integer thirdPartyParcelAccountId) {
    this.thirdPartyParcelAccountId = thirdPartyParcelAccountId;
  }

  
  /**
   **/
  public ExternalShipment freight(BigDecimal freight) {
    this.freight = freight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("freight")
  public BigDecimal getFreight() {
    return freight;
  }
  public void setFreight(BigDecimal freight) {
    this.freight = freight;
  }

  
  /**
   **/
  public ExternalShipment trackingNo(String trackingNo) {
    this.trackingNo = trackingNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("trackingNo")
  public String getTrackingNo() {
    return trackingNo;
  }
  public void setTrackingNo(String trackingNo) {
    this.trackingNo = trackingNo;
  }

  
  /**
   **/
  public ExternalShipment dim1In(BigDecimal dim1In) {
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
  public ExternalShipment dim2In(BigDecimal dim2In) {
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
  public ExternalShipment dim3In(BigDecimal dim3In) {
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
  public ExternalShipment weightLbs(BigDecimal weightLbs) {
    this.weightLbs = weightLbs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weightLbs")
  public BigDecimal getWeightLbs() {
    return weightLbs;
  }
  public void setWeightLbs(BigDecimal weightLbs) {
    this.weightLbs = weightLbs;
  }

  
  /**
   **/
  public ExternalShipment dimWeight(BigDecimal dimWeight) {
    this.dimWeight = dimWeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dimWeight")
  public BigDecimal getDimWeight() {
    return dimWeight;
  }
  public void setDimWeight(BigDecimal dimWeight) {
    this.dimWeight = dimWeight;
  }

  
  /**
   **/
  public ExternalShipment residential(Boolean residential) {
    this.residential = residential;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("residential")
  public Boolean getResidential() {
    return residential;
  }
  public void setResidential(Boolean residential) {
    this.residential = residential;
  }

  
  /**
   **/
  public ExternalShipment zone(String zone) {
    this.zone = zone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("zone")
  public String getZone() {
    return zone;
  }
  public void setZone(String zone) {
    this.zone = zone;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  
  /**
   **/
  public ExternalShipment customFields(Map<String, Object> customFields) {
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
    ExternalShipment externalShipment = (ExternalShipment) o;
    return Objects.equals(this.id, externalShipment.id) &&
        Objects.equals(this.createDate, externalShipment.createDate) &&
        Objects.equals(this.modifyDate, externalShipment.modifyDate) &&
        Objects.equals(this.orderId, externalShipment.orderId) &&
        Objects.equals(this.carrierId, externalShipment.carrierId) &&
        Objects.equals(this.parcelAccountId, externalShipment.parcelAccountId) &&
        Objects.equals(this.thirdPartyParcelAccountId, externalShipment.thirdPartyParcelAccountId) &&
        Objects.equals(this.freight, externalShipment.freight) &&
        Objects.equals(this.trackingNo, externalShipment.trackingNo) &&
        Objects.equals(this.dim1In, externalShipment.dim1In) &&
        Objects.equals(this.dim2In, externalShipment.dim2In) &&
        Objects.equals(this.dim3In, externalShipment.dim3In) &&
        Objects.equals(this.weightLbs, externalShipment.weightLbs) &&
        Objects.equals(this.dimWeight, externalShipment.dimWeight) &&
        Objects.equals(this.residential, externalShipment.residential) &&
        Objects.equals(this.zone, externalShipment.zone) &&
        Objects.equals(this.status, externalShipment.status) &&
        Objects.equals(this.customFields, externalShipment.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, orderId, carrierId, parcelAccountId, thirdPartyParcelAccountId, freight, trackingNo, dim1In, dim2In, dim3In, weightLbs, dimWeight, residential, zone, status, customFields);
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

