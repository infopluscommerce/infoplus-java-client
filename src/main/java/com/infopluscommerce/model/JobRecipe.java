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
import com.infopluscommerce.model.JobRecipeInput;
import com.infopluscommerce.model.JobRecipeOutput;
import com.infopluscommerce.model.JobRecipeStep;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * JobRecipe
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-07T23:41:18.009-05:00")
public class JobRecipe {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("assemblyInstructions")
  private String assemblyInstructions = null;

  @SerializedName("inputs")
  private List<JobRecipeInput> inputs = null;

  @SerializedName("outputs")
  private List<JobRecipeOutput> outputs = null;

  @SerializedName("steps")
  private List<JobRecipeStep> steps = null;

  @SerializedName("fulfillmentPlanId")
  private Integer fulfillmentPlanId = null;

  @SerializedName("layout")
  private String layout = null;

  @SerializedName("trackAssemblies")
  private Boolean trackAssemblies = false;

  @SerializedName("trackSteps")
  private Boolean trackSteps = false;

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

  public JobRecipe warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

   /**
   * Get warehouseId
   * @return warehouseId
  **/
  @ApiModelProperty(value = "")
  public Integer getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  public JobRecipe lobId(Integer lobId) {
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

  public JobRecipe name(String name) {
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

  public JobRecipe assemblyInstructions(String assemblyInstructions) {
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

  public JobRecipe inputs(List<JobRecipeInput> inputs) {
    this.inputs = inputs;
    return this;
  }

  public JobRecipe addInputsItem(JobRecipeInput inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<JobRecipeInput>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @ApiModelProperty(value = "")
  public List<JobRecipeInput> getInputs() {
    return inputs;
  }

  public void setInputs(List<JobRecipeInput> inputs) {
    this.inputs = inputs;
  }

  public JobRecipe outputs(List<JobRecipeOutput> outputs) {
    this.outputs = outputs;
    return this;
  }

  public JobRecipe addOutputsItem(JobRecipeOutput outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<JobRecipeOutput>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @ApiModelProperty(value = "")
  public List<JobRecipeOutput> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<JobRecipeOutput> outputs) {
    this.outputs = outputs;
  }

  public JobRecipe steps(List<JobRecipeStep> steps) {
    this.steps = steps;
    return this;
  }

  public JobRecipe addStepsItem(JobRecipeStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<JobRecipeStep>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @ApiModelProperty(value = "")
  public List<JobRecipeStep> getSteps() {
    return steps;
  }

  public void setSteps(List<JobRecipeStep> steps) {
    this.steps = steps;
  }

  public JobRecipe fulfillmentPlanId(Integer fulfillmentPlanId) {
    this.fulfillmentPlanId = fulfillmentPlanId;
    return this;
  }

   /**
   * Get fulfillmentPlanId
   * @return fulfillmentPlanId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getFulfillmentPlanId() {
    return fulfillmentPlanId;
  }

  public void setFulfillmentPlanId(Integer fulfillmentPlanId) {
    this.fulfillmentPlanId = fulfillmentPlanId;
  }

  public JobRecipe layout(String layout) {
    this.layout = layout;
    return this;
  }

   /**
   * Get layout
   * @return layout
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLayout() {
    return layout;
  }

  public void setLayout(String layout) {
    this.layout = layout;
  }

  public JobRecipe trackAssemblies(Boolean trackAssemblies) {
    this.trackAssemblies = trackAssemblies;
    return this;
  }

   /**
   * Get trackAssemblies
   * @return trackAssemblies
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isTrackAssemblies() {
    return trackAssemblies;
  }

  public void setTrackAssemblies(Boolean trackAssemblies) {
    this.trackAssemblies = trackAssemblies;
  }

  public JobRecipe trackSteps(Boolean trackSteps) {
    this.trackSteps = trackSteps;
    return this;
  }

   /**
   * Get trackSteps
   * @return trackSteps
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isTrackSteps() {
    return trackSteps;
  }

  public void setTrackSteps(Boolean trackSteps) {
    this.trackSteps = trackSteps;
  }

  public JobRecipe customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public JobRecipe putCustomFieldsItem(String key, Object customFieldsItem) {
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
    JobRecipe jobRecipe = (JobRecipe) o;
    return Objects.equals(this.id, jobRecipe.id) &&
        Objects.equals(this.createDate, jobRecipe.createDate) &&
        Objects.equals(this.modifyDate, jobRecipe.modifyDate) &&
        Objects.equals(this.warehouseId, jobRecipe.warehouseId) &&
        Objects.equals(this.lobId, jobRecipe.lobId) &&
        Objects.equals(this.name, jobRecipe.name) &&
        Objects.equals(this.assemblyInstructions, jobRecipe.assemblyInstructions) &&
        Objects.equals(this.inputs, jobRecipe.inputs) &&
        Objects.equals(this.outputs, jobRecipe.outputs) &&
        Objects.equals(this.steps, jobRecipe.steps) &&
        Objects.equals(this.fulfillmentPlanId, jobRecipe.fulfillmentPlanId) &&
        Objects.equals(this.layout, jobRecipe.layout) &&
        Objects.equals(this.trackAssemblies, jobRecipe.trackAssemblies) &&
        Objects.equals(this.trackSteps, jobRecipe.trackSteps) &&
        Objects.equals(this.customFields, jobRecipe.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, warehouseId, lobId, name, assemblyInstructions, inputs, outputs, steps, fulfillmentPlanId, layout, trackAssemblies, trackSteps, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobRecipe {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    assemblyInstructions: ").append(toIndentedString(assemblyInstructions)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    fulfillmentPlanId: ").append(toIndentedString(fulfillmentPlanId)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    trackAssemblies: ").append(toIndentedString(trackAssemblies)).append("\n");
    sb.append("    trackSteps: ").append(toIndentedString(trackSteps)).append("\n");
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

