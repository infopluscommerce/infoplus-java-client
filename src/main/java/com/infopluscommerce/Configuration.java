package com.infopluscommerce;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-16T11:59:53.552-05:00")
public class Configuration {
  private static ApiClient defaultApiClient = new ApiClient();

  /**
   * Get the default API client, which would be used when creating API
   * instances without providing an API client.
   */
  public static ApiClient getDefaultApiClient() {
    return defaultApiClient;
   }

  /**
   * Set the default API client, which would be used when creating API
   * instances without providing an API client.
   */
  public static void setDefaultApiClient(ApiClient apiClient) {
    defaultApiClient = apiClient;
  }
}
