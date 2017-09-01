package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-31T16:32:12.628-05:00")
public class LowStock   {
  
  private Integer id = null;
  private Integer warehouseId = null;
  private Date lowLevelDate = null;
  private String lowStockMessage = null;
  private String printFlag = null;
  private Boolean isDelayed = false;
  private Date createDate = null;
  private Date modifyDate = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();
  private String sku = null;

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public LowStock warehouseId(Integer warehouseId) {
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lowLevelDate")
  public Date getLowLevelDate() {
    return lowLevelDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lowStockMessage")
  public String getLowStockMessage() {
    return lowStockMessage;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("printFlag")
  public String getPrintFlag() {
    return printFlag;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isDelayed")
  public Boolean getIsDelayed() {
    return isDelayed;
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
  public LowStock customFields(Map<String, Object> customFields) {
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

  
  /**
   **/
  public LowStock sku(String sku) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LowStock lowStock = (LowStock) o;
    return Objects.equals(this.id, lowStock.id) &&
        Objects.equals(this.warehouseId, lowStock.warehouseId) &&
        Objects.equals(this.lowLevelDate, lowStock.lowLevelDate) &&
        Objects.equals(this.lowStockMessage, lowStock.lowStockMessage) &&
        Objects.equals(this.printFlag, lowStock.printFlag) &&
        Objects.equals(this.isDelayed, lowStock.isDelayed) &&
        Objects.equals(this.createDate, lowStock.createDate) &&
        Objects.equals(this.modifyDate, lowStock.modifyDate) &&
        Objects.equals(this.customFields, lowStock.customFields) &&
        Objects.equals(this.sku, lowStock.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, lowLevelDate, lowStockMessage, printFlag, isDelayed, createDate, modifyDate, customFields, sku);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LowStock {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    lowLevelDate: ").append(toIndentedString(lowLevelDate)).append("\n");
    sb.append("    lowStockMessage: ").append(toIndentedString(lowStockMessage)).append("\n");
    sb.append("    printFlag: ").append(toIndentedString(printFlag)).append("\n");
    sb.append("    isDelayed: ").append(toIndentedString(isDelayed)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

