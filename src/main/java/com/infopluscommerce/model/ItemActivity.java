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
 * ItemActivity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-05T12:20:58.280-06:00")
public class ItemActivity {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("inventoryChange")
  private Integer inventoryChange = null;

  @SerializedName("activityType")
  private String activityType = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  @SerializedName("sku")
  private String sku = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(value = "")
  public Integer getLobId() {
    return lobId;
  }

  public ItemActivity inventoryChange(Integer inventoryChange) {
    this.inventoryChange = inventoryChange;
    return this;
  }

   /**
   * Get inventoryChange
   * @return inventoryChange
  **/
  @ApiModelProperty(value = "")
  public Integer getInventoryChange() {
    return inventoryChange;
  }

  public void setInventoryChange(Integer inventoryChange) {
    this.inventoryChange = inventoryChange;
  }

  public ItemActivity activityType(String activityType) {
    this.activityType = activityType;
    return this;
  }

   /**
   * Get activityType
   * @return activityType
  **/
  @ApiModelProperty(value = "")
  public String getActivityType() {
    return activityType;
  }

  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public ItemActivity notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public ItemActivity customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ItemActivity putCustomFieldsItem(String key, Object customFieldsItem) {
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

  public ItemActivity sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemActivity itemActivity = (ItemActivity) o;
    return Objects.equals(this.id, itemActivity.id) &&
        Objects.equals(this.lobId, itemActivity.lobId) &&
        Objects.equals(this.inventoryChange, itemActivity.inventoryChange) &&
        Objects.equals(this.activityType, itemActivity.activityType) &&
        Objects.equals(this.createDate, itemActivity.createDate) &&
        Objects.equals(this.notes, itemActivity.notes) &&
        Objects.equals(this.customFields, itemActivity.customFields) &&
        Objects.equals(this.sku, itemActivity.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lobId, inventoryChange, activityType, createDate, notes, customFields, sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    inventoryChange: ").append(toIndentedString(inventoryChange)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

