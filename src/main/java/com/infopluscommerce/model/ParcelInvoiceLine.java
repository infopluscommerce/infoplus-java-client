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
public class ParcelInvoiceLine   {
  
  private Integer id = null;
  private Integer invoiceNoId = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer lobId = null;
  private BigDecimal orderId = null;
  private Integer shipmentId = null;
  private String trackingNo = null;
  private Date shipDate = null;
  private String zone = null;
  private BigDecimal dim1 = null;
  private BigDecimal dim2 = null;
  private BigDecimal dim3 = null;
  private BigDecimal enteredWeight = null;
  private BigDecimal actualWeight = null;
  private BigDecimal billedWeight = null;
  private String enteredWeightUnit = null;
  private String actualWeightUnit = null;
  private String billedWeightUnit = null;
  private String customerReference = null;
  private String shipmentReference = null;
  private String reference3 = null;
  private String reference4 = null;
  private String reference5 = null;
  private String reference6 = null;
  private String reference7 = null;
  private String shipFromName = null;
  private String shipFromCompany = null;
  private String shipFromStreet1 = null;
  private String shipFromStreet2 = null;
  private String shipFromCity = null;
  private String shipFromState = null;
  private String shipFromZip = null;
  private String shipFromCountry = null;
  private String shipToName = null;
  private String shipToCompany = null;
  private String shipToStreet1 = null;
  private String shipToStreet2 = null;
  private String shipToCity = null;
  private String shipToState = null;
  private String shipToZip = null;
  private String shipToCountry = null;
  private String originalShipToName = null;
  private String originalShipToCompany = null;
  private String originalShipToStreet1 = null;
  private String originalShipToStreet2 = null;
  private String originalShipToCity = null;
  private String originalShipToState = null;
  private String originalShipToZip = null;
  private String originalShipToCountry = null;
  private String thirdPartyName = null;
  private String thirdPartyCompany = null;
  private String thirdPartyStreet1 = null;
  private String thirdPartyStreet2 = null;
  private String thirdPartyCity = null;
  private String thirdPartyState = null;
  private String thirdPartyZip = null;
  private String thirdPartyCountry = null;
  private String soldToName = null;
  private String soldToCompany = null;
  private String soldToStreet1 = null;
  private String soldToStreet2 = null;
  private String soldToCity = null;
  private String soldToState = null;
  private String soldToZip = null;
  private String soldToCountry = null;
  private String freightServiceType = null;
  private BigDecimal netCharges = null;
  private BigDecimal baseFreight = null;
  private BigDecimal grossCharges = null;
  private BigDecimal fuelCharge = null;
  private BigDecimal residentialCharge = null;
  private BigDecimal adultSignatureCharge = null;
  private BigDecimal deliveryAreaCharge = null;
  private BigDecimal deliveryAreaChargeExtended = null;
  private BigDecimal addressCorrectionCharge = null;
  private String extraCharge1Name = null;
  private BigDecimal extraCharge1Amount = null;
  private String extraCharge2Name = null;
  private BigDecimal extraCharge2Amount = null;
  private String extraCharge3Name = null;
  private BigDecimal extraCharge3Amount = null;
  private String extraCharge4Name = null;
  private BigDecimal extraCharge4Amount = null;
  private String extraCharge5Name = null;
  private BigDecimal extraCharge5Amount = null;
  private String extraCharge6Name = null;
  private BigDecimal extraCharge6Amount = null;
  private String extraCharge7Name = null;
  private BigDecimal extraCharge7Amount = null;
  private String extraCharge8Name = null;
  private BigDecimal extraCharge8Amount = null;
  private String extraCharge9Name = null;
  private BigDecimal extraCharge9Amount = null;
  private String extraCharge10Name = null;
  private BigDecimal extraCharge10Amount = null;
  private String extraCharge11Name = null;
  private BigDecimal extraCharge11Amount = null;
  private String extraCharge12Name = null;
  private BigDecimal extraCharge12Amount = null;
  private String extraCharge13Name = null;
  private BigDecimal extraCharge13Amount = null;
  private String extraCharge14Name = null;
  private BigDecimal extraCharge14Amount = null;
  private String extraCharge15Name = null;
  private BigDecimal extraCharge15Amount = null;
  private String extraCharge16Name = null;
  private BigDecimal extraCharge16Amount = null;
  private String extraCharge17Name = null;
  private BigDecimal extraCharge17Amount = null;
  private String extraCharge18Name = null;
  private BigDecimal extraCharge18Amount = null;
  private String extraCharge19Name = null;
  private BigDecimal extraCharge19Amount = null;
  private String extraCharge20Name = null;
  private BigDecimal extraCharge20Amount = null;
  private String extraCharge21Name = null;
  private BigDecimal extraCharge21Amount = null;
  private String extraCharge22Name = null;
  private BigDecimal extraCharge22Amount = null;
  private String extraCharge23Name = null;
  private BigDecimal extraCharge23Amount = null;
  private String extraCharge24Name = null;
  private BigDecimal extraCharge24Amount = null;
  private String extraCharge25Name = null;
  private BigDecimal extraCharge25Amount = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("invoiceNoId")
  public Integer getInvoiceNoId() {
    return invoiceNoId;
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
  public ParcelInvoiceLine lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lobId")
  public Integer getLobId() {
    return lobId;
  }
  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  
  /**
   **/
  public ParcelInvoiceLine orderId(BigDecimal orderId) {
    this.orderId = orderId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderId")
  public BigDecimal getOrderId() {
    return orderId;
  }
  public void setOrderId(BigDecimal orderId) {
    this.orderId = orderId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipmentId")
  public Integer getShipmentId() {
    return shipmentId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trackingNo")
  public String getTrackingNo() {
    return trackingNo;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipDate")
  public Date getShipDate() {
    return shipDate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("zone")
  public String getZone() {
    return zone;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dim1")
  public BigDecimal getDim1() {
    return dim1;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dim2")
  public BigDecimal getDim2() {
    return dim2;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dim3")
  public BigDecimal getDim3() {
    return dim3;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enteredWeight")
  public BigDecimal getEnteredWeight() {
    return enteredWeight;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actualWeight")
  public BigDecimal getActualWeight() {
    return actualWeight;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billedWeight")
  public BigDecimal getBilledWeight() {
    return billedWeight;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enteredWeightUnit")
  public String getEnteredWeightUnit() {
    return enteredWeightUnit;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actualWeightUnit")
  public String getActualWeightUnit() {
    return actualWeightUnit;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("billedWeightUnit")
  public String getBilledWeightUnit() {
    return billedWeightUnit;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customerReference")
  public String getCustomerReference() {
    return customerReference;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipmentReference")
  public String getShipmentReference() {
    return shipmentReference;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reference3")
  public String getReference3() {
    return reference3;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reference4")
  public String getReference4() {
    return reference4;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reference5")
  public String getReference5() {
    return reference5;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reference6")
  public String getReference6() {
    return reference6;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reference7")
  public String getReference7() {
    return reference7;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipFromName")
  public String getShipFromName() {
    return shipFromName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipFromCompany")
  public String getShipFromCompany() {
    return shipFromCompany;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipFromStreet1")
  public String getShipFromStreet1() {
    return shipFromStreet1;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipFromStreet2")
  public String getShipFromStreet2() {
    return shipFromStreet2;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipFromCity")
  public String getShipFromCity() {
    return shipFromCity;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipFromState")
  public String getShipFromState() {
    return shipFromState;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipFromZip")
  public String getShipFromZip() {
    return shipFromZip;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipFromCountry")
  public String getShipFromCountry() {
    return shipFromCountry;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToName")
  public String getShipToName() {
    return shipToName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToCompany")
  public String getShipToCompany() {
    return shipToCompany;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToStreet1")
  public String getShipToStreet1() {
    return shipToStreet1;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToStreet2")
  public String getShipToStreet2() {
    return shipToStreet2;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToCity")
  public String getShipToCity() {
    return shipToCity;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToState")
  public String getShipToState() {
    return shipToState;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToZip")
  public String getShipToZip() {
    return shipToZip;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shipToCountry")
  public String getShipToCountry() {
    return shipToCountry;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("originalShipToName")
  public String getOriginalShipToName() {
    return originalShipToName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("originalShipToCompany")
  public String getOriginalShipToCompany() {
    return originalShipToCompany;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("originalShipToStreet1")
  public String getOriginalShipToStreet1() {
    return originalShipToStreet1;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("originalShipToStreet2")
  public String getOriginalShipToStreet2() {
    return originalShipToStreet2;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("originalShipToCity")
  public String getOriginalShipToCity() {
    return originalShipToCity;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("originalShipToState")
  public String getOriginalShipToState() {
    return originalShipToState;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("originalShipToZip")
  public String getOriginalShipToZip() {
    return originalShipToZip;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("originalShipToCountry")
  public String getOriginalShipToCountry() {
    return originalShipToCountry;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thirdPartyName")
  public String getThirdPartyName() {
    return thirdPartyName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thirdPartyCompany")
  public String getThirdPartyCompany() {
    return thirdPartyCompany;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thirdPartyStreet1")
  public String getThirdPartyStreet1() {
    return thirdPartyStreet1;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thirdPartyStreet2")
  public String getThirdPartyStreet2() {
    return thirdPartyStreet2;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thirdPartyCity")
  public String getThirdPartyCity() {
    return thirdPartyCity;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thirdPartyState")
  public String getThirdPartyState() {
    return thirdPartyState;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thirdPartyZip")
  public String getThirdPartyZip() {
    return thirdPartyZip;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thirdPartyCountry")
  public String getThirdPartyCountry() {
    return thirdPartyCountry;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("soldToName")
  public String getSoldToName() {
    return soldToName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("soldToCompany")
  public String getSoldToCompany() {
    return soldToCompany;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("soldToStreet1")
  public String getSoldToStreet1() {
    return soldToStreet1;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("soldToStreet2")
  public String getSoldToStreet2() {
    return soldToStreet2;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("soldToCity")
  public String getSoldToCity() {
    return soldToCity;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("soldToState")
  public String getSoldToState() {
    return soldToState;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("soldToZip")
  public String getSoldToZip() {
    return soldToZip;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("soldToCountry")
  public String getSoldToCountry() {
    return soldToCountry;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("freightServiceType")
  public String getFreightServiceType() {
    return freightServiceType;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("netCharges")
  public BigDecimal getNetCharges() {
    return netCharges;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("baseFreight")
  public BigDecimal getBaseFreight() {
    return baseFreight;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("grossCharges")
  public BigDecimal getGrossCharges() {
    return grossCharges;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fuelCharge")
  public BigDecimal getFuelCharge() {
    return fuelCharge;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("residentialCharge")
  public BigDecimal getResidentialCharge() {
    return residentialCharge;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("adultSignatureCharge")
  public BigDecimal getAdultSignatureCharge() {
    return adultSignatureCharge;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deliveryAreaCharge")
  public BigDecimal getDeliveryAreaCharge() {
    return deliveryAreaCharge;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deliveryAreaChargeExtended")
  public BigDecimal getDeliveryAreaChargeExtended() {
    return deliveryAreaChargeExtended;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressCorrectionCharge")
  public BigDecimal getAddressCorrectionCharge() {
    return addressCorrectionCharge;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge1Name")
  public String getExtraCharge1Name() {
    return extraCharge1Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge1Amount")
  public BigDecimal getExtraCharge1Amount() {
    return extraCharge1Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge2Name")
  public String getExtraCharge2Name() {
    return extraCharge2Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge2Amount")
  public BigDecimal getExtraCharge2Amount() {
    return extraCharge2Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge3Name")
  public String getExtraCharge3Name() {
    return extraCharge3Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge3Amount")
  public BigDecimal getExtraCharge3Amount() {
    return extraCharge3Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge4Name")
  public String getExtraCharge4Name() {
    return extraCharge4Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge4Amount")
  public BigDecimal getExtraCharge4Amount() {
    return extraCharge4Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge5Name")
  public String getExtraCharge5Name() {
    return extraCharge5Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge5Amount")
  public BigDecimal getExtraCharge5Amount() {
    return extraCharge5Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge6Name")
  public String getExtraCharge6Name() {
    return extraCharge6Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge6Amount")
  public BigDecimal getExtraCharge6Amount() {
    return extraCharge6Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge7Name")
  public String getExtraCharge7Name() {
    return extraCharge7Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge7Amount")
  public BigDecimal getExtraCharge7Amount() {
    return extraCharge7Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge8Name")
  public String getExtraCharge8Name() {
    return extraCharge8Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge8Amount")
  public BigDecimal getExtraCharge8Amount() {
    return extraCharge8Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge9Name")
  public String getExtraCharge9Name() {
    return extraCharge9Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge9Amount")
  public BigDecimal getExtraCharge9Amount() {
    return extraCharge9Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge10Name")
  public String getExtraCharge10Name() {
    return extraCharge10Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge10Amount")
  public BigDecimal getExtraCharge10Amount() {
    return extraCharge10Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge11Name")
  public String getExtraCharge11Name() {
    return extraCharge11Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge11Amount")
  public BigDecimal getExtraCharge11Amount() {
    return extraCharge11Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge12Name")
  public String getExtraCharge12Name() {
    return extraCharge12Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge12Amount")
  public BigDecimal getExtraCharge12Amount() {
    return extraCharge12Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge13Name")
  public String getExtraCharge13Name() {
    return extraCharge13Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge13Amount")
  public BigDecimal getExtraCharge13Amount() {
    return extraCharge13Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge14Name")
  public String getExtraCharge14Name() {
    return extraCharge14Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge14Amount")
  public BigDecimal getExtraCharge14Amount() {
    return extraCharge14Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge15Name")
  public String getExtraCharge15Name() {
    return extraCharge15Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge15Amount")
  public BigDecimal getExtraCharge15Amount() {
    return extraCharge15Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge16Name")
  public String getExtraCharge16Name() {
    return extraCharge16Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge16Amount")
  public BigDecimal getExtraCharge16Amount() {
    return extraCharge16Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge17Name")
  public String getExtraCharge17Name() {
    return extraCharge17Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge17Amount")
  public BigDecimal getExtraCharge17Amount() {
    return extraCharge17Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge18Name")
  public String getExtraCharge18Name() {
    return extraCharge18Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge18Amount")
  public BigDecimal getExtraCharge18Amount() {
    return extraCharge18Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge19Name")
  public String getExtraCharge19Name() {
    return extraCharge19Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge19Amount")
  public BigDecimal getExtraCharge19Amount() {
    return extraCharge19Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge20Name")
  public String getExtraCharge20Name() {
    return extraCharge20Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge20Amount")
  public BigDecimal getExtraCharge20Amount() {
    return extraCharge20Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge21Name")
  public String getExtraCharge21Name() {
    return extraCharge21Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge21Amount")
  public BigDecimal getExtraCharge21Amount() {
    return extraCharge21Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge22Name")
  public String getExtraCharge22Name() {
    return extraCharge22Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge22Amount")
  public BigDecimal getExtraCharge22Amount() {
    return extraCharge22Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge23Name")
  public String getExtraCharge23Name() {
    return extraCharge23Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge23Amount")
  public BigDecimal getExtraCharge23Amount() {
    return extraCharge23Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge24Name")
  public String getExtraCharge24Name() {
    return extraCharge24Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge24Amount")
  public BigDecimal getExtraCharge24Amount() {
    return extraCharge24Amount;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge25Name")
  public String getExtraCharge25Name() {
    return extraCharge25Name;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extraCharge25Amount")
  public BigDecimal getExtraCharge25Amount() {
    return extraCharge25Amount;
  }

  
  /**
   **/
  public ParcelInvoiceLine customFields(Map<String, Object> customFields) {
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
    ParcelInvoiceLine parcelInvoiceLine = (ParcelInvoiceLine) o;
    return Objects.equals(this.id, parcelInvoiceLine.id) &&
        Objects.equals(this.invoiceNoId, parcelInvoiceLine.invoiceNoId) &&
        Objects.equals(this.createDate, parcelInvoiceLine.createDate) &&
        Objects.equals(this.modifyDate, parcelInvoiceLine.modifyDate) &&
        Objects.equals(this.lobId, parcelInvoiceLine.lobId) &&
        Objects.equals(this.orderId, parcelInvoiceLine.orderId) &&
        Objects.equals(this.shipmentId, parcelInvoiceLine.shipmentId) &&
        Objects.equals(this.trackingNo, parcelInvoiceLine.trackingNo) &&
        Objects.equals(this.shipDate, parcelInvoiceLine.shipDate) &&
        Objects.equals(this.zone, parcelInvoiceLine.zone) &&
        Objects.equals(this.dim1, parcelInvoiceLine.dim1) &&
        Objects.equals(this.dim2, parcelInvoiceLine.dim2) &&
        Objects.equals(this.dim3, parcelInvoiceLine.dim3) &&
        Objects.equals(this.enteredWeight, parcelInvoiceLine.enteredWeight) &&
        Objects.equals(this.actualWeight, parcelInvoiceLine.actualWeight) &&
        Objects.equals(this.billedWeight, parcelInvoiceLine.billedWeight) &&
        Objects.equals(this.enteredWeightUnit, parcelInvoiceLine.enteredWeightUnit) &&
        Objects.equals(this.actualWeightUnit, parcelInvoiceLine.actualWeightUnit) &&
        Objects.equals(this.billedWeightUnit, parcelInvoiceLine.billedWeightUnit) &&
        Objects.equals(this.customerReference, parcelInvoiceLine.customerReference) &&
        Objects.equals(this.shipmentReference, parcelInvoiceLine.shipmentReference) &&
        Objects.equals(this.reference3, parcelInvoiceLine.reference3) &&
        Objects.equals(this.reference4, parcelInvoiceLine.reference4) &&
        Objects.equals(this.reference5, parcelInvoiceLine.reference5) &&
        Objects.equals(this.reference6, parcelInvoiceLine.reference6) &&
        Objects.equals(this.reference7, parcelInvoiceLine.reference7) &&
        Objects.equals(this.shipFromName, parcelInvoiceLine.shipFromName) &&
        Objects.equals(this.shipFromCompany, parcelInvoiceLine.shipFromCompany) &&
        Objects.equals(this.shipFromStreet1, parcelInvoiceLine.shipFromStreet1) &&
        Objects.equals(this.shipFromStreet2, parcelInvoiceLine.shipFromStreet2) &&
        Objects.equals(this.shipFromCity, parcelInvoiceLine.shipFromCity) &&
        Objects.equals(this.shipFromState, parcelInvoiceLine.shipFromState) &&
        Objects.equals(this.shipFromZip, parcelInvoiceLine.shipFromZip) &&
        Objects.equals(this.shipFromCountry, parcelInvoiceLine.shipFromCountry) &&
        Objects.equals(this.shipToName, parcelInvoiceLine.shipToName) &&
        Objects.equals(this.shipToCompany, parcelInvoiceLine.shipToCompany) &&
        Objects.equals(this.shipToStreet1, parcelInvoiceLine.shipToStreet1) &&
        Objects.equals(this.shipToStreet2, parcelInvoiceLine.shipToStreet2) &&
        Objects.equals(this.shipToCity, parcelInvoiceLine.shipToCity) &&
        Objects.equals(this.shipToState, parcelInvoiceLine.shipToState) &&
        Objects.equals(this.shipToZip, parcelInvoiceLine.shipToZip) &&
        Objects.equals(this.shipToCountry, parcelInvoiceLine.shipToCountry) &&
        Objects.equals(this.originalShipToName, parcelInvoiceLine.originalShipToName) &&
        Objects.equals(this.originalShipToCompany, parcelInvoiceLine.originalShipToCompany) &&
        Objects.equals(this.originalShipToStreet1, parcelInvoiceLine.originalShipToStreet1) &&
        Objects.equals(this.originalShipToStreet2, parcelInvoiceLine.originalShipToStreet2) &&
        Objects.equals(this.originalShipToCity, parcelInvoiceLine.originalShipToCity) &&
        Objects.equals(this.originalShipToState, parcelInvoiceLine.originalShipToState) &&
        Objects.equals(this.originalShipToZip, parcelInvoiceLine.originalShipToZip) &&
        Objects.equals(this.originalShipToCountry, parcelInvoiceLine.originalShipToCountry) &&
        Objects.equals(this.thirdPartyName, parcelInvoiceLine.thirdPartyName) &&
        Objects.equals(this.thirdPartyCompany, parcelInvoiceLine.thirdPartyCompany) &&
        Objects.equals(this.thirdPartyStreet1, parcelInvoiceLine.thirdPartyStreet1) &&
        Objects.equals(this.thirdPartyStreet2, parcelInvoiceLine.thirdPartyStreet2) &&
        Objects.equals(this.thirdPartyCity, parcelInvoiceLine.thirdPartyCity) &&
        Objects.equals(this.thirdPartyState, parcelInvoiceLine.thirdPartyState) &&
        Objects.equals(this.thirdPartyZip, parcelInvoiceLine.thirdPartyZip) &&
        Objects.equals(this.thirdPartyCountry, parcelInvoiceLine.thirdPartyCountry) &&
        Objects.equals(this.soldToName, parcelInvoiceLine.soldToName) &&
        Objects.equals(this.soldToCompany, parcelInvoiceLine.soldToCompany) &&
        Objects.equals(this.soldToStreet1, parcelInvoiceLine.soldToStreet1) &&
        Objects.equals(this.soldToStreet2, parcelInvoiceLine.soldToStreet2) &&
        Objects.equals(this.soldToCity, parcelInvoiceLine.soldToCity) &&
        Objects.equals(this.soldToState, parcelInvoiceLine.soldToState) &&
        Objects.equals(this.soldToZip, parcelInvoiceLine.soldToZip) &&
        Objects.equals(this.soldToCountry, parcelInvoiceLine.soldToCountry) &&
        Objects.equals(this.freightServiceType, parcelInvoiceLine.freightServiceType) &&
        Objects.equals(this.netCharges, parcelInvoiceLine.netCharges) &&
        Objects.equals(this.baseFreight, parcelInvoiceLine.baseFreight) &&
        Objects.equals(this.grossCharges, parcelInvoiceLine.grossCharges) &&
        Objects.equals(this.fuelCharge, parcelInvoiceLine.fuelCharge) &&
        Objects.equals(this.residentialCharge, parcelInvoiceLine.residentialCharge) &&
        Objects.equals(this.adultSignatureCharge, parcelInvoiceLine.adultSignatureCharge) &&
        Objects.equals(this.deliveryAreaCharge, parcelInvoiceLine.deliveryAreaCharge) &&
        Objects.equals(this.deliveryAreaChargeExtended, parcelInvoiceLine.deliveryAreaChargeExtended) &&
        Objects.equals(this.addressCorrectionCharge, parcelInvoiceLine.addressCorrectionCharge) &&
        Objects.equals(this.extraCharge1Name, parcelInvoiceLine.extraCharge1Name) &&
        Objects.equals(this.extraCharge1Amount, parcelInvoiceLine.extraCharge1Amount) &&
        Objects.equals(this.extraCharge2Name, parcelInvoiceLine.extraCharge2Name) &&
        Objects.equals(this.extraCharge2Amount, parcelInvoiceLine.extraCharge2Amount) &&
        Objects.equals(this.extraCharge3Name, parcelInvoiceLine.extraCharge3Name) &&
        Objects.equals(this.extraCharge3Amount, parcelInvoiceLine.extraCharge3Amount) &&
        Objects.equals(this.extraCharge4Name, parcelInvoiceLine.extraCharge4Name) &&
        Objects.equals(this.extraCharge4Amount, parcelInvoiceLine.extraCharge4Amount) &&
        Objects.equals(this.extraCharge5Name, parcelInvoiceLine.extraCharge5Name) &&
        Objects.equals(this.extraCharge5Amount, parcelInvoiceLine.extraCharge5Amount) &&
        Objects.equals(this.extraCharge6Name, parcelInvoiceLine.extraCharge6Name) &&
        Objects.equals(this.extraCharge6Amount, parcelInvoiceLine.extraCharge6Amount) &&
        Objects.equals(this.extraCharge7Name, parcelInvoiceLine.extraCharge7Name) &&
        Objects.equals(this.extraCharge7Amount, parcelInvoiceLine.extraCharge7Amount) &&
        Objects.equals(this.extraCharge8Name, parcelInvoiceLine.extraCharge8Name) &&
        Objects.equals(this.extraCharge8Amount, parcelInvoiceLine.extraCharge8Amount) &&
        Objects.equals(this.extraCharge9Name, parcelInvoiceLine.extraCharge9Name) &&
        Objects.equals(this.extraCharge9Amount, parcelInvoiceLine.extraCharge9Amount) &&
        Objects.equals(this.extraCharge10Name, parcelInvoiceLine.extraCharge10Name) &&
        Objects.equals(this.extraCharge10Amount, parcelInvoiceLine.extraCharge10Amount) &&
        Objects.equals(this.extraCharge11Name, parcelInvoiceLine.extraCharge11Name) &&
        Objects.equals(this.extraCharge11Amount, parcelInvoiceLine.extraCharge11Amount) &&
        Objects.equals(this.extraCharge12Name, parcelInvoiceLine.extraCharge12Name) &&
        Objects.equals(this.extraCharge12Amount, parcelInvoiceLine.extraCharge12Amount) &&
        Objects.equals(this.extraCharge13Name, parcelInvoiceLine.extraCharge13Name) &&
        Objects.equals(this.extraCharge13Amount, parcelInvoiceLine.extraCharge13Amount) &&
        Objects.equals(this.extraCharge14Name, parcelInvoiceLine.extraCharge14Name) &&
        Objects.equals(this.extraCharge14Amount, parcelInvoiceLine.extraCharge14Amount) &&
        Objects.equals(this.extraCharge15Name, parcelInvoiceLine.extraCharge15Name) &&
        Objects.equals(this.extraCharge15Amount, parcelInvoiceLine.extraCharge15Amount) &&
        Objects.equals(this.extraCharge16Name, parcelInvoiceLine.extraCharge16Name) &&
        Objects.equals(this.extraCharge16Amount, parcelInvoiceLine.extraCharge16Amount) &&
        Objects.equals(this.extraCharge17Name, parcelInvoiceLine.extraCharge17Name) &&
        Objects.equals(this.extraCharge17Amount, parcelInvoiceLine.extraCharge17Amount) &&
        Objects.equals(this.extraCharge18Name, parcelInvoiceLine.extraCharge18Name) &&
        Objects.equals(this.extraCharge18Amount, parcelInvoiceLine.extraCharge18Amount) &&
        Objects.equals(this.extraCharge19Name, parcelInvoiceLine.extraCharge19Name) &&
        Objects.equals(this.extraCharge19Amount, parcelInvoiceLine.extraCharge19Amount) &&
        Objects.equals(this.extraCharge20Name, parcelInvoiceLine.extraCharge20Name) &&
        Objects.equals(this.extraCharge20Amount, parcelInvoiceLine.extraCharge20Amount) &&
        Objects.equals(this.extraCharge21Name, parcelInvoiceLine.extraCharge21Name) &&
        Objects.equals(this.extraCharge21Amount, parcelInvoiceLine.extraCharge21Amount) &&
        Objects.equals(this.extraCharge22Name, parcelInvoiceLine.extraCharge22Name) &&
        Objects.equals(this.extraCharge22Amount, parcelInvoiceLine.extraCharge22Amount) &&
        Objects.equals(this.extraCharge23Name, parcelInvoiceLine.extraCharge23Name) &&
        Objects.equals(this.extraCharge23Amount, parcelInvoiceLine.extraCharge23Amount) &&
        Objects.equals(this.extraCharge24Name, parcelInvoiceLine.extraCharge24Name) &&
        Objects.equals(this.extraCharge24Amount, parcelInvoiceLine.extraCharge24Amount) &&
        Objects.equals(this.extraCharge25Name, parcelInvoiceLine.extraCharge25Name) &&
        Objects.equals(this.extraCharge25Amount, parcelInvoiceLine.extraCharge25Amount) &&
        Objects.equals(this.customFields, parcelInvoiceLine.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, invoiceNoId, createDate, modifyDate, lobId, orderId, shipmentId, trackingNo, shipDate, zone, dim1, dim2, dim3, enteredWeight, actualWeight, billedWeight, enteredWeightUnit, actualWeightUnit, billedWeightUnit, customerReference, shipmentReference, reference3, reference4, reference5, reference6, reference7, shipFromName, shipFromCompany, shipFromStreet1, shipFromStreet2, shipFromCity, shipFromState, shipFromZip, shipFromCountry, shipToName, shipToCompany, shipToStreet1, shipToStreet2, shipToCity, shipToState, shipToZip, shipToCountry, originalShipToName, originalShipToCompany, originalShipToStreet1, originalShipToStreet2, originalShipToCity, originalShipToState, originalShipToZip, originalShipToCountry, thirdPartyName, thirdPartyCompany, thirdPartyStreet1, thirdPartyStreet2, thirdPartyCity, thirdPartyState, thirdPartyZip, thirdPartyCountry, soldToName, soldToCompany, soldToStreet1, soldToStreet2, soldToCity, soldToState, soldToZip, soldToCountry, freightServiceType, netCharges, baseFreight, grossCharges, fuelCharge, residentialCharge, adultSignatureCharge, deliveryAreaCharge, deliveryAreaChargeExtended, addressCorrectionCharge, extraCharge1Name, extraCharge1Amount, extraCharge2Name, extraCharge2Amount, extraCharge3Name, extraCharge3Amount, extraCharge4Name, extraCharge4Amount, extraCharge5Name, extraCharge5Amount, extraCharge6Name, extraCharge6Amount, extraCharge7Name, extraCharge7Amount, extraCharge8Name, extraCharge8Amount, extraCharge9Name, extraCharge9Amount, extraCharge10Name, extraCharge10Amount, extraCharge11Name, extraCharge11Amount, extraCharge12Name, extraCharge12Amount, extraCharge13Name, extraCharge13Amount, extraCharge14Name, extraCharge14Amount, extraCharge15Name, extraCharge15Amount, extraCharge16Name, extraCharge16Amount, extraCharge17Name, extraCharge17Amount, extraCharge18Name, extraCharge18Amount, extraCharge19Name, extraCharge19Amount, extraCharge20Name, extraCharge20Amount, extraCharge21Name, extraCharge21Amount, extraCharge22Name, extraCharge22Amount, extraCharge23Name, extraCharge23Amount, extraCharge24Name, extraCharge24Amount, extraCharge25Name, extraCharge25Amount, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelInvoiceLine {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceNoId: ").append(toIndentedString(invoiceNoId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    trackingNo: ").append(toIndentedString(trackingNo)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
    sb.append("    dim2: ").append(toIndentedString(dim2)).append("\n");
    sb.append("    dim3: ").append(toIndentedString(dim3)).append("\n");
    sb.append("    enteredWeight: ").append(toIndentedString(enteredWeight)).append("\n");
    sb.append("    actualWeight: ").append(toIndentedString(actualWeight)).append("\n");
    sb.append("    billedWeight: ").append(toIndentedString(billedWeight)).append("\n");
    sb.append("    enteredWeightUnit: ").append(toIndentedString(enteredWeightUnit)).append("\n");
    sb.append("    actualWeightUnit: ").append(toIndentedString(actualWeightUnit)).append("\n");
    sb.append("    billedWeightUnit: ").append(toIndentedString(billedWeightUnit)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    shipmentReference: ").append(toIndentedString(shipmentReference)).append("\n");
    sb.append("    reference3: ").append(toIndentedString(reference3)).append("\n");
    sb.append("    reference4: ").append(toIndentedString(reference4)).append("\n");
    sb.append("    reference5: ").append(toIndentedString(reference5)).append("\n");
    sb.append("    reference6: ").append(toIndentedString(reference6)).append("\n");
    sb.append("    reference7: ").append(toIndentedString(reference7)).append("\n");
    sb.append("    shipFromName: ").append(toIndentedString(shipFromName)).append("\n");
    sb.append("    shipFromCompany: ").append(toIndentedString(shipFromCompany)).append("\n");
    sb.append("    shipFromStreet1: ").append(toIndentedString(shipFromStreet1)).append("\n");
    sb.append("    shipFromStreet2: ").append(toIndentedString(shipFromStreet2)).append("\n");
    sb.append("    shipFromCity: ").append(toIndentedString(shipFromCity)).append("\n");
    sb.append("    shipFromState: ").append(toIndentedString(shipFromState)).append("\n");
    sb.append("    shipFromZip: ").append(toIndentedString(shipFromZip)).append("\n");
    sb.append("    shipFromCountry: ").append(toIndentedString(shipFromCountry)).append("\n");
    sb.append("    shipToName: ").append(toIndentedString(shipToName)).append("\n");
    sb.append("    shipToCompany: ").append(toIndentedString(shipToCompany)).append("\n");
    sb.append("    shipToStreet1: ").append(toIndentedString(shipToStreet1)).append("\n");
    sb.append("    shipToStreet2: ").append(toIndentedString(shipToStreet2)).append("\n");
    sb.append("    shipToCity: ").append(toIndentedString(shipToCity)).append("\n");
    sb.append("    shipToState: ").append(toIndentedString(shipToState)).append("\n");
    sb.append("    shipToZip: ").append(toIndentedString(shipToZip)).append("\n");
    sb.append("    shipToCountry: ").append(toIndentedString(shipToCountry)).append("\n");
    sb.append("    originalShipToName: ").append(toIndentedString(originalShipToName)).append("\n");
    sb.append("    originalShipToCompany: ").append(toIndentedString(originalShipToCompany)).append("\n");
    sb.append("    originalShipToStreet1: ").append(toIndentedString(originalShipToStreet1)).append("\n");
    sb.append("    originalShipToStreet2: ").append(toIndentedString(originalShipToStreet2)).append("\n");
    sb.append("    originalShipToCity: ").append(toIndentedString(originalShipToCity)).append("\n");
    sb.append("    originalShipToState: ").append(toIndentedString(originalShipToState)).append("\n");
    sb.append("    originalShipToZip: ").append(toIndentedString(originalShipToZip)).append("\n");
    sb.append("    originalShipToCountry: ").append(toIndentedString(originalShipToCountry)).append("\n");
    sb.append("    thirdPartyName: ").append(toIndentedString(thirdPartyName)).append("\n");
    sb.append("    thirdPartyCompany: ").append(toIndentedString(thirdPartyCompany)).append("\n");
    sb.append("    thirdPartyStreet1: ").append(toIndentedString(thirdPartyStreet1)).append("\n");
    sb.append("    thirdPartyStreet2: ").append(toIndentedString(thirdPartyStreet2)).append("\n");
    sb.append("    thirdPartyCity: ").append(toIndentedString(thirdPartyCity)).append("\n");
    sb.append("    thirdPartyState: ").append(toIndentedString(thirdPartyState)).append("\n");
    sb.append("    thirdPartyZip: ").append(toIndentedString(thirdPartyZip)).append("\n");
    sb.append("    thirdPartyCountry: ").append(toIndentedString(thirdPartyCountry)).append("\n");
    sb.append("    soldToName: ").append(toIndentedString(soldToName)).append("\n");
    sb.append("    soldToCompany: ").append(toIndentedString(soldToCompany)).append("\n");
    sb.append("    soldToStreet1: ").append(toIndentedString(soldToStreet1)).append("\n");
    sb.append("    soldToStreet2: ").append(toIndentedString(soldToStreet2)).append("\n");
    sb.append("    soldToCity: ").append(toIndentedString(soldToCity)).append("\n");
    sb.append("    soldToState: ").append(toIndentedString(soldToState)).append("\n");
    sb.append("    soldToZip: ").append(toIndentedString(soldToZip)).append("\n");
    sb.append("    soldToCountry: ").append(toIndentedString(soldToCountry)).append("\n");
    sb.append("    freightServiceType: ").append(toIndentedString(freightServiceType)).append("\n");
    sb.append("    netCharges: ").append(toIndentedString(netCharges)).append("\n");
    sb.append("    baseFreight: ").append(toIndentedString(baseFreight)).append("\n");
    sb.append("    grossCharges: ").append(toIndentedString(grossCharges)).append("\n");
    sb.append("    fuelCharge: ").append(toIndentedString(fuelCharge)).append("\n");
    sb.append("    residentialCharge: ").append(toIndentedString(residentialCharge)).append("\n");
    sb.append("    adultSignatureCharge: ").append(toIndentedString(adultSignatureCharge)).append("\n");
    sb.append("    deliveryAreaCharge: ").append(toIndentedString(deliveryAreaCharge)).append("\n");
    sb.append("    deliveryAreaChargeExtended: ").append(toIndentedString(deliveryAreaChargeExtended)).append("\n");
    sb.append("    addressCorrectionCharge: ").append(toIndentedString(addressCorrectionCharge)).append("\n");
    sb.append("    extraCharge1Name: ").append(toIndentedString(extraCharge1Name)).append("\n");
    sb.append("    extraCharge1Amount: ").append(toIndentedString(extraCharge1Amount)).append("\n");
    sb.append("    extraCharge2Name: ").append(toIndentedString(extraCharge2Name)).append("\n");
    sb.append("    extraCharge2Amount: ").append(toIndentedString(extraCharge2Amount)).append("\n");
    sb.append("    extraCharge3Name: ").append(toIndentedString(extraCharge3Name)).append("\n");
    sb.append("    extraCharge3Amount: ").append(toIndentedString(extraCharge3Amount)).append("\n");
    sb.append("    extraCharge4Name: ").append(toIndentedString(extraCharge4Name)).append("\n");
    sb.append("    extraCharge4Amount: ").append(toIndentedString(extraCharge4Amount)).append("\n");
    sb.append("    extraCharge5Name: ").append(toIndentedString(extraCharge5Name)).append("\n");
    sb.append("    extraCharge5Amount: ").append(toIndentedString(extraCharge5Amount)).append("\n");
    sb.append("    extraCharge6Name: ").append(toIndentedString(extraCharge6Name)).append("\n");
    sb.append("    extraCharge6Amount: ").append(toIndentedString(extraCharge6Amount)).append("\n");
    sb.append("    extraCharge7Name: ").append(toIndentedString(extraCharge7Name)).append("\n");
    sb.append("    extraCharge7Amount: ").append(toIndentedString(extraCharge7Amount)).append("\n");
    sb.append("    extraCharge8Name: ").append(toIndentedString(extraCharge8Name)).append("\n");
    sb.append("    extraCharge8Amount: ").append(toIndentedString(extraCharge8Amount)).append("\n");
    sb.append("    extraCharge9Name: ").append(toIndentedString(extraCharge9Name)).append("\n");
    sb.append("    extraCharge9Amount: ").append(toIndentedString(extraCharge9Amount)).append("\n");
    sb.append("    extraCharge10Name: ").append(toIndentedString(extraCharge10Name)).append("\n");
    sb.append("    extraCharge10Amount: ").append(toIndentedString(extraCharge10Amount)).append("\n");
    sb.append("    extraCharge11Name: ").append(toIndentedString(extraCharge11Name)).append("\n");
    sb.append("    extraCharge11Amount: ").append(toIndentedString(extraCharge11Amount)).append("\n");
    sb.append("    extraCharge12Name: ").append(toIndentedString(extraCharge12Name)).append("\n");
    sb.append("    extraCharge12Amount: ").append(toIndentedString(extraCharge12Amount)).append("\n");
    sb.append("    extraCharge13Name: ").append(toIndentedString(extraCharge13Name)).append("\n");
    sb.append("    extraCharge13Amount: ").append(toIndentedString(extraCharge13Amount)).append("\n");
    sb.append("    extraCharge14Name: ").append(toIndentedString(extraCharge14Name)).append("\n");
    sb.append("    extraCharge14Amount: ").append(toIndentedString(extraCharge14Amount)).append("\n");
    sb.append("    extraCharge15Name: ").append(toIndentedString(extraCharge15Name)).append("\n");
    sb.append("    extraCharge15Amount: ").append(toIndentedString(extraCharge15Amount)).append("\n");
    sb.append("    extraCharge16Name: ").append(toIndentedString(extraCharge16Name)).append("\n");
    sb.append("    extraCharge16Amount: ").append(toIndentedString(extraCharge16Amount)).append("\n");
    sb.append("    extraCharge17Name: ").append(toIndentedString(extraCharge17Name)).append("\n");
    sb.append("    extraCharge17Amount: ").append(toIndentedString(extraCharge17Amount)).append("\n");
    sb.append("    extraCharge18Name: ").append(toIndentedString(extraCharge18Name)).append("\n");
    sb.append("    extraCharge18Amount: ").append(toIndentedString(extraCharge18Amount)).append("\n");
    sb.append("    extraCharge19Name: ").append(toIndentedString(extraCharge19Name)).append("\n");
    sb.append("    extraCharge19Amount: ").append(toIndentedString(extraCharge19Amount)).append("\n");
    sb.append("    extraCharge20Name: ").append(toIndentedString(extraCharge20Name)).append("\n");
    sb.append("    extraCharge20Amount: ").append(toIndentedString(extraCharge20Amount)).append("\n");
    sb.append("    extraCharge21Name: ").append(toIndentedString(extraCharge21Name)).append("\n");
    sb.append("    extraCharge21Amount: ").append(toIndentedString(extraCharge21Amount)).append("\n");
    sb.append("    extraCharge22Name: ").append(toIndentedString(extraCharge22Name)).append("\n");
    sb.append("    extraCharge22Amount: ").append(toIndentedString(extraCharge22Amount)).append("\n");
    sb.append("    extraCharge23Name: ").append(toIndentedString(extraCharge23Name)).append("\n");
    sb.append("    extraCharge23Amount: ").append(toIndentedString(extraCharge23Amount)).append("\n");
    sb.append("    extraCharge24Name: ").append(toIndentedString(extraCharge24Name)).append("\n");
    sb.append("    extraCharge24Amount: ").append(toIndentedString(extraCharge24Amount)).append("\n");
    sb.append("    extraCharge25Name: ").append(toIndentedString(extraCharge25Name)).append("\n");
    sb.append("    extraCharge25Amount: ").append(toIndentedString(extraCharge25Amount)).append("\n");
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

