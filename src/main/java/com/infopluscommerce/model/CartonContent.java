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





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class CartonContent   {
  
  private Integer id = null;
  private BigDecimal groupOrderId = null;
  private BigDecimal orderNo = null;
  private Integer cartonNo = null;
  private Integer cartonId = null;
  private Integer lineItemId = null;
  private String location = null;
  private Integer quantity = null;
  private Integer quantityScanned = null;
  private Date completed = null;
  private String toteId = null;
  private String pickerId = null;
  private String status = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public CartonContent groupOrderId(BigDecimal groupOrderId) {
    this.groupOrderId = groupOrderId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("groupOrderId")
  public BigDecimal getGroupOrderId() {
    return groupOrderId;
  }
  public void setGroupOrderId(BigDecimal groupOrderId) {
    this.groupOrderId = groupOrderId;
  }

  
  /**
   **/
  public CartonContent orderNo(BigDecimal orderNo) {
    this.orderNo = orderNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("orderNo")
  public BigDecimal getOrderNo() {
    return orderNo;
  }
  public void setOrderNo(BigDecimal orderNo) {
    this.orderNo = orderNo;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cartonNo")
  public Integer getCartonNo() {
    return cartonNo;
  }

  
  /**
   **/
  public CartonContent cartonId(Integer cartonId) {
    this.cartonId = cartonId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("cartonId")
  public Integer getCartonId() {
    return cartonId;
  }
  public void setCartonId(Integer cartonId) {
    this.cartonId = cartonId;
  }

  
  /**
   **/
  public CartonContent lineItemId(Integer lineItemId) {
    this.lineItemId = lineItemId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("lineItemId")
  public Integer getLineItemId() {
    return lineItemId;
  }
  public void setLineItemId(Integer lineItemId) {
    this.lineItemId = lineItemId;
  }

  
  /**
   **/
  public CartonContent location(String location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  
  /**
   **/
  public CartonContent quantity(Integer quantity) {
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
  public CartonContent quantityScanned(Integer quantityScanned) {
    this.quantityScanned = quantityScanned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quantityScanned")
  public Integer getQuantityScanned() {
    return quantityScanned;
  }
  public void setQuantityScanned(Integer quantityScanned) {
    this.quantityScanned = quantityScanned;
  }

  
  /**
   **/
  public CartonContent completed(Date completed) {
    this.completed = completed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("completed")
  public Date getCompleted() {
    return completed;
  }
  public void setCompleted(Date completed) {
    this.completed = completed;
  }

  
  /**
   **/
  public CartonContent toteId(String toteId) {
    this.toteId = toteId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("toteId")
  public String getToteId() {
    return toteId;
  }
  public void setToteId(String toteId) {
    this.toteId = toteId;
  }

  
  /**
   **/
  public CartonContent pickerId(String pickerId) {
    this.pickerId = pickerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pickerId")
  public String getPickerId() {
    return pickerId;
  }
  public void setPickerId(String pickerId) {
    this.pickerId = pickerId;
  }

  
  /**
   **/
  public CartonContent status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  public CartonContent customFields(Map<String, Object> customFields) {
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
    CartonContent cartonContent = (CartonContent) o;
    return Objects.equals(this.id, cartonContent.id) &&
        Objects.equals(this.groupOrderId, cartonContent.groupOrderId) &&
        Objects.equals(this.orderNo, cartonContent.orderNo) &&
        Objects.equals(this.cartonNo, cartonContent.cartonNo) &&
        Objects.equals(this.cartonId, cartonContent.cartonId) &&
        Objects.equals(this.lineItemId, cartonContent.lineItemId) &&
        Objects.equals(this.location, cartonContent.location) &&
        Objects.equals(this.quantity, cartonContent.quantity) &&
        Objects.equals(this.quantityScanned, cartonContent.quantityScanned) &&
        Objects.equals(this.completed, cartonContent.completed) &&
        Objects.equals(this.toteId, cartonContent.toteId) &&
        Objects.equals(this.pickerId, cartonContent.pickerId) &&
        Objects.equals(this.status, cartonContent.status) &&
        Objects.equals(this.customFields, cartonContent.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupOrderId, orderNo, cartonNo, cartonId, lineItemId, location, quantity, quantityScanned, completed, toteId, pickerId, status, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartonContent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupOrderId: ").append(toIndentedString(groupOrderId)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    cartonNo: ").append(toIndentedString(cartonNo)).append("\n");
    sb.append("    cartonId: ").append(toIndentedString(cartonId)).append("\n");
    sb.append("    lineItemId: ").append(toIndentedString(lineItemId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityScanned: ").append(toIndentedString(quantityScanned)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    toteId: ").append(toIndentedString(toteId)).append("\n");
    sb.append("    pickerId: ").append(toIndentedString(pickerId)).append("\n");
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

