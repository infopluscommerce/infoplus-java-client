package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-04T22:56:01.104-05:00")
public class ShoppingCartConnection   {
  
  private Integer id = null;
  private Date createDate = null;
  private Date modifyDate = null;
  private Integer clientId = null;
  private String nonce = null;
  private Integer lobId = null;
  private Integer orderSourceId = null;
  private Integer integrationPartnerId = null;
  private String connectionType = null;
  private Integer itemFilterId = null;
  private String infoplusSKUFieldToMap = null;
  private String shoppingCartSKUFieldToMap = null;
  private String name = null;
  private String shoppingCartStoreURL = null;
  private String accessCode = null;
  private String accessToken = null;
  private Boolean syncOrders = false;
  private Boolean syncInventory = false;
  private Boolean syncTrackingData = false;
  private Date syncInventoryLevelsLastRunTime = null;
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("clientId")
  public Integer getClientId() {
    return clientId;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nonce")
  public String getNonce() {
    return nonce;
  }

  
  /**
   **/
  public ShoppingCartConnection lobId(Integer lobId) {
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
  public ShoppingCartConnection orderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("orderSourceId")
  public Integer getOrderSourceId() {
    return orderSourceId;
  }
  public void setOrderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
  }

  
  /**
   **/
  public ShoppingCartConnection integrationPartnerId(Integer integrationPartnerId) {
    this.integrationPartnerId = integrationPartnerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("integrationPartnerId")
  public Integer getIntegrationPartnerId() {
    return integrationPartnerId;
  }
  public void setIntegrationPartnerId(Integer integrationPartnerId) {
    this.integrationPartnerId = integrationPartnerId;
  }

  
  /**
   **/
  public ShoppingCartConnection connectionType(String connectionType) {
    this.connectionType = connectionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("connectionType")
  public String getConnectionType() {
    return connectionType;
  }
  public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
  }

  
  /**
   **/
  public ShoppingCartConnection itemFilterId(Integer itemFilterId) {
    this.itemFilterId = itemFilterId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("itemFilterId")
  public Integer getItemFilterId() {
    return itemFilterId;
  }
  public void setItemFilterId(Integer itemFilterId) {
    this.itemFilterId = itemFilterId;
  }

  
  /**
   **/
  public ShoppingCartConnection infoplusSKUFieldToMap(String infoplusSKUFieldToMap) {
    this.infoplusSKUFieldToMap = infoplusSKUFieldToMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("infoplusSKUFieldToMap")
  public String getInfoplusSKUFieldToMap() {
    return infoplusSKUFieldToMap;
  }
  public void setInfoplusSKUFieldToMap(String infoplusSKUFieldToMap) {
    this.infoplusSKUFieldToMap = infoplusSKUFieldToMap;
  }

  
  /**
   **/
  public ShoppingCartConnection shoppingCartSKUFieldToMap(String shoppingCartSKUFieldToMap) {
    this.shoppingCartSKUFieldToMap = shoppingCartSKUFieldToMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("shoppingCartSKUFieldToMap")
  public String getShoppingCartSKUFieldToMap() {
    return shoppingCartSKUFieldToMap;
  }
  public void setShoppingCartSKUFieldToMap(String shoppingCartSKUFieldToMap) {
    this.shoppingCartSKUFieldToMap = shoppingCartSKUFieldToMap;
  }

  
  /**
   **/
  public ShoppingCartConnection name(String name) {
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
  public ShoppingCartConnection shoppingCartStoreURL(String shoppingCartStoreURL) {
    this.shoppingCartStoreURL = shoppingCartStoreURL;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("shoppingCartStoreURL")
  public String getShoppingCartStoreURL() {
    return shoppingCartStoreURL;
  }
  public void setShoppingCartStoreURL(String shoppingCartStoreURL) {
    this.shoppingCartStoreURL = shoppingCartStoreURL;
  }

  
  /**
   **/
  public ShoppingCartConnection accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("accessCode")
  public String getAccessCode() {
    return accessCode;
  }
  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  
  /**
   **/
  public ShoppingCartConnection accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("accessToken")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  
  /**
   **/
  public ShoppingCartConnection syncOrders(Boolean syncOrders) {
    this.syncOrders = syncOrders;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("syncOrders")
  public Boolean getSyncOrders() {
    return syncOrders;
  }
  public void setSyncOrders(Boolean syncOrders) {
    this.syncOrders = syncOrders;
  }

  
  /**
   **/
  public ShoppingCartConnection syncInventory(Boolean syncInventory) {
    this.syncInventory = syncInventory;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("syncInventory")
  public Boolean getSyncInventory() {
    return syncInventory;
  }
  public void setSyncInventory(Boolean syncInventory) {
    this.syncInventory = syncInventory;
  }

  
  /**
   **/
  public ShoppingCartConnection syncTrackingData(Boolean syncTrackingData) {
    this.syncTrackingData = syncTrackingData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("syncTrackingData")
  public Boolean getSyncTrackingData() {
    return syncTrackingData;
  }
  public void setSyncTrackingData(Boolean syncTrackingData) {
    this.syncTrackingData = syncTrackingData;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("syncInventoryLevelsLastRunTime")
  public Date getSyncInventoryLevelsLastRunTime() {
    return syncInventoryLevelsLastRunTime;
  }

  
  /**
   **/
  public ShoppingCartConnection customFields(Map<String, Object> customFields) {
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
    ShoppingCartConnection shoppingCartConnection = (ShoppingCartConnection) o;
    return Objects.equals(this.id, shoppingCartConnection.id) &&
        Objects.equals(this.createDate, shoppingCartConnection.createDate) &&
        Objects.equals(this.modifyDate, shoppingCartConnection.modifyDate) &&
        Objects.equals(this.clientId, shoppingCartConnection.clientId) &&
        Objects.equals(this.nonce, shoppingCartConnection.nonce) &&
        Objects.equals(this.lobId, shoppingCartConnection.lobId) &&
        Objects.equals(this.orderSourceId, shoppingCartConnection.orderSourceId) &&
        Objects.equals(this.integrationPartnerId, shoppingCartConnection.integrationPartnerId) &&
        Objects.equals(this.connectionType, shoppingCartConnection.connectionType) &&
        Objects.equals(this.itemFilterId, shoppingCartConnection.itemFilterId) &&
        Objects.equals(this.infoplusSKUFieldToMap, shoppingCartConnection.infoplusSKUFieldToMap) &&
        Objects.equals(this.shoppingCartSKUFieldToMap, shoppingCartConnection.shoppingCartSKUFieldToMap) &&
        Objects.equals(this.name, shoppingCartConnection.name) &&
        Objects.equals(this.shoppingCartStoreURL, shoppingCartConnection.shoppingCartStoreURL) &&
        Objects.equals(this.accessCode, shoppingCartConnection.accessCode) &&
        Objects.equals(this.accessToken, shoppingCartConnection.accessToken) &&
        Objects.equals(this.syncOrders, shoppingCartConnection.syncOrders) &&
        Objects.equals(this.syncInventory, shoppingCartConnection.syncInventory) &&
        Objects.equals(this.syncTrackingData, shoppingCartConnection.syncTrackingData) &&
        Objects.equals(this.syncInventoryLevelsLastRunTime, shoppingCartConnection.syncInventoryLevelsLastRunTime) &&
        Objects.equals(this.customFields, shoppingCartConnection.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, clientId, nonce, lobId, orderSourceId, integrationPartnerId, connectionType, itemFilterId, infoplusSKUFieldToMap, shoppingCartSKUFieldToMap, name, shoppingCartStoreURL, accessCode, accessToken, syncOrders, syncInventory, syncTrackingData, syncInventoryLevelsLastRunTime, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCartConnection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    orderSourceId: ").append(toIndentedString(orderSourceId)).append("\n");
    sb.append("    integrationPartnerId: ").append(toIndentedString(integrationPartnerId)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    itemFilterId: ").append(toIndentedString(itemFilterId)).append("\n");
    sb.append("    infoplusSKUFieldToMap: ").append(toIndentedString(infoplusSKUFieldToMap)).append("\n");
    sb.append("    shoppingCartSKUFieldToMap: ").append(toIndentedString(shoppingCartSKUFieldToMap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shoppingCartStoreURL: ").append(toIndentedString(shoppingCartStoreURL)).append("\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    syncOrders: ").append(toIndentedString(syncOrders)).append("\n");
    sb.append("    syncInventory: ").append(toIndentedString(syncInventory)).append("\n");
    sb.append("    syncTrackingData: ").append(toIndentedString(syncTrackingData)).append("\n");
    sb.append("    syncInventoryLevelsLastRunTime: ").append(toIndentedString(syncInventoryLevelsLastRunTime)).append("\n");
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

