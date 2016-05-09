package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class JobTime   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer secondDuration = null;
  private Date date = null;
  private Integer userId = null;
  private Integer lobId = null;
  private String jobType = null;
  private String note = null;

  
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("secondDuration")
  public Integer getSecondDuration() {
    return secondDuration;
  }
  public void setSecondDuration(Integer secondDuration) {
    this.secondDuration = secondDuration;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("jobType")
  public String getJobType() {
    return jobType;
  }
  public void setJobType(String jobType) {
    this.jobType = jobType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobTime jobTime = (JobTime) o;
    return Objects.equals(id, jobTime.id) &&
        Objects.equals(createDate, jobTime.createDate) &&
        Objects.equals(modifyDate, jobTime.modifyDate) &&
        Objects.equals(secondDuration, jobTime.secondDuration) &&
        Objects.equals(date, jobTime.date) &&
        Objects.equals(userId, jobTime.userId) &&
        Objects.equals(lobId, jobTime.lobId) &&
        Objects.equals(jobType, jobTime.jobType) &&
        Objects.equals(note, jobTime.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, secondDuration, date, userId, lobId, jobType, note);
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
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

