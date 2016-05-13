package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T15:40:30.367-05:00")
public class InventoryAdjustment   {
  
  private Integer id = null;
  private Integer lob = null;
  private Integer skuId = null;
  private Integer poNoId = null;
  private Date adjustmentDate = null;
  private String adjustmentTime = null;
  private String location = null;
  private Integer qty = null;
  private String note = null;
  private String authorizedBy = null;
  private String printed = null;
  private Double orderNo = null;
  private String adjustmentCode = null;

  
  /**
   **/
  public InventoryAdjustment id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   **/
  public InventoryAdjustment lob(Integer lob) {
    this.lob = lob;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lob")
  public Integer getLob() {
    return lob;
  }
  public void setLob(Integer lob) {
    this.lob = lob;
  }

  
  /**
   **/
  public InventoryAdjustment skuId(Integer skuId) {
    this.skuId = skuId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("skuId")
  public Integer getSkuId() {
    return skuId;
  }
  public void setSkuId(Integer skuId) {
    this.skuId = skuId;
  }

  
  /**
   **/
  public InventoryAdjustment poNoId(Integer poNoId) {
    this.poNoId = poNoId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("poNoId")
  public Integer getPoNoId() {
    return poNoId;
  }
  public void setPoNoId(Integer poNoId) {
    this.poNoId = poNoId;
  }

  
  /**
   **/
  public InventoryAdjustment adjustmentDate(Date adjustmentDate) {
    this.adjustmentDate = adjustmentDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("adjustmentDate")
  public Date getAdjustmentDate() {
    return adjustmentDate;
  }
  public void setAdjustmentDate(Date adjustmentDate) {
    this.adjustmentDate = adjustmentDate;
  }

  
  /**
   **/
  public InventoryAdjustment adjustmentTime(String adjustmentTime) {
    this.adjustmentTime = adjustmentTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("adjustmentTime")
  public String getAdjustmentTime() {
    return adjustmentTime;
  }
  public void setAdjustmentTime(String adjustmentTime) {
    this.adjustmentTime = adjustmentTime;
  }

  
  /**
   **/
  public InventoryAdjustment location(String location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  
  /**
   **/
  public InventoryAdjustment qty(Integer qty) {
    this.qty = qty;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("qty")
  public Integer getQty() {
    return qty;
  }
  public void setQty(Integer qty) {
    this.qty = qty;
  }

  
  /**
   **/
  public InventoryAdjustment note(String note) {
    this.note = note;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  
  /**
   **/
  public InventoryAdjustment authorizedBy(String authorizedBy) {
    this.authorizedBy = authorizedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("authorizedBy")
  public String getAuthorizedBy() {
    return authorizedBy;
  }
  public void setAuthorizedBy(String authorizedBy) {
    this.authorizedBy = authorizedBy;
  }

  
  /**
   **/
  public InventoryAdjustment printed(String printed) {
    this.printed = printed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("printed")
  public String getPrinted() {
    return printed;
  }
  public void setPrinted(String printed) {
    this.printed = printed;
  }

  
  /**
   **/
  public InventoryAdjustment orderNo(Double orderNo) {
    this.orderNo = orderNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderNo")
  public Double getOrderNo() {
    return orderNo;
  }
  public void setOrderNo(Double orderNo) {
    this.orderNo = orderNo;
  }

  
  /**
   **/
  public InventoryAdjustment adjustmentCode(String adjustmentCode) {
    this.adjustmentCode = adjustmentCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("adjustmentCode")
  public String getAdjustmentCode() {
    return adjustmentCode;
  }
  public void setAdjustmentCode(String adjustmentCode) {
    this.adjustmentCode = adjustmentCode;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryAdjustment inventoryAdjustment = (InventoryAdjustment) o;
    return Objects.equals(this.id, inventoryAdjustment.id) &&
        Objects.equals(this.lob, inventoryAdjustment.lob) &&
        Objects.equals(this.skuId, inventoryAdjustment.skuId) &&
        Objects.equals(this.poNoId, inventoryAdjustment.poNoId) &&
        Objects.equals(this.adjustmentDate, inventoryAdjustment.adjustmentDate) &&
        Objects.equals(this.adjustmentTime, inventoryAdjustment.adjustmentTime) &&
        Objects.equals(this.location, inventoryAdjustment.location) &&
        Objects.equals(this.qty, inventoryAdjustment.qty) &&
        Objects.equals(this.note, inventoryAdjustment.note) &&
        Objects.equals(this.authorizedBy, inventoryAdjustment.authorizedBy) &&
        Objects.equals(this.printed, inventoryAdjustment.printed) &&
        Objects.equals(this.orderNo, inventoryAdjustment.orderNo) &&
        Objects.equals(this.adjustmentCode, inventoryAdjustment.adjustmentCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lob, skuId, poNoId, adjustmentDate, adjustmentTime, location, qty, note, authorizedBy, printed, orderNo, adjustmentCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryAdjustment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lob: ").append(toIndentedString(lob)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    poNoId: ").append(toIndentedString(poNoId)).append("\n");
    sb.append("    adjustmentDate: ").append(toIndentedString(adjustmentDate)).append("\n");
    sb.append("    adjustmentTime: ").append(toIndentedString(adjustmentTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    authorizedBy: ").append(toIndentedString(authorizedBy)).append("\n");
    sb.append("    printed: ").append(toIndentedString(printed)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    adjustmentCode: ").append(toIndentedString(adjustmentCode)).append("\n");
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

