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
 * FulfillmentProcess
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T22:42:25.751-05:00")
public class FulfillmentProcess {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("processNo")
  private Integer processNo = null;

  @SerializedName("workBatchId")
  private Integer workBatchId = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("fulfillmentPlanId")
  private Integer fulfillmentPlanId = null;

  @SerializedName("pickScanSchemeId")
  private Integer pickScanSchemeId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("orderSmartFilterId")
  private Integer orderSmartFilterId = null;

  @SerializedName("locationSmartFilterId")
  private Integer locationSmartFilterId = null;

  @SerializedName("maxOrders")
  private Integer maxOrders = null;

  @SerializedName("batchMaxSize")
  private Integer batchMaxSize = null;

  @SerializedName("batchMinSize")
  private Integer batchMinSize = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("fulfillmentProcessGroup")
  private Integer fulfillmentProcessGroup = null;

  @SerializedName("isMassDistribution")
  private Boolean isMassDistribution = false;

  @SerializedName("priorityCode")
  private Integer priorityCode = null;

  @SerializedName("numberOfOrders")
  private Integer numberOfOrders = null;

  @SerializedName("numberOfLines")
  private Integer numberOfLines = null;

  @SerializedName("numberOfSKUs")
  private Integer numberOfSKUs = null;

  @SerializedName("completedPicks")
  private Integer completedPicks = null;

  @SerializedName("totalPicks")
  private Integer totalPicks = null;

  @SerializedName("shippedCasebreaks")
  private Integer shippedCasebreaks = null;

  @SerializedName("totalCasebreaksToShip")
  private Integer totalCasebreaksToShip = null;

  @SerializedName("shippedOrders")
  private Integer shippedOrders = null;

  @SerializedName("totalOrdersToShip")
  private Integer totalOrdersToShip = null;

  @SerializedName("completedToDo")
  private Integer completedToDo = null;

  @SerializedName("totalToDo")
  private Integer totalToDo = null;

  @SerializedName("createPickWork")
  private Boolean createPickWork = false;

  @SerializedName("pickingRule")
  private String pickingRule = null;

  @SerializedName("layoutRule")
  private String layoutRule = null;

  @SerializedName("pickSortRule")
  private String pickSortRule = null;

  @SerializedName("firstPickPosition")
  private Integer firstPickPosition = null;

  @SerializedName("pickListFormat")
  private String pickListFormat = null;

  @SerializedName("pickListLayout")
  private String pickListLayout = null;

  @SerializedName("pickListGroup")
  private String pickListGroup = null;

  @SerializedName("pickListSort")
  private String pickListSort = null;

  @SerializedName("pickSummaryFormat")
  private String pickSummaryFormat = null;

  @SerializedName("pickSummaryLayout")
  private String pickSummaryLayout = null;

  @SerializedName("pickSummarySort")
  private String pickSummarySort = null;

  @SerializedName("createPickSummary")
  private Boolean createPickSummary = false;

  @SerializedName("createPickList")
  private Boolean createPickList = false;

  @SerializedName("preGenerateParcelLabels")
  private Boolean preGenerateParcelLabels = false;

  @SerializedName("shipDate")
  private OffsetDateTime shipDate = null;

  @SerializedName("autoShipCasebreakCartons")
  private Boolean autoShipCasebreakCartons = false;

  @SerializedName("autoShipOrders")
  private Boolean autoShipOrders = false;

  @SerializedName("cartonizeOrders")
  private Boolean cartonizeOrders = false;

  @SerializedName("createPackingSlip")
  private String createPackingSlip = null;

  @SerializedName("overridePackingSlipTemplateId")
  private Integer overridePackingSlipTemplateId = null;

  @SerializedName("createOrderAssemblyGuide")
  private Boolean createOrderAssemblyGuide = false;

  @SerializedName("createOrderInvoice")
  private String createOrderInvoice = null;

  @SerializedName("overrideOrderInvoiceTemplateId")
  private Integer overrideOrderInvoiceTemplateId = null;

  @SerializedName("sendToExternalShippingSystem")
  private Boolean sendToExternalShippingSystem = false;

  @SerializedName("externalShippingSystemId")
  private Integer externalShippingSystemId = null;

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

   /**
   * Get processNo
   * @return processNo
  **/
  @ApiModelProperty(value = "")
  public Integer getProcessNo() {
    return processNo;
  }

   /**
   * Get workBatchId
   * @return workBatchId
  **/
  @ApiModelProperty(value = "")
  public Integer getWorkBatchId() {
    return workBatchId;
  }

  public FulfillmentProcess warehouseId(Integer warehouseId) {
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

  public FulfillmentProcess fulfillmentPlanId(Integer fulfillmentPlanId) {
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

  public FulfillmentProcess pickScanSchemeId(Integer pickScanSchemeId) {
    this.pickScanSchemeId = pickScanSchemeId;
    return this;
  }

   /**
   * Get pickScanSchemeId
   * @return pickScanSchemeId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPickScanSchemeId() {
    return pickScanSchemeId;
  }

  public void setPickScanSchemeId(Integer pickScanSchemeId) {
    this.pickScanSchemeId = pickScanSchemeId;
  }

  public FulfillmentProcess status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public FulfillmentProcess orderSmartFilterId(Integer orderSmartFilterId) {
    this.orderSmartFilterId = orderSmartFilterId;
    return this;
  }

   /**
   * Get orderSmartFilterId
   * @return orderSmartFilterId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderSmartFilterId() {
    return orderSmartFilterId;
  }

  public void setOrderSmartFilterId(Integer orderSmartFilterId) {
    this.orderSmartFilterId = orderSmartFilterId;
  }

  public FulfillmentProcess locationSmartFilterId(Integer locationSmartFilterId) {
    this.locationSmartFilterId = locationSmartFilterId;
    return this;
  }

   /**
   * Get locationSmartFilterId
   * @return locationSmartFilterId
  **/
  @ApiModelProperty(value = "")
  public Integer getLocationSmartFilterId() {
    return locationSmartFilterId;
  }

  public void setLocationSmartFilterId(Integer locationSmartFilterId) {
    this.locationSmartFilterId = locationSmartFilterId;
  }

   /**
   * Get maxOrders
   * @return maxOrders
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxOrders() {
    return maxOrders;
  }

   /**
   * Get batchMaxSize
   * @return batchMaxSize
  **/
  @ApiModelProperty(value = "")
  public Integer getBatchMaxSize() {
    return batchMaxSize;
  }

   /**
   * Get batchMinSize
   * @return batchMinSize
  **/
  @ApiModelProperty(value = "")
  public Integer getBatchMinSize() {
    return batchMinSize;
  }

  public FulfillmentProcess version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

   /**
   * Get fulfillmentProcessGroup
   * @return fulfillmentProcessGroup
  **/
  @ApiModelProperty(value = "")
  public Integer getFulfillmentProcessGroup() {
    return fulfillmentProcessGroup;
  }

  public FulfillmentProcess isMassDistribution(Boolean isMassDistribution) {
    this.isMassDistribution = isMassDistribution;
    return this;
  }

   /**
   * Get isMassDistribution
   * @return isMassDistribution
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsMassDistribution() {
    return isMassDistribution;
  }

  public void setIsMassDistribution(Boolean isMassDistribution) {
    this.isMassDistribution = isMassDistribution;
  }

  public FulfillmentProcess priorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
    return this;
  }

   /**
   * Get priorityCode
   * @return priorityCode
  **/
  @ApiModelProperty(value = "")
  public Integer getPriorityCode() {
    return priorityCode;
  }

  public void setPriorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
  }

   /**
   * Get numberOfOrders
   * @return numberOfOrders
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfOrders() {
    return numberOfOrders;
  }

   /**
   * Get numberOfLines
   * @return numberOfLines
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfLines() {
    return numberOfLines;
  }

   /**
   * Get numberOfSKUs
   * @return numberOfSKUs
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfSKUs() {
    return numberOfSKUs;
  }

  public FulfillmentProcess completedPicks(Integer completedPicks) {
    this.completedPicks = completedPicks;
    return this;
  }

   /**
   * Get completedPicks
   * @return completedPicks
  **/
  @ApiModelProperty(value = "")
  public Integer getCompletedPicks() {
    return completedPicks;
  }

  public void setCompletedPicks(Integer completedPicks) {
    this.completedPicks = completedPicks;
  }

  public FulfillmentProcess totalPicks(Integer totalPicks) {
    this.totalPicks = totalPicks;
    return this;
  }

   /**
   * Get totalPicks
   * @return totalPicks
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalPicks() {
    return totalPicks;
  }

  public void setTotalPicks(Integer totalPicks) {
    this.totalPicks = totalPicks;
  }

  public FulfillmentProcess shippedCasebreaks(Integer shippedCasebreaks) {
    this.shippedCasebreaks = shippedCasebreaks;
    return this;
  }

   /**
   * Get shippedCasebreaks
   * @return shippedCasebreaks
  **/
  @ApiModelProperty(value = "")
  public Integer getShippedCasebreaks() {
    return shippedCasebreaks;
  }

  public void setShippedCasebreaks(Integer shippedCasebreaks) {
    this.shippedCasebreaks = shippedCasebreaks;
  }

  public FulfillmentProcess totalCasebreaksToShip(Integer totalCasebreaksToShip) {
    this.totalCasebreaksToShip = totalCasebreaksToShip;
    return this;
  }

   /**
   * Get totalCasebreaksToShip
   * @return totalCasebreaksToShip
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalCasebreaksToShip() {
    return totalCasebreaksToShip;
  }

  public void setTotalCasebreaksToShip(Integer totalCasebreaksToShip) {
    this.totalCasebreaksToShip = totalCasebreaksToShip;
  }

  public FulfillmentProcess shippedOrders(Integer shippedOrders) {
    this.shippedOrders = shippedOrders;
    return this;
  }

   /**
   * Get shippedOrders
   * @return shippedOrders
  **/
  @ApiModelProperty(value = "")
  public Integer getShippedOrders() {
    return shippedOrders;
  }

  public void setShippedOrders(Integer shippedOrders) {
    this.shippedOrders = shippedOrders;
  }

  public FulfillmentProcess totalOrdersToShip(Integer totalOrdersToShip) {
    this.totalOrdersToShip = totalOrdersToShip;
    return this;
  }

   /**
   * Get totalOrdersToShip
   * @return totalOrdersToShip
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalOrdersToShip() {
    return totalOrdersToShip;
  }

  public void setTotalOrdersToShip(Integer totalOrdersToShip) {
    this.totalOrdersToShip = totalOrdersToShip;
  }

  public FulfillmentProcess completedToDo(Integer completedToDo) {
    this.completedToDo = completedToDo;
    return this;
  }

   /**
   * Get completedToDo
   * @return completedToDo
  **/
  @ApiModelProperty(value = "")
  public Integer getCompletedToDo() {
    return completedToDo;
  }

  public void setCompletedToDo(Integer completedToDo) {
    this.completedToDo = completedToDo;
  }

  public FulfillmentProcess totalToDo(Integer totalToDo) {
    this.totalToDo = totalToDo;
    return this;
  }

   /**
   * Get totalToDo
   * @return totalToDo
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalToDo() {
    return totalToDo;
  }

  public void setTotalToDo(Integer totalToDo) {
    this.totalToDo = totalToDo;
  }

  public FulfillmentProcess createPickWork(Boolean createPickWork) {
    this.createPickWork = createPickWork;
    return this;
  }

   /**
   * Get createPickWork
   * @return createPickWork
  **/
  @ApiModelProperty(value = "")
  public Boolean isCreatePickWork() {
    return createPickWork;
  }

  public void setCreatePickWork(Boolean createPickWork) {
    this.createPickWork = createPickWork;
  }

  public FulfillmentProcess pickingRule(String pickingRule) {
    this.pickingRule = pickingRule;
    return this;
  }

   /**
   * Get pickingRule
   * @return pickingRule
  **/
  @ApiModelProperty(value = "")
  public String getPickingRule() {
    return pickingRule;
  }

  public void setPickingRule(String pickingRule) {
    this.pickingRule = pickingRule;
  }

  public FulfillmentProcess layoutRule(String layoutRule) {
    this.layoutRule = layoutRule;
    return this;
  }

   /**
   * Get layoutRule
   * @return layoutRule
  **/
  @ApiModelProperty(value = "")
  public String getLayoutRule() {
    return layoutRule;
  }

  public void setLayoutRule(String layoutRule) {
    this.layoutRule = layoutRule;
  }

  public FulfillmentProcess pickSortRule(String pickSortRule) {
    this.pickSortRule = pickSortRule;
    return this;
  }

   /**
   * Get pickSortRule
   * @return pickSortRule
  **/
  @ApiModelProperty(value = "")
  public String getPickSortRule() {
    return pickSortRule;
  }

  public void setPickSortRule(String pickSortRule) {
    this.pickSortRule = pickSortRule;
  }

  public FulfillmentProcess firstPickPosition(Integer firstPickPosition) {
    this.firstPickPosition = firstPickPosition;
    return this;
  }

   /**
   * Get firstPickPosition
   * @return firstPickPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getFirstPickPosition() {
    return firstPickPosition;
  }

  public void setFirstPickPosition(Integer firstPickPosition) {
    this.firstPickPosition = firstPickPosition;
  }

  public FulfillmentProcess pickListFormat(String pickListFormat) {
    this.pickListFormat = pickListFormat;
    return this;
  }

   /**
   * Get pickListFormat
   * @return pickListFormat
  **/
  @ApiModelProperty(value = "")
  public String getPickListFormat() {
    return pickListFormat;
  }

  public void setPickListFormat(String pickListFormat) {
    this.pickListFormat = pickListFormat;
  }

  public FulfillmentProcess pickListLayout(String pickListLayout) {
    this.pickListLayout = pickListLayout;
    return this;
  }

   /**
   * Get pickListLayout
   * @return pickListLayout
  **/
  @ApiModelProperty(value = "")
  public String getPickListLayout() {
    return pickListLayout;
  }

  public void setPickListLayout(String pickListLayout) {
    this.pickListLayout = pickListLayout;
  }

  public FulfillmentProcess pickListGroup(String pickListGroup) {
    this.pickListGroup = pickListGroup;
    return this;
  }

   /**
   * Get pickListGroup
   * @return pickListGroup
  **/
  @ApiModelProperty(value = "")
  public String getPickListGroup() {
    return pickListGroup;
  }

  public void setPickListGroup(String pickListGroup) {
    this.pickListGroup = pickListGroup;
  }

  public FulfillmentProcess pickListSort(String pickListSort) {
    this.pickListSort = pickListSort;
    return this;
  }

   /**
   * Get pickListSort
   * @return pickListSort
  **/
  @ApiModelProperty(value = "")
  public String getPickListSort() {
    return pickListSort;
  }

  public void setPickListSort(String pickListSort) {
    this.pickListSort = pickListSort;
  }

  public FulfillmentProcess pickSummaryFormat(String pickSummaryFormat) {
    this.pickSummaryFormat = pickSummaryFormat;
    return this;
  }

   /**
   * Get pickSummaryFormat
   * @return pickSummaryFormat
  **/
  @ApiModelProperty(value = "")
  public String getPickSummaryFormat() {
    return pickSummaryFormat;
  }

  public void setPickSummaryFormat(String pickSummaryFormat) {
    this.pickSummaryFormat = pickSummaryFormat;
  }

  public FulfillmentProcess pickSummaryLayout(String pickSummaryLayout) {
    this.pickSummaryLayout = pickSummaryLayout;
    return this;
  }

   /**
   * Get pickSummaryLayout
   * @return pickSummaryLayout
  **/
  @ApiModelProperty(value = "")
  public String getPickSummaryLayout() {
    return pickSummaryLayout;
  }

  public void setPickSummaryLayout(String pickSummaryLayout) {
    this.pickSummaryLayout = pickSummaryLayout;
  }

  public FulfillmentProcess pickSummarySort(String pickSummarySort) {
    this.pickSummarySort = pickSummarySort;
    return this;
  }

   /**
   * Get pickSummarySort
   * @return pickSummarySort
  **/
  @ApiModelProperty(value = "")
  public String getPickSummarySort() {
    return pickSummarySort;
  }

  public void setPickSummarySort(String pickSummarySort) {
    this.pickSummarySort = pickSummarySort;
  }

  public FulfillmentProcess createPickSummary(Boolean createPickSummary) {
    this.createPickSummary = createPickSummary;
    return this;
  }

   /**
   * Get createPickSummary
   * @return createPickSummary
  **/
  @ApiModelProperty(value = "")
  public Boolean isCreatePickSummary() {
    return createPickSummary;
  }

  public void setCreatePickSummary(Boolean createPickSummary) {
    this.createPickSummary = createPickSummary;
  }

  public FulfillmentProcess createPickList(Boolean createPickList) {
    this.createPickList = createPickList;
    return this;
  }

   /**
   * Get createPickList
   * @return createPickList
  **/
  @ApiModelProperty(value = "")
  public Boolean isCreatePickList() {
    return createPickList;
  }

  public void setCreatePickList(Boolean createPickList) {
    this.createPickList = createPickList;
  }

  public FulfillmentProcess preGenerateParcelLabels(Boolean preGenerateParcelLabels) {
    this.preGenerateParcelLabels = preGenerateParcelLabels;
    return this;
  }

   /**
   * Get preGenerateParcelLabels
   * @return preGenerateParcelLabels
  **/
  @ApiModelProperty(value = "")
  public Boolean isPreGenerateParcelLabels() {
    return preGenerateParcelLabels;
  }

  public void setPreGenerateParcelLabels(Boolean preGenerateParcelLabels) {
    this.preGenerateParcelLabels = preGenerateParcelLabels;
  }

  public FulfillmentProcess shipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
    return this;
  }

   /**
   * Get shipDate
   * @return shipDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getShipDate() {
    return shipDate;
  }

  public void setShipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
  }

  public FulfillmentProcess autoShipCasebreakCartons(Boolean autoShipCasebreakCartons) {
    this.autoShipCasebreakCartons = autoShipCasebreakCartons;
    return this;
  }

   /**
   * Get autoShipCasebreakCartons
   * @return autoShipCasebreakCartons
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoShipCasebreakCartons() {
    return autoShipCasebreakCartons;
  }

  public void setAutoShipCasebreakCartons(Boolean autoShipCasebreakCartons) {
    this.autoShipCasebreakCartons = autoShipCasebreakCartons;
  }

  public FulfillmentProcess autoShipOrders(Boolean autoShipOrders) {
    this.autoShipOrders = autoShipOrders;
    return this;
  }

   /**
   * Get autoShipOrders
   * @return autoShipOrders
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoShipOrders() {
    return autoShipOrders;
  }

  public void setAutoShipOrders(Boolean autoShipOrders) {
    this.autoShipOrders = autoShipOrders;
  }

  public FulfillmentProcess cartonizeOrders(Boolean cartonizeOrders) {
    this.cartonizeOrders = cartonizeOrders;
    return this;
  }

   /**
   * Get cartonizeOrders
   * @return cartonizeOrders
  **/
  @ApiModelProperty(value = "")
  public Boolean isCartonizeOrders() {
    return cartonizeOrders;
  }

  public void setCartonizeOrders(Boolean cartonizeOrders) {
    this.cartonizeOrders = cartonizeOrders;
  }

  public FulfillmentProcess createPackingSlip(String createPackingSlip) {
    this.createPackingSlip = createPackingSlip;
    return this;
  }

   /**
   * Get createPackingSlip
   * @return createPackingSlip
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCreatePackingSlip() {
    return createPackingSlip;
  }

  public void setCreatePackingSlip(String createPackingSlip) {
    this.createPackingSlip = createPackingSlip;
  }

  public FulfillmentProcess overridePackingSlipTemplateId(Integer overridePackingSlipTemplateId) {
    this.overridePackingSlipTemplateId = overridePackingSlipTemplateId;
    return this;
  }

   /**
   * Get overridePackingSlipTemplateId
   * @return overridePackingSlipTemplateId
  **/
  @ApiModelProperty(value = "")
  public Integer getOverridePackingSlipTemplateId() {
    return overridePackingSlipTemplateId;
  }

  public void setOverridePackingSlipTemplateId(Integer overridePackingSlipTemplateId) {
    this.overridePackingSlipTemplateId = overridePackingSlipTemplateId;
  }

  public FulfillmentProcess createOrderAssemblyGuide(Boolean createOrderAssemblyGuide) {
    this.createOrderAssemblyGuide = createOrderAssemblyGuide;
    return this;
  }

   /**
   * Get createOrderAssemblyGuide
   * @return createOrderAssemblyGuide
  **/
  @ApiModelProperty(value = "")
  public Boolean isCreateOrderAssemblyGuide() {
    return createOrderAssemblyGuide;
  }

  public void setCreateOrderAssemblyGuide(Boolean createOrderAssemblyGuide) {
    this.createOrderAssemblyGuide = createOrderAssemblyGuide;
  }

  public FulfillmentProcess createOrderInvoice(String createOrderInvoice) {
    this.createOrderInvoice = createOrderInvoice;
    return this;
  }

   /**
   * Get createOrderInvoice
   * @return createOrderInvoice
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCreateOrderInvoice() {
    return createOrderInvoice;
  }

  public void setCreateOrderInvoice(String createOrderInvoice) {
    this.createOrderInvoice = createOrderInvoice;
  }

  public FulfillmentProcess overrideOrderInvoiceTemplateId(Integer overrideOrderInvoiceTemplateId) {
    this.overrideOrderInvoiceTemplateId = overrideOrderInvoiceTemplateId;
    return this;
  }

   /**
   * Get overrideOrderInvoiceTemplateId
   * @return overrideOrderInvoiceTemplateId
  **/
  @ApiModelProperty(value = "")
  public Integer getOverrideOrderInvoiceTemplateId() {
    return overrideOrderInvoiceTemplateId;
  }

  public void setOverrideOrderInvoiceTemplateId(Integer overrideOrderInvoiceTemplateId) {
    this.overrideOrderInvoiceTemplateId = overrideOrderInvoiceTemplateId;
  }

  public FulfillmentProcess sendToExternalShippingSystem(Boolean sendToExternalShippingSystem) {
    this.sendToExternalShippingSystem = sendToExternalShippingSystem;
    return this;
  }

   /**
   * Get sendToExternalShippingSystem
   * @return sendToExternalShippingSystem
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isSendToExternalShippingSystem() {
    return sendToExternalShippingSystem;
  }

  public void setSendToExternalShippingSystem(Boolean sendToExternalShippingSystem) {
    this.sendToExternalShippingSystem = sendToExternalShippingSystem;
  }

  public FulfillmentProcess externalShippingSystemId(Integer externalShippingSystemId) {
    this.externalShippingSystemId = externalShippingSystemId;
    return this;
  }

   /**
   * Get externalShippingSystemId
   * @return externalShippingSystemId
  **/
  @ApiModelProperty(value = "")
  public Integer getExternalShippingSystemId() {
    return externalShippingSystemId;
  }

  public void setExternalShippingSystemId(Integer externalShippingSystemId) {
    this.externalShippingSystemId = externalShippingSystemId;
  }

  public FulfillmentProcess customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public FulfillmentProcess putCustomFieldsItem(String key, Object customFieldsItem) {
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
        Objects.equals(this.maxOrders, fulfillmentProcess.maxOrders) &&
        Objects.equals(this.batchMaxSize, fulfillmentProcess.batchMaxSize) &&
        Objects.equals(this.batchMinSize, fulfillmentProcess.batchMinSize) &&
        Objects.equals(this.version, fulfillmentProcess.version) &&
        Objects.equals(this.fulfillmentProcessGroup, fulfillmentProcess.fulfillmentProcessGroup) &&
        Objects.equals(this.isMassDistribution, fulfillmentProcess.isMassDistribution) &&
        Objects.equals(this.priorityCode, fulfillmentProcess.priorityCode) &&
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
        Objects.equals(this.autoShipOrders, fulfillmentProcess.autoShipOrders) &&
        Objects.equals(this.cartonizeOrders, fulfillmentProcess.cartonizeOrders) &&
        Objects.equals(this.createPackingSlip, fulfillmentProcess.createPackingSlip) &&
        Objects.equals(this.overridePackingSlipTemplateId, fulfillmentProcess.overridePackingSlipTemplateId) &&
        Objects.equals(this.createOrderAssemblyGuide, fulfillmentProcess.createOrderAssemblyGuide) &&
        Objects.equals(this.createOrderInvoice, fulfillmentProcess.createOrderInvoice) &&
        Objects.equals(this.overrideOrderInvoiceTemplateId, fulfillmentProcess.overrideOrderInvoiceTemplateId) &&
        Objects.equals(this.sendToExternalShippingSystem, fulfillmentProcess.sendToExternalShippingSystem) &&
        Objects.equals(this.externalShippingSystemId, fulfillmentProcess.externalShippingSystemId) &&
        Objects.equals(this.customFields, fulfillmentProcess.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, processNo, workBatchId, warehouseId, fulfillmentPlanId, pickScanSchemeId, status, orderSmartFilterId, locationSmartFilterId, maxOrders, batchMaxSize, batchMinSize, version, fulfillmentProcessGroup, isMassDistribution, priorityCode, numberOfOrders, numberOfLines, numberOfSKUs, completedPicks, totalPicks, shippedCasebreaks, totalCasebreaksToShip, shippedOrders, totalOrdersToShip, completedToDo, totalToDo, createPickWork, pickingRule, layoutRule, pickSortRule, firstPickPosition, pickListFormat, pickListLayout, pickListGroup, pickListSort, pickSummaryFormat, pickSummaryLayout, pickSummarySort, createPickSummary, createPickList, preGenerateParcelLabels, shipDate, autoShipCasebreakCartons, autoShipOrders, cartonizeOrders, createPackingSlip, overridePackingSlipTemplateId, createOrderAssemblyGuide, createOrderInvoice, overrideOrderInvoiceTemplateId, sendToExternalShippingSystem, externalShippingSystemId, customFields);
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
    sb.append("    maxOrders: ").append(toIndentedString(maxOrders)).append("\n");
    sb.append("    batchMaxSize: ").append(toIndentedString(batchMaxSize)).append("\n");
    sb.append("    batchMinSize: ").append(toIndentedString(batchMinSize)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    fulfillmentProcessGroup: ").append(toIndentedString(fulfillmentProcessGroup)).append("\n");
    sb.append("    isMassDistribution: ").append(toIndentedString(isMassDistribution)).append("\n");
    sb.append("    priorityCode: ").append(toIndentedString(priorityCode)).append("\n");
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
    sb.append("    autoShipOrders: ").append(toIndentedString(autoShipOrders)).append("\n");
    sb.append("    cartonizeOrders: ").append(toIndentedString(cartonizeOrders)).append("\n");
    sb.append("    createPackingSlip: ").append(toIndentedString(createPackingSlip)).append("\n");
    sb.append("    overridePackingSlipTemplateId: ").append(toIndentedString(overridePackingSlipTemplateId)).append("\n");
    sb.append("    createOrderAssemblyGuide: ").append(toIndentedString(createOrderAssemblyGuide)).append("\n");
    sb.append("    createOrderInvoice: ").append(toIndentedString(createOrderInvoice)).append("\n");
    sb.append("    overrideOrderInvoiceTemplateId: ").append(toIndentedString(overrideOrderInvoiceTemplateId)).append("\n");
    sb.append("    sendToExternalShippingSystem: ").append(toIndentedString(sendToExternalShippingSystem)).append("\n");
    sb.append("    externalShippingSystemId: ").append(toIndentedString(externalShippingSystemId)).append("\n");
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

