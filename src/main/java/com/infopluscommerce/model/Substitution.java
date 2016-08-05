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





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-04T22:56:01.104-05:00")
public class Substitution   {
  
  private Integer lobId = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer id = null;
  private Integer orderSKUId = null;
  private Integer substituteSKUId = null;
  private String period = null;
  private String type = null;
  private BigDecimal substitutionQuantity = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  /**
   **/
  public Substitution lobId(Integer lobId) {
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

  
  /**
   **/
  public Substitution createDate(Date createDate) {
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
  public Substitution modifyDate(Date modifyDate) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public Substitution orderSKUId(Integer orderSKUId) {
    this.orderSKUId = orderSKUId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("orderSKUId")
  public Integer getOrderSKUId() {
    return orderSKUId;
  }
  public void setOrderSKUId(Integer orderSKUId) {
    this.orderSKUId = orderSKUId;
  }

  
  /**
   **/
  public Substitution substituteSKUId(Integer substituteSKUId) {
    this.substituteSKUId = substituteSKUId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("substituteSKUId")
  public Integer getSubstituteSKUId() {
    return substituteSKUId;
  }
  public void setSubstituteSKUId(Integer substituteSKUId) {
    this.substituteSKUId = substituteSKUId;
  }

  
  /**
   **/
  public Substitution period(String period) {
    this.period = period;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("period")
  public String getPeriod() {
    return period;
  }
  public void setPeriod(String period) {
    this.period = period;
  }

  
  /**
   **/
  public Substitution type(String type) {
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
  public Substitution substitutionQuantity(BigDecimal substitutionQuantity) {
    this.substitutionQuantity = substitutionQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("substitutionQuantity")
  public BigDecimal getSubstitutionQuantity() {
    return substitutionQuantity;
  }
  public void setSubstitutionQuantity(BigDecimal substitutionQuantity) {
    this.substitutionQuantity = substitutionQuantity;
  }

  
  /**
   **/
  public Substitution customFields(Map<String, Object> customFields) {
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
    Substitution substitution = (Substitution) o;
    return Objects.equals(this.lobId, substitution.lobId) &&
        Objects.equals(this.createDate, substitution.createDate) &&
        Objects.equals(this.modifyDate, substitution.modifyDate) &&
        Objects.equals(this.id, substitution.id) &&
        Objects.equals(this.orderSKUId, substitution.orderSKUId) &&
        Objects.equals(this.substituteSKUId, substitution.substituteSKUId) &&
        Objects.equals(this.period, substitution.period) &&
        Objects.equals(this.type, substitution.type) &&
        Objects.equals(this.substitutionQuantity, substitution.substitutionQuantity) &&
        Objects.equals(this.customFields, substitution.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lobId, createDate, modifyDate, id, orderSKUId, substituteSKUId, period, type, substitutionQuantity, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Substitution {\n");
    
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderSKUId: ").append(toIndentedString(orderSKUId)).append("\n");
    sb.append("    substituteSKUId: ").append(toIndentedString(substituteSKUId)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    substitutionQuantity: ").append(toIndentedString(substitutionQuantity)).append("\n");
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

