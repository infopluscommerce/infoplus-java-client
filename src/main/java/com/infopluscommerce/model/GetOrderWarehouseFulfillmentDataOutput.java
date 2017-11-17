package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.infopluscommerce.model.OrderWarehouseFulfillmentPlan;
import com.infopluscommerce.model.OrderWarehouseFulfillmentRawData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class GetOrderWarehouseFulfillmentDataOutput   {
  
  private Map<String, OrderWarehouseFulfillmentRawData> rawData = new HashMap<String, OrderWarehouseFulfillmentRawData>();
  private List<OrderWarehouseFulfillmentPlan> planList = new ArrayList<OrderWarehouseFulfillmentPlan>();

  
  /**
   **/
  public GetOrderWarehouseFulfillmentDataOutput rawData(Map<String, OrderWarehouseFulfillmentRawData> rawData) {
    this.rawData = rawData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("rawData")
  public Map<String, OrderWarehouseFulfillmentRawData> getRawData() {
    return rawData;
  }
  public void setRawData(Map<String, OrderWarehouseFulfillmentRawData> rawData) {
    this.rawData = rawData;
  }

  
  /**
   **/
  public GetOrderWarehouseFulfillmentDataOutput planList(List<OrderWarehouseFulfillmentPlan> planList) {
    this.planList = planList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("planList")
  public List<OrderWarehouseFulfillmentPlan> getPlanList() {
    return planList;
  }
  public void setPlanList(List<OrderWarehouseFulfillmentPlan> planList) {
    this.planList = planList;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrderWarehouseFulfillmentDataOutput getOrderWarehouseFulfillmentDataOutput = (GetOrderWarehouseFulfillmentDataOutput) o;
    return Objects.equals(this.rawData, getOrderWarehouseFulfillmentDataOutput.rawData) &&
        Objects.equals(this.planList, getOrderWarehouseFulfillmentDataOutput.planList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawData, planList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrderWarehouseFulfillmentDataOutput {\n");
    
    sb.append("    rawData: ").append(toIndentedString(rawData)).append("\n");
    sb.append("    planList: ").append(toIndentedString(planList)).append("\n");
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

