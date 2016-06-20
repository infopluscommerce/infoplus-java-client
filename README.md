# infoplus-java-client
Infoplus is a cloud platform to manage your inventory, orders, warehouse, and shipments.

The Infoplus API exposes the full breadth and depth of the Infoplus platform to all clients.
With the Infoplus API, you can integrate Infoplus functionality into other platforms 
(e.g. your ERP, shopping cart, accounting system, etc.), enabling you to do, in your own platform, 
anything you can do in Infoplus. 

This repository is a native Java client for full access to the Infoplus API.

## Infoplus API Resources
The Resources listed below will provide all the information you need to integrate with the Infoplus API. 

### Developer's Home Page
https://www.infopluscommerce.com/developers/
* This site gives you an overview of the Infoplus API. 
* Get a general understanding of the API and quick steps on getting started. 

### Infoplus API Reference Site
http://developers.infopluscommerce.com/
* The Infoplus API is a modern JSON + REST API, and the API Reference Site is the complete documentation of all endpoints, resources, and fields available in the API. 
* Whether you're using the API directly over HTTPS, or if you're using a pre-built Client Library like this one, the API Reference Site gives you the specific details you need for each API call available, along with live demo capabilities.
* The API Reference Site also lets you request access to a free Demo Account to test out the API. 

### Have Questions?
* Read an [Overview of the Infoplus API](https://support.infopluscommerce.com/support/solutions/articles/11000010373)
* Get in touch with the [Infoplus Support Team](https://support.infopluscommerce.com/support/tickets/new)
* Visit the [Infoplus API Forum](https://support.infopluscommerce.com/support/discussions/forums/11000000138)

# Java Client Details

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation & Usage

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

After the client libarary is installed/deployed, you can use it in your Maven project by adding the following to your *pom.xml*:

```xml
<dependency>
    <groupId>com.infopluscommerce</groupId>
    <artifactId>java-client</artifactId>
    <version>1.0</version>
    <scope>compile</scope>
</dependency>

```

In your code that uses the API, be sure to configure the `ApiClient` with a base URL path and API Key specific to your account:

```
ApiClient apiClient = new ApiClient();
apiClient.setBasePath("https://<YOUR INFOPLUS DOMAIN>/infoplus-wms/api");
apiClient.setApiKey("<YOUR API KEY>");

Configuration.setDefaultApiClient(apiClient);
```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

api@infopluscommerce.com


