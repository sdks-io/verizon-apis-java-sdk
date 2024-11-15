
# Generate External ID Request

Authenticating account ID.

## Structure

`GenerateExternalIDRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Accountidentifier` | [`AccountIdentifier`](../../doc/models/account-identifier.md) | Optional | The ID of the authenticating billing account, in the format `{"billingaccountid":"1234567890-12345"}`. | AccountIdentifier getAccountidentifier() | setAccountidentifier(AccountIdentifier accountidentifier) |

## Example (as JSON)

```json
{
  "accountidentifier": {
    "billingaccountid": "0000000000-00001"
  }
}
```

