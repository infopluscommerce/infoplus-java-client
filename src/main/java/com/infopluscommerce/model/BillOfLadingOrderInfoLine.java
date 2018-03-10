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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BillOfLadingOrderInfoLine
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-10T10:09:46.841-06:00")
public class BillOfLadingOrderInfoLine {
  @SerializedName("customerOrderNo")
  private String customerOrderNo = null;

  @SerializedName("noPackages")
  private Integer noPackages = null;

  @SerializedName("weight")
  private Integer weight = null;

  @SerializedName("palletslip")
  private Boolean palletslip = false;

  @SerializedName("additionalShipperInfo")
  private String additionalShipperInfo = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  public BillOfLadingOrderInfoLine customerOrderNo(String customerOrderNo) {
    this.customerOrderNo = customerOrderNo;
    return this;
  }

   /**
   * Get customerOrderNo
   * @return customerOrderNo
  **/
  @ApiModelProperty(value = "")
  public String getCustomerOrderNo() {
    return customerOrderNo;
  }

  public void setCustomerOrderNo(String customerOrderNo) {
    this.customerOrderNo = customerOrderNo;
  }

  public BillOfLadingOrderInfoLine noPackages(Integer noPackages) {
    this.noPackages = noPackages;
    return this;
  }

   /**
   * Get noPackages
   * @return noPackages
  **/
  @ApiModelProperty(value = "")
  public Integer getNoPackages() {
    return noPackages;
  }

  public void setNoPackages(Integer noPackages) {
    this.noPackages = noPackages;
  }

  public BillOfLadingOrderInfoLine weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public BillOfLadingOrderInfoLine palletslip(Boolean palletslip) {
    this.palletslip = palletslip;
    return this;
  }

   /**
   * Get palletslip
   * @return palletslip
  **/
  @ApiModelProperty(value = "")
  public Boolean isPalletslip() {
    return palletslip;
  }

  public void setPalletslip(Boolean palletslip) {
    this.palletslip = palletslip;
  }

  public BillOfLadingOrderInfoLine additionalShipperInfo(String additionalShipperInfo) {
    this.additionalShipperInfo = additionalShipperInfo;
    return this;
  }

   /**
   * Get additionalShipperInfo
   * @return additionalShipperInfo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAdditionalShipperInfo() {
    return additionalShipperInfo;
  }

  public void setAdditionalShipperInfo(String additionalShipperInfo) {
    this.additionalShipperInfo = additionalShipperInfo;
  }

  public BillOfLadingOrderInfoLine customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public BillOfLadingOrderInfoLine putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<String, Object>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
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

