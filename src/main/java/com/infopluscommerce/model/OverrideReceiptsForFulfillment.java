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
 * OverrideReceiptsForFulfillment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-12T09:13:52.656-05:00")
public class OverrideReceiptsForFulfillment {
  @SerializedName("itemReceiptId")
  private Integer itemReceiptId = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

   /**
   * Get itemReceiptId
   * @return itemReceiptId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getItemReceiptId() {
    return itemReceiptId;
  }

  public OverrideReceiptsForFulfillment customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public OverrideReceiptsForFulfillment putCustomFieldsItem(String key, Object customFieldsItem) {
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
    OverrideReceiptsForFulfillment overrideReceiptsForFulfillment = (OverrideReceiptsForFulfillment) o;
    return Objects.equals(this.itemReceiptId, overrideReceiptsForFulfillment.itemReceiptId) &&
        Objects.equals(this.customFields, overrideReceiptsForFulfillment.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemReceiptId, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverrideReceiptsForFulfillment {\n");
    
    sb.append("    itemReceiptId: ").append(toIndentedString(itemReceiptId)).append("\n");
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

