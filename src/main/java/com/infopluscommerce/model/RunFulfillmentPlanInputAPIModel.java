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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * RunFulfillmentPlanInputAPIModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-21T23:57:39.841-06:00")
public class RunFulfillmentPlanInputAPIModel {
  @SerializedName("orderNoList")
  private List<BigDecimal> orderNoList = null;

  @SerializedName("fulfillmentPlanId")
  private Integer fulfillmentPlanId = null;

  @SerializedName("maxSKUsPerBatch")
  private Integer maxSKUsPerBatch = null;

  @SerializedName("firstPickPosition")
  private Integer firstPickPosition = null;

  @SerializedName("maxCartons")
  private Integer maxCartons = null;

  @SerializedName("shipDate")
  private OffsetDateTime shipDate = null;

  public RunFulfillmentPlanInputAPIModel orderNoList(List<BigDecimal> orderNoList) {
    this.orderNoList = orderNoList;
    return this;
  }

  public RunFulfillmentPlanInputAPIModel addOrderNoListItem(BigDecimal orderNoListItem) {
    if (this.orderNoList == null) {
      this.orderNoList = new ArrayList<BigDecimal>();
    }
    this.orderNoList.add(orderNoListItem);
    return this;
  }

   /**
   * Get orderNoList
   * @return orderNoList
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getOrderNoList() {
    return orderNoList;
  }

  public void setOrderNoList(List<BigDecimal> orderNoList) {
    this.orderNoList = orderNoList;
  }

  public RunFulfillmentPlanInputAPIModel fulfillmentPlanId(Integer fulfillmentPlanId) {
    this.fulfillmentPlanId = fulfillmentPlanId;
    return this;
  }

   /**
   * Get fulfillmentPlanId
   * @return fulfillmentPlanId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getFulfillmentPlanId() {
    return fulfillmentPlanId;
  }

  public void setFulfillmentPlanId(Integer fulfillmentPlanId) {
    this.fulfillmentPlanId = fulfillmentPlanId;
  }

  public RunFulfillmentPlanInputAPIModel maxSKUsPerBatch(Integer maxSKUsPerBatch) {
    this.maxSKUsPerBatch = maxSKUsPerBatch;
    return this;
  }

   /**
   * Get maxSKUsPerBatch
   * @return maxSKUsPerBatch
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxSKUsPerBatch() {
    return maxSKUsPerBatch;
  }

  public void setMaxSKUsPerBatch(Integer maxSKUsPerBatch) {
    this.maxSKUsPerBatch = maxSKUsPerBatch;
  }

  public RunFulfillmentPlanInputAPIModel firstPickPosition(Integer firstPickPosition) {
    this.firstPickPosition = firstPickPosition;
    return this;
  }

   /**
   * Get firstPickPosition
   * @return firstPickPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getFirstPickPosition() {
    return firstPickPosition;
  }

  public void setFirstPickPosition(Integer firstPickPosition) {
    this.firstPickPosition = firstPickPosition;
  }

  public RunFulfillmentPlanInputAPIModel maxCartons(Integer maxCartons) {
    this.maxCartons = maxCartons;
    return this;
  }

   /**
   * Get maxCartons
   * @return maxCartons
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxCartons() {
    return maxCartons;
  }

  public void setMaxCartons(Integer maxCartons) {
    this.maxCartons = maxCartons;
  }

  public RunFulfillmentPlanInputAPIModel shipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
    return this;
  }

   /**
   * Get shipDate
   * @return shipDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getShipDate() {
    return shipDate;
  }

  public void setShipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunFulfillmentPlanInputAPIModel runFulfillmentPlanInputAPIModel = (RunFulfillmentPlanInputAPIModel) o;
    return Objects.equals(this.orderNoList, runFulfillmentPlanInputAPIModel.orderNoList) &&
        Objects.equals(this.fulfillmentPlanId, runFulfillmentPlanInputAPIModel.fulfillmentPlanId) &&
        Objects.equals(this.maxSKUsPerBatch, runFulfillmentPlanInputAPIModel.maxSKUsPerBatch) &&
        Objects.equals(this.firstPickPosition, runFulfillmentPlanInputAPIModel.firstPickPosition) &&
        Objects.equals(this.maxCartons, runFulfillmentPlanInputAPIModel.maxCartons) &&
        Objects.equals(this.shipDate, runFulfillmentPlanInputAPIModel.shipDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNoList, fulfillmentPlanId, maxSKUsPerBatch, firstPickPosition, maxCartons, shipDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunFulfillmentPlanInputAPIModel {\n");
    
    sb.append("    orderNoList: ").append(toIndentedString(orderNoList)).append("\n");
    sb.append("    fulfillmentPlanId: ").append(toIndentedString(fulfillmentPlanId)).append("\n");
    sb.append("    maxSKUsPerBatch: ").append(toIndentedString(maxSKUsPerBatch)).append("\n");
    sb.append("    firstPickPosition: ").append(toIndentedString(firstPickPosition)).append("\n");
    sb.append("    maxCartons: ").append(toIndentedString(maxCartons)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
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

