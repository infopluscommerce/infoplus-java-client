package com.infopluscommerce.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T10:31:49.931-05:00")
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("clientId")
  public Integer getClientId() {
    return clientId;
  }
  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nonce")
  public String getNonce() {
    return nonce;
  }
  public void setNonce(String nonce) {
    this.nonce = nonce;
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
  @JsonProperty("orderSourceId")
  public Integer getOrderSourceId() {
    return orderSourceId;
  }
  public void setOrderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("integrationPartnerId")
  public Integer getIntegrationPartnerId() {
    return integrationPartnerId;
  }
  public void setIntegrationPartnerId(Integer integrationPartnerId) {
    this.integrationPartnerId = integrationPartnerId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("connectionType")
  public String getConnectionType() {
    return connectionType;
  }
  public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("itemFilterId")
  public Integer getItemFilterId() {
    return itemFilterId;
  }
  public void setItemFilterId(Integer itemFilterId) {
    this.itemFilterId = itemFilterId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("infoplusSKUFieldToMap")
  public String getInfoplusSKUFieldToMap() {
    return infoplusSKUFieldToMap;
  }
  public void setInfoplusSKUFieldToMap(String infoplusSKUFieldToMap) {
    this.infoplusSKUFieldToMap = infoplusSKUFieldToMap;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("shoppingCartSKUFieldToMap")
  public String getShoppingCartSKUFieldToMap() {
    return shoppingCartSKUFieldToMap;
  }
  public void setShoppingCartSKUFieldToMap(String shoppingCartSKUFieldToMap) {
    this.shoppingCartSKUFieldToMap = shoppingCartSKUFieldToMap;
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
  @JsonProperty("shoppingCartStoreURL")
  public String getShoppingCartStoreURL() {
    return shoppingCartStoreURL;
  }
  public void setShoppingCartStoreURL(String shoppingCartStoreURL) {
    this.shoppingCartStoreURL = shoppingCartStoreURL;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accessCode")
  public String getAccessCode() {
    return accessCode;
  }
  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accessToken")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("syncOrders")
  public Boolean getSyncOrders() {
    return syncOrders;
  }
  public void setSyncOrders(Boolean syncOrders) {
    this.syncOrders = syncOrders;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("syncInventory")
  public Boolean getSyncInventory() {
    return syncInventory;
  }
  public void setSyncInventory(Boolean syncInventory) {
    this.syncInventory = syncInventory;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("syncTrackingData")
  public Boolean getSyncTrackingData() {
    return syncTrackingData;
  }
  public void setSyncTrackingData(Boolean syncTrackingData) {
    this.syncTrackingData = syncTrackingData;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("syncInventoryLevelsLastRunTime")
  public Date getSyncInventoryLevelsLastRunTime() {
    return syncInventoryLevelsLastRunTime;
  }
  public void setSyncInventoryLevelsLastRunTime(Date syncInventoryLevelsLastRunTime) {
    this.syncInventoryLevelsLastRunTime = syncInventoryLevelsLastRunTime;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShoppingCartConnection shoppingCartConnection = (ShoppingCartConnection) o;
    return Objects.equals(id, shoppingCartConnection.id) &&
        Objects.equals(createDate, shoppingCartConnection.createDate) &&
        Objects.equals(modifyDate, shoppingCartConnection.modifyDate) &&
        Objects.equals(clientId, shoppingCartConnection.clientId) &&
        Objects.equals(nonce, shoppingCartConnection.nonce) &&
        Objects.equals(lobId, shoppingCartConnection.lobId) &&
        Objects.equals(orderSourceId, shoppingCartConnection.orderSourceId) &&
        Objects.equals(integrationPartnerId, shoppingCartConnection.integrationPartnerId) &&
        Objects.equals(connectionType, shoppingCartConnection.connectionType) &&
        Objects.equals(itemFilterId, shoppingCartConnection.itemFilterId) &&
        Objects.equals(infoplusSKUFieldToMap, shoppingCartConnection.infoplusSKUFieldToMap) &&
        Objects.equals(shoppingCartSKUFieldToMap, shoppingCartConnection.shoppingCartSKUFieldToMap) &&
        Objects.equals(name, shoppingCartConnection.name) &&
        Objects.equals(shoppingCartStoreURL, shoppingCartConnection.shoppingCartStoreURL) &&
        Objects.equals(accessCode, shoppingCartConnection.accessCode) &&
        Objects.equals(accessToken, shoppingCartConnection.accessToken) &&
        Objects.equals(syncOrders, shoppingCartConnection.syncOrders) &&
        Objects.equals(syncInventory, shoppingCartConnection.syncInventory) &&
        Objects.equals(syncTrackingData, shoppingCartConnection.syncTrackingData) &&
        Objects.equals(syncInventoryLevelsLastRunTime, shoppingCartConnection.syncInventoryLevelsLastRunTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, clientId, nonce, lobId, orderSourceId, integrationPartnerId, connectionType, itemFilterId, infoplusSKUFieldToMap, shoppingCartSKUFieldToMap, name, shoppingCartStoreURL, accessCode, accessToken, syncOrders, syncInventory, syncTrackingData, syncInventoryLevelsLastRunTime);
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

