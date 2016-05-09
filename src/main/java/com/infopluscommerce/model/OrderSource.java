package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class OrderSource   {
  
  private Integer id = null;
  private Integer lobId = null;
  private String name = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String packingNotes = null;
  private Boolean requireCartonizedASN = false;
  private Boolean requireGS1128Label = false;
  private String shippingNotes = null;
  private Integer packingSlipId = null;
  private Integer orderConfirmationEmailId = null;
  private Integer shipmentConfirmationEmailId = null;

  
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
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }
  public void setLobId(Integer lobId) {
    this.lobId = lobId;
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
  @JsonProperty("packingNotes")
  public String getPackingNotes() {
    return packingNotes;
  }
  public void setPackingNotes(String packingNotes) {
    this.packingNotes = packingNotes;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("requireCartonizedASN")
  public Boolean getRequireCartonizedASN() {
    return requireCartonizedASN;
  }
  public void setRequireCartonizedASN(Boolean requireCartonizedASN) {
    this.requireCartonizedASN = requireCartonizedASN;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("requireGS1128Label")
  public Boolean getRequireGS1128Label() {
    return requireGS1128Label;
  }
  public void setRequireGS1128Label(Boolean requireGS1128Label) {
    this.requireGS1128Label = requireGS1128Label;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shippingNotes")
  public String getShippingNotes() {
    return shippingNotes;
  }
  public void setShippingNotes(String shippingNotes) {
    this.shippingNotes = shippingNotes;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("packingSlipId")
  public Integer getPackingSlipId() {
    return packingSlipId;
  }
  public void setPackingSlipId(Integer packingSlipId) {
    this.packingSlipId = packingSlipId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderConfirmationEmailId")
  public Integer getOrderConfirmationEmailId() {
    return orderConfirmationEmailId;
  }
  public void setOrderConfirmationEmailId(Integer orderConfirmationEmailId) {
    this.orderConfirmationEmailId = orderConfirmationEmailId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipmentConfirmationEmailId")
  public Integer getShipmentConfirmationEmailId() {
    return shipmentConfirmationEmailId;
  }
  public void setShipmentConfirmationEmailId(Integer shipmentConfirmationEmailId) {
    this.shipmentConfirmationEmailId = shipmentConfirmationEmailId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSource orderSource = (OrderSource) o;
    return Objects.equals(id, orderSource.id) &&
        Objects.equals(lobId, orderSource.lobId) &&
        Objects.equals(name, orderSource.name) &&
        Objects.equals(createDate, orderSource.createDate) &&
        Objects.equals(modifyDate, orderSource.modifyDate) &&
        Objects.equals(packingNotes, orderSource.packingNotes) &&
        Objects.equals(requireCartonizedASN, orderSource.requireCartonizedASN) &&
        Objects.equals(requireGS1128Label, orderSource.requireGS1128Label) &&
        Objects.equals(shippingNotes, orderSource.shippingNotes) &&
        Objects.equals(packingSlipId, orderSource.packingSlipId) &&
        Objects.equals(orderConfirmationEmailId, orderSource.orderConfirmationEmailId) &&
        Objects.equals(shipmentConfirmationEmailId, orderSource.shipmentConfirmationEmailId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lobId, name, createDate, modifyDate, packingNotes, requireCartonizedASN, requireGS1128Label, shippingNotes, packingSlipId, orderConfirmationEmailId, shipmentConfirmationEmailId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    packingNotes: ").append(toIndentedString(packingNotes)).append("\n");
    sb.append("    requireCartonizedASN: ").append(toIndentedString(requireCartonizedASN)).append("\n");
    sb.append("    requireGS1128Label: ").append(toIndentedString(requireGS1128Label)).append("\n");
    sb.append("    shippingNotes: ").append(toIndentedString(shippingNotes)).append("\n");
    sb.append("    packingSlipId: ").append(toIndentedString(packingSlipId)).append("\n");
    sb.append("    orderConfirmationEmailId: ").append(toIndentedString(orderConfirmationEmailId)).append("\n");
    sb.append("    shipmentConfirmationEmailId: ").append(toIndentedString(shipmentConfirmationEmailId)).append("\n");
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

