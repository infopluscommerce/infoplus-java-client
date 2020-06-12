/*
 * Infoplus API
 * Infoplus API.
 *
 * OpenAPI spec version: beta
 * Contact: api@infopluscommerce.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infopluscommerce.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.infopluscommerce.model.OrderWarehouseFulfillmentPlan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ApplyOrderWarehouseFulfillmentPlanInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-12T09:13:52.656-05:00")
public class ApplyOrderWarehouseFulfillmentPlanInput {
  @SerializedName("orderNo")
  private String orderNo = null;

  @SerializedName("plan")
  private OrderWarehouseFulfillmentPlan plan = null;

   /**
   * Get orderNo
   * @return orderNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOrderNo() {
    return orderNo;
  }

  public ApplyOrderWarehouseFulfillmentPlanInput plan(OrderWarehouseFulfillmentPlan plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @ApiModelProperty(required = true, value = "")
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

