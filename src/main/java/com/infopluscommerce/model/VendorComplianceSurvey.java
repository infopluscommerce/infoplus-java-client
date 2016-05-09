package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class VendorComplianceSurvey   {
  
  private Integer id = null;
  private Integer worksheetId = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String surveyQuestions = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("worksheetId")
  public Integer getWorksheetId() {
    return worksheetId;
  }
  public void setWorksheetId(Integer worksheetId) {
    this.worksheetId = worksheetId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }
  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("surveyQuestions")
  public String getSurveyQuestions() {
    return surveyQuestions;
  }
  public void setSurveyQuestions(String surveyQuestions) {
    this.surveyQuestions = surveyQuestions;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorComplianceSurvey vendorComplianceSurvey = (VendorComplianceSurvey) o;
    return Objects.equals(id, vendorComplianceSurvey.id) &&
        Objects.equals(worksheetId, vendorComplianceSurvey.worksheetId) &&
        Objects.equals(createDate, vendorComplianceSurvey.createDate) &&
        Objects.equals(modifyDate, vendorComplianceSurvey.modifyDate) &&
        Objects.equals(surveyQuestions, vendorComplianceSurvey.surveyQuestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, worksheetId, createDate, modifyDate, surveyQuestions);
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
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

