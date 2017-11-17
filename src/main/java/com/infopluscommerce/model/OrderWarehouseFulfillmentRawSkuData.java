package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class OrderWarehouseFulfillmentRawSkuData   {
  
  private Integer quantity = null;
  private Boolean canFulfill = false;

  
  /**
   **/
  public OrderWarehouseFulfillmentRawSkuData quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  /**
   **/
  public OrderWarehouseFulfillmentRawSkuData canFulfill(Boolean canFulfill) {
    this.canFulfill = canFulfill;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("canFulfill")
  public Boolean getCanFulfill() {
    return canFulfill;
  }
  public void setCanFulfill(Boolean canFulfill) {
    this.canFulfill = canFulfill;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderWarehouseFulfillmentRawSkuData orderWarehouseFulfillmentRawSkuData = (OrderWarehouseFulfillmentRawSkuData) o;
    return Objects.equals(this.quantity, orderWarehouseFulfillmentRawSkuData.quantity) &&
        Objects.equals(this.canFulfill, orderWarehouseFulfillmentRawSkuData.canFulfill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, canFulfill);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderWarehouseFulfillmentRawSkuData {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    canFulfill: ").append(toIndentedString(canFulfill)).append("\n");
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

