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
import com.infopluscommerce.model.JobInput;
import com.infopluscommerce.model.JobOutput;
import com.infopluscommerce.model.JobStep;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Job
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T13:20:03.871-05:00")
public class Job {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("sourceJobRecipeId")
  private Integer sourceJobRecipeId = null;

  @SerializedName("assemblyQuantity")
  private Integer assemblyQuantity = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("orderNoId")
  private BigDecimal orderNoId = null;

  @SerializedName("poNoId")
  private Integer poNoId = null;

  @SerializedName("workBatchId")
  private Integer workBatchId = null;

  @SerializedName("layout")
  private String layout = null;

  @SerializedName("trackAssemblies")
  private Boolean trackAssemblies = false;

  @SerializedName("trackSteps")
  private Boolean trackSteps = false;

  @SerializedName("jobNo")
  private String jobNo = null;

  @SerializedName("assemblyInstructions")
  private String assemblyInstructions = null;

  @SerializedName("inputs")
  private List<JobInput> inputs = null;

  @SerializedName("outputs")
  private List<JobOutput> outputs = null;

  @SerializedName("steps")
  private List<JobStep> steps = null;

  @SerializedName("fulfillmentPlanId")
  private Integer fulfillmentPlanId = null;

  @SerializedName("totalPicksPutbacks")
  private Integer totalPicksPutbacks = null;

  @SerializedName("completedPicksPutbacks")
  private Integer completedPicksPutbacks = null;

  @SerializedName("totalAssemblies")
  private Integer totalAssemblies = null;

  @SerializedName("completedAssemblies")
  private Integer completedAssemblies = null;

  @SerializedName("totalSteps")
  private Integer totalSteps = null;

  @SerializedName("completedSteps")
  private Integer completedSteps = null;

  @SerializedName("totalReceipts")
  private Integer totalReceipts = null;

  @SerializedName("completedReceipts")
  private Integer completedReceipts = null;

  @SerializedName("totalToDo")
  private Integer totalToDo = null;

  @SerializedName("completedToDo")
  private Integer completedToDo = null;

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

  public Job sourceJobRecipeId(Integer sourceJobRecipeId) {
    this.sourceJobRecipeId = sourceJobRecipeId;
    return this;
  }

   /**
   * Get sourceJobRecipeId
   * @return sourceJobRecipeId
  **/
  @ApiModelProperty(value = "")
  public Integer getSourceJobRecipeId() {
    return sourceJobRecipeId;
  }

  public void setSourceJobRecipeId(Integer sourceJobRecipeId) {
    this.sourceJobRecipeId = sourceJobRecipeId;
  }

  public Job assemblyQuantity(Integer assemblyQuantity) {
    this.assemblyQuantity = assemblyQuantity;
    return this;
  }

   /**
   * Get assemblyQuantity
   * @return assemblyQuantity
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAssemblyQuantity() {
    return assemblyQuantity;
  }

  public void setAssemblyQuantity(Integer assemblyQuantity) {
    this.assemblyQuantity = assemblyQuantity;
  }

  public Job warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

   /**
   * Get warehouseId
   * @return warehouseId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  public Job lobId(Integer lobId) {
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

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

   /**
   * Get orderNoId
   * @return orderNoId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOrderNoId() {
    return orderNoId;
  }

   /**
   * Get poNoId
   * @return poNoId
  **/
  @ApiModelProperty(value = "")
  public Integer getPoNoId() {
    return poNoId;
  }

   /**
   * Get workBatchId
   * @return workBatchId
  **/
  @ApiModelProperty(value = "")
  public Integer getWorkBatchId() {
    return workBatchId;
  }

  public Job layout(String layout) {
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

  public Job trackAssemblies(Boolean trackAssemblies) {
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

  public Job trackSteps(Boolean trackSteps) {
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

  public Job jobNo(String jobNo) {
    this.jobNo = jobNo;
    return this;
  }

   /**
   * Get jobNo
   * @return jobNo
  **/
  @ApiModelProperty(value = "")
  public String getJobNo() {
    return jobNo;
  }

  public void setJobNo(String jobNo) {
    this.jobNo = jobNo;
  }

  public Job assemblyInstructions(String assemblyInstructions) {
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

  public Job inputs(List<JobInput> inputs) {
    this.inputs = inputs;
    return this;
  }

  public Job addInputsItem(JobInput inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<JobInput>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @ApiModelProperty(value = "")
  public List<JobInput> getInputs() {
    return inputs;
  }

  public void setInputs(List<JobInput> inputs) {
    this.inputs = inputs;
  }

  public Job outputs(List<JobOutput> outputs) {
    this.outputs = outputs;
    return this;
  }

  public Job addOutputsItem(JobOutput outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<JobOutput>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @ApiModelProperty(value = "")
  public List<JobOutput> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<JobOutput> outputs) {
    this.outputs = outputs;
  }

  public Job steps(List<JobStep> steps) {
    this.steps = steps;
    return this;
  }

  public Job addStepsItem(JobStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<JobStep>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @ApiModelProperty(value = "")
  public List<JobStep> getSteps() {
    return steps;
  }

  public void setSteps(List<JobStep> steps) {
    this.steps = steps;
  }

  public Job fulfillmentPlanId(Integer fulfillmentPlanId) {
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

   /**
   * Get totalPicksPutbacks
   * @return totalPicksPutbacks
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalPicksPutbacks() {
    return totalPicksPutbacks;
  }

   /**
   * Get completedPicksPutbacks
   * @return completedPicksPutbacks
  **/
  @ApiModelProperty(value = "")
  public Integer getCompletedPicksPutbacks() {
    return completedPicksPutbacks;
  }

   /**
   * Get totalAssemblies
   * @return totalAssemblies
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalAssemblies() {
    return totalAssemblies;
  }

   /**
   * Get completedAssemblies
   * @return completedAssemblies
  **/
  @ApiModelProperty(value = "")
  public Integer getCompletedAssemblies() {
    return completedAssemblies;
  }

   /**
   * Get totalSteps
   * @return totalSteps
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalSteps() {
    return totalSteps;
  }

   /**
   * Get completedSteps
   * @return completedSteps
  **/
  @ApiModelProperty(value = "")
  public Integer getCompletedSteps() {
    return completedSteps;
  }

   /**
   * Get totalReceipts
   * @return totalReceipts
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalReceipts() {
    return totalReceipts;
  }

   /**
   * Get completedReceipts
   * @return completedReceipts
  **/
  @ApiModelProperty(value = "")
  public Integer getCompletedReceipts() {
    return completedReceipts;
  }

   /**
   * Get totalToDo
   * @return totalToDo
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalToDo() {
    return totalToDo;
  }

   /**
   * Get completedToDo
   * @return completedToDo
  **/
  @ApiModelProperty(value = "")
  public Integer getCompletedToDo() {
    return completedToDo;
  }

  public Job customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Job putCustomFieldsItem(String key, Object customFieldsItem) {
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
    Job job = (Job) o;
    return Objects.equals(this.id, job.id) &&
        Objects.equals(this.createDate, job.createDate) &&
        Objects.equals(this.modifyDate, job.modifyDate) &&
        Objects.equals(this.sourceJobRecipeId, job.sourceJobRecipeId) &&
        Objects.equals(this.assemblyQuantity, job.assemblyQuantity) &&
        Objects.equals(this.warehouseId, job.warehouseId) &&
        Objects.equals(this.lobId, job.lobId) &&
        Objects.equals(this.status, job.status) &&
        Objects.equals(this.orderNoId, job.orderNoId) &&
        Objects.equals(this.poNoId, job.poNoId) &&
        Objects.equals(this.workBatchId, job.workBatchId) &&
        Objects.equals(this.layout, job.layout) &&
        Objects.equals(this.trackAssemblies, job.trackAssemblies) &&
        Objects.equals(this.trackSteps, job.trackSteps) &&
        Objects.equals(this.jobNo, job.jobNo) &&
        Objects.equals(this.assemblyInstructions, job.assemblyInstructions) &&
        Objects.equals(this.inputs, job.inputs) &&
        Objects.equals(this.outputs, job.outputs) &&
        Objects.equals(this.steps, job.steps) &&
        Objects.equals(this.fulfillmentPlanId, job.fulfillmentPlanId) &&
        Objects.equals(this.totalPicksPutbacks, job.totalPicksPutbacks) &&
        Objects.equals(this.completedPicksPutbacks, job.completedPicksPutbacks) &&
        Objects.equals(this.totalAssemblies, job.totalAssemblies) &&
        Objects.equals(this.completedAssemblies, job.completedAssemblies) &&
        Objects.equals(this.totalSteps, job.totalSteps) &&
        Objects.equals(this.completedSteps, job.completedSteps) &&
        Objects.equals(this.totalReceipts, job.totalReceipts) &&
        Objects.equals(this.completedReceipts, job.completedReceipts) &&
        Objects.equals(this.totalToDo, job.totalToDo) &&
        Objects.equals(this.completedToDo, job.completedToDo) &&
        Objects.equals(this.customFields, job.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, sourceJobRecipeId, assemblyQuantity, warehouseId, lobId, status, orderNoId, poNoId, workBatchId, layout, trackAssemblies, trackSteps, jobNo, assemblyInstructions, inputs, outputs, steps, fulfillmentPlanId, totalPicksPutbacks, completedPicksPutbacks, totalAssemblies, completedAssemblies, totalSteps, completedSteps, totalReceipts, completedReceipts, totalToDo, completedToDo, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    sourceJobRecipeId: ").append(toIndentedString(sourceJobRecipeId)).append("\n");
    sb.append("    assemblyQuantity: ").append(toIndentedString(assemblyQuantity)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    orderNoId: ").append(toIndentedString(orderNoId)).append("\n");
    sb.append("    poNoId: ").append(toIndentedString(poNoId)).append("\n");
    sb.append("    workBatchId: ").append(toIndentedString(workBatchId)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    trackAssemblies: ").append(toIndentedString(trackAssemblies)).append("\n");
    sb.append("    trackSteps: ").append(toIndentedString(trackSteps)).append("\n");
    sb.append("    jobNo: ").append(toIndentedString(jobNo)).append("\n");
    sb.append("    assemblyInstructions: ").append(toIndentedString(assemblyInstructions)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    fulfillmentPlanId: ").append(toIndentedString(fulfillmentPlanId)).append("\n");
    sb.append("    totalPicksPutbacks: ").append(toIndentedString(totalPicksPutbacks)).append("\n");
    sb.append("    completedPicksPutbacks: ").append(toIndentedString(completedPicksPutbacks)).append("\n");
    sb.append("    totalAssemblies: ").append(toIndentedString(totalAssemblies)).append("\n");
    sb.append("    completedAssemblies: ").append(toIndentedString(completedAssemblies)).append("\n");
    sb.append("    totalSteps: ").append(toIndentedString(totalSteps)).append("\n");
    sb.append("    completedSteps: ").append(toIndentedString(completedSteps)).append("\n");
    sb.append("    totalReceipts: ").append(toIndentedString(totalReceipts)).append("\n");
    sb.append("    completedReceipts: ").append(toIndentedString(completedReceipts)).append("\n");
    sb.append("    totalToDo: ").append(toIndentedString(totalToDo)).append("\n");
    sb.append("    completedToDo: ").append(toIndentedString(completedToDo)).append("\n");
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

