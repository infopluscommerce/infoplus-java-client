package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-27T16:22:36.682-05:00")
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
  private Integer orderInvoiceId = null;
  private Integer orderConfirmationEmailId = null;
  private Integer shipmentConfirmationEmailId = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  /**
   **/
  public OrderSource lobId(Integer lobId) {
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
  public OrderSource name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
  public OrderSource packingNotes(String packingNotes) {
    this.packingNotes = packingNotes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("packingNotes")
  public String getPackingNotes() {
    return packingNotes;
  }
  public void setPackingNotes(String packingNotes) {
    this.packingNotes = packingNotes;
  }

  
  /**
   **/
  public OrderSource requireCartonizedASN(Boolean requireCartonizedASN) {
    this.requireCartonizedASN = requireCartonizedASN;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requireCartonizedASN")
  public Boolean getRequireCartonizedASN() {
    return requireCartonizedASN;
  }
  public void setRequireCartonizedASN(Boolean requireCartonizedASN) {
    this.requireCartonizedASN = requireCartonizedASN;
  }

  
  /**
   **/
  public OrderSource requireGS1128Label(Boolean requireGS1128Label) {
    this.requireGS1128Label = requireGS1128Label;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requireGS1128Label")
  public Boolean getRequireGS1128Label() {
    return requireGS1128Label;
  }
  public void setRequireGS1128Label(Boolean requireGS1128Label) {
    this.requireGS1128Label = requireGS1128Label;
  }

  
  /**
   **/
  public OrderSource shippingNotes(String shippingNotes) {
    this.shippingNotes = shippingNotes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shippingNotes")
  public String getShippingNotes() {
    return shippingNotes;
  }
  public void setShippingNotes(String shippingNotes) {
    this.shippingNotes = shippingNotes;
  }

  
  /**
   **/
  public OrderSource packingSlipId(Integer packingSlipId) {
    this.packingSlipId = packingSlipId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("packingSlipId")
  public Integer getPackingSlipId() {
    return packingSlipId;
  }
  public void setPackingSlipId(Integer packingSlipId) {
    this.packingSlipId = packingSlipId;
  }

  
  /**
   **/
  public OrderSource orderInvoiceId(Integer orderInvoiceId) {
    this.orderInvoiceId = orderInvoiceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderInvoiceId")
  public Integer getOrderInvoiceId() {
    return orderInvoiceId;
  }
  public void setOrderInvoiceId(Integer orderInvoiceId) {
    this.orderInvoiceId = orderInvoiceId;
  }

  
  /**
   **/
  public OrderSource orderConfirmationEmailId(Integer orderConfirmationEmailId) {
    this.orderConfirmationEmailId = orderConfirmationEmailId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderConfirmationEmailId")
  public Integer getOrderConfirmationEmailId() {
    return orderConfirmationEmailId;
  }
  public void setOrderConfirmationEmailId(Integer orderConfirmationEmailId) {
    this.orderConfirmationEmailId = orderConfirmationEmailId;
  }

  
  /**
   **/
  public OrderSource shipmentConfirmationEmailId(Integer shipmentConfirmationEmailId) {
    this.shipmentConfirmationEmailId = shipmentConfirmationEmailId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipmentConfirmationEmailId")
  public Integer getShipmentConfirmationEmailId() {
    return shipmentConfirmationEmailId;
  }
  public void setShipmentConfirmationEmailId(Integer shipmentConfirmationEmailId) {
    this.shipmentConfirmationEmailId = shipmentConfirmationEmailId;
  }

  
  /**
   **/
  public OrderSource customFields(Map<String, Object> customFields) {
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
    OrderSource orderSource = (OrderSource) o;
    return Objects.equals(this.id, orderSource.id) &&
        Objects.equals(this.lobId, orderSource.lobId) &&
        Objects.equals(this.name, orderSource.name) &&
        Objects.equals(this.createDate, orderSource.createDate) &&
        Objects.equals(this.modifyDate, orderSource.modifyDate) &&
        Objects.equals(this.packingNotes, orderSource.packingNotes) &&
        Objects.equals(this.requireCartonizedASN, orderSource.requireCartonizedASN) &&
        Objects.equals(this.requireGS1128Label, orderSource.requireGS1128Label) &&
        Objects.equals(this.shippingNotes, orderSource.shippingNotes) &&
        Objects.equals(this.packingSlipId, orderSource.packingSlipId) &&
        Objects.equals(this.orderInvoiceId, orderSource.orderInvoiceId) &&
        Objects.equals(this.orderConfirmationEmailId, orderSource.orderConfirmationEmailId) &&
        Objects.equals(this.shipmentConfirmationEmailId, orderSource.shipmentConfirmationEmailId) &&
        Objects.equals(this.customFields, orderSource.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lobId, name, createDate, modifyDate, packingNotes, requireCartonizedASN, requireGS1128Label, shippingNotes, packingSlipId, orderInvoiceId, orderConfirmationEmailId, shipmentConfirmationEmailId, customFields);
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
    sb.append("    orderInvoiceId: ").append(toIndentedString(orderInvoiceId)).append("\n");
    sb.append("    orderConfirmationEmailId: ").append(toIndentedString(orderConfirmationEmailId)).append("\n");
    sb.append("    shipmentConfirmationEmailId: ").append(toIndentedString(shipmentConfirmationEmailId)).append("\n");
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

