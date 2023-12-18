# Diagnostics Subscr Ip Tions

```java
DiagnosticsSubscrIpTionsController diagnosticsSubscrIpTionsController = client.getDiagnosticsSubscrIpTionsController();
```

## Class Name

`DiagnosticsSubscrIpTionsController`


# Get Diagnostics Subscr Ip Tion

This endpoint retrieves a diagnostics subscription by account.

```java
CompletableFuture<ApiResponse<DiagnosticsSubscrIpTion>> getDiagnosticsSubscrIpTionAsync(
    final String accountName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Query, Required | Account identifier. |

## Server

`Server.DEVICE_DIAGNOSTICS`

## Response Type

[`DiagnosticsSubscrIpTion`](../../doc/models/diagnostics-subscr-ip-tion.md)

## Example Usage

```java
String accountName = "0000123456-00001";

diagnosticsSubscrIpTionsController.getDiagnosticsSubscrIpTionAsync(accountName).thenAccept(result -> {
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

