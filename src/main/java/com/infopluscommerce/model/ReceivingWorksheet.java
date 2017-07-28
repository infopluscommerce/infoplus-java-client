package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.infopluscommerce.model.ReceivingWorksheetLineItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class ReceivingWorksheet   {
  
  private Integer id = null;
  private Integer warehouseId = null;
  private Integer poNoId = null;
  private Integer lobId = null;
  private Integer vendorId = null;
  private String status = null;
  private String serviceLevel = null;
  private Integer receivingProcessId = null;
  private Date dockDate = null;
  private Integer createdBy = null;
  private String worksheetName = null;
  private String carrier = null;
  private Boolean onTheDock = false;
  private Boolean autoCommit = false;
  private List<ReceivingWorksheetLineItem> lineItems = new ArrayList<ReceivingWorksheetLineItem>();
  private String notes = null;
  private Integer workBatchId = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public ReceivingWorksheet warehouseId(Integer warehouseId) {
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
  public ReceivingWorksheet poNoId(Integer poNoId) {
    this.poNoId = poNoId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("poNoId")
  public Integer getPoNoId() {
    return poNoId;
  }
  public void setPoNoId(Integer poNoId) {
    this.poNoId = poNoId;
  }

  
  /**
   **/
  public ReceivingWorksheet lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }
  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  
  /**
   **/
  public ReceivingWorksheet vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorId")
  public Integer getVendorId() {
    return vendorId;
  }
  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  
  /**
   **/
  public ReceivingWorksheet serviceLevel(String serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("serviceLevel")
  public String getServiceLevel() {
    return serviceLevel;
  }
  public void setServiceLevel(String serviceLevel) {
    this.serviceLevel = serviceLevel;
  }

  
  /**
   **/
  public ReceivingWorksheet receivingProcessId(Integer receivingProcessId) {
    this.receivingProcessId = receivingProcessId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receivingProcessId")
  public Integer getReceivingProcessId() {
    return receivingProcessId;
  }
  public void setReceivingProcessId(Integer receivingProcessId) {
    this.receivingProcessId = receivingProcessId;
  }

  
  /**
   **/
  public ReceivingWorksheet dockDate(Date dockDate) {
    this.dockDate = dockDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dockDate")
  public Date getDockDate() {
    return dockDate;
  }
  public void setDockDate(Date dockDate) {
    this.dockDate = dockDate;
  }

  
  /**
   **/
  public ReceivingWorksheet createdBy(Integer createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public Integer getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   **/
  public ReceivingWorksheet worksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("worksheetName")
  public String getWorksheetName() {
    return worksheetName;
  }
  public void setWorksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
  }

  
  /**
   **/
  public ReceivingWorksheet carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  
  /**
   **/
  public ReceivingWorksheet onTheDock(Boolean onTheDock) {
    this.onTheDock = onTheDock;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("onTheDock")
  public Boolean getOnTheDock() {
    return onTheDock;
  }
  public void setOnTheDock(Boolean onTheDock) {
    this.onTheDock = onTheDock;
  }

  
  /**
   **/
  public ReceivingWorksheet autoCommit(Boolean autoCommit) {
    this.autoCommit = autoCommit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("autoCommit")
  public Boolean getAutoCommit() {
    return autoCommit;
  }
  public void setAutoCommit(Boolean autoCommit) {
    this.autoCommit = autoCommit;
  }

  
  /**
   **/
  public ReceivingWorksheet lineItems(List<ReceivingWorksheetLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lineItems")
  public List<ReceivingWorksheetLineItem> getLineItems() {
    return lineItems;
  }
  public void setLineItems(List<ReceivingWorksheetLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  
  /**
   **/
  public ReceivingWorksheet notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workBatchId")
  public Integer getWorkBatchId() {
    return workBatchId;
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
  public ReceivingWorksheet customFields(Map<String, Object> customFields) {
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
    ReceivingWorksheet receivingWorksheet = (ReceivingWorksheet) o;
    return Objects.equals(this.id, receivingWorksheet.id) &&
        Objects.equals(this.warehouseId, receivingWorksheet.warehouseId) &&
        Objects.equals(this.poNoId, receivingWorksheet.poNoId) &&
        Objects.equals(this.lobId, receivingWorksheet.lobId) &&
        Objects.equals(this.vendorId, receivingWorksheet.vendorId) &&
        Objects.equals(this.status, receivingWorksheet.status) &&
        Objects.equals(this.serviceLevel, receivingWorksheet.serviceLevel) &&
        Objects.equals(this.receivingProcessId, receivingWorksheet.receivingProcessId) &&
        Objects.equals(this.dockDate, receivingWorksheet.dockDate) &&
        Objects.equals(this.createdBy, receivingWorksheet.createdBy) &&
        Objects.equals(this.worksheetName, receivingWorksheet.worksheetName) &&
        Objects.equals(this.carrier, receivingWorksheet.carrier) &&
        Objects.equals(this.onTheDock, receivingWorksheet.onTheDock) &&
        Objects.equals(this.autoCommit, receivingWorksheet.autoCommit) &&
        Objects.equals(this.lineItems, receivingWorksheet.lineItems) &&
        Objects.equals(this.notes, receivingWorksheet.notes) &&
        Objects.equals(this.workBatchId, receivingWorksheet.workBatchId) &&
        Objects.equals(this.createDate, receivingWorksheet.createDate) &&
        Objects.equals(this.modifyDate, receivingWorksheet.modifyDate) &&
        Objects.equals(this.customFields, receivingWorksheet.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, poNoId, lobId, vendorId, status, serviceLevel, receivingProcessId, dockDate, createdBy, worksheetName, carrier, onTheDock, autoCommit, lineItems, notes, workBatchId, createDate, modifyDate, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivingWorksheet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    poNoId: ").append(toIndentedString(poNoId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    receivingProcessId: ").append(toIndentedString(receivingProcessId)).append("\n");
    sb.append("    dockDate: ").append(toIndentedString(dockDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    worksheetName: ").append(toIndentedString(worksheetName)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    onTheDock: ").append(toIndentedString(onTheDock)).append("\n");
    sb.append("    autoCommit: ").append(toIndentedString(autoCommit)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    workBatchId: ").append(toIndentedString(workBatchId)).append("\n");
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

