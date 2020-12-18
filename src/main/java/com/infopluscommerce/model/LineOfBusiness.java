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
 * LineOfBusiness
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-18T12:17:58.676-06:00")
public class LineOfBusiness {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("defaultWarehouseServiceTypeId")
  private Integer defaultWarehouseServiceTypeId = null;

  @SerializedName("defaultSLAServiceDays")
  private Integer defaultSLAServiceDays = null;

  @SerializedName("defaultSLACutoffTime")
  private String defaultSLACutoffTime = null;

  @SerializedName("onHold")
  private Boolean onHold = false;

  @SerializedName("onHoldReason")
  private String onHoldReason = null;

  @SerializedName("gs1CompanyPrefix")
  private String gs1CompanyPrefix = null;

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

  public LineOfBusiness name(String name) {
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

  public LineOfBusiness code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public LineOfBusiness label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public LineOfBusiness defaultWarehouseServiceTypeId(Integer defaultWarehouseServiceTypeId) {
    this.defaultWarehouseServiceTypeId = defaultWarehouseServiceTypeId;
    return this;
  }

   /**
   * Get defaultWarehouseServiceTypeId
   * @return defaultWarehouseServiceTypeId
  **/
  @ApiModelProperty(value = "")
  public Integer getDefaultWarehouseServiceTypeId() {
    return defaultWarehouseServiceTypeId;
  }

  public void setDefaultWarehouseServiceTypeId(Integer defaultWarehouseServiceTypeId) {
    this.defaultWarehouseServiceTypeId = defaultWarehouseServiceTypeId;
  }

  public LineOfBusiness defaultSLAServiceDays(Integer defaultSLAServiceDays) {
    this.defaultSLAServiceDays = defaultSLAServiceDays;
    return this;
  }

   /**
   * Get defaultSLAServiceDays
   * @return defaultSLAServiceDays
  **/
  @ApiModelProperty(value = "")
  public Integer getDefaultSLAServiceDays() {
    return defaultSLAServiceDays;
  }

  public void setDefaultSLAServiceDays(Integer defaultSLAServiceDays) {
    this.defaultSLAServiceDays = defaultSLAServiceDays;
  }

  public LineOfBusiness defaultSLACutoffTime(String defaultSLACutoffTime) {
    this.defaultSLACutoffTime = defaultSLACutoffTime;
    return this;
  }

   /**
   * Get defaultSLACutoffTime
   * @return defaultSLACutoffTime
  **/
  @ApiModelProperty(value = "")
  public String getDefaultSLACutoffTime() {
    return defaultSLACutoffTime;
  }

  public void setDefaultSLACutoffTime(String defaultSLACutoffTime) {
    this.defaultSLACutoffTime = defaultSLACutoffTime;
  }

  public LineOfBusiness onHold(Boolean onHold) {
    this.onHold = onHold;
    return this;
  }

   /**
   * Get onHold
   * @return onHold
  **/
  @ApiModelProperty(value = "")
  public Boolean isOnHold() {
    return onHold;
  }

  public void setOnHold(Boolean onHold) {
    this.onHold = onHold;
  }

  public LineOfBusiness onHoldReason(String onHoldReason) {
    this.onHoldReason = onHoldReason;
    return this;
  }

   /**
   * Get onHoldReason
   * @return onHoldReason
  **/
  @ApiModelProperty(value = "")
  public String getOnHoldReason() {
    return onHoldReason;
  }

  public void setOnHoldReason(String onHoldReason) {
    this.onHoldReason = onHoldReason;
  }

  public LineOfBusiness gs1CompanyPrefix(String gs1CompanyPrefix) {
    this.gs1CompanyPrefix = gs1CompanyPrefix;
    return this;
  }

   /**
   * Get gs1CompanyPrefix
   * @return gs1CompanyPrefix
  **/
  @ApiModelProperty(value = "")
  public String getGs1CompanyPrefix() {
    return gs1CompanyPrefix;
  }

  public void setGs1CompanyPrefix(String gs1CompanyPrefix) {
    this.gs1CompanyPrefix = gs1CompanyPrefix;
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

  public LineOfBusiness customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public LineOfBusiness putCustomFieldsItem(String key, Object customFieldsItem) {
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
    LineOfBusiness lineOfBusiness = (LineOfBusiness) o;
    return Objects.equals(this.id, lineOfBusiness.id) &&
        Objects.equals(this.name, lineOfBusiness.name) &&
        Objects.equals(this.code, lineOfBusiness.code) &&
        Objects.equals(this.label, lineOfBusiness.label) &&
        Objects.equals(this.defaultWarehouseServiceTypeId, lineOfBusiness.defaultWarehouseServiceTypeId) &&
        Objects.equals(this.defaultSLAServiceDays, lineOfBusiness.defaultSLAServiceDays) &&
        Objects.equals(this.defaultSLACutoffTime, lineOfBusiness.defaultSLACutoffTime) &&
        Objects.equals(this.onHold, lineOfBusiness.onHold) &&
        Objects.equals(this.onHoldReason, lineOfBusiness.onHoldReason) &&
        Objects.equals(this.gs1CompanyPrefix, lineOfBusiness.gs1CompanyPrefix) &&
        Objects.equals(this.createDate, lineOfBusiness.createDate) &&
        Objects.equals(this.modifyDate, lineOfBusiness.modifyDate) &&
        Objects.equals(this.customFields, lineOfBusiness.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, code, label, defaultWarehouseServiceTypeId, defaultSLAServiceDays, defaultSLACutoffTime, onHold, onHoldReason, gs1CompanyPrefix, createDate, modifyDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineOfBusiness {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    defaultWarehouseServiceTypeId: ").append(toIndentedString(defaultWarehouseServiceTypeId)).append("\n");
    sb.append("    defaultSLAServiceDays: ").append(toIndentedString(defaultSLAServiceDays)).append("\n");
    sb.append("    defaultSLACutoffTime: ").append(toIndentedString(defaultSLACutoffTime)).append("\n");
    sb.append("    onHold: ").append(toIndentedString(onHold)).append("\n");
    sb.append("    onHoldReason: ").append(toIndentedString(onHoldReason)).append("\n");
    sb.append("    gs1CompanyPrefix: ").append(toIndentedString(gs1CompanyPrefix)).append("\n");
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

