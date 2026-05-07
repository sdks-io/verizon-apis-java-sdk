
# Carriercode 1

## Structure

`Carriercode1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CarrierCode` | `String` | Optional | - | String getCarrierCode() | setCarrierCode(String carrierCode) |
| `Percentage` | [`AllowanceThreshold`](../../doc/models/allowance-threshold.md) | Optional | - | AllowanceThreshold getPercentage() | setPercentage(AllowanceThreshold percentage) |

## Example (as JSON)

```json
{
  "carrierCode": "Carrier identifier code 1",
  "percentage": {
    "percentage50": false,
    "percentage75": false,
    "percentage90": false,
    "percentage100": false
  }
}
```

