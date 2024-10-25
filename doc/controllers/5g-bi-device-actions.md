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
| `body` | [`M5gBideviceId`](../../doc/models/5g-bidevice-id.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`M5gBideviceDetailsresponse`](../../doc/models/5g-bidevice-detailsresponse.md)

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
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`M5gBiRestErrorResponseException`](../../doc/models/5g-bi-rest-error-response-exception.md) |


# Business Internetactivate Using POST

Uses the device's ICCID and IMEI to activate service.

```java
CompletableFuture<ApiResponse<M5gBiRequestResponse>> businessInternetactivateUsingPOSTAsync(
    final M5gBiactivateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`M5gBiactivateRequest`](../../doc/models/5g-biactivate-request.md) | Body, Required | Activate 5G BI service. Defining <code>publicIpRestriction</code> as "Unrestricted" or "Restricted" is required for activating as Public Static. Leave  <code>publicIpRestriction</code> undefined to activate as Public Dynamic. Removing <code>publicIpRestriction</code> from the request will activate as Mobile Private Network (MPN). |

## Server

`Server.THINGSPACE`

## Response Type

[`M5gBiRequestResponse`](../../doc/models/5g-bi-request-response.md)

## Example Usage

```java
M5gBiactivateRequest body = new M5gBiactivateRequest.Builder()
    .accountName("0000123456-00001")
    .servicePlan("service plan name")
    .deviceListWithServiceAddress(Arrays.asList(
        new DeviceListWithServiceAddress1.Builder()
            .deviceId(Arrays.asList(
                new M5gBideviceId1.Builder()
                    .id("15-digit IMEI")
                    .kind("imei")
                    .build(),
                new M5gBideviceId1.Builder()
                    .id("20-digit ICCID")
                    .kind("iccid")
                    .build()
            ))
            .build(),
        new DeviceListWithServiceAddress1.Builder()
            .primaryPlaceofuse(new M5gBiprimaryPlaceofuse.Builder()
                .address(new M5gBiAddress.Builder()
                    .addressLine1("street number and name")
                    .city("city of address")
                    .state("2-letter state ID (conforms to ISO 3166-2)")
                    .zip("5-digit ZIP code")
                    .zip4("the +4 digits used for ZIP codes")
                    .phone("a 10-digit phone number")
                    .phoneType("W")
                    .build())
                .customerName(new M5gBiCustomerName.Builder()
                    .firstName("First name")
                    .lastName("Surname or Last Name")
                    .middleName("middle name or initial")
                    .title("Mr. or Ms.")
                    .suffex("Dr or Esq")
                    .build())
                .build())
            .build()
    ))
    .publicIpRestriction("Unrestricted")
    .carrierName("Verizon Wireless")
    .mdnZipCode("the 5-digit ZIP code of the Mobile Directory Number (MDN)")
    .build();

m5gBIDeviceActionsController.businessInternetactivateUsingPOSTAsync(body).thenAccept(result -> {
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
  "requestId": "d1f08526-5443-4054-9a29-4456490ea9f8"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`M5gBiRestErrorResponseException`](../../doc/models/5g-bi-rest-error-response-exception.md) |


# Business Internet Serviceplanchange

Change a device's service plan to use 5G BI.

```java
CompletableFuture<ApiResponse<M5gBiRequestResponse>> businessInternetServiceplanchangeAsync(
    final M5gBichangeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`M5gBichangeRequest`](../../doc/models/5g-bichange-request.md) | Body, Required | This endpoint is for use when changing a device's service plan to a 5G BI service plan. The service plan can change for an active device up to four times per month but will require address validation for each change. The service plan cannot be changed for a device while its service is suspended. |

## Server

`Server.THINGSPACE`

## Response Type

[`M5gBiRequestResponse`](../../doc/models/5g-bi-request-response.md)

## Example Usage

```java
M5gBichangeRequest body = new M5gBichangeRequest.Builder()
    .accountName("0000123456-00001")
    .servicePlan("5G BI service plan name being changed to")
    .deviceListWithServiceAddress(Arrays.asList(
        new DeviceListWithServiceAddress.Builder()
            .deviceId(Arrays.asList(
                new M5gBideviceId1.Builder()
                    .id("15-digit IMEI")
                    .kind("imei")
                    .build()
            ))
            .build(),
        new DeviceListWithServiceAddress.Builder()
            .primaryPlaceofuse(new M5gBiaddressAndcustomerinfo.Builder()
                .build())
            .build()
    ))
    .currentServicePlan("Name of the plan being changed from")
    .build();

m5gBIDeviceActionsController.businessInternetServiceplanchangeAsync(body).thenAccept(result -> {
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
  "requestId": "d1f08526-5443-4054-9a29-4456490ea9f8"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error response | [`M5gBiRestErrorResponseException`](../../doc/models/5g-bi-rest-error-response-exception.md) |

