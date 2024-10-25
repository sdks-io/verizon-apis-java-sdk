# PWN

```java
PWNController pWNController = client.getPWNController();
```

## Class Name

`PWNController`

## Methods

* [KPI List](../../doc/controllers/pwn.md#kpi-list)
* [Get Profile List](../../doc/controllers/pwn.md#get-profile-list)
* [Change PWN Device State-Activate](../../doc/controllers/pwn.md#change-pwn-device-state-activate)
* [Change PWN Device State-Deactivate](../../doc/controllers/pwn.md#change-pwn-device-state-deactivate)
* [Change PWN Device Profile](../../doc/controllers/pwn.md#change-pwn-device-profile)
* [Change PWN Device IPaddress](../../doc/controllers/pwn.md#change-pwn-device-ipaddress)
* [Get PWN Performance Consent](../../doc/controllers/pwn.md#get-pwn-performance-consent)


# KPI List

```java
CompletableFuture<ApiResponse<KPIInfoList>> kPIListAsync(
    final String aname)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `aname` | `String` | Template, Required | Account name. |

## Server

`Server.THINGSPACE`

## Response Type

[`KPIInfoList`](../../doc/models/kpi-info-list.md)

## Example Usage

```java
String aname = "0342351414-00001";

pWNController.kPIListAsync(aname).thenAccept(result -> {
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
  "KpiInfoList": [
    {
      "name": "DOWNLINK_THROUGHPUT",
      "value": "23.2",
      "nodeName": "132924_ENB_VZ_EULESS_OLTE_RD-01",
      "nodeType": "BASEBAND",
      "description": "Downlink throughput (4G)",
      "unit": "Mbps",
      "category": "Network Performance Radio",
      "timeOfLastUpdate": "2022-12-07T08:39:59.228Z"
    }
  ]
}
```


# Get Profile List

```java
CompletableFuture<ApiResponse<PWNProfileList>> getProfileListAsync(
    final String aname)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `aname` | `String` | Template, Required | Account name. |

## Server

`Server.THINGSPACE`

## Response Type

[`PWNProfileList`](../../doc/models/pwn-profile-list.md)

## Example Usage

```java
String aname = "0342351414-00001";

pWNController.getProfileListAsync(aname).thenAccept(result -> {
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
  "profiles": [
    {
      "profileId": "HSS-EsmProfile_Enterprise",
      "profileName": "HSS EsmProfile Enterprise"
    }
  ]
}
```


# Change PWN Device State-Activate

```java
CompletableFuture<ApiResponse<ChangePWNDeviceStateResponse>> changePWNDeviceStateActivateAsync(
    final ChangePWNDeviceStateActivateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ChangePWNDeviceStateActivateRequest`](../../doc/models/change-pwn-device-state-activate-request.md) | Body, Required | - |

## Server

`Server.THINGSPACE`

## Response Type

[`ChangePWNDeviceStateResponse`](../../doc/models/change-pwn-device-state-response.md)

## Example Usage

```java
ChangePWNDeviceStateActivateRequest body = new ChangePWNDeviceStateActivateRequest.Builder(
    "0342351414-00001",
    Arrays.asList(
        new PWNDeviceList.Builder(
            Arrays.asList(
                new PWNDeviceId.Builder(
                    "99948099913024600001",
                    "iccid"
                )
                .build()
            )
        )
        .build()
    ),
    new Activate.Builder(
        "HSS EsmProfile Enterprise 5G"
    )
    .build()
)
.build();

pWNController.changePWNDeviceStateActivateAsync(body).thenAccept(result -> {
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
  "requestId": "c7b45cf2-cab1-4e42-82f8-20350f4c4ea3"
}
```


# Change PWN Device State-Deactivate

```java
CompletableFuture<ApiResponse<ChangePWNDeviceStateResponse>> changePWNDeviceStateDeactivateAsync(
    final ChangePWNDeviceStateDeactivateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ChangePWNDeviceStateDeactivateRequest`](../../doc/models/change-pwn-device-state-deactivate-request.md) | Body, Required | - |

## Server

`Server.THINGSPACE`

## Response Type

[`ChangePWNDeviceStateResponse`](../../doc/models/change-pwn-device-state-response.md)

## Example Usage

```java
ChangePWNDeviceStateDeactivateRequest body = new ChangePWNDeviceStateDeactivateRequest.Builder(
    "0342351414-00001",
    Arrays.asList(
        new PWNDeviceList.Builder(
            Arrays.asList(
                new PWNDeviceId.Builder(
                    "99948099913031600000",
                    "iccid"
                )
                .build()
            )
        )
        .build(),
        new PWNDeviceList.Builder(
            Arrays.asList(
                new PWNDeviceId.Builder(
                    "99948099913031700000",
                    "iccid"
                )
                .build()
            )
        )
        .build()
    )
)
.build();

pWNController.changePWNDeviceStateDeactivateAsync(body).thenAccept(result -> {
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
  "requestId": "c7b45cf2-cab1-4e42-82f8-20350f4c4ea3"
}
```


# Change PWN Device Profile

```java
CompletableFuture<ApiResponse<ChangePWNDeviceProfileResponse>> changePWNDeviceProfileAsync(
    final ChangePWNDeviceProfileRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ChangePWNDeviceProfileRequest`](../../doc/models/change-pwn-device-profile-request.md) | Body, Required | - |

## Server

`Server.THINGSPACE`

## Response Type

[`ChangePWNDeviceProfileResponse`](../../doc/models/change-pwn-device-profile-response.md)

## Example Usage

```java
ChangePWNDeviceProfileRequest body = new ChangePWNDeviceProfileRequest.Builder(
    "0342351414-00001",
    Arrays.asList(
        new PWNDeviceList.Builder(
            Arrays.asList(
                new PWNDeviceId.Builder(
                    "99948099913024600000",
                    "iccid"
                )
                .build()
            )
        )
        .build()
    ),
    "HSS EsmProfile Enterprise 5G internet"
)
.build();

pWNController.changePWNDeviceProfileAsync(body).thenAccept(result -> {
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
  "requestId": "c7b45cf2-cab1-4e42-82f8-20350f4c4ea3"
}
```


# Change PWN Device IPaddress

```java
CompletableFuture<ApiResponse<ChangePWNDeviceIpaddressResponse>> changePWNDeviceIpaddressAsync(
    final ChangePWNDeviceIpaddressRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ChangePWNDeviceIpaddressRequest`](../../doc/models/change-pwn-device-ipaddress-request.md) | Body, Required | - |

## Server

`Server.THINGSPACE`

## Response Type

[`ChangePWNDeviceIpaddressResponse`](../../doc/models/change-pwn-device-ipaddress-response.md)

## Example Usage

```java
ChangePWNDeviceIpaddressRequest body = new ChangePWNDeviceIpaddressRequest.Builder(
    "0342351414-00001",
    Arrays.asList(
        new DeviceListIP.Builder(
            Arrays.asList(
                new PWNDeviceId.Builder(
                    "99948099913024600000",
                    "iccid"
                )
                .build()
            ),
            "10.3.4.5"
        )
        .build(),
        new DeviceListIP.Builder(
            Arrays.asList(
                new PWNDeviceId.Builder(
                    "999480500019111000001",
                    "iccid"
                )
                .build()
            ),
            "10.4.5.7"
        )
        .build()
    )
)
.build();

pWNController.changePWNDeviceIpaddressAsync(body).thenAccept(result -> {
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
  "requestId": "c7b45cf2-cab1-4e42-82f8-20350f4c4ea3"
}
```


# Get PWN Performance Consent

```java
CompletableFuture<ApiResponse<GetPWNPerformanceConsentResponse>> getPWNPerformanceConsentAsync(
    final String aname)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `aname` | `String` | Template, Required | Account name. |

## Server

`Server.THINGSPACE`

## Response Type

[`GetPWNPerformanceConsentResponse`](../../doc/models/get-pwn-performance-consent-response.md)

## Example Usage

```java
String aname = "1533445500-00088";

pWNController.getPWNPerformanceConsentAsync(aname).thenAccept(result -> {
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
  "consent": "false"
}
```

