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
 * ProductionLot
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-16T13:04:33.234-06:00")
public class ProductionLot {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("productionLot")
  private String productionLot = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  @SerializedName("sku")
  private String sku = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(value = "")
  public Integer getLobId() {
    return lobId;
  }

  public ProductionLot productionLot(String productionLot) {
    this.productionLot = productionLot;
    return this;
  }

   /**
   * Get productionLot
   * @return productionLot
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProductionLot() {
    return productionLot;
  }

  public void setProductionLot(String productionLot) {
    this.productionLot = productionLot;
  }

  public ProductionLot quantity(Integer quantity) {
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

  public ProductionLot customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ProductionLot putCustomFieldsItem(String key, Object customFieldsItem) {
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

  public ProductionLot sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductionLot productionLot = (ProductionLot) o;
    return Objects.equals(this.id, productionLot.id) &&
        Objects.equals(this.lobId, productionLot.lobId) &&
        Objects.equals(this.productionLot, productionLot.productionLot) &&
        Objects.equals(this.quantity, productionLot.quantity) &&
        Objects.equals(this.customFields, productionLot.customFields) &&
        Objects.equals(this.sku, productionLot.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lobId, productionLot, quantity, customFields, sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductionLot {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    productionLot: ").append(toIndentedString(productionLot)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

