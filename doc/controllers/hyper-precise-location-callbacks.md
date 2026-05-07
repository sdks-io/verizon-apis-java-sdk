# Hyper Precise Location Callbacks

```java
HyperPreciseLocationCallbacksController hyperPreciseLocationCallbacksController = client.getHyperPreciseLocationCallbacksController();
```

## Class Name

`HyperPreciseLocationCallbacksController`

## Methods

* [List Registered Callbacks](../../doc/controllers/hyper-precise-location-callbacks.md#list-registered-callbacks)
* [Register Callback](../../doc/controllers/hyper-precise-location-callbacks.md#register-callback)
* [Deregister Callback](../../doc/controllers/hyper-precise-location-callbacks.md#deregister-callback)


# List Registered Callbacks

Find registered callback listener for account by account number.

```java
CompletableFuture<ApiResponse<List<CallbackCreated>>> listRegisteredCallbacksAsync(
    final String accountNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountNumber` | `String` | Query, Required | The numeric ID of the account and must include leading zeroes. This value is indentical to `accountName`. |

## Server

`Server.HYPER_PRECISE_LOCATION`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`List<CallbackCreated>`](../../doc/models/callback-created.md).

## Example Usage

```java
String accountNumber = "0000123456-00001";

hyperPreciseLocationCallbacksController.listRegisteredCallbacksAsync(accountNumber).thenAccept(result -> {
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
    "accountName": "0000123456-00001",
    "name": "BullseyeReporting",
    "url": "https://tsustgtests.mocklab.io/notifications/bullseye"
  }
]
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


# Register Callback

Registers a URL at which an account receives asynchronous responses and other messages from a ThingSpace Platform callback service. The messages are REST messages. You are responsible for creating and running a listening process on your server at that URL to receive and parse the messages.

```java
CompletableFuture<ApiResponse<CallbackRegistered>> registerCallbackAsync(
    final String accountNumber,
    final HyperPreciseLocationCallback body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountNumber` | `String` | Query, Required | A unique identifier for an account. |
| `body` | [`HyperPreciseLocationCallback`](../../doc/models/hyper-precise-location-callback.md) | Body, Required | - |

## Server

`Server.HYPER_PRECISE_LOCATION`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`CallbackRegistered`](../../doc/models/callback-registered.md).

## Example Usage

```java
String accountNumber = "0000123456-00001";
HyperPreciseLocationCallback body = new HyperPreciseLocationCallback.Builder(
    "BullseyeReporting",
    "https://tsustgtests.mocklab.io/notifications/bullseye"
)
.build();

hyperPreciseLocationCallbacksController.registerCallbackAsync(accountNumber, body).thenAccept(result -> {
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
{
  "accountName": "0000123456-00001",
  "name": "BullseyeReporting"
}
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


# Deregister Callback

Stops ThingSpace from sending callback messages for the specified account and listener name.

```java
CompletableFuture<ApiResponse<Void>> deregisterCallbackAsync(
    final String accountNumber,
    final String service)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountNumber` | `String` | Query, Required | The numeric ID of the account and must include leading zeroes. This value is indentical to `accountName`. |
| `service` | `String` | Query, Required | The name of the callback service that will be deleted. |

## Server

`Server.HYPER_PRECISE_LOCATION`

## Response Type

`void`

## Example Usage

```java
String accountNumber = "0000123456-00001";
String service = "BullseyeReporting";

hyperPreciseLocationCallbacksController.deregisterCallbackAsync(accountNumber, service).thenAccept(result -> {
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

