# Intelligence Service Controller

```java
IntelligenceServiceController intelligenceServiceController = client.getIntelligenceServiceController();
```

## Class Name

`IntelligenceServiceController`

## Methods

* [Set Connection Planner](../../doc/controllers/intelligence-service-controller.md#set-connection-planner)
* [Status Connection Planner](../../doc/controllers/intelligence-service-controller.md#status-connection-planner)


# Set Connection Planner

Retrieves available device windows for Connection Planner.

```java
CompletableFuture<ApiResponse<AsynchronousRequestResultforplanner>> setConnectionPlannerAsync(
    final GetDevicesWindowsRequestforplanner body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GetDevicesWindowsRequestforplanner`](../../doc/models/get-devices-windows-requestforplanner.md) | Body, Optional | - |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`AsynchronousRequestResultforplanner`](../../doc/models/asynchronous-request-resultforplanner.md).

## Example Usage

```java
GetDevicesWindowsRequestforplanner body = new GetDevicesWindowsRequestforplanner.Builder()
    .accountNumber("0000123456-00001")
    .filter("All or Best or Worst")
    .devices(Arrays.asList(
        new DeviceListforplanner.Builder()
            .deviceIds(Arrays.asList(
                new DeviceIdforplanner.Builder()
                    .kind("imei")
                    .id("15-digit IMEI value")
                    .build()
            ))
            .build()
    ))
    .build();

intelligenceServiceController.setConnectionPlannerAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof RestErrorResponseforplannerException) {
        RestErrorResponseforplannerException restErrorResponseforplannerException = (RestErrorResponseforplannerException) cause;
        restErrorResponseforplannerException.printStackTrace();
    } else if (cause instanceof AuthRestErrorResponseforplannerException) {
        AuthRestErrorResponseforplannerException authRestErrorResponseforplannerException = (AuthRestErrorResponseforplannerException) cause;
        authRestErrorResponseforplannerException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "requestId": "d24cc6e4-eeee-ffff-gggg-0ffbb091c076"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |
| 401 | Unauthorized | [`AuthRestErrorResponseforplannerException`](../../doc/models/auth-rest-error-responseforplanner-exception.md) |
| 403 | Forbidden | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |
| 404 | Not Found / Does not exist | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |
| 406 | Format / Request Unacceptable | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |
| 429 | Too many requests | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |
| Default | Error response | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |


# Status Connection Planner

Retrieves the device status for the Connection Planner service.

```java
CompletableFuture<ApiResponse<GetDeviceStatusesResponseforplanner>> statusConnectionPlannerAsync(
    final GetDeviceStatusesRequestforplanner body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GetDeviceStatusesRequestforplanner`](../../doc/models/get-device-statuses-requestforplanner.md) | Body, Optional | - |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`GetDeviceStatusesResponseforplanner`](../../doc/models/get-device-statuses-responseforplanner.md).

## Example Usage

```java
GetDeviceStatusesRequestforplanner body = new GetDeviceStatusesRequestforplanner.Builder()
    .accountNumber("0000123456-00001")
    .requestId("d24cc6e4-eeee-ffff-gggg-0ffbb091c076")
    .build();

intelligenceServiceController.statusConnectionPlannerAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof RestErrorResponseforplannerException) {
        RestErrorResponseforplannerException restErrorResponseforplannerException = (RestErrorResponseforplannerException) cause;
        restErrorResponseforplannerException.printStackTrace();
    } else if (cause instanceof AuthRestErrorResponseforplannerException) {
        AuthRestErrorResponseforplannerException authRestErrorResponseforplannerException = (AuthRestErrorResponseforplannerException) cause;
        authRestErrorResponseforplannerException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "accountNumber": "0000123456-00001",
  "requestId": "d24cc6e4-eeee-ffff-gggg-0ffbb091c076",
  "deviceStatusList": [
    {
      "deviceIds": [
        {
          "kind": "Imei",
          "id": "15-digit IMEI"
        }
      ],
      "status": "SUCCESS",
      "reason": "reason for the status"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |
| 401 | Unauthorized | [`AuthRestErrorResponseforplannerException`](../../doc/models/auth-rest-error-responseforplanner-exception.md) |
| 403 | Forbidden | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |
| 404 | Not Found / Does not exist | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |
| 406 | Format / Request Unacceptable | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |
| 429 | Too many requests | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |
| Default | Error response | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |

