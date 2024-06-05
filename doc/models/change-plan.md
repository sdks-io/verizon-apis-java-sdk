
# Change Plan

## Structure

`ChangePlan`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TriggerDate` | `String` | Optional | - | String getTriggerDate() | setTriggerDate(String triggerDate) |
| `SharePlan` | [`List<SharePlan>`](../../doc/models/share-plan.md) | Optional | - | List<SharePlan> getSharePlan() | setSharePlan(List<SharePlan> sharePlan) |

## Example (as JSON)

```json
{
  "triggerDate": "triggerDate4",
  "sharePlan": [
    {
      "fromCarrierCode": "fromCarrierCode6",
      "toCarrierCode": "toCarrierCode8",
      "criteriaPercentage": 170
    }
  ]
}
```

