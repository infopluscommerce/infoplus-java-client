package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class LowStock   {
  
  private Integer id = null;
  private Integer warehouseId = null;
  private Date lowLevelDate = null;
  private String lowStockMessage = null;
  private String printFlag = null;
  private Boolean isDelayed = false;
  private Date createDate = null;
  private Date modifyDate = null;
  private String sku = null;

  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("lowLevelDate")
  public Date getLowLevelDate() {
    return lowLevelDate;
  }
  public void setLowLevelDate(Date lowLevelDate) {
    this.lowLevelDate = lowLevelDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lowStockMessage")
  public String getLowStockMessage() {
    return lowStockMessage;
  }
  public void setLowStockMessage(String lowStockMessage) {
    this.lowStockMessage = lowStockMessage;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("printFlag")
  public String getPrintFlag() {
    return printFlag;
  }
  public void setPrintFlag(String printFlag) {
    this.printFlag = printFlag;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isDelayed")
  public Boolean getIsDelayed() {
    return isDelayed;
  }
  public void setIsDelayed(Boolean isDelayed) {
    this.isDelayed = isDelayed;
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LowStock lowStock = (LowStock) o;
    return Objects.equals(id, lowStock.id) &&
        Objects.equals(warehouseId, lowStock.warehouseId) &&
        Objects.equals(lowLevelDate, lowStock.lowLevelDate) &&
        Objects.equals(lowStockMessage, lowStock.lowStockMessage) &&
        Objects.equals(printFlag, lowStock.printFlag) &&
        Objects.equals(isDelayed, lowStock.isDelayed) &&
        Objects.equals(createDate, lowStock.createDate) &&
        Objects.equals(modifyDate, lowStock.modifyDate) &&
        Objects.equals(sku, lowStock.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, lowLevelDate, lowStockMessage, printFlag, isDelayed, createDate, modifyDate, sku);
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
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

