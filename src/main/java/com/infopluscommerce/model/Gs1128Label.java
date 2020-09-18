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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Gs1128Label
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T13:20:03.871-05:00")
public class Gs1128Label {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("sscc")
  private String sscc = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("orderNo")
  private BigDecimal orderNo = null;

  @SerializedName("gs1128TemplateId")
  private Integer gs1128TemplateId = null;

  @SerializedName("noOfCopies")
  private Integer noOfCopies = null;

  @SerializedName("recordType")
  private String recordType = null;

  @SerializedName("palletLoadId")
  private Integer palletLoadId = null;

  @SerializedName("masterCartonLoadId")
  private Integer masterCartonLoadId = null;

  @SerializedName("cartonId")
  private Integer cartonId = null;

  @SerializedName("lineItemId")
  private Integer lineItemId = null;

  @SerializedName("lineItemUnitNo")
  private Integer lineItemUnitNo = null;

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

   /**
   * Get sscc
   * @return sscc
  **/
  @ApiModelProperty(value = "")
  public String getSscc() {
    return sscc;
  }

  public Gs1128Label lobId(Integer lobId) {
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

  public Gs1128Label orderNo(BigDecimal orderNo) {
    this.orderNo = orderNo;
    return this;
  }

   /**
   * Get orderNo
   * @return orderNo
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(BigDecimal orderNo) {
    this.orderNo = orderNo;
  }

  public Gs1128Label gs1128TemplateId(Integer gs1128TemplateId) {
    this.gs1128TemplateId = gs1128TemplateId;
    return this;
  }

   /**
   * Get gs1128TemplateId
   * @return gs1128TemplateId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getGs1128TemplateId() {
    return gs1128TemplateId;
  }

  public void setGs1128TemplateId(Integer gs1128TemplateId) {
    this.gs1128TemplateId = gs1128TemplateId;
  }

  public Gs1128Label noOfCopies(Integer noOfCopies) {
    this.noOfCopies = noOfCopies;
    return this;
  }

   /**
   * Get noOfCopies
   * @return noOfCopies
  **/
  @ApiModelProperty(value = "")
  public Integer getNoOfCopies() {
    return noOfCopies;
  }

  public void setNoOfCopies(Integer noOfCopies) {
    this.noOfCopies = noOfCopies;
  }

  public Gs1128Label recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @ApiModelProperty(value = "")
  public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  public Gs1128Label palletLoadId(Integer palletLoadId) {
    this.palletLoadId = palletLoadId;
    return this;
  }

   /**
   * Get palletLoadId
   * @return palletLoadId
  **/
  @ApiModelProperty(value = "")
  public Integer getPalletLoadId() {
    return palletLoadId;
  }

  public void setPalletLoadId(Integer palletLoadId) {
    this.palletLoadId = palletLoadId;
  }

  public Gs1128Label masterCartonLoadId(Integer masterCartonLoadId) {
    this.masterCartonLoadId = masterCartonLoadId;
    return this;
  }

   /**
   * Get masterCartonLoadId
   * @return masterCartonLoadId
  **/
  @ApiModelProperty(value = "")
  public Integer getMasterCartonLoadId() {
    return masterCartonLoadId;
  }

  public void setMasterCartonLoadId(Integer masterCartonLoadId) {
    this.masterCartonLoadId = masterCartonLoadId;
  }

  public Gs1128Label cartonId(Integer cartonId) {
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

  public Gs1128Label lineItemId(Integer lineItemId) {
    this.lineItemId = lineItemId;
    return this;
  }

   /**
   * Get lineItemId
   * @return lineItemId
  **/
  @ApiModelProperty(value = "")
  public Integer getLineItemId() {
    return lineItemId;
  }

  public void setLineItemId(Integer lineItemId) {
    this.lineItemId = lineItemId;
  }

   /**
   * Get lineItemUnitNo
   * @return lineItemUnitNo
  **/
  @ApiModelProperty(value = "")
  public Integer getLineItemUnitNo() {
    return lineItemUnitNo;
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

  public Gs1128Label customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Gs1128Label putCustomFieldsItem(String key, Object customFieldsItem) {
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
    Gs1128Label gs1128Label = (Gs1128Label) o;
    return Objects.equals(this.id, gs1128Label.id) &&
        Objects.equals(this.sscc, gs1128Label.sscc) &&
        Objects.equals(this.lobId, gs1128Label.lobId) &&
        Objects.equals(this.orderNo, gs1128Label.orderNo) &&
        Objects.equals(this.gs1128TemplateId, gs1128Label.gs1128TemplateId) &&
        Objects.equals(this.noOfCopies, gs1128Label.noOfCopies) &&
        Objects.equals(this.recordType, gs1128Label.recordType) &&
        Objects.equals(this.palletLoadId, gs1128Label.palletLoadId) &&
        Objects.equals(this.masterCartonLoadId, gs1128Label.masterCartonLoadId) &&
        Objects.equals(this.cartonId, gs1128Label.cartonId) &&
        Objects.equals(this.lineItemId, gs1128Label.lineItemId) &&
        Objects.equals(this.lineItemUnitNo, gs1128Label.lineItemUnitNo) &&
        Objects.equals(this.createDate, gs1128Label.createDate) &&
        Objects.equals(this.modifyDate, gs1128Label.modifyDate) &&
        Objects.equals(this.customFields, gs1128Label.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sscc, lobId, orderNo, gs1128TemplateId, noOfCopies, recordType, palletLoadId, masterCartonLoadId, cartonId, lineItemId, lineItemUnitNo, createDate, modifyDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gs1128Label {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sscc: ").append(toIndentedString(sscc)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    gs1128TemplateId: ").append(toIndentedString(gs1128TemplateId)).append("\n");
    sb.append("    noOfCopies: ").append(toIndentedString(noOfCopies)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    palletLoadId: ").append(toIndentedString(palletLoadId)).append("\n");
    sb.append("    masterCartonLoadId: ").append(toIndentedString(masterCartonLoadId)).append("\n");
    sb.append("    cartonId: ").append(toIndentedString(cartonId)).append("\n");
    sb.append("    lineItemId: ").append(toIndentedString(lineItemId)).append("\n");
    sb.append("    lineItemUnitNo: ").append(toIndentedString(lineItemUnitNo)).append("\n");
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

