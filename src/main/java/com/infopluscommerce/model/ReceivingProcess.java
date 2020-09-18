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
 * ReceivingProcess
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T13:20:03.871-05:00")
public class ReceivingProcess {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("workBatchId")
  private Integer workBatchId = null;

  @SerializedName("receivingWorksheetId")
  private Integer receivingWorksheetId = null;

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

  public ReceivingProcess warehouseId(Integer warehouseId) {
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

  public ReceivingProcess status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ReceivingProcess workBatchId(Integer workBatchId) {
    this.workBatchId = workBatchId;
    return this;
  }

   /**
   * Get workBatchId
   * @return workBatchId
  **/
  @ApiModelProperty(value = "")
  public Integer getWorkBatchId() {
    return workBatchId;
  }

  public void setWorkBatchId(Integer workBatchId) {
    this.workBatchId = workBatchId;
  }

  public ReceivingProcess receivingWorksheetId(Integer receivingWorksheetId) {
    this.receivingWorksheetId = receivingWorksheetId;
    return this;
  }

   /**
   * Get receivingWorksheetId
   * @return receivingWorksheetId
  **/
  @ApiModelProperty(value = "")
  public Integer getReceivingWorksheetId() {
    return receivingWorksheetId;
  }

  public void setReceivingWorksheetId(Integer receivingWorksheetId) {
    this.receivingWorksheetId = receivingWorksheetId;
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

  public ReceivingProcess customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ReceivingProcess putCustomFieldsItem(String key, Object customFieldsItem) {
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
    ReceivingProcess receivingProcess = (ReceivingProcess) o;
    return Objects.equals(this.id, receivingProcess.id) &&
        Objects.equals(this.warehouseId, receivingProcess.warehouseId) &&
        Objects.equals(this.status, receivingProcess.status) &&
        Objects.equals(this.workBatchId, receivingProcess.workBatchId) &&
        Objects.equals(this.receivingWorksheetId, receivingProcess.receivingWorksheetId) &&
        Objects.equals(this.createDate, receivingProcess.createDate) &&
        Objects.equals(this.modifyDate, receivingProcess.modifyDate) &&
        Objects.equals(this.customFields, receivingProcess.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, status, workBatchId, receivingWorksheetId, createDate, modifyDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivingProcess {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    workBatchId: ").append(toIndentedString(workBatchId)).append("\n");
    sb.append("    receivingWorksheetId: ").append(toIndentedString(receivingWorksheetId)).append("\n");
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

