
# Getting Started with Verizon

## Introduction

The Verizon Edge Discovery Service API can direct your application clients to connect to the optimal service endpoints for your Multi-access Edge Computing (MEC) applications for every session. The Edge Discovery Service takes into account the current location of a device, its IP anchor location, current network traffic and other factors to determine which 5G Edge platform a device should connect to.

Verizon Terms of Service: [https://www.verizon.com/business/5g-edge-portal/legal.html](https://www.verizon.com/business/5g-edge-portal/legal.html)

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.sdks</groupId>
  <artifactId>verizon-apis-sdk</artifactId>
  <version>1.0.0</version>
</dependency>
```

You can also view the package at:
https://mvnrepository.com/artifact/io.sdks/verizon-apis-sdk/1.0.0

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `vZM2mToken` | `String` | M2M Session Token ([How to generate an M2M session token?](page:getting-started/5g-edge-developer-creds-token#obtaining-a-vz-m2m-session-token-programmatically)) |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/http-client-configuration.md) | Http Client Configuration instance. |
| `oauthClientId` | `String` | OAuth 2 Client ID |
| `oauthClientSecret` | `String` | OAuth 2 Client Secret |
| `oauthToken` | `OauthToken` | Object for storing information about the OAuth token |
| `oauthScopes` | `List<OauthScopeEnum>` |  |

The API client can be initialized as follows:

```java
VerizonClient client = new VerizonClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .vZM2mToken("VZ-M2M-Token")
    .oauthScopes(Arrays.asList(OauthScopeEnum.DISCOVERYREAD, OauthScopeEnum.SERVICEPROFILEREAD, OauthScopeEnum.SERVICEPROFILEWRITE, OauthScopeEnum.SERVICEREGISTRYREAD, OauthScopeEnum.SERVICEREGISTRYWRITE, OauthScopeEnum.TS_MEC_FULLACCESS, OauthScopeEnum.TS_MEC_LIMITACCESS, OauthScopeEnum.TS_APPLICATION_RO, OauthScopeEnum.EDGEDISCOVERYREAD, OauthScopeEnum.EDGESERVICEPROFILEREAD, OauthScopeEnum.EDGESERVICEPROFILEWRITE, OauthScopeEnum.EDGESERVICEREGISTRYREAD, OauthScopeEnum.EDGESERVICEREGISTRYWRITE, OauthScopeEnum.READ, OauthScopeEnum.WRITE))
    .clientCredentialsAuthCredentials("OAuthClientId", "OAuthClientSecret")
    .environment(Environment.PRODUCTION)
    .build();
```

API calls return an `ApiResponse` object that includes the following fields:

| Field | Description |
|  --- | --- |
| `getStatusCode` | Status code of the HTTP response |
| `getHeaders` | Headers of the HTTP response as a Hash |
| `getResult` | The deserialized body of the HTTP response as a String |

## Authorization

This API uses `OAuth 2 Client Credentials Grant`.

## Client Credentials Grant

Your application must obtain user authorization before it can execute an endpoint call in case this SDK chooses to use *OAuth 2.0 Client Credentials Grant*. This authorization includes the following steps

The `fetchToken()` method will exchange the OAuth client credentials for an *access token*. The access token is an object containing information for authorizing client requests and refreshing the token itself.

You must have initialized the client with [scopes]($h/__authorize/Scopes) for which you need permission to access.

```java
try {
    OAuthToken token = client.getClientCredentialsAuth().fetchToken();
    // re-instantiate the client with oauth token
    client = client.newBuilder().oauthToken(token).build();
} catch (Throwable e) {
    // TODO Handle exception
}
```

The client can now make authorized endpoint calls.

### Scopes

Scopes enable your application to only request access to the resources it needs while enabling users to control the amount of access they grant to your application. Available scopes are defined in the `OauthScopeEnum` enumeration.

| Scope Name | Description |
|  --- | --- |
| `DISCOVERYREAD` | Grant read-only access to discovery data |
| `SERVICEPROFILEREAD` | Grant read-only access to service profile data |
| `SERVICEPROFILEWRITE` | Grant write access to service profile data |
| `SERVICEREGISTRYREAD` | Grant read-only access to Service registry data |
| `SERVICEREGISTRYWRITE` | Grant write access to Service registry data |
| `TS_MEC_FULLACCESS` | Full access for /serviceprofiles and /serviceendpoints. |
| `TS_MEC_LIMITACCESS` | Limited access. Will not allow use of /serviceprofiles and /serviceendpoints but will allow discovery. |
| `TS_APPLICATION_RO` |  |
| `EDGEDISCOVERYREAD` |  |
| `EDGESERVICEPROFILEREAD` |  |
| `EDGESERVICEPROFILEWRITE` |  |
| `EDGESERVICEREGISTRYREAD` |  |
| `EDGESERVICEREGISTRYWRITE` |  |
| `READ` | read access |
| `WRITE` | read/write access |

### Storing an access token for reuse

It is recommended that you store the access token for reuse.

```java
// store token
storeAccessToken(client.getClientCredentialsAuth().getOauthToken());
```

### Creating a client from a stored token

To authorize a client from a stored access token, just set the access token in Configuration along with the other configuration parameters before creating the client:

```java
// load token later...
OauthToken token = loadAccessToken();

// re-instantiate the client with oauth token
client = client.newBuilder().oAuthToken(token).build();
```

### Complete example

```java
package com.example;

import com.verizon.m5gedge.models.OauthScopeEnum;
import java.util.Arrays;

public class Main {
    public Main() {
        VerizonClient client = new VerizonClient.Builder()
            .httpClientConfig(configBuilder -> configBuilder
                    .timeout(0))
            .vZM2mToken("VZ-M2M-Token")
            .oauthScopes(Arrays.asList(OauthScopeEnum.DISCOVERYREAD, OauthScopeEnum.SERVICEPROFILEREAD, OauthScopeEnum.SERVICEPROFILEWRITE, OauthScopeEnum.SERVICEREGISTRYREAD, OauthScopeEnum.SERVICEREGISTRYWRITE, OauthScopeEnum.TS_MEC_FULLACCESS, OauthScopeEnum.TS_MEC_LIMITACCESS, OauthScopeEnum.TS_APPLICATION_RO, OauthScopeEnum.EDGEDISCOVERYREAD, OauthScopeEnum.EDGESERVICEPROFILEREAD, OauthScopeEnum.EDGESERVICEPROFILEWRITE, OauthScopeEnum.EDGESERVICEREGISTRYREAD, OauthScopeEnum.EDGESERVICEREGISTRYWRITE, OauthScopeEnum.READ, OauthScopeEnum.WRITE))
            .clientCredentialsAuthCredentials("OAuthClientId", "OAuthClientSecret")
            .environment(Environment.PRODUCTION)
            .build();
        
        


        try {
            OAuthToken token = client.getClientCredentialsAuth().fetchToken();
            // re-instantiate the client with oauth token
            client = client.newBuilder().oauthToken(token).build();
        } catch (Throwable e) {
            // TODO Handle exception
        }

        // the client is now authorized; you can use client to make endpoint calls
    }
}
```

## List of APIs

* [5G Edge Platforms](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/5g-edge-platforms.md)
* [Service Endpoints](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/service-endpoints.md)
* [Service Profiles](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/service-profiles.md)
* [Device Management](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/device-management.md)
* [Device Groups](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/device-groups.md)
* [Session Management](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/session-management.md)
* [Connectivity Callbacks](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/connectivity-callbacks.md)
* [Account Requests](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/account-requests.md)
* [Service Plans](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/service-plans.md)
* [Device Diagnostics](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/device-diagnostics.md)
* [Device Profile Management](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/device-profile-management.md)
* [Device Monitoring](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/device-monitoring.md)
* [E UICC Device Profile Management](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/e-uicc-device-profile-management.md)
* [Devices Locations](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/devices-locations.md)
* [Devices Location Subscr Ip Tions](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/devices-location-subscr-ip-tions.md)
* [Device Location Callbacks](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/device-location-callbacks.md)
* [Usage Trigger Management](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/usage-trigger-management.md)
* [Software Management Subscr Ip Tions V1](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/software-management-subscr-ip-tions-v1.md)
* [Software Management Licenses V1](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/software-management-licenses-v1.md)
* [Firmware V1](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/firmware-v1.md)
* [Software Management Callbacks V1](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/software-management-callbacks-v1.md)
* [Software Management Reports V1](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/software-management-reports-v1.md)
* [Software Management Subscr Ip Tions V2](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/software-management-subscr-ip-tions-v2.md)
* [Software Management Licenses V2](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/software-management-licenses-v2.md)
* [Campaigns V2](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/campaigns-v2.md)
* [Software Management Callbacks V2](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/software-management-callbacks-v2.md)
* [Software Management Reports V2](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/software-management-reports-v2.md)
* [Client Logging](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/client-logging.md)
* [Server Logging](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/server-logging.md)
* [Configuration Files](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/configuration-files.md)
* [Software Management Subscr Ip Tions V3](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/software-management-subscr-ip-tions-v3.md)
* [Software Management Licenses V3](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/software-management-licenses-v3.md)
* [Campaigns V3](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/campaigns-v3.md)
* [Software Management Reports V3](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/software-management-reports-v3.md)
* [Firmware V3](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/firmware-v3.md)
* [Account Devices](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/account-devices.md)
* [Software Management Callbacks V3](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/software-management-callbacks-v3.md)
* [SIM Securefor Io T Licenses](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/sim-securefor-io-t-licenses.md)
* [Account Subscr Ip Tions](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/account-subscr-ip-tions.md)
* [Performance Metrics](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/performance-metrics.md)
* [Diagnostics Subscr Ip Tions](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/diagnostics-subscr-ip-tions.md)
* [Diagnostics Observations](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/diagnostics-observations.md)
* [Diagnostics History](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/diagnostics-history.md)
* [Diagnostics Settings](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/diagnostics-settings.md)
* [Diagnostics Callbacks](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/diagnostics-callbacks.md)
* [Diagnostics Factory Reset](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/diagnostics-factory-reset.md)
* [Cloud Connector Subscr Ip Tions](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/cloud-connector-subscr-ip-tions.md)
* [Cloud Connector Devices](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/cloud-connector-devices.md)
* [Device Service Management](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/device-service-management.md)
* [Device Reports](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/device-reports.md)
* [Hyper Precise Location Callbacks](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/hyper-precise-location-callbacks.md)
* [Anomaly Settings](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/anomaly-settings.md)
* [Anomaly Triggers](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/anomaly-triggers.md)
* [Anomaly Triggers V2](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/anomaly-triggers-v2.md)
* [Wireless Network Performance](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/wireless-network-performance.md)
* [Fixed Wireless Qualification](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/fixed-wireless-qualification.md)
* [Managinge SIM Profiles](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/managinge-sim-profiles.md)
* [Device SMS Messaging](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/device-sms-messaging.md)
* [Device Actions](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/device-actions.md)
* [Thing Space Qualityof Service API Actions](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/thing-space-qualityof-service-api-actions.md)
* [OAuth Authorization](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/oauth-authorization.md)
* [Accounts](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/accounts.md)
* [SMS](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/sms.md)
* [Exclusions](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/exclusions.md)
* [Billing](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/billing.md)
* [Targets](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/targets.md)
* [MEC](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/controllers/mec.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/http-request.md)
* [HttpResponse](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/http-string-response.md)
* [HttpContext](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/http-body-request.md)
* [Headers](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/headers.md)
* [ApiException](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/sdks-io/verizon-apis-java-sdk/tree/1.0.0/doc/http-client-configuration-builder.md)

