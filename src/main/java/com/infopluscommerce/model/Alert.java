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
 * Alert
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T22:42:25.751-05:00")
public class Alert {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("level")
  private String level = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("linkText")
  private String linkText = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("expirationDate")
  private OffsetDateTime expirationDate = null;

  @SerializedName("acknowledgeDate")
  private OffsetDateTime acknowledgeDate = null;

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
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public String getLevel() {
    return level;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public String getLink() {
    return link;
  }

   /**
   * Get linkText
   * @return linkText
  **/
  @ApiModelProperty(value = "")
  public String getLinkText() {
    return linkText;
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

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

   /**
   * Get acknowledgeDate
   * @return acknowledgeDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAcknowledgeDate() {
    return acknowledgeDate;
  }

  public Alert customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Alert putCustomFieldsItem(String key, Object customFieldsItem) {
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
    Alert alert = (Alert) o;
    return Objects.equals(this.id, alert.id) &&
        Objects.equals(this.type, alert.type) &&
        Objects.equals(this.level, alert.level) &&
        Objects.equals(this.message, alert.message) &&
        Objects.equals(this.link, alert.link) &&
        Objects.equals(this.linkText, alert.linkText) &&
        Objects.equals(this.createDate, alert.createDate) &&
        Objects.equals(this.modifyDate, alert.modifyDate) &&
        Objects.equals(this.expirationDate, alert.expirationDate) &&
        Objects.equals(this.acknowledgeDate, alert.acknowledgeDate) &&
        Objects.equals(this.customFields, alert.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, level, message, link, linkText, createDate, modifyDate, expirationDate, acknowledgeDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alert {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    linkText: ").append(toIndentedString(linkText)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    acknowledgeDate: ").append(toIndentedString(acknowledgeDate)).append("\n");
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

