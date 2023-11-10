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
*AisleApi* | [**addAisleFile**](docs/AisleApi.md#addAisleFile) | **POST** /beta/aisle/{aisleId}/file/{fileName} | Attach a file to an aisle
*AisleApi* | [**addAisleFileByURL**](docs/AisleApi.md#addAisleFileByURL) | **POST** /beta/aisle/{aisleId}/file | Attach a file to an aisle by URL.
*AisleApi* | [**addAisleTag**](docs/AisleApi.md#addAisleTag) | **PUT** /beta/aisle/{aisleId}/tag/{aisleTag} | Add new tags for an aisle.
*AisleApi* | [**deleteAisle**](docs/AisleApi.md#deleteAisle) | **DELETE** /beta/aisle/{aisleId} | Delete an aisle
*AisleApi* | [**deleteAisleFile**](docs/AisleApi.md#deleteAisleFile) | **DELETE** /beta/aisle/{aisleId}/file/{fileId} | Delete a file for an aisle.
*AisleApi* | [**deleteAisleTag**](docs/AisleApi.md#deleteAisleTag) | **DELETE** /beta/aisle/{aisleId}/tag/{aisleTag} | Delete a tag for an aisle.
*AisleApi* | [**getAisleByFilter**](docs/AisleApi.md#getAisleByFilter) | **GET** /beta/aisle/search | Search aisles by filter
*AisleApi* | [**getAisleById**](docs/AisleApi.md#getAisleById) | **GET** /beta/aisle/{aisleId} | Get an aisle by id
*AisleApi* | [**getAisleFiles**](docs/AisleApi.md#getAisleFiles) | **GET** /beta/aisle/{aisleId}/file | Get the files for an aisle.
*AisleApi* | [**getAisleTags**](docs/AisleApi.md#getAisleTags) | **GET** /beta/aisle/{aisleId}/tag | Get the tags for an aisle.
*AisleApi* | [**getDuplicateAisleById**](docs/AisleApi.md#getDuplicateAisleById) | **GET** /beta/aisle/duplicate/{aisleId} | Get a duplicated an aisle by id
*AisleApi* | [**updateAisle**](docs/AisleApi.md#updateAisle) | **PUT** /beta/aisle | Update an aisle
*AisleApi* | [**updateAisleCustomFields**](docs/AisleApi.md#updateAisleCustomFields) | **PUT** /beta/aisle/customFields | Update an aisle custom fields
*AlertApi* | [**addAlert**](docs/AlertApi.md#addAlert) | **POST** /beta/alert | Create an alert
*AlertApi* | [**addAlertAudit**](docs/AlertApi.md#addAlertAudit) | **PUT** /beta/alert/{alertId}/audit/{alertAudit} | Add new audit for an alert
*AlertApi* | [**addAlertFile**](docs/AlertApi.md#addAlertFile) | **POST** /beta/alert/{alertId}/file/{fileName} | Attach a file to an alert
*AlertApi* | [**addAlertFileByURL**](docs/AlertApi.md#addAlertFileByURL) | **POST** /beta/alert/{alertId}/file | Attach a file to an alert by URL.
*AlertApi* | [**addAlertTag**](docs/AlertApi.md#addAlertTag) | **PUT** /beta/alert/{alertId}/tag/{alertTag} | Add new tags for an alert.
*AlertApi* | [**deleteAlertFile**](docs/AlertApi.md#deleteAlertFile) | **DELETE** /beta/alert/{alertId}/file/{fileId} | Delete a file for an alert.
*AlertApi* | [**deleteAlertTag**](docs/AlertApi.md#deleteAlertTag) | **DELETE** /beta/alert/{alertId}/tag/{alertTag} | Delete a tag for an alert.
*AlertApi* | [**getAlertByFilter**](docs/AlertApi.md#getAlertByFilter) | **GET** /beta/alert/search | Search alerts by filter
*AlertApi* | [**getAlertById**](docs/AlertApi.md#getAlertById) | **GET** /beta/alert/{alertId} | Get an alert by id
*AlertApi* | [**getAlertFiles**](docs/AlertApi.md#getAlertFiles) | **GET** /beta/alert/{alertId}/file | Get the files for an alert.
*AlertApi* | [**getAlertTags**](docs/AlertApi.md#getAlertTags) | **GET** /beta/alert/{alertId}/tag | Get the tags for an alert.
*AlertApi* | [**getDuplicateAlertById**](docs/AlertApi.md#getDuplicateAlertById) | **GET** /beta/alert/duplicate/{alertId} | Get a duplicated an alert by id
*AlertApi* | [**updateAlertCustomFields**](docs/AlertApi.md#updateAlertCustomFields) | **PUT** /beta/alert/customFields | Update an alert custom fields
*AsnApi* | [**addAsn**](docs/AsnApi.md#addAsn) | **POST** /beta/asn | Create an asn
*AsnApi* | [**addAsnAudit**](docs/AsnApi.md#addAsnAudit) | **PUT** /beta/asn/{asnId}/audit/{asnAudit} | Add new audit for an asn
*AsnApi* | [**addAsnFile**](docs/AsnApi.md#addAsnFile) | **POST** /beta/asn/{asnId}/file/{fileName} | Attach a file to an asn
*AsnApi* | [**addAsnFileByURL**](docs/AsnApi.md#addAsnFileByURL) | **POST** /beta/asn/{asnId}/file | Attach a file to an asn by URL.
*AsnApi* | [**addAsnTag**](docs/AsnApi.md#addAsnTag) | **PUT** /beta/asn/{asnId}/tag/{asnTag} | Add new tags for an asn.
*AsnApi* | [**deleteAsn**](docs/AsnApi.md#deleteAsn) | **DELETE** /beta/asn/{asnId} | Delete an asn
*AsnApi* | [**deleteAsnFile**](docs/AsnApi.md#deleteAsnFile) | **DELETE** /beta/asn/{asnId}/file/{fileId} | Delete a file for an asn.
*AsnApi* | [**deleteAsnTag**](docs/AsnApi.md#deleteAsnTag) | **DELETE** /beta/asn/{asnId}/tag/{asnTag} | Delete a tag for an asn.
*AsnApi* | [**getAsnByFilter**](docs/AsnApi.md#getAsnByFilter) | **GET** /beta/asn/search | Search asns by filter
*AsnApi* | [**getAsnById**](docs/AsnApi.md#getAsnById) | **GET** /beta/asn/{asnId} | Get an asn by id
*AsnApi* | [**getAsnFiles**](docs/AsnApi.md#getAsnFiles) | **GET** /beta/asn/{asnId}/file | Get the files for an asn.
*AsnApi* | [**getAsnTags**](docs/AsnApi.md#getAsnTags) | **GET** /beta/asn/{asnId}/tag | Get the tags for an asn.
*AsnApi* | [**getDuplicateAsnById**](docs/AsnApi.md#getDuplicateAsnById) | **GET** /beta/asn/duplicate/{asnId} | Get a duplicated an asn by id
*AsnApi* | [**updateAsn**](docs/AsnApi.md#updateAsn) | **PUT** /beta/asn | Update an asn
*AsnApi* | [**updateAsnCustomFields**](docs/AsnApi.md#updateAsnCustomFields) | **PUT** /beta/asn/customFields | Update an asn custom fields
*BillOfLadingApi* | [**addBillOfLading**](docs/BillOfLadingApi.md#addBillOfLading) | **POST** /beta/billOfLading | Create a billOfLading
*BillOfLadingApi* | [**addBillOfLadingAudit**](docs/BillOfLadingApi.md#addBillOfLadingAudit) | **PUT** /beta/billOfLading/{billOfLadingId}/audit/{billOfLadingAudit} | Add new audit for a billOfLading
*BillOfLadingApi* | [**addBillOfLadingFile**](docs/BillOfLadingApi.md#addBillOfLadingFile) | **POST** /beta/billOfLading/{billOfLadingId}/file/{fileName} | Attach a file to a billOfLading
*BillOfLadingApi* | [**addBillOfLadingFileByURL**](docs/BillOfLadingApi.md#addBillOfLadingFileByURL) | **POST** /beta/billOfLading/{billOfLadingId}/file | Attach a file to a billOfLading by URL.
*BillOfLadingApi* | [**addBillOfLadingTag**](docs/BillOfLadingApi.md#addBillOfLadingTag) | **PUT** /beta/billOfLading/{billOfLadingId}/tag/{billOfLadingTag} | Add new tags for a billOfLading.
*BillOfLadingApi* | [**deleteBillOfLading**](docs/BillOfLadingApi.md#deleteBillOfLading) | **DELETE** /beta/billOfLading/{billOfLadingId} | Delete a billOfLading
*BillOfLadingApi* | [**deleteBillOfLadingFile**](docs/BillOfLadingApi.md#deleteBillOfLadingFile) | **DELETE** /beta/billOfLading/{billOfLadingId}/file/{fileId} | Delete a file for a billOfLading.
*BillOfLadingApi* | [**deleteBillOfLadingTag**](docs/BillOfLadingApi.md#deleteBillOfLadingTag) | **DELETE** /beta/billOfLading/{billOfLadingId}/tag/{billOfLadingTag} | Delete a tag for a billOfLading.
*BillOfLadingApi* | [**getBillOfLadingByFilter**](docs/BillOfLadingApi.md#getBillOfLadingByFilter) | **GET** /beta/billOfLading/search | Search billOfLadings by filter
*BillOfLadingApi* | [**getBillOfLadingById**](docs/BillOfLadingApi.md#getBillOfLadingById) | **GET** /beta/billOfLading/{billOfLadingId} | Get a billOfLading by id
*BillOfLadingApi* | [**getBillOfLadingFiles**](docs/BillOfLadingApi.md#getBillOfLadingFiles) | **GET** /beta/billOfLading/{billOfLadingId}/file | Get the files for a billOfLading.
*BillOfLadingApi* | [**getBillOfLadingTags**](docs/BillOfLadingApi.md#getBillOfLadingTags) | **GET** /beta/billOfLading/{billOfLadingId}/tag | Get the tags for a billOfLading.
*BillOfLadingApi* | [**getDuplicateBillOfLadingById**](docs/BillOfLadingApi.md#getDuplicateBillOfLadingById) | **GET** /beta/billOfLading/duplicate/{billOfLadingId} | Get a duplicated a billOfLading by id
*BillOfLadingApi* | [**updateBillOfLading**](docs/BillOfLadingApi.md#updateBillOfLading) | **PUT** /beta/billOfLading | Update a billOfLading
*BillOfLadingApi* | [**updateBillOfLadingCustomFields**](docs/BillOfLadingApi.md#updateBillOfLadingCustomFields) | **PUT** /beta/billOfLading/customFields | Update a billOfLading custom fields
*BillingCodeApi* | [**addBillingCode**](docs/BillingCodeApi.md#addBillingCode) | **POST** /beta/billingCode | Create a billingCode
*BillingCodeApi* | [**addBillingCodeAudit**](docs/BillingCodeApi.md#addBillingCodeAudit) | **PUT** /beta/billingCode/{billingCodeId}/audit/{billingCodeAudit} | Add new audit for a billingCode
*BillingCodeApi* | [**addBillingCodeFile**](docs/BillingCodeApi.md#addBillingCodeFile) | **POST** /beta/billingCode/{billingCodeId}/file/{fileName} | Attach a file to a billingCode
*BillingCodeApi* | [**addBillingCodeFileByURL**](docs/BillingCodeApi.md#addBillingCodeFileByURL) | **POST** /beta/billingCode/{billingCodeId}/file | Attach a file to a billingCode by URL.
*BillingCodeApi* | [**addBillingCodeTag**](docs/BillingCodeApi.md#addBillingCodeTag) | **PUT** /beta/billingCode/{billingCodeId}/tag/{billingCodeTag} | Add new tags for a billingCode.
*BillingCodeApi* | [**deleteBillingCode**](docs/BillingCodeApi.md#deleteBillingCode) | **DELETE** /beta/billingCode/{billingCodeId} | Delete a billingCode
*BillingCodeApi* | [**deleteBillingCodeFile**](docs/BillingCodeApi.md#deleteBillingCodeFile) | **DELETE** /beta/billingCode/{billingCodeId}/file/{fileId} | Delete a file for a billingCode.
*BillingCodeApi* | [**deleteBillingCodeTag**](docs/BillingCodeApi.md#deleteBillingCodeTag) | **DELETE** /beta/billingCode/{billingCodeId}/tag/{billingCodeTag} | Delete a tag for a billingCode.
*BillingCodeApi* | [**getBillingCodeByFilter**](docs/BillingCodeApi.md#getBillingCodeByFilter) | **GET** /beta/billingCode/search | Search billingCodes by filter
*BillingCodeApi* | [**getBillingCodeById**](docs/BillingCodeApi.md#getBillingCodeById) | **GET** /beta/billingCode/{billingCodeId} | Get a billingCode by id
*BillingCodeApi* | [**getBillingCodeFiles**](docs/BillingCodeApi.md#getBillingCodeFiles) | **GET** /beta/billingCode/{billingCodeId}/file | Get the files for a billingCode.
*BillingCodeApi* | [**getBillingCodeTags**](docs/BillingCodeApi.md#getBillingCodeTags) | **GET** /beta/billingCode/{billingCodeId}/tag | Get the tags for a billingCode.
*BillingCodeApi* | [**getDuplicateBillingCodeById**](docs/BillingCodeApi.md#getDuplicateBillingCodeById) | **GET** /beta/billingCode/duplicate/{billingCodeId} | Get a duplicated a billingCode by id
*BillingCodeApi* | [**updateBillingCode**](docs/BillingCodeApi.md#updateBillingCode) | **PUT** /beta/billingCode | Update a billingCode
*BillingCodeApi* | [**updateBillingCodeCustomFields**](docs/BillingCodeApi.md#updateBillingCodeCustomFields) | **PUT** /beta/billingCode/customFields | Update a billingCode custom fields
*BillingCodeActivityApi* | [**addBillingCodeActivity**](docs/BillingCodeActivityApi.md#addBillingCodeActivity) | **POST** /beta/billingCodeActivity | Create a billingCodeActivity
*BillingCodeActivityApi* | [**addBillingCodeActivityAudit**](docs/BillingCodeActivityApi.md#addBillingCodeActivityAudit) | **PUT** /beta/billingCodeActivity/{billingCodeActivityId}/audit/{billingCodeActivityAudit} | Add new audit for a billingCodeActivity
*BillingCodeActivityApi* | [**addBillingCodeActivityFile**](docs/BillingCodeActivityApi.md#addBillingCodeActivityFile) | **POST** /beta/billingCodeActivity/{billingCodeActivityId}/file/{fileName} | Attach a file to a billingCodeActivity
*BillingCodeActivityApi* | [**addBillingCodeActivityFileByURL**](docs/BillingCodeActivityApi.md#addBillingCodeActivityFileByURL) | **POST** /beta/billingCodeActivity/{billingCodeActivityId}/file | Attach a file to a billingCodeActivity by URL.
*BillingCodeActivityApi* | [**addBillingCodeActivityTag**](docs/BillingCodeActivityApi.md#addBillingCodeActivityTag) | **PUT** /beta/billingCodeActivity/{billingCodeActivityId}/tag/{billingCodeActivityTag} | Add new tags for a billingCodeActivity.
*BillingCodeActivityApi* | [**deleteBillingCodeActivity**](docs/BillingCodeActivityApi.md#deleteBillingCodeActivity) | **DELETE** /beta/billingCodeActivity/{billingCodeActivityId} | Delete a billingCodeActivity
*BillingCodeActivityApi* | [**deleteBillingCodeActivityFile**](docs/BillingCodeActivityApi.md#deleteBillingCodeActivityFile) | **DELETE** /beta/billingCodeActivity/{billingCodeActivityId}/file/{fileId} | Delete a file for a billingCodeActivity.
*BillingCodeActivityApi* | [**deleteBillingCodeActivityTag**](docs/BillingCodeActivityApi.md#deleteBillingCodeActivityTag) | **DELETE** /beta/billingCodeActivity/{billingCodeActivityId}/tag/{billingCodeActivityTag} | Delete a tag for a billingCodeActivity.
*BillingCodeActivityApi* | [**getBillingCodeActivityByFilter**](docs/BillingCodeActivityApi.md#getBillingCodeActivityByFilter) | **GET** /beta/billingCodeActivity/search | Search billingCodeActivitys by filter
*BillingCodeActivityApi* | [**getBillingCodeActivityById**](docs/BillingCodeActivityApi.md#getBillingCodeActivityById) | **GET** /beta/billingCodeActivity/{billingCodeActivityId} | Get a billingCodeActivity by id
*BillingCodeActivityApi* | [**getBillingCodeActivityFiles**](docs/BillingCodeActivityApi.md#getBillingCodeActivityFiles) | **GET** /beta/billingCodeActivity/{billingCodeActivityId}/file | Get the files for a billingCodeActivity.
*BillingCodeActivityApi* | [**getBillingCodeActivityTags**](docs/BillingCodeActivityApi.md#getBillingCodeActivityTags) | **GET** /beta/billingCodeActivity/{billingCodeActivityId}/tag | Get the tags for a billingCodeActivity.
*BillingCodeActivityApi* | [**getDuplicateBillingCodeActivityById**](docs/BillingCodeActivityApi.md#getDuplicateBillingCodeActivityById) | **GET** /beta/billingCodeActivity/duplicate/{billingCodeActivityId} | Get a duplicated a billingCodeActivity by id
*BillingCodeActivityApi* | [**updateBillingCodeActivity**](docs/BillingCodeActivityApi.md#updateBillingCodeActivity) | **PUT** /beta/billingCodeActivity | Update a billingCodeActivity
*BillingCodeTypeApi* | [**addBillingCodeType**](docs/BillingCodeTypeApi.md#addBillingCodeType) | **POST** /beta/billingCodeType | Create a billingCodeType
*BillingCodeTypeApi* | [**addBillingCodeTypeAudit**](docs/BillingCodeTypeApi.md#addBillingCodeTypeAudit) | **PUT** /beta/billingCodeType/{billingCodeTypeId}/audit/{billingCodeTypeAudit} | Add new audit for a billingCodeType
*BillingCodeTypeApi* | [**addBillingCodeTypeFile**](docs/BillingCodeTypeApi.md#addBillingCodeTypeFile) | **POST** /beta/billingCodeType/{billingCodeTypeId}/file/{fileName} | Attach a file to a billingCodeType
*BillingCodeTypeApi* | [**addBillingCodeTypeFileByURL**](docs/BillingCodeTypeApi.md#addBillingCodeTypeFileByURL) | **POST** /beta/billingCodeType/{billingCodeTypeId}/file | Attach a file to a billingCodeType by URL.
*BillingCodeTypeApi* | [**addBillingCodeTypeTag**](docs/BillingCodeTypeApi.md#addBillingCodeTypeTag) | **PUT** /beta/billingCodeType/{billingCodeTypeId}/tag/{billingCodeTypeTag} | Add new tags for a billingCodeType.
*BillingCodeTypeApi* | [**deleteBillingCodeType**](docs/BillingCodeTypeApi.md#deleteBillingCodeType) | **DELETE** /beta/billingCodeType/{billingCodeTypeId} | Delete a billingCodeType
*BillingCodeTypeApi* | [**deleteBillingCodeTypeFile**](docs/BillingCodeTypeApi.md#deleteBillingCodeTypeFile) | **DELETE** /beta/billingCodeType/{billingCodeTypeId}/file/{fileId} | Delete a file for a billingCodeType.
*BillingCodeTypeApi* | [**deleteBillingCodeTypeTag**](docs/BillingCodeTypeApi.md#deleteBillingCodeTypeTag) | **DELETE** /beta/billingCodeType/{billingCodeTypeId}/tag/{billingCodeTypeTag} | Delete a tag for a billingCodeType.
*BillingCodeTypeApi* | [**getBillingCodeTypeByFilter**](docs/BillingCodeTypeApi.md#getBillingCodeTypeByFilter) | **GET** /beta/billingCodeType/search | Search billingCodeTypes by filter
*BillingCodeTypeApi* | [**getBillingCodeTypeById**](docs/BillingCodeTypeApi.md#getBillingCodeTypeById) | **GET** /beta/billingCodeType/{billingCodeTypeId} | Get a billingCodeType by id
*BillingCodeTypeApi* | [**getBillingCodeTypeFiles**](docs/BillingCodeTypeApi.md#getBillingCodeTypeFiles) | **GET** /beta/billingCodeType/{billingCodeTypeId}/file | Get the files for a billingCodeType.
*BillingCodeTypeApi* | [**getBillingCodeTypeTags**](docs/BillingCodeTypeApi.md#getBillingCodeTypeTags) | **GET** /beta/billingCodeType/{billingCodeTypeId}/tag | Get the tags for a billingCodeType.
*BillingCodeTypeApi* | [**getDuplicateBillingCodeTypeById**](docs/BillingCodeTypeApi.md#getDuplicateBillingCodeTypeById) | **GET** /beta/billingCodeType/duplicate/{billingCodeTypeId} | Get a duplicated a billingCodeType by id
*BillingCodeTypeApi* | [**updateBillingCodeType**](docs/BillingCodeTypeApi.md#updateBillingCodeType) | **PUT** /beta/billingCodeType | Update a billingCodeType
*BillingCodeTypeApi* | [**updateBillingCodeTypeCustomFields**](docs/BillingCodeTypeApi.md#updateBillingCodeTypeCustomFields) | **PUT** /beta/billingCodeType/customFields | Update a billingCodeType custom fields
*BuildingApi* | [**addBuilding**](docs/BuildingApi.md#addBuilding) | **POST** /beta/building | Create a building
*BuildingApi* | [**addBuildingAudit**](docs/BuildingApi.md#addBuildingAudit) | **PUT** /beta/building/{buildingId}/audit/{buildingAudit} | Add new audit for a building
*BuildingApi* | [**addBuildingFile**](docs/BuildingApi.md#addBuildingFile) | **POST** /beta/building/{buildingId}/file/{fileName} | Attach a file to a building
*BuildingApi* | [**addBuildingFileByURL**](docs/BuildingApi.md#addBuildingFileByURL) | **POST** /beta/building/{buildingId}/file | Attach a file to a building by URL.
*BuildingApi* | [**addBuildingTag**](docs/BuildingApi.md#addBuildingTag) | **PUT** /beta/building/{buildingId}/tag/{buildingTag} | Add new tags for a building.
*BuildingApi* | [**deleteBuilding**](docs/BuildingApi.md#deleteBuilding) | **DELETE** /beta/building/{buildingId} | Delete a building
*BuildingApi* | [**deleteBuildingFile**](docs/BuildingApi.md#deleteBuildingFile) | **DELETE** /beta/building/{buildingId}/file/{fileId} | Delete a file for a building.
*BuildingApi* | [**deleteBuildingTag**](docs/BuildingApi.md#deleteBuildingTag) | **DELETE** /beta/building/{buildingId}/tag/{buildingTag} | Delete a tag for a building.
*BuildingApi* | [**getBuildingByFilter**](docs/BuildingApi.md#getBuildingByFilter) | **GET** /beta/building/search | Search buildings by filter
*BuildingApi* | [**getBuildingById**](docs/BuildingApi.md#getBuildingById) | **GET** /beta/building/{buildingId} | Get a building by id
*BuildingApi* | [**getBuildingFiles**](docs/BuildingApi.md#getBuildingFiles) | **GET** /beta/building/{buildingId}/file | Get the files for a building.
*BuildingApi* | [**getBuildingTags**](docs/BuildingApi.md#getBuildingTags) | **GET** /beta/building/{buildingId}/tag | Get the tags for a building.
*BuildingApi* | [**getDuplicateBuildingById**](docs/BuildingApi.md#getDuplicateBuildingById) | **GET** /beta/building/duplicate/{buildingId} | Get a duplicated a building by id
*BuildingApi* | [**updateBuilding**](docs/BuildingApi.md#updateBuilding) | **PUT** /beta/building | Update a building
*BuildingApi* | [**updateBuildingCustomFields**](docs/BuildingApi.md#updateBuildingCustomFields) | **PUT** /beta/building/customFields | Update a building custom fields
*BusinessTransactionApi* | [**addBusinessTransaction**](docs/BusinessTransactionApi.md#addBusinessTransaction) | **POST** /beta/businessTransaction | Create a businessTransaction
*BusinessTransactionApi* | [**addBusinessTransactionAudit**](docs/BusinessTransactionApi.md#addBusinessTransactionAudit) | **PUT** /beta/businessTransaction/{businessTransactionId}/audit/{businessTransactionAudit} | Add new audit for a businessTransaction
*BusinessTransactionApi* | [**addBusinessTransactionFile**](docs/BusinessTransactionApi.md#addBusinessTransactionFile) | **POST** /beta/businessTransaction/{businessTransactionId}/file/{fileName} | Attach a file to a businessTransaction
*BusinessTransactionApi* | [**addBusinessTransactionFileByURL**](docs/BusinessTransactionApi.md#addBusinessTransactionFileByURL) | **POST** /beta/businessTransaction/{businessTransactionId}/file | Attach a file to a businessTransaction by URL.
*BusinessTransactionApi* | [**addBusinessTransactionTag**](docs/BusinessTransactionApi.md#addBusinessTransactionTag) | **PUT** /beta/businessTransaction/{businessTransactionId}/tag/{businessTransactionTag} | Add new tags for a businessTransaction.
*BusinessTransactionApi* | [**deleteBusinessTransactionFile**](docs/BusinessTransactionApi.md#deleteBusinessTransactionFile) | **DELETE** /beta/businessTransaction/{businessTransactionId}/file/{fileId} | Delete a file for a businessTransaction.
*BusinessTransactionApi* | [**deleteBusinessTransactionTag**](docs/BusinessTransactionApi.md#deleteBusinessTransactionTag) | **DELETE** /beta/businessTransaction/{businessTransactionId}/tag/{businessTransactionTag} | Delete a tag for a businessTransaction.
*BusinessTransactionApi* | [**getBusinessTransactionByFilter**](docs/BusinessTransactionApi.md#getBusinessTransactionByFilter) | **GET** /beta/businessTransaction/search | Search businessTransactions by filter
*BusinessTransactionApi* | [**getBusinessTransactionById**](docs/BusinessTransactionApi.md#getBusinessTransactionById) | **GET** /beta/businessTransaction/{businessTransactionId} | Get a businessTransaction by id
*BusinessTransactionApi* | [**getBusinessTransactionFiles**](docs/BusinessTransactionApi.md#getBusinessTransactionFiles) | **GET** /beta/businessTransaction/{businessTransactionId}/file | Get the files for a businessTransaction.
*BusinessTransactionApi* | [**getBusinessTransactionTags**](docs/BusinessTransactionApi.md#getBusinessTransactionTags) | **GET** /beta/businessTransaction/{businessTransactionId}/tag | Get the tags for a businessTransaction.
*BusinessTransactionApi* | [**getDuplicateBusinessTransactionById**](docs/BusinessTransactionApi.md#getDuplicateBusinessTransactionById) | **GET** /beta/businessTransaction/duplicate/{businessTransactionId} | Get a duplicated a businessTransaction by id
*BusinessTransactionApi* | [**updateBusinessTransaction**](docs/BusinessTransactionApi.md#updateBusinessTransaction) | **PUT** /beta/businessTransaction | Update a businessTransaction
*BusinessTransactionApi* | [**updateBusinessTransactionCustomFields**](docs/BusinessTransactionApi.md#updateBusinessTransactionCustomFields) | **PUT** /beta/businessTransaction/customFields | Update a businessTransaction custom fields
*CarrierApi* | [**getCarrierById**](docs/CarrierApi.md#getCarrierById) | **GET** /beta/carrier/{carrierId} | Get a carrier by id
*CarrierApi* | [**getCarrierBySearchText**](docs/CarrierApi.md#getCarrierBySearchText) | **GET** /beta/carrier/search | Search carriers
*CarrierServiceApi* | [**getCarrierServiceById**](docs/CarrierServiceApi.md#getCarrierServiceById) | **GET** /beta/carrierService/{carrierServiceId} | Get a carrierService by id
*CarrierServiceApi* | [**getCarrierServiceBySearchText**](docs/CarrierServiceApi.md#getCarrierServiceBySearchText) | **GET** /beta/carrierService/search | Search carrierServices
*CartApi* | [**addCart**](docs/CartApi.md#addCart) | **POST** /beta/cart | Create a cart
*CartApi* | [**addCartAudit**](docs/CartApi.md#addCartAudit) | **PUT** /beta/cart/{cartId}/audit/{cartAudit} | Add new audit for a cart
*CartApi* | [**addCartFile**](docs/CartApi.md#addCartFile) | **POST** /beta/cart/{cartId}/file/{fileName} | Attach a file to a cart
*CartApi* | [**addCartFileByURL**](docs/CartApi.md#addCartFileByURL) | **POST** /beta/cart/{cartId}/file | Attach a file to a cart by URL.
*CartApi* | [**addCartTag**](docs/CartApi.md#addCartTag) | **PUT** /beta/cart/{cartId}/tag/{cartTag} | Add new tags for a cart.
*CartApi* | [**deleteCart**](docs/CartApi.md#deleteCart) | **DELETE** /beta/cart/{cartId} | Delete a cart
*CartApi* | [**deleteCartFile**](docs/CartApi.md#deleteCartFile) | **DELETE** /beta/cart/{cartId}/file/{fileId} | Delete a file for a cart.
*CartApi* | [**deleteCartTag**](docs/CartApi.md#deleteCartTag) | **DELETE** /beta/cart/{cartId}/tag/{cartTag} | Delete a tag for a cart.
*CartApi* | [**getCartByFilter**](docs/CartApi.md#getCartByFilter) | **GET** /beta/cart/search | Search carts by filter
*CartApi* | [**getCartById**](docs/CartApi.md#getCartById) | **GET** /beta/cart/{cartId} | Get a cart by id
*CartApi* | [**getCartFiles**](docs/CartApi.md#getCartFiles) | **GET** /beta/cart/{cartId}/file | Get the files for a cart.
*CartApi* | [**getCartTags**](docs/CartApi.md#getCartTags) | **GET** /beta/cart/{cartId}/tag | Get the tags for a cart.
*CartApi* | [**getDuplicateCartById**](docs/CartApi.md#getDuplicateCartById) | **GET** /beta/cart/duplicate/{cartId} | Get a duplicated a cart by id
*CartApi* | [**updateCart**](docs/CartApi.md#updateCart) | **PUT** /beta/cart | Update a cart
*CartLocationApi* | [**addCartLocationAudit**](docs/CartLocationApi.md#addCartLocationAudit) | **PUT** /beta/cartLocation/{cartLocationId}/audit/{cartLocationAudit} | Add new audit for a cartLocation
*CartLocationApi* | [**addCartLocationFile**](docs/CartLocationApi.md#addCartLocationFile) | **POST** /beta/cartLocation/{cartLocationId}/file/{fileName} | Attach a file to a cartLocation
*CartLocationApi* | [**addCartLocationFileByURL**](docs/CartLocationApi.md#addCartLocationFileByURL) | **POST** /beta/cartLocation/{cartLocationId}/file | Attach a file to a cartLocation by URL.
*CartLocationApi* | [**addCartLocationTag**](docs/CartLocationApi.md#addCartLocationTag) | **PUT** /beta/cartLocation/{cartLocationId}/tag/{cartLocationTag} | Add new tags for a cartLocation.
*CartLocationApi* | [**deleteCartLocationFile**](docs/CartLocationApi.md#deleteCartLocationFile) | **DELETE** /beta/cartLocation/{cartLocationId}/file/{fileId} | Delete a file for a cartLocation.
*CartLocationApi* | [**deleteCartLocationTag**](docs/CartLocationApi.md#deleteCartLocationTag) | **DELETE** /beta/cartLocation/{cartLocationId}/tag/{cartLocationTag} | Delete a tag for a cartLocation.
*CartLocationApi* | [**getCartLocationByFilter**](docs/CartLocationApi.md#getCartLocationByFilter) | **GET** /beta/cartLocation/search | Search cartLocations by filter
*CartLocationApi* | [**getCartLocationById**](docs/CartLocationApi.md#getCartLocationById) | **GET** /beta/cartLocation/{cartLocationId} | Get a cartLocation by id
*CartLocationApi* | [**getCartLocationFiles**](docs/CartLocationApi.md#getCartLocationFiles) | **GET** /beta/cartLocation/{cartLocationId}/file | Get the files for a cartLocation.
*CartLocationApi* | [**getCartLocationTags**](docs/CartLocationApi.md#getCartLocationTags) | **GET** /beta/cartLocation/{cartLocationId}/tag | Get the tags for a cartLocation.
*CartLocationApi* | [**getDuplicateCartLocationById**](docs/CartLocationApi.md#getDuplicateCartLocationById) | **GET** /beta/cartLocation/duplicate/{cartLocationId} | Get a duplicated a cartLocation by id
*CartonApi* | [**addCarton**](docs/CartonApi.md#addCarton) | **POST** /beta/carton | Create a carton
*CartonApi* | [**addCartonAudit**](docs/CartonApi.md#addCartonAudit) | **PUT** /beta/carton/{cartonId}/audit/{cartonAudit} | Add new audit for a carton
*CartonApi* | [**addCartonFile**](docs/CartonApi.md#addCartonFile) | **POST** /beta/carton/{cartonId}/file/{fileName} | Attach a file to a carton
*CartonApi* | [**addCartonFileByURL**](docs/CartonApi.md#addCartonFileByURL) | **POST** /beta/carton/{cartonId}/file | Attach a file to a carton by URL.
*CartonApi* | [**addCartonTag**](docs/CartonApi.md#addCartonTag) | **PUT** /beta/carton/{cartonId}/tag/{cartonTag} | Add new tags for a carton.
*CartonApi* | [**deleteCarton**](docs/CartonApi.md#deleteCarton) | **DELETE** /beta/carton/{cartonId} | Delete a carton
*CartonApi* | [**deleteCartonFile**](docs/CartonApi.md#deleteCartonFile) | **DELETE** /beta/carton/{cartonId}/file/{fileId} | Delete a file for a carton.
*CartonApi* | [**deleteCartonTag**](docs/CartonApi.md#deleteCartonTag) | **DELETE** /beta/carton/{cartonId}/tag/{cartonTag} | Delete a tag for a carton.
*CartonApi* | [**getCartonByFilter**](docs/CartonApi.md#getCartonByFilter) | **GET** /beta/carton/search | Search cartons by filter
*CartonApi* | [**getCartonById**](docs/CartonApi.md#getCartonById) | **GET** /beta/carton/{cartonId} | Get a carton by id
*CartonApi* | [**getCartonFiles**](docs/CartonApi.md#getCartonFiles) | **GET** /beta/carton/{cartonId}/file | Get the files for a carton.
*CartonApi* | [**getCartonTags**](docs/CartonApi.md#getCartonTags) | **GET** /beta/carton/{cartonId}/tag | Get the tags for a carton.
*CartonApi* | [**getDuplicateCartonById**](docs/CartonApi.md#getDuplicateCartonById) | **GET** /beta/carton/duplicate/{cartonId} | Get a duplicated a carton by id
*CartonApi* | [**updateCarton**](docs/CartonApi.md#updateCarton) | **PUT** /beta/carton | Update a carton
*CartonApi* | [**updateCartonCustomFields**](docs/CartonApi.md#updateCartonCustomFields) | **PUT** /beta/carton/customFields | Update a carton custom fields
*CartonActivityApi* | [**addCartonActivity**](docs/CartonActivityApi.md#addCartonActivity) | **POST** /beta/cartonActivity | Create a cartonActivity
*CartonActivityApi* | [**addCartonActivityAudit**](docs/CartonActivityApi.md#addCartonActivityAudit) | **PUT** /beta/cartonActivity/{cartonActivityId}/audit/{cartonActivityAudit} | Add new audit for a cartonActivity
*CartonActivityApi* | [**addCartonActivityFile**](docs/CartonActivityApi.md#addCartonActivityFile) | **POST** /beta/cartonActivity/{cartonActivityId}/file/{fileName} | Attach a file to a cartonActivity
*CartonActivityApi* | [**addCartonActivityFileByURL**](docs/CartonActivityApi.md#addCartonActivityFileByURL) | **POST** /beta/cartonActivity/{cartonActivityId}/file | Attach a file to a cartonActivity by URL.
*CartonActivityApi* | [**addCartonActivityTag**](docs/CartonActivityApi.md#addCartonActivityTag) | **PUT** /beta/cartonActivity/{cartonActivityId}/tag/{cartonActivityTag} | Add new tags for a cartonActivity.
*CartonActivityApi* | [**deleteCartonActivity**](docs/CartonActivityApi.md#deleteCartonActivity) | **DELETE** /beta/cartonActivity/{cartonActivityId} | Delete a cartonActivity
*CartonActivityApi* | [**deleteCartonActivityFile**](docs/CartonActivityApi.md#deleteCartonActivityFile) | **DELETE** /beta/cartonActivity/{cartonActivityId}/file/{fileId} | Delete a file for a cartonActivity.
*CartonActivityApi* | [**deleteCartonActivityTag**](docs/CartonActivityApi.md#deleteCartonActivityTag) | **DELETE** /beta/cartonActivity/{cartonActivityId}/tag/{cartonActivityTag} | Delete a tag for a cartonActivity.
*CartonActivityApi* | [**getCartonActivityByFilter**](docs/CartonActivityApi.md#getCartonActivityByFilter) | **GET** /beta/cartonActivity/search | Search cartonActivitys by filter
*CartonActivityApi* | [**getCartonActivityById**](docs/CartonActivityApi.md#getCartonActivityById) | **GET** /beta/cartonActivity/{cartonActivityId} | Get a cartonActivity by id
*CartonActivityApi* | [**getCartonActivityFiles**](docs/CartonActivityApi.md#getCartonActivityFiles) | **GET** /beta/cartonActivity/{cartonActivityId}/file | Get the files for a cartonActivity.
*CartonActivityApi* | [**getCartonActivityTags**](docs/CartonActivityApi.md#getCartonActivityTags) | **GET** /beta/cartonActivity/{cartonActivityId}/tag | Get the tags for a cartonActivity.
*CartonActivityApi* | [**getDuplicateCartonActivityById**](docs/CartonActivityApi.md#getDuplicateCartonActivityById) | **GET** /beta/cartonActivity/duplicate/{cartonActivityId} | Get a duplicated a cartonActivity by id
*CartonActivityApi* | [**updateCartonActivity**](docs/CartonActivityApi.md#updateCartonActivity) | **PUT** /beta/cartonActivity | Update a cartonActivity
*CartonContentApi* | [**addCartonContent**](docs/CartonContentApi.md#addCartonContent) | **POST** /beta/cartonContent | Create a cartonContent
*CartonContentApi* | [**addCartonContentAudit**](docs/CartonContentApi.md#addCartonContentAudit) | **PUT** /beta/cartonContent/{cartonContentId}/audit/{cartonContentAudit} | Add new audit for a cartonContent
*CartonContentApi* | [**addCartonContentFile**](docs/CartonContentApi.md#addCartonContentFile) | **POST** /beta/cartonContent/{cartonContentId}/file/{fileName} | Attach a file to a cartonContent
*CartonContentApi* | [**addCartonContentFileByURL**](docs/CartonContentApi.md#addCartonContentFileByURL) | **POST** /beta/cartonContent/{cartonContentId}/file | Attach a file to a cartonContent by URL.
*CartonContentApi* | [**addCartonContentTag**](docs/CartonContentApi.md#addCartonContentTag) | **PUT** /beta/cartonContent/{cartonContentId}/tag/{cartonContentTag} | Add new tags for a cartonContent.
*CartonContentApi* | [**deleteCartonContent**](docs/CartonContentApi.md#deleteCartonContent) | **DELETE** /beta/cartonContent/{cartonContentId} | Delete a cartonContent
*CartonContentApi* | [**deleteCartonContentFile**](docs/CartonContentApi.md#deleteCartonContentFile) | **DELETE** /beta/cartonContent/{cartonContentId}/file/{fileId} | Delete a file for a cartonContent.
*CartonContentApi* | [**deleteCartonContentTag**](docs/CartonContentApi.md#deleteCartonContentTag) | **DELETE** /beta/cartonContent/{cartonContentId}/tag/{cartonContentTag} | Delete a tag for a cartonContent.
*CartonContentApi* | [**getCartonContentByFilter**](docs/CartonContentApi.md#getCartonContentByFilter) | **GET** /beta/cartonContent/search | Search cartonContents by filter
*CartonContentApi* | [**getCartonContentById**](docs/CartonContentApi.md#getCartonContentById) | **GET** /beta/cartonContent/{cartonContentId} | Get a cartonContent by id
*CartonContentApi* | [**getCartonContentFiles**](docs/CartonContentApi.md#getCartonContentFiles) | **GET** /beta/cartonContent/{cartonContentId}/file | Get the files for a cartonContent.
*CartonContentApi* | [**getCartonContentTags**](docs/CartonContentApi.md#getCartonContentTags) | **GET** /beta/cartonContent/{cartonContentId}/tag | Get the tags for a cartonContent.
*CartonContentApi* | [**getDuplicateCartonContentById**](docs/CartonContentApi.md#getDuplicateCartonContentById) | **GET** /beta/cartonContent/duplicate/{cartonContentId} | Get a duplicated a cartonContent by id
*CartonContentApi* | [**updateCartonContent**](docs/CartonContentApi.md#updateCartonContent) | **PUT** /beta/cartonContent | Update a cartonContent
*CartonContentApi* | [**updateCartonContentCustomFields**](docs/CartonContentApi.md#updateCartonContentCustomFields) | **PUT** /beta/cartonContent/customFields | Update a cartonContent custom fields
*CartonTypeApi* | [**addCartonType**](docs/CartonTypeApi.md#addCartonType) | **POST** /beta/cartonType | Create a cartonType
*CartonTypeApi* | [**addCartonTypeAudit**](docs/CartonTypeApi.md#addCartonTypeAudit) | **PUT** /beta/cartonType/{cartonTypeId}/audit/{cartonTypeAudit} | Add new audit for a cartonType
*CartonTypeApi* | [**addCartonTypeFile**](docs/CartonTypeApi.md#addCartonTypeFile) | **POST** /beta/cartonType/{cartonTypeId}/file/{fileName} | Attach a file to a cartonType
*CartonTypeApi* | [**addCartonTypeFileByURL**](docs/CartonTypeApi.md#addCartonTypeFileByURL) | **POST** /beta/cartonType/{cartonTypeId}/file | Attach a file to a cartonType by URL.
*CartonTypeApi* | [**addCartonTypeTag**](docs/CartonTypeApi.md#addCartonTypeTag) | **PUT** /beta/cartonType/{cartonTypeId}/tag/{cartonTypeTag} | Add new tags for a cartonType.
*CartonTypeApi* | [**deleteCartonType**](docs/CartonTypeApi.md#deleteCartonType) | **DELETE** /beta/cartonType/{cartonTypeId} | Delete a cartonType
*CartonTypeApi* | [**deleteCartonTypeFile**](docs/CartonTypeApi.md#deleteCartonTypeFile) | **DELETE** /beta/cartonType/{cartonTypeId}/file/{fileId} | Delete a file for a cartonType.
*CartonTypeApi* | [**deleteCartonTypeTag**](docs/CartonTypeApi.md#deleteCartonTypeTag) | **DELETE** /beta/cartonType/{cartonTypeId}/tag/{cartonTypeTag} | Delete a tag for a cartonType.
*CartonTypeApi* | [**getCartonTypeByFilter**](docs/CartonTypeApi.md#getCartonTypeByFilter) | **GET** /beta/cartonType/search | Search cartonTypes by filter
*CartonTypeApi* | [**getCartonTypeById**](docs/CartonTypeApi.md#getCartonTypeById) | **GET** /beta/cartonType/{cartonTypeId} | Get a cartonType by id
*CartonTypeApi* | [**getCartonTypeFiles**](docs/CartonTypeApi.md#getCartonTypeFiles) | **GET** /beta/cartonType/{cartonTypeId}/file | Get the files for a cartonType.
*CartonTypeApi* | [**getCartonTypeTags**](docs/CartonTypeApi.md#getCartonTypeTags) | **GET** /beta/cartonType/{cartonTypeId}/tag | Get the tags for a cartonType.
*CartonTypeApi* | [**getDuplicateCartonTypeById**](docs/CartonTypeApi.md#getDuplicateCartonTypeById) | **GET** /beta/cartonType/duplicate/{cartonTypeId} | Get a duplicated a cartonType by id
*CartonTypeApi* | [**updateCartonType**](docs/CartonTypeApi.md#updateCartonType) | **PUT** /beta/cartonType | Update a cartonType
*CartonTypeApi* | [**updateCartonTypeCustomFields**](docs/CartonTypeApi.md#updateCartonTypeCustomFields) | **PUT** /beta/cartonType/customFields | Update a cartonType custom fields
*CommodityCodeApi* | [**addCommodityCodeAudit**](docs/CommodityCodeApi.md#addCommodityCodeAudit) | **PUT** /beta/commodityCode/{commodityCodeId}/audit/{commodityCodeAudit} | Add new audit for a commodityCode
*CommodityCodeApi* | [**addCommodityCodeFile**](docs/CommodityCodeApi.md#addCommodityCodeFile) | **POST** /beta/commodityCode/{commodityCodeId}/file/{fileName} | Attach a file to a commodityCode
*CommodityCodeApi* | [**addCommodityCodeFileByURL**](docs/CommodityCodeApi.md#addCommodityCodeFileByURL) | **POST** /beta/commodityCode/{commodityCodeId}/file | Attach a file to a commodityCode by URL.
*CommodityCodeApi* | [**addCommodityCodeTag**](docs/CommodityCodeApi.md#addCommodityCodeTag) | **PUT** /beta/commodityCode/{commodityCodeId}/tag/{commodityCodeTag} | Add new tags for a commodityCode.
*CommodityCodeApi* | [**deleteCommodityCodeFile**](docs/CommodityCodeApi.md#deleteCommodityCodeFile) | **DELETE** /beta/commodityCode/{commodityCodeId}/file/{fileId} | Delete a file for a commodityCode.
*CommodityCodeApi* | [**deleteCommodityCodeTag**](docs/CommodityCodeApi.md#deleteCommodityCodeTag) | **DELETE** /beta/commodityCode/{commodityCodeId}/tag/{commodityCodeTag} | Delete a tag for a commodityCode.
*CommodityCodeApi* | [**getCommodityCodeByFilter**](docs/CommodityCodeApi.md#getCommodityCodeByFilter) | **GET** /beta/commodityCode/search | Search commodityCodes by filter
*CommodityCodeApi* | [**getCommodityCodeById**](docs/CommodityCodeApi.md#getCommodityCodeById) | **GET** /beta/commodityCode/{commodityCodeId} | Get a commodityCode by id
*CommodityCodeApi* | [**getCommodityCodeFiles**](docs/CommodityCodeApi.md#getCommodityCodeFiles) | **GET** /beta/commodityCode/{commodityCodeId}/file | Get the files for a commodityCode.
*CommodityCodeApi* | [**getCommodityCodeTags**](docs/CommodityCodeApi.md#getCommodityCodeTags) | **GET** /beta/commodityCode/{commodityCodeId}/tag | Get the tags for a commodityCode.
*CommodityCodeApi* | [**getDuplicateCommodityCodeById**](docs/CommodityCodeApi.md#getDuplicateCommodityCodeById) | **GET** /beta/commodityCode/duplicate/{commodityCodeId} | Get a duplicated a commodityCode by id
*CustomFieldApi* | [**addCustomField**](docs/CustomFieldApi.md#addCustomField) | **POST** /beta/customField | Create a customField
*CustomFieldApi* | [**addCustomFieldAudit**](docs/CustomFieldApi.md#addCustomFieldAudit) | **PUT** /beta/customField/{customFieldId}/audit/{customFieldAudit} | Add new audit for a customField
*CustomFieldApi* | [**addCustomFieldFile**](docs/CustomFieldApi.md#addCustomFieldFile) | **POST** /beta/customField/{customFieldId}/file/{fileName} | Attach a file to a customField
*CustomFieldApi* | [**addCustomFieldFileByURL**](docs/CustomFieldApi.md#addCustomFieldFileByURL) | **POST** /beta/customField/{customFieldId}/file | Attach a file to a customField by URL.
*CustomFieldApi* | [**addCustomFieldTag**](docs/CustomFieldApi.md#addCustomFieldTag) | **PUT** /beta/customField/{customFieldId}/tag/{customFieldTag} | Add new tags for a customField.
*CustomFieldApi* | [**deleteCustomFieldFile**](docs/CustomFieldApi.md#deleteCustomFieldFile) | **DELETE** /beta/customField/{customFieldId}/file/{fileId} | Delete a file for a customField.
*CustomFieldApi* | [**deleteCustomFieldTag**](docs/CustomFieldApi.md#deleteCustomFieldTag) | **DELETE** /beta/customField/{customFieldId}/tag/{customFieldTag} | Delete a tag for a customField.
*CustomFieldApi* | [**getCustomFieldByFilter**](docs/CustomFieldApi.md#getCustomFieldByFilter) | **GET** /beta/customField/search | Search customFields by filter
*CustomFieldApi* | [**getCustomFieldById**](docs/CustomFieldApi.md#getCustomFieldById) | **GET** /beta/customField/{customFieldId} | Get a customField by id
*CustomFieldApi* | [**getCustomFieldFiles**](docs/CustomFieldApi.md#getCustomFieldFiles) | **GET** /beta/customField/{customFieldId}/file | Get the files for a customField.
*CustomFieldApi* | [**getCustomFieldTags**](docs/CustomFieldApi.md#getCustomFieldTags) | **GET** /beta/customField/{customFieldId}/tag | Get the tags for a customField.
*CustomFieldApi* | [**getDuplicateCustomFieldById**](docs/CustomFieldApi.md#getDuplicateCustomFieldById) | **GET** /beta/customField/duplicate/{customFieldId} | Get a duplicated a customField by id
*CustomFieldApi* | [**updateCustomField**](docs/CustomFieldApi.md#updateCustomField) | **PUT** /beta/customField | Update a customField
*CustomerApi* | [**addCustomer**](docs/CustomerApi.md#addCustomer) | **POST** /beta/customer | Create a customer
*CustomerApi* | [**addCustomerAudit**](docs/CustomerApi.md#addCustomerAudit) | **PUT** /beta/customer/{customerId}/audit/{customerAudit} | Add new audit for a customer
*CustomerApi* | [**addCustomerFile**](docs/CustomerApi.md#addCustomerFile) | **POST** /beta/customer/{customerId}/file/{fileName} | Attach a file to a customer
*CustomerApi* | [**addCustomerFileByURL**](docs/CustomerApi.md#addCustomerFileByURL) | **POST** /beta/customer/{customerId}/file | Attach a file to a customer by URL.
*CustomerApi* | [**addCustomerTag**](docs/CustomerApi.md#addCustomerTag) | **PUT** /beta/customer/{customerId}/tag/{customerTag} | Add new tags for a customer.
*CustomerApi* | [**deleteCustomer**](docs/CustomerApi.md#deleteCustomer) | **DELETE** /beta/customer/{customerId} | Delete a customer
*CustomerApi* | [**deleteCustomerFile**](docs/CustomerApi.md#deleteCustomerFile) | **DELETE** /beta/customer/{customerId}/file/{fileId} | Delete a file for a customer.
*CustomerApi* | [**deleteCustomerTag**](docs/CustomerApi.md#deleteCustomerTag) | **DELETE** /beta/customer/{customerId}/tag/{customerTag} | Delete a tag for a customer.
*CustomerApi* | [**getByCustomerNo**](docs/CustomerApi.md#getByCustomerNo) | **GET** /beta/customer/getByCustomerNo | Get a customer by Customer No
*CustomerApi* | [**getCustomerByFilter**](docs/CustomerApi.md#getCustomerByFilter) | **GET** /beta/customer/search | Search customers by filter
*CustomerApi* | [**getCustomerById**](docs/CustomerApi.md#getCustomerById) | **GET** /beta/customer/{customerId} | Get a customer by id
*CustomerApi* | [**getCustomerFiles**](docs/CustomerApi.md#getCustomerFiles) | **GET** /beta/customer/{customerId}/file | Get the files for a customer.
*CustomerApi* | [**getCustomerTags**](docs/CustomerApi.md#getCustomerTags) | **GET** /beta/customer/{customerId}/tag | Get the tags for a customer.
*CustomerApi* | [**getDuplicateCustomerById**](docs/CustomerApi.md#getDuplicateCustomerById) | **GET** /beta/customer/duplicate/{customerId} | Get a duplicated a customer by id
*CustomerApi* | [**updateCustomer**](docs/CustomerApi.md#updateCustomer) | **PUT** /beta/customer | Update a customer
*CustomerApi* | [**updateCustomerCustomFields**](docs/CustomerApi.md#updateCustomerCustomFields) | **PUT** /beta/customer/customFields | Update a customer custom fields
*CustomerInvoiceTemplateApi* | [**addCustomerInvoiceTemplate**](docs/CustomerInvoiceTemplateApi.md#addCustomerInvoiceTemplate) | **POST** /beta/customerInvoiceTemplate | Create a customerInvoiceTemplate
*CustomerInvoiceTemplateApi* | [**addCustomerInvoiceTemplateAudit**](docs/CustomerInvoiceTemplateApi.md#addCustomerInvoiceTemplateAudit) | **PUT** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/audit/{customerInvoiceTemplateAudit} | Add new audit for a customerInvoiceTemplate
*CustomerInvoiceTemplateApi* | [**addCustomerInvoiceTemplateFile**](docs/CustomerInvoiceTemplateApi.md#addCustomerInvoiceTemplateFile) | **POST** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/file/{fileName} | Attach a file to a customerInvoiceTemplate
*CustomerInvoiceTemplateApi* | [**addCustomerInvoiceTemplateFileByURL**](docs/CustomerInvoiceTemplateApi.md#addCustomerInvoiceTemplateFileByURL) | **POST** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/file | Attach a file to a customerInvoiceTemplate by URL.
*CustomerInvoiceTemplateApi* | [**addCustomerInvoiceTemplateTag**](docs/CustomerInvoiceTemplateApi.md#addCustomerInvoiceTemplateTag) | **PUT** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/tag/{customerInvoiceTemplateTag} | Add new tags for a customerInvoiceTemplate.
*CustomerInvoiceTemplateApi* | [**deleteCustomerInvoiceTemplate**](docs/CustomerInvoiceTemplateApi.md#deleteCustomerInvoiceTemplate) | **DELETE** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId} | Delete a customerInvoiceTemplate
*CustomerInvoiceTemplateApi* | [**deleteCustomerInvoiceTemplateFile**](docs/CustomerInvoiceTemplateApi.md#deleteCustomerInvoiceTemplateFile) | **DELETE** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/file/{fileId} | Delete a file for a customerInvoiceTemplate.
*CustomerInvoiceTemplateApi* | [**deleteCustomerInvoiceTemplateTag**](docs/CustomerInvoiceTemplateApi.md#deleteCustomerInvoiceTemplateTag) | **DELETE** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/tag/{customerInvoiceTemplateTag} | Delete a tag for a customerInvoiceTemplate.
*CustomerInvoiceTemplateApi* | [**getCustomerInvoiceTemplateByFilter**](docs/CustomerInvoiceTemplateApi.md#getCustomerInvoiceTemplateByFilter) | **GET** /beta/customerInvoiceTemplate/search | Search customerInvoiceTemplates by filter
*CustomerInvoiceTemplateApi* | [**getCustomerInvoiceTemplateById**](docs/CustomerInvoiceTemplateApi.md#getCustomerInvoiceTemplateById) | **GET** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId} | Get a customerInvoiceTemplate by id
*CustomerInvoiceTemplateApi* | [**getCustomerInvoiceTemplateFiles**](docs/CustomerInvoiceTemplateApi.md#getCustomerInvoiceTemplateFiles) | **GET** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/file | Get the files for a customerInvoiceTemplate.
*CustomerInvoiceTemplateApi* | [**getCustomerInvoiceTemplateTags**](docs/CustomerInvoiceTemplateApi.md#getCustomerInvoiceTemplateTags) | **GET** /beta/customerInvoiceTemplate/{customerInvoiceTemplateId}/tag | Get the tags for a customerInvoiceTemplate.
*CustomerInvoiceTemplateApi* | [**getDuplicateCustomerInvoiceTemplateById**](docs/CustomerInvoiceTemplateApi.md#getDuplicateCustomerInvoiceTemplateById) | **GET** /beta/customerInvoiceTemplate/duplicate/{customerInvoiceTemplateId} | Get a duplicated a customerInvoiceTemplate by id
*CustomerInvoiceTemplateApi* | [**updateCustomerInvoiceTemplate**](docs/CustomerInvoiceTemplateApi.md#updateCustomerInvoiceTemplate) | **PUT** /beta/customerInvoiceTemplate | Update a customerInvoiceTemplate
*CustomerInvoiceTemplateLineApi* | [**addCustomerInvoiceTemplateLineAudit**](docs/CustomerInvoiceTemplateLineApi.md#addCustomerInvoiceTemplateLineAudit) | **PUT** /beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/audit/{customerInvoiceTemplateLineAudit} | Add new audit for a customerInvoiceTemplateLine
*CustomerInvoiceTemplateLineApi* | [**addCustomerInvoiceTemplateLineFile**](docs/CustomerInvoiceTemplateLineApi.md#addCustomerInvoiceTemplateLineFile) | **POST** /beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/file/{fileName} | Attach a file to a customerInvoiceTemplateLine
*CustomerInvoiceTemplateLineApi* | [**addCustomerInvoiceTemplateLineFileByURL**](docs/CustomerInvoiceTemplateLineApi.md#addCustomerInvoiceTemplateLineFileByURL) | **POST** /beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/file | Attach a file to a customerInvoiceTemplateLine by URL.
*CustomerInvoiceTemplateLineApi* | [**addCustomerInvoiceTemplateLineTag**](docs/CustomerInvoiceTemplateLineApi.md#addCustomerInvoiceTemplateLineTag) | **PUT** /beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/tag/{customerInvoiceTemplateLineTag} | Add new tags for a customerInvoiceTemplateLine.
*CustomerInvoiceTemplateLineApi* | [**deleteCustomerInvoiceTemplateLine**](docs/CustomerInvoiceTemplateLineApi.md#deleteCustomerInvoiceTemplateLine) | **DELETE** /beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId} | Delete a customerInvoiceTemplateLine
*CustomerInvoiceTemplateLineApi* | [**deleteCustomerInvoiceTemplateLineFile**](docs/CustomerInvoiceTemplateLineApi.md#deleteCustomerInvoiceTemplateLineFile) | **DELETE** /beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/file/{fileId} | Delete a file for a customerInvoiceTemplateLine.
*CustomerInvoiceTemplateLineApi* | [**deleteCustomerInvoiceTemplateLineTag**](docs/CustomerInvoiceTemplateLineApi.md#deleteCustomerInvoiceTemplateLineTag) | **DELETE** /beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/tag/{customerInvoiceTemplateLineTag} | Delete a tag for a customerInvoiceTemplateLine.
*CustomerInvoiceTemplateLineApi* | [**getCustomerInvoiceTemplateLineByFilter**](docs/CustomerInvoiceTemplateLineApi.md#getCustomerInvoiceTemplateLineByFilter) | **GET** /beta/customerInvoiceTemplateLine/search | Search customerInvoiceTemplateLines by filter
*CustomerInvoiceTemplateLineApi* | [**getCustomerInvoiceTemplateLineById**](docs/CustomerInvoiceTemplateLineApi.md#getCustomerInvoiceTemplateLineById) | **GET** /beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId} | Get a customerInvoiceTemplateLine by id
*CustomerInvoiceTemplateLineApi* | [**getCustomerInvoiceTemplateLineFiles**](docs/CustomerInvoiceTemplateLineApi.md#getCustomerInvoiceTemplateLineFiles) | **GET** /beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/file | Get the files for a customerInvoiceTemplateLine.
*CustomerInvoiceTemplateLineApi* | [**getCustomerInvoiceTemplateLineTags**](docs/CustomerInvoiceTemplateLineApi.md#getCustomerInvoiceTemplateLineTags) | **GET** /beta/customerInvoiceTemplateLine/{customerInvoiceTemplateLineId}/tag | Get the tags for a customerInvoiceTemplateLine.
*CustomerInvoiceTemplateLineApi* | [**getDuplicateCustomerInvoiceTemplateLineById**](docs/CustomerInvoiceTemplateLineApi.md#getDuplicateCustomerInvoiceTemplateLineById) | **GET** /beta/customerInvoiceTemplateLine/duplicate/{customerInvoiceTemplateLineId} | Get a duplicated a customerInvoiceTemplateLine by id
*CustomerInvoiceTemplateLineApi* | [**updateCustomerInvoiceTemplateLine**](docs/CustomerInvoiceTemplateLineApi.md#updateCustomerInvoiceTemplateLine) | **PUT** /beta/customerInvoiceTemplateLine | Update a customerInvoiceTemplateLine
*EDiDocumentTypeApi* | [**getEDIDocumentTypeById**](docs/EDiDocumentTypeApi.md#getEDIDocumentTypeById) | **GET** /beta/eDIDocumentType/{eDIDocumentTypeId} | Get an eDIDocumentType by id
*EDiDocumentTypeApi* | [**getEDIDocumentTypeBySearchText**](docs/EDiDocumentTypeApi.md#getEDIDocumentTypeBySearchText) | **GET** /beta/eDIDocumentType/search | Search eDIDocumentTypes
*EdiDocumentApi* | [**addEdiDocument**](docs/EdiDocumentApi.md#addEdiDocument) | **POST** /beta/ediDocument | Create an ediDocument
*EdiDocumentApi* | [**addEdiDocumentAudit**](docs/EdiDocumentApi.md#addEdiDocumentAudit) | **PUT** /beta/ediDocument/{ediDocumentId}/audit/{ediDocumentAudit} | Add new audit for an ediDocument
*EdiDocumentApi* | [**addEdiDocumentFile**](docs/EdiDocumentApi.md#addEdiDocumentFile) | **POST** /beta/ediDocument/{ediDocumentId}/file/{fileName} | Attach a file to an ediDocument
*EdiDocumentApi* | [**addEdiDocumentFileByURL**](docs/EdiDocumentApi.md#addEdiDocumentFileByURL) | **POST** /beta/ediDocument/{ediDocumentId}/file | Attach a file to an ediDocument by URL.
*EdiDocumentApi* | [**addEdiDocumentTag**](docs/EdiDocumentApi.md#addEdiDocumentTag) | **PUT** /beta/ediDocument/{ediDocumentId}/tag/{ediDocumentTag} | Add new tags for an ediDocument.
*EdiDocumentApi* | [**deleteEdiDocumentFile**](docs/EdiDocumentApi.md#deleteEdiDocumentFile) | **DELETE** /beta/ediDocument/{ediDocumentId}/file/{fileId} | Delete a file for an ediDocument.
*EdiDocumentApi* | [**deleteEdiDocumentTag**](docs/EdiDocumentApi.md#deleteEdiDocumentTag) | **DELETE** /beta/ediDocument/{ediDocumentId}/tag/{ediDocumentTag} | Delete a tag for an ediDocument.
*EdiDocumentApi* | [**getDuplicateEdiDocumentById**](docs/EdiDocumentApi.md#getDuplicateEdiDocumentById) | **GET** /beta/ediDocument/duplicate/{ediDocumentId} | Get a duplicated an ediDocument by id
*EdiDocumentApi* | [**getEdiDocumentByFilter**](docs/EdiDocumentApi.md#getEdiDocumentByFilter) | **GET** /beta/ediDocument/search | Search ediDocuments by filter
*EdiDocumentApi* | [**getEdiDocumentById**](docs/EdiDocumentApi.md#getEdiDocumentById) | **GET** /beta/ediDocument/{ediDocumentId} | Get an ediDocument by id
*EdiDocumentApi* | [**getEdiDocumentFiles**](docs/EdiDocumentApi.md#getEdiDocumentFiles) | **GET** /beta/ediDocument/{ediDocumentId}/file | Get the files for an ediDocument.
*EdiDocumentApi* | [**getEdiDocumentTags**](docs/EdiDocumentApi.md#getEdiDocumentTags) | **GET** /beta/ediDocument/{ediDocumentId}/tag | Get the tags for an ediDocument.
*EmailTemplateApi* | [**addEmailTemplate**](docs/EmailTemplateApi.md#addEmailTemplate) | **POST** /beta/emailTemplate | Create an emailTemplate
*EmailTemplateApi* | [**addEmailTemplateAudit**](docs/EmailTemplateApi.md#addEmailTemplateAudit) | **PUT** /beta/emailTemplate/{emailTemplateId}/audit/{emailTemplateAudit} | Add new audit for an emailTemplate
*EmailTemplateApi* | [**addEmailTemplateFile**](docs/EmailTemplateApi.md#addEmailTemplateFile) | **POST** /beta/emailTemplate/{emailTemplateId}/file/{fileName} | Attach a file to an emailTemplate
*EmailTemplateApi* | [**addEmailTemplateFileByURL**](docs/EmailTemplateApi.md#addEmailTemplateFileByURL) | **POST** /beta/emailTemplate/{emailTemplateId}/file | Attach a file to an emailTemplate by URL.
*EmailTemplateApi* | [**addEmailTemplateTag**](docs/EmailTemplateApi.md#addEmailTemplateTag) | **PUT** /beta/emailTemplate/{emailTemplateId}/tag/{emailTemplateTag} | Add new tags for an emailTemplate.
*EmailTemplateApi* | [**deleteEmailTemplate**](docs/EmailTemplateApi.md#deleteEmailTemplate) | **DELETE** /beta/emailTemplate/{emailTemplateId} | Delete an emailTemplate
*EmailTemplateApi* | [**deleteEmailTemplateFile**](docs/EmailTemplateApi.md#deleteEmailTemplateFile) | **DELETE** /beta/emailTemplate/{emailTemplateId}/file/{fileId} | Delete a file for an emailTemplate.
*EmailTemplateApi* | [**deleteEmailTemplateTag**](docs/EmailTemplateApi.md#deleteEmailTemplateTag) | **DELETE** /beta/emailTemplate/{emailTemplateId}/tag/{emailTemplateTag} | Delete a tag for an emailTemplate.
*EmailTemplateApi* | [**getDuplicateEmailTemplateById**](docs/EmailTemplateApi.md#getDuplicateEmailTemplateById) | **GET** /beta/emailTemplate/duplicate/{emailTemplateId} | Get a duplicated an emailTemplate by id
*EmailTemplateApi* | [**getEmailTemplateByFilter**](docs/EmailTemplateApi.md#getEmailTemplateByFilter) | **GET** /beta/emailTemplate/search | Search emailTemplates by filter
*EmailTemplateApi* | [**getEmailTemplateById**](docs/EmailTemplateApi.md#getEmailTemplateById) | **GET** /beta/emailTemplate/{emailTemplateId} | Get an emailTemplate by id
*EmailTemplateApi* | [**getEmailTemplateFiles**](docs/EmailTemplateApi.md#getEmailTemplateFiles) | **GET** /beta/emailTemplate/{emailTemplateId}/file | Get the files for an emailTemplate.
*EmailTemplateApi* | [**getEmailTemplateTags**](docs/EmailTemplateApi.md#getEmailTemplateTags) | **GET** /beta/emailTemplate/{emailTemplateId}/tag | Get the tags for an emailTemplate.
*EmailTemplateApi* | [**updateEmailTemplate**](docs/EmailTemplateApi.md#updateEmailTemplate) | **PUT** /beta/emailTemplate | Update an emailTemplate
*EmailTemplateApi* | [**updateEmailTemplateCustomFields**](docs/EmailTemplateApi.md#updateEmailTemplateCustomFields) | **PUT** /beta/emailTemplate/customFields | Update an emailTemplate custom fields
*ExternalShipmentApi* | [**addExternalShipment**](docs/ExternalShipmentApi.md#addExternalShipment) | **POST** /beta/externalShipment | Create an externalShipment
*ExternalShipmentApi* | [**addExternalShipmentAudit**](docs/ExternalShipmentApi.md#addExternalShipmentAudit) | **PUT** /beta/externalShipment/{externalShipmentId}/audit/{externalShipmentAudit} | Add new audit for an externalShipment
*ExternalShipmentApi* | [**addExternalShipmentFile**](docs/ExternalShipmentApi.md#addExternalShipmentFile) | **POST** /beta/externalShipment/{externalShipmentId}/file/{fileName} | Attach a file to an externalShipment
*ExternalShipmentApi* | [**addExternalShipmentFileByURL**](docs/ExternalShipmentApi.md#addExternalShipmentFileByURL) | **POST** /beta/externalShipment/{externalShipmentId}/file | Attach a file to an externalShipment by URL.
*ExternalShipmentApi* | [**addExternalShipmentTag**](docs/ExternalShipmentApi.md#addExternalShipmentTag) | **PUT** /beta/externalShipment/{externalShipmentId}/tag/{externalShipmentTag} | Add new tags for an externalShipment.
*ExternalShipmentApi* | [**deleteExternalShipment**](docs/ExternalShipmentApi.md#deleteExternalShipment) | **DELETE** /beta/externalShipment/{externalShipmentId} | Delete an externalShipment
*ExternalShipmentApi* | [**deleteExternalShipmentFile**](docs/ExternalShipmentApi.md#deleteExternalShipmentFile) | **DELETE** /beta/externalShipment/{externalShipmentId}/file/{fileId} | Delete a file for an externalShipment.
*ExternalShipmentApi* | [**deleteExternalShipmentTag**](docs/ExternalShipmentApi.md#deleteExternalShipmentTag) | **DELETE** /beta/externalShipment/{externalShipmentId}/tag/{externalShipmentTag} | Delete a tag for an externalShipment.
*ExternalShipmentApi* | [**executeExternalShipment**](docs/ExternalShipmentApi.md#executeExternalShipment) | **POST** /beta/externalShipment/executeExternalShipment | Execute externalShipment
*ExternalShipmentApi* | [**getDuplicateExternalShipmentById**](docs/ExternalShipmentApi.md#getDuplicateExternalShipmentById) | **GET** /beta/externalShipment/duplicate/{externalShipmentId} | Get a duplicated an externalShipment by id
*ExternalShipmentApi* | [**getExternalShipmentByFilter**](docs/ExternalShipmentApi.md#getExternalShipmentByFilter) | **GET** /beta/externalShipment/search | Search externalShipments by filter
*ExternalShipmentApi* | [**getExternalShipmentById**](docs/ExternalShipmentApi.md#getExternalShipmentById) | **GET** /beta/externalShipment/{externalShipmentId} | Get an externalShipment by id
*ExternalShipmentApi* | [**getExternalShipmentFiles**](docs/ExternalShipmentApi.md#getExternalShipmentFiles) | **GET** /beta/externalShipment/{externalShipmentId}/file | Get the files for an externalShipment.
*ExternalShipmentApi* | [**getExternalShipmentTags**](docs/ExternalShipmentApi.md#getExternalShipmentTags) | **GET** /beta/externalShipment/{externalShipmentId}/tag | Get the tags for an externalShipment.
*ExternalShipmentApi* | [**updateExternalShipment**](docs/ExternalShipmentApi.md#updateExternalShipment) | **PUT** /beta/externalShipment | Update an externalShipment
*ExternalShipmentApi* | [**updateExternalShipmentCustomFields**](docs/ExternalShipmentApi.md#updateExternalShipmentCustomFields) | **PUT** /beta/externalShipment/customFields | Update an externalShipment custom fields
*ExternalShippingSystemApi* | [**addExternalShippingSystem**](docs/ExternalShippingSystemApi.md#addExternalShippingSystem) | **POST** /beta/externalShippingSystem | Create an externalShippingSystem
*ExternalShippingSystemApi* | [**addExternalShippingSystemAudit**](docs/ExternalShippingSystemApi.md#addExternalShippingSystemAudit) | **PUT** /beta/externalShippingSystem/{externalShippingSystemId}/audit/{externalShippingSystemAudit} | Add new audit for an externalShippingSystem
*ExternalShippingSystemApi* | [**addExternalShippingSystemFile**](docs/ExternalShippingSystemApi.md#addExternalShippingSystemFile) | **POST** /beta/externalShippingSystem/{externalShippingSystemId}/file/{fileName} | Attach a file to an externalShippingSystem
*ExternalShippingSystemApi* | [**addExternalShippingSystemFileByURL**](docs/ExternalShippingSystemApi.md#addExternalShippingSystemFileByURL) | **POST** /beta/externalShippingSystem/{externalShippingSystemId}/file | Attach a file to an externalShippingSystem by URL.
*ExternalShippingSystemApi* | [**addExternalShippingSystemTag**](docs/ExternalShippingSystemApi.md#addExternalShippingSystemTag) | **PUT** /beta/externalShippingSystem/{externalShippingSystemId}/tag/{externalShippingSystemTag} | Add new tags for an externalShippingSystem.
*ExternalShippingSystemApi* | [**deleteExternalShippingSystem**](docs/ExternalShippingSystemApi.md#deleteExternalShippingSystem) | **DELETE** /beta/externalShippingSystem/{externalShippingSystemId} | Delete an externalShippingSystem
*ExternalShippingSystemApi* | [**deleteExternalShippingSystemFile**](docs/ExternalShippingSystemApi.md#deleteExternalShippingSystemFile) | **DELETE** /beta/externalShippingSystem/{externalShippingSystemId}/file/{fileId} | Delete a file for an externalShippingSystem.
*ExternalShippingSystemApi* | [**deleteExternalShippingSystemTag**](docs/ExternalShippingSystemApi.md#deleteExternalShippingSystemTag) | **DELETE** /beta/externalShippingSystem/{externalShippingSystemId}/tag/{externalShippingSystemTag} | Delete a tag for an externalShippingSystem.
*ExternalShippingSystemApi* | [**getDuplicateExternalShippingSystemById**](docs/ExternalShippingSystemApi.md#getDuplicateExternalShippingSystemById) | **GET** /beta/externalShippingSystem/duplicate/{externalShippingSystemId} | Get a duplicated an externalShippingSystem by id
*ExternalShippingSystemApi* | [**getExternalShippingSystemByFilter**](docs/ExternalShippingSystemApi.md#getExternalShippingSystemByFilter) | **GET** /beta/externalShippingSystem/search | Search externalShippingSystems by filter
*ExternalShippingSystemApi* | [**getExternalShippingSystemById**](docs/ExternalShippingSystemApi.md#getExternalShippingSystemById) | **GET** /beta/externalShippingSystem/{externalShippingSystemId} | Get an externalShippingSystem by id
*ExternalShippingSystemApi* | [**getExternalShippingSystemFiles**](docs/ExternalShippingSystemApi.md#getExternalShippingSystemFiles) | **GET** /beta/externalShippingSystem/{externalShippingSystemId}/file | Get the files for an externalShippingSystem.
*ExternalShippingSystemApi* | [**getExternalShippingSystemTags**](docs/ExternalShippingSystemApi.md#getExternalShippingSystemTags) | **GET** /beta/externalShippingSystem/{externalShippingSystemId}/tag | Get the tags for an externalShippingSystem.
*ExternalShippingSystemApi* | [**updateExternalShippingSystem**](docs/ExternalShippingSystemApi.md#updateExternalShippingSystem) | **PUT** /beta/externalShippingSystem | Update an externalShippingSystem
*ExternalShippingSystemApi* | [**updateExternalShippingSystemCustomFields**](docs/ExternalShippingSystemApi.md#updateExternalShippingSystemCustomFields) | **PUT** /beta/externalShippingSystem/customFields | Update an externalShippingSystem custom fields
*FinanceSystemConnectionApi* | [**addFinanceSystemConnection**](docs/FinanceSystemConnectionApi.md#addFinanceSystemConnection) | **POST** /beta/financeSystemConnection | Create a financeSystemConnection
*FinanceSystemConnectionApi* | [**addFinanceSystemConnectionAudit**](docs/FinanceSystemConnectionApi.md#addFinanceSystemConnectionAudit) | **PUT** /beta/financeSystemConnection/{financeSystemConnectionId}/audit/{financeSystemConnectionAudit} | Add new audit for a financeSystemConnection
*FinanceSystemConnectionApi* | [**addFinanceSystemConnectionFile**](docs/FinanceSystemConnectionApi.md#addFinanceSystemConnectionFile) | **POST** /beta/financeSystemConnection/{financeSystemConnectionId}/file/{fileName} | Attach a file to a financeSystemConnection
*FinanceSystemConnectionApi* | [**addFinanceSystemConnectionFileByURL**](docs/FinanceSystemConnectionApi.md#addFinanceSystemConnectionFileByURL) | **POST** /beta/financeSystemConnection/{financeSystemConnectionId}/file | Attach a file to a financeSystemConnection by URL.
*FinanceSystemConnectionApi* | [**addFinanceSystemConnectionTag**](docs/FinanceSystemConnectionApi.md#addFinanceSystemConnectionTag) | **PUT** /beta/financeSystemConnection/{financeSystemConnectionId}/tag/{financeSystemConnectionTag} | Add new tags for a financeSystemConnection.
*FinanceSystemConnectionApi* | [**deleteFinanceSystemConnection**](docs/FinanceSystemConnectionApi.md#deleteFinanceSystemConnection) | **DELETE** /beta/financeSystemConnection/{financeSystemConnectionId} | Delete a financeSystemConnection
*FinanceSystemConnectionApi* | [**deleteFinanceSystemConnectionFile**](docs/FinanceSystemConnectionApi.md#deleteFinanceSystemConnectionFile) | **DELETE** /beta/financeSystemConnection/{financeSystemConnectionId}/file/{fileId} | Delete a file for a financeSystemConnection.
*FinanceSystemConnectionApi* | [**deleteFinanceSystemConnectionTag**](docs/FinanceSystemConnectionApi.md#deleteFinanceSystemConnectionTag) | **DELETE** /beta/financeSystemConnection/{financeSystemConnectionId}/tag/{financeSystemConnectionTag} | Delete a tag for a financeSystemConnection.
*FinanceSystemConnectionApi* | [**getDuplicateFinanceSystemConnectionById**](docs/FinanceSystemConnectionApi.md#getDuplicateFinanceSystemConnectionById) | **GET** /beta/financeSystemConnection/duplicate/{financeSystemConnectionId} | Get a duplicated a financeSystemConnection by id
*FinanceSystemConnectionApi* | [**getFinanceSystemConnectionByFilter**](docs/FinanceSystemConnectionApi.md#getFinanceSystemConnectionByFilter) | **GET** /beta/financeSystemConnection/search | Search financeSystemConnections by filter
*FinanceSystemConnectionApi* | [**getFinanceSystemConnectionById**](docs/FinanceSystemConnectionApi.md#getFinanceSystemConnectionById) | **GET** /beta/financeSystemConnection/{financeSystemConnectionId} | Get a financeSystemConnection by id
*FinanceSystemConnectionApi* | [**getFinanceSystemConnectionFiles**](docs/FinanceSystemConnectionApi.md#getFinanceSystemConnectionFiles) | **GET** /beta/financeSystemConnection/{financeSystemConnectionId}/file | Get the files for a financeSystemConnection.
*FinanceSystemConnectionApi* | [**getFinanceSystemConnectionTags**](docs/FinanceSystemConnectionApi.md#getFinanceSystemConnectionTags) | **GET** /beta/financeSystemConnection/{financeSystemConnectionId}/tag | Get the tags for a financeSystemConnection.
*FinanceSystemConnectionApi* | [**updateFinanceSystemConnection**](docs/FinanceSystemConnectionApi.md#updateFinanceSystemConnection) | **PUT** /beta/financeSystemConnection | Update a financeSystemConnection
*FinanceSystemConnectionApi* | [**updateFinanceSystemConnectionCustomFields**](docs/FinanceSystemConnectionApi.md#updateFinanceSystemConnectionCustomFields) | **PUT** /beta/financeSystemConnection/customFields | Update a financeSystemConnection custom fields
*FinanceSystemConnectionLogApi* | [**addFinanceSystemConnectionLogAudit**](docs/FinanceSystemConnectionLogApi.md#addFinanceSystemConnectionLogAudit) | **PUT** /beta/financeSystemConnectionLog/{financeSystemConnectionLogId}/audit/{financeSystemConnectionLogAudit} | Add new audit for a financeSystemConnectionLog
*FinanceSystemConnectionLogApi* | [**addFinanceSystemConnectionLogFile**](docs/FinanceSystemConnectionLogApi.md#addFinanceSystemConnectionLogFile) | **POST** /beta/financeSystemConnectionLog/{financeSystemConnectionLogId}/file/{fileName} | Attach a file to a financeSystemConnectionLog
*FinanceSystemConnectionLogApi* | [**addFinanceSystemConnectionLogFileByURL**](docs/FinanceSystemConnectionLogApi.md#addFinanceSystemConnectionLogFileByURL) | **POST** /beta/financeSystemConnectionLog/{financeSystemConnectionLogId}/file | Attach a file to a financeSystemConnectionLog by URL.
*FinanceSystemConnectionLogApi* | [**addFinanceSystemConnectionLogTag**](docs/FinanceSystemConnectionLogApi.md#addFinanceSystemConnectionLogTag) | **PUT** /beta/financeSystemConnectionLog/{financeSystemConnectionLogId}/tag/{financeSystemConnectionLogTag} | Add new tags for a financeSystemConnectionLog.
*FinanceSystemConnectionLogApi* | [**deleteFinanceSystemConnectionLogFile**](docs/FinanceSystemConnectionLogApi.md#deleteFinanceSystemConnectionLogFile) | **DELETE** /beta/financeSystemConnectionLog/{financeSystemConnectionLogId}/file/{fileId} | Delete a file for a financeSystemConnectionLog.
*FinanceSystemConnectionLogApi* | [**deleteFinanceSystemConnectionLogTag**](docs/FinanceSystemConnectionLogApi.md#deleteFinanceSystemConnectionLogTag) | **DELETE** /beta/financeSystemConnectionLog/{financeSystemConnectionLogId}/tag/{financeSystemConnectionLogTag} | Delete a tag for a financeSystemConnectionLog.
*FinanceSystemConnectionLogApi* | [**getDuplicateFinanceSystemConnectionLogById**](docs/FinanceSystemConnectionLogApi.md#getDuplicateFinanceSystemConnectionLogById) | **GET** /beta/financeSystemConnectionLog/duplicate/{financeSystemConnectionLogId} | Get a duplicated a financeSystemConnectionLog by id
*FinanceSystemConnectionLogApi* | [**getFinanceSystemConnectionLogByFilter**](docs/FinanceSystemConnectionLogApi.md#getFinanceSystemConnectionLogByFilter) | **GET** /beta/financeSystemConnectionLog/search | Search financeSystemConnectionLogs by filter
*FinanceSystemConnectionLogApi* | [**getFinanceSystemConnectionLogById**](docs/FinanceSystemConnectionLogApi.md#getFinanceSystemConnectionLogById) | **GET** /beta/financeSystemConnectionLog/{financeSystemConnectionLogId} | Get a financeSystemConnectionLog by id
*FinanceSystemConnectionLogApi* | [**getFinanceSystemConnectionLogFiles**](docs/FinanceSystemConnectionLogApi.md#getFinanceSystemConnectionLogFiles) | **GET** /beta/financeSystemConnectionLog/{financeSystemConnectionLogId}/file | Get the files for a financeSystemConnectionLog.
*FinanceSystemConnectionLogApi* | [**getFinanceSystemConnectionLogTags**](docs/FinanceSystemConnectionLogApi.md#getFinanceSystemConnectionLogTags) | **GET** /beta/financeSystemConnectionLog/{financeSystemConnectionLogId}/tag | Get the tags for a financeSystemConnectionLog.
*FulfillmentLayoutPositionApi* | [**addFulfillmentLayoutPositionAudit**](docs/FulfillmentLayoutPositionApi.md#addFulfillmentLayoutPositionAudit) | **PUT** /beta/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId}/audit/{fulfillmentLayoutPositionAudit} | Add new audit for a fulfillmentLayoutPosition
*FulfillmentLayoutPositionApi* | [**addFulfillmentLayoutPositionFile**](docs/FulfillmentLayoutPositionApi.md#addFulfillmentLayoutPositionFile) | **POST** /beta/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId}/file/{fileName} | Attach a file to a fulfillmentLayoutPosition
*FulfillmentLayoutPositionApi* | [**addFulfillmentLayoutPositionFileByURL**](docs/FulfillmentLayoutPositionApi.md#addFulfillmentLayoutPositionFileByURL) | **POST** /beta/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId}/file | Attach a file to a fulfillmentLayoutPosition by URL.
*FulfillmentLayoutPositionApi* | [**addFulfillmentLayoutPositionTag**](docs/FulfillmentLayoutPositionApi.md#addFulfillmentLayoutPositionTag) | **PUT** /beta/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId}/tag/{fulfillmentLayoutPositionTag} | Add new tags for a fulfillmentLayoutPosition.
*FulfillmentLayoutPositionApi* | [**deleteFulfillmentLayoutPositionFile**](docs/FulfillmentLayoutPositionApi.md#deleteFulfillmentLayoutPositionFile) | **DELETE** /beta/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId}/file/{fileId} | Delete a file for a fulfillmentLayoutPosition.
*FulfillmentLayoutPositionApi* | [**deleteFulfillmentLayoutPositionTag**](docs/FulfillmentLayoutPositionApi.md#deleteFulfillmentLayoutPositionTag) | **DELETE** /beta/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId}/tag/{fulfillmentLayoutPositionTag} | Delete a tag for a fulfillmentLayoutPosition.
*FulfillmentLayoutPositionApi* | [**getDuplicateFulfillmentLayoutPositionById**](docs/FulfillmentLayoutPositionApi.md#getDuplicateFulfillmentLayoutPositionById) | **GET** /beta/fulfillmentLayoutPosition/duplicate/{fulfillmentLayoutPositionId} | Get a duplicated a fulfillmentLayoutPosition by id
*FulfillmentLayoutPositionApi* | [**getFulfillmentLayoutPositionByFilter**](docs/FulfillmentLayoutPositionApi.md#getFulfillmentLayoutPositionByFilter) | **GET** /beta/fulfillmentLayoutPosition/search | Search fulfillmentLayoutPositions by filter
*FulfillmentLayoutPositionApi* | [**getFulfillmentLayoutPositionById**](docs/FulfillmentLayoutPositionApi.md#getFulfillmentLayoutPositionById) | **GET** /beta/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId} | Get a fulfillmentLayoutPosition by id
*FulfillmentLayoutPositionApi* | [**getFulfillmentLayoutPositionFiles**](docs/FulfillmentLayoutPositionApi.md#getFulfillmentLayoutPositionFiles) | **GET** /beta/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId}/file | Get the files for a fulfillmentLayoutPosition.
*FulfillmentLayoutPositionApi* | [**getFulfillmentLayoutPositionTags**](docs/FulfillmentLayoutPositionApi.md#getFulfillmentLayoutPositionTags) | **GET** /beta/fulfillmentLayoutPosition/{fulfillmentLayoutPositionId}/tag | Get the tags for a fulfillmentLayoutPosition.
*FulfillmentPlanApi* | [**addFulfillmentPlan**](docs/FulfillmentPlanApi.md#addFulfillmentPlan) | **POST** /beta/fulfillmentPlan | Create a fulfillmentPlan
*FulfillmentPlanApi* | [**addFulfillmentPlanAudit**](docs/FulfillmentPlanApi.md#addFulfillmentPlanAudit) | **PUT** /beta/fulfillmentPlan/{fulfillmentPlanId}/audit/{fulfillmentPlanAudit} | Add new audit for a fulfillmentPlan
*FulfillmentPlanApi* | [**addFulfillmentPlanFile**](docs/FulfillmentPlanApi.md#addFulfillmentPlanFile) | **POST** /beta/fulfillmentPlan/{fulfillmentPlanId}/file/{fileName} | Attach a file to a fulfillmentPlan
*FulfillmentPlanApi* | [**addFulfillmentPlanFileByURL**](docs/FulfillmentPlanApi.md#addFulfillmentPlanFileByURL) | **POST** /beta/fulfillmentPlan/{fulfillmentPlanId}/file | Attach a file to a fulfillmentPlan by URL.
*FulfillmentPlanApi* | [**addFulfillmentPlanTag**](docs/FulfillmentPlanApi.md#addFulfillmentPlanTag) | **PUT** /beta/fulfillmentPlan/{fulfillmentPlanId}/tag/{fulfillmentPlanTag} | Add new tags for a fulfillmentPlan.
*FulfillmentPlanApi* | [**deleteFulfillmentPlan**](docs/FulfillmentPlanApi.md#deleteFulfillmentPlan) | **DELETE** /beta/fulfillmentPlan/{fulfillmentPlanId} | Delete a fulfillmentPlan
*FulfillmentPlanApi* | [**deleteFulfillmentPlanFile**](docs/FulfillmentPlanApi.md#deleteFulfillmentPlanFile) | **DELETE** /beta/fulfillmentPlan/{fulfillmentPlanId}/file/{fileId} | Delete a file for a fulfillmentPlan.
*FulfillmentPlanApi* | [**deleteFulfillmentPlanTag**](docs/FulfillmentPlanApi.md#deleteFulfillmentPlanTag) | **DELETE** /beta/fulfillmentPlan/{fulfillmentPlanId}/tag/{fulfillmentPlanTag} | Delete a tag for a fulfillmentPlan.
*FulfillmentPlanApi* | [**getDuplicateFulfillmentPlanById**](docs/FulfillmentPlanApi.md#getDuplicateFulfillmentPlanById) | **GET** /beta/fulfillmentPlan/duplicate/{fulfillmentPlanId} | Get a duplicated a fulfillmentPlan by id
*FulfillmentPlanApi* | [**getFulfillmentPlanByFilter**](docs/FulfillmentPlanApi.md#getFulfillmentPlanByFilter) | **GET** /beta/fulfillmentPlan/search | Search fulfillmentPlans by filter
*FulfillmentPlanApi* | [**getFulfillmentPlanById**](docs/FulfillmentPlanApi.md#getFulfillmentPlanById) | **GET** /beta/fulfillmentPlan/{fulfillmentPlanId} | Get a fulfillmentPlan by id
*FulfillmentPlanApi* | [**getFulfillmentPlanFiles**](docs/FulfillmentPlanApi.md#getFulfillmentPlanFiles) | **GET** /beta/fulfillmentPlan/{fulfillmentPlanId}/file | Get the files for a fulfillmentPlan.
*FulfillmentPlanApi* | [**getFulfillmentPlanTags**](docs/FulfillmentPlanApi.md#getFulfillmentPlanTags) | **GET** /beta/fulfillmentPlan/{fulfillmentPlanId}/tag | Get the tags for a fulfillmentPlan.
*FulfillmentPlanApi* | [**updateFulfillmentPlan**](docs/FulfillmentPlanApi.md#updateFulfillmentPlan) | **PUT** /beta/fulfillmentPlan | Update a fulfillmentPlan
*FulfillmentPlanApi* | [**updateFulfillmentPlanCustomFields**](docs/FulfillmentPlanApi.md#updateFulfillmentPlanCustomFields) | **PUT** /beta/fulfillmentPlan/customFields | Update a fulfillmentPlan custom fields
*FulfillmentProcessApi* | [**addFulfillmentProcessAudit**](docs/FulfillmentProcessApi.md#addFulfillmentProcessAudit) | **PUT** /beta/fulfillmentProcess/{fulfillmentProcessId}/audit/{fulfillmentProcessAudit} | Add new audit for a fulfillmentProcess
*FulfillmentProcessApi* | [**addFulfillmentProcessFile**](docs/FulfillmentProcessApi.md#addFulfillmentProcessFile) | **POST** /beta/fulfillmentProcess/{fulfillmentProcessId}/file/{fileName} | Attach a file to a fulfillmentProcess
*FulfillmentProcessApi* | [**addFulfillmentProcessFileByURL**](docs/FulfillmentProcessApi.md#addFulfillmentProcessFileByURL) | **POST** /beta/fulfillmentProcess/{fulfillmentProcessId}/file | Attach a file to a fulfillmentProcess by URL.
*FulfillmentProcessApi* | [**addFulfillmentProcessTag**](docs/FulfillmentProcessApi.md#addFulfillmentProcessTag) | **PUT** /beta/fulfillmentProcess/{fulfillmentProcessId}/tag/{fulfillmentProcessTag} | Add new tags for a fulfillmentProcess.
*FulfillmentProcessApi* | [**deleteFulfillmentProcessFile**](docs/FulfillmentProcessApi.md#deleteFulfillmentProcessFile) | **DELETE** /beta/fulfillmentProcess/{fulfillmentProcessId}/file/{fileId} | Delete a file for a fulfillmentProcess.
*FulfillmentProcessApi* | [**deleteFulfillmentProcessTag**](docs/FulfillmentProcessApi.md#deleteFulfillmentProcessTag) | **DELETE** /beta/fulfillmentProcess/{fulfillmentProcessId}/tag/{fulfillmentProcessTag} | Delete a tag for a fulfillmentProcess.
*FulfillmentProcessApi* | [**getDuplicateFulfillmentProcessById**](docs/FulfillmentProcessApi.md#getDuplicateFulfillmentProcessById) | **GET** /beta/fulfillmentProcess/duplicate/{fulfillmentProcessId} | Get a duplicated a fulfillmentProcess by id
*FulfillmentProcessApi* | [**getFulfillmentProcessByFilter**](docs/FulfillmentProcessApi.md#getFulfillmentProcessByFilter) | **GET** /beta/fulfillmentProcess/search | Search fulfillmentProcesses by filter
*FulfillmentProcessApi* | [**getFulfillmentProcessById**](docs/FulfillmentProcessApi.md#getFulfillmentProcessById) | **GET** /beta/fulfillmentProcess/{fulfillmentProcessId} | Get a fulfillmentProcess by id
*FulfillmentProcessApi* | [**getFulfillmentProcessFiles**](docs/FulfillmentProcessApi.md#getFulfillmentProcessFiles) | **GET** /beta/fulfillmentProcess/{fulfillmentProcessId}/file | Get the files for a fulfillmentProcess.
*FulfillmentProcessApi* | [**getFulfillmentProcessTags**](docs/FulfillmentProcessApi.md#getFulfillmentProcessTags) | **GET** /beta/fulfillmentProcess/{fulfillmentProcessId}/tag | Get the tags for a fulfillmentProcess.
*FulfillmentProcessApi* | [**updateFulfillmentProcessCustomFields**](docs/FulfillmentProcessApi.md#updateFulfillmentProcessCustomFields) | **PUT** /beta/fulfillmentProcess/customFields | Update a fulfillmentProcess custom fields
*FulfillmentProcessLogApi* | [**addFulfillmentProcessLogAudit**](docs/FulfillmentProcessLogApi.md#addFulfillmentProcessLogAudit) | **PUT** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId}/audit/{fulfillmentProcessLogAudit} | Add new audit for a fulfillmentProcessLog
*FulfillmentProcessLogApi* | [**addFulfillmentProcessLogFile**](docs/FulfillmentProcessLogApi.md#addFulfillmentProcessLogFile) | **POST** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId}/file/{fileName} | Attach a file to a fulfillmentProcessLog
*FulfillmentProcessLogApi* | [**addFulfillmentProcessLogFileByURL**](docs/FulfillmentProcessLogApi.md#addFulfillmentProcessLogFileByURL) | **POST** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId}/file | Attach a file to a fulfillmentProcessLog by URL.
*FulfillmentProcessLogApi* | [**addFulfillmentProcessLogTag**](docs/FulfillmentProcessLogApi.md#addFulfillmentProcessLogTag) | **PUT** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId}/tag/{fulfillmentProcessLogTag} | Add new tags for a fulfillmentProcessLog.
*FulfillmentProcessLogApi* | [**deleteFulfillmentProcessLogFile**](docs/FulfillmentProcessLogApi.md#deleteFulfillmentProcessLogFile) | **DELETE** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId}/file/{fileId} | Delete a file for a fulfillmentProcessLog.
*FulfillmentProcessLogApi* | [**deleteFulfillmentProcessLogTag**](docs/FulfillmentProcessLogApi.md#deleteFulfillmentProcessLogTag) | **DELETE** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId}/tag/{fulfillmentProcessLogTag} | Delete a tag for a fulfillmentProcessLog.
*FulfillmentProcessLogApi* | [**getDuplicateFulfillmentProcessLogById**](docs/FulfillmentProcessLogApi.md#getDuplicateFulfillmentProcessLogById) | **GET** /beta/fulfillmentProcessLog/duplicate/{fulfillmentProcessLogId} | Get a duplicated a fulfillmentProcessLog by id
*FulfillmentProcessLogApi* | [**getFulfillmentProcessLogByFilter**](docs/FulfillmentProcessLogApi.md#getFulfillmentProcessLogByFilter) | **GET** /beta/fulfillmentProcessLog/search | Search fulfillmentProcessLogs by filter
*FulfillmentProcessLogApi* | [**getFulfillmentProcessLogById**](docs/FulfillmentProcessLogApi.md#getFulfillmentProcessLogById) | **GET** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId} | Get a fulfillmentProcessLog by id
*FulfillmentProcessLogApi* | [**getFulfillmentProcessLogFiles**](docs/FulfillmentProcessLogApi.md#getFulfillmentProcessLogFiles) | **GET** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId}/file | Get the files for a fulfillmentProcessLog.
*FulfillmentProcessLogApi* | [**getFulfillmentProcessLogTags**](docs/FulfillmentProcessLogApi.md#getFulfillmentProcessLogTags) | **GET** /beta/fulfillmentProcessLog/{fulfillmentProcessLogId}/tag | Get the tags for a fulfillmentProcessLog.
*FulfillmentProcessPickBatchGroupApi* | [**getFulfillmentProcessGroupPicksByById**](docs/FulfillmentProcessPickBatchGroupApi.md#getFulfillmentProcessGroupPicksByById) | **GET** /beta/fulfillmentProcessPickBatchGroup/{fulfillmentProcessPickBatchGroupId} | Get a fulfillmentProcessPickBatchGroup by id
*FulfillmentProcessPickBatchGroupApi* | [**getFulfillmentProcessPickBatchGroupBySearchText**](docs/FulfillmentProcessPickBatchGroupApi.md#getFulfillmentProcessPickBatchGroupBySearchText) | **GET** /beta/fulfillmentProcessPickBatchGroup/search | Search fulfillmentProcessPickBatchGroups
*Gs1128LabelApi* | [**addGs1128LabelAudit**](docs/Gs1128LabelApi.md#addGs1128LabelAudit) | **PUT** /beta/gs1128Label/{gs1128LabelId}/audit/{gs1128LabelAudit} | Add new audit for a gs1128Label
*Gs1128LabelApi* | [**addGs1128LabelFile**](docs/Gs1128LabelApi.md#addGs1128LabelFile) | **POST** /beta/gs1128Label/{gs1128LabelId}/file/{fileName} | Attach a file to a gs1128Label
*Gs1128LabelApi* | [**addGs1128LabelFileByURL**](docs/Gs1128LabelApi.md#addGs1128LabelFileByURL) | **POST** /beta/gs1128Label/{gs1128LabelId}/file | Attach a file to a gs1128Label by URL.
*Gs1128LabelApi* | [**addGs1128LabelTag**](docs/Gs1128LabelApi.md#addGs1128LabelTag) | **PUT** /beta/gs1128Label/{gs1128LabelId}/tag/{gs1128LabelTag} | Add new tags for a gs1128Label.
*Gs1128LabelApi* | [**deleteGs1128Label**](docs/Gs1128LabelApi.md#deleteGs1128Label) | **DELETE** /beta/gs1128Label/{gs1128LabelId} | Delete a gs1128Label
*Gs1128LabelApi* | [**deleteGs1128LabelFile**](docs/Gs1128LabelApi.md#deleteGs1128LabelFile) | **DELETE** /beta/gs1128Label/{gs1128LabelId}/file/{fileId} | Delete a file for a gs1128Label.
*Gs1128LabelApi* | [**deleteGs1128LabelTag**](docs/Gs1128LabelApi.md#deleteGs1128LabelTag) | **DELETE** /beta/gs1128Label/{gs1128LabelId}/tag/{gs1128LabelTag} | Delete a tag for a gs1128Label.
*Gs1128LabelApi* | [**getDuplicateGs1128LabelById**](docs/Gs1128LabelApi.md#getDuplicateGs1128LabelById) | **GET** /beta/gs1128Label/duplicate/{gs1128LabelId} | Get a duplicated a gs1128Label by id
*Gs1128LabelApi* | [**getGs1128LabelByFilter**](docs/Gs1128LabelApi.md#getGs1128LabelByFilter) | **GET** /beta/gs1128Label/search | Search gs1128Labels by filter
*Gs1128LabelApi* | [**getGs1128LabelById**](docs/Gs1128LabelApi.md#getGs1128LabelById) | **GET** /beta/gs1128Label/{gs1128LabelId} | Get a gs1128Label by id
*Gs1128LabelApi* | [**getGs1128LabelFiles**](docs/Gs1128LabelApi.md#getGs1128LabelFiles) | **GET** /beta/gs1128Label/{gs1128LabelId}/file | Get the files for a gs1128Label.
*Gs1128LabelApi* | [**getGs1128LabelTags**](docs/Gs1128LabelApi.md#getGs1128LabelTags) | **GET** /beta/gs1128Label/{gs1128LabelId}/tag | Get the tags for a gs1128Label.
*Gs1128LabelApi* | [**updateGs1128LabelCustomFields**](docs/Gs1128LabelApi.md#updateGs1128LabelCustomFields) | **PUT** /beta/gs1128Label/customFields | Update a gs1128Label custom fields
*Gs1128TemplateApi* | [**addGs1128Template**](docs/Gs1128TemplateApi.md#addGs1128Template) | **POST** /beta/gs1128Template | Create a gs1128Template
*Gs1128TemplateApi* | [**addGs1128TemplateAudit**](docs/Gs1128TemplateApi.md#addGs1128TemplateAudit) | **PUT** /beta/gs1128Template/{gs1128TemplateId}/audit/{gs1128TemplateAudit} | Add new audit for a gs1128Template
*Gs1128TemplateApi* | [**addGs1128TemplateFile**](docs/Gs1128TemplateApi.md#addGs1128TemplateFile) | **POST** /beta/gs1128Template/{gs1128TemplateId}/file/{fileName} | Attach a file to a gs1128Template
*Gs1128TemplateApi* | [**addGs1128TemplateFileByURL**](docs/Gs1128TemplateApi.md#addGs1128TemplateFileByURL) | **POST** /beta/gs1128Template/{gs1128TemplateId}/file | Attach a file to a gs1128Template by URL.
*Gs1128TemplateApi* | [**addGs1128TemplateTag**](docs/Gs1128TemplateApi.md#addGs1128TemplateTag) | **PUT** /beta/gs1128Template/{gs1128TemplateId}/tag/{gs1128TemplateTag} | Add new tags for a gs1128Template.
*Gs1128TemplateApi* | [**deleteGs1128Template**](docs/Gs1128TemplateApi.md#deleteGs1128Template) | **DELETE** /beta/gs1128Template/{gs1128TemplateId} | Delete a gs1128Template
*Gs1128TemplateApi* | [**deleteGs1128TemplateFile**](docs/Gs1128TemplateApi.md#deleteGs1128TemplateFile) | **DELETE** /beta/gs1128Template/{gs1128TemplateId}/file/{fileId} | Delete a file for a gs1128Template.
*Gs1128TemplateApi* | [**deleteGs1128TemplateTag**](docs/Gs1128TemplateApi.md#deleteGs1128TemplateTag) | **DELETE** /beta/gs1128Template/{gs1128TemplateId}/tag/{gs1128TemplateTag} | Delete a tag for a gs1128Template.
*Gs1128TemplateApi* | [**getDuplicateGs1128TemplateById**](docs/Gs1128TemplateApi.md#getDuplicateGs1128TemplateById) | **GET** /beta/gs1128Template/duplicate/{gs1128TemplateId} | Get a duplicated a gs1128Template by id
*Gs1128TemplateApi* | [**getGs1128TemplateByFilter**](docs/Gs1128TemplateApi.md#getGs1128TemplateByFilter) | **GET** /beta/gs1128Template/search | Search gs1128Templates by filter
*Gs1128TemplateApi* | [**getGs1128TemplateById**](docs/Gs1128TemplateApi.md#getGs1128TemplateById) | **GET** /beta/gs1128Template/{gs1128TemplateId} | Get a gs1128Template by id
*Gs1128TemplateApi* | [**getGs1128TemplateFiles**](docs/Gs1128TemplateApi.md#getGs1128TemplateFiles) | **GET** /beta/gs1128Template/{gs1128TemplateId}/file | Get the files for a gs1128Template.
*Gs1128TemplateApi* | [**getGs1128TemplateTags**](docs/Gs1128TemplateApi.md#getGs1128TemplateTags) | **GET** /beta/gs1128Template/{gs1128TemplateId}/tag | Get the tags for a gs1128Template.
*Gs1128TemplateApi* | [**updateGs1128Template**](docs/Gs1128TemplateApi.md#updateGs1128Template) | **PUT** /beta/gs1128Template | Update a gs1128Template
*IntegrationPartnerApi* | [**getIntegrationPartnerById**](docs/IntegrationPartnerApi.md#getIntegrationPartnerById) | **GET** /beta/integrationPartner/{integrationPartnerId} | Get an integrationPartner by id
*IntegrationPartnerApi* | [**getIntegrationPartnerBySearchText**](docs/IntegrationPartnerApi.md#getIntegrationPartnerBySearchText) | **GET** /beta/integrationPartner/search | Search integrationPartners
*InventoryAdjustmentApi* | [**addInventoryAdjustmentAudit**](docs/InventoryAdjustmentApi.md#addInventoryAdjustmentAudit) | **PUT** /beta/inventoryAdjustment/{inventoryAdjustmentId}/audit/{inventoryAdjustmentAudit} | Add new audit for an inventoryAdjustment
*InventoryAdjustmentApi* | [**addInventoryAdjustmentFile**](docs/InventoryAdjustmentApi.md#addInventoryAdjustmentFile) | **POST** /beta/inventoryAdjustment/{inventoryAdjustmentId}/file/{fileName} | Attach a file to an inventoryAdjustment
*InventoryAdjustmentApi* | [**addInventoryAdjustmentFileByURL**](docs/InventoryAdjustmentApi.md#addInventoryAdjustmentFileByURL) | **POST** /beta/inventoryAdjustment/{inventoryAdjustmentId}/file | Attach a file to an inventoryAdjustment by URL.
*InventoryAdjustmentApi* | [**addInventoryAdjustmentTag**](docs/InventoryAdjustmentApi.md#addInventoryAdjustmentTag) | **PUT** /beta/inventoryAdjustment/{inventoryAdjustmentId}/tag/{inventoryAdjustmentTag} | Add new tags for an inventoryAdjustment.
*InventoryAdjustmentApi* | [**deleteInventoryAdjustmentFile**](docs/InventoryAdjustmentApi.md#deleteInventoryAdjustmentFile) | **DELETE** /beta/inventoryAdjustment/{inventoryAdjustmentId}/file/{fileId} | Delete a file for an inventoryAdjustment.
*InventoryAdjustmentApi* | [**deleteInventoryAdjustmentTag**](docs/InventoryAdjustmentApi.md#deleteInventoryAdjustmentTag) | **DELETE** /beta/inventoryAdjustment/{inventoryAdjustmentId}/tag/{inventoryAdjustmentTag} | Delete a tag for an inventoryAdjustment.
*InventoryAdjustmentApi* | [**getDuplicateInventoryAdjustmentById**](docs/InventoryAdjustmentApi.md#getDuplicateInventoryAdjustmentById) | **GET** /beta/inventoryAdjustment/duplicate/{inventoryAdjustmentId} | Get a duplicated an inventoryAdjustment by id
*InventoryAdjustmentApi* | [**getInventoryAdjustmentByFilter**](docs/InventoryAdjustmentApi.md#getInventoryAdjustmentByFilter) | **GET** /beta/inventoryAdjustment/search | Search inventoryAdjustments by filter
*InventoryAdjustmentApi* | [**getInventoryAdjustmentById**](docs/InventoryAdjustmentApi.md#getInventoryAdjustmentById) | **GET** /beta/inventoryAdjustment/{inventoryAdjustmentId} | Get an inventoryAdjustment by id
*InventoryAdjustmentApi* | [**getInventoryAdjustmentFiles**](docs/InventoryAdjustmentApi.md#getInventoryAdjustmentFiles) | **GET** /beta/inventoryAdjustment/{inventoryAdjustmentId}/file | Get the files for an inventoryAdjustment.
*InventoryAdjustmentApi* | [**getInventoryAdjustmentTags**](docs/InventoryAdjustmentApi.md#getInventoryAdjustmentTags) | **GET** /beta/inventoryAdjustment/{inventoryAdjustmentId}/tag | Get the tags for an inventoryAdjustment.
*InventoryAdjustmentApi* | [**updateInventoryAdjustmentCustomFields**](docs/InventoryAdjustmentApi.md#updateInventoryAdjustmentCustomFields) | **PUT** /beta/inventoryAdjustment/customFields | Update an inventoryAdjustment custom fields
*InventoryDetailApi* | [**addInventoryDetailAudit**](docs/InventoryDetailApi.md#addInventoryDetailAudit) | **PUT** /beta/inventoryDetail/{inventoryDetailId}/audit/{inventoryDetailAudit} | Add new audit for an inventoryDetail
*InventoryDetailApi* | [**addInventoryDetailFile**](docs/InventoryDetailApi.md#addInventoryDetailFile) | **POST** /beta/inventoryDetail/{inventoryDetailId}/file/{fileName} | Attach a file to an inventoryDetail
*InventoryDetailApi* | [**addInventoryDetailFileByURL**](docs/InventoryDetailApi.md#addInventoryDetailFileByURL) | **POST** /beta/inventoryDetail/{inventoryDetailId}/file | Attach a file to an inventoryDetail by URL.
*InventoryDetailApi* | [**addInventoryDetailTag**](docs/InventoryDetailApi.md#addInventoryDetailTag) | **PUT** /beta/inventoryDetail/{inventoryDetailId}/tag/{inventoryDetailTag} | Add new tags for an inventoryDetail.
*InventoryDetailApi* | [**deleteInventoryDetailFile**](docs/InventoryDetailApi.md#deleteInventoryDetailFile) | **DELETE** /beta/inventoryDetail/{inventoryDetailId}/file/{fileId} | Delete a file for an inventoryDetail.
*InventoryDetailApi* | [**deleteInventoryDetailTag**](docs/InventoryDetailApi.md#deleteInventoryDetailTag) | **DELETE** /beta/inventoryDetail/{inventoryDetailId}/tag/{inventoryDetailTag} | Delete a tag for an inventoryDetail.
*InventoryDetailApi* | [**getDuplicateInventoryDetailById**](docs/InventoryDetailApi.md#getDuplicateInventoryDetailById) | **GET** /beta/inventoryDetail/duplicate/{inventoryDetailId} | Get a duplicated an inventoryDetail by id
*InventoryDetailApi* | [**getInventoryDetailByFilter**](docs/InventoryDetailApi.md#getInventoryDetailByFilter) | **GET** /beta/inventoryDetail/search | Search inventoryDetails by filter
*InventoryDetailApi* | [**getInventoryDetailById**](docs/InventoryDetailApi.md#getInventoryDetailById) | **GET** /beta/inventoryDetail/{inventoryDetailId} | Get an inventoryDetail by id
*InventoryDetailApi* | [**getInventoryDetailFiles**](docs/InventoryDetailApi.md#getInventoryDetailFiles) | **GET** /beta/inventoryDetail/{inventoryDetailId}/file | Get the files for an inventoryDetail.
*InventoryDetailApi* | [**getInventoryDetailTags**](docs/InventoryDetailApi.md#getInventoryDetailTags) | **GET** /beta/inventoryDetail/{inventoryDetailId}/tag | Get the tags for an inventoryDetail.
*InventoryDetailApi* | [**updateInventoryDetailCustomFields**](docs/InventoryDetailApi.md#updateInventoryDetailCustomFields) | **PUT** /beta/inventoryDetail/customFields | Update an inventoryDetail custom fields
*InventorySnapshotApi* | [**addInventorySnapshotAudit**](docs/InventorySnapshotApi.md#addInventorySnapshotAudit) | **PUT** /beta/inventorySnapshot/{inventorySnapshotId}/audit/{inventorySnapshotAudit} | Add new audit for an inventorySnapshot
*InventorySnapshotApi* | [**addInventorySnapshotFile**](docs/InventorySnapshotApi.md#addInventorySnapshotFile) | **POST** /beta/inventorySnapshot/{inventorySnapshotId}/file/{fileName} | Attach a file to an inventorySnapshot
*InventorySnapshotApi* | [**addInventorySnapshotFileByURL**](docs/InventorySnapshotApi.md#addInventorySnapshotFileByURL) | **POST** /beta/inventorySnapshot/{inventorySnapshotId}/file | Attach a file to an inventorySnapshot by URL.
*InventorySnapshotApi* | [**addInventorySnapshotTag**](docs/InventorySnapshotApi.md#addInventorySnapshotTag) | **PUT** /beta/inventorySnapshot/{inventorySnapshotId}/tag/{inventorySnapshotTag} | Add new tags for an inventorySnapshot.
*InventorySnapshotApi* | [**deleteInventorySnapshotFile**](docs/InventorySnapshotApi.md#deleteInventorySnapshotFile) | **DELETE** /beta/inventorySnapshot/{inventorySnapshotId}/file/{fileId} | Delete a file for an inventorySnapshot.
*InventorySnapshotApi* | [**deleteInventorySnapshotTag**](docs/InventorySnapshotApi.md#deleteInventorySnapshotTag) | **DELETE** /beta/inventorySnapshot/{inventorySnapshotId}/tag/{inventorySnapshotTag} | Delete a tag for an inventorySnapshot.
*InventorySnapshotApi* | [**getDuplicateInventorySnapshotById**](docs/InventorySnapshotApi.md#getDuplicateInventorySnapshotById) | **GET** /beta/inventorySnapshot/duplicate/{inventorySnapshotId} | Get a duplicated an inventorySnapshot by id
*InventorySnapshotApi* | [**getInventorySnapshotByFilter**](docs/InventorySnapshotApi.md#getInventorySnapshotByFilter) | **GET** /beta/inventorySnapshot/search | Search inventorySnapshots by filter
*InventorySnapshotApi* | [**getInventorySnapshotById**](docs/InventorySnapshotApi.md#getInventorySnapshotById) | **GET** /beta/inventorySnapshot/{inventorySnapshotId} | Get an inventorySnapshot by id
*InventorySnapshotApi* | [**getInventorySnapshotFiles**](docs/InventorySnapshotApi.md#getInventorySnapshotFiles) | **GET** /beta/inventorySnapshot/{inventorySnapshotId}/file | Get the files for an inventorySnapshot.
*InventorySnapshotApi* | [**getInventorySnapshotTags**](docs/InventorySnapshotApi.md#getInventorySnapshotTags) | **GET** /beta/inventorySnapshot/{inventorySnapshotId}/tag | Get the tags for an inventorySnapshot.
*InventoryStorageActivityApi* | [**addInventoryStorageActivity**](docs/InventoryStorageActivityApi.md#addInventoryStorageActivity) | **POST** /beta/inventoryStorageActivity | Create an inventoryStorageActivity
*InventoryStorageActivityApi* | [**addInventoryStorageActivityAudit**](docs/InventoryStorageActivityApi.md#addInventoryStorageActivityAudit) | **PUT** /beta/inventoryStorageActivity/{inventoryStorageActivityId}/audit/{inventoryStorageActivityAudit} | Add new audit for an inventoryStorageActivity
*InventoryStorageActivityApi* | [**addInventoryStorageActivityFile**](docs/InventoryStorageActivityApi.md#addInventoryStorageActivityFile) | **POST** /beta/inventoryStorageActivity/{inventoryStorageActivityId}/file/{fileName} | Attach a file to an inventoryStorageActivity
*InventoryStorageActivityApi* | [**addInventoryStorageActivityFileByURL**](docs/InventoryStorageActivityApi.md#addInventoryStorageActivityFileByURL) | **POST** /beta/inventoryStorageActivity/{inventoryStorageActivityId}/file | Attach a file to an inventoryStorageActivity by URL.
*InventoryStorageActivityApi* | [**addInventoryStorageActivityTag**](docs/InventoryStorageActivityApi.md#addInventoryStorageActivityTag) | **PUT** /beta/inventoryStorageActivity/{inventoryStorageActivityId}/tag/{inventoryStorageActivityTag} | Add new tags for an inventoryStorageActivity.
*InventoryStorageActivityApi* | [**deleteInventoryStorageActivity**](docs/InventoryStorageActivityApi.md#deleteInventoryStorageActivity) | **DELETE** /beta/inventoryStorageActivity/{inventoryStorageActivityId} | Delete an inventoryStorageActivity
*InventoryStorageActivityApi* | [**deleteInventoryStorageActivityFile**](docs/InventoryStorageActivityApi.md#deleteInventoryStorageActivityFile) | **DELETE** /beta/inventoryStorageActivity/{inventoryStorageActivityId}/file/{fileId} | Delete a file for an inventoryStorageActivity.
*InventoryStorageActivityApi* | [**deleteInventoryStorageActivityTag**](docs/InventoryStorageActivityApi.md#deleteInventoryStorageActivityTag) | **DELETE** /beta/inventoryStorageActivity/{inventoryStorageActivityId}/tag/{inventoryStorageActivityTag} | Delete a tag for an inventoryStorageActivity.
*InventoryStorageActivityApi* | [**getDuplicateInventoryStorageActivityById**](docs/InventoryStorageActivityApi.md#getDuplicateInventoryStorageActivityById) | **GET** /beta/inventoryStorageActivity/duplicate/{inventoryStorageActivityId} | Get a duplicated an inventoryStorageActivity by id
*InventoryStorageActivityApi* | [**getInventoryStorageActivityByFilter**](docs/InventoryStorageActivityApi.md#getInventoryStorageActivityByFilter) | **GET** /beta/inventoryStorageActivity/search | Search inventoryStorageActivitys by filter
*InventoryStorageActivityApi* | [**getInventoryStorageActivityById**](docs/InventoryStorageActivityApi.md#getInventoryStorageActivityById) | **GET** /beta/inventoryStorageActivity/{inventoryStorageActivityId} | Get an inventoryStorageActivity by id
*InventoryStorageActivityApi* | [**getInventoryStorageActivityFiles**](docs/InventoryStorageActivityApi.md#getInventoryStorageActivityFiles) | **GET** /beta/inventoryStorageActivity/{inventoryStorageActivityId}/file | Get the files for an inventoryStorageActivity.
*InventoryStorageActivityApi* | [**getInventoryStorageActivityTags**](docs/InventoryStorageActivityApi.md#getInventoryStorageActivityTags) | **GET** /beta/inventoryStorageActivity/{inventoryStorageActivityId}/tag | Get the tags for an inventoryStorageActivity.
*InventoryStorageActivityApi* | [**updateInventoryStorageActivity**](docs/InventoryStorageActivityApi.md#updateInventoryStorageActivity) | **PUT** /beta/inventoryStorageActivity | Update an inventoryStorageActivity
*InvoiceWorksheetApi* | [**addInvoiceWorksheet**](docs/InvoiceWorksheetApi.md#addInvoiceWorksheet) | **POST** /beta/invoiceWorksheet | Create an invoiceWorksheet
*InvoiceWorksheetApi* | [**addInvoiceWorksheetAudit**](docs/InvoiceWorksheetApi.md#addInvoiceWorksheetAudit) | **PUT** /beta/invoiceWorksheet/{invoiceWorksheetId}/audit/{invoiceWorksheetAudit} | Add new audit for an invoiceWorksheet
*InvoiceWorksheetApi* | [**addInvoiceWorksheetFile**](docs/InvoiceWorksheetApi.md#addInvoiceWorksheetFile) | **POST** /beta/invoiceWorksheet/{invoiceWorksheetId}/file/{fileName} | Attach a file to an invoiceWorksheet
*InvoiceWorksheetApi* | [**addInvoiceWorksheetFileByURL**](docs/InvoiceWorksheetApi.md#addInvoiceWorksheetFileByURL) | **POST** /beta/invoiceWorksheet/{invoiceWorksheetId}/file | Attach a file to an invoiceWorksheet by URL.
*InvoiceWorksheetApi* | [**addInvoiceWorksheetTag**](docs/InvoiceWorksheetApi.md#addInvoiceWorksheetTag) | **PUT** /beta/invoiceWorksheet/{invoiceWorksheetId}/tag/{invoiceWorksheetTag} | Add new tags for an invoiceWorksheet.
*InvoiceWorksheetApi* | [**deleteInvoiceWorksheet**](docs/InvoiceWorksheetApi.md#deleteInvoiceWorksheet) | **DELETE** /beta/invoiceWorksheet/{invoiceWorksheetId} | Delete an invoiceWorksheet
*InvoiceWorksheetApi* | [**deleteInvoiceWorksheetFile**](docs/InvoiceWorksheetApi.md#deleteInvoiceWorksheetFile) | **DELETE** /beta/invoiceWorksheet/{invoiceWorksheetId}/file/{fileId} | Delete a file for an invoiceWorksheet.
*InvoiceWorksheetApi* | [**deleteInvoiceWorksheetTag**](docs/InvoiceWorksheetApi.md#deleteInvoiceWorksheetTag) | **DELETE** /beta/invoiceWorksheet/{invoiceWorksheetId}/tag/{invoiceWorksheetTag} | Delete a tag for an invoiceWorksheet.
*InvoiceWorksheetApi* | [**getDuplicateInvoiceWorksheetById**](docs/InvoiceWorksheetApi.md#getDuplicateInvoiceWorksheetById) | **GET** /beta/invoiceWorksheet/duplicate/{invoiceWorksheetId} | Get a duplicated an invoiceWorksheet by id
*InvoiceWorksheetApi* | [**getInvoiceWorksheetByFilter**](docs/InvoiceWorksheetApi.md#getInvoiceWorksheetByFilter) | **GET** /beta/invoiceWorksheet/search | Search invoiceWorksheets by filter
*InvoiceWorksheetApi* | [**getInvoiceWorksheetById**](docs/InvoiceWorksheetApi.md#getInvoiceWorksheetById) | **GET** /beta/invoiceWorksheet/{invoiceWorksheetId} | Get an invoiceWorksheet by id
*InvoiceWorksheetApi* | [**getInvoiceWorksheetFiles**](docs/InvoiceWorksheetApi.md#getInvoiceWorksheetFiles) | **GET** /beta/invoiceWorksheet/{invoiceWorksheetId}/file | Get the files for an invoiceWorksheet.
*InvoiceWorksheetApi* | [**getInvoiceWorksheetTags**](docs/InvoiceWorksheetApi.md#getInvoiceWorksheetTags) | **GET** /beta/invoiceWorksheet/{invoiceWorksheetId}/tag | Get the tags for an invoiceWorksheet.
*InvoiceWorksheetApi* | [**updateInvoiceWorksheet**](docs/InvoiceWorksheetApi.md#updateInvoiceWorksheet) | **PUT** /beta/invoiceWorksheet | Update an invoiceWorksheet
*InvoiceWorksheetLineApi* | [**addInvoiceWorksheetLine**](docs/InvoiceWorksheetLineApi.md#addInvoiceWorksheetLine) | **POST** /beta/invoiceWorksheetLine | Create an invoiceWorksheetLine
*InvoiceWorksheetLineApi* | [**addInvoiceWorksheetLineAudit**](docs/InvoiceWorksheetLineApi.md#addInvoiceWorksheetLineAudit) | **PUT** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/audit/{invoiceWorksheetLineAudit} | Add new audit for an invoiceWorksheetLine
*InvoiceWorksheetLineApi* | [**addInvoiceWorksheetLineFile**](docs/InvoiceWorksheetLineApi.md#addInvoiceWorksheetLineFile) | **POST** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/file/{fileName} | Attach a file to an invoiceWorksheetLine
*InvoiceWorksheetLineApi* | [**addInvoiceWorksheetLineFileByURL**](docs/InvoiceWorksheetLineApi.md#addInvoiceWorksheetLineFileByURL) | **POST** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/file | Attach a file to an invoiceWorksheetLine by URL.
*InvoiceWorksheetLineApi* | [**addInvoiceWorksheetLineTag**](docs/InvoiceWorksheetLineApi.md#addInvoiceWorksheetLineTag) | **PUT** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/tag/{invoiceWorksheetLineTag} | Add new tags for an invoiceWorksheetLine.
*InvoiceWorksheetLineApi* | [**deleteInvoiceWorksheetLine**](docs/InvoiceWorksheetLineApi.md#deleteInvoiceWorksheetLine) | **DELETE** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId} | Delete an invoiceWorksheetLine
*InvoiceWorksheetLineApi* | [**deleteInvoiceWorksheetLineFile**](docs/InvoiceWorksheetLineApi.md#deleteInvoiceWorksheetLineFile) | **DELETE** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/file/{fileId} | Delete a file for an invoiceWorksheetLine.
*InvoiceWorksheetLineApi* | [**deleteInvoiceWorksheetLineTag**](docs/InvoiceWorksheetLineApi.md#deleteInvoiceWorksheetLineTag) | **DELETE** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/tag/{invoiceWorksheetLineTag} | Delete a tag for an invoiceWorksheetLine.
*InvoiceWorksheetLineApi* | [**getDuplicateInvoiceWorksheetLineById**](docs/InvoiceWorksheetLineApi.md#getDuplicateInvoiceWorksheetLineById) | **GET** /beta/invoiceWorksheetLine/duplicate/{invoiceWorksheetLineId} | Get a duplicated an invoiceWorksheetLine by id
*InvoiceWorksheetLineApi* | [**getInvoiceWorksheetLineByFilter**](docs/InvoiceWorksheetLineApi.md#getInvoiceWorksheetLineByFilter) | **GET** /beta/invoiceWorksheetLine/search | Search invoiceWorksheetLines by filter
*InvoiceWorksheetLineApi* | [**getInvoiceWorksheetLineById**](docs/InvoiceWorksheetLineApi.md#getInvoiceWorksheetLineById) | **GET** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId} | Get an invoiceWorksheetLine by id
*InvoiceWorksheetLineApi* | [**getInvoiceWorksheetLineFiles**](docs/InvoiceWorksheetLineApi.md#getInvoiceWorksheetLineFiles) | **GET** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/file | Get the files for an invoiceWorksheetLine.
*InvoiceWorksheetLineApi* | [**getInvoiceWorksheetLineTags**](docs/InvoiceWorksheetLineApi.md#getInvoiceWorksheetLineTags) | **GET** /beta/invoiceWorksheetLine/{invoiceWorksheetLineId}/tag | Get the tags for an invoiceWorksheetLine.
*InvoiceWorksheetLineApi* | [**updateInvoiceWorksheetLine**](docs/InvoiceWorksheetLineApi.md#updateInvoiceWorksheetLine) | **PUT** /beta/invoiceWorksheetLine | Update an invoiceWorksheetLine
*InvoiceWorksheetLineDetailApi* | [**addInvoiceWorksheetLineDetailAudit**](docs/InvoiceWorksheetLineDetailApi.md#addInvoiceWorksheetLineDetailAudit) | **PUT** /beta/invoiceWorksheetLineDetail/{invoiceWorksheetLineDetailId}/audit/{invoiceWorksheetLineDetailAudit} | Add new audit for an invoiceWorksheetLineDetail
*InvoiceWorksheetLineDetailApi* | [**addInvoiceWorksheetLineDetailFile**](docs/InvoiceWorksheetLineDetailApi.md#addInvoiceWorksheetLineDetailFile) | **POST** /beta/invoiceWorksheetLineDetail/{invoiceWorksheetLineDetailId}/file/{fileName} | Attach a file to an invoiceWorksheetLineDetail
*InvoiceWorksheetLineDetailApi* | [**addInvoiceWorksheetLineDetailFileByURL**](docs/InvoiceWorksheetLineDetailApi.md#addInvoiceWorksheetLineDetailFileByURL) | **POST** /beta/invoiceWorksheetLineDetail/{invoiceWorksheetLineDetailId}/file | Attach a file to an invoiceWorksheetLineDetail by URL.
*InvoiceWorksheetLineDetailApi* | [**addInvoiceWorksheetLineDetailTag**](docs/InvoiceWorksheetLineDetailApi.md#addInvoiceWorksheetLineDetailTag) | **PUT** /beta/invoiceWorksheetLineDetail/{invoiceWorksheetLineDetailId}/tag/{invoiceWorksheetLineDetailTag} | Add new tags for an invoiceWorksheetLineDetail.
*InvoiceWorksheetLineDetailApi* | [**deleteInvoiceWorksheetLineDetailFile**](docs/InvoiceWorksheetLineDetailApi.md#deleteInvoiceWorksheetLineDetailFile) | **DELETE** /beta/invoiceWorksheetLineDetail/{invoiceWorksheetLineDetailId}/file/{fileId} | Delete a file for an invoiceWorksheetLineDetail.
*InvoiceWorksheetLineDetailApi* | [**deleteInvoiceWorksheetLineDetailTag**](docs/InvoiceWorksheetLineDetailApi.md#deleteInvoiceWorksheetLineDetailTag) | **DELETE** /beta/invoiceWorksheetLineDetail/{invoiceWorksheetLineDetailId}/tag/{invoiceWorksheetLineDetailTag} | Delete a tag for an invoiceWorksheetLineDetail.
*InvoiceWorksheetLineDetailApi* | [**getDuplicateInvoiceWorksheetLineDetailById**](docs/InvoiceWorksheetLineDetailApi.md#getDuplicateInvoiceWorksheetLineDetailById) | **GET** /beta/invoiceWorksheetLineDetail/duplicate/{invoiceWorksheetLineDetailId} | Get a duplicated an invoiceWorksheetLineDetail by id
*InvoiceWorksheetLineDetailApi* | [**getInvoiceWorksheetLineDetailByFilter**](docs/InvoiceWorksheetLineDetailApi.md#getInvoiceWorksheetLineDetailByFilter) | **GET** /beta/invoiceWorksheetLineDetail/search | Search invoiceWorksheetLineDetails by filter
*InvoiceWorksheetLineDetailApi* | [**getInvoiceWorksheetLineDetailById**](docs/InvoiceWorksheetLineDetailApi.md#getInvoiceWorksheetLineDetailById) | **GET** /beta/invoiceWorksheetLineDetail/{invoiceWorksheetLineDetailId} | Get an invoiceWorksheetLineDetail by id
*InvoiceWorksheetLineDetailApi* | [**getInvoiceWorksheetLineDetailFiles**](docs/InvoiceWorksheetLineDetailApi.md#getInvoiceWorksheetLineDetailFiles) | **GET** /beta/invoiceWorksheetLineDetail/{invoiceWorksheetLineDetailId}/file | Get the files for an invoiceWorksheetLineDetail.
*InvoiceWorksheetLineDetailApi* | [**getInvoiceWorksheetLineDetailTags**](docs/InvoiceWorksheetLineDetailApi.md#getInvoiceWorksheetLineDetailTags) | **GET** /beta/invoiceWorksheetLineDetail/{invoiceWorksheetLineDetailId}/tag | Get the tags for an invoiceWorksheetLineDetail.
*InvoiceWorksheetLineDetailApi* | [**updateInvoiceWorksheetLineDetailCustomFields**](docs/InvoiceWorksheetLineDetailApi.md#updateInvoiceWorksheetLineDetailCustomFields) | **PUT** /beta/invoiceWorksheetLineDetail/customFields | Update an invoiceWorksheetLineDetail custom fields
*ItemApi* | [**addItem**](docs/ItemApi.md#addItem) | **POST** /beta/item | Create an item
*ItemApi* | [**addItemAudit**](docs/ItemApi.md#addItemAudit) | **PUT** /beta/item/{itemId}/audit/{itemAudit} | Add new audit for an item
*ItemApi* | [**addItemFile**](docs/ItemApi.md#addItemFile) | **POST** /beta/item/{itemId}/file/{fileName} | Attach a file to an item
*ItemApi* | [**addItemFileByURL**](docs/ItemApi.md#addItemFileByURL) | **POST** /beta/item/{itemId}/file | Attach a file to an item by URL.
*ItemApi* | [**addItemTag**](docs/ItemApi.md#addItemTag) | **PUT** /beta/item/{itemId}/tag/{itemTag} | Add new tags for an item.
*ItemApi* | [**deleteItem**](docs/ItemApi.md#deleteItem) | **DELETE** /beta/item/{itemId} | Delete an item
*ItemApi* | [**deleteItemFile**](docs/ItemApi.md#deleteItemFile) | **DELETE** /beta/item/{itemId}/file/{fileId} | Delete a file for an item.
*ItemApi* | [**deleteItemTag**](docs/ItemApi.md#deleteItemTag) | **DELETE** /beta/item/{itemId}/tag/{itemTag} | Delete a tag for an item.
*ItemApi* | [**getBySKU**](docs/ItemApi.md#getBySKU) | **GET** /beta/item/getBySKU | Get an item by SKU
*ItemApi* | [**getDuplicateItemById**](docs/ItemApi.md#getDuplicateItemById) | **GET** /beta/item/duplicate/{itemId} | Get a duplicated an item by id
*ItemApi* | [**getItemByFilter**](docs/ItemApi.md#getItemByFilter) | **GET** /beta/item/search | Search items by filter
*ItemApi* | [**getItemById**](docs/ItemApi.md#getItemById) | **GET** /beta/item/{itemId} | Get an item by id
*ItemApi* | [**getItemFiles**](docs/ItemApi.md#getItemFiles) | **GET** /beta/item/{itemId}/file | Get the files for an item.
*ItemApi* | [**getItemTags**](docs/ItemApi.md#getItemTags) | **GET** /beta/item/{itemId}/tag | Get the tags for an item.
*ItemApi* | [**updateItem**](docs/ItemApi.md#updateItem) | **PUT** /beta/item | Update an item
*ItemApi* | [**updateItemCustomFields**](docs/ItemApi.md#updateItemCustomFields) | **PUT** /beta/item/customFields | Update an item custom fields
*ItemAccountCodeApi* | [**addItemAccountCode**](docs/ItemAccountCodeApi.md#addItemAccountCode) | **POST** /beta/itemAccountCode | Create an itemAccountCode
*ItemAccountCodeApi* | [**addItemAccountCodeAudit**](docs/ItemAccountCodeApi.md#addItemAccountCodeAudit) | **PUT** /beta/itemAccountCode/{itemAccountCodeId}/audit/{itemAccountCodeAudit} | Add new audit for an itemAccountCode
*ItemAccountCodeApi* | [**addItemAccountCodeFile**](docs/ItemAccountCodeApi.md#addItemAccountCodeFile) | **POST** /beta/itemAccountCode/{itemAccountCodeId}/file/{fileName} | Attach a file to an itemAccountCode
*ItemAccountCodeApi* | [**addItemAccountCodeFileByURL**](docs/ItemAccountCodeApi.md#addItemAccountCodeFileByURL) | **POST** /beta/itemAccountCode/{itemAccountCodeId}/file | Attach a file to an itemAccountCode by URL.
*ItemAccountCodeApi* | [**addItemAccountCodeTag**](docs/ItemAccountCodeApi.md#addItemAccountCodeTag) | **PUT** /beta/itemAccountCode/{itemAccountCodeId}/tag/{itemAccountCodeTag} | Add new tags for an itemAccountCode.
*ItemAccountCodeApi* | [**deleteItemAccountCode**](docs/ItemAccountCodeApi.md#deleteItemAccountCode) | **DELETE** /beta/itemAccountCode/{itemAccountCodeId} | Delete an itemAccountCode
*ItemAccountCodeApi* | [**deleteItemAccountCodeFile**](docs/ItemAccountCodeApi.md#deleteItemAccountCodeFile) | **DELETE** /beta/itemAccountCode/{itemAccountCodeId}/file/{fileId} | Delete a file for an itemAccountCode.
*ItemAccountCodeApi* | [**deleteItemAccountCodeTag**](docs/ItemAccountCodeApi.md#deleteItemAccountCodeTag) | **DELETE** /beta/itemAccountCode/{itemAccountCodeId}/tag/{itemAccountCodeTag} | Delete a tag for an itemAccountCode.
*ItemAccountCodeApi* | [**getDuplicateItemAccountCodeById**](docs/ItemAccountCodeApi.md#getDuplicateItemAccountCodeById) | **GET** /beta/itemAccountCode/duplicate/{itemAccountCodeId} | Get a duplicated an itemAccountCode by id
*ItemAccountCodeApi* | [**getItemAccountCodeByFilter**](docs/ItemAccountCodeApi.md#getItemAccountCodeByFilter) | **GET** /beta/itemAccountCode/search | Search itemAccountCodes by filter
*ItemAccountCodeApi* | [**getItemAccountCodeById**](docs/ItemAccountCodeApi.md#getItemAccountCodeById) | **GET** /beta/itemAccountCode/{itemAccountCodeId} | Get an itemAccountCode by id
*ItemAccountCodeApi* | [**getItemAccountCodeFiles**](docs/ItemAccountCodeApi.md#getItemAccountCodeFiles) | **GET** /beta/itemAccountCode/{itemAccountCodeId}/file | Get the files for an itemAccountCode.
*ItemAccountCodeApi* | [**getItemAccountCodeTags**](docs/ItemAccountCodeApi.md#getItemAccountCodeTags) | **GET** /beta/itemAccountCode/{itemAccountCodeId}/tag | Get the tags for an itemAccountCode.
*ItemAccountCodeApi* | [**updateItemAccountCode**](docs/ItemAccountCodeApi.md#updateItemAccountCode) | **PUT** /beta/itemAccountCode | Update an itemAccountCode
*ItemActivityApi* | [**addItemActivityAudit**](docs/ItemActivityApi.md#addItemActivityAudit) | **PUT** /beta/itemActivity/{itemActivityId}/audit/{itemActivityAudit} | Add new audit for an itemActivity
*ItemActivityApi* | [**addItemActivityFile**](docs/ItemActivityApi.md#addItemActivityFile) | **POST** /beta/itemActivity/{itemActivityId}/file/{fileName} | Attach a file to an itemActivity
*ItemActivityApi* | [**addItemActivityFileByURL**](docs/ItemActivityApi.md#addItemActivityFileByURL) | **POST** /beta/itemActivity/{itemActivityId}/file | Attach a file to an itemActivity by URL.
*ItemActivityApi* | [**addItemActivityTag**](docs/ItemActivityApi.md#addItemActivityTag) | **PUT** /beta/itemActivity/{itemActivityId}/tag/{itemActivityTag} | Add new tags for an itemActivity.
*ItemActivityApi* | [**deleteItemActivityFile**](docs/ItemActivityApi.md#deleteItemActivityFile) | **DELETE** /beta/itemActivity/{itemActivityId}/file/{fileId} | Delete a file for an itemActivity.
*ItemActivityApi* | [**deleteItemActivityTag**](docs/ItemActivityApi.md#deleteItemActivityTag) | **DELETE** /beta/itemActivity/{itemActivityId}/tag/{itemActivityTag} | Delete a tag for an itemActivity.
*ItemActivityApi* | [**getDuplicateItemActivityById**](docs/ItemActivityApi.md#getDuplicateItemActivityById) | **GET** /beta/itemActivity/duplicate/{itemActivityId} | Get a duplicated an itemActivity by id
*ItemActivityApi* | [**getItemActivityByFilter**](docs/ItemActivityApi.md#getItemActivityByFilter) | **GET** /beta/itemActivity/search | Search itemActivitys by filter
*ItemActivityApi* | [**getItemActivityById**](docs/ItemActivityApi.md#getItemActivityById) | **GET** /beta/itemActivity/{itemActivityId} | Get an itemActivity by id
*ItemActivityApi* | [**getItemActivityFiles**](docs/ItemActivityApi.md#getItemActivityFiles) | **GET** /beta/itemActivity/{itemActivityId}/file | Get the files for an itemActivity.
*ItemActivityApi* | [**getItemActivityTags**](docs/ItemActivityApi.md#getItemActivityTags) | **GET** /beta/itemActivity/{itemActivityId}/tag | Get the tags for an itemActivity.
*ItemActivityTypeApi* | [**getItemActivityTypeById**](docs/ItemActivityTypeApi.md#getItemActivityTypeById) | **GET** /beta/itemActivityType/{itemActivityTypeId} | Get an itemActivityType by id
*ItemActivityTypeApi* | [**getItemActivityTypeBySearchText**](docs/ItemActivityTypeApi.md#getItemActivityTypeBySearchText) | **GET** /beta/itemActivityType/search | Search itemActivityTypes
*ItemBuyerApi* | [**addItemBuyer**](docs/ItemBuyerApi.md#addItemBuyer) | **POST** /beta/itemBuyer | Create an itemBuyer
*ItemBuyerApi* | [**addItemBuyerAudit**](docs/ItemBuyerApi.md#addItemBuyerAudit) | **PUT** /beta/itemBuyer/{itemBuyerId}/audit/{itemBuyerAudit} | Add new audit for an itemBuyer
*ItemBuyerApi* | [**addItemBuyerFile**](docs/ItemBuyerApi.md#addItemBuyerFile) | **POST** /beta/itemBuyer/{itemBuyerId}/file/{fileName} | Attach a file to an itemBuyer
*ItemBuyerApi* | [**addItemBuyerFileByURL**](docs/ItemBuyerApi.md#addItemBuyerFileByURL) | **POST** /beta/itemBuyer/{itemBuyerId}/file | Attach a file to an itemBuyer by URL.
*ItemBuyerApi* | [**addItemBuyerTag**](docs/ItemBuyerApi.md#addItemBuyerTag) | **PUT** /beta/itemBuyer/{itemBuyerId}/tag/{itemBuyerTag} | Add new tags for an itemBuyer.
*ItemBuyerApi* | [**deleteItemBuyer**](docs/ItemBuyerApi.md#deleteItemBuyer) | **DELETE** /beta/itemBuyer/{itemBuyerId} | Delete an itemBuyer
*ItemBuyerApi* | [**deleteItemBuyerFile**](docs/ItemBuyerApi.md#deleteItemBuyerFile) | **DELETE** /beta/itemBuyer/{itemBuyerId}/file/{fileId} | Delete a file for an itemBuyer.
*ItemBuyerApi* | [**deleteItemBuyerTag**](docs/ItemBuyerApi.md#deleteItemBuyerTag) | **DELETE** /beta/itemBuyer/{itemBuyerId}/tag/{itemBuyerTag} | Delete a tag for an itemBuyer.
*ItemBuyerApi* | [**getDuplicateItemBuyerById**](docs/ItemBuyerApi.md#getDuplicateItemBuyerById) | **GET** /beta/itemBuyer/duplicate/{itemBuyerId} | Get a duplicated an itemBuyer by id
*ItemBuyerApi* | [**getItemBuyerByFilter**](docs/ItemBuyerApi.md#getItemBuyerByFilter) | **GET** /beta/itemBuyer/search | Search itemBuyers by filter
*ItemBuyerApi* | [**getItemBuyerById**](docs/ItemBuyerApi.md#getItemBuyerById) | **GET** /beta/itemBuyer/{itemBuyerId} | Get an itemBuyer by id
*ItemBuyerApi* | [**getItemBuyerFiles**](docs/ItemBuyerApi.md#getItemBuyerFiles) | **GET** /beta/itemBuyer/{itemBuyerId}/file | Get the files for an itemBuyer.
*ItemBuyerApi* | [**getItemBuyerTags**](docs/ItemBuyerApi.md#getItemBuyerTags) | **GET** /beta/itemBuyer/{itemBuyerId}/tag | Get the tags for an itemBuyer.
*ItemBuyerApi* | [**updateItemBuyer**](docs/ItemBuyerApi.md#updateItemBuyer) | **PUT** /beta/itemBuyer | Update an itemBuyer
*ItemCategoryApi* | [**addItemCategory**](docs/ItemCategoryApi.md#addItemCategory) | **POST** /beta/itemCategory | Create an itemCategory
*ItemCategoryApi* | [**addItemCategoryAudit**](docs/ItemCategoryApi.md#addItemCategoryAudit) | **PUT** /beta/itemCategory/{itemCategoryId}/audit/{itemCategoryAudit} | Add new audit for an itemCategory
*ItemCategoryApi* | [**addItemCategoryFile**](docs/ItemCategoryApi.md#addItemCategoryFile) | **POST** /beta/itemCategory/{itemCategoryId}/file/{fileName} | Attach a file to an itemCategory
*ItemCategoryApi* | [**addItemCategoryFileByURL**](docs/ItemCategoryApi.md#addItemCategoryFileByURL) | **POST** /beta/itemCategory/{itemCategoryId}/file | Attach a file to an itemCategory by URL.
*ItemCategoryApi* | [**addItemCategoryTag**](docs/ItemCategoryApi.md#addItemCategoryTag) | **PUT** /beta/itemCategory/{itemCategoryId}/tag/{itemCategoryTag} | Add new tags for an itemCategory.
*ItemCategoryApi* | [**deleteItemCategory**](docs/ItemCategoryApi.md#deleteItemCategory) | **DELETE** /beta/itemCategory/{itemCategoryId} | Delete an itemCategory
*ItemCategoryApi* | [**deleteItemCategoryFile**](docs/ItemCategoryApi.md#deleteItemCategoryFile) | **DELETE** /beta/itemCategory/{itemCategoryId}/file/{fileId} | Delete a file for an itemCategory.
*ItemCategoryApi* | [**deleteItemCategoryTag**](docs/ItemCategoryApi.md#deleteItemCategoryTag) | **DELETE** /beta/itemCategory/{itemCategoryId}/tag/{itemCategoryTag} | Delete a tag for an itemCategory.
*ItemCategoryApi* | [**getDuplicateItemCategoryById**](docs/ItemCategoryApi.md#getDuplicateItemCategoryById) | **GET** /beta/itemCategory/duplicate/{itemCategoryId} | Get a duplicated an itemCategory by id
*ItemCategoryApi* | [**getItemCategoryByFilter**](docs/ItemCategoryApi.md#getItemCategoryByFilter) | **GET** /beta/itemCategory/search | Search itemCategorys by filter
*ItemCategoryApi* | [**getItemCategoryById**](docs/ItemCategoryApi.md#getItemCategoryById) | **GET** /beta/itemCategory/{itemCategoryId} | Get an itemCategory by id
*ItemCategoryApi* | [**getItemCategoryFiles**](docs/ItemCategoryApi.md#getItemCategoryFiles) | **GET** /beta/itemCategory/{itemCategoryId}/file | Get the files for an itemCategory.
*ItemCategoryApi* | [**getItemCategoryTags**](docs/ItemCategoryApi.md#getItemCategoryTags) | **GET** /beta/itemCategory/{itemCategoryId}/tag | Get the tags for an itemCategory.
*ItemCategoryApi* | [**updateItemCategory**](docs/ItemCategoryApi.md#updateItemCategory) | **PUT** /beta/itemCategory | Update an itemCategory
*ItemLowstockCodeApi* | [**addItemLowstockCode**](docs/ItemLowstockCodeApi.md#addItemLowstockCode) | **POST** /beta/itemLowstockCode | Create an itemLowstockCode
*ItemLowstockCodeApi* | [**addItemLowstockCodeAudit**](docs/ItemLowstockCodeApi.md#addItemLowstockCodeAudit) | **PUT** /beta/itemLowstockCode/{itemLowstockCodeId}/audit/{itemLowstockCodeAudit} | Add new audit for an itemLowstockCode
*ItemLowstockCodeApi* | [**addItemLowstockCodeFile**](docs/ItemLowstockCodeApi.md#addItemLowstockCodeFile) | **POST** /beta/itemLowstockCode/{itemLowstockCodeId}/file/{fileName} | Attach a file to an itemLowstockCode
*ItemLowstockCodeApi* | [**addItemLowstockCodeFileByURL**](docs/ItemLowstockCodeApi.md#addItemLowstockCodeFileByURL) | **POST** /beta/itemLowstockCode/{itemLowstockCodeId}/file | Attach a file to an itemLowstockCode by URL.
*ItemLowstockCodeApi* | [**addItemLowstockCodeTag**](docs/ItemLowstockCodeApi.md#addItemLowstockCodeTag) | **PUT** /beta/itemLowstockCode/{itemLowstockCodeId}/tag/{itemLowstockCodeTag} | Add new tags for an itemLowstockCode.
*ItemLowstockCodeApi* | [**deleteItemLowstockCode**](docs/ItemLowstockCodeApi.md#deleteItemLowstockCode) | **DELETE** /beta/itemLowstockCode/{itemLowstockCodeId} | Delete an itemLowstockCode
*ItemLowstockCodeApi* | [**deleteItemLowstockCodeFile**](docs/ItemLowstockCodeApi.md#deleteItemLowstockCodeFile) | **DELETE** /beta/itemLowstockCode/{itemLowstockCodeId}/file/{fileId} | Delete a file for an itemLowstockCode.
*ItemLowstockCodeApi* | [**deleteItemLowstockCodeTag**](docs/ItemLowstockCodeApi.md#deleteItemLowstockCodeTag) | **DELETE** /beta/itemLowstockCode/{itemLowstockCodeId}/tag/{itemLowstockCodeTag} | Delete a tag for an itemLowstockCode.
*ItemLowstockCodeApi* | [**getDuplicateItemLowstockCodeById**](docs/ItemLowstockCodeApi.md#getDuplicateItemLowstockCodeById) | **GET** /beta/itemLowstockCode/duplicate/{itemLowstockCodeId} | Get a duplicated an itemLowstockCode by id
*ItemLowstockCodeApi* | [**getItemLowstockCodeByFilter**](docs/ItemLowstockCodeApi.md#getItemLowstockCodeByFilter) | **GET** /beta/itemLowstockCode/search | Search itemLowstockCodes by filter
*ItemLowstockCodeApi* | [**getItemLowstockCodeById**](docs/ItemLowstockCodeApi.md#getItemLowstockCodeById) | **GET** /beta/itemLowstockCode/{itemLowstockCodeId} | Get an itemLowstockCode by id
*ItemLowstockCodeApi* | [**getItemLowstockCodeFiles**](docs/ItemLowstockCodeApi.md#getItemLowstockCodeFiles) | **GET** /beta/itemLowstockCode/{itemLowstockCodeId}/file | Get the files for an itemLowstockCode.
*ItemLowstockCodeApi* | [**getItemLowstockCodeTags**](docs/ItemLowstockCodeApi.md#getItemLowstockCodeTags) | **GET** /beta/itemLowstockCode/{itemLowstockCodeId}/tag | Get the tags for an itemLowstockCode.
*ItemLowstockCodeApi* | [**updateItemLowstockCode**](docs/ItemLowstockCodeApi.md#updateItemLowstockCode) | **PUT** /beta/itemLowstockCode | Update an itemLowstockCode
*ItemProductCodeApi* | [**addItemProductCode**](docs/ItemProductCodeApi.md#addItemProductCode) | **POST** /beta/itemProductCode | Create an itemProductCode
*ItemProductCodeApi* | [**addItemProductCodeAudit**](docs/ItemProductCodeApi.md#addItemProductCodeAudit) | **PUT** /beta/itemProductCode/{itemProductCodeId}/audit/{itemProductCodeAudit} | Add new audit for an itemProductCode
*ItemProductCodeApi* | [**addItemProductCodeFile**](docs/ItemProductCodeApi.md#addItemProductCodeFile) | **POST** /beta/itemProductCode/{itemProductCodeId}/file/{fileName} | Attach a file to an itemProductCode
*ItemProductCodeApi* | [**addItemProductCodeFileByURL**](docs/ItemProductCodeApi.md#addItemProductCodeFileByURL) | **POST** /beta/itemProductCode/{itemProductCodeId}/file | Attach a file to an itemProductCode by URL.
*ItemProductCodeApi* | [**addItemProductCodeTag**](docs/ItemProductCodeApi.md#addItemProductCodeTag) | **PUT** /beta/itemProductCode/{itemProductCodeId}/tag/{itemProductCodeTag} | Add new tags for an itemProductCode.
*ItemProductCodeApi* | [**deleteItemProductCode**](docs/ItemProductCodeApi.md#deleteItemProductCode) | **DELETE** /beta/itemProductCode/{itemProductCodeId} | Delete an itemProductCode
*ItemProductCodeApi* | [**deleteItemProductCodeFile**](docs/ItemProductCodeApi.md#deleteItemProductCodeFile) | **DELETE** /beta/itemProductCode/{itemProductCodeId}/file/{fileId} | Delete a file for an itemProductCode.
*ItemProductCodeApi* | [**deleteItemProductCodeTag**](docs/ItemProductCodeApi.md#deleteItemProductCodeTag) | **DELETE** /beta/itemProductCode/{itemProductCodeId}/tag/{itemProductCodeTag} | Delete a tag for an itemProductCode.
*ItemProductCodeApi* | [**getDuplicateItemProductCodeById**](docs/ItemProductCodeApi.md#getDuplicateItemProductCodeById) | **GET** /beta/itemProductCode/duplicate/{itemProductCodeId} | Get a duplicated an itemProductCode by id
*ItemProductCodeApi* | [**getItemProductCodeByFilter**](docs/ItemProductCodeApi.md#getItemProductCodeByFilter) | **GET** /beta/itemProductCode/search | Search itemProductCodes by filter
*ItemProductCodeApi* | [**getItemProductCodeById**](docs/ItemProductCodeApi.md#getItemProductCodeById) | **GET** /beta/itemProductCode/{itemProductCodeId} | Get an itemProductCode by id
*ItemProductCodeApi* | [**getItemProductCodeFiles**](docs/ItemProductCodeApi.md#getItemProductCodeFiles) | **GET** /beta/itemProductCode/{itemProductCodeId}/file | Get the files for an itemProductCode.
*ItemProductCodeApi* | [**getItemProductCodeTags**](docs/ItemProductCodeApi.md#getItemProductCodeTags) | **GET** /beta/itemProductCode/{itemProductCodeId}/tag | Get the tags for an itemProductCode.
*ItemProductCodeApi* | [**updateItemProductCode**](docs/ItemProductCodeApi.md#updateItemProductCode) | **PUT** /beta/itemProductCode | Update an itemProductCode
*ItemReceiptApi* | [**addItemReceiptAudit**](docs/ItemReceiptApi.md#addItemReceiptAudit) | **PUT** /beta/itemReceipt/{itemReceiptId}/audit/{itemReceiptAudit} | Add new audit for an itemReceipt
*ItemReceiptApi* | [**addItemReceiptFile**](docs/ItemReceiptApi.md#addItemReceiptFile) | **POST** /beta/itemReceipt/{itemReceiptId}/file/{fileName} | Attach a file to an itemReceipt
*ItemReceiptApi* | [**addItemReceiptFileByURL**](docs/ItemReceiptApi.md#addItemReceiptFileByURL) | **POST** /beta/itemReceipt/{itemReceiptId}/file | Attach a file to an itemReceipt by URL.
*ItemReceiptApi* | [**addItemReceiptTag**](docs/ItemReceiptApi.md#addItemReceiptTag) | **PUT** /beta/itemReceipt/{itemReceiptId}/tag/{itemReceiptTag} | Add new tags for an itemReceipt.
*ItemReceiptApi* | [**deleteItemReceiptFile**](docs/ItemReceiptApi.md#deleteItemReceiptFile) | **DELETE** /beta/itemReceipt/{itemReceiptId}/file/{fileId} | Delete a file for an itemReceipt.
*ItemReceiptApi* | [**deleteItemReceiptTag**](docs/ItemReceiptApi.md#deleteItemReceiptTag) | **DELETE** /beta/itemReceipt/{itemReceiptId}/tag/{itemReceiptTag} | Delete a tag for an itemReceipt.
*ItemReceiptApi* | [**getDuplicateItemReceiptById**](docs/ItemReceiptApi.md#getDuplicateItemReceiptById) | **GET** /beta/itemReceipt/duplicate/{itemReceiptId} | Get a duplicated an itemReceipt by id
*ItemReceiptApi* | [**getItemReceiptByFilter**](docs/ItemReceiptApi.md#getItemReceiptByFilter) | **GET** /beta/itemReceipt/search | Search itemReceipts by filter
*ItemReceiptApi* | [**getItemReceiptById**](docs/ItemReceiptApi.md#getItemReceiptById) | **GET** /beta/itemReceipt/{itemReceiptId} | Get an itemReceipt by id
*ItemReceiptApi* | [**getItemReceiptFiles**](docs/ItemReceiptApi.md#getItemReceiptFiles) | **GET** /beta/itemReceipt/{itemReceiptId}/file | Get the files for an itemReceipt.
*ItemReceiptApi* | [**getItemReceiptTags**](docs/ItemReceiptApi.md#getItemReceiptTags) | **GET** /beta/itemReceipt/{itemReceiptId}/tag | Get the tags for an itemReceipt.
*ItemReceiptApi* | [**updateItemReceipt**](docs/ItemReceiptApi.md#updateItemReceipt) | **PUT** /beta/itemReceipt | Update an itemReceipt
*ItemReceiptApi* | [**updateItemReceiptCustomFields**](docs/ItemReceiptApi.md#updateItemReceiptCustomFields) | **PUT** /beta/itemReceipt/customFields | Update an itemReceipt custom fields
*ItemReceiptActivityApi* | [**addItemReceiptActivity**](docs/ItemReceiptActivityApi.md#addItemReceiptActivity) | **POST** /beta/itemReceiptActivity | Create an itemReceiptActivity
*ItemReceiptActivityApi* | [**addItemReceiptActivityAudit**](docs/ItemReceiptActivityApi.md#addItemReceiptActivityAudit) | **PUT** /beta/itemReceiptActivity/{itemReceiptActivityId}/audit/{itemReceiptActivityAudit} | Add new audit for an itemReceiptActivity
*ItemReceiptActivityApi* | [**addItemReceiptActivityFile**](docs/ItemReceiptActivityApi.md#addItemReceiptActivityFile) | **POST** /beta/itemReceiptActivity/{itemReceiptActivityId}/file/{fileName} | Attach a file to an itemReceiptActivity
*ItemReceiptActivityApi* | [**addItemReceiptActivityFileByURL**](docs/ItemReceiptActivityApi.md#addItemReceiptActivityFileByURL) | **POST** /beta/itemReceiptActivity/{itemReceiptActivityId}/file | Attach a file to an itemReceiptActivity by URL.
*ItemReceiptActivityApi* | [**addItemReceiptActivityTag**](docs/ItemReceiptActivityApi.md#addItemReceiptActivityTag) | **PUT** /beta/itemReceiptActivity/{itemReceiptActivityId}/tag/{itemReceiptActivityTag} | Add new tags for an itemReceiptActivity.
*ItemReceiptActivityApi* | [**deleteItemReceiptActivity**](docs/ItemReceiptActivityApi.md#deleteItemReceiptActivity) | **DELETE** /beta/itemReceiptActivity/{itemReceiptActivityId} | Delete an itemReceiptActivity
*ItemReceiptActivityApi* | [**deleteItemReceiptActivityFile**](docs/ItemReceiptActivityApi.md#deleteItemReceiptActivityFile) | **DELETE** /beta/itemReceiptActivity/{itemReceiptActivityId}/file/{fileId} | Delete a file for an itemReceiptActivity.
*ItemReceiptActivityApi* | [**deleteItemReceiptActivityTag**](docs/ItemReceiptActivityApi.md#deleteItemReceiptActivityTag) | **DELETE** /beta/itemReceiptActivity/{itemReceiptActivityId}/tag/{itemReceiptActivityTag} | Delete a tag for an itemReceiptActivity.
*ItemReceiptActivityApi* | [**getDuplicateItemReceiptActivityById**](docs/ItemReceiptActivityApi.md#getDuplicateItemReceiptActivityById) | **GET** /beta/itemReceiptActivity/duplicate/{itemReceiptActivityId} | Get a duplicated an itemReceiptActivity by id
*ItemReceiptActivityApi* | [**getItemReceiptActivityByFilter**](docs/ItemReceiptActivityApi.md#getItemReceiptActivityByFilter) | **GET** /beta/itemReceiptActivity/search | Search itemReceiptActivitys by filter
*ItemReceiptActivityApi* | [**getItemReceiptActivityById**](docs/ItemReceiptActivityApi.md#getItemReceiptActivityById) | **GET** /beta/itemReceiptActivity/{itemReceiptActivityId} | Get an itemReceiptActivity by id
*ItemReceiptActivityApi* | [**getItemReceiptActivityFiles**](docs/ItemReceiptActivityApi.md#getItemReceiptActivityFiles) | **GET** /beta/itemReceiptActivity/{itemReceiptActivityId}/file | Get the files for an itemReceiptActivity.
*ItemReceiptActivityApi* | [**getItemReceiptActivityTags**](docs/ItemReceiptActivityApi.md#getItemReceiptActivityTags) | **GET** /beta/itemReceiptActivity/{itemReceiptActivityId}/tag | Get the tags for an itemReceiptActivity.
*ItemReceiptActivityApi* | [**updateItemReceiptActivity**](docs/ItemReceiptActivityApi.md#updateItemReceiptActivity) | **PUT** /beta/itemReceiptActivity | Update an itemReceiptActivity
*ItemSectorApi* | [**addItemSector**](docs/ItemSectorApi.md#addItemSector) | **POST** /beta/itemSector | Create an itemSector
*ItemSectorApi* | [**addItemSectorAudit**](docs/ItemSectorApi.md#addItemSectorAudit) | **PUT** /beta/itemSector/{itemSectorId}/audit/{itemSectorAudit} | Add new audit for an itemSector
*ItemSectorApi* | [**addItemSectorFile**](docs/ItemSectorApi.md#addItemSectorFile) | **POST** /beta/itemSector/{itemSectorId}/file/{fileName} | Attach a file to an itemSector
*ItemSectorApi* | [**addItemSectorFileByURL**](docs/ItemSectorApi.md#addItemSectorFileByURL) | **POST** /beta/itemSector/{itemSectorId}/file | Attach a file to an itemSector by URL.
*ItemSectorApi* | [**addItemSectorTag**](docs/ItemSectorApi.md#addItemSectorTag) | **PUT** /beta/itemSector/{itemSectorId}/tag/{itemSectorTag} | Add new tags for an itemSector.
*ItemSectorApi* | [**deleteItemSector**](docs/ItemSectorApi.md#deleteItemSector) | **DELETE** /beta/itemSector/{itemSectorId} | Delete an itemSector
*ItemSectorApi* | [**deleteItemSectorFile**](docs/ItemSectorApi.md#deleteItemSectorFile) | **DELETE** /beta/itemSector/{itemSectorId}/file/{fileId} | Delete a file for an itemSector.
*ItemSectorApi* | [**deleteItemSectorTag**](docs/ItemSectorApi.md#deleteItemSectorTag) | **DELETE** /beta/itemSector/{itemSectorId}/tag/{itemSectorTag} | Delete a tag for an itemSector.
*ItemSectorApi* | [**getDuplicateItemSectorById**](docs/ItemSectorApi.md#getDuplicateItemSectorById) | **GET** /beta/itemSector/duplicate/{itemSectorId} | Get a duplicated an itemSector by id
*ItemSectorApi* | [**getItemSectorByFilter**](docs/ItemSectorApi.md#getItemSectorByFilter) | **GET** /beta/itemSector/search | Search itemSectors by filter
*ItemSectorApi* | [**getItemSectorById**](docs/ItemSectorApi.md#getItemSectorById) | **GET** /beta/itemSector/{itemSectorId} | Get an itemSector by id
*ItemSectorApi* | [**getItemSectorFiles**](docs/ItemSectorApi.md#getItemSectorFiles) | **GET** /beta/itemSector/{itemSectorId}/file | Get the files for an itemSector.
*ItemSectorApi* | [**getItemSectorTags**](docs/ItemSectorApi.md#getItemSectorTags) | **GET** /beta/itemSector/{itemSectorId}/tag | Get the tags for an itemSector.
*ItemSectorApi* | [**updateItemSector**](docs/ItemSectorApi.md#updateItemSector) | **PUT** /beta/itemSector | Update an itemSector
*ItemSerialApi* | [**addItemSerial**](docs/ItemSerialApi.md#addItemSerial) | **POST** /beta/itemSerial | Create an itemSerial
*ItemSerialApi* | [**addItemSerialAudit**](docs/ItemSerialApi.md#addItemSerialAudit) | **PUT** /beta/itemSerial/{itemSerialId}/audit/{itemSerialAudit} | Add new audit for an itemSerial
*ItemSerialApi* | [**addItemSerialFile**](docs/ItemSerialApi.md#addItemSerialFile) | **POST** /beta/itemSerial/{itemSerialId}/file/{fileName} | Attach a file to an itemSerial
*ItemSerialApi* | [**addItemSerialFileByURL**](docs/ItemSerialApi.md#addItemSerialFileByURL) | **POST** /beta/itemSerial/{itemSerialId}/file | Attach a file to an itemSerial by URL.
*ItemSerialApi* | [**addItemSerialTag**](docs/ItemSerialApi.md#addItemSerialTag) | **PUT** /beta/itemSerial/{itemSerialId}/tag/{itemSerialTag} | Add new tags for an itemSerial.
*ItemSerialApi* | [**deleteItemSerial**](docs/ItemSerialApi.md#deleteItemSerial) | **DELETE** /beta/itemSerial/{itemSerialId} | Delete an itemSerial
*ItemSerialApi* | [**deleteItemSerialFile**](docs/ItemSerialApi.md#deleteItemSerialFile) | **DELETE** /beta/itemSerial/{itemSerialId}/file/{fileId} | Delete a file for an itemSerial.
*ItemSerialApi* | [**deleteItemSerialTag**](docs/ItemSerialApi.md#deleteItemSerialTag) | **DELETE** /beta/itemSerial/{itemSerialId}/tag/{itemSerialTag} | Delete a tag for an itemSerial.
*ItemSerialApi* | [**getDuplicateItemSerialById**](docs/ItemSerialApi.md#getDuplicateItemSerialById) | **GET** /beta/itemSerial/duplicate/{itemSerialId} | Get a duplicated an itemSerial by id
*ItemSerialApi* | [**getItemSerialByFilter**](docs/ItemSerialApi.md#getItemSerialByFilter) | **GET** /beta/itemSerial/search | Search itemSerials by filter
*ItemSerialApi* | [**getItemSerialById**](docs/ItemSerialApi.md#getItemSerialById) | **GET** /beta/itemSerial/{itemSerialId} | Get an itemSerial by id
*ItemSerialApi* | [**getItemSerialFiles**](docs/ItemSerialApi.md#getItemSerialFiles) | **GET** /beta/itemSerial/{itemSerialId}/file | Get the files for an itemSerial.
*ItemSerialApi* | [**getItemSerialTags**](docs/ItemSerialApi.md#getItemSerialTags) | **GET** /beta/itemSerial/{itemSerialId}/tag | Get the tags for an itemSerial.
*ItemSerialApi* | [**updateItemSerial**](docs/ItemSerialApi.md#updateItemSerial) | **PUT** /beta/itemSerial | Update an itemSerial
*ItemSerialSchemeApi* | [**addItemSerialScheme**](docs/ItemSerialSchemeApi.md#addItemSerialScheme) | **POST** /beta/itemSerialScheme | Create an itemSerialScheme
*ItemSerialSchemeApi* | [**addItemSerialSchemeAudit**](docs/ItemSerialSchemeApi.md#addItemSerialSchemeAudit) | **PUT** /beta/itemSerialScheme/{itemSerialSchemeId}/audit/{itemSerialSchemeAudit} | Add new audit for an itemSerialScheme
*ItemSerialSchemeApi* | [**addItemSerialSchemeFile**](docs/ItemSerialSchemeApi.md#addItemSerialSchemeFile) | **POST** /beta/itemSerialScheme/{itemSerialSchemeId}/file/{fileName} | Attach a file to an itemSerialScheme
*ItemSerialSchemeApi* | [**addItemSerialSchemeFileByURL**](docs/ItemSerialSchemeApi.md#addItemSerialSchemeFileByURL) | **POST** /beta/itemSerialScheme/{itemSerialSchemeId}/file | Attach a file to an itemSerialScheme by URL.
*ItemSerialSchemeApi* | [**addItemSerialSchemeTag**](docs/ItemSerialSchemeApi.md#addItemSerialSchemeTag) | **PUT** /beta/itemSerialScheme/{itemSerialSchemeId}/tag/{itemSerialSchemeTag} | Add new tags for an itemSerialScheme.
*ItemSerialSchemeApi* | [**deleteItemSerialScheme**](docs/ItemSerialSchemeApi.md#deleteItemSerialScheme) | **DELETE** /beta/itemSerialScheme/{itemSerialSchemeId} | Delete an itemSerialScheme
*ItemSerialSchemeApi* | [**deleteItemSerialSchemeFile**](docs/ItemSerialSchemeApi.md#deleteItemSerialSchemeFile) | **DELETE** /beta/itemSerialScheme/{itemSerialSchemeId}/file/{fileId} | Delete a file for an itemSerialScheme.
*ItemSerialSchemeApi* | [**deleteItemSerialSchemeTag**](docs/ItemSerialSchemeApi.md#deleteItemSerialSchemeTag) | **DELETE** /beta/itemSerialScheme/{itemSerialSchemeId}/tag/{itemSerialSchemeTag} | Delete a tag for an itemSerialScheme.
*ItemSerialSchemeApi* | [**getDuplicateItemSerialSchemeById**](docs/ItemSerialSchemeApi.md#getDuplicateItemSerialSchemeById) | **GET** /beta/itemSerialScheme/duplicate/{itemSerialSchemeId} | Get a duplicated an itemSerialScheme by id
*ItemSerialSchemeApi* | [**getItemSerialSchemeByFilter**](docs/ItemSerialSchemeApi.md#getItemSerialSchemeByFilter) | **GET** /beta/itemSerialScheme/search | Search itemSerialSchemes by filter
*ItemSerialSchemeApi* | [**getItemSerialSchemeById**](docs/ItemSerialSchemeApi.md#getItemSerialSchemeById) | **GET** /beta/itemSerialScheme/{itemSerialSchemeId} | Get an itemSerialScheme by id
*ItemSerialSchemeApi* | [**getItemSerialSchemeFiles**](docs/ItemSerialSchemeApi.md#getItemSerialSchemeFiles) | **GET** /beta/itemSerialScheme/{itemSerialSchemeId}/file | Get the files for an itemSerialScheme.
*ItemSerialSchemeApi* | [**getItemSerialSchemeTags**](docs/ItemSerialSchemeApi.md#getItemSerialSchemeTags) | **GET** /beta/itemSerialScheme/{itemSerialSchemeId}/tag | Get the tags for an itemSerialScheme.
*ItemSerialSchemeApi* | [**updateItemSerialScheme**](docs/ItemSerialSchemeApi.md#updateItemSerialScheme) | **PUT** /beta/itemSerialScheme | Update an itemSerialScheme
*ItemSubCategoryApi* | [**addItemSubCategory**](docs/ItemSubCategoryApi.md#addItemSubCategory) | **POST** /beta/itemSubCategory | Create an itemSubCategory
*ItemSubCategoryApi* | [**addItemSubCategoryAudit**](docs/ItemSubCategoryApi.md#addItemSubCategoryAudit) | **PUT** /beta/itemSubCategory/{itemSubCategoryId}/audit/{itemSubCategoryAudit} | Add new audit for an itemSubCategory
*ItemSubCategoryApi* | [**addItemSubCategoryFile**](docs/ItemSubCategoryApi.md#addItemSubCategoryFile) | **POST** /beta/itemSubCategory/{itemSubCategoryId}/file/{fileName} | Attach a file to an itemSubCategory
*ItemSubCategoryApi* | [**addItemSubCategoryFileByURL**](docs/ItemSubCategoryApi.md#addItemSubCategoryFileByURL) | **POST** /beta/itemSubCategory/{itemSubCategoryId}/file | Attach a file to an itemSubCategory by URL.
*ItemSubCategoryApi* | [**addItemSubCategoryTag**](docs/ItemSubCategoryApi.md#addItemSubCategoryTag) | **PUT** /beta/itemSubCategory/{itemSubCategoryId}/tag/{itemSubCategoryTag} | Add new tags for an itemSubCategory.
*ItemSubCategoryApi* | [**deleteItemSubCategory**](docs/ItemSubCategoryApi.md#deleteItemSubCategory) | **DELETE** /beta/itemSubCategory/{itemSubCategoryId} | Delete an itemSubCategory
*ItemSubCategoryApi* | [**deleteItemSubCategoryFile**](docs/ItemSubCategoryApi.md#deleteItemSubCategoryFile) | **DELETE** /beta/itemSubCategory/{itemSubCategoryId}/file/{fileId} | Delete a file for an itemSubCategory.
*ItemSubCategoryApi* | [**deleteItemSubCategoryTag**](docs/ItemSubCategoryApi.md#deleteItemSubCategoryTag) | **DELETE** /beta/itemSubCategory/{itemSubCategoryId}/tag/{itemSubCategoryTag} | Delete a tag for an itemSubCategory.
*ItemSubCategoryApi* | [**getDuplicateItemSubCategoryById**](docs/ItemSubCategoryApi.md#getDuplicateItemSubCategoryById) | **GET** /beta/itemSubCategory/duplicate/{itemSubCategoryId} | Get a duplicated an itemSubCategory by id
*ItemSubCategoryApi* | [**getItemSubCategoryByFilter**](docs/ItemSubCategoryApi.md#getItemSubCategoryByFilter) | **GET** /beta/itemSubCategory/search | Search itemSubCategorys by filter
*ItemSubCategoryApi* | [**getItemSubCategoryById**](docs/ItemSubCategoryApi.md#getItemSubCategoryById) | **GET** /beta/itemSubCategory/{itemSubCategoryId} | Get an itemSubCategory by id
*ItemSubCategoryApi* | [**getItemSubCategoryFiles**](docs/ItemSubCategoryApi.md#getItemSubCategoryFiles) | **GET** /beta/itemSubCategory/{itemSubCategoryId}/file | Get the files for an itemSubCategory.
*ItemSubCategoryApi* | [**getItemSubCategoryTags**](docs/ItemSubCategoryApi.md#getItemSubCategoryTags) | **GET** /beta/itemSubCategory/{itemSubCategoryId}/tag | Get the tags for an itemSubCategory.
*ItemSubCategoryApi* | [**updateItemSubCategory**](docs/ItemSubCategoryApi.md#updateItemSubCategory) | **PUT** /beta/itemSubCategory | Update an itemSubCategory
*ItemSummaryCodeApi* | [**addItemSummaryCode**](docs/ItemSummaryCodeApi.md#addItemSummaryCode) | **POST** /beta/itemSummaryCode | Create an itemSummaryCode
*ItemSummaryCodeApi* | [**addItemSummaryCodeAudit**](docs/ItemSummaryCodeApi.md#addItemSummaryCodeAudit) | **PUT** /beta/itemSummaryCode/{itemSummaryCodeId}/audit/{itemSummaryCodeAudit} | Add new audit for an itemSummaryCode
*ItemSummaryCodeApi* | [**addItemSummaryCodeFile**](docs/ItemSummaryCodeApi.md#addItemSummaryCodeFile) | **POST** /beta/itemSummaryCode/{itemSummaryCodeId}/file/{fileName} | Attach a file to an itemSummaryCode
*ItemSummaryCodeApi* | [**addItemSummaryCodeFileByURL**](docs/ItemSummaryCodeApi.md#addItemSummaryCodeFileByURL) | **POST** /beta/itemSummaryCode/{itemSummaryCodeId}/file | Attach a file to an itemSummaryCode by URL.
*ItemSummaryCodeApi* | [**addItemSummaryCodeTag**](docs/ItemSummaryCodeApi.md#addItemSummaryCodeTag) | **PUT** /beta/itemSummaryCode/{itemSummaryCodeId}/tag/{itemSummaryCodeTag} | Add new tags for an itemSummaryCode.
*ItemSummaryCodeApi* | [**deleteItemSummaryCode**](docs/ItemSummaryCodeApi.md#deleteItemSummaryCode) | **DELETE** /beta/itemSummaryCode/{itemSummaryCodeId} | Delete an itemSummaryCode
*ItemSummaryCodeApi* | [**deleteItemSummaryCodeFile**](docs/ItemSummaryCodeApi.md#deleteItemSummaryCodeFile) | **DELETE** /beta/itemSummaryCode/{itemSummaryCodeId}/file/{fileId} | Delete a file for an itemSummaryCode.
*ItemSummaryCodeApi* | [**deleteItemSummaryCodeTag**](docs/ItemSummaryCodeApi.md#deleteItemSummaryCodeTag) | **DELETE** /beta/itemSummaryCode/{itemSummaryCodeId}/tag/{itemSummaryCodeTag} | Delete a tag for an itemSummaryCode.
*ItemSummaryCodeApi* | [**getDuplicateItemSummaryCodeById**](docs/ItemSummaryCodeApi.md#getDuplicateItemSummaryCodeById) | **GET** /beta/itemSummaryCode/duplicate/{itemSummaryCodeId} | Get a duplicated an itemSummaryCode by id
*ItemSummaryCodeApi* | [**getItemSummaryCodeByFilter**](docs/ItemSummaryCodeApi.md#getItemSummaryCodeByFilter) | **GET** /beta/itemSummaryCode/search | Search itemSummaryCodes by filter
*ItemSummaryCodeApi* | [**getItemSummaryCodeById**](docs/ItemSummaryCodeApi.md#getItemSummaryCodeById) | **GET** /beta/itemSummaryCode/{itemSummaryCodeId} | Get an itemSummaryCode by id
*ItemSummaryCodeApi* | [**getItemSummaryCodeFiles**](docs/ItemSummaryCodeApi.md#getItemSummaryCodeFiles) | **GET** /beta/itemSummaryCode/{itemSummaryCodeId}/file | Get the files for an itemSummaryCode.
*ItemSummaryCodeApi* | [**getItemSummaryCodeTags**](docs/ItemSummaryCodeApi.md#getItemSummaryCodeTags) | **GET** /beta/itemSummaryCode/{itemSummaryCodeId}/tag | Get the tags for an itemSummaryCode.
*ItemSummaryCodeApi* | [**updateItemSummaryCode**](docs/ItemSummaryCodeApi.md#updateItemSummaryCode) | **PUT** /beta/itemSummaryCode | Update an itemSummaryCode
*JobApi* | [**addJob**](docs/JobApi.md#addJob) | **POST** /beta/job | Create a job
*JobApi* | [**addJobAudit**](docs/JobApi.md#addJobAudit) | **PUT** /beta/job/{jobId}/audit/{jobAudit} | Add new audit for a job
*JobApi* | [**addJobFile**](docs/JobApi.md#addJobFile) | **POST** /beta/job/{jobId}/file/{fileName} | Attach a file to a job
*JobApi* | [**addJobFileByURL**](docs/JobApi.md#addJobFileByURL) | **POST** /beta/job/{jobId}/file | Attach a file to a job by URL.
*JobApi* | [**addJobTag**](docs/JobApi.md#addJobTag) | **PUT** /beta/job/{jobId}/tag/{jobTag} | Add new tags for a job.
*JobApi* | [**deleteJob**](docs/JobApi.md#deleteJob) | **DELETE** /beta/job/{jobId} | Delete a job
*JobApi* | [**deleteJobFile**](docs/JobApi.md#deleteJobFile) | **DELETE** /beta/job/{jobId}/file/{fileId} | Delete a file for a job.
*JobApi* | [**deleteJobTag**](docs/JobApi.md#deleteJobTag) | **DELETE** /beta/job/{jobId}/tag/{jobTag} | Delete a tag for a job.
*JobApi* | [**executeJob**](docs/JobApi.md#executeJob) | **POST** /beta/job/executeJob | Run the ExecuteJob process.
*JobApi* | [**getDuplicateJobById**](docs/JobApi.md#getDuplicateJobById) | **GET** /beta/job/duplicate/{jobId} | Get a duplicated a job by id
*JobApi* | [**getJobByFilter**](docs/JobApi.md#getJobByFilter) | **GET** /beta/job/search | Search jobs by filter
*JobApi* | [**getJobById**](docs/JobApi.md#getJobById) | **GET** /beta/job/{jobId} | Get a job by id
*JobApi* | [**getJobFiles**](docs/JobApi.md#getJobFiles) | **GET** /beta/job/{jobId}/file | Get the files for a job.
*JobApi* | [**getJobTags**](docs/JobApi.md#getJobTags) | **GET** /beta/job/{jobId}/tag | Get the tags for a job.
*JobApi* | [**updateJob**](docs/JobApi.md#updateJob) | **PUT** /beta/job | Update a job
*JobApi* | [**updateJobCustomFields**](docs/JobApi.md#updateJobCustomFields) | **PUT** /beta/job/customFields | Update a job custom fields
*JobRecipeApi* | [**addJobRecipe**](docs/JobRecipeApi.md#addJobRecipe) | **POST** /beta/jobRecipe | Create a jobRecipe
*JobRecipeApi* | [**addJobRecipeAudit**](docs/JobRecipeApi.md#addJobRecipeAudit) | **PUT** /beta/jobRecipe/{jobRecipeId}/audit/{jobRecipeAudit} | Add new audit for a jobRecipe
*JobRecipeApi* | [**addJobRecipeFile**](docs/JobRecipeApi.md#addJobRecipeFile) | **POST** /beta/jobRecipe/{jobRecipeId}/file/{fileName} | Attach a file to a jobRecipe
*JobRecipeApi* | [**addJobRecipeFileByURL**](docs/JobRecipeApi.md#addJobRecipeFileByURL) | **POST** /beta/jobRecipe/{jobRecipeId}/file | Attach a file to a jobRecipe by URL.
*JobRecipeApi* | [**addJobRecipeTag**](docs/JobRecipeApi.md#addJobRecipeTag) | **PUT** /beta/jobRecipe/{jobRecipeId}/tag/{jobRecipeTag} | Add new tags for a jobRecipe.
*JobRecipeApi* | [**deleteJobRecipe**](docs/JobRecipeApi.md#deleteJobRecipe) | **DELETE** /beta/jobRecipe/{jobRecipeId} | Delete a jobRecipe
*JobRecipeApi* | [**deleteJobRecipeFile**](docs/JobRecipeApi.md#deleteJobRecipeFile) | **DELETE** /beta/jobRecipe/{jobRecipeId}/file/{fileId} | Delete a file for a jobRecipe.
*JobRecipeApi* | [**deleteJobRecipeTag**](docs/JobRecipeApi.md#deleteJobRecipeTag) | **DELETE** /beta/jobRecipe/{jobRecipeId}/tag/{jobRecipeTag} | Delete a tag for a jobRecipe.
*JobRecipeApi* | [**getDuplicateJobRecipeById**](docs/JobRecipeApi.md#getDuplicateJobRecipeById) | **GET** /beta/jobRecipe/duplicate/{jobRecipeId} | Get a duplicated a jobRecipe by id
*JobRecipeApi* | [**getJobRecipeByFilter**](docs/JobRecipeApi.md#getJobRecipeByFilter) | **GET** /beta/jobRecipe/search | Search jobRecipes by filter
*JobRecipeApi* | [**getJobRecipeById**](docs/JobRecipeApi.md#getJobRecipeById) | **GET** /beta/jobRecipe/{jobRecipeId} | Get a jobRecipe by id
*JobRecipeApi* | [**getJobRecipeFiles**](docs/JobRecipeApi.md#getJobRecipeFiles) | **GET** /beta/jobRecipe/{jobRecipeId}/file | Get the files for a jobRecipe.
*JobRecipeApi* | [**getJobRecipeTags**](docs/JobRecipeApi.md#getJobRecipeTags) | **GET** /beta/jobRecipe/{jobRecipeId}/tag | Get the tags for a jobRecipe.
*JobRecipeApi* | [**updateJobRecipe**](docs/JobRecipeApi.md#updateJobRecipe) | **PUT** /beta/jobRecipe | Update a jobRecipe
*JobRecipeApi* | [**updateJobRecipeCustomFields**](docs/JobRecipeApi.md#updateJobRecipeCustomFields) | **PUT** /beta/jobRecipe/customFields | Update a jobRecipe custom fields
*JobTimeApi* | [**addJobTime**](docs/JobTimeApi.md#addJobTime) | **POST** /beta/jobTime | Create a jobTime
*JobTimeApi* | [**addJobTimeAudit**](docs/JobTimeApi.md#addJobTimeAudit) | **PUT** /beta/jobTime/{jobTimeId}/audit/{jobTimeAudit} | Add new audit for a jobTime
*JobTimeApi* | [**addJobTimeFile**](docs/JobTimeApi.md#addJobTimeFile) | **POST** /beta/jobTime/{jobTimeId}/file/{fileName} | Attach a file to a jobTime
*JobTimeApi* | [**addJobTimeFileByURL**](docs/JobTimeApi.md#addJobTimeFileByURL) | **POST** /beta/jobTime/{jobTimeId}/file | Attach a file to a jobTime by URL.
*JobTimeApi* | [**addJobTimeTag**](docs/JobTimeApi.md#addJobTimeTag) | **PUT** /beta/jobTime/{jobTimeId}/tag/{jobTimeTag} | Add new tags for a jobTime.
*JobTimeApi* | [**deleteJobTime**](docs/JobTimeApi.md#deleteJobTime) | **DELETE** /beta/jobTime/{jobTimeId} | Delete a jobTime
*JobTimeApi* | [**deleteJobTimeFile**](docs/JobTimeApi.md#deleteJobTimeFile) | **DELETE** /beta/jobTime/{jobTimeId}/file/{fileId} | Delete a file for a jobTime.
*JobTimeApi* | [**deleteJobTimeTag**](docs/JobTimeApi.md#deleteJobTimeTag) | **DELETE** /beta/jobTime/{jobTimeId}/tag/{jobTimeTag} | Delete a tag for a jobTime.
*JobTimeApi* | [**getDuplicateJobTimeById**](docs/JobTimeApi.md#getDuplicateJobTimeById) | **GET** /beta/jobTime/duplicate/{jobTimeId} | Get a duplicated a jobTime by id
*JobTimeApi* | [**getJobTimeByFilter**](docs/JobTimeApi.md#getJobTimeByFilter) | **GET** /beta/jobTime/search | Search jobTimes by filter
*JobTimeApi* | [**getJobTimeById**](docs/JobTimeApi.md#getJobTimeById) | **GET** /beta/jobTime/{jobTimeId} | Get a jobTime by id
*JobTimeApi* | [**getJobTimeFiles**](docs/JobTimeApi.md#getJobTimeFiles) | **GET** /beta/jobTime/{jobTimeId}/file | Get the files for a jobTime.
*JobTimeApi* | [**getJobTimeTags**](docs/JobTimeApi.md#getJobTimeTags) | **GET** /beta/jobTime/{jobTimeId}/tag | Get the tags for a jobTime.
*JobTimeApi* | [**updateJobTime**](docs/JobTimeApi.md#updateJobTime) | **PUT** /beta/jobTime | Update a jobTime
*JobTimeApi* | [**updateJobTimeCustomFields**](docs/JobTimeApi.md#updateJobTimeCustomFields) | **PUT** /beta/jobTime/customFields | Update a jobTime custom fields
*JobTimeActivityApi* | [**addJobTimeActivity**](docs/JobTimeActivityApi.md#addJobTimeActivity) | **POST** /beta/jobTimeActivity | Create a jobTimeActivity
*JobTimeActivityApi* | [**addJobTimeActivityAudit**](docs/JobTimeActivityApi.md#addJobTimeActivityAudit) | **PUT** /beta/jobTimeActivity/{jobTimeActivityId}/audit/{jobTimeActivityAudit} | Add new audit for a jobTimeActivity
*JobTimeActivityApi* | [**addJobTimeActivityFile**](docs/JobTimeActivityApi.md#addJobTimeActivityFile) | **POST** /beta/jobTimeActivity/{jobTimeActivityId}/file/{fileName} | Attach a file to a jobTimeActivity
*JobTimeActivityApi* | [**addJobTimeActivityFileByURL**](docs/JobTimeActivityApi.md#addJobTimeActivityFileByURL) | **POST** /beta/jobTimeActivity/{jobTimeActivityId}/file | Attach a file to a jobTimeActivity by URL.
*JobTimeActivityApi* | [**addJobTimeActivityTag**](docs/JobTimeActivityApi.md#addJobTimeActivityTag) | **PUT** /beta/jobTimeActivity/{jobTimeActivityId}/tag/{jobTimeActivityTag} | Add new tags for a jobTimeActivity.
*JobTimeActivityApi* | [**deleteJobTimeActivity**](docs/JobTimeActivityApi.md#deleteJobTimeActivity) | **DELETE** /beta/jobTimeActivity/{jobTimeActivityId} | Delete a jobTimeActivity
*JobTimeActivityApi* | [**deleteJobTimeActivityFile**](docs/JobTimeActivityApi.md#deleteJobTimeActivityFile) | **DELETE** /beta/jobTimeActivity/{jobTimeActivityId}/file/{fileId} | Delete a file for a jobTimeActivity.
*JobTimeActivityApi* | [**deleteJobTimeActivityTag**](docs/JobTimeActivityApi.md#deleteJobTimeActivityTag) | **DELETE** /beta/jobTimeActivity/{jobTimeActivityId}/tag/{jobTimeActivityTag} | Delete a tag for a jobTimeActivity.
*JobTimeActivityApi* | [**getDuplicateJobTimeActivityById**](docs/JobTimeActivityApi.md#getDuplicateJobTimeActivityById) | **GET** /beta/jobTimeActivity/duplicate/{jobTimeActivityId} | Get a duplicated a jobTimeActivity by id
*JobTimeActivityApi* | [**getJobTimeActivityByFilter**](docs/JobTimeActivityApi.md#getJobTimeActivityByFilter) | **GET** /beta/jobTimeActivity/search | Search jobTimeActivitys by filter
*JobTimeActivityApi* | [**getJobTimeActivityById**](docs/JobTimeActivityApi.md#getJobTimeActivityById) | **GET** /beta/jobTimeActivity/{jobTimeActivityId} | Get a jobTimeActivity by id
*JobTimeActivityApi* | [**getJobTimeActivityFiles**](docs/JobTimeActivityApi.md#getJobTimeActivityFiles) | **GET** /beta/jobTimeActivity/{jobTimeActivityId}/file | Get the files for a jobTimeActivity.
*JobTimeActivityApi* | [**getJobTimeActivityTags**](docs/JobTimeActivityApi.md#getJobTimeActivityTags) | **GET** /beta/jobTimeActivity/{jobTimeActivityId}/tag | Get the tags for a jobTimeActivity.
*JobTimeActivityApi* | [**updateJobTimeActivity**](docs/JobTimeActivityApi.md#updateJobTimeActivity) | **PUT** /beta/jobTimeActivity | Update a jobTimeActivity
*JobTypeApi* | [**addJobType**](docs/JobTypeApi.md#addJobType) | **POST** /beta/jobType | Create a jobType
*JobTypeApi* | [**addJobTypeAudit**](docs/JobTypeApi.md#addJobTypeAudit) | **PUT** /beta/jobType/{jobTypeId}/audit/{jobTypeAudit} | Add new audit for a jobType
*JobTypeApi* | [**addJobTypeFile**](docs/JobTypeApi.md#addJobTypeFile) | **POST** /beta/jobType/{jobTypeId}/file/{fileName} | Attach a file to a jobType
*JobTypeApi* | [**addJobTypeFileByURL**](docs/JobTypeApi.md#addJobTypeFileByURL) | **POST** /beta/jobType/{jobTypeId}/file | Attach a file to a jobType by URL.
*JobTypeApi* | [**addJobTypeTag**](docs/JobTypeApi.md#addJobTypeTag) | **PUT** /beta/jobType/{jobTypeId}/tag/{jobTypeTag} | Add new tags for a jobType.
*JobTypeApi* | [**deleteJobType**](docs/JobTypeApi.md#deleteJobType) | **DELETE** /beta/jobType/{jobTypeId} | Delete a jobType
*JobTypeApi* | [**deleteJobTypeFile**](docs/JobTypeApi.md#deleteJobTypeFile) | **DELETE** /beta/jobType/{jobTypeId}/file/{fileId} | Delete a file for a jobType.
*JobTypeApi* | [**deleteJobTypeTag**](docs/JobTypeApi.md#deleteJobTypeTag) | **DELETE** /beta/jobType/{jobTypeId}/tag/{jobTypeTag} | Delete a tag for a jobType.
*JobTypeApi* | [**getDuplicateJobTypeById**](docs/JobTypeApi.md#getDuplicateJobTypeById) | **GET** /beta/jobType/duplicate/{jobTypeId} | Get a duplicated a jobType by id
*JobTypeApi* | [**getJobTypeByFilter**](docs/JobTypeApi.md#getJobTypeByFilter) | **GET** /beta/jobType/search | Search jobTypes by filter
*JobTypeApi* | [**getJobTypeById**](docs/JobTypeApi.md#getJobTypeById) | **GET** /beta/jobType/{jobTypeId} | Get a jobType by id
*JobTypeApi* | [**getJobTypeFiles**](docs/JobTypeApi.md#getJobTypeFiles) | **GET** /beta/jobType/{jobTypeId}/file | Get the files for a jobType.
*JobTypeApi* | [**getJobTypeTags**](docs/JobTypeApi.md#getJobTypeTags) | **GET** /beta/jobType/{jobTypeId}/tag | Get the tags for a jobType.
*JobTypeApi* | [**updateJobType**](docs/JobTypeApi.md#updateJobType) | **PUT** /beta/jobType | Update a jobType
*JobTypeApi* | [**updateJobTypeCustomFields**](docs/JobTypeApi.md#updateJobTypeCustomFields) | **PUT** /beta/jobType/customFields | Update a jobType custom fields
*KitApi* | [**addKit**](docs/KitApi.md#addKit) | **POST** /beta/kit | Create a kit
*KitApi* | [**addKitAudit**](docs/KitApi.md#addKitAudit) | **PUT** /beta/kit/{kitId}/audit/{kitAudit} | Add new audit for a kit
*KitApi* | [**addKitFile**](docs/KitApi.md#addKitFile) | **POST** /beta/kit/{kitId}/file/{fileName} | Attach a file to a kit
*KitApi* | [**addKitFileByURL**](docs/KitApi.md#addKitFileByURL) | **POST** /beta/kit/{kitId}/file | Attach a file to a kit by URL.
*KitApi* | [**addKitTag**](docs/KitApi.md#addKitTag) | **PUT** /beta/kit/{kitId}/tag/{kitTag} | Add new tags for a kit.
*KitApi* | [**deleteKit**](docs/KitApi.md#deleteKit) | **DELETE** /beta/kit/{kitId} | Delete a kit
*KitApi* | [**deleteKitFile**](docs/KitApi.md#deleteKitFile) | **DELETE** /beta/kit/{kitId}/file/{fileId} | Delete a file for a kit.
*KitApi* | [**deleteKitTag**](docs/KitApi.md#deleteKitTag) | **DELETE** /beta/kit/{kitId}/tag/{kitTag} | Delete a tag for a kit.
*KitApi* | [**getDuplicateKitById**](docs/KitApi.md#getDuplicateKitById) | **GET** /beta/kit/duplicate/{kitId} | Get a duplicated a kit by id
*KitApi* | [**getKitByFilter**](docs/KitApi.md#getKitByFilter) | **GET** /beta/kit/search | Search kits by filter
*KitApi* | [**getKitById**](docs/KitApi.md#getKitById) | **GET** /beta/kit/{kitId} | Get a kit by id
*KitApi* | [**getKitFiles**](docs/KitApi.md#getKitFiles) | **GET** /beta/kit/{kitId}/file | Get the files for a kit.
*KitApi* | [**getKitTags**](docs/KitApi.md#getKitTags) | **GET** /beta/kit/{kitId}/tag | Get the tags for a kit.
*KitApi* | [**updateKit**](docs/KitApi.md#updateKit) | **PUT** /beta/kit | Update a kit
*KitApi* | [**updateKitCustomFields**](docs/KitApi.md#updateKitCustomFields) | **PUT** /beta/kit/customFields | Update a kit custom fields
*LegacyLowstockContactApi* | [**addLegacyLowstockContact**](docs/LegacyLowstockContactApi.md#addLegacyLowstockContact) | **POST** /beta/legacyLowstockContact | Create a legacyLowstockContact
*LegacyLowstockContactApi* | [**addLegacyLowstockContactAudit**](docs/LegacyLowstockContactApi.md#addLegacyLowstockContactAudit) | **PUT** /beta/legacyLowstockContact/{legacyLowstockContactId}/audit/{legacyLowstockContactAudit} | Add new audit for a legacyLowstockContact
*LegacyLowstockContactApi* | [**addLegacyLowstockContactFile**](docs/LegacyLowstockContactApi.md#addLegacyLowstockContactFile) | **POST** /beta/legacyLowstockContact/{legacyLowstockContactId}/file/{fileName} | Attach a file to a legacyLowstockContact
*LegacyLowstockContactApi* | [**addLegacyLowstockContactFileByURL**](docs/LegacyLowstockContactApi.md#addLegacyLowstockContactFileByURL) | **POST** /beta/legacyLowstockContact/{legacyLowstockContactId}/file | Attach a file to a legacyLowstockContact by URL.
*LegacyLowstockContactApi* | [**addLegacyLowstockContactTag**](docs/LegacyLowstockContactApi.md#addLegacyLowstockContactTag) | **PUT** /beta/legacyLowstockContact/{legacyLowstockContactId}/tag/{legacyLowstockContactTag} | Add new tags for a legacyLowstockContact.
*LegacyLowstockContactApi* | [**deleteLegacyLowstockContact**](docs/LegacyLowstockContactApi.md#deleteLegacyLowstockContact) | **DELETE** /beta/legacyLowstockContact/{legacyLowstockContactId} | Delete a legacyLowstockContact
*LegacyLowstockContactApi* | [**deleteLegacyLowstockContactFile**](docs/LegacyLowstockContactApi.md#deleteLegacyLowstockContactFile) | **DELETE** /beta/legacyLowstockContact/{legacyLowstockContactId}/file/{fileId} | Delete a file for a legacyLowstockContact.
*LegacyLowstockContactApi* | [**deleteLegacyLowstockContactTag**](docs/LegacyLowstockContactApi.md#deleteLegacyLowstockContactTag) | **DELETE** /beta/legacyLowstockContact/{legacyLowstockContactId}/tag/{legacyLowstockContactTag} | Delete a tag for a legacyLowstockContact.
*LegacyLowstockContactApi* | [**getDuplicateLegacyLowstockContactById**](docs/LegacyLowstockContactApi.md#getDuplicateLegacyLowstockContactById) | **GET** /beta/legacyLowstockContact/duplicate/{legacyLowstockContactId} | Get a duplicated a legacyLowstockContact by id
*LegacyLowstockContactApi* | [**getLegacyLowstockContactByFilter**](docs/LegacyLowstockContactApi.md#getLegacyLowstockContactByFilter) | **GET** /beta/legacyLowstockContact/search | Search legacyLowstockContacts by filter
*LegacyLowstockContactApi* | [**getLegacyLowstockContactById**](docs/LegacyLowstockContactApi.md#getLegacyLowstockContactById) | **GET** /beta/legacyLowstockContact/{legacyLowstockContactId} | Get a legacyLowstockContact by id
*LegacyLowstockContactApi* | [**getLegacyLowstockContactFiles**](docs/LegacyLowstockContactApi.md#getLegacyLowstockContactFiles) | **GET** /beta/legacyLowstockContact/{legacyLowstockContactId}/file | Get the files for a legacyLowstockContact.
*LegacyLowstockContactApi* | [**getLegacyLowstockContactTags**](docs/LegacyLowstockContactApi.md#getLegacyLowstockContactTags) | **GET** /beta/legacyLowstockContact/{legacyLowstockContactId}/tag | Get the tags for a legacyLowstockContact.
*LegacyLowstockContactApi* | [**updateLegacyLowstockContact**](docs/LegacyLowstockContactApi.md#updateLegacyLowstockContact) | **PUT** /beta/legacyLowstockContact | Update a legacyLowstockContact
*LineOfBusinessApi* | [**addLineOfBusiness**](docs/LineOfBusinessApi.md#addLineOfBusiness) | **POST** /beta/lineOfBusiness | Create a lineOfBusiness
*LineOfBusinessApi* | [**addLineOfBusinessAudit**](docs/LineOfBusinessApi.md#addLineOfBusinessAudit) | **PUT** /beta/lineOfBusiness/{lineOfBusinessId}/audit/{lineOfBusinessAudit} | Add new audit for a lineOfBusiness
*LineOfBusinessApi* | [**addLineOfBusinessFile**](docs/LineOfBusinessApi.md#addLineOfBusinessFile) | **POST** /beta/lineOfBusiness/{lineOfBusinessId}/file/{fileName} | Attach a file to a lineOfBusiness
*LineOfBusinessApi* | [**addLineOfBusinessFileByURL**](docs/LineOfBusinessApi.md#addLineOfBusinessFileByURL) | **POST** /beta/lineOfBusiness/{lineOfBusinessId}/file | Attach a file to a lineOfBusiness by URL.
*LineOfBusinessApi* | [**addLineOfBusinessTag**](docs/LineOfBusinessApi.md#addLineOfBusinessTag) | **PUT** /beta/lineOfBusiness/{lineOfBusinessId}/tag/{lineOfBusinessTag} | Add new tags for a lineOfBusiness.
*LineOfBusinessApi* | [**deleteLineOfBusinessFile**](docs/LineOfBusinessApi.md#deleteLineOfBusinessFile) | **DELETE** /beta/lineOfBusiness/{lineOfBusinessId}/file/{fileId} | Delete a file for a lineOfBusiness.
*LineOfBusinessApi* | [**deleteLineOfBusinessTag**](docs/LineOfBusinessApi.md#deleteLineOfBusinessTag) | **DELETE** /beta/lineOfBusiness/{lineOfBusinessId}/tag/{lineOfBusinessTag} | Delete a tag for a lineOfBusiness.
*LineOfBusinessApi* | [**getDuplicateLineOfBusinessById**](docs/LineOfBusinessApi.md#getDuplicateLineOfBusinessById) | **GET** /beta/lineOfBusiness/duplicate/{lineOfBusinessId} | Get a duplicated a lineOfBusiness by id
*LineOfBusinessApi* | [**getLineOfBusinessByFilter**](docs/LineOfBusinessApi.md#getLineOfBusinessByFilter) | **GET** /beta/lineOfBusiness/search | Search lineOfBusinesses by filter
*LineOfBusinessApi* | [**getLineOfBusinessById**](docs/LineOfBusinessApi.md#getLineOfBusinessById) | **GET** /beta/lineOfBusiness/{lineOfBusinessId} | Get a lineOfBusiness by id
*LineOfBusinessApi* | [**getLineOfBusinessFiles**](docs/LineOfBusinessApi.md#getLineOfBusinessFiles) | **GET** /beta/lineOfBusiness/{lineOfBusinessId}/file | Get the files for a lineOfBusiness.
*LineOfBusinessApi* | [**getLineOfBusinessTags**](docs/LineOfBusinessApi.md#getLineOfBusinessTags) | **GET** /beta/lineOfBusiness/{lineOfBusinessId}/tag | Get the tags for a lineOfBusiness.
*LineOfBusinessApi* | [**updateLineOfBusiness**](docs/LineOfBusinessApi.md#updateLineOfBusiness) | **PUT** /beta/lineOfBusiness | Update a lineOfBusiness
*LineOfBusinessApi* | [**updateLineOfBusinessCustomFields**](docs/LineOfBusinessApi.md#updateLineOfBusinessCustomFields) | **PUT** /beta/lineOfBusiness/customFields | Update a lineOfBusiness custom fields
*LoadApi* | [**addLoadAudit**](docs/LoadApi.md#addLoadAudit) | **PUT** /beta/load/{loadId}/audit/{loadAudit} | Add new audit for a load
*LoadApi* | [**addLoadFile**](docs/LoadApi.md#addLoadFile) | **POST** /beta/load/{loadId}/file/{fileName} | Attach a file to a load
*LoadApi* | [**addLoadFileByURL**](docs/LoadApi.md#addLoadFileByURL) | **POST** /beta/load/{loadId}/file | Attach a file to a load by URL.
*LoadApi* | [**addLoadTag**](docs/LoadApi.md#addLoadTag) | **PUT** /beta/load/{loadId}/tag/{loadTag} | Add new tags for a load.
*LoadApi* | [**deleteLoadFile**](docs/LoadApi.md#deleteLoadFile) | **DELETE** /beta/load/{loadId}/file/{fileId} | Delete a file for a load.
*LoadApi* | [**deleteLoadTag**](docs/LoadApi.md#deleteLoadTag) | **DELETE** /beta/load/{loadId}/tag/{loadTag} | Delete a tag for a load.
*LoadApi* | [**getDuplicateLoadById**](docs/LoadApi.md#getDuplicateLoadById) | **GET** /beta/load/duplicate/{loadId} | Get a duplicated a load by id
*LoadApi* | [**getLoadByFilter**](docs/LoadApi.md#getLoadByFilter) | **GET** /beta/load/search | Search loads by filter
*LoadApi* | [**getLoadById**](docs/LoadApi.md#getLoadById) | **GET** /beta/load/{loadId} | Get a load by id
*LoadApi* | [**getLoadFiles**](docs/LoadApi.md#getLoadFiles) | **GET** /beta/load/{loadId}/file | Get the files for a load.
*LoadApi* | [**getLoadTags**](docs/LoadApi.md#getLoadTags) | **GET** /beta/load/{loadId}/tag | Get the tags for a load.
*LoadApi* | [**updateLoadCustomFields**](docs/LoadApi.md#updateLoadCustomFields) | **PUT** /beta/load/customFields | Update a load custom fields
*LoadContentApi* | [**addLoadContentAudit**](docs/LoadContentApi.md#addLoadContentAudit) | **PUT** /beta/loadContent/{loadContentId}/audit/{loadContentAudit} | Add new audit for a loadContent
*LoadContentApi* | [**addLoadContentFile**](docs/LoadContentApi.md#addLoadContentFile) | **POST** /beta/loadContent/{loadContentId}/file/{fileName} | Attach a file to a loadContent
*LoadContentApi* | [**addLoadContentFileByURL**](docs/LoadContentApi.md#addLoadContentFileByURL) | **POST** /beta/loadContent/{loadContentId}/file | Attach a file to a loadContent by URL.
*LoadContentApi* | [**addLoadContentTag**](docs/LoadContentApi.md#addLoadContentTag) | **PUT** /beta/loadContent/{loadContentId}/tag/{loadContentTag} | Add new tags for a loadContent.
*LoadContentApi* | [**deleteLoadContentFile**](docs/LoadContentApi.md#deleteLoadContentFile) | **DELETE** /beta/loadContent/{loadContentId}/file/{fileId} | Delete a file for a loadContent.
*LoadContentApi* | [**deleteLoadContentTag**](docs/LoadContentApi.md#deleteLoadContentTag) | **DELETE** /beta/loadContent/{loadContentId}/tag/{loadContentTag} | Delete a tag for a loadContent.
*LoadContentApi* | [**getDuplicateLoadContentById**](docs/LoadContentApi.md#getDuplicateLoadContentById) | **GET** /beta/loadContent/duplicate/{loadContentId} | Get a duplicated a loadContent by id
*LoadContentApi* | [**getLoadContentByFilter**](docs/LoadContentApi.md#getLoadContentByFilter) | **GET** /beta/loadContent/search | Search loadContents by filter
*LoadContentApi* | [**getLoadContentById**](docs/LoadContentApi.md#getLoadContentById) | **GET** /beta/loadContent/{loadContentId} | Get a loadContent by id
*LoadContentApi* | [**getLoadContentFiles**](docs/LoadContentApi.md#getLoadContentFiles) | **GET** /beta/loadContent/{loadContentId}/file | Get the files for a loadContent.
*LoadContentApi* | [**getLoadContentTags**](docs/LoadContentApi.md#getLoadContentTags) | **GET** /beta/loadContent/{loadContentId}/tag | Get the tags for a loadContent.
*LoadContentApi* | [**updateLoadContentCustomFields**](docs/LoadContentApi.md#updateLoadContentCustomFields) | **PUT** /beta/loadContent/customFields | Update a loadContent custom fields
*LocationApi* | [**addLocation**](docs/LocationApi.md#addLocation) | **POST** /beta/location | Create a location
*LocationApi* | [**addLocationAudit**](docs/LocationApi.md#addLocationAudit) | **PUT** /beta/location/{locationId}/audit/{locationAudit} | Add new audit for a location
*LocationApi* | [**addLocationFile**](docs/LocationApi.md#addLocationFile) | **POST** /beta/location/{locationId}/file/{fileName} | Attach a file to a location
*LocationApi* | [**addLocationFileByURL**](docs/LocationApi.md#addLocationFileByURL) | **POST** /beta/location/{locationId}/file | Attach a file to a location by URL.
*LocationApi* | [**addLocationTag**](docs/LocationApi.md#addLocationTag) | **PUT** /beta/location/{locationId}/tag/{locationTag} | Add new tags for a location.
*LocationApi* | [**deleteLocation**](docs/LocationApi.md#deleteLocation) | **DELETE** /beta/location/{locationId} | Delete a location
*LocationApi* | [**deleteLocationFile**](docs/LocationApi.md#deleteLocationFile) | **DELETE** /beta/location/{locationId}/file/{fileId} | Delete a file for a location.
*LocationApi* | [**deleteLocationTag**](docs/LocationApi.md#deleteLocationTag) | **DELETE** /beta/location/{locationId}/tag/{locationTag} | Delete a tag for a location.
*LocationApi* | [**getDuplicateLocationById**](docs/LocationApi.md#getDuplicateLocationById) | **GET** /beta/location/duplicate/{locationId} | Get a duplicated a location by id
*LocationApi* | [**getLocationByFilter**](docs/LocationApi.md#getLocationByFilter) | **GET** /beta/location/search | Search locations by filter
*LocationApi* | [**getLocationById**](docs/LocationApi.md#getLocationById) | **GET** /beta/location/{locationId} | Get a location by id
*LocationApi* | [**getLocationFiles**](docs/LocationApi.md#getLocationFiles) | **GET** /beta/location/{locationId}/file | Get the files for a location.
*LocationApi* | [**getLocationTags**](docs/LocationApi.md#getLocationTags) | **GET** /beta/location/{locationId}/tag | Get the tags for a location.
*LocationApi* | [**updateLocation**](docs/LocationApi.md#updateLocation) | **PUT** /beta/location | Update a location
*LocationApi* | [**updateLocationCustomFields**](docs/LocationApi.md#updateLocationCustomFields) | **PUT** /beta/location/customFields | Update a location custom fields
*LocationAddressSchemeApi* | [**addLocationAddressScheme**](docs/LocationAddressSchemeApi.md#addLocationAddressScheme) | **POST** /beta/locationAddressScheme | Create a locationAddressScheme
*LocationAddressSchemeApi* | [**addLocationAddressSchemeAudit**](docs/LocationAddressSchemeApi.md#addLocationAddressSchemeAudit) | **PUT** /beta/locationAddressScheme/{locationAddressSchemeId}/audit/{locationAddressSchemeAudit} | Add new audit for a locationAddressScheme
*LocationAddressSchemeApi* | [**addLocationAddressSchemeFile**](docs/LocationAddressSchemeApi.md#addLocationAddressSchemeFile) | **POST** /beta/locationAddressScheme/{locationAddressSchemeId}/file/{fileName} | Attach a file to a locationAddressScheme
*LocationAddressSchemeApi* | [**addLocationAddressSchemeFileByURL**](docs/LocationAddressSchemeApi.md#addLocationAddressSchemeFileByURL) | **POST** /beta/locationAddressScheme/{locationAddressSchemeId}/file | Attach a file to a locationAddressScheme by URL.
*LocationAddressSchemeApi* | [**addLocationAddressSchemeTag**](docs/LocationAddressSchemeApi.md#addLocationAddressSchemeTag) | **PUT** /beta/locationAddressScheme/{locationAddressSchemeId}/tag/{locationAddressSchemeTag} | Add new tags for a locationAddressScheme.
*LocationAddressSchemeApi* | [**deleteLocationAddressScheme**](docs/LocationAddressSchemeApi.md#deleteLocationAddressScheme) | **DELETE** /beta/locationAddressScheme/{locationAddressSchemeId} | Delete a locationAddressScheme
*LocationAddressSchemeApi* | [**deleteLocationAddressSchemeFile**](docs/LocationAddressSchemeApi.md#deleteLocationAddressSchemeFile) | **DELETE** /beta/locationAddressScheme/{locationAddressSchemeId}/file/{fileId} | Delete a file for a locationAddressScheme.
*LocationAddressSchemeApi* | [**deleteLocationAddressSchemeTag**](docs/LocationAddressSchemeApi.md#deleteLocationAddressSchemeTag) | **DELETE** /beta/locationAddressScheme/{locationAddressSchemeId}/tag/{locationAddressSchemeTag} | Delete a tag for a locationAddressScheme.
*LocationAddressSchemeApi* | [**getDuplicateLocationAddressSchemeById**](docs/LocationAddressSchemeApi.md#getDuplicateLocationAddressSchemeById) | **GET** /beta/locationAddressScheme/duplicate/{locationAddressSchemeId} | Get a duplicated a locationAddressScheme by id
*LocationAddressSchemeApi* | [**getLocationAddressSchemeByFilter**](docs/LocationAddressSchemeApi.md#getLocationAddressSchemeByFilter) | **GET** /beta/locationAddressScheme/search | Search locationAddressSchemes by filter
*LocationAddressSchemeApi* | [**getLocationAddressSchemeById**](docs/LocationAddressSchemeApi.md#getLocationAddressSchemeById) | **GET** /beta/locationAddressScheme/{locationAddressSchemeId} | Get a locationAddressScheme by id
*LocationAddressSchemeApi* | [**getLocationAddressSchemeFiles**](docs/LocationAddressSchemeApi.md#getLocationAddressSchemeFiles) | **GET** /beta/locationAddressScheme/{locationAddressSchemeId}/file | Get the files for a locationAddressScheme.
*LocationAddressSchemeApi* | [**getLocationAddressSchemeTags**](docs/LocationAddressSchemeApi.md#getLocationAddressSchemeTags) | **GET** /beta/locationAddressScheme/{locationAddressSchemeId}/tag | Get the tags for a locationAddressScheme.
*LocationAddressSchemeApi* | [**updateLocationAddressScheme**](docs/LocationAddressSchemeApi.md#updateLocationAddressScheme) | **PUT** /beta/locationAddressScheme | Update a locationAddressScheme
*LocationAddressSchemeApi* | [**updateLocationAddressSchemeCustomFields**](docs/LocationAddressSchemeApi.md#updateLocationAddressSchemeCustomFields) | **PUT** /beta/locationAddressScheme/customFields | Update a locationAddressScheme custom fields
*LocationBillingTypeApi* | [**addLocationBillingType**](docs/LocationBillingTypeApi.md#addLocationBillingType) | **POST** /beta/locationBillingType | Create a locationBillingType
*LocationBillingTypeApi* | [**addLocationBillingTypeAudit**](docs/LocationBillingTypeApi.md#addLocationBillingTypeAudit) | **PUT** /beta/locationBillingType/{locationBillingTypeId}/audit/{locationBillingTypeAudit} | Add new audit for a locationBillingType
*LocationBillingTypeApi* | [**addLocationBillingTypeFile**](docs/LocationBillingTypeApi.md#addLocationBillingTypeFile) | **POST** /beta/locationBillingType/{locationBillingTypeId}/file/{fileName} | Attach a file to a locationBillingType
*LocationBillingTypeApi* | [**addLocationBillingTypeFileByURL**](docs/LocationBillingTypeApi.md#addLocationBillingTypeFileByURL) | **POST** /beta/locationBillingType/{locationBillingTypeId}/file | Attach a file to a locationBillingType by URL.
*LocationBillingTypeApi* | [**addLocationBillingTypeTag**](docs/LocationBillingTypeApi.md#addLocationBillingTypeTag) | **PUT** /beta/locationBillingType/{locationBillingTypeId}/tag/{locationBillingTypeTag} | Add new tags for a locationBillingType.
*LocationBillingTypeApi* | [**deleteLocationBillingType**](docs/LocationBillingTypeApi.md#deleteLocationBillingType) | **DELETE** /beta/locationBillingType/{locationBillingTypeId} | Delete a locationBillingType
*LocationBillingTypeApi* | [**deleteLocationBillingTypeFile**](docs/LocationBillingTypeApi.md#deleteLocationBillingTypeFile) | **DELETE** /beta/locationBillingType/{locationBillingTypeId}/file/{fileId} | Delete a file for a locationBillingType.
*LocationBillingTypeApi* | [**deleteLocationBillingTypeTag**](docs/LocationBillingTypeApi.md#deleteLocationBillingTypeTag) | **DELETE** /beta/locationBillingType/{locationBillingTypeId}/tag/{locationBillingTypeTag} | Delete a tag for a locationBillingType.
*LocationBillingTypeApi* | [**getDuplicateLocationBillingTypeById**](docs/LocationBillingTypeApi.md#getDuplicateLocationBillingTypeById) | **GET** /beta/locationBillingType/duplicate/{locationBillingTypeId} | Get a duplicated a locationBillingType by id
*LocationBillingTypeApi* | [**getLocationBillingTypeByFilter**](docs/LocationBillingTypeApi.md#getLocationBillingTypeByFilter) | **GET** /beta/locationBillingType/search | Search locationBillingTypes by filter
*LocationBillingTypeApi* | [**getLocationBillingTypeById**](docs/LocationBillingTypeApi.md#getLocationBillingTypeById) | **GET** /beta/locationBillingType/{locationBillingTypeId} | Get a locationBillingType by id
*LocationBillingTypeApi* | [**getLocationBillingTypeFiles**](docs/LocationBillingTypeApi.md#getLocationBillingTypeFiles) | **GET** /beta/locationBillingType/{locationBillingTypeId}/file | Get the files for a locationBillingType.
*LocationBillingTypeApi* | [**getLocationBillingTypeTags**](docs/LocationBillingTypeApi.md#getLocationBillingTypeTags) | **GET** /beta/locationBillingType/{locationBillingTypeId}/tag | Get the tags for a locationBillingType.
*LocationBillingTypeApi* | [**updateLocationBillingType**](docs/LocationBillingTypeApi.md#updateLocationBillingType) | **PUT** /beta/locationBillingType | Update a locationBillingType
*LocationBillingTypeApi* | [**updateLocationBillingTypeCustomFields**](docs/LocationBillingTypeApi.md#updateLocationBillingTypeCustomFields) | **PUT** /beta/locationBillingType/customFields | Update a locationBillingType custom fields
*LocationFootprintApi* | [**addLocationFootprint**](docs/LocationFootprintApi.md#addLocationFootprint) | **POST** /beta/locationFootprint | Create a locationFootprint
*LocationFootprintApi* | [**addLocationFootprintAudit**](docs/LocationFootprintApi.md#addLocationFootprintAudit) | **PUT** /beta/locationFootprint/{locationFootprintId}/audit/{locationFootprintAudit} | Add new audit for a locationFootprint
*LocationFootprintApi* | [**addLocationFootprintFile**](docs/LocationFootprintApi.md#addLocationFootprintFile) | **POST** /beta/locationFootprint/{locationFootprintId}/file/{fileName} | Attach a file to a locationFootprint
*LocationFootprintApi* | [**addLocationFootprintFileByURL**](docs/LocationFootprintApi.md#addLocationFootprintFileByURL) | **POST** /beta/locationFootprint/{locationFootprintId}/file | Attach a file to a locationFootprint by URL.
*LocationFootprintApi* | [**addLocationFootprintTag**](docs/LocationFootprintApi.md#addLocationFootprintTag) | **PUT** /beta/locationFootprint/{locationFootprintId}/tag/{locationFootprintTag} | Add new tags for a locationFootprint.
*LocationFootprintApi* | [**deleteLocationFootprint**](docs/LocationFootprintApi.md#deleteLocationFootprint) | **DELETE** /beta/locationFootprint/{locationFootprintId} | Delete a locationFootprint
*LocationFootprintApi* | [**deleteLocationFootprintFile**](docs/LocationFootprintApi.md#deleteLocationFootprintFile) | **DELETE** /beta/locationFootprint/{locationFootprintId}/file/{fileId} | Delete a file for a locationFootprint.
*LocationFootprintApi* | [**deleteLocationFootprintTag**](docs/LocationFootprintApi.md#deleteLocationFootprintTag) | **DELETE** /beta/locationFootprint/{locationFootprintId}/tag/{locationFootprintTag} | Delete a tag for a locationFootprint.
*LocationFootprintApi* | [**getDuplicateLocationFootprintById**](docs/LocationFootprintApi.md#getDuplicateLocationFootprintById) | **GET** /beta/locationFootprint/duplicate/{locationFootprintId} | Get a duplicated a locationFootprint by id
*LocationFootprintApi* | [**getLocationFootprintByFilter**](docs/LocationFootprintApi.md#getLocationFootprintByFilter) | **GET** /beta/locationFootprint/search | Search locationFootprints by filter
*LocationFootprintApi* | [**getLocationFootprintById**](docs/LocationFootprintApi.md#getLocationFootprintById) | **GET** /beta/locationFootprint/{locationFootprintId} | Get a locationFootprint by id
*LocationFootprintApi* | [**getLocationFootprintFiles**](docs/LocationFootprintApi.md#getLocationFootprintFiles) | **GET** /beta/locationFootprint/{locationFootprintId}/file | Get the files for a locationFootprint.
*LocationFootprintApi* | [**getLocationFootprintTags**](docs/LocationFootprintApi.md#getLocationFootprintTags) | **GET** /beta/locationFootprint/{locationFootprintId}/tag | Get the tags for a locationFootprint.
*LocationFootprintApi* | [**updateLocationFootprint**](docs/LocationFootprintApi.md#updateLocationFootprint) | **PUT** /beta/locationFootprint | Update a locationFootprint
*LocationFootprintApi* | [**updateLocationFootprintCustomFields**](docs/LocationFootprintApi.md#updateLocationFootprintCustomFields) | **PUT** /beta/locationFootprint/customFields | Update a locationFootprint custom fields
*LoggedTimeApi* | [**addLoggedTimeAudit**](docs/LoggedTimeApi.md#addLoggedTimeAudit) | **PUT** /beta/loggedTime/{loggedTimeId}/audit/{loggedTimeAudit} | Add new audit for a loggedTime
*LoggedTimeApi* | [**addLoggedTimeFile**](docs/LoggedTimeApi.md#addLoggedTimeFile) | **POST** /beta/loggedTime/{loggedTimeId}/file/{fileName} | Attach a file to a loggedTime
*LoggedTimeApi* | [**addLoggedTimeFileByURL**](docs/LoggedTimeApi.md#addLoggedTimeFileByURL) | **POST** /beta/loggedTime/{loggedTimeId}/file | Attach a file to a loggedTime by URL.
*LoggedTimeApi* | [**addLoggedTimeTag**](docs/LoggedTimeApi.md#addLoggedTimeTag) | **PUT** /beta/loggedTime/{loggedTimeId}/tag/{loggedTimeTag} | Add new tags for a loggedTime.
*LoggedTimeApi* | [**deleteLoggedTimeFile**](docs/LoggedTimeApi.md#deleteLoggedTimeFile) | **DELETE** /beta/loggedTime/{loggedTimeId}/file/{fileId} | Delete a file for a loggedTime.
*LoggedTimeApi* | [**deleteLoggedTimeTag**](docs/LoggedTimeApi.md#deleteLoggedTimeTag) | **DELETE** /beta/loggedTime/{loggedTimeId}/tag/{loggedTimeTag} | Delete a tag for a loggedTime.
*LoggedTimeApi* | [**getDuplicateLoggedTimeById**](docs/LoggedTimeApi.md#getDuplicateLoggedTimeById) | **GET** /beta/loggedTime/duplicate/{loggedTimeId} | Get a duplicated a loggedTime by id
*LoggedTimeApi* | [**getLoggedTimeByFilter**](docs/LoggedTimeApi.md#getLoggedTimeByFilter) | **GET** /beta/loggedTime/search | Search loggedTimes by filter
*LoggedTimeApi* | [**getLoggedTimeById**](docs/LoggedTimeApi.md#getLoggedTimeById) | **GET** /beta/loggedTime/{loggedTimeId} | Get a loggedTime by id
*LoggedTimeApi* | [**getLoggedTimeFiles**](docs/LoggedTimeApi.md#getLoggedTimeFiles) | **GET** /beta/loggedTime/{loggedTimeId}/file | Get the files for a loggedTime.
*LoggedTimeApi* | [**getLoggedTimeTags**](docs/LoggedTimeApi.md#getLoggedTimeTags) | **GET** /beta/loggedTime/{loggedTimeId}/tag | Get the tags for a loggedTime.
*LoggedTimeApi* | [**updateLoggedTimeCustomFields**](docs/LoggedTimeApi.md#updateLoggedTimeCustomFields) | **PUT** /beta/loggedTime/customFields | Update a loggedTime custom fields
*LoggedTimeTypeApi* | [**getLoggedTimeTypeById**](docs/LoggedTimeTypeApi.md#getLoggedTimeTypeById) | **GET** /beta/loggedTimeType/{loggedTimeTypeId} | Get a loggedTimeType by id
*LoggedTimeTypeApi* | [**getLoggedTimeTypeBySearchText**](docs/LoggedTimeTypeApi.md#getLoggedTimeTypeBySearchText) | **GET** /beta/loggedTimeType/search | Search loggedTimeTypes
*LowStockApi* | [**addLowStockAudit**](docs/LowStockApi.md#addLowStockAudit) | **PUT** /beta/lowStock/{lowStockId}/audit/{lowStockAudit} | Add new audit for a lowStock
*LowStockApi* | [**addLowStockFile**](docs/LowStockApi.md#addLowStockFile) | **POST** /beta/lowStock/{lowStockId}/file/{fileName} | Attach a file to a lowStock
*LowStockApi* | [**addLowStockFileByURL**](docs/LowStockApi.md#addLowStockFileByURL) | **POST** /beta/lowStock/{lowStockId}/file | Attach a file to a lowStock by URL.
*LowStockApi* | [**addLowStockTag**](docs/LowStockApi.md#addLowStockTag) | **PUT** /beta/lowStock/{lowStockId}/tag/{lowStockTag} | Add new tags for a lowStock.
*LowStockApi* | [**deleteLowStockFile**](docs/LowStockApi.md#deleteLowStockFile) | **DELETE** /beta/lowStock/{lowStockId}/file/{fileId} | Delete a file for a lowStock.
*LowStockApi* | [**deleteLowStockTag**](docs/LowStockApi.md#deleteLowStockTag) | **DELETE** /beta/lowStock/{lowStockId}/tag/{lowStockTag} | Delete a tag for a lowStock.
*LowStockApi* | [**getDuplicateLowStockById**](docs/LowStockApi.md#getDuplicateLowStockById) | **GET** /beta/lowStock/duplicate/{lowStockId} | Get a duplicated a lowStock by id
*LowStockApi* | [**getLowStockByFilter**](docs/LowStockApi.md#getLowStockByFilter) | **GET** /beta/lowStock/search | Search lowStocks by filter
*LowStockApi* | [**getLowStockById**](docs/LowStockApi.md#getLowStockById) | **GET** /beta/lowStock/{lowStockId} | Get a lowStock by id
*LowStockApi* | [**getLowStockFiles**](docs/LowStockApi.md#getLowStockFiles) | **GET** /beta/lowStock/{lowStockId}/file | Get the files for a lowStock.
*LowStockApi* | [**getLowStockTags**](docs/LowStockApi.md#getLowStockTags) | **GET** /beta/lowStock/{lowStockId}/tag | Get the tags for a lowStock.
*ManageScheduledPlansApi* | [**addManageScheduledPlans**](docs/ManageScheduledPlansApi.md#addManageScheduledPlans) | **POST** /beta/manageScheduledPlans | Create a manageScheduledPlans
*ManageScheduledPlansApi* | [**addManageScheduledPlansAudit**](docs/ManageScheduledPlansApi.md#addManageScheduledPlansAudit) | **PUT** /beta/manageScheduledPlans/{manageScheduledPlansId}/audit/{manageScheduledPlansAudit} | Add new audit for a manageScheduledPlans
*ManageScheduledPlansApi* | [**addManageScheduledPlansFile**](docs/ManageScheduledPlansApi.md#addManageScheduledPlansFile) | **POST** /beta/manageScheduledPlans/{manageScheduledPlansId}/file/{fileName} | Attach a file to a manageScheduledPlans
*ManageScheduledPlansApi* | [**addManageScheduledPlansFileByURL**](docs/ManageScheduledPlansApi.md#addManageScheduledPlansFileByURL) | **POST** /beta/manageScheduledPlans/{manageScheduledPlansId}/file | Attach a file to a manageScheduledPlans by URL.
*ManageScheduledPlansApi* | [**addManageScheduledPlansTag**](docs/ManageScheduledPlansApi.md#addManageScheduledPlansTag) | **PUT** /beta/manageScheduledPlans/{manageScheduledPlansId}/tag/{manageScheduledPlansTag} | Add new tags for a manageScheduledPlans.
*ManageScheduledPlansApi* | [**deleteManageScheduledPlans**](docs/ManageScheduledPlansApi.md#deleteManageScheduledPlans) | **DELETE** /beta/manageScheduledPlans/{manageScheduledPlansId} | Delete a manageScheduledPlans
*ManageScheduledPlansApi* | [**deleteManageScheduledPlansFile**](docs/ManageScheduledPlansApi.md#deleteManageScheduledPlansFile) | **DELETE** /beta/manageScheduledPlans/{manageScheduledPlansId}/file/{fileId} | Delete a file for a manageScheduledPlans.
*ManageScheduledPlansApi* | [**deleteManageScheduledPlansTag**](docs/ManageScheduledPlansApi.md#deleteManageScheduledPlansTag) | **DELETE** /beta/manageScheduledPlans/{manageScheduledPlansId}/tag/{manageScheduledPlansTag} | Delete a tag for a manageScheduledPlans.
*ManageScheduledPlansApi* | [**getDuplicateManageScheduledPlansById**](docs/ManageScheduledPlansApi.md#getDuplicateManageScheduledPlansById) | **GET** /beta/manageScheduledPlans/duplicate/{manageScheduledPlansId} | Get a duplicated a manageScheduledPlans by id
*ManageScheduledPlansApi* | [**getManageScheduledPlansByFilter**](docs/ManageScheduledPlansApi.md#getManageScheduledPlansByFilter) | **GET** /beta/manageScheduledPlans/search | Search manageScheduledPlanses by filter
*ManageScheduledPlansApi* | [**getManageScheduledPlansById**](docs/ManageScheduledPlansApi.md#getManageScheduledPlansById) | **GET** /beta/manageScheduledPlans/{manageScheduledPlansId} | Get a manageScheduledPlans by id
*ManageScheduledPlansApi* | [**getManageScheduledPlansFiles**](docs/ManageScheduledPlansApi.md#getManageScheduledPlansFiles) | **GET** /beta/manageScheduledPlans/{manageScheduledPlansId}/file | Get the files for a manageScheduledPlans.
*ManageScheduledPlansApi* | [**getManageScheduledPlansTags**](docs/ManageScheduledPlansApi.md#getManageScheduledPlansTags) | **GET** /beta/manageScheduledPlans/{manageScheduledPlansId}/tag | Get the tags for a manageScheduledPlans.
*ManageScheduledPlansApi* | [**updateManageScheduledPlans**](docs/ManageScheduledPlansApi.md#updateManageScheduledPlans) | **PUT** /beta/manageScheduledPlans | Update a manageScheduledPlans
*ManifestPartnerApi* | [**getManifestPartnerBySearchText**](docs/ManifestPartnerApi.md#getManifestPartnerBySearchText) | **GET** /beta/manifestPartner/search | Search manifestPartners
*ManifestPartnerApi* | [**getManifestSolutionProviderById**](docs/ManifestPartnerApi.md#getManifestSolutionProviderById) | **GET** /beta/manifestPartner/{manifestPartnerId} | Get a manifestPartner by id
*NonBusinessDayApi* | [**addNonBusinessDay**](docs/NonBusinessDayApi.md#addNonBusinessDay) | **POST** /beta/nonBusinessDay | Create a nonBusinessDay
*NonBusinessDayApi* | [**addNonBusinessDayAudit**](docs/NonBusinessDayApi.md#addNonBusinessDayAudit) | **PUT** /beta/nonBusinessDay/{nonBusinessDayId}/audit/{nonBusinessDayAudit} | Add new audit for a nonBusinessDay
*NonBusinessDayApi* | [**addNonBusinessDayFile**](docs/NonBusinessDayApi.md#addNonBusinessDayFile) | **POST** /beta/nonBusinessDay/{nonBusinessDayId}/file/{fileName} | Attach a file to a nonBusinessDay
*NonBusinessDayApi* | [**addNonBusinessDayFileByURL**](docs/NonBusinessDayApi.md#addNonBusinessDayFileByURL) | **POST** /beta/nonBusinessDay/{nonBusinessDayId}/file | Attach a file to a nonBusinessDay by URL.
*NonBusinessDayApi* | [**addNonBusinessDayTag**](docs/NonBusinessDayApi.md#addNonBusinessDayTag) | **PUT** /beta/nonBusinessDay/{nonBusinessDayId}/tag/{nonBusinessDayTag} | Add new tags for a nonBusinessDay.
*NonBusinessDayApi* | [**deleteNonBusinessDay**](docs/NonBusinessDayApi.md#deleteNonBusinessDay) | **DELETE** /beta/nonBusinessDay/{nonBusinessDayId} | Delete a nonBusinessDay
*NonBusinessDayApi* | [**deleteNonBusinessDayFile**](docs/NonBusinessDayApi.md#deleteNonBusinessDayFile) | **DELETE** /beta/nonBusinessDay/{nonBusinessDayId}/file/{fileId} | Delete a file for a nonBusinessDay.
*NonBusinessDayApi* | [**deleteNonBusinessDayTag**](docs/NonBusinessDayApi.md#deleteNonBusinessDayTag) | **DELETE** /beta/nonBusinessDay/{nonBusinessDayId}/tag/{nonBusinessDayTag} | Delete a tag for a nonBusinessDay.
*NonBusinessDayApi* | [**getDuplicateNonBusinessDayById**](docs/NonBusinessDayApi.md#getDuplicateNonBusinessDayById) | **GET** /beta/nonBusinessDay/duplicate/{nonBusinessDayId} | Get a duplicated a nonBusinessDay by id
*NonBusinessDayApi* | [**getNonBusinessDayByFilter**](docs/NonBusinessDayApi.md#getNonBusinessDayByFilter) | **GET** /beta/nonBusinessDay/search | Search nonBusinessDays by filter
*NonBusinessDayApi* | [**getNonBusinessDayById**](docs/NonBusinessDayApi.md#getNonBusinessDayById) | **GET** /beta/nonBusinessDay/{nonBusinessDayId} | Get a nonBusinessDay by id
*NonBusinessDayApi* | [**getNonBusinessDayFiles**](docs/NonBusinessDayApi.md#getNonBusinessDayFiles) | **GET** /beta/nonBusinessDay/{nonBusinessDayId}/file | Get the files for a nonBusinessDay.
*NonBusinessDayApi* | [**getNonBusinessDayTags**](docs/NonBusinessDayApi.md#getNonBusinessDayTags) | **GET** /beta/nonBusinessDay/{nonBusinessDayId}/tag | Get the tags for a nonBusinessDay.
*NonBusinessDayApi* | [**updateNonBusinessDay**](docs/NonBusinessDayApi.md#updateNonBusinessDay) | **PUT** /beta/nonBusinessDay | Update a nonBusinessDay
*OmsOrderApi* | [**addOmsOrder**](docs/OmsOrderApi.md#addOmsOrder) | **POST** /beta/omsOrder | Create an omsOrder
*OmsOrderApi* | [**addOmsOrderAudit**](docs/OmsOrderApi.md#addOmsOrderAudit) | **PUT** /beta/omsOrder/{omsOrderId}/audit/{omsOrderAudit} | Add new audit for an omsOrder
*OmsOrderApi* | [**addOmsOrderFile**](docs/OmsOrderApi.md#addOmsOrderFile) | **POST** /beta/omsOrder/{omsOrderId}/file/{fileName} | Attach a file to an omsOrder
*OmsOrderApi* | [**addOmsOrderFileByURL**](docs/OmsOrderApi.md#addOmsOrderFileByURL) | **POST** /beta/omsOrder/{omsOrderId}/file | Attach a file to an omsOrder by URL.
*OmsOrderApi* | [**addOmsOrderTag**](docs/OmsOrderApi.md#addOmsOrderTag) | **PUT** /beta/omsOrder/{omsOrderId}/tag/{omsOrderTag} | Add new tags for an omsOrder.
*OmsOrderApi* | [**deleteOmsOrderFile**](docs/OmsOrderApi.md#deleteOmsOrderFile) | **DELETE** /beta/omsOrder/{omsOrderId}/file/{fileId} | Delete a file for an omsOrder.
*OmsOrderApi* | [**deleteOmsOrderTag**](docs/OmsOrderApi.md#deleteOmsOrderTag) | **DELETE** /beta/omsOrder/{omsOrderId}/tag/{omsOrderTag} | Delete a tag for an omsOrder.
*OmsOrderApi* | [**getDuplicateOmsOrderById**](docs/OmsOrderApi.md#getDuplicateOmsOrderById) | **GET** /beta/omsOrder/duplicate/{omsOrderId} | Get a duplicated an omsOrder by id
*OmsOrderApi* | [**getOmsOrderByFilter**](docs/OmsOrderApi.md#getOmsOrderByFilter) | **GET** /beta/omsOrder/search | Search omsOrders by filter
*OmsOrderApi* | [**getOmsOrderById**](docs/OmsOrderApi.md#getOmsOrderById) | **GET** /beta/omsOrder/{omsOrderId} | Get an omsOrder by id
*OmsOrderApi* | [**getOmsOrderFiles**](docs/OmsOrderApi.md#getOmsOrderFiles) | **GET** /beta/omsOrder/{omsOrderId}/file | Get the files for an omsOrder.
*OmsOrderApi* | [**getOmsOrderTags**](docs/OmsOrderApi.md#getOmsOrderTags) | **GET** /beta/omsOrder/{omsOrderId}/tag | Get the tags for an omsOrder.
*OmsOrderApi* | [**updateOmsOrder**](docs/OmsOrderApi.md#updateOmsOrder) | **PUT** /beta/omsOrder | Update an omsOrder
*OmsOrderApi* | [**updateOmsOrderCustomFields**](docs/OmsOrderApi.md#updateOmsOrderCustomFields) | **PUT** /beta/omsOrder/customFields | Update an omsOrder custom fields
*OrderApi* | [**addOrder**](docs/OrderApi.md#addOrder) | **POST** /beta/order | Create an order
*OrderApi* | [**addOrderAudit**](docs/OrderApi.md#addOrderAudit) | **PUT** /beta/order/{orderId}/audit/{orderAudit} | Add new audit for an order
*OrderApi* | [**addOrderFile**](docs/OrderApi.md#addOrderFile) | **POST** /beta/order/{orderId}/file/{fileName} | Attach a file to an order
*OrderApi* | [**addOrderFileByURL**](docs/OrderApi.md#addOrderFileByURL) | **POST** /beta/order/{orderId}/file | Attach a file to an order by URL.
*OrderApi* | [**addOrderTag**](docs/OrderApi.md#addOrderTag) | **PUT** /beta/order/{orderId}/tag/{orderTag} | Add new tags for an order.
*OrderApi* | [**applyOrderWarehouseFulfillmentPlan**](docs/OrderApi.md#applyOrderWarehouseFulfillmentPlan) | **POST** /beta/order/applyOrderWarehouseFulfillmentPlan | Run the Apply Order Warehouse Fulfillment Plan method.
*OrderApi* | [**deleteOrder**](docs/OrderApi.md#deleteOrder) | **DELETE** /beta/order/{orderId} | Delete an order
*OrderApi* | [**deleteOrderFile**](docs/OrderApi.md#deleteOrderFile) | **DELETE** /beta/order/{orderId}/file/{fileId} | Delete a file for an order.
*OrderApi* | [**deleteOrderTag**](docs/OrderApi.md#deleteOrderTag) | **DELETE** /beta/order/{orderId}/tag/{orderTag} | Delete a tag for an order.
*OrderApi* | [**editFulfillmentChannel**](docs/OrderApi.md#editFulfillmentChannel) | **POST** /beta/order/editFulfillmentChannel | Run the EditLineItemFulfillmentStrategy process.
*OrderApi* | [**editLineItems**](docs/OrderApi.md#editLineItems) | **POST** /beta/order/editLineItems | Run the ReqManualSubstitution process.
*OrderApi* | [**getDuplicateOrderById**](docs/OrderApi.md#getDuplicateOrderById) | **GET** /beta/order/duplicate/{orderId} | Get a duplicated an order by id
*OrderApi* | [**getOrderByFilter**](docs/OrderApi.md#getOrderByFilter) | **GET** /beta/order/search | Search orders by filter
*OrderApi* | [**getOrderById**](docs/OrderApi.md#getOrderById) | **GET** /beta/order/{orderId} | Get an order by id
*OrderApi* | [**getOrderFiles**](docs/OrderApi.md#getOrderFiles) | **GET** /beta/order/{orderId}/file | Get the files for an order.
*OrderApi* | [**getOrderPackData**](docs/OrderApi.md#getOrderPackData) | **POST** /beta/order/getOrderPackData | Run the Get Order Pack Data method.
*OrderApi* | [**getOrderTags**](docs/OrderApi.md#getOrderTags) | **GET** /beta/order/{orderId}/tag | Get the tags for an order.
*OrderApi* | [**getOrderWarehouseFulfillmentData**](docs/OrderApi.md#getOrderWarehouseFulfillmentData) | **POST** /beta/order/getOrderWarehouseFulfillmentData | Run the Get Order Warehouse Fulfillment Plan method.
*OrderApi* | [**runFulfillmentPlan**](docs/OrderApi.md#runFulfillmentPlan) | **POST** /beta/order/runFulfillmentPlan | Run the RunFulfillmentPlan process.
*OrderApi* | [**updateOrder**](docs/OrderApi.md#updateOrder) | **PUT** /beta/order | Update an order
*OrderApi* | [**updateOrderCustomFields**](docs/OrderApi.md#updateOrderCustomFields) | **PUT** /beta/order/customFields | Update an order custom fields
*OrderActivityApi* | [**addOrderActivity**](docs/OrderActivityApi.md#addOrderActivity) | **POST** /beta/orderActivity | Create an orderActivity
*OrderActivityApi* | [**addOrderActivityAudit**](docs/OrderActivityApi.md#addOrderActivityAudit) | **PUT** /beta/orderActivity/{orderActivityId}/audit/{orderActivityAudit} | Add new audit for an orderActivity
*OrderActivityApi* | [**addOrderActivityFile**](docs/OrderActivityApi.md#addOrderActivityFile) | **POST** /beta/orderActivity/{orderActivityId}/file/{fileName} | Attach a file to an orderActivity
*OrderActivityApi* | [**addOrderActivityFileByURL**](docs/OrderActivityApi.md#addOrderActivityFileByURL) | **POST** /beta/orderActivity/{orderActivityId}/file | Attach a file to an orderActivity by URL.
*OrderActivityApi* | [**addOrderActivityTag**](docs/OrderActivityApi.md#addOrderActivityTag) | **PUT** /beta/orderActivity/{orderActivityId}/tag/{orderActivityTag} | Add new tags for an orderActivity.
*OrderActivityApi* | [**deleteOrderActivity**](docs/OrderActivityApi.md#deleteOrderActivity) | **DELETE** /beta/orderActivity/{orderActivityId} | Delete an orderActivity
*OrderActivityApi* | [**deleteOrderActivityFile**](docs/OrderActivityApi.md#deleteOrderActivityFile) | **DELETE** /beta/orderActivity/{orderActivityId}/file/{fileId} | Delete a file for an orderActivity.
*OrderActivityApi* | [**deleteOrderActivityTag**](docs/OrderActivityApi.md#deleteOrderActivityTag) | **DELETE** /beta/orderActivity/{orderActivityId}/tag/{orderActivityTag} | Delete a tag for an orderActivity.
*OrderActivityApi* | [**getDuplicateOrderActivityById**](docs/OrderActivityApi.md#getDuplicateOrderActivityById) | **GET** /beta/orderActivity/duplicate/{orderActivityId} | Get a duplicated an orderActivity by id
*OrderActivityApi* | [**getOrderActivityByFilter**](docs/OrderActivityApi.md#getOrderActivityByFilter) | **GET** /beta/orderActivity/search | Search orderActivitys by filter
*OrderActivityApi* | [**getOrderActivityById**](docs/OrderActivityApi.md#getOrderActivityById) | **GET** /beta/orderActivity/{orderActivityId} | Get an orderActivity by id
*OrderActivityApi* | [**getOrderActivityFiles**](docs/OrderActivityApi.md#getOrderActivityFiles) | **GET** /beta/orderActivity/{orderActivityId}/file | Get the files for an orderActivity.
*OrderActivityApi* | [**getOrderActivityTags**](docs/OrderActivityApi.md#getOrderActivityTags) | **GET** /beta/orderActivity/{orderActivityId}/tag | Get the tags for an orderActivity.
*OrderActivityApi* | [**updateOrderActivity**](docs/OrderActivityApi.md#updateOrderActivity) | **PUT** /beta/orderActivity | Update an orderActivity
*OrderInvoiceTemplateLineItemDescriptionEnumApi* | [**getOrderInvoiceTemplateLineItemDescriptionEnumById**](docs/OrderInvoiceTemplateLineItemDescriptionEnumApi.md#getOrderInvoiceTemplateLineItemDescriptionEnumById) | **GET** /beta/orderInvoiceTemplateLineItemDescriptionEnum/{orderInvoiceTemplateLineItemDescriptionEnumId} | Get an orderInvoiceTemplateLineItemDescriptionEnum by id
*OrderInvoiceTemplateLineItemDescriptionEnumApi* | [**getOrderInvoiceTemplateLineItemDescriptionEnumBySearchText**](docs/OrderInvoiceTemplateLineItemDescriptionEnumApi.md#getOrderInvoiceTemplateLineItemDescriptionEnumBySearchText) | **GET** /beta/orderInvoiceTemplateLineItemDescriptionEnum/search | Search orderInvoiceTemplateLineItemDescriptionEnums
*OrderLineApi* | [**addOrderLineAudit**](docs/OrderLineApi.md#addOrderLineAudit) | **PUT** /beta/orderLine/{orderLineId}/audit/{orderLineAudit} | Add new audit for an orderLine
*OrderLineApi* | [**addOrderLineFile**](docs/OrderLineApi.md#addOrderLineFile) | **POST** /beta/orderLine/{orderLineId}/file/{fileName} | Attach a file to an orderLine
*OrderLineApi* | [**addOrderLineFileByURL**](docs/OrderLineApi.md#addOrderLineFileByURL) | **POST** /beta/orderLine/{orderLineId}/file | Attach a file to an orderLine by URL.
*OrderLineApi* | [**addOrderLineTag**](docs/OrderLineApi.md#addOrderLineTag) | **PUT** /beta/orderLine/{orderLineId}/tag/{orderLineTag} | Add new tags for an orderLine.
*OrderLineApi* | [**deleteOrderLineFile**](docs/OrderLineApi.md#deleteOrderLineFile) | **DELETE** /beta/orderLine/{orderLineId}/file/{fileId} | Delete a file for an orderLine.
*OrderLineApi* | [**deleteOrderLineTag**](docs/OrderLineApi.md#deleteOrderLineTag) | **DELETE** /beta/orderLine/{orderLineId}/tag/{orderLineTag} | Delete a tag for an orderLine.
*OrderLineApi* | [**getDuplicateOrderLineById**](docs/OrderLineApi.md#getDuplicateOrderLineById) | **GET** /beta/orderLine/duplicate/{orderLineId} | Get a duplicated an orderLine by id
*OrderLineApi* | [**getOrderLineByFilter**](docs/OrderLineApi.md#getOrderLineByFilter) | **GET** /beta/orderLine/search | Search orderLines by filter
*OrderLineApi* | [**getOrderLineById**](docs/OrderLineApi.md#getOrderLineById) | **GET** /beta/orderLine/{orderLineId} | Get an orderLine by id
*OrderLineApi* | [**getOrderLineFiles**](docs/OrderLineApi.md#getOrderLineFiles) | **GET** /beta/orderLine/{orderLineId}/file | Get the files for an orderLine.
*OrderLineApi* | [**getOrderLineTags**](docs/OrderLineApi.md#getOrderLineTags) | **GET** /beta/orderLine/{orderLineId}/tag | Get the tags for an orderLine.
*OrderLineApi* | [**updateOrderLineCustomFields**](docs/OrderLineApi.md#updateOrderLineCustomFields) | **PUT** /beta/orderLine/customFields | Update an orderLine custom fields
*OrderLineActivityApi* | [**addOrderLineActivity**](docs/OrderLineActivityApi.md#addOrderLineActivity) | **POST** /beta/orderLineActivity | Create an orderLineActivity
*OrderLineActivityApi* | [**addOrderLineActivityAudit**](docs/OrderLineActivityApi.md#addOrderLineActivityAudit) | **PUT** /beta/orderLineActivity/{orderLineActivityId}/audit/{orderLineActivityAudit} | Add new audit for an orderLineActivity
*OrderLineActivityApi* | [**addOrderLineActivityFile**](docs/OrderLineActivityApi.md#addOrderLineActivityFile) | **POST** /beta/orderLineActivity/{orderLineActivityId}/file/{fileName} | Attach a file to an orderLineActivity
*OrderLineActivityApi* | [**addOrderLineActivityFileByURL**](docs/OrderLineActivityApi.md#addOrderLineActivityFileByURL) | **POST** /beta/orderLineActivity/{orderLineActivityId}/file | Attach a file to an orderLineActivity by URL.
*OrderLineActivityApi* | [**addOrderLineActivityTag**](docs/OrderLineActivityApi.md#addOrderLineActivityTag) | **PUT** /beta/orderLineActivity/{orderLineActivityId}/tag/{orderLineActivityTag} | Add new tags for an orderLineActivity.
*OrderLineActivityApi* | [**deleteOrderLineActivity**](docs/OrderLineActivityApi.md#deleteOrderLineActivity) | **DELETE** /beta/orderLineActivity/{orderLineActivityId} | Delete an orderLineActivity
*OrderLineActivityApi* | [**deleteOrderLineActivityFile**](docs/OrderLineActivityApi.md#deleteOrderLineActivityFile) | **DELETE** /beta/orderLineActivity/{orderLineActivityId}/file/{fileId} | Delete a file for an orderLineActivity.
*OrderLineActivityApi* | [**deleteOrderLineActivityTag**](docs/OrderLineActivityApi.md#deleteOrderLineActivityTag) | **DELETE** /beta/orderLineActivity/{orderLineActivityId}/tag/{orderLineActivityTag} | Delete a tag for an orderLineActivity.
*OrderLineActivityApi* | [**getDuplicateOrderLineActivityById**](docs/OrderLineActivityApi.md#getDuplicateOrderLineActivityById) | **GET** /beta/orderLineActivity/duplicate/{orderLineActivityId} | Get a duplicated an orderLineActivity by id
*OrderLineActivityApi* | [**getOrderLineActivityByFilter**](docs/OrderLineActivityApi.md#getOrderLineActivityByFilter) | **GET** /beta/orderLineActivity/search | Search orderLineActivitys by filter
*OrderLineActivityApi* | [**getOrderLineActivityById**](docs/OrderLineActivityApi.md#getOrderLineActivityById) | **GET** /beta/orderLineActivity/{orderLineActivityId} | Get an orderLineActivity by id
*OrderLineActivityApi* | [**getOrderLineActivityFiles**](docs/OrderLineActivityApi.md#getOrderLineActivityFiles) | **GET** /beta/orderLineActivity/{orderLineActivityId}/file | Get the files for an orderLineActivity.
*OrderLineActivityApi* | [**getOrderLineActivityTags**](docs/OrderLineActivityApi.md#getOrderLineActivityTags) | **GET** /beta/orderLineActivity/{orderLineActivityId}/tag | Get the tags for an orderLineActivity.
*OrderLineActivityApi* | [**updateOrderLineActivity**](docs/OrderLineActivityApi.md#updateOrderLineActivity) | **PUT** /beta/orderLineActivity | Update an orderLineActivity
*OrderLoadProgramApi* | [**getOrderLoadProgramBySearchText**](docs/OrderLoadProgramApi.md#getOrderLoadProgramBySearchText) | **GET** /beta/orderLoadProgram/search | Search orderLoadPrograms
*OrderLoadProgramApi* | [**getReqLoadProgramById**](docs/OrderLoadProgramApi.md#getReqLoadProgramById) | **GET** /beta/orderLoadProgram/{orderLoadProgramId} | Get an orderLoadProgram by id
*OrderSourceApi* | [**addOrderSource**](docs/OrderSourceApi.md#addOrderSource) | **POST** /beta/orderSource | Create an orderSource
*OrderSourceApi* | [**addOrderSourceAudit**](docs/OrderSourceApi.md#addOrderSourceAudit) | **PUT** /beta/orderSource/{orderSourceId}/audit/{orderSourceAudit} | Add new audit for an orderSource
*OrderSourceApi* | [**addOrderSourceFile**](docs/OrderSourceApi.md#addOrderSourceFile) | **POST** /beta/orderSource/{orderSourceId}/file/{fileName} | Attach a file to an orderSource
*OrderSourceApi* | [**addOrderSourceFileByURL**](docs/OrderSourceApi.md#addOrderSourceFileByURL) | **POST** /beta/orderSource/{orderSourceId}/file | Attach a file to an orderSource by URL.
*OrderSourceApi* | [**addOrderSourceTag**](docs/OrderSourceApi.md#addOrderSourceTag) | **PUT** /beta/orderSource/{orderSourceId}/tag/{orderSourceTag} | Add new tags for an orderSource.
*OrderSourceApi* | [**deleteOrderSource**](docs/OrderSourceApi.md#deleteOrderSource) | **DELETE** /beta/orderSource/{orderSourceId} | Delete an orderSource
*OrderSourceApi* | [**deleteOrderSourceFile**](docs/OrderSourceApi.md#deleteOrderSourceFile) | **DELETE** /beta/orderSource/{orderSourceId}/file/{fileId} | Delete a file for an orderSource.
*OrderSourceApi* | [**deleteOrderSourceTag**](docs/OrderSourceApi.md#deleteOrderSourceTag) | **DELETE** /beta/orderSource/{orderSourceId}/tag/{orderSourceTag} | Delete a tag for an orderSource.
*OrderSourceApi* | [**getDuplicateOrderSourceById**](docs/OrderSourceApi.md#getDuplicateOrderSourceById) | **GET** /beta/orderSource/duplicate/{orderSourceId} | Get a duplicated an orderSource by id
*OrderSourceApi* | [**getOrderSourceByFilter**](docs/OrderSourceApi.md#getOrderSourceByFilter) | **GET** /beta/orderSource/search | Search orderSources by filter
*OrderSourceApi* | [**getOrderSourceById**](docs/OrderSourceApi.md#getOrderSourceById) | **GET** /beta/orderSource/{orderSourceId} | Get an orderSource by id
*OrderSourceApi* | [**getOrderSourceFiles**](docs/OrderSourceApi.md#getOrderSourceFiles) | **GET** /beta/orderSource/{orderSourceId}/file | Get the files for an orderSource.
*OrderSourceApi* | [**getOrderSourceTags**](docs/OrderSourceApi.md#getOrderSourceTags) | **GET** /beta/orderSource/{orderSourceId}/tag | Get the tags for an orderSource.
*OrderSourceApi* | [**updateOrderSource**](docs/OrderSourceApi.md#updateOrderSource) | **PUT** /beta/orderSource | Update an orderSource
*OrderSourceApi* | [**updateOrderSourceCustomFields**](docs/OrderSourceApi.md#updateOrderSourceCustomFields) | **PUT** /beta/orderSource/customFields | Update an orderSource custom fields
*OrderSourceItemSetupApi* | [**addOrderSourceItemSetup**](docs/OrderSourceItemSetupApi.md#addOrderSourceItemSetup) | **POST** /beta/orderSourceItemSetup | Create an orderSourceItemSetup
*OrderSourceItemSetupApi* | [**addOrderSourceItemSetupAudit**](docs/OrderSourceItemSetupApi.md#addOrderSourceItemSetupAudit) | **PUT** /beta/orderSourceItemSetup/{orderSourceItemSetupId}/audit/{orderSourceItemSetupAudit} | Add new audit for an orderSourceItemSetup
*OrderSourceItemSetupApi* | [**addOrderSourceItemSetupFile**](docs/OrderSourceItemSetupApi.md#addOrderSourceItemSetupFile) | **POST** /beta/orderSourceItemSetup/{orderSourceItemSetupId}/file/{fileName} | Attach a file to an orderSourceItemSetup
*OrderSourceItemSetupApi* | [**addOrderSourceItemSetupFileByURL**](docs/OrderSourceItemSetupApi.md#addOrderSourceItemSetupFileByURL) | **POST** /beta/orderSourceItemSetup/{orderSourceItemSetupId}/file | Attach a file to an orderSourceItemSetup by URL.
*OrderSourceItemSetupApi* | [**addOrderSourceItemSetupTag**](docs/OrderSourceItemSetupApi.md#addOrderSourceItemSetupTag) | **PUT** /beta/orderSourceItemSetup/{orderSourceItemSetupId}/tag/{orderSourceItemSetupTag} | Add new tags for an orderSourceItemSetup.
*OrderSourceItemSetupApi* | [**deleteOrderSourceItemSetup**](docs/OrderSourceItemSetupApi.md#deleteOrderSourceItemSetup) | **DELETE** /beta/orderSourceItemSetup/{orderSourceItemSetupId} | Delete an orderSourceItemSetup
*OrderSourceItemSetupApi* | [**deleteOrderSourceItemSetupFile**](docs/OrderSourceItemSetupApi.md#deleteOrderSourceItemSetupFile) | **DELETE** /beta/orderSourceItemSetup/{orderSourceItemSetupId}/file/{fileId} | Delete a file for an orderSourceItemSetup.
*OrderSourceItemSetupApi* | [**deleteOrderSourceItemSetupTag**](docs/OrderSourceItemSetupApi.md#deleteOrderSourceItemSetupTag) | **DELETE** /beta/orderSourceItemSetup/{orderSourceItemSetupId}/tag/{orderSourceItemSetupTag} | Delete a tag for an orderSourceItemSetup.
*OrderSourceItemSetupApi* | [**getDuplicateOrderSourceItemSetupById**](docs/OrderSourceItemSetupApi.md#getDuplicateOrderSourceItemSetupById) | **GET** /beta/orderSourceItemSetup/duplicate/{orderSourceItemSetupId} | Get a duplicated an orderSourceItemSetup by id
*OrderSourceItemSetupApi* | [**getOrderSourceItemSetupByFilter**](docs/OrderSourceItemSetupApi.md#getOrderSourceItemSetupByFilter) | **GET** /beta/orderSourceItemSetup/search | Search orderSourceItemSetups by filter
*OrderSourceItemSetupApi* | [**getOrderSourceItemSetupById**](docs/OrderSourceItemSetupApi.md#getOrderSourceItemSetupById) | **GET** /beta/orderSourceItemSetup/{orderSourceItemSetupId} | Get an orderSourceItemSetup by id
*OrderSourceItemSetupApi* | [**getOrderSourceItemSetupFiles**](docs/OrderSourceItemSetupApi.md#getOrderSourceItemSetupFiles) | **GET** /beta/orderSourceItemSetup/{orderSourceItemSetupId}/file | Get the files for an orderSourceItemSetup.
*OrderSourceItemSetupApi* | [**getOrderSourceItemSetupTags**](docs/OrderSourceItemSetupApi.md#getOrderSourceItemSetupTags) | **GET** /beta/orderSourceItemSetup/{orderSourceItemSetupId}/tag | Get the tags for an orderSourceItemSetup.
*OrderSourceItemSetupApi* | [**updateOrderSourceItemSetup**](docs/OrderSourceItemSetupApi.md#updateOrderSourceItemSetup) | **PUT** /beta/orderSourceItemSetup | Update an orderSourceItemSetup
*OrderSourceItemSetupApi* | [**updateOrderSourceItemSetupCustomFields**](docs/OrderSourceItemSetupApi.md#updateOrderSourceItemSetupCustomFields) | **PUT** /beta/orderSourceItemSetup/customFields | Update an orderSourceItemSetup custom fields
*OrderSourceReservationApi* | [**addOrderSourceReservation**](docs/OrderSourceReservationApi.md#addOrderSourceReservation) | **POST** /beta/orderSourceReservation | Create an orderSourceReservation
*OrderSourceReservationApi* | [**addOrderSourceReservationAudit**](docs/OrderSourceReservationApi.md#addOrderSourceReservationAudit) | **PUT** /beta/orderSourceReservation/{orderSourceReservationId}/audit/{orderSourceReservationAudit} | Add new audit for an orderSourceReservation
*OrderSourceReservationApi* | [**addOrderSourceReservationFile**](docs/OrderSourceReservationApi.md#addOrderSourceReservationFile) | **POST** /beta/orderSourceReservation/{orderSourceReservationId}/file/{fileName} | Attach a file to an orderSourceReservation
*OrderSourceReservationApi* | [**addOrderSourceReservationFileByURL**](docs/OrderSourceReservationApi.md#addOrderSourceReservationFileByURL) | **POST** /beta/orderSourceReservation/{orderSourceReservationId}/file | Attach a file to an orderSourceReservation by URL.
*OrderSourceReservationApi* | [**addOrderSourceReservationTag**](docs/OrderSourceReservationApi.md#addOrderSourceReservationTag) | **PUT** /beta/orderSourceReservation/{orderSourceReservationId}/tag/{orderSourceReservationTag} | Add new tags for an orderSourceReservation.
*OrderSourceReservationApi* | [**deleteOrderSourceReservation**](docs/OrderSourceReservationApi.md#deleteOrderSourceReservation) | **DELETE** /beta/orderSourceReservation/{orderSourceReservationId} | Delete an orderSourceReservation
*OrderSourceReservationApi* | [**deleteOrderSourceReservationFile**](docs/OrderSourceReservationApi.md#deleteOrderSourceReservationFile) | **DELETE** /beta/orderSourceReservation/{orderSourceReservationId}/file/{fileId} | Delete a file for an orderSourceReservation.
*OrderSourceReservationApi* | [**deleteOrderSourceReservationTag**](docs/OrderSourceReservationApi.md#deleteOrderSourceReservationTag) | **DELETE** /beta/orderSourceReservation/{orderSourceReservationId}/tag/{orderSourceReservationTag} | Delete a tag for an orderSourceReservation.
*OrderSourceReservationApi* | [**getDuplicateOrderSourceReservationById**](docs/OrderSourceReservationApi.md#getDuplicateOrderSourceReservationById) | **GET** /beta/orderSourceReservation/duplicate/{orderSourceReservationId} | Get a duplicated an orderSourceReservation by id
*OrderSourceReservationApi* | [**getOrderSourceReservationByFilter**](docs/OrderSourceReservationApi.md#getOrderSourceReservationByFilter) | **GET** /beta/orderSourceReservation/search | Search orderSourceReservations by filter
*OrderSourceReservationApi* | [**getOrderSourceReservationById**](docs/OrderSourceReservationApi.md#getOrderSourceReservationById) | **GET** /beta/orderSourceReservation/{orderSourceReservationId} | Get an orderSourceReservation by id
*OrderSourceReservationApi* | [**getOrderSourceReservationFiles**](docs/OrderSourceReservationApi.md#getOrderSourceReservationFiles) | **GET** /beta/orderSourceReservation/{orderSourceReservationId}/file | Get the files for an orderSourceReservation.
*OrderSourceReservationApi* | [**getOrderSourceReservationTags**](docs/OrderSourceReservationApi.md#getOrderSourceReservationTags) | **GET** /beta/orderSourceReservation/{orderSourceReservationId}/tag | Get the tags for an orderSourceReservation.
*OrderSourceReservationApi* | [**updateOrderSourceReservation**](docs/OrderSourceReservationApi.md#updateOrderSourceReservation) | **PUT** /beta/orderSourceReservation | Update an orderSourceReservation
*OrderSourceReservationApi* | [**updateOrderSourceReservationCustomFields**](docs/OrderSourceReservationApi.md#updateOrderSourceReservationCustomFields) | **PUT** /beta/orderSourceReservation/customFields | Update an orderSourceReservation custom fields
*OrderSourceStockStatusApi* | [**addOrderSourceStockStatusAudit**](docs/OrderSourceStockStatusApi.md#addOrderSourceStockStatusAudit) | **PUT** /beta/orderSourceStockStatus/{orderSourceStockStatusId}/audit/{orderSourceStockStatusAudit} | Add new audit for an orderSourceStockStatus
*OrderSourceStockStatusApi* | [**addOrderSourceStockStatusFile**](docs/OrderSourceStockStatusApi.md#addOrderSourceStockStatusFile) | **POST** /beta/orderSourceStockStatus/{orderSourceStockStatusId}/file/{fileName} | Attach a file to an orderSourceStockStatus
*OrderSourceStockStatusApi* | [**addOrderSourceStockStatusFileByURL**](docs/OrderSourceStockStatusApi.md#addOrderSourceStockStatusFileByURL) | **POST** /beta/orderSourceStockStatus/{orderSourceStockStatusId}/file | Attach a file to an orderSourceStockStatus by URL.
*OrderSourceStockStatusApi* | [**addOrderSourceStockStatusTag**](docs/OrderSourceStockStatusApi.md#addOrderSourceStockStatusTag) | **PUT** /beta/orderSourceStockStatus/{orderSourceStockStatusId}/tag/{orderSourceStockStatusTag} | Add new tags for an orderSourceStockStatus.
*OrderSourceStockStatusApi* | [**deleteOrderSourceStockStatusFile**](docs/OrderSourceStockStatusApi.md#deleteOrderSourceStockStatusFile) | **DELETE** /beta/orderSourceStockStatus/{orderSourceStockStatusId}/file/{fileId} | Delete a file for an orderSourceStockStatus.
*OrderSourceStockStatusApi* | [**deleteOrderSourceStockStatusTag**](docs/OrderSourceStockStatusApi.md#deleteOrderSourceStockStatusTag) | **DELETE** /beta/orderSourceStockStatus/{orderSourceStockStatusId}/tag/{orderSourceStockStatusTag} | Delete a tag for an orderSourceStockStatus.
*OrderSourceStockStatusApi* | [**getDuplicateOrderSourceStockStatusById**](docs/OrderSourceStockStatusApi.md#getDuplicateOrderSourceStockStatusById) | **GET** /beta/orderSourceStockStatus/duplicate/{orderSourceStockStatusId} | Get a duplicated an orderSourceStockStatus by id
*OrderSourceStockStatusApi* | [**getOrderSourceStockStatusByFilter**](docs/OrderSourceStockStatusApi.md#getOrderSourceStockStatusByFilter) | **GET** /beta/orderSourceStockStatus/search | Search orderSourceStockStatuses by filter
*OrderSourceStockStatusApi* | [**getOrderSourceStockStatusById**](docs/OrderSourceStockStatusApi.md#getOrderSourceStockStatusById) | **GET** /beta/orderSourceStockStatus/{orderSourceStockStatusId} | Get an orderSourceStockStatus by id
*OrderSourceStockStatusApi* | [**getOrderSourceStockStatusFiles**](docs/OrderSourceStockStatusApi.md#getOrderSourceStockStatusFiles) | **GET** /beta/orderSourceStockStatus/{orderSourceStockStatusId}/file | Get the files for an orderSourceStockStatus.
*OrderSourceStockStatusApi* | [**getOrderSourceStockStatusTags**](docs/OrderSourceStockStatusApi.md#getOrderSourceStockStatusTags) | **GET** /beta/orderSourceStockStatus/{orderSourceStockStatusId}/tag | Get the tags for an orderSourceStockStatus.
*OverrideReturnAddressApi* | [**addOverrideReturnAddress**](docs/OverrideReturnAddressApi.md#addOverrideReturnAddress) | **POST** /beta/overrideReturnAddress | Create an overrideReturnAddress
*OverrideReturnAddressApi* | [**addOverrideReturnAddressAudit**](docs/OverrideReturnAddressApi.md#addOverrideReturnAddressAudit) | **PUT** /beta/overrideReturnAddress/{overrideReturnAddressId}/audit/{overrideReturnAddressAudit} | Add new audit for an overrideReturnAddress
*OverrideReturnAddressApi* | [**addOverrideReturnAddressFile**](docs/OverrideReturnAddressApi.md#addOverrideReturnAddressFile) | **POST** /beta/overrideReturnAddress/{overrideReturnAddressId}/file/{fileName} | Attach a file to an overrideReturnAddress
*OverrideReturnAddressApi* | [**addOverrideReturnAddressFileByURL**](docs/OverrideReturnAddressApi.md#addOverrideReturnAddressFileByURL) | **POST** /beta/overrideReturnAddress/{overrideReturnAddressId}/file | Attach a file to an overrideReturnAddress by URL.
*OverrideReturnAddressApi* | [**addOverrideReturnAddressTag**](docs/OverrideReturnAddressApi.md#addOverrideReturnAddressTag) | **PUT** /beta/overrideReturnAddress/{overrideReturnAddressId}/tag/{overrideReturnAddressTag} | Add new tags for an overrideReturnAddress.
*OverrideReturnAddressApi* | [**deleteOverrideReturnAddress**](docs/OverrideReturnAddressApi.md#deleteOverrideReturnAddress) | **DELETE** /beta/overrideReturnAddress/{overrideReturnAddressId} | Delete an overrideReturnAddress
*OverrideReturnAddressApi* | [**deleteOverrideReturnAddressFile**](docs/OverrideReturnAddressApi.md#deleteOverrideReturnAddressFile) | **DELETE** /beta/overrideReturnAddress/{overrideReturnAddressId}/file/{fileId} | Delete a file for an overrideReturnAddress.
*OverrideReturnAddressApi* | [**deleteOverrideReturnAddressTag**](docs/OverrideReturnAddressApi.md#deleteOverrideReturnAddressTag) | **DELETE** /beta/overrideReturnAddress/{overrideReturnAddressId}/tag/{overrideReturnAddressTag} | Delete a tag for an overrideReturnAddress.
*OverrideReturnAddressApi* | [**getDuplicateOverrideReturnAddressById**](docs/OverrideReturnAddressApi.md#getDuplicateOverrideReturnAddressById) | **GET** /beta/overrideReturnAddress/duplicate/{overrideReturnAddressId} | Get a duplicated an overrideReturnAddress by id
*OverrideReturnAddressApi* | [**getOverrideReturnAddressByFilter**](docs/OverrideReturnAddressApi.md#getOverrideReturnAddressByFilter) | **GET** /beta/overrideReturnAddress/search | Search overrideReturnAddresses by filter
*OverrideReturnAddressApi* | [**getOverrideReturnAddressById**](docs/OverrideReturnAddressApi.md#getOverrideReturnAddressById) | **GET** /beta/overrideReturnAddress/{overrideReturnAddressId} | Get an overrideReturnAddress by id
*OverrideReturnAddressApi* | [**getOverrideReturnAddressFiles**](docs/OverrideReturnAddressApi.md#getOverrideReturnAddressFiles) | **GET** /beta/overrideReturnAddress/{overrideReturnAddressId}/file | Get the files for an overrideReturnAddress.
*OverrideReturnAddressApi* | [**getOverrideReturnAddressTags**](docs/OverrideReturnAddressApi.md#getOverrideReturnAddressTags) | **GET** /beta/overrideReturnAddress/{overrideReturnAddressId}/tag | Get the tags for an overrideReturnAddress.
*OverrideReturnAddressApi* | [**updateOverrideReturnAddress**](docs/OverrideReturnAddressApi.md#updateOverrideReturnAddress) | **PUT** /beta/overrideReturnAddress | Update an overrideReturnAddress
*OverrideReturnAddressApi* | [**updateOverrideReturnAddressCustomFields**](docs/OverrideReturnAddressApi.md#updateOverrideReturnAddressCustomFields) | **PUT** /beta/overrideReturnAddress/customFields | Update an overrideReturnAddress custom fields
*PackingDetailApi* | [**addPackingDetailAudit**](docs/PackingDetailApi.md#addPackingDetailAudit) | **PUT** /beta/packingDetail/{packingDetailId}/audit/{packingDetailAudit} | Add new audit for a packingDetail
*PackingDetailApi* | [**addPackingDetailFile**](docs/PackingDetailApi.md#addPackingDetailFile) | **POST** /beta/packingDetail/{packingDetailId}/file/{fileName} | Attach a file to a packingDetail
*PackingDetailApi* | [**addPackingDetailFileByURL**](docs/PackingDetailApi.md#addPackingDetailFileByURL) | **POST** /beta/packingDetail/{packingDetailId}/file | Attach a file to a packingDetail by URL.
*PackingDetailApi* | [**addPackingDetailTag**](docs/PackingDetailApi.md#addPackingDetailTag) | **PUT** /beta/packingDetail/{packingDetailId}/tag/{packingDetailTag} | Add new tags for a packingDetail.
*PackingDetailApi* | [**deletePackingDetailFile**](docs/PackingDetailApi.md#deletePackingDetailFile) | **DELETE** /beta/packingDetail/{packingDetailId}/file/{fileId} | Delete a file for a packingDetail.
*PackingDetailApi* | [**deletePackingDetailTag**](docs/PackingDetailApi.md#deletePackingDetailTag) | **DELETE** /beta/packingDetail/{packingDetailId}/tag/{packingDetailTag} | Delete a tag for a packingDetail.
*PackingDetailApi* | [**getDuplicatePackingDetailById**](docs/PackingDetailApi.md#getDuplicatePackingDetailById) | **GET** /beta/packingDetail/duplicate/{packingDetailId} | Get a duplicated a packingDetail by id
*PackingDetailApi* | [**getPackingDetailByFilter**](docs/PackingDetailApi.md#getPackingDetailByFilter) | **GET** /beta/packingDetail/search | Search packingDetails by filter
*PackingDetailApi* | [**getPackingDetailById**](docs/PackingDetailApi.md#getPackingDetailById) | **GET** /beta/packingDetail/{packingDetailId} | Get a packingDetail by id
*PackingDetailApi* | [**getPackingDetailFiles**](docs/PackingDetailApi.md#getPackingDetailFiles) | **GET** /beta/packingDetail/{packingDetailId}/file | Get the files for a packingDetail.
*PackingDetailApi* | [**getPackingDetailTags**](docs/PackingDetailApi.md#getPackingDetailTags) | **GET** /beta/packingDetail/{packingDetailId}/tag | Get the tags for a packingDetail.
*PackingDetailApi* | [**updatePackingDetailCustomFields**](docs/PackingDetailApi.md#updatePackingDetailCustomFields) | **PUT** /beta/packingDetail/customFields | Update a packingDetail custom fields
*PackingPlanApi* | [**addPackingPlan**](docs/PackingPlanApi.md#addPackingPlan) | **POST** /beta/packingPlan | Create a packingPlan
*PackingPlanApi* | [**addPackingPlanAudit**](docs/PackingPlanApi.md#addPackingPlanAudit) | **PUT** /beta/packingPlan/{packingPlanId}/audit/{packingPlanAudit} | Add new audit for a packingPlan
*PackingPlanApi* | [**addPackingPlanFile**](docs/PackingPlanApi.md#addPackingPlanFile) | **POST** /beta/packingPlan/{packingPlanId}/file/{fileName} | Attach a file to a packingPlan
*PackingPlanApi* | [**addPackingPlanFileByURL**](docs/PackingPlanApi.md#addPackingPlanFileByURL) | **POST** /beta/packingPlan/{packingPlanId}/file | Attach a file to a packingPlan by URL.
*PackingPlanApi* | [**addPackingPlanTag**](docs/PackingPlanApi.md#addPackingPlanTag) | **PUT** /beta/packingPlan/{packingPlanId}/tag/{packingPlanTag} | Add new tags for a packingPlan.
*PackingPlanApi* | [**deletePackingPlan**](docs/PackingPlanApi.md#deletePackingPlan) | **DELETE** /beta/packingPlan/{packingPlanId} | Delete a packingPlan
*PackingPlanApi* | [**deletePackingPlanFile**](docs/PackingPlanApi.md#deletePackingPlanFile) | **DELETE** /beta/packingPlan/{packingPlanId}/file/{fileId} | Delete a file for a packingPlan.
*PackingPlanApi* | [**deletePackingPlanTag**](docs/PackingPlanApi.md#deletePackingPlanTag) | **DELETE** /beta/packingPlan/{packingPlanId}/tag/{packingPlanTag} | Delete a tag for a packingPlan.
*PackingPlanApi* | [**getDuplicatePackingPlanById**](docs/PackingPlanApi.md#getDuplicatePackingPlanById) | **GET** /beta/packingPlan/duplicate/{packingPlanId} | Get a duplicated a packingPlan by id
*PackingPlanApi* | [**getPackingPlanByFilter**](docs/PackingPlanApi.md#getPackingPlanByFilter) | **GET** /beta/packingPlan/search | Search packingPlans by filter
*PackingPlanApi* | [**getPackingPlanById**](docs/PackingPlanApi.md#getPackingPlanById) | **GET** /beta/packingPlan/{packingPlanId} | Get a packingPlan by id
*PackingPlanApi* | [**getPackingPlanFiles**](docs/PackingPlanApi.md#getPackingPlanFiles) | **GET** /beta/packingPlan/{packingPlanId}/file | Get the files for a packingPlan.
*PackingPlanApi* | [**getPackingPlanTags**](docs/PackingPlanApi.md#getPackingPlanTags) | **GET** /beta/packingPlan/{packingPlanId}/tag | Get the tags for a packingPlan.
*PackingPlanApi* | [**updatePackingPlan**](docs/PackingPlanApi.md#updatePackingPlan) | **PUT** /beta/packingPlan | Update a packingPlan
*PackingPlanApi* | [**updatePackingPlanCustomFields**](docs/PackingPlanApi.md#updatePackingPlanCustomFields) | **PUT** /beta/packingPlan/customFields | Update a packingPlan custom fields
*PackingPlanDetailApi* | [**addPackingPlanDetailAudit**](docs/PackingPlanDetailApi.md#addPackingPlanDetailAudit) | **PUT** /beta/packingPlanDetail/{packingPlanDetailId}/audit/{packingPlanDetailAudit} | Add new audit for a packingPlanDetail
*PackingPlanDetailApi* | [**addPackingPlanDetailFile**](docs/PackingPlanDetailApi.md#addPackingPlanDetailFile) | **POST** /beta/packingPlanDetail/{packingPlanDetailId}/file/{fileName} | Attach a file to a packingPlanDetail
*PackingPlanDetailApi* | [**addPackingPlanDetailFileByURL**](docs/PackingPlanDetailApi.md#addPackingPlanDetailFileByURL) | **POST** /beta/packingPlanDetail/{packingPlanDetailId}/file | Attach a file to a packingPlanDetail by URL.
*PackingPlanDetailApi* | [**addPackingPlanDetailTag**](docs/PackingPlanDetailApi.md#addPackingPlanDetailTag) | **PUT** /beta/packingPlanDetail/{packingPlanDetailId}/tag/{packingPlanDetailTag} | Add new tags for a packingPlanDetail.
*PackingPlanDetailApi* | [**deletePackingPlanDetailFile**](docs/PackingPlanDetailApi.md#deletePackingPlanDetailFile) | **DELETE** /beta/packingPlanDetail/{packingPlanDetailId}/file/{fileId} | Delete a file for a packingPlanDetail.
*PackingPlanDetailApi* | [**deletePackingPlanDetailTag**](docs/PackingPlanDetailApi.md#deletePackingPlanDetailTag) | **DELETE** /beta/packingPlanDetail/{packingPlanDetailId}/tag/{packingPlanDetailTag} | Delete a tag for a packingPlanDetail.
*PackingPlanDetailApi* | [**getDuplicatePackingPlanDetailById**](docs/PackingPlanDetailApi.md#getDuplicatePackingPlanDetailById) | **GET** /beta/packingPlanDetail/duplicate/{packingPlanDetailId} | Get a duplicated a packingPlanDetail by id
*PackingPlanDetailApi* | [**getPackingPlanDetailByFilter**](docs/PackingPlanDetailApi.md#getPackingPlanDetailByFilter) | **GET** /beta/packingPlanDetail/search | Search packingPlanDetails by filter
*PackingPlanDetailApi* | [**getPackingPlanDetailById**](docs/PackingPlanDetailApi.md#getPackingPlanDetailById) | **GET** /beta/packingPlanDetail/{packingPlanDetailId} | Get a packingPlanDetail by id
*PackingPlanDetailApi* | [**getPackingPlanDetailFiles**](docs/PackingPlanDetailApi.md#getPackingPlanDetailFiles) | **GET** /beta/packingPlanDetail/{packingPlanDetailId}/file | Get the files for a packingPlanDetail.
*PackingPlanDetailApi* | [**getPackingPlanDetailTags**](docs/PackingPlanDetailApi.md#getPackingPlanDetailTags) | **GET** /beta/packingPlanDetail/{packingPlanDetailId}/tag | Get the tags for a packingPlanDetail.
*PackingPlanDetailApi* | [**updatePackingPlanDetailCustomFields**](docs/PackingPlanDetailApi.md#updatePackingPlanDetailCustomFields) | **PUT** /beta/packingPlanDetail/customFields | Update a packingPlanDetail custom fields
*PackingSlipTemplateLineExtraDataEnumApi* | [**getPackingSlipTemplateLineExtraDataEnumById**](docs/PackingSlipTemplateLineExtraDataEnumApi.md#getPackingSlipTemplateLineExtraDataEnumById) | **GET** /beta/packingSlipTemplateLineExtraDataEnum/{packingSlipTemplateLineExtraDataEnumId} | Get a packingSlipTemplateLineExtraDataEnum by id
*PackingSlipTemplateLineExtraDataEnumApi* | [**getPackingSlipTemplateLineExtraDataEnumBySearchText**](docs/PackingSlipTemplateLineExtraDataEnumApi.md#getPackingSlipTemplateLineExtraDataEnumBySearchText) | **GET** /beta/packingSlipTemplateLineExtraDataEnum/search | Search packingSlipTemplateLineExtraDataEnums
*PackingSlipTemplateLineItemDescriptionEnumApi* | [**getPackingSlipTemplateLineItemDescriptionEnumById**](docs/PackingSlipTemplateLineItemDescriptionEnumApi.md#getPackingSlipTemplateLineItemDescriptionEnumById) | **GET** /beta/packingSlipTemplateLineItemDescriptionEnum/{packingSlipTemplateLineItemDescriptionEnumId} | Get a packingSlipTemplateLineItemDescriptionEnum by id
*PackingSlipTemplateLineItemDescriptionEnumApi* | [**getPackingSlipTemplateLineItemDescriptionEnumBySearchText**](docs/PackingSlipTemplateLineItemDescriptionEnumApi.md#getPackingSlipTemplateLineItemDescriptionEnumBySearchText) | **GET** /beta/packingSlipTemplateLineItemDescriptionEnum/search | Search packingSlipTemplateLineItemDescriptionEnums
*PalletTypeApi* | [**addPalletType**](docs/PalletTypeApi.md#addPalletType) | **POST** /beta/palletType | Create a palletType
*PalletTypeApi* | [**addPalletTypeAudit**](docs/PalletTypeApi.md#addPalletTypeAudit) | **PUT** /beta/palletType/{palletTypeId}/audit/{palletTypeAudit} | Add new audit for a palletType
*PalletTypeApi* | [**addPalletTypeFile**](docs/PalletTypeApi.md#addPalletTypeFile) | **POST** /beta/palletType/{palletTypeId}/file/{fileName} | Attach a file to a palletType
*PalletTypeApi* | [**addPalletTypeFileByURL**](docs/PalletTypeApi.md#addPalletTypeFileByURL) | **POST** /beta/palletType/{palletTypeId}/file | Attach a file to a palletType by URL.
*PalletTypeApi* | [**addPalletTypeTag**](docs/PalletTypeApi.md#addPalletTypeTag) | **PUT** /beta/palletType/{palletTypeId}/tag/{palletTypeTag} | Add new tags for a palletType.
*PalletTypeApi* | [**deletePalletType**](docs/PalletTypeApi.md#deletePalletType) | **DELETE** /beta/palletType/{palletTypeId} | Delete a palletType
*PalletTypeApi* | [**deletePalletTypeFile**](docs/PalletTypeApi.md#deletePalletTypeFile) | **DELETE** /beta/palletType/{palletTypeId}/file/{fileId} | Delete a file for a palletType.
*PalletTypeApi* | [**deletePalletTypeTag**](docs/PalletTypeApi.md#deletePalletTypeTag) | **DELETE** /beta/palletType/{palletTypeId}/tag/{palletTypeTag} | Delete a tag for a palletType.
*PalletTypeApi* | [**getDuplicatePalletTypeById**](docs/PalletTypeApi.md#getDuplicatePalletTypeById) | **GET** /beta/palletType/duplicate/{palletTypeId} | Get a duplicated a palletType by id
*PalletTypeApi* | [**getPalletTypeByFilter**](docs/PalletTypeApi.md#getPalletTypeByFilter) | **GET** /beta/palletType/search | Search palletTypes by filter
*PalletTypeApi* | [**getPalletTypeById**](docs/PalletTypeApi.md#getPalletTypeById) | **GET** /beta/palletType/{palletTypeId} | Get a palletType by id
*PalletTypeApi* | [**getPalletTypeFiles**](docs/PalletTypeApi.md#getPalletTypeFiles) | **GET** /beta/palletType/{palletTypeId}/file | Get the files for a palletType.
*PalletTypeApi* | [**getPalletTypeTags**](docs/PalletTypeApi.md#getPalletTypeTags) | **GET** /beta/palletType/{palletTypeId}/tag | Get the tags for a palletType.
*PalletTypeApi* | [**updatePalletType**](docs/PalletTypeApi.md#updatePalletType) | **PUT** /beta/palletType | Update a palletType
*PalletTypeApi* | [**updatePalletTypeCustomFields**](docs/PalletTypeApi.md#updatePalletTypeCustomFields) | **PUT** /beta/palletType/customFields | Update a palletType custom fields
*ParcelAccountApi* | [**addParcelAccount**](docs/ParcelAccountApi.md#addParcelAccount) | **POST** /beta/parcelAccount | Create a parcelAccount
*ParcelAccountApi* | [**addParcelAccountAudit**](docs/ParcelAccountApi.md#addParcelAccountAudit) | **PUT** /beta/parcelAccount/{parcelAccountId}/audit/{parcelAccountAudit} | Add new audit for a parcelAccount
*ParcelAccountApi* | [**addParcelAccountFile**](docs/ParcelAccountApi.md#addParcelAccountFile) | **POST** /beta/parcelAccount/{parcelAccountId}/file/{fileName} | Attach a file to a parcelAccount
*ParcelAccountApi* | [**addParcelAccountFileByURL**](docs/ParcelAccountApi.md#addParcelAccountFileByURL) | **POST** /beta/parcelAccount/{parcelAccountId}/file | Attach a file to a parcelAccount by URL.
*ParcelAccountApi* | [**addParcelAccountTag**](docs/ParcelAccountApi.md#addParcelAccountTag) | **PUT** /beta/parcelAccount/{parcelAccountId}/tag/{parcelAccountTag} | Add new tags for a parcelAccount.
*ParcelAccountApi* | [**deleteParcelAccountFile**](docs/ParcelAccountApi.md#deleteParcelAccountFile) | **DELETE** /beta/parcelAccount/{parcelAccountId}/file/{fileId} | Delete a file for a parcelAccount.
*ParcelAccountApi* | [**deleteParcelAccountTag**](docs/ParcelAccountApi.md#deleteParcelAccountTag) | **DELETE** /beta/parcelAccount/{parcelAccountId}/tag/{parcelAccountTag} | Delete a tag for a parcelAccount.
*ParcelAccountApi* | [**getDuplicateParcelAccountById**](docs/ParcelAccountApi.md#getDuplicateParcelAccountById) | **GET** /beta/parcelAccount/duplicate/{parcelAccountId} | Get a duplicated a parcelAccount by id
*ParcelAccountApi* | [**getParcelAccountByFilter**](docs/ParcelAccountApi.md#getParcelAccountByFilter) | **GET** /beta/parcelAccount/search | Search parcelAccounts by filter
*ParcelAccountApi* | [**getParcelAccountById**](docs/ParcelAccountApi.md#getParcelAccountById) | **GET** /beta/parcelAccount/{parcelAccountId} | Get a parcelAccount by id
*ParcelAccountApi* | [**getParcelAccountFiles**](docs/ParcelAccountApi.md#getParcelAccountFiles) | **GET** /beta/parcelAccount/{parcelAccountId}/file | Get the files for a parcelAccount.
*ParcelAccountApi* | [**getParcelAccountTags**](docs/ParcelAccountApi.md#getParcelAccountTags) | **GET** /beta/parcelAccount/{parcelAccountId}/tag | Get the tags for a parcelAccount.
*ParcelAccountApi* | [**updateParcelAccount**](docs/ParcelAccountApi.md#updateParcelAccount) | **PUT** /beta/parcelAccount | Update a parcelAccount
*ParcelAccountApi* | [**updateParcelAccountCustomFields**](docs/ParcelAccountApi.md#updateParcelAccountCustomFields) | **PUT** /beta/parcelAccount/customFields | Update a parcelAccount custom fields
*ParcelInvoiceApi* | [**addParcelInvoiceAudit**](docs/ParcelInvoiceApi.md#addParcelInvoiceAudit) | **PUT** /beta/parcelInvoice/{parcelInvoiceId}/audit/{parcelInvoiceAudit} | Add new audit for a parcelInvoice
*ParcelInvoiceApi* | [**addParcelInvoiceFile**](docs/ParcelInvoiceApi.md#addParcelInvoiceFile) | **POST** /beta/parcelInvoice/{parcelInvoiceId}/file/{fileName} | Attach a file to a parcelInvoice
*ParcelInvoiceApi* | [**addParcelInvoiceFileByURL**](docs/ParcelInvoiceApi.md#addParcelInvoiceFileByURL) | **POST** /beta/parcelInvoice/{parcelInvoiceId}/file | Attach a file to a parcelInvoice by URL.
*ParcelInvoiceApi* | [**addParcelInvoiceTag**](docs/ParcelInvoiceApi.md#addParcelInvoiceTag) | **PUT** /beta/parcelInvoice/{parcelInvoiceId}/tag/{parcelInvoiceTag} | Add new tags for a parcelInvoice.
*ParcelInvoiceApi* | [**deleteParcelInvoice**](docs/ParcelInvoiceApi.md#deleteParcelInvoice) | **DELETE** /beta/parcelInvoice/{parcelInvoiceId} | Delete a parcelInvoice
*ParcelInvoiceApi* | [**deleteParcelInvoiceFile**](docs/ParcelInvoiceApi.md#deleteParcelInvoiceFile) | **DELETE** /beta/parcelInvoice/{parcelInvoiceId}/file/{fileId} | Delete a file for a parcelInvoice.
*ParcelInvoiceApi* | [**deleteParcelInvoiceTag**](docs/ParcelInvoiceApi.md#deleteParcelInvoiceTag) | **DELETE** /beta/parcelInvoice/{parcelInvoiceId}/tag/{parcelInvoiceTag} | Delete a tag for a parcelInvoice.
*ParcelInvoiceApi* | [**getDuplicateParcelInvoiceById**](docs/ParcelInvoiceApi.md#getDuplicateParcelInvoiceById) | **GET** /beta/parcelInvoice/duplicate/{parcelInvoiceId} | Get a duplicated a parcelInvoice by id
*ParcelInvoiceApi* | [**getParcelInvoiceByFilter**](docs/ParcelInvoiceApi.md#getParcelInvoiceByFilter) | **GET** /beta/parcelInvoice/search | Search parcelInvoices by filter
*ParcelInvoiceApi* | [**getParcelInvoiceById**](docs/ParcelInvoiceApi.md#getParcelInvoiceById) | **GET** /beta/parcelInvoice/{parcelInvoiceId} | Get a parcelInvoice by id
*ParcelInvoiceApi* | [**getParcelInvoiceFiles**](docs/ParcelInvoiceApi.md#getParcelInvoiceFiles) | **GET** /beta/parcelInvoice/{parcelInvoiceId}/file | Get the files for a parcelInvoice.
*ParcelInvoiceApi* | [**getParcelInvoiceTags**](docs/ParcelInvoiceApi.md#getParcelInvoiceTags) | **GET** /beta/parcelInvoice/{parcelInvoiceId}/tag | Get the tags for a parcelInvoice.
*ParcelInvoiceLineApi* | [**addParcelInvoiceLineAudit**](docs/ParcelInvoiceLineApi.md#addParcelInvoiceLineAudit) | **PUT** /beta/parcelInvoiceLine/{parcelInvoiceLineId}/audit/{parcelInvoiceLineAudit} | Add new audit for a parcelInvoiceLine
*ParcelInvoiceLineApi* | [**addParcelInvoiceLineFile**](docs/ParcelInvoiceLineApi.md#addParcelInvoiceLineFile) | **POST** /beta/parcelInvoiceLine/{parcelInvoiceLineId}/file/{fileName} | Attach a file to a parcelInvoiceLine
*ParcelInvoiceLineApi* | [**addParcelInvoiceLineFileByURL**](docs/ParcelInvoiceLineApi.md#addParcelInvoiceLineFileByURL) | **POST** /beta/parcelInvoiceLine/{parcelInvoiceLineId}/file | Attach a file to a parcelInvoiceLine by URL.
*ParcelInvoiceLineApi* | [**addParcelInvoiceLineTag**](docs/ParcelInvoiceLineApi.md#addParcelInvoiceLineTag) | **PUT** /beta/parcelInvoiceLine/{parcelInvoiceLineId}/tag/{parcelInvoiceLineTag} | Add new tags for a parcelInvoiceLine.
*ParcelInvoiceLineApi* | [**deleteParcelInvoiceLineFile**](docs/ParcelInvoiceLineApi.md#deleteParcelInvoiceLineFile) | **DELETE** /beta/parcelInvoiceLine/{parcelInvoiceLineId}/file/{fileId} | Delete a file for a parcelInvoiceLine.
*ParcelInvoiceLineApi* | [**deleteParcelInvoiceLineTag**](docs/ParcelInvoiceLineApi.md#deleteParcelInvoiceLineTag) | **DELETE** /beta/parcelInvoiceLine/{parcelInvoiceLineId}/tag/{parcelInvoiceLineTag} | Delete a tag for a parcelInvoiceLine.
*ParcelInvoiceLineApi* | [**getDuplicateParcelInvoiceLineById**](docs/ParcelInvoiceLineApi.md#getDuplicateParcelInvoiceLineById) | **GET** /beta/parcelInvoiceLine/duplicate/{parcelInvoiceLineId} | Get a duplicated a parcelInvoiceLine by id
*ParcelInvoiceLineApi* | [**getParcelInvoiceLineByFilter**](docs/ParcelInvoiceLineApi.md#getParcelInvoiceLineByFilter) | **GET** /beta/parcelInvoiceLine/search | Search parcelInvoiceLines by filter
*ParcelInvoiceLineApi* | [**getParcelInvoiceLineById**](docs/ParcelInvoiceLineApi.md#getParcelInvoiceLineById) | **GET** /beta/parcelInvoiceLine/{parcelInvoiceLineId} | Get a parcelInvoiceLine by id
*ParcelInvoiceLineApi* | [**getParcelInvoiceLineFiles**](docs/ParcelInvoiceLineApi.md#getParcelInvoiceLineFiles) | **GET** /beta/parcelInvoiceLine/{parcelInvoiceLineId}/file | Get the files for a parcelInvoiceLine.
*ParcelInvoiceLineApi* | [**getParcelInvoiceLineTags**](docs/ParcelInvoiceLineApi.md#getParcelInvoiceLineTags) | **GET** /beta/parcelInvoiceLine/{parcelInvoiceLineId}/tag | Get the tags for a parcelInvoiceLine.
*ParcelInvoiceLineApi* | [**updateParcelInvoiceLine**](docs/ParcelInvoiceLineApi.md#updateParcelInvoiceLine) | **PUT** /beta/parcelInvoiceLine | Update a parcelInvoiceLine
*PerpetualInventoryLogApi* | [**addPerpetualInventoryLogAudit**](docs/PerpetualInventoryLogApi.md#addPerpetualInventoryLogAudit) | **PUT** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/audit/{perpetualInventoryLogAudit} | Add new audit for a perpetualInventoryLog
*PerpetualInventoryLogApi* | [**addPerpetualInventoryLogFile**](docs/PerpetualInventoryLogApi.md#addPerpetualInventoryLogFile) | **POST** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/file/{fileName} | Attach a file to a perpetualInventoryLog
*PerpetualInventoryLogApi* | [**addPerpetualInventoryLogFileByURL**](docs/PerpetualInventoryLogApi.md#addPerpetualInventoryLogFileByURL) | **POST** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/file | Attach a file to a perpetualInventoryLog by URL.
*PerpetualInventoryLogApi* | [**addPerpetualInventoryLogTag**](docs/PerpetualInventoryLogApi.md#addPerpetualInventoryLogTag) | **PUT** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/tag/{perpetualInventoryLogTag} | Add new tags for a perpetualInventoryLog.
*PerpetualInventoryLogApi* | [**deletePerpetualInventoryLogFile**](docs/PerpetualInventoryLogApi.md#deletePerpetualInventoryLogFile) | **DELETE** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/file/{fileId} | Delete a file for a perpetualInventoryLog.
*PerpetualInventoryLogApi* | [**deletePerpetualInventoryLogTag**](docs/PerpetualInventoryLogApi.md#deletePerpetualInventoryLogTag) | **DELETE** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/tag/{perpetualInventoryLogTag} | Delete a tag for a perpetualInventoryLog.
*PerpetualInventoryLogApi* | [**getDuplicatePerpetualInventoryLogById**](docs/PerpetualInventoryLogApi.md#getDuplicatePerpetualInventoryLogById) | **GET** /beta/perpetualInventoryLog/duplicate/{perpetualInventoryLogId} | Get a duplicated a perpetualInventoryLog by id
*PerpetualInventoryLogApi* | [**getPerpetualInventoryLogByFilter**](docs/PerpetualInventoryLogApi.md#getPerpetualInventoryLogByFilter) | **GET** /beta/perpetualInventoryLog/search | Search perpetualInventoryLogs by filter
*PerpetualInventoryLogApi* | [**getPerpetualInventoryLogById**](docs/PerpetualInventoryLogApi.md#getPerpetualInventoryLogById) | **GET** /beta/perpetualInventoryLog/{perpetualInventoryLogId} | Get a perpetualInventoryLog by id
*PerpetualInventoryLogApi* | [**getPerpetualInventoryLogFiles**](docs/PerpetualInventoryLogApi.md#getPerpetualInventoryLogFiles) | **GET** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/file | Get the files for a perpetualInventoryLog.
*PerpetualInventoryLogApi* | [**getPerpetualInventoryLogTags**](docs/PerpetualInventoryLogApi.md#getPerpetualInventoryLogTags) | **GET** /beta/perpetualInventoryLog/{perpetualInventoryLogId}/tag | Get the tags for a perpetualInventoryLog.
*PickFaceAssignmentApi* | [**addPickFaceAssignment**](docs/PickFaceAssignmentApi.md#addPickFaceAssignment) | **POST** /beta/pickFaceAssignment | Create a pickFaceAssignment
*PickFaceAssignmentApi* | [**addPickFaceAssignmentAudit**](docs/PickFaceAssignmentApi.md#addPickFaceAssignmentAudit) | **PUT** /beta/pickFaceAssignment/{pickFaceAssignmentId}/audit/{pickFaceAssignmentAudit} | Add new audit for a pickFaceAssignment
*PickFaceAssignmentApi* | [**addPickFaceAssignmentFile**](docs/PickFaceAssignmentApi.md#addPickFaceAssignmentFile) | **POST** /beta/pickFaceAssignment/{pickFaceAssignmentId}/file/{fileName} | Attach a file to a pickFaceAssignment
*PickFaceAssignmentApi* | [**addPickFaceAssignmentFileByURL**](docs/PickFaceAssignmentApi.md#addPickFaceAssignmentFileByURL) | **POST** /beta/pickFaceAssignment/{pickFaceAssignmentId}/file | Attach a file to a pickFaceAssignment by URL.
*PickFaceAssignmentApi* | [**addPickFaceAssignmentTag**](docs/PickFaceAssignmentApi.md#addPickFaceAssignmentTag) | **PUT** /beta/pickFaceAssignment/{pickFaceAssignmentId}/tag/{pickFaceAssignmentTag} | Add new tags for a pickFaceAssignment.
*PickFaceAssignmentApi* | [**deletePickFaceAssignment**](docs/PickFaceAssignmentApi.md#deletePickFaceAssignment) | **DELETE** /beta/pickFaceAssignment/{pickFaceAssignmentId} | Delete a pickFaceAssignment
*PickFaceAssignmentApi* | [**deletePickFaceAssignmentFile**](docs/PickFaceAssignmentApi.md#deletePickFaceAssignmentFile) | **DELETE** /beta/pickFaceAssignment/{pickFaceAssignmentId}/file/{fileId} | Delete a file for a pickFaceAssignment.
*PickFaceAssignmentApi* | [**deletePickFaceAssignmentTag**](docs/PickFaceAssignmentApi.md#deletePickFaceAssignmentTag) | **DELETE** /beta/pickFaceAssignment/{pickFaceAssignmentId}/tag/{pickFaceAssignmentTag} | Delete a tag for a pickFaceAssignment.
*PickFaceAssignmentApi* | [**getDuplicatePickFaceAssignmentById**](docs/PickFaceAssignmentApi.md#getDuplicatePickFaceAssignmentById) | **GET** /beta/pickFaceAssignment/duplicate/{pickFaceAssignmentId} | Get a duplicated a pickFaceAssignment by id
*PickFaceAssignmentApi* | [**getPickFaceAssignmentByFilter**](docs/PickFaceAssignmentApi.md#getPickFaceAssignmentByFilter) | **GET** /beta/pickFaceAssignment/search | Search pickFaceAssignments by filter
*PickFaceAssignmentApi* | [**getPickFaceAssignmentById**](docs/PickFaceAssignmentApi.md#getPickFaceAssignmentById) | **GET** /beta/pickFaceAssignment/{pickFaceAssignmentId} | Get a pickFaceAssignment by id
*PickFaceAssignmentApi* | [**getPickFaceAssignmentFiles**](docs/PickFaceAssignmentApi.md#getPickFaceAssignmentFiles) | **GET** /beta/pickFaceAssignment/{pickFaceAssignmentId}/file | Get the files for a pickFaceAssignment.
*PickFaceAssignmentApi* | [**getPickFaceAssignmentTags**](docs/PickFaceAssignmentApi.md#getPickFaceAssignmentTags) | **GET** /beta/pickFaceAssignment/{pickFaceAssignmentId}/tag | Get the tags for a pickFaceAssignment.
*PickFaceAssignmentApi* | [**updatePickFaceAssignment**](docs/PickFaceAssignmentApi.md#updatePickFaceAssignment) | **PUT** /beta/pickFaceAssignment | Update a pickFaceAssignment
*PickFaceAssignmentApi* | [**updatePickFaceAssignmentCustomFields**](docs/PickFaceAssignmentApi.md#updatePickFaceAssignmentCustomFields) | **PUT** /beta/pickFaceAssignment/customFields | Update a pickFaceAssignment custom fields
*PredefinedCartonApi* | [**getPredefinedCartonById**](docs/PredefinedCartonApi.md#getPredefinedCartonById) | **GET** /beta/predefinedCarton/{predefinedCartonId} | Get a predefinedCarton by id
*PredefinedCartonApi* | [**getPredefinedCartonBySearchText**](docs/PredefinedCartonApi.md#getPredefinedCartonBySearchText) | **GET** /beta/predefinedCarton/search | Search predefinedCartons
*ProductTypeApi* | [**getProductTypeById**](docs/ProductTypeApi.md#getProductTypeById) | **GET** /beta/productType/{productTypeId} | Get a productType by id
*ProductTypeApi* | [**getProductTypeBySearchText**](docs/ProductTypeApi.md#getProductTypeBySearchText) | **GET** /beta/productType/search | Search productTypes
*ProductionLotApi* | [**addProductionLot**](docs/ProductionLotApi.md#addProductionLot) | **POST** /beta/productionLot | Create a productionLot
*ProductionLotApi* | [**addProductionLotAudit**](docs/ProductionLotApi.md#addProductionLotAudit) | **PUT** /beta/productionLot/{productionLotId}/audit/{productionLotAudit} | Add new audit for a productionLot
*ProductionLotApi* | [**addProductionLotFile**](docs/ProductionLotApi.md#addProductionLotFile) | **POST** /beta/productionLot/{productionLotId}/file/{fileName} | Attach a file to a productionLot
*ProductionLotApi* | [**addProductionLotFileByURL**](docs/ProductionLotApi.md#addProductionLotFileByURL) | **POST** /beta/productionLot/{productionLotId}/file | Attach a file to a productionLot by URL.
*ProductionLotApi* | [**addProductionLotTag**](docs/ProductionLotApi.md#addProductionLotTag) | **PUT** /beta/productionLot/{productionLotId}/tag/{productionLotTag} | Add new tags for a productionLot.
*ProductionLotApi* | [**deleteProductionLot**](docs/ProductionLotApi.md#deleteProductionLot) | **DELETE** /beta/productionLot/{productionLotId} | Delete a productionLot
*ProductionLotApi* | [**deleteProductionLotFile**](docs/ProductionLotApi.md#deleteProductionLotFile) | **DELETE** /beta/productionLot/{productionLotId}/file/{fileId} | Delete a file for a productionLot.
*ProductionLotApi* | [**deleteProductionLotTag**](docs/ProductionLotApi.md#deleteProductionLotTag) | **DELETE** /beta/productionLot/{productionLotId}/tag/{productionLotTag} | Delete a tag for a productionLot.
*ProductionLotApi* | [**getDuplicateProductionLotById**](docs/ProductionLotApi.md#getDuplicateProductionLotById) | **GET** /beta/productionLot/duplicate/{productionLotId} | Get a duplicated a productionLot by id
*ProductionLotApi* | [**getProductionLotByFilter**](docs/ProductionLotApi.md#getProductionLotByFilter) | **GET** /beta/productionLot/search | Search productionLots by filter
*ProductionLotApi* | [**getProductionLotById**](docs/ProductionLotApi.md#getProductionLotById) | **GET** /beta/productionLot/{productionLotId} | Get a productionLot by id
*ProductionLotApi* | [**getProductionLotFiles**](docs/ProductionLotApi.md#getProductionLotFiles) | **GET** /beta/productionLot/{productionLotId}/file | Get the files for a productionLot.
*ProductionLotApi* | [**getProductionLotTags**](docs/ProductionLotApi.md#getProductionLotTags) | **GET** /beta/productionLot/{productionLotId}/tag | Get the tags for a productionLot.
*ProductionLotApi* | [**updateProductionLot**](docs/ProductionLotApi.md#updateProductionLot) | **PUT** /beta/productionLot | Update a productionLot
*ProductionLotApi* | [**updateProductionLotCustomFields**](docs/ProductionLotApi.md#updateProductionLotCustomFields) | **PUT** /beta/productionLot/customFields | Update a productionLot custom fields
*ProductionModelApi* | [**addProductionModel**](docs/ProductionModelApi.md#addProductionModel) | **POST** /beta/productionModel | Create a productionModel
*ProductionModelApi* | [**addProductionModelAudit**](docs/ProductionModelApi.md#addProductionModelAudit) | **PUT** /beta/productionModel/{productionModelId}/audit/{productionModelAudit} | Add new audit for a productionModel
*ProductionModelApi* | [**addProductionModelFile**](docs/ProductionModelApi.md#addProductionModelFile) | **POST** /beta/productionModel/{productionModelId}/file/{fileName} | Attach a file to a productionModel
*ProductionModelApi* | [**addProductionModelFileByURL**](docs/ProductionModelApi.md#addProductionModelFileByURL) | **POST** /beta/productionModel/{productionModelId}/file | Attach a file to a productionModel by URL.
*ProductionModelApi* | [**addProductionModelTag**](docs/ProductionModelApi.md#addProductionModelTag) | **PUT** /beta/productionModel/{productionModelId}/tag/{productionModelTag} | Add new tags for a productionModel.
*ProductionModelApi* | [**deleteProductionModel**](docs/ProductionModelApi.md#deleteProductionModel) | **DELETE** /beta/productionModel/{productionModelId} | Delete a productionModel
*ProductionModelApi* | [**deleteProductionModelFile**](docs/ProductionModelApi.md#deleteProductionModelFile) | **DELETE** /beta/productionModel/{productionModelId}/file/{fileId} | Delete a file for a productionModel.
*ProductionModelApi* | [**deleteProductionModelTag**](docs/ProductionModelApi.md#deleteProductionModelTag) | **DELETE** /beta/productionModel/{productionModelId}/tag/{productionModelTag} | Delete a tag for a productionModel.
*ProductionModelApi* | [**getDuplicateProductionModelById**](docs/ProductionModelApi.md#getDuplicateProductionModelById) | **GET** /beta/productionModel/duplicate/{productionModelId} | Get a duplicated a productionModel by id
*ProductionModelApi* | [**getProductionModelByFilter**](docs/ProductionModelApi.md#getProductionModelByFilter) | **GET** /beta/productionModel/search | Search productionModels by filter
*ProductionModelApi* | [**getProductionModelById**](docs/ProductionModelApi.md#getProductionModelById) | **GET** /beta/productionModel/{productionModelId} | Get a productionModel by id
*ProductionModelApi* | [**getProductionModelFiles**](docs/ProductionModelApi.md#getProductionModelFiles) | **GET** /beta/productionModel/{productionModelId}/file | Get the files for a productionModel.
*ProductionModelApi* | [**getProductionModelTags**](docs/ProductionModelApi.md#getProductionModelTags) | **GET** /beta/productionModel/{productionModelId}/tag | Get the tags for a productionModel.
*ProductionModelApi* | [**updateProductionModel**](docs/ProductionModelApi.md#updateProductionModel) | **PUT** /beta/productionModel | Update a productionModel
*ProductionModelApi* | [**updateProductionModelCustomFields**](docs/ProductionModelApi.md#updateProductionModelCustomFields) | **PUT** /beta/productionModel/customFields | Update a productionModel custom fields
*QuickAdjustmentApi* | [**addQuickAdjustment**](docs/QuickAdjustmentApi.md#addQuickAdjustment) | **POST** /beta/quickAdjustment | Create a quickAdjustment
*QuickAdjustmentApi* | [**addQuickAdjustmentAudit**](docs/QuickAdjustmentApi.md#addQuickAdjustmentAudit) | **PUT** /beta/quickAdjustment/{quickAdjustmentId}/audit/{quickAdjustmentAudit} | Add new audit for a quickAdjustment
*QuickAdjustmentApi* | [**addQuickAdjustmentFile**](docs/QuickAdjustmentApi.md#addQuickAdjustmentFile) | **POST** /beta/quickAdjustment/{quickAdjustmentId}/file/{fileName} | Attach a file to a quickAdjustment
*QuickAdjustmentApi* | [**addQuickAdjustmentFileByURL**](docs/QuickAdjustmentApi.md#addQuickAdjustmentFileByURL) | **POST** /beta/quickAdjustment/{quickAdjustmentId}/file | Attach a file to a quickAdjustment by URL.
*QuickAdjustmentApi* | [**addQuickAdjustmentTag**](docs/QuickAdjustmentApi.md#addQuickAdjustmentTag) | **PUT** /beta/quickAdjustment/{quickAdjustmentId}/tag/{quickAdjustmentTag} | Add new tags for a quickAdjustment.
*QuickAdjustmentApi* | [**deleteQuickAdjustment**](docs/QuickAdjustmentApi.md#deleteQuickAdjustment) | **DELETE** /beta/quickAdjustment/{quickAdjustmentId} | Delete a quickAdjustment
*QuickAdjustmentApi* | [**deleteQuickAdjustmentFile**](docs/QuickAdjustmentApi.md#deleteQuickAdjustmentFile) | **DELETE** /beta/quickAdjustment/{quickAdjustmentId}/file/{fileId} | Delete a file for a quickAdjustment.
*QuickAdjustmentApi* | [**deleteQuickAdjustmentTag**](docs/QuickAdjustmentApi.md#deleteQuickAdjustmentTag) | **DELETE** /beta/quickAdjustment/{quickAdjustmentId}/tag/{quickAdjustmentTag} | Delete a tag for a quickAdjustment.
*QuickAdjustmentApi* | [**executeQuickAdjustment**](docs/QuickAdjustmentApi.md#executeQuickAdjustment) | **POST** /beta/quickAdjustment/executeQuickAdjustment | Run the ExecuteQuickAdjustment process.
*QuickAdjustmentApi* | [**getDuplicateQuickAdjustmentById**](docs/QuickAdjustmentApi.md#getDuplicateQuickAdjustmentById) | **GET** /beta/quickAdjustment/duplicate/{quickAdjustmentId} | Get a duplicated a quickAdjustment by id
*QuickAdjustmentApi* | [**getQuickAdjustmentByFilter**](docs/QuickAdjustmentApi.md#getQuickAdjustmentByFilter) | **GET** /beta/quickAdjustment/search | Search quickAdjustments by filter
*QuickAdjustmentApi* | [**getQuickAdjustmentById**](docs/QuickAdjustmentApi.md#getQuickAdjustmentById) | **GET** /beta/quickAdjustment/{quickAdjustmentId} | Get a quickAdjustment by id
*QuickAdjustmentApi* | [**getQuickAdjustmentFiles**](docs/QuickAdjustmentApi.md#getQuickAdjustmentFiles) | **GET** /beta/quickAdjustment/{quickAdjustmentId}/file | Get the files for a quickAdjustment.
*QuickAdjustmentApi* | [**getQuickAdjustmentTags**](docs/QuickAdjustmentApi.md#getQuickAdjustmentTags) | **GET** /beta/quickAdjustment/{quickAdjustmentId}/tag | Get the tags for a quickAdjustment.
*QuickAdjustmentApi* | [**updateQuickAdjustment**](docs/QuickAdjustmentApi.md#updateQuickAdjustment) | **PUT** /beta/quickAdjustment | Update a quickAdjustment
*QuickAdjustmentApi* | [**updateQuickAdjustmentCustomFields**](docs/QuickAdjustmentApi.md#updateQuickAdjustmentCustomFields) | **PUT** /beta/quickAdjustment/customFields | Update a quickAdjustment custom fields
*QuickReceiptApi* | [**addQuickReceipt**](docs/QuickReceiptApi.md#addQuickReceipt) | **POST** /beta/quickReceipt | Create a quickReceipt
*QuickReceiptApi* | [**addQuickReceiptAudit**](docs/QuickReceiptApi.md#addQuickReceiptAudit) | **PUT** /beta/quickReceipt/{quickReceiptId}/audit/{quickReceiptAudit} | Add new audit for a quickReceipt
*QuickReceiptApi* | [**addQuickReceiptFile**](docs/QuickReceiptApi.md#addQuickReceiptFile) | **POST** /beta/quickReceipt/{quickReceiptId}/file/{fileName} | Attach a file to a quickReceipt
*QuickReceiptApi* | [**addQuickReceiptFileByURL**](docs/QuickReceiptApi.md#addQuickReceiptFileByURL) | **POST** /beta/quickReceipt/{quickReceiptId}/file | Attach a file to a quickReceipt by URL.
*QuickReceiptApi* | [**addQuickReceiptTag**](docs/QuickReceiptApi.md#addQuickReceiptTag) | **PUT** /beta/quickReceipt/{quickReceiptId}/tag/{quickReceiptTag} | Add new tags for a quickReceipt.
*QuickReceiptApi* | [**deleteQuickReceipt**](docs/QuickReceiptApi.md#deleteQuickReceipt) | **DELETE** /beta/quickReceipt/{quickReceiptId} | Delete a quickReceipt
*QuickReceiptApi* | [**deleteQuickReceiptFile**](docs/QuickReceiptApi.md#deleteQuickReceiptFile) | **DELETE** /beta/quickReceipt/{quickReceiptId}/file/{fileId} | Delete a file for a quickReceipt.
*QuickReceiptApi* | [**deleteQuickReceiptTag**](docs/QuickReceiptApi.md#deleteQuickReceiptTag) | **DELETE** /beta/quickReceipt/{quickReceiptId}/tag/{quickReceiptTag} | Delete a tag for a quickReceipt.
*QuickReceiptApi* | [**executeQuickReceipt**](docs/QuickReceiptApi.md#executeQuickReceipt) | **POST** /beta/quickReceipt/executeQuickReceipt | Run the ExecuteQuickReceipt process.
*QuickReceiptApi* | [**getDuplicateQuickReceiptById**](docs/QuickReceiptApi.md#getDuplicateQuickReceiptById) | **GET** /beta/quickReceipt/duplicate/{quickReceiptId} | Get a duplicated a quickReceipt by id
*QuickReceiptApi* | [**getQuickReceiptByFilter**](docs/QuickReceiptApi.md#getQuickReceiptByFilter) | **GET** /beta/quickReceipt/search | Search quickReceipts by filter
*QuickReceiptApi* | [**getQuickReceiptById**](docs/QuickReceiptApi.md#getQuickReceiptById) | **GET** /beta/quickReceipt/{quickReceiptId} | Get a quickReceipt by id
*QuickReceiptApi* | [**getQuickReceiptFiles**](docs/QuickReceiptApi.md#getQuickReceiptFiles) | **GET** /beta/quickReceipt/{quickReceiptId}/file | Get the files for a quickReceipt.
*QuickReceiptApi* | [**getQuickReceiptTags**](docs/QuickReceiptApi.md#getQuickReceiptTags) | **GET** /beta/quickReceipt/{quickReceiptId}/tag | Get the tags for a quickReceipt.
*QuickReceiptApi* | [**updateQuickReceipt**](docs/QuickReceiptApi.md#updateQuickReceipt) | **PUT** /beta/quickReceipt | Update a quickReceipt
*QuickReceiptApi* | [**updateQuickReceiptCustomFields**](docs/QuickReceiptApi.md#updateQuickReceiptCustomFields) | **PUT** /beta/quickReceipt/customFields | Update a quickReceipt custom fields
*ReceivingProcessApi* | [**addReceivingProcessAudit**](docs/ReceivingProcessApi.md#addReceivingProcessAudit) | **PUT** /beta/receivingProcess/{receivingProcessId}/audit/{receivingProcessAudit} | Add new audit for a receivingProcess
*ReceivingProcessApi* | [**addReceivingProcessFile**](docs/ReceivingProcessApi.md#addReceivingProcessFile) | **POST** /beta/receivingProcess/{receivingProcessId}/file/{fileName} | Attach a file to a receivingProcess
*ReceivingProcessApi* | [**addReceivingProcessFileByURL**](docs/ReceivingProcessApi.md#addReceivingProcessFileByURL) | **POST** /beta/receivingProcess/{receivingProcessId}/file | Attach a file to a receivingProcess by URL.
*ReceivingProcessApi* | [**addReceivingProcessTag**](docs/ReceivingProcessApi.md#addReceivingProcessTag) | **PUT** /beta/receivingProcess/{receivingProcessId}/tag/{receivingProcessTag} | Add new tags for a receivingProcess.
*ReceivingProcessApi* | [**deleteReceivingProcessFile**](docs/ReceivingProcessApi.md#deleteReceivingProcessFile) | **DELETE** /beta/receivingProcess/{receivingProcessId}/file/{fileId} | Delete a file for a receivingProcess.
*ReceivingProcessApi* | [**deleteReceivingProcessTag**](docs/ReceivingProcessApi.md#deleteReceivingProcessTag) | **DELETE** /beta/receivingProcess/{receivingProcessId}/tag/{receivingProcessTag} | Delete a tag for a receivingProcess.
*ReceivingProcessApi* | [**getDuplicateReceivingProcessById**](docs/ReceivingProcessApi.md#getDuplicateReceivingProcessById) | **GET** /beta/receivingProcess/duplicate/{receivingProcessId} | Get a duplicated a receivingProcess by id
*ReceivingProcessApi* | [**getReceivingProcessByFilter**](docs/ReceivingProcessApi.md#getReceivingProcessByFilter) | **GET** /beta/receivingProcess/search | Search receivingProcesses by filter
*ReceivingProcessApi* | [**getReceivingProcessById**](docs/ReceivingProcessApi.md#getReceivingProcessById) | **GET** /beta/receivingProcess/{receivingProcessId} | Get a receivingProcess by id
*ReceivingProcessApi* | [**getReceivingProcessFiles**](docs/ReceivingProcessApi.md#getReceivingProcessFiles) | **GET** /beta/receivingProcess/{receivingProcessId}/file | Get the files for a receivingProcess.
*ReceivingProcessApi* | [**getReceivingProcessTags**](docs/ReceivingProcessApi.md#getReceivingProcessTags) | **GET** /beta/receivingProcess/{receivingProcessId}/tag | Get the tags for a receivingProcess.
*ReceivingProcessApi* | [**updateReceivingProcessCustomFields**](docs/ReceivingProcessApi.md#updateReceivingProcessCustomFields) | **PUT** /beta/receivingProcess/customFields | Update a receivingProcess custom fields
*ReceivingWorksheetApi* | [**addReceivingWorksheet**](docs/ReceivingWorksheetApi.md#addReceivingWorksheet) | **POST** /beta/receivingWorksheet | Create a receivingWorksheet
*ReceivingWorksheetApi* | [**addReceivingWorksheetAudit**](docs/ReceivingWorksheetApi.md#addReceivingWorksheetAudit) | **PUT** /beta/receivingWorksheet/{receivingWorksheetId}/audit/{receivingWorksheetAudit} | Add new audit for a receivingWorksheet
*ReceivingWorksheetApi* | [**addReceivingWorksheetFile**](docs/ReceivingWorksheetApi.md#addReceivingWorksheetFile) | **POST** /beta/receivingWorksheet/{receivingWorksheetId}/file/{fileName} | Attach a file to a receivingWorksheet
*ReceivingWorksheetApi* | [**addReceivingWorksheetFileByURL**](docs/ReceivingWorksheetApi.md#addReceivingWorksheetFileByURL) | **POST** /beta/receivingWorksheet/{receivingWorksheetId}/file | Attach a file to a receivingWorksheet by URL.
*ReceivingWorksheetApi* | [**addReceivingWorksheetTag**](docs/ReceivingWorksheetApi.md#addReceivingWorksheetTag) | **PUT** /beta/receivingWorksheet/{receivingWorksheetId}/tag/{receivingWorksheetTag} | Add new tags for a receivingWorksheet.
*ReceivingWorksheetApi* | [**deleteReceivingWorksheet**](docs/ReceivingWorksheetApi.md#deleteReceivingWorksheet) | **DELETE** /beta/receivingWorksheet/{receivingWorksheetId} | Delete a receivingWorksheet
*ReceivingWorksheetApi* | [**deleteReceivingWorksheetFile**](docs/ReceivingWorksheetApi.md#deleteReceivingWorksheetFile) | **DELETE** /beta/receivingWorksheet/{receivingWorksheetId}/file/{fileId} | Delete a file for a receivingWorksheet.
*ReceivingWorksheetApi* | [**deleteReceivingWorksheetTag**](docs/ReceivingWorksheetApi.md#deleteReceivingWorksheetTag) | **DELETE** /beta/receivingWorksheet/{receivingWorksheetId}/tag/{receivingWorksheetTag} | Delete a tag for a receivingWorksheet.
*ReceivingWorksheetApi* | [**getDuplicateReceivingWorksheetById**](docs/ReceivingWorksheetApi.md#getDuplicateReceivingWorksheetById) | **GET** /beta/receivingWorksheet/duplicate/{receivingWorksheetId} | Get a duplicated a receivingWorksheet by id
*ReceivingWorksheetApi* | [**getReceivingWorksheetByFilter**](docs/ReceivingWorksheetApi.md#getReceivingWorksheetByFilter) | **GET** /beta/receivingWorksheet/search | Search receivingWorksheets by filter
*ReceivingWorksheetApi* | [**getReceivingWorksheetById**](docs/ReceivingWorksheetApi.md#getReceivingWorksheetById) | **GET** /beta/receivingWorksheet/{receivingWorksheetId} | Get a receivingWorksheet by id
*ReceivingWorksheetApi* | [**getReceivingWorksheetFiles**](docs/ReceivingWorksheetApi.md#getReceivingWorksheetFiles) | **GET** /beta/receivingWorksheet/{receivingWorksheetId}/file | Get the files for a receivingWorksheet.
*ReceivingWorksheetApi* | [**getReceivingWorksheetTags**](docs/ReceivingWorksheetApi.md#getReceivingWorksheetTags) | **GET** /beta/receivingWorksheet/{receivingWorksheetId}/tag | Get the tags for a receivingWorksheet.
*ReceivingWorksheetApi* | [**updateReceivingWorksheet**](docs/ReceivingWorksheetApi.md#updateReceivingWorksheet) | **PUT** /beta/receivingWorksheet | Update a receivingWorksheet
*ReceivingWorksheetApi* | [**updateReceivingWorksheetCustomFields**](docs/ReceivingWorksheetApi.md#updateReceivingWorksheetCustomFields) | **PUT** /beta/receivingWorksheet/customFields | Update a receivingWorksheet custom fields
*ReplenishmentApi* | [**addReplenishmentAudit**](docs/ReplenishmentApi.md#addReplenishmentAudit) | **PUT** /beta/replenishment/{replenishmentId}/audit/{replenishmentAudit} | Add new audit for a replenishment
*ReplenishmentApi* | [**addReplenishmentFile**](docs/ReplenishmentApi.md#addReplenishmentFile) | **POST** /beta/replenishment/{replenishmentId}/file/{fileName} | Attach a file to a replenishment
*ReplenishmentApi* | [**addReplenishmentFileByURL**](docs/ReplenishmentApi.md#addReplenishmentFileByURL) | **POST** /beta/replenishment/{replenishmentId}/file | Attach a file to a replenishment by URL.
*ReplenishmentApi* | [**addReplenishmentTag**](docs/ReplenishmentApi.md#addReplenishmentTag) | **PUT** /beta/replenishment/{replenishmentId}/tag/{replenishmentTag} | Add new tags for a replenishment.
*ReplenishmentApi* | [**deleteReplenishmentFile**](docs/ReplenishmentApi.md#deleteReplenishmentFile) | **DELETE** /beta/replenishment/{replenishmentId}/file/{fileId} | Delete a file for a replenishment.
*ReplenishmentApi* | [**deleteReplenishmentTag**](docs/ReplenishmentApi.md#deleteReplenishmentTag) | **DELETE** /beta/replenishment/{replenishmentId}/tag/{replenishmentTag} | Delete a tag for a replenishment.
*ReplenishmentApi* | [**getDuplicateReplenishmentById**](docs/ReplenishmentApi.md#getDuplicateReplenishmentById) | **GET** /beta/replenishment/duplicate/{replenishmentId} | Get a duplicated a replenishment by id
*ReplenishmentApi* | [**getReplenishmentByFilter**](docs/ReplenishmentApi.md#getReplenishmentByFilter) | **GET** /beta/replenishment/search | Search replenishments by filter
*ReplenishmentApi* | [**getReplenishmentById**](docs/ReplenishmentApi.md#getReplenishmentById) | **GET** /beta/replenishment/{replenishmentId} | Get a replenishment by id
*ReplenishmentApi* | [**getReplenishmentFiles**](docs/ReplenishmentApi.md#getReplenishmentFiles) | **GET** /beta/replenishment/{replenishmentId}/file | Get the files for a replenishment.
*ReplenishmentApi* | [**getReplenishmentTags**](docs/ReplenishmentApi.md#getReplenishmentTags) | **GET** /beta/replenishment/{replenishmentId}/tag | Get the tags for a replenishment.
*ReplenishmentApi* | [**updateReplenishmentCustomFields**](docs/ReplenishmentApi.md#updateReplenishmentCustomFields) | **PUT** /beta/replenishment/customFields | Update a replenishment custom fields
*ReplenishmentPlanApi* | [**addReplenishmentPlan**](docs/ReplenishmentPlanApi.md#addReplenishmentPlan) | **POST** /beta/replenishmentPlan | Create a replenishmentPlan
*ReplenishmentPlanApi* | [**addReplenishmentPlanAudit**](docs/ReplenishmentPlanApi.md#addReplenishmentPlanAudit) | **PUT** /beta/replenishmentPlan/{replenishmentPlanId}/audit/{replenishmentPlanAudit} | Add new audit for a replenishmentPlan
*ReplenishmentPlanApi* | [**addReplenishmentPlanFile**](docs/ReplenishmentPlanApi.md#addReplenishmentPlanFile) | **POST** /beta/replenishmentPlan/{replenishmentPlanId}/file/{fileName} | Attach a file to a replenishmentPlan
*ReplenishmentPlanApi* | [**addReplenishmentPlanFileByURL**](docs/ReplenishmentPlanApi.md#addReplenishmentPlanFileByURL) | **POST** /beta/replenishmentPlan/{replenishmentPlanId}/file | Attach a file to a replenishmentPlan by URL.
*ReplenishmentPlanApi* | [**addReplenishmentPlanTag**](docs/ReplenishmentPlanApi.md#addReplenishmentPlanTag) | **PUT** /beta/replenishmentPlan/{replenishmentPlanId}/tag/{replenishmentPlanTag} | Add new tags for a replenishmentPlan.
*ReplenishmentPlanApi* | [**deleteReplenishmentPlan**](docs/ReplenishmentPlanApi.md#deleteReplenishmentPlan) | **DELETE** /beta/replenishmentPlan/{replenishmentPlanId} | Delete a replenishmentPlan
*ReplenishmentPlanApi* | [**deleteReplenishmentPlanFile**](docs/ReplenishmentPlanApi.md#deleteReplenishmentPlanFile) | **DELETE** /beta/replenishmentPlan/{replenishmentPlanId}/file/{fileId} | Delete a file for a replenishmentPlan.
*ReplenishmentPlanApi* | [**deleteReplenishmentPlanTag**](docs/ReplenishmentPlanApi.md#deleteReplenishmentPlanTag) | **DELETE** /beta/replenishmentPlan/{replenishmentPlanId}/tag/{replenishmentPlanTag} | Delete a tag for a replenishmentPlan.
*ReplenishmentPlanApi* | [**getDuplicateReplenishmentPlanById**](docs/ReplenishmentPlanApi.md#getDuplicateReplenishmentPlanById) | **GET** /beta/replenishmentPlan/duplicate/{replenishmentPlanId} | Get a duplicated a replenishmentPlan by id
*ReplenishmentPlanApi* | [**getReplenishmentPlanByFilter**](docs/ReplenishmentPlanApi.md#getReplenishmentPlanByFilter) | **GET** /beta/replenishmentPlan/search | Search replenishmentPlans by filter
*ReplenishmentPlanApi* | [**getReplenishmentPlanById**](docs/ReplenishmentPlanApi.md#getReplenishmentPlanById) | **GET** /beta/replenishmentPlan/{replenishmentPlanId} | Get a replenishmentPlan by id
*ReplenishmentPlanApi* | [**getReplenishmentPlanFiles**](docs/ReplenishmentPlanApi.md#getReplenishmentPlanFiles) | **GET** /beta/replenishmentPlan/{replenishmentPlanId}/file | Get the files for a replenishmentPlan.
*ReplenishmentPlanApi* | [**getReplenishmentPlanTags**](docs/ReplenishmentPlanApi.md#getReplenishmentPlanTags) | **GET** /beta/replenishmentPlan/{replenishmentPlanId}/tag | Get the tags for a replenishmentPlan.
*ReplenishmentPlanApi* | [**updateReplenishmentPlan**](docs/ReplenishmentPlanApi.md#updateReplenishmentPlan) | **PUT** /beta/replenishmentPlan | Update a replenishmentPlan
*ReplenishmentPlanApi* | [**updateReplenishmentPlanCustomFields**](docs/ReplenishmentPlanApi.md#updateReplenishmentPlanCustomFields) | **PUT** /beta/replenishmentPlan/customFields | Update a replenishmentPlan custom fields
*ReplenishmentProcessApi* | [**addReplenishmentProcessAudit**](docs/ReplenishmentProcessApi.md#addReplenishmentProcessAudit) | **PUT** /beta/replenishmentProcess/{replenishmentProcessId}/audit/{replenishmentProcessAudit} | Add new audit for a replenishmentProcess
*ReplenishmentProcessApi* | [**addReplenishmentProcessFile**](docs/ReplenishmentProcessApi.md#addReplenishmentProcessFile) | **POST** /beta/replenishmentProcess/{replenishmentProcessId}/file/{fileName} | Attach a file to a replenishmentProcess
*ReplenishmentProcessApi* | [**addReplenishmentProcessFileByURL**](docs/ReplenishmentProcessApi.md#addReplenishmentProcessFileByURL) | **POST** /beta/replenishmentProcess/{replenishmentProcessId}/file | Attach a file to a replenishmentProcess by URL.
*ReplenishmentProcessApi* | [**addReplenishmentProcessTag**](docs/ReplenishmentProcessApi.md#addReplenishmentProcessTag) | **PUT** /beta/replenishmentProcess/{replenishmentProcessId}/tag/{replenishmentProcessTag} | Add new tags for a replenishmentProcess.
*ReplenishmentProcessApi* | [**deleteReplenishmentProcessFile**](docs/ReplenishmentProcessApi.md#deleteReplenishmentProcessFile) | **DELETE** /beta/replenishmentProcess/{replenishmentProcessId}/file/{fileId} | Delete a file for a replenishmentProcess.
*ReplenishmentProcessApi* | [**deleteReplenishmentProcessTag**](docs/ReplenishmentProcessApi.md#deleteReplenishmentProcessTag) | **DELETE** /beta/replenishmentProcess/{replenishmentProcessId}/tag/{replenishmentProcessTag} | Delete a tag for a replenishmentProcess.
*ReplenishmentProcessApi* | [**getDuplicateReplenishmentProcessById**](docs/ReplenishmentProcessApi.md#getDuplicateReplenishmentProcessById) | **GET** /beta/replenishmentProcess/duplicate/{replenishmentProcessId} | Get a duplicated a replenishmentProcess by id
*ReplenishmentProcessApi* | [**getReplenishmentProcessByFilter**](docs/ReplenishmentProcessApi.md#getReplenishmentProcessByFilter) | **GET** /beta/replenishmentProcess/search | Search replenishmentProcesses by filter
*ReplenishmentProcessApi* | [**getReplenishmentProcessById**](docs/ReplenishmentProcessApi.md#getReplenishmentProcessById) | **GET** /beta/replenishmentProcess/{replenishmentProcessId} | Get a replenishmentProcess by id
*ReplenishmentProcessApi* | [**getReplenishmentProcessFiles**](docs/ReplenishmentProcessApi.md#getReplenishmentProcessFiles) | **GET** /beta/replenishmentProcess/{replenishmentProcessId}/file | Get the files for a replenishmentProcess.
*ReplenishmentProcessApi* | [**getReplenishmentProcessTags**](docs/ReplenishmentProcessApi.md#getReplenishmentProcessTags) | **GET** /beta/replenishmentProcess/{replenishmentProcessId}/tag | Get the tags for a replenishmentProcess.
*ReplenishmentProcessApi* | [**updateReplenishmentProcessCustomFields**](docs/ReplenishmentProcessApi.md#updateReplenishmentProcessCustomFields) | **PUT** /beta/replenishmentProcess/customFields | Update a replenishmentProcess custom fields
*ReportApi* | [**runReport**](docs/ReportApi.md#runReport) | **GET** /beta/report/{reportId}/runReport | Run a specified report
*ReturnShipmentApi* | [**addReturnShipmentAudit**](docs/ReturnShipmentApi.md#addReturnShipmentAudit) | **PUT** /beta/returnShipment/{returnShipmentId}/audit/{returnShipmentAudit} | Add new audit for a returnShipment
*ReturnShipmentApi* | [**addReturnShipmentFile**](docs/ReturnShipmentApi.md#addReturnShipmentFile) | **POST** /beta/returnShipment/{returnShipmentId}/file/{fileName} | Attach a file to a returnShipment
*ReturnShipmentApi* | [**addReturnShipmentFileByURL**](docs/ReturnShipmentApi.md#addReturnShipmentFileByURL) | **POST** /beta/returnShipment/{returnShipmentId}/file | Attach a file to a returnShipment by URL.
*ReturnShipmentApi* | [**addReturnShipmentTag**](docs/ReturnShipmentApi.md#addReturnShipmentTag) | **PUT** /beta/returnShipment/{returnShipmentId}/tag/{returnShipmentTag} | Add new tags for a returnShipment.
*ReturnShipmentApi* | [**deleteReturnShipmentFile**](docs/ReturnShipmentApi.md#deleteReturnShipmentFile) | **DELETE** /beta/returnShipment/{returnShipmentId}/file/{fileId} | Delete a file for a returnShipment.
*ReturnShipmentApi* | [**deleteReturnShipmentTag**](docs/ReturnShipmentApi.md#deleteReturnShipmentTag) | **DELETE** /beta/returnShipment/{returnShipmentId}/tag/{returnShipmentTag} | Delete a tag for a returnShipment.
*ReturnShipmentApi* | [**getDuplicateReturnShipmentById**](docs/ReturnShipmentApi.md#getDuplicateReturnShipmentById) | **GET** /beta/returnShipment/duplicate/{returnShipmentId} | Get a duplicated a returnShipment by id
*ReturnShipmentApi* | [**getReturnShipmentByFilter**](docs/ReturnShipmentApi.md#getReturnShipmentByFilter) | **GET** /beta/returnShipment/search | Search returnShipments by filter
*ReturnShipmentApi* | [**getReturnShipmentById**](docs/ReturnShipmentApi.md#getReturnShipmentById) | **GET** /beta/returnShipment/{returnShipmentId} | Get a returnShipment by id
*ReturnShipmentApi* | [**getReturnShipmentFiles**](docs/ReturnShipmentApi.md#getReturnShipmentFiles) | **GET** /beta/returnShipment/{returnShipmentId}/file | Get the files for a returnShipment.
*ReturnShipmentApi* | [**getReturnShipmentTags**](docs/ReturnShipmentApi.md#getReturnShipmentTags) | **GET** /beta/returnShipment/{returnShipmentId}/tag | Get the tags for a returnShipment.
*ReturnShipmentApi* | [**updateReturnShipmentCustomFields**](docs/ReturnShipmentApi.md#updateReturnShipmentCustomFields) | **PUT** /beta/returnShipment/customFields | Update a returnShipment custom fields
*ScheduledPlanLogApi* | [**addScheduledPlanLogAudit**](docs/ScheduledPlanLogApi.md#addScheduledPlanLogAudit) | **PUT** /beta/scheduledPlanLog/{scheduledPlanLogId}/audit/{scheduledPlanLogAudit} | Add new audit for a scheduledPlanLog
*ScheduledPlanLogApi* | [**addScheduledPlanLogFile**](docs/ScheduledPlanLogApi.md#addScheduledPlanLogFile) | **POST** /beta/scheduledPlanLog/{scheduledPlanLogId}/file/{fileName} | Attach a file to a scheduledPlanLog
*ScheduledPlanLogApi* | [**addScheduledPlanLogFileByURL**](docs/ScheduledPlanLogApi.md#addScheduledPlanLogFileByURL) | **POST** /beta/scheduledPlanLog/{scheduledPlanLogId}/file | Attach a file to a scheduledPlanLog by URL.
*ScheduledPlanLogApi* | [**addScheduledPlanLogTag**](docs/ScheduledPlanLogApi.md#addScheduledPlanLogTag) | **PUT** /beta/scheduledPlanLog/{scheduledPlanLogId}/tag/{scheduledPlanLogTag} | Add new tags for a scheduledPlanLog.
*ScheduledPlanLogApi* | [**deleteScheduledPlanLogFile**](docs/ScheduledPlanLogApi.md#deleteScheduledPlanLogFile) | **DELETE** /beta/scheduledPlanLog/{scheduledPlanLogId}/file/{fileId} | Delete a file for a scheduledPlanLog.
*ScheduledPlanLogApi* | [**deleteScheduledPlanLogTag**](docs/ScheduledPlanLogApi.md#deleteScheduledPlanLogTag) | **DELETE** /beta/scheduledPlanLog/{scheduledPlanLogId}/tag/{scheduledPlanLogTag} | Delete a tag for a scheduledPlanLog.
*ScheduledPlanLogApi* | [**getDuplicateScheduledPlanLogById**](docs/ScheduledPlanLogApi.md#getDuplicateScheduledPlanLogById) | **GET** /beta/scheduledPlanLog/duplicate/{scheduledPlanLogId} | Get a duplicated a scheduledPlanLog by id
*ScheduledPlanLogApi* | [**getScheduledPlanLogByFilter**](docs/ScheduledPlanLogApi.md#getScheduledPlanLogByFilter) | **GET** /beta/scheduledPlanLog/search | Search scheduledPlanLogs by filter
*ScheduledPlanLogApi* | [**getScheduledPlanLogById**](docs/ScheduledPlanLogApi.md#getScheduledPlanLogById) | **GET** /beta/scheduledPlanLog/{scheduledPlanLogId} | Get a scheduledPlanLog by id
*ScheduledPlanLogApi* | [**getScheduledPlanLogFiles**](docs/ScheduledPlanLogApi.md#getScheduledPlanLogFiles) | **GET** /beta/scheduledPlanLog/{scheduledPlanLogId}/file | Get the files for a scheduledPlanLog.
*ScheduledPlanLogApi* | [**getScheduledPlanLogTags**](docs/ScheduledPlanLogApi.md#getScheduledPlanLogTags) | **GET** /beta/scheduledPlanLog/{scheduledPlanLogId}/tag | Get the tags for a scheduledPlanLog.
*ServiceTypeApi* | [**getServiceTypeById**](docs/ServiceTypeApi.md#getServiceTypeById) | **GET** /beta/serviceType/{serviceTypeId} | Get a serviceType by id
*ServiceTypeApi* | [**getServiceTypeBySearchText**](docs/ServiceTypeApi.md#getServiceTypeBySearchText) | **GET** /beta/serviceType/search | Search serviceTypes
*ShipmentApi* | [**addShipmentAudit**](docs/ShipmentApi.md#addShipmentAudit) | **PUT** /beta/shipment/{shipmentId}/audit/{shipmentAudit} | Add new audit for a shipment
*ShipmentApi* | [**addShipmentFile**](docs/ShipmentApi.md#addShipmentFile) | **POST** /beta/shipment/{shipmentId}/file/{fileName} | Attach a file to a shipment
*ShipmentApi* | [**addShipmentFileByURL**](docs/ShipmentApi.md#addShipmentFileByURL) | **POST** /beta/shipment/{shipmentId}/file | Attach a file to a shipment by URL.
*ShipmentApi* | [**addShipmentTag**](docs/ShipmentApi.md#addShipmentTag) | **PUT** /beta/shipment/{shipmentId}/tag/{shipmentTag} | Add new tags for a shipment.
*ShipmentApi* | [**deleteShipmentFile**](docs/ShipmentApi.md#deleteShipmentFile) | **DELETE** /beta/shipment/{shipmentId}/file/{fileId} | Delete a file for a shipment.
*ShipmentApi* | [**deleteShipmentTag**](docs/ShipmentApi.md#deleteShipmentTag) | **DELETE** /beta/shipment/{shipmentId}/tag/{shipmentTag} | Delete a tag for a shipment.
*ShipmentApi* | [**getDuplicateShipmentById**](docs/ShipmentApi.md#getDuplicateShipmentById) | **GET** /beta/shipment/duplicate/{shipmentId} | Get a duplicated a shipment by id
*ShipmentApi* | [**getShipmentByFilter**](docs/ShipmentApi.md#getShipmentByFilter) | **GET** /beta/shipment/search | Search shipments by filter
*ShipmentApi* | [**getShipmentById**](docs/ShipmentApi.md#getShipmentById) | **GET** /beta/shipment/{shipmentId} | Get a shipment by id
*ShipmentApi* | [**getShipmentFiles**](docs/ShipmentApi.md#getShipmentFiles) | **GET** /beta/shipment/{shipmentId}/file | Get the files for a shipment.
*ShipmentApi* | [**getShipmentTags**](docs/ShipmentApi.md#getShipmentTags) | **GET** /beta/shipment/{shipmentId}/tag | Get the tags for a shipment.
*ShipmentApi* | [**updateShipmentCustomFields**](docs/ShipmentApi.md#updateShipmentCustomFields) | **PUT** /beta/shipment/customFields | Update a shipment custom fields
*ShoppingCartConnectionApi* | [**addShoppingCartConnection**](docs/ShoppingCartConnectionApi.md#addShoppingCartConnection) | **POST** /beta/shoppingCartConnection | Create a shoppingCartConnection
*ShoppingCartConnectionApi* | [**addShoppingCartConnectionAudit**](docs/ShoppingCartConnectionApi.md#addShoppingCartConnectionAudit) | **PUT** /beta/shoppingCartConnection/{shoppingCartConnectionId}/audit/{shoppingCartConnectionAudit} | Add new audit for a shoppingCartConnection
*ShoppingCartConnectionApi* | [**addShoppingCartConnectionFile**](docs/ShoppingCartConnectionApi.md#addShoppingCartConnectionFile) | **POST** /beta/shoppingCartConnection/{shoppingCartConnectionId}/file/{fileName} | Attach a file to a shoppingCartConnection
*ShoppingCartConnectionApi* | [**addShoppingCartConnectionFileByURL**](docs/ShoppingCartConnectionApi.md#addShoppingCartConnectionFileByURL) | **POST** /beta/shoppingCartConnection/{shoppingCartConnectionId}/file | Attach a file to a shoppingCartConnection by URL.
*ShoppingCartConnectionApi* | [**addShoppingCartConnectionTag**](docs/ShoppingCartConnectionApi.md#addShoppingCartConnectionTag) | **PUT** /beta/shoppingCartConnection/{shoppingCartConnectionId}/tag/{shoppingCartConnectionTag} | Add new tags for a shoppingCartConnection.
*ShoppingCartConnectionApi* | [**deleteShoppingCartConnection**](docs/ShoppingCartConnectionApi.md#deleteShoppingCartConnection) | **DELETE** /beta/shoppingCartConnection/{shoppingCartConnectionId} | Delete a shoppingCartConnection
*ShoppingCartConnectionApi* | [**deleteShoppingCartConnectionFile**](docs/ShoppingCartConnectionApi.md#deleteShoppingCartConnectionFile) | **DELETE** /beta/shoppingCartConnection/{shoppingCartConnectionId}/file/{fileId} | Delete a file for a shoppingCartConnection.
*ShoppingCartConnectionApi* | [**deleteShoppingCartConnectionTag**](docs/ShoppingCartConnectionApi.md#deleteShoppingCartConnectionTag) | **DELETE** /beta/shoppingCartConnection/{shoppingCartConnectionId}/tag/{shoppingCartConnectionTag} | Delete a tag for a shoppingCartConnection.
*ShoppingCartConnectionApi* | [**getDuplicateShoppingCartConnectionById**](docs/ShoppingCartConnectionApi.md#getDuplicateShoppingCartConnectionById) | **GET** /beta/shoppingCartConnection/duplicate/{shoppingCartConnectionId} | Get a duplicated a shoppingCartConnection by id
*ShoppingCartConnectionApi* | [**getShoppingCartConnectionByFilter**](docs/ShoppingCartConnectionApi.md#getShoppingCartConnectionByFilter) | **GET** /beta/shoppingCartConnection/search | Search shoppingCartConnections by filter
*ShoppingCartConnectionApi* | [**getShoppingCartConnectionById**](docs/ShoppingCartConnectionApi.md#getShoppingCartConnectionById) | **GET** /beta/shoppingCartConnection/{shoppingCartConnectionId} | Get a shoppingCartConnection by id
*ShoppingCartConnectionApi* | [**getShoppingCartConnectionFiles**](docs/ShoppingCartConnectionApi.md#getShoppingCartConnectionFiles) | **GET** /beta/shoppingCartConnection/{shoppingCartConnectionId}/file | Get the files for a shoppingCartConnection.
*ShoppingCartConnectionApi* | [**getShoppingCartConnectionTags**](docs/ShoppingCartConnectionApi.md#getShoppingCartConnectionTags) | **GET** /beta/shoppingCartConnection/{shoppingCartConnectionId}/tag | Get the tags for a shoppingCartConnection.
*ShoppingCartConnectionApi* | [**updateShoppingCartConnection**](docs/ShoppingCartConnectionApi.md#updateShoppingCartConnection) | **PUT** /beta/shoppingCartConnection | Update a shoppingCartConnection
*ShoppingCartConnectionApi* | [**updateShoppingCartConnectionCustomFields**](docs/ShoppingCartConnectionApi.md#updateShoppingCartConnectionCustomFields) | **PUT** /beta/shoppingCartConnection/customFields | Update a shoppingCartConnection custom fields
*StandardBusinessDaysApi* | [**addStandardBusinessDays**](docs/StandardBusinessDaysApi.md#addStandardBusinessDays) | **POST** /beta/standardBusinessDays | Create a standardBusinessDays
*StandardBusinessDaysApi* | [**addStandardBusinessDaysAudit**](docs/StandardBusinessDaysApi.md#addStandardBusinessDaysAudit) | **PUT** /beta/standardBusinessDays/{standardBusinessDaysId}/audit/{standardBusinessDaysAudit} | Add new audit for a standardBusinessDays
*StandardBusinessDaysApi* | [**addStandardBusinessDaysFile**](docs/StandardBusinessDaysApi.md#addStandardBusinessDaysFile) | **POST** /beta/standardBusinessDays/{standardBusinessDaysId}/file/{fileName} | Attach a file to a standardBusinessDays
*StandardBusinessDaysApi* | [**addStandardBusinessDaysFileByURL**](docs/StandardBusinessDaysApi.md#addStandardBusinessDaysFileByURL) | **POST** /beta/standardBusinessDays/{standardBusinessDaysId}/file | Attach a file to a standardBusinessDays by URL.
*StandardBusinessDaysApi* | [**addStandardBusinessDaysTag**](docs/StandardBusinessDaysApi.md#addStandardBusinessDaysTag) | **PUT** /beta/standardBusinessDays/{standardBusinessDaysId}/tag/{standardBusinessDaysTag} | Add new tags for a standardBusinessDays.
*StandardBusinessDaysApi* | [**deleteStandardBusinessDays**](docs/StandardBusinessDaysApi.md#deleteStandardBusinessDays) | **DELETE** /beta/standardBusinessDays/{standardBusinessDaysId} | Delete a standardBusinessDays
*StandardBusinessDaysApi* | [**deleteStandardBusinessDaysFile**](docs/StandardBusinessDaysApi.md#deleteStandardBusinessDaysFile) | **DELETE** /beta/standardBusinessDays/{standardBusinessDaysId}/file/{fileId} | Delete a file for a standardBusinessDays.
*StandardBusinessDaysApi* | [**deleteStandardBusinessDaysTag**](docs/StandardBusinessDaysApi.md#deleteStandardBusinessDaysTag) | **DELETE** /beta/standardBusinessDays/{standardBusinessDaysId}/tag/{standardBusinessDaysTag} | Delete a tag for a standardBusinessDays.
*StandardBusinessDaysApi* | [**getDuplicateStandardBusinessDaysById**](docs/StandardBusinessDaysApi.md#getDuplicateStandardBusinessDaysById) | **GET** /beta/standardBusinessDays/duplicate/{standardBusinessDaysId} | Get a duplicated a standardBusinessDays by id
*StandardBusinessDaysApi* | [**getStandardBusinessDaysByFilter**](docs/StandardBusinessDaysApi.md#getStandardBusinessDaysByFilter) | **GET** /beta/standardBusinessDays/search | Search standardBusinessDayses by filter
*StandardBusinessDaysApi* | [**getStandardBusinessDaysById**](docs/StandardBusinessDaysApi.md#getStandardBusinessDaysById) | **GET** /beta/standardBusinessDays/{standardBusinessDaysId} | Get a standardBusinessDays by id
*StandardBusinessDaysApi* | [**getStandardBusinessDaysFiles**](docs/StandardBusinessDaysApi.md#getStandardBusinessDaysFiles) | **GET** /beta/standardBusinessDays/{standardBusinessDaysId}/file | Get the files for a standardBusinessDays.
*StandardBusinessDaysApi* | [**getStandardBusinessDaysTags**](docs/StandardBusinessDaysApi.md#getStandardBusinessDaysTags) | **GET** /beta/standardBusinessDays/{standardBusinessDaysId}/tag | Get the tags for a standardBusinessDays.
*StandardBusinessDaysApi* | [**updateStandardBusinessDays**](docs/StandardBusinessDaysApi.md#updateStandardBusinessDays) | **PUT** /beta/standardBusinessDays | Update a standardBusinessDays
*SubstitutionApi* | [**addSubstitution**](docs/SubstitutionApi.md#addSubstitution) | **POST** /beta/substitution | Create a substitution
*SubstitutionApi* | [**addSubstitutionAudit**](docs/SubstitutionApi.md#addSubstitutionAudit) | **PUT** /beta/substitution/{substitutionId}/audit/{substitutionAudit} | Add new audit for a substitution
*SubstitutionApi* | [**addSubstitutionFile**](docs/SubstitutionApi.md#addSubstitutionFile) | **POST** /beta/substitution/{substitutionId}/file/{fileName} | Attach a file to a substitution
*SubstitutionApi* | [**addSubstitutionFileByURL**](docs/SubstitutionApi.md#addSubstitutionFileByURL) | **POST** /beta/substitution/{substitutionId}/file | Attach a file to a substitution by URL.
*SubstitutionApi* | [**addSubstitutionTag**](docs/SubstitutionApi.md#addSubstitutionTag) | **PUT** /beta/substitution/{substitutionId}/tag/{substitutionTag} | Add new tags for a substitution.
*SubstitutionApi* | [**deleteSubstitution**](docs/SubstitutionApi.md#deleteSubstitution) | **DELETE** /beta/substitution/{substitutionId} | Delete a substitution
*SubstitutionApi* | [**deleteSubstitutionFile**](docs/SubstitutionApi.md#deleteSubstitutionFile) | **DELETE** /beta/substitution/{substitutionId}/file/{fileId} | Delete a file for a substitution.
*SubstitutionApi* | [**deleteSubstitutionTag**](docs/SubstitutionApi.md#deleteSubstitutionTag) | **DELETE** /beta/substitution/{substitutionId}/tag/{substitutionTag} | Delete a tag for a substitution.
*SubstitutionApi* | [**getDuplicateSubstitutionById**](docs/SubstitutionApi.md#getDuplicateSubstitutionById) | **GET** /beta/substitution/duplicate/{substitutionId} | Get a duplicated a substitution by id
*SubstitutionApi* | [**getSubstitutionByFilter**](docs/SubstitutionApi.md#getSubstitutionByFilter) | **GET** /beta/substitution/search | Search substitutions by filter
*SubstitutionApi* | [**getSubstitutionById**](docs/SubstitutionApi.md#getSubstitutionById) | **GET** /beta/substitution/{substitutionId} | Get a substitution by id
*SubstitutionApi* | [**getSubstitutionFiles**](docs/SubstitutionApi.md#getSubstitutionFiles) | **GET** /beta/substitution/{substitutionId}/file | Get the files for a substitution.
*SubstitutionApi* | [**getSubstitutionTags**](docs/SubstitutionApi.md#getSubstitutionTags) | **GET** /beta/substitution/{substitutionId}/tag | Get the tags for a substitution.
*SubstitutionApi* | [**updateSubstitution**](docs/SubstitutionApi.md#updateSubstitution) | **PUT** /beta/substitution | Update a substitution
*SubstitutionApi* | [**updateSubstitutionCustomFields**](docs/SubstitutionApi.md#updateSubstitutionCustomFields) | **PUT** /beta/substitution/customFields | Update a substitution custom fields
*SupplementApi* | [**addSupplement**](docs/SupplementApi.md#addSupplement) | **POST** /beta/supplement | Create a supplement
*SupplementApi* | [**addSupplementAudit**](docs/SupplementApi.md#addSupplementAudit) | **PUT** /beta/supplement/{supplementId}/audit/{supplementAudit} | Add new audit for a supplement
*SupplementApi* | [**addSupplementFile**](docs/SupplementApi.md#addSupplementFile) | **POST** /beta/supplement/{supplementId}/file/{fileName} | Attach a file to a supplement
*SupplementApi* | [**addSupplementFileByURL**](docs/SupplementApi.md#addSupplementFileByURL) | **POST** /beta/supplement/{supplementId}/file | Attach a file to a supplement by URL.
*SupplementApi* | [**addSupplementTag**](docs/SupplementApi.md#addSupplementTag) | **PUT** /beta/supplement/{supplementId}/tag/{supplementTag} | Add new tags for a supplement.
*SupplementApi* | [**deleteSupplement**](docs/SupplementApi.md#deleteSupplement) | **DELETE** /beta/supplement/{supplementId} | Delete a supplement
*SupplementApi* | [**deleteSupplementFile**](docs/SupplementApi.md#deleteSupplementFile) | **DELETE** /beta/supplement/{supplementId}/file/{fileId} | Delete a file for a supplement.
*SupplementApi* | [**deleteSupplementTag**](docs/SupplementApi.md#deleteSupplementTag) | **DELETE** /beta/supplement/{supplementId}/tag/{supplementTag} | Delete a tag for a supplement.
*SupplementApi* | [**getDuplicateSupplementById**](docs/SupplementApi.md#getDuplicateSupplementById) | **GET** /beta/supplement/duplicate/{supplementId} | Get a duplicated a supplement by id
*SupplementApi* | [**getSupplementByFilter**](docs/SupplementApi.md#getSupplementByFilter) | **GET** /beta/supplement/search | Search supplements by filter
*SupplementApi* | [**getSupplementById**](docs/SupplementApi.md#getSupplementById) | **GET** /beta/supplement/{supplementId} | Get a supplement by id
*SupplementApi* | [**getSupplementFiles**](docs/SupplementApi.md#getSupplementFiles) | **GET** /beta/supplement/{supplementId}/file | Get the files for a supplement.
*SupplementApi* | [**getSupplementTags**](docs/SupplementApi.md#getSupplementTags) | **GET** /beta/supplement/{supplementId}/tag | Get the tags for a supplement.
*SupplementApi* | [**updateSupplement**](docs/SupplementApi.md#updateSupplement) | **PUT** /beta/supplement | Update a supplement
*SupplementApi* | [**updateSupplementCustomFields**](docs/SupplementApi.md#updateSupplementCustomFields) | **PUT** /beta/supplement/customFields | Update a supplement custom fields
*ThirdPartyParcelAccountApi* | [**addThirdPartyParcelAccount**](docs/ThirdPartyParcelAccountApi.md#addThirdPartyParcelAccount) | **POST** /beta/thirdPartyParcelAccount | Create a thirdPartyParcelAccount
*ThirdPartyParcelAccountApi* | [**addThirdPartyParcelAccountAudit**](docs/ThirdPartyParcelAccountApi.md#addThirdPartyParcelAccountAudit) | **PUT** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/audit/{thirdPartyParcelAccountAudit} | Add new audit for a thirdPartyParcelAccount
*ThirdPartyParcelAccountApi* | [**addThirdPartyParcelAccountFile**](docs/ThirdPartyParcelAccountApi.md#addThirdPartyParcelAccountFile) | **POST** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/file/{fileName} | Attach a file to a thirdPartyParcelAccount
*ThirdPartyParcelAccountApi* | [**addThirdPartyParcelAccountFileByURL**](docs/ThirdPartyParcelAccountApi.md#addThirdPartyParcelAccountFileByURL) | **POST** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/file | Attach a file to a thirdPartyParcelAccount by URL.
*ThirdPartyParcelAccountApi* | [**addThirdPartyParcelAccountTag**](docs/ThirdPartyParcelAccountApi.md#addThirdPartyParcelAccountTag) | **PUT** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/tag/{thirdPartyParcelAccountTag} | Add new tags for a thirdPartyParcelAccount.
*ThirdPartyParcelAccountApi* | [**deleteThirdPartyParcelAccount**](docs/ThirdPartyParcelAccountApi.md#deleteThirdPartyParcelAccount) | **DELETE** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId} | Delete a thirdPartyParcelAccount
*ThirdPartyParcelAccountApi* | [**deleteThirdPartyParcelAccountFile**](docs/ThirdPartyParcelAccountApi.md#deleteThirdPartyParcelAccountFile) | **DELETE** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/file/{fileId} | Delete a file for a thirdPartyParcelAccount.
*ThirdPartyParcelAccountApi* | [**deleteThirdPartyParcelAccountTag**](docs/ThirdPartyParcelAccountApi.md#deleteThirdPartyParcelAccountTag) | **DELETE** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/tag/{thirdPartyParcelAccountTag} | Delete a tag for a thirdPartyParcelAccount.
*ThirdPartyParcelAccountApi* | [**getDuplicateThirdPartyParcelAccountById**](docs/ThirdPartyParcelAccountApi.md#getDuplicateThirdPartyParcelAccountById) | **GET** /beta/thirdPartyParcelAccount/duplicate/{thirdPartyParcelAccountId} | Get a duplicated a thirdPartyParcelAccount by id
*ThirdPartyParcelAccountApi* | [**getThirdPartyParcelAccountByFilter**](docs/ThirdPartyParcelAccountApi.md#getThirdPartyParcelAccountByFilter) | **GET** /beta/thirdPartyParcelAccount/search | Search thirdPartyParcelAccounts by filter
*ThirdPartyParcelAccountApi* | [**getThirdPartyParcelAccountById**](docs/ThirdPartyParcelAccountApi.md#getThirdPartyParcelAccountById) | **GET** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId} | Get a thirdPartyParcelAccount by id
*ThirdPartyParcelAccountApi* | [**getThirdPartyParcelAccountFiles**](docs/ThirdPartyParcelAccountApi.md#getThirdPartyParcelAccountFiles) | **GET** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/file | Get the files for a thirdPartyParcelAccount.
*ThirdPartyParcelAccountApi* | [**getThirdPartyParcelAccountTags**](docs/ThirdPartyParcelAccountApi.md#getThirdPartyParcelAccountTags) | **GET** /beta/thirdPartyParcelAccount/{thirdPartyParcelAccountId}/tag | Get the tags for a thirdPartyParcelAccount.
*ThirdPartyParcelAccountApi* | [**updateThirdPartyParcelAccount**](docs/ThirdPartyParcelAccountApi.md#updateThirdPartyParcelAccount) | **PUT** /beta/thirdPartyParcelAccount | Update a thirdPartyParcelAccount
*ThirdPartyParcelAccountApi* | [**updateThirdPartyParcelAccountCustomFields**](docs/ThirdPartyParcelAccountApi.md#updateThirdPartyParcelAccountCustomFields) | **PUT** /beta/thirdPartyParcelAccount/customFields | Update a thirdPartyParcelAccount custom fields
*UserApi* | [**getUserById**](docs/UserApi.md#getUserById) | **GET** /beta/user/{userId} | Get an user by id
*UserApi* | [**getUserBySearchText**](docs/UserApi.md#getUserBySearchText) | **GET** /beta/user/search | Search users
*VendorApi* | [**addVendor**](docs/VendorApi.md#addVendor) | **POST** /beta/vendor | Create a vendor
*VendorApi* | [**addVendorAudit**](docs/VendorApi.md#addVendorAudit) | **PUT** /beta/vendor/{vendorId}/audit/{vendorAudit} | Add new audit for a vendor
*VendorApi* | [**addVendorFile**](docs/VendorApi.md#addVendorFile) | **POST** /beta/vendor/{vendorId}/file/{fileName} | Attach a file to a vendor
*VendorApi* | [**addVendorFileByURL**](docs/VendorApi.md#addVendorFileByURL) | **POST** /beta/vendor/{vendorId}/file | Attach a file to a vendor by URL.
*VendorApi* | [**addVendorTag**](docs/VendorApi.md#addVendorTag) | **PUT** /beta/vendor/{vendorId}/tag/{vendorTag} | Add new tags for a vendor.
*VendorApi* | [**deleteVendor**](docs/VendorApi.md#deleteVendor) | **DELETE** /beta/vendor/{vendorId} | Delete a vendor
*VendorApi* | [**deleteVendorFile**](docs/VendorApi.md#deleteVendorFile) | **DELETE** /beta/vendor/{vendorId}/file/{fileId} | Delete a file for a vendor.
*VendorApi* | [**deleteVendorTag**](docs/VendorApi.md#deleteVendorTag) | **DELETE** /beta/vendor/{vendorId}/tag/{vendorTag} | Delete a tag for a vendor.
*VendorApi* | [**getDuplicateVendorById**](docs/VendorApi.md#getDuplicateVendorById) | **GET** /beta/vendor/duplicate/{vendorId} | Get a duplicated a vendor by id
*VendorApi* | [**getVendorByFilter**](docs/VendorApi.md#getVendorByFilter) | **GET** /beta/vendor/search | Search vendors by filter
*VendorApi* | [**getVendorById**](docs/VendorApi.md#getVendorById) | **GET** /beta/vendor/{vendorId} | Get a vendor by id
*VendorApi* | [**getVendorFiles**](docs/VendorApi.md#getVendorFiles) | **GET** /beta/vendor/{vendorId}/file | Get the files for a vendor.
*VendorApi* | [**getVendorTags**](docs/VendorApi.md#getVendorTags) | **GET** /beta/vendor/{vendorId}/tag | Get the tags for a vendor.
*VendorApi* | [**updateVendor**](docs/VendorApi.md#updateVendor) | **PUT** /beta/vendor | Update a vendor
*VendorApi* | [**updateVendorCustomFields**](docs/VendorApi.md#updateVendorCustomFields) | **PUT** /beta/vendor/customFields | Update a vendor custom fields
*VendorComplianceSurveyApi* | [**addVendorComplianceSurvey**](docs/VendorComplianceSurveyApi.md#addVendorComplianceSurvey) | **POST** /beta/vendorComplianceSurvey | Create a vendorComplianceSurvey
*VendorComplianceSurveyApi* | [**addVendorComplianceSurveyAudit**](docs/VendorComplianceSurveyApi.md#addVendorComplianceSurveyAudit) | **PUT** /beta/vendorComplianceSurvey/{vendorComplianceSurveyId}/audit/{vendorComplianceSurveyAudit} | Add new audit for a vendorComplianceSurvey
*VendorComplianceSurveyApi* | [**addVendorComplianceSurveyFile**](docs/VendorComplianceSurveyApi.md#addVendorComplianceSurveyFile) | **POST** /beta/vendorComplianceSurvey/{vendorComplianceSurveyId}/file/{fileName} | Attach a file to a vendorComplianceSurvey
*VendorComplianceSurveyApi* | [**addVendorComplianceSurveyFileByURL**](docs/VendorComplianceSurveyApi.md#addVendorComplianceSurveyFileByURL) | **POST** /beta/vendorComplianceSurvey/{vendorComplianceSurveyId}/file | Attach a file to a vendorComplianceSurvey by URL.
*VendorComplianceSurveyApi* | [**addVendorComplianceSurveyTag**](docs/VendorComplianceSurveyApi.md#addVendorComplianceSurveyTag) | **PUT** /beta/vendorComplianceSurvey/{vendorComplianceSurveyId}/tag/{vendorComplianceSurveyTag} | Add new tags for a vendorComplianceSurvey.
*VendorComplianceSurveyApi* | [**deleteVendorComplianceSurvey**](docs/VendorComplianceSurveyApi.md#deleteVendorComplianceSurvey) | **DELETE** /beta/vendorComplianceSurvey/{vendorComplianceSurveyId} | Delete a vendorComplianceSurvey
*VendorComplianceSurveyApi* | [**deleteVendorComplianceSurveyFile**](docs/VendorComplianceSurveyApi.md#deleteVendorComplianceSurveyFile) | **DELETE** /beta/vendorComplianceSurvey/{vendorComplianceSurveyId}/file/{fileId} | Delete a file for a vendorComplianceSurvey.
*VendorComplianceSurveyApi* | [**deleteVendorComplianceSurveyTag**](docs/VendorComplianceSurveyApi.md#deleteVendorComplianceSurveyTag) | **DELETE** /beta/vendorComplianceSurvey/{vendorComplianceSurveyId}/tag/{vendorComplianceSurveyTag} | Delete a tag for a vendorComplianceSurvey.
*VendorComplianceSurveyApi* | [**getDuplicateVendorComplianceSurveyById**](docs/VendorComplianceSurveyApi.md#getDuplicateVendorComplianceSurveyById) | **GET** /beta/vendorComplianceSurvey/duplicate/{vendorComplianceSurveyId} | Get a duplicated a vendorComplianceSurvey by id
*VendorComplianceSurveyApi* | [**getVendorComplianceSurveyByFilter**](docs/VendorComplianceSurveyApi.md#getVendorComplianceSurveyByFilter) | **GET** /beta/vendorComplianceSurvey/search | Search vendorComplianceSurveys by filter
*VendorComplianceSurveyApi* | [**getVendorComplianceSurveyById**](docs/VendorComplianceSurveyApi.md#getVendorComplianceSurveyById) | **GET** /beta/vendorComplianceSurvey/{vendorComplianceSurveyId} | Get a vendorComplianceSurvey by id
*VendorComplianceSurveyApi* | [**getVendorComplianceSurveyFiles**](docs/VendorComplianceSurveyApi.md#getVendorComplianceSurveyFiles) | **GET** /beta/vendorComplianceSurvey/{vendorComplianceSurveyId}/file | Get the files for a vendorComplianceSurvey.
*VendorComplianceSurveyApi* | [**getVendorComplianceSurveyTags**](docs/VendorComplianceSurveyApi.md#getVendorComplianceSurveyTags) | **GET** /beta/vendorComplianceSurvey/{vendorComplianceSurveyId}/tag | Get the tags for a vendorComplianceSurvey.
*VendorComplianceSurveyApi* | [**updateVendorComplianceSurvey**](docs/VendorComplianceSurveyApi.md#updateVendorComplianceSurvey) | **PUT** /beta/vendorComplianceSurvey | Update a vendorComplianceSurvey
*VendorComplianceSurveyApi* | [**updateVendorComplianceSurveyCustomFields**](docs/VendorComplianceSurveyApi.md#updateVendorComplianceSurveyCustomFields) | **PUT** /beta/vendorComplianceSurvey/customFields | Update a vendorComplianceSurvey custom fields
*WarehouseApi* | [**addWarehouse**](docs/WarehouseApi.md#addWarehouse) | **POST** /beta/warehouse | Create a warehouse
*WarehouseApi* | [**addWarehouseAudit**](docs/WarehouseApi.md#addWarehouseAudit) | **PUT** /beta/warehouse/{warehouseId}/audit/{warehouseAudit} | Add new audit for a warehouse
*WarehouseApi* | [**addWarehouseFile**](docs/WarehouseApi.md#addWarehouseFile) | **POST** /beta/warehouse/{warehouseId}/file/{fileName} | Attach a file to a warehouse
*WarehouseApi* | [**addWarehouseFileByURL**](docs/WarehouseApi.md#addWarehouseFileByURL) | **POST** /beta/warehouse/{warehouseId}/file | Attach a file to a warehouse by URL.
*WarehouseApi* | [**addWarehouseTag**](docs/WarehouseApi.md#addWarehouseTag) | **PUT** /beta/warehouse/{warehouseId}/tag/{warehouseTag} | Add new tags for a warehouse.
*WarehouseApi* | [**deleteWarehouseFile**](docs/WarehouseApi.md#deleteWarehouseFile) | **DELETE** /beta/warehouse/{warehouseId}/file/{fileId} | Delete a file for a warehouse.
*WarehouseApi* | [**deleteWarehouseTag**](docs/WarehouseApi.md#deleteWarehouseTag) | **DELETE** /beta/warehouse/{warehouseId}/tag/{warehouseTag} | Delete a tag for a warehouse.
*WarehouseApi* | [**getDuplicateWarehouseById**](docs/WarehouseApi.md#getDuplicateWarehouseById) | **GET** /beta/warehouse/duplicate/{warehouseId} | Get a duplicated a warehouse by id
*WarehouseApi* | [**getWarehouseByFilter**](docs/WarehouseApi.md#getWarehouseByFilter) | **GET** /beta/warehouse/search | Search warehouses by filter
*WarehouseApi* | [**getWarehouseById**](docs/WarehouseApi.md#getWarehouseById) | **GET** /beta/warehouse/{warehouseId} | Get a warehouse by id
*WarehouseApi* | [**getWarehouseFiles**](docs/WarehouseApi.md#getWarehouseFiles) | **GET** /beta/warehouse/{warehouseId}/file | Get the files for a warehouse.
*WarehouseApi* | [**getWarehouseTags**](docs/WarehouseApi.md#getWarehouseTags) | **GET** /beta/warehouse/{warehouseId}/tag | Get the tags for a warehouse.
*WarehouseApi* | [**updateWarehouse**](docs/WarehouseApi.md#updateWarehouse) | **PUT** /beta/warehouse | Update a warehouse
*WarehouseApi* | [**updateWarehouseCustomFields**](docs/WarehouseApi.md#updateWarehouseCustomFields) | **PUT** /beta/warehouse/customFields | Update a warehouse custom fields
*WarehouseDocumentApi* | [**addWarehouseDocumentAudit**](docs/WarehouseDocumentApi.md#addWarehouseDocumentAudit) | **PUT** /beta/warehouseDocument/{warehouseDocumentId}/audit/{warehouseDocumentAudit} | Add new audit for a warehouseDocument
*WarehouseDocumentApi* | [**addWarehouseDocumentFile**](docs/WarehouseDocumentApi.md#addWarehouseDocumentFile) | **POST** /beta/warehouseDocument/{warehouseDocumentId}/file/{fileName} | Attach a file to a warehouseDocument
*WarehouseDocumentApi* | [**addWarehouseDocumentFileByURL**](docs/WarehouseDocumentApi.md#addWarehouseDocumentFileByURL) | **POST** /beta/warehouseDocument/{warehouseDocumentId}/file | Attach a file to a warehouseDocument by URL.
*WarehouseDocumentApi* | [**addWarehouseDocumentTag**](docs/WarehouseDocumentApi.md#addWarehouseDocumentTag) | **PUT** /beta/warehouseDocument/{warehouseDocumentId}/tag/{warehouseDocumentTag} | Add new tags for a warehouseDocument.
*WarehouseDocumentApi* | [**deleteWarehouseDocumentFile**](docs/WarehouseDocumentApi.md#deleteWarehouseDocumentFile) | **DELETE** /beta/warehouseDocument/{warehouseDocumentId}/file/{fileId} | Delete a file for a warehouseDocument.
*WarehouseDocumentApi* | [**deleteWarehouseDocumentTag**](docs/WarehouseDocumentApi.md#deleteWarehouseDocumentTag) | **DELETE** /beta/warehouseDocument/{warehouseDocumentId}/tag/{warehouseDocumentTag} | Delete a tag for a warehouseDocument.
*WarehouseDocumentApi* | [**getDuplicateWarehouseDocumentById**](docs/WarehouseDocumentApi.md#getDuplicateWarehouseDocumentById) | **GET** /beta/warehouseDocument/duplicate/{warehouseDocumentId} | Get a duplicated a warehouseDocument by id
*WarehouseDocumentApi* | [**getWarehouseDocumentByFilter**](docs/WarehouseDocumentApi.md#getWarehouseDocumentByFilter) | **GET** /beta/warehouseDocument/search | Search warehouseDocuments by filter
*WarehouseDocumentApi* | [**getWarehouseDocumentById**](docs/WarehouseDocumentApi.md#getWarehouseDocumentById) | **GET** /beta/warehouseDocument/{warehouseDocumentId} | Get a warehouseDocument by id
*WarehouseDocumentApi* | [**getWarehouseDocumentFiles**](docs/WarehouseDocumentApi.md#getWarehouseDocumentFiles) | **GET** /beta/warehouseDocument/{warehouseDocumentId}/file | Get the files for a warehouseDocument.
*WarehouseDocumentApi* | [**getWarehouseDocumentTags**](docs/WarehouseDocumentApi.md#getWarehouseDocumentTags) | **GET** /beta/warehouseDocument/{warehouseDocumentId}/tag | Get the tags for a warehouseDocument.
*WarehouseDocumentApi* | [**updateWarehouseDocumentCustomFields**](docs/WarehouseDocumentApi.md#updateWarehouseDocumentCustomFields) | **PUT** /beta/warehouseDocument/customFields | Update a warehouseDocument custom fields
*WarehouseDocumentTypeApi* | [**addWarehouseDocumentTypeAudit**](docs/WarehouseDocumentTypeApi.md#addWarehouseDocumentTypeAudit) | **PUT** /beta/warehouseDocumentType/{warehouseDocumentTypeId}/audit/{warehouseDocumentTypeAudit} | Add new audit for a warehouseDocumentType
*WarehouseDocumentTypeApi* | [**addWarehouseDocumentTypeFile**](docs/WarehouseDocumentTypeApi.md#addWarehouseDocumentTypeFile) | **POST** /beta/warehouseDocumentType/{warehouseDocumentTypeId}/file/{fileName} | Attach a file to a warehouseDocumentType
*WarehouseDocumentTypeApi* | [**addWarehouseDocumentTypeFileByURL**](docs/WarehouseDocumentTypeApi.md#addWarehouseDocumentTypeFileByURL) | **POST** /beta/warehouseDocumentType/{warehouseDocumentTypeId}/file | Attach a file to a warehouseDocumentType by URL.
*WarehouseDocumentTypeApi* | [**addWarehouseDocumentTypeTag**](docs/WarehouseDocumentTypeApi.md#addWarehouseDocumentTypeTag) | **PUT** /beta/warehouseDocumentType/{warehouseDocumentTypeId}/tag/{warehouseDocumentTypeTag} | Add new tags for a warehouseDocumentType.
*WarehouseDocumentTypeApi* | [**deleteWarehouseDocumentTypeFile**](docs/WarehouseDocumentTypeApi.md#deleteWarehouseDocumentTypeFile) | **DELETE** /beta/warehouseDocumentType/{warehouseDocumentTypeId}/file/{fileId} | Delete a file for a warehouseDocumentType.
*WarehouseDocumentTypeApi* | [**deleteWarehouseDocumentTypeTag**](docs/WarehouseDocumentTypeApi.md#deleteWarehouseDocumentTypeTag) | **DELETE** /beta/warehouseDocumentType/{warehouseDocumentTypeId}/tag/{warehouseDocumentTypeTag} | Delete a tag for a warehouseDocumentType.
*WarehouseDocumentTypeApi* | [**getDuplicateWarehouseDocumentTypeById**](docs/WarehouseDocumentTypeApi.md#getDuplicateWarehouseDocumentTypeById) | **GET** /beta/warehouseDocumentType/duplicate/{warehouseDocumentTypeId} | Get a duplicated a warehouseDocumentType by id
*WarehouseDocumentTypeApi* | [**getWarehouseDocumentTypeByFilter**](docs/WarehouseDocumentTypeApi.md#getWarehouseDocumentTypeByFilter) | **GET** /beta/warehouseDocumentType/search | Search warehouseDocumentTypes by filter
*WarehouseDocumentTypeApi* | [**getWarehouseDocumentTypeById**](docs/WarehouseDocumentTypeApi.md#getWarehouseDocumentTypeById) | **GET** /beta/warehouseDocumentType/{warehouseDocumentTypeId} | Get a warehouseDocumentType by id
*WarehouseDocumentTypeApi* | [**getWarehouseDocumentTypeFiles**](docs/WarehouseDocumentTypeApi.md#getWarehouseDocumentTypeFiles) | **GET** /beta/warehouseDocumentType/{warehouseDocumentTypeId}/file | Get the files for a warehouseDocumentType.
*WarehouseDocumentTypeApi* | [**getWarehouseDocumentTypeTags**](docs/WarehouseDocumentTypeApi.md#getWarehouseDocumentTypeTags) | **GET** /beta/warehouseDocumentType/{warehouseDocumentTypeId}/tag | Get the tags for a warehouseDocumentType.
*WarehouseInventoryApi* | [**addWarehouseInventoryAudit**](docs/WarehouseInventoryApi.md#addWarehouseInventoryAudit) | **PUT** /beta/warehouseInventory/{warehouseInventoryId}/audit/{warehouseInventoryAudit} | Add new audit for a warehouseInventory
*WarehouseInventoryApi* | [**addWarehouseInventoryFile**](docs/WarehouseInventoryApi.md#addWarehouseInventoryFile) | **POST** /beta/warehouseInventory/{warehouseInventoryId}/file/{fileName} | Attach a file to a warehouseInventory
*WarehouseInventoryApi* | [**addWarehouseInventoryFileByURL**](docs/WarehouseInventoryApi.md#addWarehouseInventoryFileByURL) | **POST** /beta/warehouseInventory/{warehouseInventoryId}/file | Attach a file to a warehouseInventory by URL.
*WarehouseInventoryApi* | [**addWarehouseInventoryTag**](docs/WarehouseInventoryApi.md#addWarehouseInventoryTag) | **PUT** /beta/warehouseInventory/{warehouseInventoryId}/tag/{warehouseInventoryTag} | Add new tags for a warehouseInventory.
*WarehouseInventoryApi* | [**deleteWarehouseInventoryFile**](docs/WarehouseInventoryApi.md#deleteWarehouseInventoryFile) | **DELETE** /beta/warehouseInventory/{warehouseInventoryId}/file/{fileId} | Delete a file for a warehouseInventory.
*WarehouseInventoryApi* | [**deleteWarehouseInventoryTag**](docs/WarehouseInventoryApi.md#deleteWarehouseInventoryTag) | **DELETE** /beta/warehouseInventory/{warehouseInventoryId}/tag/{warehouseInventoryTag} | Delete a tag for a warehouseInventory.
*WarehouseInventoryApi* | [**getDuplicateWarehouseInventoryById**](docs/WarehouseInventoryApi.md#getDuplicateWarehouseInventoryById) | **GET** /beta/warehouseInventory/duplicate/{warehouseInventoryId} | Get a duplicated a warehouseInventory by id
*WarehouseInventoryApi* | [**getWarehouseInventoryByFilter**](docs/WarehouseInventoryApi.md#getWarehouseInventoryByFilter) | **GET** /beta/warehouseInventory/search | Search warehouseInventorys by filter
*WarehouseInventoryApi* | [**getWarehouseInventoryById**](docs/WarehouseInventoryApi.md#getWarehouseInventoryById) | **GET** /beta/warehouseInventory/{warehouseInventoryId} | Get a warehouseInventory by id
*WarehouseInventoryApi* | [**getWarehouseInventoryFiles**](docs/WarehouseInventoryApi.md#getWarehouseInventoryFiles) | **GET** /beta/warehouseInventory/{warehouseInventoryId}/file | Get the files for a warehouseInventory.
*WarehouseInventoryApi* | [**getWarehouseInventoryTags**](docs/WarehouseInventoryApi.md#getWarehouseInventoryTags) | **GET** /beta/warehouseInventory/{warehouseInventoryId}/tag | Get the tags for a warehouseInventory.
*WarehouseServiceTypeApi* | [**addWarehouseServiceType**](docs/WarehouseServiceTypeApi.md#addWarehouseServiceType) | **POST** /beta/warehouseServiceType | Create a warehouseServiceType
*WarehouseServiceTypeApi* | [**addWarehouseServiceTypeAudit**](docs/WarehouseServiceTypeApi.md#addWarehouseServiceTypeAudit) | **PUT** /beta/warehouseServiceType/{warehouseServiceTypeId}/audit/{warehouseServiceTypeAudit} | Add new audit for a warehouseServiceType
*WarehouseServiceTypeApi* | [**addWarehouseServiceTypeFile**](docs/WarehouseServiceTypeApi.md#addWarehouseServiceTypeFile) | **POST** /beta/warehouseServiceType/{warehouseServiceTypeId}/file/{fileName} | Attach a file to a warehouseServiceType
*WarehouseServiceTypeApi* | [**addWarehouseServiceTypeFileByURL**](docs/WarehouseServiceTypeApi.md#addWarehouseServiceTypeFileByURL) | **POST** /beta/warehouseServiceType/{warehouseServiceTypeId}/file | Attach a file to a warehouseServiceType by URL.
*WarehouseServiceTypeApi* | [**addWarehouseServiceTypeTag**](docs/WarehouseServiceTypeApi.md#addWarehouseServiceTypeTag) | **PUT** /beta/warehouseServiceType/{warehouseServiceTypeId}/tag/{warehouseServiceTypeTag} | Add new tags for a warehouseServiceType.
*WarehouseServiceTypeApi* | [**deleteWarehouseServiceType**](docs/WarehouseServiceTypeApi.md#deleteWarehouseServiceType) | **DELETE** /beta/warehouseServiceType/{warehouseServiceTypeId} | Delete a warehouseServiceType
*WarehouseServiceTypeApi* | [**deleteWarehouseServiceTypeFile**](docs/WarehouseServiceTypeApi.md#deleteWarehouseServiceTypeFile) | **DELETE** /beta/warehouseServiceType/{warehouseServiceTypeId}/file/{fileId} | Delete a file for a warehouseServiceType.
*WarehouseServiceTypeApi* | [**deleteWarehouseServiceTypeTag**](docs/WarehouseServiceTypeApi.md#deleteWarehouseServiceTypeTag) | **DELETE** /beta/warehouseServiceType/{warehouseServiceTypeId}/tag/{warehouseServiceTypeTag} | Delete a tag for a warehouseServiceType.
*WarehouseServiceTypeApi* | [**getDuplicateWarehouseServiceTypeById**](docs/WarehouseServiceTypeApi.md#getDuplicateWarehouseServiceTypeById) | **GET** /beta/warehouseServiceType/duplicate/{warehouseServiceTypeId} | Get a duplicated a warehouseServiceType by id
*WarehouseServiceTypeApi* | [**getWarehouseServiceTypeByFilter**](docs/WarehouseServiceTypeApi.md#getWarehouseServiceTypeByFilter) | **GET** /beta/warehouseServiceType/search | Search warehouseServiceTypes by filter
*WarehouseServiceTypeApi* | [**getWarehouseServiceTypeById**](docs/WarehouseServiceTypeApi.md#getWarehouseServiceTypeById) | **GET** /beta/warehouseServiceType/{warehouseServiceTypeId} | Get a warehouseServiceType by id
*WarehouseServiceTypeApi* | [**getWarehouseServiceTypeFiles**](docs/WarehouseServiceTypeApi.md#getWarehouseServiceTypeFiles) | **GET** /beta/warehouseServiceType/{warehouseServiceTypeId}/file | Get the files for a warehouseServiceType.
*WarehouseServiceTypeApi* | [**getWarehouseServiceTypeTags**](docs/WarehouseServiceTypeApi.md#getWarehouseServiceTypeTags) | **GET** /beta/warehouseServiceType/{warehouseServiceTypeId}/tag | Get the tags for a warehouseServiceType.
*WarehouseServiceTypeApi* | [**updateWarehouseServiceType**](docs/WarehouseServiceTypeApi.md#updateWarehouseServiceType) | **PUT** /beta/warehouseServiceType | Update a warehouseServiceType
*WarehouseServiceTypeApi* | [**updateWarehouseServiceTypeCustomFields**](docs/WarehouseServiceTypeApi.md#updateWarehouseServiceTypeCustomFields) | **PUT** /beta/warehouseServiceType/customFields | Update a warehouseServiceType custom fields
*WorkApi* | [**addWorkAudit**](docs/WorkApi.md#addWorkAudit) | **PUT** /beta/work/{workId}/audit/{workAudit} | Add new audit for a work
*WorkApi* | [**addWorkFile**](docs/WorkApi.md#addWorkFile) | **POST** /beta/work/{workId}/file/{fileName} | Attach a file to a work
*WorkApi* | [**addWorkFileByURL**](docs/WorkApi.md#addWorkFileByURL) | **POST** /beta/work/{workId}/file | Attach a file to a work by URL.
*WorkApi* | [**addWorkTag**](docs/WorkApi.md#addWorkTag) | **PUT** /beta/work/{workId}/tag/{workTag} | Add new tags for a work.
*WorkApi* | [**deleteWorkFile**](docs/WorkApi.md#deleteWorkFile) | **DELETE** /beta/work/{workId}/file/{fileId} | Delete a file for a work.
*WorkApi* | [**deleteWorkTag**](docs/WorkApi.md#deleteWorkTag) | **DELETE** /beta/work/{workId}/tag/{workTag} | Delete a tag for a work.
*WorkApi* | [**getDuplicateWorkById**](docs/WorkApi.md#getDuplicateWorkById) | **GET** /beta/work/duplicate/{workId} | Get a duplicated a work by id
*WorkApi* | [**getWorkByFilter**](docs/WorkApi.md#getWorkByFilter) | **GET** /beta/work/search | Search works by filter
*WorkApi* | [**getWorkById**](docs/WorkApi.md#getWorkById) | **GET** /beta/work/{workId} | Get a work by id
*WorkApi* | [**getWorkFiles**](docs/WorkApi.md#getWorkFiles) | **GET** /beta/work/{workId}/file | Get the files for a work.
*WorkApi* | [**getWorkTags**](docs/WorkApi.md#getWorkTags) | **GET** /beta/work/{workId}/tag | Get the tags for a work.
*WorkApi* | [**updateWork**](docs/WorkApi.md#updateWork) | **PUT** /beta/work | Update a work
*WorkApi* | [**updateWorkCustomFields**](docs/WorkApi.md#updateWorkCustomFields) | **PUT** /beta/work/customFields | Update a work custom fields
*WorkActivityApi* | [**addWorkActivity**](docs/WorkActivityApi.md#addWorkActivity) | **POST** /beta/workActivity | Create a workActivity
*WorkActivityApi* | [**addWorkActivityAudit**](docs/WorkActivityApi.md#addWorkActivityAudit) | **PUT** /beta/workActivity/{workActivityId}/audit/{workActivityAudit} | Add new audit for a workActivity
*WorkActivityApi* | [**addWorkActivityFile**](docs/WorkActivityApi.md#addWorkActivityFile) | **POST** /beta/workActivity/{workActivityId}/file/{fileName} | Attach a file to a workActivity
*WorkActivityApi* | [**addWorkActivityFileByURL**](docs/WorkActivityApi.md#addWorkActivityFileByURL) | **POST** /beta/workActivity/{workActivityId}/file | Attach a file to a workActivity by URL.
*WorkActivityApi* | [**addWorkActivityTag**](docs/WorkActivityApi.md#addWorkActivityTag) | **PUT** /beta/workActivity/{workActivityId}/tag/{workActivityTag} | Add new tags for a workActivity.
*WorkActivityApi* | [**deleteWorkActivity**](docs/WorkActivityApi.md#deleteWorkActivity) | **DELETE** /beta/workActivity/{workActivityId} | Delete a workActivity
*WorkActivityApi* | [**deleteWorkActivityFile**](docs/WorkActivityApi.md#deleteWorkActivityFile) | **DELETE** /beta/workActivity/{workActivityId}/file/{fileId} | Delete a file for a workActivity.
*WorkActivityApi* | [**deleteWorkActivityTag**](docs/WorkActivityApi.md#deleteWorkActivityTag) | **DELETE** /beta/workActivity/{workActivityId}/tag/{workActivityTag} | Delete a tag for a workActivity.
*WorkActivityApi* | [**getDuplicateWorkActivityById**](docs/WorkActivityApi.md#getDuplicateWorkActivityById) | **GET** /beta/workActivity/duplicate/{workActivityId} | Get a duplicated a workActivity by id
*WorkActivityApi* | [**getWorkActivityByFilter**](docs/WorkActivityApi.md#getWorkActivityByFilter) | **GET** /beta/workActivity/search | Search workActivitys by filter
*WorkActivityApi* | [**getWorkActivityById**](docs/WorkActivityApi.md#getWorkActivityById) | **GET** /beta/workActivity/{workActivityId} | Get a workActivity by id
*WorkActivityApi* | [**getWorkActivityFiles**](docs/WorkActivityApi.md#getWorkActivityFiles) | **GET** /beta/workActivity/{workActivityId}/file | Get the files for a workActivity.
*WorkActivityApi* | [**getWorkActivityTags**](docs/WorkActivityApi.md#getWorkActivityTags) | **GET** /beta/workActivity/{workActivityId}/tag | Get the tags for a workActivity.
*WorkActivityApi* | [**updateWorkActivity**](docs/WorkActivityApi.md#updateWorkActivity) | **PUT** /beta/workActivity | Update a workActivity
*WorkBatchApi* | [**addWorkBatchAudit**](docs/WorkBatchApi.md#addWorkBatchAudit) | **PUT** /beta/workBatch/{workBatchId}/audit/{workBatchAudit} | Add new audit for a workBatch
*WorkBatchApi* | [**addWorkBatchFile**](docs/WorkBatchApi.md#addWorkBatchFile) | **POST** /beta/workBatch/{workBatchId}/file/{fileName} | Attach a file to a workBatch
*WorkBatchApi* | [**addWorkBatchFileByURL**](docs/WorkBatchApi.md#addWorkBatchFileByURL) | **POST** /beta/workBatch/{workBatchId}/file | Attach a file to a workBatch by URL.
*WorkBatchApi* | [**addWorkBatchTag**](docs/WorkBatchApi.md#addWorkBatchTag) | **PUT** /beta/workBatch/{workBatchId}/tag/{workBatchTag} | Add new tags for a workBatch.
*WorkBatchApi* | [**deleteWorkBatchFile**](docs/WorkBatchApi.md#deleteWorkBatchFile) | **DELETE** /beta/workBatch/{workBatchId}/file/{fileId} | Delete a file for a workBatch.
*WorkBatchApi* | [**deleteWorkBatchTag**](docs/WorkBatchApi.md#deleteWorkBatchTag) | **DELETE** /beta/workBatch/{workBatchId}/tag/{workBatchTag} | Delete a tag for a workBatch.
*WorkBatchApi* | [**getDuplicateWorkBatchById**](docs/WorkBatchApi.md#getDuplicateWorkBatchById) | **GET** /beta/workBatch/duplicate/{workBatchId} | Get a duplicated a workBatch by id
*WorkBatchApi* | [**getWorkBatchByFilter**](docs/WorkBatchApi.md#getWorkBatchByFilter) | **GET** /beta/workBatch/search | Search workBatchs by filter
*WorkBatchApi* | [**getWorkBatchById**](docs/WorkBatchApi.md#getWorkBatchById) | **GET** /beta/workBatch/{workBatchId} | Get a workBatch by id
*WorkBatchApi* | [**getWorkBatchFiles**](docs/WorkBatchApi.md#getWorkBatchFiles) | **GET** /beta/workBatch/{workBatchId}/file | Get the files for a workBatch.
*WorkBatchApi* | [**getWorkBatchTags**](docs/WorkBatchApi.md#getWorkBatchTags) | **GET** /beta/workBatch/{workBatchId}/tag | Get the tags for a workBatch.
*WorkBatchApi* | [**updateWorkBatch**](docs/WorkBatchApi.md#updateWorkBatch) | **PUT** /beta/workBatch | Update a workBatch
*WorkBatchApi* | [**updateWorkBatchCustomFields**](docs/WorkBatchApi.md#updateWorkBatchCustomFields) | **PUT** /beta/workBatch/customFields | Update a workBatch custom fields
*ZoneApi* | [**addZone**](docs/ZoneApi.md#addZone) | **POST** /beta/zone | Create a zone
*ZoneApi* | [**addZoneAudit**](docs/ZoneApi.md#addZoneAudit) | **PUT** /beta/zone/{zoneId}/audit/{zoneAudit} | Add new audit for a zone
*ZoneApi* | [**addZoneFile**](docs/ZoneApi.md#addZoneFile) | **POST** /beta/zone/{zoneId}/file/{fileName} | Attach a file to a zone
*ZoneApi* | [**addZoneFileByURL**](docs/ZoneApi.md#addZoneFileByURL) | **POST** /beta/zone/{zoneId}/file | Attach a file to a zone by URL.
*ZoneApi* | [**addZoneTag**](docs/ZoneApi.md#addZoneTag) | **PUT** /beta/zone/{zoneId}/tag/{zoneTag} | Add new tags for a zone.
*ZoneApi* | [**deleteZone**](docs/ZoneApi.md#deleteZone) | **DELETE** /beta/zone/{zoneId} | Delete a zone
*ZoneApi* | [**deleteZoneFile**](docs/ZoneApi.md#deleteZoneFile) | **DELETE** /beta/zone/{zoneId}/file/{fileId} | Delete a file for a zone.
*ZoneApi* | [**deleteZoneTag**](docs/ZoneApi.md#deleteZoneTag) | **DELETE** /beta/zone/{zoneId}/tag/{zoneTag} | Delete a tag for a zone.
*ZoneApi* | [**getDuplicateZoneById**](docs/ZoneApi.md#getDuplicateZoneById) | **GET** /beta/zone/duplicate/{zoneId} | Get a duplicated a zone by id
*ZoneApi* | [**getZoneByFilter**](docs/ZoneApi.md#getZoneByFilter) | **GET** /beta/zone/search | Search zones by filter
*ZoneApi* | [**getZoneById**](docs/ZoneApi.md#getZoneById) | **GET** /beta/zone/{zoneId} | Get a zone by id
*ZoneApi* | [**getZoneFiles**](docs/ZoneApi.md#getZoneFiles) | **GET** /beta/zone/{zoneId}/file | Get the files for a zone.
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
 - [CommodityCode](docs/CommodityCode.md)
 - [CustomField](docs/CustomField.md)
 - [Customer](docs/Customer.md)
 - [CustomerInvoiceTemplate](docs/CustomerInvoiceTemplate.md)
 - [CustomerInvoiceTemplateLine](docs/CustomerInvoiceTemplateLine.md)
 - [DynamicKitComponentLine](docs/DynamicKitComponentLine.md)
 - [EDIDocumentType](docs/EDIDocumentType.md)
 - [EdiDocument](docs/EdiDocument.md)
 - [EditLineItemFulfillmentStrategyInputAPIModel](docs/EditLineItemFulfillmentStrategyInputAPIModel.md)
 - [EmailTemplate](docs/EmailTemplate.md)
 - [ExecuteExternalShipmentInputAPIModel](docs/ExecuteExternalShipmentInputAPIModel.md)
 - [ExecuteJobInputAPIModel](docs/ExecuteJobInputAPIModel.md)
 - [ExecuteQuickAdjustmentInputAPIModel](docs/ExecuteQuickAdjustmentInputAPIModel.md)
 - [ExecuteQuickReceiptInputAPIModel](docs/ExecuteQuickReceiptInputAPIModel.md)
 - [ExternalShipment](docs/ExternalShipment.md)
 - [ExternalShippingSystem](docs/ExternalShippingSystem.md)
 - [FinanceSystemConnection](docs/FinanceSystemConnection.md)
 - [FinanceSystemConnectionLog](docs/FinanceSystemConnectionLog.md)
 - [FulfillmentLayoutPosition](docs/FulfillmentLayoutPosition.md)
 - [FulfillmentPlan](docs/FulfillmentPlan.md)
 - [FulfillmentProcess](docs/FulfillmentProcess.md)
 - [FulfillmentProcessLog](docs/FulfillmentProcessLog.md)
 - [FulfillmentProcessPickBatchGroup](docs/FulfillmentProcessPickBatchGroup.md)
 - [GS1128LabelDTO](docs/GS1128LabelDTO.md)
 - [GetOrderPackDataInput](docs/GetOrderPackDataInput.md)
 - [GetOrderPackDataOutput](docs/GetOrderPackDataOutput.md)
 - [GetOrderWarehouseFulfillmentDataInput](docs/GetOrderWarehouseFulfillmentDataInput.md)
 - [GetOrderWarehouseFulfillmentDataOutput](docs/GetOrderWarehouseFulfillmentDataOutput.md)
 - [Gs1128Label](docs/Gs1128Label.md)
 - [Gs1128Template](docs/Gs1128Template.md)
 - [IntegrationPartner](docs/IntegrationPartner.md)
 - [InventoryAdjustment](docs/InventoryAdjustment.md)
 - [InventoryDetail](docs/InventoryDetail.md)
 - [InventorySnapshot](docs/InventorySnapshot.md)
 - [InventoryStorageActivity](docs/InventoryStorageActivity.md)
 - [InvoiceTemplateLinePriceLevel](docs/InvoiceTemplateLinePriceLevel.md)
 - [InvoiceWorksheet](docs/InvoiceWorksheet.md)
 - [InvoiceWorksheetLine](docs/InvoiceWorksheetLine.md)
 - [InvoiceWorksheetLineDetail](docs/InvoiceWorksheetLineDetail.md)
 - [Item](docs/Item.md)
 - [ItemAccountCode](docs/ItemAccountCode.md)
 - [ItemActivity](docs/ItemActivity.md)
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
 - [Load](docs/Load.md)
 - [LoadContent](docs/LoadContent.md)
 - [Location](docs/Location.md)
 - [LocationAddressScheme](docs/LocationAddressScheme.md)
 - [LocationBillingType](docs/LocationBillingType.md)
 - [LocationFootprint](docs/LocationFootprint.md)
 - [LoggedTime](docs/LoggedTime.md)
 - [LoggedTimeType](docs/LoggedTimeType.md)
 - [LowStock](docs/LowStock.md)
 - [ManageScheduledPlans](docs/ManageScheduledPlans.md)
 - [ManifestPartner](docs/ManifestPartner.md)
 - [ModelApiResponse](docs/ModelApiResponse.md)
 - [NonBusinessDay](docs/NonBusinessDay.md)
 - [OmsOrder](docs/OmsOrder.md)
 - [Order](docs/Order.md)
 - [OrderActivity](docs/OrderActivity.md)
 - [OrderExtraLineItemData](docs/OrderExtraLineItemData.md)
 - [OrderExtraOrderData](docs/OrderExtraOrderData.md)
 - [OrderInvoiceTemplateLineItemDescriptionEnum](docs/OrderInvoiceTemplateLineItemDescriptionEnum.md)
 - [OrderLine](docs/OrderLine.md)
 - [OrderLineActivity](docs/OrderLineActivity.md)
 - [OrderLineItem](docs/OrderLineItem.md)
 - [OrderLoadProgram](docs/OrderLoadProgram.md)
 - [OrderSource](docs/OrderSource.md)
 - [OrderSourceItemSetup](docs/OrderSourceItemSetup.md)
 - [OrderSourceReservation](docs/OrderSourceReservation.md)
 - [OrderSourceStockStatus](docs/OrderSourceStockStatus.md)
 - [OrderWarehouseFulfillmentPlan](docs/OrderWarehouseFulfillmentPlan.md)
 - [OrderWarehouseFulfillmentPlanDetail](docs/OrderWarehouseFulfillmentPlanDetail.md)
 - [OrderWarehouseFulfillmentRawData](docs/OrderWarehouseFulfillmentRawData.md)
 - [OrderWarehouseFulfillmentRawSkuData](docs/OrderWarehouseFulfillmentRawSkuData.md)
 - [OverrideReceiptsForFulfillment](docs/OverrideReceiptsForFulfillment.md)
 - [OverrideReturnAddress](docs/OverrideReturnAddress.md)
 - [PackedCarton](docs/PackedCarton.md)
 - [PackedItem](docs/PackedItem.md)
 - [PackedMasterCarton](docs/PackedMasterCarton.md)
 - [PackedPallet](docs/PackedPallet.md)
 - [PackingDetail](docs/PackingDetail.md)
 - [PackingPlan](docs/PackingPlan.md)
 - [PackingPlanDetail](docs/PackingPlanDetail.md)
 - [PackingSlipTemplateLineExtraDataEnum](docs/PackingSlipTemplateLineExtraDataEnum.md)
 - [PackingSlipTemplateLineItemDescriptionEnum](docs/PackingSlipTemplateLineItemDescriptionEnum.md)
 - [PalletType](docs/PalletType.md)
 - [ParcelAccount](docs/ParcelAccount.md)
 - [ParcelInvoice](docs/ParcelInvoice.md)
 - [ParcelInvoiceLine](docs/ParcelInvoiceLine.md)
 - [PerpetualInventoryLog](docs/PerpetualInventoryLog.md)
 - [PickFaceAssignment](docs/PickFaceAssignment.md)
 - [PredefinedCarton](docs/PredefinedCarton.md)
 - [ProcessOutputAPIModel](docs/ProcessOutputAPIModel.md)
 - [ProductType](docs/ProductType.md)
 - [ProductionLot](docs/ProductionLot.md)
 - [ProductionModel](docs/ProductionModel.md)
 - [QuickAdjustment](docs/QuickAdjustment.md)
 - [QuickReceipt](docs/QuickReceipt.md)
 - [ReceivingProcess](docs/ReceivingProcess.md)
 - [ReceivingWorksheet](docs/ReceivingWorksheet.md)
 - [ReceivingWorksheetLineItem](docs/ReceivingWorksheetLineItem.md)
 - [ReceivingWorksheetPutAwayPlan](docs/ReceivingWorksheetPutAwayPlan.md)
 - [RecordFile](docs/RecordFile.md)
 - [Replenishment](docs/Replenishment.md)
 - [ReplenishmentPlan](docs/ReplenishmentPlan.md)
 - [ReplenishmentProcess](docs/ReplenishmentProcess.md)
 - [ReqManualSubstitutionInputAPIModel](docs/ReqManualSubstitutionInputAPIModel.md)
 - [ReqParcelAccessoryData](docs/ReqParcelAccessoryData.md)
 - [ReturnShipment](docs/ReturnShipment.md)
 - [RunFulfillmentPlanInputAPIModel](docs/RunFulfillmentPlanInputAPIModel.md)
 - [ScheduledPlanLog](docs/ScheduledPlanLog.md)
 - [ServiceType](docs/ServiceType.md)
 - [Shipment](docs/Shipment.md)
 - [ShoppingCartConnection](docs/ShoppingCartConnection.md)
 - [StandardBusinessDays](docs/StandardBusinessDays.md)
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
 - [WarehouseInventory](docs/WarehouseInventory.md)
 - [WarehouseServiceType](docs/WarehouseServiceType.md)
 - [Work](docs/Work.md)
 - [WorkActivity](docs/WorkActivity.md)
 - [WorkBatch](docs/WorkBatch.md)
 - [WorkProduct](docs/WorkProduct.md)
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

