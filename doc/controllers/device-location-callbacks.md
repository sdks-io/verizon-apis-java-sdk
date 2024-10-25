# Device Location Callbacks

```java
DeviceLocationCallbacksController deviceLocationCallbacksController = client.getDeviceLocationCallbacksController();
```

## Class Name

`DeviceLocationCallbacksController`

## Methods

* [Cancel Async Report](../../doc/controllers/device-location-callbacks.md#cancel-async-report)
* [List Registered Callbacks](../../doc/controllers/device-location-callbacks.md#list-registered-callbacks)
* [Register Callback](../../doc/controllers/device-location-callbacks.md#register-callback)
* [Deregister Callback](../../doc/controllers/device-location-callbacks.md#deregister-callback)


# Cancel Async Report

Cancel an asynchronous report request.

```java
CompletableFuture<ApiResponse<TransactionID>> cancelAsyncReportAsync(
    final String accountName,
    final String txid)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Query, Required | Account identifier in "##########-#####". |
| `txid` | `String` | Template, Required | The `transactionId` value. |

## Server

`Server.DEVICE_LOCATION`

## Response Type

[`TransactionID`](../../doc/models/transaction-id.md)

## Example Usage

```java
String accountName = "0000123456-00001";
String txid = "2c90bd28-eeee-ffff-gggg-7e3bd4fbff33";

deviceLocationCallbacksController.cancelAsyncReportAsync(accountName, txid).thenAccept(result -> {
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
  "txid": "2c90bd28-eeee-ffff-gggg-7e3bd4fbff33"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Unexpected error. | [`DeviceLocationResultException`](../../doc/models/device-location-result-exception.md) |


# List Registered Callbacks

Returns a list of all registered callback URLs for the account.

```java
CompletableFuture<ApiResponse<List<DeviceLocationCallback>>> listRegisteredCallbacksAsync(
    final String accountName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Template, Required | Account number. |

## Server

`Server.DEVICE_LOCATION`

## Response Type

[`List<DeviceLocationCallback>`](../../doc/models/device-location-callback.md)

## Example Usage

```java
String accountName = "0000123456-00001";

deviceLocationCallbacksController.listRegisteredCallbacksAsync(accountName).thenAccept(result -> {
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
[
  {
    "name": "Location",
    "url": "http://10.120.102.147:50569/CallbackListener/Location.asmx"
  },
  {
    "name": "Location",
    "url": "http://10.120.102.147:50569/CallbackListener/DeviceLocation.asmx"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Error response. | [`DeviceLocationResultException`](../../doc/models/device-location-result-exception.md) |


# Register Callback

Provide a URL to receive messages from a ThingSpace callback service.

```java
CompletableFuture<ApiResponse<CallbackRegistrationResult>> registerCallbackAsync(
    final String accountName,
    final DeviceLocationCallback body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Template, Required | Account number. |
| `body` | [`DeviceLocationCallback`](../../doc/models/device-location-callback.md) | Body, Required | Request to register a callback. |

## Server

`Server.DEVICE_LOCATION`

## Response Type

[`CallbackRegistrationResult`](../../doc/models/callback-registration-result.md)

## Example Usage

```java
String accountName = "0000123456-00001";
DeviceLocationCallback body = new DeviceLocationCallback.Builder(
    CallbackServiceNameEnum.LOCATION,
    "http://10.120.102.183:50559/CallbackListener/LocationServiceMessages.asmx"
)
.build();

deviceLocationCallbacksController.registerCallbackAsync(accountName, body).thenAccept(result -> {
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
  "account": "0212312345-00001",
  "name": "Location"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Error response. | [`DeviceLocationResultException`](../../doc/models/device-location-result-exception.md) |


# Deregister Callback

Deregister a URL to stop receiving callback messages.

```java
CompletableFuture<ApiResponse<DeviceLocationSuccessResult>> deregisterCallbackAsync(
    final String accountName,
    final CallbackServiceNameEnum service)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Template, Required | Account number. |
| `service` | [`CallbackServiceNameEnum`](../../doc/models/callback-service-name-enum.md) | Template, Required | Callback service name. |

## Server

`Server.DEVICE_LOCATION`

## Response Type

[`DeviceLocationSuccessResult`](../../doc/models/device-location-success-result.md)

## Example Usage

```java
String accountName = "0000123456-00001";
CallbackServiceNameEnum service = CallbackServiceNameEnum.LOCATION;

deviceLocationCallbacksController.deregisterCallbackAsync(accountName, service).thenAccept(result -> {
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
  "success": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Error response. | [`DeviceLocationResultException`](../../doc/models/device-location-result-exception.md) |

