package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
public class ParcelAccount   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private String carrier = null;
  private String accountNo = null;
  private Integer client = null;
  private String name = null;
  private String manifestPartnerId = null;

  
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accountNo")
  public String getAccountNo() {
    return accountNo;
  }
  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("client")
  public Integer getClient() {
    return client;
  }
  public void setClient(Integer client) {
    this.client = client;
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("manifestPartnerId")
  public String getManifestPartnerId() {
    return manifestPartnerId;
  }
  public void setManifestPartnerId(String manifestPartnerId) {
    this.manifestPartnerId = manifestPartnerId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelAccount parcelAccount = (ParcelAccount) o;
    return Objects.equals(id, parcelAccount.id) &&
        Objects.equals(createDate, parcelAccount.createDate) &&
        Objects.equals(modifyDate, parcelAccount.modifyDate) &&
        Objects.equals(carrier, parcelAccount.carrier) &&
        Objects.equals(accountNo, parcelAccount.accountNo) &&
        Objects.equals(client, parcelAccount.client) &&
        Objects.equals(name, parcelAccount.name) &&
        Objects.equals(manifestPartnerId, parcelAccount.manifestPartnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, carrier, accountNo, client, name, manifestPartnerId);
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

