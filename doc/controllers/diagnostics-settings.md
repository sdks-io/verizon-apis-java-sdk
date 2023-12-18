# Diagnostics Settings

```java
DiagnosticsSettingsController diagnosticsSettingsController = client.getDiagnosticsSettingsController();
```

## Class Name

`DiagnosticsSettingsController`


# List Diagnostics Settings

This endpoint retrieves diagnostics settings synchronously.

```java
CompletableFuture<ApiResponse<List<DiagnosticObservationSetting>>> listDiagnosticsSettingsAsync(
    final String accountName,
    final String devices)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Query, Required | Account identifier. |
| `devices` | `String` | Query, Required | Devices list format: [{"id":"{imei1}","kind":"imei"},{"id":"{imei2}","kind":"imei"}]. |

## Server

`Server.DEVICE_DIAGNOSTICS`

## Response Type

[`List<DiagnosticObservationSetting>`](../../doc/models/diagnostic-observation-setting.md)

## Example Usage

```java
String accountName = "0000123456-00001";
String devices = "[{\"id\":\"864508030026238\",\"kind\":\"IMEI\"},{\"id\":\"864508030026238\",\"kind\":\"IMEI\"}]";

diagnosticsSettingsController.listDiagnosticsSettingsAsync(accountName, devices).thenAccept(result -> {
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
    "accountName": "string",
    "device": {
      "id": "864508030026238",
      "kind": "IMEI"
    },
    "attributes": [
      {
        "name": "MANUFACTURER",
        "value": "string",
        "createdOn": "2019-09-07T23:08:03.532Z",
        "isObservable": true,
        "isObserving": true,
        "frequency": {
          "value": 5,
          "unit": "SECOND"
        }
      }
    ]
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response. | [`DeviceDiagnosticsResultException`](../../doc/models/device-diagnostics-result-exception.md) |

