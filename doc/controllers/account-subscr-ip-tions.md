# Account Subscr Ip Tions

```java
AccountSubscrIpTionsController accountSubscrIpTionsController = client.getAccountSubscrIpTionsController();
```

## Class Name

`AccountSubscrIpTionsController`


# List Account Subscr Ip Tions

Retrieves the total number of SIM-Secure for IoT subscription licenses purchased for your account by license type, and lists the number of licenses assigned and available for each license type.

```java
CompletableFuture<ApiResponse<SecuritySubscrIpTionResult>> listAccountSubscrIpTionsAsync(
    final SecuritySubscrIpTionRequest body,
    final String xRequestID)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SecuritySubscrIpTionRequest`](../../doc/models/security-subscr-ip-tion-request.md) | Body, Required | Request for account subscription. |
| `xRequestID` | `String` | Header, Optional | Transaction Id.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[0-9]-[0-9]{3,32}$` |

## Server

`Server.M2M`

## Response Type

[`SecuritySubscrIpTionResult`](../../doc/models/security-subscr-ip-tion-result.md)

## Example Usage

```java
SecuritySubscrIpTionRequest body = new SecuritySubscrIpTionRequest.Builder()
    .accountName("000012345600001")
    .skuNumber("SIMSec-IoT-Lt")
    .build();


accountSubscrIpTionsController.listAccountSubscrIpTionsAsync(body, null).thenAccept(result -> {
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
  "accountName": "000012345600001",
  "subscriptionList": [
    {
      "skuNumber": "TS-BUNDLE-KTO-SIMSEC-MRC",
      "licenseType": "Flexible Bundle",
      "licensePurchased": 9,
      "licenseAssigned": 7,
      "licenseAvailable": 1
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request. | [`SecurityResultException`](../../doc/models/security-result-exception.md) |
| 401 | Unauthorized request. | [`SecurityResultException`](../../doc/models/security-result-exception.md) |
| 403 | Request forbidden. | [`SecurityResultException`](../../doc/models/security-result-exception.md) |
| 404 | Not Found / Does not exist. | [`SecurityResultException`](../../doc/models/security-result-exception.md) |
| 406 | Format / Request Unacceptable. | [`SecurityResultException`](../../doc/models/security-result-exception.md) |
| 429 | Too many requests. | [`SecurityResultException`](../../doc/models/security-result-exception.md) |
| Default | Error response. | [`SecurityResultException`](../../doc/models/security-result-exception.md) |

