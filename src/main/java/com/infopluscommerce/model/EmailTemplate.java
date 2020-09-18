/*
 * Infoplus API
 * Infoplus API.
 *
 * OpenAPI spec version: beta
 * Contact: api@infopluscommerce.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infopluscommerce.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * EmailTemplate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T13:20:03.871-05:00")
public class EmailTemplate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("fromName")
  private String fromName = null;

  @SerializedName("fromAddress")
  private String fromAddress = null;

  @SerializedName("toName")
  private String toName = null;

  @SerializedName("toAddress")
  private String toAddress = null;

  @SerializedName("ccAddress")
  private String ccAddress = null;

  @SerializedName("bccAddress")
  private String bccAddress = null;

  @SerializedName("emailTemplateType")
  private String emailTemplateType = null;

  @SerializedName("recordType")
  private String recordType = null;

  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("scriptId")
  private Integer scriptId = null;

  @SerializedName("sendToBillTo")
  private Boolean sendToBillTo = false;

  @SerializedName("sendToShipTo")
  private Boolean sendToShipTo = false;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public EmailTemplate lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLobId() {
    return lobId;
  }

  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  public EmailTemplate subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public EmailTemplate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EmailTemplate fromName(String fromName) {
    this.fromName = fromName;
    return this;
  }

   /**
   * Get fromName
   * @return fromName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFromName() {
    return fromName;
  }

  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

  public EmailTemplate fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Get fromAddress
   * @return fromAddress
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }

  public EmailTemplate toName(String toName) {
    this.toName = toName;
    return this;
  }

   /**
   * Get toName
   * @return toName
  **/
  @ApiModelProperty(value = "")
  public String getToName() {
    return toName;
  }

  public void setToName(String toName) {
    this.toName = toName;
  }

  public EmailTemplate toAddress(String toAddress) {
    this.toAddress = toAddress;
    return this;
  }

   /**
   * Get toAddress
   * @return toAddress
  **/
  @ApiModelProperty(value = "")
  public String getToAddress() {
    return toAddress;
  }

  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }

  public EmailTemplate ccAddress(String ccAddress) {
    this.ccAddress = ccAddress;
    return this;
  }

   /**
   * Get ccAddress
   * @return ccAddress
  **/
  @ApiModelProperty(value = "")
  public String getCcAddress() {
    return ccAddress;
  }

  public void setCcAddress(String ccAddress) {
    this.ccAddress = ccAddress;
  }

  public EmailTemplate bccAddress(String bccAddress) {
    this.bccAddress = bccAddress;
    return this;
  }

   /**
   * Get bccAddress
   * @return bccAddress
  **/
  @ApiModelProperty(value = "")
  public String getBccAddress() {
    return bccAddress;
  }

  public void setBccAddress(String bccAddress) {
    this.bccAddress = bccAddress;
  }

  public EmailTemplate emailTemplateType(String emailTemplateType) {
    this.emailTemplateType = emailTemplateType;
    return this;
  }

   /**
   * Get emailTemplateType
   * @return emailTemplateType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEmailTemplateType() {
    return emailTemplateType;
  }

  public void setEmailTemplateType(String emailTemplateType) {
    this.emailTemplateType = emailTemplateType;
  }

  public EmailTemplate recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @ApiModelProperty(value = "")
  public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  public EmailTemplate apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Get apiVersion
   * @return apiVersion
  **/
  @ApiModelProperty(value = "")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public EmailTemplate scriptId(Integer scriptId) {
    this.scriptId = scriptId;
    return this;
  }

   /**
   * Get scriptId
   * @return scriptId
  **/
  @ApiModelProperty(value = "")
  public Integer getScriptId() {
    return scriptId;
  }

  public void setScriptId(Integer scriptId) {
    this.scriptId = scriptId;
  }

  public EmailTemplate sendToBillTo(Boolean sendToBillTo) {
    this.sendToBillTo = sendToBillTo;
    return this;
  }

   /**
   * Get sendToBillTo
   * @return sendToBillTo
  **/
  @ApiModelProperty(value = "")
  public Boolean isSendToBillTo() {
    return sendToBillTo;
  }

  public void setSendToBillTo(Boolean sendToBillTo) {
    this.sendToBillTo = sendToBillTo;
  }

  public EmailTemplate sendToShipTo(Boolean sendToShipTo) {
    this.sendToShipTo = sendToShipTo;
    return this;
  }

   /**
   * Get sendToShipTo
   * @return sendToShipTo
  **/
  @ApiModelProperty(value = "")
  public Boolean isSendToShipTo() {
    return sendToShipTo;
  }

  public void setSendToShipTo(Boolean sendToShipTo) {
    this.sendToShipTo = sendToShipTo;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

   /**
   * Get modifyDate
   * @return modifyDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifyDate() {
    return modifyDate;
  }

  public EmailTemplate customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public EmailTemplate putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<String, Object>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
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
        Objects.equals(this.subject, emailTemplate.subject) &&
        Objects.equals(this.name, emailTemplate.name) &&
        Objects.equals(this.fromName, emailTemplate.fromName) &&
        Objects.equals(this.fromAddress, emailTemplate.fromAddress) &&
        Objects.equals(this.toName, emailTemplate.toName) &&
        Objects.equals(this.toAddress, emailTemplate.toAddress) &&
        Objects.equals(this.ccAddress, emailTemplate.ccAddress) &&
        Objects.equals(this.bccAddress, emailTemplate.bccAddress) &&
        Objects.equals(this.emailTemplateType, emailTemplate.emailTemplateType) &&
        Objects.equals(this.recordType, emailTemplate.recordType) &&
        Objects.equals(this.apiVersion, emailTemplate.apiVersion) &&
        Objects.equals(this.scriptId, emailTemplate.scriptId) &&
        Objects.equals(this.sendToBillTo, emailTemplate.sendToBillTo) &&
        Objects.equals(this.sendToShipTo, emailTemplate.sendToShipTo) &&
        Objects.equals(this.createDate, emailTemplate.createDate) &&
        Objects.equals(this.modifyDate, emailTemplate.modifyDate) &&
        Objects.equals(this.customFields, emailTemplate.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lobId, subject, name, fromName, fromAddress, toName, toAddress, ccAddress, bccAddress, emailTemplateType, recordType, apiVersion, scriptId, sendToBillTo, sendToShipTo, createDate, modifyDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailTemplate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fromName: ").append(toIndentedString(fromName)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    toName: ").append(toIndentedString(toName)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    ccAddress: ").append(toIndentedString(ccAddress)).append("\n");
    sb.append("    bccAddress: ").append(toIndentedString(bccAddress)).append("\n");
    sb.append("    emailTemplateType: ").append(toIndentedString(emailTemplateType)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    sendToBillTo: ").append(toIndentedString(sendToBillTo)).append("\n");
    sb.append("    sendToShipTo: ").append(toIndentedString(sendToShipTo)).append("\n");
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

