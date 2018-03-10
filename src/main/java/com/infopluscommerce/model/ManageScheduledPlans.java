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
 * ManageScheduledPlans
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-10T09:43:11.935-06:00")
public class ManageScheduledPlans {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("scheduledplantypeid")
  private Integer scheduledplantypeid = null;

  @SerializedName("planid")
  private Integer planid = null;

  @SerializedName("active")
  private Boolean active = false;

  @SerializedName("user")
  private Integer user = null;

  @SerializedName("deleted")
  private Boolean deleted = false;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

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

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

   /**
   * Get scheduledplantypeid
   * @return scheduledplantypeid
  **/
  @ApiModelProperty(value = "")
  public Integer getScheduledplantypeid() {
    return scheduledplantypeid;
  }

   /**
   * Get planid
   * @return planid
  **/
  @ApiModelProperty(value = "")
  public Integer getPlanid() {
    return planid;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public Integer getUser() {
    return user;
  }

  public ManageScheduledPlans deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public ManageScheduledPlans warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

   /**
   * Get warehouseId
   * @return warehouseId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  public ManageScheduledPlans customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ManageScheduledPlans putCustomFieldsItem(String key, Object customFieldsItem) {
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
    ManageScheduledPlans manageScheduledPlans = (ManageScheduledPlans) o;
    return Objects.equals(this.id, manageScheduledPlans.id) &&
        Objects.equals(this.createDate, manageScheduledPlans.createDate) &&
        Objects.equals(this.modifyDate, manageScheduledPlans.modifyDate) &&
        Objects.equals(this.description, manageScheduledPlans.description) &&
        Objects.equals(this.scheduledplantypeid, manageScheduledPlans.scheduledplantypeid) &&
        Objects.equals(this.planid, manageScheduledPlans.planid) &&
        Objects.equals(this.active, manageScheduledPlans.active) &&
        Objects.equals(this.user, manageScheduledPlans.user) &&
        Objects.equals(this.deleted, manageScheduledPlans.deleted) &&
        Objects.equals(this.warehouseId, manageScheduledPlans.warehouseId) &&
        Objects.equals(this.customFields, manageScheduledPlans.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, description, scheduledplantypeid, planid, active, user, deleted, warehouseId, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManageScheduledPlans {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scheduledplantypeid: ").append(toIndentedString(scheduledplantypeid)).append("\n");
    sb.append("    planid: ").append(toIndentedString(planid)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
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

