# Software Management Subscr Ip Tions V2

```java
SoftwareManagementSubscrIpTionsV2Controller softwareManagementSubscrIpTionsV2Controller = client.getSoftwareManagementSubscrIpTionsV2Controller();
```

## Class Name

`SoftwareManagementSubscrIpTionsV2Controller`


# Get Account Subscr Ip Tion Status

This endpoint retrieves a FOTA subscription by account.

```java
CompletableFuture<ApiResponse<FotaV2SubscrIpTion>> getAccountSubscrIpTionStatusAsync(
    final String account)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `account` | `String` | Template, Required | Account identifier. |

## Server

`Server.SOFTWARE_MANAGEMENT_V2`

## Response Type

[`FotaV2SubscrIpTion`](../../doc/models/fota-v2-subscr-ip-tion.md)

## Example Usage

```java
String account = "0000123456-00001";

softwareManagementSubscrIpTionsV2Controller.getAccountSubscrIpTionStatusAsync(account).thenAccept(result -> {
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
  "accountName": "00000000000-123345",
  "purchaseType": "TS-HFOTA-EVNT,TS-HFOTA-MRC",
  "licenseCount": 500,
  "licenseUsedCount": 400,
  "updateTime": "2020-09-17T21:11:32.170Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Unexpected error. | [`FotaV2ResultException`](../../doc/models/fota-v2-result-exception.md) |

