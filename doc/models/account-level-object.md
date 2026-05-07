
# Account Level Object

## Structure

`AccountLevelObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FilterCriteria` | [`AccountLevelFilter`](../../doc/models/account-level-filter.md) | Optional | - | AccountLevelFilter getFilterCriteria() | setFilterCriteria(AccountLevelFilter filterCriteria) |
| `Condition` | [`AccountLevelObjectCondition`](../../doc/models/containers/account-level-object-condition.md) | Optional | This is a container for any-of cases. | AccountLevelObjectCondition getCondition() | setCondition(AccountLevelObjectCondition condition) |
| `Action` | [`AccountLevelActionEnum`](../../doc/models/account-level-action-enum.md) | Optional | The action taken when trigger conditions are met | AccountLevelActionEnum getAction() | setAction(AccountLevelActionEnum action) |

## Example (as JSON)

```json
{
  "action": "notify",
  "filterCriteria": {
    "separateOrCombined": "separateOrCombined4",
    "accountNames": {
      "accountNameList": [
        "accountNameList7",
        "accountNameList8",
        "accountNameList9"
      ]
    }
  },
  "condition": "UsageAllowance"
}
```

