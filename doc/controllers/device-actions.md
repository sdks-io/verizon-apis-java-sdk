# Device Actions

```java
DeviceActionsController deviceActionsController = client.getDeviceActionsController();
```

## Class Name

`DeviceActionsController`

## Methods

* [Aggregate Usage](../../doc/controllers/device-actions.md#aggregate-usage)
* [Daily Usage](../../doc/controllers/device-actions.md#daily-usage)
* [Service Plan List](../../doc/controllers/device-actions.md#service-plan-list)
* [Account Information](../../doc/controllers/device-actions.md#account-information)
* [Retrieve the Global Device List](../../doc/controllers/device-actions.md#retrieve-the-global-device-list)
* [Retrieve Device Provisioning History](../../doc/controllers/device-actions.md#retrieve-device-provisioning-history)
* [Get Asynchronous Request Status](../../doc/controllers/device-actions.md#get-asynchronous-request-status)


# Aggregate Usage

Retrieve the aggregate usage for a device or a number of devices.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> aggregateUsageAsync(
    final AggregateUsage body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`AggregateUsage`](../../doc/models/aggregate-usage.md) | Body, Required | - |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
AggregateUsage body = new AggregateUsage.Builder()
    .build();

deviceActionsController.aggregateUsageAsync(body).thenAccept(result -> {
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


# Daily Usage

Retrieve the daily usage for a device, for a specified period of time, segmented by day

```java
CompletableFuture<ApiResponse<DailyUsageResponse>> dailyUsageAsync(
    final DailyUsage body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DailyUsage`](../../doc/models/daily-usage.md) | Body, Required | - |

## Server

`Server.THINGSPACE`

## Response Type

[`DailyUsageResponse`](../../doc/models/daily-usage-response.md)

## Example Usage

```java
DailyUsage body = new DailyUsage.Builder()
    .build();

deviceActionsController.dailyUsageAsync(body).thenAccept(result -> {
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


# Service Plan List

Retrieve all of the service plans, features and carriers associated with the account specified.

```java
CompletableFuture<ApiResponse<AccountDetails>> servicePlanListAsync(
    final String accountName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Template, Required | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` |

## Server

`Server.THINGSPACE`

## Response Type

[`AccountDetails`](../../doc/models/account-details.md)

## Example Usage

```java
String accountName = "accountName4";

deviceActionsController.servicePlanListAsync(accountName).thenAccept(result -> {
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


# Account Information

Retrieve all of the service plans, features and carriers associated with the account specified.

```java
CompletableFuture<ApiResponse<AccountDetails>> accountInformationAsync(
    final String accountName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Template, Required | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` |

## Server

`Server.THINGSPACE`

## Response Type

[`AccountDetails`](../../doc/models/account-details.md)

## Example Usage

```java
String accountName = "accountName4";

deviceActionsController.accountInformationAsync(accountName).thenAccept(result -> {
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


# Retrieve the Global Device List

Allows the profile to fetch the complete device list. This works with Verizon US and Global profiles.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> retrieveTheGlobalDeviceListAsync(
    final GetDeviceListWithProfilesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GetDeviceListWithProfilesRequest`](../../doc/models/get-device-list-with-profiles-request.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
GetDeviceListWithProfilesRequest body = new GetDeviceListWithProfilesRequest.Builder(
    "0000123456-00001"
)
.provisioningStatusFilter("ACTIVE")
.profileStatusFilter("UNKNOWN")
.build();

deviceActionsController.retrieveTheGlobalDeviceListAsync(body).thenAccept(result -> {
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


# Retrieve Device Provisioning History

Retrieve the provisioning history of a specific device or devices.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> retrieveDeviceProvisioningHistoryAsync(
    final ProvhistoryRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ProvhistoryRequest`](../../doc/models/provhistory-request.md) | Body, Required | Device Provisioning History |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
ProvhistoryRequest body = new ProvhistoryRequest.Builder()
    .accountName("0000123456-00001")
    .earliest(DateTimeHelper.fromRfc8601DateTime("10/15/2021 04:49:35"))
    .latest(DateTimeHelper.fromRfc8601DateTime("10/15/2021 04:49:49"))
    .build();

deviceActionsController.retrieveDeviceProvisioningHistoryAsync(body).thenAccept(result -> {
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


# Get Asynchronous Request Status

Get the status of an asynchronous request made with the Device Actions.

```java
CompletableFuture<ApiResponse<StatusResponse>> getAsynchronousRequestStatusAsync(
    final String accountName,
    final String requestID)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Template, Required | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9\-]{3,32}$` |
| `requestID` | `String` | Template, Required | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `64`, *Pattern*: `^[A-Za-z0-9\-]{3,64}$` |

## Server

`Server.THINGSPACE`

## Response Type

[`StatusResponse`](../../doc/models/status-response.md)

## Example Usage

```java
String accountName = "0000123456-00001";
String requestID = "d1f08526-5443-4054-9a29-4456490ea9f8";

deviceActionsController.getAsynchronousRequestStatusAsync(accountName, requestID).thenAccept(result -> {
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

