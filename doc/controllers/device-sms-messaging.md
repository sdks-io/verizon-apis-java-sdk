# Device SMS Messaging

```java
DeviceSMSMessagingController deviceSMSMessagingController = client.getDeviceSMSMessagingController();
```

## Class Name

`DeviceSMSMessagingController`

## Methods

* [Send an Sms Message](../../doc/controllers/device-sms-messaging.md#send-an-sms-message)
* [Get Sms Messages](../../doc/controllers/device-sms-messaging.md#get-sms-messages)
* [Start Sms Message Delivery](../../doc/controllers/device-sms-messaging.md#start-sms-message-delivery)
* [List Sms Message History](../../doc/controllers/device-sms-messaging.md#list-sms-message-history)


# Send an Sms Message

Sends an SMS message to one device. Messages are queued on the M2M MC Platform and sent as soon as possible, but they may be delayed due to traffic and routing considerations.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> sendAnSmsMessageAsync(
    final GIOSMSSendRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GIOSMSSendRequest`](../../doc/models/giosms-send-request.md) | Body, Required | SMS message to an indiividual device. |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`GIORequestResponse`](../../doc/models/gio-request-response.md).

## Example Usage

```java
GIOSMSSendRequest body = new GIOSMSSendRequest.Builder(
    "the body or text of the message itself"
)
.accountName("0000123456-00001")
.customFields(Arrays.asList(
        new KvPair.Builder()
            .key("CustomField1")
            .value("value of the field")
            .build()
    ))
.dataEncoding("optional 7 or 8-bit encoding")
.timeToLive("000000010000000R")
.deviceIds(Arrays.asList(
        new GIODeviceId.Builder(
            "iccid",
            "20-digit ICCID"
        )
        .build()
    ))
.build();

deviceSMSMessagingController.sendAnSmsMessageAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof GIORestErrorResponseException) {
        GIORestErrorResponseException gIORestErrorResponseException = (GIORestErrorResponseException) cause;
        gIORestErrorResponseException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |


# Get Sms Messages

Retrieves queued SMS messages sent by all M2M MC devices associated with an account.

```java
CompletableFuture<ApiResponse<SmsMessagesResponse>> getSmsMessagesAsync(
    final String accountName,
    final String next)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Template, Required | Numeric account name<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9\-]{3,32}$` |
| `next` | `String` | Query, Optional | Continue the previous query from the pageUrl in Location Header<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `64`, *Pattern*: `^[A-Za-z0-9]{3,32}$` |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`SmsMessagesResponse`](../../doc/models/sms-messages-response.md).

## Example Usage

```java
String accountName = "0000123456-00001";
String next = "TheURLForTheNextQuery";

deviceSMSMessagingController.getSmsMessagesAsync(accountName, next).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof GIORestErrorResponseException) {
        GIORestErrorResponseException gIORestErrorResponseException = (GIORestErrorResponseException) cause;
        gIORestErrorResponseException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |


# Start Sms Message Delivery

Starts delivery of SMS messages for the specified account.

```java
CompletableFuture<ApiResponse<SuccessResponse>> startSmsMessageDeliveryAsync(
    final String accountName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Template, Required | Numeric account name<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9\-]{3,32}$` |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`SuccessResponse`](../../doc/models/success-response.md).

## Example Usage

```java
String accountName = "0000123456-00001";

deviceSMSMessagingController.startSmsMessageDeliveryAsync(accountName).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof GIORestErrorResponseException) {
        GIORestErrorResponseException gIORestErrorResponseException = (GIORestErrorResponseException) cause;
        gIORestErrorResponseException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |


# List Sms Message History

Returns a list of sms history for a given device during a specified time frame.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> listSmsMessageHistoryAsync(
    final SMSEventHistoryRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SMSEventHistoryRequest`](../../doc/models/sms-event-history-request.md) | Body, Required | Device Query |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`GIORequestResponse`](../../doc/models/gio-request-response.md).

## Example Usage

```java
SMSEventHistoryRequest body = new SMSEventHistoryRequest.Builder(
    new GIODeviceId.Builder(
        "eid",
        "12345678901234567890123456789012"
    )
    .build()
)
.build();

deviceSMSMessagingController.listSmsMessageHistoryAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof GIORestErrorResponseException) {
        GIORestErrorResponseException gIORestErrorResponseException = (GIORestErrorResponseException) cause;
        gIORestErrorResponseException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |

