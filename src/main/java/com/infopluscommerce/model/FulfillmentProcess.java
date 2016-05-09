package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class FulfillmentProcess   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer processNo = null;
  private Integer workBatchId = null;
  private Integer warehouseId = null;
  private Integer allocationPlanId = null;
  private String status = null;
  private Integer orderSmartFilterId = null;
  private Integer locationSmartFilterId = null;
  private Integer orderLimit = null;
  private Integer numberOfOrders = null;
  private Integer numberOfLines = null;
  private Integer numberOfSKUs = null;
  private Integer completedPicks = null;
  private Integer totalPicks = null;
  private Integer shippedCasebreaks = null;
  private Integer totalCasebreaksToShip = null;
  private Integer shippedOrders = null;
  private Integer totalOrdersToShip = null;
  private Integer completedToDo = null;
  private Integer totalToDo = null;
  private Boolean createPickWork = false;
  private String pickingRule = null;
  private String layoutRule = null;
  private String pickSortRule = null;
  private Integer firstPickPosition = null;
  private String pickListFormat = null;
  private String pickListLayout = null;
  private String pickListGroup = null;
  private String pickListSort = null;
  private String pickSummaryFormat = null;
  private String pickSummaryLayout = null;
  private String pickSummarySort = null;
  private Boolean createPickSummary = false;
  private Boolean createPickList = false;
  private Boolean preGenerateParcelLabels = false;
  private Date shipDate = null;
  private Boolean autoShipCasebreakCartons = false;
  private Boolean cartonizeOrders = false;
  private Boolean createPackingSlip = false;
  private Integer overridePackingSlipTemplateId = null;
  private Boolean createOrderAssemblyGuide = false;

  
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
  @JsonProperty("processNo")
  public Integer getProcessNo() {
    return processNo;
  }
  public void setProcessNo(Integer processNo) {
    this.processNo = processNo;
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("allocationPlanId")
  public Integer getAllocationPlanId() {
    return allocationPlanId;
  }
  public void setAllocationPlanId(Integer allocationPlanId) {
    this.allocationPlanId = allocationPlanId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderSmartFilterId")
  public Integer getOrderSmartFilterId() {
    return orderSmartFilterId;
  }
  public void setOrderSmartFilterId(Integer orderSmartFilterId) {
    this.orderSmartFilterId = orderSmartFilterId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationSmartFilterId")
  public Integer getLocationSmartFilterId() {
    return locationSmartFilterId;
  }
  public void setLocationSmartFilterId(Integer locationSmartFilterId) {
    this.locationSmartFilterId = locationSmartFilterId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderLimit")
  public Integer getOrderLimit() {
    return orderLimit;
  }
  public void setOrderLimit(Integer orderLimit) {
    this.orderLimit = orderLimit;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numberOfOrders")
  public Integer getNumberOfOrders() {
    return numberOfOrders;
  }
  public void setNumberOfOrders(Integer numberOfOrders) {
    this.numberOfOrders = numberOfOrders;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numberOfLines")
  public Integer getNumberOfLines() {
    return numberOfLines;
  }
  public void setNumberOfLines(Integer numberOfLines) {
    this.numberOfLines = numberOfLines;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numberOfSKUs")
  public Integer getNumberOfSKUs() {
    return numberOfSKUs;
  }
  public void setNumberOfSKUs(Integer numberOfSKUs) {
    this.numberOfSKUs = numberOfSKUs;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("completedPicks")
  public Integer getCompletedPicks() {
    return completedPicks;
  }
  public void setCompletedPicks(Integer completedPicks) {
    this.completedPicks = completedPicks;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalPicks")
  public Integer getTotalPicks() {
    return totalPicks;
  }
  public void setTotalPicks(Integer totalPicks) {
    this.totalPicks = totalPicks;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shippedCasebreaks")
  public Integer getShippedCasebreaks() {
    return shippedCasebreaks;
  }
  public void setShippedCasebreaks(Integer shippedCasebreaks) {
    this.shippedCasebreaks = shippedCasebreaks;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalCasebreaksToShip")
  public Integer getTotalCasebreaksToShip() {
    return totalCasebreaksToShip;
  }
  public void setTotalCasebreaksToShip(Integer totalCasebreaksToShip) {
    this.totalCasebreaksToShip = totalCasebreaksToShip;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shippedOrders")
  public Integer getShippedOrders() {
    return shippedOrders;
  }
  public void setShippedOrders(Integer shippedOrders) {
    this.shippedOrders = shippedOrders;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalOrdersToShip")
  public Integer getTotalOrdersToShip() {
    return totalOrdersToShip;
  }
  public void setTotalOrdersToShip(Integer totalOrdersToShip) {
    this.totalOrdersToShip = totalOrdersToShip;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("completedToDo")
  public Integer getCompletedToDo() {
    return completedToDo;
  }
  public void setCompletedToDo(Integer completedToDo) {
    this.completedToDo = completedToDo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalToDo")
  public Integer getTotalToDo() {
    return totalToDo;
  }
  public void setTotalToDo(Integer totalToDo) {
    this.totalToDo = totalToDo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createPickWork")
  public Boolean getCreatePickWork() {
    return createPickWork;
  }
  public void setCreatePickWork(Boolean createPickWork) {
    this.createPickWork = createPickWork;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickingRule")
  public String getPickingRule() {
    return pickingRule;
  }
  public void setPickingRule(String pickingRule) {
    this.pickingRule = pickingRule;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("layoutRule")
  public String getLayoutRule() {
    return layoutRule;
  }
  public void setLayoutRule(String layoutRule) {
    this.layoutRule = layoutRule;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickSortRule")
  public String getPickSortRule() {
    return pickSortRule;
  }
  public void setPickSortRule(String pickSortRule) {
    this.pickSortRule = pickSortRule;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("firstPickPosition")
  public Integer getFirstPickPosition() {
    return firstPickPosition;
  }
  public void setFirstPickPosition(Integer firstPickPosition) {
    this.firstPickPosition = firstPickPosition;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickListFormat")
  public String getPickListFormat() {
    return pickListFormat;
  }
  public void setPickListFormat(String pickListFormat) {
    this.pickListFormat = pickListFormat;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickListLayout")
  public String getPickListLayout() {
    return pickListLayout;
  }
  public void setPickListLayout(String pickListLayout) {
    this.pickListLayout = pickListLayout;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickListGroup")
  public String getPickListGroup() {
    return pickListGroup;
  }
  public void setPickListGroup(String pickListGroup) {
    this.pickListGroup = pickListGroup;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickListSort")
  public String getPickListSort() {
    return pickListSort;
  }
  public void setPickListSort(String pickListSort) {
    this.pickListSort = pickListSort;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickSummaryFormat")
  public String getPickSummaryFormat() {
    return pickSummaryFormat;
  }
  public void setPickSummaryFormat(String pickSummaryFormat) {
    this.pickSummaryFormat = pickSummaryFormat;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickSummaryLayout")
  public String getPickSummaryLayout() {
    return pickSummaryLayout;
  }
  public void setPickSummaryLayout(String pickSummaryLayout) {
    this.pickSummaryLayout = pickSummaryLayout;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickSummarySort")
  public String getPickSummarySort() {
    return pickSummarySort;
  }
  public void setPickSummarySort(String pickSummarySort) {
    this.pickSummarySort = pickSummarySort;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createPickSummary")
  public Boolean getCreatePickSummary() {
    return createPickSummary;
  }
  public void setCreatePickSummary(Boolean createPickSummary) {
    this.createPickSummary = createPickSummary;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createPickList")
  public Boolean getCreatePickList() {
    return createPickList;
  }
  public void setCreatePickList(Boolean createPickList) {
    this.createPickList = createPickList;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preGenerateParcelLabels")
  public Boolean getPreGenerateParcelLabels() {
    return preGenerateParcelLabels;
  }
  public void setPreGenerateParcelLabels(Boolean preGenerateParcelLabels) {
    this.preGenerateParcelLabels = preGenerateParcelLabels;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipDate")
  public Date getShipDate() {
    return shipDate;
  }
  public void setShipDate(Date shipDate) {
    this.shipDate = shipDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("autoShipCasebreakCartons")
  public Boolean getAutoShipCasebreakCartons() {
    return autoShipCasebreakCartons;
  }
  public void setAutoShipCasebreakCartons(Boolean autoShipCasebreakCartons) {
    this.autoShipCasebreakCartons = autoShipCasebreakCartons;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cartonizeOrders")
  public Boolean getCartonizeOrders() {
    return cartonizeOrders;
  }
  public void setCartonizeOrders(Boolean cartonizeOrders) {
    this.cartonizeOrders = cartonizeOrders;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createPackingSlip")
  public Boolean getCreatePackingSlip() {
    return createPackingSlip;
  }
  public void setCreatePackingSlip(Boolean createPackingSlip) {
    this.createPackingSlip = createPackingSlip;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("overridePackingSlipTemplateId")
  public Integer getOverridePackingSlipTemplateId() {
    return overridePackingSlipTemplateId;
  }
  public void setOverridePackingSlipTemplateId(Integer overridePackingSlipTemplateId) {
    this.overridePackingSlipTemplateId = overridePackingSlipTemplateId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createOrderAssemblyGuide")
  public Boolean getCreateOrderAssemblyGuide() {
    return createOrderAssemblyGuide;
  }
  public void setCreateOrderAssemblyGuide(Boolean createOrderAssemblyGuide) {
    this.createOrderAssemblyGuide = createOrderAssemblyGuide;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentProcess fulfillmentProcess = (FulfillmentProcess) o;
    return Objects.equals(id, fulfillmentProcess.id) &&
        Objects.equals(createDate, fulfillmentProcess.createDate) &&
        Objects.equals(modifyDate, fulfillmentProcess.modifyDate) &&
        Objects.equals(processNo, fulfillmentProcess.processNo) &&
        Objects.equals(workBatchId, fulfillmentProcess.workBatchId) &&
        Objects.equals(warehouseId, fulfillmentProcess.warehouseId) &&
        Objects.equals(allocationPlanId, fulfillmentProcess.allocationPlanId) &&
        Objects.equals(status, fulfillmentProcess.status) &&
        Objects.equals(orderSmartFilterId, fulfillmentProcess.orderSmartFilterId) &&
        Objects.equals(locationSmartFilterId, fulfillmentProcess.locationSmartFilterId) &&
        Objects.equals(orderLimit, fulfillmentProcess.orderLimit) &&
        Objects.equals(numberOfOrders, fulfillmentProcess.numberOfOrders) &&
        Objects.equals(numberOfLines, fulfillmentProcess.numberOfLines) &&
        Objects.equals(numberOfSKUs, fulfillmentProcess.numberOfSKUs) &&
        Objects.equals(completedPicks, fulfillmentProcess.completedPicks) &&
        Objects.equals(totalPicks, fulfillmentProcess.totalPicks) &&
        Objects.equals(shippedCasebreaks, fulfillmentProcess.shippedCasebreaks) &&
        Objects.equals(totalCasebreaksToShip, fulfillmentProcess.totalCasebreaksToShip) &&
        Objects.equals(shippedOrders, fulfillmentProcess.shippedOrders) &&
        Objects.equals(totalOrdersToShip, fulfillmentProcess.totalOrdersToShip) &&
        Objects.equals(completedToDo, fulfillmentProcess.completedToDo) &&
        Objects.equals(totalToDo, fulfillmentProcess.totalToDo) &&
        Objects.equals(createPickWork, fulfillmentProcess.createPickWork) &&
        Objects.equals(pickingRule, fulfillmentProcess.pickingRule) &&
        Objects.equals(layoutRule, fulfillmentProcess.layoutRule) &&
        Objects.equals(pickSortRule, fulfillmentProcess.pickSortRule) &&
        Objects.equals(firstPickPosition, fulfillmentProcess.firstPickPosition) &&
        Objects.equals(pickListFormat, fulfillmentProcess.pickListFormat) &&
        Objects.equals(pickListLayout, fulfillmentProcess.pickListLayout) &&
        Objects.equals(pickListGroup, fulfillmentProcess.pickListGroup) &&
        Objects.equals(pickListSort, fulfillmentProcess.pickListSort) &&
        Objects.equals(pickSummaryFormat, fulfillmentProcess.pickSummaryFormat) &&
        Objects.equals(pickSummaryLayout, fulfillmentProcess.pickSummaryLayout) &&
        Objects.equals(pickSummarySort, fulfillmentProcess.pickSummarySort) &&
        Objects.equals(createPickSummary, fulfillmentProcess.createPickSummary) &&
        Objects.equals(createPickList, fulfillmentProcess.createPickList) &&
        Objects.equals(preGenerateParcelLabels, fulfillmentProcess.preGenerateParcelLabels) &&
        Objects.equals(shipDate, fulfillmentProcess.shipDate) &&
        Objects.equals(autoShipCasebreakCartons, fulfillmentProcess.autoShipCasebreakCartons) &&
        Objects.equals(cartonizeOrders, fulfillmentProcess.cartonizeOrders) &&
        Objects.equals(createPackingSlip, fulfillmentProcess.createPackingSlip) &&
        Objects.equals(overridePackingSlipTemplateId, fulfillmentProcess.overridePackingSlipTemplateId) &&
        Objects.equals(createOrderAssemblyGuide, fulfillmentProcess.createOrderAssemblyGuide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, processNo, workBatchId, warehouseId, allocationPlanId, status, orderSmartFilterId, locationSmartFilterId, orderLimit, numberOfOrders, numberOfLines, numberOfSKUs, completedPicks, totalPicks, shippedCasebreaks, totalCasebreaksToShip, shippedOrders, totalOrdersToShip, completedToDo, totalToDo, createPickWork, pickingRule, layoutRule, pickSortRule, firstPickPosition, pickListFormat, pickListLayout, pickListGroup, pickListSort, pickSummaryFormat, pickSummaryLayout, pickSummarySort, createPickSummary, createPickList, preGenerateParcelLabels, shipDate, autoShipCasebreakCartons, cartonizeOrders, createPackingSlip, overridePackingSlipTemplateId, createOrderAssemblyGuide);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentProcess {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    processNo: ").append(toIndentedString(processNo)).append("\n");
    sb.append("    workBatchId: ").append(toIndentedString(workBatchId)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    allocationPlanId: ").append(toIndentedString(allocationPlanId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    orderSmartFilterId: ").append(toIndentedString(orderSmartFilterId)).append("\n");
    sb.append("    locationSmartFilterId: ").append(toIndentedString(locationSmartFilterId)).append("\n");
    sb.append("    orderLimit: ").append(toIndentedString(orderLimit)).append("\n");
    sb.append("    numberOfOrders: ").append(toIndentedString(numberOfOrders)).append("\n");
    sb.append("    numberOfLines: ").append(toIndentedString(numberOfLines)).append("\n");
    sb.append("    numberOfSKUs: ").append(toIndentedString(numberOfSKUs)).append("\n");
    sb.append("    completedPicks: ").append(toIndentedString(completedPicks)).append("\n");
    sb.append("    totalPicks: ").append(toIndentedString(totalPicks)).append("\n");
    sb.append("    shippedCasebreaks: ").append(toIndentedString(shippedCasebreaks)).append("\n");
    sb.append("    totalCasebreaksToShip: ").append(toIndentedString(totalCasebreaksToShip)).append("\n");
    sb.append("    shippedOrders: ").append(toIndentedString(shippedOrders)).append("\n");
    sb.append("    totalOrdersToShip: ").append(toIndentedString(totalOrdersToShip)).append("\n");
    sb.append("    completedToDo: ").append(toIndentedString(completedToDo)).append("\n");
    sb.append("    totalToDo: ").append(toIndentedString(totalToDo)).append("\n");
    sb.append("    createPickWork: ").append(toIndentedString(createPickWork)).append("\n");
    sb.append("    pickingRule: ").append(toIndentedString(pickingRule)).append("\n");
    sb.append("    layoutRule: ").append(toIndentedString(layoutRule)).append("\n");
    sb.append("    pickSortRule: ").append(toIndentedString(pickSortRule)).append("\n");
    sb.append("    firstPickPosition: ").append(toIndentedString(firstPickPosition)).append("\n");
    sb.append("    pickListFormat: ").append(toIndentedString(pickListFormat)).append("\n");
    sb.append("    pickListLayout: ").append(toIndentedString(pickListLayout)).append("\n");
    sb.append("    pickListGroup: ").append(toIndentedString(pickListGroup)).append("\n");
    sb.append("    pickListSort: ").append(toIndentedString(pickListSort)).append("\n");
    sb.append("    pickSummaryFormat: ").append(toIndentedString(pickSummaryFormat)).append("\n");
    sb.append("    pickSummaryLayout: ").append(toIndentedString(pickSummaryLayout)).append("\n");
    sb.append("    pickSummarySort: ").append(toIndentedString(pickSummarySort)).append("\n");
    sb.append("    createPickSummary: ").append(toIndentedString(createPickSummary)).append("\n");
    sb.append("    createPickList: ").append(toIndentedString(createPickList)).append("\n");
    sb.append("    preGenerateParcelLabels: ").append(toIndentedString(preGenerateParcelLabels)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    autoShipCasebreakCartons: ").append(toIndentedString(autoShipCasebreakCartons)).append("\n");
    sb.append("    cartonizeOrders: ").append(toIndentedString(cartonizeOrders)).append("\n");
    sb.append("    createPackingSlip: ").append(toIndentedString(createPackingSlip)).append("\n");
    sb.append("    overridePackingSlipTemplateId: ").append(toIndentedString(overridePackingSlipTemplateId)).append("\n");
    sb.append("    createOrderAssemblyGuide: ").append(toIndentedString(createOrderAssemblyGuide)).append("\n");
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

