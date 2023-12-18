# Device Profile Management

```java
DeviceProfileManagementController deviceProfileManagementController = client.getDeviceProfileManagementController();
```

## Class Name

`DeviceProfileManagementController`

## Methods

* [Activate Device Through Profile](../../doc/controllers/device-profile-management.md#activate-device-through-profile)
* [Profile to Activate Device](../../doc/controllers/device-profile-management.md#profile-to-activate-device)
* [Profile to Deactivate Device](../../doc/controllers/device-profile-management.md#profile-to-deactivate-device)
* [Profile to Set Fallback Attribute](../../doc/controllers/device-profile-management.md#profile-to-set-fallback-attribute)


# Activate Device Through Profile

Uses the profile to bring the device under management.

```java
CompletableFuture<ApiResponse<RequestResponse>> activateDeviceThroughProfileAsync(
    final ActivateDeviceProfileRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ActivateDeviceProfileRequest`](../../doc/models/activate-device-profile-request.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`RequestResponse`](../../doc/models/request-response.md)

## Example Usage

```java
ActivateDeviceProfileRequest body = new ActivateDeviceProfileRequest.Builder()
    .devices(Arrays.asList(
        new DeviceList.Builder()
            .deviceIds(Arrays.asList(
                new DeviceId.Builder()
                    .id("32-digit EID")
                    .kind("eid")
                    .build(),
                new DeviceId.Builder()
                    .id("15-digit IMEI")
                    .kind("imei")
                    .build()
            ))
            .build()
    ))
    .accountName("0000123456-00001")
    .servicePlan("The service plan name")
    .mdnZIpCode("five digit zip code")
    .build();

deviceProfileManagementController.activateDeviceThroughProfileAsync(body).thenAccept(result -> {
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
| 400 | Bad request | [`RestErrorResponseException`](../../doc/models/rest-error-response-exception.md) |


# Profile to Activate Device

Uses the profile to activate the device.

```java
CompletableFuture<ApiResponse<RequestResponse>> profileToActivateDeviceAsync(
    final ProfileRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ProfileRequest`](../../doc/models/profile-request.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`RequestResponse`](../../doc/models/request-response.md)

## Example Usage

```java
ProfileRequest body = new ProfileRequest.Builder()
    .carrierName("the name of the mobile service provider")
    .accountName("0000123456-00001")
    .servicePlan("The service plan name")
    .mdnZIpCode("five digit zip code")
    .build();

deviceProfileManagementController.profileToActivateDeviceAsync(body).thenAccept(result -> {
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
| 400 | Bad request | [`RestErrorResponseException`](../../doc/models/rest-error-response-exception.md) |


# Profile to Deactivate Device

Uses the profile to deactivate the device.

```java
CompletableFuture<ApiResponse<RequestResponse>> profileToDeactivateDeviceAsync(
    final DeactivateDeviceProfileRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DeactivateDeviceProfileRequest`](../../doc/models/deactivate-device-profile-request.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`RequestResponse`](../../doc/models/request-response.md)

## Example Usage

```java
DeactivateDeviceProfileRequest body = new DeactivateDeviceProfileRequest.Builder()
    .accountName("0000123456-00001")
    .carrierName("the name of the mobile service provider")
    .reasonCode("a short code for the reason action was taken")
    .etfWaiver(true)
    .checkFallbackProfile(false)
    .build();

deviceProfileManagementController.profileToDeactivateDeviceAsync(body).thenAccept(result -> {
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
| 400 | Bad request | [`RestErrorResponseException`](../../doc/models/rest-error-response-exception.md) |


# Profile to Set Fallback Attribute

Allows the profile to set the fallback attribute to the device.

```java
CompletableFuture<ApiResponse<RequestResponse>> profileToSetFallbackAttributeAsync(
    final SetFallbackAttributeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SetFallbackAttributeRequest`](../../doc/models/set-fallback-attribute-request.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`RequestResponse`](../../doc/models/request-response.md)

## Example Usage

```java
SetFallbackAttributeRequest body = new SetFallbackAttributeRequest.Builder()
    .accountName("0000123456-00001")
    .carrierName("the name of the mobile service provider")
    .build();

deviceProfileManagementController.profileToSetFallbackAttributeAsync(body).thenAccept(result -> {
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
| 400 | Bad request | [`RestErrorResponseException`](../../doc/models/rest-error-response-exception.md) |

