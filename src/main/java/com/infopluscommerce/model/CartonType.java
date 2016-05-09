package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("abbreviation")
  public String getAbbreviation() {
    return abbreviation;
  }
  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("lengthIn")
  public Double getLengthIn() {
    return lengthIn;
  }
  public void setLengthIn(Double lengthIn) {
    this.lengthIn = lengthIn;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("widthIn")
  public Double getWidthIn() {
    return widthIn;
  }
  public void setWidthIn(Double widthIn) {
    this.widthIn = widthIn;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("heightIn")
  public Double getHeightIn() {
    return heightIn;
  }
  public void setHeightIn(Double heightIn) {
    this.heightIn = heightIn;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("innerLengthIn")
  public Double getInnerLengthIn() {
    return innerLengthIn;
  }
  public void setInnerLengthIn(Double innerLengthIn) {
    this.innerLengthIn = innerLengthIn;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("innerWidthIn")
  public Double getInnerWidthIn() {
    return innerWidthIn;
  }
  public void setInnerWidthIn(Double innerWidthIn) {
    this.innerWidthIn = innerWidthIn;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("innerHeightIn")
  public Double getInnerHeightIn() {
    return innerHeightIn;
  }
  public void setInnerHeightIn(Double innerHeightIn) {
    this.innerHeightIn = innerHeightIn;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("weightLbs")
  public Double getWeightLbs() {
    return weightLbs;
  }
  public void setWeightLbs(Double weightLbs) {
    this.weightLbs = weightLbs;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }
  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartonType cartonType = (CartonType) o;
    return Objects.equals(id, cartonType.id) &&
        Objects.equals(abbreviation, cartonType.abbreviation) &&
        Objects.equals(name, cartonType.name) &&
        Objects.equals(lengthIn, cartonType.lengthIn) &&
        Objects.equals(widthIn, cartonType.widthIn) &&
        Objects.equals(heightIn, cartonType.heightIn) &&
        Objects.equals(innerLengthIn, cartonType.innerLengthIn) &&
        Objects.equals(innerWidthIn, cartonType.innerWidthIn) &&
        Objects.equals(innerHeightIn, cartonType.innerHeightIn) &&
        Objects.equals(weightLbs, cartonType.weightLbs) &&
        Objects.equals(lobId, cartonType.lobId) &&
        Objects.equals(isActive, cartonType.isActive);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

