
# JobRecipe

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**modifyDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**warehouseId** | **Integer** |  |  [optional]
**lobId** | **Integer** |  | 
**name** | **String** |  | 
**assemblyInstructions** | **String** |  |  [optional]
**inputs** | [**List&lt;JobRecipeInput&gt;**](JobRecipeInput.md) |  |  [optional]
**outputs** | [**List&lt;JobRecipeOutput&gt;**](JobRecipeOutput.md) |  |  [optional]
**steps** | [**List&lt;JobRecipeStep&gt;**](JobRecipeStep.md) |  |  [optional]
**fulfillmentPlanId** | **Integer** |  | 
**layout** | **String** |  | 
**trackAssemblies** | **Boolean** |  | 
**trackSteps** | **Boolean** |  | 
**customFields** | **Map&lt;String, Object&gt;** |  |  [optional]



