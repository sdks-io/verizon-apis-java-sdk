# 5G BI Device Actions

```java
M5gBIDeviceActionsController m5gBIDeviceActionsController = client.getM5gBIDeviceActionsController();
```

## Class Name

`M5gBIDeviceActionsController`

## Methods

* [Business Internetlist Device Information](../../doc/controllers/5g-bi-device-actions.md#business-internetlist-device-information)
* [Business Internetactivate Using POST](../../doc/controllers/5g-bi-device-actions.md#business-internetactivate-using-post)
* [Business Internet Serviceplanchange](../../doc/controllers/5g-bi-device-actions.md#business-internet-serviceplanchange)


# Business Internetlist Device Information

Uses the decive's Integrated Circuit Card Identification Number (ICCID) to retrive and display the device's properties.

```java
CompletableFuture<ApiResponse<M5gBideviceDetailsresponse>> businessInternetlistDeviceInformationAsync(
    final M5gBideviceId body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`M5gBideviceId`](../../doc/models/m5-g-bidevice-id.md) | Body, Required | Device Profile Query |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`M5gBideviceDetailsresponse`](../../doc/models/m5-g-bidevice-detailsresponse.md).

## Example Usage

```java
M5gBideviceId body = new M5gBideviceId.Builder()
    .deviceId(new M5gBideviceId1.Builder()
        .id("20-digit ICCID")
        .kind("iccid")
        .build())
    .build();

m5gBIDeviceActionsController.businessInternetlistDeviceInformationAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof M5gBiRestErrorResponseException) {
        M5gBiRestErrorResponseException m5gBiRestErrorResponseException = (M5gBiRestErrorResponseException) cause;
        m5gBiRestErrorResponseException.printStackTrace();
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
| Default | Error response | [`M5gBiRestErrorResponseException`](../../doc/models/m5-g-bi-rest-error-response-exception.md) |


# Business Internetactivate Using POST

Uses the device's ICCID and IMEI to activate service.

```java
CompletableFuture<ApiResponse<M5gBiRequestResponse>> businessInternetactivateUsingPOSTAsync(
    final M5gBiactivateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`M5gBiactivateRequest`](../../doc/models/m5-g-biactivate-request.md) | Body, Required | Activate 5G BI service. Defining <code>publicIpRestriction</code> as "Unrestricted" or "Restricted" is required for activating as Public Static. Leave  <code>publicIpRestriction</code> undefined to activate as Public Dynamic. Removing <code>publicIpRestriction</code> from the request will activate as Mobile Private Network (MPN). |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`M5gBiRequestResponse`](../../doc/models/m5-g-bi-request-response.md).

## Example Usage

```java
M5gBiactivateRequest body = new M5gBiactivateRequest.Builder()
    .accountName("0000123456-00001")
    .servicePlan("service plan name")
    .deviceListWithServiceAddress(Arrays.asList(
        M5gBiactivateRequestDeviceListWithServiceAddress.fromM5gBideviceIdarray(
            new M5gBideviceIdarray.Builder()
                .deviceId(Arrays.asList(
                    M5gBideviceIdarrayDeviceId.fromM5gBideviceId1(
                        new M5gBideviceId1.Builder()
                            .id("15-digit IMEI")
                            .kind("imei")
                            .build()
                    ),
                    M5gBideviceIdarrayDeviceId.fromM5gBideviceId1(
                        new M5gBideviceId1.Builder()
                            .id("20-digit ICCID")
                            .kind("iccid")
                            .build()
                    )
                ))
                .build()
        ),
        M5gBiactivateRequestDeviceListWithServiceAddress.fromM5gBideviceIdarray(
            new M5gBideviceIdarray.Builder()
                .build()
        )
    ))
    .skuNumber("VZW Stock Keeping Unit number")
    .publicIpRestriction("Unrestricted")
    .carrierName("Verizon Wireless")
    .mdnZipCode("the 5-digit ZIP code of the Mobile Directory Number (MDN)")
    .build();

m5gBIDeviceActionsController.businessInternetactivateUsingPOSTAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof M5gBiRestErrorResponseException) {
        M5gBiRestErrorResponseException m5gBiRestErrorResponseException = (M5gBiRestErrorResponseException) cause;
        m5gBiRestErrorResponseException.printStackTrace();
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
  "requestId": "d1f08526-5443-4054-9a29-4456490ea9f8"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`M5gBiRestErrorResponseException`](../../doc/models/m5-g-bi-rest-error-response-exception.md) |


# Business Internet Serviceplanchange

Change a device's service plan to use 5G BI.

```java
CompletableFuture<ApiResponse<M5gBiRequestResponse>> businessInternetServiceplanchangeAsync(
    final M5gBichangeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`M5gBichangeRequest`](../../doc/models/m5-g-bichange-request.md) | Body, Required | This endpoint is for use when changing a device's service plan to a 5G BI service plan. The service plan can change for an active device up to four times per month but will require address validation for each change. The service plan cannot be changed for a device while its service is suspended. |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`M5gBiRequestResponse`](../../doc/models/m5-g-bi-request-response.md).

## Example Usage

```java
M5gBichangeRequest body = new M5gBichangeRequest.Builder()
    .accountName("0000123456-00001")
    .servicePlan("5G BI service plan name being changed to")
    .deviceListWithServiceAddress(Arrays.asList(
        M5gBichangeRequestDeviceListWithServiceAddress.fromM5gBideviceIdarray2(
            new M5gBideviceIdarray2.Builder()
                .deviceId(Arrays.asList(
                    new M5gBideviceId1.Builder()
                        .id("15-digit IMEI")
                        .kind("imei")
                        .build()
                ))
                .build()
        ),
        M5gBichangeRequestDeviceListWithServiceAddress.fromM5gBideviceIdarray2(
            new M5gBideviceIdarray2.Builder()
                .build()
        )
    ))
    .currentServicePlan("Optional name of the plan being changed from")
    .build();

m5gBIDeviceActionsController.businessInternetServiceplanchangeAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof M5gBiRestErrorResponseException) {
        M5gBiRestErrorResponseException m5gBiRestErrorResponseException = (M5gBiRestErrorResponseException) cause;
        m5gBiRestErrorResponseException.printStackTrace();
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
  "requestId": "d1f08526-5443-4054-9a29-4456490ea9f8"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`M5gBiRestErrorResponseException`](../../doc/models/m5-g-bi-rest-error-response-exception.md) |

