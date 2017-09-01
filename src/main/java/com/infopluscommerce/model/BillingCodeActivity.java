package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class BillingCodeActivity   {
  
  private Integer id = null;
  private Integer importedId = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Date date = null;
  private Integer quantity = null;
  private Integer lobId = null;
  private Integer userId = null;
  private String email = null;
  private Integer billingCodeTypeId = null;
  private String billingCodeTypeName = null;
  private String note = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("importedId")
  public Integer getImportedId() {
    return importedId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }

  
  /**
   **/
  public BillingCodeActivity quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  /**
   **/
  public BillingCodeActivity lobId(Integer lobId) {
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
  public BillingCodeActivity userId(Integer userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  
  /**
   **/
  public BillingCodeActivity email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  public BillingCodeActivity billingCodeTypeId(Integer billingCodeTypeId) {
    this.billingCodeTypeId = billingCodeTypeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("billingCodeTypeId")
  public Integer getBillingCodeTypeId() {
    return billingCodeTypeId;
  }
  public void setBillingCodeTypeId(Integer billingCodeTypeId) {
    this.billingCodeTypeId = billingCodeTypeId;
  }

  
  /**
   **/
  public BillingCodeActivity billingCodeTypeName(String billingCodeTypeName) {
    this.billingCodeTypeName = billingCodeTypeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billingCodeTypeName")
  public String getBillingCodeTypeName() {
    return billingCodeTypeName;
  }
  public void setBillingCodeTypeName(String billingCodeTypeName) {
    this.billingCodeTypeName = billingCodeTypeName;
  }

  
  /**
   **/
  public BillingCodeActivity note(String note) {
    this.note = note;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  
  /**
   **/
  public BillingCodeActivity customFields(Map<String, Object> customFields) {
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
    BillingCodeActivity billingCodeActivity = (BillingCodeActivity) o;
    return Objects.equals(this.id, billingCodeActivity.id) &&
        Objects.equals(this.importedId, billingCodeActivity.importedId) &&
        Objects.equals(this.createDate, billingCodeActivity.createDate) &&
        Objects.equals(this.modifyDate, billingCodeActivity.modifyDate) &&
        Objects.equals(this.date, billingCodeActivity.date) &&
        Objects.equals(this.quantity, billingCodeActivity.quantity) &&
        Objects.equals(this.lobId, billingCodeActivity.lobId) &&
        Objects.equals(this.userId, billingCodeActivity.userId) &&
        Objects.equals(this.email, billingCodeActivity.email) &&
        Objects.equals(this.billingCodeTypeId, billingCodeActivity.billingCodeTypeId) &&
        Objects.equals(this.billingCodeTypeName, billingCodeActivity.billingCodeTypeName) &&
        Objects.equals(this.note, billingCodeActivity.note) &&
        Objects.equals(this.customFields, billingCodeActivity.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, importedId, createDate, modifyDate, date, quantity, lobId, userId, email, billingCodeTypeId, billingCodeTypeName, note, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingCodeActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    importedId: ").append(toIndentedString(importedId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    billingCodeTypeId: ").append(toIndentedString(billingCodeTypeId)).append("\n");
    sb.append("    billingCodeTypeName: ").append(toIndentedString(billingCodeTypeName)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

