
# FulfillmentProcess

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**modifyDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**processNo** | **Integer** |  |  [optional]
**workBatchIdList** | **List&lt;Integer&gt;** |  |  [optional]
**warehouseId** | **Integer** |  | 
**fulfillmentPlanId** | **Integer** |  | 
**pickScanSchemeId** | **Integer** |  | 
**status** | **String** |  | 
**orderSmartFilterId** | **Integer** |  |  [optional]
**locationSmartFilterId** | **Integer** |  |  [optional]
**maxOrders** | **Integer** |  |  [optional]
**batchMaxSize** | **Integer** |  |  [optional]
**batchMinSize** | **Integer** |  |  [optional]
**maxCartons** | **Integer** |  |  [optional]
**version** | **String** |  |  [optional]
**fulfillmentProcessGroup** | **Integer** |  |  [optional]
**isMassDistribution** | **Boolean** |  |  [optional]
**priorityCode** | **Integer** |  |  [optional]
**numberOfOrders** | **Integer** |  |  [optional]
**numberOfLines** | **Integer** |  |  [optional]
**numberOfSKUs** | **Integer** |  |  [optional]
**completedPicks** | **Integer** |  |  [optional]
**totalPicks** | **Integer** |  |  [optional]
**shippedCasebreaks** | **Integer** |  |  [optional]
**totalCasebreaksToShip** | **Integer** |  |  [optional]
**shippedOrders** | **Integer** |  |  [optional]
**totalOrdersToShip** | **Integer** |  |  [optional]
**completedToDo** | **Integer** |  |  [optional]
**totalToDo** | **Integer** |  |  [optional]
**createPickWork** | **Boolean** |  |  [optional]
**pickingRule** | **String** |  |  [optional]
**pickBatchGroupId** | **String** |  |  [optional]
**maxSKUsPerBatch** | **Integer** |  |  [optional]
**layoutRule** | **String** |  |  [optional]
**pickSortRule** | **String** |  |  [optional]
**locationSort** | **String** |  |  [optional]
**firstPickPosition** | **Integer** |  |  [optional]
**pickListFormat** | **String** |  |  [optional]
**pickListLayout** | **String** |  |  [optional]
**pickListGroup** | **String** |  |  [optional]
**pickListSort** | **String** |  |  [optional]
**pickListLocationSort** | **String** |  |  [optional]
**pickSummaryFormat** | **String** |  |  [optional]
**pickSummaryLayout** | **String** |  |  [optional]
**pickSummarySort** | **String** |  |  [optional]
**createPickSummary** | **Boolean** |  |  [optional]
**createPickList** | **Boolean** |  |  [optional]
**preGenerateParcelLabels** | **Boolean** |  |  [optional]
**labelSort** | **String** |  |  [optional]
**shipDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**autoShipCasebreakCartons** | **Boolean** |  |  [optional]
**autoShipOrders** | **Boolean** |  |  [optional]
**cartonizeOrders** | **Boolean** |  |  [optional]
**cartonizationScriptId** | **Integer** |  |  [optional]
**createPackingSlip** | **String** |  | 
**overridePackingSlipTemplateId** | **Integer** |  |  [optional]
**createOrderAssemblyGuide** | **Boolean** |  |  [optional]
**orderAssemblyGuideLayout** | **String** |  |  [optional]
**createOrderInvoice** | **String** |  | 
**overrideOrderInvoiceTemplateId** | **Integer** |  |  [optional]
**createCartonGS1128Labels** | **String** |  |  [optional]
**createLineItemEachGS1128Labels** | **String** |  |  [optional]
**sendToExternalShippingSystem** | **Boolean** |  | 
**externalShippingSystemId** | **Integer** |  |  [optional]
**customFields** | **Map&lt;String, Object&gt;** |  |  [optional]



