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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JobStep
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-02T22:06:08.200-06:00")
public class JobStep {
  @SerializedName("sequenceNo")
  private Integer sequenceNo = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("assemblyInstructions")
  private String assemblyInstructions = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  public JobStep sequenceNo(Integer sequenceNo) {
    this.sequenceNo = sequenceNo;
    return this;
  }

   /**
   * Get sequenceNo
   * @return sequenceNo
  **/
  @ApiModelProperty(value = "")
  public Integer getSequenceNo() {
    return sequenceNo;
  }

  public void setSequenceNo(Integer sequenceNo) {
    this.sequenceNo = sequenceNo;
  }

  public JobStep name(String name) {
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

  public JobStep assemblyInstructions(String assemblyInstructions) {
    this.assemblyInstructions = assemblyInstructions;
    return this;
  }

   /**
   * Get assemblyInstructions
   * @return assemblyInstructions
  **/
  @ApiModelProperty(value = "")
  public String getAssemblyInstructions() {
    return assemblyInstructions;
  }

  public void setAssemblyInstructions(String assemblyInstructions) {
    this.assemblyInstructions = assemblyInstructions;
  }

  public JobStep customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public JobStep putCustomFieldsItem(String key, Object customFieldsItem) {
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
    JobStep jobStep = (JobStep) o;
    return Objects.equals(this.sequenceNo, jobStep.sequenceNo) &&
        Objects.equals(this.name, jobStep.name) &&
        Objects.equals(this.assemblyInstructions, jobStep.assemblyInstructions) &&
        Objects.equals(this.customFields, jobStep.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequenceNo, name, assemblyInstructions, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStep {\n");
    
    sb.append("    sequenceNo: ").append(toIndentedString(sequenceNo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    assemblyInstructions: ").append(toIndentedString(assemblyInstructions)).append("\n");
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

