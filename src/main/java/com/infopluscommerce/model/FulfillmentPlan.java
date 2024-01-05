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
 * FulfillmentPlan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-05T12:20:58.280-06:00")
public class FulfillmentPlan {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("priorityCode")
  private Integer priorityCode = null;

  @SerializedName("lastRunTime")
  private OffsetDateTime lastRunTime = null;

  @SerializedName("orderSmartFilterId")
  private Integer orderSmartFilterId = null;

  @SerializedName("locationSmartFilterId")
  private Integer locationSmartFilterId = null;

  @SerializedName("maxOrders")
  private Integer maxOrders = null;

  @SerializedName("batchSizeMax")
  private Integer batchSizeMax = null;

  @SerializedName("batchSizeMin")
  private Integer batchSizeMin = null;

  @SerializedName("maxCartons")
  private Integer maxCartons = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("isMassDistribution")
  private Boolean isMassDistribution = false;

  @SerializedName("createPickWork")
  private Boolean createPickWork = false;

  @SerializedName("pickingRule")
  private String pickingRule = null;

  @SerializedName("pickBatchGroupId")
  private String pickBatchGroupId = null;

  @SerializedName("maxSKUsPerBatch")
  private Integer maxSKUsPerBatch = null;

  @SerializedName("layoutRule")
  private String layoutRule = null;

  @SerializedName("pickSortRule")
  private String pickSortRule = null;

  @SerializedName("locationSort")
  private String locationSort = null;

  @SerializedName("createPickList")
  private Boolean createPickList = false;

  @SerializedName("pickListFormat")
  private String pickListFormat = null;

  @SerializedName("pickListLayout")
  private String pickListLayout = null;

  @SerializedName("pickListGroup")
  private String pickListGroup = null;

  @SerializedName("pickListSort")
  private String pickListSort = null;

  @SerializedName("pickListLocationSort")
  private String pickListLocationSort = null;

  @SerializedName("createPickSummary")
  private Boolean createPickSummary = false;

  @SerializedName("pickSummaryFormat")
  private String pickSummaryFormat = null;

  @SerializedName("pickSummaryLayout")
  private String pickSummaryLayout = null;

  @SerializedName("pickSummarySort")
  private String pickSummarySort = null;

  @SerializedName("pickScanSchemeId")
  private Integer pickScanSchemeId = null;

  @SerializedName("cartonizeOrders")
  private Boolean cartonizeOrders = false;

  @SerializedName("cartonizationScriptId")
  private Integer cartonizationScriptId = null;

  @SerializedName("autoShipCasebreakCartons")
  private Boolean autoShipCasebreakCartons = false;

  @SerializedName("autoShipOrders")
  private Boolean autoShipOrders = false;

  @SerializedName("preGenerateParcelLabels")
  private Boolean preGenerateParcelLabels = false;

  @SerializedName("labelSort")
  private String labelSort = null;

  @SerializedName("createPackingSlip")
  private String createPackingSlip = null;

  @SerializedName("overridePackingSlipTemplateId")
  private Integer overridePackingSlipTemplateId = null;

  @SerializedName("createOrderAssemblyGuide")
  private Boolean createOrderAssemblyGuide = false;

  @SerializedName("orderAssemblyGuideLayout")
  private String orderAssemblyGuideLayout = null;

  @SerializedName("createOrderInvoice")
  private String createOrderInvoice = null;

  @SerializedName("overrideOrderInvoiceTemplateId")
  private Integer overrideOrderInvoiceTemplateId = null;

  @SerializedName("createCartonGS1128Labels")
  private String createCartonGS1128Labels = null;

  @SerializedName("createLineItemEachGS1128Labels")
  private String createLineItemEachGS1128Labels = null;

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

  public FulfillmentPlan name(String name) {
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

  public FulfillmentPlan description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FulfillmentPlan warehouseId(Integer warehouseId) {
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

  public FulfillmentPlan priorityCode(Integer priorityCode) {
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
   * Get lastRunTime
   * @return lastRunTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastRunTime() {
    return lastRunTime;
  }

  public FulfillmentPlan orderSmartFilterId(Integer orderSmartFilterId) {
    this.orderSmartFilterId = orderSmartFilterId;
    return this;
  }

   /**
   * Get orderSmartFilterId
   * @return orderSmartFilterId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getOrderSmartFilterId() {
    return orderSmartFilterId;
  }

  public void setOrderSmartFilterId(Integer orderSmartFilterId) {
    this.orderSmartFilterId = orderSmartFilterId;
  }

  public FulfillmentPlan locationSmartFilterId(Integer locationSmartFilterId) {
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

  public FulfillmentPlan maxOrders(Integer maxOrders) {
    this.maxOrders = maxOrders;
    return this;
  }

   /**
   * Get maxOrders
   * @return maxOrders
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxOrders() {
    return maxOrders;
  }

  public void setMaxOrders(Integer maxOrders) {
    this.maxOrders = maxOrders;
  }

  public FulfillmentPlan batchSizeMax(Integer batchSizeMax) {
    this.batchSizeMax = batchSizeMax;
    return this;
  }

   /**
   * Get batchSizeMax
   * @return batchSizeMax
  **/
  @ApiModelProperty(value = "")
  public Integer getBatchSizeMax() {
    return batchSizeMax;
  }

  public void setBatchSizeMax(Integer batchSizeMax) {
    this.batchSizeMax = batchSizeMax;
  }

  public FulfillmentPlan batchSizeMin(Integer batchSizeMin) {
    this.batchSizeMin = batchSizeMin;
    return this;
  }

   /**
   * Get batchSizeMin
   * @return batchSizeMin
  **/
  @ApiModelProperty(value = "")
  public Integer getBatchSizeMin() {
    return batchSizeMin;
  }

  public void setBatchSizeMin(Integer batchSizeMin) {
    this.batchSizeMin = batchSizeMin;
  }

  public FulfillmentPlan maxCartons(Integer maxCartons) {
    this.maxCartons = maxCartons;
    return this;
  }

   /**
   * Get maxCartons
   * @return maxCartons
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxCartons() {
    return maxCartons;
  }

  public void setMaxCartons(Integer maxCartons) {
    this.maxCartons = maxCartons;
  }

  public FulfillmentPlan version(String version) {
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

  public FulfillmentPlan isMassDistribution(Boolean isMassDistribution) {
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

  public FulfillmentPlan createPickWork(Boolean createPickWork) {
    this.createPickWork = createPickWork;
    return this;
  }

   /**
   * Get createPickWork
   * @return createPickWork
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isCreatePickWork() {
    return createPickWork;
  }

  public void setCreatePickWork(Boolean createPickWork) {
    this.createPickWork = createPickWork;
  }

  public FulfillmentPlan pickingRule(String pickingRule) {
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

  public FulfillmentPlan pickBatchGroupId(String pickBatchGroupId) {
    this.pickBatchGroupId = pickBatchGroupId;
    return this;
  }

   /**
   * Get pickBatchGroupId
   * @return pickBatchGroupId
  **/
  @ApiModelProperty(value = "")
  public String getPickBatchGroupId() {
    return pickBatchGroupId;
  }

  public void setPickBatchGroupId(String pickBatchGroupId) {
    this.pickBatchGroupId = pickBatchGroupId;
  }

  public FulfillmentPlan maxSKUsPerBatch(Integer maxSKUsPerBatch) {
    this.maxSKUsPerBatch = maxSKUsPerBatch;
    return this;
  }

   /**
   * Get maxSKUsPerBatch
   * @return maxSKUsPerBatch
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxSKUsPerBatch() {
    return maxSKUsPerBatch;
  }

  public void setMaxSKUsPerBatch(Integer maxSKUsPerBatch) {
    this.maxSKUsPerBatch = maxSKUsPerBatch;
  }

  public FulfillmentPlan layoutRule(String layoutRule) {
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

  public FulfillmentPlan pickSortRule(String pickSortRule) {
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

  public FulfillmentPlan locationSort(String locationSort) {
    this.locationSort = locationSort;
    return this;
  }

   /**
   * Get locationSort
   * @return locationSort
  **/
  @ApiModelProperty(value = "")
  public String getLocationSort() {
    return locationSort;
  }

  public void setLocationSort(String locationSort) {
    this.locationSort = locationSort;
  }

  public FulfillmentPlan createPickList(Boolean createPickList) {
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

  public FulfillmentPlan pickListFormat(String pickListFormat) {
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

  public FulfillmentPlan pickListLayout(String pickListLayout) {
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

  public FulfillmentPlan pickListGroup(String pickListGroup) {
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

  public FulfillmentPlan pickListSort(String pickListSort) {
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

  public FulfillmentPlan pickListLocationSort(String pickListLocationSort) {
    this.pickListLocationSort = pickListLocationSort;
    return this;
  }

   /**
   * Get pickListLocationSort
   * @return pickListLocationSort
  **/
  @ApiModelProperty(value = "")
  public String getPickListLocationSort() {
    return pickListLocationSort;
  }

  public void setPickListLocationSort(String pickListLocationSort) {
    this.pickListLocationSort = pickListLocationSort;
  }

  public FulfillmentPlan createPickSummary(Boolean createPickSummary) {
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

  public FulfillmentPlan pickSummaryFormat(String pickSummaryFormat) {
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

  public FulfillmentPlan pickSummaryLayout(String pickSummaryLayout) {
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

  public FulfillmentPlan pickSummarySort(String pickSummarySort) {
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

  public FulfillmentPlan pickScanSchemeId(Integer pickScanSchemeId) {
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

  public FulfillmentPlan cartonizeOrders(Boolean cartonizeOrders) {
    this.cartonizeOrders = cartonizeOrders;
    return this;
  }

   /**
   * Get cartonizeOrders
   * @return cartonizeOrders
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isCartonizeOrders() {
    return cartonizeOrders;
  }

  public void setCartonizeOrders(Boolean cartonizeOrders) {
    this.cartonizeOrders = cartonizeOrders;
  }

  public FulfillmentPlan cartonizationScriptId(Integer cartonizationScriptId) {
    this.cartonizationScriptId = cartonizationScriptId;
    return this;
  }

   /**
   * Get cartonizationScriptId
   * @return cartonizationScriptId
  **/
  @ApiModelProperty(value = "")
  public Integer getCartonizationScriptId() {
    return cartonizationScriptId;
  }

  public void setCartonizationScriptId(Integer cartonizationScriptId) {
    this.cartonizationScriptId = cartonizationScriptId;
  }

  public FulfillmentPlan autoShipCasebreakCartons(Boolean autoShipCasebreakCartons) {
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

  public FulfillmentPlan autoShipOrders(Boolean autoShipOrders) {
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

  public FulfillmentPlan preGenerateParcelLabels(Boolean preGenerateParcelLabels) {
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

  public FulfillmentPlan labelSort(String labelSort) {
    this.labelSort = labelSort;
    return this;
  }

   /**
   * Get labelSort
   * @return labelSort
  **/
  @ApiModelProperty(value = "")
  public String getLabelSort() {
    return labelSort;
  }

  public void setLabelSort(String labelSort) {
    this.labelSort = labelSort;
  }

  public FulfillmentPlan createPackingSlip(String createPackingSlip) {
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

  public FulfillmentPlan overridePackingSlipTemplateId(Integer overridePackingSlipTemplateId) {
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

  public FulfillmentPlan createOrderAssemblyGuide(Boolean createOrderAssemblyGuide) {
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

  public FulfillmentPlan orderAssemblyGuideLayout(String orderAssemblyGuideLayout) {
    this.orderAssemblyGuideLayout = orderAssemblyGuideLayout;
    return this;
  }

   /**
   * Get orderAssemblyGuideLayout
   * @return orderAssemblyGuideLayout
  **/
  @ApiModelProperty(value = "")
  public String getOrderAssemblyGuideLayout() {
    return orderAssemblyGuideLayout;
  }

  public void setOrderAssemblyGuideLayout(String orderAssemblyGuideLayout) {
    this.orderAssemblyGuideLayout = orderAssemblyGuideLayout;
  }

  public FulfillmentPlan createOrderInvoice(String createOrderInvoice) {
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

  public FulfillmentPlan overrideOrderInvoiceTemplateId(Integer overrideOrderInvoiceTemplateId) {
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

  public FulfillmentPlan createCartonGS1128Labels(String createCartonGS1128Labels) {
    this.createCartonGS1128Labels = createCartonGS1128Labels;
    return this;
  }

   /**
   * Get createCartonGS1128Labels
   * @return createCartonGS1128Labels
  **/
  @ApiModelProperty(value = "")
  public String getCreateCartonGS1128Labels() {
    return createCartonGS1128Labels;
  }

  public void setCreateCartonGS1128Labels(String createCartonGS1128Labels) {
    this.createCartonGS1128Labels = createCartonGS1128Labels;
  }

  public FulfillmentPlan createLineItemEachGS1128Labels(String createLineItemEachGS1128Labels) {
    this.createLineItemEachGS1128Labels = createLineItemEachGS1128Labels;
    return this;
  }

   /**
   * Get createLineItemEachGS1128Labels
   * @return createLineItemEachGS1128Labels
  **/
  @ApiModelProperty(value = "")
  public String getCreateLineItemEachGS1128Labels() {
    return createLineItemEachGS1128Labels;
  }

  public void setCreateLineItemEachGS1128Labels(String createLineItemEachGS1128Labels) {
    this.createLineItemEachGS1128Labels = createLineItemEachGS1128Labels;
  }

  public FulfillmentPlan sendToExternalShippingSystem(Boolean sendToExternalShippingSystem) {
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

  public FulfillmentPlan externalShippingSystemId(Integer externalShippingSystemId) {
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

  public FulfillmentPlan customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public FulfillmentPlan putCustomFieldsItem(String key, Object customFieldsItem) {
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
    FulfillmentPlan fulfillmentPlan = (FulfillmentPlan) o;
    return Objects.equals(this.id, fulfillmentPlan.id) &&
        Objects.equals(this.createDate, fulfillmentPlan.createDate) &&
        Objects.equals(this.modifyDate, fulfillmentPlan.modifyDate) &&
        Objects.equals(this.name, fulfillmentPlan.name) &&
        Objects.equals(this.description, fulfillmentPlan.description) &&
        Objects.equals(this.warehouseId, fulfillmentPlan.warehouseId) &&
        Objects.equals(this.priorityCode, fulfillmentPlan.priorityCode) &&
        Objects.equals(this.lastRunTime, fulfillmentPlan.lastRunTime) &&
        Objects.equals(this.orderSmartFilterId, fulfillmentPlan.orderSmartFilterId) &&
        Objects.equals(this.locationSmartFilterId, fulfillmentPlan.locationSmartFilterId) &&
        Objects.equals(this.maxOrders, fulfillmentPlan.maxOrders) &&
        Objects.equals(this.batchSizeMax, fulfillmentPlan.batchSizeMax) &&
        Objects.equals(this.batchSizeMin, fulfillmentPlan.batchSizeMin) &&
        Objects.equals(this.maxCartons, fulfillmentPlan.maxCartons) &&
        Objects.equals(this.version, fulfillmentPlan.version) &&
        Objects.equals(this.isMassDistribution, fulfillmentPlan.isMassDistribution) &&
        Objects.equals(this.createPickWork, fulfillmentPlan.createPickWork) &&
        Objects.equals(this.pickingRule, fulfillmentPlan.pickingRule) &&
        Objects.equals(this.pickBatchGroupId, fulfillmentPlan.pickBatchGroupId) &&
        Objects.equals(this.maxSKUsPerBatch, fulfillmentPlan.maxSKUsPerBatch) &&
        Objects.equals(this.layoutRule, fulfillmentPlan.layoutRule) &&
        Objects.equals(this.pickSortRule, fulfillmentPlan.pickSortRule) &&
        Objects.equals(this.locationSort, fulfillmentPlan.locationSort) &&
        Objects.equals(this.createPickList, fulfillmentPlan.createPickList) &&
        Objects.equals(this.pickListFormat, fulfillmentPlan.pickListFormat) &&
        Objects.equals(this.pickListLayout, fulfillmentPlan.pickListLayout) &&
        Objects.equals(this.pickListGroup, fulfillmentPlan.pickListGroup) &&
        Objects.equals(this.pickListSort, fulfillmentPlan.pickListSort) &&
        Objects.equals(this.pickListLocationSort, fulfillmentPlan.pickListLocationSort) &&
        Objects.equals(this.createPickSummary, fulfillmentPlan.createPickSummary) &&
        Objects.equals(this.pickSummaryFormat, fulfillmentPlan.pickSummaryFormat) &&
        Objects.equals(this.pickSummaryLayout, fulfillmentPlan.pickSummaryLayout) &&
        Objects.equals(this.pickSummarySort, fulfillmentPlan.pickSummarySort) &&
        Objects.equals(this.pickScanSchemeId, fulfillmentPlan.pickScanSchemeId) &&
        Objects.equals(this.cartonizeOrders, fulfillmentPlan.cartonizeOrders) &&
        Objects.equals(this.cartonizationScriptId, fulfillmentPlan.cartonizationScriptId) &&
        Objects.equals(this.autoShipCasebreakCartons, fulfillmentPlan.autoShipCasebreakCartons) &&
        Objects.equals(this.autoShipOrders, fulfillmentPlan.autoShipOrders) &&
        Objects.equals(this.preGenerateParcelLabels, fulfillmentPlan.preGenerateParcelLabels) &&
        Objects.equals(this.labelSort, fulfillmentPlan.labelSort) &&
        Objects.equals(this.createPackingSlip, fulfillmentPlan.createPackingSlip) &&
        Objects.equals(this.overridePackingSlipTemplateId, fulfillmentPlan.overridePackingSlipTemplateId) &&
        Objects.equals(this.createOrderAssemblyGuide, fulfillmentPlan.createOrderAssemblyGuide) &&
        Objects.equals(this.orderAssemblyGuideLayout, fulfillmentPlan.orderAssemblyGuideLayout) &&
        Objects.equals(this.createOrderInvoice, fulfillmentPlan.createOrderInvoice) &&
        Objects.equals(this.overrideOrderInvoiceTemplateId, fulfillmentPlan.overrideOrderInvoiceTemplateId) &&
        Objects.equals(this.createCartonGS1128Labels, fulfillmentPlan.createCartonGS1128Labels) &&
        Objects.equals(this.createLineItemEachGS1128Labels, fulfillmentPlan.createLineItemEachGS1128Labels) &&
        Objects.equals(this.sendToExternalShippingSystem, fulfillmentPlan.sendToExternalShippingSystem) &&
        Objects.equals(this.externalShippingSystemId, fulfillmentPlan.externalShippingSystemId) &&
        Objects.equals(this.customFields, fulfillmentPlan.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, name, description, warehouseId, priorityCode, lastRunTime, orderSmartFilterId, locationSmartFilterId, maxOrders, batchSizeMax, batchSizeMin, maxCartons, version, isMassDistribution, createPickWork, pickingRule, pickBatchGroupId, maxSKUsPerBatch, layoutRule, pickSortRule, locationSort, createPickList, pickListFormat, pickListLayout, pickListGroup, pickListSort, pickListLocationSort, createPickSummary, pickSummaryFormat, pickSummaryLayout, pickSummarySort, pickScanSchemeId, cartonizeOrders, cartonizationScriptId, autoShipCasebreakCartons, autoShipOrders, preGenerateParcelLabels, labelSort, createPackingSlip, overridePackingSlipTemplateId, createOrderAssemblyGuide, orderAssemblyGuideLayout, createOrderInvoice, overrideOrderInvoiceTemplateId, createCartonGS1128Labels, createLineItemEachGS1128Labels, sendToExternalShippingSystem, externalShippingSystemId, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentPlan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    priorityCode: ").append(toIndentedString(priorityCode)).append("\n");
    sb.append("    lastRunTime: ").append(toIndentedString(lastRunTime)).append("\n");
    sb.append("    orderSmartFilterId: ").append(toIndentedString(orderSmartFilterId)).append("\n");
    sb.append("    locationSmartFilterId: ").append(toIndentedString(locationSmartFilterId)).append("\n");
    sb.append("    maxOrders: ").append(toIndentedString(maxOrders)).append("\n");
    sb.append("    batchSizeMax: ").append(toIndentedString(batchSizeMax)).append("\n");
    sb.append("    batchSizeMin: ").append(toIndentedString(batchSizeMin)).append("\n");
    sb.append("    maxCartons: ").append(toIndentedString(maxCartons)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    isMassDistribution: ").append(toIndentedString(isMassDistribution)).append("\n");
    sb.append("    createPickWork: ").append(toIndentedString(createPickWork)).append("\n");
    sb.append("    pickingRule: ").append(toIndentedString(pickingRule)).append("\n");
    sb.append("    pickBatchGroupId: ").append(toIndentedString(pickBatchGroupId)).append("\n");
    sb.append("    maxSKUsPerBatch: ").append(toIndentedString(maxSKUsPerBatch)).append("\n");
    sb.append("    layoutRule: ").append(toIndentedString(layoutRule)).append("\n");
    sb.append("    pickSortRule: ").append(toIndentedString(pickSortRule)).append("\n");
    sb.append("    locationSort: ").append(toIndentedString(locationSort)).append("\n");
    sb.append("    createPickList: ").append(toIndentedString(createPickList)).append("\n");
    sb.append("    pickListFormat: ").append(toIndentedString(pickListFormat)).append("\n");
    sb.append("    pickListLayout: ").append(toIndentedString(pickListLayout)).append("\n");
    sb.append("    pickListGroup: ").append(toIndentedString(pickListGroup)).append("\n");
    sb.append("    pickListSort: ").append(toIndentedString(pickListSort)).append("\n");
    sb.append("    pickListLocationSort: ").append(toIndentedString(pickListLocationSort)).append("\n");
    sb.append("    createPickSummary: ").append(toIndentedString(createPickSummary)).append("\n");
    sb.append("    pickSummaryFormat: ").append(toIndentedString(pickSummaryFormat)).append("\n");
    sb.append("    pickSummaryLayout: ").append(toIndentedString(pickSummaryLayout)).append("\n");
    sb.append("    pickSummarySort: ").append(toIndentedString(pickSummarySort)).append("\n");
    sb.append("    pickScanSchemeId: ").append(toIndentedString(pickScanSchemeId)).append("\n");
    sb.append("    cartonizeOrders: ").append(toIndentedString(cartonizeOrders)).append("\n");
    sb.append("    cartonizationScriptId: ").append(toIndentedString(cartonizationScriptId)).append("\n");
    sb.append("    autoShipCasebreakCartons: ").append(toIndentedString(autoShipCasebreakCartons)).append("\n");
    sb.append("    autoShipOrders: ").append(toIndentedString(autoShipOrders)).append("\n");
    sb.append("    preGenerateParcelLabels: ").append(toIndentedString(preGenerateParcelLabels)).append("\n");
    sb.append("    labelSort: ").append(toIndentedString(labelSort)).append("\n");
    sb.append("    createPackingSlip: ").append(toIndentedString(createPackingSlip)).append("\n");
    sb.append("    overridePackingSlipTemplateId: ").append(toIndentedString(overridePackingSlipTemplateId)).append("\n");
    sb.append("    createOrderAssemblyGuide: ").append(toIndentedString(createOrderAssemblyGuide)).append("\n");
    sb.append("    orderAssemblyGuideLayout: ").append(toIndentedString(orderAssemblyGuideLayout)).append("\n");
    sb.append("    createOrderInvoice: ").append(toIndentedString(createOrderInvoice)).append("\n");
    sb.append("    overrideOrderInvoiceTemplateId: ").append(toIndentedString(overrideOrderInvoiceTemplateId)).append("\n");
    sb.append("    createCartonGS1128Labels: ").append(toIndentedString(createCartonGS1128Labels)).append("\n");
    sb.append("    createLineItemEachGS1128Labels: ").append(toIndentedString(createLineItemEachGS1128Labels)).append("\n");
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

