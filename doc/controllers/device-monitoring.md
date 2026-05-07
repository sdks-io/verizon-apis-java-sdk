# Device Monitoring

```java
DeviceMonitoringController deviceMonitoringController = client.getDeviceMonitoringController();
```

## Class Name

`DeviceMonitoringController`

## Methods

* [Device Reachability](../../doc/controllers/device-monitoring.md#device-reachability)
* [Stop Device Reachability](../../doc/controllers/device-monitoring.md#stop-device-reachability)


# Device Reachability

```java
CompletableFuture<ApiResponse<RequestResponse>> deviceReachabilityAsync(
    final NotificationReportRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`NotificationReportRequest`](../../doc/models/notification-report-request.md) | Body, Required | Create Reachability Report Request |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`RequestResponse`](../../doc/models/request-response.md).

## Example Usage

```java
NotificationReportRequest body = new NotificationReportRequest.Builder(
    "0000123456-00001",
    "REACHABLE_FOR_DATA",
    Arrays.asList(
        new DeviceList.Builder()
            .deviceIds(Arrays.asList(
                new DeviceId.Builder(
                    "20-digit ICCID",
                    "iccid"
                )
                .build(),
                new DeviceId.Builder(
                    "20-digit ICCID",
                    "iccid"
                )
                .build()
            ))
            .build()
    ),
    "2019-12-02T15:00:00-08:00Z"
)
.build();

deviceMonitoringController.deviceReachabilityAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof RestErrorResponseException) {
        RestErrorResponseException restErrorResponseException = (RestErrorResponseException) cause;
        restErrorResponseException.printStackTrace();
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
| 400 | Error Response | [`RestErrorResponseException`](../../doc/models/rest-error-response-exception.md) |


# Stop Device Reachability

```java
CompletableFuture<ApiResponse<RequestResponse>> stopDeviceReachabilityAsync(
    final StopMonitorRequest stopreachabilitypayload)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `stopreachabilitypayload` | [`StopMonitorRequest`](../../doc/models/stop-monitor-request.md) | Query, Required | Payload for the Stop Device Reachability monitors request. |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`RequestResponse`](../../doc/models/request-response.md).

## Example Usage

```java
StopMonitorRequest stopreachabilitypayload = new StopMonitorRequest.Builder(
    "0000123456-00001",
    Arrays.asList(
        new DeviceList.Builder()
            .deviceIds(Arrays.asList(
                new DeviceId.Builder(
                    "1+ 10-digit phone number",
                    "msisdn"
                )
                .build()
            ))
            .build()
    )
)
.build();

deviceMonitoringController.stopDeviceReachabilityAsync(stopreachabilitypayload).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof RestErrorResponseException) {
        RestErrorResponseException restErrorResponseException = (RestErrorResponseException) cause;
        restErrorResponseException.printStackTrace();
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
| 400 | Error Response | [`RestErrorResponseException`](../../doc/models/rest-error-response-exception.md) |

