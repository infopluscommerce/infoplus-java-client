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
public class Alert   {
  
  private Integer id = null;
  private String type = null;
  private String level = null;
  private String message = null;
  private String link = null;
  private String linkText = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Date expirationDate = null;
  private Date acknowledgeDate = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("level")
  public String getLevel() {
    return level;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("linkText")
  public String getLinkText() {
    return linkText;
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("expirationDate")
  public Date getExpirationDate() {
    return expirationDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("acknowledgeDate")
  public Date getAcknowledgeDate() {
    return acknowledgeDate;
  }

  
  /**
   **/
  public Alert customFields(Map<String, Object> customFields) {
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
    Alert alert = (Alert) o;
    return Objects.equals(this.id, alert.id) &&
        Objects.equals(this.type, alert.type) &&
        Objects.equals(this.level, alert.level) &&
        Objects.equals(this.message, alert.message) &&
        Objects.equals(this.link, alert.link) &&
        Objects.equals(this.linkText, alert.linkText) &&
        Objects.equals(this.createDate, alert.createDate) &&
        Objects.equals(this.modifyDate, alert.modifyDate) &&
        Objects.equals(this.expirationDate, alert.expirationDate) &&
        Objects.equals(this.acknowledgeDate, alert.acknowledgeDate) &&
        Objects.equals(this.customFields, alert.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, level, message, link, linkText, createDate, modifyDate, expirationDate, acknowledgeDate, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alert {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    linkText: ").append(toIndentedString(linkText)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    acknowledgeDate: ").append(toIndentedString(acknowledgeDate)).append("\n");
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

