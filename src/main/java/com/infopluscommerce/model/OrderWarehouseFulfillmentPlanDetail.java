package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class OrderWarehouseFulfillmentPlanDetail   {
  
  private Integer warehouseId = null;
  private Integer carrierCode = null;
  private List<String> lineItemList = new ArrayList<String>();

  
  /**
   **/
  public OrderWarehouseFulfillmentPlanDetail warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  
  /**
   **/
  public OrderWarehouseFulfillmentPlanDetail carrierCode(Integer carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("carrierCode")
  public Integer getCarrierCode() {
    return carrierCode;
  }
  public void setCarrierCode(Integer carrierCode) {
    this.carrierCode = carrierCode;
  }

  
  /**
   **/
  public OrderWarehouseFulfillmentPlanDetail lineItemList(List<String> lineItemList) {
    this.lineItemList = lineItemList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lineItemList")
  public List<String> getLineItemList() {
    return lineItemList;
  }
  public void setLineItemList(List<String> lineItemList) {
    this.lineItemList = lineItemList;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderWarehouseFulfillmentPlanDetail orderWarehouseFulfillmentPlanDetail = (OrderWarehouseFulfillmentPlanDetail) o;
    return Objects.equals(this.warehouseId, orderWarehouseFulfillmentPlanDetail.warehouseId) &&
        Objects.equals(this.carrierCode, orderWarehouseFulfillmentPlanDetail.carrierCode) &&
        Objects.equals(this.lineItemList, orderWarehouseFulfillmentPlanDetail.lineItemList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouseId, carrierCode, lineItemList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderWarehouseFulfillmentPlanDetail {\n");
    
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    lineItemList: ").append(toIndentedString(lineItemList)).append("\n");
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

