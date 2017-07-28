package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
public class InventorySnapshot   {
  
  private Integer id = null;
  private Integer warehouseLocationId = null;
  private Integer itemId = null;
  private Integer lobId = null;
  private Date snapshotDate = null;
  private Boolean isMixedReceipts = false;
  private Integer quantity = null;
  private String address = null;
  private Integer warehouseId = null;
  private String warehouseName = null;
  private Integer warehouseZoneId = null;
  private String warehouseZoneName = null;
  private String warehouseZoneAddress = null;
  private Integer warehouseBuildingId = null;
  private String warehouseBuildingName = null;
  private Integer warehouseAisleId = null;
  private String warehouseAisleAddress = null;
  private Integer warehouseLocationOriginId = null;
  private String warehouseLocationOriginName = null;
  private Integer warehouseLocationBillingTypeId = null;
  private String warehouseLocationBillingTypeName = null;
  private Integer warehouseLocationBehaviorTypeId = null;
  private String warehouseLocationBehaviorTypeName = null;
  private Integer warehouseLocationFootprintId = null;
  private String warehouseLocationFootprintName = null;
  private Integer warehouseLocationFootprintWidth = null;
  private Integer warehouseLocationFootprintHeight = null;
  private Integer warehouseLocationFootprintDepth = null;
  private Integer warehouseLocationLevel = null;
  private Integer warehouseLocationBay = null;
  private Integer warehouseLocationNumber = null;
  private Boolean warehouseLocationOnline = false;
  private Integer warehouseLocationPriorityCode = null;
  private Boolean warehouseLocationAllowItemMixing = false;
  private Integer warehouseLocationCost = null;
  private String controlNo = null;
  private String itemVendorSku = null;
  private String itemUpc = null;
  private Integer itemMajorGroup = null;
  private String itemMajorGroupName = null;
  private Integer itemSubGroup = null;
  private String itemSubGroupName = null;
  private Integer itemProductCode = null;
  private String itemProductCodeName = null;
  private String itemAccountCode = null;
  private String itemAccountCodeName = null;
  private Integer itemSummaryCode = null;
  private String itemSummaryCodeName = null;
  private String itemSector = null;
  private String poNo = null;
  private Date receiptDistributionDate = null;
  private Integer receiptUnitsPerWrap = null;
  private Integer receiptUnitsPerCase = null;
  private String receiptRevisionDate = null;
  private String receiptProductionLot = null;
  private Date receiptReceiveDate = null;
  private String receiptStatus = null;
  private String receiptStatusName = null;
  private Integer receiptUnitCode = null;
  private String receiptUnitCodeText = null;
  private Integer receiptWrapCode = null;
  private String receiptWrapCodeText = null;
  private BigDecimal receiptCaseWeight = null;
  private String receiptProductIdTag = null;
  private String alcoholType = null;
  private String alcoholTypeName = null;
  private BigDecimal alcoholContent = null;
  private String alcoholContainer = null;
  private String alcoholContainerName = null;
  private Integer alcoholContainerVolume = null;
  private String alcoholVintageYear = null;
  private String alcoholCountry = null;
  private String alcoholCountryName = null;
  private String alcoholState = null;
  private String alcoholRegion = null;
  private String alcoholBrand = null;
  private String alcoholUPCCode = null;
  private String alcoholNABCACode = null;
  private String alcoholUNIMERCCode = null;
  private String alcoholSCCCode = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationId")
  public Integer getWarehouseLocationId() {
    return warehouseLocationId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemId")
  public Integer getItemId() {
    return itemId;
  }

  
  /**
   **/
  public InventorySnapshot lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }
  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("snapshotDate")
  public Date getSnapshotDate() {
    return snapshotDate;
  }

  
  /**
   **/
  public InventorySnapshot isMixedReceipts(Boolean isMixedReceipts) {
    this.isMixedReceipts = isMixedReceipts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isMixedReceipts")
  public Boolean getIsMixedReceipts() {
    return isMixedReceipts;
  }
  public void setIsMixedReceipts(Boolean isMixedReceipts) {
    this.isMixedReceipts = isMixedReceipts;
  }

  
  /**
   **/
  public InventorySnapshot quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  /**
   **/
  public InventorySnapshot address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   **/
  public InventorySnapshot warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseId")
  public Integer getWarehouseId() {
    return warehouseId;
  }
  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  
  /**
   **/
  public InventorySnapshot warehouseName(String warehouseName) {
    this.warehouseName = warehouseName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseName")
  public String getWarehouseName() {
    return warehouseName;
  }
  public void setWarehouseName(String warehouseName) {
    this.warehouseName = warehouseName;
  }

  
  /**
   **/
  public InventorySnapshot warehouseZoneId(Integer warehouseZoneId) {
    this.warehouseZoneId = warehouseZoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseZoneId")
  public Integer getWarehouseZoneId() {
    return warehouseZoneId;
  }
  public void setWarehouseZoneId(Integer warehouseZoneId) {
    this.warehouseZoneId = warehouseZoneId;
  }

  
  /**
   **/
  public InventorySnapshot warehouseZoneName(String warehouseZoneName) {
    this.warehouseZoneName = warehouseZoneName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseZoneName")
  public String getWarehouseZoneName() {
    return warehouseZoneName;
  }
  public void setWarehouseZoneName(String warehouseZoneName) {
    this.warehouseZoneName = warehouseZoneName;
  }

  
  /**
   **/
  public InventorySnapshot warehouseZoneAddress(String warehouseZoneAddress) {
    this.warehouseZoneAddress = warehouseZoneAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseZoneAddress")
  public String getWarehouseZoneAddress() {
    return warehouseZoneAddress;
  }
  public void setWarehouseZoneAddress(String warehouseZoneAddress) {
    this.warehouseZoneAddress = warehouseZoneAddress;
  }

  
  /**
   **/
  public InventorySnapshot warehouseBuildingId(Integer warehouseBuildingId) {
    this.warehouseBuildingId = warehouseBuildingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseBuildingId")
  public Integer getWarehouseBuildingId() {
    return warehouseBuildingId;
  }
  public void setWarehouseBuildingId(Integer warehouseBuildingId) {
    this.warehouseBuildingId = warehouseBuildingId;
  }

  
  /**
   **/
  public InventorySnapshot warehouseBuildingName(String warehouseBuildingName) {
    this.warehouseBuildingName = warehouseBuildingName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseBuildingName")
  public String getWarehouseBuildingName() {
    return warehouseBuildingName;
  }
  public void setWarehouseBuildingName(String warehouseBuildingName) {
    this.warehouseBuildingName = warehouseBuildingName;
  }

  
  /**
   **/
  public InventorySnapshot warehouseAisleId(Integer warehouseAisleId) {
    this.warehouseAisleId = warehouseAisleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseAisleId")
  public Integer getWarehouseAisleId() {
    return warehouseAisleId;
  }
  public void setWarehouseAisleId(Integer warehouseAisleId) {
    this.warehouseAisleId = warehouseAisleId;
  }

  
  /**
   **/
  public InventorySnapshot warehouseAisleAddress(String warehouseAisleAddress) {
    this.warehouseAisleAddress = warehouseAisleAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseAisleAddress")
  public String getWarehouseAisleAddress() {
    return warehouseAisleAddress;
  }
  public void setWarehouseAisleAddress(String warehouseAisleAddress) {
    this.warehouseAisleAddress = warehouseAisleAddress;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationOriginId(Integer warehouseLocationOriginId) {
    this.warehouseLocationOriginId = warehouseLocationOriginId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationOriginId")
  public Integer getWarehouseLocationOriginId() {
    return warehouseLocationOriginId;
  }
  public void setWarehouseLocationOriginId(Integer warehouseLocationOriginId) {
    this.warehouseLocationOriginId = warehouseLocationOriginId;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationOriginName(String warehouseLocationOriginName) {
    this.warehouseLocationOriginName = warehouseLocationOriginName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationOriginName")
  public String getWarehouseLocationOriginName() {
    return warehouseLocationOriginName;
  }
  public void setWarehouseLocationOriginName(String warehouseLocationOriginName) {
    this.warehouseLocationOriginName = warehouseLocationOriginName;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationBillingTypeId(Integer warehouseLocationBillingTypeId) {
    this.warehouseLocationBillingTypeId = warehouseLocationBillingTypeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationBillingTypeId")
  public Integer getWarehouseLocationBillingTypeId() {
    return warehouseLocationBillingTypeId;
  }
  public void setWarehouseLocationBillingTypeId(Integer warehouseLocationBillingTypeId) {
    this.warehouseLocationBillingTypeId = warehouseLocationBillingTypeId;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationBillingTypeName(String warehouseLocationBillingTypeName) {
    this.warehouseLocationBillingTypeName = warehouseLocationBillingTypeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationBillingTypeName")
  public String getWarehouseLocationBillingTypeName() {
    return warehouseLocationBillingTypeName;
  }
  public void setWarehouseLocationBillingTypeName(String warehouseLocationBillingTypeName) {
    this.warehouseLocationBillingTypeName = warehouseLocationBillingTypeName;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationBehaviorTypeId(Integer warehouseLocationBehaviorTypeId) {
    this.warehouseLocationBehaviorTypeId = warehouseLocationBehaviorTypeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationBehaviorTypeId")
  public Integer getWarehouseLocationBehaviorTypeId() {
    return warehouseLocationBehaviorTypeId;
  }
  public void setWarehouseLocationBehaviorTypeId(Integer warehouseLocationBehaviorTypeId) {
    this.warehouseLocationBehaviorTypeId = warehouseLocationBehaviorTypeId;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationBehaviorTypeName(String warehouseLocationBehaviorTypeName) {
    this.warehouseLocationBehaviorTypeName = warehouseLocationBehaviorTypeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationBehaviorTypeName")
  public String getWarehouseLocationBehaviorTypeName() {
    return warehouseLocationBehaviorTypeName;
  }
  public void setWarehouseLocationBehaviorTypeName(String warehouseLocationBehaviorTypeName) {
    this.warehouseLocationBehaviorTypeName = warehouseLocationBehaviorTypeName;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationFootprintId(Integer warehouseLocationFootprintId) {
    this.warehouseLocationFootprintId = warehouseLocationFootprintId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationFootprintId")
  public Integer getWarehouseLocationFootprintId() {
    return warehouseLocationFootprintId;
  }
  public void setWarehouseLocationFootprintId(Integer warehouseLocationFootprintId) {
    this.warehouseLocationFootprintId = warehouseLocationFootprintId;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationFootprintName(String warehouseLocationFootprintName) {
    this.warehouseLocationFootprintName = warehouseLocationFootprintName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationFootprintName")
  public String getWarehouseLocationFootprintName() {
    return warehouseLocationFootprintName;
  }
  public void setWarehouseLocationFootprintName(String warehouseLocationFootprintName) {
    this.warehouseLocationFootprintName = warehouseLocationFootprintName;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationFootprintWidth(Integer warehouseLocationFootprintWidth) {
    this.warehouseLocationFootprintWidth = warehouseLocationFootprintWidth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationFootprintWidth")
  public Integer getWarehouseLocationFootprintWidth() {
    return warehouseLocationFootprintWidth;
  }
  public void setWarehouseLocationFootprintWidth(Integer warehouseLocationFootprintWidth) {
    this.warehouseLocationFootprintWidth = warehouseLocationFootprintWidth;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationFootprintHeight(Integer warehouseLocationFootprintHeight) {
    this.warehouseLocationFootprintHeight = warehouseLocationFootprintHeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationFootprintHeight")
  public Integer getWarehouseLocationFootprintHeight() {
    return warehouseLocationFootprintHeight;
  }
  public void setWarehouseLocationFootprintHeight(Integer warehouseLocationFootprintHeight) {
    this.warehouseLocationFootprintHeight = warehouseLocationFootprintHeight;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationFootprintDepth(Integer warehouseLocationFootprintDepth) {
    this.warehouseLocationFootprintDepth = warehouseLocationFootprintDepth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationFootprintDepth")
  public Integer getWarehouseLocationFootprintDepth() {
    return warehouseLocationFootprintDepth;
  }
  public void setWarehouseLocationFootprintDepth(Integer warehouseLocationFootprintDepth) {
    this.warehouseLocationFootprintDepth = warehouseLocationFootprintDepth;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationLevel(Integer warehouseLocationLevel) {
    this.warehouseLocationLevel = warehouseLocationLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationLevel")
  public Integer getWarehouseLocationLevel() {
    return warehouseLocationLevel;
  }
  public void setWarehouseLocationLevel(Integer warehouseLocationLevel) {
    this.warehouseLocationLevel = warehouseLocationLevel;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationBay(Integer warehouseLocationBay) {
    this.warehouseLocationBay = warehouseLocationBay;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationBay")
  public Integer getWarehouseLocationBay() {
    return warehouseLocationBay;
  }
  public void setWarehouseLocationBay(Integer warehouseLocationBay) {
    this.warehouseLocationBay = warehouseLocationBay;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationNumber(Integer warehouseLocationNumber) {
    this.warehouseLocationNumber = warehouseLocationNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationNumber")
  public Integer getWarehouseLocationNumber() {
    return warehouseLocationNumber;
  }
  public void setWarehouseLocationNumber(Integer warehouseLocationNumber) {
    this.warehouseLocationNumber = warehouseLocationNumber;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationOnline(Boolean warehouseLocationOnline) {
    this.warehouseLocationOnline = warehouseLocationOnline;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationOnline")
  public Boolean getWarehouseLocationOnline() {
    return warehouseLocationOnline;
  }
  public void setWarehouseLocationOnline(Boolean warehouseLocationOnline) {
    this.warehouseLocationOnline = warehouseLocationOnline;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationPriorityCode(Integer warehouseLocationPriorityCode) {
    this.warehouseLocationPriorityCode = warehouseLocationPriorityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationPriorityCode")
  public Integer getWarehouseLocationPriorityCode() {
    return warehouseLocationPriorityCode;
  }
  public void setWarehouseLocationPriorityCode(Integer warehouseLocationPriorityCode) {
    this.warehouseLocationPriorityCode = warehouseLocationPriorityCode;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationAllowItemMixing(Boolean warehouseLocationAllowItemMixing) {
    this.warehouseLocationAllowItemMixing = warehouseLocationAllowItemMixing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationAllowItemMixing")
  public Boolean getWarehouseLocationAllowItemMixing() {
    return warehouseLocationAllowItemMixing;
  }
  public void setWarehouseLocationAllowItemMixing(Boolean warehouseLocationAllowItemMixing) {
    this.warehouseLocationAllowItemMixing = warehouseLocationAllowItemMixing;
  }

  
  /**
   **/
  public InventorySnapshot warehouseLocationCost(Integer warehouseLocationCost) {
    this.warehouseLocationCost = warehouseLocationCost;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("warehouseLocationCost")
  public Integer getWarehouseLocationCost() {
    return warehouseLocationCost;
  }
  public void setWarehouseLocationCost(Integer warehouseLocationCost) {
    this.warehouseLocationCost = warehouseLocationCost;
  }

  
  /**
   **/
  public InventorySnapshot controlNo(String controlNo) {
    this.controlNo = controlNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("controlNo")
  public String getControlNo() {
    return controlNo;
  }
  public void setControlNo(String controlNo) {
    this.controlNo = controlNo;
  }

  
  /**
   **/
  public InventorySnapshot itemVendorSku(String itemVendorSku) {
    this.itemVendorSku = itemVendorSku;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemVendorSku")
  public String getItemVendorSku() {
    return itemVendorSku;
  }
  public void setItemVendorSku(String itemVendorSku) {
    this.itemVendorSku = itemVendorSku;
  }

  
  /**
   **/
  public InventorySnapshot itemUpc(String itemUpc) {
    this.itemUpc = itemUpc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemUpc")
  public String getItemUpc() {
    return itemUpc;
  }
  public void setItemUpc(String itemUpc) {
    this.itemUpc = itemUpc;
  }

  
  /**
   **/
  public InventorySnapshot itemMajorGroup(Integer itemMajorGroup) {
    this.itemMajorGroup = itemMajorGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemMajorGroup")
  public Integer getItemMajorGroup() {
    return itemMajorGroup;
  }
  public void setItemMajorGroup(Integer itemMajorGroup) {
    this.itemMajorGroup = itemMajorGroup;
  }

  
  /**
   **/
  public InventorySnapshot itemMajorGroupName(String itemMajorGroupName) {
    this.itemMajorGroupName = itemMajorGroupName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemMajorGroupName")
  public String getItemMajorGroupName() {
    return itemMajorGroupName;
  }
  public void setItemMajorGroupName(String itemMajorGroupName) {
    this.itemMajorGroupName = itemMajorGroupName;
  }

  
  /**
   **/
  public InventorySnapshot itemSubGroup(Integer itemSubGroup) {
    this.itemSubGroup = itemSubGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemSubGroup")
  public Integer getItemSubGroup() {
    return itemSubGroup;
  }
  public void setItemSubGroup(Integer itemSubGroup) {
    this.itemSubGroup = itemSubGroup;
  }

  
  /**
   **/
  public InventorySnapshot itemSubGroupName(String itemSubGroupName) {
    this.itemSubGroupName = itemSubGroupName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemSubGroupName")
  public String getItemSubGroupName() {
    return itemSubGroupName;
  }
  public void setItemSubGroupName(String itemSubGroupName) {
    this.itemSubGroupName = itemSubGroupName;
  }

  
  /**
   **/
  public InventorySnapshot itemProductCode(Integer itemProductCode) {
    this.itemProductCode = itemProductCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemProductCode")
  public Integer getItemProductCode() {
    return itemProductCode;
  }
  public void setItemProductCode(Integer itemProductCode) {
    this.itemProductCode = itemProductCode;
  }

  
  /**
   **/
  public InventorySnapshot itemProductCodeName(String itemProductCodeName) {
    this.itemProductCodeName = itemProductCodeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemProductCodeName")
  public String getItemProductCodeName() {
    return itemProductCodeName;
  }
  public void setItemProductCodeName(String itemProductCodeName) {
    this.itemProductCodeName = itemProductCodeName;
  }

  
  /**
   **/
  public InventorySnapshot itemAccountCode(String itemAccountCode) {
    this.itemAccountCode = itemAccountCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemAccountCode")
  public String getItemAccountCode() {
    return itemAccountCode;
  }
  public void setItemAccountCode(String itemAccountCode) {
    this.itemAccountCode = itemAccountCode;
  }

  
  /**
   **/
  public InventorySnapshot itemAccountCodeName(String itemAccountCodeName) {
    this.itemAccountCodeName = itemAccountCodeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemAccountCodeName")
  public String getItemAccountCodeName() {
    return itemAccountCodeName;
  }
  public void setItemAccountCodeName(String itemAccountCodeName) {
    this.itemAccountCodeName = itemAccountCodeName;
  }

  
  /**
   **/
  public InventorySnapshot itemSummaryCode(Integer itemSummaryCode) {
    this.itemSummaryCode = itemSummaryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemSummaryCode")
  public Integer getItemSummaryCode() {
    return itemSummaryCode;
  }
  public void setItemSummaryCode(Integer itemSummaryCode) {
    this.itemSummaryCode = itemSummaryCode;
  }

  
  /**
   **/
  public InventorySnapshot itemSummaryCodeName(String itemSummaryCodeName) {
    this.itemSummaryCodeName = itemSummaryCodeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemSummaryCodeName")
  public String getItemSummaryCodeName() {
    return itemSummaryCodeName;
  }
  public void setItemSummaryCodeName(String itemSummaryCodeName) {
    this.itemSummaryCodeName = itemSummaryCodeName;
  }

  
  /**
   **/
  public InventorySnapshot itemSector(String itemSector) {
    this.itemSector = itemSector;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemSector")
  public String getItemSector() {
    return itemSector;
  }
  public void setItemSector(String itemSector) {
    this.itemSector = itemSector;
  }

  
  /**
   **/
  public InventorySnapshot poNo(String poNo) {
    this.poNo = poNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("poNo")
  public String getPoNo() {
    return poNo;
  }
  public void setPoNo(String poNo) {
    this.poNo = poNo;
  }

  
  /**
   **/
  public InventorySnapshot receiptDistributionDate(Date receiptDistributionDate) {
    this.receiptDistributionDate = receiptDistributionDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiptDistributionDate")
  public Date getReceiptDistributionDate() {
    return receiptDistributionDate;
  }
  public void setReceiptDistributionDate(Date receiptDistributionDate) {
    this.receiptDistributionDate = receiptDistributionDate;
  }

  
  /**
   **/
  public InventorySnapshot receiptUnitsPerWrap(Integer receiptUnitsPerWrap) {
    this.receiptUnitsPerWrap = receiptUnitsPerWrap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiptUnitsPerWrap")
  public Integer getReceiptUnitsPerWrap() {
    return receiptUnitsPerWrap;
  }
  public void setReceiptUnitsPerWrap(Integer receiptUnitsPerWrap) {
    this.receiptUnitsPerWrap = receiptUnitsPerWrap;
  }

  
  /**
   **/
  public InventorySnapshot receiptUnitsPerCase(Integer receiptUnitsPerCase) {
    this.receiptUnitsPerCase = receiptUnitsPerCase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiptUnitsPerCase")
  public Integer getReceiptUnitsPerCase() {
    return receiptUnitsPerCase;
  }
  public void setReceiptUnitsPerCase(Integer receiptUnitsPerCase) {
    this.receiptUnitsPerCase = receiptUnitsPerCase;
  }

  
  /**
   **/
  public InventorySnapshot receiptRevisionDate(String receiptRevisionDate) {
    this.receiptRevisionDate = receiptRevisionDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiptRevisionDate")
  public String getReceiptRevisionDate() {
    return receiptRevisionDate;
  }
  public void setReceiptRevisionDate(String receiptRevisionDate) {
    this.receiptRevisionDate = receiptRevisionDate;
  }

  
  /**
   **/
  public InventorySnapshot receiptProductionLot(String receiptProductionLot) {
    this.receiptProductionLot = receiptProductionLot;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiptProductionLot")
  public String getReceiptProductionLot() {
    return receiptProductionLot;
  }
  public void setReceiptProductionLot(String receiptProductionLot) {
    this.receiptProductionLot = receiptProductionLot;
  }

  
  /**
   **/
  public InventorySnapshot receiptReceiveDate(Date receiptReceiveDate) {
    this.receiptReceiveDate = receiptReceiveDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiptReceiveDate")
  public Date getReceiptReceiveDate() {
    return receiptReceiveDate;
  }
  public void setReceiptReceiveDate(Date receiptReceiveDate) {
    this.receiptReceiveDate = receiptReceiveDate;
  }

  
  /**
   **/
  public InventorySnapshot receiptStatus(String receiptStatus) {
    this.receiptStatus = receiptStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiptStatus")
  public String getReceiptStatus() {
    return receiptStatus;
  }
  public void setReceiptStatus(String receiptStatus) {
    this.receiptStatus = receiptStatus;
  }

  
  /**
   **/
  public InventorySnapshot receiptStatusName(String receiptStatusName) {
    this.receiptStatusName = receiptStatusName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiptStatusName")
  public String getReceiptStatusName() {
    return receiptStatusName;
  }
  public void setReceiptStatusName(String receiptStatusName) {
    this.receiptStatusName = receiptStatusName;
  }

  
  /**
   **/
  public InventorySnapshot receiptUnitCode(Integer receiptUnitCode) {
    this.receiptUnitCode = receiptUnitCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiptUnitCode")
  public Integer getReceiptUnitCode() {
    return receiptUnitCode;
  }
  public void setReceiptUnitCode(Integer receiptUnitCode) {
    this.receiptUnitCode = receiptUnitCode;
  }

  
  /**
   **/
  public InventorySnapshot receiptUnitCodeText(String receiptUnitCodeText) {
    this.receiptUnitCodeText = receiptUnitCodeText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiptUnitCodeText")
  public String getReceiptUnitCodeText() {
    return receiptUnitCodeText;
  }
  public void setReceiptUnitCodeText(String receiptUnitCodeText) {
    this.receiptUnitCodeText = receiptUnitCodeText;
  }

  
  /**
   **/
  public InventorySnapshot receiptWrapCode(Integer receiptWrapCode) {
    this.receiptWrapCode = receiptWrapCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiptWrapCode")
  public Integer getReceiptWrapCode() {
    return receiptWrapCode;
  }
  public void setReceiptWrapCode(Integer receiptWrapCode) {
    this.receiptWrapCode = receiptWrapCode;
  }

  
  /**
   **/
  public InventorySnapshot receiptWrapCodeText(String receiptWrapCodeText) {
    this.receiptWrapCodeText = receiptWrapCodeText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiptWrapCodeText")
  public String getReceiptWrapCodeText() {
    return receiptWrapCodeText;
  }
  public void setReceiptWrapCodeText(String receiptWrapCodeText) {
    this.receiptWrapCodeText = receiptWrapCodeText;
  }

  
  /**
   **/
  public InventorySnapshot receiptCaseWeight(BigDecimal receiptCaseWeight) {
    this.receiptCaseWeight = receiptCaseWeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiptCaseWeight")
  public BigDecimal getReceiptCaseWeight() {
    return receiptCaseWeight;
  }
  public void setReceiptCaseWeight(BigDecimal receiptCaseWeight) {
    this.receiptCaseWeight = receiptCaseWeight;
  }

  
  /**
   **/
  public InventorySnapshot receiptProductIdTag(String receiptProductIdTag) {
    this.receiptProductIdTag = receiptProductIdTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receiptProductIdTag")
  public String getReceiptProductIdTag() {
    return receiptProductIdTag;
  }
  public void setReceiptProductIdTag(String receiptProductIdTag) {
    this.receiptProductIdTag = receiptProductIdTag;
  }

  
  /**
   **/
  public InventorySnapshot alcoholType(String alcoholType) {
    this.alcoholType = alcoholType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholType")
  public String getAlcoholType() {
    return alcoholType;
  }
  public void setAlcoholType(String alcoholType) {
    this.alcoholType = alcoholType;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholTypeName")
  public String getAlcoholTypeName() {
    return alcoholTypeName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholContent")
  public BigDecimal getAlcoholContent() {
    return alcoholContent;
  }

  
  /**
   **/
  public InventorySnapshot alcoholContainer(String alcoholContainer) {
    this.alcoholContainer = alcoholContainer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholContainer")
  public String getAlcoholContainer() {
    return alcoholContainer;
  }
  public void setAlcoholContainer(String alcoholContainer) {
    this.alcoholContainer = alcoholContainer;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholContainerName")
  public String getAlcoholContainerName() {
    return alcoholContainerName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholContainerVolume")
  public Integer getAlcoholContainerVolume() {
    return alcoholContainerVolume;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholVintageYear")
  public String getAlcoholVintageYear() {
    return alcoholVintageYear;
  }

  
  /**
   **/
  public InventorySnapshot alcoholCountry(String alcoholCountry) {
    this.alcoholCountry = alcoholCountry;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholCountry")
  public String getAlcoholCountry() {
    return alcoholCountry;
  }
  public void setAlcoholCountry(String alcoholCountry) {
    this.alcoholCountry = alcoholCountry;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholCountryName")
  public String getAlcoholCountryName() {
    return alcoholCountryName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholState")
  public String getAlcoholState() {
    return alcoholState;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholRegion")
  public String getAlcoholRegion() {
    return alcoholRegion;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholBrand")
  public String getAlcoholBrand() {
    return alcoholBrand;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholUPCCode")
  public String getAlcoholUPCCode() {
    return alcoholUPCCode;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholNABCACode")
  public String getAlcoholNABCACode() {
    return alcoholNABCACode;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholUNIMERCCode")
  public String getAlcoholUNIMERCCode() {
    return alcoholUNIMERCCode;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholSCCCode")
  public String getAlcoholSCCCode() {
    return alcoholSCCCode;
  }

  
  /**
   **/
  public InventorySnapshot customFields(Map<String, Object> customFields) {
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
    InventorySnapshot inventorySnapshot = (InventorySnapshot) o;
    return Objects.equals(this.id, inventorySnapshot.id) &&
        Objects.equals(this.warehouseLocationId, inventorySnapshot.warehouseLocationId) &&
        Objects.equals(this.itemId, inventorySnapshot.itemId) &&
        Objects.equals(this.lobId, inventorySnapshot.lobId) &&
        Objects.equals(this.snapshotDate, inventorySnapshot.snapshotDate) &&
        Objects.equals(this.isMixedReceipts, inventorySnapshot.isMixedReceipts) &&
        Objects.equals(this.quantity, inventorySnapshot.quantity) &&
        Objects.equals(this.address, inventorySnapshot.address) &&
        Objects.equals(this.warehouseId, inventorySnapshot.warehouseId) &&
        Objects.equals(this.warehouseName, inventorySnapshot.warehouseName) &&
        Objects.equals(this.warehouseZoneId, inventorySnapshot.warehouseZoneId) &&
        Objects.equals(this.warehouseZoneName, inventorySnapshot.warehouseZoneName) &&
        Objects.equals(this.warehouseZoneAddress, inventorySnapshot.warehouseZoneAddress) &&
        Objects.equals(this.warehouseBuildingId, inventorySnapshot.warehouseBuildingId) &&
        Objects.equals(this.warehouseBuildingName, inventorySnapshot.warehouseBuildingName) &&
        Objects.equals(this.warehouseAisleId, inventorySnapshot.warehouseAisleId) &&
        Objects.equals(this.warehouseAisleAddress, inventorySnapshot.warehouseAisleAddress) &&
        Objects.equals(this.warehouseLocationOriginId, inventorySnapshot.warehouseLocationOriginId) &&
        Objects.equals(this.warehouseLocationOriginName, inventorySnapshot.warehouseLocationOriginName) &&
        Objects.equals(this.warehouseLocationBillingTypeId, inventorySnapshot.warehouseLocationBillingTypeId) &&
        Objects.equals(this.warehouseLocationBillingTypeName, inventorySnapshot.warehouseLocationBillingTypeName) &&
        Objects.equals(this.warehouseLocationBehaviorTypeId, inventorySnapshot.warehouseLocationBehaviorTypeId) &&
        Objects.equals(this.warehouseLocationBehaviorTypeName, inventorySnapshot.warehouseLocationBehaviorTypeName) &&
        Objects.equals(this.warehouseLocationFootprintId, inventorySnapshot.warehouseLocationFootprintId) &&
        Objects.equals(this.warehouseLocationFootprintName, inventorySnapshot.warehouseLocationFootprintName) &&
        Objects.equals(this.warehouseLocationFootprintWidth, inventorySnapshot.warehouseLocationFootprintWidth) &&
        Objects.equals(this.warehouseLocationFootprintHeight, inventorySnapshot.warehouseLocationFootprintHeight) &&
        Objects.equals(this.warehouseLocationFootprintDepth, inventorySnapshot.warehouseLocationFootprintDepth) &&
        Objects.equals(this.warehouseLocationLevel, inventorySnapshot.warehouseLocationLevel) &&
        Objects.equals(this.warehouseLocationBay, inventorySnapshot.warehouseLocationBay) &&
        Objects.equals(this.warehouseLocationNumber, inventorySnapshot.warehouseLocationNumber) &&
        Objects.equals(this.warehouseLocationOnline, inventorySnapshot.warehouseLocationOnline) &&
        Objects.equals(this.warehouseLocationPriorityCode, inventorySnapshot.warehouseLocationPriorityCode) &&
        Objects.equals(this.warehouseLocationAllowItemMixing, inventorySnapshot.warehouseLocationAllowItemMixing) &&
        Objects.equals(this.warehouseLocationCost, inventorySnapshot.warehouseLocationCost) &&
        Objects.equals(this.controlNo, inventorySnapshot.controlNo) &&
        Objects.equals(this.itemVendorSku, inventorySnapshot.itemVendorSku) &&
        Objects.equals(this.itemUpc, inventorySnapshot.itemUpc) &&
        Objects.equals(this.itemMajorGroup, inventorySnapshot.itemMajorGroup) &&
        Objects.equals(this.itemMajorGroupName, inventorySnapshot.itemMajorGroupName) &&
        Objects.equals(this.itemSubGroup, inventorySnapshot.itemSubGroup) &&
        Objects.equals(this.itemSubGroupName, inventorySnapshot.itemSubGroupName) &&
        Objects.equals(this.itemProductCode, inventorySnapshot.itemProductCode) &&
        Objects.equals(this.itemProductCodeName, inventorySnapshot.itemProductCodeName) &&
        Objects.equals(this.itemAccountCode, inventorySnapshot.itemAccountCode) &&
        Objects.equals(this.itemAccountCodeName, inventorySnapshot.itemAccountCodeName) &&
        Objects.equals(this.itemSummaryCode, inventorySnapshot.itemSummaryCode) &&
        Objects.equals(this.itemSummaryCodeName, inventorySnapshot.itemSummaryCodeName) &&
        Objects.equals(this.itemSector, inventorySnapshot.itemSector) &&
        Objects.equals(this.poNo, inventorySnapshot.poNo) &&
        Objects.equals(this.receiptDistributionDate, inventorySnapshot.receiptDistributionDate) &&
        Objects.equals(this.receiptUnitsPerWrap, inventorySnapshot.receiptUnitsPerWrap) &&
        Objects.equals(this.receiptUnitsPerCase, inventorySnapshot.receiptUnitsPerCase) &&
        Objects.equals(this.receiptRevisionDate, inventorySnapshot.receiptRevisionDate) &&
        Objects.equals(this.receiptProductionLot, inventorySnapshot.receiptProductionLot) &&
        Objects.equals(this.receiptReceiveDate, inventorySnapshot.receiptReceiveDate) &&
        Objects.equals(this.receiptStatus, inventorySnapshot.receiptStatus) &&
        Objects.equals(this.receiptStatusName, inventorySnapshot.receiptStatusName) &&
        Objects.equals(this.receiptUnitCode, inventorySnapshot.receiptUnitCode) &&
        Objects.equals(this.receiptUnitCodeText, inventorySnapshot.receiptUnitCodeText) &&
        Objects.equals(this.receiptWrapCode, inventorySnapshot.receiptWrapCode) &&
        Objects.equals(this.receiptWrapCodeText, inventorySnapshot.receiptWrapCodeText) &&
        Objects.equals(this.receiptCaseWeight, inventorySnapshot.receiptCaseWeight) &&
        Objects.equals(this.receiptProductIdTag, inventorySnapshot.receiptProductIdTag) &&
        Objects.equals(this.alcoholType, inventorySnapshot.alcoholType) &&
        Objects.equals(this.alcoholTypeName, inventorySnapshot.alcoholTypeName) &&
        Objects.equals(this.alcoholContent, inventorySnapshot.alcoholContent) &&
        Objects.equals(this.alcoholContainer, inventorySnapshot.alcoholContainer) &&
        Objects.equals(this.alcoholContainerName, inventorySnapshot.alcoholContainerName) &&
        Objects.equals(this.alcoholContainerVolume, inventorySnapshot.alcoholContainerVolume) &&
        Objects.equals(this.alcoholVintageYear, inventorySnapshot.alcoholVintageYear) &&
        Objects.equals(this.alcoholCountry, inventorySnapshot.alcoholCountry) &&
        Objects.equals(this.alcoholCountryName, inventorySnapshot.alcoholCountryName) &&
        Objects.equals(this.alcoholState, inventorySnapshot.alcoholState) &&
        Objects.equals(this.alcoholRegion, inventorySnapshot.alcoholRegion) &&
        Objects.equals(this.alcoholBrand, inventorySnapshot.alcoholBrand) &&
        Objects.equals(this.alcoholUPCCode, inventorySnapshot.alcoholUPCCode) &&
        Objects.equals(this.alcoholNABCACode, inventorySnapshot.alcoholNABCACode) &&
        Objects.equals(this.alcoholUNIMERCCode, inventorySnapshot.alcoholUNIMERCCode) &&
        Objects.equals(this.alcoholSCCCode, inventorySnapshot.alcoholSCCCode) &&
        Objects.equals(this.customFields, inventorySnapshot.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseLocationId, itemId, lobId, snapshotDate, isMixedReceipts, quantity, address, warehouseId, warehouseName, warehouseZoneId, warehouseZoneName, warehouseZoneAddress, warehouseBuildingId, warehouseBuildingName, warehouseAisleId, warehouseAisleAddress, warehouseLocationOriginId, warehouseLocationOriginName, warehouseLocationBillingTypeId, warehouseLocationBillingTypeName, warehouseLocationBehaviorTypeId, warehouseLocationBehaviorTypeName, warehouseLocationFootprintId, warehouseLocationFootprintName, warehouseLocationFootprintWidth, warehouseLocationFootprintHeight, warehouseLocationFootprintDepth, warehouseLocationLevel, warehouseLocationBay, warehouseLocationNumber, warehouseLocationOnline, warehouseLocationPriorityCode, warehouseLocationAllowItemMixing, warehouseLocationCost, controlNo, itemVendorSku, itemUpc, itemMajorGroup, itemMajorGroupName, itemSubGroup, itemSubGroupName, itemProductCode, itemProductCodeName, itemAccountCode, itemAccountCodeName, itemSummaryCode, itemSummaryCodeName, itemSector, poNo, receiptDistributionDate, receiptUnitsPerWrap, receiptUnitsPerCase, receiptRevisionDate, receiptProductionLot, receiptReceiveDate, receiptStatus, receiptStatusName, receiptUnitCode, receiptUnitCodeText, receiptWrapCode, receiptWrapCodeText, receiptCaseWeight, receiptProductIdTag, alcoholType, alcoholTypeName, alcoholContent, alcoholContainer, alcoholContainerName, alcoholContainerVolume, alcoholVintageYear, alcoholCountry, alcoholCountryName, alcoholState, alcoholRegion, alcoholBrand, alcoholUPCCode, alcoholNABCACode, alcoholUNIMERCCode, alcoholSCCCode, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventorySnapshot {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouseLocationId: ").append(toIndentedString(warehouseLocationId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    snapshotDate: ").append(toIndentedString(snapshotDate)).append("\n");
    sb.append("    isMixedReceipts: ").append(toIndentedString(isMixedReceipts)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    warehouseName: ").append(toIndentedString(warehouseName)).append("\n");
    sb.append("    warehouseZoneId: ").append(toIndentedString(warehouseZoneId)).append("\n");
    sb.append("    warehouseZoneName: ").append(toIndentedString(warehouseZoneName)).append("\n");
    sb.append("    warehouseZoneAddress: ").append(toIndentedString(warehouseZoneAddress)).append("\n");
    sb.append("    warehouseBuildingId: ").append(toIndentedString(warehouseBuildingId)).append("\n");
    sb.append("    warehouseBuildingName: ").append(toIndentedString(warehouseBuildingName)).append("\n");
    sb.append("    warehouseAisleId: ").append(toIndentedString(warehouseAisleId)).append("\n");
    sb.append("    warehouseAisleAddress: ").append(toIndentedString(warehouseAisleAddress)).append("\n");
    sb.append("    warehouseLocationOriginId: ").append(toIndentedString(warehouseLocationOriginId)).append("\n");
    sb.append("    warehouseLocationOriginName: ").append(toIndentedString(warehouseLocationOriginName)).append("\n");
    sb.append("    warehouseLocationBillingTypeId: ").append(toIndentedString(warehouseLocationBillingTypeId)).append("\n");
    sb.append("    warehouseLocationBillingTypeName: ").append(toIndentedString(warehouseLocationBillingTypeName)).append("\n");
    sb.append("    warehouseLocationBehaviorTypeId: ").append(toIndentedString(warehouseLocationBehaviorTypeId)).append("\n");
    sb.append("    warehouseLocationBehaviorTypeName: ").append(toIndentedString(warehouseLocationBehaviorTypeName)).append("\n");
    sb.append("    warehouseLocationFootprintId: ").append(toIndentedString(warehouseLocationFootprintId)).append("\n");
    sb.append("    warehouseLocationFootprintName: ").append(toIndentedString(warehouseLocationFootprintName)).append("\n");
    sb.append("    warehouseLocationFootprintWidth: ").append(toIndentedString(warehouseLocationFootprintWidth)).append("\n");
    sb.append("    warehouseLocationFootprintHeight: ").append(toIndentedString(warehouseLocationFootprintHeight)).append("\n");
    sb.append("    warehouseLocationFootprintDepth: ").append(toIndentedString(warehouseLocationFootprintDepth)).append("\n");
    sb.append("    warehouseLocationLevel: ").append(toIndentedString(warehouseLocationLevel)).append("\n");
    sb.append("    warehouseLocationBay: ").append(toIndentedString(warehouseLocationBay)).append("\n");
    sb.append("    warehouseLocationNumber: ").append(toIndentedString(warehouseLocationNumber)).append("\n");
    sb.append("    warehouseLocationOnline: ").append(toIndentedString(warehouseLocationOnline)).append("\n");
    sb.append("    warehouseLocationPriorityCode: ").append(toIndentedString(warehouseLocationPriorityCode)).append("\n");
    sb.append("    warehouseLocationAllowItemMixing: ").append(toIndentedString(warehouseLocationAllowItemMixing)).append("\n");
    sb.append("    warehouseLocationCost: ").append(toIndentedString(warehouseLocationCost)).append("\n");
    sb.append("    controlNo: ").append(toIndentedString(controlNo)).append("\n");
    sb.append("    itemVendorSku: ").append(toIndentedString(itemVendorSku)).append("\n");
    sb.append("    itemUpc: ").append(toIndentedString(itemUpc)).append("\n");
    sb.append("    itemMajorGroup: ").append(toIndentedString(itemMajorGroup)).append("\n");
    sb.append("    itemMajorGroupName: ").append(toIndentedString(itemMajorGroupName)).append("\n");
    sb.append("    itemSubGroup: ").append(toIndentedString(itemSubGroup)).append("\n");
    sb.append("    itemSubGroupName: ").append(toIndentedString(itemSubGroupName)).append("\n");
    sb.append("    itemProductCode: ").append(toIndentedString(itemProductCode)).append("\n");
    sb.append("    itemProductCodeName: ").append(toIndentedString(itemProductCodeName)).append("\n");
    sb.append("    itemAccountCode: ").append(toIndentedString(itemAccountCode)).append("\n");
    sb.append("    itemAccountCodeName: ").append(toIndentedString(itemAccountCodeName)).append("\n");
    sb.append("    itemSummaryCode: ").append(toIndentedString(itemSummaryCode)).append("\n");
    sb.append("    itemSummaryCodeName: ").append(toIndentedString(itemSummaryCodeName)).append("\n");
    sb.append("    itemSector: ").append(toIndentedString(itemSector)).append("\n");
    sb.append("    poNo: ").append(toIndentedString(poNo)).append("\n");
    sb.append("    receiptDistributionDate: ").append(toIndentedString(receiptDistributionDate)).append("\n");
    sb.append("    receiptUnitsPerWrap: ").append(toIndentedString(receiptUnitsPerWrap)).append("\n");
    sb.append("    receiptUnitsPerCase: ").append(toIndentedString(receiptUnitsPerCase)).append("\n");
    sb.append("    receiptRevisionDate: ").append(toIndentedString(receiptRevisionDate)).append("\n");
    sb.append("    receiptProductionLot: ").append(toIndentedString(receiptProductionLot)).append("\n");
    sb.append("    receiptReceiveDate: ").append(toIndentedString(receiptReceiveDate)).append("\n");
    sb.append("    receiptStatus: ").append(toIndentedString(receiptStatus)).append("\n");
    sb.append("    receiptStatusName: ").append(toIndentedString(receiptStatusName)).append("\n");
    sb.append("    receiptUnitCode: ").append(toIndentedString(receiptUnitCode)).append("\n");
    sb.append("    receiptUnitCodeText: ").append(toIndentedString(receiptUnitCodeText)).append("\n");
    sb.append("    receiptWrapCode: ").append(toIndentedString(receiptWrapCode)).append("\n");
    sb.append("    receiptWrapCodeText: ").append(toIndentedString(receiptWrapCodeText)).append("\n");
    sb.append("    receiptCaseWeight: ").append(toIndentedString(receiptCaseWeight)).append("\n");
    sb.append("    receiptProductIdTag: ").append(toIndentedString(receiptProductIdTag)).append("\n");
    sb.append("    alcoholType: ").append(toIndentedString(alcoholType)).append("\n");
    sb.append("    alcoholTypeName: ").append(toIndentedString(alcoholTypeName)).append("\n");
    sb.append("    alcoholContent: ").append(toIndentedString(alcoholContent)).append("\n");
    sb.append("    alcoholContainer: ").append(toIndentedString(alcoholContainer)).append("\n");
    sb.append("    alcoholContainerName: ").append(toIndentedString(alcoholContainerName)).append("\n");
    sb.append("    alcoholContainerVolume: ").append(toIndentedString(alcoholContainerVolume)).append("\n");
    sb.append("    alcoholVintageYear: ").append(toIndentedString(alcoholVintageYear)).append("\n");
    sb.append("    alcoholCountry: ").append(toIndentedString(alcoholCountry)).append("\n");
    sb.append("    alcoholCountryName: ").append(toIndentedString(alcoholCountryName)).append("\n");
    sb.append("    alcoholState: ").append(toIndentedString(alcoholState)).append("\n");
    sb.append("    alcoholRegion: ").append(toIndentedString(alcoholRegion)).append("\n");
    sb.append("    alcoholBrand: ").append(toIndentedString(alcoholBrand)).append("\n");
    sb.append("    alcoholUPCCode: ").append(toIndentedString(alcoholUPCCode)).append("\n");
    sb.append("    alcoholNABCACode: ").append(toIndentedString(alcoholNABCACode)).append("\n");
    sb.append("    alcoholUNIMERCCode: ").append(toIndentedString(alcoholUNIMERCCode)).append("\n");
    sb.append("    alcoholSCCCode: ").append(toIndentedString(alcoholSCCCode)).append("\n");
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

