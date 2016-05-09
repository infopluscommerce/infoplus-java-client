package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class InventoryDetail   {
  
  private Integer id = null;
  private Integer warehouseLocationId = null;
  private Integer quantity = null;
  private Date distributionDate = null;
  private Integer unitsPerCase = null;
  private Integer unitsPerWrap = null;
  private String revisionDate = null;
  private String productionLot = null;
  private Integer lobId = null;
  private String poNo = null;
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
  @JsonProperty("warehouseLocationId")
  public Integer getWarehouseLocationId() {
    return warehouseLocationId;
  }
  public void setWarehouseLocationId(Integer warehouseLocationId) {
    this.warehouseLocationId = warehouseLocationId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("distributionDate")
  public Date getDistributionDate() {
    return distributionDate;
  }
  public void setDistributionDate(Date distributionDate) {
    this.distributionDate = distributionDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unitsPerCase")
  public Integer getUnitsPerCase() {
    return unitsPerCase;
  }
  public void setUnitsPerCase(Integer unitsPerCase) {
    this.unitsPerCase = unitsPerCase;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unitsPerWrap")
  public Integer getUnitsPerWrap() {
    return unitsPerWrap;
  }
  public void setUnitsPerWrap(Integer unitsPerWrap) {
    this.unitsPerWrap = unitsPerWrap;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("revisionDate")
  public String getRevisionDate() {
    return revisionDate;
  }
  public void setRevisionDate(String revisionDate) {
    this.revisionDate = revisionDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("productionLot")
  public String getProductionLot() {
    return productionLot;
  }
  public void setProductionLot(String productionLot) {
    this.productionLot = productionLot;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }
  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("poNo")
  public String getPoNo() {
    return poNo;
  }
  public void setPoNo(String poNo) {
    this.poNo = poNo;
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
    InventoryDetail inventoryDetail = (InventoryDetail) o;
    return Objects.equals(id, inventoryDetail.id) &&
        Objects.equals(warehouseLocationId, inventoryDetail.warehouseLocationId) &&
        Objects.equals(quantity, inventoryDetail.quantity) &&
        Objects.equals(distributionDate, inventoryDetail.distributionDate) &&
        Objects.equals(unitsPerCase, inventoryDetail.unitsPerCase) &&
        Objects.equals(unitsPerWrap, inventoryDetail.unitsPerWrap) &&
        Objects.equals(revisionDate, inventoryDetail.revisionDate) &&
        Objects.equals(productionLot, inventoryDetail.productionLot) &&
        Objects.equals(lobId, inventoryDetail.lobId) &&
        Objects.equals(poNo, inventoryDetail.poNo) &&
        Objects.equals(sku, inventoryDetail.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseLocationId, quantity, distributionDate, unitsPerCase, unitsPerWrap, revisionDate, productionLot, lobId, poNo, sku);
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
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    poNo: ").append(toIndentedString(poNo)).append("\n");
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

