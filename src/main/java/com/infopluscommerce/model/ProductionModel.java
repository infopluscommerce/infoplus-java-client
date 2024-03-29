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
import org.threeten.bp.OffsetDateTime;

/**
 * ProductionModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-16T13:04:33.234-06:00")
public class ProductionModel {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("validationFunction")
  private String validationFunction = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

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

  public ProductionModel name(String name) {
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

  public ProductionModel validationFunction(String validationFunction) {
    this.validationFunction = validationFunction;
    return this;
  }

   /**
   * Get validationFunction
   * @return validationFunction
  **/
  @ApiModelProperty(value = "")
  public String getValidationFunction() {
    return validationFunction;
  }

  public void setValidationFunction(String validationFunction) {
    this.validationFunction = validationFunction;
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

  public ProductionModel customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ProductionModel putCustomFieldsItem(String key, Object customFieldsItem) {
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
    ProductionModel productionModel = (ProductionModel) o;
    return Objects.equals(this.id, productionModel.id) &&
        Objects.equals(this.name, productionModel.name) &&
        Objects.equals(this.validationFunction, productionModel.validationFunction) &&
        Objects.equals(this.createDate, productionModel.createDate) &&
        Objects.equals(this.modifyDate, productionModel.modifyDate) &&
        Objects.equals(this.customFields, productionModel.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, validationFunction, createDate, modifyDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductionModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validationFunction: ").append(toIndentedString(validationFunction)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
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

