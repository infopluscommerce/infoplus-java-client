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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * FinanceSystemConnection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T00:04:31.249-05:00")
public class FinanceSystemConnection {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("financeSystemConnectionType")
  private String financeSystemConnectionType = null;

  @SerializedName("environment")
  private String environment = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("clientId")
  private Integer clientId = null;

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

  public FinanceSystemConnection name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FinanceSystemConnection financeSystemConnectionType(String financeSystemConnectionType) {
    this.financeSystemConnectionType = financeSystemConnectionType;
    return this;
  }

   /**
   * Get financeSystemConnectionType
   * @return financeSystemConnectionType
  **/
  @ApiModelProperty(value = "")
  public String getFinanceSystemConnectionType() {
    return financeSystemConnectionType;
  }

  public void setFinanceSystemConnectionType(String financeSystemConnectionType) {
    this.financeSystemConnectionType = financeSystemConnectionType;
  }

  public FinanceSystemConnection environment(String environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  public FinanceSystemConnection lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(value = "")
  public Integer getLobId() {
    return lobId;
  }

  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
  public Integer getClientId() {
    return clientId;
  }

  public FinanceSystemConnection customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public FinanceSystemConnection putCustomFieldsItem(String key, Object customFieldsItem) {
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
    FinanceSystemConnection financeSystemConnection = (FinanceSystemConnection) o;
    return Objects.equals(this.id, financeSystemConnection.id) &&
        Objects.equals(this.createDate, financeSystemConnection.createDate) &&
        Objects.equals(this.modifyDate, financeSystemConnection.modifyDate) &&
        Objects.equals(this.name, financeSystemConnection.name) &&
        Objects.equals(this.financeSystemConnectionType, financeSystemConnection.financeSystemConnectionType) &&
        Objects.equals(this.environment, financeSystemConnection.environment) &&
        Objects.equals(this.lobId, financeSystemConnection.lobId) &&
        Objects.equals(this.clientId, financeSystemConnection.clientId) &&
        Objects.equals(this.customFields, financeSystemConnection.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, name, financeSystemConnectionType, environment, lobId, clientId, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinanceSystemConnection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    financeSystemConnectionType: ").append(toIndentedString(financeSystemConnectionType)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

