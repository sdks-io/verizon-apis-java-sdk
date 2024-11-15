# Thing Space Qualityof Service API Actions

```java
ThingSpaceQualityofServiceAPIActionsController thingSpaceQualityofServiceAPIActionsController = client.getThingSpaceQualityofServiceAPIActionsController();
```

## Class Name

`ThingSpaceQualityofServiceAPIActionsController`

## Methods

* [Create a Thing Space Quality of Service API Subscription](../../doc/controllers/thing-space-qualityof-service-api-actions.md#create-a-thing-space-quality-of-service-api-subscription)
* [Stop a Thing Space Quality of Service API Subscription](../../doc/controllers/thing-space-qualityof-service-api-actions.md#stop-a-thing-space-quality-of-service-api-subscription)


# Create a Thing Space Quality of Service API Subscription

Creates a QoS elevation subscription ID and activates the subscription.

```java
CompletableFuture<M201success> createAThingSpaceQualityOfServiceAPISubscriptionAsync(
    final SubscribeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SubscribeRequest`](../../doc/models/subscribe-request.md) | Body, Required | The request details to create a ThingSpace Quality of Service API subscription. |

## Response Type

[`M201success`](../../doc/models/m201-success.md)

## Example Usage

```java
SubscribeRequest body = new SubscribeRequest.Builder()
    .accountName("0000123456-00001")
    .build();

thingSpaceQualityofServiceAPIActionsController.createAThingSpaceQualityOfServiceAPISubscriptionAsync(body).thenAccept(result -> {
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
| Default | Error Response | [`DefaultException`](../../doc/models/default-exception.md) |


# Stop a Thing Space Quality of Service API Subscription

Stops an active ThingSpace Quality of Service API subscription using the account name and the subscription ID.

```java
CompletableFuture<M201success> stopAThingSpaceQualityOfServiceAPISubscriptionAsync(
    final String accountName,
    final String qosSubscriptionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Query, Required | - |
| `qosSubscriptionId` | `String` | Query, Required | - |

## Response Type

[`M201success`](../../doc/models/m201-success.md)

## Example Usage

```java
String accountName = "0000123456-00001";
String qosSubscriptionId = "QoS subscription ID";

thingSpaceQualityofServiceAPIActionsController.stopAThingSpaceQualityOfServiceAPISubscriptionAsync(accountName, qosSubscriptionId).thenAccept(result -> {
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
| Default | Error Response | [`DefaultException`](../../doc/models/default-exception.md) |

