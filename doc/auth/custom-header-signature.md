
# Custom Header Signature



Documentation for accessing and setting credentials for vz-m2m-session_token.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| VZ-M2M-Token | `String` | The VZ-M2M session token from [Getting Started](/content/thingspace-portal/documentation/apis/connectivity-management/get-started.html) | `vZM2MToken` | `getVZM2MToken()` |



**Note:** Auth credentials can be set using `vzM2mSessionTokenCredentials` in the client builder and accessed through `getVzM2mSessionTokenCredentials` method in the client instance.

## Usage Example

### Client Initialization

You must provide credentials in the client as shown in the following code snippet.

```java
VerizonThingSpaceQualityOfServiceAPIEndpointsClient client = new VerizonThingSpaceQualityOfServiceAPIEndpointsClient.Builder()
    .vzM2mSessionTokenCredentials(new VzM2mSessionTokenModel.Builder(
            "VZ-M2M-Token"
        )
        .build())
    .build();
```


