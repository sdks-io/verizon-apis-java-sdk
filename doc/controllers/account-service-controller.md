# Account Service Controller

```java
AccountServiceController accountServiceController = client.getAccountServiceController();
```

## Class Name

`AccountServiceController`


# Get Account Information Using GET

Returns aaccount information associated with a specified account.

```java
CompletableFuture<ApiResponse<GetAccountInformationResponseforplanner>> getAccountInformationUsingGETAsync(
    final String accountName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Template, Required | The account's numeric name, including leading zeroes. |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`GetAccountInformationResponseforplanner`](../../doc/models/get-account-information-responseforplanner.md).

## Example Usage

```java
String accountName = "0000123456-00002";

accountServiceController.getAccountInformationUsingGETAsync(accountName).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof RestErrorResponseforplannerException) {
        RestErrorResponseforplannerException restErrorResponseforplannerException = (RestErrorResponseforplannerException) cause;
        restErrorResponseforplannerException.printStackTrace();
    } else if (cause instanceof AuthRestErrorResponseforplannerException) {
        AuthRestErrorResponseforplannerException authRestErrorResponseforplannerException = (AuthRestErrorResponseforplannerException) cause;
        authRestErrorResponseforplannerException.printStackTrace();
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
  "accountName": "string",
  "accountNumber": "0000123456-00001",
  "carriers": [
    "carrier name(s)"
  ],
  "features": [
    "feature names"
  ],
  "ipPools": [
    {
      "isDefaultPool": true,
      "poolName": "name of the pool",
      "poolType": "type of pool"
    }
  ],
  "isProvisioningAllowed": true,
  "organizationName": "Org Name",
  "servicePlans": [
    {
      "carrierServicePlanCode": "name of the service plan code",
      "code": "the activation code",
      "extendedAttributes": [
        {
          "key": "key name",
          "value": "key value"
        }
      ],
      "name": "name of the active profile carrier",
      "sizeKb": 1000
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |
| 401 | Unauthorized | [`AuthRestErrorResponseforplannerException`](../../doc/models/auth-rest-error-responseforplanner-exception.md) |
| 403 | Forbidden | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |
| 404 | Not Found / Does not exist | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |
| 406 | Format / Request Unacceptable | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |
| 429 | Too many requests | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |
| Default | Error response | [`RestErrorResponseforplannerException`](../../doc/models/rest-error-responseforplanner-exception.md) |

