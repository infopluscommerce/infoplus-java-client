package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.infopluscommerce.model.OrderWarehouseFulfillmentPlanDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class OrderWarehouseFulfillmentPlan   {
  
  private Integer score = null;
  private List<OrderWarehouseFulfillmentPlanDetail> planDetailList = new ArrayList<OrderWarehouseFulfillmentPlanDetail>();

  
  /**
   **/
  public OrderWarehouseFulfillmentPlan score(Integer score) {
    this.score = score;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }

  
  /**
   **/
  public OrderWarehouseFulfillmentPlan planDetailList(List<OrderWarehouseFulfillmentPlanDetail> planDetailList) {
    this.planDetailList = planDetailList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("planDetailList")
  public List<OrderWarehouseFulfillmentPlanDetail> getPlanDetailList() {
    return planDetailList;
  }
  public void setPlanDetailList(List<OrderWarehouseFulfillmentPlanDetail> planDetailList) {
    this.planDetailList = planDetailList;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderWarehouseFulfillmentPlan orderWarehouseFulfillmentPlan = (OrderWarehouseFulfillmentPlan) o;
    return Objects.equals(this.score, orderWarehouseFulfillmentPlan.score) &&
        Objects.equals(this.planDetailList, orderWarehouseFulfillmentPlan.planDetailList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, planDetailList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderWarehouseFulfillmentPlan {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    planDetailList: ").append(toIndentedString(planDetailList)).append("\n");
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

