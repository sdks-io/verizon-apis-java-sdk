
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `vZM2MToken2` | `String` | The VZ-M2M session token from [Getting Started](/content/thingspace-portal/documentation/apis/connectivity-management/get-started.html) |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `thingspaceOauthCredentials` | [`ThingspaceOauthCredentials`](auth/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |
| `vzM2mSessionTokenCredentials` | [`VzM2mSessionTokenCredentials`](auth/custom-header-signature.md) | The Credentials Setter for Custom Header Signature |

The API client can be initialized as follows:

```java
VerizonThingSpaceQualityOfServiceAPIEndpointsClient client = new VerizonThingSpaceQualityOfServiceAPIEndpointsClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .vZM2MToken2("VZ-M2M-Token")
    .thingspaceOauthCredentials(new ThingspaceOauthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .build())
    .vzM2mSessionTokenCredentials(new VzM2mSessionTokenModel.Builder(
            "VZ-M2M-Token"
        )
        .build())
    .environment(Environment.PRODUCTION)
    .build();
```

## Verizon ThingSpace Quality of Service API endpointsClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getThingSpaceQualityofServiceAPIActionsController()` | Provides access to ThingSpaceQualityofServiceAPIActions controller. | `ThingSpaceQualityofServiceAPIActionsController` |
| `getExclusionsController()` | Provides access to Exclusions controller. | `ExclusionsController` |
| `getOAuthAuthorizationController()` | Provides access to OAuthAuthorization controller. | `OAuthAuthorizationController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getVZM2MToken2()` | The VZ-M2M session token from [Getting Started](/content/thingspace-portal/documentation/apis/connectivity-management/get-started.html). | `String` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getThingspaceOauthCredentials()` | The credentials to use with ThingspaceOauth. | [`ThingspaceOauthCredentials`](auth/oauth-2-client-credentials-grant.md) |
| `getVzM2mSessionTokenCredentials()` | The credentials to use with VzM2mSessionToken. | [`VzM2mSessionTokenCredentials`](auth/custom-header-signature.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

