
# Account Group Share

## Structure

`AccountGroupShare`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountGroupShareIndividual` | [`AccountGroupShareIndividual`](../../doc/models/account-group-share-individual.md) | Optional | - | AccountGroupShareIndividual getAccountGroupShareIndividual() | setAccountGroupShareIndividual(AccountGroupShareIndividual accountGroupShareIndividual) |

## Example (as JSON)

```json
{
  "accountGroupShareIndividual": {
    "filterCriteria": {
      "ratePlanGroupId": 202
    },
    "condition": {
      "action": "action6"
    },
    "action": {
      "changePlan": {
        "triggerDate": "triggerDate6",
        "sharePlan": [
          {
            "fromCarrierCode": "fromCarrierCode6",
            "toCarrierCode": "toCarrierCode8",
            "criteriaPercentage": 170
          },
          {
            "fromCarrierCode": "fromCarrierCode6",
            "toCarrierCode": "toCarrierCode8",
            "criteriaPercentage": 170
          },
          {
            "fromCarrierCode": "fromCarrierCode6",
            "toCarrierCode": "toCarrierCode8",
            "criteriaPercentage": 170
          }
        ]
      }
    }
  }
}
```

