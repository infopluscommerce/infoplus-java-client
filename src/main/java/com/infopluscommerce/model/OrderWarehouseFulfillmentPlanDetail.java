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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OrderWarehouseFulfillmentPlanDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-21T23:57:39.841-06:00")
public class OrderWarehouseFulfillmentPlanDetail {
  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("carrierCode")
  private Integer carrierCode = null;

  @SerializedName("lineItemList")
  private List<String> lineItemList = null;

  public OrderWarehouseFulfillmentPlanDetail warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

   /**
   * Get warehouseId
   * @return warehouseId
  **/
  @ApiModelProperty(value = "")
  public Integer getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  public OrderWarehouseFulfillmentPlanDetail carrierCode(Integer carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * Get carrierCode
   * @return carrierCode
  **/
  @ApiModelProperty(value = "")
  public Integer getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(Integer carrierCode) {
    this.carrierCode = carrierCode;
  }

  public OrderWarehouseFulfillmentPlanDetail lineItemList(List<String> lineItemList) {
    this.lineItemList = lineItemList;
    return this;
  }

  public OrderWarehouseFulfillmentPlanDetail addLineItemListItem(String lineItemListItem) {
    if (this.lineItemList == null) {
      this.lineItemList = new ArrayList<String>();
    }
    this.lineItemList.add(lineItemListItem);
    return this;
  }

   /**
   * Get lineItemList
   * @return lineItemList
  **/
  @ApiModelProperty(value = "")
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

