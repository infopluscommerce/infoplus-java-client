package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-04T22:56:01.104-05:00")
public class BillOfLadingOrderInfoLine   {
  
  private String customerOrderNo = null;
  private Integer noPackages = null;
  private Integer weight = null;
  private Boolean palletslip = false;
  private String additionalShipperInfo = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  /**
   **/
  public BillOfLadingOrderInfoLine customerOrderNo(String customerOrderNo) {
    this.customerOrderNo = customerOrderNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerOrderNo")
  public String getCustomerOrderNo() {
    return customerOrderNo;
  }
  public void setCustomerOrderNo(String customerOrderNo) {
    this.customerOrderNo = customerOrderNo;
  }

  
  /**
   **/
  public BillOfLadingOrderInfoLine noPackages(Integer noPackages) {
    this.noPackages = noPackages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("noPackages")
  public Integer getNoPackages() {
    return noPackages;
  }
  public void setNoPackages(Integer noPackages) {
    this.noPackages = noPackages;
  }

  
  /**
   **/
  public BillOfLadingOrderInfoLine weight(Integer weight) {
    this.weight = weight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }
  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  
  /**
   **/
  public BillOfLadingOrderInfoLine palletslip(Boolean palletslip) {
    this.palletslip = palletslip;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("palletslip")
  public Boolean getPalletslip() {
    return palletslip;
  }
  public void setPalletslip(Boolean palletslip) {
    this.palletslip = palletslip;
  }

  
  /**
   **/
  public BillOfLadingOrderInfoLine additionalShipperInfo(String additionalShipperInfo) {
    this.additionalShipperInfo = additionalShipperInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("additionalShipperInfo")
  public String getAdditionalShipperInfo() {
    return additionalShipperInfo;
  }
  public void setAdditionalShipperInfo(String additionalShipperInfo) {
    this.additionalShipperInfo = additionalShipperInfo;
  }

  
  /**
   **/
  public BillOfLadingOrderInfoLine customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customFields")
  public Map<String, Object> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillOfLadingOrderInfoLine billOfLadingOrderInfoLine = (BillOfLadingOrderInfoLine) o;
    return Objects.equals(this.customerOrderNo, billOfLadingOrderInfoLine.customerOrderNo) &&
        Objects.equals(this.noPackages, billOfLadingOrderInfoLine.noPackages) &&
        Objects.equals(this.weight, billOfLadingOrderInfoLine.weight) &&
        Objects.equals(this.palletslip, billOfLadingOrderInfoLine.palletslip) &&
        Objects.equals(this.additionalShipperInfo, billOfLadingOrderInfoLine.additionalShipperInfo) &&
        Objects.equals(this.customFields, billOfLadingOrderInfoLine.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOrderNo, noPackages, weight, palletslip, additionalShipperInfo, customFields);
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
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

