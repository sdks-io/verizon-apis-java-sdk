
# Data Trigger 4

## Structure

`DataTrigger4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountLevel` | [`AccountLevelObject`](../../doc/models/account-level-object.md) | Optional | - | AccountLevelObject getAccountLevel() | setAccountLevel(AccountLevelObject accountLevel) |
| `DeviceGroup` | [`DeviceGroupFilterCriteria`](../../doc/models/device-group-filter-criteria.md) | Optional | - | DeviceGroupFilterCriteria getDeviceGroup() | setDeviceGroup(DeviceGroupFilterCriteria deviceGroup) |
| `ConditionType` | [`ConditionTypeEnum`](../../doc/models/condition-type-enum.md) | Optional | The condition type being monitored | ConditionTypeEnum getConditionType() | setConditionType(ConditionTypeEnum conditionType) |
| `Comparitor` | [`ComparitorEnum`](../../doc/models/comparitor-enum.md) | Optional | The boolean of the comparison. `gt` is Greater Than, `lt` is Less Than and `eq` is Equal To | ComparitorEnum getComparitor() | setComparitor(ComparitorEnum comparitor) |
| `Threshold` | `Integer` | Optional | The threshold value the trigger monitors for | Integer getThreshold() | setThreshold(Integer threshold) |
| `ThresholdUnit` | [`ThresholdUnitEnum`](../../doc/models/threshold-unit-enum.md) | Optional | The units of the threshold. This can be KB, Kilobits, MB, Megabits, or GB, Gigabits | ThresholdUnitEnum getThresholdUnit() | setThresholdUnit(ThresholdUnitEnum thresholdUnit) |
| `CycleType` | [`RulesCycleTypeEnum`](../../doc/models/rules-cycle-type-enum.md) | Optional | The interval to monitor for the threshold. This can be Daily, Weekly or Monthly | RulesCycleTypeEnum getCycleType() | setCycleType(RulesCycleTypeEnum cycleType) |
| `AllowanceThreshold` | [`AllowanceThreshold`](../../doc/models/allowance-threshold.md) | Optional | - | AllowanceThreshold getAllowanceThreshold() | setAllowanceThreshold(AllowanceThreshold allowanceThreshold) |
| `Action` | [`Actionobject`](../../doc/models/actionobject.md) | Optional | - | Actionobject getAction() | setAction(Actionobject action) |

## Example (as JSON)

```json
{
  "conditionType": "Aging",
  "comparitor": "gt",
  "threshold": 100,
  "thresholdUnit": "KB",
  "cycleType": "Daily",
  "accountLevel": {
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
    "condition": "Individual",
    "action": "suspend"
  },
  "deviceGroup": {
    "filterCriteria": {
      "deviceGroupName": "deviceGroupName4",
      "IndividualOrCombined": "IndividualOrCombined4",
      "accountName": "accountName0"
    }
  }
}
```

