# Sensor Insights Gateways

```java
SensorInsightsGatewaysController sensorInsightsGatewaysController = client.getSensorInsightsGatewaysController();
```

## Class Name

`SensorInsightsGatewaysController`


# Sensor Insights List Gateway Devices Request

```java
CompletableFuture<ApiResponse<List<ResourceDevice>>> sensorInsightsListGatewayDevicesRequestAsync(
    final DtoListDevicesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DtoListDevicesRequest`](../../doc/models/dto-list-devices-request.md) | Body, Required | Get gateway information |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`List<ResourceDevice>`](../../doc/models/resource-device.md).

## Example Usage

```java
DtoListDevicesRequest body = new DtoListDevicesRequest.Builder()
    .accountname("0000123456-00001")
    .filter(new DtoFilter.Builder()
        .expand("device detail(s)")
        .limitnumber(100)
        .nopagination(true)
        .page("The number of pages")
        .pagenumber(100)
        .projection(Arrays.asList(
            "specific device fields requested"
        ))
        .selection(new LinkedHashMap<String, Object>() {{
            put("additionalProp1", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
            put("additionalProp2", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
            put("additionalProp3", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
        }})
        .build())
    .resourceidentifier(new DtoDeviceResourceIdentifier.Builder()
        .deveui("The unique EUI64 address of the device")
        .deviceid("The UUID of the device")
        .esn(223372036854775800)
        .iccid("The 20-digit Integrated Circuit Card ID (SIM card ID)")
        .imei(223372036854775)
        .imsi(223372036854775800)
        .mac("The Media Access Control address of the device, listed on the device in the format XX-XX-XX-XX-XX-XX or XX:XX:XX:XX:XX:XX")
        .manufacturer("REOLINK")
        .meid("The 56-bit Mobile Equipment ID")
        .msisdn("The Mobile Station International Subscriber Directory Number. In the USA, this is 1+ a 10-digit phone number")
        .nodeUuid("The UUID of the node the device is associated with")
        .qrcode("The Quick Response (QR) code")
        .serial("The device's serial number")
        .build())
    .build();

sensorInsightsGatewaysController.sensorInsightsListGatewayDevicesRequestAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof M400ManagementErrorException) {
        M400ManagementErrorException m400ManagementErrorException = (M400ManagementErrorException) cause;
        m400ManagementErrorException.printStackTrace();
    } else if (cause instanceof ManagementErrorException) {
        ManagementErrorException managementErrorException = (ManagementErrorException) cause;
        managementErrorException.printStackTrace();
    } else if (cause instanceof M403ManagementErrorException) {
        M403ManagementErrorException m403ManagementErrorException = (M403ManagementErrorException) cause;
        m403ManagementErrorException.printStackTrace();
    } else if (cause instanceof M404ManagementErrorException) {
        M404ManagementErrorException m404ManagementErrorException = (M404ManagementErrorException) cause;
        m404ManagementErrorException.printStackTrace();
    } else if (cause instanceof M500ManagementErrorException) {
        M500ManagementErrorException m500ManagementErrorException = (M500ManagementErrorException) cause;
        m500ManagementErrorException.printStackTrace();
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
| 400 | Bad Request | [`M400ManagementErrorException`](../../doc/models/m400-management-error-exception.md) |
| 401 | UnAuthorized | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 403 | Forbidden | [`M403ManagementErrorException`](../../doc/models/m403-management-error-exception.md) |
| 404 | Not Found | [`M404ManagementErrorException`](../../doc/models/m404-management-error-exception.md) |
| 406 | Not Acceptable | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 415 | Unsupported media type | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 429 | Too many requests | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 500 | Internal server error. | [`M500ManagementErrorException`](../../doc/models/m500-management-error-exception.md) |
| Default | Unexpected error | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |

