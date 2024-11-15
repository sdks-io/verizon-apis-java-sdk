# Exclusions

Excluding or including devices (by consent) for location service

```java
ExclusionsController exclusionsController = client.getExclusionsController();
```

## Class Name

`ExclusionsController`


# Devices Location Give Consent Async

Create a consent record to use location services as an asynchronous request.

```java
CompletableFuture<ConsentTransactionID> devicesLocationGiveConsentAsyncAsync(
    final AccountConsentCreate body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`AccountConsentCreate`](../../doc/models/account-consent-create.md) | Body, Optional | Account details to create a consent record. |

## Response Type

[`ConsentTransactionID`](../../doc/models/consent-transaction-id.md)

## Example Usage

```java
exclusionsController.devicesLocationGiveConsentAsyncAsync(null).thenAccept(result -> {
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
| Default | Unexpected error. | [`DeviceLocationResultException`](../../doc/models/device-location-result-exception.md) |

