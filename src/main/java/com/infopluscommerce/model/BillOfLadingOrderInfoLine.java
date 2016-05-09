package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class BillOfLadingOrderInfoLine   {
  
  private String customerOrderNo = null;
  private Integer noPackages = null;
  private Integer weight = null;
  private Boolean palletslip = false;
  private String additionalShipperInfo = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customerOrderNo")
  public String getCustomerOrderNo() {
    return customerOrderNo;
  }
  public void setCustomerOrderNo(String customerOrderNo) {
    this.customerOrderNo = customerOrderNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("noPackages")
  public Integer getNoPackages() {
    return noPackages;
  }
  public void setNoPackages(Integer noPackages) {
    this.noPackages = noPackages;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }
  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("palletslip")
  public Boolean getPalletslip() {
    return palletslip;
  }
  public void setPalletslip(Boolean palletslip) {
    this.palletslip = palletslip;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("additionalShipperInfo")
  public String getAdditionalShipperInfo() {
    return additionalShipperInfo;
  }
  public void setAdditionalShipperInfo(String additionalShipperInfo) {
    this.additionalShipperInfo = additionalShipperInfo;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillOfLadingOrderInfoLine billOfLadingOrderInfoLine = (BillOfLadingOrderInfoLine) o;
    return Objects.equals(customerOrderNo, billOfLadingOrderInfoLine.customerOrderNo) &&
        Objects.equals(noPackages, billOfLadingOrderInfoLine.noPackages) &&
        Objects.equals(weight, billOfLadingOrderInfoLine.weight) &&
        Objects.equals(palletslip, billOfLadingOrderInfoLine.palletslip) &&
        Objects.equals(additionalShipperInfo, billOfLadingOrderInfoLine.additionalShipperInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOrderNo, noPackages, weight, palletslip, additionalShipperInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillOfLadingOrderInfoLine {\n");
    
    sb.append("    customerOrderNo: ").append(toIndentedString(customerOrderNo)).append("\n");
    sb.append("    noPackages: ").append(toIndentedString(noPackages)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    palletslip: ").append(toIndentedString(palletslip)).append("\n");
    sb.append("    additionalShipperInfo: ").append(toIndentedString(additionalShipperInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

