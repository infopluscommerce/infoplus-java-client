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
 * Replenishment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-19T18:17:24.078-06:00")
public class Replenishment {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("replenishmentProcess")
  private Integer replenishmentProcess = null;

  @SerializedName("pickFaceAssignment")
  private Integer pickFaceAssignment = null;

  @SerializedName("locationId")
  private Integer locationId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

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
   * Get replenishmentProcess
   * @return replenishmentProcess
  **/
  @ApiModelProperty(value = "")
  public Integer getReplenishmentProcess() {
    return replenishmentProcess;
  }

   /**
   * Get pickFaceAssignment
   * @return pickFaceAssignment
  **/
  @ApiModelProperty(value = "")
  public Integer getPickFaceAssignment() {
    return pickFaceAssignment;
  }

  public Replenishment locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public Replenishment customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Replenishment putCustomFieldsItem(String key, Object customFieldsItem) {
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

  public Replenishment sku(String sku) {
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
    Replenishment replenishment = (Replenishment) o;
    return Objects.equals(this.id, replenishment.id) &&
        Objects.equals(this.createDate, replenishment.createDate) &&
        Objects.equals(this.modifyDate, replenishment.modifyDate) &&
        Objects.equals(this.replenishmentProcess, replenishment.replenishmentProcess) &&
        Objects.equals(this.pickFaceAssignment, replenishment.pickFaceAssignment) &&
        Objects.equals(this.locationId, replenishment.locationId) &&
        Objects.equals(this.quantity, replenishment.quantity) &&
        Objects.equals(this.customFields, replenishment.customFields) &&
        Objects.equals(this.sku, replenishment.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, replenishmentProcess, pickFaceAssignment, locationId, quantity, customFields, sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Replenishment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    replenishmentProcess: ").append(toIndentedString(replenishmentProcess)).append("\n");
    sb.append("    pickFaceAssignment: ").append(toIndentedString(pickFaceAssignment)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

