# SIM Actions

```java
SIMActionsController sIMActionsController = client.getSIMActionsController();
```

## Class Name

`SIMActionsController`

## Methods

* [Newactivatecode](../../doc/controllers/sim-actions.md#newactivatecode)
* [Setactivate Using POST](../../doc/controllers/sim-actions.md#setactivate-using-post)
* [Setdeactivate Using POST](../../doc/controllers/sim-actions.md#setdeactivate-using-post)


# Newactivatecode

System assign a new activation code to reactivate a deactivated device. **Note:** the previously assigned ICCID must be used to request a new activation code.

```java
CompletableFuture<ApiResponse<ESIMRequestResponse>> newactivatecodeAsync(
    final ESIMProfileRequest2 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ESIMProfileRequest2`](../../doc/models/esim-profile-request-2.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`ESIMRequestResponse`](../../doc/models/esim-request-response.md)

## Example Usage

```java
ESIMProfileRequest2 body = new ESIMProfileRequest2.Builder()
    .devices(Arrays.asList(
        new ESIMDeviceList.Builder()
            .deviceIds(Arrays.asList(
                new DeviceId2.Builder()
                    .id("15-digit IMEI")
                    .kind("imei")
                    .build(),
                new DeviceId2.Builder()
                    .id("20-digit ICCID")
                    .kind("iccid")
                    .build()
            ))
            .build()
    ))
    .accountName("0000123456-00001")
    .servicePlan("the service plan name")
    .mdnZipCode("five digit zip code")
    .build();

sIMActionsController.newactivatecodeAsync(body).thenAccept(result -> {
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
  "requestId": "d1f08526-5443-4054-9a29-4456490ea9f8"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 401 | Unauthorized | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 403 | Forbidden | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 404 | Not Found / Does not exist | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 406 | Format / Request Unacceptable | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 429 | Too many requests | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| Default | Error response | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |


# Setactivate Using POST

Uses the profile to activate the SIM.

```java
CompletableFuture<ApiResponse<ESIMRequestResponse>> setactivateUsingPOSTAsync(
    final ESIMProfileRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ESIMProfileRequest`](../../doc/models/esim-profile-request.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`ESIMRequestResponse`](../../doc/models/esim-request-response.md)

## Example Usage

```java
ESIMProfileRequest body = new ESIMProfileRequest.Builder()
    .devices(Arrays.asList(
        new ESIMDeviceList.Builder()
            .deviceIds(Arrays.asList(
                new DeviceId2.Builder()
                    .id("32-digit EID")
                    .kind("eid")
                    .build(),
                new DeviceId2.Builder()
                    .id("15-digit IMEI")
                    .kind("imei")
                    .build(),
                new DeviceId2.Builder()
                    .id("20-digit ICCID")
                    .kind("iccid (ICCID is only used for reactivation)")
                    .build()
            ))
            .build()
    ))
    .carrierName("Verizon Wireless")
    .accountName("0000123456-00001")
    .servicePlan("the service plan name")
    .mdnZipCode("five digit zip code")
    .build();

sIMActionsController.setactivateUsingPOSTAsync(body).thenAccept(result -> {
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
  "requestId": "d1f08526-5443-4054-9a29-4456490ea9f8"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 401 | Unauthorized | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 403 | Forbidden | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 404 | Not Found / Does not exist | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 406 | Format / Request Unacceptable | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 429 | Too many requests | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| Default | Error response | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |


# Setdeactivate Using POST

Uses the profile to deactivate the SIM.

```java
CompletableFuture<ApiResponse<ESIMRequestResponse>> setdeactivateUsingPOSTAsync(
    final ProfileRequest2 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ProfileRequest2`](../../doc/models/profile-request-2.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`ESIMRequestResponse`](../../doc/models/esim-request-response.md)

## Example Usage

```java
ProfileRequest2 body = new ProfileRequest2.Builder()
    .accountName("0000123456-00001")
    .carrierName("Verizon Wireless")
    .reasonCode("FF")
    .etfWaiver(true)
    .checkFallbackProfile(false)
    .build();

sIMActionsController.setdeactivateUsingPOSTAsync(body).thenAccept(result -> {
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
  "requestId": "d1f08526-5443-4054-9a29-4456490ea9f8"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 401 | Unauthorized | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 403 | Forbidden | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 404 | Not Found / Does not exist | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 406 | Format / Request Unacceptable | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 429 | Too many requests | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| Default | Error response | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |

