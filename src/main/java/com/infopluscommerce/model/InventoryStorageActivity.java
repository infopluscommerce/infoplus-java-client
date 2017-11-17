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





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class InventoryStorageActivity   {
  
  private Integer id = null;
  private Integer importedRecordId = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer warehouseLocationId = null;
  private Integer itemId = null;
  private Integer lobId = null;
  private Date snapshotDate = null;
  private Boolean isMixedReceipts = false;
  private Integer quantity = null;
  private String address = null;
  private Integer numberOfCases = null;
  private BigDecimal inventoryValue = null;
  private Integer inventoryAgeDays = null;
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
  private String sku = null;
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
  private Integer alcoholTypeId = null;
  private String alcoholTypeName = null;
  private BigDecimal alcoholContent = null;
  private Integer alcoholContainerId = null;
  private String alcoholContainerName = null;
  private Integer alcoholContainerVolume = null;
  private String alcoholVintageYear = null;
  private Integer alcoholCountryId = null;
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
  @JsonProperty("importedRecordId")
  public Integer getImportedRecordId() {
    return importedRecordId;
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
  public InventoryStorageActivity lobId(Integer lobId) {
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
  public InventoryStorageActivity isMixedReceipts(Boolean isMixedReceipts) {
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
  public InventoryStorageActivity quantity(Integer quantity) {
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
  public InventoryStorageActivity address(String address) {
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
  public InventoryStorageActivity numberOfCases(Integer numberOfCases) {
    this.numberOfCases = numberOfCases;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfCases")
  public Integer getNumberOfCases() {
    return numberOfCases;
  }
  public void setNumberOfCases(Integer numberOfCases) {
    this.numberOfCases = numberOfCases;
  }

  
  /**
   **/
  public InventoryStorageActivity inventoryValue(BigDecimal inventoryValue) {
    this.inventoryValue = inventoryValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inventoryValue")
  public BigDecimal getInventoryValue() {
    return inventoryValue;
  }
  public void setInventoryValue(BigDecimal inventoryValue) {
    this.inventoryValue = inventoryValue;
  }

  
  /**
   **/
  public InventoryStorageActivity inventoryAgeDays(Integer inventoryAgeDays) {
    this.inventoryAgeDays = inventoryAgeDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inventoryAgeDays")
  public Integer getInventoryAgeDays() {
    return inventoryAgeDays;
  }
  public void setInventoryAgeDays(Integer inventoryAgeDays) {
    this.inventoryAgeDays = inventoryAgeDays;
  }

  
  /**
   **/
  public InventoryStorageActivity warehouseId(Integer warehouseId) {
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
  public InventoryStorageActivity warehouseName(String warehouseName) {
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
  public InventoryStorageActivity warehouseZoneId(Integer warehouseZoneId) {
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
  public InventoryStorageActivity warehouseZoneName(String warehouseZoneName) {
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
  public InventoryStorageActivity warehouseZoneAddress(String warehouseZoneAddress) {
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
  public InventoryStorageActivity warehouseBuildingId(Integer warehouseBuildingId) {
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
  public InventoryStorageActivity warehouseBuildingName(String warehouseBuildingName) {
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
  public InventoryStorageActivity warehouseAisleId(Integer warehouseAisleId) {
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
  public InventoryStorageActivity warehouseAisleAddress(String warehouseAisleAddress) {
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
  public InventoryStorageActivity warehouseLocationOriginId(Integer warehouseLocationOriginId) {
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
  public InventoryStorageActivity warehouseLocationOriginName(String warehouseLocationOriginName) {
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
  public InventoryStorageActivity warehouseLocationBillingTypeId(Integer warehouseLocationBillingTypeId) {
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
  public InventoryStorageActivity warehouseLocationBillingTypeName(String warehouseLocationBillingTypeName) {
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
  public InventoryStorageActivity warehouseLocationBehaviorTypeId(Integer warehouseLocationBehaviorTypeId) {
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
  public InventoryStorageActivity warehouseLocationBehaviorTypeName(String warehouseLocationBehaviorTypeName) {
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
  public InventoryStorageActivity warehouseLocationFootprintId(Integer warehouseLocationFootprintId) {
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
  public InventoryStorageActivity warehouseLocationFootprintName(String warehouseLocationFootprintName) {
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
  public InventoryStorageActivity warehouseLocationFootprintWidth(Integer warehouseLocationFootprintWidth) {
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
  public InventoryStorageActivity warehouseLocationFootprintHeight(Integer warehouseLocationFootprintHeight) {
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
  public InventoryStorageActivity warehouseLocationFootprintDepth(Integer warehouseLocationFootprintDepth) {
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
  public InventoryStorageActivity warehouseLocationLevel(Integer warehouseLocationLevel) {
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
  public InventoryStorageActivity warehouseLocationBay(Integer warehouseLocationBay) {
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
  public InventoryStorageActivity warehouseLocationNumber(Integer warehouseLocationNumber) {
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
  public InventoryStorageActivity warehouseLocationOnline(Boolean warehouseLocationOnline) {
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
  public InventoryStorageActivity warehouseLocationPriorityCode(Integer warehouseLocationPriorityCode) {
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
  public InventoryStorageActivity warehouseLocationAllowItemMixing(Boolean warehouseLocationAllowItemMixing) {
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
  public InventoryStorageActivity warehouseLocationCost(Integer warehouseLocationCost) {
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
  public InventoryStorageActivity sku(String sku) {
    this.sku = sku;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  
  /**
   **/
  public InventoryStorageActivity itemVendorSku(String itemVendorSku) {
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
  public InventoryStorageActivity itemUpc(String itemUpc) {
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
  public InventoryStorageActivity itemMajorGroup(Integer itemMajorGroup) {
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
  public InventoryStorageActivity itemMajorGroupName(String itemMajorGroupName) {
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
  public InventoryStorageActivity itemSubGroup(Integer itemSubGroup) {
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
  public InventoryStorageActivity itemSubGroupName(String itemSubGroupName) {
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
  public InventoryStorageActivity itemProductCode(Integer itemProductCode) {
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
  public InventoryStorageActivity itemProductCodeName(String itemProductCodeName) {
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
  public InventoryStorageActivity itemAccountCode(String itemAccountCode) {
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
  public InventoryStorageActivity itemAccountCodeName(String itemAccountCodeName) {
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
  public InventoryStorageActivity itemSummaryCode(Integer itemSummaryCode) {
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
  public InventoryStorageActivity itemSummaryCodeName(String itemSummaryCodeName) {
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
  public InventoryStorageActivity itemSector(String itemSector) {
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
  public InventoryStorageActivity poNo(String poNo) {
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
  public InventoryStorageActivity receiptDistributionDate(Date receiptDistributionDate) {
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
  public InventoryStorageActivity receiptUnitsPerWrap(Integer receiptUnitsPerWrap) {
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
  public InventoryStorageActivity receiptUnitsPerCase(Integer receiptUnitsPerCase) {
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
  public InventoryStorageActivity receiptRevisionDate(String receiptRevisionDate) {
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
  public InventoryStorageActivity receiptProductionLot(String receiptProductionLot) {
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
  public InventoryStorageActivity receiptReceiveDate(Date receiptReceiveDate) {
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
  public InventoryStorageActivity receiptStatus(String receiptStatus) {
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
  public InventoryStorageActivity receiptStatusName(String receiptStatusName) {
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
  public InventoryStorageActivity receiptUnitCode(Integer receiptUnitCode) {
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
  public InventoryStorageActivity receiptUnitCodeText(String receiptUnitCodeText) {
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
  public InventoryStorageActivity receiptWrapCode(Integer receiptWrapCode) {
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
  public InventoryStorageActivity receiptWrapCodeText(String receiptWrapCodeText) {
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
  public InventoryStorageActivity receiptCaseWeight(BigDecimal receiptCaseWeight) {
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
  public InventoryStorageActivity receiptProductIdTag(String receiptProductIdTag) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholTypeId")
  public Integer getAlcoholTypeId() {
    return alcoholTypeId;
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholContainerId")
  public Integer getAlcoholContainerId() {
    return alcoholContainerId;
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alcoholCountryId")
  public Integer getAlcoholCountryId() {
    return alcoholCountryId;
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
  public InventoryStorageActivity customFields(Map<String, Object> customFields) {
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
    InventoryStorageActivity inventoryStorageActivity = (InventoryStorageActivity) o;
    return Objects.equals(this.id, inventoryStorageActivity.id) &&
        Objects.equals(this.importedRecordId, inventoryStorageActivity.importedRecordId) &&
        Objects.equals(this.createDate, inventoryStorageActivity.createDate) &&
        Objects.equals(this.modifyDate, inventoryStorageActivity.modifyDate) &&
        Objects.equals(this.warehouseLocationId, inventoryStorageActivity.warehouseLocationId) &&
        Objects.equals(this.itemId, inventoryStorageActivity.itemId) &&
        Objects.equals(this.lobId, inventoryStorageActivity.lobId) &&
        Objects.equals(this.snapshotDate, inventoryStorageActivity.snapshotDate) &&
        Objects.equals(this.isMixedReceipts, inventoryStorageActivity.isMixedReceipts) &&
        Objects.equals(this.quantity, inventoryStorageActivity.quantity) &&
        Objects.equals(this.address, inventoryStorageActivity.address) &&
        Objects.equals(this.numberOfCases, inventoryStorageActivity.numberOfCases) &&
        Objects.equals(this.inventoryValue, inventoryStorageActivity.inventoryValue) &&
        Objects.equals(this.inventoryAgeDays, inventoryStorageActivity.inventoryAgeDays) &&
        Objects.equals(this.warehouseId, inventoryStorageActivity.warehouseId) &&
        Objects.equals(this.warehouseName, inventoryStorageActivity.warehouseName) &&
        Objects.equals(this.warehouseZoneId, inventoryStorageActivity.warehouseZoneId) &&
        Objects.equals(this.warehouseZoneName, inventoryStorageActivity.warehouseZoneName) &&
        Objects.equals(this.warehouseZoneAddress, inventoryStorageActivity.warehouseZoneAddress) &&
        Objects.equals(this.warehouseBuildingId, inventoryStorageActivity.warehouseBuildingId) &&
        Objects.equals(this.warehouseBuildingName, inventoryStorageActivity.warehouseBuildingName) &&
        Objects.equals(this.warehouseAisleId, inventoryStorageActivity.warehouseAisleId) &&
        Objects.equals(this.warehouseAisleAddress, inventoryStorageActivity.warehouseAisleAddress) &&
        Objects.equals(this.warehouseLocationOriginId, inventoryStorageActivity.warehouseLocationOriginId) &&
        Objects.equals(this.warehouseLocationOriginName, inventoryStorageActivity.warehouseLocationOriginName) &&
        Objects.equals(this.warehouseLocationBillingTypeId, inventoryStorageActivity.warehouseLocationBillingTypeId) &&
        Objects.equals(this.warehouseLocationBillingTypeName, inventoryStorageActivity.warehouseLocationBillingTypeName) &&
        Objects.equals(this.warehouseLocationBehaviorTypeId, inventoryStorageActivity.warehouseLocationBehaviorTypeId) &&
        Objects.equals(this.warehouseLocationBehaviorTypeName, inventoryStorageActivity.warehouseLocationBehaviorTypeName) &&
        Objects.equals(this.warehouseLocationFootprintId, inventoryStorageActivity.warehouseLocationFootprintId) &&
        Objects.equals(this.warehouseLocationFootprintName, inventoryStorageActivity.warehouseLocationFootprintName) &&
        Objects.equals(this.warehouseLocationFootprintWidth, inventoryStorageActivity.warehouseLocationFootprintWidth) &&
        Objects.equals(this.warehouseLocationFootprintHeight, inventoryStorageActivity.warehouseLocationFootprintHeight) &&
        Objects.equals(this.warehouseLocationFootprintDepth, inventoryStorageActivity.warehouseLocationFootprintDepth) &&
        Objects.equals(this.warehouseLocationLevel, inventoryStorageActivity.warehouseLocationLevel) &&
        Objects.equals(this.warehouseLocationBay, inventoryStorageActivity.warehouseLocationBay) &&
        Objects.equals(this.warehouseLocationNumber, inventoryStorageActivity.warehouseLocationNumber) &&
        Objects.equals(this.warehouseLocationOnline, inventoryStorageActivity.warehouseLocationOnline) &&
        Objects.equals(this.warehouseLocationPriorityCode, inventoryStorageActivity.warehouseLocationPriorityCode) &&
        Objects.equals(this.warehouseLocationAllowItemMixing, inventoryStorageActivity.warehouseLocationAllowItemMixing) &&
        Objects.equals(this.warehouseLocationCost, inventoryStorageActivity.warehouseLocationCost) &&
        Objects.equals(this.sku, inventoryStorageActivity.sku) &&
        Objects.equals(this.itemVendorSku, inventoryStorageActivity.itemVendorSku) &&
        Objects.equals(this.itemUpc, inventoryStorageActivity.itemUpc) &&
        Objects.equals(this.itemMajorGroup, inventoryStorageActivity.itemMajorGroup) &&
        Objects.equals(this.itemMajorGroupName, inventoryStorageActivity.itemMajorGroupName) &&
        Objects.equals(this.itemSubGroup, inventoryStorageActivity.itemSubGroup) &&
        Objects.equals(this.itemSubGroupName, inventoryStorageActivity.itemSubGroupName) &&
        Objects.equals(this.itemProductCode, inventoryStorageActivity.itemProductCode) &&
        Objects.equals(this.itemProductCodeName, inventoryStorageActivity.itemProductCodeName) &&
        Objects.equals(this.itemAccountCode, inventoryStorageActivity.itemAccountCode) &&
        Objects.equals(this.itemAccountCodeName, inventoryStorageActivity.itemAccountCodeName) &&
        Objects.equals(this.itemSummaryCode, inventoryStorageActivity.itemSummaryCode) &&
        Objects.equals(this.itemSummaryCodeName, inventoryStorageActivity.itemSummaryCodeName) &&
        Objects.equals(this.itemSector, inventoryStorageActivity.itemSector) &&
        Objects.equals(this.poNo, inventoryStorageActivity.poNo) &&
        Objects.equals(this.receiptDistributionDate, inventoryStorageActivity.receiptDistributionDate) &&
        Objects.equals(this.receiptUnitsPerWrap, inventoryStorageActivity.receiptUnitsPerWrap) &&
        Objects.equals(this.receiptUnitsPerCase, inventoryStorageActivity.receiptUnitsPerCase) &&
        Objects.equals(this.receiptRevisionDate, inventoryStorageActivity.receiptRevisionDate) &&
        Objects.equals(this.receiptProductionLot, inventoryStorageActivity.receiptProductionLot) &&
        Objects.equals(this.receiptReceiveDate, inventoryStorageActivity.receiptReceiveDate) &&
        Objects.equals(this.receiptStatus, inventoryStorageActivity.receiptStatus) &&
        Objects.equals(this.receiptStatusName, inventoryStorageActivity.receiptStatusName) &&
        Objects.equals(this.receiptUnitCode, inventoryStorageActivity.receiptUnitCode) &&
        Objects.equals(this.receiptUnitCodeText, inventoryStorageActivity.receiptUnitCodeText) &&
        Objects.equals(this.receiptWrapCode, inventoryStorageActivity.receiptWrapCode) &&
        Objects.equals(this.receiptWrapCodeText, inventoryStorageActivity.receiptWrapCodeText) &&
        Objects.equals(this.receiptCaseWeight, inventoryStorageActivity.receiptCaseWeight) &&
        Objects.equals(this.receiptProductIdTag, inventoryStorageActivity.receiptProductIdTag) &&
        Objects.equals(this.alcoholTypeId, inventoryStorageActivity.alcoholTypeId) &&
        Objects.equals(this.alcoholTypeName, inventoryStorageActivity.alcoholTypeName) &&
        Objects.equals(this.alcoholContent, inventoryStorageActivity.alcoholContent) &&
        Objects.equals(this.alcoholContainerId, inventoryStorageActivity.alcoholContainerId) &&
        Objects.equals(this.alcoholContainerName, inventoryStorageActivity.alcoholContainerName) &&
        Objects.equals(this.alcoholContainerVolume, inventoryStorageActivity.alcoholContainerVolume) &&
        Objects.equals(this.alcoholVintageYear, inventoryStorageActivity.alcoholVintageYear) &&
        Objects.equals(this.alcoholCountryId, inventoryStorageActivity.alcoholCountryId) &&
        Objects.equals(this.alcoholCountryName, inventoryStorageActivity.alcoholCountryName) &&
        Objects.equals(this.alcoholState, inventoryStorageActivity.alcoholState) &&
        Objects.equals(this.alcoholRegion, inventoryStorageActivity.alcoholRegion) &&
        Objects.equals(this.alcoholBrand, inventoryStorageActivity.alcoholBrand) &&
        Objects.equals(this.alcoholUPCCode, inventoryStorageActivity.alcoholUPCCode) &&
        Objects.equals(this.alcoholNABCACode, inventoryStorageActivity.alcoholNABCACode) &&
        Objects.equals(this.alcoholUNIMERCCode, inventoryStorageActivity.alcoholUNIMERCCode) &&
        Objects.equals(this.alcoholSCCCode, inventoryStorageActivity.alcoholSCCCode) &&
        Objects.equals(this.customFields, inventoryStorageActivity.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, importedRecordId, createDate, modifyDate, warehouseLocationId, itemId, lobId, snapshotDate, isMixedReceipts, quantity, address, numberOfCases, inventoryValue, inventoryAgeDays, warehouseId, warehouseName, warehouseZoneId, warehouseZoneName, warehouseZoneAddress, warehouseBuildingId, warehouseBuildingName, warehouseAisleId, warehouseAisleAddress, warehouseLocationOriginId, warehouseLocationOriginName, warehouseLocationBillingTypeId, warehouseLocationBillingTypeName, warehouseLocationBehaviorTypeId, warehouseLocationBehaviorTypeName, warehouseLocationFootprintId, warehouseLocationFootprintName, warehouseLocationFootprintWidth, warehouseLocationFootprintHeight, warehouseLocationFootprintDepth, warehouseLocationLevel, warehouseLocationBay, warehouseLocationNumber, warehouseLocationOnline, warehouseLocationPriorityCode, warehouseLocationAllowItemMixing, warehouseLocationCost, sku, itemVendorSku, itemUpc, itemMajorGroup, itemMajorGroupName, itemSubGroup, itemSubGroupName, itemProductCode, itemProductCodeName, itemAccountCode, itemAccountCodeName, itemSummaryCode, itemSummaryCodeName, itemSector, poNo, receiptDistributionDate, receiptUnitsPerWrap, receiptUnitsPerCase, receiptRevisionDate, receiptProductionLot, receiptReceiveDate, receiptStatus, receiptStatusName, receiptUnitCode, receiptUnitCodeText, receiptWrapCode, receiptWrapCodeText, receiptCaseWeight, receiptProductIdTag, alcoholTypeId, alcoholTypeName, alcoholContent, alcoholContainerId, alcoholContainerName, alcoholContainerVolume, alcoholVintageYear, alcoholCountryId, alcoholCountryName, alcoholState, alcoholRegion, alcoholBrand, alcoholUPCCode, alcoholNABCACode, alcoholUNIMERCCode, alcoholSCCCode, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryStorageActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    importedRecordId: ").append(toIndentedString(importedRecordId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    warehouseLocationId: ").append(toIndentedString(warehouseLocationId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    snapshotDate: ").append(toIndentedString(snapshotDate)).append("\n");
    sb.append("    isMixedReceipts: ").append(toIndentedString(isMixedReceipts)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    numberOfCases: ").append(toIndentedString(numberOfCases)).append("\n");
    sb.append("    inventoryValue: ").append(toIndentedString(inventoryValue)).append("\n");
    sb.append("    inventoryAgeDays: ").append(toIndentedString(inventoryAgeDays)).append("\n");
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
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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
    sb.append("    alcoholTypeId: ").append(toIndentedString(alcoholTypeId)).append("\n");
    sb.append("    alcoholTypeName: ").append(toIndentedString(alcoholTypeName)).append("\n");
    sb.append("    alcoholContent: ").append(toIndentedString(alcoholContent)).append("\n");
    sb.append("    alcoholContainerId: ").append(toIndentedString(alcoholContainerId)).append("\n");
    sb.append("    alcoholContainerName: ").append(toIndentedString(alcoholContainerName)).append("\n");
    sb.append("    alcoholContainerVolume: ").append(toIndentedString(alcoholContainerVolume)).append("\n");
    sb.append("    alcoholVintageYear: ").append(toIndentedString(alcoholVintageYear)).append("\n");
    sb.append("    alcoholCountryId: ").append(toIndentedString(alcoholCountryId)).append("\n");
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

