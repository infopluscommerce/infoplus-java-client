package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class ManageScheduledPlans   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String description = null;
  private Integer scheduledplantypeid = null;
  private Integer planid = null;
  private Boolean active = false;
  private Integer user = null;
  private Boolean deleted = false;
  private Integer warehouseId = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
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
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduledplantypeid")
  public Integer getScheduledplantypeid() {
    return scheduledplantypeid;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("planid")
  public Integer getPlanid() {
    return planid;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public Integer getUser() {
    return user;
  }

  
  /**
   **/
  public ManageScheduledPlans deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  
  /**
   **/
  public ManageScheduledPlans warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  
  /**
   **/
  public ManageScheduledPlans customFields(Map<String, Object> customFields) {
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
    ManageScheduledPlans manageScheduledPlans = (ManageScheduledPlans) o;
    return Objects.equals(this.id, manageScheduledPlans.id) &&
        Objects.equals(this.createDate, manageScheduledPlans.createDate) &&
        Objects.equals(this.modifyDate, manageScheduledPlans.modifyDate) &&
        Objects.equals(this.description, manageScheduledPlans.description) &&
        Objects.equals(this.scheduledplantypeid, manageScheduledPlans.scheduledplantypeid) &&
        Objects.equals(this.planid, manageScheduledPlans.planid) &&
        Objects.equals(this.active, manageScheduledPlans.active) &&
        Objects.equals(this.user, manageScheduledPlans.user) &&
        Objects.equals(this.deleted, manageScheduledPlans.deleted) &&
        Objects.equals(this.warehouseId, manageScheduledPlans.warehouseId) &&
        Objects.equals(this.customFields, manageScheduledPlans.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, description, scheduledplantypeid, planid, active, user, deleted, warehouseId, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManageScheduledPlans {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scheduledplantypeid: ").append(toIndentedString(scheduledplantypeid)).append("\n");
    sb.append("    planid: ").append(toIndentedString(planid)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
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

