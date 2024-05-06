# Software Management Callbacks V3

```java
SoftwareManagementCallbacksV3Controller softwareManagementCallbacksV3Controller = client.getSoftwareManagementCallbacksV3Controller();
```

## Class Name

`SoftwareManagementCallbacksV3Controller`

## Methods

* [Deregister Callback](../../doc/controllers/software-management-callbacks-v3.md#deregister-callback)
* [Update Callback](../../doc/controllers/software-management-callbacks-v3.md#update-callback)
* [Register Callback](../../doc/controllers/software-management-callbacks-v3.md#register-callback)
* [List Registered Callbacks](../../doc/controllers/software-management-callbacks-v3.md#list-registered-callbacks)


# Deregister Callback

This endpoint allows user to delete a previously registered callback URL.

```java
CompletableFuture<ApiResponse<FotaV3SuccessResult>> deregisterCallbackAsync(
    final String acc)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `acc` | `String` | Template, Required | Account identifier. |

## Server

`Server.SOFTWARE_MANAGEMENT_V3`

## Response Type

[`FotaV3SuccessResult`](../../doc/models/fota-v3-success-result.md)

## Example Usage

```java
String acc = "0000123456-00001";

softwareManagementCallbacksV3Controller.deregisterCallbackAsync(acc).thenAccept(result -> {
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
| 400 | Unexpected error. | [`FotaV3ResultException`](../../doc/models/fota-v3-result-exception.md) |


# Update Callback

This endpoint allows the user to update the HTTPS callback address.

```java
CompletableFuture<ApiResponse<FotaV3CallbackRegistrationResult>> updateCallbackAsync(
    final String acc,
    final FotaV3CallbackRegistrationRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `acc` | `String` | Template, Required | Account identifier. |
| `body` | [`FotaV3CallbackRegistrationRequest`](../../doc/models/fota-v3-callback-registration-request.md) | Body, Required | Callback URL registration. |

## Server

`Server.SOFTWARE_MANAGEMENT_V3`

## Response Type

[`FotaV3CallbackRegistrationResult`](../../doc/models/fota-v3-callback-registration-result.md)

## Example Usage

```java
String acc = "0000123456-00001";
FotaV3CallbackRegistrationRequest body = new FotaV3CallbackRegistrationRequest.Builder()
    .url("https://255.255.11.135:50559/CallbackListener/FirmwareServiceMessages.asmx")
    .build();

softwareManagementCallbacksV3Controller.updateCallbackAsync(acc, body).thenAccept(result -> {
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
| 400 | Unexpected error. | [`FotaV3ResultException`](../../doc/models/fota-v3-result-exception.md) |


# Register Callback

This endpoint allows the user to create the HTTPS callback address.

```java
CompletableFuture<ApiResponse<FotaV3CallbackRegistrationResult>> registerCallbackAsync(
    final String acc,
    final FotaV3CallbackRegistrationRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `acc` | `String` | Template, Required | Account identifier. |
| `body` | [`FotaV3CallbackRegistrationRequest`](../../doc/models/fota-v3-callback-registration-request.md) | Body, Required | Callback URL registration. |

## Server

`Server.SOFTWARE_MANAGEMENT_V3`

## Response Type

[`FotaV3CallbackRegistrationResult`](../../doc/models/fota-v3-callback-registration-result.md)

## Example Usage

```java
String acc = "0000123456-00001";
FotaV3CallbackRegistrationRequest body = new FotaV3CallbackRegistrationRequest.Builder()
    .url("https://255.255.11.135:50559/CallbackListener/FirmwareServiceMessages.asmx")
    .build();

softwareManagementCallbacksV3Controller.registerCallbackAsync(acc, body).thenAccept(result -> {
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
| 400 | Unexpected error. | [`FotaV3ResultException`](../../doc/models/fota-v3-result-exception.md) |


# List Registered Callbacks

This endpoint allows user to get the registered callback information.

```java
CompletableFuture<ApiResponse<FotaV3CallbackSummary>> listRegisteredCallbacksAsync(
    final String acc)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `acc` | `String` | Template, Required | Account identifier. |

## Server

`Server.SOFTWARE_MANAGEMENT_V3`

## Response Type

[`FotaV3CallbackSummary`](../../doc/models/fota-v3-callback-summary.md)

## Example Usage

```java
String acc = "0000123456-00001";

softwareManagementCallbacksV3Controller.listRegisteredCallbacksAsync(acc).thenAccept(result -> {
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
| 400 | Unexpected error. | [`FotaV3ResultException`](../../doc/models/fota-v3-result-exception.md) |

