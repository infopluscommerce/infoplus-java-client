# java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.infopluscommerce</groupId>
    <artifactId>java-client</artifactId>
    <version>beta</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.infopluscommerce:java-client:beta"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/java-client-beta.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.infopluscommerce.*;
import com.infopluscommerce.auth.*;
import com.infopluscommerce.model.*;
import com.infopluscommerce.api.AisleApi;

import java.io.File;
import java.util.*;

public class AisleApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AisleApi apiInstance = new AisleApi();
        Aisle body = new Aisle(); // Aisle | Aisle to be inserted.
        try {
            Aisle result = apiInstance.addAisle(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AisleApi#addAisle");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://kingsrook.localhost-testsubdomain1.infopluswms.com:8443/infoplus-wms/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AisleApi* | [**addAisle**](docs/AisleApi.md#addAisle) | **POST** /beta/aisle | Create an aisle
*AisleApi* | [**addAisleAudit**](docs/AisleApi.md#addAisleAudit) | **PUT** /beta/aisle/{aisleId}/audit/{aisleAudit} | Add new audit for an aisle
*AisleApi* | [**addAisleTag**](docs/AisleApi.md#addAisleTag) | **PUT** /beta/aisle/{aisleId}/tag/{aisleTag} | Add new tags for an aisle.
*AisleApi* | [**deleteAisle**](docs/AisleApi.md#deleteAisle) | **DELETE** /beta/aisle/{aisleId} | Delete an aisle
*AisleApi* | [**deleteAisleTag**](docs/AisleApi.md#deleteAisleTag) | **DELETE** /beta/aisle/{aisleId}/tag/{aisleTag} | Delete a tag for an aisle.
*AisleApi* | [**getAisleByFilter**](docs/AisleApi.md#getAisleByFilter) | **GET** /beta/aisle/search | Search aisles by filter
*AisleApi* | [**getAisleById**](docs/AisleApi.md#getAisleById) | **GET** /beta/aisle/{aisleId} | Get an aisle by id
*AisleApi* | [**getAisleTags**](docs/AisleApi.md#getAisleTags) | **GET** /beta/aisle/{aisleId}/tag | Get the tags for an aisle.
*AisleApi* | [**getDuplicateAisleById**](docs/AisleApi.md#getDuplicateAisleById) | **GET** /beta/aisle/duplicate/{aisleId} | Get a duplicated an aisle by id
*AisleApi* | [**updateAisle**](docs/AisleApi.md#updateAisle) | **PUT** /beta/aisle | Update an aisle
*AisleApi* | [**updateAisleCustomFields**](docs/AisleApi.md#updateAisleCustomFields) | **PUT** /beta/aisle/customFields | Update an aisle custom fields
*AlertApi* | [**addAlertAudit**](docs/AlertApi.md#addAlertAudit) | **PUT** /beta/alert/{alertId}/audit/{alertAudit} | Add new audit for an alert
*AlertApi* | [**addAlertTag**](docs/AlertApi.md#addAlertTag) | **PUT** /beta/alert/{alertId}/tag/{alertTag} | Add new tags for an alert.
*AlertApi* | [**deleteAlertTag**](docs/AlertApi.md#deleteAlertTag) | **DELETE** /beta/alert/{alertId}/tag/{alertTag} | Delete a tag for an alert.
*AlertApi* | [**getAlertByFilter**](docs/AlertApi.md#getAlertByFilter) | **GET** /beta/alert/search | Search alerts by filter
*AlertApi* | [**getAlertById**](docs/AlertApi.md#getAlertById) | **GET** /beta/alert/{alertId} | Get an alert by id
*AlertApi* | [**getAlertTags**](docs/AlertApi.md#getAlertTags) | **GET** /beta/alert/{alertId}/tag | Get the tags for an alert.
*AlertApi* | [**getDuplicateAlertById**](docs/AlertApi.md#getDuplicateAlertById) | **GET** /beta/alert/duplicate/{alertId} | Get a duplicated an alert by id
*AlertApi* | [**updateAlertCustomFields**](docs/AlertApi.md#updateAlertCustomFields) | **PUT** /beta/alert/customFields | Update an alert custom fields
*AsnApi* | [**addAsn**](docs/AsnApi.md#addAsn) | **POST** /beta/asn | Create an asn
*AsnApi* | [**addAsnAudit**](docs/AsnApi.md#addAsnAudit) | **PUT** /beta/asn/{asnId}/audit/{asnAudit} | Add new audit for an asn
*AsnApi* | [**addAsnTag**](docs/AsnApi.md#addAsnTag) | **PUT** /beta/asn/{asnId}/tag/{asnTag} | Add new tags for an asn.
*AsnApi* | [**deleteAsn**](docs/AsnApi.md#deleteAsn) | **DELETE** /beta/asn/{asnId} | Delete an asn
*AsnApi* | [**deleteAsnTag**](docs/AsnApi.md#deleteAsnTag) | **DELETE** /beta/asn/{asnId}/tag/{asnTag} | Delete a tag for an asn.
*AsnApi* | [**getAsnByFilter**](docs/AsnApi.md#getAsnByFilter) | **GET** /beta/asn/search | Search asns by filter
*AsnApi* | [**getAsnById**](docs/AsnApi.md#getAsnById) | **GET** /beta/asn/{asnId} | Get an asn by id
*AsnApi* | [**getAsnTags**](docs/AsnApi.md#getAsnTags) | **GET** /beta/asn/{asnId}/tag | Get the tags for an asn.
*AsnApi* | [**getDuplicateAsnById**](docs/AsnApi.md#getDuplicateAsnById) | **GET** /beta/asn/duplicate/{asnId} | Get a duplicated an asn by id
*AsnApi* | [**updateAsn**](docs/AsnApi.md#updateAsn) | **PUT** /beta/asn | Update an asn
*AsnApi* | [**updateAsnCustomFields**](docs/AsnApi.md#updateAsnCustomFields) | **PUT** /beta/asn/customFields | Update an asn custom fields
*BillOfLadingApi* | [**addBillOfLading**](docs/BillOfLadingApi.md#addBillOfLading) | **POST** /beta/billOfLading | Create a billOfLading
*BillOfLadingApi* | [**addBillOfLadingAudit**](docs/BillOfLadingApi.md#addBillOfLadingAudit) | **PUT** /beta/billOfLading/{billOfLadingId}/audit/{billOfLadingAudit} | Add new audit for a billOfLading
*BillOfLadingApi* | [**addBillOfLadingTag**](docs/BillOfLadingApi.md#addBillOfLadingTag) | **PUT** /beta/billOfLading/{billOfLadingId}/tag/{billOfLadingTag} | Add new tags for a billOfLading.
*BillOfLadingApi* | [**deleteBillOfLading**](docs/BillOfLadingApi.md#deleteBillOfLading) | **DELETE** /beta/billOfLading/{billOfLadingId} | Delete a billOfLading
*BillOfLadingApi* | [**deleteBillOfLadingTag**](docs/BillOfLadingApi.md#deleteBillOfLadingTag) | **DELETE** /beta/billOfLading/{billOfLadingId}/tag/{billOfLadingTag} | Delete a tag for a billOfLading.
*BillOfLadingApi* | [**getBillOfLadingByFilter**](docs/BillOfLadingApi.md#getBillOfLadingByFilter) | **GET** /beta/billOfLading/search | Search billOfLadings by filter
*BillOfLadingApi* | [**getBillOfLadingById**](docs/BillOfLadingApi.md#getBillOfLadingById) | **GET** /beta/billOfLading/{billOfLadingId} | Get a billOfLading by id
*BillOfLadingApi* | [**getBillOfLadingTags**](docs/BillOfLadingApi.md#getBillOfLadingTags) | **GET** /beta/billOfLading/{billOfLadingId}/tag | Get the tags for a billOfLading.
*BillOfLadingApi* | [**getDuplicateBillOfLadingById**](docs/BillOfLadingApi.md#getDuplicateBillOfLadingById) | **GET** /beta/billOfLading/duplicate/{billOfLadingId} | Get a duplicated a billOfLading by id
*BillOfLadingApi* | [**updateBillOfLading**](docs/BillOfLadingApi.md#updateBillOfLading) | **PUT** /beta/billOfLading | Update a billOfLading
*BillOfLadingApi* | [**updateBillOfLadingCustomFields**](docs/BillOfLadingApi.md#updateBillOfLadingCustomFields) | **PUT** /beta/billOfLading/customFields | Update a billOfLading custom fields
*BillingCodeApi* | [**addBillingCode**](docs/BillingCodeApi.md#addBillingCode) | **POST** /beta/billingCode | Create a billingCode
*BillingCodeApi* | [**addBillingCodeAudit**](docs/BillingCodeApi.md#addBillingCodeAudit) | **PUT** /beta/billingCode/{billingCodeId}/audit/{billingCodeAudit} | Add new audit for a billingCode
*BillingCodeApi* | [**addBillingCodeTag**](docs/BillingCodeApi.md#addBillingCodeTag) | **PUT** /beta/billingCode/{billingCodeId}/tag/{billingCodeTag} | Add new tags for a billingCode.
*BillingCodeApi* | [**deleteBillingCode**](docs/BillingCodeApi.md#deleteBillingCode) | **DELETE** /beta/billingCode/{billingCodeId} | Delete a billingCode
*BillingCodeApi* | [**deleteBillingCodeTag**](docs/BillingCodeApi.md#deleteBillingCodeTag) | **DELETE** /beta/billingCode/{billingCodeId}/tag/{billingCodeTag} | Delete a tag for a billingCode.
*BillingCodeApi* | [**getBillingCodeByFilter**](docs/BillingCodeApi.md#getBillingCodeByFilter) | **GET** /beta/billingCode/search | Search billingCodes by filter
*BillingCodeApi* | [**getBillingCodeById**](docs/BillingCodeApi.md#getBillingCodeById) | **GET** /beta/billingCode/{billingCodeId} | Get a billingCode by id
*BillingCodeApi* | [**getBillingCodeTags**](docs/BillingCodeApi.md#getBillingCodeTags) | **GET** /beta/billingCode/{billingCodeId}/tag | Get the tags for a billingCode.
*BillingCodeApi* | [**getDuplicateBillingCodeById**](docs/BillingCodeApi.md#getDuplicateBillingCodeById) | **GET** /beta/billingCode/duplicate/{billingCodeId} | Get a duplicated a billingCode by id
*BillingCodeApi* | [**updateBillingCode**](docs/BillingCodeApi.md#updateBillingCode) | **PUT** /beta/billingCode | Update a billingCode
*BillingCodeApi* | [**updateBillingCodeCustomFields**](docs/BillingCodeApi.md#updateBillingCodeCustomFields) | **PUT** /beta/billingCode/customFields | Update a billingCode custom fields
*BillingCodeActivityApi* | [**addBillingCodeActivity**](docs/BillingCodeActivityApi.md#addBillingCodeActivity) | **POST** /beta/billingCodeActivity | Create a billingCodeActivity
*BillingCodeActivityApi* | [**addBillingCodeActivityAudit**](docs/BillingCodeActivityApi.md#addBillingCodeActivityAudit) | **PUT** /beta/billingCodeActivity/{billingCodeActivityId}/audit/{billingCodeActivityAudit} | Add new audit for a billingCodeActivity
*BillingCodeActivityApi* | [**addBillingCodeActivityTag**](docs/BillingCodeActivityApi.md#addBillingCodeActivityTag) | **PUT** /beta/billingCodeActivity/{billingCodeActivityId}/tag/{billingCodeActivityTag} | Add new tags for a billingCodeActivity.
*BillingCodeActivityApi* | [**deleteBillingCodeActivity**](docs/BillingCodeActivityApi.md#deleteBillingCodeActivity) | **DELETE** /beta/billingCodeActivity/{billingCodeActivityId} | Delete a billingCodeActivity
*BillingCodeActivityApi* | [**deleteBillingCodeActivityTag**](docs/BillingCodeActivityApi.md#deleteBillingCodeActivityTag) | **DELETE** /beta/billingCodeActivity/{billingCodeActivityId}/tag/{billingCodeActivityTag} | Delete a tag for a billingCodeActivity.
*BillingCodeActivityApi* | [**getBillingCodeActivityByFilter**](docs/BillingCodeActivityApi.md#getBillingCodeActivityByFilter) | **GET** /beta/billingCodeActivity/search | Search billingCodeActivitys by filter
*BillingCodeActivityApi* | [**getBillingCodeActivityById**](docs/BillingCodeActivityApi.md#getBillingCodeActivityById) | **GET** /beta/billingCodeActivity/{billingCodeActivityId} | Get a billingCodeActivity by id
*BillingCodeActivityApi* | [**getBillingCodeActivityTags**](docs/BillingCodeActivityApi.md#getBillingCodeActivityTags) | **GET** /beta/billingCodeActivity/{billingCodeActivityId}/tag | Get the tags for a billingCodeActivity.
*BillingCodeActivityApi* | [**getDuplicateBillingCodeActivityById**](docs/BillingCodeActivityApi.md#getDuplicateBillingCodeActivityById) | **GET** /beta/billingCodeActivity/duplicate/{billingCodeActivityId} | Get a duplicated a billingCodeActivity by id
*BillingCodeActivityApi* | [**updateBillingCodeActivity**](docs/BillingCodeActivityApi.md#updateBillingCodeActivity) | **PUT** /beta/billingCodeActivity | Update a billingCodeActivity
*BillingCodeTypeApi* | [**addBillingCodeType**](docs/BillingCodeTypeApi.md#addBillingCodeType) | **POST** /beta/billingCodeType | Create a billingCodeType
*BillingCodeTypeApi* | [**addBillingCodeTypeAudit**](docs/BillingCodeTypeApi.md#addBillingCodeTypeAudit) | **PUT** /beta/billingCodeType/{billingCodeTypeId}/audit/{billingCodeTypeAudit} | Add new audit for a billingCodeType
*BillingCodeTypeApi* | [**addBillingCodeTypeTag**](docs/BillingCodeTypeApi.md#addBillingCodeTypeTag) | **PUT** /beta/billingCodeType/{billingCodeTypeId}/tag/{billingCodeTypeTag} | Add new tags for a billingCodeType.
*BillingCodeTypeApi* | [**deleteBillingCodeType**](docs/BillingCodeTypeApi.md#deleteBillingCodeType) | **DELETE** /beta/billingCodeType/{billingCodeTypeId} | Delete a billingCodeType
*BillingCodeTypeApi* | [**deleteBillingCodeTypeTag**](docs/BillingCodeTypeApi.md#deleteBillingCodeTypeTag) | **DELETE** /beta/billingCodeType/{billingCodeTypeId}/tag/{billingCodeTypeTag} | Delete a tag for a billingCodeType.
*BillingCodeTypeApi* | [**getBillingCodeTypeByFilter**](docs/BillingCodeTypeApi.md#getBillingCodeTypeByFilter) | **GET** /beta/billingCodeType/search | Search billingCodeTypes by filter
*BillingCodeTypeApi* | [**getBillingCodeTypeById**](docs/BillingCodeTypeApi.md#getBillingCodeTypeById) | **GET** /beta/billingCodeType/{billingCodeTypeId} | Get a billingCodeType by id
*BillingCodeTypeApi* | [**getBillingCodeTypeTags**](docs/BillingCodeTypeApi.md#getBillingCodeTypeTags) | **GET** /beta/billingCodeType/{billingCodeTypeId}/tag | Get the tags for a billingCodeType.
*BillingCodeTypeApi* | [**getDuplicateBillingCodeTypeById**](docs/BillingCodeTypeApi.md#getDuplicateBillingCodeTypeById) | **GET** /beta/billingCodeType/duplicate/{billingCodeTypeId} | Get a duplicated a billingCodeType by id
*BillingCodeTypeApi* | [**updateBillingCodeType**](docs/BillingCodeTypeApi.md#updateBillingCodeType) | **PUT** /beta/billingCodeType | Update a billingCodeType
*BillingCodeTypeApi* | [**updateBillingCodeTypeCustomFields**](docs/BillingCodeTypeApi.md#updateBillingCodeTypeCustomFields) | **PUT** /beta/billingCodeType/customFields | Update a billingCodeType custom fields
*BuildingApi* | [**addBuilding**](docs/BuildingApi.md#addBuilding) | **POST** /beta/building | Create a building
*BuildingApi* | [**addBuildingAudit**](docs/BuildingApi.md#addBuildingAudit) | **PUT** /beta/building/{buildingId}/audit/{buildingAudit} | Add new audit for a building
*BuildingApi* | [**addBuildingTag**](docs/BuildingApi.md#addBuildingTag) | **PUT** /beta/building/{buildingId}/tag/{buildingTag} | Add new tags for a building.
*BuildingApi* | [**deleteBuilding**](docs/BuildingApi.md#deleteBuilding) | **DELETE** /beta/building/{buildingId} | Delete a building
*BuildingApi* | [**deleteBuildingTag**](docs/BuildingApi.md#deleteBuildingTag) | **DELETE** /beta/building/{buildingId}/tag/{buildingTag} | Delete a tag for a building.
*BuildingApi* | [**getBuildingByFilter**](docs/BuildingApi.md#getBuildingByFilter) | **GET** /beta/building/search | Search buildings by filter
*BuildingApi* | [**getBuildingById**](docs/BuildingApi.md#getBuildingById) | **GET** /beta/building/{buildingId} | Get a building by id
*BuildingApi* | [**getBuildingTags**](docs/BuildingApi.md#getBuildingTags) | **GET** /beta/building/{buildingId}/tag | Get the tags for a building.
*BuildingApi* | [**getDuplicateBuildingById**](docs/BuildingApi.md#getDuplicateBuildingById) | **GET** /beta/building/duplicate/{buildingId} | Get a duplicated a building by id
*BuildingApi* | [**updateBuilding**](docs/BuildingApi.md#updateBuilding) | **PUT** /beta/building | Update a building
*BuildingApi* | [**updateBuildingCustomFields**](docs/BuildingApi.md#updateBuildingCustomFields) | **PUT** /beta/building/customFields | Update a building custom fields
*BusinessTransactionApi* | [**addBusinessTransactionAudit**](docs/BusinessTransactionApi.md#addBusinessTransactionAudit) | **PUT** /beta/businessTransaction/{businessTransactionId}/audit/{businessTransactionAudit} | Add new audit for a businessTransaction
*BusinessTransactionApi* | [**addBusinessTransactionTag**](docs/BusinessTransactionApi.md#addBusinessTransactionTag) | **PUT** /beta/businessTransaction/{businessTransactionId}/tag/{businessTransactionTag} | Add new tags for a businessTransaction.
*BusinessTransactionApi* | [**deleteBusinessTransactionTag**](docs/BusinessTransactionApi.md#deleteBusinessTransactionTag) | **DELETE** /beta/businessTransaction/{businessTransactionId}/tag/{businessTransactionTag} | Delete a tag for a businessTransaction.
*BusinessTransactionApi* | [**getBusinessTransactionByFilter**](docs/BusinessTransactionApi.md#getBusinessTransactionByFilter) | **GET** /beta/businessTransaction/search | Search businessTransactions by filter
*BusinessTransactionApi* | [**getBusinessTransactionById**](docs/BusinessTransactionApi.md#getBusinessTransactionById) | **GET** /beta/businessTransaction/{businessTransactionId} | Get a businessTransaction by id
*BusinessTransactionApi* | [**getBusinessTransactionTags**](docs/BusinessTransactionApi.md#getBusinessTransactionTags) | **GET** /beta/businessTransaction/{businessTransactionId}/tag | Get the tags for a businessTransaction.
*BusinessTransactionApi* | [**getDuplicateBusinessTransactionById**](docs/BusinessTransactionApi.md#getDuplicateBusinessTransactionById) | **GET** /beta/businessTransaction/duplicate/{businessTransactionId} | Get a duplicated a businessTransaction by id
*BusinessTransactionApi* | [**updateBusinessTransactionCustomFields**](docs/BusinessTransactionApi.md#updateBusinessTransactionCustomFields) | **PUT** /beta/businessTransaction/customFields | Update a businessTransaction custom fields
*CarrierApi* | [**getCarrierById**](docs/CarrierApi.md#getCarrierById) | **GET** /beta/carrier/{carrierId} | Get a carrier by id
*CarrierApi* | [**getCarrierBySearchText**](docs/CarrierApi.md#getCarrierBySearchText) | **GET** /beta/carrier/search | Search carriers
*CarrierServiceApi* | [**getCarrierServiceById**](docs/CarrierServiceApi.md#getCarrierServiceById) | **GET** /beta/carrierService/{carrierServiceId} | Get a carrierService by id
*CarrierServiceApi* | [**getCarrierServiceBySearchText**](docs/CarrierServiceApi.md#getCarrierServiceBySearchText) | **GET** /beta/carrierService/search | Search carrierServices
*CartApi* | [**addCart**](docs/CartApi.md#addCart) | **POST** /beta/cart | Create a cart
*CartApi* | [**addCartAudit**](docs/CartApi.md#addCartAudit) | **PUT** /beta/cart/{cartId}/audit/{cartAudit} | Add new audit for a cart
*CartApi* | [**addCartTag**](docs/CartApi.md#addCartTag) | **PUT** /beta/cart/{cartId}/tag/{cartTag} | Add new tags for a cart.
*CartApi* | [**deleteCart**](docs/CartApi.md#deleteCart) | **DELETE** /beta/cart/{cartId} | Delete a cart
*CartApi* | [**deleteCartTag**](docs/CartApi.md#deleteCartTag) | **DELETE** /beta/cart/{cartId}/tag/{cartTag} | Delete a tag for a cart.
*CartApi* | [**getCartByFilter**](docs/CartApi.md#getCartByFilter) | **GET** /beta/cart/search | Search carts by filter
*CartApi* | [**getCartById**](docs/CartApi.md#getCartById) | **GET** /beta/cart/{cartId} | Get a cart by id
*CartApi* | [**getCartTags**](docs/CartApi.md#getCartTags) | **GET** /beta/cart/{cartId}/tag | Get the tags for a cart.
*CartApi* | [**getDuplicateCartById**](docs/CartApi.md#getDuplicateCartById) | **GET** /beta/cart/duplicate/{cartId} | Get a duplicated a cart by id
*CartApi* | [**updateCart**](docs/CartApi.md#updateCart) | **PUT** /beta/cart | Update a cart
*CartLocationApi* | [**addCartLocationAudit**](docs/CartLocationApi.md#addCartLocationAudit) | **PUT** /beta/cartLocation/{cartLocationId}/audit/{cartLocationAudit} | Add new audit for a cartLocation
*CartLocationApi* | [**addCartLocationTag**](docs/CartLocationApi.md#addCartLocationTag) | **PUT** /beta/cartLocation/{cartLocationId}/tag/{cartLocationTag} | Add new tags for a cartLocation.
*CartLocationApi* | [**deleteCartLocationTag**](docs/CartLocationApi.md#deleteCartLocationTag) | **DELETE** /beta/cartLocation/{cartLocationId}/tag/{cartLocationTag} | Delete a tag for a cartLocation.
*CartLocationApi* | [**getCartLocationByFilter**](docs/CartLocationApi.md#getCartLocationByFilter) | **GET** /beta/cartLocation/search | Search cartLocations by filter
*CartLocationApi* | [**getCartLocationById**](docs/CartLocationApi.md#getCartLocationById) | **GET** /beta/cartLocation/{cartLocationId} | Get a cartLocation by id
*CartLocationApi* | [**getCartLocationTags**](docs/CartLocationApi.md#getCartLocationTags) | **GET** /beta/cartLocation/{cartLocationId}/tag | Get the tags for a cartLocation.
*CartLocationApi* | [**getDuplicateCartLocationById**](docs/CartLocationApi.md#getDuplicateCartLocationById) | **GET** /beta/cartLocation/duplicate/{cartLocationId} | Get a duplicated a cartLocation by id
*CartonApi* | [**addCarton**](docs/CartonApi.md#addCarton) | **POST** /beta/carton | Create a carton
*CartonApi* | [**addCartonAudit**](docs/CartonApi.md#addCartonAudit) | **PUT** /beta/carton/{cartonId}/audit/{cartonAudit} | Add new audit for a carton
*CartonApi* | [**addCartonTag**](docs/CartonApi.md#addCartonTag) | **PUT** /beta/carton/{cartonId}/tag/{cartonTag} | Add new tags for a carton.
*CartonApi* | [**deleteCarton**](docs/CartonApi.md#deleteCarton) | **DELETE** /beta/carton/{cartonId} | Delete a carton
*CartonApi* | [**deleteCartonTag**](docs/CartonApi.md#deleteCartonTag) | **DELETE** /beta/carton/{cartonId}/tag/{cartonTag} | Delete a tag for a carton.
*CartonApi* | [**getCartonByFilter**](docs/CartonApi.md#getCartonByFilter) | **GET** /beta/carton/search | Search cartons by filter
*CartonApi* | [**getCartonById**](docs/CartonApi.md#getCartonById) | **GET** /beta/carton/{cartonId} | Get a carton by id
*CartonApi* | [**getCartonTags**](docs/CartonApi.md#getCartonTags) | **GET** /beta/carton/{cartonId}/tag | Get the tags for a carton.
*CartonApi* | [**getDuplicateCartonById**](docs/CartonApi.md#getDuplicateCartonById) | **GET** /beta/carton/duplicate/{cartonId} | Get a duplicated a carton by id
*CartonApi* | [**updateCarton**](docs/CartonApi.md#updateCarton) | **PUT** /beta/carton | Update a carton
*CartonApi* | [**updateCartonCustomFields**](docs/CartonApi.md#updateCartonCustomFields) | **PUT** /beta/carton/customFields | Update a carton custom fields
*CartonActivityApi* | [**addCartonActivity**](docs/CartonActivityApi.md#addCartonActivity) | **POST** /beta/cartonActivity | Create a cartonActivity
*CartonActivityApi* | [**addCartonActivityAudit**](docs/CartonActivityApi.md#addCartonActivityAudit) | **PUT** /beta/cartonActivity/{cartonActivityId}/audit/{cartonActivityAudit} | Add new audit for a cartonActivity
*CartonActivityApi* | [**addCartonActivityTag**](docs/CartonActivityApi.md#addCartonActivityTag) | **PUT** /beta/cartonActivity/{cartonActivityId}/tag/{cartonActivityTag} | Add new tags for a cartonActivity.
*CartonActivityApi* | [**deleteCartonActivity**](docs/CartonActivityApi.md#deleteCartonActivity) | **DELETE** /beta/cartonActivity/{cartonActivityId} | Delete a cartonActivity
*CartonActivityApi* | [**deleteCartonActivityTag**](docs/CartonActivityApi.md#deleteCartonActivityTag) | **DELETE** /beta/cartonActivity/{cartonActivityId}/tag/{cartonActivityTag} | Delete a tag for a cartonActivity.
*CartonActivityApi* | [**getCartonActivityByFilter**](docs/CartonActivityApi.md#getCartonActivityByFilter) | **GET** /beta/cartonActivity/search | Search cartonActivitys by filter
*CartonActivityApi* | [**getCartonActivityById**](docs/CartonActivityApi.md#getCartonActivityById) | **GET** /beta/cartonActivity/{cartonActivityId} | Get a cartonActivity by id
*CartonActivityApi* | [**getCartonActivityTags**](docs/CartonActivityApi.md#getCartonActivityTags) | **GET** /beta/cartonActivity/{cartonActivityId}/tag | Get the tags for a cartonActivity.
*CartonActivityApi* | [**getDuplicateCartonActivityById**](docs/CartonActivityApi.md#getDuplicateCartonActivityById) | **GET** /beta/cartonActivity/duplicate/{cartonActivityId} | Get a duplicated a cartonActivity by id
*CartonActivityApi* | [**updateCartonActivity**](docs/CartonActivityApi.md#updateCartonActivity) | **PUT** /beta/cartonActivity | Update a cartonActivity
*CartonContentApi* | [**addCartonContent**](docs/CartonContentApi.md#addCartonContent) | **POST** /beta/cartonContent | Create a cartonContent
*CartonContentApi* | [**addCartonContentAudit**](docs/CartonContentApi.md#addCartonContentAudit) | **PUT** /beta/cartonContent/{cartonContentId}/audit/{cartonContentAudit} | Add new audit for a cartonContent
*CartonContentApi* | [**addCartonContentTag**](docs/CartonContentApi.md#addCartonContentTag) | **PUT** /beta/cartonContent/{cartonContentId}/tag/{cartonContentTag} | Add new tags for a cartonContent.
*CartonContentApi* | [**deleteCartonContent**](docs/CartonContentApi.md#deleteCartonContent) | **DELETE** /beta/cartonContent/{cartonContentId} | Delete a cartonContent
*CartonContentApi* | [**deleteCartonContentTag**](docs/CartonContentApi.md#deleteCartonContentTag) | **DELETE** /beta/cartonContent/{cartonContentId}/tag/{cartonContentTag} | Delete a tag for a cartonContent.
*CartonContentApi* | [**getCartonContentByFilter**](docs/CartonContentApi.md#getCartonContentByFilter) | **GET** /beta/cartonContent/search | Search cartonContents by filter
*CartonContentApi* | [**getCartonContentById**](docs/CartonContentApi.md#getCartonContentById) | **GET** /beta/cartonContent/{cartonContentId} | Get a cartonContent by id
*CartonContentApi* | [**getCartonContentTags**](docs/CartonContentApi.md#getCartonContentTags) | **GET** /beta/cartonContent/{cartonContentId}/tag | Get the tags for a cartonContent.
*CartonContentApi* | [**getDuplicateCartonContentById**](docs/CartonContentApi.md#getDuplicateCartonContentById) | **GET** /beta/cartonContent/duplicate/{cartonContentId} | Get a duplicated a cartonContent by id
*CartonContentApi* | [**updateCartonContent**](docs/CartonContentApi.md#updateCartonContent) | **PUT** /beta/cartonContent | Update a cartonContent
*CartonContentApi* | [**updateCartonContentCustomFields**](docs/CartonContentApi.md#updateCartonContentCustomFields) | **PUT** /beta/cartonContent/customFields | Update a cartonContent custom fields
*CartonTypeApi* | [**addCartonType**](docs/CartonTypeApi.md#addCartonType) | **POST** /beta/cartonType | Create a cartonType
*CartonTypeApi* | [**addCartonTypeAudit**](docs/CartonTypeApi.md#addCartonTypeAudit) | **PUT** /beta/cartonType/{cartonTypeId}/audit/{cartonTypeAudit} | Add new audit for a cartonType
*CartonTypeApi* | [**addCartonTypeTag**](docs/CartonTypeApi.md#addCartonTypeTag) | **PUT** /beta/cartonType/{cartonTypeId}/tag/{cartonTypeTag} | Add new tags for a cartonType.
*CartonTypeApi* | [**deleteCartonType**](docs/CartonTypeApi.md#deleteCartonType) | **DELETE** /beta/cartonType/{cartonTypeId} | Delete a cartonType
*CartonTypeApi* | [**deleteCartonTypeTag**](docs/CartonTypeApi.md#deleteCartonTypeTag) | **DELETE** /beta/cartonType/{cartonTypeId}/tag/{cartonTypeTag} | Delete a tag for a cartonType.
*CartonTypeApi* | [**getCartonTypeByFilter**](docs/CartonTypeApi.md#getCartonTypeByFilter) | **GET** /beta/cartonType/search | Search cartonTypes by filter
*CartonTypeApi* | [**getCartonTypeById**](docs/CartonTypeApi.md#getCartonTypeById) | **GET** /beta/cartonType/{cartonTypeId} | Get a cartonType by id
*CartonTypeApi* | [**getCartonTypeTags**](docs/CartonTypeApi.md#getCartonTypeTags) | **GET** /beta/cartonType/{cartonTypeId}/tag | Get the tags for a cartonType.
*CartonTypeApi* | [**getDuplicateCartonTypeById**](docs/CartonTypeApi.md#getDuplicateCartonTypeById) | **GET** /beta/cartonType/duplicate/{cartonTypeId} | Get a duplicated a cartonType by id
*CartonTypeApi* | [**updateCartonType**](docs/CartonTypeApi.md#updateCartonType) | **PUT** /beta/cartonType | Update a cartonType
*CartonTypeApi* | [**updateCartonTypeCustomFields**](docs/CartonTypeApi.md#updateCartonTypeCustomFields) | **PUT** /beta/cartonType/customFields | Update a cartonType custom fields
*CustomerApi* | [**addCustomer**](docs/CustomerApi.md#addCustomer) | **POST** /beta/customer | Create a customer
*CustomerApi* | [**addCustomerAudit**](docs/CustomerApi.md#addCustomerAudit) | **PUT** /beta/customer/{customerId}/audit/{customerAudit} | Add new audit for a customer
*CustomerApi* | [**addCustomerTag**](docs/CustomerApi.md#addCustomerTag) | **PUT** /beta/customer/{customerId}/tag/{customerTag} | Add new tags for a customer.
*CustomerApi* | [**deleteCustomer**](docs/CustomerApi.md#deleteCustomer) | **DELETE** /beta/customer/{customerId} | Delete a customer
*CustomerApi* | [**deleteCustomerTag**](docs/CustomerApi.md#deleteCustomerTag) | **DELETE** /beta/customer/{customerId}/tag/{customerTag} | Delete a tag for a customer.
*CustomerApi* | [**getByCustomerNo**](docs/CustomerApi.md#getByCustomerNo) | **GET** /beta/customer/getByCustomerNo | Get a customer by Customer No
*CustomerApi* | [**getCustomerByFilter**](docs/CustomerApi.md#getCustomerByFilter) | **GET** /beta/customer/search | Search customers by filter
*CustomerApi* | [**getCustomerById**](docs/CustomerApi.md#getCustomerById) | **GET** /beta/customer/{customerId} | Get a customer by id
*CustomerApi* | [**getCustomerTags**](docs/CustomerApi.md#getCustomerTags) | **GET** /beta/customer/{customerId}/tag | Get the tags for a customer.
*CustomerApi* | [**getDuplicateCustomerById**](docs/CustomerApi.md#getDuplicateCustomerById) | **GET** /beta/customer/duplicate/{customerId} | Get a duplicated a customer by id
*CustomerApi* | [**updateCustomer**](docs/CustomerApi.md#updateCustomer) | **PUT** /beta/customer | Update a customer
*CustomerApi* | [**updateCustomerCustomFields**](docs/CustomerApi.md#updateCustomerCustomFields) | **PUT** /beta/customer/customFields | Update a customer custom fields
*CustomerInvoiceTemplateApi* | [**addCustomerInvoiceTemplate**](docs/CustomerInvoiceTemplateApi.md#addCustomerInvoiceTemplate) | **POST** /beta/customerInvoiceTemplate | Create a customerInvoiceTemplate
*CustomerInvoiceTemplateApi* | [**addCustomerInvoiceTemplateAudit**](docs/CustomerInvoiceTemplateApi.md#addCustomerInvoiceTemplateAudit) | **PUT** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/audit/{customerInvoiceTemplateAudit} | Add new audit for a customerInvoiceTemplate
*CustomerInvoiceTemplateApi* | [**addCustomerInvoiceTemplateTag**](docs/CustomerInvoiceTemplateApi.md#addCustomerInvoiceTemplateTag) | **PUT** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/tag/{customerInvoiceTemplateTag} | Add new tags for a customerInvoiceTemplate.
*CustomerInvoiceTemplateApi* | [**deleteCustomerInvoiceTemplate**](docs/CustomerInvoiceTemplateApi.md#deleteCustomerInvoiceTemplate) | **DELETE** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId} | Delete a customerInvoiceTemplate
*CustomerInvoiceTemplateApi* | [**deleteCustomerInvoiceTemplateTag**](docs/CustomerInvoiceTemplateApi.md#deleteCustomerInvoiceTemplateTag) | **DELETE** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/tag/{customerInvoiceTemplateTag} | Delete a tag for a customerInvoiceTemplate.
*CustomerInvoiceTemplateApi* | [**getCustomerInvoiceTemplateByFilter**](docs/CustomerInvoiceTemplateApi.md#getCustomerInvoiceTemplateByFilter) | **GET** /beta/customerInvoiceTemplate/search | Search customerInvoiceTemplates by filter
*CustomerInvoiceTemplateApi* | [**getCustomerInvoiceTemplateById**](docs/CustomerInvoiceTemplateApi.md#getCustomerInvoiceTemplateById) | **GET** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId} | Get a customerInvoiceTemplate by id
*CustomerInvoiceTemplateApi* | [**getCustomerInvoiceTemplateTags**](docs/CustomerInvoiceTemplateApi.md#getCustomerInvoiceTemplateTags) | **GET** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/tag | Get the tags for a customerInvoiceTemplate.
*CustomerInvoiceTemplateApi* | [**getDuplicateCustomerInvoiceTemplateById**](docs/CustomerInvoiceTemplateApi.md#getDuplicateCustomerInvoiceTemplateById) | **GET** /beta/customerInvoiceTemplate/duplicate/{customerInvoiceTemplateId} | Get a duplicated a customerInvoiceTemplate by id
*CustomerInvoiceTemplateApi* | [**updateCustomerInvoiceTemplate**](docs/CustomerInvoiceTemplateApi.md#updateCustomerInvoiceTemplate) | **PUT** /beta/customerInvoiceTemplate | Update a customerInvoiceTemplate
*CustomerInvoiceTemplateLineApi* | [**addCustomerInvoiceTemplateLineAudit**](docs/CustomerInvoiceTemplateLineApi.md#addCustomerInvoiceTemplateLineAudit) | **PUT** /beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/audit/{customerInvoiceTemplateLineAudit} | Add new audit for a customerInvoiceTemplateLine
*CustomerInvoiceTemplateLineApi* | [**addCustomerInvoiceTemplateLineTag**](docs/CustomerInvoiceTemplateLineApi.md#addCustomerInvoiceTemplateLineTag) | **PUT** /beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/tag/{customerInvoiceTemplateLineTag} | Add new tags for a customerInvoiceTemplateLine.
*CustomerInvoiceTemplateLineApi* | [**deleteCustomerInvoiceTemplateLine**](docs/CustomerInvoiceTemplateLineApi.md#deleteCustomerInvoiceTemplateLine) | **DELETE** /beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId} | Delete a customerInvoiceTemplateLine
*CustomerInvoiceTemplateLineApi* | [**deleteCustomerInvoiceTemplateLineTag**](docs/CustomerInvoiceTemplateLineApi.md#deleteCustomerInvoiceTemplateLineTag) | **DELETE** /beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/tag/{customerInvoiceTemplateLineTag} | Delete a tag for a customerInvoiceTemplateLine.
*CustomerInvoiceTemplateLineApi* | [**getCustomerInvoiceTemplateLineByFilter**](docs/CustomerInvoiceTemplateLineApi.md#getCustomerInvoiceTemplateLineByFilter) | **GET** /beta/customerInvoiceTemplateLine/search | Search customerInvoiceTemplateLines by filter
*CustomerInvoiceTemplateLineApi* | [**getCustomerInvoiceTemplateLineById**](docs/CustomerInvoiceTemplateLineApi.md#getCustomerInvoiceTemplateLineById) | **GET** /beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId} | Get a customerInvoiceTemplateLine by id
*CustomerInvoiceTemplateLineApi* | [**getCustomerInvoiceTemplateLineTags**](docs/CustomerInvoiceTemplateLineApi.md#getCustomerInvoiceTemplateLineTags) | **GET** /beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/tag | Get the tags for a customerInvoiceTemplateLine.
*CustomerInvoiceTemplateLineApi* | [**getDuplicateCustomerInvoiceTemplateLineById**](docs/CustomerInvoiceTemplateLineApi.md#getDuplicateCustomerInvoiceTemplateLineById) | **GET** /beta/customerInvoiceTemplateLine/duplicate/{customerInvoiceTemplateLineId} | Get a duplicated a customerInvoiceTemplateLine by id
*CustomerInvoiceTemplateLineApi* | [**updateCustomerInvoiceTemplateLine**](docs/CustomerInvoiceTemplateLineApi.md#updateCustomerInvoiceTemplateLine) | **PUT** /beta/customerInvoiceTemplateLine | Update a customerInvoiceTemplateLine
*EDiDocumentTypeApi* | [**getEDIDocumentTypeById**](docs/EDiDocumentTypeApi.md#getEDIDocumentTypeById) | **GET** /beta/eDIDocumentType/{eDIDocumentTypeId} | Get an eDIDocumentType by id
*EDiDocumentTypeApi* | [**getEDIDocumentTypeBySearchText**](docs/EDiDocumentTypeApi.md#getEDIDocumentTypeBySearchText) | **GET** /beta/eDIDocumentType/search | Search eDIDocumentTypes
*EmailTemplateApi* | [**addEmailTemplate**](docs/EmailTemplateApi.md#addEmailTemplate) | **POST** /beta/emailTemplate | Create an emailTemplate
*EmailTemplateApi* | [**addEmailTemplateAudit**](docs/EmailTemplateApi.md#addEmailTemplateAudit) | **PUT** /beta/emailTemplate/{emailTemplateId}/audit/{emailTemplateAudit} | Add new audit for an emailTemplate
*EmailTemplateApi* | [**addEmailTemplateTag**](docs/EmailTemplateApi.md#addEmailTemplateTag) | **PUT** /beta/emailTemplate/{emailTemplateId}/tag/{emailTemplateTag} | Add new tags for an emailTemplate.
*EmailTemplateApi* | [**deleteEmailTemplate**](docs/EmailTemplateApi.md#deleteEmailTemplate) | **DELETE** /beta/emailTemplate/{emailTemplateId} | Delete an emailTemplate
*EmailTemplateApi* | [**deleteEmailTemplateTag**](docs/EmailTemplateApi.md#deleteEmailTemplateTag) | **DELETE** /beta/emailTemplate/{emailTemplateId}/tag/{emailTemplateTag} | Delete a tag for an emailTemplate.
*EmailTemplateApi* | [**getDuplicateEmailTemplateById**](docs/EmailTemplateApi.md#getDuplicateEmailTemplateById) | **GET** /beta/emailTemplate/duplicate/{emailTemplateId} | Get a duplicated an emailTemplate by id
*EmailTemplateApi* | [**getEmailTemplateByFilter**](docs/EmailTemplateApi.md#getEmailTemplateByFilter) | **GET** /beta/emailTemplate/search | Search emailTemplates by filter
*EmailTemplateApi* | [**getEmailTemplateById**](docs/EmailTemplateApi.md#getEmailTemplateById) | **GET** /beta/emailTemplate/{emailTemplateId} | Get an emailTemplate by id
*EmailTemplateApi* | [**getEmailTemplateTags**](docs/EmailTemplateApi.md#getEmailTemplateTags) | **GET** /beta/emailTemplate/{emailTemplateId}/tag | Get the tags for an emailTemplate.
*EmailTemplateApi* | [**updateEmailTemplate**](docs/EmailTemplateApi.md#updateEmailTemplate) | **PUT** /beta/emailTemplate | Update an emailTemplate
*EmailTemplateApi* | [**updateEmailTemplateCustomFields**](docs/EmailTemplateApi.md#updateEmailTemplateCustomFields) | **PUT** /beta/emailTemplate/customFields | Update an emailTemplate custom fields
*ExternalShipmentApi* | [**addExternalShipment**](docs/ExternalShipmentApi.md#addExternalShipment) | **POST** /beta/externalShipment | Create an externalShipment
*ExternalShipmentApi* | [**addExternalShipmentAudit**](docs/ExternalShipmentApi.md#addExternalShipmentAudit) | **PUT** /beta/externalShipment/{externalShipmentId}/audit/{externalShipmentAudit} | Add new audit for an externalShipment
*ExternalShipmentApi* | [**addExternalShipmentTag**](docs/ExternalShipmentApi.md#addExternalShipmentTag) | **PUT** /beta/externalShipment/{externalShipmentId}/tag/{externalShipmentTag} | Add new tags for an externalShipment.
*ExternalShipmentApi* | [**deleteExternalShipment**](docs/ExternalShipmentApi.md#deleteExternalShipment) | **DELETE** /beta/externalShipment/{externalShipmentId} | Delete an externalShipment
*ExternalShipmentApi* | [**deleteExternalShipmentTag**](docs/ExternalShipmentApi.md#deleteExternalShipmentTag) | **DELETE** /beta/externalShipment/{externalShipmentId}/tag/{externalShipmentTag} | Delete a tag for an externalShipment.
*ExternalShipmentApi* | [**getDuplicateExternalShipmentById**](docs/ExternalShipmentApi.md#getDuplicateExternalShipmentById) | **GET** /beta/externalShipment/duplicate/{externalShipmentId} | Get a duplicated an externalShipment by id
*ExternalShipmentApi* | [**getExternalShipmentByFilter**](docs/ExternalShipmentApi.md#getExternalShipmentByFilter) | **GET** /beta/externalShipment/search | Search externalShipments by filter
*ExternalShipmentApi* | [**getExternalShipmentById**](docs/ExternalShipmentApi.md#getExternalShipmentById) | **GET** /beta/externalShipment/{externalShipmentId} | Get an externalShipment by id
*ExternalShipmentApi* | [**getExternalShipmentTags**](docs/ExternalShipmentApi.md#getExternalShipmentTags) | **GET** /beta/externalShipment/{externalShipmentId}/tag | Get the tags for an externalShipment.
*ExternalShipmentApi* | [**updateExternalShipment**](docs/ExternalShipmentApi.md#updateExternalShipment) | **PUT** /beta/externalShipment | Update an externalShipment
*ExternalShipmentApi* | [**updateExternalShipmentCustomFields**](docs/ExternalShipmentApi.md#updateExternalShipmentCustomFields) | **PUT** /beta/externalShipment/customFields | Update an externalShipment custom fields
*ExternalShippingSystemApi* | [**addExternalShippingSystem**](docs/ExternalShippingSystemApi.md#addExternalShippingSystem) | **POST** /beta/externalShippingSystem | Create an externalShippingSystem
*ExternalShippingSystemApi* | [**addExternalShippingSystemAudit**](docs/ExternalShippingSystemApi.md#addExternalShippingSystemAudit) | **PUT** /beta/externalShippingSystem/{externalShippingSystemId}/audit/{externalShippingSystemAudit} | Add new audit for an externalShippingSystem
*ExternalShippingSystemApi* | [**addExternalShippingSystemTag**](docs/ExternalShippingSystemApi.md#addExternalShippingSystemTag) | **PUT** /beta/externalShippingSystem/{externalShippingSystemId}/tag/{externalShippingSystemTag} | Add new tags for an externalShippingSystem.
*ExternalShippingSystemApi* | [**deleteExternalShippingSystem**](docs/ExternalShippingSystemApi.md#deleteExternalShippingSystem) | **DELETE** /beta/externalShippingSystem/{externalShippingSystemId} | Delete an externalShippingSystem
*ExternalShippingSystemApi* | [**deleteExternalShippingSystemTag**](docs/ExternalShippingSystemApi.md#deleteExternalShippingSystemTag) | **DELETE** /beta/externalShippingSystem/{externalShippingSystemId}/tag/{externalShippingSystemTag} | Delete a tag for an externalShippingSystem.
*ExternalShippingSystemApi* | [**getDuplicateExternalShippingSystemById**](docs/ExternalShippingSystemApi.md#getDuplicateExternalShippingSystemById) | **GET** /beta/externalShippingSystem/duplicate/{externalShippingSystemId} | Get a duplicated an externalShippingSystem by id
*ExternalShippingSystemApi* | [**getExternalShippingSystemByFilter**](docs/ExternalShippingSystemApi.md#getExternalShippingSystemByFilter) | **GET** /beta/externalShippingSystem/search | Search externalShippingSystems by filter
*ExternalShippingSystemApi* | [**getExternalShippingSystemById**](docs/ExternalShippingSystemApi.md#getExternalShippingSystemById) | **GET** /beta/externalShippingSystem/{externalShippingSystemId} | Get an externalShippingSystem by id
*ExternalShippingSystemApi* | [**getExternalShippingSystemTags**](docs/ExternalShippingSystemApi.md#getExternalShippingSystemTags) | **GET** /beta/externalShippingSystem/{externalShippingSystemId}/tag | Get the tags for an externalShippingSystem.
*ExternalShippingSystemApi* | [**updateExternalShippingSystem**](docs/ExternalShippingSystemApi.md#updateExternalShippingSystem) | **PUT** /beta/externalShippingSystem | Update an externalShippingSystem
*ExternalShippingSystemApi* | [**updateExternalShippingSystemCustomFields**](docs/ExternalShippingSystemApi.md#updateExternalShippingSystemCustomFields) | **PUT** /beta/externalShippingSystem/customFields | Update an externalShippingSystem custom fields
*FulfillmentPlanApi* | [**addFulfillmentPlan**](docs/FulfillmentPlanApi.md#addFulfillmentPlan) | **POST** /beta/fulfillmentPlan | Create a fulfillmentPlan
*FulfillmentPlanApi* | [**addFulfillmentPlanAudit**](docs/FulfillmentPlanApi.md#addFulfillmentPlanAudit) | **PUT** /beta/fulfillmentPlan/{fulfillmentPlanId}/audit/{fulfillmentPlanAudit} | Add new audit for a fulfillmentPlan
*FulfillmentPlanApi* | [**addFulfillmentPlanTag**](docs/FulfillmentPlanApi.md#addFulfillmentPlanTag) | **PUT** /beta/fulfillmentPlan/{fulfillmentPlanId}/tag/{fulfillmentPlanTag} | Add new tags for a fulfillmentPlan.
*FulfillmentPlanApi* | [**deleteFulfillmentPlan**](docs/FulfillmentPlanApi.md#deleteFulfillmentPlan) | **DELETE** /beta/fulfillmentPlan/{fulfillmentPlanId} | Delete a fulfillmentPlan
*FulfillmentPlanApi* | [**deleteFulfillmentPlanTag**](docs/FulfillmentPlanApi.md#deleteFulfillmentPlanTag) | **DELETE** /beta/fulfillmentPlan/{fulfillmentPlanId}/tag/{fulfillmentPlanTag} | Delete a tag for a fulfillmentPlan.
*FulfillmentPlanApi* | [**getDuplicateFulfillmentPlanById**](docs/FulfillmentPlanApi.md#getDuplicateFulfillmentPlanById) | **GET** /beta/fulfillmentPlan/duplicate/{fulfillmentPlanId} | Get a duplicated a fulfillmentPlan by id
*FulfillmentPlanApi* | [**getFulfillmentPlanByFilter**](docs/FulfillmentPlanApi.md#getFulfillmentPlanByFilter) | **GET** /beta/fulfillmentPlan/search | Search fulfillmentPlans by filter
*FulfillmentPlanApi* | [**getFulfillmentPlanById**](docs/FulfillmentPlanApi.md#getFulfillmentPlanById) | **GET** /beta/fulfillmentPlan/{fulfillmentPlanId} | Get a fulfillmentPlan by id
*FulfillmentPlanApi* | [**getFulfillmentPlanTags**](docs/FulfillmentPlanApi.md#getFulfillmentPlanTags) | **GET** /beta/fulfillmentPlan/{fulfillmentPlanId}/tag | Get the tags for a fulfillmentPlan.
*FulfillmentPlanApi* | [**updateFulfillmentPlan**](docs/FulfillmentPlanApi.md#updateFulfillmentPlan) | **PUT** /beta/fulfillmentPlan | Update a fulfillmentPlan
*FulfillmentPlanApi* | [**updateFulfillmentPlanCustomFields**](docs/FulfillmentPlanApi.md#updateFulfillmentPlanCustomFields) | **PUT** /beta/fulfillmentPlan/customFields | Update a fulfillmentPlan custom fields
*FulfillmentProcessApi* | [**addFulfillmentProcessAudit**](docs/FulfillmentProcessApi.md#addFulfillmentProcessAudit) | **PUT** /beta/fulfillmentProcess/{fulfillmentProcessId}/audit/{fulfillmentProcessAudit} | Add new audit for a fulfillmentProcess
*FulfillmentProcessApi* | [**addFulfillmentProcessTag**](docs/FulfillmentProcessApi.md#addFulfillmentProcessTag) | **PUT** /beta/fulfillmentProcess/{fulfillmentProcessId}/tag/{fulfillmentProcessTag} | Add new tags for a fulfillmentProcess.
*FulfillmentProcessApi* | [**deleteFulfillmentProcessTag**](docs/FulfillmentProcessApi.md#deleteFulfillmentProcessTag) | **DELETE** /beta/fulfillmentProcess/{fulfillmentProcessId}/tag/{fulfillmentProcessTag} | Delete a tag for a fulfillmentProcess.
*FulfillmentProcessApi* | [**getDuplicateFulfillmentProcessById**](docs/FulfillmentProcessApi.md#getDuplicateFulfillmentProcessById) | **GET** /beta/fulfillmentProcess/duplicate/{fulfillmentProcessId} | Get a duplicated a fulfillmentProcess by id
*FulfillmentProcessApi* | [**getFulfillmentProcessByFilter**](docs/FulfillmentProcessApi.md#getFulfillmentProcessByFilter) | **GET** /beta/fulfillmentProcess/search | Search fulfillmentProcesses by filter
*FulfillmentProcessApi* | [**getFulfillmentProcessById**](docs/FulfillmentProcessApi.md#getFulfillmentProcessById) | **GET** /beta/fulfillmentProcess/{fulfillmentProcessId} | Get a fulfillmentProcess by id
*FulfillmentProcessApi* | [**getFulfillmentProcessTags**](docs/FulfillmentProcessApi.md#getFulfillmentProcessTags) | **GET** /beta/fulfillmentProcess/{fulfillmentProcessId}/tag | Get the tags for a fulfillmentProcess.
*FulfillmentProcessApi* | [**updateFulfillmentProcessCustomFields**](docs/FulfillmentProcessApi.md#updateFulfillmentProcessCustomFields) | **PUT** /beta/fulfillmentProcess/customFields | Update a fulfillmentProcess custom fields
*FulfillmentProcessLogApi* | [**addFulfillmentProcessLogAudit**](docs/FulfillmentProcessLogApi.md#addFulfillmentProcessLogAudit) | **PUT** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId}/audit/{fulfillmentProcessLogAudit} | Add new audit for a fulfillmentProcessLog
*FulfillmentProcessLogApi* | [**addFulfillmentProcessLogTag**](docs/FulfillmentProcessLogApi.md#addFulfillmentProcessLogTag) | **PUT** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId}/tag/{fulfillmentProcessLogTag} | Add new tags for a fulfillmentProcessLog.
*FulfillmentProcessLogApi* | [**deleteFulfillmentProcessLogTag**](docs/FulfillmentProcessLogApi.md#deleteFulfillmentProcessLogTag) | **DELETE** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId}/tag/{fulfillmentProcessLogTag} | Delete a tag for a fulfillmentProcessLog.
*FulfillmentProcessLogApi* | [**getDuplicateFulfillmentProcessLogById**](docs/FulfillmentProcessLogApi.md#getDuplicateFulfillmentProcessLogById) | **GET** /beta/fulfillmentProcessLog/duplicate/{fulfillmentProcessLogId} | Get a duplicated a fulfillmentProcessLog by id
*FulfillmentProcessLogApi* | [**getFulfillmentProcessLogByFilter**](docs/FulfillmentProcessLogApi.md#getFulfillmentProcessLogByFilter) | **GET** /beta/fulfillmentProcessLog/search | Search fulfillmentProcessLogs by filter
*FulfillmentProcessLogApi* | [**getFulfillmentProcessLogById**](docs/FulfillmentProcessLogApi.md#getFulfillmentProcessLogById) | **GET** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId} | Get a fulfillmentProcessLog by id
*FulfillmentProcessLogApi* | [**getFulfillmentProcessLogTags**](docs/FulfillmentProcessLogApi.md#getFulfillmentProcessLogTags) | **GET** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId}/tag | Get the tags for a fulfillmentProcessLog.
*IntegrationPartnerApi* | [**getIntegrationPartnerById**](docs/IntegrationPartnerApi.md#getIntegrationPartnerById) | **GET** /beta/integrationPartner/{integrationPartnerId} | Get an integrationPartner by id
*IntegrationPartnerApi* | [**getIntegrationPartnerBySearchText**](docs/IntegrationPartnerApi.md#getIntegrationPartnerBySearchText) | **GET** /beta/integrationPartner/search | Search integrationPartners
*InventoryAdjustmentApi* | [**addInventoryAdjustmentAudit**](docs/InventoryAdjustmentApi.md#addInventoryAdjustmentAudit) | **PUT** /beta/inventoryAdjustment/{inventoryAdjustmentId}/audit/{inventoryAdjustmentAudit} | Add new audit for an inventoryAdjustment
*InventoryAdjustmentApi* | [**addInventoryAdjustmentTag**](docs/InventoryAdjustmentApi.md#addInventoryAdjustmentTag) | **PUT** /beta/inventoryAdjustment/{inventoryAdjustmentId}/tag/{inventoryAdjustmentTag} | Add new tags for an inventoryAdjustment.
*InventoryAdjustmentApi* | [**deleteInventoryAdjustmentTag**](docs/InventoryAdjustmentApi.md#deleteInventoryAdjustmentTag) | **DELETE** /beta/inventoryAdjustment/{inventoryAdjustmentId}/tag/{inventoryAdjustmentTag} | Delete a tag for an inventoryAdjustment.
*InventoryAdjustmentApi* | [**getDuplicateInventoryAdjustmentById**](docs/InventoryAdjustmentApi.md#getDuplicateInventoryAdjustmentById) | **GET** /beta/inventoryAdjustment/duplicate/{inventoryAdjustmentId} | Get a duplicated an inventoryAdjustment by id
*InventoryAdjustmentApi* | [**getInventoryAdjustmentByFilter**](docs/InventoryAdjustmentApi.md#getInventoryAdjustmentByFilter) | **GET** /beta/inventoryAdjustment/search | Search inventoryAdjustments by filter
*InventoryAdjustmentApi* | [**getInventoryAdjustmentById**](docs/InventoryAdjustmentApi.md#getInventoryAdjustmentById) | **GET** /beta/inventoryAdjustment/{inventoryAdjustmentId} | Get an inventoryAdjustment by id
*InventoryAdjustmentApi* | [**getInventoryAdjustmentTags**](docs/InventoryAdjustmentApi.md#getInventoryAdjustmentTags) | **GET** /beta/inventoryAdjustment/{inventoryAdjustmentId}/tag | Get the tags for an inventoryAdjustment.
*InventoryAdjustmentApi* | [**updateInventoryAdjustmentCustomFields**](docs/InventoryAdjustmentApi.md#updateInventoryAdjustmentCustomFields) | **PUT** /beta/inventoryAdjustment/customFields | Update an inventoryAdjustment custom fields
*InventoryDetailApi* | [**addInventoryDetailAudit**](docs/InventoryDetailApi.md#addInventoryDetailAudit) | **PUT** /beta/inventoryDetail/{inventoryDetailId}/audit/{inventoryDetailAudit} | Add new audit for an inventoryDetail
*InventoryDetailApi* | [**addInventoryDetailTag**](docs/InventoryDetailApi.md#addInventoryDetailTag) | **PUT** /beta/inventoryDetail/{inventoryDetailId}/tag/{inventoryDetailTag} | Add new tags for an inventoryDetail.
*InventoryDetailApi* | [**deleteInventoryDetailTag**](docs/InventoryDetailApi.md#deleteInventoryDetailTag) | **DELETE** /beta/inventoryDetail/{inventoryDetailId}/tag/{inventoryDetailTag} | Delete a tag for an inventoryDetail.
*InventoryDetailApi* | [**getDuplicateInventoryDetailById**](docs/InventoryDetailApi.md#getDuplicateInventoryDetailById) | **GET** /beta/inventoryDetail/duplicate/{inventoryDetailId} | Get a duplicated an inventoryDetail by id
*InventoryDetailApi* | [**getInventoryDetailByFilter**](docs/InventoryDetailApi.md#getInventoryDetailByFilter) | **GET** /beta/inventoryDetail/search | Search inventoryDetails by filter
*InventoryDetailApi* | [**getInventoryDetailById**](docs/InventoryDetailApi.md#getInventoryDetailById) | **GET** /beta/inventoryDetail/{inventoryDetailId} | Get an inventoryDetail by id
*InventoryDetailApi* | [**getInventoryDetailTags**](docs/InventoryDetailApi.md#getInventoryDetailTags) | **GET** /beta/inventoryDetail/{inventoryDetailId}/tag | Get the tags for an inventoryDetail.
*InventoryDetailApi* | [**updateInventoryDetailCustomFields**](docs/InventoryDetailApi.md#updateInventoryDetailCustomFields) | **PUT** /beta/inventoryDetail/customFields | Update an inventoryDetail custom fields
*InventorySnapshotApi* | [**addInventorySnapshotAudit**](docs/InventorySnapshotApi.md#addInventorySnapshotAudit) | **PUT** /beta/inventorySnapshot/{inventorySnapshotId}/audit/{inventorySnapshotAudit} | Add new audit for an inventorySnapshot
*InventorySnapshotApi* | [**addInventorySnapshotTag**](docs/InventorySnapshotApi.md#addInventorySnapshotTag) | **PUT** /beta/inventorySnapshot/{inventorySnapshotId}/tag/{inventorySnapshotTag} | Add new tags for an inventorySnapshot.
*InventorySnapshotApi* | [**deleteInventorySnapshotTag**](docs/InventorySnapshotApi.md#deleteInventorySnapshotTag) | **DELETE** /beta/inventorySnapshot/{inventorySnapshotId}/tag/{inventorySnapshotTag} | Delete a tag for an inventorySnapshot.
*InventorySnapshotApi* | [**getDuplicateInventorySnapshotById**](docs/InventorySnapshotApi.md#getDuplicateInventorySnapshotById) | **GET** /beta/inventorySnapshot/duplicate/{inventorySnapshotId} | Get a duplicated an inventorySnapshot by id
*InventorySnapshotApi* | [**getInventorySnapshotByFilter**](docs/InventorySnapshotApi.md#getInventorySnapshotByFilter) | **GET** /beta/inventorySnapshot/search | Search inventorySnapshots by filter
*InventorySnapshotApi* | [**getInventorySnapshotById**](docs/InventorySnapshotApi.md#getInventorySnapshotById) | **GET** /beta/inventorySnapshot/{inventorySnapshotId} | Get an inventorySnapshot by id
*InventorySnapshotApi* | [**getInventorySnapshotTags**](docs/InventorySnapshotApi.md#getInventorySnapshotTags) | **GET** /beta/inventorySnapshot/{inventorySnapshotId}/tag | Get the tags for an inventorySnapshot.
*InventoryStorageActivityApi* | [**addInventoryStorageActivity**](docs/InventoryStorageActivityApi.md#addInventoryStorageActivity) | **POST** /beta/inventoryStorageActivity | Create an inventoryStorageActivity
*InventoryStorageActivityApi* | [**addInventoryStorageActivityAudit**](docs/InventoryStorageActivityApi.md#addInventoryStorageActivityAudit) | **PUT** /beta/inventoryStorageActivity/{inventoryStorageActivityId}/audit/{inventoryStorageActivityAudit} | Add new audit for an inventoryStorageActivity
*InventoryStorageActivityApi* | [**addInventoryStorageActivityTag**](docs/InventoryStorageActivityApi.md#addInventoryStorageActivityTag) | **PUT** /beta/inventoryStorageActivity/{inventoryStorageActivityId}/tag/{inventoryStorageActivityTag} | Add new tags for an inventoryStorageActivity.
*InventoryStorageActivityApi* | [**deleteInventoryStorageActivity**](docs/InventoryStorageActivityApi.md#deleteInventoryStorageActivity) | **DELETE** /beta/inventoryStorageActivity/{inventoryStorageActivityId} | Delete an inventoryStorageActivity
*InventoryStorageActivityApi* | [**deleteInventoryStorageActivityTag**](docs/InventoryStorageActivityApi.md#deleteInventoryStorageActivityTag) | **DELETE** /beta/inventoryStorageActivity/{inventoryStorageActivityId}/tag/{inventoryStorageActivityTag} | Delete a tag for an inventoryStorageActivity.
*InventoryStorageActivityApi* | [**getDuplicateInventoryStorageActivityById**](docs/InventoryStorageActivityApi.md#getDuplicateInventoryStorageActivityById) | **GET** /beta/inventoryStorageActivity/duplicate/{inventoryStorageActivityId} | Get a duplicated an inventoryStorageActivity by id
*InventoryStorageActivityApi* | [**getInventoryStorageActivityByFilter**](docs/InventoryStorageActivityApi.md#getInventoryStorageActivityByFilter) | **GET** /beta/inventoryStorageActivity/search | Search inventoryStorageActivitys by filter
*InventoryStorageActivityApi* | [**getInventoryStorageActivityById**](docs/InventoryStorageActivityApi.md#getInventoryStorageActivityById) | **GET** /beta/inventoryStorageActivity/{inventoryStorageActivityId} | Get an inventoryStorageActivity by id
*InventoryStorageActivityApi* | [**getInventoryStorageActivityTags**](docs/InventoryStorageActivityApi.md#getInventoryStorageActivityTags) | **GET** /beta/inventoryStorageActivity/{inventoryStorageActivityId}/tag | Get the tags for an inventoryStorageActivity.
*InventoryStorageActivityApi* | [**updateInventoryStorageActivity**](docs/InventoryStorageActivityApi.md#updateInventoryStorageActivity) | **PUT** /beta/inventoryStorageActivity | Update an inventoryStorageActivity
*InvoiceWorksheetApi* | [**addInvoiceWorksheet**](docs/InvoiceWorksheetApi.md#addInvoiceWorksheet) | **POST** /beta/invoiceWorksheet | Create an invoiceWorksheet
*InvoiceWorksheetApi* | [**addInvoiceWorksheetAudit**](docs/InvoiceWorksheetApi.md#addInvoiceWorksheetAudit) | **PUT** /beta/invoiceWorksheet/{invoiceWorksheetId}/audit/{invoiceWorksheetAudit} | Add new audit for an invoiceWorksheet
*InvoiceWorksheetApi* | [**addInvoiceWorksheetTag**](docs/InvoiceWorksheetApi.md#addInvoiceWorksheetTag) | **PUT** /beta/invoiceWorksheet/{invoiceWorksheetId}/tag/{invoiceWorksheetTag} | Add new tags for an invoiceWorksheet.
*InvoiceWorksheetApi* | [**deleteInvoiceWorksheet**](docs/InvoiceWorksheetApi.md#deleteInvoiceWorksheet) | **DELETE** /beta/invoiceWorksheet/{invoiceWorksheetId} | Delete an invoiceWorksheet
*InvoiceWorksheetApi* | [**deleteInvoiceWorksheetTag**](docs/InvoiceWorksheetApi.md#deleteInvoiceWorksheetTag) | **DELETE** /beta/invoiceWorksheet/{invoiceWorksheetId}/tag/{invoiceWorksheetTag} | Delete a tag for an invoiceWorksheet.
*InvoiceWorksheetApi* | [**getDuplicateInvoiceWorksheetById**](docs/InvoiceWorksheetApi.md#getDuplicateInvoiceWorksheetById) | **GET** /beta/invoiceWorksheet/duplicate/{invoiceWorksheetId} | Get a duplicated an invoiceWorksheet by id
*InvoiceWorksheetApi* | [**getInvoiceWorksheetByFilter**](docs/InvoiceWorksheetApi.md#getInvoiceWorksheetByFilter) | **GET** /beta/invoiceWorksheet/search | Search invoiceWorksheets by filter
*InvoiceWorksheetApi* | [**getInvoiceWorksheetById**](docs/InvoiceWorksheetApi.md#getInvoiceWorksheetById) | **GET** /beta/invoiceWorksheet/{invoiceWorksheetId} | Get an invoiceWorksheet by id
*InvoiceWorksheetApi* | [**getInvoiceWorksheetTags**](docs/InvoiceWorksheetApi.md#getInvoiceWorksheetTags) | **GET** /beta/invoiceWorksheet/{invoiceWorksheetId}/tag | Get the tags for an invoiceWorksheet.
*InvoiceWorksheetApi* | [**updateInvoiceWorksheet**](docs/InvoiceWorksheetApi.md#updateInvoiceWorksheet) | **PUT** /beta/invoiceWorksheet | Update an invoiceWorksheet
*InvoiceWorksheetLineApi* | [**addInvoiceWorksheetLine**](docs/InvoiceWorksheetLineApi.md#addInvoiceWorksheetLine) | **POST** /beta/invoiceWorksheetLine | Create an invoiceWorksheetLine
*InvoiceWorksheetLineApi* | [**addInvoiceWorksheetLineAudit**](docs/InvoiceWorksheetLineApi.md#addInvoiceWorksheetLineAudit) | **PUT** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/audit/{invoiceWorksheetLineAudit} | Add new audit for an invoiceWorksheetLine
*InvoiceWorksheetLineApi* | [**addInvoiceWorksheetLineTag**](docs/InvoiceWorksheetLineApi.md#addInvoiceWorksheetLineTag) | **PUT** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/tag/{invoiceWorksheetLineTag} | Add new tags for an invoiceWorksheetLine.
*InvoiceWorksheetLineApi* | [**deleteInvoiceWorksheetLine**](docs/InvoiceWorksheetLineApi.md#deleteInvoiceWorksheetLine) | **DELETE** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId} | Delete an invoiceWorksheetLine
*InvoiceWorksheetLineApi* | [**deleteInvoiceWorksheetLineTag**](docs/InvoiceWorksheetLineApi.md#deleteInvoiceWorksheetLineTag) | **DELETE** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/tag/{invoiceWorksheetLineTag} | Delete a tag for an invoiceWorksheetLine.
*InvoiceWorksheetLineApi* | [**getDuplicateInvoiceWorksheetLineById**](docs/InvoiceWorksheetLineApi.md#getDuplicateInvoiceWorksheetLineById) | **GET** /beta/invoiceWorksheetLine/duplicate/{invoiceWorksheetLineId} | Get a duplicated an invoiceWorksheetLine by id
*InvoiceWorksheetLineApi* | [**getInvoiceWorksheetLineByFilter**](docs/InvoiceWorksheetLineApi.md#getInvoiceWorksheetLineByFilter) | **GET** /beta/invoiceWorksheetLine/search | Search invoiceWorksheetLines by filter
*InvoiceWorksheetLineApi* | [**getInvoiceWorksheetLineById**](docs/InvoiceWorksheetLineApi.md#getInvoiceWorksheetLineById) | **GET** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId} | Get an invoiceWorksheetLine by id
*InvoiceWorksheetLineApi* | [**getInvoiceWorksheetLineTags**](docs/InvoiceWorksheetLineApi.md#getInvoiceWorksheetLineTags) | **GET** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/tag | Get the tags for an invoiceWorksheetLine.
*InvoiceWorksheetLineApi* | [**updateInvoiceWorksheetLine**](docs/InvoiceWorksheetLineApi.md#updateInvoiceWorksheetLine) | **PUT** /beta/invoiceWorksheetLine | Update an invoiceWorksheetLine
*ItemApi* | [**addItem**](docs/ItemApi.md#addItem) | **POST** /beta/item | Create an item
*ItemApi* | [**addItemAudit**](docs/ItemApi.md#addItemAudit) | **PUT** /beta/item/{itemId}/audit/{itemAudit} | Add new audit for an item
*ItemApi* | [**addItemTag**](docs/ItemApi.md#addItemTag) | **PUT** /beta/item/{itemId}/tag/{itemTag} | Add new tags for an item.
*ItemApi* | [**deleteItem**](docs/ItemApi.md#deleteItem) | **DELETE** /beta/item/{itemId} | Delete an item
*ItemApi* | [**deleteItemTag**](docs/ItemApi.md#deleteItemTag) | **DELETE** /beta/item/{itemId}/tag/{itemTag} | Delete a tag for an item.
*ItemApi* | [**getBySKU**](docs/ItemApi.md#getBySKU) | **GET** /beta/item/getBySKU | Get an item by SKU
*ItemApi* | [**getDuplicateItemById**](docs/ItemApi.md#getDuplicateItemById) | **GET** /beta/item/duplicate/{itemId} | Get a duplicated an item by id
*ItemApi* | [**getItemByFilter**](docs/ItemApi.md#getItemByFilter) | **GET** /beta/item/search | Search items by filter
*ItemApi* | [**getItemById**](docs/ItemApi.md#getItemById) | **GET** /beta/item/{itemId} | Get an item by id
*ItemApi* | [**getItemTags**](docs/ItemApi.md#getItemTags) | **GET** /beta/item/{itemId}/tag | Get the tags for an item.
*ItemApi* | [**updateItem**](docs/ItemApi.md#updateItem) | **PUT** /beta/item | Update an item
*ItemApi* | [**updateItemCustomFields**](docs/ItemApi.md#updateItemCustomFields) | **PUT** /beta/item/customFields | Update an item custom fields
*ItemAccountCodeApi* | [**addItemAccountCode**](docs/ItemAccountCodeApi.md#addItemAccountCode) | **POST** /beta/itemAccountCode | Create an itemAccountCode
*ItemAccountCodeApi* | [**addItemAccountCodeAudit**](docs/ItemAccountCodeApi.md#addItemAccountCodeAudit) | **PUT** /beta/itemAccountCode/{itemAccountCodeId}/audit/{itemAccountCodeAudit} | Add new audit for an itemAccountCode
*ItemAccountCodeApi* | [**addItemAccountCodeTag**](docs/ItemAccountCodeApi.md#addItemAccountCodeTag) | **PUT** /beta/itemAccountCode/{itemAccountCodeId}/tag/{itemAccountCodeTag} | Add new tags for an itemAccountCode.
*ItemAccountCodeApi* | [**deleteItemAccountCode**](docs/ItemAccountCodeApi.md#deleteItemAccountCode) | **DELETE** /beta/itemAccountCode/{itemAccountCodeId} | Delete an itemAccountCode
*ItemAccountCodeApi* | [**deleteItemAccountCodeTag**](docs/ItemAccountCodeApi.md#deleteItemAccountCodeTag) | **DELETE** /beta/itemAccountCode/{itemAccountCodeId}/tag/{itemAccountCodeTag} | Delete a tag for an itemAccountCode.
*ItemAccountCodeApi* | [**getDuplicateItemAccountCodeById**](docs/ItemAccountCodeApi.md#getDuplicateItemAccountCodeById) | **GET** /beta/itemAccountCode/duplicate/{itemAccountCodeId} | Get a duplicated an itemAccountCode by id
*ItemAccountCodeApi* | [**getItemAccountCodeByFilter**](docs/ItemAccountCodeApi.md#getItemAccountCodeByFilter) | **GET** /beta/itemAccountCode/search | Search itemAccountCodes by filter
*ItemAccountCodeApi* | [**getItemAccountCodeById**](docs/ItemAccountCodeApi.md#getItemAccountCodeById) | **GET** /beta/itemAccountCode/{itemAccountCodeId} | Get an itemAccountCode by id
*ItemAccountCodeApi* | [**getItemAccountCodeTags**](docs/ItemAccountCodeApi.md#getItemAccountCodeTags) | **GET** /beta/itemAccountCode/{itemAccountCodeId}/tag | Get the tags for an itemAccountCode.
*ItemAccountCodeApi* | [**updateItemAccountCode**](docs/ItemAccountCodeApi.md#updateItemAccountCode) | **PUT** /beta/itemAccountCode | Update an itemAccountCode
*ItemActivityTypeApi* | [**getItemActivityTypeById**](docs/ItemActivityTypeApi.md#getItemActivityTypeById) | **GET** /beta/itemActivityType/{itemActivityTypeId} | Get an itemActivityType by id
*ItemActivityTypeApi* | [**getItemActivityTypeBySearchText**](docs/ItemActivityTypeApi.md#getItemActivityTypeBySearchText) | **GET** /beta/itemActivityType/search | Search itemActivityTypes
*ItemBuyerApi* | [**addItemBuyer**](docs/ItemBuyerApi.md#addItemBuyer) | **POST** /beta/itemBuyer | Create an itemBuyer
*ItemBuyerApi* | [**addItemBuyerAudit**](docs/ItemBuyerApi.md#addItemBuyerAudit) | **PUT** /beta/itemBuyer/{itemBuyerId}/audit/{itemBuyerAudit} | Add new audit for an itemBuyer
*ItemBuyerApi* | [**addItemBuyerTag**](docs/ItemBuyerApi.md#addItemBuyerTag) | **PUT** /beta/itemBuyer/{itemBuyerId}/tag/{itemBuyerTag} | Add new tags for an itemBuyer.
*ItemBuyerApi* | [**deleteItemBuyer**](docs/ItemBuyerApi.md#deleteItemBuyer) | **DELETE** /beta/itemBuyer/{itemBuyerId} | Delete an itemBuyer
*ItemBuyerApi* | [**deleteItemBuyerTag**](docs/ItemBuyerApi.md#deleteItemBuyerTag) | **DELETE** /beta/itemBuyer/{itemBuyerId}/tag/{itemBuyerTag} | Delete a tag for an itemBuyer.
*ItemBuyerApi* | [**getDuplicateItemBuyerById**](docs/ItemBuyerApi.md#getDuplicateItemBuyerById) | **GET** /beta/itemBuyer/duplicate/{itemBuyerId} | Get a duplicated an itemBuyer by id
*ItemBuyerApi* | [**getItemBuyerByFilter**](docs/ItemBuyerApi.md#getItemBuyerByFilter) | **GET** /beta/itemBuyer/search | Search itemBuyers by filter
*ItemBuyerApi* | [**getItemBuyerById**](docs/ItemBuyerApi.md#getItemBuyerById) | **GET** /beta/itemBuyer/{itemBuyerId} | Get an itemBuyer by id
*ItemBuyerApi* | [**getItemBuyerTags**](docs/ItemBuyerApi.md#getItemBuyerTags) | **GET** /beta/itemBuyer/{itemBuyerId}/tag | Get the tags for an itemBuyer.
*ItemBuyerApi* | [**updateItemBuyer**](docs/ItemBuyerApi.md#updateItemBuyer) | **PUT** /beta/itemBuyer | Update an itemBuyer
*ItemCategoryApi* | [**addItemCategory**](docs/ItemCategoryApi.md#addItemCategory) | **POST** /beta/itemCategory | Create an itemCategory
*ItemCategoryApi* | [**addItemCategoryAudit**](docs/ItemCategoryApi.md#addItemCategoryAudit) | **PUT** /beta/itemCategory/{itemCategoryId}/audit/{itemCategoryAudit} | Add new audit for an itemCategory
*ItemCategoryApi* | [**addItemCategoryTag**](docs/ItemCategoryApi.md#addItemCategoryTag) | **PUT** /beta/itemCategory/{itemCategoryId}/tag/{itemCategoryTag} | Add new tags for an itemCategory.
*ItemCategoryApi* | [**deleteItemCategory**](docs/ItemCategoryApi.md#deleteItemCategory) | **DELETE** /beta/itemCategory/{itemCategoryId} | Delete an itemCategory
*ItemCategoryApi* | [**deleteItemCategoryTag**](docs/ItemCategoryApi.md#deleteItemCategoryTag) | **DELETE** /beta/itemCategory/{itemCategoryId}/tag/{itemCategoryTag} | Delete a tag for an itemCategory.
*ItemCategoryApi* | [**getDuplicateItemCategoryById**](docs/ItemCategoryApi.md#getDuplicateItemCategoryById) | **GET** /beta/itemCategory/duplicate/{itemCategoryId} | Get a duplicated an itemCategory by id
*ItemCategoryApi* | [**getItemCategoryByFilter**](docs/ItemCategoryApi.md#getItemCategoryByFilter) | **GET** /beta/itemCategory/search | Search itemCategorys by filter
*ItemCategoryApi* | [**getItemCategoryById**](docs/ItemCategoryApi.md#getItemCategoryById) | **GET** /beta/itemCategory/{itemCategoryId} | Get an itemCategory by id
*ItemCategoryApi* | [**getItemCategoryTags**](docs/ItemCategoryApi.md#getItemCategoryTags) | **GET** /beta/itemCategory/{itemCategoryId}/tag | Get the tags for an itemCategory.
*ItemCategoryApi* | [**updateItemCategory**](docs/ItemCategoryApi.md#updateItemCategory) | **PUT** /beta/itemCategory | Update an itemCategory
*ItemLowstockCodeApi* | [**addItemLowstockCode**](docs/ItemLowstockCodeApi.md#addItemLowstockCode) | **POST** /beta/itemLowstockCode | Create an itemLowstockCode
*ItemLowstockCodeApi* | [**addItemLowstockCodeAudit**](docs/ItemLowstockCodeApi.md#addItemLowstockCodeAudit) | **PUT** /beta/itemLowstockCode/{itemLowstockCodeId}/audit/{itemLowstockCodeAudit} | Add new audit for an itemLowstockCode
*ItemLowstockCodeApi* | [**addItemLowstockCodeTag**](docs/ItemLowstockCodeApi.md#addItemLowstockCodeTag) | **PUT** /beta/itemLowstockCode/{itemLowstockCodeId}/tag/{itemLowstockCodeTag} | Add new tags for an itemLowstockCode.
*ItemLowstockCodeApi* | [**deleteItemLowstockCode**](docs/ItemLowstockCodeApi.md#deleteItemLowstockCode) | **DELETE** /beta/itemLowstockCode/{itemLowstockCodeId} | Delete an itemLowstockCode
*ItemLowstockCodeApi* | [**deleteItemLowstockCodeTag**](docs/ItemLowstockCodeApi.md#deleteItemLowstockCodeTag) | **DELETE** /beta/itemLowstockCode/{itemLowstockCodeId}/tag/{itemLowstockCodeTag} | Delete a tag for an itemLowstockCode.
*ItemLowstockCodeApi* | [**getDuplicateItemLowstockCodeById**](docs/ItemLowstockCodeApi.md#getDuplicateItemLowstockCodeById) | **GET** /beta/itemLowstockCode/duplicate/{itemLowstockCodeId} | Get a duplicated an itemLowstockCode by id
*ItemLowstockCodeApi* | [**getItemLowstockCodeByFilter**](docs/ItemLowstockCodeApi.md#getItemLowstockCodeByFilter) | **GET** /beta/itemLowstockCode/search | Search itemLowstockCodes by filter
*ItemLowstockCodeApi* | [**getItemLowstockCodeById**](docs/ItemLowstockCodeApi.md#getItemLowstockCodeById) | **GET** /beta/itemLowstockCode/{itemLowstockCodeId} | Get an itemLowstockCode by id
*ItemLowstockCodeApi* | [**getItemLowstockCodeTags**](docs/ItemLowstockCodeApi.md#getItemLowstockCodeTags) | **GET** /beta/itemLowstockCode/{itemLowstockCodeId}/tag | Get the tags for an itemLowstockCode.
*ItemLowstockCodeApi* | [**updateItemLowstockCode**](docs/ItemLowstockCodeApi.md#updateItemLowstockCode) | **PUT** /beta/itemLowstockCode | Update an itemLowstockCode
*ItemProductCodeApi* | [**addItemProductCode**](docs/ItemProductCodeApi.md#addItemProductCode) | **POST** /beta/itemProductCode | Create an itemProductCode
*ItemProductCodeApi* | [**addItemProductCodeAudit**](docs/ItemProductCodeApi.md#addItemProductCodeAudit) | **PUT** /beta/itemProductCode/{itemProductCodeId}/audit/{itemProductCodeAudit} | Add new audit for an itemProductCode
*ItemProductCodeApi* | [**addItemProductCodeTag**](docs/ItemProductCodeApi.md#addItemProductCodeTag) | **PUT** /beta/itemProductCode/{itemProductCodeId}/tag/{itemProductCodeTag} | Add new tags for an itemProductCode.
*ItemProductCodeApi* | [**deleteItemProductCode**](docs/ItemProductCodeApi.md#deleteItemProductCode) | **DELETE** /beta/itemProductCode/{itemProductCodeId} | Delete an itemProductCode
*ItemProductCodeApi* | [**deleteItemProductCodeTag**](docs/ItemProductCodeApi.md#deleteItemProductCodeTag) | **DELETE** /beta/itemProductCode/{itemProductCodeId}/tag/{itemProductCodeTag} | Delete a tag for an itemProductCode.
*ItemProductCodeApi* | [**getDuplicateItemProductCodeById**](docs/ItemProductCodeApi.md#getDuplicateItemProductCodeById) | **GET** /beta/itemProductCode/duplicate/{itemProductCodeId} | Get a duplicated an itemProductCode by id
*ItemProductCodeApi* | [**getItemProductCodeByFilter**](docs/ItemProductCodeApi.md#getItemProductCodeByFilter) | **GET** /beta/itemProductCode/search | Search itemProductCodes by filter
*ItemProductCodeApi* | [**getItemProductCodeById**](docs/ItemProductCodeApi.md#getItemProductCodeById) | **GET** /beta/itemProductCode/{itemProductCodeId} | Get an itemProductCode by id
*ItemProductCodeApi* | [**getItemProductCodeTags**](docs/ItemProductCodeApi.md#getItemProductCodeTags) | **GET** /beta/itemProductCode/{itemProductCodeId}/tag | Get the tags for an itemProductCode.
*ItemProductCodeApi* | [**updateItemProductCode**](docs/ItemProductCodeApi.md#updateItemProductCode) | **PUT** /beta/itemProductCode | Update an itemProductCode
*ItemReceiptApi* | [**addItemReceiptAudit**](docs/ItemReceiptApi.md#addItemReceiptAudit) | **PUT** /beta/itemReceipt/{itemReceiptId}/audit/{itemReceiptAudit} | Add new audit for an itemReceipt
*ItemReceiptApi* | [**addItemReceiptTag**](docs/ItemReceiptApi.md#addItemReceiptTag) | **PUT** /beta/itemReceipt/{itemReceiptId}/tag/{itemReceiptTag} | Add new tags for an itemReceipt.
*ItemReceiptApi* | [**deleteItemReceiptTag**](docs/ItemReceiptApi.md#deleteItemReceiptTag) | **DELETE** /beta/itemReceipt/{itemReceiptId}/tag/{itemReceiptTag} | Delete a tag for an itemReceipt.
*ItemReceiptApi* | [**getDuplicateItemReceiptById**](docs/ItemReceiptApi.md#getDuplicateItemReceiptById) | **GET** /beta/itemReceipt/duplicate/{itemReceiptId} | Get a duplicated an itemReceipt by id
*ItemReceiptApi* | [**getItemReceiptByFilter**](docs/ItemReceiptApi.md#getItemReceiptByFilter) | **GET** /beta/itemReceipt/search | Search itemReceipts by filter
*ItemReceiptApi* | [**getItemReceiptById**](docs/ItemReceiptApi.md#getItemReceiptById) | **GET** /beta/itemReceipt/{itemReceiptId} | Get an itemReceipt by id
*ItemReceiptApi* | [**getItemReceiptTags**](docs/ItemReceiptApi.md#getItemReceiptTags) | **GET** /beta/itemReceipt/{itemReceiptId}/tag | Get the tags for an itemReceipt.
*ItemReceiptApi* | [**updateItemReceipt**](docs/ItemReceiptApi.md#updateItemReceipt) | **PUT** /beta/itemReceipt | Update an itemReceipt
*ItemReceiptApi* | [**updateItemReceiptCustomFields**](docs/ItemReceiptApi.md#updateItemReceiptCustomFields) | **PUT** /beta/itemReceipt/customFields | Update an itemReceipt custom fields
*ItemReceiptActivityApi* | [**addItemReceiptActivity**](docs/ItemReceiptActivityApi.md#addItemReceiptActivity) | **POST** /beta/itemReceiptActivity | Create an itemReceiptActivity
*ItemReceiptActivityApi* | [**addItemReceiptActivityAudit**](docs/ItemReceiptActivityApi.md#addItemReceiptActivityAudit) | **PUT** /beta/itemReceiptActivity/{itemReceiptActivityId}/audit/{itemReceiptActivityAudit} | Add new audit for an itemReceiptActivity
*ItemReceiptActivityApi* | [**addItemReceiptActivityTag**](docs/ItemReceiptActivityApi.md#addItemReceiptActivityTag) | **PUT** /beta/itemReceiptActivity/{itemReceiptActivityId}/tag/{itemReceiptActivityTag} | Add new tags for an itemReceiptActivity.
*ItemReceiptActivityApi* | [**deleteItemReceiptActivity**](docs/ItemReceiptActivityApi.md#deleteItemReceiptActivity) | **DELETE** /beta/itemReceiptActivity/{itemReceiptActivityId} | Delete an itemReceiptActivity
*ItemReceiptActivityApi* | [**deleteItemReceiptActivityTag**](docs/ItemReceiptActivityApi.md#deleteItemReceiptActivityTag) | **DELETE** /beta/itemReceiptActivity/{itemReceiptActivityId}/tag/{itemReceiptActivityTag} | Delete a tag for an itemReceiptActivity.
*ItemReceiptActivityApi* | [**getDuplicateItemReceiptActivityById**](docs/ItemReceiptActivityApi.md#getDuplicateItemReceiptActivityById) | **GET** /beta/itemReceiptActivity/duplicate/{itemReceiptActivityId} | Get a duplicated an itemReceiptActivity by id
*ItemReceiptActivityApi* | [**getItemReceiptActivityByFilter**](docs/ItemReceiptActivityApi.md#getItemReceiptActivityByFilter) | **GET** /beta/itemReceiptActivity/search | Search itemReceiptActivitys by filter
*ItemReceiptActivityApi* | [**getItemReceiptActivityById**](docs/ItemReceiptActivityApi.md#getItemReceiptActivityById) | **GET** /beta/itemReceiptActivity/{itemReceiptActivityId} | Get an itemReceiptActivity by id
*ItemReceiptActivityApi* | [**getItemReceiptActivityTags**](docs/ItemReceiptActivityApi.md#getItemReceiptActivityTags) | **GET** /beta/itemReceiptActivity/{itemReceiptActivityId}/tag | Get the tags for an itemReceiptActivity.
*ItemReceiptActivityApi* | [**updateItemReceiptActivity**](docs/ItemReceiptActivityApi.md#updateItemReceiptActivity) | **PUT** /beta/itemReceiptActivity | Update an itemReceiptActivity
*ItemSectorApi* | [**addItemSector**](docs/ItemSectorApi.md#addItemSector) | **POST** /beta/itemSector | Create an itemSector
*ItemSectorApi* | [**addItemSectorAudit**](docs/ItemSectorApi.md#addItemSectorAudit) | **PUT** /beta/itemSector/{itemSectorId}/audit/{itemSectorAudit} | Add new audit for an itemSector
*ItemSectorApi* | [**addItemSectorTag**](docs/ItemSectorApi.md#addItemSectorTag) | **PUT** /beta/itemSector/{itemSectorId}/tag/{itemSectorTag} | Add new tags for an itemSector.
*ItemSectorApi* | [**deleteItemSector**](docs/ItemSectorApi.md#deleteItemSector) | **DELETE** /beta/itemSector/{itemSectorId} | Delete an itemSector
*ItemSectorApi* | [**deleteItemSectorTag**](docs/ItemSectorApi.md#deleteItemSectorTag) | **DELETE** /beta/itemSector/{itemSectorId}/tag/{itemSectorTag} | Delete a tag for an itemSector.
*ItemSectorApi* | [**getDuplicateItemSectorById**](docs/ItemSectorApi.md#getDuplicateItemSectorById) | **GET** /beta/itemSector/duplicate/{itemSectorId} | Get a duplicated an itemSector by id
*ItemSectorApi* | [**getItemSectorByFilter**](docs/ItemSectorApi.md#getItemSectorByFilter) | **GET** /beta/itemSector/search | Search itemSectors by filter
*ItemSectorApi* | [**getItemSectorById**](docs/ItemSectorApi.md#getItemSectorById) | **GET** /beta/itemSector/{itemSectorId} | Get an itemSector by id
*ItemSectorApi* | [**getItemSectorTags**](docs/ItemSectorApi.md#getItemSectorTags) | **GET** /beta/itemSector/{itemSectorId}/tag | Get the tags for an itemSector.
*ItemSectorApi* | [**updateItemSector**](docs/ItemSectorApi.md#updateItemSector) | **PUT** /beta/itemSector | Update an itemSector
*ItemSerialApi* | [**addItemSerialAudit**](docs/ItemSerialApi.md#addItemSerialAudit) | **PUT** /beta/itemSerial/{itemSerialId}/audit/{itemSerialAudit} | Add new audit for an itemSerial
*ItemSerialApi* | [**addItemSerialTag**](docs/ItemSerialApi.md#addItemSerialTag) | **PUT** /beta/itemSerial/{itemSerialId}/tag/{itemSerialTag} | Add new tags for an itemSerial.
*ItemSerialApi* | [**deleteItemSerial**](docs/ItemSerialApi.md#deleteItemSerial) | **DELETE** /beta/itemSerial/{itemSerialId} | Delete an itemSerial
*ItemSerialApi* | [**deleteItemSerialTag**](docs/ItemSerialApi.md#deleteItemSerialTag) | **DELETE** /beta/itemSerial/{itemSerialId}/tag/{itemSerialTag} | Delete a tag for an itemSerial.
*ItemSerialApi* | [**getDuplicateItemSerialById**](docs/ItemSerialApi.md#getDuplicateItemSerialById) | **GET** /beta/itemSerial/duplicate/{itemSerialId} | Get a duplicated an itemSerial by id
*ItemSerialApi* | [**getItemSerialByFilter**](docs/ItemSerialApi.md#getItemSerialByFilter) | **GET** /beta/itemSerial/search | Search itemSerials by filter
*ItemSerialApi* | [**getItemSerialById**](docs/ItemSerialApi.md#getItemSerialById) | **GET** /beta/itemSerial/{itemSerialId} | Get an itemSerial by id
*ItemSerialApi* | [**getItemSerialTags**](docs/ItemSerialApi.md#getItemSerialTags) | **GET** /beta/itemSerial/{itemSerialId}/tag | Get the tags for an itemSerial.
*ItemSerialApi* | [**updateItemSerial**](docs/ItemSerialApi.md#updateItemSerial) | **PUT** /beta/itemSerial | Update an itemSerial
*ItemSerialSchemeApi* | [**addItemSerialScheme**](docs/ItemSerialSchemeApi.md#addItemSerialScheme) | **POST** /beta/itemSerialScheme | Create an itemSerialScheme
*ItemSerialSchemeApi* | [**addItemSerialSchemeAudit**](docs/ItemSerialSchemeApi.md#addItemSerialSchemeAudit) | **PUT** /beta/itemSerialScheme/{itemSerialSchemeId}/audit/{itemSerialSchemeAudit} | Add new audit for an itemSerialScheme
*ItemSerialSchemeApi* | [**addItemSerialSchemeTag**](docs/ItemSerialSchemeApi.md#addItemSerialSchemeTag) | **PUT** /beta/itemSerialScheme/{itemSerialSchemeId}/tag/{itemSerialSchemeTag} | Add new tags for an itemSerialScheme.
*ItemSerialSchemeApi* | [**deleteItemSerialScheme**](docs/ItemSerialSchemeApi.md#deleteItemSerialScheme) | **DELETE** /beta/itemSerialScheme/{itemSerialSchemeId} | Delete an itemSerialScheme
*ItemSerialSchemeApi* | [**deleteItemSerialSchemeTag**](docs/ItemSerialSchemeApi.md#deleteItemSerialSchemeTag) | **DELETE** /beta/itemSerialScheme/{itemSerialSchemeId}/tag/{itemSerialSchemeTag} | Delete a tag for an itemSerialScheme.
*ItemSerialSchemeApi* | [**getDuplicateItemSerialSchemeById**](docs/ItemSerialSchemeApi.md#getDuplicateItemSerialSchemeById) | **GET** /beta/itemSerialScheme/duplicate/{itemSerialSchemeId} | Get a duplicated an itemSerialScheme by id
*ItemSerialSchemeApi* | [**getItemSerialSchemeByFilter**](docs/ItemSerialSchemeApi.md#getItemSerialSchemeByFilter) | **GET** /beta/itemSerialScheme/search | Search itemSerialSchemes by filter
*ItemSerialSchemeApi* | [**getItemSerialSchemeById**](docs/ItemSerialSchemeApi.md#getItemSerialSchemeById) | **GET** /beta/itemSerialScheme/{itemSerialSchemeId} | Get an itemSerialScheme by id
*ItemSerialSchemeApi* | [**getItemSerialSchemeTags**](docs/ItemSerialSchemeApi.md#getItemSerialSchemeTags) | **GET** /beta/itemSerialScheme/{itemSerialSchemeId}/tag | Get the tags for an itemSerialScheme.
*ItemSerialSchemeApi* | [**updateItemSerialScheme**](docs/ItemSerialSchemeApi.md#updateItemSerialScheme) | **PUT** /beta/itemSerialScheme | Update an itemSerialScheme
*ItemSubCategoryApi* | [**addItemSubCategory**](docs/ItemSubCategoryApi.md#addItemSubCategory) | **POST** /beta/itemSubCategory | Create an itemSubCategory
*ItemSubCategoryApi* | [**addItemSubCategoryAudit**](docs/ItemSubCategoryApi.md#addItemSubCategoryAudit) | **PUT** /beta/itemSubCategory/{itemSubCategoryId}/audit/{itemSubCategoryAudit} | Add new audit for an itemSubCategory
*ItemSubCategoryApi* | [**addItemSubCategoryTag**](docs/ItemSubCategoryApi.md#addItemSubCategoryTag) | **PUT** /beta/itemSubCategory/{itemSubCategoryId}/tag/{itemSubCategoryTag} | Add new tags for an itemSubCategory.
*ItemSubCategoryApi* | [**deleteItemSubCategory**](docs/ItemSubCategoryApi.md#deleteItemSubCategory) | **DELETE** /beta/itemSubCategory/{itemSubCategoryId} | Delete an itemSubCategory
*ItemSubCategoryApi* | [**deleteItemSubCategoryTag**](docs/ItemSubCategoryApi.md#deleteItemSubCategoryTag) | **DELETE** /beta/itemSubCategory/{itemSubCategoryId}/tag/{itemSubCategoryTag} | Delete a tag for an itemSubCategory.
*ItemSubCategoryApi* | [**getDuplicateItemSubCategoryById**](docs/ItemSubCategoryApi.md#getDuplicateItemSubCategoryById) | **GET** /beta/itemSubCategory/duplicate/{itemSubCategoryId} | Get a duplicated an itemSubCategory by id
*ItemSubCategoryApi* | [**getItemSubCategoryByFilter**](docs/ItemSubCategoryApi.md#getItemSubCategoryByFilter) | **GET** /beta/itemSubCategory/search | Search itemSubCategorys by filter
*ItemSubCategoryApi* | [**getItemSubCategoryById**](docs/ItemSubCategoryApi.md#getItemSubCategoryById) | **GET** /beta/itemSubCategory/{itemSubCategoryId} | Get an itemSubCategory by id
*ItemSubCategoryApi* | [**getItemSubCategoryTags**](docs/ItemSubCategoryApi.md#getItemSubCategoryTags) | **GET** /beta/itemSubCategory/{itemSubCategoryId}/tag | Get the tags for an itemSubCategory.
*ItemSubCategoryApi* | [**updateItemSubCategory**](docs/ItemSubCategoryApi.md#updateItemSubCategory) | **PUT** /beta/itemSubCategory | Update an itemSubCategory
*ItemSummaryCodeApi* | [**addItemSummaryCode**](docs/ItemSummaryCodeApi.md#addItemSummaryCode) | **POST** /beta/itemSummaryCode | Create an itemSummaryCode
*ItemSummaryCodeApi* | [**addItemSummaryCodeAudit**](docs/ItemSummaryCodeApi.md#addItemSummaryCodeAudit) | **PUT** /beta/itemSummaryCode/{itemSummaryCodeId}/audit/{itemSummaryCodeAudit} | Add new audit for an itemSummaryCode
*ItemSummaryCodeApi* | [**addItemSummaryCodeTag**](docs/ItemSummaryCodeApi.md#addItemSummaryCodeTag) | **PUT** /beta/itemSummaryCode/{itemSummaryCodeId}/tag/{itemSummaryCodeTag} | Add new tags for an itemSummaryCode.
*ItemSummaryCodeApi* | [**deleteItemSummaryCode**](docs/ItemSummaryCodeApi.md#deleteItemSummaryCode) | **DELETE** /beta/itemSummaryCode/{itemSummaryCodeId} | Delete an itemSummaryCode
*ItemSummaryCodeApi* | [**deleteItemSummaryCodeTag**](docs/ItemSummaryCodeApi.md#deleteItemSummaryCodeTag) | **DELETE** /beta/itemSummaryCode/{itemSummaryCodeId}/tag/{itemSummaryCodeTag} | Delete a tag for an itemSummaryCode.
*ItemSummaryCodeApi* | [**getDuplicateItemSummaryCodeById**](docs/ItemSummaryCodeApi.md#getDuplicateItemSummaryCodeById) | **GET** /beta/itemSummaryCode/duplicate/{itemSummaryCodeId} | Get a duplicated an itemSummaryCode by id
*ItemSummaryCodeApi* | [**getItemSummaryCodeByFilter**](docs/ItemSummaryCodeApi.md#getItemSummaryCodeByFilter) | **GET** /beta/itemSummaryCode/search | Search itemSummaryCodes by filter
*ItemSummaryCodeApi* | [**getItemSummaryCodeById**](docs/ItemSummaryCodeApi.md#getItemSummaryCodeById) | **GET** /beta/itemSummaryCode/{itemSummaryCodeId} | Get an itemSummaryCode by id
*ItemSummaryCodeApi* | [**getItemSummaryCodeTags**](docs/ItemSummaryCodeApi.md#getItemSummaryCodeTags) | **GET** /beta/itemSummaryCode/{itemSummaryCodeId}/tag | Get the tags for an itemSummaryCode.
*ItemSummaryCodeApi* | [**updateItemSummaryCode**](docs/ItemSummaryCodeApi.md#updateItemSummaryCode) | **PUT** /beta/itemSummaryCode | Update an itemSummaryCode
*JobApi* | [**addJob**](docs/JobApi.md#addJob) | **POST** /beta/job | Create a job
*JobApi* | [**addJobAudit**](docs/JobApi.md#addJobAudit) | **PUT** /beta/job/{jobId}/audit/{jobAudit} | Add new audit for a job
*JobApi* | [**addJobTag**](docs/JobApi.md#addJobTag) | **PUT** /beta/job/{jobId}/tag/{jobTag} | Add new tags for a job.
*JobApi* | [**deleteJob**](docs/JobApi.md#deleteJob) | **DELETE** /beta/job/{jobId} | Delete a job
*JobApi* | [**deleteJobTag**](docs/JobApi.md#deleteJobTag) | **DELETE** /beta/job/{jobId}/tag/{jobTag} | Delete a tag for a job.
*JobApi* | [**executeJob**](docs/JobApi.md#executeJob) | **POST** /beta/job/executeJob | Run the ExecuteJob process.
*JobApi* | [**getDuplicateJobById**](docs/JobApi.md#getDuplicateJobById) | **GET** /beta/job/duplicate/{jobId} | Get a duplicated a job by id
*JobApi* | [**getJobByFilter**](docs/JobApi.md#getJobByFilter) | **GET** /beta/job/search | Search jobs by filter
*JobApi* | [**getJobById**](docs/JobApi.md#getJobById) | **GET** /beta/job/{jobId} | Get a job by id
*JobApi* | [**getJobTags**](docs/JobApi.md#getJobTags) | **GET** /beta/job/{jobId}/tag | Get the tags for a job.
*JobApi* | [**updateJob**](docs/JobApi.md#updateJob) | **PUT** /beta/job | Update a job
*JobRecipeApi* | [**addJobRecipe**](docs/JobRecipeApi.md#addJobRecipe) | **POST** /beta/jobRecipe | Create a jobRecipe
*JobRecipeApi* | [**addJobRecipeAudit**](docs/JobRecipeApi.md#addJobRecipeAudit) | **PUT** /beta/jobRecipe/{jobRecipeId}/audit/{jobRecipeAudit} | Add new audit for a jobRecipe
*JobRecipeApi* | [**addJobRecipeTag**](docs/JobRecipeApi.md#addJobRecipeTag) | **PUT** /beta/jobRecipe/{jobRecipeId}/tag/{jobRecipeTag} | Add new tags for a jobRecipe.
*JobRecipeApi* | [**deleteJobRecipe**](docs/JobRecipeApi.md#deleteJobRecipe) | **DELETE** /beta/jobRecipe/{jobRecipeId} | Delete a jobRecipe
*JobRecipeApi* | [**deleteJobRecipeTag**](docs/JobRecipeApi.md#deleteJobRecipeTag) | **DELETE** /beta/jobRecipe/{jobRecipeId}/tag/{jobRecipeTag} | Delete a tag for a jobRecipe.
*JobRecipeApi* | [**getDuplicateJobRecipeById**](docs/JobRecipeApi.md#getDuplicateJobRecipeById) | **GET** /beta/jobRecipe/duplicate/{jobRecipeId} | Get a duplicated a jobRecipe by id
*JobRecipeApi* | [**getJobRecipeByFilter**](docs/JobRecipeApi.md#getJobRecipeByFilter) | **GET** /beta/jobRecipe/search | Search jobRecipes by filter
*JobRecipeApi* | [**getJobRecipeById**](docs/JobRecipeApi.md#getJobRecipeById) | **GET** /beta/jobRecipe/{jobRecipeId} | Get a jobRecipe by id
*JobRecipeApi* | [**getJobRecipeTags**](docs/JobRecipeApi.md#getJobRecipeTags) | **GET** /beta/jobRecipe/{jobRecipeId}/tag | Get the tags for a jobRecipe.
*JobRecipeApi* | [**updateJobRecipe**](docs/JobRecipeApi.md#updateJobRecipe) | **PUT** /beta/jobRecipe | Update a jobRecipe
*JobTimeApi* | [**addJobTime**](docs/JobTimeApi.md#addJobTime) | **POST** /beta/jobTime | Create a jobTime
*JobTimeApi* | [**addJobTimeAudit**](docs/JobTimeApi.md#addJobTimeAudit) | **PUT** /beta/jobTime/{jobTimeId}/audit/{jobTimeAudit} | Add new audit for a jobTime
*JobTimeApi* | [**addJobTimeTag**](docs/JobTimeApi.md#addJobTimeTag) | **PUT** /beta/jobTime/{jobTimeId}/tag/{jobTimeTag} | Add new tags for a jobTime.
*JobTimeApi* | [**deleteJobTime**](docs/JobTimeApi.md#deleteJobTime) | **DELETE** /beta/jobTime/{jobTimeId} | Delete a jobTime
*JobTimeApi* | [**deleteJobTimeTag**](docs/JobTimeApi.md#deleteJobTimeTag) | **DELETE** /beta/jobTime/{jobTimeId}/tag/{jobTimeTag} | Delete a tag for a jobTime.
*JobTimeApi* | [**getDuplicateJobTimeById**](docs/JobTimeApi.md#getDuplicateJobTimeById) | **GET** /beta/jobTime/duplicate/{jobTimeId} | Get a duplicated a jobTime by id
*JobTimeApi* | [**getJobTimeByFilter**](docs/JobTimeApi.md#getJobTimeByFilter) | **GET** /beta/jobTime/search | Search jobTimes by filter
*JobTimeApi* | [**getJobTimeById**](docs/JobTimeApi.md#getJobTimeById) | **GET** /beta/jobTime/{jobTimeId} | Get a jobTime by id
*JobTimeApi* | [**getJobTimeTags**](docs/JobTimeApi.md#getJobTimeTags) | **GET** /beta/jobTime/{jobTimeId}/tag | Get the tags for a jobTime.
*JobTimeApi* | [**updateJobTime**](docs/JobTimeApi.md#updateJobTime) | **PUT** /beta/jobTime | Update a jobTime
*JobTimeApi* | [**updateJobTimeCustomFields**](docs/JobTimeApi.md#updateJobTimeCustomFields) | **PUT** /beta/jobTime/customFields | Update a jobTime custom fields
*JobTimeActivityApi* | [**addJobTimeActivity**](docs/JobTimeActivityApi.md#addJobTimeActivity) | **POST** /beta/jobTimeActivity | Create a jobTimeActivity
*JobTimeActivityApi* | [**addJobTimeActivityAudit**](docs/JobTimeActivityApi.md#addJobTimeActivityAudit) | **PUT** /beta/jobTimeActivity/{jobTimeActivityId}/audit/{jobTimeActivityAudit} | Add new audit for a jobTimeActivity
*JobTimeActivityApi* | [**addJobTimeActivityTag**](docs/JobTimeActivityApi.md#addJobTimeActivityTag) | **PUT** /beta/jobTimeActivity/{jobTimeActivityId}/tag/{jobTimeActivityTag} | Add new tags for a jobTimeActivity.
*JobTimeActivityApi* | [**deleteJobTimeActivity**](docs/JobTimeActivityApi.md#deleteJobTimeActivity) | **DELETE** /beta/jobTimeActivity/{jobTimeActivityId} | Delete a jobTimeActivity
*JobTimeActivityApi* | [**deleteJobTimeActivityTag**](docs/JobTimeActivityApi.md#deleteJobTimeActivityTag) | **DELETE** /beta/jobTimeActivity/{jobTimeActivityId}/tag/{jobTimeActivityTag} | Delete a tag for a jobTimeActivity.
*JobTimeActivityApi* | [**getDuplicateJobTimeActivityById**](docs/JobTimeActivityApi.md#getDuplicateJobTimeActivityById) | **GET** /beta/jobTimeActivity/duplicate/{jobTimeActivityId} | Get a duplicated a jobTimeActivity by id
*JobTimeActivityApi* | [**getJobTimeActivityByFilter**](docs/JobTimeActivityApi.md#getJobTimeActivityByFilter) | **GET** /beta/jobTimeActivity/search | Search jobTimeActivitys by filter
*JobTimeActivityApi* | [**getJobTimeActivityById**](docs/JobTimeActivityApi.md#getJobTimeActivityById) | **GET** /beta/jobTimeActivity/{jobTimeActivityId} | Get a jobTimeActivity by id
*JobTimeActivityApi* | [**getJobTimeActivityTags**](docs/JobTimeActivityApi.md#getJobTimeActivityTags) | **GET** /beta/jobTimeActivity/{jobTimeActivityId}/tag | Get the tags for a jobTimeActivity.
*JobTimeActivityApi* | [**updateJobTimeActivity**](docs/JobTimeActivityApi.md#updateJobTimeActivity) | **PUT** /beta/jobTimeActivity | Update a jobTimeActivity
*JobTypeApi* | [**addJobType**](docs/JobTypeApi.md#addJobType) | **POST** /beta/jobType | Create a jobType
*JobTypeApi* | [**addJobTypeAudit**](docs/JobTypeApi.md#addJobTypeAudit) | **PUT** /beta/jobType/{jobTypeId}/audit/{jobTypeAudit} | Add new audit for a jobType
*JobTypeApi* | [**addJobTypeTag**](docs/JobTypeApi.md#addJobTypeTag) | **PUT** /beta/jobType/{jobTypeId}/tag/{jobTypeTag} | Add new tags for a jobType.
*JobTypeApi* | [**deleteJobType**](docs/JobTypeApi.md#deleteJobType) | **DELETE** /beta/jobType/{jobTypeId} | Delete a jobType
*JobTypeApi* | [**deleteJobTypeTag**](docs/JobTypeApi.md#deleteJobTypeTag) | **DELETE** /beta/jobType/{jobTypeId}/tag/{jobTypeTag} | Delete a tag for a jobType.
*JobTypeApi* | [**getDuplicateJobTypeById**](docs/JobTypeApi.md#getDuplicateJobTypeById) | **GET** /beta/jobType/duplicate/{jobTypeId} | Get a duplicated a jobType by id
*JobTypeApi* | [**getJobTypeByFilter**](docs/JobTypeApi.md#getJobTypeByFilter) | **GET** /beta/jobType/search | Search jobTypes by filter
*JobTypeApi* | [**getJobTypeById**](docs/JobTypeApi.md#getJobTypeById) | **GET** /beta/jobType/{jobTypeId} | Get a jobType by id
*JobTypeApi* | [**getJobTypeTags**](docs/JobTypeApi.md#getJobTypeTags) | **GET** /beta/jobType/{jobTypeId}/tag | Get the tags for a jobType.
*JobTypeApi* | [**updateJobType**](docs/JobTypeApi.md#updateJobType) | **PUT** /beta/jobType | Update a jobType
*JobTypeApi* | [**updateJobTypeCustomFields**](docs/JobTypeApi.md#updateJobTypeCustomFields) | **PUT** /beta/jobType/customFields | Update a jobType custom fields
*KitApi* | [**addKit**](docs/KitApi.md#addKit) | **POST** /beta/kit | Create a kit
*KitApi* | [**addKitAudit**](docs/KitApi.md#addKitAudit) | **PUT** /beta/kit/{kitId}/audit/{kitAudit} | Add new audit for a kit
*KitApi* | [**addKitTag**](docs/KitApi.md#addKitTag) | **PUT** /beta/kit/{kitId}/tag/{kitTag} | Add new tags for a kit.
*KitApi* | [**deleteKit**](docs/KitApi.md#deleteKit) | **DELETE** /beta/kit/{kitId} | Delete a kit
*KitApi* | [**deleteKitTag**](docs/KitApi.md#deleteKitTag) | **DELETE** /beta/kit/{kitId}/tag/{kitTag} | Delete a tag for a kit.
*KitApi* | [**getDuplicateKitById**](docs/KitApi.md#getDuplicateKitById) | **GET** /beta/kit/duplicate/{kitId} | Get a duplicated a kit by id
*KitApi* | [**getKitByFilter**](docs/KitApi.md#getKitByFilter) | **GET** /beta/kit/search | Search kits by filter
*KitApi* | [**getKitById**](docs/KitApi.md#getKitById) | **GET** /beta/kit/{kitId} | Get a kit by id
*KitApi* | [**getKitTags**](docs/KitApi.md#getKitTags) | **GET** /beta/kit/{kitId}/tag | Get the tags for a kit.
*KitApi* | [**updateKit**](docs/KitApi.md#updateKit) | **PUT** /beta/kit | Update a kit
*KitApi* | [**updateKitCustomFields**](docs/KitApi.md#updateKitCustomFields) | **PUT** /beta/kit/customFields | Update a kit custom fields
*LegacyLowstockContactApi* | [**addLegacyLowstockContact**](docs/LegacyLowstockContactApi.md#addLegacyLowstockContact) | **POST** /beta/legacyLowstockContact | Create a legacyLowstockContact
*LegacyLowstockContactApi* | [**addLegacyLowstockContactAudit**](docs/LegacyLowstockContactApi.md#addLegacyLowstockContactAudit) | **PUT** /beta/legacyLowstockContact/{legacyLowstockContactId}/audit/{legacyLowstockContactAudit} | Add new audit for a legacyLowstockContact
*LegacyLowstockContactApi* | [**addLegacyLowstockContactTag**](docs/LegacyLowstockContactApi.md#addLegacyLowstockContactTag) | **PUT** /beta/legacyLowstockContact/{legacyLowstockContactId}/tag/{legacyLowstockContactTag} | Add new tags for a legacyLowstockContact.
*LegacyLowstockContactApi* | [**deleteLegacyLowstockContact**](docs/LegacyLowstockContactApi.md#deleteLegacyLowstockContact) | **DELETE** /beta/legacyLowstockContact/{legacyLowstockContactId} | Delete a legacyLowstockContact
*LegacyLowstockContactApi* | [**deleteLegacyLowstockContactTag**](docs/LegacyLowstockContactApi.md#deleteLegacyLowstockContactTag) | **DELETE** /beta/legacyLowstockContact/{legacyLowstockContactId}/tag/{legacyLowstockContactTag} | Delete a tag for a legacyLowstockContact.
*LegacyLowstockContactApi* | [**getDuplicateLegacyLowstockContactById**](docs/LegacyLowstockContactApi.md#getDuplicateLegacyLowstockContactById) | **GET** /beta/legacyLowstockContact/duplicate/{legacyLowstockContactId} | Get a duplicated a legacyLowstockContact by id
*LegacyLowstockContactApi* | [**getLegacyLowstockContactByFilter**](docs/LegacyLowstockContactApi.md#getLegacyLowstockContactByFilter) | **GET** /beta/legacyLowstockContact/search | Search legacyLowstockContacts by filter
*LegacyLowstockContactApi* | [**getLegacyLowstockContactById**](docs/LegacyLowstockContactApi.md#getLegacyLowstockContactById) | **GET** /beta/legacyLowstockContact/{legacyLowstockContactId} | Get a legacyLowstockContact by id
*LegacyLowstockContactApi* | [**getLegacyLowstockContactTags**](docs/LegacyLowstockContactApi.md#getLegacyLowstockContactTags) | **GET** /beta/legacyLowstockContact/{legacyLowstockContactId}/tag | Get the tags for a legacyLowstockContact.
*LegacyLowstockContactApi* | [**updateLegacyLowstockContact**](docs/LegacyLowstockContactApi.md#updateLegacyLowstockContact) | **PUT** /beta/legacyLowstockContact | Update a legacyLowstockContact
*LineOfBusinessApi* | [**getLineOfBusinessById**](docs/LineOfBusinessApi.md#getLineOfBusinessById) | **GET** /beta/lineOfBusiness/{lineOfBusinessId} | Get a lineOfBusiness by id
*LineOfBusinessApi* | [**getLineOfBusinessBySearchText**](docs/LineOfBusinessApi.md#getLineOfBusinessBySearchText) | **GET** /beta/lineOfBusiness/search | Search lineOfBusinesses
*LocationApi* | [**addLocation**](docs/LocationApi.md#addLocation) | **POST** /beta/location | Create a location
*LocationApi* | [**addLocationAudit**](docs/LocationApi.md#addLocationAudit) | **PUT** /beta/location/{locationId}/audit/{locationAudit} | Add new audit for a location
*LocationApi* | [**addLocationTag**](docs/LocationApi.md#addLocationTag) | **PUT** /beta/location/{locationId}/tag/{locationTag} | Add new tags for a location.
*LocationApi* | [**deleteLocation**](docs/LocationApi.md#deleteLocation) | **DELETE** /beta/location/{locationId} | Delete a location
*LocationApi* | [**deleteLocationTag**](docs/LocationApi.md#deleteLocationTag) | **DELETE** /beta/location/{locationId}/tag/{locationTag} | Delete a tag for a location.
*LocationApi* | [**getDuplicateLocationById**](docs/LocationApi.md#getDuplicateLocationById) | **GET** /beta/location/duplicate/{locationId} | Get a duplicated a location by id
*LocationApi* | [**getLocationByFilter**](docs/LocationApi.md#getLocationByFilter) | **GET** /beta/location/search | Search locations by filter
*LocationApi* | [**getLocationById**](docs/LocationApi.md#getLocationById) | **GET** /beta/location/{locationId} | Get a location by id
*LocationApi* | [**getLocationTags**](docs/LocationApi.md#getLocationTags) | **GET** /beta/location/{locationId}/tag | Get the tags for a location.
*LocationApi* | [**updateLocation**](docs/LocationApi.md#updateLocation) | **PUT** /beta/location | Update a location
*LocationApi* | [**updateLocationCustomFields**](docs/LocationApi.md#updateLocationCustomFields) | **PUT** /beta/location/customFields | Update a location custom fields
*LocationAddressSchemeApi* | [**addLocationAddressScheme**](docs/LocationAddressSchemeApi.md#addLocationAddressScheme) | **POST** /beta/locationAddressScheme | Create a locationAddressScheme
*LocationAddressSchemeApi* | [**addLocationAddressSchemeAudit**](docs/LocationAddressSchemeApi.md#addLocationAddressSchemeAudit) | **PUT** /beta/locationAddressScheme/{locationAddressSchemeId}/audit/{locationAddressSchemeAudit} | Add new audit for a locationAddressScheme
*LocationAddressSchemeApi* | [**addLocationAddressSchemeTag**](docs/LocationAddressSchemeApi.md#addLocationAddressSchemeTag) | **PUT** /beta/locationAddressScheme/{locationAddressSchemeId}/tag/{locationAddressSchemeTag} | Add new tags for a locationAddressScheme.
*LocationAddressSchemeApi* | [**deleteLocationAddressScheme**](docs/LocationAddressSchemeApi.md#deleteLocationAddressScheme) | **DELETE** /beta/locationAddressScheme/{locationAddressSchemeId} | Delete a locationAddressScheme
*LocationAddressSchemeApi* | [**deleteLocationAddressSchemeTag**](docs/LocationAddressSchemeApi.md#deleteLocationAddressSchemeTag) | **DELETE** /beta/locationAddressScheme/{locationAddressSchemeId}/tag/{locationAddressSchemeTag} | Delete a tag for a locationAddressScheme.
*LocationAddressSchemeApi* | [**getDuplicateLocationAddressSchemeById**](docs/LocationAddressSchemeApi.md#getDuplicateLocationAddressSchemeById) | **GET** /beta/locationAddressScheme/duplicate/{locationAddressSchemeId} | Get a duplicated a locationAddressScheme by id
*LocationAddressSchemeApi* | [**getLocationAddressSchemeByFilter**](docs/LocationAddressSchemeApi.md#getLocationAddressSchemeByFilter) | **GET** /beta/locationAddressScheme/search | Search locationAddressSchemes by filter
*LocationAddressSchemeApi* | [**getLocationAddressSchemeById**](docs/LocationAddressSchemeApi.md#getLocationAddressSchemeById) | **GET** /beta/locationAddressScheme/{locationAddressSchemeId} | Get a locationAddressScheme by id
*LocationAddressSchemeApi* | [**getLocationAddressSchemeTags**](docs/LocationAddressSchemeApi.md#getLocationAddressSchemeTags) | **GET** /beta/locationAddressScheme/{locationAddressSchemeId}/tag | Get the tags for a locationAddressScheme.
*LocationAddressSchemeApi* | [**updateLocationAddressScheme**](docs/LocationAddressSchemeApi.md#updateLocationAddressScheme) | **PUT** /beta/locationAddressScheme | Update a locationAddressScheme
*LocationAddressSchemeApi* | [**updateLocationAddressSchemeCustomFields**](docs/LocationAddressSchemeApi.md#updateLocationAddressSchemeCustomFields) | **PUT** /beta/locationAddressScheme/customFields | Update a locationAddressScheme custom fields
*LocationBillingTypeApi* | [**addLocationBillingType**](docs/LocationBillingTypeApi.md#addLocationBillingType) | **POST** /beta/locationBillingType | Create a locationBillingType
*LocationBillingTypeApi* | [**addLocationBillingTypeAudit**](docs/LocationBillingTypeApi.md#addLocationBillingTypeAudit) | **PUT** /beta/locationBillingType/{locationBillingTypeId}/audit/{locationBillingTypeAudit} | Add new audit for a locationBillingType
*LocationBillingTypeApi* | [**addLocationBillingTypeTag**](docs/LocationBillingTypeApi.md#addLocationBillingTypeTag) | **PUT** /beta/locationBillingType/{locationBillingTypeId}/tag/{locationBillingTypeTag} | Add new tags for a locationBillingType.
*LocationBillingTypeApi* | [**deleteLocationBillingType**](docs/LocationBillingTypeApi.md#deleteLocationBillingType) | **DELETE** /beta/locationBillingType/{locationBillingTypeId} | Delete a locationBillingType
*LocationBillingTypeApi* | [**deleteLocationBillingTypeTag**](docs/LocationBillingTypeApi.md#deleteLocationBillingTypeTag) | **DELETE** /beta/locationBillingType/{locationBillingTypeId}/tag/{locationBillingTypeTag} | Delete a tag for a locationBillingType.
*LocationBillingTypeApi* | [**getDuplicateLocationBillingTypeById**](docs/LocationBillingTypeApi.md#getDuplicateLocationBillingTypeById) | **GET** /beta/locationBillingType/duplicate/{locationBillingTypeId} | Get a duplicated a locationBillingType by id
*LocationBillingTypeApi* | [**getLocationBillingTypeByFilter**](docs/LocationBillingTypeApi.md#getLocationBillingTypeByFilter) | **GET** /beta/locationBillingType/search | Search locationBillingTypes by filter
*LocationBillingTypeApi* | [**getLocationBillingTypeById**](docs/LocationBillingTypeApi.md#getLocationBillingTypeById) | **GET** /beta/locationBillingType/{locationBillingTypeId} | Get a locationBillingType by id
*LocationBillingTypeApi* | [**getLocationBillingTypeTags**](docs/LocationBillingTypeApi.md#getLocationBillingTypeTags) | **GET** /beta/locationBillingType/{locationBillingTypeId}/tag | Get the tags for a locationBillingType.
*LocationBillingTypeApi* | [**updateLocationBillingType**](docs/LocationBillingTypeApi.md#updateLocationBillingType) | **PUT** /beta/locationBillingType | Update a locationBillingType
*LocationBillingTypeApi* | [**updateLocationBillingTypeCustomFields**](docs/LocationBillingTypeApi.md#updateLocationBillingTypeCustomFields) | **PUT** /beta/locationBillingType/customFields | Update a locationBillingType custom fields
*LocationFootprintApi* | [**addLocationFootprint**](docs/LocationFootprintApi.md#addLocationFootprint) | **POST** /beta/locationFootprint | Create a locationFootprint
*LocationFootprintApi* | [**addLocationFootprintAudit**](docs/LocationFootprintApi.md#addLocationFootprintAudit) | **PUT** /beta/locationFootprint/{locationFootprintId}/audit/{locationFootprintAudit} | Add new audit for a locationFootprint
*LocationFootprintApi* | [**addLocationFootprintTag**](docs/LocationFootprintApi.md#addLocationFootprintTag) | **PUT** /beta/locationFootprint/{locationFootprintId}/tag/{locationFootprintTag} | Add new tags for a locationFootprint.
*LocationFootprintApi* | [**deleteLocationFootprint**](docs/LocationFootprintApi.md#deleteLocationFootprint) | **DELETE** /beta/locationFootprint/{locationFootprintId} | Delete a locationFootprint
*LocationFootprintApi* | [**deleteLocationFootprintTag**](docs/LocationFootprintApi.md#deleteLocationFootprintTag) | **DELETE** /beta/locationFootprint/{locationFootprintId}/tag/{locationFootprintTag} | Delete a tag for a locationFootprint.
*LocationFootprintApi* | [**getDuplicateLocationFootprintById**](docs/LocationFootprintApi.md#getDuplicateLocationFootprintById) | **GET** /beta/locationFootprint/duplicate/{locationFootprintId} | Get a duplicated a locationFootprint by id
*LocationFootprintApi* | [**getLocationFootprintByFilter**](docs/LocationFootprintApi.md#getLocationFootprintByFilter) | **GET** /beta/locationFootprint/search | Search locationFootprints by filter
*LocationFootprintApi* | [**getLocationFootprintById**](docs/LocationFootprintApi.md#getLocationFootprintById) | **GET** /beta/locationFootprint/{locationFootprintId} | Get a locationFootprint by id
*LocationFootprintApi* | [**getLocationFootprintTags**](docs/LocationFootprintApi.md#getLocationFootprintTags) | **GET** /beta/locationFootprint/{locationFootprintId}/tag | Get the tags for a locationFootprint.
*LocationFootprintApi* | [**updateLocationFootprint**](docs/LocationFootprintApi.md#updateLocationFootprint) | **PUT** /beta/locationFootprint | Update a locationFootprint
*LocationFootprintApi* | [**updateLocationFootprintCustomFields**](docs/LocationFootprintApi.md#updateLocationFootprintCustomFields) | **PUT** /beta/locationFootprint/customFields | Update a locationFootprint custom fields
*LoggedTimeApi* | [**addLoggedTimeAudit**](docs/LoggedTimeApi.md#addLoggedTimeAudit) | **PUT** /beta/loggedTime/{loggedTimeId}/audit/{loggedTimeAudit} | Add new audit for a loggedTime
*LoggedTimeApi* | [**addLoggedTimeTag**](docs/LoggedTimeApi.md#addLoggedTimeTag) | **PUT** /beta/loggedTime/{loggedTimeId}/tag/{loggedTimeTag} | Add new tags for a loggedTime.
*LoggedTimeApi* | [**deleteLoggedTimeTag**](docs/LoggedTimeApi.md#deleteLoggedTimeTag) | **DELETE** /beta/loggedTime/{loggedTimeId}/tag/{loggedTimeTag} | Delete a tag for a loggedTime.
*LoggedTimeApi* | [**getDuplicateLoggedTimeById**](docs/LoggedTimeApi.md#getDuplicateLoggedTimeById) | **GET** /beta/loggedTime/duplicate/{loggedTimeId} | Get a duplicated a loggedTime by id
*LoggedTimeApi* | [**getLoggedTimeByFilter**](docs/LoggedTimeApi.md#getLoggedTimeByFilter) | **GET** /beta/loggedTime/search | Search loggedTimes by filter
*LoggedTimeApi* | [**getLoggedTimeById**](docs/LoggedTimeApi.md#getLoggedTimeById) | **GET** /beta/loggedTime/{loggedTimeId} | Get a loggedTime by id
*LoggedTimeApi* | [**getLoggedTimeTags**](docs/LoggedTimeApi.md#getLoggedTimeTags) | **GET** /beta/loggedTime/{loggedTimeId}/tag | Get the tags for a loggedTime.
*LoggedTimeApi* | [**updateLoggedTimeCustomFields**](docs/LoggedTimeApi.md#updateLoggedTimeCustomFields) | **PUT** /beta/loggedTime/customFields | Update a loggedTime custom fields
*LoggedTimeTypeApi* | [**getLoggedTimeTypeById**](docs/LoggedTimeTypeApi.md#getLoggedTimeTypeById) | **GET** /beta/loggedTimeType/{loggedTimeTypeId} | Get a loggedTimeType by id
*LoggedTimeTypeApi* | [**getLoggedTimeTypeBySearchText**](docs/LoggedTimeTypeApi.md#getLoggedTimeTypeBySearchText) | **GET** /beta/loggedTimeType/search | Search loggedTimeTypes
*LowStockApi* | [**addLowStockAudit**](docs/LowStockApi.md#addLowStockAudit) | **PUT** /beta/lowStock/{lowStockId}/audit/{lowStockAudit} | Add new audit for a lowStock
*LowStockApi* | [**addLowStockTag**](docs/LowStockApi.md#addLowStockTag) | **PUT** /beta/lowStock/{lowStockId}/tag/{lowStockTag} | Add new tags for a lowStock.
*LowStockApi* | [**deleteLowStockTag**](docs/LowStockApi.md#deleteLowStockTag) | **DELETE** /beta/lowStock/{lowStockId}/tag/{lowStockTag} | Delete a tag for a lowStock.
*LowStockApi* | [**getDuplicateLowStockById**](docs/LowStockApi.md#getDuplicateLowStockById) | **GET** /beta/lowStock/duplicate/{lowStockId} | Get a duplicated a lowStock by id
*LowStockApi* | [**getLowStockByFilter**](docs/LowStockApi.md#getLowStockByFilter) | **GET** /beta/lowStock/search | Search lowStocks by filter
*LowStockApi* | [**getLowStockById**](docs/LowStockApi.md#getLowStockById) | **GET** /beta/lowStock/{lowStockId} | Get a lowStock by id
*LowStockApi* | [**getLowStockTags**](docs/LowStockApi.md#getLowStockTags) | **GET** /beta/lowStock/{lowStockId}/tag | Get the tags for a lowStock.
*ManageScheduledPlansApi* | [**addManageScheduledPlans**](docs/ManageScheduledPlansApi.md#addManageScheduledPlans) | **POST** /beta/manageScheduledPlans | Create a manageScheduledPlans
*ManageScheduledPlansApi* | [**addManageScheduledPlansAudit**](docs/ManageScheduledPlansApi.md#addManageScheduledPlansAudit) | **PUT** /beta/manageScheduledPlans/{manageScheduledPlansId}/audit/{manageScheduledPlansAudit} | Add new audit for a manageScheduledPlans
*ManageScheduledPlansApi* | [**addManageScheduledPlansTag**](docs/ManageScheduledPlansApi.md#addManageScheduledPlansTag) | **PUT** /beta/manageScheduledPlans/{manageScheduledPlansId}/tag/{manageScheduledPlansTag} | Add new tags for a manageScheduledPlans.
*ManageScheduledPlansApi* | [**deleteManageScheduledPlans**](docs/ManageScheduledPlansApi.md#deleteManageScheduledPlans) | **DELETE** /beta/manageScheduledPlans/{manageScheduledPlansId} | Delete a manageScheduledPlans
*ManageScheduledPlansApi* | [**deleteManageScheduledPlansTag**](docs/ManageScheduledPlansApi.md#deleteManageScheduledPlansTag) | **DELETE** /beta/manageScheduledPlans/{manageScheduledPlansId}/tag/{manageScheduledPlansTag} | Delete a tag for a manageScheduledPlans.
*ManageScheduledPlansApi* | [**getDuplicateManageScheduledPlansById**](docs/ManageScheduledPlansApi.md#getDuplicateManageScheduledPlansById) | **GET** /beta/manageScheduledPlans/duplicate/{manageScheduledPlansId} | Get a duplicated a manageScheduledPlans by id
*ManageScheduledPlansApi* | [**getManageScheduledPlansByFilter**](docs/ManageScheduledPlansApi.md#getManageScheduledPlansByFilter) | **GET** /beta/manageScheduledPlans/search | Search manageScheduledPlanses by filter
*ManageScheduledPlansApi* | [**getManageScheduledPlansById**](docs/ManageScheduledPlansApi.md#getManageScheduledPlansById) | **GET** /beta/manageScheduledPlans/{manageScheduledPlansId} | Get a manageScheduledPlans by id
*ManageScheduledPlansApi* | [**getManageScheduledPlansTags**](docs/ManageScheduledPlansApi.md#getManageScheduledPlansTags) | **GET** /beta/manageScheduledPlans/{manageScheduledPlansId}/tag | Get the tags for a manageScheduledPlans.
*ManageScheduledPlansApi* | [**updateManageScheduledPlans**](docs/ManageScheduledPlansApi.md#updateManageScheduledPlans) | **PUT** /beta/manageScheduledPlans | Update a manageScheduledPlans
*OrderApi* | [**addOrder**](docs/OrderApi.md#addOrder) | **POST** /beta/order | Create an order
*OrderApi* | [**addOrderAudit**](docs/OrderApi.md#addOrderAudit) | **PUT** /beta/order/{orderId}/audit/{orderAudit} | Add new audit for an order
*OrderApi* | [**addOrderTag**](docs/OrderApi.md#addOrderTag) | **PUT** /beta/order/{orderId}/tag/{orderTag} | Add new tags for an order.
*OrderApi* | [**applyOrderWarehouseFulfillmentPlan**](docs/OrderApi.md#applyOrderWarehouseFulfillmentPlan) | **POST** /beta/order/applyOrderWarehouseFulfillmentPlan | Run the Apply Order Warehouse Fulfillment Plan method.
*OrderApi* | [**deleteOrder**](docs/OrderApi.md#deleteOrder) | **DELETE** /beta/order/{orderId} | Delete an order
*OrderApi* | [**deleteOrderTag**](docs/OrderApi.md#deleteOrderTag) | **DELETE** /beta/order/{orderId}/tag/{orderTag} | Delete a tag for an order.
*OrderApi* | [**editFulfillmentChannel**](docs/OrderApi.md#editFulfillmentChannel) | **POST** /beta/order/editFulfillmentChannel | Run the EditLineItemFulfillmentStrategy process.
*OrderApi* | [**editLineItems**](docs/OrderApi.md#editLineItems) | **POST** /beta/order/editLineItems | Run the ReqManualSubstitution process.
*OrderApi* | [**getDuplicateOrderById**](docs/OrderApi.md#getDuplicateOrderById) | **GET** /beta/order/duplicate/{orderId} | Get a duplicated an order by id
*OrderApi* | [**getOrderByFilter**](docs/OrderApi.md#getOrderByFilter) | **GET** /beta/order/search | Search orders by filter
*OrderApi* | [**getOrderById**](docs/OrderApi.md#getOrderById) | **GET** /beta/order/{orderId} | Get an order by id
*OrderApi* | [**getOrderTags**](docs/OrderApi.md#getOrderTags) | **GET** /beta/order/{orderId}/tag | Get the tags for an order.
*OrderApi* | [**getOrderWarehouseFulfillmentData**](docs/OrderApi.md#getOrderWarehouseFulfillmentData) | **POST** /beta/order/getOrderWarehouseFulfillmentData | Run the Get Order Warehouse Fulfillment Plan method.
*OrderApi* | [**runFulfillmentPlan**](docs/OrderApi.md#runFulfillmentPlan) | **POST** /beta/order/runFulfillmentPlan | Run the RunFulfillmentPlan process.
*OrderApi* | [**updateOrder**](docs/OrderApi.md#updateOrder) | **PUT** /beta/order | Update an order
*OrderApi* | [**updateOrderCustomFields**](docs/OrderApi.md#updateOrderCustomFields) | **PUT** /beta/order/customFields | Update an order custom fields
*OrderActivityApi* | [**addOrderActivity**](docs/OrderActivityApi.md#addOrderActivity) | **POST** /beta/orderActivity | Create an orderActivity
*OrderActivityApi* | [**addOrderActivityAudit**](docs/OrderActivityApi.md#addOrderActivityAudit) | **PUT** /beta/orderActivity/{orderActivityId}/audit/{orderActivityAudit} | Add new audit for an orderActivity
*OrderActivityApi* | [**addOrderActivityTag**](docs/OrderActivityApi.md#addOrderActivityTag) | **PUT** /beta/orderActivity/{orderActivityId}/tag/{orderActivityTag} | Add new tags for an orderActivity.
*OrderActivityApi* | [**deleteOrderActivity**](docs/OrderActivityApi.md#deleteOrderActivity) | **DELETE** /beta/orderActivity/{orderActivityId} | Delete an orderActivity
*OrderActivityApi* | [**deleteOrderActivityTag**](docs/OrderActivityApi.md#deleteOrderActivityTag) | **DELETE** /beta/orderActivity/{orderActivityId}/tag/{orderActivityTag} | Delete a tag for an orderActivity.
*OrderActivityApi* | [**getDuplicateOrderActivityById**](docs/OrderActivityApi.md#getDuplicateOrderActivityById) | **GET** /beta/orderActivity/duplicate/{orderActivityId} | Get a duplicated an orderActivity by id
*OrderActivityApi* | [**getOrderActivityByFilter**](docs/OrderActivityApi.md#getOrderActivityByFilter) | **GET** /beta/orderActivity/search | Search orderActivitys by filter
*OrderActivityApi* | [**getOrderActivityById**](docs/OrderActivityApi.md#getOrderActivityById) | **GET** /beta/orderActivity/{orderActivityId} | Get an orderActivity by id
*OrderActivityApi* | [**getOrderActivityTags**](docs/OrderActivityApi.md#getOrderActivityTags) | **GET** /beta/orderActivity/{orderActivityId}/tag | Get the tags for an orderActivity.
*OrderActivityApi* | [**updateOrderActivity**](docs/OrderActivityApi.md#updateOrderActivity) | **PUT** /beta/orderActivity | Update an orderActivity
*OrderInvoiceTemplateLineItemDescriptionEnumApi* | [**getOrderInvoiceTemplateLineItemDescriptionEnumById**](docs/OrderInvoiceTemplateLineItemDescriptionEnumApi.md#getOrderInvoiceTemplateLineItemDescriptionEnumById) | **GET** /beta/orderInvoiceTemplateLineItemDescriptionEnum/{orderInvoiceTemplateLineItemDescriptionEnumId} | Get an orderInvoiceTemplateLineItemDescriptionEnum by id
*OrderInvoiceTemplateLineItemDescriptionEnumApi* | [**getOrderInvoiceTemplateLineItemDescriptionEnumBySearchText**](docs/OrderInvoiceTemplateLineItemDescriptionEnumApi.md#getOrderInvoiceTemplateLineItemDescriptionEnumBySearchText) | **GET** /beta/orderInvoiceTemplateLineItemDescriptionEnum/search | Search orderInvoiceTemplateLineItemDescriptionEnums
*OrderLineApi* | [**addOrderLineAudit**](docs/OrderLineApi.md#addOrderLineAudit) | **PUT** /beta/orderLine/{orderLineId}/audit/{orderLineAudit} | Add new audit for an orderLine
*OrderLineApi* | [**addOrderLineTag**](docs/OrderLineApi.md#addOrderLineTag) | **PUT** /beta/orderLine/{orderLineId}/tag/{orderLineTag} | Add new tags for an orderLine.
*OrderLineApi* | [**deleteOrderLineTag**](docs/OrderLineApi.md#deleteOrderLineTag) | **DELETE** /beta/orderLine/{orderLineId}/tag/{orderLineTag} | Delete a tag for an orderLine.
*OrderLineApi* | [**getDuplicateOrderLineById**](docs/OrderLineApi.md#getDuplicateOrderLineById) | **GET** /beta/orderLine/duplicate/{orderLineId} | Get a duplicated an orderLine by id
*OrderLineApi* | [**getOrderLineByFilter**](docs/OrderLineApi.md#getOrderLineByFilter) | **GET** /beta/orderLine/search | Search orderLines by filter
*OrderLineApi* | [**getOrderLineById**](docs/OrderLineApi.md#getOrderLineById) | **GET** /beta/orderLine/{orderLineId} | Get an orderLine by id
*OrderLineApi* | [**getOrderLineTags**](docs/OrderLineApi.md#getOrderLineTags) | **GET** /beta/orderLine/{orderLineId}/tag | Get the tags for an orderLine.
*OrderLineApi* | [**updateOrderLineCustomFields**](docs/OrderLineApi.md#updateOrderLineCustomFields) | **PUT** /beta/orderLine/customFields | Update an orderLine custom fields
*OrderLineActivityApi* | [**addOrderLineActivity**](docs/OrderLineActivityApi.md#addOrderLineActivity) | **POST** /beta/orderLineActivity | Create an orderLineActivity
*OrderLineActivityApi* | [**addOrderLineActivityAudit**](docs/OrderLineActivityApi.md#addOrderLineActivityAudit) | **PUT** /beta/orderLineActivity/{orderLineActivityId}/audit/{orderLineActivityAudit} | Add new audit for an orderLineActivity
*OrderLineActivityApi* | [**addOrderLineActivityTag**](docs/OrderLineActivityApi.md#addOrderLineActivityTag) | **PUT** /beta/orderLineActivity/{orderLineActivityId}/tag/{orderLineActivityTag} | Add new tags for an orderLineActivity.
*OrderLineActivityApi* | [**deleteOrderLineActivity**](docs/OrderLineActivityApi.md#deleteOrderLineActivity) | **DELETE** /beta/orderLineActivity/{orderLineActivityId} | Delete an orderLineActivity
*OrderLineActivityApi* | [**deleteOrderLineActivityTag**](docs/OrderLineActivityApi.md#deleteOrderLineActivityTag) | **DELETE** /beta/orderLineActivity/{orderLineActivityId}/tag/{orderLineActivityTag} | Delete a tag for an orderLineActivity.
*OrderLineActivityApi* | [**getDuplicateOrderLineActivityById**](docs/OrderLineActivityApi.md#getDuplicateOrderLineActivityById) | **GET** /beta/orderLineActivity/duplicate/{orderLineActivityId} | Get a duplicated an orderLineActivity by id
*OrderLineActivityApi* | [**getOrderLineActivityByFilter**](docs/OrderLineActivityApi.md#getOrderLineActivityByFilter) | **GET** /beta/orderLineActivity/search | Search orderLineActivitys by filter
*OrderLineActivityApi* | [**getOrderLineActivityById**](docs/OrderLineActivityApi.md#getOrderLineActivityById) | **GET** /beta/orderLineActivity/{orderLineActivityId} | Get an orderLineActivity by id
*OrderLineActivityApi* | [**getOrderLineActivityTags**](docs/OrderLineActivityApi.md#getOrderLineActivityTags) | **GET** /beta/orderLineActivity/{orderLineActivityId}/tag | Get the tags for an orderLineActivity.
*OrderLineActivityApi* | [**updateOrderLineActivity**](docs/OrderLineActivityApi.md#updateOrderLineActivity) | **PUT** /beta/orderLineActivity | Update an orderLineActivity
*OrderLoadProgramApi* | [**getOrderLoadProgramBySearchText**](docs/OrderLoadProgramApi.md#getOrderLoadProgramBySearchText) | **GET** /beta/orderLoadProgram/search | Search orderLoadPrograms
*OrderLoadProgramApi* | [**getReqLoadProgramById**](docs/OrderLoadProgramApi.md#getReqLoadProgramById) | **GET** /beta/orderLoadProgram/{orderLoadProgramId} | Get an orderLoadProgram by id
*OrderSourceApi* | [**addOrderSource**](docs/OrderSourceApi.md#addOrderSource) | **POST** /beta/orderSource | Create an orderSource
*OrderSourceApi* | [**addOrderSourceAudit**](docs/OrderSourceApi.md#addOrderSourceAudit) | **PUT** /beta/orderSource/{orderSourceId}/audit/{orderSourceAudit} | Add new audit for an orderSource
*OrderSourceApi* | [**addOrderSourceTag**](docs/OrderSourceApi.md#addOrderSourceTag) | **PUT** /beta/orderSource/{orderSourceId}/tag/{orderSourceTag} | Add new tags for an orderSource.
*OrderSourceApi* | [**deleteOrderSource**](docs/OrderSourceApi.md#deleteOrderSource) | **DELETE** /beta/orderSource/{orderSourceId} | Delete an orderSource
*OrderSourceApi* | [**deleteOrderSourceTag**](docs/OrderSourceApi.md#deleteOrderSourceTag) | **DELETE** /beta/orderSource/{orderSourceId}/tag/{orderSourceTag} | Delete a tag for an orderSource.
*OrderSourceApi* | [**getDuplicateOrderSourceById**](docs/OrderSourceApi.md#getDuplicateOrderSourceById) | **GET** /beta/orderSource/duplicate/{orderSourceId} | Get a duplicated an orderSource by id
*OrderSourceApi* | [**getOrderSourceByFilter**](docs/OrderSourceApi.md#getOrderSourceByFilter) | **GET** /beta/orderSource/search | Search orderSources by filter
*OrderSourceApi* | [**getOrderSourceById**](docs/OrderSourceApi.md#getOrderSourceById) | **GET** /beta/orderSource/{orderSourceId} | Get an orderSource by id
*OrderSourceApi* | [**getOrderSourceTags**](docs/OrderSourceApi.md#getOrderSourceTags) | **GET** /beta/orderSource/{orderSourceId}/tag | Get the tags for an orderSource.
*OrderSourceApi* | [**updateOrderSource**](docs/OrderSourceApi.md#updateOrderSource) | **PUT** /beta/orderSource | Update an orderSource
*OrderSourceApi* | [**updateOrderSourceCustomFields**](docs/OrderSourceApi.md#updateOrderSourceCustomFields) | **PUT** /beta/orderSource/customFields | Update an orderSource custom fields
*OrderSourceReservationApi* | [**addOrderSourceReservation**](docs/OrderSourceReservationApi.md#addOrderSourceReservation) | **POST** /beta/orderSourceReservation | Create an orderSourceReservation
*OrderSourceReservationApi* | [**addOrderSourceReservationAudit**](docs/OrderSourceReservationApi.md#addOrderSourceReservationAudit) | **PUT** /beta/orderSourceReservation/{orderSourceReservationId}/audit/{orderSourceReservationAudit} | Add new audit for an orderSourceReservation
*OrderSourceReservationApi* | [**addOrderSourceReservationTag**](docs/OrderSourceReservationApi.md#addOrderSourceReservationTag) | **PUT** /beta/orderSourceReservation/{orderSourceReservationId}/tag/{orderSourceReservationTag} | Add new tags for an orderSourceReservation.
*OrderSourceReservationApi* | [**deleteOrderSourceReservation**](docs/OrderSourceReservationApi.md#deleteOrderSourceReservation) | **DELETE** /beta/orderSourceReservation/{orderSourceReservationId} | Delete an orderSourceReservation
*OrderSourceReservationApi* | [**deleteOrderSourceReservationTag**](docs/OrderSourceReservationApi.md#deleteOrderSourceReservationTag) | **DELETE** /beta/orderSourceReservation/{orderSourceReservationId}/tag/{orderSourceReservationTag} | Delete a tag for an orderSourceReservation.
*OrderSourceReservationApi* | [**getDuplicateOrderSourceReservationById**](docs/OrderSourceReservationApi.md#getDuplicateOrderSourceReservationById) | **GET** /beta/orderSourceReservation/duplicate/{orderSourceReservationId} | Get a duplicated an orderSourceReservation by id
*OrderSourceReservationApi* | [**getOrderSourceReservationByFilter**](docs/OrderSourceReservationApi.md#getOrderSourceReservationByFilter) | **GET** /beta/orderSourceReservation/search | Search orderSourceReservations by filter
*OrderSourceReservationApi* | [**getOrderSourceReservationById**](docs/OrderSourceReservationApi.md#getOrderSourceReservationById) | **GET** /beta/orderSourceReservation/{orderSourceReservationId} | Get an orderSourceReservation by id
*OrderSourceReservationApi* | [**getOrderSourceReservationTags**](docs/OrderSourceReservationApi.md#getOrderSourceReservationTags) | **GET** /beta/orderSourceReservation/{orderSourceReservationId}/tag | Get the tags for an orderSourceReservation.
*OrderSourceReservationApi* | [**updateOrderSourceReservation**](docs/OrderSourceReservationApi.md#updateOrderSourceReservation) | **PUT** /beta/orderSourceReservation | Update an orderSourceReservation
*OrderSourceReservationApi* | [**updateOrderSourceReservationCustomFields**](docs/OrderSourceReservationApi.md#updateOrderSourceReservationCustomFields) | **PUT** /beta/orderSourceReservation/customFields | Update an orderSourceReservation custom fields
*OrderSourceStockStatusApi* | [**addOrderSourceStockStatusAudit**](docs/OrderSourceStockStatusApi.md#addOrderSourceStockStatusAudit) | **PUT** /beta/orderSourceStockStatus/{orderSourceStockStatusId}/audit/{orderSourceStockStatusAudit} | Add new audit for an orderSourceStockStatus
*OrderSourceStockStatusApi* | [**addOrderSourceStockStatusTag**](docs/OrderSourceStockStatusApi.md#addOrderSourceStockStatusTag) | **PUT** /beta/orderSourceStockStatus/{orderSourceStockStatusId}/tag/{orderSourceStockStatusTag} | Add new tags for an orderSourceStockStatus.
*OrderSourceStockStatusApi* | [**deleteOrderSourceStockStatusTag**](docs/OrderSourceStockStatusApi.md#deleteOrderSourceStockStatusTag) | **DELETE** /beta/orderSourceStockStatus/{orderSourceStockStatusId}/tag/{orderSourceStockStatusTag} | Delete a tag for an orderSourceStockStatus.
*OrderSourceStockStatusApi* | [**getDuplicateOrderSourceStockStatusById**](docs/OrderSourceStockStatusApi.md#getDuplicateOrderSourceStockStatusById) | **GET** /beta/orderSourceStockStatus/duplicate/{orderSourceStockStatusId} | Get a duplicated an orderSourceStockStatus by id
*OrderSourceStockStatusApi* | [**getOrderSourceStockStatusByFilter**](docs/OrderSourceStockStatusApi.md#getOrderSourceStockStatusByFilter) | **GET** /beta/orderSourceStockStatus/search | Search orderSourceStockStatuses by filter
*OrderSourceStockStatusApi* | [**getOrderSourceStockStatusById**](docs/OrderSourceStockStatusApi.md#getOrderSourceStockStatusById) | **GET** /beta/orderSourceStockStatus/{orderSourceStockStatusId} | Get an orderSourceStockStatus by id
*OrderSourceStockStatusApi* | [**getOrderSourceStockStatusTags**](docs/OrderSourceStockStatusApi.md#getOrderSourceStockStatusTags) | **GET** /beta/orderSourceStockStatus/{orderSourceStockStatusId}/tag | Get the tags for an orderSourceStockStatus.
*OverrideReturnAddressApi* | [**addOverrideReturnAddress**](docs/OverrideReturnAddressApi.md#addOverrideReturnAddress) | **POST** /beta/overrideReturnAddress | Create an overrideReturnAddress
*OverrideReturnAddressApi* | [**addOverrideReturnAddressAudit**](docs/OverrideReturnAddressApi.md#addOverrideReturnAddressAudit) | **PUT** /beta/overrideReturnAddress/{overrideReturnAddressId}/audit/{overrideReturnAddressAudit} | Add new audit for an overrideReturnAddress
*OverrideReturnAddressApi* | [**addOverrideReturnAddressTag**](docs/OverrideReturnAddressApi.md#addOverrideReturnAddressTag) | **PUT** /beta/overrideReturnAddress/{overrideReturnAddressId}/tag/{overrideReturnAddressTag} | Add new tags for an overrideReturnAddress.
*OverrideReturnAddressApi* | [**deleteOverrideReturnAddress**](docs/OverrideReturnAddressApi.md#deleteOverrideReturnAddress) | **DELETE** /beta/overrideReturnAddress/{overrideReturnAddressId} | Delete an overrideReturnAddress
*OverrideReturnAddressApi* | [**deleteOverrideReturnAddressTag**](docs/OverrideReturnAddressApi.md#deleteOverrideReturnAddressTag) | **DELETE** /beta/overrideReturnAddress/{overrideReturnAddressId}/tag/{overrideReturnAddressTag} | Delete a tag for an overrideReturnAddress.
*OverrideReturnAddressApi* | [**getDuplicateOverrideReturnAddressById**](docs/OverrideReturnAddressApi.md#getDuplicateOverrideReturnAddressById) | **GET** /beta/overrideReturnAddress/duplicate/{overrideReturnAddressId} | Get a duplicated an overrideReturnAddress by id
*OverrideReturnAddressApi* | [**getOverrideReturnAddressByFilter**](docs/OverrideReturnAddressApi.md#getOverrideReturnAddressByFilter) | **GET** /beta/overrideReturnAddress/search | Search overrideReturnAddresses by filter
*OverrideReturnAddressApi* | [**getOverrideReturnAddressById**](docs/OverrideReturnAddressApi.md#getOverrideReturnAddressById) | **GET** /beta/overrideReturnAddress/{overrideReturnAddressId} | Get an overrideReturnAddress by id
*OverrideReturnAddressApi* | [**getOverrideReturnAddressTags**](docs/OverrideReturnAddressApi.md#getOverrideReturnAddressTags) | **GET** /beta/overrideReturnAddress/{overrideReturnAddressId}/tag | Get the tags for an overrideReturnAddress.
*OverrideReturnAddressApi* | [**updateOverrideReturnAddress**](docs/OverrideReturnAddressApi.md#updateOverrideReturnAddress) | **PUT** /beta/overrideReturnAddress | Update an overrideReturnAddress
*OverrideReturnAddressApi* | [**updateOverrideReturnAddressCustomFields**](docs/OverrideReturnAddressApi.md#updateOverrideReturnAddressCustomFields) | **PUT** /beta/overrideReturnAddress/customFields | Update an overrideReturnAddress custom fields
*PackingSlipTemplateLineItemDescriptionEnumApi* | [**getPackingSlipTemplateLineItemDescriptionEnumById**](docs/PackingSlipTemplateLineItemDescriptionEnumApi.md#getPackingSlipTemplateLineItemDescriptionEnumById) | **GET** /beta/packingSlipTemplateLineItemDescriptionEnum/{packingSlipTemplateLineItemDescriptionEnumId} | Get a packingSlipTemplateLineItemDescriptionEnum by id
*PackingSlipTemplateLineItemDescriptionEnumApi* | [**getPackingSlipTemplateLineItemDescriptionEnumBySearchText**](docs/PackingSlipTemplateLineItemDescriptionEnumApi.md#getPackingSlipTemplateLineItemDescriptionEnumBySearchText) | **GET** /beta/packingSlipTemplateLineItemDescriptionEnum/search | Search packingSlipTemplateLineItemDescriptionEnums
*ParcelAccountApi* | [**addParcelAccountAudit**](docs/ParcelAccountApi.md#addParcelAccountAudit) | **PUT** /beta/parcelAccount/{parcelAccountId}/audit/{parcelAccountAudit} | Add new audit for a parcelAccount
*ParcelAccountApi* | [**addParcelAccountTag**](docs/ParcelAccountApi.md#addParcelAccountTag) | **PUT** /beta/parcelAccount/{parcelAccountId}/tag/{parcelAccountTag} | Add new tags for a parcelAccount.
*ParcelAccountApi* | [**deleteParcelAccountTag**](docs/ParcelAccountApi.md#deleteParcelAccountTag) | **DELETE** /beta/parcelAccount/{parcelAccountId}/tag/{parcelAccountTag} | Delete a tag for a parcelAccount.
*ParcelAccountApi* | [**getDuplicateParcelAccountById**](docs/ParcelAccountApi.md#getDuplicateParcelAccountById) | **GET** /beta/parcelAccount/duplicate/{parcelAccountId} | Get a duplicated a parcelAccount by id
*ParcelAccountApi* | [**getParcelAccountByFilter**](docs/ParcelAccountApi.md#getParcelAccountByFilter) | **GET** /beta/parcelAccount/search | Search parcelAccounts by filter
*ParcelAccountApi* | [**getParcelAccountById**](docs/ParcelAccountApi.md#getParcelAccountById) | **GET** /beta/parcelAccount/{parcelAccountId} | Get a parcelAccount by id
*ParcelAccountApi* | [**getParcelAccountTags**](docs/ParcelAccountApi.md#getParcelAccountTags) | **GET** /beta/parcelAccount/{parcelAccountId}/tag | Get the tags for a parcelAccount.
*ParcelAccountApi* | [**updateParcelAccountCustomFields**](docs/ParcelAccountApi.md#updateParcelAccountCustomFields) | **PUT** /beta/parcelAccount/customFields | Update a parcelAccount custom fields
*ParcelInvoiceApi* | [**addParcelInvoiceAudit**](docs/ParcelInvoiceApi.md#addParcelInvoiceAudit) | **PUT** /beta/parcelInvoice/{parcelInvoiceId}/audit/{parcelInvoiceAudit} | Add new audit for a parcelInvoice
*ParcelInvoiceApi* | [**addParcelInvoiceTag**](docs/ParcelInvoiceApi.md#addParcelInvoiceTag) | **PUT** /beta/parcelInvoice/{parcelInvoiceId}/tag/{parcelInvoiceTag} | Add new tags for a parcelInvoice.
*ParcelInvoiceApi* | [**deleteParcelInvoice**](docs/ParcelInvoiceApi.md#deleteParcelInvoice) | **DELETE** /beta/parcelInvoice/{parcelInvoiceId} | Delete a parcelInvoice
*ParcelInvoiceApi* | [**deleteParcelInvoiceTag**](docs/ParcelInvoiceApi.md#deleteParcelInvoiceTag) | **DELETE** /beta/parcelInvoice/{parcelInvoiceId}/tag/{parcelInvoiceTag} | Delete a tag for a parcelInvoice.
*ParcelInvoiceApi* | [**getDuplicateParcelInvoiceById**](docs/ParcelInvoiceApi.md#getDuplicateParcelInvoiceById) | **GET** /beta/parcelInvoice/duplicate/{parcelInvoiceId} | Get a duplicated a parcelInvoice by id
*ParcelInvoiceApi* | [**getParcelInvoiceByFilter**](docs/ParcelInvoiceApi.md#getParcelInvoiceByFilter) | **GET** /beta/parcelInvoice/search | Search parcelInvoices by filter
*ParcelInvoiceApi* | [**getParcelInvoiceById**](docs/ParcelInvoiceApi.md#getParcelInvoiceById) | **GET** /beta/parcelInvoice/{parcelInvoiceId} | Get a parcelInvoice by id
*ParcelInvoiceApi* | [**getParcelInvoiceTags**](docs/ParcelInvoiceApi.md#getParcelInvoiceTags) | **GET** /beta/parcelInvoice/{parcelInvoiceId}/tag | Get the tags for a parcelInvoice.
*ParcelInvoiceLineApi* | [**addParcelInvoiceLineAudit**](docs/ParcelInvoiceLineApi.md#addParcelInvoiceLineAudit) | **PUT** /beta/parcelInvoiceLine/{parcelInvoiceLineId}/audit/{parcelInvoiceLineAudit} | Add new audit for a parcelInvoiceLine
*ParcelInvoiceLineApi* | [**addParcelInvoiceLineTag**](docs/ParcelInvoiceLineApi.md#addParcelInvoiceLineTag) | **PUT** /beta/parcelInvoiceLine/{parcelInvoiceLineId}/tag/{parcelInvoiceLineTag} | Add new tags for a parcelInvoiceLine.
*ParcelInvoiceLineApi* | [**deleteParcelInvoiceLineTag**](docs/ParcelInvoiceLineApi.md#deleteParcelInvoiceLineTag) | **DELETE** /beta/parcelInvoiceLine/{parcelInvoiceLineId}/tag/{parcelInvoiceLineTag} | Delete a tag for a parcelInvoiceLine.
*ParcelInvoiceLineApi* | [**getDuplicateParcelInvoiceLineById**](docs/ParcelInvoiceLineApi.md#getDuplicateParcelInvoiceLineById) | **GET** /beta/parcelInvoiceLine/duplicate/{parcelInvoiceLineId} | Get a duplicated a parcelInvoiceLine by id
*ParcelInvoiceLineApi* | [**getParcelInvoiceLineByFilter**](docs/ParcelInvoiceLineApi.md#getParcelInvoiceLineByFilter) | **GET** /beta/parcelInvoiceLine/search | Search parcelInvoiceLines by filter
*ParcelInvoiceLineApi* | [**getParcelInvoiceLineById**](docs/ParcelInvoiceLineApi.md#getParcelInvoiceLineById) | **GET** /beta/parcelInvoiceLine/{parcelInvoiceLineId} | Get a parcelInvoiceLine by id
*ParcelInvoiceLineApi* | [**getParcelInvoiceLineTags**](docs/ParcelInvoiceLineApi.md#getParcelInvoiceLineTags) | **GET** /beta/parcelInvoiceLine/{parcelInvoiceLineId}/tag | Get the tags for a parcelInvoiceLine.
*ParcelInvoiceLineApi* | [**updateParcelInvoiceLine**](docs/ParcelInvoiceLineApi.md#updateParcelInvoiceLine) | **PUT** /beta/parcelInvoiceLine | Update a parcelInvoiceLine
*PerpetualInventoryLogApi* | [**addPerpetualInventoryLogAudit**](docs/PerpetualInventoryLogApi.md#addPerpetualInventoryLogAudit) | **PUT** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/audit/{perpetualInventoryLogAudit} | Add new audit for a perpetualInventoryLog
*PerpetualInventoryLogApi* | [**addPerpetualInventoryLogTag**](docs/PerpetualInventoryLogApi.md#addPerpetualInventoryLogTag) | **PUT** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/tag/{perpetualInventoryLogTag} | Add new tags for a perpetualInventoryLog.
*PerpetualInventoryLogApi* | [**deletePerpetualInventoryLogTag**](docs/PerpetualInventoryLogApi.md#deletePerpetualInventoryLogTag) | **DELETE** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/tag/{perpetualInventoryLogTag} | Delete a tag for a perpetualInventoryLog.
*PerpetualInventoryLogApi* | [**getDuplicatePerpetualInventoryLogById**](docs/PerpetualInventoryLogApi.md#getDuplicatePerpetualInventoryLogById) | **GET** /beta/perpetualInventoryLog/duplicate/{perpetualInventoryLogId} | Get a duplicated a perpetualInventoryLog by id
*PerpetualInventoryLogApi* | [**getPerpetualInventoryLogByFilter**](docs/PerpetualInventoryLogApi.md#getPerpetualInventoryLogByFilter) | **GET** /beta/perpetualInventoryLog/search | Search perpetualInventoryLogs by filter
*PerpetualInventoryLogApi* | [**getPerpetualInventoryLogById**](docs/PerpetualInventoryLogApi.md#getPerpetualInventoryLogById) | **GET** /beta/perpetualInventoryLog/{perpetualInventoryLogId} | Get a perpetualInventoryLog by id
*PerpetualInventoryLogApi* | [**getPerpetualInventoryLogTags**](docs/PerpetualInventoryLogApi.md#getPerpetualInventoryLogTags) | **GET** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/tag | Get the tags for a perpetualInventoryLog.
*PickFaceAssignmentApi* | [**addPickFaceAssignment**](docs/PickFaceAssignmentApi.md#addPickFaceAssignment) | **POST** /beta/pickFaceAssignment | Create a pickFaceAssignment
*PickFaceAssignmentApi* | [**addPickFaceAssignmentAudit**](docs/PickFaceAssignmentApi.md#addPickFaceAssignmentAudit) | **PUT** /beta/pickFaceAssignment/{pickFaceAssignmentId}/audit/{pickFaceAssignmentAudit} | Add new audit for a pickFaceAssignment
*PickFaceAssignmentApi* | [**addPickFaceAssignmentTag**](docs/PickFaceAssignmentApi.md#addPickFaceAssignmentTag) | **PUT** /beta/pickFaceAssignment/{pickFaceAssignmentId}/tag/{pickFaceAssignmentTag} | Add new tags for a pickFaceAssignment.
*PickFaceAssignmentApi* | [**deletePickFaceAssignment**](docs/PickFaceAssignmentApi.md#deletePickFaceAssignment) | **DELETE** /beta/pickFaceAssignment/{pickFaceAssignmentId} | Delete a pickFaceAssignment
*PickFaceAssignmentApi* | [**deletePickFaceAssignmentTag**](docs/PickFaceAssignmentApi.md#deletePickFaceAssignmentTag) | **DELETE** /beta/pickFaceAssignment/{pickFaceAssignmentId}/tag/{pickFaceAssignmentTag} | Delete a tag for a pickFaceAssignment.
*PickFaceAssignmentApi* | [**getDuplicatePickFaceAssignmentById**](docs/PickFaceAssignmentApi.md#getDuplicatePickFaceAssignmentById) | **GET** /beta/pickFaceAssignment/duplicate/{pickFaceAssignmentId} | Get a duplicated a pickFaceAssignment by id
*PickFaceAssignmentApi* | [**getPickFaceAssignmentByFilter**](docs/PickFaceAssignmentApi.md#getPickFaceAssignmentByFilter) | **GET** /beta/pickFaceAssignment/search | Search pickFaceAssignments by filter
*PickFaceAssignmentApi* | [**getPickFaceAssignmentById**](docs/PickFaceAssignmentApi.md#getPickFaceAssignmentById) | **GET** /beta/pickFaceAssignment/{pickFaceAssignmentId} | Get a pickFaceAssignment by id
*PickFaceAssignmentApi* | [**getPickFaceAssignmentTags**](docs/PickFaceAssignmentApi.md#getPickFaceAssignmentTags) | **GET** /beta/pickFaceAssignment/{pickFaceAssignmentId}/tag | Get the tags for a pickFaceAssignment.
*PickFaceAssignmentApi* | [**updatePickFaceAssignment**](docs/PickFaceAssignmentApi.md#updatePickFaceAssignment) | **PUT** /beta/pickFaceAssignment | Update a pickFaceAssignment
*PickFaceAssignmentApi* | [**updatePickFaceAssignmentCustomFields**](docs/PickFaceAssignmentApi.md#updatePickFaceAssignmentCustomFields) | **PUT** /beta/pickFaceAssignment/customFields | Update a pickFaceAssignment custom fields
*PredefinedCartonApi* | [**getPredefinedCartonById**](docs/PredefinedCartonApi.md#getPredefinedCartonById) | **GET** /beta/predefinedCarton/{predefinedCartonId} | Get a predefinedCarton by id
*PredefinedCartonApi* | [**getPredefinedCartonBySearchText**](docs/PredefinedCartonApi.md#getPredefinedCartonBySearchText) | **GET** /beta/predefinedCarton/search | Search predefinedCartons
*ProductTypeApi* | [**getProductTypeById**](docs/ProductTypeApi.md#getProductTypeById) | **GET** /beta/productType/{productTypeId} | Get a productType by id
*ProductTypeApi* | [**getProductTypeBySearchText**](docs/ProductTypeApi.md#getProductTypeBySearchText) | **GET** /beta/productType/search | Search productTypes
*ProductionLotApi* | [**addProductionLot**](docs/ProductionLotApi.md#addProductionLot) | **POST** /beta/productionLot | Create a productionLot
*ProductionLotApi* | [**addProductionLotAudit**](docs/ProductionLotApi.md#addProductionLotAudit) | **PUT** /beta/productionLot/{productionLotId}/audit/{productionLotAudit} | Add new audit for a productionLot
*ProductionLotApi* | [**addProductionLotTag**](docs/ProductionLotApi.md#addProductionLotTag) | **PUT** /beta/productionLot/{productionLotId}/tag/{productionLotTag} | Add new tags for a productionLot.
*ProductionLotApi* | [**deleteProductionLot**](docs/ProductionLotApi.md#deleteProductionLot) | **DELETE** /beta/productionLot/{productionLotId} | Delete a productionLot
*ProductionLotApi* | [**deleteProductionLotTag**](docs/ProductionLotApi.md#deleteProductionLotTag) | **DELETE** /beta/productionLot/{productionLotId}/tag/{productionLotTag} | Delete a tag for a productionLot.
*ProductionLotApi* | [**getDuplicateProductionLotById**](docs/ProductionLotApi.md#getDuplicateProductionLotById) | **GET** /beta/productionLot/duplicate/{productionLotId} | Get a duplicated a productionLot by id
*ProductionLotApi* | [**getProductionLotByFilter**](docs/ProductionLotApi.md#getProductionLotByFilter) | **GET** /beta/productionLot/search | Search productionLots by filter
*ProductionLotApi* | [**getProductionLotById**](docs/ProductionLotApi.md#getProductionLotById) | **GET** /beta/productionLot/{productionLotId} | Get a productionLot by id
*ProductionLotApi* | [**getProductionLotTags**](docs/ProductionLotApi.md#getProductionLotTags) | **GET** /beta/productionLot/{productionLotId}/tag | Get the tags for a productionLot.
*ProductionLotApi* | [**updateProductionLot**](docs/ProductionLotApi.md#updateProductionLot) | **PUT** /beta/productionLot | Update a productionLot
*ProductionLotApi* | [**updateProductionLotCustomFields**](docs/ProductionLotApi.md#updateProductionLotCustomFields) | **PUT** /beta/productionLot/customFields | Update a productionLot custom fields
*QuickAdjustmentApi* | [**addQuickAdjustment**](docs/QuickAdjustmentApi.md#addQuickAdjustment) | **POST** /beta/quickAdjustment | Create a quickAdjustment
*QuickAdjustmentApi* | [**addQuickAdjustmentAudit**](docs/QuickAdjustmentApi.md#addQuickAdjustmentAudit) | **PUT** /beta/quickAdjustment/{quickAdjustmentId}/audit/{quickAdjustmentAudit} | Add new audit for a quickAdjustment
*QuickAdjustmentApi* | [**addQuickAdjustmentTag**](docs/QuickAdjustmentApi.md#addQuickAdjustmentTag) | **PUT** /beta/quickAdjustment/{quickAdjustmentId}/tag/{quickAdjustmentTag} | Add new tags for a quickAdjustment.
*QuickAdjustmentApi* | [**deleteQuickAdjustment**](docs/QuickAdjustmentApi.md#deleteQuickAdjustment) | **DELETE** /beta/quickAdjustment/{quickAdjustmentId} | Delete a quickAdjustment
*QuickAdjustmentApi* | [**deleteQuickAdjustmentTag**](docs/QuickAdjustmentApi.md#deleteQuickAdjustmentTag) | **DELETE** /beta/quickAdjustment/{quickAdjustmentId}/tag/{quickAdjustmentTag} | Delete a tag for a quickAdjustment.
*QuickAdjustmentApi* | [**executeQuickAdjustment**](docs/QuickAdjustmentApi.md#executeQuickAdjustment) | **POST** /beta/quickAdjustment/executeQuickAdjustment | Run the ExecuteQuickAdjustment process.
*QuickAdjustmentApi* | [**getDuplicateQuickAdjustmentById**](docs/QuickAdjustmentApi.md#getDuplicateQuickAdjustmentById) | **GET** /beta/quickAdjustment/duplicate/{quickAdjustmentId} | Get a duplicated a quickAdjustment by id
*QuickAdjustmentApi* | [**getQuickAdjustmentByFilter**](docs/QuickAdjustmentApi.md#getQuickAdjustmentByFilter) | **GET** /beta/quickAdjustment/search | Search quickAdjustments by filter
*QuickAdjustmentApi* | [**getQuickAdjustmentById**](docs/QuickAdjustmentApi.md#getQuickAdjustmentById) | **GET** /beta/quickAdjustment/{quickAdjustmentId} | Get a quickAdjustment by id
*QuickAdjustmentApi* | [**getQuickAdjustmentTags**](docs/QuickAdjustmentApi.md#getQuickAdjustmentTags) | **GET** /beta/quickAdjustment/{quickAdjustmentId}/tag | Get the tags for a quickAdjustment.
*QuickAdjustmentApi* | [**updateQuickAdjustment**](docs/QuickAdjustmentApi.md#updateQuickAdjustment) | **PUT** /beta/quickAdjustment | Update a quickAdjustment
*QuickAdjustmentApi* | [**updateQuickAdjustmentCustomFields**](docs/QuickAdjustmentApi.md#updateQuickAdjustmentCustomFields) | **PUT** /beta/quickAdjustment/customFields | Update a quickAdjustment custom fields
*QuickReceiptApi* | [**addQuickReceipt**](docs/QuickReceiptApi.md#addQuickReceipt) | **POST** /beta/quickReceipt | Create a quickReceipt
*QuickReceiptApi* | [**addQuickReceiptAudit**](docs/QuickReceiptApi.md#addQuickReceiptAudit) | **PUT** /beta/quickReceipt/{quickReceiptId}/audit/{quickReceiptAudit} | Add new audit for a quickReceipt
*QuickReceiptApi* | [**addQuickReceiptTag**](docs/QuickReceiptApi.md#addQuickReceiptTag) | **PUT** /beta/quickReceipt/{quickReceiptId}/tag/{quickReceiptTag} | Add new tags for a quickReceipt.
*QuickReceiptApi* | [**deleteQuickReceipt**](docs/QuickReceiptApi.md#deleteQuickReceipt) | **DELETE** /beta/quickReceipt/{quickReceiptId} | Delete a quickReceipt
*QuickReceiptApi* | [**deleteQuickReceiptTag**](docs/QuickReceiptApi.md#deleteQuickReceiptTag) | **DELETE** /beta/quickReceipt/{quickReceiptId}/tag/{quickReceiptTag} | Delete a tag for a quickReceipt.
*QuickReceiptApi* | [**executeQuickReceipt**](docs/QuickReceiptApi.md#executeQuickReceipt) | **POST** /beta/quickReceipt/executeQuickReceipt | Run the ExecuteQuickReceipt process.
*QuickReceiptApi* | [**getDuplicateQuickReceiptById**](docs/QuickReceiptApi.md#getDuplicateQuickReceiptById) | **GET** /beta/quickReceipt/duplicate/{quickReceiptId} | Get a duplicated a quickReceipt by id
*QuickReceiptApi* | [**getQuickReceiptByFilter**](docs/QuickReceiptApi.md#getQuickReceiptByFilter) | **GET** /beta/quickReceipt/search | Search quickReceipts by filter
*QuickReceiptApi* | [**getQuickReceiptById**](docs/QuickReceiptApi.md#getQuickReceiptById) | **GET** /beta/quickReceipt/{quickReceiptId} | Get a quickReceipt by id
*QuickReceiptApi* | [**getQuickReceiptTags**](docs/QuickReceiptApi.md#getQuickReceiptTags) | **GET** /beta/quickReceipt/{quickReceiptId}/tag | Get the tags for a quickReceipt.
*QuickReceiptApi* | [**updateQuickReceipt**](docs/QuickReceiptApi.md#updateQuickReceipt) | **PUT** /beta/quickReceipt | Update a quickReceipt
*QuickReceiptApi* | [**updateQuickReceiptCustomFields**](docs/QuickReceiptApi.md#updateQuickReceiptCustomFields) | **PUT** /beta/quickReceipt/customFields | Update a quickReceipt custom fields
*ReceivingProcessApi* | [**addReceivingProcessAudit**](docs/ReceivingProcessApi.md#addReceivingProcessAudit) | **PUT** /beta/receivingProcess/{receivingProcessId}/audit/{receivingProcessAudit} | Add new audit for a receivingProcess
*ReceivingProcessApi* | [**addReceivingProcessTag**](docs/ReceivingProcessApi.md#addReceivingProcessTag) | **PUT** /beta/receivingProcess/{receivingProcessId}/tag/{receivingProcessTag} | Add new tags for a receivingProcess.
*ReceivingProcessApi* | [**deleteReceivingProcess**](docs/ReceivingProcessApi.md#deleteReceivingProcess) | **DELETE** /beta/receivingProcess/{receivingProcessId} | Delete a receivingProcess
*ReceivingProcessApi* | [**deleteReceivingProcessTag**](docs/ReceivingProcessApi.md#deleteReceivingProcessTag) | **DELETE** /beta/receivingProcess/{receivingProcessId}/tag/{receivingProcessTag} | Delete a tag for a receivingProcess.
*ReceivingProcessApi* | [**getDuplicateReceivingProcessById**](docs/ReceivingProcessApi.md#getDuplicateReceivingProcessById) | **GET** /beta/receivingProcess/duplicate/{receivingProcessId} | Get a duplicated a receivingProcess by id
*ReceivingProcessApi* | [**getReceivingProcessByFilter**](docs/ReceivingProcessApi.md#getReceivingProcessByFilter) | **GET** /beta/receivingProcess/search | Search receivingProcesses by filter
*ReceivingProcessApi* | [**getReceivingProcessById**](docs/ReceivingProcessApi.md#getReceivingProcessById) | **GET** /beta/receivingProcess/{receivingProcessId} | Get a receivingProcess by id
*ReceivingProcessApi* | [**getReceivingProcessTags**](docs/ReceivingProcessApi.md#getReceivingProcessTags) | **GET** /beta/receivingProcess/{receivingProcessId}/tag | Get the tags for a receivingProcess.
*ReceivingProcessApi* | [**updateReceivingProcessCustomFields**](docs/ReceivingProcessApi.md#updateReceivingProcessCustomFields) | **PUT** /beta/receivingProcess/customFields | Update a receivingProcess custom fields
*ReceivingWorksheetApi* | [**addReceivingWorksheet**](docs/ReceivingWorksheetApi.md#addReceivingWorksheet) | **POST** /beta/receivingWorksheet | Create a receivingWorksheet
*ReceivingWorksheetApi* | [**addReceivingWorksheetAudit**](docs/ReceivingWorksheetApi.md#addReceivingWorksheetAudit) | **PUT** /beta/receivingWorksheet/{receivingWorksheetId}/audit/{receivingWorksheetAudit} | Add new audit for a receivingWorksheet
*ReceivingWorksheetApi* | [**addReceivingWorksheetTag**](docs/ReceivingWorksheetApi.md#addReceivingWorksheetTag) | **PUT** /beta/receivingWorksheet/{receivingWorksheetId}/tag/{receivingWorksheetTag} | Add new tags for a receivingWorksheet.
*ReceivingWorksheetApi* | [**deleteReceivingWorksheet**](docs/ReceivingWorksheetApi.md#deleteReceivingWorksheet) | **DELETE** /beta/receivingWorksheet/{receivingWorksheetId} | Delete a receivingWorksheet
*ReceivingWorksheetApi* | [**deleteReceivingWorksheetTag**](docs/ReceivingWorksheetApi.md#deleteReceivingWorksheetTag) | **DELETE** /beta/receivingWorksheet/{receivingWorksheetId}/tag/{receivingWorksheetTag} | Delete a tag for a receivingWorksheet.
*ReceivingWorksheetApi* | [**getDuplicateReceivingWorksheetById**](docs/ReceivingWorksheetApi.md#getDuplicateReceivingWorksheetById) | **GET** /beta/receivingWorksheet/duplicate/{receivingWorksheetId} | Get a duplicated a receivingWorksheet by id
*ReceivingWorksheetApi* | [**getReceivingWorksheetByFilter**](docs/ReceivingWorksheetApi.md#getReceivingWorksheetByFilter) | **GET** /beta/receivingWorksheet/search | Search receivingWorksheets by filter
*ReceivingWorksheetApi* | [**getReceivingWorksheetById**](docs/ReceivingWorksheetApi.md#getReceivingWorksheetById) | **GET** /beta/receivingWorksheet/{receivingWorksheetId} | Get a receivingWorksheet by id
*ReceivingWorksheetApi* | [**getReceivingWorksheetTags**](docs/ReceivingWorksheetApi.md#getReceivingWorksheetTags) | **GET** /beta/receivingWorksheet/{receivingWorksheetId}/tag | Get the tags for a receivingWorksheet.
*ReceivingWorksheetApi* | [**updateReceivingWorksheet**](docs/ReceivingWorksheetApi.md#updateReceivingWorksheet) | **PUT** /beta/receivingWorksheet | Update a receivingWorksheet
*ReceivingWorksheetApi* | [**updateReceivingWorksheetCustomFields**](docs/ReceivingWorksheetApi.md#updateReceivingWorksheetCustomFields) | **PUT** /beta/receivingWorksheet/customFields | Update a receivingWorksheet custom fields
*ReplenishmentApi* | [**addReplenishmentAudit**](docs/ReplenishmentApi.md#addReplenishmentAudit) | **PUT** /beta/replenishment/{replenishmentId}/audit/{replenishmentAudit} | Add new audit for a replenishment
*ReplenishmentApi* | [**addReplenishmentTag**](docs/ReplenishmentApi.md#addReplenishmentTag) | **PUT** /beta/replenishment/{replenishmentId}/tag/{replenishmentTag} | Add new tags for a replenishment.
*ReplenishmentApi* | [**deleteReplenishmentTag**](docs/ReplenishmentApi.md#deleteReplenishmentTag) | **DELETE** /beta/replenishment/{replenishmentId}/tag/{replenishmentTag} | Delete a tag for a replenishment.
*ReplenishmentApi* | [**getDuplicateReplenishmentById**](docs/ReplenishmentApi.md#getDuplicateReplenishmentById) | **GET** /beta/replenishment/duplicate/{replenishmentId} | Get a duplicated a replenishment by id
*ReplenishmentApi* | [**getReplenishmentByFilter**](docs/ReplenishmentApi.md#getReplenishmentByFilter) | **GET** /beta/replenishment/search | Search replenishments by filter
*ReplenishmentApi* | [**getReplenishmentById**](docs/ReplenishmentApi.md#getReplenishmentById) | **GET** /beta/replenishment/{replenishmentId} | Get a replenishment by id
*ReplenishmentApi* | [**getReplenishmentTags**](docs/ReplenishmentApi.md#getReplenishmentTags) | **GET** /beta/replenishment/{replenishmentId}/tag | Get the tags for a replenishment.
*ReplenishmentApi* | [**updateReplenishmentCustomFields**](docs/ReplenishmentApi.md#updateReplenishmentCustomFields) | **PUT** /beta/replenishment/customFields | Update a replenishment custom fields
*ReplenishmentPlanApi* | [**addReplenishmentPlan**](docs/ReplenishmentPlanApi.md#addReplenishmentPlan) | **POST** /beta/replenishmentPlan | Create a replenishmentPlan
*ReplenishmentPlanApi* | [**addReplenishmentPlanAudit**](docs/ReplenishmentPlanApi.md#addReplenishmentPlanAudit) | **PUT** /beta/replenishmentPlan/{replenishmentPlanId}/audit/{replenishmentPlanAudit} | Add new audit for a replenishmentPlan
*ReplenishmentPlanApi* | [**addReplenishmentPlanTag**](docs/ReplenishmentPlanApi.md#addReplenishmentPlanTag) | **PUT** /beta/replenishmentPlan/{replenishmentPlanId}/tag/{replenishmentPlanTag} | Add new tags for a replenishmentPlan.
*ReplenishmentPlanApi* | [**deleteReplenishmentPlan**](docs/ReplenishmentPlanApi.md#deleteReplenishmentPlan) | **DELETE** /beta/replenishmentPlan/{replenishmentPlanId} | Delete a replenishmentPlan
*ReplenishmentPlanApi* | [**deleteReplenishmentPlanTag**](docs/ReplenishmentPlanApi.md#deleteReplenishmentPlanTag) | **DELETE** /beta/replenishmentPlan/{replenishmentPlanId}/tag/{replenishmentPlanTag} | Delete a tag for a replenishmentPlan.
*ReplenishmentPlanApi* | [**getDuplicateReplenishmentPlanById**](docs/ReplenishmentPlanApi.md#getDuplicateReplenishmentPlanById) | **GET** /beta/replenishmentPlan/duplicate/{replenishmentPlanId} | Get a duplicated a replenishmentPlan by id
*ReplenishmentPlanApi* | [**getReplenishmentPlanByFilter**](docs/ReplenishmentPlanApi.md#getReplenishmentPlanByFilter) | **GET** /beta/replenishmentPlan/search | Search replenishmentPlans by filter
*ReplenishmentPlanApi* | [**getReplenishmentPlanById**](docs/ReplenishmentPlanApi.md#getReplenishmentPlanById) | **GET** /beta/replenishmentPlan/{replenishmentPlanId} | Get a replenishmentPlan by id
*ReplenishmentPlanApi* | [**getReplenishmentPlanTags**](docs/ReplenishmentPlanApi.md#getReplenishmentPlanTags) | **GET** /beta/replenishmentPlan/{replenishmentPlanId}/tag | Get the tags for a replenishmentPlan.
*ReplenishmentPlanApi* | [**updateReplenishmentPlan**](docs/ReplenishmentPlanApi.md#updateReplenishmentPlan) | **PUT** /beta/replenishmentPlan | Update a replenishmentPlan
*ReplenishmentPlanApi* | [**updateReplenishmentPlanCustomFields**](docs/ReplenishmentPlanApi.md#updateReplenishmentPlanCustomFields) | **PUT** /beta/replenishmentPlan/customFields | Update a replenishmentPlan custom fields
*ReplenishmentProcessApi* | [**addReplenishmentProcessAudit**](docs/ReplenishmentProcessApi.md#addReplenishmentProcessAudit) | **PUT** /beta/replenishmentProcess/{replenishmentProcessId}/audit/{replenishmentProcessAudit} | Add new audit for a replenishmentProcess
*ReplenishmentProcessApi* | [**addReplenishmentProcessTag**](docs/ReplenishmentProcessApi.md#addReplenishmentProcessTag) | **PUT** /beta/replenishmentProcess/{replenishmentProcessId}/tag/{replenishmentProcessTag} | Add new tags for a replenishmentProcess.
*ReplenishmentProcessApi* | [**deleteReplenishmentProcessTag**](docs/ReplenishmentProcessApi.md#deleteReplenishmentProcessTag) | **DELETE** /beta/replenishmentProcess/{replenishmentProcessId}/tag/{replenishmentProcessTag} | Delete a tag for a replenishmentProcess.
*ReplenishmentProcessApi* | [**getDuplicateReplenishmentProcessById**](docs/ReplenishmentProcessApi.md#getDuplicateReplenishmentProcessById) | **GET** /beta/replenishmentProcess/duplicate/{replenishmentProcessId} | Get a duplicated a replenishmentProcess by id
*ReplenishmentProcessApi* | [**getReplenishmentProcessByFilter**](docs/ReplenishmentProcessApi.md#getReplenishmentProcessByFilter) | **GET** /beta/replenishmentProcess/search | Search replenishmentProcesses by filter
*ReplenishmentProcessApi* | [**getReplenishmentProcessById**](docs/ReplenishmentProcessApi.md#getReplenishmentProcessById) | **GET** /beta/replenishmentProcess/{replenishmentProcessId} | Get a replenishmentProcess by id
*ReplenishmentProcessApi* | [**getReplenishmentProcessTags**](docs/ReplenishmentProcessApi.md#getReplenishmentProcessTags) | **GET** /beta/replenishmentProcess/{replenishmentProcessId}/tag | Get the tags for a replenishmentProcess.
*ReplenishmentProcessApi* | [**updateReplenishmentProcessCustomFields**](docs/ReplenishmentProcessApi.md#updateReplenishmentProcessCustomFields) | **PUT** /beta/replenishmentProcess/customFields | Update a replenishmentProcess custom fields
*ScheduledPlanLogApi* | [**addScheduledPlanLogAudit**](docs/ScheduledPlanLogApi.md#addScheduledPlanLogAudit) | **PUT** /beta/scheduledPlanLog/{scheduledPlanLogId}/audit/{scheduledPlanLogAudit} | Add new audit for a scheduledPlanLog
*ScheduledPlanLogApi* | [**addScheduledPlanLogTag**](docs/ScheduledPlanLogApi.md#addScheduledPlanLogTag) | **PUT** /beta/scheduledPlanLog/{scheduledPlanLogId}/tag/{scheduledPlanLogTag} | Add new tags for a scheduledPlanLog.
*ScheduledPlanLogApi* | [**deleteScheduledPlanLogTag**](docs/ScheduledPlanLogApi.md#deleteScheduledPlanLogTag) | **DELETE** /beta/scheduledPlanLog/{scheduledPlanLogId}/tag/{scheduledPlanLogTag} | Delete a tag for a scheduledPlanLog.
*ScheduledPlanLogApi* | [**getDuplicateScheduledPlanLogById**](docs/ScheduledPlanLogApi.md#getDuplicateScheduledPlanLogById) | **GET** /beta/scheduledPlanLog/duplicate/{scheduledPlanLogId} | Get a duplicated a scheduledPlanLog by id
*ScheduledPlanLogApi* | [**getScheduledPlanLogByFilter**](docs/ScheduledPlanLogApi.md#getScheduledPlanLogByFilter) | **GET** /beta/scheduledPlanLog/search | Search scheduledPlanLogs by filter
*ScheduledPlanLogApi* | [**getScheduledPlanLogById**](docs/ScheduledPlanLogApi.md#getScheduledPlanLogById) | **GET** /beta/scheduledPlanLog/{scheduledPlanLogId} | Get a scheduledPlanLog by id
*ScheduledPlanLogApi* | [**getScheduledPlanLogTags**](docs/ScheduledPlanLogApi.md#getScheduledPlanLogTags) | **GET** /beta/scheduledPlanLog/{scheduledPlanLogId}/tag | Get the tags for a scheduledPlanLog.
*ServiceTypeApi* | [**getServiceTypeById**](docs/ServiceTypeApi.md#getServiceTypeById) | **GET** /beta/serviceType/{serviceTypeId} | Get a serviceType by id
*ServiceTypeApi* | [**getServiceTypeBySearchText**](docs/ServiceTypeApi.md#getServiceTypeBySearchText) | **GET** /beta/serviceType/search | Search serviceTypes
*ShipmentApi* | [**addShipmentAudit**](docs/ShipmentApi.md#addShipmentAudit) | **PUT** /beta/shipment/{shipmentId}/audit/{shipmentAudit} | Add new audit for a shipment
*ShipmentApi* | [**addShipmentTag**](docs/ShipmentApi.md#addShipmentTag) | **PUT** /beta/shipment/{shipmentId}/tag/{shipmentTag} | Add new tags for a shipment.
*ShipmentApi* | [**deleteShipmentTag**](docs/ShipmentApi.md#deleteShipmentTag) | **DELETE** /beta/shipment/{shipmentId}/tag/{shipmentTag} | Delete a tag for a shipment.
*ShipmentApi* | [**getDuplicateShipmentById**](docs/ShipmentApi.md#getDuplicateShipmentById) | **GET** /beta/shipment/duplicate/{shipmentId} | Get a duplicated a shipment by id
*ShipmentApi* | [**getShipmentByFilter**](docs/ShipmentApi.md#getShipmentByFilter) | **GET** /beta/shipment/search | Search shipments by filter
*ShipmentApi* | [**getShipmentById**](docs/ShipmentApi.md#getShipmentById) | **GET** /beta/shipment/{shipmentId} | Get a shipment by id
*ShipmentApi* | [**getShipmentTags**](docs/ShipmentApi.md#getShipmentTags) | **GET** /beta/shipment/{shipmentId}/tag | Get the tags for a shipment.
*ShipmentApi* | [**updateShipmentCustomFields**](docs/ShipmentApi.md#updateShipmentCustomFields) | **PUT** /beta/shipment/customFields | Update a shipment custom fields
*ShoppingCartConnectionApi* | [**addShoppingCartConnection**](docs/ShoppingCartConnectionApi.md#addShoppingCartConnection) | **POST** /beta/shoppingCartConnection | Create a shoppingCartConnection
*ShoppingCartConnectionApi* | [**addShoppingCartConnectionAudit**](docs/ShoppingCartConnectionApi.md#addShoppingCartConnectionAudit) | **PUT** /beta/shoppingCartConnection/{shoppingCartConnectionId}/audit/{shoppingCartConnectionAudit} | Add new audit for a shoppingCartConnection
*ShoppingCartConnectionApi* | [**addShoppingCartConnectionTag**](docs/ShoppingCartConnectionApi.md#addShoppingCartConnectionTag) | **PUT** /beta/shoppingCartConnection/{shoppingCartConnectionId}/tag/{shoppingCartConnectionTag} | Add new tags for a shoppingCartConnection.
*ShoppingCartConnectionApi* | [**deleteShoppingCartConnection**](docs/ShoppingCartConnectionApi.md#deleteShoppingCartConnection) | **DELETE** /beta/shoppingCartConnection/{shoppingCartConnectionId} | Delete a shoppingCartConnection
*ShoppingCartConnectionApi* | [**deleteShoppingCartConnectionTag**](docs/ShoppingCartConnectionApi.md#deleteShoppingCartConnectionTag) | **DELETE** /beta/shoppingCartConnection/{shoppingCartConnectionId}/tag/{shoppingCartConnectionTag} | Delete a tag for a shoppingCartConnection.
*ShoppingCartConnectionApi* | [**getDuplicateShoppingCartConnectionById**](docs/ShoppingCartConnectionApi.md#getDuplicateShoppingCartConnectionById) | **GET** /beta/shoppingCartConnection/duplicate/{shoppingCartConnectionId} | Get a duplicated a shoppingCartConnection by id
*ShoppingCartConnectionApi* | [**getShoppingCartConnectionByFilter**](docs/ShoppingCartConnectionApi.md#getShoppingCartConnectionByFilter) | **GET** /beta/shoppingCartConnection/search | Search shoppingCartConnections by filter
*ShoppingCartConnectionApi* | [**getShoppingCartConnectionById**](docs/ShoppingCartConnectionApi.md#getShoppingCartConnectionById) | **GET** /beta/shoppingCartConnection/{shoppingCartConnectionId} | Get a shoppingCartConnection by id
*ShoppingCartConnectionApi* | [**getShoppingCartConnectionTags**](docs/ShoppingCartConnectionApi.md#getShoppingCartConnectionTags) | **GET** /beta/shoppingCartConnection/{shoppingCartConnectionId}/tag | Get the tags for a shoppingCartConnection.
*ShoppingCartConnectionApi* | [**updateShoppingCartConnection**](docs/ShoppingCartConnectionApi.md#updateShoppingCartConnection) | **PUT** /beta/shoppingCartConnection | Update a shoppingCartConnection
*ShoppingCartConnectionApi* | [**updateShoppingCartConnectionCustomFields**](docs/ShoppingCartConnectionApi.md#updateShoppingCartConnectionCustomFields) | **PUT** /beta/shoppingCartConnection/customFields | Update a shoppingCartConnection custom fields
*SlaSetupApi* | [**addSlaSetupAudit**](docs/SlaSetupApi.md#addSlaSetupAudit) | **PUT** /beta/slaSetup/{slaSetupId}/audit/{slaSetupAudit} | Add new audit for a slaSetup
*SlaSetupApi* | [**addSlaSetupTag**](docs/SlaSetupApi.md#addSlaSetupTag) | **PUT** /beta/slaSetup/{slaSetupId}/tag/{slaSetupTag} | Add new tags for a slaSetup.
*SlaSetupApi* | [**deleteSlaSetupTag**](docs/SlaSetupApi.md#deleteSlaSetupTag) | **DELETE** /beta/slaSetup/{slaSetupId}/tag/{slaSetupTag} | Delete a tag for a slaSetup.
*SlaSetupApi* | [**getDuplicateSlaSetupById**](docs/SlaSetupApi.md#getDuplicateSlaSetupById) | **GET** /beta/slaSetup/duplicate/{slaSetupId} | Get a duplicated a slaSetup by id
*SlaSetupApi* | [**getSlaSetupByFilter**](docs/SlaSetupApi.md#getSlaSetupByFilter) | **GET** /beta/slaSetup/search | Search slaSetups by filter
*SlaSetupApi* | [**getSlaSetupById**](docs/SlaSetupApi.md#getSlaSetupById) | **GET** /beta/slaSetup/{slaSetupId} | Get a slaSetup by id
*SlaSetupApi* | [**getSlaSetupTags**](docs/SlaSetupApi.md#getSlaSetupTags) | **GET** /beta/slaSetup/{slaSetupId}/tag | Get the tags for a slaSetup.
*SubstitutionApi* | [**addSubstitution**](docs/SubstitutionApi.md#addSubstitution) | **POST** /beta/substitution | Create a substitution
*SubstitutionApi* | [**addSubstitutionAudit**](docs/SubstitutionApi.md#addSubstitutionAudit) | **PUT** /beta/substitution/{substitutionId}/audit/{substitutionAudit} | Add new audit for a substitution
*SubstitutionApi* | [**addSubstitutionTag**](docs/SubstitutionApi.md#addSubstitutionTag) | **PUT** /beta/substitution/{substitutionId}/tag/{substitutionTag} | Add new tags for a substitution.
*SubstitutionApi* | [**deleteSubstitution**](docs/SubstitutionApi.md#deleteSubstitution) | **DELETE** /beta/substitution/{substitutionId} | Delete a substitution
*SubstitutionApi* | [**deleteSubstitutionTag**](docs/SubstitutionApi.md#deleteSubstitutionTag) | **DELETE** /beta/substitution/{substitutionId}/tag/{substitutionTag} | Delete a tag for a substitution.
*SubstitutionApi* | [**getDuplicateSubstitutionById**](docs/SubstitutionApi.md#getDuplicateSubstitutionById) | **GET** /beta/substitution/duplicate/{substitutionId} | Get a duplicated a substitution by id
*SubstitutionApi* | [**getSubstitutionByFilter**](docs/SubstitutionApi.md#getSubstitutionByFilter) | **GET** /beta/substitution/search | Search substitutions by filter
*SubstitutionApi* | [**getSubstitutionById**](docs/SubstitutionApi.md#getSubstitutionById) | **GET** /beta/substitution/{substitutionId} | Get a substitution by id
*SubstitutionApi* | [**getSubstitutionTags**](docs/SubstitutionApi.md#getSubstitutionTags) | **GET** /beta/substitution/{substitutionId}/tag | Get the tags for a substitution.
*SubstitutionApi* | [**updateSubstitution**](docs/SubstitutionApi.md#updateSubstitution) | **PUT** /beta/substitution | Update a substitution
*SubstitutionApi* | [**updateSubstitutionCustomFields**](docs/SubstitutionApi.md#updateSubstitutionCustomFields) | **PUT** /beta/substitution/customFields | Update a substitution custom fields
*SupplementApi* | [**addSupplement**](docs/SupplementApi.md#addSupplement) | **POST** /beta/supplement | Create a supplement
*SupplementApi* | [**addSupplementAudit**](docs/SupplementApi.md#addSupplementAudit) | **PUT** /beta/supplement/{supplementId}/audit/{supplementAudit} | Add new audit for a supplement
*SupplementApi* | [**addSupplementTag**](docs/SupplementApi.md#addSupplementTag) | **PUT** /beta/supplement/{supplementId}/tag/{supplementTag} | Add new tags for a supplement.
*SupplementApi* | [**deleteSupplement**](docs/SupplementApi.md#deleteSupplement) | **DELETE** /beta/supplement/{supplementId} | Delete a supplement
*SupplementApi* | [**deleteSupplementTag**](docs/SupplementApi.md#deleteSupplementTag) | **DELETE** /beta/supplement/{supplementId}/tag/{supplementTag} | Delete a tag for a supplement.
*SupplementApi* | [**getDuplicateSupplementById**](docs/SupplementApi.md#getDuplicateSupplementById) | **GET** /beta/supplement/duplicate/{supplementId} | Get a duplicated a supplement by id
*SupplementApi* | [**getSupplementByFilter**](docs/SupplementApi.md#getSupplementByFilter) | **GET** /beta/supplement/search | Search supplements by filter
*SupplementApi* | [**getSupplementById**](docs/SupplementApi.md#getSupplementById) | **GET** /beta/supplement/{supplementId} | Get a supplement by id
*SupplementApi* | [**getSupplementTags**](docs/SupplementApi.md#getSupplementTags) | **GET** /beta/supplement/{supplementId}/tag | Get the tags for a supplement.
*SupplementApi* | [**updateSupplement**](docs/SupplementApi.md#updateSupplement) | **PUT** /beta/supplement | Update a supplement
*SupplementApi* | [**updateSupplementCustomFields**](docs/SupplementApi.md#updateSupplementCustomFields) | **PUT** /beta/supplement/customFields | Update a supplement custom fields
*ThirdPartyParcelAccountApi* | [**addThirdPartyParcelAccount**](docs/ThirdPartyParcelAccountApi.md#addThirdPartyParcelAccount) | **POST** /beta/thirdPartyParcelAccount | Create a thirdPartyParcelAccount
*ThirdPartyParcelAccountApi* | [**addThirdPartyParcelAccountAudit**](docs/ThirdPartyParcelAccountApi.md#addThirdPartyParcelAccountAudit) | **PUT** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/audit/{thirdPartyParcelAccountAudit} | Add new audit for a thirdPartyParcelAccount
*ThirdPartyParcelAccountApi* | [**addThirdPartyParcelAccountTag**](docs/ThirdPartyParcelAccountApi.md#addThirdPartyParcelAccountTag) | **PUT** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/tag/{thirdPartyParcelAccountTag} | Add new tags for a thirdPartyParcelAccount.
*ThirdPartyParcelAccountApi* | [**deleteThirdPartyParcelAccount**](docs/ThirdPartyParcelAccountApi.md#deleteThirdPartyParcelAccount) | **DELETE** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId} | Delete a thirdPartyParcelAccount
*ThirdPartyParcelAccountApi* | [**deleteThirdPartyParcelAccountTag**](docs/ThirdPartyParcelAccountApi.md#deleteThirdPartyParcelAccountTag) | **DELETE** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/tag/{thirdPartyParcelAccountTag} | Delete a tag for a thirdPartyParcelAccount.
*ThirdPartyParcelAccountApi* | [**getDuplicateThirdPartyParcelAccountById**](docs/ThirdPartyParcelAccountApi.md#getDuplicateThirdPartyParcelAccountById) | **GET** /beta/thirdPartyParcelAccount/duplicate/{thirdPartyParcelAccountId} | Get a duplicated a thirdPartyParcelAccount by id
*ThirdPartyParcelAccountApi* | [**getThirdPartyParcelAccountByFilter**](docs/ThirdPartyParcelAccountApi.md#getThirdPartyParcelAccountByFilter) | **GET** /beta/thirdPartyParcelAccount/search | Search thirdPartyParcelAccounts by filter
*ThirdPartyParcelAccountApi* | [**getThirdPartyParcelAccountById**](docs/ThirdPartyParcelAccountApi.md#getThirdPartyParcelAccountById) | **GET** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId} | Get a thirdPartyParcelAccount by id
*ThirdPartyParcelAccountApi* | [**getThirdPartyParcelAccountTags**](docs/ThirdPartyParcelAccountApi.md#getThirdPartyParcelAccountTags) | **GET** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/tag | Get the tags for a thirdPartyParcelAccount.
*ThirdPartyParcelAccountApi* | [**updateThirdPartyParcelAccount**](docs/ThirdPartyParcelAccountApi.md#updateThirdPartyParcelAccount) | **PUT** /beta/thirdPartyParcelAccount | Update a thirdPartyParcelAccount
*ThirdPartyParcelAccountApi* | [**updateThirdPartyParcelAccountCustomFields**](docs/ThirdPartyParcelAccountApi.md#updateThirdPartyParcelAccountCustomFields) | **PUT** /beta/thirdPartyParcelAccount/customFields | Update a thirdPartyParcelAccount custom fields
*UserApi* | [**getUserById**](docs/UserApi.md#getUserById) | **GET** /beta/user/{userId} | Get an user by id
*UserApi* | [**getUserBySearchText**](docs/UserApi.md#getUserBySearchText) | **GET** /beta/user/search | Search users
*VendorApi* | [**addVendor**](docs/VendorApi.md#addVendor) | **POST** /beta/vendor | Create a vendor
*VendorApi* | [**addVendorAudit**](docs/VendorApi.md#addVendorAudit) | **PUT** /beta/vendor/{vendorId}/audit/{vendorAudit} | Add new audit for a vendor
*VendorApi* | [**addVendorTag**](docs/VendorApi.md#addVendorTag) | **PUT** /beta/vendor/{vendorId}/tag/{vendorTag} | Add new tags for a vendor.
*VendorApi* | [**deleteVendor**](docs/VendorApi.md#deleteVendor) | **DELETE** /beta/vendor/{vendorId} | Delete a vendor
*VendorApi* | [**deleteVendorTag**](docs/VendorApi.md#deleteVendorTag) | **DELETE** /beta/vendor/{vendorId}/tag/{vendorTag} | Delete a tag for a vendor.
*VendorApi* | [**getDuplicateVendorById**](docs/VendorApi.md#getDuplicateVendorById) | **GET** /beta/vendor/duplicate/{vendorId} | Get a duplicated a vendor by id
*VendorApi* | [**getVendorByFilter**](docs/VendorApi.md#getVendorByFilter) | **GET** /beta/vendor/search | Search vendors by filter
*VendorApi* | [**getVendorById**](docs/VendorApi.md#getVendorById) | **GET** /beta/vendor/{vendorId} | Get a vendor by id
*VendorApi* | [**getVendorTags**](docs/VendorApi.md#getVendorTags) | **GET** /beta/vendor/{vendorId}/tag | Get the tags for a vendor.
*VendorApi* | [**updateVendor**](docs/VendorApi.md#updateVendor) | **PUT** /beta/vendor | Update a vendor
*VendorApi* | [**updateVendorCustomFields**](docs/VendorApi.md#updateVendorCustomFields) | **PUT** /beta/vendor/customFields | Update a vendor custom fields
*VendorComplianceSurveyApi* | [**addVendorComplianceSurvey**](docs/VendorComplianceSurveyApi.md#addVendorComplianceSurvey) | **POST** /beta/vendorComplianceSurvey | Create a vendorComplianceSurvey
*VendorComplianceSurveyApi* | [**addVendorComplianceSurveyAudit**](docs/VendorComplianceSurveyApi.md#addVendorComplianceSurveyAudit) | **PUT** /beta/vendorComplianceSurvey/{vendorComplianceSurveyId}/audit/{vendorComplianceSurveyAudit} | Add new audit for a vendorComplianceSurvey
*VendorComplianceSurveyApi* | [**addVendorComplianceSurveyTag**](docs/VendorComplianceSurveyApi.md#addVendorComplianceSurveyTag) | **PUT** /beta/vendorComplianceSurvey/{vendorComplianceSurveyId}/tag/{vendorComplianceSurveyTag} | Add new tags for a vendorComplianceSurvey.
*VendorComplianceSurveyApi* | [**deleteVendorComplianceSurvey**](docs/VendorComplianceSurveyApi.md#deleteVendorComplianceSurvey) | **DELETE** /beta/vendorComplianceSurvey/{vendorComplianceSurveyId} | Delete a vendorComplianceSurvey
*VendorComplianceSurveyApi* | [**deleteVendorComplianceSurveyTag**](docs/VendorComplianceSurveyApi.md#deleteVendorComplianceSurveyTag) | **DELETE** /beta/vendorComplianceSurvey/{vendorComplianceSurveyId}/tag/{vendorComplianceSurveyTag} | Delete a tag for a vendorComplianceSurvey.
*VendorComplianceSurveyApi* | [**getDuplicateVendorComplianceSurveyById**](docs/VendorComplianceSurveyApi.md#getDuplicateVendorComplianceSurveyById) | **GET** /beta/vendorComplianceSurvey/duplicate/{vendorComplianceSurveyId} | Get a duplicated a vendorComplianceSurvey by id
*VendorComplianceSurveyApi* | [**getVendorComplianceSurveyByFilter**](docs/VendorComplianceSurveyApi.md#getVendorComplianceSurveyByFilter) | **GET** /beta/vendorComplianceSurvey/search | Search vendorComplianceSurveys by filter
*VendorComplianceSurveyApi* | [**getVendorComplianceSurveyById**](docs/VendorComplianceSurveyApi.md#getVendorComplianceSurveyById) | **GET** /beta/vendorComplianceSurvey/{vendorComplianceSurveyId} | Get a vendorComplianceSurvey by id
*VendorComplianceSurveyApi* | [**getVendorComplianceSurveyTags**](docs/VendorComplianceSurveyApi.md#getVendorComplianceSurveyTags) | **GET** /beta/vendorComplianceSurvey/{vendorComplianceSurveyId}/tag | Get the tags for a vendorComplianceSurvey.
*VendorComplianceSurveyApi* | [**updateVendorComplianceSurvey**](docs/VendorComplianceSurveyApi.md#updateVendorComplianceSurvey) | **PUT** /beta/vendorComplianceSurvey | Update a vendorComplianceSurvey
*VendorComplianceSurveyApi* | [**updateVendorComplianceSurveyCustomFields**](docs/VendorComplianceSurveyApi.md#updateVendorComplianceSurveyCustomFields) | **PUT** /beta/vendorComplianceSurvey/customFields | Update a vendorComplianceSurvey custom fields
*WarehouseApi* | [**addWarehouseAudit**](docs/WarehouseApi.md#addWarehouseAudit) | **PUT** /beta/warehouse/{warehouseId}/audit/{warehouseAudit} | Add new audit for a warehouse
*WarehouseApi* | [**addWarehouseTag**](docs/WarehouseApi.md#addWarehouseTag) | **PUT** /beta/warehouse/{warehouseId}/tag/{warehouseTag} | Add new tags for a warehouse.
*WarehouseApi* | [**deleteWarehouseTag**](docs/WarehouseApi.md#deleteWarehouseTag) | **DELETE** /beta/warehouse/{warehouseId}/tag/{warehouseTag} | Delete a tag for a warehouse.
*WarehouseApi* | [**getDuplicateWarehouseById**](docs/WarehouseApi.md#getDuplicateWarehouseById) | **GET** /beta/warehouse/duplicate/{warehouseId} | Get a duplicated a warehouse by id
*WarehouseApi* | [**getWarehouseByFilter**](docs/WarehouseApi.md#getWarehouseByFilter) | **GET** /beta/warehouse/search | Search warehouses by filter
*WarehouseApi* | [**getWarehouseById**](docs/WarehouseApi.md#getWarehouseById) | **GET** /beta/warehouse/{warehouseId} | Get a warehouse by id
*WarehouseApi* | [**getWarehouseTags**](docs/WarehouseApi.md#getWarehouseTags) | **GET** /beta/warehouse/{warehouseId}/tag | Get the tags for a warehouse.
*WarehouseApi* | [**updateWarehouse**](docs/WarehouseApi.md#updateWarehouse) | **PUT** /beta/warehouse | Update a warehouse
*WarehouseApi* | [**updateWarehouseCustomFields**](docs/WarehouseApi.md#updateWarehouseCustomFields) | **PUT** /beta/warehouse/customFields | Update a warehouse custom fields
*WarehouseDocumentApi* | [**addWarehouseDocumentAudit**](docs/WarehouseDocumentApi.md#addWarehouseDocumentAudit) | **PUT** /beta/warehouseDocument/{warehouseDocumentId}/audit/{warehouseDocumentAudit} | Add new audit for a warehouseDocument
*WarehouseDocumentApi* | [**addWarehouseDocumentTag**](docs/WarehouseDocumentApi.md#addWarehouseDocumentTag) | **PUT** /beta/warehouseDocument/{warehouseDocumentId}/tag/{warehouseDocumentTag} | Add new tags for a warehouseDocument.
*WarehouseDocumentApi* | [**deleteWarehouseDocumentTag**](docs/WarehouseDocumentApi.md#deleteWarehouseDocumentTag) | **DELETE** /beta/warehouseDocument/{warehouseDocumentId}/tag/{warehouseDocumentTag} | Delete a tag for a warehouseDocument.
*WarehouseDocumentApi* | [**getDuplicateWarehouseDocumentById**](docs/WarehouseDocumentApi.md#getDuplicateWarehouseDocumentById) | **GET** /beta/warehouseDocument/duplicate/{warehouseDocumentId} | Get a duplicated a warehouseDocument by id
*WarehouseDocumentApi* | [**getWarehouseDocumentByFilter**](docs/WarehouseDocumentApi.md#getWarehouseDocumentByFilter) | **GET** /beta/warehouseDocument/search | Search warehouseDocuments by filter
*WarehouseDocumentApi* | [**getWarehouseDocumentById**](docs/WarehouseDocumentApi.md#getWarehouseDocumentById) | **GET** /beta/warehouseDocument/{warehouseDocumentId} | Get a warehouseDocument by id
*WarehouseDocumentApi* | [**getWarehouseDocumentTags**](docs/WarehouseDocumentApi.md#getWarehouseDocumentTags) | **GET** /beta/warehouseDocument/{warehouseDocumentId}/tag | Get the tags for a warehouseDocument.
*WarehouseDocumentApi* | [**updateWarehouseDocumentCustomFields**](docs/WarehouseDocumentApi.md#updateWarehouseDocumentCustomFields) | **PUT** /beta/warehouseDocument/customFields | Update a warehouseDocument custom fields
*WarehouseDocumentTypeApi* | [**addWarehouseDocumentTypeAudit**](docs/WarehouseDocumentTypeApi.md#addWarehouseDocumentTypeAudit) | **PUT** /beta/warehouseDocumentType/{warehouseDocumentTypeId}/audit/{warehouseDocumentTypeAudit} | Add new audit for a warehouseDocumentType
*WarehouseDocumentTypeApi* | [**addWarehouseDocumentTypeTag**](docs/WarehouseDocumentTypeApi.md#addWarehouseDocumentTypeTag) | **PUT** /beta/warehouseDocumentType/{warehouseDocumentTypeId}/tag/{warehouseDocumentTypeTag} | Add new tags for a warehouseDocumentType.
*WarehouseDocumentTypeApi* | [**deleteWarehouseDocumentTypeTag**](docs/WarehouseDocumentTypeApi.md#deleteWarehouseDocumentTypeTag) | **DELETE** /beta/warehouseDocumentType/{warehouseDocumentTypeId}/tag/{warehouseDocumentTypeTag} | Delete a tag for a warehouseDocumentType.
*WarehouseDocumentTypeApi* | [**getDuplicateWarehouseDocumentTypeById**](docs/WarehouseDocumentTypeApi.md#getDuplicateWarehouseDocumentTypeById) | **GET** /beta/warehouseDocumentType/duplicate/{warehouseDocumentTypeId} | Get a duplicated a warehouseDocumentType by id
*WarehouseDocumentTypeApi* | [**getWarehouseDocumentTypeByFilter**](docs/WarehouseDocumentTypeApi.md#getWarehouseDocumentTypeByFilter) | **GET** /beta/warehouseDocumentType/search | Search warehouseDocumentTypes by filter
*WarehouseDocumentTypeApi* | [**getWarehouseDocumentTypeById**](docs/WarehouseDocumentTypeApi.md#getWarehouseDocumentTypeById) | **GET** /beta/warehouseDocumentType/{warehouseDocumentTypeId} | Get a warehouseDocumentType by id
*WarehouseDocumentTypeApi* | [**getWarehouseDocumentTypeTags**](docs/WarehouseDocumentTypeApi.md#getWarehouseDocumentTypeTags) | **GET** /beta/warehouseDocumentType/{warehouseDocumentTypeId}/tag | Get the tags for a warehouseDocumentType.
*WorkApi* | [**addWorkAudit**](docs/WorkApi.md#addWorkAudit) | **PUT** /beta/work/{workId}/audit/{workAudit} | Add new audit for a work
*WorkApi* | [**addWorkTag**](docs/WorkApi.md#addWorkTag) | **PUT** /beta/work/{workId}/tag/{workTag} | Add new tags for a work.
*WorkApi* | [**deleteWorkTag**](docs/WorkApi.md#deleteWorkTag) | **DELETE** /beta/work/{workId}/tag/{workTag} | Delete a tag for a work.
*WorkApi* | [**getDuplicateWorkById**](docs/WorkApi.md#getDuplicateWorkById) | **GET** /beta/work/duplicate/{workId} | Get a duplicated a work by id
*WorkApi* | [**getWorkByFilter**](docs/WorkApi.md#getWorkByFilter) | **GET** /beta/work/search | Search works by filter
*WorkApi* | [**getWorkById**](docs/WorkApi.md#getWorkById) | **GET** /beta/work/{workId} | Get a work by id
*WorkApi* | [**getWorkTags**](docs/WorkApi.md#getWorkTags) | **GET** /beta/work/{workId}/tag | Get the tags for a work.
*WorkApi* | [**updateWorkCustomFields**](docs/WorkApi.md#updateWorkCustomFields) | **PUT** /beta/work/customFields | Update a work custom fields
*WorkActivityApi* | [**addWorkActivity**](docs/WorkActivityApi.md#addWorkActivity) | **POST** /beta/workActivity | Create a workActivity
*WorkActivityApi* | [**addWorkActivityAudit**](docs/WorkActivityApi.md#addWorkActivityAudit) | **PUT** /beta/workActivity/{workActivityId}/audit/{workActivityAudit} | Add new audit for a workActivity
*WorkActivityApi* | [**addWorkActivityTag**](docs/WorkActivityApi.md#addWorkActivityTag) | **PUT** /beta/workActivity/{workActivityId}/tag/{workActivityTag} | Add new tags for a workActivity.
*WorkActivityApi* | [**deleteWorkActivity**](docs/WorkActivityApi.md#deleteWorkActivity) | **DELETE** /beta/workActivity/{workActivityId} | Delete a workActivity
*WorkActivityApi* | [**deleteWorkActivityTag**](docs/WorkActivityApi.md#deleteWorkActivityTag) | **DELETE** /beta/workActivity/{workActivityId}/tag/{workActivityTag} | Delete a tag for a workActivity.
*WorkActivityApi* | [**getDuplicateWorkActivityById**](docs/WorkActivityApi.md#getDuplicateWorkActivityById) | **GET** /beta/workActivity/duplicate/{workActivityId} | Get a duplicated a workActivity by id
*WorkActivityApi* | [**getWorkActivityByFilter**](docs/WorkActivityApi.md#getWorkActivityByFilter) | **GET** /beta/workActivity/search | Search workActivitys by filter
*WorkActivityApi* | [**getWorkActivityById**](docs/WorkActivityApi.md#getWorkActivityById) | **GET** /beta/workActivity/{workActivityId} | Get a workActivity by id
*WorkActivityApi* | [**getWorkActivityTags**](docs/WorkActivityApi.md#getWorkActivityTags) | **GET** /beta/workActivity/{workActivityId}/tag | Get the tags for a workActivity.
*WorkActivityApi* | [**updateWorkActivity**](docs/WorkActivityApi.md#updateWorkActivity) | **PUT** /beta/workActivity | Update a workActivity
*WorkBatchApi* | [**addWorkBatchAudit**](docs/WorkBatchApi.md#addWorkBatchAudit) | **PUT** /beta/workBatch/{workBatchId}/audit/{workBatchAudit} | Add new audit for a workBatch
*WorkBatchApi* | [**addWorkBatchTag**](docs/WorkBatchApi.md#addWorkBatchTag) | **PUT** /beta/workBatch/{workBatchId}/tag/{workBatchTag} | Add new tags for a workBatch.
*WorkBatchApi* | [**deleteWorkBatchTag**](docs/WorkBatchApi.md#deleteWorkBatchTag) | **DELETE** /beta/workBatch/{workBatchId}/tag/{workBatchTag} | Delete a tag for a workBatch.
*WorkBatchApi* | [**getDuplicateWorkBatchById**](docs/WorkBatchApi.md#getDuplicateWorkBatchById) | **GET** /beta/workBatch/duplicate/{workBatchId} | Get a duplicated a workBatch by id
*WorkBatchApi* | [**getWorkBatchByFilter**](docs/WorkBatchApi.md#getWorkBatchByFilter) | **GET** /beta/workBatch/search | Search workBatchs by filter
*WorkBatchApi* | [**getWorkBatchById**](docs/WorkBatchApi.md#getWorkBatchById) | **GET** /beta/workBatch/{workBatchId} | Get a workBatch by id
*WorkBatchApi* | [**getWorkBatchTags**](docs/WorkBatchApi.md#getWorkBatchTags) | **GET** /beta/workBatch/{workBatchId}/tag | Get the tags for a workBatch.
*WorkBatchApi* | [**updateWorkBatch**](docs/WorkBatchApi.md#updateWorkBatch) | **PUT** /beta/workBatch | Update a workBatch
*WorkBatchApi* | [**updateWorkBatchCustomFields**](docs/WorkBatchApi.md#updateWorkBatchCustomFields) | **PUT** /beta/workBatch/customFields | Update a workBatch custom fields
*ZoneApi* | [**addZone**](docs/ZoneApi.md#addZone) | **POST** /beta/zone | Create a zone
*ZoneApi* | [**addZoneAudit**](docs/ZoneApi.md#addZoneAudit) | **PUT** /beta/zone/{zoneId}/audit/{zoneAudit} | Add new audit for a zone
*ZoneApi* | [**addZoneTag**](docs/ZoneApi.md#addZoneTag) | **PUT** /beta/zone/{zoneId}/tag/{zoneTag} | Add new tags for a zone.
*ZoneApi* | [**deleteZone**](docs/ZoneApi.md#deleteZone) | **DELETE** /beta/zone/{zoneId} | Delete a zone
*ZoneApi* | [**deleteZoneTag**](docs/ZoneApi.md#deleteZoneTag) | **DELETE** /beta/zone/{zoneId}/tag/{zoneTag} | Delete a tag for a zone.
*ZoneApi* | [**getDuplicateZoneById**](docs/ZoneApi.md#getDuplicateZoneById) | **GET** /beta/zone/duplicate/{zoneId} | Get a duplicated a zone by id
*ZoneApi* | [**getZoneByFilter**](docs/ZoneApi.md#getZoneByFilter) | **GET** /beta/zone/search | Search zones by filter
*ZoneApi* | [**getZoneById**](docs/ZoneApi.md#getZoneById) | **GET** /beta/zone/{zoneId} | Get a zone by id
*ZoneApi* | [**getZoneTags**](docs/ZoneApi.md#getZoneTags) | **GET** /beta/zone/{zoneId}/tag | Get the tags for a zone.
*ZoneApi* | [**updateZone**](docs/ZoneApi.md#updateZone) | **PUT** /beta/zone | Update a zone
*ZoneApi* | [**updateZoneCustomFields**](docs/ZoneApi.md#updateZoneCustomFields) | **PUT** /beta/zone/customFields | Update a zone custom fields


## Documentation for Models

 - [Aisle](docs/Aisle.md)
 - [Alert](docs/Alert.md)
 - [ApplyOrderWarehouseFulfillmentPlanInput](docs/ApplyOrderWarehouseFulfillmentPlanInput.md)
 - [ApplyOrderWarehouseFulfillmentPlanOutput](docs/ApplyOrderWarehouseFulfillmentPlanOutput.md)
 - [Asn](docs/Asn.md)
 - [BillOfLading](docs/BillOfLading.md)
 - [BillOfLadingCarrierInfoLine](docs/BillOfLadingCarrierInfoLine.md)
 - [BillOfLadingOrderInfoLine](docs/BillOfLadingOrderInfoLine.md)
 - [BillingCode](docs/BillingCode.md)
 - [BillingCodeActivity](docs/BillingCodeActivity.md)
 - [BillingCodeType](docs/BillingCodeType.md)
 - [Building](docs/Building.md)
 - [BusinessTransaction](docs/BusinessTransaction.md)
 - [Carrier](docs/Carrier.md)
 - [CarrierService](docs/CarrierService.md)
 - [Cart](docs/Cart.md)
 - [CartLocation](docs/CartLocation.md)
 - [Carton](docs/Carton.md)
 - [CartonActivity](docs/CartonActivity.md)
 - [CartonContent](docs/CartonContent.md)
 - [CartonType](docs/CartonType.md)
 - [Customer](docs/Customer.md)
 - [CustomerInvoiceTemplate](docs/CustomerInvoiceTemplate.md)
 - [CustomerInvoiceTemplateLine](docs/CustomerInvoiceTemplateLine.md)
 - [DynamicKitComponentLine](docs/DynamicKitComponentLine.md)
 - [EDIDocumentType](docs/EDIDocumentType.md)
 - [EditLineItemFulfillmentStrategyInputAPIModel](docs/EditLineItemFulfillmentStrategyInputAPIModel.md)
 - [EmailTemplate](docs/EmailTemplate.md)
 - [ExecuteJobInputAPIModel](docs/ExecuteJobInputAPIModel.md)
 - [ExecuteQuickAdjustmentInputAPIModel](docs/ExecuteQuickAdjustmentInputAPIModel.md)
 - [ExecuteQuickReceiptInputAPIModel](docs/ExecuteQuickReceiptInputAPIModel.md)
 - [ExternalShipment](docs/ExternalShipment.md)
 - [ExternalShippingSystem](docs/ExternalShippingSystem.md)
 - [FulfillmentPlan](docs/FulfillmentPlan.md)
 - [FulfillmentProcess](docs/FulfillmentProcess.md)
 - [FulfillmentProcessLog](docs/FulfillmentProcessLog.md)
 - [GetOrderWarehouseFulfillmentDataInput](docs/GetOrderWarehouseFulfillmentDataInput.md)
 - [GetOrderWarehouseFulfillmentDataOutput](docs/GetOrderWarehouseFulfillmentDataOutput.md)
 - [IntegrationPartner](docs/IntegrationPartner.md)
 - [InventoryAdjustment](docs/InventoryAdjustment.md)
 - [InventoryDetail](docs/InventoryDetail.md)
 - [InventorySnapshot](docs/InventorySnapshot.md)
 - [InventoryStorageActivity](docs/InventoryStorageActivity.md)
 - [InvoiceTemplateLinePriceLevel](docs/InvoiceTemplateLinePriceLevel.md)
 - [InvoiceWorksheet](docs/InvoiceWorksheet.md)
 - [InvoiceWorksheetLine](docs/InvoiceWorksheetLine.md)
 - [Item](docs/Item.md)
 - [ItemAccountCode](docs/ItemAccountCode.md)
 - [ItemActivityType](docs/ItemActivityType.md)
 - [ItemBuyer](docs/ItemBuyer.md)
 - [ItemCategory](docs/ItemCategory.md)
 - [ItemLowstockCode](docs/ItemLowstockCode.md)
 - [ItemProductCode](docs/ItemProductCode.md)
 - [ItemReceipt](docs/ItemReceipt.md)
 - [ItemReceiptActivity](docs/ItemReceiptActivity.md)
 - [ItemSector](docs/ItemSector.md)
 - [ItemSerial](docs/ItemSerial.md)
 - [ItemSerialScheme](docs/ItemSerialScheme.md)
 - [ItemSubCategory](docs/ItemSubCategory.md)
 - [ItemSummaryCode](docs/ItemSummaryCode.md)
 - [Job](docs/Job.md)
 - [JobInput](docs/JobInput.md)
 - [JobOutput](docs/JobOutput.md)
 - [JobRecipe](docs/JobRecipe.md)
 - [JobRecipeInput](docs/JobRecipeInput.md)
 - [JobRecipeOutput](docs/JobRecipeOutput.md)
 - [JobRecipeStep](docs/JobRecipeStep.md)
 - [JobStep](docs/JobStep.md)
 - [JobTime](docs/JobTime.md)
 - [JobTimeActivity](docs/JobTimeActivity.md)
 - [JobType](docs/JobType.md)
 - [Kit](docs/Kit.md)
 - [KitComponent](docs/KitComponent.md)
 - [LegacyLowstockContact](docs/LegacyLowstockContact.md)
 - [LineOfBusiness](docs/LineOfBusiness.md)
 - [Location](docs/Location.md)
 - [LocationAddressScheme](docs/LocationAddressScheme.md)
 - [LocationBillingType](docs/LocationBillingType.md)
 - [LocationFootprint](docs/LocationFootprint.md)
 - [LoggedTime](docs/LoggedTime.md)
 - [LoggedTimeType](docs/LoggedTimeType.md)
 - [LowStock](docs/LowStock.md)
 - [ManageScheduledPlans](docs/ManageScheduledPlans.md)
 - [ModelApiResponse](docs/ModelApiResponse.md)
 - [Order](docs/Order.md)
 - [OrderActivity](docs/OrderActivity.md)
 - [OrderExtraLineItemData](docs/OrderExtraLineItemData.md)
 - [OrderExtraOrderData](docs/OrderExtraOrderData.md)
 - [OrderInvoiceTemplateLineItemDescriptionEnum](docs/OrderInvoiceTemplateLineItemDescriptionEnum.md)
 - [OrderLine](docs/OrderLine.md)
 - [OrderLineActivity](docs/OrderLineActivity.md)
 - [OrderLoadProgram](docs/OrderLoadProgram.md)
 - [OrderSource](docs/OrderSource.md)
 - [OrderSourceReservation](docs/OrderSourceReservation.md)
 - [OrderSourceStockStatus](docs/OrderSourceStockStatus.md)
 - [OrderWarehouseFulfillmentPlan](docs/OrderWarehouseFulfillmentPlan.md)
 - [OrderWarehouseFulfillmentPlanDetail](docs/OrderWarehouseFulfillmentPlanDetail.md)
 - [OrderWarehouseFulfillmentRawData](docs/OrderWarehouseFulfillmentRawData.md)
 - [OrderWarehouseFulfillmentRawSkuData](docs/OrderWarehouseFulfillmentRawSkuData.md)
 - [OverrideReturnAddress](docs/OverrideReturnAddress.md)
 - [PackingSlipTemplateLineItemDescriptionEnum](docs/PackingSlipTemplateLineItemDescriptionEnum.md)
 - [ParcelAccount](docs/ParcelAccount.md)
 - [ParcelInvoice](docs/ParcelInvoice.md)
 - [ParcelInvoiceLine](docs/ParcelInvoiceLine.md)
 - [PerpetualInventoryLog](docs/PerpetualInventoryLog.md)
 - [PickFaceAssignment](docs/PickFaceAssignment.md)
 - [PredefinedCarton](docs/PredefinedCarton.md)
 - [ProcessOutputAPIModel](docs/ProcessOutputAPIModel.md)
 - [ProductType](docs/ProductType.md)
 - [ProductionLot](docs/ProductionLot.md)
 - [QuickAdjustment](docs/QuickAdjustment.md)
 - [QuickReceipt](docs/QuickReceipt.md)
 - [ReceivingProcess](docs/ReceivingProcess.md)
 - [ReceivingWorksheet](docs/ReceivingWorksheet.md)
 - [ReceivingWorksheetLineItem](docs/ReceivingWorksheetLineItem.md)
 - [ReceivingWorksheetPutAwayPlan](docs/ReceivingWorksheetPutAwayPlan.md)
 - [Replenishment](docs/Replenishment.md)
 - [ReplenishmentPlan](docs/ReplenishmentPlan.md)
 - [ReplenishmentProcess](docs/ReplenishmentProcess.md)
 - [ReqManualSubstitutionInputAPIModel](docs/ReqManualSubstitutionInputAPIModel.md)
 - [RunFulfillmentPlanInputAPIModel](docs/RunFulfillmentPlanInputAPIModel.md)
 - [ScheduledPlanLog](docs/ScheduledPlanLog.md)
 - [ServiceType](docs/ServiceType.md)
 - [Shipment](docs/Shipment.md)
 - [ShoppingCartConnection](docs/ShoppingCartConnection.md)
 - [SlaSetup](docs/SlaSetup.md)
 - [Store](docs/Store.md)
 - [Substitution](docs/Substitution.md)
 - [Supplement](docs/Supplement.md)
 - [ThirdPartyParcelAccount](docs/ThirdPartyParcelAccount.md)
 - [User](docs/User.md)
 - [Vendor](docs/Vendor.md)
 - [VendorComplianceSurvey](docs/VendorComplianceSurvey.md)
 - [Warehouse](docs/Warehouse.md)
 - [WarehouseDocument](docs/WarehouseDocument.md)
 - [WarehouseDocumentType](docs/WarehouseDocumentType.md)
 - [Work](docs/Work.md)
 - [WorkActivity](docs/WorkActivity.md)
 - [WorkBatch](docs/WorkBatch.md)
 - [Zone](docs/Zone.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: API-Key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

api@infopluscommerce.com

