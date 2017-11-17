package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class KitComponent   {
  
  private String sku = null;
  private Integer quantity = null;
  private String instructions = null;
  private String additionalServices = null;
  private String critical = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  /**
   **/
  public KitComponent sku(String sku) {
    this.sku = sku;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  
  /**
   **/
  public KitComponent quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  /**
   **/
  public KitComponent instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("instructions")
  public String getInstructions() {
    return instructions;
  }
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  
  /**
   **/
  public KitComponent additionalServices(String additionalServices) {
    this.additionalServices = additionalServices;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalServices")
  public String getAdditionalServices() {
    return additionalServices;
  }
  public void setAdditionalServices(String additionalServices) {
    this.additionalServices = additionalServices;
  }

  
  /**
   **/
  public KitComponent critical(String critical) {
    this.critical = critical;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("critical")
  public String getCritical() {
    return critical;
  }
  public void setCritical(String critical) {
    this.critical = critical;
  }

  
  /**
   **/
  public KitComponent customFields(Map<String, Object> customFields) {
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

