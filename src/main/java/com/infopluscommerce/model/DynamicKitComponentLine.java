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
 * DynamicKitComponentLine
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-16T13:04:33.234-06:00")
public class DynamicKitComponentLine {
  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("perKitQuantity")
  private Integer perKitQuantity = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLobId() {
    return lobId;
  }

  public DynamicKitComponentLine sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public DynamicKitComponentLine perKitQuantity(Integer perKitQuantity) {
    this.perKitQuantity = perKitQuantity;
    return this;
  }

   /**
   * Get perKitQuantity
   * @return perKitQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getPerKitQuantity() {
    return perKitQuantity;
  }

  public void setPerKitQuantity(Integer perKitQuantity) {
    this.perKitQuantity = perKitQuantity;
  }

  public DynamicKitComponentLine customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public DynamicKitComponentLine putCustomFieldsItem(String key, Object customFieldsItem) {
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
    DynamicKitComponentLine dynamicKitComponentLine = (DynamicKitComponentLine) o;
    return Objects.equals(this.lobId, dynamicKitComponentLine.lobId) &&
        Objects.equals(this.sku, dynamicKitComponentLine.sku) &&
        Objects.equals(this.perKitQuantity, dynamicKitComponentLine.perKitQuantity) &&
        Objects.equals(this.customFields, dynamicKitComponentLine.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lobId, sku, perKitQuantity, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicKitComponentLine {\n");
    
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    perKitQuantity: ").append(toIndentedString(perKitQuantity)).append("\n");
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

