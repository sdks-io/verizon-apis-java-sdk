# Retrieve Rate Plan List

```java
RetrieveRatePlanListController retrieveRatePlanListController = client.getRetrieveRatePlanListController();
```

## Class Name

`RetrieveRatePlanListController`


# Get Rate Plan List

Retrieves the rate plans and rate plan details for a profile ID.

```java
CompletableFuture<ApiResponse<Rateplan>> getRatePlanListAsync(
    final String ecpdId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `ecpdId` | `String` | Template, Required | The Enterprise Customer Profile Database ID. This is the same as the accountName value |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`Rateplan`](../../doc/models/rateplan.md).

## Example Usage

```java
String ecpdId = "0000123456-00001";

retrieveRatePlanListController.getRatePlanListAsync(ecpdId).thenAccept(result -> {
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
  "ratePlanGroup": [
    {
      "ratePlanGroupDescription": "AGS Description_73",
      "ratePlanType": "AccountShareGroup",
      "ratePlan": [
        {
          "description": "PlanDescription 2",
          "sizeKb": "1048576",
          "carrierRatePlanCode": "Service plan code value",
          "zeroDollarBilling": false,
          "promotionOffered": false,
          "promotionDays": -2147483648,
          "ratePlanType": "accountShare",
          "account": [
            {
              "accountName": "0000123456-00001",
              "mtasAccountNumber": "0000123456-00001"
            },
            {
              "accountName": "0000123456-00001",
              "mtasAccountNumber": "0000123456-00001"
            }
          ]
        }
      ]
    },
    {
      "description": "PlanDescription 2",
      "sizeKb": "1048576",
      "carrierRatePlanCode": "Service plan code value",
      "zeroDollarBilling": false,
      "promotionOffered": false,
      "promotionDays": -2147483648,
      "ratePlanType": "accountShare",
      "account": [
        {
          "accountName": "0000123456-00001",
          "mtasAccountNumber": "0000123456-00001"
        },
        {
          "accountName": "0000123456-00001",
          "mtasAccountNumber": "0000123456-00001"
        }
      ]
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`RuleRestErrorResponseException`](../../doc/models/rule-rest-error-response-exception.md) |

