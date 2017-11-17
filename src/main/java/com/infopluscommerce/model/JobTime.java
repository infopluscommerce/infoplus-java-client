package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
public class JobTime   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer secondDuration = null;
  private Date date = null;
  private Integer userId = null;
  private Integer lobId = null;
  private Integer jobTypeId = null;
  private String note = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
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
  public JobTime secondDuration(Integer secondDuration) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }

  
  /**
   **/
  public JobTime userId(Integer userId) {
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
  public JobTime lobId(Integer lobId) {
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
  public JobTime jobTypeId(Integer jobTypeId) {
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
  public JobTime note(String note) {
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
  public JobTime customFields(Map<String, Object> customFields) {
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
    JobTime jobTime = (JobTime) o;
    return Objects.equals(this.id, jobTime.id) &&
        Objects.equals(this.createDate, jobTime.createDate) &&
        Objects.equals(this.modifyDate, jobTime.modifyDate) &&
        Objects.equals(this.secondDuration, jobTime.secondDuration) &&
        Objects.equals(this.date, jobTime.date) &&
        Objects.equals(this.userId, jobTime.userId) &&
        Objects.equals(this.lobId, jobTime.lobId) &&
        Objects.equals(this.jobTypeId, jobTime.jobTypeId) &&
        Objects.equals(this.note, jobTime.note) &&
        Objects.equals(this.customFields, jobTime.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, secondDuration, date, userId, lobId, jobTypeId, note, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobTime {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    secondDuration: ").append(toIndentedString(secondDuration)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    jobTypeId: ").append(toIndentedString(jobTypeId)).append("\n");
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

