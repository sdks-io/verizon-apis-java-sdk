
# Oauth Provider Exception

OAuth 2 Authorization endpoint exception.

## Structure

`OauthProviderException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Error` | [`OauthProviderErrorEnum`](../../doc/models/oauth-provider-error-enum.md) | Required | Gets or sets error code. | OauthProviderErrorEnum getError() | setError(OauthProviderErrorEnum error) |
| `ErrorDescrIpTion` | `String` | Optional | Gets or sets human-readable text providing additional information on error.<br>Used to assist the client developer in understanding the error that occurred. | String getErrorDescrIpTion() | setErrorDescrIpTion(String errorDescrIpTion) |
| `ErrorUri` | `String` | Optional | Gets or sets a URI identifying a human-readable web page with information about the error, used to provide the client developer with additional information about the error. | String getErrorUri() | setErrorUri(String errorUri) |

## Example (as JSON)

```json
{
  "error": "unsupported_grant_type",
  "error_description": "error_description8",
  "error_uri": "error_uri8"
}
```

