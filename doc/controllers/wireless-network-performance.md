# Wireless Network Performance

```java
WirelessNetworkPerformanceController wirelessNetworkPerformanceController = client.getWirelessNetworkPerformanceController();
```

## Class Name

`WirelessNetworkPerformanceController`

## Methods

* [Near Real Time Network Conditions](../../doc/controllers/wireless-network-performance.md#near-real-time-network-conditions)
* [Domestic 4 G and 5G Nationwide Network Coverage](../../doc/controllers/wireless-network-performance.md#domestic-4-g-and-5g-nationwide-network-coverage)
* [Site Proximity](../../doc/controllers/wireless-network-performance.md#site-proximity)
* [Device Experience 30 Days History](../../doc/controllers/wireless-network-performance.md#device-experience-30-days-history)
* [Device Experience Bulk Latest](../../doc/controllers/wireless-network-performance.md#device-experience-bulk-latest)


# Near Real Time Network Conditions

WNP Query for current network condition.

```java
CompletableFuture<ApiResponse<WNPRequestResponse>> nearRealTimeNetworkConditionsAsync(
    final GetNetworkConditionsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GetNetworkConditionsRequest`](../../doc/models/get-network-conditions-request.md) | Body, Required | Request for current network health. |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`WNPRequestResponse`](../../doc/models/wnp-request-response.md).

## Example Usage

```java
GetNetworkConditionsRequest body = new GetNetworkConditionsRequest.Builder(
    "0000123456-00001",
    "LONGLAT",
    new Coordinates.Builder()
        .latitude("-33.84819")
        .longitude("151.22049")
        .build()
)
.build();

wirelessNetworkPerformanceController.nearRealTimeNetworkConditionsAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof WNPRestErrorResponseException) {
        WNPRestErrorResponseException wNPRestErrorResponseException = (WNPRestErrorResponseException) cause;
        wNPRestErrorResponseException.printStackTrace();
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
  "requestId": "d1f08526-eeee-ffff-gggg-4456490ea9f8"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`WNPRestErrorResponseException`](../../doc/models/wnp-rest-error-response-exception.md) |


# Domestic 4 G and 5G Nationwide Network Coverage

Run a report for FWA Address qualification or to determine network types available and available coverage. Network types covered include: CAT-M, NB-IOT, LTE, LTE-AWS, 5GNW, MMWAVE and C-BAND.

```java
CompletableFuture<ApiResponse<WNPRequestResponse>> domestic4GAnd5gNationwideNetworkCoverageAsync(
    final Domestic4GAnd5gNationwideNetworkCoverageBody body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Domestic4GAnd5gNationwideNetworkCoverageBody`](../../doc/models/containers/domestic-4-g-and-5g-nationwide-network-coverage-body.md) | Body, Required | This is a container for any-of cases. |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`WNPRequestResponse`](../../doc/models/wnp-request-response.md).

## Example Usage

```java
Domestic4GAnd5gNationwideNetworkCoverageBody body = Domestic4GAnd5gNationwideNetworkCoverageBody.fromGetWirelessCoverageRequestFWA(
    new GetWirelessCoverageRequestFWA.Builder(
        "0000123456-00001",
        "FWA",
        "ADDRESS",
        new Locations.Builder()
            .addressList(Arrays.asList(
                new AddressItem.Builder()
                    .addressLine1("street address")
                    .city("city")
                    .state("LA")
                    .country("USA")
                    .zip("00000")
                    .build()
            ))
            .build(),
        Arrays.asList(
            new NetworkTypeObject.Builder()
                .networkType("LTE")
                .build()
        )
    )
    .build()
);
wirelessNetworkPerformanceController.domestic4GAnd5gNationwideNetworkCoverageAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof WNPRestErrorResponseException) {
        WNPRestErrorResponseException wNPRestErrorResponseException = (WNPRestErrorResponseException) cause;
        wNPRestErrorResponseException.printStackTrace();
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
  "requestId": "d1f08526-eeee-ffff-gggg-4456490ea9f8"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`WNPRestErrorResponseException`](../../doc/models/wnp-rest-error-response-exception.md) |


# Site Proximity

Identify the direction and general distance of nearby cell sites and the technology supported by the equipment.

```java
CompletableFuture<ApiResponse<WNPRequestResponse>> siteProximityAsync(
    final GetNetworkConditionsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GetNetworkConditionsRequest`](../../doc/models/get-network-conditions-request.md) | Body, Required | Request for cell site proximity. |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`WNPRequestResponse`](../../doc/models/wnp-request-response.md).

## Example Usage

```java
GetNetworkConditionsRequest body = new GetNetworkConditionsRequest.Builder(
    "0000123456-00001",
    "LONGLAT",
    new Coordinates.Builder()
        .latitude("-33.84819")
        .longitude("151.22049")
        .build()
)
.build();

wirelessNetworkPerformanceController.siteProximityAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof WNPRestErrorResponseException) {
        WNPRestErrorResponseException wNPRestErrorResponseException = (WNPRestErrorResponseException) cause;
        wNPRestErrorResponseException.printStackTrace();
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
  "requestId": "d1f08526-eeee-ffff-gggg-4456490ea9f8"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`WNPRestErrorResponseException`](../../doc/models/wnp-rest-error-response-exception.md) |


# Device Experience 30 Days History

A report of a specific device's service scores over a 30 day period.

```java
CompletableFuture<ApiResponse<WNPRequestResponse>> deviceExperience30daysHistoryAsync(
    final GetDeviceExperienceScoreHistoryRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GetDeviceExperienceScoreHistoryRequest`](../../doc/models/get-device-experience-score-history-request.md) | Body, Required | Request for a device's 30 day experience. |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`WNPRequestResponse`](../../doc/models/wnp-request-response.md).

## Example Usage

```java
GetDeviceExperienceScoreHistoryRequest body = new GetDeviceExperienceScoreHistoryRequest.Builder(
    "0000123456-00001",
    new DeviceIdentifier.Builder(
        "iccid",
        "01234567899876543210"
    )
    .mdn("0123456789")
    .build()
)
.build();

wirelessNetworkPerformanceController.deviceExperience30daysHistoryAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof WNPRestErrorResponseException) {
        WNPRestErrorResponseException wNPRestErrorResponseException = (WNPRestErrorResponseException) cause;
        wNPRestErrorResponseException.printStackTrace();
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
  "requestId": "d1f08526-eeee-ffff-gggg-4456490ea9f8"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`WNPRestErrorResponseException`](../../doc/models/wnp-rest-error-response-exception.md) |


# Device Experience Bulk Latest

Run a report to view the latest device experience score for specific devices.

```java
CompletableFuture<ApiResponse<WNPRequestResponse>> deviceExperienceBulkLatestAsync(
    final GetDeviceExperienceScoreBulkRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GetDeviceExperienceScoreBulkRequest`](../../doc/models/get-device-experience-score-bulk-request.md) | Body, Required | Request for bulk latest history details. |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`WNPRequestResponse`](../../doc/models/wnp-request-response.md).

## Example Usage

```java
GetDeviceExperienceScoreBulkRequest body = new GetDeviceExperienceScoreBulkRequest.Builder(
    "0000123456-00001",
    Arrays.asList(
        new DeviceIdentifier.Builder(
            "iccid",
            "01234567899876543210"
        )
        .mdn("0123456789")
        .build()
    )
)
.build();

wirelessNetworkPerformanceController.deviceExperienceBulkLatestAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof WNPRestErrorResponseException) {
        WNPRestErrorResponseException wNPRestErrorResponseException = (WNPRestErrorResponseException) cause;
        wNPRestErrorResponseException.printStackTrace();
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
  "requestId": "d1f08526-eeee-ffff-gggg-4456490ea9f8"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`WNPRestErrorResponseException`](../../doc/models/wnp-rest-error-response-exception.md) |

