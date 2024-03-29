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
 * CartonType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-16T13:04:33.234-06:00")
public class CartonType {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("abbreviation")
  private String abbreviation = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("lengthIn")
  private BigDecimal lengthIn = null;

  @SerializedName("widthIn")
  private BigDecimal widthIn = null;

  @SerializedName("heightIn")
  private BigDecimal heightIn = null;

  @SerializedName("innerLengthIn")
  private BigDecimal innerLengthIn = null;

  @SerializedName("innerWidthIn")
  private BigDecimal innerWidthIn = null;

  @SerializedName("innerHeightIn")
  private BigDecimal innerHeightIn = null;

  @SerializedName("weightLbs")
  private BigDecimal weightLbs = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("isActive")
  private Boolean isActive = false;

  @SerializedName("predefinedPackageTypeId")
  private Integer predefinedPackageTypeId = null;

  @SerializedName("origin")
  private String origin = null;

  @SerializedName("type")
  private String type = null;

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

  public CartonType abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

   /**
   * Get abbreviation
   * @return abbreviation
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public CartonType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CartonType lengthIn(BigDecimal lengthIn) {
    this.lengthIn = lengthIn;
    return this;
  }

   /**
   * Get lengthIn
   * @return lengthIn
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getLengthIn() {
    return lengthIn;
  }

  public void setLengthIn(BigDecimal lengthIn) {
    this.lengthIn = lengthIn;
  }

  public CartonType widthIn(BigDecimal widthIn) {
    this.widthIn = widthIn;
    return this;
  }

   /**
   * Get widthIn
   * @return widthIn
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getWidthIn() {
    return widthIn;
  }

  public void setWidthIn(BigDecimal widthIn) {
    this.widthIn = widthIn;
  }

  public CartonType heightIn(BigDecimal heightIn) {
    this.heightIn = heightIn;
    return this;
  }

   /**
   * Get heightIn
   * @return heightIn
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getHeightIn() {
    return heightIn;
  }

  public void setHeightIn(BigDecimal heightIn) {
    this.heightIn = heightIn;
  }

  public CartonType innerLengthIn(BigDecimal innerLengthIn) {
    this.innerLengthIn = innerLengthIn;
    return this;
  }

   /**
   * Get innerLengthIn
   * @return innerLengthIn
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getInnerLengthIn() {
    return innerLengthIn;
  }

  public void setInnerLengthIn(BigDecimal innerLengthIn) {
    this.innerLengthIn = innerLengthIn;
  }

  public CartonType innerWidthIn(BigDecimal innerWidthIn) {
    this.innerWidthIn = innerWidthIn;
    return this;
  }

   /**
   * Get innerWidthIn
   * @return innerWidthIn
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getInnerWidthIn() {
    return innerWidthIn;
  }

  public void setInnerWidthIn(BigDecimal innerWidthIn) {
    this.innerWidthIn = innerWidthIn;
  }

  public CartonType innerHeightIn(BigDecimal innerHeightIn) {
    this.innerHeightIn = innerHeightIn;
    return this;
  }

   /**
   * Get innerHeightIn
   * @return innerHeightIn
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getInnerHeightIn() {
    return innerHeightIn;
  }

  public void setInnerHeightIn(BigDecimal innerHeightIn) {
    this.innerHeightIn = innerHeightIn;
  }

  public CartonType weightLbs(BigDecimal weightLbs) {
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

  public CartonType lobId(Integer lobId) {
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

  public CartonType isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public CartonType predefinedPackageTypeId(Integer predefinedPackageTypeId) {
    this.predefinedPackageTypeId = predefinedPackageTypeId;
    return this;
  }

   /**
   * Get predefinedPackageTypeId
   * @return predefinedPackageTypeId
  **/
  @ApiModelProperty(value = "")
  public Integer getPredefinedPackageTypeId() {
    return predefinedPackageTypeId;
  }

  public void setPredefinedPackageTypeId(Integer predefinedPackageTypeId) {
    this.predefinedPackageTypeId = predefinedPackageTypeId;
  }

   /**
   * Get origin
   * @return origin
  **/
  @ApiModelProperty(value = "")
  public String getOrigin() {
    return origin;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public CartonType customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public CartonType putCustomFieldsItem(String key, Object customFieldsItem) {
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
    CartonType cartonType = (CartonType) o;
    return Objects.equals(this.id, cartonType.id) &&
        Objects.equals(this.abbreviation, cartonType.abbreviation) &&
        Objects.equals(this.name, cartonType.name) &&
        Objects.equals(this.lengthIn, cartonType.lengthIn) &&
        Objects.equals(this.widthIn, cartonType.widthIn) &&
        Objects.equals(this.heightIn, cartonType.heightIn) &&
        Objects.equals(this.innerLengthIn, cartonType.innerLengthIn) &&
        Objects.equals(this.innerWidthIn, cartonType.innerWidthIn) &&
        Objects.equals(this.innerHeightIn, cartonType.innerHeightIn) &&
        Objects.equals(this.weightLbs, cartonType.weightLbs) &&
        Objects.equals(this.lobId, cartonType.lobId) &&
        Objects.equals(this.isActive, cartonType.isActive) &&
        Objects.equals(this.predefinedPackageTypeId, cartonType.predefinedPackageTypeId) &&
        Objects.equals(this.origin, cartonType.origin) &&
        Objects.equals(this.type, cartonType.type) &&
        Objects.equals(this.customFields, cartonType.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, abbreviation, name, lengthIn, widthIn, heightIn, innerLengthIn, innerWidthIn, innerHeightIn, weightLbs, lobId, isActive, predefinedPackageTypeId, origin, type, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartonType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lengthIn: ").append(toIndentedString(lengthIn)).append("\n");
    sb.append("    widthIn: ").append(toIndentedString(widthIn)).append("\n");
    sb.append("    heightIn: ").append(toIndentedString(heightIn)).append("\n");
    sb.append("    innerLengthIn: ").append(toIndentedString(innerLengthIn)).append("\n");
    sb.append("    innerWidthIn: ").append(toIndentedString(innerWidthIn)).append("\n");
    sb.append("    innerHeightIn: ").append(toIndentedString(innerHeightIn)).append("\n");
    sb.append("    weightLbs: ").append(toIndentedString(weightLbs)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    predefinedPackageTypeId: ").append(toIndentedString(predefinedPackageTypeId)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

