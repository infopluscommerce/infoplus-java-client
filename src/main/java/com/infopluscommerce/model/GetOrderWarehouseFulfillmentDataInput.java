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

/**
 * GetOrderWarehouseFulfillmentDataInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-10T10:01:29.494-06:00")
public class GetOrderWarehouseFulfillmentDataInput {
  @SerializedName("orderNo")
  private String orderNo = null;

   /**
   * Get orderNo
   * @return orderNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOrderNo() {
    return orderNo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrderWarehouseFulfillmentDataInput getOrderWarehouseFulfillmentDataInput = (GetOrderWarehouseFulfillmentDataInput) o;
    return Objects.equals(this.orderNo, getOrderWarehouseFulfillmentDataInput.orderNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrderWarehouseFulfillmentDataInput {\n");
    
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
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

