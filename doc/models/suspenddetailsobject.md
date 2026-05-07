
# Suspenddetailsobject

## Structure

`Suspenddetailsobject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SuspendFromAccounts` | `List<String>` | Optional | - | List<String> getSuspendFromAccounts() | setSuspendFromAccounts(List<String> suspendFromAccounts) |
| `SuspendDuration` | `Integer` | Optional | - | Integer getSuspendDuration() | setSuspendDuration(Integer suspendDuration) |
| `SuspendOption` | `String` | Optional | - | String getSuspendOption() | setSuspendOption(String suspendOption) |
| `Threshold` | `Integer` | Optional | The threshold value the trigger monitors for | Integer getThreshold() | setThreshold(Integer threshold) |
| `ThresholdUnit` | [`ThresholdUnitEnum`](../../doc/models/threshold-unit-enum.md) | Optional | The units of the threshold. This can be KB, Kilobits, MB, Megabits, or GB, Gigabits | ThresholdUnitEnum getThresholdUnit() | setThresholdUnit(ThresholdUnitEnum thresholdUnit) |

## Example (as JSON)

```json
{
  "suspendDuration": 90,
  "suspendOption": "withBilling",
  "threshold": 100,
  "thresholdUnit": "KB",
  "suspendFromAccounts": [
    "suspendFromAccounts7",
    "suspendFromAccounts8",
    "suspendFromAccounts9"
  ]
}
```

