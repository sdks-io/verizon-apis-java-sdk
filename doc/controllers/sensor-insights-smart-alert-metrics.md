# Sensor Insights Smart Alert Metrics

```java
SensorInsightsSmartAlertMetricsController sensorInsightsSmartAlertMetricsController = client.getSensorInsightsSmartAlertMetricsController();
```

## Class Name

`SensorInsightsSmartAlertMetricsController`


# Sensorinsightsmetricsquery

Get Device Alerts for the most recent daily period, up to 30 days.

```java
CompletableFuture<ApiResponse<DtoQueryMetricsResponse>> sensorinsightsmetricsqueryAsync(
    final DtoQueryMetrics body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DtoQueryMetrics`](../../doc/models/dto-query-metrics.md) | Body, Required | Daily period requested, up to 30 days. |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`DtoQueryMetricsResponse`](../../doc/models/dto-query-metrics-response.md).

## Example Usage

```java
DtoQueryMetrics body = new DtoQueryMetrics.Builder()
    .days(30)
    .build();

sensorInsightsSmartAlertMetricsController.sensorinsightsmetricsqueryAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof M400ManagementErrorException) {
        M400ManagementErrorException m400ManagementErrorException = (M400ManagementErrorException) cause;
        m400ManagementErrorException.printStackTrace();
    } else if (cause instanceof ManagementErrorException) {
        ManagementErrorException managementErrorException = (ManagementErrorException) cause;
        managementErrorException.printStackTrace();
    } else if (cause instanceof M403ManagementErrorException) {
        M403ManagementErrorException m403ManagementErrorException = (M403ManagementErrorException) cause;
        m403ManagementErrorException.printStackTrace();
    } else if (cause instanceof M500ManagementErrorException) {
        M500ManagementErrorException m500ManagementErrorException = (M500ManagementErrorException) cause;
        m500ManagementErrorException.printStackTrace();
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
| 400 | Bad Request | [`M400ManagementErrorException`](../../doc/models/m400-management-error-exception.md) |
| 401 | UnAuthorized | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 403 | Forbidden | [`M403ManagementErrorException`](../../doc/models/m403-management-error-exception.md) |
| 500 | Internal server error. | [`M500ManagementErrorException`](../../doc/models/m500-management-error-exception.md) |

