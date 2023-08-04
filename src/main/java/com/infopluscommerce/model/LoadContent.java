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
 * LoadContent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-03T23:21:42.819-05:00")
public class LoadContent {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("loadId")
  private Integer loadId = null;

  @SerializedName("masterCartonId")
  private Integer masterCartonId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("cartonId")
  private Integer cartonId = null;

  @SerializedName("itemId")
  private Integer itemId = null;

  @SerializedName("itemReceiptId")
  private Integer itemReceiptId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

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

  public LoadContent loadId(Integer loadId) {
    this.loadId = loadId;
    return this;
  }

   /**
   * Get loadId
   * @return loadId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLoadId() {
    return loadId;
  }

  public void setLoadId(Integer loadId) {
    this.loadId = loadId;
  }

  public LoadContent masterCartonId(Integer masterCartonId) {
    this.masterCartonId = masterCartonId;
    return this;
  }

   /**
   * Get masterCartonId
   * @return masterCartonId
  **/
  @ApiModelProperty(value = "")
  public Integer getMasterCartonId() {
    return masterCartonId;
  }

  public void setMasterCartonId(Integer masterCartonId) {
    this.masterCartonId = masterCartonId;
  }

  public LoadContent lobId(Integer lobId) {
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

  public LoadContent cartonId(Integer cartonId) {
    this.cartonId = cartonId;
    return this;
  }

   /**
   * Get cartonId
   * @return cartonId
  **/
  @ApiModelProperty(value = "")
  public Integer getCartonId() {
    return cartonId;
  }

  public void setCartonId(Integer cartonId) {
    this.cartonId = cartonId;
  }

  public LoadContent itemId(Integer itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @ApiModelProperty(value = "")
  public Integer getItemId() {
    return itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public LoadContent itemReceiptId(Integer itemReceiptId) {
    this.itemReceiptId = itemReceiptId;
    return this;
  }

   /**
   * Get itemReceiptId
   * @return itemReceiptId
  **/
  @ApiModelProperty(value = "")
  public Integer getItemReceiptId() {
    return itemReceiptId;
  }

  public void setItemReceiptId(Integer itemReceiptId) {
    this.itemReceiptId = itemReceiptId;
  }

  public LoadContent quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public LoadContent customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public LoadContent putCustomFieldsItem(String key, Object customFieldsItem) {
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
    LoadContent loadContent = (LoadContent) o;
    return Objects.equals(this.id, loadContent.id) &&
        Objects.equals(this.createDate, loadContent.createDate) &&
        Objects.equals(this.modifyDate, loadContent.modifyDate) &&
        Objects.equals(this.loadId, loadContent.loadId) &&
        Objects.equals(this.masterCartonId, loadContent.masterCartonId) &&
        Objects.equals(this.lobId, loadContent.lobId) &&
        Objects.equals(this.cartonId, loadContent.cartonId) &&
        Objects.equals(this.itemId, loadContent.itemId) &&
        Objects.equals(this.itemReceiptId, loadContent.itemReceiptId) &&
        Objects.equals(this.quantity, loadContent.quantity) &&
        Objects.equals(this.customFields, loadContent.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, loadId, masterCartonId, lobId, cartonId, itemId, itemReceiptId, quantity, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadContent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    loadId: ").append(toIndentedString(loadId)).append("\n");
    sb.append("    masterCartonId: ").append(toIndentedString(masterCartonId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    cartonId: ").append(toIndentedString(cartonId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemReceiptId: ").append(toIndentedString(itemReceiptId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

