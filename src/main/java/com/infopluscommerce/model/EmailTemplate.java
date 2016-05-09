package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class EmailTemplate   {
  
  private Integer id = null;
  private Integer lobId = null;
  private String subjectText = null;
  private String name = null;
  private String fromName = null;
  private String fromAddress = null;
  private String emailTemplateType = null;
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
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }
  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subjectText")
  public String getSubjectText() {
    return subjectText;
  }
  public void setSubjectText(String subjectText) {
    this.subjectText = subjectText;
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
  @JsonProperty("fromName")
  public String getFromName() {
    return fromName;
  }
  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("fromAddress")
  public String getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("emailTemplateType")
  public String getEmailTemplateType() {
    return emailTemplateType;
  }
  public void setEmailTemplateType(String emailTemplateType) {
    this.emailTemplateType = emailTemplateType;
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
    EmailTemplate emailTemplate = (EmailTemplate) o;
    return Objects.equals(id, emailTemplate.id) &&
        Objects.equals(lobId, emailTemplate.lobId) &&
        Objects.equals(subjectText, emailTemplate.subjectText) &&
        Objects.equals(name, emailTemplate.name) &&
        Objects.equals(fromName, emailTemplate.fromName) &&
        Objects.equals(fromAddress, emailTemplate.fromAddress) &&
        Objects.equals(emailTemplateType, emailTemplate.emailTemplateType) &&
        Objects.equals(createDate, emailTemplate.createDate) &&
        Objects.equals(modifyDate, emailTemplate.modifyDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lobId, subjectText, name, fromName, fromAddress, emailTemplateType, createDate, modifyDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailTemplate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    subjectText: ").append(toIndentedString(subjectText)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fromName: ").append(toIndentedString(fromName)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    emailTemplateType: ").append(toIndentedString(emailTemplateType)).append("\n");
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

