package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
  @JsonProperty("clientId")
  public Integer getClientId() {
    return clientId;
  }
  public void setClientId(Integer clientId) {
    this.clientId = clientId;
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
  @JsonProperty("formatString")
  public String getFormatString() {
    return formatString;
  }
  public void setFormatString(String formatString) {
    this.formatString = formatString;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("locationNamingScheme")
  public String getLocationNamingScheme() {
    return locationNamingScheme;
  }
  public void setLocationNamingScheme(String locationNamingScheme) {
    this.locationNamingScheme = locationNamingScheme;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("locationNumberZeroPadded")
  public Boolean getLocationNumberZeroPadded() {
    return locationNumberZeroPadded;
  }
  public void setLocationNumberZeroPadded(Boolean locationNumberZeroPadded) {
    this.locationNumberZeroPadded = locationNumberZeroPadded;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationNumberMinimumNumberOfDigits")
  public Integer getLocationNumberMinimumNumberOfDigits() {
    return locationNumberMinimumNumberOfDigits;
  }
  public void setLocationNumberMinimumNumberOfDigits(Integer locationNumberMinimumNumberOfDigits) {
    this.locationNumberMinimumNumberOfDigits = locationNumberMinimumNumberOfDigits;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("levelNamingScheme")
  public String getLevelNamingScheme() {
    return levelNamingScheme;
  }
  public void setLevelNamingScheme(String levelNamingScheme) {
    this.levelNamingScheme = levelNamingScheme;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("levelNumberZeroPadded")
  public Boolean getLevelNumberZeroPadded() {
    return levelNumberZeroPadded;
  }
  public void setLevelNumberZeroPadded(Boolean levelNumberZeroPadded) {
    this.levelNumberZeroPadded = levelNumberZeroPadded;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("levelNumberMinimumNumberOfDigits")
  public Integer getLevelNumberMinimumNumberOfDigits() {
    return levelNumberMinimumNumberOfDigits;
  }
  public void setLevelNumberMinimumNumberOfDigits(Integer levelNumberMinimumNumberOfDigits) {
    this.levelNumberMinimumNumberOfDigits = levelNumberMinimumNumberOfDigits;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("aisleNamingScheme")
  public String getAisleNamingScheme() {
    return aisleNamingScheme;
  }
  public void setAisleNamingScheme(String aisleNamingScheme) {
    this.aisleNamingScheme = aisleNamingScheme;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("aisleNumberZeroPadded")
  public Boolean getAisleNumberZeroPadded() {
    return aisleNumberZeroPadded;
  }
  public void setAisleNumberZeroPadded(Boolean aisleNumberZeroPadded) {
    this.aisleNumberZeroPadded = aisleNumberZeroPadded;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("aisleNumberMinimumNumberOfDigits")
  public Integer getAisleNumberMinimumNumberOfDigits() {
    return aisleNumberMinimumNumberOfDigits;
  }
  public void setAisleNumberMinimumNumberOfDigits(Integer aisleNumberMinimumNumberOfDigits) {
    this.aisleNumberMinimumNumberOfDigits = aisleNumberMinimumNumberOfDigits;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bayNamingScheme")
  public String getBayNamingScheme() {
    return bayNamingScheme;
  }
  public void setBayNamingScheme(String bayNamingScheme) {
    this.bayNamingScheme = bayNamingScheme;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bayNumberZeroPadded")
  public Boolean getBayNumberZeroPadded() {
    return bayNumberZeroPadded;
  }
  public void setBayNumberZeroPadded(Boolean bayNumberZeroPadded) {
    this.bayNumberZeroPadded = bayNumberZeroPadded;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bayNumberMinimumNumberOfDigits")
  public Integer getBayNumberMinimumNumberOfDigits() {
    return bayNumberMinimumNumberOfDigits;
  }
  public void setBayNumberMinimumNumberOfDigits(Integer bayNumberMinimumNumberOfDigits) {
    this.bayNumberMinimumNumberOfDigits = bayNumberMinimumNumberOfDigits;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }
  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAddressScheme locationAddressScheme = (LocationAddressScheme) o;
    return Objects.equals(id, locationAddressScheme.id) &&
        Objects.equals(clientId, locationAddressScheme.clientId) &&
        Objects.equals(name, locationAddressScheme.name) &&
        Objects.equals(formatString, locationAddressScheme.formatString) &&
        Objects.equals(locationNamingScheme, locationAddressScheme.locationNamingScheme) &&
        Objects.equals(locationNumberZeroPadded, locationAddressScheme.locationNumberZeroPadded) &&
        Objects.equals(locationNumberMinimumNumberOfDigits, locationAddressScheme.locationNumberMinimumNumberOfDigits) &&
        Objects.equals(levelNamingScheme, locationAddressScheme.levelNamingScheme) &&
        Objects.equals(levelNumberZeroPadded, locationAddressScheme.levelNumberZeroPadded) &&
        Objects.equals(levelNumberMinimumNumberOfDigits, locationAddressScheme.levelNumberMinimumNumberOfDigits) &&
        Objects.equals(aisleNamingScheme, locationAddressScheme.aisleNamingScheme) &&
        Objects.equals(aisleNumberZeroPadded, locationAddressScheme.aisleNumberZeroPadded) &&
        Objects.equals(aisleNumberMinimumNumberOfDigits, locationAddressScheme.aisleNumberMinimumNumberOfDigits) &&
        Objects.equals(bayNamingScheme, locationAddressScheme.bayNamingScheme) &&
        Objects.equals(bayNumberZeroPadded, locationAddressScheme.bayNumberZeroPadded) &&
        Objects.equals(bayNumberMinimumNumberOfDigits, locationAddressScheme.bayNumberMinimumNumberOfDigits) &&
        Objects.equals(createDate, locationAddressScheme.createDate) &&
        Objects.equals(modifyDate, locationAddressScheme.modifyDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, name, formatString, locationNamingScheme, locationNumberZeroPadded, locationNumberMinimumNumberOfDigits, levelNamingScheme, levelNumberZeroPadded, levelNumberMinimumNumberOfDigits, aisleNamingScheme, aisleNumberZeroPadded, aisleNumberMinimumNumberOfDigits, bayNamingScheme, bayNumberZeroPadded, bayNumberMinimumNumberOfDigits, createDate, modifyDate);
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

