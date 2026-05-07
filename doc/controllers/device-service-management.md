# Device Service Management

```java
DeviceServiceManagementController deviceServiceManagementController = client.getDeviceServiceManagementController();
```

## Class Name

`DeviceServiceManagementController`

## Methods

* [Get Device Hyper Precise Status](../../doc/controllers/device-service-management.md#get-device-hyper-precise-status)
* [Update Device Hyper Precise Status](../../doc/controllers/device-service-management.md#update-device-hyper-precise-status)


# Get Device Hyper Precise Status

Gets the list of a status for hyper-precise location devices.

```java
CompletableFuture<ApiResponse<BullseyeServiceResult>> getDeviceHyperPreciseStatusAsync(
    final String imei,
    final String accountNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `imei` | `String` | Query, Required | The International Mobile Equipment Identifier of the device. |
| `accountNumber` | `String` | Query, Required | The numeric name of the account and must include leading zeroes. |

## Server

`Server.HYPER_PRECISE_LOCATION`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`BullseyeServiceResult`](../../doc/models/bullseye-service-result.md).

## Example Usage

```java
String imei = "15-digit IMEI";
String accountNumber = "0000123456-00001";

deviceServiceManagementController.getDeviceHyperPreciseStatusAsync(imei, accountNumber).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof HyperPreciseLocationResultException) {
        HyperPreciseLocationResultException hyperPreciseLocationResultException = (HyperPreciseLocationResultException) cause;
        hyperPreciseLocationResultException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request. | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 401 | Unauthorized request. Access token is missing or invalid. | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 403 | Forbidden request. | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 404 | Bad request. Not found. | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 409 | Bad request. Conflict state. | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 500 | Internal Server Error. | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |


# Update Device Hyper Precise Status

Enable/disable hyper-precise service for a device.

```java
CompletableFuture<ApiResponse<BullseyeServiceResult>> updateDeviceHyperPreciseStatusAsync(
    final BullseyeServiceRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`BullseyeServiceRequest`](../../doc/models/bullseye-service-request.md) | Body, Required | List of devices and hyper-precise required statuses. |

## Server

`Server.HYPER_PRECISE_LOCATION`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`BullseyeServiceResult`](../../doc/models/bullseye-service-result.md).

## Example Usage

```java
BullseyeServiceRequest body = new BullseyeServiceRequest.Builder(
    Arrays.asList(
        new DeviceServiceRequest.Builder(
            "15-digit IMEI",
            new HplBullseyeEnable.Builder()
                .bullseyeEnable(true)
                .build()
        )
        .build()
    ),
    "0000123456-00001"
)
.build();

deviceServiceManagementController.updateDeviceHyperPreciseStatusAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof HyperPreciseLocationResultException) {
        HyperPreciseLocationResultException hyperPreciseLocationResultException = (HyperPreciseLocationResultException) cause;
        hyperPreciseLocationResultException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request. | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 401 | Unauthorized request. Access token is missing or invalid. | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 403 | Forbidden request. | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 404 | Bad request. Not found. | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 409 | Bad request. Conflict state. | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 500 | Internal Server Error. | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |

