
# Rateplantype Object

## Structure

`RateplantypeObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RatePlanGroupDescription` | `String` | Optional | - | String getRatePlanGroupDescription() | setRatePlanGroupDescription(String ratePlanGroupDescription) |
| `RatePlanType` | `String` | Optional | - | String getRatePlanType() | setRatePlanType(String ratePlanType) |
| `RatePlan` | [`List<Rateplantype2>`](../../doc/models/rateplantype-2.md) | Optional | An array of rateplan names | List<Rateplantype2> getRatePlan() | setRatePlan(List<Rateplantype2> ratePlan) |

## Example (as JSON)

```json
{
  "ratePlanGroupDescription": "AGS Description_73",
  "ratePlanType": "ratePlanType2",
  "ratePlan": [
    {
      "description": "description2",
      "sizeKb": "sizeKb2",
      "carrierRatePlanCode": "carrierRatePlanCode8",
      "zeroDollarBilling": false,
      "promotionOffered": false
    },
    {
      "description": "description2",
      "sizeKb": "sizeKb2",
      "carrierRatePlanCode": "carrierRatePlanCode8",
      "zeroDollarBilling": false,
      "promotionOffered": false
    }
  ]
}
```

