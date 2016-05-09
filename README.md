# java-client

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
apiClient.setBasePath("https://<YOUR INFOPLUS DOMAIN>/infoplus-wms/api/v1.0");
apiClient.setApiKey("<YOUR API KEY>");

Configuration.setDefaultApiClient(apiClient);
```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

api@infopluscommerce.com


