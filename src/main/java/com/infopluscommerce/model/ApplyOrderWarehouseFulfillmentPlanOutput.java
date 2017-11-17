package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.infopluscommerce.model.Order;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class ApplyOrderWarehouseFulfillmentPlanOutput   {
  
  private List<Order> orderList = new ArrayList<Order>();

  
  /**
   **/
  public ApplyOrderWarehouseFulfillmentPlanOutput orderList(List<Order> orderList) {
    this.orderList = orderList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderList")
  public List<Order> getOrderList() {
    return orderList;
  }
  public void setOrderList(List<Order> orderList) {
    this.orderList = orderList;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyOrderWarehouseFulfillmentPlanOutput applyOrderWarehouseFulfillmentPlanOutput = (ApplyOrderWarehouseFulfillmentPlanOutput) o;
    return Objects.equals(this.orderList, applyOrderWarehouseFulfillmentPlanOutput.orderList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyOrderWarehouseFulfillmentPlanOutput {\n");
    
    sb.append("    orderList: ").append(toIndentedString(orderList)).append("\n");
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

