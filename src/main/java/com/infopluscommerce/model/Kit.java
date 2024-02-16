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
import com.infopluscommerce.model.KitComponent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Kit
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-16T13:04:33.234-06:00")
public class Kit {
  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("kitSKU")
  private String kitSKU = null;

  @SerializedName("packagingType")
  private String packagingType = null;

  @SerializedName("other")
  private String other = null;

  @SerializedName("numberOfComponents")
  private Integer numberOfComponents = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("line1")
  private String line1 = null;

  @SerializedName("line2")
  private String line2 = null;

  @SerializedName("line3")
  private String line3 = null;

  @SerializedName("line4")
  private String line4 = null;

  @SerializedName("line5")
  private String line5 = null;

  @SerializedName("line6")
  private String line6 = null;

  @SerializedName("line7")
  private String line7 = null;

  @SerializedName("line8")
  private String line8 = null;

  @SerializedName("touches")
  private Integer touches = null;

  @SerializedName("minInvQty")
  private Integer minInvQty = null;

  @SerializedName("midInvQty")
  private Integer midInvQty = null;

  @SerializedName("maxInvQty")
  private Integer maxInvQty = null;

  @SerializedName("isKOD")
  private String isKOD = null;

  @SerializedName("kodType")
  private String kodType = null;

  @SerializedName("kitComponentList")
  private List<KitComponent> kitComponentList = new ArrayList<KitComponent>();

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  public Kit lobId(Integer lobId) {
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
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public Kit kitSKU(String kitSKU) {
    this.kitSKU = kitSKU;
    return this;
  }

   /**
   * Get kitSKU
   * @return kitSKU
  **/
  @ApiModelProperty(required = true, value = "")
  public String getKitSKU() {
    return kitSKU;
  }

  public void setKitSKU(String kitSKU) {
    this.kitSKU = kitSKU;
  }

  public Kit packagingType(String packagingType) {
    this.packagingType = packagingType;
    return this;
  }

   /**
   * Get packagingType
   * @return packagingType
  **/
  @ApiModelProperty(value = "")
  public String getPackagingType() {
    return packagingType;
  }

  public void setPackagingType(String packagingType) {
    this.packagingType = packagingType;
  }

  public Kit other(String other) {
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @ApiModelProperty(value = "")
  public String getOther() {
    return other;
  }

  public void setOther(String other) {
    this.other = other;
  }

   /**
   * Get numberOfComponents
   * @return numberOfComponents
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfComponents() {
    return numberOfComponents;
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

  public Kit line1(String line1) {
    this.line1 = line1;
    return this;
  }

   /**
   * Get line1
   * @return line1
  **/
  @ApiModelProperty(value = "")
  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public Kit line2(String line2) {
    this.line2 = line2;
    return this;
  }

   /**
   * Get line2
   * @return line2
  **/
  @ApiModelProperty(value = "")
  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public Kit line3(String line3) {
    this.line3 = line3;
    return this;
  }

   /**
   * Get line3
   * @return line3
  **/
  @ApiModelProperty(value = "")
  public String getLine3() {
    return line3;
  }

  public void setLine3(String line3) {
    this.line3 = line3;
  }

  public Kit line4(String line4) {
    this.line4 = line4;
    return this;
  }

   /**
   * Get line4
   * @return line4
  **/
  @ApiModelProperty(value = "")
  public String getLine4() {
    return line4;
  }

  public void setLine4(String line4) {
    this.line4 = line4;
  }

  public Kit line5(String line5) {
    this.line5 = line5;
    return this;
  }

   /**
   * Get line5
   * @return line5
  **/
  @ApiModelProperty(value = "")
  public String getLine5() {
    return line5;
  }

  public void setLine5(String line5) {
    this.line5 = line5;
  }

  public Kit line6(String line6) {
    this.line6 = line6;
    return this;
  }

   /**
   * Get line6
   * @return line6
  **/
  @ApiModelProperty(value = "")
  public String getLine6() {
    return line6;
  }

  public void setLine6(String line6) {
    this.line6 = line6;
  }

  public Kit line7(String line7) {
    this.line7 = line7;
    return this;
  }

   /**
   * Get line7
   * @return line7
  **/
  @ApiModelProperty(value = "")
  public String getLine7() {
    return line7;
  }

  public void setLine7(String line7) {
    this.line7 = line7;
  }

  public Kit line8(String line8) {
    this.line8 = line8;
    return this;
  }

   /**
   * Get line8
   * @return line8
  **/
  @ApiModelProperty(value = "")
  public String getLine8() {
    return line8;
  }

  public void setLine8(String line8) {
    this.line8 = line8;
  }

  public Kit touches(Integer touches) {
    this.touches = touches;
    return this;
  }

   /**
   * Get touches
   * @return touches
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTouches() {
    return touches;
  }

  public void setTouches(Integer touches) {
    this.touches = touches;
  }

  public Kit minInvQty(Integer minInvQty) {
    this.minInvQty = minInvQty;
    return this;
  }

   /**
   * Get minInvQty
   * @return minInvQty
  **/
  @ApiModelProperty(value = "")
  public Integer getMinInvQty() {
    return minInvQty;
  }

  public void setMinInvQty(Integer minInvQty) {
    this.minInvQty = minInvQty;
  }

  public Kit midInvQty(Integer midInvQty) {
    this.midInvQty = midInvQty;
    return this;
  }

   /**
   * Get midInvQty
   * @return midInvQty
  **/
  @ApiModelProperty(value = "")
  public Integer getMidInvQty() {
    return midInvQty;
  }

  public void setMidInvQty(Integer midInvQty) {
    this.midInvQty = midInvQty;
  }

  public Kit maxInvQty(Integer maxInvQty) {
    this.maxInvQty = maxInvQty;
    return this;
  }

   /**
   * Get maxInvQty
   * @return maxInvQty
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxInvQty() {
    return maxInvQty;
  }

  public void setMaxInvQty(Integer maxInvQty) {
    this.maxInvQty = maxInvQty;
  }

  public Kit isKOD(String isKOD) {
    this.isKOD = isKOD;
    return this;
  }

   /**
   * Get isKOD
   * @return isKOD
  **/
  @ApiModelProperty(required = true, value = "")
  public String getIsKOD() {
    return isKOD;
  }

  public void setIsKOD(String isKOD) {
    this.isKOD = isKOD;
  }

  public Kit kodType(String kodType) {
    this.kodType = kodType;
    return this;
  }

   /**
   * Get kodType
   * @return kodType
  **/
  @ApiModelProperty(value = "")
  public String getKodType() {
    return kodType;
  }

  public void setKodType(String kodType) {
    this.kodType = kodType;
  }

  public Kit kitComponentList(List<KitComponent> kitComponentList) {
    this.kitComponentList = kitComponentList;
    return this;
  }

  public Kit addKitComponentListItem(KitComponent kitComponentListItem) {
    this.kitComponentList.add(kitComponentListItem);
    return this;
  }

   /**
   * Get kitComponentList
   * @return kitComponentList
  **/
  @ApiModelProperty(required = true, value = "")
  public List<KitComponent> getKitComponentList() {
    return kitComponentList;
  }

  public void setKitComponentList(List<KitComponent> kitComponentList) {
    this.kitComponentList = kitComponentList;
  }

  public Kit customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Kit putCustomFieldsItem(String key, Object customFieldsItem) {
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
    Kit kit = (Kit) o;
    return Objects.equals(this.lobId, kit.lobId) &&
        Objects.equals(this.id, kit.id) &&
        Objects.equals(this.kitSKU, kit.kitSKU) &&
        Objects.equals(this.packagingType, kit.packagingType) &&
        Objects.equals(this.other, kit.other) &&
        Objects.equals(this.numberOfComponents, kit.numberOfComponents) &&
        Objects.equals(this.createDate, kit.createDate) &&
        Objects.equals(this.modifyDate, kit.modifyDate) &&
        Objects.equals(this.line1, kit.line1) &&
        Objects.equals(this.line2, kit.line2) &&
        Objects.equals(this.line3, kit.line3) &&
        Objects.equals(this.line4, kit.line4) &&
        Objects.equals(this.line5, kit.line5) &&
        Objects.equals(this.line6, kit.line6) &&
        Objects.equals(this.line7, kit.line7) &&
        Objects.equals(this.line8, kit.line8) &&
        Objects.equals(this.touches, kit.touches) &&
        Objects.equals(this.minInvQty, kit.minInvQty) &&
        Objects.equals(this.midInvQty, kit.midInvQty) &&
        Objects.equals(this.maxInvQty, kit.maxInvQty) &&
        Objects.equals(this.isKOD, kit.isKOD) &&
        Objects.equals(this.kodType, kit.kodType) &&
        Objects.equals(this.kitComponentList, kit.kitComponentList) &&
        Objects.equals(this.customFields, kit.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lobId, id, kitSKU, packagingType, other, numberOfComponents, createDate, modifyDate, line1, line2, line3, line4, line5, line6, line7, line8, touches, minInvQty, midInvQty, maxInvQty, isKOD, kodType, kitComponentList, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Kit {\n");
    
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kitSKU: ").append(toIndentedString(kitSKU)).append("\n");
    sb.append("    packagingType: ").append(toIndentedString(packagingType)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    numberOfComponents: ").append(toIndentedString(numberOfComponents)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    line4: ").append(toIndentedString(line4)).append("\n");
    sb.append("    line5: ").append(toIndentedString(line5)).append("\n");
    sb.append("    line6: ").append(toIndentedString(line6)).append("\n");
    sb.append("    line7: ").append(toIndentedString(line7)).append("\n");
    sb.append("    line8: ").append(toIndentedString(line8)).append("\n");
    sb.append("    touches: ").append(toIndentedString(touches)).append("\n");
    sb.append("    minInvQty: ").append(toIndentedString(minInvQty)).append("\n");
    sb.append("    midInvQty: ").append(toIndentedString(midInvQty)).append("\n");
    sb.append("    maxInvQty: ").append(toIndentedString(maxInvQty)).append("\n");
    sb.append("    isKOD: ").append(toIndentedString(isKOD)).append("\n");
    sb.append("    kodType: ").append(toIndentedString(kodType)).append("\n");
    sb.append("    kitComponentList: ").append(toIndentedString(kitComponentList)).append("\n");
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

