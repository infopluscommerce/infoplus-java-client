package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-04T22:56:01.104-05:00")
public class LocationAddressScheme   {
  
  private Integer id = null;
  private Integer clientId = null;
  private String name = null;
  private String formatString = null;
  private String locationNamingScheme = null;
  private Boolean locationNumberZeroPadded = false;
  private Integer locationNumberMinimumNumberOfDigits = null;
  private String levelNamingScheme = null;
  private Boolean levelNumberZeroPadded = false;
  private Integer levelNumberMinimumNumberOfDigits = null;
  private String aisleNamingScheme = null;
  private Boolean aisleNumberZeroPadded = false;
  private Integer aisleNumberMinimumNumberOfDigits = null;
  private String bayNamingScheme = null;
  private Boolean bayNumberZeroPadded = false;
  private Integer bayNumberMinimumNumberOfDigits = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("clientId")
  public Integer getClientId() {
    return clientId;
  }

  
  /**
   **/
  public LocationAddressScheme name(String name) {
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
  public LocationAddressScheme formatString(String formatString) {
    this.formatString = formatString;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("formatString")
  public String getFormatString() {
    return formatString;
  }
  public void setFormatString(String formatString) {
    this.formatString = formatString;
  }

  
  /**
   **/
  public LocationAddressScheme locationNamingScheme(String locationNamingScheme) {
    this.locationNamingScheme = locationNamingScheme;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("locationNamingScheme")
  public String getLocationNamingScheme() {
    return locationNamingScheme;
  }
  public void setLocationNamingScheme(String locationNamingScheme) {
    this.locationNamingScheme = locationNamingScheme;
  }

  
  /**
   **/
  public LocationAddressScheme locationNumberZeroPadded(Boolean locationNumberZeroPadded) {
    this.locationNumberZeroPadded = locationNumberZeroPadded;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("locationNumberZeroPadded")
  public Boolean getLocationNumberZeroPadded() {
    return locationNumberZeroPadded;
  }
  public void setLocationNumberZeroPadded(Boolean locationNumberZeroPadded) {
    this.locationNumberZeroPadded = locationNumberZeroPadded;
  }

  
  /**
   **/
  public LocationAddressScheme locationNumberMinimumNumberOfDigits(Integer locationNumberMinimumNumberOfDigits) {
    this.locationNumberMinimumNumberOfDigits = locationNumberMinimumNumberOfDigits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("locationNumberMinimumNumberOfDigits")
  public Integer getLocationNumberMinimumNumberOfDigits() {
    return locationNumberMinimumNumberOfDigits;
  }
  public void setLocationNumberMinimumNumberOfDigits(Integer locationNumberMinimumNumberOfDigits) {
    this.locationNumberMinimumNumberOfDigits = locationNumberMinimumNumberOfDigits;
  }

  
  /**
   **/
  public LocationAddressScheme levelNamingScheme(String levelNamingScheme) {
    this.levelNamingScheme = levelNamingScheme;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("levelNamingScheme")
  public String getLevelNamingScheme() {
    return levelNamingScheme;
  }
  public void setLevelNamingScheme(String levelNamingScheme) {
    this.levelNamingScheme = levelNamingScheme;
  }

  
  /**
   **/
  public LocationAddressScheme levelNumberZeroPadded(Boolean levelNumberZeroPadded) {
    this.levelNumberZeroPadded = levelNumberZeroPadded;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("levelNumberZeroPadded")
  public Boolean getLevelNumberZeroPadded() {
    return levelNumberZeroPadded;
  }
  public void setLevelNumberZeroPadded(Boolean levelNumberZeroPadded) {
    this.levelNumberZeroPadded = levelNumberZeroPadded;
  }

  
  /**
   **/
  public LocationAddressScheme levelNumberMinimumNumberOfDigits(Integer levelNumberMinimumNumberOfDigits) {
    this.levelNumberMinimumNumberOfDigits = levelNumberMinimumNumberOfDigits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("levelNumberMinimumNumberOfDigits")
  public Integer getLevelNumberMinimumNumberOfDigits() {
    return levelNumberMinimumNumberOfDigits;
  }
  public void setLevelNumberMinimumNumberOfDigits(Integer levelNumberMinimumNumberOfDigits) {
    this.levelNumberMinimumNumberOfDigits = levelNumberMinimumNumberOfDigits;
  }

  
  /**
   **/
  public LocationAddressScheme aisleNamingScheme(String aisleNamingScheme) {
    this.aisleNamingScheme = aisleNamingScheme;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("aisleNamingScheme")
  public String getAisleNamingScheme() {
    return aisleNamingScheme;
  }
  public void setAisleNamingScheme(String aisleNamingScheme) {
    this.aisleNamingScheme = aisleNamingScheme;
  }

  
  /**
   **/
  public LocationAddressScheme aisleNumberZeroPadded(Boolean aisleNumberZeroPadded) {
    this.aisleNumberZeroPadded = aisleNumberZeroPadded;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("aisleNumberZeroPadded")
  public Boolean getAisleNumberZeroPadded() {
    return aisleNumberZeroPadded;
  }
  public void setAisleNumberZeroPadded(Boolean aisleNumberZeroPadded) {
    this.aisleNumberZeroPadded = aisleNumberZeroPadded;
  }

  
  /**
   **/
  public LocationAddressScheme aisleNumberMinimumNumberOfDigits(Integer aisleNumberMinimumNumberOfDigits) {
    this.aisleNumberMinimumNumberOfDigits = aisleNumberMinimumNumberOfDigits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("aisleNumberMinimumNumberOfDigits")
  public Integer getAisleNumberMinimumNumberOfDigits() {
    return aisleNumberMinimumNumberOfDigits;
  }
  public void setAisleNumberMinimumNumberOfDigits(Integer aisleNumberMinimumNumberOfDigits) {
    this.aisleNumberMinimumNumberOfDigits = aisleNumberMinimumNumberOfDigits;
  }

  
  /**
   **/
  public LocationAddressScheme bayNamingScheme(String bayNamingScheme) {
    this.bayNamingScheme = bayNamingScheme;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bayNamingScheme")
  public String getBayNamingScheme() {
    return bayNamingScheme;
  }
  public void setBayNamingScheme(String bayNamingScheme) {
    this.bayNamingScheme = bayNamingScheme;
  }

  
  /**
   **/
  public LocationAddressScheme bayNumberZeroPadded(Boolean bayNumberZeroPadded) {
    this.bayNumberZeroPadded = bayNumberZeroPadded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bayNumberZeroPadded")
  public Boolean getBayNumberZeroPadded() {
    return bayNumberZeroPadded;
  }
  public void setBayNumberZeroPadded(Boolean bayNumberZeroPadded) {
    this.bayNumberZeroPadded = bayNumberZeroPadded;
  }

  
  /**
   **/
  public LocationAddressScheme bayNumberMinimumNumberOfDigits(Integer bayNumberMinimumNumberOfDigits) {
    this.bayNumberMinimumNumberOfDigits = bayNumberMinimumNumberOfDigits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bayNumberMinimumNumberOfDigits")
  public Integer getBayNumberMinimumNumberOfDigits() {
    return bayNumberMinimumNumberOfDigits;
  }
  public void setBayNumberMinimumNumberOfDigits(Integer bayNumberMinimumNumberOfDigits) {
    this.bayNumberMinimumNumberOfDigits = bayNumberMinimumNumberOfDigits;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }

  
  /**
   **/
  public LocationAddressScheme customFields(Map<String, Object> customFields) {
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
    LocationAddressScheme locationAddressScheme = (LocationAddressScheme) o;
    return Objects.equals(this.id, locationAddressScheme.id) &&
        Objects.equals(this.clientId, locationAddressScheme.clientId) &&
        Objects.equals(this.name, locationAddressScheme.name) &&
        Objects.equals(this.formatString, locationAddressScheme.formatString) &&
        Objects.equals(this.locationNamingScheme, locationAddressScheme.locationNamingScheme) &&
        Objects.equals(this.locationNumberZeroPadded, locationAddressScheme.locationNumberZeroPadded) &&
        Objects.equals(this.locationNumberMinimumNumberOfDigits, locationAddressScheme.locationNumberMinimumNumberOfDigits) &&
        Objects.equals(this.levelNamingScheme, locationAddressScheme.levelNamingScheme) &&
        Objects.equals(this.levelNumberZeroPadded, locationAddressScheme.levelNumberZeroPadded) &&
        Objects.equals(this.levelNumberMinimumNumberOfDigits, locationAddressScheme.levelNumberMinimumNumberOfDigits) &&
        Objects.equals(this.aisleNamingScheme, locationAddressScheme.aisleNamingScheme) &&
        Objects.equals(this.aisleNumberZeroPadded, locationAddressScheme.aisleNumberZeroPadded) &&
        Objects.equals(this.aisleNumberMinimumNumberOfDigits, locationAddressScheme.aisleNumberMinimumNumberOfDigits) &&
        Objects.equals(this.bayNamingScheme, locationAddressScheme.bayNamingScheme) &&
        Objects.equals(this.bayNumberZeroPadded, locationAddressScheme.bayNumberZeroPadded) &&
        Objects.equals(this.bayNumberMinimumNumberOfDigits, locationAddressScheme.bayNumberMinimumNumberOfDigits) &&
        Objects.equals(this.createDate, locationAddressScheme.createDate) &&
        Objects.equals(this.modifyDate, locationAddressScheme.modifyDate) &&
        Objects.equals(this.customFields, locationAddressScheme.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, name, formatString, locationNamingScheme, locationNumberZeroPadded, locationNumberMinimumNumberOfDigits, levelNamingScheme, levelNumberZeroPadded, levelNumberMinimumNumberOfDigits, aisleNamingScheme, aisleNumberZeroPadded, aisleNumberMinimumNumberOfDigits, bayNamingScheme, bayNumberZeroPadded, bayNumberMinimumNumberOfDigits, createDate, modifyDate, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAddressScheme {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    formatString: ").append(toIndentedString(formatString)).append("\n");
    sb.append("    locationNamingScheme: ").append(toIndentedString(locationNamingScheme)).append("\n");
    sb.append("    locationNumberZeroPadded: ").append(toIndentedString(locationNumberZeroPadded)).append("\n");
    sb.append("    locationNumberMinimumNumberOfDigits: ").append(toIndentedString(locationNumberMinimumNumberOfDigits)).append("\n");
    sb.append("    levelNamingScheme: ").append(toIndentedString(levelNamingScheme)).append("\n");
    sb.append("    levelNumberZeroPadded: ").append(toIndentedString(levelNumberZeroPadded)).append("\n");
    sb.append("    levelNumberMinimumNumberOfDigits: ").append(toIndentedString(levelNumberMinimumNumberOfDigits)).append("\n");
    sb.append("    aisleNamingScheme: ").append(toIndentedString(aisleNamingScheme)).append("\n");
    sb.append("    aisleNumberZeroPadded: ").append(toIndentedString(aisleNumberZeroPadded)).append("\n");
    sb.append("    aisleNumberMinimumNumberOfDigits: ").append(toIndentedString(aisleNumberMinimumNumberOfDigits)).append("\n");
    sb.append("    bayNamingScheme: ").append(toIndentedString(bayNamingScheme)).append("\n");
    sb.append("    bayNumberZeroPadded: ").append(toIndentedString(bayNumberZeroPadded)).append("\n");
    sb.append("    bayNumberMinimumNumberOfDigits: ").append(toIndentedString(bayNumberMinimumNumberOfDigits)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
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

