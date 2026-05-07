# Create Price Plan Triggers

```java
CreatePricePlanTriggersController createPricePlanTriggersController = client.getCreatePricePlanTriggersController();
```

## Class Name

`CreatePricePlanTriggersController`


# Create Trigger Rules

Create a usage trigger at the account level, device level or a price plan trigger for all devices on the account

```java
CompletableFuture<ApiResponse<TriggerResponse>> createTriggerRulesAsync(
    final CreateTriggerRulesBody body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateTriggerRulesBody`](../../doc/models/containers/create-trigger-rules-body.md) | Body, Required | This is a container for any-of cases. |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`TriggerResponse`](../../doc/models/trigger-response.md).

## Example Usage

```java
CreateTriggerRulesBody body = CreateTriggerRulesBody.fromAccountLevelObject(
    new AccountLevelObject.Builder()
        .build()
);
createPricePlanTriggersController.createTriggerRulesAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof RuleRestErrorResponseException) {
        RuleRestErrorResponseException ruleRestErrorResponseException = (RuleRestErrorResponseException) cause;
        ruleRestErrorResponseException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "triggerId": "be1b5958-ffff-eeee-gggg-b1b7618c0035"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`RuleRestErrorResponseException`](../../doc/models/rule-rest-error-response-exception.md) |

