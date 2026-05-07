
# Dto Configuration Profile Delete

## Structure

`DtoConfigurationProfileDelete`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | The numeric account name, which must include leading zeros | String getAccountName() | setAccountName(String accountName) |
| `Resourceidentifier` | [`DtoResourceidentifier`](../../doc/models/dto-resourceidentifier.md) | Optional | - | DtoResourceidentifier getResourceidentifier() | setResourceidentifier(DtoResourceidentifier resourceidentifier) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "resourceidentifier": {
    "id": "id4"
  }
}
```

