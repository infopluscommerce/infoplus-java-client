package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T21:25:15.480-06:00")
public class ExecuteQuickAdjustmentInputAPIModel   {
  
  private List<Integer> idList = new ArrayList<Integer>();

  
  /**
   **/
  public ExecuteQuickAdjustmentInputAPIModel idList(List<Integer> idList) {
    this.idList = idList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idList")
  public List<Integer> getIdList() {
    return idList;
  }
  public void setIdList(List<Integer> idList) {
    this.idList = idList;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteQuickAdjustmentInputAPIModel executeQuickAdjustmentInputAPIModel = (ExecuteQuickAdjustmentInputAPIModel) o;
    return Objects.equals(this.idList, executeQuickAdjustmentInputAPIModel.idList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteQuickAdjustmentInputAPIModel {\n");
    
    sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
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

