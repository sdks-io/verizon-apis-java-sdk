
# OAuth 2 Client Credentials Grant



Documentation for accessing and setting credentials for oAuth2.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| OAuthClientId | `String` | OAuth 2 Client ID | `oauthClientId` | `getOauthClientId()` |
| OAuthClientSecret | `String` | OAuth 2 Client Secret | `oauthClientSecret` | `getOauthClientSecret()` |
| OAuthToken | `OauthToken` | Object for storing information about the OAuth token | `oauthToken` | `getOauthToken()` |
| OAuthScopes | `List<OauthScopeEnum>` | List of scopes that apply to the OAuth token | `oauthScopes` | `getOauthScopes()` |
| OAuthTokenProvider | `BiFunction<OAuthToken, ClientCredentialsAuth, OAuthToken>` | Registers a callback for oAuth Token Provider used for automatic token fetching/refreshing. | `oauthTokenProvider` | `getOauthTokenProvider()` |
| OAuthOnTokenUpdate | `Consumer<OAuthToken>` | Registers a callback for token update event. | `oauthOnTokenUpdate` | `getOauthOnTokenUpdate()` |



**Note:** Auth credentials can be set using `clientCredentialsAuth` in the client builder and accessed through `getClientCredentialsAuth` method in the client instance.

## Usage Example

### Client Initialization

You must initialize the client with *OAuth 2.0 Client Credentials Grant* credentials as shown in the following code snippet. This will fetch the OAuth token automatically when any of the endpoints, requiring *OAuth 2.0 Client Credentials Grant* autentication, are called.

```java
VerizonClient client = new VerizonClient.Builder()
    .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .oauthScopes(Arrays.asList(
                OauthScopeEnum.DISCOVERYREAD,
                OauthScopeEnum.SERVICEPROFILEREAD
            ))
        .build())
    .build();
```



Your application can also manually provide an OAuthToken using the setter `oauthToken` in `ClientCredentialsAuthModel` object. This function takes in an instance of OAuthToken containing information for authorizing client requests and refreshing the token itself.

You must have initialized the client with scopes for which you need permission to access.

### Scopes

Scopes enable your application to only request access to the resources it needs while enabling users to control the amount of access they grant to your application. Available scopes are defined in the [`OauthScopeEnum`](../../doc/models/oauth-scope-enum.md) enumeration.

| Scope Name | Description |
|  --- | --- |
| `DISCOVERYREAD` | Grant read-only access to discovery data |
| `SERVICEPROFILEREAD` | Grant read-only access to service profile data |
| `SERVICEPROFILEWRITE` | Grant write access to service profile data |
| `SERVICEREGISTRYREAD` | Grant read-only access to Service registry data |
| `SERVICEREGISTRYWRITE` | Grant write access to Service registry data |
| `TS_MEC_FULLACCESS` | Full access for /serviceprofiles and /serviceendpoints. |
| `TS_MEC_LIMITACCESS` | Limited access. Will not allow use of /serviceprofiles and /serviceendpoints but will allow discovery. |
| `TS_APPLICATION_RO` |  |
| `READ` | read access |
| `WRITE` | read/write access |

### Adding OAuth Token Update Callback

Whenever the OAuth Token gets updated, the provided callback implementation will be executed. For instance, you may use it store your access token whenever it gets updated.

```java
VerizonClient client = new VerizonClient.Builder()
    .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .oauthScopes(Arrays.asList(
                OauthScopeEnum.DISCOVERYREAD,
                OauthScopeEnum.SERVICEPROFILEREAD
            ))
        .oauthOnTokenUpdate(oAuthToken -> {
                // Add the callback handler to perform operations like save to DB or file etc.
                // It will be triggered whenever the token gets updated
                System.out.println(oAuthToken);
        })
        .build())
    .build();
```

### Adding Custom OAuth Token Provider

To authorize a client from a stored access token, set up the `oauthTokenProvider` in `ClientCredentialsAuthModel` builder along with the other auth parameters before creating the client:

```java
VerizonClient client = new VerizonClient.Builder()
    .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .oauthScopes(Arrays.asList(
                OauthScopeEnum.DISCOVERYREAD,
                OauthScopeEnum.SERVICEPROFILEREAD
            ))
        .oauthTokenProvider((lastOAuthToken, credentialsManager) -> {
                // Add the callback handler to provide a new OAuth token
                // It will be triggered whenever the lastOAuthToken is undefined or expired
                return lastOAuthToken.toBuilder()
                        .expiry(lastOAuthToken.getExpiry() + 60)
                        .build();
        })
        .build())
    .build();
```


