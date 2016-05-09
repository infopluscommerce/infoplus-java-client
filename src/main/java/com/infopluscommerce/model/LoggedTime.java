package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
  private String loggedTimeType = null;
  private Integer appId = null;

  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("start")
  public Date getStart() {
    return start;
  }
  public void setStart(Date start) {
    this.start = start;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("end")
  public Date getEnd() {
    return end;
  }
  public void setEnd(Date end) {
    this.end = end;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("client")
  public Integer getClient() {
    return client;
  }
  public void setClient(Integer client) {
    this.client = client;
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
  
  @ApiModelProperty(value = "")
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
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("loggedTimeType")
  public String getLoggedTimeType() {
    return loggedTimeType;
  }
  public void setLoggedTimeType(String loggedTimeType) {
    this.loggedTimeType = loggedTimeType;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("appId")
  public Integer getAppId() {
    return appId;
  }
  public void setAppId(Integer appId) {
    this.appId = appId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoggedTime loggedTime = (LoggedTime) o;
    return Objects.equals(id, loggedTime.id) &&
        Objects.equals(createDate, loggedTime.createDate) &&
        Objects.equals(modifyDate, loggedTime.modifyDate) &&
        Objects.equals(start, loggedTime.start) &&
        Objects.equals(end, loggedTime.end) &&
        Objects.equals(duration, loggedTime.duration) &&
        Objects.equals(description, loggedTime.description) &&
        Objects.equals(client, loggedTime.client) &&
        Objects.equals(userId, loggedTime.userId) &&
        Objects.equals(lobId, loggedTime.lobId) &&
        Objects.equals(warehouseId, loggedTime.warehouseId) &&
        Objects.equals(loggedTimeType, loggedTime.loggedTimeType) &&
        Objects.equals(appId, loggedTime.appId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, start, end, duration, description, client, userId, lobId, warehouseId, loggedTimeType, appId);
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
    sb.append("    loggedTimeType: ").append(toIndentedString(loggedTimeType)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

