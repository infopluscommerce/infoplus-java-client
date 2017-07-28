package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class CartonType   {
  
  private Integer id = null;
  private String abbreviation = null;
  private String name = null;
  private BigDecimal lengthIn = null;
  private BigDecimal widthIn = null;
  private BigDecimal heightIn = null;
  private BigDecimal innerLengthIn = null;
  private BigDecimal innerWidthIn = null;
  private BigDecimal innerHeightIn = null;
  private BigDecimal weightLbs = null;
  private Integer lobId = null;
  private Boolean isActive = false;
  private Integer predefinedPackageTypeId = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public CartonType abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("abbreviation")
  public String getAbbreviation() {
    return abbreviation;
  }
  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  
  /**
   **/
  public CartonType name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public CartonType lengthIn(BigDecimal lengthIn) {
    this.lengthIn = lengthIn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("lengthIn")
  public BigDecimal getLengthIn() {
    return lengthIn;
  }
  public void setLengthIn(BigDecimal lengthIn) {
    this.lengthIn = lengthIn;
  }

  
  /**
   **/
  public CartonType widthIn(BigDecimal widthIn) {
    this.widthIn = widthIn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("widthIn")
  public BigDecimal getWidthIn() {
    return widthIn;
  }
  public void setWidthIn(BigDecimal widthIn) {
    this.widthIn = widthIn;
  }

  
  /**
   **/
  public CartonType heightIn(BigDecimal heightIn) {
    this.heightIn = heightIn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("heightIn")
  public BigDecimal getHeightIn() {
    return heightIn;
  }
  public void setHeightIn(BigDecimal heightIn) {
    this.heightIn = heightIn;
  }

  
  /**
   **/
  public CartonType innerLengthIn(BigDecimal innerLengthIn) {
    this.innerLengthIn = innerLengthIn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("innerLengthIn")
  public BigDecimal getInnerLengthIn() {
    return innerLengthIn;
  }
  public void setInnerLengthIn(BigDecimal innerLengthIn) {
    this.innerLengthIn = innerLengthIn;
  }

  
  /**
   **/
  public CartonType innerWidthIn(BigDecimal innerWidthIn) {
    this.innerWidthIn = innerWidthIn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("innerWidthIn")
  public BigDecimal getInnerWidthIn() {
    return innerWidthIn;
  }
  public void setInnerWidthIn(BigDecimal innerWidthIn) {
    this.innerWidthIn = innerWidthIn;
  }

  
  /**
   **/
  public CartonType innerHeightIn(BigDecimal innerHeightIn) {
    this.innerHeightIn = innerHeightIn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("innerHeightIn")
  public BigDecimal getInnerHeightIn() {
    return innerHeightIn;
  }
  public void setInnerHeightIn(BigDecimal innerHeightIn) {
    this.innerHeightIn = innerHeightIn;
  }

  
  /**
   **/
  public CartonType weightLbs(BigDecimal weightLbs) {
    this.weightLbs = weightLbs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weightLbs")
  public BigDecimal getWeightLbs() {
    return weightLbs;
  }
  public void setWeightLbs(BigDecimal weightLbs) {
    this.weightLbs = weightLbs;
  }

  
  /**
   **/
  public CartonType lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }
  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  
  /**
   **/
  public CartonType isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  
  /**
   **/
  public CartonType predefinedPackageTypeId(Integer predefinedPackageTypeId) {
    this.predefinedPackageTypeId = predefinedPackageTypeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("predefinedPackageTypeId")
  public Integer getPredefinedPackageTypeId() {
    return predefinedPackageTypeId;
  }
  public void setPredefinedPackageTypeId(Integer predefinedPackageTypeId) {
    this.predefinedPackageTypeId = predefinedPackageTypeId;
  }

  
  /**
   **/
  public CartonType customFields(Map<String, Object> customFields) {
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
        Objects.equals(this.customFields, cartonType.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, abbreviation, name, lengthIn, widthIn, heightIn, innerLengthIn, innerWidthIn, innerHeightIn, weightLbs, lobId, isActive, predefinedPackageTypeId, customFields);
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

