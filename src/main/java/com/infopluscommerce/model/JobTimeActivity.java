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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * JobTimeActivity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T22:44:50.237-05:00")
public class JobTimeActivity {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("importedId")
  private Integer importedId = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("secondDuration")
  private Integer secondDuration = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("jobTypeId")
  private Integer jobTypeId = null;

  @SerializedName("jobTypeName")
  private String jobTypeName = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("billingQuantity")
  private BigDecimal billingQuantity = null;

  @SerializedName("chargeRate")
  private BigDecimal chargeRate = null;

  @SerializedName("extendedCharge")
  private BigDecimal extendedCharge = null;

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

   /**
   * Get importedId
   * @return importedId
  **/
  @ApiModelProperty(value = "")
  public Integer getImportedId() {
    return importedId;
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

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public JobTimeActivity secondDuration(Integer secondDuration) {
    this.secondDuration = secondDuration;
    return this;
  }

   /**
   * Get secondDuration
   * @return secondDuration
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getSecondDuration() {
    return secondDuration;
  }

  public void setSecondDuration(Integer secondDuration) {
    this.secondDuration = secondDuration;
  }

  public JobTimeActivity userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public JobTimeActivity email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public JobTimeActivity lobId(Integer lobId) {
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

  public JobTimeActivity jobTypeId(Integer jobTypeId) {
    this.jobTypeId = jobTypeId;
    return this;
  }

   /**
   * Get jobTypeId
   * @return jobTypeId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getJobTypeId() {
    return jobTypeId;
  }

  public void setJobTypeId(Integer jobTypeId) {
    this.jobTypeId = jobTypeId;
  }

  public JobTimeActivity jobTypeName(String jobTypeName) {
    this.jobTypeName = jobTypeName;
    return this;
  }

   /**
   * Get jobTypeName
   * @return jobTypeName
  **/
  @ApiModelProperty(value = "")
  public String getJobTypeName() {
    return jobTypeName;
  }

  public void setJobTypeName(String jobTypeName) {
    this.jobTypeName = jobTypeName;
  }

  public JobTimeActivity note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

   /**
   * Get billingQuantity
   * @return billingQuantity
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getBillingQuantity() {
    return billingQuantity;
  }

   /**
   * Get chargeRate
   * @return chargeRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getChargeRate() {
    return chargeRate;
  }

   /**
   * Get extendedCharge
   * @return extendedCharge
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getExtendedCharge() {
    return extendedCharge;
  }

  public JobTimeActivity customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public JobTimeActivity putCustomFieldsItem(String key, Object customFieldsItem) {
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
    JobTimeActivity jobTimeActivity = (JobTimeActivity) o;
    return Objects.equals(this.id, jobTimeActivity.id) &&
        Objects.equals(this.importedId, jobTimeActivity.importedId) &&
        Objects.equals(this.createDate, jobTimeActivity.createDate) &&
        Objects.equals(this.modifyDate, jobTimeActivity.modifyDate) &&
        Objects.equals(this.date, jobTimeActivity.date) &&
        Objects.equals(this.secondDuration, jobTimeActivity.secondDuration) &&
        Objects.equals(this.userId, jobTimeActivity.userId) &&
        Objects.equals(this.email, jobTimeActivity.email) &&
        Objects.equals(this.lobId, jobTimeActivity.lobId) &&
        Objects.equals(this.jobTypeId, jobTimeActivity.jobTypeId) &&
        Objects.equals(this.jobTypeName, jobTimeActivity.jobTypeName) &&
        Objects.equals(this.note, jobTimeActivity.note) &&
        Objects.equals(this.billingQuantity, jobTimeActivity.billingQuantity) &&
        Objects.equals(this.chargeRate, jobTimeActivity.chargeRate) &&
        Objects.equals(this.extendedCharge, jobTimeActivity.extendedCharge) &&
        Objects.equals(this.customFields, jobTimeActivity.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, importedId, createDate, modifyDate, date, secondDuration, userId, email, lobId, jobTypeId, jobTypeName, note, billingQuantity, chargeRate, extendedCharge, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobTimeActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    importedId: ").append(toIndentedString(importedId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    secondDuration: ").append(toIndentedString(secondDuration)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    jobTypeId: ").append(toIndentedString(jobTypeId)).append("\n");
    sb.append("    jobTypeName: ").append(toIndentedString(jobTypeName)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    billingQuantity: ").append(toIndentedString(billingQuantity)).append("\n");
    sb.append("    chargeRate: ").append(toIndentedString(chargeRate)).append("\n");
    sb.append("    extendedCharge: ").append(toIndentedString(extendedCharge)).append("\n");
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

