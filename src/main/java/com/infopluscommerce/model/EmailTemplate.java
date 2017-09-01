package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
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
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public EmailTemplate lobId(Integer lobId) {
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
  public EmailTemplate subjectText(String subjectText) {
    this.subjectText = subjectText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("subjectText")
  public String getSubjectText() {
    return subjectText;
  }
  public void setSubjectText(String subjectText) {
    this.subjectText = subjectText;
  }

  
  /**
   **/
  public EmailTemplate name(String name) {
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
  public EmailTemplate fromName(String fromName) {
    this.fromName = fromName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fromName")
  public String getFromName() {
    return fromName;
  }
  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

  
  /**
   **/
  public EmailTemplate fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fromAddress")
  public String getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }

  
  /**
   **/
  public EmailTemplate emailTemplateType(String emailTemplateType) {
    this.emailTemplateType = emailTemplateType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("emailTemplateType")
  public String getEmailTemplateType() {
    return emailTemplateType;
  }
  public void setEmailTemplateType(String emailTemplateType) {
    this.emailTemplateType = emailTemplateType;
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
  public EmailTemplate customFields(Map<String, Object> customFields) {
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
    EmailTemplate emailTemplate = (EmailTemplate) o;
    return Objects.equals(this.id, emailTemplate.id) &&
        Objects.equals(this.lobId, emailTemplate.lobId) &&
        Objects.equals(this.subjectText, emailTemplate.subjectText) &&
        Objects.equals(this.name, emailTemplate.name) &&
        Objects.equals(this.fromName, emailTemplate.fromName) &&
        Objects.equals(this.fromAddress, emailTemplate.fromAddress) &&
        Objects.equals(this.emailTemplateType, emailTemplate.emailTemplateType) &&
        Objects.equals(this.createDate, emailTemplate.createDate) &&
        Objects.equals(this.modifyDate, emailTemplate.modifyDate) &&
        Objects.equals(this.customFields, emailTemplate.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lobId, subjectText, name, fromName, fromAddress, emailTemplateType, createDate, modifyDate, customFields);
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

