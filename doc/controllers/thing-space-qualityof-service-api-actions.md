# Thing Space Qualityof Service API Actions

```java
ThingSpaceQualityofServiceAPIActionsController thingSpaceQualityofServiceAPIActionsController = client.getThingSpaceQualityofServiceAPIActionsController();
```

## Class Name

`ThingSpaceQualityofServiceAPIActionsController`

## Methods

* [Create a Thing Space Quality of Service API Subscr Ip Tion](../../doc/controllers/thing-space-qualityof-service-api-actions.md#create-a-thing-space-quality-of-service-api-subscr-ip-tion)
* [Stop a Thing Space Quality of Service API Subscr Ip Tion](../../doc/controllers/thing-space-qualityof-service-api-actions.md#stop-a-thing-space-quality-of-service-api-subscr-ip-tion)


# Create a Thing Space Quality of Service API Subscr Ip Tion

Creates a QoS elevation subscription ID and activates the subscription.

```java
CompletableFuture<ApiResponse<M201success>> createAThingSpaceQualityOfServiceAPISubscrIpTionAsync(
    final SubscribeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SubscribeRequest`](../../doc/models/subscribe-request.md) | Body, Required | The request details to create a ThingSpace Quality of Service API subscription. |

## Server

`Server.THINGSPACE`

## Response Type

[`M201success`](../../doc/models/m201-success.md)

## Example Usage

```java
SubscribeRequest body = new SubscribeRequest.Builder(
    "0000123456-00001",
    Arrays.asList(
        new QosDeviceInfo.Builder(
            new QosDeviceId.Builder()
                .id("10-digit phone number")
                .kind("mdn")
                .build(),
            Arrays.asList(
                new FlowInfo.Builder()
                    .flowServer("[IPv6 address]:port")
                    .flowDevice("[IPv6 address]:port")
                    .flowDirection("UPLINK")
                    .flowProtocol("UDP")
                    .qciOption("Premium")
                    .build()
            )
        )
        .deviceIpV6Addr("IPv6 address")
        .build()
    )
)
.build();

thingSpaceQualityofServiceAPIActionsController.createAThingSpaceQualityOfServiceAPISubscrIpTionAsync(body).thenAccept(result -> {
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
| Default | Error Response | [`DefaultResponseException`](../../doc/models/default-response-exception.md) |


# Stop a Thing Space Quality of Service API Subscr Ip Tion

Stops an active ThingSpace Quality of Service API subscription using the account name and the subscription ID.

```java
CompletableFuture<ApiResponse<M201success>> stopAThingSpaceQualityOfServiceAPISubscrIpTionAsync(
    final String accountName,
    final String qosSubscrIpTionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Query, Required | - |
| `qosSubscrIpTionId` | `String` | Query, Required | - |

## Server

`Server.THINGSPACE`

## Response Type

[`M201success`](../../doc/models/m201-success.md)

## Example Usage

```java
String accountName = "0000123456-00001";
String qosSubscrIpTionId = "QoS subscription ID";

thingSpaceQualityofServiceAPIActionsController.stopAThingSpaceQualityOfServiceAPISubscrIpTionAsync(accountName, qosSubscrIpTionId).thenAccept(result -> {
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
| Default | Error Response | [`DefaultResponseException`](../../doc/models/default-response-exception.md) |

