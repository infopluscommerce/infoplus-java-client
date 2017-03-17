package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class LocationFootprint   {
  
  private Integer id = null;
  private Integer clientId = null;
  private String name = null;
  private Integer width = null;
  private Integer depth = null;
  private Integer height = null;
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
  public LocationFootprint name(String name) {
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
  public LocationFootprint width(Integer width) {
    this.width = width;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  
  /**
   **/
  public LocationFootprint depth(Integer depth) {
    this.depth = depth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("depth")
  public Integer getDepth() {
    return depth;
  }
  public void setDepth(Integer depth) {
    this.depth = depth;
  }

  
  /**
   **/
  public LocationFootprint height(Integer height) {
    this.height = height;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
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
  public LocationFootprint customFields(Map<String, Object> customFields) {
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
    LocationFootprint locationFootprint = (LocationFootprint) o;
    return Objects.equals(this.id, locationFootprint.id) &&
        Objects.equals(this.clientId, locationFootprint.clientId) &&
        Objects.equals(this.name, locationFootprint.name) &&
        Objects.equals(this.width, locationFootprint.width) &&
        Objects.equals(this.depth, locationFootprint.depth) &&
        Objects.equals(this.height, locationFootprint.height) &&
        Objects.equals(this.createDate, locationFootprint.createDate) &&
        Objects.equals(this.modifyDate, locationFootprint.modifyDate) &&
        Objects.equals(this.customFields, locationFootprint.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, name, width, depth, height, createDate, modifyDate, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationFootprint {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

