package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("level")
  public String getLevel() {
    return level;
  }
  public void setLevel(String level) {
    this.level = level;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("linkText")
  public String getLinkText() {
    return linkText;
  }
  public void setLinkText(String linkText) {
    this.linkText = linkText;
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

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("expirationDate")
  public Date getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acknowledgeDate")
  public Date getAcknowledgeDate() {
    return acknowledgeDate;
  }
  public void setAcknowledgeDate(Date acknowledgeDate) {
    this.acknowledgeDate = acknowledgeDate;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alert alert = (Alert) o;
    return Objects.equals(id, alert.id) &&
        Objects.equals(type, alert.type) &&
        Objects.equals(level, alert.level) &&
        Objects.equals(message, alert.message) &&
        Objects.equals(link, alert.link) &&
        Objects.equals(linkText, alert.linkText) &&
        Objects.equals(createDate, alert.createDate) &&
        Objects.equals(modifyDate, alert.modifyDate) &&
        Objects.equals(expirationDate, alert.expirationDate) &&
        Objects.equals(acknowledgeDate, alert.acknowledgeDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, level, message, link, linkText, createDate, modifyDate, expirationDate, acknowledgeDate);
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

