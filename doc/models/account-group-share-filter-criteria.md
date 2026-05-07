
# Account Group Share Filter Criteria

## Structure

`AccountGroupShareFilterCriteria`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FilterCriteria` | [`AccountGroupShareFilter`](../../doc/models/account-group-share-filter.md) | Optional | - | AccountGroupShareFilter getFilterCriteria() | setFilterCriteria(AccountGroupShareFilter filterCriteria) |
| `Condition` | [`AccountGroupShareCondition`](../../doc/models/account-group-share-condition.md) | Optional | - | AccountGroupShareCondition getCondition() | setCondition(AccountGroupShareCondition condition) |
| `Action` | [`AccountGroupShareAction`](../../doc/models/account-group-share-action.md) | Optional | - | AccountGroupShareAction getAction() | setAction(AccountGroupShareAction action) |

## Example (as JSON)

```json
{
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
```

