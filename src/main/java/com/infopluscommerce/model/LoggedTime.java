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
public class LoggedTime   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Date start = null;
  private Date end = null;
  private Integer duration = null;
  private String description = null;
  private Integer client = null;
  private Integer userId = null;
  private Integer lobId = null;
  private Integer warehouseId = null;
  private Integer loggedTimeTypeId = null;
  private Integer appId = null;
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
  public LoggedTime start(Date start) {
    this.start = start;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("start")
  public Date getStart() {
    return start;
  }
  public void setStart(Date start) {
    this.start = start;
  }

  
  /**
   **/
  public LoggedTime end(Date end) {
    this.end = end;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("end")
  public Date getEnd() {
    return end;
  }
  public void setEnd(Date end) {
    this.end = end;
  }

  
  /**
   **/
  public LoggedTime duration(Integer duration) {
    this.duration = duration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   **/
  public LoggedTime description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public LoggedTime client(Integer client) {
    this.client = client;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("client")
  public Integer getClient() {
    return client;
  }
  public void setClient(Integer client) {
    this.client = client;
  }

  
  /**
   **/
  public LoggedTime userId(Integer userId) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }

  
  /**
   **/
  public LoggedTime warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  
  /**
   **/
  public LoggedTime loggedTimeTypeId(Integer loggedTimeTypeId) {
    this.loggedTimeTypeId = loggedTimeTypeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("loggedTimeTypeId")
  public Integer getLoggedTimeTypeId() {
    return loggedTimeTypeId;
  }
  public void setLoggedTimeTypeId(Integer loggedTimeTypeId) {
    this.loggedTimeTypeId = loggedTimeTypeId;
  }

  
  /**
   **/
  public LoggedTime appId(Integer appId) {
    this.appId = appId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("appId")
  public Integer getAppId() {
    return appId;
  }
  public void setAppId(Integer appId) {
    this.appId = appId;
  }

  
  /**
   **/
  public LoggedTime customFields(Map<String, Object> customFields) {
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
    LoggedTime loggedTime = (LoggedTime) o;
    return Objects.equals(this.id, loggedTime.id) &&
        Objects.equals(this.createDate, loggedTime.createDate) &&
        Objects.equals(this.modifyDate, loggedTime.modifyDate) &&
        Objects.equals(this.start, loggedTime.start) &&
        Objects.equals(this.end, loggedTime.end) &&
        Objects.equals(this.duration, loggedTime.duration) &&
        Objects.equals(this.description, loggedTime.description) &&
        Objects.equals(this.client, loggedTime.client) &&
        Objects.equals(this.userId, loggedTime.userId) &&
        Objects.equals(this.lobId, loggedTime.lobId) &&
        Objects.equals(this.warehouseId, loggedTime.warehouseId) &&
        Objects.equals(this.loggedTimeTypeId, loggedTime.loggedTimeTypeId) &&
        Objects.equals(this.appId, loggedTime.appId) &&
        Objects.equals(this.customFields, loggedTime.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, start, end, duration, description, client, userId, lobId, warehouseId, loggedTimeTypeId, appId, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoggedTime {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    loggedTimeTypeId: ").append(toIndentedString(loggedTimeTypeId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

