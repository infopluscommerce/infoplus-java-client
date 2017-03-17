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





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class ItemReceiptActivity   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer itemReceiptId = null;
  private Integer lobId = null;
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
  private Integer warehouseId = null;
  private String warehouseName = null;
  private Integer itemId = null;
  private String controlNo = null;
  private String itemVendorSku = null;
  private String itemUPC = null;
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
  private String vendorComplianceSurveyAnswer1 = null;
  private String vendorComplianceSurveyAnswer2 = null;
  private String vendorComplianceSurveyAnswer3 = null;
  private String vendorComplianceSurveyAnswer4 = null;
  private String vendorComplianceSurveyAnswer5 = null;
  private String vendorComplianceSurveyAnswer6 = null;
  private String vendorComplianceSurveyAnswer7 = null;
  private String vendorComplianceSurveyAnswer8 = null;
  private String vendorComplianceSurveyAnswer9 = null;
  private String vendorComplianceSurveyAnswer10 = null;
  private String vendorComplianceSurveyAnswer11 = null;
  private String vendorComplianceSurveyAnswer12 = null;
  private String vendorComplianceSurveyAnswer13 = null;
  private String vendorComplianceSurveyAnswer14 = null;
  private String vendorComplianceSurveyAnswer15 = null;
  private String vendorComplianceSurveyAnswer16 = null;
  private String vendorComplianceSurveyAnswer17 = null;
  private String vendorComplianceSurveyAnswer18 = null;
  private String vendorComplianceSurveyAnswer19 = null;
  private String vendorComplianceSurveyAnswer20 = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public ItemReceiptActivity createDate(Date createDate) {
    this.createDate = createDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  
  /**
   **/
  public ItemReceiptActivity modifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }
  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemReceiptId")
  public Integer getItemReceiptId() {
    return itemReceiptId;
  }

  
  /**
   **/
  public ItemReceiptActivity lobId(Integer lobId) {
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

  
  /**
   **/
  public ItemReceiptActivity poNo(String poNo) {
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
  public ItemReceiptActivity receiptDistributionDate(Date receiptDistributionDate) {
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
  public ItemReceiptActivity receiptUnitsPerWrap(Integer receiptUnitsPerWrap) {
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
  public ItemReceiptActivity receiptUnitsPerCase(Integer receiptUnitsPerCase) {
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
  public ItemReceiptActivity receiptRevisionDate(String receiptRevisionDate) {
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
  public ItemReceiptActivity receiptProductionLot(String receiptProductionLot) {
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
  public ItemReceiptActivity receiptReceiveDate(Date receiptReceiveDate) {
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
  public ItemReceiptActivity receiptStatus(String receiptStatus) {
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
  public ItemReceiptActivity receiptStatusName(String receiptStatusName) {
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
  public ItemReceiptActivity receiptUnitCode(Integer receiptUnitCode) {
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
  public ItemReceiptActivity receiptUnitCodeText(String receiptUnitCodeText) {
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
  public ItemReceiptActivity receiptWrapCode(Integer receiptWrapCode) {
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
  public ItemReceiptActivity receiptWrapCodeText(String receiptWrapCodeText) {
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
  public ItemReceiptActivity receiptCaseWeight(BigDecimal receiptCaseWeight) {
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
  public ItemReceiptActivity receiptProductIdTag(String receiptProductIdTag) {
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
  public ItemReceiptActivity warehouseId(Integer warehouseId) {
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
  public ItemReceiptActivity warehouseName(String warehouseName) {
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
  public ItemReceiptActivity itemId(Integer itemId) {
    this.itemId = itemId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemId")
  public Integer getItemId() {
    return itemId;
  }
  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  
  /**
   **/
  public ItemReceiptActivity controlNo(String controlNo) {
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
  public ItemReceiptActivity itemVendorSku(String itemVendorSku) {
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
  public ItemReceiptActivity itemUPC(String itemUPC) {
    this.itemUPC = itemUPC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemUPC")
  public String getItemUPC() {
    return itemUPC;
  }
  public void setItemUPC(String itemUPC) {
    this.itemUPC = itemUPC;
  }

  
  /**
   **/
  public ItemReceiptActivity itemMajorGroup(Integer itemMajorGroup) {
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
  public ItemReceiptActivity itemMajorGroupName(String itemMajorGroupName) {
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
  public ItemReceiptActivity itemSubGroup(Integer itemSubGroup) {
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
  public ItemReceiptActivity itemSubGroupName(String itemSubGroupName) {
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
  public ItemReceiptActivity itemProductCode(Integer itemProductCode) {
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
  public ItemReceiptActivity itemProductCodeName(String itemProductCodeName) {
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
  public ItemReceiptActivity itemAccountCode(String itemAccountCode) {
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
  public ItemReceiptActivity itemAccountCodeName(String itemAccountCodeName) {
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
  public ItemReceiptActivity itemSummaryCode(Integer itemSummaryCode) {
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
  public ItemReceiptActivity itemSummaryCodeName(String itemSummaryCodeName) {
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
  public ItemReceiptActivity itemSector(String itemSector) {
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
  public ItemReceiptActivity vendorComplianceSurveyAnswer1(String vendorComplianceSurveyAnswer1) {
    this.vendorComplianceSurveyAnswer1 = vendorComplianceSurveyAnswer1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer1")
  public String getVendorComplianceSurveyAnswer1() {
    return vendorComplianceSurveyAnswer1;
  }
  public void setVendorComplianceSurveyAnswer1(String vendorComplianceSurveyAnswer1) {
    this.vendorComplianceSurveyAnswer1 = vendorComplianceSurveyAnswer1;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer2(String vendorComplianceSurveyAnswer2) {
    this.vendorComplianceSurveyAnswer2 = vendorComplianceSurveyAnswer2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer2")
  public String getVendorComplianceSurveyAnswer2() {
    return vendorComplianceSurveyAnswer2;
  }
  public void setVendorComplianceSurveyAnswer2(String vendorComplianceSurveyAnswer2) {
    this.vendorComplianceSurveyAnswer2 = vendorComplianceSurveyAnswer2;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer3(String vendorComplianceSurveyAnswer3) {
    this.vendorComplianceSurveyAnswer3 = vendorComplianceSurveyAnswer3;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer3")
  public String getVendorComplianceSurveyAnswer3() {
    return vendorComplianceSurveyAnswer3;
  }
  public void setVendorComplianceSurveyAnswer3(String vendorComplianceSurveyAnswer3) {
    this.vendorComplianceSurveyAnswer3 = vendorComplianceSurveyAnswer3;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer4(String vendorComplianceSurveyAnswer4) {
    this.vendorComplianceSurveyAnswer4 = vendorComplianceSurveyAnswer4;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer4")
  public String getVendorComplianceSurveyAnswer4() {
    return vendorComplianceSurveyAnswer4;
  }
  public void setVendorComplianceSurveyAnswer4(String vendorComplianceSurveyAnswer4) {
    this.vendorComplianceSurveyAnswer4 = vendorComplianceSurveyAnswer4;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer5(String vendorComplianceSurveyAnswer5) {
    this.vendorComplianceSurveyAnswer5 = vendorComplianceSurveyAnswer5;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer5")
  public String getVendorComplianceSurveyAnswer5() {
    return vendorComplianceSurveyAnswer5;
  }
  public void setVendorComplianceSurveyAnswer5(String vendorComplianceSurveyAnswer5) {
    this.vendorComplianceSurveyAnswer5 = vendorComplianceSurveyAnswer5;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer6(String vendorComplianceSurveyAnswer6) {
    this.vendorComplianceSurveyAnswer6 = vendorComplianceSurveyAnswer6;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer6")
  public String getVendorComplianceSurveyAnswer6() {
    return vendorComplianceSurveyAnswer6;
  }
  public void setVendorComplianceSurveyAnswer6(String vendorComplianceSurveyAnswer6) {
    this.vendorComplianceSurveyAnswer6 = vendorComplianceSurveyAnswer6;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer7(String vendorComplianceSurveyAnswer7) {
    this.vendorComplianceSurveyAnswer7 = vendorComplianceSurveyAnswer7;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer7")
  public String getVendorComplianceSurveyAnswer7() {
    return vendorComplianceSurveyAnswer7;
  }
  public void setVendorComplianceSurveyAnswer7(String vendorComplianceSurveyAnswer7) {
    this.vendorComplianceSurveyAnswer7 = vendorComplianceSurveyAnswer7;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer8(String vendorComplianceSurveyAnswer8) {
    this.vendorComplianceSurveyAnswer8 = vendorComplianceSurveyAnswer8;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer8")
  public String getVendorComplianceSurveyAnswer8() {
    return vendorComplianceSurveyAnswer8;
  }
  public void setVendorComplianceSurveyAnswer8(String vendorComplianceSurveyAnswer8) {
    this.vendorComplianceSurveyAnswer8 = vendorComplianceSurveyAnswer8;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer9(String vendorComplianceSurveyAnswer9) {
    this.vendorComplianceSurveyAnswer9 = vendorComplianceSurveyAnswer9;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer9")
  public String getVendorComplianceSurveyAnswer9() {
    return vendorComplianceSurveyAnswer9;
  }
  public void setVendorComplianceSurveyAnswer9(String vendorComplianceSurveyAnswer9) {
    this.vendorComplianceSurveyAnswer9 = vendorComplianceSurveyAnswer9;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer10(String vendorComplianceSurveyAnswer10) {
    this.vendorComplianceSurveyAnswer10 = vendorComplianceSurveyAnswer10;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer10")
  public String getVendorComplianceSurveyAnswer10() {
    return vendorComplianceSurveyAnswer10;
  }
  public void setVendorComplianceSurveyAnswer10(String vendorComplianceSurveyAnswer10) {
    this.vendorComplianceSurveyAnswer10 = vendorComplianceSurveyAnswer10;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer11(String vendorComplianceSurveyAnswer11) {
    this.vendorComplianceSurveyAnswer11 = vendorComplianceSurveyAnswer11;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer11")
  public String getVendorComplianceSurveyAnswer11() {
    return vendorComplianceSurveyAnswer11;
  }
  public void setVendorComplianceSurveyAnswer11(String vendorComplianceSurveyAnswer11) {
    this.vendorComplianceSurveyAnswer11 = vendorComplianceSurveyAnswer11;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer12(String vendorComplianceSurveyAnswer12) {
    this.vendorComplianceSurveyAnswer12 = vendorComplianceSurveyAnswer12;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer12")
  public String getVendorComplianceSurveyAnswer12() {
    return vendorComplianceSurveyAnswer12;
  }
  public void setVendorComplianceSurveyAnswer12(String vendorComplianceSurveyAnswer12) {
    this.vendorComplianceSurveyAnswer12 = vendorComplianceSurveyAnswer12;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer13(String vendorComplianceSurveyAnswer13) {
    this.vendorComplianceSurveyAnswer13 = vendorComplianceSurveyAnswer13;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer13")
  public String getVendorComplianceSurveyAnswer13() {
    return vendorComplianceSurveyAnswer13;
  }
  public void setVendorComplianceSurveyAnswer13(String vendorComplianceSurveyAnswer13) {
    this.vendorComplianceSurveyAnswer13 = vendorComplianceSurveyAnswer13;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer14(String vendorComplianceSurveyAnswer14) {
    this.vendorComplianceSurveyAnswer14 = vendorComplianceSurveyAnswer14;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer14")
  public String getVendorComplianceSurveyAnswer14() {
    return vendorComplianceSurveyAnswer14;
  }
  public void setVendorComplianceSurveyAnswer14(String vendorComplianceSurveyAnswer14) {
    this.vendorComplianceSurveyAnswer14 = vendorComplianceSurveyAnswer14;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer15(String vendorComplianceSurveyAnswer15) {
    this.vendorComplianceSurveyAnswer15 = vendorComplianceSurveyAnswer15;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer15")
  public String getVendorComplianceSurveyAnswer15() {
    return vendorComplianceSurveyAnswer15;
  }
  public void setVendorComplianceSurveyAnswer15(String vendorComplianceSurveyAnswer15) {
    this.vendorComplianceSurveyAnswer15 = vendorComplianceSurveyAnswer15;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer16(String vendorComplianceSurveyAnswer16) {
    this.vendorComplianceSurveyAnswer16 = vendorComplianceSurveyAnswer16;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer16")
  public String getVendorComplianceSurveyAnswer16() {
    return vendorComplianceSurveyAnswer16;
  }
  public void setVendorComplianceSurveyAnswer16(String vendorComplianceSurveyAnswer16) {
    this.vendorComplianceSurveyAnswer16 = vendorComplianceSurveyAnswer16;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer17(String vendorComplianceSurveyAnswer17) {
    this.vendorComplianceSurveyAnswer17 = vendorComplianceSurveyAnswer17;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer17")
  public String getVendorComplianceSurveyAnswer17() {
    return vendorComplianceSurveyAnswer17;
  }
  public void setVendorComplianceSurveyAnswer17(String vendorComplianceSurveyAnswer17) {
    this.vendorComplianceSurveyAnswer17 = vendorComplianceSurveyAnswer17;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer18(String vendorComplianceSurveyAnswer18) {
    this.vendorComplianceSurveyAnswer18 = vendorComplianceSurveyAnswer18;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer18")
  public String getVendorComplianceSurveyAnswer18() {
    return vendorComplianceSurveyAnswer18;
  }
  public void setVendorComplianceSurveyAnswer18(String vendorComplianceSurveyAnswer18) {
    this.vendorComplianceSurveyAnswer18 = vendorComplianceSurveyAnswer18;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer19(String vendorComplianceSurveyAnswer19) {
    this.vendorComplianceSurveyAnswer19 = vendorComplianceSurveyAnswer19;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer19")
  public String getVendorComplianceSurveyAnswer19() {
    return vendorComplianceSurveyAnswer19;
  }
  public void setVendorComplianceSurveyAnswer19(String vendorComplianceSurveyAnswer19) {
    this.vendorComplianceSurveyAnswer19 = vendorComplianceSurveyAnswer19;
  }

  
  /**
   **/
  public ItemReceiptActivity vendorComplianceSurveyAnswer20(String vendorComplianceSurveyAnswer20) {
    this.vendorComplianceSurveyAnswer20 = vendorComplianceSurveyAnswer20;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vendorComplianceSurveyAnswer20")
  public String getVendorComplianceSurveyAnswer20() {
    return vendorComplianceSurveyAnswer20;
  }
  public void setVendorComplianceSurveyAnswer20(String vendorComplianceSurveyAnswer20) {
    this.vendorComplianceSurveyAnswer20 = vendorComplianceSurveyAnswer20;
  }

  
  /**
   **/
  public ItemReceiptActivity customFields(Map<String, Object> customFields) {
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
    ItemReceiptActivity itemReceiptActivity = (ItemReceiptActivity) o;
    return Objects.equals(this.id, itemReceiptActivity.id) &&
        Objects.equals(this.createDate, itemReceiptActivity.createDate) &&
        Objects.equals(this.modifyDate, itemReceiptActivity.modifyDate) &&
        Objects.equals(this.itemReceiptId, itemReceiptActivity.itemReceiptId) &&
        Objects.equals(this.lobId, itemReceiptActivity.lobId) &&
        Objects.equals(this.poNo, itemReceiptActivity.poNo) &&
        Objects.equals(this.receiptDistributionDate, itemReceiptActivity.receiptDistributionDate) &&
        Objects.equals(this.receiptUnitsPerWrap, itemReceiptActivity.receiptUnitsPerWrap) &&
        Objects.equals(this.receiptUnitsPerCase, itemReceiptActivity.receiptUnitsPerCase) &&
        Objects.equals(this.receiptRevisionDate, itemReceiptActivity.receiptRevisionDate) &&
        Objects.equals(this.receiptProductionLot, itemReceiptActivity.receiptProductionLot) &&
        Objects.equals(this.receiptReceiveDate, itemReceiptActivity.receiptReceiveDate) &&
        Objects.equals(this.receiptStatus, itemReceiptActivity.receiptStatus) &&
        Objects.equals(this.receiptStatusName, itemReceiptActivity.receiptStatusName) &&
        Objects.equals(this.receiptUnitCode, itemReceiptActivity.receiptUnitCode) &&
        Objects.equals(this.receiptUnitCodeText, itemReceiptActivity.receiptUnitCodeText) &&
        Objects.equals(this.receiptWrapCode, itemReceiptActivity.receiptWrapCode) &&
        Objects.equals(this.receiptWrapCodeText, itemReceiptActivity.receiptWrapCodeText) &&
        Objects.equals(this.receiptCaseWeight, itemReceiptActivity.receiptCaseWeight) &&
        Objects.equals(this.receiptProductIdTag, itemReceiptActivity.receiptProductIdTag) &&
        Objects.equals(this.warehouseId, itemReceiptActivity.warehouseId) &&
        Objects.equals(this.warehouseName, itemReceiptActivity.warehouseName) &&
        Objects.equals(this.itemId, itemReceiptActivity.itemId) &&
        Objects.equals(this.controlNo, itemReceiptActivity.controlNo) &&
        Objects.equals(this.itemVendorSku, itemReceiptActivity.itemVendorSku) &&
        Objects.equals(this.itemUPC, itemReceiptActivity.itemUPC) &&
        Objects.equals(this.itemMajorGroup, itemReceiptActivity.itemMajorGroup) &&
        Objects.equals(this.itemMajorGroupName, itemReceiptActivity.itemMajorGroupName) &&
        Objects.equals(this.itemSubGroup, itemReceiptActivity.itemSubGroup) &&
        Objects.equals(this.itemSubGroupName, itemReceiptActivity.itemSubGroupName) &&
        Objects.equals(this.itemProductCode, itemReceiptActivity.itemProductCode) &&
        Objects.equals(this.itemProductCodeName, itemReceiptActivity.itemProductCodeName) &&
        Objects.equals(this.itemAccountCode, itemReceiptActivity.itemAccountCode) &&
        Objects.equals(this.itemAccountCodeName, itemReceiptActivity.itemAccountCodeName) &&
        Objects.equals(this.itemSummaryCode, itemReceiptActivity.itemSummaryCode) &&
        Objects.equals(this.itemSummaryCodeName, itemReceiptActivity.itemSummaryCodeName) &&
        Objects.equals(this.itemSector, itemReceiptActivity.itemSector) &&
        Objects.equals(this.vendorComplianceSurveyAnswer1, itemReceiptActivity.vendorComplianceSurveyAnswer1) &&
        Objects.equals(this.vendorComplianceSurveyAnswer2, itemReceiptActivity.vendorComplianceSurveyAnswer2) &&
        Objects.equals(this.vendorComplianceSurveyAnswer3, itemReceiptActivity.vendorComplianceSurveyAnswer3) &&
        Objects.equals(this.vendorComplianceSurveyAnswer4, itemReceiptActivity.vendorComplianceSurveyAnswer4) &&
        Objects.equals(this.vendorComplianceSurveyAnswer5, itemReceiptActivity.vendorComplianceSurveyAnswer5) &&
        Objects.equals(this.vendorComplianceSurveyAnswer6, itemReceiptActivity.vendorComplianceSurveyAnswer6) &&
        Objects.equals(this.vendorComplianceSurveyAnswer7, itemReceiptActivity.vendorComplianceSurveyAnswer7) &&
        Objects.equals(this.vendorComplianceSurveyAnswer8, itemReceiptActivity.vendorComplianceSurveyAnswer8) &&
        Objects.equals(this.vendorComplianceSurveyAnswer9, itemReceiptActivity.vendorComplianceSurveyAnswer9) &&
        Objects.equals(this.vendorComplianceSurveyAnswer10, itemReceiptActivity.vendorComplianceSurveyAnswer10) &&
        Objects.equals(this.vendorComplianceSurveyAnswer11, itemReceiptActivity.vendorComplianceSurveyAnswer11) &&
        Objects.equals(this.vendorComplianceSurveyAnswer12, itemReceiptActivity.vendorComplianceSurveyAnswer12) &&
        Objects.equals(this.vendorComplianceSurveyAnswer13, itemReceiptActivity.vendorComplianceSurveyAnswer13) &&
        Objects.equals(this.vendorComplianceSurveyAnswer14, itemReceiptActivity.vendorComplianceSurveyAnswer14) &&
        Objects.equals(this.vendorComplianceSurveyAnswer15, itemReceiptActivity.vendorComplianceSurveyAnswer15) &&
        Objects.equals(this.vendorComplianceSurveyAnswer16, itemReceiptActivity.vendorComplianceSurveyAnswer16) &&
        Objects.equals(this.vendorComplianceSurveyAnswer17, itemReceiptActivity.vendorComplianceSurveyAnswer17) &&
        Objects.equals(this.vendorComplianceSurveyAnswer18, itemReceiptActivity.vendorComplianceSurveyAnswer18) &&
        Objects.equals(this.vendorComplianceSurveyAnswer19, itemReceiptActivity.vendorComplianceSurveyAnswer19) &&
        Objects.equals(this.vendorComplianceSurveyAnswer20, itemReceiptActivity.vendorComplianceSurveyAnswer20) &&
        Objects.equals(this.customFields, itemReceiptActivity.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, itemReceiptId, lobId, poNo, receiptDistributionDate, receiptUnitsPerWrap, receiptUnitsPerCase, receiptRevisionDate, receiptProductionLot, receiptReceiveDate, receiptStatus, receiptStatusName, receiptUnitCode, receiptUnitCodeText, receiptWrapCode, receiptWrapCodeText, receiptCaseWeight, receiptProductIdTag, warehouseId, warehouseName, itemId, controlNo, itemVendorSku, itemUPC, itemMajorGroup, itemMajorGroupName, itemSubGroup, itemSubGroupName, itemProductCode, itemProductCodeName, itemAccountCode, itemAccountCodeName, itemSummaryCode, itemSummaryCodeName, itemSector, vendorComplianceSurveyAnswer1, vendorComplianceSurveyAnswer2, vendorComplianceSurveyAnswer3, vendorComplianceSurveyAnswer4, vendorComplianceSurveyAnswer5, vendorComplianceSurveyAnswer6, vendorComplianceSurveyAnswer7, vendorComplianceSurveyAnswer8, vendorComplianceSurveyAnswer9, vendorComplianceSurveyAnswer10, vendorComplianceSurveyAnswer11, vendorComplianceSurveyAnswer12, vendorComplianceSurveyAnswer13, vendorComplianceSurveyAnswer14, vendorComplianceSurveyAnswer15, vendorComplianceSurveyAnswer16, vendorComplianceSurveyAnswer17, vendorComplianceSurveyAnswer18, vendorComplianceSurveyAnswer19, vendorComplianceSurveyAnswer20, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemReceiptActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    itemReceiptId: ").append(toIndentedString(itemReceiptId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
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
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    warehouseName: ").append(toIndentedString(warehouseName)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    controlNo: ").append(toIndentedString(controlNo)).append("\n");
    sb.append("    itemVendorSku: ").append(toIndentedString(itemVendorSku)).append("\n");
    sb.append("    itemUPC: ").append(toIndentedString(itemUPC)).append("\n");
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
    sb.append("    vendorComplianceSurveyAnswer1: ").append(toIndentedString(vendorComplianceSurveyAnswer1)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer2: ").append(toIndentedString(vendorComplianceSurveyAnswer2)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer3: ").append(toIndentedString(vendorComplianceSurveyAnswer3)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer4: ").append(toIndentedString(vendorComplianceSurveyAnswer4)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer5: ").append(toIndentedString(vendorComplianceSurveyAnswer5)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer6: ").append(toIndentedString(vendorComplianceSurveyAnswer6)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer7: ").append(toIndentedString(vendorComplianceSurveyAnswer7)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer8: ").append(toIndentedString(vendorComplianceSurveyAnswer8)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer9: ").append(toIndentedString(vendorComplianceSurveyAnswer9)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer10: ").append(toIndentedString(vendorComplianceSurveyAnswer10)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer11: ").append(toIndentedString(vendorComplianceSurveyAnswer11)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer12: ").append(toIndentedString(vendorComplianceSurveyAnswer12)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer13: ").append(toIndentedString(vendorComplianceSurveyAnswer13)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer14: ").append(toIndentedString(vendorComplianceSurveyAnswer14)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer15: ").append(toIndentedString(vendorComplianceSurveyAnswer15)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer16: ").append(toIndentedString(vendorComplianceSurveyAnswer16)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer17: ").append(toIndentedString(vendorComplianceSurveyAnswer17)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer18: ").append(toIndentedString(vendorComplianceSurveyAnswer18)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer19: ").append(toIndentedString(vendorComplianceSurveyAnswer19)).append("\n");
    sb.append("    vendorComplianceSurveyAnswer20: ").append(toIndentedString(vendorComplianceSurveyAnswer20)).append("\n");
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

