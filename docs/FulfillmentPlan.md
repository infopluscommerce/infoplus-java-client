
# FulfillmentPlan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**modifyDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**warehouseId** | **Integer** |  | 
**lastRunTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**orderSmartFilterId** | **Integer** |  | 
**locationSmartFilterId** | **Integer** |  |  [optional]
**maxOrders** | **Integer** |  |  [optional]
**batchSize** | **Integer** |  |  [optional]
**version** | **String** |  |  [optional]
**isMassDistribution** | **Boolean** |  |  [optional]
**createPickWork** | **Boolean** |  | 
**pickingRule** | **String** |  |  [optional]
**layoutRule** | **String** |  |  [optional]
**pickSortRule** | **String** |  |  [optional]
**createPickList** | **Boolean** |  |  [optional]
**pickListFormat** | **String** |  |  [optional]
**pickListLayout** | **String** |  |  [optional]
**pickListGroup** | **String** |  |  [optional]
**pickListSort** | **String** |  |  [optional]
**createPickSummary** | **Boolean** |  |  [optional]
**pickSummaryFormat** | **String** |  |  [optional]
**pickSummaryLayout** | **String** |  |  [optional]
**pickSummarySort** | **String** |  |  [optional]
**pickScanSchemeId** | **Integer** |  | 
**cartonizeOrders** | **Boolean** |  | 
**autoShipCasebreakCartons** | **Boolean** |  |  [optional]
**autoShipOrders** | **Boolean** |  |  [optional]
**preGenerateParcelLabels** | **Boolean** |  |  [optional]
**createPackingSlip** | **String** |  | 
**overridePackingSlipTemplateId** | **Integer** |  |  [optional]
**createOrderAssemblyGuide** | **Boolean** |  |  [optional]
**createOrderInvoice** | **String** |  | 
**overrideOrderInvoiceTemplateId** | **Integer** |  |  [optional]
**sendToExternalShippingSystem** | **Boolean** |  | 
**externalShippingSystemId** | **Integer** |  |  [optional]
**customFields** | **Map&lt;String, Object&gt;** |  |  [optional]



