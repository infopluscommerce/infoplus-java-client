package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class GetOrderWarehouseFulfillmentDataInput   {
  
  private String orderNo = null;

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("orderNo")
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

