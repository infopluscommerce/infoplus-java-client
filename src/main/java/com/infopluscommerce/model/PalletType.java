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

/**
 * PalletType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-21T23:57:39.841-06:00")
public class PalletType {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("palletLengthIn")
  private BigDecimal palletLengthIn = null;

  @SerializedName("palletWidthIn")
  private BigDecimal palletWidthIn = null;

  @SerializedName("palletHeightIn")
  private BigDecimal palletHeightIn = null;

  @SerializedName("palletWeightLbs")
  private BigDecimal palletWeightLbs = null;

  @SerializedName("packableLengthIn")
  private BigDecimal packableLengthIn = null;

  @SerializedName("packableWidthIn")
  private BigDecimal packableWidthIn = null;

  @SerializedName("packableHeightIn")
  private BigDecimal packableHeightIn = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("isActive")
  private Boolean isActive = false;

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

  public PalletType name(String name) {
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

  public PalletType palletLengthIn(BigDecimal palletLengthIn) {
    this.palletLengthIn = palletLengthIn;
    return this;
  }

   /**
   * Get palletLengthIn
   * @return palletLengthIn
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPalletLengthIn() {
    return palletLengthIn;
  }

  public void setPalletLengthIn(BigDecimal palletLengthIn) {
    this.palletLengthIn = palletLengthIn;
  }

  public PalletType palletWidthIn(BigDecimal palletWidthIn) {
    this.palletWidthIn = palletWidthIn;
    return this;
  }

   /**
   * Get palletWidthIn
   * @return palletWidthIn
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPalletWidthIn() {
    return palletWidthIn;
  }

  public void setPalletWidthIn(BigDecimal palletWidthIn) {
    this.palletWidthIn = palletWidthIn;
  }

  public PalletType palletHeightIn(BigDecimal palletHeightIn) {
    this.palletHeightIn = palletHeightIn;
    return this;
  }

   /**
   * Get palletHeightIn
   * @return palletHeightIn
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPalletHeightIn() {
    return palletHeightIn;
  }

  public void setPalletHeightIn(BigDecimal palletHeightIn) {
    this.palletHeightIn = palletHeightIn;
  }

  public PalletType palletWeightLbs(BigDecimal palletWeightLbs) {
    this.palletWeightLbs = palletWeightLbs;
    return this;
  }

   /**
   * Get palletWeightLbs
   * @return palletWeightLbs
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPalletWeightLbs() {
    return palletWeightLbs;
  }

  public void setPalletWeightLbs(BigDecimal palletWeightLbs) {
    this.palletWeightLbs = palletWeightLbs;
  }

  public PalletType packableLengthIn(BigDecimal packableLengthIn) {
    this.packableLengthIn = packableLengthIn;
    return this;
  }

   /**
   * Get packableLengthIn
   * @return packableLengthIn
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPackableLengthIn() {
    return packableLengthIn;
  }

  public void setPackableLengthIn(BigDecimal packableLengthIn) {
    this.packableLengthIn = packableLengthIn;
  }

  public PalletType packableWidthIn(BigDecimal packableWidthIn) {
    this.packableWidthIn = packableWidthIn;
    return this;
  }

   /**
   * Get packableWidthIn
   * @return packableWidthIn
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPackableWidthIn() {
    return packableWidthIn;
  }

  public void setPackableWidthIn(BigDecimal packableWidthIn) {
    this.packableWidthIn = packableWidthIn;
  }

  public PalletType packableHeightIn(BigDecimal packableHeightIn) {
    this.packableHeightIn = packableHeightIn;
    return this;
  }

   /**
   * Get packableHeightIn
   * @return packableHeightIn
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPackableHeightIn() {
    return packableHeightIn;
  }

  public void setPackableHeightIn(BigDecimal packableHeightIn) {
    this.packableHeightIn = packableHeightIn;
  }

  public PalletType lobId(Integer lobId) {
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

  public PalletType isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public PalletType customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public PalletType putCustomFieldsItem(String key, Object customFieldsItem) {
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
    PalletType palletType = (PalletType) o;
    return Objects.equals(this.id, palletType.id) &&
        Objects.equals(this.name, palletType.name) &&
        Objects.equals(this.palletLengthIn, palletType.palletLengthIn) &&
        Objects.equals(this.palletWidthIn, palletType.palletWidthIn) &&
        Objects.equals(this.palletHeightIn, palletType.palletHeightIn) &&
        Objects.equals(this.palletWeightLbs, palletType.palletWeightLbs) &&
        Objects.equals(this.packableLengthIn, palletType.packableLengthIn) &&
        Objects.equals(this.packableWidthIn, palletType.packableWidthIn) &&
        Objects.equals(this.packableHeightIn, palletType.packableHeightIn) &&
        Objects.equals(this.lobId, palletType.lobId) &&
        Objects.equals(this.isActive, palletType.isActive) &&
        Objects.equals(this.customFields, palletType.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, palletLengthIn, palletWidthIn, palletHeightIn, palletWeightLbs, packableLengthIn, packableWidthIn, packableHeightIn, lobId, isActive, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PalletType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    palletLengthIn: ").append(toIndentedString(palletLengthIn)).append("\n");
    sb.append("    palletWidthIn: ").append(toIndentedString(palletWidthIn)).append("\n");
    sb.append("    palletHeightIn: ").append(toIndentedString(palletHeightIn)).append("\n");
    sb.append("    palletWeightLbs: ").append(toIndentedString(palletWeightLbs)).append("\n");
    sb.append("    packableLengthIn: ").append(toIndentedString(packableLengthIn)).append("\n");
    sb.append("    packableWidthIn: ").append(toIndentedString(packableWidthIn)).append("\n");
    sb.append("    packableHeightIn: ").append(toIndentedString(packableHeightIn)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

