package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class Supplement   {
  
  private Integer lobId = null;
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer originalSKUId = null;
  private Integer supplementSKUId = null;
  private String type = null;
  private BigDecimal supplementQuantity = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  /**
   **/
  public Supplement lobId(Integer lobId) {
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
  public Supplement createDate(Date createDate) {
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
  public Supplement modifyDate(Date modifyDate) {
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
  public Supplement originalSKUId(Integer originalSKUId) {
    this.originalSKUId = originalSKUId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("originalSKUId")
  public Integer getOriginalSKUId() {
    return originalSKUId;
  }
  public void setOriginalSKUId(Integer originalSKUId) {
    this.originalSKUId = originalSKUId;
  }

  
  /**
   **/
  public Supplement supplementSKUId(Integer supplementSKUId) {
    this.supplementSKUId = supplementSKUId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("supplementSKUId")
  public Integer getSupplementSKUId() {
    return supplementSKUId;
  }
  public void setSupplementSKUId(Integer supplementSKUId) {
    this.supplementSKUId = supplementSKUId;
  }

  
  /**
   **/
  public Supplement type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  public Supplement supplementQuantity(BigDecimal supplementQuantity) {
    this.supplementQuantity = supplementQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("supplementQuantity")
  public BigDecimal getSupplementQuantity() {
    return supplementQuantity;
  }
  public void setSupplementQuantity(BigDecimal supplementQuantity) {
    this.supplementQuantity = supplementQuantity;
  }

  
  /**
   **/
  public Supplement customFields(Map<String, Object> customFields) {
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
    Supplement supplement = (Supplement) o;
    return Objects.equals(this.lobId, supplement.lobId) &&
        Objects.equals(this.id, supplement.id) &&
        Objects.equals(this.createDate, supplement.createDate) &&
        Objects.equals(this.modifyDate, supplement.modifyDate) &&
        Objects.equals(this.originalSKUId, supplement.originalSKUId) &&
        Objects.equals(this.supplementSKUId, supplement.supplementSKUId) &&
        Objects.equals(this.type, supplement.type) &&
        Objects.equals(this.supplementQuantity, supplement.supplementQuantity) &&
        Objects.equals(this.customFields, supplement.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lobId, id, createDate, modifyDate, originalSKUId, supplementSKUId, type, supplementQuantity, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Supplement {\n");
    
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    originalSKUId: ").append(toIndentedString(originalSKUId)).append("\n");
    sb.append("    supplementSKUId: ").append(toIndentedString(supplementSKUId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    supplementQuantity: ").append(toIndentedString(supplementQuantity)).append("\n");
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

