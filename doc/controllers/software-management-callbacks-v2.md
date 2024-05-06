# Software Management Callbacks V2

```java
SoftwareManagementCallbacksV2Controller softwareManagementCallbacksV2Controller = client.getSoftwareManagementCallbacksV2Controller();
```

## Class Name

`SoftwareManagementCallbacksV2Controller`

## Methods

* [Update Callback](../../doc/controllers/software-management-callbacks-v2.md#update-callback)
* [Register Callback](../../doc/controllers/software-management-callbacks-v2.md#register-callback)
* [List Registered Callbacks](../../doc/controllers/software-management-callbacks-v2.md#list-registered-callbacks)
* [Deregister Callback](../../doc/controllers/software-management-callbacks-v2.md#deregister-callback)


# Update Callback

This endpoint allows user to update the HTTPS callback address.

```java
CompletableFuture<ApiResponse<FotaV2CallbackRegistrationResult>> updateCallbackAsync(
    final String account,
    final FotaV2CallbackRegistrationRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `account` | `String` | Template, Required | Account identifier. |
| `body` | [`FotaV2CallbackRegistrationRequest`](../../doc/models/fota-v2-callback-registration-request.md) | Body, Required | Callback URL registration. |

## Server

`Server.SOFTWARE_MANAGEMENT_V2`

## Response Type

[`FotaV2CallbackRegistrationResult`](../../doc/models/fota-v2-callback-registration-result.md)

## Example Usage

```java
String account = "0000123456-00001";
FotaV2CallbackRegistrationRequest body = new FotaV2CallbackRegistrationRequest.Builder()
    .url("https://255.255.11.135:50559/CallbackListener/FirmwareServiceMessages.asmx")
    .build();

softwareManagementCallbacksV2Controller.updateCallbackAsync(account, body).thenAccept(result -> {
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
  "url": "https://255.255.11.135:50559/CallbackListener/FirmwareServiceMessages.asmx"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Unexpected error. | [`FotaV2ResultException`](../../doc/models/fota-v2-result-exception.md) |


# Register Callback

This endpoint allows user to create the HTTPS callback address.

```java
CompletableFuture<ApiResponse<FotaV2CallbackRegistrationResult>> registerCallbackAsync(
    final String account,
    final FotaV2CallbackRegistrationRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `account` | `String` | Template, Required | Account identifier. |
| `body` | [`FotaV2CallbackRegistrationRequest`](../../doc/models/fota-v2-callback-registration-request.md) | Body, Required | Callback URL registration. |

## Server

`Server.SOFTWARE_MANAGEMENT_V2`

## Response Type

[`FotaV2CallbackRegistrationResult`](../../doc/models/fota-v2-callback-registration-result.md)

## Example Usage

```java
String account = "0000123456-00001";
FotaV2CallbackRegistrationRequest body = new FotaV2CallbackRegistrationRequest.Builder()
    .url("https://10.120.102.183:50559/CallbackListener/FirmwareServiceMessages.asmx")
    .build();

softwareManagementCallbacksV2Controller.registerCallbackAsync(account, body).thenAccept(result -> {
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
  "url": "https://10.120.102.183:50559/CallbackListener/FirmwareServiceMessages.asmx"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Unexpected error. | [`FotaV2ResultException`](../../doc/models/fota-v2-result-exception.md) |


# List Registered Callbacks

This endpoint allows user to get the registered callback information.

```java
CompletableFuture<ApiResponse<CallbackSummary>> listRegisteredCallbacksAsync(
    final String account)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `account` | `String` | Template, Required | Account identifier. |

## Server

`Server.SOFTWARE_MANAGEMENT_V2`

## Response Type

[`CallbackSummary`](../../doc/models/callback-summary.md)

## Example Usage

```java
String account = "0000123456-00001";

softwareManagementCallbacksV2Controller.listRegisteredCallbacksAsync(account).thenAccept(result -> {
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
  "url": "http://10.120.102.183:50559/CallbackListener/FirmwareServiceMessages.asmx"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Unexpected error. | [`FotaV2ResultException`](../../doc/models/fota-v2-result-exception.md) |


# Deregister Callback

This endpoint allows user to delete a previously registered callback URL.

```java
CompletableFuture<ApiResponse<FotaV2SuccessResult>> deregisterCallbackAsync(
    final String account)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `account` | `String` | Template, Required | Account identifier. |

## Server

`Server.SOFTWARE_MANAGEMENT_V2`

## Response Type

[`FotaV2SuccessResult`](../../doc/models/fota-v2-success-result.md)

## Example Usage

```java
String account = "0000123456-00001";

softwareManagementCallbacksV2Controller.deregisterCallbackAsync(account).thenAccept(result -> {
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
| 400 | Unexpected error. | [`FotaV2ResultException`](../../doc/models/fota-v2-result-exception.md) |

