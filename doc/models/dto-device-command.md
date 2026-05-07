
# Dto Device Command

## Structure

`DtoDeviceCommand`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | The numeric account name, which must include leading zeros | String getAccountName() | setAccountName(String accountName) |
| `Configuration` | [`Rbstiltconfig`](../../doc/models/rbstiltconfig.md) | Optional | - | Rbstiltconfig getConfiguration() | setConfiguration(Rbstiltconfig configuration) |
| `Resourceidentifier` | [`DtoResourceidentifier`](../../doc/models/dto-resourceidentifier.md) | Optional | - | DtoResourceidentifier getResourceidentifier() | setResourceidentifier(DtoResourceidentifier resourceidentifier) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "configuration": {
    "RbsHighPrecisionTiltConfig": {
      "mode": "reportOnChange",
      "periodic-reporting": {
        "unit": "minutes",
        "hours": 250,
        "minutes": 232
      },
      "hold-time": 62,
      "angle-away": 90,
      "angle-toward": 30
    }
  },
  "resourceidentifier": {
    "id": "id4"
  }
}
```

