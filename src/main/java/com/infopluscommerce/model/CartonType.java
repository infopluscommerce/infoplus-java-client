package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T15:40:30.367-05:00")
public class CartonType   {
  
  private Integer id = null;
  private String abbreviation = null;
  private String name = null;
  private Double lengthIn = null;
  private Double widthIn = null;
  private Double heightIn = null;
  private Double innerLengthIn = null;
  private Double innerWidthIn = null;
  private Double innerHeightIn = null;
  private Double weightLbs = null;
  private Integer lobId = null;
  private Boolean isActive = false;

  
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
  public CartonType lengthIn(Double lengthIn) {
    this.lengthIn = lengthIn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("lengthIn")
  public Double getLengthIn() {
    return lengthIn;
  }
  public void setLengthIn(Double lengthIn) {
    this.lengthIn = lengthIn;
  }

  
  /**
   **/
  public CartonType widthIn(Double widthIn) {
    this.widthIn = widthIn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("widthIn")
  public Double getWidthIn() {
    return widthIn;
  }
  public void setWidthIn(Double widthIn) {
    this.widthIn = widthIn;
  }

  
  /**
   **/
  public CartonType heightIn(Double heightIn) {
    this.heightIn = heightIn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("heightIn")
  public Double getHeightIn() {
    return heightIn;
  }
  public void setHeightIn(Double heightIn) {
    this.heightIn = heightIn;
  }

  
  /**
   **/
  public CartonType innerLengthIn(Double innerLengthIn) {
    this.innerLengthIn = innerLengthIn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("innerLengthIn")
  public Double getInnerLengthIn() {
    return innerLengthIn;
  }
  public void setInnerLengthIn(Double innerLengthIn) {
    this.innerLengthIn = innerLengthIn;
  }

  
  /**
   **/
  public CartonType innerWidthIn(Double innerWidthIn) {
    this.innerWidthIn = innerWidthIn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("innerWidthIn")
  public Double getInnerWidthIn() {
    return innerWidthIn;
  }
  public void setInnerWidthIn(Double innerWidthIn) {
    this.innerWidthIn = innerWidthIn;
  }

  
  /**
   **/
  public CartonType innerHeightIn(Double innerHeightIn) {
    this.innerHeightIn = innerHeightIn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("innerHeightIn")
  public Double getInnerHeightIn() {
    return innerHeightIn;
  }
  public void setInnerHeightIn(Double innerHeightIn) {
    this.innerHeightIn = innerHeightIn;
  }

  
  /**
   **/
  public CartonType weightLbs(Double weightLbs) {
    this.weightLbs = weightLbs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weightLbs")
  public Double getWeightLbs() {
    return weightLbs;
  }
  public void setWeightLbs(Double weightLbs) {
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
        Objects.equals(this.isActive, cartonType.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, abbreviation, name, lengthIn, widthIn, heightIn, innerLengthIn, innerWidthIn, innerHeightIn, weightLbs, lobId, isActive);
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

