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

/**
 * Carrier
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T10:39:26.624-05:00")
public class Carrier {
  @SerializedName("carrier")
  private Integer carrier = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("fullEntityClassName")
  private String fullEntityClassName = null;

   /**
   * Get carrier
   * @return carrier
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCarrier() {
    return carrier;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLabel() {
    return label;
  }

  public Carrier fullEntityClassName(String fullEntityClassName) {
    this.fullEntityClassName = fullEntityClassName;
    return this;
  }

   /**
   * Get fullEntityClassName
   * @return fullEntityClassName
  **/
  @ApiModelProperty(value = "")
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
    Carrier carrier = (Carrier) o;
    return Objects.equals(this.carrier, carrier.carrier) &&
        Objects.equals(this.label, carrier.label) &&
        Objects.equals(this.fullEntityClassName, carrier.fullEntityClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrier, label, fullEntityClassName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carrier {\n");
    
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
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

