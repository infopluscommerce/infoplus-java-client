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
 * StandardBusinessDays
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-02T22:06:08.200-06:00")
public class StandardBusinessDays {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("sunday")
  private Boolean sunday = false;

  @SerializedName("monday")
  private Boolean monday = false;

  @SerializedName("tuesday")
  private Boolean tuesday = false;

  @SerializedName("wednesday")
  private Boolean wednesday = false;

  @SerializedName("thursday")
  private Boolean thursday = false;

  @SerializedName("friday")
  private Boolean friday = false;

  @SerializedName("saturday")
  private Boolean saturday = false;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

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

  public StandardBusinessDays sunday(Boolean sunday) {
    this.sunday = sunday;
    return this;
  }

   /**
   * Get sunday
   * @return sunday
  **/
  @ApiModelProperty(value = "")
  public Boolean isSunday() {
    return sunday;
  }

  public void setSunday(Boolean sunday) {
    this.sunday = sunday;
  }

  public StandardBusinessDays monday(Boolean monday) {
    this.monday = monday;
    return this;
  }

   /**
   * Get monday
   * @return monday
  **/
  @ApiModelProperty(value = "")
  public Boolean isMonday() {
    return monday;
  }

  public void setMonday(Boolean monday) {
    this.monday = monday;
  }

  public StandardBusinessDays tuesday(Boolean tuesday) {
    this.tuesday = tuesday;
    return this;
  }

   /**
   * Get tuesday
   * @return tuesday
  **/
  @ApiModelProperty(value = "")
  public Boolean isTuesday() {
    return tuesday;
  }

  public void setTuesday(Boolean tuesday) {
    this.tuesday = tuesday;
  }

  public StandardBusinessDays wednesday(Boolean wednesday) {
    this.wednesday = wednesday;
    return this;
  }

   /**
   * Get wednesday
   * @return wednesday
  **/
  @ApiModelProperty(value = "")
  public Boolean isWednesday() {
    return wednesday;
  }

  public void setWednesday(Boolean wednesday) {
    this.wednesday = wednesday;
  }

  public StandardBusinessDays thursday(Boolean thursday) {
    this.thursday = thursday;
    return this;
  }

   /**
   * Get thursday
   * @return thursday
  **/
  @ApiModelProperty(value = "")
  public Boolean isThursday() {
    return thursday;
  }

  public void setThursday(Boolean thursday) {
    this.thursday = thursday;
  }

  public StandardBusinessDays friday(Boolean friday) {
    this.friday = friday;
    return this;
  }

   /**
   * Get friday
   * @return friday
  **/
  @ApiModelProperty(value = "")
  public Boolean isFriday() {
    return friday;
  }

  public void setFriday(Boolean friday) {
    this.friday = friday;
  }

  public StandardBusinessDays saturday(Boolean saturday) {
    this.saturday = saturday;
    return this;
  }

   /**
   * Get saturday
   * @return saturday
  **/
  @ApiModelProperty(value = "")
  public Boolean isSaturday() {
    return saturday;
  }

  public void setSaturday(Boolean saturday) {
    this.saturday = saturday;
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

  public StandardBusinessDays customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public StandardBusinessDays putCustomFieldsItem(String key, Object customFieldsItem) {
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
    StandardBusinessDays standardBusinessDays = (StandardBusinessDays) o;
    return Objects.equals(this.id, standardBusinessDays.id) &&
        Objects.equals(this.sunday, standardBusinessDays.sunday) &&
        Objects.equals(this.monday, standardBusinessDays.monday) &&
        Objects.equals(this.tuesday, standardBusinessDays.tuesday) &&
        Objects.equals(this.wednesday, standardBusinessDays.wednesday) &&
        Objects.equals(this.thursday, standardBusinessDays.thursday) &&
        Objects.equals(this.friday, standardBusinessDays.friday) &&
        Objects.equals(this.saturday, standardBusinessDays.saturday) &&
        Objects.equals(this.createDate, standardBusinessDays.createDate) &&
        Objects.equals(this.modifyDate, standardBusinessDays.modifyDate) &&
        Objects.equals(this.customFields, standardBusinessDays.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sunday, monday, tuesday, wednesday, thursday, friday, saturday, createDate, modifyDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardBusinessDays {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
    sb.append("    monday: ").append(toIndentedString(monday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
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

