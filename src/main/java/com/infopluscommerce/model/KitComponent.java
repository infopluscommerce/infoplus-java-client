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
 * KitComponent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-19T18:17:24.078-06:00")
public class KitComponent {
  @SerializedName("sku")
  private String sku = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("instructions")
  private String instructions = null;

  @SerializedName("additionalServices")
  private String additionalServices = null;

  @SerializedName("critical")
  private String critical = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  public KitComponent sku(String sku) {
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

  public KitComponent quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public KitComponent instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * Get instructions
   * @return instructions
  **/
  @ApiModelProperty(value = "")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public KitComponent additionalServices(String additionalServices) {
    this.additionalServices = additionalServices;
    return this;
  }

   /**
   * Get additionalServices
   * @return additionalServices
  **/
  @ApiModelProperty(value = "")
  public String getAdditionalServices() {
    return additionalServices;
  }

  public void setAdditionalServices(String additionalServices) {
    this.additionalServices = additionalServices;
  }

  public KitComponent critical(String critical) {
    this.critical = critical;
    return this;
  }

   /**
   * Get critical
   * @return critical
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCritical() {
    return critical;
  }

  public void setCritical(String critical) {
    this.critical = critical;
  }

  public KitComponent customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public KitComponent putCustomFieldsItem(String key, Object customFieldsItem) {
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
    KitComponent kitComponent = (KitComponent) o;
    return Objects.equals(this.sku, kitComponent.sku) &&
        Objects.equals(this.quantity, kitComponent.quantity) &&
        Objects.equals(this.instructions, kitComponent.instructions) &&
        Objects.equals(this.additionalServices, kitComponent.additionalServices) &&
        Objects.equals(this.critical, kitComponent.critical) &&
        Objects.equals(this.customFields, kitComponent.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, quantity, instructions, additionalServices, critical, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KitComponent {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    additionalServices: ").append(toIndentedString(additionalServices)).append("\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
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

