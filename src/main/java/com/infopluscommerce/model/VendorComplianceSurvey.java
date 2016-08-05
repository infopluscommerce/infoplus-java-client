package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-04T22:56:01.104-05:00")
public class VendorComplianceSurvey   {
  
  private Integer id = null;
  private Integer worksheetId = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String surveyQuestions = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public VendorComplianceSurvey worksheetId(Integer worksheetId) {
    this.worksheetId = worksheetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("worksheetId")
  public Integer getWorksheetId() {
    return worksheetId;
  }
  public void setWorksheetId(Integer worksheetId) {
    this.worksheetId = worksheetId;
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

  
  /**
   **/
  public VendorComplianceSurvey surveyQuestions(String surveyQuestions) {
    this.surveyQuestions = surveyQuestions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("surveyQuestions")
  public String getSurveyQuestions() {
    return surveyQuestions;
  }
  public void setSurveyQuestions(String surveyQuestions) {
    this.surveyQuestions = surveyQuestions;
  }

  
  /**
   **/
  public VendorComplianceSurvey customFields(Map<String, Object> customFields) {
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
    VendorComplianceSurvey vendorComplianceSurvey = (VendorComplianceSurvey) o;
    return Objects.equals(this.id, vendorComplianceSurvey.id) &&
        Objects.equals(this.worksheetId, vendorComplianceSurvey.worksheetId) &&
        Objects.equals(this.createDate, vendorComplianceSurvey.createDate) &&
        Objects.equals(this.modifyDate, vendorComplianceSurvey.modifyDate) &&
        Objects.equals(this.surveyQuestions, vendorComplianceSurvey.surveyQuestions) &&
        Objects.equals(this.customFields, vendorComplianceSurvey.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, worksheetId, createDate, modifyDate, surveyQuestions, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorComplianceSurvey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    worksheetId: ").append(toIndentedString(worksheetId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    surveyQuestions: ").append(toIndentedString(surveyQuestions)).append("\n");
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

