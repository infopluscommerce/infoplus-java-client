package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.infopluscommerce.model.ReceivingWorksheetLineItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class ReceivingWorksheet   {
  
  private Integer id = null;
  private Integer warehouseId = null;
  private Integer poNoId = null;
  private Integer lobId = null;
  private Integer vendorId = null;
  private String status = null;
  private String serviceLevel = null;
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
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("poNoId")
  public Integer getPoNoId() {
    return poNoId;
  }
  public void setPoNoId(Integer poNoId) {
    this.poNoId = poNoId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }
  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("vendorId")
  public Integer getVendorId() {
    return vendorId;
  }
  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("serviceLevel")
  public String getServiceLevel() {
    return serviceLevel;
  }
  public void setServiceLevel(String serviceLevel) {
    this.serviceLevel = serviceLevel;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createdBy")
  public Integer getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("worksheetName")
  public String getWorksheetName() {
    return worksheetName;
  }
  public void setWorksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("onTheDock")
  public Boolean getOnTheDock() {
    return onTheDock;
  }
  public void setOnTheDock(Boolean onTheDock) {
    this.onTheDock = onTheDock;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("autoCommit")
  public Boolean getAutoCommit() {
    return autoCommit;
  }
  public void setAutoCommit(Boolean autoCommit) {
    this.autoCommit = autoCommit;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lineItems")
  public List<ReceivingWorksheetLineItem> getLineItems() {
    return lineItems;
  }
  public void setLineItems(List<ReceivingWorksheetLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("workBatchId")
  public Integer getWorkBatchId() {
    return workBatchId;
  }
  public void setWorkBatchId(Integer workBatchId) {
    this.workBatchId = workBatchId;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceivingWorksheet receivingWorksheet = (ReceivingWorksheet) o;
    return Objects.equals(id, receivingWorksheet.id) &&
        Objects.equals(warehouseId, receivingWorksheet.warehouseId) &&
        Objects.equals(poNoId, receivingWorksheet.poNoId) &&
        Objects.equals(lobId, receivingWorksheet.lobId) &&
        Objects.equals(vendorId, receivingWorksheet.vendorId) &&
        Objects.equals(status, receivingWorksheet.status) &&
        Objects.equals(serviceLevel, receivingWorksheet.serviceLevel) &&
        Objects.equals(createdBy, receivingWorksheet.createdBy) &&
        Objects.equals(worksheetName, receivingWorksheet.worksheetName) &&
        Objects.equals(carrier, receivingWorksheet.carrier) &&
        Objects.equals(onTheDock, receivingWorksheet.onTheDock) &&
        Objects.equals(autoCommit, receivingWorksheet.autoCommit) &&
        Objects.equals(lineItems, receivingWorksheet.lineItems) &&
        Objects.equals(notes, receivingWorksheet.notes) &&
        Objects.equals(workBatchId, receivingWorksheet.workBatchId) &&
        Objects.equals(createDate, receivingWorksheet.createDate) &&
        Objects.equals(modifyDate, receivingWorksheet.modifyDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, poNoId, lobId, vendorId, status, serviceLevel, createdBy, worksheetName, carrier, onTheDock, autoCommit, lineItems, notes, workBatchId, createDate, modifyDate);
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

