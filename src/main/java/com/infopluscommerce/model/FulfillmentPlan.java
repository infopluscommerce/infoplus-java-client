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
public class FulfillmentPlan   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String name = null;
  private String description = null;
  private Integer warehouseId = null;
  private Integer orderSmartFilterId = null;
  private Integer locationSmartFilterId = null;
  private Integer maximumNumberOfOrders = null;
  private Boolean createPickWork = false;
  private String pickingRule = null;
  private String layoutRule = null;
  private String pickSortRule = null;
  private Boolean createPickList = false;
  private String pickListFormat = null;
  private String pickListLayout = null;
  private String pickListGroup = null;
  private String pickListSort = null;
  private Boolean createPickSummary = false;
  private String pickSummaryFormat = null;
  private String pickSummaryLayout = null;
  private String pickSummarySort = null;
  private Integer pickScanSchemeId = null;
  private Boolean cartonizeOrders = false;
  private Boolean autoShipCasebreakCartons = false;
  private Boolean preGenerateParcelLabels = false;
  private Integer overridePackingSlipTemplateId = null;
  private Boolean createPackingSlip = false;
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

  
  /**
   **/
  public FulfillmentPlan name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public FulfillmentPlan description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public FulfillmentPlan warehouseId(Integer warehouseId) {
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
  public FulfillmentPlan orderSmartFilterId(Integer orderSmartFilterId) {
    this.orderSmartFilterId = orderSmartFilterId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("orderSmartFilterId")
  public Integer getOrderSmartFilterId() {
    return orderSmartFilterId;
  }
  public void setOrderSmartFilterId(Integer orderSmartFilterId) {
    this.orderSmartFilterId = orderSmartFilterId;
  }

  
  /**
   **/
  public FulfillmentPlan locationSmartFilterId(Integer locationSmartFilterId) {
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

  
  /**
   **/
  public FulfillmentPlan maximumNumberOfOrders(Integer maximumNumberOfOrders) {
    this.maximumNumberOfOrders = maximumNumberOfOrders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maximumNumberOfOrders")
  public Integer getMaximumNumberOfOrders() {
    return maximumNumberOfOrders;
  }
  public void setMaximumNumberOfOrders(Integer maximumNumberOfOrders) {
    this.maximumNumberOfOrders = maximumNumberOfOrders;
  }

  
  /**
   **/
  public FulfillmentPlan createPickWork(Boolean createPickWork) {
    this.createPickWork = createPickWork;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("createPickWork")
  public Boolean getCreatePickWork() {
    return createPickWork;
  }
  public void setCreatePickWork(Boolean createPickWork) {
    this.createPickWork = createPickWork;
  }

  
  /**
   **/
  public FulfillmentPlan pickingRule(String pickingRule) {
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
  public FulfillmentPlan layoutRule(String layoutRule) {
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
  public FulfillmentPlan pickSortRule(String pickSortRule) {
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
  public FulfillmentPlan createPickList(Boolean createPickList) {
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
  public FulfillmentPlan pickListFormat(String pickListFormat) {
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
  public FulfillmentPlan pickListLayout(String pickListLayout) {
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
  public FulfillmentPlan pickListGroup(String pickListGroup) {
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
  public FulfillmentPlan pickListSort(String pickListSort) {
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
  public FulfillmentPlan createPickSummary(Boolean createPickSummary) {
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
  public FulfillmentPlan pickSummaryFormat(String pickSummaryFormat) {
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
  public FulfillmentPlan pickSummaryLayout(String pickSummaryLayout) {
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
  public FulfillmentPlan pickSummarySort(String pickSummarySort) {
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
  public FulfillmentPlan pickScanSchemeId(Integer pickScanSchemeId) {
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
  public FulfillmentPlan cartonizeOrders(Boolean cartonizeOrders) {
    this.cartonizeOrders = cartonizeOrders;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("cartonizeOrders")
  public Boolean getCartonizeOrders() {
    return cartonizeOrders;
  }
  public void setCartonizeOrders(Boolean cartonizeOrders) {
    this.cartonizeOrders = cartonizeOrders;
  }

  
  /**
   **/
  public FulfillmentPlan autoShipCasebreakCartons(Boolean autoShipCasebreakCartons) {
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
  public FulfillmentPlan preGenerateParcelLabels(Boolean preGenerateParcelLabels) {
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
  public FulfillmentPlan overridePackingSlipTemplateId(Integer overridePackingSlipTemplateId) {
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
  public FulfillmentPlan createPackingSlip(Boolean createPackingSlip) {
    this.createPackingSlip = createPackingSlip;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("createPackingSlip")
  public Boolean getCreatePackingSlip() {
    return createPackingSlip;
  }
  public void setCreatePackingSlip(Boolean createPackingSlip) {
    this.createPackingSlip = createPackingSlip;
  }

  
  /**
   **/
  public FulfillmentPlan createOrderAssemblyGuide(Boolean createOrderAssemblyGuide) {
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
  public FulfillmentPlan customFields(Map<String, Object> customFields) {
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
    FulfillmentPlan fulfillmentPlan = (FulfillmentPlan) o;
    return Objects.equals(this.id, fulfillmentPlan.id) &&
        Objects.equals(this.createDate, fulfillmentPlan.createDate) &&
        Objects.equals(this.modifyDate, fulfillmentPlan.modifyDate) &&
        Objects.equals(this.name, fulfillmentPlan.name) &&
        Objects.equals(this.description, fulfillmentPlan.description) &&
        Objects.equals(this.warehouseId, fulfillmentPlan.warehouseId) &&
        Objects.equals(this.orderSmartFilterId, fulfillmentPlan.orderSmartFilterId) &&
        Objects.equals(this.locationSmartFilterId, fulfillmentPlan.locationSmartFilterId) &&
        Objects.equals(this.maximumNumberOfOrders, fulfillmentPlan.maximumNumberOfOrders) &&
        Objects.equals(this.createPickWork, fulfillmentPlan.createPickWork) &&
        Objects.equals(this.pickingRule, fulfillmentPlan.pickingRule) &&
        Objects.equals(this.layoutRule, fulfillmentPlan.layoutRule) &&
        Objects.equals(this.pickSortRule, fulfillmentPlan.pickSortRule) &&
        Objects.equals(this.createPickList, fulfillmentPlan.createPickList) &&
        Objects.equals(this.pickListFormat, fulfillmentPlan.pickListFormat) &&
        Objects.equals(this.pickListLayout, fulfillmentPlan.pickListLayout) &&
        Objects.equals(this.pickListGroup, fulfillmentPlan.pickListGroup) &&
        Objects.equals(this.pickListSort, fulfillmentPlan.pickListSort) &&
        Objects.equals(this.createPickSummary, fulfillmentPlan.createPickSummary) &&
        Objects.equals(this.pickSummaryFormat, fulfillmentPlan.pickSummaryFormat) &&
        Objects.equals(this.pickSummaryLayout, fulfillmentPlan.pickSummaryLayout) &&
        Objects.equals(this.pickSummarySort, fulfillmentPlan.pickSummarySort) &&
        Objects.equals(this.pickScanSchemeId, fulfillmentPlan.pickScanSchemeId) &&
        Objects.equals(this.cartonizeOrders, fulfillmentPlan.cartonizeOrders) &&
        Objects.equals(this.autoShipCasebreakCartons, fulfillmentPlan.autoShipCasebreakCartons) &&
        Objects.equals(this.preGenerateParcelLabels, fulfillmentPlan.preGenerateParcelLabels) &&
        Objects.equals(this.overridePackingSlipTemplateId, fulfillmentPlan.overridePackingSlipTemplateId) &&
        Objects.equals(this.createPackingSlip, fulfillmentPlan.createPackingSlip) &&
        Objects.equals(this.createOrderAssemblyGuide, fulfillmentPlan.createOrderAssemblyGuide) &&
        Objects.equals(this.customFields, fulfillmentPlan.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, name, description, warehouseId, orderSmartFilterId, locationSmartFilterId, maximumNumberOfOrders, createPickWork, pickingRule, layoutRule, pickSortRule, createPickList, pickListFormat, pickListLayout, pickListGroup, pickListSort, createPickSummary, pickSummaryFormat, pickSummaryLayout, pickSummarySort, pickScanSchemeId, cartonizeOrders, autoShipCasebreakCartons, preGenerateParcelLabels, overridePackingSlipTemplateId, createPackingSlip, createOrderAssemblyGuide, customFields);
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
    sb.append("    orderSmartFilterId: ").append(toIndentedString(orderSmartFilterId)).append("\n");
    sb.append("    locationSmartFilterId: ").append(toIndentedString(locationSmartFilterId)).append("\n");
    sb.append("    maximumNumberOfOrders: ").append(toIndentedString(maximumNumberOfOrders)).append("\n");
    sb.append("    createPickWork: ").append(toIndentedString(createPickWork)).append("\n");
    sb.append("    pickingRule: ").append(toIndentedString(pickingRule)).append("\n");
    sb.append("    layoutRule: ").append(toIndentedString(layoutRule)).append("\n");
    sb.append("    pickSortRule: ").append(toIndentedString(pickSortRule)).append("\n");
    sb.append("    createPickList: ").append(toIndentedString(createPickList)).append("\n");
    sb.append("    pickListFormat: ").append(toIndentedString(pickListFormat)).append("\n");
    sb.append("    pickListLayout: ").append(toIndentedString(pickListLayout)).append("\n");
    sb.append("    pickListGroup: ").append(toIndentedString(pickListGroup)).append("\n");
    sb.append("    pickListSort: ").append(toIndentedString(pickListSort)).append("\n");
    sb.append("    createPickSummary: ").append(toIndentedString(createPickSummary)).append("\n");
    sb.append("    pickSummaryFormat: ").append(toIndentedString(pickSummaryFormat)).append("\n");
    sb.append("    pickSummaryLayout: ").append(toIndentedString(pickSummaryLayout)).append("\n");
    sb.append("    pickSummarySort: ").append(toIndentedString(pickSummarySort)).append("\n");
    sb.append("    pickScanSchemeId: ").append(toIndentedString(pickScanSchemeId)).append("\n");
    sb.append("    cartonizeOrders: ").append(toIndentedString(cartonizeOrders)).append("\n");
    sb.append("    autoShipCasebreakCartons: ").append(toIndentedString(autoShipCasebreakCartons)).append("\n");
    sb.append("    preGenerateParcelLabels: ").append(toIndentedString(preGenerateParcelLabels)).append("\n");
    sb.append("    overridePackingSlipTemplateId: ").append(toIndentedString(overridePackingSlipTemplateId)).append("\n");
    sb.append("    createPackingSlip: ").append(toIndentedString(createPackingSlip)).append("\n");
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

