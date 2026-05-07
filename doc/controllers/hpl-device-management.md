# HPL Device Management

```java
HPLDeviceManagementController hPLDeviceManagementController = client.getHPLDeviceManagementController();
```

## Class Name

`HPLDeviceManagementController`


# Add Devices Hyper Precise

Use this API if you want to manage some device settings before you are ready to activate service for the devices.

```java
CompletableFuture<ApiResponse<List<HplAddDevicesRequest>>> addDevicesHyperPreciseAsync(
    final HplAddDevicesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`HplAddDevicesRequest`](../../doc/models/hpl-add-devices-request.md) | Body, Required | Devices to add to the account. |

## Server

`Server.HYPER_PRECISE_LOCATION`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`List<HplAddDevicesRequest>`](../../doc/models/hpl-add-devices-request.md).

## Example Usage

```java
HplAddDevicesRequest body = new HplAddDevicesRequest.Builder()
    .state("preactive")
    .devicesToAdd(Arrays.asList(
        new HplAccountDeviceList.Builder()
            .deviceIds(Arrays.asList(
                new HplDeviceId.Builder()
                    .kind("imei")
                    .id("15-digit IMEI")
                    .build(),
                new HplDeviceId.Builder()
                    .kind("iccid")
                    .id("20-digit ICCID")
                    .build()
            ))
            .build(),
        new HplAccountDeviceList.Builder()
            .deviceIds(Arrays.asList(
                new HplDeviceId.Builder()
                    .kind("imei")
                    .id("15-digit IMEI")
                    .build(),
                new HplDeviceId.Builder()
                    .kind("iccid")
                    .id("20-digit ICCID")
                    .build()
            ))
            .build()
    ))
    .accountName("0000123456-00001")
    .customFields(Arrays.asList(
        new HplCustomFields.Builder()
            .key("CustomField2")
            .value("SuperVend")
            .build()
    ))
    .groupName("West Region")
    .build();

hPLDeviceManagementController.addDevicesHyperPreciseAsync(body).thenAccept(result -> {
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

## Example Response *(as JSON)*

```json
[
  {
    "deviceIds": [
      {
        "id": "20-digit ICCID",
        "kind": "iccid"
      }
    ],
    "response": "Success"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request. | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 401 | Unauthorized | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 403 | Forbidden | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 404 | Not Found / Does not exist | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 405 | Method Not Allowed | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 406 | Format / Request Unacceptable | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 429 | Too many requests | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| 500 | Internal Server Error | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |
| Default | Error response | [`HyperPreciseLocationResultException`](../../doc/models/hyper-precise-location-result-exception.md) |

