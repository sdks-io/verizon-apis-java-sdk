# V2 Triggers

Helps to create and manage promo alert triggers

```java
MV2TriggersController mV2TriggersController = client.getMV2TriggersController();
```

## Class Name

`MV2TriggersController`

## Methods

* [Create Trigger](../../doc/controllers/v2-triggers.md#create-trigger)
* [Update Trigger](../../doc/controllers/v2-triggers.md#update-trigger)


# Create Trigger

This creates an individual change plan for account group share.

```java
CompletableFuture<ApiResponse<TriggerV2Response>> createTriggerAsync(
    final CreateTriggerV2Request body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateTriggerV2Request`](../../doc/models/create-trigger-v2-request.md) | Body, Required | - |

## Server

`Server.THINGSPACE`

## Response Type

[`TriggerV2Response`](../../doc/models/trigger-v2-response.md)

## Example Usage

```java
CreateTriggerV2Request body = new CreateTriggerV2Request.Builder()
    .build();

mV2TriggersController.createTriggerAsync(body).thenAccept(result -> {
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
| 400 | Error Response | [`RulesEngineRestErrorResponseException`](../../doc/models/rules-engine-rest-error-response-exception.md) |


# Update Trigger

This updates an individual change plan for account group share.

```java
CompletableFuture<ApiResponse<TriggerV2Response>> updateTriggerAsync(
    final String vZM2mToken,
    final UpdateTriggerV2Request body,
    final String xRequestID)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `vZM2mToken` | `String` | Header, Required | M2M-MC Session Token |
| `body` | [`UpdateTriggerV2Request`](../../doc/models/update-trigger-v2-request.md) | Body, Required | - |
| `xRequestID` | `String` | Header, Optional | Transaction Id |

## Server

`Server.THINGSPACE`

## Response Type

[`TriggerV2Response`](../../doc/models/trigger-v2-response.md)

## Example Usage

```java
String vZM2mToken = "VZ-M2M-Token2";
UpdateTriggerV2Request body = new UpdateTriggerV2Request.Builder()
    .build();


mV2TriggersController.updateTriggerAsync(vZM2mToken, body, null).thenAccept(result -> {
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
| 400 | Error Response | [`RulesEngineRestErrorResponseException`](../../doc/models/rules-engine-rest-error-response-exception.md) |

