package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class BillOfLadingCarrierInfoLine   {
  
  private Integer seqNo = null;
  private Integer huQuantity = null;
  private String huType = null;
  private Integer packageQuantity = null;
  private String packageType = null;
  private Integer weight = null;
  private Boolean isHazardousMaterial = false;
  private String commodityDescription = null;
  private String nfmcNo = null;
  private String carrierClass = null;
  private Map<String, Object> customFields = new HashMap<String, Object>();

  
  /**
   **/
  public BillOfLadingCarrierInfoLine seqNo(Integer seqNo) {
    this.seqNo = seqNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("seqNo")
  public Integer getSeqNo() {
    return seqNo;
  }
  public void setSeqNo(Integer seqNo) {
    this.seqNo = seqNo;
  }

  
  /**
   **/
  public BillOfLadingCarrierInfoLine huQuantity(Integer huQuantity) {
    this.huQuantity = huQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("huQuantity")
  public Integer getHuQuantity() {
    return huQuantity;
  }
  public void setHuQuantity(Integer huQuantity) {
    this.huQuantity = huQuantity;
  }

  
  /**
   **/
  public BillOfLadingCarrierInfoLine huType(String huType) {
    this.huType = huType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("huType")
  public String getHuType() {
    return huType;
  }
  public void setHuType(String huType) {
    this.huType = huType;
  }

  
  /**
   **/
  public BillOfLadingCarrierInfoLine packageQuantity(Integer packageQuantity) {
    this.packageQuantity = packageQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("packageQuantity")
  public Integer getPackageQuantity() {
    return packageQuantity;
  }
  public void setPackageQuantity(Integer packageQuantity) {
    this.packageQuantity = packageQuantity;
  }

  
  /**
   **/
  public BillOfLadingCarrierInfoLine packageType(String packageType) {
    this.packageType = packageType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("packageType")
  public String getPackageType() {
    return packageType;
  }
  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }

  
  /**
   **/
  public BillOfLadingCarrierInfoLine weight(Integer weight) {
    this.weight = weight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }
  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  
  /**
   **/
  public BillOfLadingCarrierInfoLine isHazardousMaterial(Boolean isHazardousMaterial) {
    this.isHazardousMaterial = isHazardousMaterial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isHazardousMaterial")
  public Boolean getIsHazardousMaterial() {
    return isHazardousMaterial;
  }
  public void setIsHazardousMaterial(Boolean isHazardousMaterial) {
    this.isHazardousMaterial = isHazardousMaterial;
  }

  
  /**
   **/
  public BillOfLadingCarrierInfoLine commodityDescription(String commodityDescription) {
    this.commodityDescription = commodityDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("commodityDescription")
  public String getCommodityDescription() {
    return commodityDescription;
  }
  public void setCommodityDescription(String commodityDescription) {
    this.commodityDescription = commodityDescription;
  }

  
  /**
   **/
  public BillOfLadingCarrierInfoLine nfmcNo(String nfmcNo) {
    this.nfmcNo = nfmcNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nfmcNo")
  public String getNfmcNo() {
    return nfmcNo;
  }
  public void setNfmcNo(String nfmcNo) {
    this.nfmcNo = nfmcNo;
  }

  
  /**
   **/
  public BillOfLadingCarrierInfoLine carrierClass(String carrierClass) {
    this.carrierClass = carrierClass;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("carrierClass")
  public String getCarrierClass() {
    return carrierClass;
  }
  public void setCarrierClass(String carrierClass) {
    this.carrierClass = carrierClass;
  }

  
  /**
   **/
  public BillOfLadingCarrierInfoLine customFields(Map<String, Object> customFields) {
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
    BillOfLadingCarrierInfoLine billOfLadingCarrierInfoLine = (BillOfLadingCarrierInfoLine) o;
    return Objects.equals(this.seqNo, billOfLadingCarrierInfoLine.seqNo) &&
        Objects.equals(this.huQuantity, billOfLadingCarrierInfoLine.huQuantity) &&
        Objects.equals(this.huType, billOfLadingCarrierInfoLine.huType) &&
        Objects.equals(this.packageQuantity, billOfLadingCarrierInfoLine.packageQuantity) &&
        Objects.equals(this.packageType, billOfLadingCarrierInfoLine.packageType) &&
        Objects.equals(this.weight, billOfLadingCarrierInfoLine.weight) &&
        Objects.equals(this.isHazardousMaterial, billOfLadingCarrierInfoLine.isHazardousMaterial) &&
        Objects.equals(this.commodityDescription, billOfLadingCarrierInfoLine.commodityDescription) &&
        Objects.equals(this.nfmcNo, billOfLadingCarrierInfoLine.nfmcNo) &&
        Objects.equals(this.carrierClass, billOfLadingCarrierInfoLine.carrierClass) &&
        Objects.equals(this.customFields, billOfLadingCarrierInfoLine.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seqNo, huQuantity, huType, packageQuantity, packageType, weight, isHazardousMaterial, commodityDescription, nfmcNo, carrierClass, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillOfLadingCarrierInfoLine {\n");
    
    sb.append("    seqNo: ").append(toIndentedString(seqNo)).append("\n");
    sb.append("    huQuantity: ").append(toIndentedString(huQuantity)).append("\n");
    sb.append("    huType: ").append(toIndentedString(huType)).append("\n");
    sb.append("    packageQuantity: ").append(toIndentedString(packageQuantity)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    isHazardousMaterial: ").append(toIndentedString(isHazardousMaterial)).append("\n");
    sb.append("    commodityDescription: ").append(toIndentedString(commodityDescription)).append("\n");
    sb.append("    nfmcNo: ").append(toIndentedString(nfmcNo)).append("\n");
    sb.append("    carrierClass: ").append(toIndentedString(carrierClass)).append("\n");
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

