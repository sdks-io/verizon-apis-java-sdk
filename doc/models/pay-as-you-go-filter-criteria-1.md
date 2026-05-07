
# Pay as You Go Filter Criteria 1

## Structure

`PayAsYouGoFilterCriteria1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CarrierServicePlanCode` | `String` | Optional | - | String getCarrierServicePlanCode() | setCarrierServicePlanCode(String carrierServicePlanCode) |
| `AccountNameList` | `List<String>` | Optional | An array of account names | List<String> getAccountNameList() | setAccountNameList(List<String> accountNameList) |

## Example (as JSON)

```json
{
  "carrierServicePlanCode": "Service plan code value",
  "accountNameList": [
    "accountNameList1",
    "accountNameList2"
  ]
}
```

