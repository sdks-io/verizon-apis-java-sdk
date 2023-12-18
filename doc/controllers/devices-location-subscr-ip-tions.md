# Devices Location Subscr Ip Tions

```java
DevicesLocationSubscrIpTionsController devicesLocationSubscrIpTionsController = client.getDevicesLocationSubscrIpTionsController();
```

## Class Name

`DevicesLocationSubscrIpTionsController`

## Methods

* [Get Location Service Subscr Ip Tion Status](../../doc/controllers/devices-location-subscr-ip-tions.md#get-location-service-subscr-ip-tion-status)
* [Get Location Service Usage](../../doc/controllers/devices-location-subscr-ip-tions.md#get-location-service-usage)


# Get Location Service Subscr Ip Tion Status

This subscriptions endpoint retrieves an account's current location subscription status.

```java
CompletableFuture<ApiResponse<DeviceLocationSubscrIpTion>> getLocationServiceSubscrIpTionStatusAsync(
    final String account)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `account` | `String` | Template, Required | Account identifier in "##########-#####". |

## Server

`Server.DEVICE_LOCATION`

## Response Type

[`DeviceLocationSubscrIpTion`](../../doc/models/device-location-subscr-ip-tion.md)

## Example Usage

```java
String account = "0000123456-00001";

devicesLocationSubscrIpTionsController.getLocationServiceSubscrIpTionStatusAsync(account).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "accountName": "2024009649-00001",
  "locType": "TS-LOC-COARSE-CellID-5K",
  "maxAllowance": "5000",
  "purchaseTime": "2017-05-10 06:25:25.171 +0000 UTC"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Unexpected error. | [`DeviceLocationResultException`](../../doc/models/device-location-result-exception.md) |


# Get Location Service Usage

This endpoint allows user to search for billable usage for accounts based on the provided date range.

```java
CompletableFuture<ApiResponse<Object>> getLocationServiceUsageAsync(
    final BillUsageRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`BillUsageRequest`](../../doc/models/bill-usage-request.md) | Body, Required | Request to obtain billable usage for accounts. |

## Server

`Server.DEVICE_LOCATION`

## Response Type

`Object`

## Example Usage

```java
BillUsageRequest body = new BillUsageRequest.Builder()
    .accountName("1234567890-00001")
    .startDate("04-01-2018")
    .endDate("04-30-2018")
    .usageForAllAccounts(true)
    .build();

devicesLocationSubscrIpTionsController.getLocationServiceUsageAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response

```
{
  "accountName": "1223334444-00001",
  "usageForAllAcounts": false,
  "skuName": "TS-LOC-COARSE-CellID-Aggr",
  "transactionsAllowed": "5000",
  "totalTransactionCount": "350",
  "PrimaryAccount": {
    "accountName": "1223334444-00001",
    "transactionsCount": "125"
  },
  "ManagedAccounts": []
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Unexpected error. | [`DeviceLocationResultException`](../../doc/models/device-location-result-exception.md) |

