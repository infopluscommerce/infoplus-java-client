package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class ProcessOutputAPIModel   {
  
  private Object id = null;
  private String status = null;
  private List<String> messageList = new ArrayList<String>();

  
  /**
   **/
  public ProcessOutputAPIModel id(Object id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Object getId() {
    return id;
  }
  public void setId(Object id) {
    this.id = id;
  }

  
  /**
   **/
  public ProcessOutputAPIModel status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  public ProcessOutputAPIModel messageList(List<String> messageList) {
    this.messageList = messageList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageList")
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
        Objects.equals(this.messageList, processOutputAPIModel.messageList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, messageList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessOutputAPIModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

