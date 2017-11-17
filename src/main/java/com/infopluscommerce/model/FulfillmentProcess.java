package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:31:34.297-06:00")
public class FulfillmentProcess   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer processNo = null;
  private Integer workBatchId = null;
  private Integer warehouseId = null;
  private Integer fulfillmentPlanId = null;
  private Integer pickScanSchemeId = null;
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
  @JsonProperty("processNo")
  public Integer getProcessNo() {
    return processNo;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workBatchId")
  public Integer getWorkBatchId() {
    return workBatchId;
  }

  
  /**
   **/
  public FulfillmentProcess warehouseId(Integer warehouseId) {
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
  public FulfillmentProcess fulfillmentPlanId(Integer fulfillmentPlanId) {
    this.fulfillmentPlanId = fulfillmentPlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fulfillmentPlanId")
  public Integer getFulfillmentPlanId() {
    return fulfillmentPlanId;
  }
  public void setFulfillmentPlanId(Integer fulfillmentPlanId) {
    this.fulfillmentPlanId = fulfillmentPlanId;
  }

  
  /**
   **/
  public FulfillmentProcess pickScanSchemeId(Integer pickScanSchemeId) {
    this.pickScanSchemeId = pickScanSchemeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("pickScanSchemeId")
  public Integer getPickScanSchemeId() {
    return pickScanSchemeId;
  }
  public void setPickScanSchemeId(Integer pickScanSchemeId) {
    this.pickScanSchemeId = pickScanSchemeId;
  }

  
  /**
   **/
  public FulfillmentProcess status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  public FulfillmentProcess orderSmartFilterId(Integer orderSmartFilterId) {
    this.orderSmartFilterId = orderSmartFilterId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderSmartFilterId")
  public Integer getOrderSmartFilterId() {
    return orderSmartFilterId;
  }
  public void setOrderSmartFilterId(Integer orderSmartFilterId) {
    this.orderSmartFilterId = orderSmartFilterId;
  }

  
  /**
   **/
  public FulfillmentProcess locationSmartFilterId(Integer locationSmartFilterId) {
    this.locationSmartFilterId = locationSmartFilterId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("locationSmartFilterId")
  public Integer getLocationSmartFilterId() {
    return locationSmartFilterId;
  }
  public void setLocationSmartFilterId(Integer locationSmartFilterId) {
    this.locationSmartFilterId = locationSmartFilterId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderLimit")
  public Integer getOrderLimit() {
    return orderLimit;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfOrders")
  public Integer getNumberOfOrders() {
    return numberOfOrders;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfLines")
  public Integer getNumberOfLines() {
    return numberOfLines;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfSKUs")
  public Integer getNumberOfSKUs() {
    return numberOfSKUs;
  }

  
  /**
   **/
  public FulfillmentProcess completedPicks(Integer completedPicks) {
    this.completedPicks = completedPicks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("completedPicks")
  public Integer getCompletedPicks() {
    return completedPicks;
  }
  public void setCompletedPicks(Integer completedPicks) {
    this.completedPicks = completedPicks;
  }

  
  /**
   **/
  public FulfillmentProcess totalPicks(Integer totalPicks) {
    this.totalPicks = totalPicks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalPicks")
  public Integer getTotalPicks() {
    return totalPicks;
  }
  public void setTotalPicks(Integer totalPicks) {
    this.totalPicks = totalPicks;
  }

  
  /**
   **/
  public FulfillmentProcess shippedCasebreaks(Integer shippedCasebreaks) {
    this.shippedCasebreaks = shippedCasebreaks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shippedCasebreaks")
  public Integer getShippedCasebreaks() {
    return shippedCasebreaks;
  }
  public void setShippedCasebreaks(Integer shippedCasebreaks) {
    this.shippedCasebreaks = shippedCasebreaks;
  }

  
  /**
   **/
  public FulfillmentProcess totalCasebreaksToShip(Integer totalCasebreaksToShip) {
    this.totalCasebreaksToShip = totalCasebreaksToShip;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalCasebreaksToShip")
  public Integer getTotalCasebreaksToShip() {
    return totalCasebreaksToShip;
  }
  public void setTotalCasebreaksToShip(Integer totalCasebreaksToShip) {
    this.totalCasebreaksToShip = totalCasebreaksToShip;
  }

  
  /**
   **/
  public FulfillmentProcess shippedOrders(Integer shippedOrders) {
    this.shippedOrders = shippedOrders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shippedOrders")
  public Integer getShippedOrders() {
    return shippedOrders;
  }
  public void setShippedOrders(Integer shippedOrders) {
    this.shippedOrders = shippedOrders;
  }

  
  /**
   **/
  public FulfillmentProcess totalOrdersToShip(Integer totalOrdersToShip) {
    this.totalOrdersToShip = totalOrdersToShip;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalOrdersToShip")
  public Integer getTotalOrdersToShip() {
    return totalOrdersToShip;
  }
  public void setTotalOrdersToShip(Integer totalOrdersToShip) {
    this.totalOrdersToShip = totalOrdersToShip;
  }

  
  /**
   **/
  public FulfillmentProcess completedToDo(Integer completedToDo) {
    this.completedToDo = completedToDo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("completedToDo")
  public Integer getCompletedToDo() {
    return completedToDo;
  }
  public void setCompletedToDo(Integer completedToDo) {
    this.completedToDo = completedToDo;
  }

  
  /**
   **/
  public FulfillmentProcess totalToDo(Integer totalToDo) {
    this.totalToDo = totalToDo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalToDo")
  public Integer getTotalToDo() {
    return totalToDo;
  }
  public void setTotalToDo(Integer totalToDo) {
    this.totalToDo = totalToDo;
  }

  
  /**
   **/
  public FulfillmentProcess createPickWork(Boolean createPickWork) {
    this.createPickWork = createPickWork;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createPickWork")
  public Boolean getCreatePickWork() {
    return createPickWork;
  }
  public void setCreatePickWork(Boolean createPickWork) {
    this.createPickWork = createPickWork;
  }

  
  /**
   **/
  public FulfillmentProcess pickingRule(String pickingRule) {
    this.pickingRule = pickingRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pickingRule")
  public String getPickingRule() {
    return pickingRule;
  }
  public void setPickingRule(String pickingRule) {
    this.pickingRule = pickingRule;
  }

  
  /**
   **/
  public FulfillmentProcess layoutRule(String layoutRule) {
    this.layoutRule = layoutRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("layoutRule")
  public String getLayoutRule() {
    return layoutRule;
  }
  public void setLayoutRule(String layoutRule) {
    this.layoutRule = layoutRule;
  }

  
  /**
   **/
  public FulfillmentProcess pickSortRule(String pickSortRule) {
    this.pickSortRule = pickSortRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pickSortRule")
  public String getPickSortRule() {
    return pickSortRule;
  }
  public void setPickSortRule(String pickSortRule) {
    this.pickSortRule = pickSortRule;
  }

  
  /**
   **/
  public FulfillmentProcess firstPickPosition(Integer firstPickPosition) {
    this.firstPickPosition = firstPickPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("firstPickPosition")
  public Integer getFirstPickPosition() {
    return firstPickPosition;
  }
  public void setFirstPickPosition(Integer firstPickPosition) {
    this.firstPickPosition = firstPickPosition;
  }

  
  /**
   **/
  public FulfillmentProcess pickListFormat(String pickListFormat) {
    this.pickListFormat = pickListFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pickListFormat")
  public String getPickListFormat() {
    return pickListFormat;
  }
  public void setPickListFormat(String pickListFormat) {
    this.pickListFormat = pickListFormat;
  }

  
  /**
   **/
  public FulfillmentProcess pickListLayout(String pickListLayout) {
    this.pickListLayout = pickListLayout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pickListLayout")
  public String getPickListLayout() {
    return pickListLayout;
  }
  public void setPickListLayout(String pickListLayout) {
    this.pickListLayout = pickListLayout;
  }

  
  /**
   **/
  public FulfillmentProcess pickListGroup(String pickListGroup) {
    this.pickListGroup = pickListGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pickListGroup")
  public String getPickListGroup() {
    return pickListGroup;
  }
  public void setPickListGroup(String pickListGroup) {
    this.pickListGroup = pickListGroup;
  }

  
  /**
   **/
  public FulfillmentProcess pickListSort(String pickListSort) {
    this.pickListSort = pickListSort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pickListSort")
  public String getPickListSort() {
    return pickListSort;
  }
  public void setPickListSort(String pickListSort) {
    this.pickListSort = pickListSort;
  }

  
  /**
   **/
  public FulfillmentProcess pickSummaryFormat(String pickSummaryFormat) {
    this.pickSummaryFormat = pickSummaryFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pickSummaryFormat")
  public String getPickSummaryFormat() {
    return pickSummaryFormat;
  }
  public void setPickSummaryFormat(String pickSummaryFormat) {
    this.pickSummaryFormat = pickSummaryFormat;
  }

  
  /**
   **/
  public FulfillmentProcess pickSummaryLayout(String pickSummaryLayout) {
    this.pickSummaryLayout = pickSummaryLayout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pickSummaryLayout")
  public String getPickSummaryLayout() {
    return pickSummaryLayout;
  }
  public void setPickSummaryLayout(String pickSummaryLayout) {
    this.pickSummaryLayout = pickSummaryLayout;
  }

  
  /**
   **/
  public FulfillmentProcess pickSummarySort(String pickSummarySort) {
    this.pickSummarySort = pickSummarySort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pickSummarySort")
  public String getPickSummarySort() {
    return pickSummarySort;
  }
  public void setPickSummarySort(String pickSummarySort) {
    this.pickSummarySort = pickSummarySort;
  }

  
  /**
   **/
  public FulfillmentProcess createPickSummary(Boolean createPickSummary) {
    this.createPickSummary = createPickSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createPickSummary")
  public Boolean getCreatePickSummary() {
    return createPickSummary;
  }
  public void setCreatePickSummary(Boolean createPickSummary) {
    this.createPickSummary = createPickSummary;
  }

  
  /**
   **/
  public FulfillmentProcess createPickList(Boolean createPickList) {
    this.createPickList = createPickList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createPickList")
  public Boolean getCreatePickList() {
    return createPickList;
  }
  public void setCreatePickList(Boolean createPickList) {
    this.createPickList = createPickList;
  }

  
  /**
   **/
  public FulfillmentProcess preGenerateParcelLabels(Boolean preGenerateParcelLabels) {
    this.preGenerateParcelLabels = preGenerateParcelLabels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("preGenerateParcelLabels")
  public Boolean getPreGenerateParcelLabels() {
    return preGenerateParcelLabels;
  }
  public void setPreGenerateParcelLabels(Boolean preGenerateParcelLabels) {
    this.preGenerateParcelLabels = preGenerateParcelLabels;
  }

  
  /**
   **/
  public FulfillmentProcess shipDate(Date shipDate) {
    this.shipDate = shipDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipDate")
  public Date getShipDate() {
    return shipDate;
  }
  public void setShipDate(Date shipDate) {
    this.shipDate = shipDate;
  }

  
  /**
   **/
  public FulfillmentProcess autoShipCasebreakCartons(Boolean autoShipCasebreakCartons) {
    this.autoShipCasebreakCartons = autoShipCasebreakCartons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("autoShipCasebreakCartons")
  public Boolean getAutoShipCasebreakCartons() {
    return autoShipCasebreakCartons;
  }
  public void setAutoShipCasebreakCartons(Boolean autoShipCasebreakCartons) {
    this.autoShipCasebreakCartons = autoShipCasebreakCartons;
  }

  
  /**
   **/
  public FulfillmentProcess cartonizeOrders(Boolean cartonizeOrders) {
    this.cartonizeOrders = cartonizeOrders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cartonizeOrders")
  public Boolean getCartonizeOrders() {
    return cartonizeOrders;
  }
  public void setCartonizeOrders(Boolean cartonizeOrders) {
    this.cartonizeOrders = cartonizeOrders;
  }

  
  /**
   **/
  public FulfillmentProcess createPackingSlip(Boolean createPackingSlip) {
    this.createPackingSlip = createPackingSlip;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createPackingSlip")
  public Boolean getCreatePackingSlip() {
    return createPackingSlip;
  }
  public void setCreatePackingSlip(Boolean createPackingSlip) {
    this.createPackingSlip = createPackingSlip;
  }

  
  /**
   **/
  public FulfillmentProcess overridePackingSlipTemplateId(Integer overridePackingSlipTemplateId) {
    this.overridePackingSlipTemplateId = overridePackingSlipTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("overridePackingSlipTemplateId")
  public Integer getOverridePackingSlipTemplateId() {
    return overridePackingSlipTemplateId;
  }
  public void setOverridePackingSlipTemplateId(Integer overridePackingSlipTemplateId) {
    this.overridePackingSlipTemplateId = overridePackingSlipTemplateId;
  }

  
  /**
   **/
  public FulfillmentProcess createOrderAssemblyGuide(Boolean createOrderAssemblyGuide) {
    this.createOrderAssemblyGuide = createOrderAssemblyGuide;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createOrderAssemblyGuide")
  public Boolean getCreateOrderAssemblyGuide() {
    return createOrderAssemblyGuide;
  }
  public void setCreateOrderAssemblyGuide(Boolean createOrderAssemblyGuide) {
    this.createOrderAssemblyGuide = createOrderAssemblyGuide;
  }

  
  /**
   **/
  public FulfillmentProcess customFields(Map<String, Object> customFields) {
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
    FulfillmentProcess fulfillmentProcess = (FulfillmentProcess) o;
    return Objects.equals(this.id, fulfillmentProcess.id) &&
        Objects.equals(this.createDate, fulfillmentProcess.createDate) &&
        Objects.equals(this.modifyDate, fulfillmentProcess.modifyDate) &&
        Objects.equals(this.processNo, fulfillmentProcess.processNo) &&
        Objects.equals(this.workBatchId, fulfillmentProcess.workBatchId) &&
        Objects.equals(this.warehouseId, fulfillmentProcess.warehouseId) &&
        Objects.equals(this.fulfillmentPlanId, fulfillmentProcess.fulfillmentPlanId) &&
        Objects.equals(this.pickScanSchemeId, fulfillmentProcess.pickScanSchemeId) &&
        Objects.equals(this.status, fulfillmentProcess.status) &&
        Objects.equals(this.orderSmartFilterId, fulfillmentProcess.orderSmartFilterId) &&
        Objects.equals(this.locationSmartFilterId, fulfillmentProcess.locationSmartFilterId) &&
        Objects.equals(this.orderLimit, fulfillmentProcess.orderLimit) &&
        Objects.equals(this.numberOfOrders, fulfillmentProcess.numberOfOrders) &&
        Objects.equals(this.numberOfLines, fulfillmentProcess.numberOfLines) &&
        Objects.equals(this.numberOfSKUs, fulfillmentProcess.numberOfSKUs) &&
        Objects.equals(this.completedPicks, fulfillmentProcess.completedPicks) &&
        Objects.equals(this.totalPicks, fulfillmentProcess.totalPicks) &&
        Objects.equals(this.shippedCasebreaks, fulfillmentProcess.shippedCasebreaks) &&
        Objects.equals(this.totalCasebreaksToShip, fulfillmentProcess.totalCasebreaksToShip) &&
        Objects.equals(this.shippedOrders, fulfillmentProcess.shippedOrders) &&
        Objects.equals(this.totalOrdersToShip, fulfillmentProcess.totalOrdersToShip) &&
        Objects.equals(this.completedToDo, fulfillmentProcess.completedToDo) &&
        Objects.equals(this.totalToDo, fulfillmentProcess.totalToDo) &&
        Objects.equals(this.createPickWork, fulfillmentProcess.createPickWork) &&
        Objects.equals(this.pickingRule, fulfillmentProcess.pickingRule) &&
        Objects.equals(this.layoutRule, fulfillmentProcess.layoutRule) &&
        Objects.equals(this.pickSortRule, fulfillmentProcess.pickSortRule) &&
        Objects.equals(this.firstPickPosition, fulfillmentProcess.firstPickPosition) &&
        Objects.equals(this.pickListFormat, fulfillmentProcess.pickListFormat) &&
        Objects.equals(this.pickListLayout, fulfillmentProcess.pickListLayout) &&
        Objects.equals(this.pickListGroup, fulfillmentProcess.pickListGroup) &&
        Objects.equals(this.pickListSort, fulfillmentProcess.pickListSort) &&
        Objects.equals(this.pickSummaryFormat, fulfillmentProcess.pickSummaryFormat) &&
        Objects.equals(this.pickSummaryLayout, fulfillmentProcess.pickSummaryLayout) &&
        Objects.equals(this.pickSummarySort, fulfillmentProcess.pickSummarySort) &&
        Objects.equals(this.createPickSummary, fulfillmentProcess.createPickSummary) &&
        Objects.equals(this.createPickList, fulfillmentProcess.createPickList) &&
        Objects.equals(this.preGenerateParcelLabels, fulfillmentProcess.preGenerateParcelLabels) &&
        Objects.equals(this.shipDate, fulfillmentProcess.shipDate) &&
        Objects.equals(this.autoShipCasebreakCartons, fulfillmentProcess.autoShipCasebreakCartons) &&
        Objects.equals(this.cartonizeOrders, fulfillmentProcess.cartonizeOrders) &&
        Objects.equals(this.createPackingSlip, fulfillmentProcess.createPackingSlip) &&
        Objects.equals(this.overridePackingSlipTemplateId, fulfillmentProcess.overridePackingSlipTemplateId) &&
        Objects.equals(this.createOrderAssemblyGuide, fulfillmentProcess.createOrderAssemblyGuide) &&
        Objects.equals(this.customFields, fulfillmentProcess.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, processNo, workBatchId, warehouseId, fulfillmentPlanId, pickScanSchemeId, status, orderSmartFilterId, locationSmartFilterId, orderLimit, numberOfOrders, numberOfLines, numberOfSKUs, completedPicks, totalPicks, shippedCasebreaks, totalCasebreaksToShip, shippedOrders, totalOrdersToShip, completedToDo, totalToDo, createPickWork, pickingRule, layoutRule, pickSortRule, firstPickPosition, pickListFormat, pickListLayout, pickListGroup, pickListSort, pickSummaryFormat, pickSummaryLayout, pickSummarySort, createPickSummary, createPickList, preGenerateParcelLabels, shipDate, autoShipCasebreakCartons, cartonizeOrders, createPackingSlip, overridePackingSlipTemplateId, createOrderAssemblyGuide, customFields);
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
    sb.append("    fulfillmentPlanId: ").append(toIndentedString(fulfillmentPlanId)).append("\n");
    sb.append("    pickScanSchemeId: ").append(toIndentedString(pickScanSchemeId)).append("\n");
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

