# Diagnostics Subscriptions

```java
DiagnosticsSubscriptionsController diagnosticsSubscriptionsController = client.getDiagnosticsSubscriptionsController();
```

## Class Name

`DiagnosticsSubscriptionsController`


# Get Diagnostics Subscription

This endpoint retrieves a diagnostics subscription by account.

```java
CompletableFuture<ApiResponse<DiagnosticsSubscription>> getDiagnosticsSubscriptionAsync(
    final String accountName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Query, Required | Account identifier. |

## Server

`Server.DEVICE_DIAGNOSTICS`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`DiagnosticsSubscription`](../../doc/models/diagnostics-subscription.md).

## Example Usage

```java
String accountName = "0000123456-00001";

diagnosticsSubscriptionsController.getDiagnosticsSubscriptionAsync(accountName).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof DeviceDiagnosticsResultException) {
        DeviceDiagnosticsResultException deviceDiagnosticsResultException = (DeviceDiagnosticsResultException) cause;
        deviceDiagnosticsResultException.printStackTrace();
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
  "accountName": "TestQAAccount",
  "skuName": "TS-BUNDLE-KTO-DIAGNOSTIC-MRC",
  "totalAllowed": 100,
  "totalUsed": 50,
  "createdOn": "2019-08-29T00:47:59.240Z",
  "lastUpdated": "2019-08-29T00:47:59.240Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response. | [`DeviceDiagnosticsResultException`](../../doc/models/device-diagnostics-result-exception.md) |

