
# Generate Response Item

## Structure

`GenerateResponseItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Imei` | `String` | Optional | - | String getImei() | setImei(String imei) |
| `Credential` | [`GenerateResponseItemCredential`](../../doc/models/generate-response-item-credential.md) | Optional | - | GenerateResponseItemCredential getCredential() | setCredential(GenerateResponseItemCredential credential) |

## Example (as JSON)

```json
{
  "imei": "100096454851324",
  "credential": {
    "username": "username6",
    "password": "password0"
  }
}
```

