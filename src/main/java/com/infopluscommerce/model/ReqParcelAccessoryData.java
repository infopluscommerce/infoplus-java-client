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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ReqParcelAccessoryData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-19T12:05:52.234-06:00")
public class ReqParcelAccessoryData {
  @SerializedName("accessory")
  private String accessory = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  public ReqParcelAccessoryData accessory(String accessory) {
    this.accessory = accessory;
    return this;
  }

   /**
   * Get accessory
   * @return accessory
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccessory() {
    return accessory;
  }

  public void setAccessory(String accessory) {
    this.accessory = accessory;
  }

  public ReqParcelAccessoryData amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public ReqParcelAccessoryData customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ReqParcelAccessoryData putCustomFieldsItem(String key, Object customFieldsItem) {
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
    ReqParcelAccessoryData reqParcelAccessoryData = (ReqParcelAccessoryData) o;
    return Objects.equals(this.accessory, reqParcelAccessoryData.accessory) &&
        Objects.equals(this.amount, reqParcelAccessoryData.amount) &&
        Objects.equals(this.customFields, reqParcelAccessoryData.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessory, amount, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReqParcelAccessoryData {\n");
    
    sb.append("    accessory: ").append(toIndentedString(accessory)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

