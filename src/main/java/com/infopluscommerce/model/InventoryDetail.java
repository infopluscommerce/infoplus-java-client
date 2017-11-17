package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class InventoryDetail   {
  
  private Integer id = null;
  private Integer warehouseLocationId = null;
  private Integer quantity = null;
  private Date distributionDate = null;
  private Integer unitsPerCase = null;
  private Integer unitsPerWrap = null;
  private String revisionDate = null;
  private String productionLot = null;
  private Date oldestReceiptDate = null;
  private Integer lobId = null;
  private String poNo = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();
  private String sku = null;

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public InventoryDetail warehouseLocationId(Integer warehouseLocationId) {
    this.warehouseLocationId = warehouseLocationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("warehouseLocationId")
  public Integer getWarehouseLocationId() {
    return warehouseLocationId;
  }
  public void setWarehouseLocationId(Integer warehouseLocationId) {
    this.warehouseLocationId = warehouseLocationId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("distributionDate")
  public Date getDistributionDate() {
    return distributionDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unitsPerCase")
  public Integer getUnitsPerCase() {
    return unitsPerCase;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unitsPerWrap")
  public Integer getUnitsPerWrap() {
    return unitsPerWrap;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("revisionDate")
  public String getRevisionDate() {
    return revisionDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("productionLot")
  public String getProductionLot() {
    return productionLot;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("oldestReceiptDate")
  public Date getOldestReceiptDate() {
    return oldestReceiptDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("poNo")
  public String getPoNo() {
    return poNo;
  }

  
  /**
   **/
  public InventoryDetail customFields(Map<String, Object> customFields) {
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
  public InventoryDetail sku(String sku) {
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
    InventoryDetail inventoryDetail = (InventoryDetail) o;
    return Objects.equals(this.id, inventoryDetail.id) &&
        Objects.equals(this.warehouseLocationId, inventoryDetail.warehouseLocationId) &&
        Objects.equals(this.quantity, inventoryDetail.quantity) &&
        Objects.equals(this.distributionDate, inventoryDetail.distributionDate) &&
        Objects.equals(this.unitsPerCase, inventoryDetail.unitsPerCase) &&
        Objects.equals(this.unitsPerWrap, inventoryDetail.unitsPerWrap) &&
        Objects.equals(this.revisionDate, inventoryDetail.revisionDate) &&
        Objects.equals(this.productionLot, inventoryDetail.productionLot) &&
        Objects.equals(this.oldestReceiptDate, inventoryDetail.oldestReceiptDate) &&
        Objects.equals(this.lobId, inventoryDetail.lobId) &&
        Objects.equals(this.poNo, inventoryDetail.poNo) &&
        Objects.equals(this.customFields, inventoryDetail.customFields) &&
        Objects.equals(this.sku, inventoryDetail.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseLocationId, quantity, distributionDate, unitsPerCase, unitsPerWrap, revisionDate, productionLot, oldestReceiptDate, lobId, poNo, customFields, sku);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouseLocationId: ").append(toIndentedString(warehouseLocationId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    distributionDate: ").append(toIndentedString(distributionDate)).append("\n");
    sb.append("    unitsPerCase: ").append(toIndentedString(unitsPerCase)).append("\n");
    sb.append("    unitsPerWrap: ").append(toIndentedString(unitsPerWrap)).append("\n");
    sb.append("    revisionDate: ").append(toIndentedString(revisionDate)).append("\n");
    sb.append("    productionLot: ").append(toIndentedString(productionLot)).append("\n");
    sb.append("    oldestReceiptDate: ").append(toIndentedString(oldestReceiptDate)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    poNo: ").append(toIndentedString(poNo)).append("\n");
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

