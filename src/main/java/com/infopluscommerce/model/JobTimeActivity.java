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
public class JobTimeActivity   {
  
  private Integer id = null;
  private Integer importedId = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Date date = null;
  private Integer secondDuration = null;
  private Integer userId = null;
  private String email = null;
  private Integer lobId = null;
  private Integer jobTypeId = null;
  private String jobTypeName = null;
  private String note = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("importedId")
  public Integer getImportedId() {
    return importedId;
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
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }

  
  /**
   **/
  public JobTimeActivity secondDuration(Integer secondDuration) {
    this.secondDuration = secondDuration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("secondDuration")
  public Integer getSecondDuration() {
    return secondDuration;
  }
  public void setSecondDuration(Integer secondDuration) {
    this.secondDuration = secondDuration;
  }

  
  /**
   **/
  public JobTimeActivity userId(Integer userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  
  /**
   **/
  public JobTimeActivity email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  public JobTimeActivity lobId(Integer lobId) {
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
  public JobTimeActivity jobTypeId(Integer jobTypeId) {
    this.jobTypeId = jobTypeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("jobTypeId")
  public Integer getJobTypeId() {
    return jobTypeId;
  }
  public void setJobTypeId(Integer jobTypeId) {
    this.jobTypeId = jobTypeId;
  }

  
  /**
   **/
  public JobTimeActivity jobTypeName(String jobTypeName) {
    this.jobTypeName = jobTypeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("jobTypeName")
  public String getJobTypeName() {
    return jobTypeName;
  }
  public void setJobTypeName(String jobTypeName) {
    this.jobTypeName = jobTypeName;
  }

  
  /**
   **/
  public JobTimeActivity note(String note) {
    this.note = note;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  
  /**
   **/
  public JobTimeActivity customFields(Map<String, Object> customFields) {
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
        Objects.equals(this.customFields, jobTimeActivity.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, importedId, createDate, modifyDate, date, secondDuration, userId, email, lobId, jobTypeId, jobTypeName, note, customFields);
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

