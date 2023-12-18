# Usage Trigger Management

```java
UsageTriggerManagementController usageTriggerManagementController = client.getUsageTriggerManagementController();
```

## Class Name

`UsageTriggerManagementController`

## Methods

* [Create New Trigger](../../doc/controllers/usage-trigger-management.md#create-new-trigger)
* [Update Trigger](../../doc/controllers/usage-trigger-management.md#update-trigger)
* [Delete Trigger](../../doc/controllers/usage-trigger-management.md#delete-trigger)


# Create New Trigger

Create a new usage trigger, which will send an alert when the number of device location service transactions reaches a specified percentage of the monthly subscription amount.

```java
CompletableFuture<ApiResponse<UsageTriggerResponse>> createNewTriggerAsync(
    final UsageTriggerAddRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UsageTriggerAddRequest`](../../doc/models/usage-trigger-add-request.md) | Body, Optional | License assignment. |

## Server

`Server.SUBSCR_IP_TION_SERVER`

## Response Type

[`UsageTriggerResponse`](../../doc/models/usage-trigger-response.md)

## Example Usage

```java
UsageTriggerAddRequest body = new UsageTriggerAddRequest.Builder(
    "0212312345-00001",
    ServiceNameEnum.LOCATION,
    "95"
)
.triggerName("95% usage alert")
.allowExcess(true)
.sendSmsNotification(true)
.smsPhoneNumbers("5551231234")
.sendEmailNotification(true)
.emailAddresses("you@theinternet.com")
.build();

usageTriggerManagementController.createNewTriggerAsync(body).thenAccept(result -> {
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
  "triggerId": "595f5c44-c31c-4552-8670-020a1545a84d",
  "triggerName": "90 percent",
  "accountName": "1000012345-00001",
  "serviceName": "Location",
  "thresholdValue": "90",
  "allowExcess": true,
  "sendSmsNotification": true,
  "smsPhoneNumbers": "5558794321",
  "sendEmailNotification": false,
  "emailAddresses": "",
  "createDate": "2018-08-11",
  "updateDate": "2018-08-12"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Unexpected error | [`DeviceLocationResultException`](../../doc/models/device-location-result-exception.md) |


# Update Trigger

Update an existing usage trigger

```java
CompletableFuture<ApiResponse<UsageTriggerResponse>> updateTriggerAsync(
    final String triggerId,
    final UsageTriggerUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `triggerId` | `String` | Template, Required | Usage trigger ID |
| `body` | [`UsageTriggerUpdateRequest`](../../doc/models/usage-trigger-update-request.md) | Body, Optional | New trigger values |

## Server

`Server.SUBSCR_IP_TION_SERVER`

## Response Type

[`UsageTriggerResponse`](../../doc/models/usage-trigger-response.md)

## Example Usage

```java
String triggerId = "595f5c44-c31c-4552-8670-020a1545a84d";
UsageTriggerUpdateRequest body = new UsageTriggerUpdateRequest.Builder(
    "1000012345-00001"
)
.thresholdValue("95")
.build();

usageTriggerManagementController.updateTriggerAsync(triggerId, body).thenAccept(result -> {
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
  "triggerId": "595f5c44-c31c-4552-8670-020a1545a84d",
  "triggerName": "90 percent",
  "accountName": "1000012345-00001",
  "serviceName": "Location",
  "thresholdValue": "90",
  "allowExcess": true,
  "sendSmsNotification": true,
  "smsPhoneNumbers": "5558794321",
  "sendEmailNotification": false,
  "emailAddresses": "",
  "createDate": "2018-08-11",
  "updateDate": "2018-08-12"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Unexpected error | [`DeviceLocationResultException`](../../doc/models/device-location-result-exception.md) |


# Delete Trigger

eletes the specified usage trigger from the given account

```java
CompletableFuture<ApiResponse<DeviceLocationSuccessResult>> deleteTriggerAsync(
    final String accountName,
    final String triggerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Template, Required | Account name |
| `triggerId` | `String` | Template, Required | Usage trigger ID |

## Server

`Server.SUBSCR_IP_TION_SERVER`

## Response Type

[`DeviceLocationSuccessResult`](../../doc/models/device-location-success-result.md)

## Example Usage

```java
String accountName = "0212312345-00001";
String triggerId = "595f5c44-c31c-4552-8670-020a1545a84d";

usageTriggerManagementController.deleteTriggerAsync(accountName, triggerId).thenAccept(result -> {
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
  "success": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Unexpected error | [`DeviceLocationResultException`](../../doc/models/device-location-result-exception.md) |

