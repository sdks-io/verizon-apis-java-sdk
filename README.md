
# Getting Started with Verizon ThingSpace Quality of Service API endpoints

## Introduction

These are the endpoints to subscribe to and end the subscription for Verizon's ThingSpace Quality of Service API. These endpoints use Service Capability Exposure Function or SCEF, and rely on callbacks for asynchronous requests. **Note:** This example is in YAML and will need to be converted to JSON to use as a spec file.

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.sdks</groupId>
  <artifactId>verizon-apis-sdk</artifactId>
  <version>1.6.0</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/io.sdks/verizon-apis-sdk/1.6.0

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project VerizonThingSpaceQualityOfServiceAPIEndpointsLib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `vZM2MToken2` | `String` | The VZ-M2M session token from [Getting Started](/content/thingspace-portal/documentation/apis/connectivity-management/get-started.html) |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `thingspaceOauthCredentials` | [`ThingspaceOauthCredentials`](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/auth/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |
| `vzM2mSessionTokenCredentials` | [`VzM2mSessionTokenCredentials`](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/auth/custom-header-signature.md) | The Credentials Setter for Custom Header Signature |

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

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| Production | **Default** |
| Staging | - |

## Authorization

This API uses the following authentication schemes.

* [`thingspace_oauth (OAuth 2 Client Credentials Grant)`](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/auth/oauth-2-client-credentials-grant.md)
* [`vz-m2m-session_token (Custom Header Signature)`](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/auth/custom-header-signature.md)

## List of APIs

* [Thing Space Qualityof Service API Actions](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/controllers/thing-space-qualityof-service-api-actions.md)
* [Exclusions](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/controllers/exclusions.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/http-request.md)
* [HttpResponse](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/http-string-response.md)
* [HttpContext](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/http-body-request.md)
* [HttpCallback Interface](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/http-callback-interface.md)
* [Headers](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/headers.md)
* [ApiException](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.6.0/doc/http-client-configuration-builder.md)

