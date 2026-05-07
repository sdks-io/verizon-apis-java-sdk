
# Rateplantype 2

## Structure

`Rateplantype2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `SizeKb` | `String` | Optional | - | String getSizeKb() | setSizeKb(String sizeKb) |
| `CarrierRatePlanCode` | `String` | Optional | - | String getCarrierRatePlanCode() | setCarrierRatePlanCode(String carrierRatePlanCode) |
| `ZeroDollarBilling` | `Boolean` | Optional | - | Boolean getZeroDollarBilling() | setZeroDollarBilling(Boolean zeroDollarBilling) |
| `PromotionOffered` | `Boolean` | Optional | - | Boolean getPromotionOffered() | setPromotionOffered(Boolean promotionOffered) |
| `PromotionDays` | `Integer` | Optional | - | Integer getPromotionDays() | setPromotionDays(Integer promotionDays) |
| `RatePlanType` | `String` | Optional | - | String getRatePlanType() | setRatePlanType(String ratePlanType) |
| `Account` | [`List<Accountid>`](../../doc/models/accountid.md) | Optional | Account information | List<Accountid> getAccount() | setAccount(List<Accountid> account) |

## Example (as JSON)

```json
{
  "description": "PlanDescription 2",
  "sizeKb": "1048576",
  "carrierRatePlanCode": "Service plan code value",
  "zeroDollarBilling": false,
  "promotionOffered": false,
  "promotionDays": -2147483648
}
```

