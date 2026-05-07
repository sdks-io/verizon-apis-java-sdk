# API

```java
APIController aPIController = client.getAPIController();
```

## Class Name

`APIController`

## Methods

* [Get Configuration List](../../doc/controllers/api.md#get-configuration-list)
* [Get Configuration](../../doc/controllers/api.md#get-configuration)
* [Create Configuration](../../doc/controllers/api.md#create-configuration)
* [Update Configuration](../../doc/controllers/api.md#update-configuration)
* [Delete Configuration](../../doc/controllers/api.md#delete-configuration)
* [Register ETX Device](../../doc/controllers/api.md#register-etx-device)
* [Renew ETX Device](../../doc/controllers/api.md#renew-etx-device)
* [Unregister ETX Device](../../doc/controllers/api.md#unregister-etx-device)
* [Get ETX Device Certificate](../../doc/controllers/api.md#get-etx-device-certificate)
* [Retrieve MQTTURL](../../doc/controllers/api.md#retrieve-mqtturl)
* [Retrieve MQTTURL Multi MEC](../../doc/controllers/api.md#retrieve-mqtturl-multi-mec)


# Get Configuration List

This endpoint fetches and returns the list of configurations defined by the Vendor. The list contains the configurations' identifier, name, description, and active flag. The vendor ID is provided when the configuration is created through the POST request.

Note: The user needs to authenticate with their ThingSpace credentials using the Access/Bearer and Session/M2M tokens in order to call this API.

```java
CompletableFuture<ApiResponse<List<ConfigurationListItem>>> getConfigurationListAsync(
    final String vendorID)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `vendorID` | `String` | Header, Required | The vendor's identifier<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[a-zA-Z0-9]+$` |

## Server

`Server.IMP_SERVER`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`List<ConfigurationListItem>`](../../doc/models/configuration-list-item.md).

## Example Usage

```java
String vendorID = "VerizonETX";

aPIController.getConfigurationListAsync(vendorID).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof EtxResponseErrorException) {
        EtxResponseErrorException etxResponseErrorException = (EtxResponseErrorException) cause;
        etxResponseErrorException.printStackTrace();
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
| 403 | Forbidden | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |
| 404 | Configuration not found | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |
| 429 | Too many requests | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |
| Default | unexpected error | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |


# Get Configuration

This endpoint fetches and returns a specific configuration's details. The configuration ID parameter, which was provided when the configuration was created through the POST request, is need to retrieve the configuration details.

Note: The user needs to authenticate with their ThingSpace credentials using the Access/Bearer and Session/M2M tokens in order to call this API.

```java
CompletableFuture<ApiResponse<GeoFenceConfigurationResponse>> getConfigurationAsync(
    final String id,
    final String vendorID)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Query, Required | The configuration identifier<br><br>**Constraints**: *Minimum Length*: `32`, *Maximum Length*: `36`, *Pattern*: `^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?4[0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$` |
| `vendorID` | `String` | Header, Required | The vendor's identifier<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[a-zA-Z0-9]+$` |

## Server

`Server.IMP_SERVER`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`GeoFenceConfigurationResponse`](../../doc/models/geo-fence-configuration-response.md).

## Example Usage

```java
String id = "18bac1ff-c7bd-44d9-a7ad-06a093a94713";
String vendorID = "VerizonETX";

aPIController.getConfigurationAsync(id, vendorID).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof EtxResponseErrorException) {
        EtxResponseErrorException etxResponseErrorException = (EtxResponseErrorException) cause;
        etxResponseErrorException.printStackTrace();
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
| 403 | Forbidden | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |
| 404 | Configuration not found | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |
| 429 | Too many requests | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |
| Default | unexpected error | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |


# Create Configuration

This endpoint creates a new configuration in the system. The data for the new configuration should be provided as JSON in the body of the POST request. The system will return with a unique ID for the configuration, which is needed for any further manipulation (update or delete) of the configuration.

Note: The user needs to authenticate with their ThingSpace credentials using the Access/Bearer and Session/M2M tokens in order to call this API.

```java
CompletableFuture<ApiResponse<GeoFenceConfigurationResponse>> createConfigurationAsync(
    final String vendorID,
    final GeoFenceConfigurationRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `vendorID` | `String` | Header, Required | The vendor's identifier<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[a-zA-Z0-9]+$` |
| `body` | [`GeoFenceConfigurationRequest`](../../doc/models/geo-fence-configuration-request.md) | Body, Required | - |

## Server

`Server.IMP_SERVER`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`GeoFenceConfigurationResponse`](../../doc/models/geo-fence-configuration-response.md).

## Example Usage

```java
String vendorID = "VerizonETX";
GeoFenceConfigurationRequest body = new GeoFenceConfigurationRequest.Builder(
    new EtxGeoFence.Builder(
        TypeEnum.FEATURECOLLECTION,
        Arrays.asList(
            new EtxFeature.Builder(
                Type1Enum.FEATURE,
                Geometry.fromLineString(
                    new LineString.Builder(
                        Type2Enum.LINESTRING,
                        Arrays.asList(
                            Arrays.asList(
                                51.53D,
                                51.54D
                            ),
                            Arrays.asList(
                                51.53D,
                                51.54D
                            )
                        )
                    )
                    .build()
                ),
                ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}")
            )
            .build()
        )
    )
    .build(),
    Arrays.asList(
        Message4.fromMessage(
            new Message.Builder(
                false,
                Arrays.asList(
                    RoadUserTypesEnum.VULNERABLEROADUSER
                ),
                Arrays.asList(
                    TriggerConditionEnum.CROSSING
                ),
                new Generic.Builder(
                    "messageType4",
                    "messageFormat6",
                    "payload0"
                )
                .build()
            )
            .build()
        )
    ),
    false
)
.messageStandard(MessageStandardEnum.SAE)
.build();

aPIController.createConfigurationAsync(vendorID, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof EtxResponseErrorException) {
        EtxResponseErrorException etxResponseErrorException = (EtxResponseErrorException) cause;
        etxResponseErrorException.printStackTrace();
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
| 400 | Invalid configuration | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |
| 403 | Forbidden | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |
| 429 | Too many requests | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |
| Default | unexpected error | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |


# Update Configuration

This endpoint updates an existing configuration. Similar to POST, the updated data for the configuration should be provided as JSON in the body of the PUT request. The configuration ID parameter, which was provided by the POST (create) operation, is required to do any updates on the configuration.

Note: The user needs to authenticate with their ThingSpace credentials using the Access/Bearer and Session/M2M tokens in order to call this API.

```java
CompletableFuture<ApiResponse<Void>> updateConfigurationAsync(
    final String vendorID,
    final String id,
    final GeoFenceConfigurationUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `vendorID` | `String` | Header, Required | The vendor's identifier<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[a-zA-Z0-9]+$` |
| `id` | `String` | Query, Required | The configuration identifier<br><br>**Constraints**: *Minimum Length*: `32`, *Maximum Length*: `36`, *Pattern*: `^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?4[0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$` |
| `body` | [`GeoFenceConfigurationUpdateRequest`](../../doc/models/geo-fence-configuration-update-request.md) | Body, Required | - |

## Server

`Server.IMP_SERVER`

## Response Type

`void`

## Example Usage

```java
String vendorID = "VerizonETX";
String id = "18bac1ff-c7bd-44d9-a7ad-06a093a94713";
GeoFenceConfigurationUpdateRequest body = new GeoFenceConfigurationUpdateRequest.Builder()
    .messageStandard(MessageStandardEnum.SAE)
    .build();

aPIController.updateConfigurationAsync(vendorID, id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof EtxResponseErrorException) {
        EtxResponseErrorException etxResponseErrorException = (EtxResponseErrorException) cause;
        etxResponseErrorException.printStackTrace();
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
| 400 | Invalid configuration | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |
| 403 | Forbidden | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |
| 404 | Configuration not found | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |
| 429 | Too many requests | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |
| Default | unexpected error | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |


# Delete Configuration

This endpoint deletes a specific configuration from the system. It requires the configuration ID parameter, which was provided by the POST (create) operation.

Note: The user needs to authenticate with their ThingSpace credentials using the Access/Bearer and Session/M2M tokens in order to call this API.

```java
CompletableFuture<ApiResponse<Void>> deleteConfigurationAsync(
    final String vendorID,
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `vendorID` | `String` | Header, Required | The vendor's identifier<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[a-zA-Z0-9]+$` |
| `id` | `String` | Query, Required | The configuration identifier<br><br>**Constraints**: *Minimum Length*: `32`, *Maximum Length*: `36`, *Pattern*: `^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?4[0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$` |

## Server

`Server.IMP_SERVER`

## Response Type

`void`

## Example Usage

```java
String vendorID = "VerizonETX";
String id = "18bac1ff-c7bd-44d9-a7ad-06a093a94713";

aPIController.deleteConfigurationAsync(vendorID, id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof EtxResponseErrorException) {
        EtxResponseErrorException etxResponseErrorException = (EtxResponseErrorException) cause;
        etxResponseErrorException.printStackTrace();
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
| 403 | Forbidden | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |
| 429 | Too many requests | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |
| Default | unexpected error | [`EtxResponseErrorException`](../../doc/models/etx-response-error-exception.md) |


# Register ETX Device

With this API call the user (client) registers its device or software service to the ETX system. Therefore, when a connection is initiated from the device or software service to the ETX system along with the credential provided by this registration call, then the connection will be authorized.

- The user can register multiple devices or software services, which can all be used at the same time.
- There rules set in the system that limit the type and subtype of the clients that are allowed to be registered under the VendorID. The rules are created based ont he agreement between the Vendor and Verizon.
- The user will only be able to register a limited number of devices or software services under the same VendorID. This registration limit is specified by the agreement between the Vendor and Verizon.

Note: The user needs to authenticate with their ThingSpace credentials using the Access/Bearer and Session/M2M tokens in order to call this API.

```java
CompletableFuture<ApiResponse<ClientRegistrationResponse>> registerETXDeviceAsync(
    final ClientRegistrationRequestV2 body,
    final UUID xTransactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ClientRegistrationRequestV2`](../../doc/models/client-registration-request-v2.md) | Body, Required | - |
| `xTransactionId` | `UUID` | Header, Optional | Optional transaction identifier for tracing requests. If not provided, the application will generate one. |

## Server

`Server.IMP_SERVER`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`ClientRegistrationResponse`](../../doc/models/client-registration-response.md).

## Example Usage

```java
ClientRegistrationRequestV2 body = new ClientRegistrationRequestV2.Builder(
    EtxClientTypeEnum.TRAFFICLIGHTCONTROLLER,
    ClientSubtypeEnum.SCOOTER,
    "VerizonETX"
)
.deviceID(UUID.fromString("a4fcd16a-343d-4527-8203-2f46e3e4ff4b"))
.iMEI("12-345678-901234-5")
.iCCID("89345678901234567890")
.iMSI("123456789012345")
.build();

UUID xTransactionId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");

aPIController.registerETXDeviceAsync(body, xTransactionId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ETXRespondingErrorException) {
        ETXRespondingErrorException eTXRespondingErrorException = (ETXRespondingErrorException) cause;
        eTXRespondingErrorException.printStackTrace();
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
| 400 | Invalid Request | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 401 | Unauthorized Request | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 403 | Forbidden Request | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 429 | Too Many Requests | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 503 | Internal Server Error | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| Default | Forbidden | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |


# Renew ETX Device

With this API call the user (client) can:

- renew the certificate of a device or software service in the ETX system if the original certificate has expired. If the client's certificate expired or going to expire within 30 days and new certificate will be issued. If the certificate expires more than 30 days, the current certificate will be returned to the client.
- complete its device or software service registration to the ETX system if the original registration request was not successful because of a pending certificate generation. Whenever the user receives a "client registration is pending" response (HTTP 202) from POST /clients/registration call. The client should initiate this PUT API call to finish the registration process and get the required certificate.

Note: The user needs to authenticate with their ThingSpace credentials using the Access/Bearer and Session/M2M tokens in order to call this API.

```java
CompletableFuture<ApiResponse<ClientRegistrationResponse>> renewETXDeviceAsync(
    final UUID etxDeviceID,
    final String etxVendorID,
    final UUID xTransactionId,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `etxDeviceID` | `UUID` | Header, Required | - |
| `etxVendorID` | `String` | Header, Required | The VendorID set during the Vendor registration call.<br><br>**Constraints**: *Maximum Length*: `64`, *Pattern*: `^[a-zA-Z0-9]+$` |
| `xTransactionId` | `UUID` | Header, Optional | Optional transaction identifier for tracing requests. If not provided, the application will generate one. |
| `body` | `Object` | Body, Optional | - |

## Server

`Server.IMP_SERVER`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`ClientRegistrationResponse`](../../doc/models/client-registration-response.md).

## Example Usage

```java
UUID etxDeviceID = UUID.fromString("a4fcd16a-343d-4527-8203-2f46e3e4ff4b");
String etxVendorID = "VerizonETX";
UUID xTransactionId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");

aPIController.renewETXDeviceAsync(etxDeviceID, etxVendorID, xTransactionId, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ETXRespondingErrorException) {
        ETXRespondingErrorException eTXRespondingErrorException = (ETXRespondingErrorException) cause;
        eTXRespondingErrorException.printStackTrace();
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
| 400 | Invalid Request | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 401 | Unauthorized Request | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 403 | Forbidden Request | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 429 | Too Many Requests | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 503 | Internal Server Error | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| Default | Forbidden | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |


# Unregister ETX Device

With this API call the user (client) can unregister its devices and software services from the ETX system. The unregistered devices and services will no longer be able to use the ETX Message Exchange.

Note: The user needs to authenticate with their ThingSpace credentials using the Access/Bearer and Session/M2M tokens in order to call this API.

```java
CompletableFuture<ApiResponse<Void>> unregisterETXDeviceAsync(
    final String etxVendorID,
    final List<UUID> deviceIDs,
    final UUID xTransactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `etxVendorID` | `String` | Header, Required | The VendorID set during the Vendor registration call.<br><br>**Constraints**: *Maximum Length*: `64`, *Pattern*: `^[a-zA-Z0-9]+$` |
| `deviceIDs` | `List<UUID>` | Query, Required | The list of device IDs and software service IDs to be unregistered<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `100` |
| `xTransactionId` | `UUID` | Header, Optional | Optional transaction identifier for tracing requests. If not provided, the application will generate one. |

## Server

`Server.IMP_SERVER`

## Response Type

`void`

## Example Usage

```java
String etxVendorID = "VerizonETX";
List<UUID> deviceIDs = Arrays.asList(
    UUID.fromString("0000225a-0000-0000-0000-000000000000")
);

UUID xTransactionId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");

aPIController.unregisterETXDeviceAsync(etxVendorID, deviceIDs, xTransactionId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ETXRespondingErrorException) {
        ETXRespondingErrorException eTXRespondingErrorException = (ETXRespondingErrorException) cause;
        eTXRespondingErrorException.printStackTrace();
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
| 400 | Invalid Request | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 401 | Unauthorized Request | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 403 | Forbidden Request | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 429 | Too Many Requests | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 503 | Internal Server Error | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| Default | Forbidden | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |


# Get ETX Device Certificate

With this API call the user can check the certificate of the device. At least one of the DeviceID, IMEI, ICCID or IMSI is required to make the call.

Note: The user needs to authenticate with their ThingSpace credentials using the Access/Bearer and Session/M2M tokens in order to call this API.

```java
CompletableFuture<ApiResponse<ClientPersistenceResponse>> getETXDeviceCertificateAsync(
    final EtxID etxID,
    final UUID xTransactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `etxID` | [`EtxID`](../../doc/models/etx-id.md) | Query, Required | One of the following IDs is required- DeviceID, IMEI, ICCID, IMSI. If more than one ID is provided, the API will return the certificate for the first ID found. The IDs are evaluated in the following order: DeviceID, IMEI, ICCID, IMSI. If the first provided ID is not found, the API will return an error. |
| `xTransactionId` | `UUID` | Header, Optional | Optional transaction identifier for tracing requests. If not provided, the application will generate one. |

## Server

`Server.IMP_SERVER`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`ClientPersistenceResponse`](../../doc/models/client-persistence-response.md).

## Example Usage

```java
EtxID etxID = new EtxID.Builder()
    .deviceID(UUID.fromString("a4fcd16a-343d-4527-8203-2f46e3e4ff4b"))
    .iMEI("12-345678-901234-5")
    .iCCID("89345678901234567890")
    .iMSI("123456789012345")
    .build();

UUID xTransactionId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");

aPIController.getETXDeviceCertificateAsync(etxID, xTransactionId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ETXRespondingErrorException) {
        ETXRespondingErrorException eTXRespondingErrorException = (ETXRespondingErrorException) cause;
        eTXRespondingErrorException.printStackTrace();
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
| 400 | Invalid request | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 401 | Unauthorized | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 403 | Forbidden Request | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 404 | Not Found | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 429 | Too Many Requests | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 500 | Internal server Error | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| Default | Forbidden | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |


# Retrieve MQTTURL

With this API call the device or software service requests the MQTT URL for the location that it needs to connect. To determine the proper URL the device or software service needs to provide its ID (the one that was provided in the registration request), location (GPS coordinates), and whether it is on the Verizon cellular network or not.

Note: The user needs to authenticate with their ThingSpace credentials using the Access/Bearer and Session/M2M tokens in order to call this API.

```java
CompletableFuture<ApiResponse<ConnectionResponse>> retrieveMQTTURLAsync(
    final String etxVendorID,
    final ConnectionRequest body,
    final UUID xTransactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `etxVendorID` | `String` | Header, Required | The VendorID set during the Vendor registration call.<br><br>**Constraints**: *Maximum Length*: `64`, *Pattern*: `^[a-zA-Z0-9]+$` |
| `body` | [`ConnectionRequest`](../../doc/models/connection-request.md) | Body, Required | - |
| `xTransactionId` | `UUID` | Header, Optional | Optional transaction identifier for tracing requests. If not provided, the application will generate one. |

## Server

`Server.IMP_SERVER`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`ConnectionResponse`](../../doc/models/connection-response.md).

## Example Usage

```java
String etxVendorID = "VerizonETX";
ConnectionRequest body = new ConnectionRequest.Builder(
    UUID.fromString("976c4bad-03d3-4dcb-9688-ee57db7890e4"),
    new Geolocation.Builder(
        42.36D,
        -71.06D
    )
    .build(),
    NetworkTypeEnum.NONVZ
)
.build();

UUID xTransactionId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");

aPIController.retrieveMQTTURLAsync(etxVendorID, body, xTransactionId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ETXRespondingErrorException) {
        ETXRespondingErrorException eTXRespondingErrorException = (ETXRespondingErrorException) cause;
        eTXRespondingErrorException.printStackTrace();
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
| 400 | Invalid request | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 401 | Unauthorized | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 403 | Forbidden Request | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 429 | Too Many Requests | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 503 | Internal server Error | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| Default | Forbidden | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |


# Retrieve MQTTURL Multi MEC

With this API call the device or software service requests the MQTT URL for the location that it needs to connect. To determine the proper URL the device or software service needs to provide its ID (the one that was provided in the registration request), location (GPS coordinates), and whether it is on the Verizon cellular network or not.

If there are multiple MECs that serve the location of the client all options are provided in the response, and the client is free to choose which MEC they want to connect.

Note: The user needs to authenticate with their ThingSpace credentials using the Access/Bearer and Session/M2M tokens in order to call this API.

```java
CompletableFuture<ApiResponse<ConnectionResponseV3>> retrieveMQTTURLMultiMECAsync(
    final String etxVendorID,
    final ConnectionRequest body,
    final UUID xTransactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `etxVendorID` | `String` | Header, Required | The VendorID set during the Vendor registration call.<br><br>**Constraints**: *Maximum Length*: `64`, *Pattern*: `^[a-zA-Z0-9]+$` |
| `body` | [`ConnectionRequest`](../../doc/models/connection-request.md) | Body, Required | - |
| `xTransactionId` | `UUID` | Header, Optional | Optional transaction identifier for tracing requests. If not provided, the application will generate one. |

## Server

`Server.IMP_SERVER`

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`ConnectionResponseV3`](../../doc/models/connection-response-v3.md).

## Example Usage

```java
String etxVendorID = "VerizonETX";
ConnectionRequest body = new ConnectionRequest.Builder(
    UUID.fromString("976c4bad-03d3-4dcb-9688-ee57db7890e4"),
    new Geolocation.Builder(
        42.36D,
        -71.06D
    )
    .build(),
    NetworkTypeEnum.NONVZ
)
.build();

UUID xTransactionId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");

aPIController.retrieveMQTTURLMultiMECAsync(etxVendorID, body, xTransactionId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ETXRespondingErrorException) {
        ETXRespondingErrorException eTXRespondingErrorException = (ETXRespondingErrorException) cause;
        eTXRespondingErrorException.printStackTrace();
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
| 400 | Invalid request | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 401 | Unauthorized | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 403 | Forbidden Request | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 429 | Too Many Requests | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| 503 | Internal server Error | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |
| Default | Forbidden | [`ETXRespondingErrorException`](../../doc/models/etx-responding-error-exception.md) |

