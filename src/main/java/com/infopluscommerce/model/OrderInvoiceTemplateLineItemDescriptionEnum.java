package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class OrderInvoiceTemplateLineItemDescriptionEnum   {
  
  private String id = null;
  private String label = null;
  private String fullEntityClassName = null;

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  
  /**
   **/
  public OrderInvoiceTemplateLineItemDescriptionEnum fullEntityClassName(String fullEntityClassName) {
    this.fullEntityClassName = fullEntityClassName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fullEntityClassName")
  public String getFullEntityClassName() {
    return fullEntityClassName;
  }
  public void setFullEntityClassName(String fullEntityClassName) {
    this.fullEntityClassName = fullEntityClassName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderInvoiceTemplateLineItemDescriptionEnum orderInvoiceTemplateLineItemDescriptionEnum = (OrderInvoiceTemplateLineItemDescriptionEnum) o;
    return Objects.equals(this.id, orderInvoiceTemplateLineItemDescriptionEnum.id) &&
        Objects.equals(this.label, orderInvoiceTemplateLineItemDescriptionEnum.label) &&
        Objects.equals(this.fullEntityClassName, orderInvoiceTemplateLineItemDescriptionEnum.fullEntityClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, fullEntityClassName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderInvoiceTemplateLineItemDescriptionEnum {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    fullEntityClassName: ").append(toIndentedString(fullEntityClassName)).append("\n");
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

