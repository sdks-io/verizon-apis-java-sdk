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

## Server

`Server.THINGSPACE`

## Response Type

[`RequestResponse`](../../doc/models/request-response.md)

## Example Usage

```java
NotificationReportRequest body = new NotificationReportRequest.Builder(
    "0242072320-00001",
    "REACHABLE_FOR_DATA",
    Arrays.asList(
        new DeviceList.Builder()
            .deviceIds(Arrays.asList(
                new DeviceId.Builder(
                    "89148000004292933820",
                    "iccid"
                )
                .build(),
                new DeviceId.Builder(
                    "89148000003164287919",
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
    // TODO failure callback handler
    exception.printStackTrace();
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
    final StopMonitorRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`StopMonitorRequest`](../../doc/models/stop-monitor-request.md) | Body, Optional | - |

## Server

`Server.THINGSPACE`

## Response Type

[`RequestResponse`](../../doc/models/request-response.md)

## Example Usage

```java
StopMonitorRequest body = new StopMonitorRequest.Builder(
    "0242123520-00001",
    Arrays.asList(
        "35596ca6-bab4-4333-a914-42b4fc2da54c"
    )
)
.build();

deviceMonitoringController.stopDeviceReachabilityAsync(body).thenAccept(result -> {
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
| 400 | Error Response | [`RestErrorResponseException`](../../doc/models/rest-error-response-exception.md) |

