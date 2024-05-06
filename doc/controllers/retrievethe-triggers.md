# Retrievethe Triggers

```java
RetrievetheTriggersController retrievetheTriggersController = client.getRetrievetheTriggersController();
```

## Class Name

`RetrievetheTriggersController`

## Methods

* [Get All Available Triggers](../../doc/controllers/retrievethe-triggers.md#get-all-available-triggers)
* [Get All Triggers by Account Name](../../doc/controllers/retrievethe-triggers.md#get-all-triggers-by-account-name)
* [Get Triggers by Id](../../doc/controllers/retrievethe-triggers.md#get-triggers-by-id)
* [Get All Triggers by Trigger Category](../../doc/controllers/retrievethe-triggers.md#get-all-triggers-by-trigger-category)


# Get All Available Triggers

Retrieves all of the available triggers for pseudo-MDN.

```java
CompletableFuture<ApiResponse<TriggerValueResponse>> getAllAvailableTriggersAsync()
```

## Server

`Server.THINGSPACE`

## Response Type

[`TriggerValueResponse`](../../doc/models/trigger-value-response.md)

## Example Usage

```java
retrievetheTriggersController.getAllAvailableTriggersAsync().thenAccept(result -> {
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
| Default | Error response | [`ReadySimRestErrorResponseException`](../../doc/models/ready-sim-rest-error-response-exception.md) |


# Get All Triggers by Account Name

Retrieve the triggers associated with an account name.

```java
CompletableFuture<ApiResponse<TriggerValueResponse>> getAllTriggersByAccountNameAsync(
    final String accountName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Template, Required | The account name |

## Server

`Server.THINGSPACE`

## Response Type

[`TriggerValueResponse`](../../doc/models/trigger-value-response.md)

## Example Usage

```java
String accountName = "0000123456-000001";

retrievetheTriggersController.getAllTriggersByAccountNameAsync(accountName).thenAccept(result -> {
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
| Default | Error response | [`ReadySimRestErrorResponseException`](../../doc/models/ready-sim-rest-error-response-exception.md) |


# Get Triggers by Id

Retrives a specific trigger by its ID.

```java
CompletableFuture<ApiResponse<TriggerValueResponse2>> getTriggersByIdAsync(
    final String triggerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `triggerId` | `String` | Template, Required | The ID of a specific trigger |

## Server

`Server.THINGSPACE`

## Response Type

[`TriggerValueResponse2`](../../doc/models/trigger-value-response-2.md)

## Example Usage

```java
String triggerId = "2874DEC7-26CF-4797-9C6A-B5A2AC72D526";

retrievetheTriggersController.getTriggersByIdAsync(triggerId).thenAccept(result -> {
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
| Default | Error response | [`ReadySimRestErrorResponseException`](../../doc/models/ready-sim-rest-error-response-exception.md) |


# Get All Triggers by Trigger Category

Retrieves all of the triggers for the specified account associated with the PromoAlert category

```java
CompletableFuture<ApiResponse<TriggerValueResponse2>> getAllTriggersByTriggerCategoryAsync()
```

## Server

`Server.THINGSPACE`

## Response Type

[`TriggerValueResponse2`](../../doc/models/trigger-value-response-2.md)

## Example Usage

```java
retrievetheTriggersController.getAllTriggersByTriggerCategoryAsync().thenAccept(result -> {
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
| Default | Error response | [`ReadySimRestErrorResponseException`](../../doc/models/ready-sim-rest-error-response-exception.md) |

