# Managinge SIM Profiles

```java
ManagingeSIMProfilesController managingeSIMProfilesController = client.getManagingeSIMProfilesController();
```

## Class Name

`ManagingeSIMProfilesController`

## Methods

* [Resume Profile](../../doc/controllers/managinge-sim-profiles.md#resume-profile)
* [Profile Suspend](../../doc/controllers/managinge-sim-profiles.md#profile-suspend)
* [Device Suspend](../../doc/controllers/managinge-sim-profiles.md#device-suspend)
* [Set Fallback](../../doc/controllers/managinge-sim-profiles.md#set-fallback)
* [Activate a Device Profile](../../doc/controllers/managinge-sim-profiles.md#activate-a-device-profile)
* [Enable a Device Profile](../../doc/controllers/managinge-sim-profiles.md#enable-a-device-profile)
* [Deactivate a Device Profile](../../doc/controllers/managinge-sim-profiles.md#deactivate-a-device-profile)
* [Enable a Device Profile for Download](../../doc/controllers/managinge-sim-profiles.md#enable-a-device-profile-for-download)
* [Download a Device Profile](../../doc/controllers/managinge-sim-profiles.md#download-a-device-profile)
* [Delete a Device Profile](../../doc/controllers/managinge-sim-profiles.md#delete-a-device-profile)


# Resume Profile

Resume service to a device with either a lead or local profile.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> resumeProfileAsync(
    final GIOProfileRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GIOProfileRequest`](../../doc/models/gio-profile-request.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
GIOProfileRequest body = new GIOProfileRequest.Builder(
    Arrays.asList(
        new GIODeviceList.Builder()
            .build()
    ),
    "0000123456-00001"
)
.mdnZipCode("12345")
.servicePlan("service plan name")
.build();

managingeSIMProfilesController.resumeProfileAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |


# Profile Suspend

Suspend a device's Global profile.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> profileSuspendAsync(
    final GIOProfileRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GIOProfileRequest`](../../doc/models/gio-profile-request.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
GIOProfileRequest body = new GIOProfileRequest.Builder(
    Arrays.asList(
        new GIODeviceList.Builder()
            .build()
    ),
    "0000123456-00001"
)
.mdnZipCode("12345")
.servicePlan("service plan name")
.build();

managingeSIMProfilesController.profileSuspendAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |


# Device Suspend

Suspend all service to an eUICC device, including the lead and local profile.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> deviceSuspendAsync(
    final GIOProfileRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GIOProfileRequest`](../../doc/models/gio-profile-request.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
GIOProfileRequest body = new GIOProfileRequest.Builder(
    Arrays.asList(
        new GIODeviceList.Builder()
            .build()
    ),
    "0000123456-00001"
)
.mdnZipCode("12345")
.servicePlan("service plan name")
.build();

managingeSIMProfilesController.deviceSuspendAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |


# Set Fallback

Enable a fallback profile to be set.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> setFallbackAsync(
    final FallBack body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`FallBack`](../../doc/models/fall-back.md) | Body, Required | Set the fallback attributes to allow a fallback profile to be activated. |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
FallBack body = new FallBack.Builder()
    .build();

managingeSIMProfilesController.setFallbackAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |


# Activate a Device Profile

Activate a device with either a lead or local profile.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> activateADeviceProfileAsync(
    final GIOProfileRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GIOProfileRequest`](../../doc/models/gio-profile-request.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
GIOProfileRequest body = new GIOProfileRequest.Builder(
    Arrays.asList(
        new GIODeviceList.Builder()
            .build()
    ),
    "0000123456-00001"
)
.mdnZipCode("12345")
.servicePlan("service plan name")
.build();

managingeSIMProfilesController.activateADeviceProfileAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |


# Enable a Device Profile

Enable a device lead or local profile.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> enableADeviceProfileAsync(
    final DeviceProfileRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DeviceProfileRequest`](../../doc/models/device-profile-request.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
DeviceProfileRequest body = new DeviceProfileRequest.Builder()
    .accountName("0000123456-00001")
    .servicePlan("service plan name")
    .build();

managingeSIMProfilesController.enableADeviceProfileAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |


# Deactivate a Device Profile

Deactivate the lead or local profile. **Note:** to reactivate the profile, use the **Activate** endpoint above.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> deactivateADeviceProfileAsync(
    final GIODeactivateDeviceProfileRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GIODeactivateDeviceProfileRequest`](../../doc/models/gio-deactivate-device-profile-request.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
GIODeactivateDeviceProfileRequest body = new GIODeactivateDeviceProfileRequest.Builder()
    .accountName("0000123456-00001")
    .servicePlan("service plan name")
    .etfWaiver(false)
    .reasonCode("FF")
    .build();

managingeSIMProfilesController.deactivateADeviceProfileAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |


# Enable a Device Profile for Download

Enable the Global IoT Orchestration device profile for download.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> enableADeviceProfileForDownloadAsync(
    final DeviceProfileRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DeviceProfileRequest`](../../doc/models/device-profile-request.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
DeviceProfileRequest body = new DeviceProfileRequest.Builder()
    .accountName("0000123456-00001")
    .servicePlan("service plan name")
    .build();

managingeSIMProfilesController.enableADeviceProfileForDownloadAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |


# Download a Device Profile

Download a Global IoT Orchestration device profile.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> downloadADeviceProfileAsync(
    final DeviceProfileRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DeviceProfileRequest`](../../doc/models/device-profile-request.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
DeviceProfileRequest body = new DeviceProfileRequest.Builder()
    .accountName("0000123456-00001")
    .servicePlan("service plan name")
    .build();

managingeSIMProfilesController.downloadADeviceProfileAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |


# Delete a Device Profile

Delete a device profile for Global IoT Orchestration. **Note:** the profile must be deactivated first!

```java
CompletableFuture<ApiResponse<GIORequestResponse>> deleteADeviceProfileAsync(
    final DeviceProfileRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DeviceProfileRequest`](../../doc/models/device-profile-request.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
DeviceProfileRequest body = new DeviceProfileRequest.Builder()
    .accountName("0000123456-00001")
    .servicePlan("service plan name")
    .build();

managingeSIMProfilesController.deleteADeviceProfileAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |

