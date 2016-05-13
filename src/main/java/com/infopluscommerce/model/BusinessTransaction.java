package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T15:40:30.367-05:00")
public class BusinessTransaction   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String serverName = null;
  private String queueName = null;
  private Integer lobId = null;
  private String messageBody = null;
  private String status = null;

  
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
  @JsonProperty("serverName")
  public String getServerName() {
    return serverName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queueName")
  public String getQueueName() {
    return queueName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageBody")
  public String getMessageBody() {
    return messageBody;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessTransaction businessTransaction = (BusinessTransaction) o;
    return Objects.equals(this.id, businessTransaction.id) &&
        Objects.equals(this.createDate, businessTransaction.createDate) &&
        Objects.equals(this.modifyDate, businessTransaction.modifyDate) &&
        Objects.equals(this.serverName, businessTransaction.serverName) &&
        Objects.equals(this.queueName, businessTransaction.queueName) &&
        Objects.equals(this.lobId, businessTransaction.lobId) &&
        Objects.equals(this.messageBody, businessTransaction.messageBody) &&
        Objects.equals(this.status, businessTransaction.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, serverName, queueName, lobId, messageBody, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessTransaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    messageBody: ").append(toIndentedString(messageBody)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

