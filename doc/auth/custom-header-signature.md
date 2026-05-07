
# Custom Header Signature



Documentation for accessing and setting credentials for VZ-M2M-Token.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| VZ-M2M-Token | `String` | M2M Session Token ([How to generate an M2M session token?](../../doc/controllers/session-management.md#start-connectivity-management-session)) | `vZM2mToken` | `getVZM2mToken()` |



**Note:** Auth credentials can be set using `vZM2mTokenCredentials` in the client builder and accessed through `getVZM2mTokenCredentials` method in the client instance.

## Usage Example

### Client Initialization

You must provide credentials in the client as shown in the following code snippet.

```java
import com.verizon.thingspace.VerizonClient;
import com.verizon.thingspace.authentication.VZM2mTokenModel;

public class Program {
    public static void main(String[] args) {
        VerizonClient client = new VerizonClient.Builder()
            .vZM2mTokenCredentials(new VZM2mTokenModel.Builder(
                    "VZ-M2M-Token"
                )
                .build())
            .build();
    }
}
```


