
# Account Group Share Object

## Structure

`AccountGroupShareObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountGroupShare` | [`AccountGroupShareIndividual1`](../../doc/models/account-group-share-individual-1.md) | Optional | - | AccountGroupShareIndividual1 getAccountGroupShare() | setAccountGroupShare(AccountGroupShareIndividual1 accountGroupShare) |

## Example (as JSON)

```json
{
  "accountGroupShare": {
    "accountGroupShareIndividual": {
      "filterCriteria": {
        "ratePlanGroupId": 202
      },
      "condition": {
        "action": "notify"
      },
      "action": {
        "notify": {
          "alertType": "alertType8",
          "threshold": [
            {
              "carrierCode": "carrierCode4",
              "percentage": {
                "percentage50": false,
                "percentage75": false,
                "percentage90": false,
                "percentage100": false
              }
            },
            {
              "carrierCode": "carrierCode4",
              "percentage": {
                "percentage50": false,
                "percentage75": false,
                "percentage90": false,
                "percentage100": false
              }
            },
            {
              "carrierCode": "carrierCode4",
              "percentage": {
                "percentage50": false,
                "percentage75": false,
                "percentage90": false,
                "percentage100": false
              }
            }
          ]
        }
      }
    }
  }
}
```

