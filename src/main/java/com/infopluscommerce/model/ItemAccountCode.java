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

/**
 * ItemAccountCode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-05T22:55:18.500-05:00")
public class ItemAccountCode {
  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("internalId")
  private Integer internalId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  public ItemAccountCode lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLobId() {
    return lobId;
  }

  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

   /**
   * Get internalId
   * @return internalId
  **/
  @ApiModelProperty(value = "")
  public Integer getInternalId() {
    return internalId;
  }

  public ItemAccountCode id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ItemAccountCode name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemAccountCode customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ItemAccountCode putCustomFieldsItem(String key, Object customFieldsItem) {
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
    ItemAccountCode itemAccountCode = (ItemAccountCode) o;
    return Objects.equals(this.lobId, itemAccountCode.lobId) &&
        Objects.equals(this.internalId, itemAccountCode.internalId) &&
        Objects.equals(this.id, itemAccountCode.id) &&
        Objects.equals(this.name, itemAccountCode.name) &&
        Objects.equals(this.customFields, itemAccountCode.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lobId, internalId, id, name, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemAccountCode {\n");
    
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

