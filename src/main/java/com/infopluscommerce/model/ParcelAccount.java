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
public class ParcelAccount   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String carrier = null;
  private String accountNo = null;
  private Integer client = null;
  private String name = null;
  private String manifestPartnerId = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
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
  public ParcelAccount carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  
  /**
   **/
  public ParcelAccount accountNo(String accountNo) {
    this.accountNo = accountNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("accountNo")
  public String getAccountNo() {
    return accountNo;
  }
  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("client")
  public Integer getClient() {
    return client;
  }

  
  /**
   **/
  public ParcelAccount name(String name) {
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

  
  /**
   **/
  public ParcelAccount manifestPartnerId(String manifestPartnerId) {
    this.manifestPartnerId = manifestPartnerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("manifestPartnerId")
  public String getManifestPartnerId() {
    return manifestPartnerId;
  }
  public void setManifestPartnerId(String manifestPartnerId) {
    this.manifestPartnerId = manifestPartnerId;
  }

  
  /**
   **/
  public ParcelAccount customFields(Map<String, Object> customFields) {
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
    ParcelAccount parcelAccount = (ParcelAccount) o;
    return Objects.equals(this.id, parcelAccount.id) &&
        Objects.equals(this.createDate, parcelAccount.createDate) &&
        Objects.equals(this.modifyDate, parcelAccount.modifyDate) &&
        Objects.equals(this.carrier, parcelAccount.carrier) &&
        Objects.equals(this.accountNo, parcelAccount.accountNo) &&
        Objects.equals(this.client, parcelAccount.client) &&
        Objects.equals(this.name, parcelAccount.name) &&
        Objects.equals(this.manifestPartnerId, parcelAccount.manifestPartnerId) &&
        Objects.equals(this.customFields, parcelAccount.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, carrier, accountNo, client, name, manifestPartnerId, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    manifestPartnerId: ").append(toIndentedString(manifestPartnerId)).append("\n");
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

