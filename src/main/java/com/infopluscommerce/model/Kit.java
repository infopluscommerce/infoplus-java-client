package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class Kit   {
  
  private Integer lobId = null;
  private Integer id = null;
  private Integer kitSKUId = null;
  private String packagingType = null;
  private String other = null;
  private Integer numberOfComponents = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String line1 = null;
  private String line2 = null;
  private String line3 = null;
  private String line4 = null;
  private String line5 = null;
  private String line6 = null;
  private String line7 = null;
  private String line8 = null;
  private Integer touches = null;
  private Integer minInvQty = null;
  private Integer midInvQty = null;
  private Integer maxInvQty = null;
  private String isKOD = null;
  private String kodType = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  /**
   **/
  public Kit lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }
  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public Kit kitSKUId(Integer kitSKUId) {
    this.kitSKUId = kitSKUId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("kitSKUId")
  public Integer getKitSKUId() {
    return kitSKUId;
  }
  public void setKitSKUId(Integer kitSKUId) {
    this.kitSKUId = kitSKUId;
  }

  
  /**
   **/
  public Kit packagingType(String packagingType) {
    this.packagingType = packagingType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("packagingType")
  public String getPackagingType() {
    return packagingType;
  }
  public void setPackagingType(String packagingType) {
    this.packagingType = packagingType;
  }

  
  /**
   **/
  public Kit other(String other) {
    this.other = other;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("other")
  public String getOther() {
    return other;
  }
  public void setOther(String other) {
    this.other = other;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfComponents")
  public Integer getNumberOfComponents() {
    return numberOfComponents;
  }

  
  /**
   **/
  public Kit createDate(Date createDate) {
    this.createDate = createDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  
  /**
   **/
  public Kit modifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }
  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

  
  /**
   **/
  public Kit line1(String line1) {
    this.line1 = line1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("line1")
  public String getLine1() {
    return line1;
  }
  public void setLine1(String line1) {
    this.line1 = line1;
  }

  
  /**
   **/
  public Kit line2(String line2) {
    this.line2 = line2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("line2")
  public String getLine2() {
    return line2;
  }
  public void setLine2(String line2) {
    this.line2 = line2;
  }

  
  /**
   **/
  public Kit line3(String line3) {
    this.line3 = line3;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("line3")
  public String getLine3() {
    return line3;
  }
  public void setLine3(String line3) {
    this.line3 = line3;
  }

  
  /**
   **/
  public Kit line4(String line4) {
    this.line4 = line4;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("line4")
  public String getLine4() {
    return line4;
  }
  public void setLine4(String line4) {
    this.line4 = line4;
  }

  
  /**
   **/
  public Kit line5(String line5) {
    this.line5 = line5;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("line5")
  public String getLine5() {
    return line5;
  }
  public void setLine5(String line5) {
    this.line5 = line5;
  }

  
  /**
   **/
  public Kit line6(String line6) {
    this.line6 = line6;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("line6")
  public String getLine6() {
    return line6;
  }
  public void setLine6(String line6) {
    this.line6 = line6;
  }

  
  /**
   **/
  public Kit line7(String line7) {
    this.line7 = line7;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("line7")
  public String getLine7() {
    return line7;
  }
  public void setLine7(String line7) {
    this.line7 = line7;
  }

  
  /**
   **/
  public Kit line8(String line8) {
    this.line8 = line8;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("line8")
  public String getLine8() {
    return line8;
  }
  public void setLine8(String line8) {
    this.line8 = line8;
  }

  
  /**
   **/
  public Kit touches(Integer touches) {
    this.touches = touches;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("touches")
  public Integer getTouches() {
    return touches;
  }
  public void setTouches(Integer touches) {
    this.touches = touches;
  }

  
  /**
   **/
  public Kit minInvQty(Integer minInvQty) {
    this.minInvQty = minInvQty;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minInvQty")
  public Integer getMinInvQty() {
    return minInvQty;
  }
  public void setMinInvQty(Integer minInvQty) {
    this.minInvQty = minInvQty;
  }

  
  /**
   **/
  public Kit midInvQty(Integer midInvQty) {
    this.midInvQty = midInvQty;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("midInvQty")
  public Integer getMidInvQty() {
    return midInvQty;
  }
  public void setMidInvQty(Integer midInvQty) {
    this.midInvQty = midInvQty;
  }

  
  /**
   **/
  public Kit maxInvQty(Integer maxInvQty) {
    this.maxInvQty = maxInvQty;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxInvQty")
  public Integer getMaxInvQty() {
    return maxInvQty;
  }
  public void setMaxInvQty(Integer maxInvQty) {
    this.maxInvQty = maxInvQty;
  }

  
  /**
   **/
  public Kit isKOD(String isKOD) {
    this.isKOD = isKOD;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("isKOD")
  public String getIsKOD() {
    return isKOD;
  }
  public void setIsKOD(String isKOD) {
    this.isKOD = isKOD;
  }

  
  /**
   **/
  public Kit kodType(String kodType) {
    this.kodType = kodType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("kodType")
  public String getKodType() {
    return kodType;
  }
  public void setKodType(String kodType) {
    this.kodType = kodType;
  }

  
  /**
   **/
  public Kit customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customFields")
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
        Objects.equals(this.kitSKUId, kit.kitSKUId) &&
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
        Objects.equals(this.customFields, kit.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lobId, id, kitSKUId, packagingType, other, numberOfComponents, createDate, modifyDate, line1, line2, line3, line4, line5, line6, line7, line8, touches, minInvQty, midInvQty, maxInvQty, isKOD, kodType, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Kit {\n");
    
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kitSKUId: ").append(toIndentedString(kitSKUId)).append("\n");
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

