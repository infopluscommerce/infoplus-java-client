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
public class WorkActivity   {
  
  private Integer id = null;
  private Integer importedRecordId = null;
  private Integer lobId = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer userId = null;
  private String email = null;
  private String type = null;
  private String typeName = null;
  private String status = null;
  private String statusName = null;
  private Integer workBatchId = null;
  private Integer workParentId = null;
  private Integer priorityCode = null;
  private Integer foreignId = null;
  private Integer sourceWarehouseId = null;
  private String sourceWarehouseName = null;
  private String sourceLocation = null;
  private Integer sourceBuildingId = null;
  private String sourceBuildingName = null;
  private Integer sourceZoneId = null;
  private String sourceZoneName = null;
  private Integer sourceAisleId = null;
  private String sourceAisleAddress = null;
  private Integer sourceOrigin = null;
  private String sourceOriginName = null;
  private Integer sourceBillingTypeId = null;
  private String sourceBillingTypeName = null;
  private String sourceBehaviorType = null;
  private String sourceBehaviorTypeName = null;
  private Integer sourceFootprintId = null;
  private String sourceFootprintName = null;
  private Integer sourceFootprintHeight = null;
  private Integer sourceFootprintWidth = null;
  private Integer sourceFootprintDepth = null;
  private Integer sourceAddressSchemeId = null;
  private String sourceAddressSchemeName = null;
  private Integer sourceLevel = null;
  private Integer sourceBay = null;
  private Integer sourceNumber = null;
  private Boolean sourceOnline = false;
  private Integer sourcePriorityCode = null;
  private Integer sourceCost = null;
  private Boolean sourceAllowItemMixing = false;
  private Integer destinationWarehouseId = null;
  private String destinationWarehouseName = null;
  private String destinationLocation = null;
  private Integer destinationBuildingId = null;
  private String destinationBuildingName = null;
  private Integer destinationZoneId = null;
  private String destinationZoneName = null;
  private Integer destinationAisleId = null;
  private String destinationAisleAddress = null;
  private Integer destinationOrigin = null;
  private String destinationOriginName = null;
  private Integer destinationBillingTypeId = null;
  private String destinationBillingTypeName = null;
  private String destinationBehaviorType = null;
  private String destinationBehaviorTypeName = null;
  private Integer destinationFootprintId = null;
  private String destinationFootprintName = null;
  private Integer destinationFootprintHeight = null;
  private Integer destinationFootprintWidth = null;
  private Integer destinationFootprintDepth = null;
  private Integer destinationAddressSchemeId = null;
  private String destinationAddressSchemeName = null;
  private Integer destinationLevel = null;
  private Integer destinationBay = null;
  private Integer destinationNumber = null;
  private Boolean destinationOnline = false;
  private Integer destinationPriorityCode = null;
  private Integer destinationCost = null;
  private Boolean destinationAllowItemMixing = false;
  private Integer masterRef = null;
  private BigDecimal weightPerWrap = null;
  private String sku = null;
  private Integer numericSortOrder = null;
  private String itemDescription = null;
  private String additionalDescription = null;
  private String unitCode = null;
  private String wrapCode = null;
  private Integer unitsPerWrap = null;
  private String classRestriction = null;
  private Integer maxCycle = null;
  private Integer maxInterim = null;
  private String seasonalItem = null;
  private String secure = null;
  private Integer productType = null;
  private String itemStatus = null;
  private Integer overallLeadTime = null;
  private Integer overallFixedReorderPoint = null;
  private String qualityControlIndicator = null;
  private String lotControlFlag = null;
  private String productCodeFlag = null;
  private String chargeCode = null;
  private String podRevDate = null;
  private Integer podOrderSuffix = null;
  private String serialCode = null;
  private String assetCode = null;
  private String backorder = null;
  private String absoluteMax = null;
  private Integer accountCodeId = null;
  private Integer summaryCodeId = null;
  private Integer lowStockContactId = null;
  private Integer legacyLowLevelContactId = null;
  private Integer lowStockCodeId = null;
  private Integer majorGroupId = null;
  private Integer subGroupId = null;
  private Integer productCodeId = null;
  private Integer buyerId = null;
  private String vendorSKU = null;
  private String upc = null;
  private String packingSlipDescription = null;
  private String commodityCode = null;
  private Integer compCode = null;
  private Integer criticalAmount = null;
  private BigDecimal listPrice = null;
  private Integer outsideVendor = null;
  private String pickNo = null;
  private String requiresProductionLot = null;
  private String sector = null;
  private Date voidDate = null;
  private String extrinsicText1 = null;
  private String extrinsicText2 = null;
  private String extrinsicText3 = null;
  private Integer extrinsicNumber1 = null;
  private Integer extrinsicNumber2 = null;
  private BigDecimal extrinsicDecimal1 = null;
  private BigDecimal extrinsicDecimal2 = null;
  private String casebreakEnabled = null;
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

  
  /**
   **/
  public WorkActivity lobId(Integer lobId) {
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
  public WorkActivity userId(Integer userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  
  /**
   **/
  public WorkActivity email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  public WorkActivity type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  public WorkActivity typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("typeName")
  public String getTypeName() {
    return typeName;
  }
  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  
  /**
   **/
  public WorkActivity status(String status) {
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
  public WorkActivity statusName(String statusName) {
    this.statusName = statusName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("statusName")
  public String getStatusName() {
    return statusName;
  }
  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }

  
  /**
   **/
  public WorkActivity workBatchId(Integer workBatchId) {
    this.workBatchId = workBatchId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workBatchId")
  public Integer getWorkBatchId() {
    return workBatchId;
  }
  public void setWorkBatchId(Integer workBatchId) {
    this.workBatchId = workBatchId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workParentId")
  public Integer getWorkParentId() {
    return workParentId;
  }

  
  /**
   **/
  public WorkActivity priorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("priorityCode")
  public Integer getPriorityCode() {
    return priorityCode;
  }
  public void setPriorityCode(Integer priorityCode) {
    this.priorityCode = priorityCode;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("foreignId")
  public Integer getForeignId() {
    return foreignId;
  }

  
  /**
   **/
  public WorkActivity sourceWarehouseId(Integer sourceWarehouseId) {
    this.sourceWarehouseId = sourceWarehouseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceWarehouseId")
  public Integer getSourceWarehouseId() {
    return sourceWarehouseId;
  }
  public void setSourceWarehouseId(Integer sourceWarehouseId) {
    this.sourceWarehouseId = sourceWarehouseId;
  }

  
  /**
   **/
  public WorkActivity sourceWarehouseName(String sourceWarehouseName) {
    this.sourceWarehouseName = sourceWarehouseName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceWarehouseName")
  public String getSourceWarehouseName() {
    return sourceWarehouseName;
  }
  public void setSourceWarehouseName(String sourceWarehouseName) {
    this.sourceWarehouseName = sourceWarehouseName;
  }

  
  /**
   **/
  public WorkActivity sourceLocation(String sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceLocation")
  public String getSourceLocation() {
    return sourceLocation;
  }
  public void setSourceLocation(String sourceLocation) {
    this.sourceLocation = sourceLocation;
  }

  
  /**
   **/
  public WorkActivity sourceBuildingId(Integer sourceBuildingId) {
    this.sourceBuildingId = sourceBuildingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceBuildingId")
  public Integer getSourceBuildingId() {
    return sourceBuildingId;
  }
  public void setSourceBuildingId(Integer sourceBuildingId) {
    this.sourceBuildingId = sourceBuildingId;
  }

  
  /**
   **/
  public WorkActivity sourceBuildingName(String sourceBuildingName) {
    this.sourceBuildingName = sourceBuildingName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceBuildingName")
  public String getSourceBuildingName() {
    return sourceBuildingName;
  }
  public void setSourceBuildingName(String sourceBuildingName) {
    this.sourceBuildingName = sourceBuildingName;
  }

  
  /**
   **/
  public WorkActivity sourceZoneId(Integer sourceZoneId) {
    this.sourceZoneId = sourceZoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceZoneId")
  public Integer getSourceZoneId() {
    return sourceZoneId;
  }
  public void setSourceZoneId(Integer sourceZoneId) {
    this.sourceZoneId = sourceZoneId;
  }

  
  /**
   **/
  public WorkActivity sourceZoneName(String sourceZoneName) {
    this.sourceZoneName = sourceZoneName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceZoneName")
  public String getSourceZoneName() {
    return sourceZoneName;
  }
  public void setSourceZoneName(String sourceZoneName) {
    this.sourceZoneName = sourceZoneName;
  }

  
  /**
   **/
  public WorkActivity sourceAisleId(Integer sourceAisleId) {
    this.sourceAisleId = sourceAisleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceAisleId")
  public Integer getSourceAisleId() {
    return sourceAisleId;
  }
  public void setSourceAisleId(Integer sourceAisleId) {
    this.sourceAisleId = sourceAisleId;
  }

  
  /**
   **/
  public WorkActivity sourceAisleAddress(String sourceAisleAddress) {
    this.sourceAisleAddress = sourceAisleAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceAisleAddress")
  public String getSourceAisleAddress() {
    return sourceAisleAddress;
  }
  public void setSourceAisleAddress(String sourceAisleAddress) {
    this.sourceAisleAddress = sourceAisleAddress;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceOrigin")
  public Integer getSourceOrigin() {
    return sourceOrigin;
  }

  
  /**
   **/
  public WorkActivity sourceOriginName(String sourceOriginName) {
    this.sourceOriginName = sourceOriginName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceOriginName")
  public String getSourceOriginName() {
    return sourceOriginName;
  }
  public void setSourceOriginName(String sourceOriginName) {
    this.sourceOriginName = sourceOriginName;
  }

  
  /**
   **/
  public WorkActivity sourceBillingTypeId(Integer sourceBillingTypeId) {
    this.sourceBillingTypeId = sourceBillingTypeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceBillingTypeId")
  public Integer getSourceBillingTypeId() {
    return sourceBillingTypeId;
  }
  public void setSourceBillingTypeId(Integer sourceBillingTypeId) {
    this.sourceBillingTypeId = sourceBillingTypeId;
  }

  
  /**
   **/
  public WorkActivity sourceBillingTypeName(String sourceBillingTypeName) {
    this.sourceBillingTypeName = sourceBillingTypeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceBillingTypeName")
  public String getSourceBillingTypeName() {
    return sourceBillingTypeName;
  }
  public void setSourceBillingTypeName(String sourceBillingTypeName) {
    this.sourceBillingTypeName = sourceBillingTypeName;
  }

  
  /**
   **/
  public WorkActivity sourceBehaviorType(String sourceBehaviorType) {
    this.sourceBehaviorType = sourceBehaviorType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceBehaviorType")
  public String getSourceBehaviorType() {
    return sourceBehaviorType;
  }
  public void setSourceBehaviorType(String sourceBehaviorType) {
    this.sourceBehaviorType = sourceBehaviorType;
  }

  
  /**
   **/
  public WorkActivity sourceBehaviorTypeName(String sourceBehaviorTypeName) {
    this.sourceBehaviorTypeName = sourceBehaviorTypeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceBehaviorTypeName")
  public String getSourceBehaviorTypeName() {
    return sourceBehaviorTypeName;
  }
  public void setSourceBehaviorTypeName(String sourceBehaviorTypeName) {
    this.sourceBehaviorTypeName = sourceBehaviorTypeName;
  }

  
  /**
   **/
  public WorkActivity sourceFootprintId(Integer sourceFootprintId) {
    this.sourceFootprintId = sourceFootprintId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceFootprintId")
  public Integer getSourceFootprintId() {
    return sourceFootprintId;
  }
  public void setSourceFootprintId(Integer sourceFootprintId) {
    this.sourceFootprintId = sourceFootprintId;
  }

  
  /**
   **/
  public WorkActivity sourceFootprintName(String sourceFootprintName) {
    this.sourceFootprintName = sourceFootprintName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceFootprintName")
  public String getSourceFootprintName() {
    return sourceFootprintName;
  }
  public void setSourceFootprintName(String sourceFootprintName) {
    this.sourceFootprintName = sourceFootprintName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceFootprintHeight")
  public Integer getSourceFootprintHeight() {
    return sourceFootprintHeight;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceFootprintWidth")
  public Integer getSourceFootprintWidth() {
    return sourceFootprintWidth;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceFootprintDepth")
  public Integer getSourceFootprintDepth() {
    return sourceFootprintDepth;
  }

  
  /**
   **/
  public WorkActivity sourceAddressSchemeId(Integer sourceAddressSchemeId) {
    this.sourceAddressSchemeId = sourceAddressSchemeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceAddressSchemeId")
  public Integer getSourceAddressSchemeId() {
    return sourceAddressSchemeId;
  }
  public void setSourceAddressSchemeId(Integer sourceAddressSchemeId) {
    this.sourceAddressSchemeId = sourceAddressSchemeId;
  }

  
  /**
   **/
  public WorkActivity sourceAddressSchemeName(String sourceAddressSchemeName) {
    this.sourceAddressSchemeName = sourceAddressSchemeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceAddressSchemeName")
  public String getSourceAddressSchemeName() {
    return sourceAddressSchemeName;
  }
  public void setSourceAddressSchemeName(String sourceAddressSchemeName) {
    this.sourceAddressSchemeName = sourceAddressSchemeName;
  }

  
  /**
   **/
  public WorkActivity sourceLevel(Integer sourceLevel) {
    this.sourceLevel = sourceLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceLevel")
  public Integer getSourceLevel() {
    return sourceLevel;
  }
  public void setSourceLevel(Integer sourceLevel) {
    this.sourceLevel = sourceLevel;
  }

  
  /**
   **/
  public WorkActivity sourceBay(Integer sourceBay) {
    this.sourceBay = sourceBay;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceBay")
  public Integer getSourceBay() {
    return sourceBay;
  }
  public void setSourceBay(Integer sourceBay) {
    this.sourceBay = sourceBay;
  }

  
  /**
   **/
  public WorkActivity sourceNumber(Integer sourceNumber) {
    this.sourceNumber = sourceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceNumber")
  public Integer getSourceNumber() {
    return sourceNumber;
  }
  public void setSourceNumber(Integer sourceNumber) {
    this.sourceNumber = sourceNumber;
  }

  
  /**
   **/
  public WorkActivity sourceOnline(Boolean sourceOnline) {
    this.sourceOnline = sourceOnline;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceOnline")
  public Boolean getSourceOnline() {
    return sourceOnline;
  }
  public void setSourceOnline(Boolean sourceOnline) {
    this.sourceOnline = sourceOnline;
  }

  
  /**
   **/
  public WorkActivity sourcePriorityCode(Integer sourcePriorityCode) {
    this.sourcePriorityCode = sourcePriorityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourcePriorityCode")
  public Integer getSourcePriorityCode() {
    return sourcePriorityCode;
  }
  public void setSourcePriorityCode(Integer sourcePriorityCode) {
    this.sourcePriorityCode = sourcePriorityCode;
  }

  
  /**
   **/
  public WorkActivity sourceCost(Integer sourceCost) {
    this.sourceCost = sourceCost;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceCost")
  public Integer getSourceCost() {
    return sourceCost;
  }
  public void setSourceCost(Integer sourceCost) {
    this.sourceCost = sourceCost;
  }

  
  /**
   **/
  public WorkActivity sourceAllowItemMixing(Boolean sourceAllowItemMixing) {
    this.sourceAllowItemMixing = sourceAllowItemMixing;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceAllowItemMixing")
  public Boolean getSourceAllowItemMixing() {
    return sourceAllowItemMixing;
  }
  public void setSourceAllowItemMixing(Boolean sourceAllowItemMixing) {
    this.sourceAllowItemMixing = sourceAllowItemMixing;
  }

  
  /**
   **/
  public WorkActivity destinationWarehouseId(Integer destinationWarehouseId) {
    this.destinationWarehouseId = destinationWarehouseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationWarehouseId")
  public Integer getDestinationWarehouseId() {
    return destinationWarehouseId;
  }
  public void setDestinationWarehouseId(Integer destinationWarehouseId) {
    this.destinationWarehouseId = destinationWarehouseId;
  }

  
  /**
   **/
  public WorkActivity destinationWarehouseName(String destinationWarehouseName) {
    this.destinationWarehouseName = destinationWarehouseName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationWarehouseName")
  public String getDestinationWarehouseName() {
    return destinationWarehouseName;
  }
  public void setDestinationWarehouseName(String destinationWarehouseName) {
    this.destinationWarehouseName = destinationWarehouseName;
  }

  
  /**
   **/
  public WorkActivity destinationLocation(String destinationLocation) {
    this.destinationLocation = destinationLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationLocation")
  public String getDestinationLocation() {
    return destinationLocation;
  }
  public void setDestinationLocation(String destinationLocation) {
    this.destinationLocation = destinationLocation;
  }

  
  /**
   **/
  public WorkActivity destinationBuildingId(Integer destinationBuildingId) {
    this.destinationBuildingId = destinationBuildingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationBuildingId")
  public Integer getDestinationBuildingId() {
    return destinationBuildingId;
  }
  public void setDestinationBuildingId(Integer destinationBuildingId) {
    this.destinationBuildingId = destinationBuildingId;
  }

  
  /**
   **/
  public WorkActivity destinationBuildingName(String destinationBuildingName) {
    this.destinationBuildingName = destinationBuildingName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationBuildingName")
  public String getDestinationBuildingName() {
    return destinationBuildingName;
  }
  public void setDestinationBuildingName(String destinationBuildingName) {
    this.destinationBuildingName = destinationBuildingName;
  }

  
  /**
   **/
  public WorkActivity destinationZoneId(Integer destinationZoneId) {
    this.destinationZoneId = destinationZoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destinationZoneId")
  public Integer getDestinationZoneId() {
    return destinationZoneId;
  }
  public void setDestinationZoneId(Integer destinationZoneId) {
    this.destinationZoneId = destinationZoneId;
  }

  
  /**
   **/
  public WorkActivity destinationZoneName(String destinationZoneName) {
    this.destinationZoneName = destinationZoneName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationZoneName")
  public String getDestinationZoneName() {
    return destinationZoneName;
  }
  public void setDestinationZoneName(String destinationZoneName) {
    this.destinationZoneName = destinationZoneName;
  }

  
  /**
   **/
  public WorkActivity destinationAisleId(Integer destinationAisleId) {
    this.destinationAisleId = destinationAisleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destinationAisleId")
  public Integer getDestinationAisleId() {
    return destinationAisleId;
  }
  public void setDestinationAisleId(Integer destinationAisleId) {
    this.destinationAisleId = destinationAisleId;
  }

  
  /**
   **/
  public WorkActivity destinationAisleAddress(String destinationAisleAddress) {
    this.destinationAisleAddress = destinationAisleAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationAisleAddress")
  public String getDestinationAisleAddress() {
    return destinationAisleAddress;
  }
  public void setDestinationAisleAddress(String destinationAisleAddress) {
    this.destinationAisleAddress = destinationAisleAddress;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destinationOrigin")
  public Integer getDestinationOrigin() {
    return destinationOrigin;
  }

  
  /**
   **/
  public WorkActivity destinationOriginName(String destinationOriginName) {
    this.destinationOriginName = destinationOriginName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationOriginName")
  public String getDestinationOriginName() {
    return destinationOriginName;
  }
  public void setDestinationOriginName(String destinationOriginName) {
    this.destinationOriginName = destinationOriginName;
  }

  
  /**
   **/
  public WorkActivity destinationBillingTypeId(Integer destinationBillingTypeId) {
    this.destinationBillingTypeId = destinationBillingTypeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationBillingTypeId")
  public Integer getDestinationBillingTypeId() {
    return destinationBillingTypeId;
  }
  public void setDestinationBillingTypeId(Integer destinationBillingTypeId) {
    this.destinationBillingTypeId = destinationBillingTypeId;
  }

  
  /**
   **/
  public WorkActivity destinationBillingTypeName(String destinationBillingTypeName) {
    this.destinationBillingTypeName = destinationBillingTypeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationBillingTypeName")
  public String getDestinationBillingTypeName() {
    return destinationBillingTypeName;
  }
  public void setDestinationBillingTypeName(String destinationBillingTypeName) {
    this.destinationBillingTypeName = destinationBillingTypeName;
  }

  
  /**
   **/
  public WorkActivity destinationBehaviorType(String destinationBehaviorType) {
    this.destinationBehaviorType = destinationBehaviorType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationBehaviorType")
  public String getDestinationBehaviorType() {
    return destinationBehaviorType;
  }
  public void setDestinationBehaviorType(String destinationBehaviorType) {
    this.destinationBehaviorType = destinationBehaviorType;
  }

  
  /**
   **/
  public WorkActivity destinationBehaviorTypeName(String destinationBehaviorTypeName) {
    this.destinationBehaviorTypeName = destinationBehaviorTypeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationBehaviorTypeName")
  public String getDestinationBehaviorTypeName() {
    return destinationBehaviorTypeName;
  }
  public void setDestinationBehaviorTypeName(String destinationBehaviorTypeName) {
    this.destinationBehaviorTypeName = destinationBehaviorTypeName;
  }

  
  /**
   **/
  public WorkActivity destinationFootprintId(Integer destinationFootprintId) {
    this.destinationFootprintId = destinationFootprintId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationFootprintId")
  public Integer getDestinationFootprintId() {
    return destinationFootprintId;
  }
  public void setDestinationFootprintId(Integer destinationFootprintId) {
    this.destinationFootprintId = destinationFootprintId;
  }

  
  /**
   **/
  public WorkActivity destinationFootprintName(String destinationFootprintName) {
    this.destinationFootprintName = destinationFootprintName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationFootprintName")
  public String getDestinationFootprintName() {
    return destinationFootprintName;
  }
  public void setDestinationFootprintName(String destinationFootprintName) {
    this.destinationFootprintName = destinationFootprintName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destinationFootprintHeight")
  public Integer getDestinationFootprintHeight() {
    return destinationFootprintHeight;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destinationFootprintWidth")
  public Integer getDestinationFootprintWidth() {
    return destinationFootprintWidth;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destinationFootprintDepth")
  public Integer getDestinationFootprintDepth() {
    return destinationFootprintDepth;
  }

  
  /**
   **/
  public WorkActivity destinationAddressSchemeId(Integer destinationAddressSchemeId) {
    this.destinationAddressSchemeId = destinationAddressSchemeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destinationAddressSchemeId")
  public Integer getDestinationAddressSchemeId() {
    return destinationAddressSchemeId;
  }
  public void setDestinationAddressSchemeId(Integer destinationAddressSchemeId) {
    this.destinationAddressSchemeId = destinationAddressSchemeId;
  }

  
  /**
   **/
  public WorkActivity destinationAddressSchemeName(String destinationAddressSchemeName) {
    this.destinationAddressSchemeName = destinationAddressSchemeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationAddressSchemeName")
  public String getDestinationAddressSchemeName() {
    return destinationAddressSchemeName;
  }
  public void setDestinationAddressSchemeName(String destinationAddressSchemeName) {
    this.destinationAddressSchemeName = destinationAddressSchemeName;
  }

  
  /**
   **/
  public WorkActivity destinationLevel(Integer destinationLevel) {
    this.destinationLevel = destinationLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destinationLevel")
  public Integer getDestinationLevel() {
    return destinationLevel;
  }
  public void setDestinationLevel(Integer destinationLevel) {
    this.destinationLevel = destinationLevel;
  }

  
  /**
   **/
  public WorkActivity destinationBay(Integer destinationBay) {
    this.destinationBay = destinationBay;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destinationBay")
  public Integer getDestinationBay() {
    return destinationBay;
  }
  public void setDestinationBay(Integer destinationBay) {
    this.destinationBay = destinationBay;
  }

  
  /**
   **/
  public WorkActivity destinationNumber(Integer destinationNumber) {
    this.destinationNumber = destinationNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destinationNumber")
  public Integer getDestinationNumber() {
    return destinationNumber;
  }
  public void setDestinationNumber(Integer destinationNumber) {
    this.destinationNumber = destinationNumber;
  }

  
  /**
   **/
  public WorkActivity destinationOnline(Boolean destinationOnline) {
    this.destinationOnline = destinationOnline;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationOnline")
  public Boolean getDestinationOnline() {
    return destinationOnline;
  }
  public void setDestinationOnline(Boolean destinationOnline) {
    this.destinationOnline = destinationOnline;
  }

  
  /**
   **/
  public WorkActivity destinationPriorityCode(Integer destinationPriorityCode) {
    this.destinationPriorityCode = destinationPriorityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destinationPriorityCode")
  public Integer getDestinationPriorityCode() {
    return destinationPriorityCode;
  }
  public void setDestinationPriorityCode(Integer destinationPriorityCode) {
    this.destinationPriorityCode = destinationPriorityCode;
  }

  
  /**
   **/
  public WorkActivity destinationCost(Integer destinationCost) {
    this.destinationCost = destinationCost;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destinationCost")
  public Integer getDestinationCost() {
    return destinationCost;
  }
  public void setDestinationCost(Integer destinationCost) {
    this.destinationCost = destinationCost;
  }

  
  /**
   **/
  public WorkActivity destinationAllowItemMixing(Boolean destinationAllowItemMixing) {
    this.destinationAllowItemMixing = destinationAllowItemMixing;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinationAllowItemMixing")
  public Boolean getDestinationAllowItemMixing() {
    return destinationAllowItemMixing;
  }
  public void setDestinationAllowItemMixing(Boolean destinationAllowItemMixing) {
    this.destinationAllowItemMixing = destinationAllowItemMixing;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("masterRef")
  public Integer getMasterRef() {
    return masterRef;
  }

  
  /**
   **/
  public WorkActivity weightPerWrap(BigDecimal weightPerWrap) {
    this.weightPerWrap = weightPerWrap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weightPerWrap")
  public BigDecimal getWeightPerWrap() {
    return weightPerWrap;
  }
  public void setWeightPerWrap(BigDecimal weightPerWrap) {
    this.weightPerWrap = weightPerWrap;
  }

  
  /**
   **/
  public WorkActivity sku(String sku) {
    this.sku = sku;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  
  /**
   **/
  public WorkActivity numericSortOrder(Integer numericSortOrder) {
    this.numericSortOrder = numericSortOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numericSortOrder")
  public Integer getNumericSortOrder() {
    return numericSortOrder;
  }
  public void setNumericSortOrder(Integer numericSortOrder) {
    this.numericSortOrder = numericSortOrder;
  }

  
  /**
   **/
  public WorkActivity itemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("itemDescription")
  public String getItemDescription() {
    return itemDescription;
  }
  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  
  /**
   **/
  public WorkActivity additionalDescription(String additionalDescription) {
    this.additionalDescription = additionalDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalDescription")
  public String getAdditionalDescription() {
    return additionalDescription;
  }
  public void setAdditionalDescription(String additionalDescription) {
    this.additionalDescription = additionalDescription;
  }

  
  /**
   **/
  public WorkActivity unitCode(String unitCode) {
    this.unitCode = unitCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("unitCode")
  public String getUnitCode() {
    return unitCode;
  }
  public void setUnitCode(String unitCode) {
    this.unitCode = unitCode;
  }

  
  /**
   **/
  public WorkActivity wrapCode(String wrapCode) {
    this.wrapCode = wrapCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("wrapCode")
  public String getWrapCode() {
    return wrapCode;
  }
  public void setWrapCode(String wrapCode) {
    this.wrapCode = wrapCode;
  }

  
  /**
   **/
  public WorkActivity unitsPerWrap(Integer unitsPerWrap) {
    this.unitsPerWrap = unitsPerWrap;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("unitsPerWrap")
  public Integer getUnitsPerWrap() {
    return unitsPerWrap;
  }
  public void setUnitsPerWrap(Integer unitsPerWrap) {
    this.unitsPerWrap = unitsPerWrap;
  }

  
  /**
   **/
  public WorkActivity classRestriction(String classRestriction) {
    this.classRestriction = classRestriction;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("classRestriction")
  public String getClassRestriction() {
    return classRestriction;
  }
  public void setClassRestriction(String classRestriction) {
    this.classRestriction = classRestriction;
  }

  
  /**
   **/
  public WorkActivity maxCycle(Integer maxCycle) {
    this.maxCycle = maxCycle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("maxCycle")
  public Integer getMaxCycle() {
    return maxCycle;
  }
  public void setMaxCycle(Integer maxCycle) {
    this.maxCycle = maxCycle;
  }

  
  /**
   **/
  public WorkActivity maxInterim(Integer maxInterim) {
    this.maxInterim = maxInterim;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("maxInterim")
  public Integer getMaxInterim() {
    return maxInterim;
  }
  public void setMaxInterim(Integer maxInterim) {
    this.maxInterim = maxInterim;
  }

  
  /**
   **/
  public WorkActivity seasonalItem(String seasonalItem) {
    this.seasonalItem = seasonalItem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("seasonalItem")
  public String getSeasonalItem() {
    return seasonalItem;
  }
  public void setSeasonalItem(String seasonalItem) {
    this.seasonalItem = seasonalItem;
  }

  
  /**
   **/
  public WorkActivity secure(String secure) {
    this.secure = secure;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("secure")
  public String getSecure() {
    return secure;
  }
  public void setSecure(String secure) {
    this.secure = secure;
  }

  
  /**
   **/
  public WorkActivity productType(Integer productType) {
    this.productType = productType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("productType")
  public Integer getProductType() {
    return productType;
  }
  public void setProductType(Integer productType) {
    this.productType = productType;
  }

  
  /**
   **/
  public WorkActivity itemStatus(String itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("itemStatus")
  public String getItemStatus() {
    return itemStatus;
  }
  public void setItemStatus(String itemStatus) {
    this.itemStatus = itemStatus;
  }

  
  /**
   **/
  public WorkActivity overallLeadTime(Integer overallLeadTime) {
    this.overallLeadTime = overallLeadTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("overallLeadTime")
  public Integer getOverallLeadTime() {
    return overallLeadTime;
  }
  public void setOverallLeadTime(Integer overallLeadTime) {
    this.overallLeadTime = overallLeadTime;
  }

  
  /**
   **/
  public WorkActivity overallFixedReorderPoint(Integer overallFixedReorderPoint) {
    this.overallFixedReorderPoint = overallFixedReorderPoint;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("overallFixedReorderPoint")
  public Integer getOverallFixedReorderPoint() {
    return overallFixedReorderPoint;
  }
  public void setOverallFixedReorderPoint(Integer overallFixedReorderPoint) {
    this.overallFixedReorderPoint = overallFixedReorderPoint;
  }

  
  /**
   **/
  public WorkActivity qualityControlIndicator(String qualityControlIndicator) {
    this.qualityControlIndicator = qualityControlIndicator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("qualityControlIndicator")
  public String getQualityControlIndicator() {
    return qualityControlIndicator;
  }
  public void setQualityControlIndicator(String qualityControlIndicator) {
    this.qualityControlIndicator = qualityControlIndicator;
  }

  
  /**
   **/
  public WorkActivity lotControlFlag(String lotControlFlag) {
    this.lotControlFlag = lotControlFlag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lotControlFlag")
  public String getLotControlFlag() {
    return lotControlFlag;
  }
  public void setLotControlFlag(String lotControlFlag) {
    this.lotControlFlag = lotControlFlag;
  }

  
  /**
   **/
  public WorkActivity productCodeFlag(String productCodeFlag) {
    this.productCodeFlag = productCodeFlag;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("productCodeFlag")
  public String getProductCodeFlag() {
    return productCodeFlag;
  }
  public void setProductCodeFlag(String productCodeFlag) {
    this.productCodeFlag = productCodeFlag;
  }

  
  /**
   **/
  public WorkActivity chargeCode(String chargeCode) {
    this.chargeCode = chargeCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("chargeCode")
  public String getChargeCode() {
    return chargeCode;
  }
  public void setChargeCode(String chargeCode) {
    this.chargeCode = chargeCode;
  }

  
  /**
   **/
  public WorkActivity podRevDate(String podRevDate) {
    this.podRevDate = podRevDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("podRevDate")
  public String getPodRevDate() {
    return podRevDate;
  }
  public void setPodRevDate(String podRevDate) {
    this.podRevDate = podRevDate;
  }

  
  /**
   **/
  public WorkActivity podOrderSuffix(Integer podOrderSuffix) {
    this.podOrderSuffix = podOrderSuffix;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("podOrderSuffix")
  public Integer getPodOrderSuffix() {
    return podOrderSuffix;
  }
  public void setPodOrderSuffix(Integer podOrderSuffix) {
    this.podOrderSuffix = podOrderSuffix;
  }

  
  /**
   **/
  public WorkActivity serialCode(String serialCode) {
    this.serialCode = serialCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("serialCode")
  public String getSerialCode() {
    return serialCode;
  }
  public void setSerialCode(String serialCode) {
    this.serialCode = serialCode;
  }

  
  /**
   **/
  public WorkActivity assetCode(String assetCode) {
    this.assetCode = assetCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assetCode")
  public String getAssetCode() {
    return assetCode;
  }
  public void setAssetCode(String assetCode) {
    this.assetCode = assetCode;
  }

  
  /**
   **/
  public WorkActivity backorder(String backorder) {
    this.backorder = backorder;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("backorder")
  public String getBackorder() {
    return backorder;
  }
  public void setBackorder(String backorder) {
    this.backorder = backorder;
  }

  
  /**
   **/
  public WorkActivity absoluteMax(String absoluteMax) {
    this.absoluteMax = absoluteMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("absoluteMax")
  public String getAbsoluteMax() {
    return absoluteMax;
  }
  public void setAbsoluteMax(String absoluteMax) {
    this.absoluteMax = absoluteMax;
  }

  
  /**
   **/
  public WorkActivity accountCodeId(Integer accountCodeId) {
    this.accountCodeId = accountCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("accountCodeId")
  public Integer getAccountCodeId() {
    return accountCodeId;
  }
  public void setAccountCodeId(Integer accountCodeId) {
    this.accountCodeId = accountCodeId;
  }

  
  /**
   **/
  public WorkActivity summaryCodeId(Integer summaryCodeId) {
    this.summaryCodeId = summaryCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("summaryCodeId")
  public Integer getSummaryCodeId() {
    return summaryCodeId;
  }
  public void setSummaryCodeId(Integer summaryCodeId) {
    this.summaryCodeId = summaryCodeId;
  }

  
  /**
   **/
  public WorkActivity lowStockContactId(Integer lowStockContactId) {
    this.lowStockContactId = lowStockContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lowStockContactId")
  public Integer getLowStockContactId() {
    return lowStockContactId;
  }
  public void setLowStockContactId(Integer lowStockContactId) {
    this.lowStockContactId = lowStockContactId;
  }

  
  /**
   **/
  public WorkActivity legacyLowLevelContactId(Integer legacyLowLevelContactId) {
    this.legacyLowLevelContactId = legacyLowLevelContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("legacyLowLevelContactId")
  public Integer getLegacyLowLevelContactId() {
    return legacyLowLevelContactId;
  }
  public void setLegacyLowLevelContactId(Integer legacyLowLevelContactId) {
    this.legacyLowLevelContactId = legacyLowLevelContactId;
  }

  
  /**
   **/
  public WorkActivity lowStockCodeId(Integer lowStockCodeId) {
    this.lowStockCodeId = lowStockCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lowStockCodeId")
  public Integer getLowStockCodeId() {
    return lowStockCodeId;
  }
  public void setLowStockCodeId(Integer lowStockCodeId) {
    this.lowStockCodeId = lowStockCodeId;
  }

  
  /**
   **/
  public WorkActivity majorGroupId(Integer majorGroupId) {
    this.majorGroupId = majorGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("majorGroupId")
  public Integer getMajorGroupId() {
    return majorGroupId;
  }
  public void setMajorGroupId(Integer majorGroupId) {
    this.majorGroupId = majorGroupId;
  }

  
  /**
   **/
  public WorkActivity subGroupId(Integer subGroupId) {
    this.subGroupId = subGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("subGroupId")
  public Integer getSubGroupId() {
    return subGroupId;
  }
  public void setSubGroupId(Integer subGroupId) {
    this.subGroupId = subGroupId;
  }

  
  /**
   **/
  public WorkActivity productCodeId(Integer productCodeId) {
    this.productCodeId = productCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("productCodeId")
  public Integer getProductCodeId() {
    return productCodeId;
  }
  public void setProductCodeId(Integer productCodeId) {
    this.productCodeId = productCodeId;
  }

  
  /**
   **/
  public WorkActivity buyerId(Integer buyerId) {
    this.buyerId = buyerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("buyerId")
  public Integer getBuyerId() {
    return buyerId;
  }
  public void setBuyerId(Integer buyerId) {
    this.buyerId = buyerId;
  }

  
  /**
   **/
  public WorkActivity vendorSKU(String vendorSKU) {
    this.vendorSKU = vendorSKU;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorSKU")
  public String getVendorSKU() {
    return vendorSKU;
  }
  public void setVendorSKU(String vendorSKU) {
    this.vendorSKU = vendorSKU;
  }

  
  /**
   **/
  public WorkActivity upc(String upc) {
    this.upc = upc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("upc")
  public String getUpc() {
    return upc;
  }
  public void setUpc(String upc) {
    this.upc = upc;
  }

  
  /**
   **/
  public WorkActivity packingSlipDescription(String packingSlipDescription) {
    this.packingSlipDescription = packingSlipDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("packingSlipDescription")
  public String getPackingSlipDescription() {
    return packingSlipDescription;
  }
  public void setPackingSlipDescription(String packingSlipDescription) {
    this.packingSlipDescription = packingSlipDescription;
  }

  
  /**
   **/
  public WorkActivity commodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("commodityCode")
  public String getCommodityCode() {
    return commodityCode;
  }
  public void setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
  }

  
  /**
   **/
  public WorkActivity compCode(Integer compCode) {
    this.compCode = compCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("compCode")
  public Integer getCompCode() {
    return compCode;
  }
  public void setCompCode(Integer compCode) {
    this.compCode = compCode;
  }

  
  /**
   **/
  public WorkActivity criticalAmount(Integer criticalAmount) {
    this.criticalAmount = criticalAmount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("criticalAmount")
  public Integer getCriticalAmount() {
    return criticalAmount;
  }
  public void setCriticalAmount(Integer criticalAmount) {
    this.criticalAmount = criticalAmount;
  }

  
  /**
   **/
  public WorkActivity listPrice(BigDecimal listPrice) {
    this.listPrice = listPrice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("listPrice")
  public BigDecimal getListPrice() {
    return listPrice;
  }
  public void setListPrice(BigDecimal listPrice) {
    this.listPrice = listPrice;
  }

  
  /**
   **/
  public WorkActivity outsideVendor(Integer outsideVendor) {
    this.outsideVendor = outsideVendor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outsideVendor")
  public Integer getOutsideVendor() {
    return outsideVendor;
  }
  public void setOutsideVendor(Integer outsideVendor) {
    this.outsideVendor = outsideVendor;
  }

  
  /**
   **/
  public WorkActivity pickNo(String pickNo) {
    this.pickNo = pickNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pickNo")
  public String getPickNo() {
    return pickNo;
  }
  public void setPickNo(String pickNo) {
    this.pickNo = pickNo;
  }

  
  /**
   **/
  public WorkActivity requiresProductionLot(String requiresProductionLot) {
    this.requiresProductionLot = requiresProductionLot;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requiresProductionLot")
  public String getRequiresProductionLot() {
    return requiresProductionLot;
  }
  public void setRequiresProductionLot(String requiresProductionLot) {
    this.requiresProductionLot = requiresProductionLot;
  }

  
  /**
   **/
  public WorkActivity sector(String sector) {
    this.sector = sector;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sector")
  public String getSector() {
    return sector;
  }
  public void setSector(String sector) {
    this.sector = sector;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("voidDate")
  public Date getVoidDate() {
    return voidDate;
  }

  
  /**
   **/
  public WorkActivity extrinsicText1(String extrinsicText1) {
    this.extrinsicText1 = extrinsicText1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicText1")
  public String getExtrinsicText1() {
    return extrinsicText1;
  }
  public void setExtrinsicText1(String extrinsicText1) {
    this.extrinsicText1 = extrinsicText1;
  }

  
  /**
   **/
  public WorkActivity extrinsicText2(String extrinsicText2) {
    this.extrinsicText2 = extrinsicText2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicText2")
  public String getExtrinsicText2() {
    return extrinsicText2;
  }
  public void setExtrinsicText2(String extrinsicText2) {
    this.extrinsicText2 = extrinsicText2;
  }

  
  /**
   **/
  public WorkActivity extrinsicText3(String extrinsicText3) {
    this.extrinsicText3 = extrinsicText3;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicText3")
  public String getExtrinsicText3() {
    return extrinsicText3;
  }
  public void setExtrinsicText3(String extrinsicText3) {
    this.extrinsicText3 = extrinsicText3;
  }

  
  /**
   **/
  public WorkActivity extrinsicNumber1(Integer extrinsicNumber1) {
    this.extrinsicNumber1 = extrinsicNumber1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicNumber1")
  public Integer getExtrinsicNumber1() {
    return extrinsicNumber1;
  }
  public void setExtrinsicNumber1(Integer extrinsicNumber1) {
    this.extrinsicNumber1 = extrinsicNumber1;
  }

  
  /**
   **/
  public WorkActivity extrinsicNumber2(Integer extrinsicNumber2) {
    this.extrinsicNumber2 = extrinsicNumber2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicNumber2")
  public Integer getExtrinsicNumber2() {
    return extrinsicNumber2;
  }
  public void setExtrinsicNumber2(Integer extrinsicNumber2) {
    this.extrinsicNumber2 = extrinsicNumber2;
  }

  
  /**
   **/
  public WorkActivity extrinsicDecimal1(BigDecimal extrinsicDecimal1) {
    this.extrinsicDecimal1 = extrinsicDecimal1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicDecimal1")
  public BigDecimal getExtrinsicDecimal1() {
    return extrinsicDecimal1;
  }
  public void setExtrinsicDecimal1(BigDecimal extrinsicDecimal1) {
    this.extrinsicDecimal1 = extrinsicDecimal1;
  }

  
  /**
   **/
  public WorkActivity extrinsicDecimal2(BigDecimal extrinsicDecimal2) {
    this.extrinsicDecimal2 = extrinsicDecimal2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrinsicDecimal2")
  public BigDecimal getExtrinsicDecimal2() {
    return extrinsicDecimal2;
  }
  public void setExtrinsicDecimal2(BigDecimal extrinsicDecimal2) {
    this.extrinsicDecimal2 = extrinsicDecimal2;
  }

  
  /**
   **/
  public WorkActivity casebreakEnabled(String casebreakEnabled) {
    this.casebreakEnabled = casebreakEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("casebreakEnabled")
  public String getCasebreakEnabled() {
    return casebreakEnabled;
  }
  public void setCasebreakEnabled(String casebreakEnabled) {
    this.casebreakEnabled = casebreakEnabled;
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
  public WorkActivity customFields(Map<String, Object> customFields) {
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
    WorkActivity workActivity = (WorkActivity) o;
    return Objects.equals(this.id, workActivity.id) &&
        Objects.equals(this.importedRecordId, workActivity.importedRecordId) &&
        Objects.equals(this.lobId, workActivity.lobId) &&
        Objects.equals(this.createDate, workActivity.createDate) &&
        Objects.equals(this.modifyDate, workActivity.modifyDate) &&
        Objects.equals(this.userId, workActivity.userId) &&
        Objects.equals(this.email, workActivity.email) &&
        Objects.equals(this.type, workActivity.type) &&
        Objects.equals(this.typeName, workActivity.typeName) &&
        Objects.equals(this.status, workActivity.status) &&
        Objects.equals(this.statusName, workActivity.statusName) &&
        Objects.equals(this.workBatchId, workActivity.workBatchId) &&
        Objects.equals(this.workParentId, workActivity.workParentId) &&
        Objects.equals(this.priorityCode, workActivity.priorityCode) &&
        Objects.equals(this.foreignId, workActivity.foreignId) &&
        Objects.equals(this.sourceWarehouseId, workActivity.sourceWarehouseId) &&
        Objects.equals(this.sourceWarehouseName, workActivity.sourceWarehouseName) &&
        Objects.equals(this.sourceLocation, workActivity.sourceLocation) &&
        Objects.equals(this.sourceBuildingId, workActivity.sourceBuildingId) &&
        Objects.equals(this.sourceBuildingName, workActivity.sourceBuildingName) &&
        Objects.equals(this.sourceZoneId, workActivity.sourceZoneId) &&
        Objects.equals(this.sourceZoneName, workActivity.sourceZoneName) &&
        Objects.equals(this.sourceAisleId, workActivity.sourceAisleId) &&
        Objects.equals(this.sourceAisleAddress, workActivity.sourceAisleAddress) &&
        Objects.equals(this.sourceOrigin, workActivity.sourceOrigin) &&
        Objects.equals(this.sourceOriginName, workActivity.sourceOriginName) &&
        Objects.equals(this.sourceBillingTypeId, workActivity.sourceBillingTypeId) &&
        Objects.equals(this.sourceBillingTypeName, workActivity.sourceBillingTypeName) &&
        Objects.equals(this.sourceBehaviorType, workActivity.sourceBehaviorType) &&
        Objects.equals(this.sourceBehaviorTypeName, workActivity.sourceBehaviorTypeName) &&
        Objects.equals(this.sourceFootprintId, workActivity.sourceFootprintId) &&
        Objects.equals(this.sourceFootprintName, workActivity.sourceFootprintName) &&
        Objects.equals(this.sourceFootprintHeight, workActivity.sourceFootprintHeight) &&
        Objects.equals(this.sourceFootprintWidth, workActivity.sourceFootprintWidth) &&
        Objects.equals(this.sourceFootprintDepth, workActivity.sourceFootprintDepth) &&
        Objects.equals(this.sourceAddressSchemeId, workActivity.sourceAddressSchemeId) &&
        Objects.equals(this.sourceAddressSchemeName, workActivity.sourceAddressSchemeName) &&
        Objects.equals(this.sourceLevel, workActivity.sourceLevel) &&
        Objects.equals(this.sourceBay, workActivity.sourceBay) &&
        Objects.equals(this.sourceNumber, workActivity.sourceNumber) &&
        Objects.equals(this.sourceOnline, workActivity.sourceOnline) &&
        Objects.equals(this.sourcePriorityCode, workActivity.sourcePriorityCode) &&
        Objects.equals(this.sourceCost, workActivity.sourceCost) &&
        Objects.equals(this.sourceAllowItemMixing, workActivity.sourceAllowItemMixing) &&
        Objects.equals(this.destinationWarehouseId, workActivity.destinationWarehouseId) &&
        Objects.equals(this.destinationWarehouseName, workActivity.destinationWarehouseName) &&
        Objects.equals(this.destinationLocation, workActivity.destinationLocation) &&
        Objects.equals(this.destinationBuildingId, workActivity.destinationBuildingId) &&
        Objects.equals(this.destinationBuildingName, workActivity.destinationBuildingName) &&
        Objects.equals(this.destinationZoneId, workActivity.destinationZoneId) &&
        Objects.equals(this.destinationZoneName, workActivity.destinationZoneName) &&
        Objects.equals(this.destinationAisleId, workActivity.destinationAisleId) &&
        Objects.equals(this.destinationAisleAddress, workActivity.destinationAisleAddress) &&
        Objects.equals(this.destinationOrigin, workActivity.destinationOrigin) &&
        Objects.equals(this.destinationOriginName, workActivity.destinationOriginName) &&
        Objects.equals(this.destinationBillingTypeId, workActivity.destinationBillingTypeId) &&
        Objects.equals(this.destinationBillingTypeName, workActivity.destinationBillingTypeName) &&
        Objects.equals(this.destinationBehaviorType, workActivity.destinationBehaviorType) &&
        Objects.equals(this.destinationBehaviorTypeName, workActivity.destinationBehaviorTypeName) &&
        Objects.equals(this.destinationFootprintId, workActivity.destinationFootprintId) &&
        Objects.equals(this.destinationFootprintName, workActivity.destinationFootprintName) &&
        Objects.equals(this.destinationFootprintHeight, workActivity.destinationFootprintHeight) &&
        Objects.equals(this.destinationFootprintWidth, workActivity.destinationFootprintWidth) &&
        Objects.equals(this.destinationFootprintDepth, workActivity.destinationFootprintDepth) &&
        Objects.equals(this.destinationAddressSchemeId, workActivity.destinationAddressSchemeId) &&
        Objects.equals(this.destinationAddressSchemeName, workActivity.destinationAddressSchemeName) &&
        Objects.equals(this.destinationLevel, workActivity.destinationLevel) &&
        Objects.equals(this.destinationBay, workActivity.destinationBay) &&
        Objects.equals(this.destinationNumber, workActivity.destinationNumber) &&
        Objects.equals(this.destinationOnline, workActivity.destinationOnline) &&
        Objects.equals(this.destinationPriorityCode, workActivity.destinationPriorityCode) &&
        Objects.equals(this.destinationCost, workActivity.destinationCost) &&
        Objects.equals(this.destinationAllowItemMixing, workActivity.destinationAllowItemMixing) &&
        Objects.equals(this.masterRef, workActivity.masterRef) &&
        Objects.equals(this.weightPerWrap, workActivity.weightPerWrap) &&
        Objects.equals(this.sku, workActivity.sku) &&
        Objects.equals(this.numericSortOrder, workActivity.numericSortOrder) &&
        Objects.equals(this.itemDescription, workActivity.itemDescription) &&
        Objects.equals(this.additionalDescription, workActivity.additionalDescription) &&
        Objects.equals(this.unitCode, workActivity.unitCode) &&
        Objects.equals(this.wrapCode, workActivity.wrapCode) &&
        Objects.equals(this.unitsPerWrap, workActivity.unitsPerWrap) &&
        Objects.equals(this.classRestriction, workActivity.classRestriction) &&
        Objects.equals(this.maxCycle, workActivity.maxCycle) &&
        Objects.equals(this.maxInterim, workActivity.maxInterim) &&
        Objects.equals(this.seasonalItem, workActivity.seasonalItem) &&
        Objects.equals(this.secure, workActivity.secure) &&
        Objects.equals(this.productType, workActivity.productType) &&
        Objects.equals(this.itemStatus, workActivity.itemStatus) &&
        Objects.equals(this.overallLeadTime, workActivity.overallLeadTime) &&
        Objects.equals(this.overallFixedReorderPoint, workActivity.overallFixedReorderPoint) &&
        Objects.equals(this.qualityControlIndicator, workActivity.qualityControlIndicator) &&
        Objects.equals(this.lotControlFlag, workActivity.lotControlFlag) &&
        Objects.equals(this.productCodeFlag, workActivity.productCodeFlag) &&
        Objects.equals(this.chargeCode, workActivity.chargeCode) &&
        Objects.equals(this.podRevDate, workActivity.podRevDate) &&
        Objects.equals(this.podOrderSuffix, workActivity.podOrderSuffix) &&
        Objects.equals(this.serialCode, workActivity.serialCode) &&
        Objects.equals(this.assetCode, workActivity.assetCode) &&
        Objects.equals(this.backorder, workActivity.backorder) &&
        Objects.equals(this.absoluteMax, workActivity.absoluteMax) &&
        Objects.equals(this.accountCodeId, workActivity.accountCodeId) &&
        Objects.equals(this.summaryCodeId, workActivity.summaryCodeId) &&
        Objects.equals(this.lowStockContactId, workActivity.lowStockContactId) &&
        Objects.equals(this.legacyLowLevelContactId, workActivity.legacyLowLevelContactId) &&
        Objects.equals(this.lowStockCodeId, workActivity.lowStockCodeId) &&
        Objects.equals(this.majorGroupId, workActivity.majorGroupId) &&
        Objects.equals(this.subGroupId, workActivity.subGroupId) &&
        Objects.equals(this.productCodeId, workActivity.productCodeId) &&
        Objects.equals(this.buyerId, workActivity.buyerId) &&
        Objects.equals(this.vendorSKU, workActivity.vendorSKU) &&
        Objects.equals(this.upc, workActivity.upc) &&
        Objects.equals(this.packingSlipDescription, workActivity.packingSlipDescription) &&
        Objects.equals(this.commodityCode, workActivity.commodityCode) &&
        Objects.equals(this.compCode, workActivity.compCode) &&
        Objects.equals(this.criticalAmount, workActivity.criticalAmount) &&
        Objects.equals(this.listPrice, workActivity.listPrice) &&
        Objects.equals(this.outsideVendor, workActivity.outsideVendor) &&
        Objects.equals(this.pickNo, workActivity.pickNo) &&
        Objects.equals(this.requiresProductionLot, workActivity.requiresProductionLot) &&
        Objects.equals(this.sector, workActivity.sector) &&
        Objects.equals(this.voidDate, workActivity.voidDate) &&
        Objects.equals(this.extrinsicText1, workActivity.extrinsicText1) &&
        Objects.equals(this.extrinsicText2, workActivity.extrinsicText2) &&
        Objects.equals(this.extrinsicText3, workActivity.extrinsicText3) &&
        Objects.equals(this.extrinsicNumber1, workActivity.extrinsicNumber1) &&
        Objects.equals(this.extrinsicNumber2, workActivity.extrinsicNumber2) &&
        Objects.equals(this.extrinsicDecimal1, workActivity.extrinsicDecimal1) &&
        Objects.equals(this.extrinsicDecimal2, workActivity.extrinsicDecimal2) &&
        Objects.equals(this.casebreakEnabled, workActivity.casebreakEnabled) &&
        Objects.equals(this.alcoholTypeId, workActivity.alcoholTypeId) &&
        Objects.equals(this.alcoholTypeName, workActivity.alcoholTypeName) &&
        Objects.equals(this.alcoholContent, workActivity.alcoholContent) &&
        Objects.equals(this.alcoholContainerId, workActivity.alcoholContainerId) &&
        Objects.equals(this.alcoholContainerName, workActivity.alcoholContainerName) &&
        Objects.equals(this.alcoholContainerVolume, workActivity.alcoholContainerVolume) &&
        Objects.equals(this.alcoholVintageYear, workActivity.alcoholVintageYear) &&
        Objects.equals(this.alcoholCountryId, workActivity.alcoholCountryId) &&
        Objects.equals(this.alcoholCountryName, workActivity.alcoholCountryName) &&
        Objects.equals(this.alcoholState, workActivity.alcoholState) &&
        Objects.equals(this.alcoholRegion, workActivity.alcoholRegion) &&
        Objects.equals(this.alcoholBrand, workActivity.alcoholBrand) &&
        Objects.equals(this.alcoholUPCCode, workActivity.alcoholUPCCode) &&
        Objects.equals(this.alcoholNABCACode, workActivity.alcoholNABCACode) &&
        Objects.equals(this.alcoholUNIMERCCode, workActivity.alcoholUNIMERCCode) &&
        Objects.equals(this.alcoholSCCCode, workActivity.alcoholSCCCode) &&
        Objects.equals(this.customFields, workActivity.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, importedRecordId, lobId, createDate, modifyDate, userId, email, type, typeName, status, statusName, workBatchId, workParentId, priorityCode, foreignId, sourceWarehouseId, sourceWarehouseName, sourceLocation, sourceBuildingId, sourceBuildingName, sourceZoneId, sourceZoneName, sourceAisleId, sourceAisleAddress, sourceOrigin, sourceOriginName, sourceBillingTypeId, sourceBillingTypeName, sourceBehaviorType, sourceBehaviorTypeName, sourceFootprintId, sourceFootprintName, sourceFootprintHeight, sourceFootprintWidth, sourceFootprintDepth, sourceAddressSchemeId, sourceAddressSchemeName, sourceLevel, sourceBay, sourceNumber, sourceOnline, sourcePriorityCode, sourceCost, sourceAllowItemMixing, destinationWarehouseId, destinationWarehouseName, destinationLocation, destinationBuildingId, destinationBuildingName, destinationZoneId, destinationZoneName, destinationAisleId, destinationAisleAddress, destinationOrigin, destinationOriginName, destinationBillingTypeId, destinationBillingTypeName, destinationBehaviorType, destinationBehaviorTypeName, destinationFootprintId, destinationFootprintName, destinationFootprintHeight, destinationFootprintWidth, destinationFootprintDepth, destinationAddressSchemeId, destinationAddressSchemeName, destinationLevel, destinationBay, destinationNumber, destinationOnline, destinationPriorityCode, destinationCost, destinationAllowItemMixing, masterRef, weightPerWrap, sku, numericSortOrder, itemDescription, additionalDescription, unitCode, wrapCode, unitsPerWrap, classRestriction, maxCycle, maxInterim, seasonalItem, secure, productType, itemStatus, overallLeadTime, overallFixedReorderPoint, qualityControlIndicator, lotControlFlag, productCodeFlag, chargeCode, podRevDate, podOrderSuffix, serialCode, assetCode, backorder, absoluteMax, accountCodeId, summaryCodeId, lowStockContactId, legacyLowLevelContactId, lowStockCodeId, majorGroupId, subGroupId, productCodeId, buyerId, vendorSKU, upc, packingSlipDescription, commodityCode, compCode, criticalAmount, listPrice, outsideVendor, pickNo, requiresProductionLot, sector, voidDate, extrinsicText1, extrinsicText2, extrinsicText3, extrinsicNumber1, extrinsicNumber2, extrinsicDecimal1, extrinsicDecimal2, casebreakEnabled, alcoholTypeId, alcoholTypeName, alcoholContent, alcoholContainerId, alcoholContainerName, alcoholContainerVolume, alcoholVintageYear, alcoholCountryId, alcoholCountryName, alcoholState, alcoholRegion, alcoholBrand, alcoholUPCCode, alcoholNABCACode, alcoholUNIMERCCode, alcoholSCCCode, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    importedRecordId: ").append(toIndentedString(importedRecordId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    workBatchId: ").append(toIndentedString(workBatchId)).append("\n");
    sb.append("    workParentId: ").append(toIndentedString(workParentId)).append("\n");
    sb.append("    priorityCode: ").append(toIndentedString(priorityCode)).append("\n");
    sb.append("    foreignId: ").append(toIndentedString(foreignId)).append("\n");
    sb.append("    sourceWarehouseId: ").append(toIndentedString(sourceWarehouseId)).append("\n");
    sb.append("    sourceWarehouseName: ").append(toIndentedString(sourceWarehouseName)).append("\n");
    sb.append("    sourceLocation: ").append(toIndentedString(sourceLocation)).append("\n");
    sb.append("    sourceBuildingId: ").append(toIndentedString(sourceBuildingId)).append("\n");
    sb.append("    sourceBuildingName: ").append(toIndentedString(sourceBuildingName)).append("\n");
    sb.append("    sourceZoneId: ").append(toIndentedString(sourceZoneId)).append("\n");
    sb.append("    sourceZoneName: ").append(toIndentedString(sourceZoneName)).append("\n");
    sb.append("    sourceAisleId: ").append(toIndentedString(sourceAisleId)).append("\n");
    sb.append("    sourceAisleAddress: ").append(toIndentedString(sourceAisleAddress)).append("\n");
    sb.append("    sourceOrigin: ").append(toIndentedString(sourceOrigin)).append("\n");
    sb.append("    sourceOriginName: ").append(toIndentedString(sourceOriginName)).append("\n");
    sb.append("    sourceBillingTypeId: ").append(toIndentedString(sourceBillingTypeId)).append("\n");
    sb.append("    sourceBillingTypeName: ").append(toIndentedString(sourceBillingTypeName)).append("\n");
    sb.append("    sourceBehaviorType: ").append(toIndentedString(sourceBehaviorType)).append("\n");
    sb.append("    sourceBehaviorTypeName: ").append(toIndentedString(sourceBehaviorTypeName)).append("\n");
    sb.append("    sourceFootprintId: ").append(toIndentedString(sourceFootprintId)).append("\n");
    sb.append("    sourceFootprintName: ").append(toIndentedString(sourceFootprintName)).append("\n");
    sb.append("    sourceFootprintHeight: ").append(toIndentedString(sourceFootprintHeight)).append("\n");
    sb.append("    sourceFootprintWidth: ").append(toIndentedString(sourceFootprintWidth)).append("\n");
    sb.append("    sourceFootprintDepth: ").append(toIndentedString(sourceFootprintDepth)).append("\n");
    sb.append("    sourceAddressSchemeId: ").append(toIndentedString(sourceAddressSchemeId)).append("\n");
    sb.append("    sourceAddressSchemeName: ").append(toIndentedString(sourceAddressSchemeName)).append("\n");
    sb.append("    sourceLevel: ").append(toIndentedString(sourceLevel)).append("\n");
    sb.append("    sourceBay: ").append(toIndentedString(sourceBay)).append("\n");
    sb.append("    sourceNumber: ").append(toIndentedString(sourceNumber)).append("\n");
    sb.append("    sourceOnline: ").append(toIndentedString(sourceOnline)).append("\n");
    sb.append("    sourcePriorityCode: ").append(toIndentedString(sourcePriorityCode)).append("\n");
    sb.append("    sourceCost: ").append(toIndentedString(sourceCost)).append("\n");
    sb.append("    sourceAllowItemMixing: ").append(toIndentedString(sourceAllowItemMixing)).append("\n");
    sb.append("    destinationWarehouseId: ").append(toIndentedString(destinationWarehouseId)).append("\n");
    sb.append("    destinationWarehouseName: ").append(toIndentedString(destinationWarehouseName)).append("\n");
    sb.append("    destinationLocation: ").append(toIndentedString(destinationLocation)).append("\n");
    sb.append("    destinationBuildingId: ").append(toIndentedString(destinationBuildingId)).append("\n");
    sb.append("    destinationBuildingName: ").append(toIndentedString(destinationBuildingName)).append("\n");
    sb.append("    destinationZoneId: ").append(toIndentedString(destinationZoneId)).append("\n");
    sb.append("    destinationZoneName: ").append(toIndentedString(destinationZoneName)).append("\n");
    sb.append("    destinationAisleId: ").append(toIndentedString(destinationAisleId)).append("\n");
    sb.append("    destinationAisleAddress: ").append(toIndentedString(destinationAisleAddress)).append("\n");
    sb.append("    destinationOrigin: ").append(toIndentedString(destinationOrigin)).append("\n");
    sb.append("    destinationOriginName: ").append(toIndentedString(destinationOriginName)).append("\n");
    sb.append("    destinationBillingTypeId: ").append(toIndentedString(destinationBillingTypeId)).append("\n");
    sb.append("    destinationBillingTypeName: ").append(toIndentedString(destinationBillingTypeName)).append("\n");
    sb.append("    destinationBehaviorType: ").append(toIndentedString(destinationBehaviorType)).append("\n");
    sb.append("    destinationBehaviorTypeName: ").append(toIndentedString(destinationBehaviorTypeName)).append("\n");
    sb.append("    destinationFootprintId: ").append(toIndentedString(destinationFootprintId)).append("\n");
    sb.append("    destinationFootprintName: ").append(toIndentedString(destinationFootprintName)).append("\n");
    sb.append("    destinationFootprintHeight: ").append(toIndentedString(destinationFootprintHeight)).append("\n");
    sb.append("    destinationFootprintWidth: ").append(toIndentedString(destinationFootprintWidth)).append("\n");
    sb.append("    destinationFootprintDepth: ").append(toIndentedString(destinationFootprintDepth)).append("\n");
    sb.append("    destinationAddressSchemeId: ").append(toIndentedString(destinationAddressSchemeId)).append("\n");
    sb.append("    destinationAddressSchemeName: ").append(toIndentedString(destinationAddressSchemeName)).append("\n");
    sb.append("    destinationLevel: ").append(toIndentedString(destinationLevel)).append("\n");
    sb.append("    destinationBay: ").append(toIndentedString(destinationBay)).append("\n");
    sb.append("    destinationNumber: ").append(toIndentedString(destinationNumber)).append("\n");
    sb.append("    destinationOnline: ").append(toIndentedString(destinationOnline)).append("\n");
    sb.append("    destinationPriorityCode: ").append(toIndentedString(destinationPriorityCode)).append("\n");
    sb.append("    destinationCost: ").append(toIndentedString(destinationCost)).append("\n");
    sb.append("    destinationAllowItemMixing: ").append(toIndentedString(destinationAllowItemMixing)).append("\n");
    sb.append("    masterRef: ").append(toIndentedString(masterRef)).append("\n");
    sb.append("    weightPerWrap: ").append(toIndentedString(weightPerWrap)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    numericSortOrder: ").append(toIndentedString(numericSortOrder)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    additionalDescription: ").append(toIndentedString(additionalDescription)).append("\n");
    sb.append("    unitCode: ").append(toIndentedString(unitCode)).append("\n");
    sb.append("    wrapCode: ").append(toIndentedString(wrapCode)).append("\n");
    sb.append("    unitsPerWrap: ").append(toIndentedString(unitsPerWrap)).append("\n");
    sb.append("    classRestriction: ").append(toIndentedString(classRestriction)).append("\n");
    sb.append("    maxCycle: ").append(toIndentedString(maxCycle)).append("\n");
    sb.append("    maxInterim: ").append(toIndentedString(maxInterim)).append("\n");
    sb.append("    seasonalItem: ").append(toIndentedString(seasonalItem)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
    sb.append("    overallLeadTime: ").append(toIndentedString(overallLeadTime)).append("\n");
    sb.append("    overallFixedReorderPoint: ").append(toIndentedString(overallFixedReorderPoint)).append("\n");
    sb.append("    qualityControlIndicator: ").append(toIndentedString(qualityControlIndicator)).append("\n");
    sb.append("    lotControlFlag: ").append(toIndentedString(lotControlFlag)).append("\n");
    sb.append("    productCodeFlag: ").append(toIndentedString(productCodeFlag)).append("\n");
    sb.append("    chargeCode: ").append(toIndentedString(chargeCode)).append("\n");
    sb.append("    podRevDate: ").append(toIndentedString(podRevDate)).append("\n");
    sb.append("    podOrderSuffix: ").append(toIndentedString(podOrderSuffix)).append("\n");
    sb.append("    serialCode: ").append(toIndentedString(serialCode)).append("\n");
    sb.append("    assetCode: ").append(toIndentedString(assetCode)).append("\n");
    sb.append("    backorder: ").append(toIndentedString(backorder)).append("\n");
    sb.append("    absoluteMax: ").append(toIndentedString(absoluteMax)).append("\n");
    sb.append("    accountCodeId: ").append(toIndentedString(accountCodeId)).append("\n");
    sb.append("    summaryCodeId: ").append(toIndentedString(summaryCodeId)).append("\n");
    sb.append("    lowStockContactId: ").append(toIndentedString(lowStockContactId)).append("\n");
    sb.append("    legacyLowLevelContactId: ").append(toIndentedString(legacyLowLevelContactId)).append("\n");
    sb.append("    lowStockCodeId: ").append(toIndentedString(lowStockCodeId)).append("\n");
    sb.append("    majorGroupId: ").append(toIndentedString(majorGroupId)).append("\n");
    sb.append("    subGroupId: ").append(toIndentedString(subGroupId)).append("\n");
    sb.append("    productCodeId: ").append(toIndentedString(productCodeId)).append("\n");
    sb.append("    buyerId: ").append(toIndentedString(buyerId)).append("\n");
    sb.append("    vendorSKU: ").append(toIndentedString(vendorSKU)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    packingSlipDescription: ").append(toIndentedString(packingSlipDescription)).append("\n");
    sb.append("    commodityCode: ").append(toIndentedString(commodityCode)).append("\n");
    sb.append("    compCode: ").append(toIndentedString(compCode)).append("\n");
    sb.append("    criticalAmount: ").append(toIndentedString(criticalAmount)).append("\n");
    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
    sb.append("    outsideVendor: ").append(toIndentedString(outsideVendor)).append("\n");
    sb.append("    pickNo: ").append(toIndentedString(pickNo)).append("\n");
    sb.append("    requiresProductionLot: ").append(toIndentedString(requiresProductionLot)).append("\n");
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
    sb.append("    voidDate: ").append(toIndentedString(voidDate)).append("\n");
    sb.append("    extrinsicText1: ").append(toIndentedString(extrinsicText1)).append("\n");
    sb.append("    extrinsicText2: ").append(toIndentedString(extrinsicText2)).append("\n");
    sb.append("    extrinsicText3: ").append(toIndentedString(extrinsicText3)).append("\n");
    sb.append("    extrinsicNumber1: ").append(toIndentedString(extrinsicNumber1)).append("\n");
    sb.append("    extrinsicNumber2: ").append(toIndentedString(extrinsicNumber2)).append("\n");
    sb.append("    extrinsicDecimal1: ").append(toIndentedString(extrinsicDecimal1)).append("\n");
    sb.append("    extrinsicDecimal2: ").append(toIndentedString(extrinsicDecimal2)).append("\n");
    sb.append("    casebreakEnabled: ").append(toIndentedString(casebreakEnabled)).append("\n");
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

