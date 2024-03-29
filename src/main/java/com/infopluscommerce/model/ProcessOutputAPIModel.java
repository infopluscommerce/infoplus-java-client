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
import java.util.ArrayList;
import java.util.List;

/**
 * ProcessOutputAPIModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-16T13:04:33.234-06:00")
public class ProcessOutputAPIModel {
  @SerializedName("id")
  private Object id = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("entity")
  private Object entity = null;

  @SerializedName("messageList")
  private List<String> messageList = null;

  public ProcessOutputAPIModel id(Object id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }

  public ProcessOutputAPIModel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ProcessOutputAPIModel entity(Object entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @ApiModelProperty(value = "")
  public Object getEntity() {
    return entity;
  }

  public void setEntity(Object entity) {
    this.entity = entity;
  }

  public ProcessOutputAPIModel messageList(List<String> messageList) {
    this.messageList = messageList;
    return this;
  }

  public ProcessOutputAPIModel addMessageListItem(String messageListItem) {
    if (this.messageList == null) {
      this.messageList = new ArrayList<String>();
    }
    this.messageList.add(messageListItem);
    return this;
  }

   /**
   * Get messageList
   * @return messageList
  **/
  @ApiModelProperty(value = "")
  public List<String> getMessageList() {
    return messageList;
  }

  public void setMessageList(List<String> messageList) {
    this.messageList = messageList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessOutputAPIModel processOutputAPIModel = (ProcessOutputAPIModel) o;
    return Objects.equals(this.id, processOutputAPIModel.id) &&
        Objects.equals(this.status, processOutputAPIModel.status) &&
        Objects.equals(this.entity, processOutputAPIModel.entity) &&
        Objects.equals(this.messageList, processOutputAPIModel.messageList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, entity, messageList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessOutputAPIModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    messageList: ").append(toIndentedString(messageList)).append("\n");
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

