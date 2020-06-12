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
import com.infopluscommerce.model.OrderWarehouseFulfillmentRawData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GetOrderWarehouseFulfillmentDataOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-12T09:13:52.656-05:00")
public class GetOrderWarehouseFulfillmentDataOutput {
  @SerializedName("rawData")
  private Map<String, OrderWarehouseFulfillmentRawData> rawData = new HashMap<String, OrderWarehouseFulfillmentRawData>();

  @SerializedName("planList")
  private List<OrderWarehouseFulfillmentPlan> planList = new ArrayList<OrderWarehouseFulfillmentPlan>();

  public GetOrderWarehouseFulfillmentDataOutput rawData(Map<String, OrderWarehouseFulfillmentRawData> rawData) {
    this.rawData = rawData;
    return this;
  }

  public GetOrderWarehouseFulfillmentDataOutput putRawDataItem(String key, OrderWarehouseFulfillmentRawData rawDataItem) {
    this.rawData.put(key, rawDataItem);
    return this;
  }

   /**
   * Get rawData
   * @return rawData
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, OrderWarehouseFulfillmentRawData> getRawData() {
    return rawData;
  }

  public void setRawData(Map<String, OrderWarehouseFulfillmentRawData> rawData) {
    this.rawData = rawData;
  }

  public GetOrderWarehouseFulfillmentDataOutput planList(List<OrderWarehouseFulfillmentPlan> planList) {
    this.planList = planList;
    return this;
  }

  public GetOrderWarehouseFulfillmentDataOutput addPlanListItem(OrderWarehouseFulfillmentPlan planListItem) {
    this.planList.add(planListItem);
    return this;
  }

   /**
   * Get planList
   * @return planList
  **/
  @ApiModelProperty(required = true, value = "")
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

