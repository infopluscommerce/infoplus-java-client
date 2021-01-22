/*
 * Infoplus API
 * Infoplus API.
 *
 * OpenAPI spec version: beta
 * Contact: api@infopluscommerce.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infopluscommerce.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Warehouse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-21T23:57:39.841-06:00")
public class Warehouse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("client")
  private Integer client = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("street1")
  private String street1 = null;

  @SerializedName("street2")
  private String street2 = null;

  @SerializedName("street3")
  private String street3 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zip")
  private String zip = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("locationBarcodePrefix")
  private String locationBarcodePrefix = null;

  @SerializedName("lpnPrefix")
  private String lpnPrefix = null;

  @SerializedName("timeZone")
  private String timeZone = null;

  @SerializedName("packStationAllowPackingBeforePickWorkIsComplete")
  private Boolean packStationAllowPackingBeforePickWorkIsComplete = false;

  @SerializedName("packStationSkipCartonLPN")
  private Boolean packStationSkipCartonLPN = false;

  @SerializedName("packStationRequireConfirmOnError")
  private Boolean packStationRequireConfirmOnError = false;

  @SerializedName("packStationAllowScanningSKUToIdentifyOrders")
  private Boolean packStationAllowScanningSKUToIdentifyOrders = false;

  @SerializedName("shipStationWeightCheckPackedOrders")
  private Boolean shipStationWeightCheckPackedOrders = false;

  @SerializedName("shipStationShowUserWeightCheckExceptions")
  private Boolean shipStationShowUserWeightCheckExceptions = false;

  @SerializedName("shipStationAutoPrintPreGeneratedLabels")
  private Boolean shipStationAutoPrintPreGeneratedLabels = false;

  @SerializedName("shipStationAllowScanningSKUToIdentifyOrders")
  private Boolean shipStationAllowScanningSKUToIdentifyOrders = false;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

   /**
   * Get client
   * @return client
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getClient() {
    return client;
  }

  public Warehouse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Warehouse address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Warehouse company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Warehouse street1(String street1) {
    this.street1 = street1;
    return this;
  }

   /**
   * Get street1
   * @return street1
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStreet1() {
    return street1;
  }

  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  public Warehouse street2(String street2) {
    this.street2 = street2;
    return this;
  }

   /**
   * Get street2
   * @return street2
  **/
  @ApiModelProperty(value = "")
  public String getStreet2() {
    return street2;
  }

  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  public Warehouse street3(String street3) {
    this.street3 = street3;
    return this;
  }

   /**
   * Get street3
   * @return street3
  **/
  @ApiModelProperty(value = "")
  public String getStreet3() {
    return street3;
  }

  public void setStreet3(String street3) {
    this.street3 = street3;
  }

  public Warehouse city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Warehouse state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Warehouse zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @ApiModelProperty(required = true, value = "")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public Warehouse country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Warehouse phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Warehouse locationBarcodePrefix(String locationBarcodePrefix) {
    this.locationBarcodePrefix = locationBarcodePrefix;
    return this;
  }

   /**
   * Get locationBarcodePrefix
   * @return locationBarcodePrefix
  **/
  @ApiModelProperty(value = "")
  public String getLocationBarcodePrefix() {
    return locationBarcodePrefix;
  }

  public void setLocationBarcodePrefix(String locationBarcodePrefix) {
    this.locationBarcodePrefix = locationBarcodePrefix;
  }

  public Warehouse lpnPrefix(String lpnPrefix) {
    this.lpnPrefix = lpnPrefix;
    return this;
  }

   /**
   * Get lpnPrefix
   * @return lpnPrefix
  **/
  @ApiModelProperty(value = "")
  public String getLpnPrefix() {
    return lpnPrefix;
  }

  public void setLpnPrefix(String lpnPrefix) {
    this.lpnPrefix = lpnPrefix;
  }

  public Warehouse timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @ApiModelProperty(value = "")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public Warehouse packStationAllowPackingBeforePickWorkIsComplete(Boolean packStationAllowPackingBeforePickWorkIsComplete) {
    this.packStationAllowPackingBeforePickWorkIsComplete = packStationAllowPackingBeforePickWorkIsComplete;
    return this;
  }

   /**
   * Get packStationAllowPackingBeforePickWorkIsComplete
   * @return packStationAllowPackingBeforePickWorkIsComplete
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isPackStationAllowPackingBeforePickWorkIsComplete() {
    return packStationAllowPackingBeforePickWorkIsComplete;
  }

  public void setPackStationAllowPackingBeforePickWorkIsComplete(Boolean packStationAllowPackingBeforePickWorkIsComplete) {
    this.packStationAllowPackingBeforePickWorkIsComplete = packStationAllowPackingBeforePickWorkIsComplete;
  }

  public Warehouse packStationSkipCartonLPN(Boolean packStationSkipCartonLPN) {
    this.packStationSkipCartonLPN = packStationSkipCartonLPN;
    return this;
  }

   /**
   * Get packStationSkipCartonLPN
   * @return packStationSkipCartonLPN
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isPackStationSkipCartonLPN() {
    return packStationSkipCartonLPN;
  }

  public void setPackStationSkipCartonLPN(Boolean packStationSkipCartonLPN) {
    this.packStationSkipCartonLPN = packStationSkipCartonLPN;
  }

  public Warehouse packStationRequireConfirmOnError(Boolean packStationRequireConfirmOnError) {
    this.packStationRequireConfirmOnError = packStationRequireConfirmOnError;
    return this;
  }

   /**
   * Get packStationRequireConfirmOnError
   * @return packStationRequireConfirmOnError
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isPackStationRequireConfirmOnError() {
    return packStationRequireConfirmOnError;
  }

  public void setPackStationRequireConfirmOnError(Boolean packStationRequireConfirmOnError) {
    this.packStationRequireConfirmOnError = packStationRequireConfirmOnError;
  }

  public Warehouse packStationAllowScanningSKUToIdentifyOrders(Boolean packStationAllowScanningSKUToIdentifyOrders) {
    this.packStationAllowScanningSKUToIdentifyOrders = packStationAllowScanningSKUToIdentifyOrders;
    return this;
  }

   /**
   * Get packStationAllowScanningSKUToIdentifyOrders
   * @return packStationAllowScanningSKUToIdentifyOrders
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isPackStationAllowScanningSKUToIdentifyOrders() {
    return packStationAllowScanningSKUToIdentifyOrders;
  }

  public void setPackStationAllowScanningSKUToIdentifyOrders(Boolean packStationAllowScanningSKUToIdentifyOrders) {
    this.packStationAllowScanningSKUToIdentifyOrders = packStationAllowScanningSKUToIdentifyOrders;
  }

  public Warehouse shipStationWeightCheckPackedOrders(Boolean shipStationWeightCheckPackedOrders) {
    this.shipStationWeightCheckPackedOrders = shipStationWeightCheckPackedOrders;
    return this;
  }

   /**
   * Get shipStationWeightCheckPackedOrders
   * @return shipStationWeightCheckPackedOrders
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isShipStationWeightCheckPackedOrders() {
    return shipStationWeightCheckPackedOrders;
  }

  public void setShipStationWeightCheckPackedOrders(Boolean shipStationWeightCheckPackedOrders) {
    this.shipStationWeightCheckPackedOrders = shipStationWeightCheckPackedOrders;
  }

  public Warehouse shipStationShowUserWeightCheckExceptions(Boolean shipStationShowUserWeightCheckExceptions) {
    this.shipStationShowUserWeightCheckExceptions = shipStationShowUserWeightCheckExceptions;
    return this;
  }

   /**
   * Get shipStationShowUserWeightCheckExceptions
   * @return shipStationShowUserWeightCheckExceptions
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isShipStationShowUserWeightCheckExceptions() {
    return shipStationShowUserWeightCheckExceptions;
  }

  public void setShipStationShowUserWeightCheckExceptions(Boolean shipStationShowUserWeightCheckExceptions) {
    this.shipStationShowUserWeightCheckExceptions = shipStationShowUserWeightCheckExceptions;
  }

  public Warehouse shipStationAutoPrintPreGeneratedLabels(Boolean shipStationAutoPrintPreGeneratedLabels) {
    this.shipStationAutoPrintPreGeneratedLabels = shipStationAutoPrintPreGeneratedLabels;
    return this;
  }

   /**
   * Get shipStationAutoPrintPreGeneratedLabels
   * @return shipStationAutoPrintPreGeneratedLabels
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isShipStationAutoPrintPreGeneratedLabels() {
    return shipStationAutoPrintPreGeneratedLabels;
  }

  public void setShipStationAutoPrintPreGeneratedLabels(Boolean shipStationAutoPrintPreGeneratedLabels) {
    this.shipStationAutoPrintPreGeneratedLabels = shipStationAutoPrintPreGeneratedLabels;
  }

  public Warehouse shipStationAllowScanningSKUToIdentifyOrders(Boolean shipStationAllowScanningSKUToIdentifyOrders) {
    this.shipStationAllowScanningSKUToIdentifyOrders = shipStationAllowScanningSKUToIdentifyOrders;
    return this;
  }

   /**
   * Get shipStationAllowScanningSKUToIdentifyOrders
   * @return shipStationAllowScanningSKUToIdentifyOrders
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isShipStationAllowScanningSKUToIdentifyOrders() {
    return shipStationAllowScanningSKUToIdentifyOrders;
  }

  public void setShipStationAllowScanningSKUToIdentifyOrders(Boolean shipStationAllowScanningSKUToIdentifyOrders) {
    this.shipStationAllowScanningSKUToIdentifyOrders = shipStationAllowScanningSKUToIdentifyOrders;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

   /**
   * Get modifyDate
   * @return modifyDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifyDate() {
    return modifyDate;
  }

  public Warehouse customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Warehouse putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<String, Object>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
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
    Warehouse warehouse = (Warehouse) o;
    return Objects.equals(this.id, warehouse.id) &&
        Objects.equals(this.client, warehouse.client) &&
        Objects.equals(this.name, warehouse.name) &&
        Objects.equals(this.address, warehouse.address) &&
        Objects.equals(this.company, warehouse.company) &&
        Objects.equals(this.street1, warehouse.street1) &&
        Objects.equals(this.street2, warehouse.street2) &&
        Objects.equals(this.street3, warehouse.street3) &&
        Objects.equals(this.city, warehouse.city) &&
        Objects.equals(this.state, warehouse.state) &&
        Objects.equals(this.zip, warehouse.zip) &&
        Objects.equals(this.country, warehouse.country) &&
        Objects.equals(this.phone, warehouse.phone) &&
        Objects.equals(this.locationBarcodePrefix, warehouse.locationBarcodePrefix) &&
        Objects.equals(this.lpnPrefix, warehouse.lpnPrefix) &&
        Objects.equals(this.timeZone, warehouse.timeZone) &&
        Objects.equals(this.packStationAllowPackingBeforePickWorkIsComplete, warehouse.packStationAllowPackingBeforePickWorkIsComplete) &&
        Objects.equals(this.packStationSkipCartonLPN, warehouse.packStationSkipCartonLPN) &&
        Objects.equals(this.packStationRequireConfirmOnError, warehouse.packStationRequireConfirmOnError) &&
        Objects.equals(this.packStationAllowScanningSKUToIdentifyOrders, warehouse.packStationAllowScanningSKUToIdentifyOrders) &&
        Objects.equals(this.shipStationWeightCheckPackedOrders, warehouse.shipStationWeightCheckPackedOrders) &&
        Objects.equals(this.shipStationShowUserWeightCheckExceptions, warehouse.shipStationShowUserWeightCheckExceptions) &&
        Objects.equals(this.shipStationAutoPrintPreGeneratedLabels, warehouse.shipStationAutoPrintPreGeneratedLabels) &&
        Objects.equals(this.shipStationAllowScanningSKUToIdentifyOrders, warehouse.shipStationAllowScanningSKUToIdentifyOrders) &&
        Objects.equals(this.createDate, warehouse.createDate) &&
        Objects.equals(this.modifyDate, warehouse.modifyDate) &&
        Objects.equals(this.customFields, warehouse.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, client, name, address, company, street1, street2, street3, city, state, zip, country, phone, locationBarcodePrefix, lpnPrefix, timeZone, packStationAllowPackingBeforePickWorkIsComplete, packStationSkipCartonLPN, packStationRequireConfirmOnError, packStationAllowScanningSKUToIdentifyOrders, shipStationWeightCheckPackedOrders, shipStationShowUserWeightCheckExceptions, shipStationAutoPrintPreGeneratedLabels, shipStationAllowScanningSKUToIdentifyOrders, createDate, modifyDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Warehouse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    street3: ").append(toIndentedString(street3)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    locationBarcodePrefix: ").append(toIndentedString(locationBarcodePrefix)).append("\n");
    sb.append("    lpnPrefix: ").append(toIndentedString(lpnPrefix)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    packStationAllowPackingBeforePickWorkIsComplete: ").append(toIndentedString(packStationAllowPackingBeforePickWorkIsComplete)).append("\n");
    sb.append("    packStationSkipCartonLPN: ").append(toIndentedString(packStationSkipCartonLPN)).append("\n");
    sb.append("    packStationRequireConfirmOnError: ").append(toIndentedString(packStationRequireConfirmOnError)).append("\n");
    sb.append("    packStationAllowScanningSKUToIdentifyOrders: ").append(toIndentedString(packStationAllowScanningSKUToIdentifyOrders)).append("\n");
    sb.append("    shipStationWeightCheckPackedOrders: ").append(toIndentedString(shipStationWeightCheckPackedOrders)).append("\n");
    sb.append("    shipStationShowUserWeightCheckExceptions: ").append(toIndentedString(shipStationShowUserWeightCheckExceptions)).append("\n");
    sb.append("    shipStationAutoPrintPreGeneratedLabels: ").append(toIndentedString(shipStationAutoPrintPreGeneratedLabels)).append("\n");
    sb.append("    shipStationAllowScanningSKUToIdentifyOrders: ").append(toIndentedString(shipStationAllowScanningSKUToIdentifyOrders)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
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

