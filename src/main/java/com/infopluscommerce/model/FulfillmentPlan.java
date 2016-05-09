package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
  private Boolean cartonizeOrders = false;
  private Boolean autoShipCasebreakCartons = false;
  private Boolean preGenerateParcelLabels = false;
  private Integer overridePackingSlipTemplateId = null;
  private Boolean createPackingSlip = false;
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
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
  @JsonProperty("maximumNumberOfOrders")
  public Integer getMaximumNumberOfOrders() {
    return maximumNumberOfOrders;
  }
  public void setMaximumNumberOfOrders(Integer maximumNumberOfOrders) {
    this.maximumNumberOfOrders = maximumNumberOfOrders;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
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
  
  @ApiModelProperty(required = true, value = "")
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
  @JsonProperty("overridePackingSlipTemplateId")
  public Integer getOverridePackingSlipTemplateId() {
    return overridePackingSlipTemplateId;
  }
  public void setOverridePackingSlipTemplateId(Integer overridePackingSlipTemplateId) {
    this.overridePackingSlipTemplateId = overridePackingSlipTemplateId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
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
    FulfillmentPlan fulfillmentPlan = (FulfillmentPlan) o;
    return Objects.equals(id, fulfillmentPlan.id) &&
        Objects.equals(createDate, fulfillmentPlan.createDate) &&
        Objects.equals(modifyDate, fulfillmentPlan.modifyDate) &&
        Objects.equals(name, fulfillmentPlan.name) &&
        Objects.equals(description, fulfillmentPlan.description) &&
        Objects.equals(warehouseId, fulfillmentPlan.warehouseId) &&
        Objects.equals(orderSmartFilterId, fulfillmentPlan.orderSmartFilterId) &&
        Objects.equals(locationSmartFilterId, fulfillmentPlan.locationSmartFilterId) &&
        Objects.equals(maximumNumberOfOrders, fulfillmentPlan.maximumNumberOfOrders) &&
        Objects.equals(createPickWork, fulfillmentPlan.createPickWork) &&
        Objects.equals(pickingRule, fulfillmentPlan.pickingRule) &&
        Objects.equals(layoutRule, fulfillmentPlan.layoutRule) &&
        Objects.equals(pickSortRule, fulfillmentPlan.pickSortRule) &&
        Objects.equals(createPickList, fulfillmentPlan.createPickList) &&
        Objects.equals(pickListFormat, fulfillmentPlan.pickListFormat) &&
        Objects.equals(pickListLayout, fulfillmentPlan.pickListLayout) &&
        Objects.equals(pickListGroup, fulfillmentPlan.pickListGroup) &&
        Objects.equals(pickListSort, fulfillmentPlan.pickListSort) &&
        Objects.equals(createPickSummary, fulfillmentPlan.createPickSummary) &&
        Objects.equals(pickSummaryFormat, fulfillmentPlan.pickSummaryFormat) &&
        Objects.equals(pickSummaryLayout, fulfillmentPlan.pickSummaryLayout) &&
        Objects.equals(pickSummarySort, fulfillmentPlan.pickSummarySort) &&
        Objects.equals(cartonizeOrders, fulfillmentPlan.cartonizeOrders) &&
        Objects.equals(autoShipCasebreakCartons, fulfillmentPlan.autoShipCasebreakCartons) &&
        Objects.equals(preGenerateParcelLabels, fulfillmentPlan.preGenerateParcelLabels) &&
        Objects.equals(overridePackingSlipTemplateId, fulfillmentPlan.overridePackingSlipTemplateId) &&
        Objects.equals(createPackingSlip, fulfillmentPlan.createPackingSlip) &&
        Objects.equals(createOrderAssemblyGuide, fulfillmentPlan.createOrderAssemblyGuide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, name, description, warehouseId, orderSmartFilterId, locationSmartFilterId, maximumNumberOfOrders, createPickWork, pickingRule, layoutRule, pickSortRule, createPickList, pickListFormat, pickListLayout, pickListGroup, pickListSort, createPickSummary, pickSummaryFormat, pickSummaryLayout, pickSummarySort, cartonizeOrders, autoShipCasebreakCartons, preGenerateParcelLabels, overridePackingSlipTemplateId, createPackingSlip, createOrderAssemblyGuide);
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
    sb.append("    cartonizeOrders: ").append(toIndentedString(cartonizeOrders)).append("\n");
    sb.append("    autoShipCasebreakCartons: ").append(toIndentedString(autoShipCasebreakCartons)).append("\n");
    sb.append("    preGenerateParcelLabels: ").append(toIndentedString(preGenerateParcelLabels)).append("\n");
    sb.append("    overridePackingSlipTemplateId: ").append(toIndentedString(overridePackingSlipTemplateId)).append("\n");
    sb.append("    createPackingSlip: ").append(toIndentedString(createPackingSlip)).append("\n");
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

