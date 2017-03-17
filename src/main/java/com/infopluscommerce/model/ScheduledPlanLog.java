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
public class ScheduledPlanLog   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer scheduledPlanId = null;
  private Date startTime = null;
  private Date endTime = null;
  private String status = null;
  private String message = null;
  private String linkURL = null;
  private String linkText = null;
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduledPlanId")
  public Integer getScheduledPlanId() {
    return scheduledPlanId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }

  
  /**
   **/
  public ScheduledPlanLog status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("linkURL")
  public String getLinkURL() {
    return linkURL;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("linkText")
  public String getLinkText() {
    return linkText;
  }

  
  /**
   **/
  public ScheduledPlanLog customFields(Map<String, Object> customFields) {
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
    ScheduledPlanLog scheduledPlanLog = (ScheduledPlanLog) o;
    return Objects.equals(this.id, scheduledPlanLog.id) &&
        Objects.equals(this.createDate, scheduledPlanLog.createDate) &&
        Objects.equals(this.modifyDate, scheduledPlanLog.modifyDate) &&
        Objects.equals(this.scheduledPlanId, scheduledPlanLog.scheduledPlanId) &&
        Objects.equals(this.startTime, scheduledPlanLog.startTime) &&
        Objects.equals(this.endTime, scheduledPlanLog.endTime) &&
        Objects.equals(this.status, scheduledPlanLog.status) &&
        Objects.equals(this.message, scheduledPlanLog.message) &&
        Objects.equals(this.linkURL, scheduledPlanLog.linkURL) &&
        Objects.equals(this.linkText, scheduledPlanLog.linkText) &&
        Objects.equals(this.customFields, scheduledPlanLog.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, scheduledPlanId, startTime, endTime, status, message, linkURL, linkText, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledPlanLog {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    scheduledPlanId: ").append(toIndentedString(scheduledPlanId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    linkURL: ").append(toIndentedString(linkURL)).append("\n");
    sb.append("    linkText: ").append(toIndentedString(linkText)).append("\n");
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

