package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.infopluscommerce.model.OrderWarehouseFulfillmentRawSkuData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class OrderWarehouseFulfillmentRawData   {
  
  private Integer warehouseId = null;
  private Boolean canFulfill = false;
  private Map<String, OrderWarehouseFulfillmentRawSkuData> skuMap = new HashMap<String, OrderWarehouseFulfillmentRawSkuData>();

  
  /**
   **/
  public OrderWarehouseFulfillmentRawData warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  
  /**
   **/
  public OrderWarehouseFulfillmentRawData canFulfill(Boolean canFulfill) {
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

  
  /**
   **/
  public OrderWarehouseFulfillmentRawData skuMap(Map<String, OrderWarehouseFulfillmentRawSkuData> skuMap) {
    this.skuMap = skuMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skuMap")
  public Map<String, OrderWarehouseFulfillmentRawSkuData> getSkuMap() {
    return skuMap;
  }
  public void setSkuMap(Map<String, OrderWarehouseFulfillmentRawSkuData> skuMap) {
    this.skuMap = skuMap;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderWarehouseFulfillmentRawData orderWarehouseFulfillmentRawData = (OrderWarehouseFulfillmentRawData) o;
    return Objects.equals(this.warehouseId, orderWarehouseFulfillmentRawData.warehouseId) &&
        Objects.equals(this.canFulfill, orderWarehouseFulfillmentRawData.canFulfill) &&
        Objects.equals(this.skuMap, orderWarehouseFulfillmentRawData.skuMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouseId, canFulfill, skuMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderWarehouseFulfillmentRawData {\n");
    
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    canFulfill: ").append(toIndentedString(canFulfill)).append("\n");
    sb.append("    skuMap: ").append(toIndentedString(skuMap)).append("\n");
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

