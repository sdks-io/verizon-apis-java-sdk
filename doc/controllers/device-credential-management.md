# Device Credential Management

```java
DeviceCredentialManagementController deviceCredentialManagementController = client.getDeviceCredentialManagementController();
```

## Class Name

`DeviceCredentialManagementController`

## Methods

* [Retrieve Credentials](../../doc/controllers/device-credential-management.md#retrieve-credentials)
* [Generate Credentials](../../doc/controllers/device-credential-management.md#generate-credentials)
* [Reset Credentials](../../doc/controllers/device-credential-management.md#reset-credentials)
* [Drop Credentials](../../doc/controllers/device-credential-management.md#drop-credentials)


# Retrieve Credentials

```java
CompletableFuture<ApiResponse<RetrieveResponse>> retrieveCredentialsAsync(
    final CredentialsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CredentialsRequest`](../../doc/models/credentials-request.md) | Body, Required | - |

## Server

`Server.HYPER_PRECISE_CREDENTIALS`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`RetrieveResponse`](../../doc/models/retrieve-response.md).

## Example Usage

```java
CredentialsRequest body = new CredentialsRequest.Builder(
    "3161585",
    "0844021539-00001",
    Arrays.asList(
        new DeviceCredentialRequestItem.Builder(
            "221000008775573"
        )
        .build()
    )
)
.build();

deviceCredentialManagementController.retrieveCredentialsAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorResponseException) {
        ErrorResponseException errorResponseException = (ErrorResponseException) cause;
        errorResponseException.printStackTrace();
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
| 400 | Bad Request / Verification Failure | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 401 | Unauthorized | `ApiException` |


# Generate Credentials

```java
CompletableFuture<ApiResponse<GenerateResponse>> generateCredentialsAsync(
    final CredentialsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CredentialsRequest`](../../doc/models/credentials-request.md) | Body, Required | - |

## Server

`Server.HYPER_PRECISE_CREDENTIALS`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`GenerateResponse`](../../doc/models/generate-response.md).

## Example Usage

```java
CredentialsRequest body = new CredentialsRequest.Builder(
    "3161585",
    "0844021539-00001",
    Arrays.asList(
        new DeviceCredentialRequestItem.Builder(
            "221000008775573"
        )
        .build()
    )
)
.build();

deviceCredentialManagementController.generateCredentialsAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorResponseException) {
        ErrorResponseException errorResponseException = (ErrorResponseException) cause;
        errorResponseException.printStackTrace();
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
| 400 | Bad Request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Reset Credentials

```java
CompletableFuture<ApiResponse<GenerateResponse>> resetCredentialsAsync(
    final CredentialsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CredentialsRequest`](../../doc/models/credentials-request.md) | Body, Required | - |

## Server

`Server.HYPER_PRECISE_CREDENTIALS`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`GenerateResponse`](../../doc/models/generate-response.md).

## Example Usage

```java
CredentialsRequest body = new CredentialsRequest.Builder(
    "3161585",
    "0844021539-00001",
    Arrays.asList(
        new DeviceCredentialRequestItem.Builder(
            "221000008775573"
        )
        .build()
    )
)
.build();

deviceCredentialManagementController.resetCredentialsAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorResponseException) {
        ErrorResponseException errorResponseException = (ErrorResponseException) cause;
        errorResponseException.printStackTrace();
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
| 400 | Bad Request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Drop Credentials

```java
CompletableFuture<ApiResponse<DropResponse>> dropCredentialsAsync(
    final CredentialsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CredentialsRequest`](../../doc/models/credentials-request.md) | Body, Required | - |

## Server

`Server.HYPER_PRECISE_CREDENTIALS`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`DropResponse`](../../doc/models/drop-response.md).

## Example Usage

```java
CredentialsRequest body = new CredentialsRequest.Builder(
    "3161585",
    "0844021539-00001",
    Arrays.asList(
        new DeviceCredentialRequestItem.Builder(
            "221000008775573"
        )
        .build()
    )
)
.build();

deviceCredentialManagementController.dropCredentialsAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorResponseException) {
        ErrorResponseException errorResponseException = (ErrorResponseException) cause;
        errorResponseException.printStackTrace();
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
| 400 | Bad Request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

