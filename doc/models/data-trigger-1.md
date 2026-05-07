
# Data Trigger 1

## Structure

`DataTrigger1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FilterCriteria` | [`AccountLevelFilter`](../../doc/models/account-level-filter.md) | Optional | - | AccountLevelFilter getFilterCriteria() | setFilterCriteria(AccountLevelFilter filterCriteria) |
| `Condition` | [`DataTrigger1Condition`](../../doc/models/containers/data-trigger-1-condition.md) | Optional | This is a container for any-of cases. | DataTrigger1Condition getCondition() | setCondition(DataTrigger1Condition condition) |
| `Action` | [`AccountLevelActionEnum`](../../doc/models/account-level-action-enum.md) | Optional | The action taken when trigger conditions are met | AccountLevelActionEnum getAction() | setAction(AccountLevelActionEnum action) |
| `ConditionType` | [`ConditionTypeEnum`](../../doc/models/condition-type-enum.md) | Optional | The condition type being monitored | ConditionTypeEnum getConditionType() | setConditionType(ConditionTypeEnum conditionType) |
| `Comparitor` | [`ComparitorEnum`](../../doc/models/comparitor-enum.md) | Optional | The boolean of the comparison. `gt` is Greater Than, `lt` is Less Than and `eq` is Equal To | ComparitorEnum getComparitor() | setComparitor(ComparitorEnum comparitor) |
| `Threshold` | `Integer` | Optional | The threshold value the trigger monitors for | Integer getThreshold() | setThreshold(Integer threshold) |
| `ThresholdUnit` | [`ThresholdUnitEnum`](../../doc/models/threshold-unit-enum.md) | Optional | The units of the threshold. This can be KB, Kilobits, MB, Megabits, or GB, Gigabits | ThresholdUnitEnum getThresholdUnit() | setThresholdUnit(ThresholdUnitEnum thresholdUnit) |
| `CycleType` | [`RulesCycleTypeEnum`](../../doc/models/rules-cycle-type-enum.md) | Optional | The interval to monitor for the threshold. This can be Daily, Weekly or Monthly | RulesCycleTypeEnum getCycleType() | setCycleType(RulesCycleTypeEnum cycleType) |
| `AllowanceThreshold` | [`AllowanceThreshold`](../../doc/models/allowance-threshold.md) | Optional | - | AllowanceThreshold getAllowanceThreshold() | setAllowanceThreshold(AllowanceThreshold allowanceThreshold) |

## Example (as JSON)

```json
{
  "action": "notify",
  "conditionType": "Aging",
  "comparitor": "gt",
  "threshold": 100,
  "thresholdUnit": "KB",
  "cycleType": "Daily",
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
  "condition": "Aging"
}
```

