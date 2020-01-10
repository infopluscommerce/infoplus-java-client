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
 * Carton
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-09T22:08:36.018-06:00")
public class Carton {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("orderNo")
  private BigDecimal orderNo = null;

  @SerializedName("cartonNo")
  private Integer cartonNo = null;

  @SerializedName("cartonTypeId")
  private Integer cartonTypeId = null;

  @SerializedName("cartonLPN")
  private String cartonLPN = null;

  @SerializedName("weightLbs")
  private BigDecimal weightLbs = null;

  @SerializedName("layoutPosition")
  private String layoutPosition = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public Carton orderNo(BigDecimal orderNo) {
    this.orderNo = orderNo;
    return this;
  }

   /**
   * Get orderNo
   * @return orderNo
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(BigDecimal orderNo) {
    this.orderNo = orderNo;
  }

  public Carton cartonNo(Integer cartonNo) {
    this.cartonNo = cartonNo;
    return this;
  }

   /**
   * Get cartonNo
   * @return cartonNo
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCartonNo() {
    return cartonNo;
  }

  public void setCartonNo(Integer cartonNo) {
    this.cartonNo = cartonNo;
  }

  public Carton cartonTypeId(Integer cartonTypeId) {
    this.cartonTypeId = cartonTypeId;
    return this;
  }

   /**
   * Get cartonTypeId
   * @return cartonTypeId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCartonTypeId() {
    return cartonTypeId;
  }

  public void setCartonTypeId(Integer cartonTypeId) {
    this.cartonTypeId = cartonTypeId;
  }

  public Carton cartonLPN(String cartonLPN) {
    this.cartonLPN = cartonLPN;
    return this;
  }

   /**
   * Get cartonLPN
   * @return cartonLPN
  **/
  @ApiModelProperty(value = "")
  public String getCartonLPN() {
    return cartonLPN;
  }

  public void setCartonLPN(String cartonLPN) {
    this.cartonLPN = cartonLPN;
  }

  public Carton weightLbs(BigDecimal weightLbs) {
    this.weightLbs = weightLbs;
    return this;
  }

   /**
   * Get weightLbs
   * @return weightLbs
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getWeightLbs() {
    return weightLbs;
  }

  public void setWeightLbs(BigDecimal weightLbs) {
    this.weightLbs = weightLbs;
  }

  public Carton layoutPosition(String layoutPosition) {
    this.layoutPosition = layoutPosition;
    return this;
  }

   /**
   * Get layoutPosition
   * @return layoutPosition
  **/
  @ApiModelProperty(value = "")
  public String getLayoutPosition() {
    return layoutPosition;
  }

  public void setLayoutPosition(String layoutPosition) {
    this.layoutPosition = layoutPosition;
  }

  public Carton lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLobId() {
    return lobId;
  }

  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  public Carton customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Carton putCustomFieldsItem(String key, Object customFieldsItem) {
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
    Carton carton = (Carton) o;
    return Objects.equals(this.id, carton.id) &&
        Objects.equals(this.orderNo, carton.orderNo) &&
        Objects.equals(this.cartonNo, carton.cartonNo) &&
        Objects.equals(this.cartonTypeId, carton.cartonTypeId) &&
        Objects.equals(this.cartonLPN, carton.cartonLPN) &&
        Objects.equals(this.weightLbs, carton.weightLbs) &&
        Objects.equals(this.layoutPosition, carton.layoutPosition) &&
        Objects.equals(this.lobId, carton.lobId) &&
        Objects.equals(this.customFields, carton.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderNo, cartonNo, cartonTypeId, cartonLPN, weightLbs, layoutPosition, lobId, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carton {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    cartonNo: ").append(toIndentedString(cartonNo)).append("\n");
    sb.append("    cartonTypeId: ").append(toIndentedString(cartonTypeId)).append("\n");
    sb.append("    cartonLPN: ").append(toIndentedString(cartonLPN)).append("\n");
    sb.append("    weightLbs: ").append(toIndentedString(weightLbs)).append("\n");
    sb.append("    layoutPosition: ").append(toIndentedString(layoutPosition)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
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

