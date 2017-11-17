package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.infopluscommerce.model.OrderWarehouseFulfillmentPlan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class ApplyOrderWarehouseFulfillmentPlanInput   {
  
  private String orderNo = null;
  private OrderWarehouseFulfillmentPlan plan = null;

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("orderNo")
  public String getOrderNo() {
    return orderNo;
  }

  
  /**
   **/
  public ApplyOrderWarehouseFulfillmentPlanInput plan(OrderWarehouseFulfillmentPlan plan) {
    this.plan = plan;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("plan")
  public OrderWarehouseFulfillmentPlan getPlan() {
    return plan;
  }
  public void setPlan(OrderWarehouseFulfillmentPlan plan) {
    this.plan = plan;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyOrderWarehouseFulfillmentPlanInput applyOrderWarehouseFulfillmentPlanInput = (ApplyOrderWarehouseFulfillmentPlanInput) o;
    return Objects.equals(this.orderNo, applyOrderWarehouseFulfillmentPlanInput.orderNo) &&
        Objects.equals(this.plan, applyOrderWarehouseFulfillmentPlanInput.plan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNo, plan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyOrderWarehouseFulfillmentPlanInput {\n");
    
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
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

