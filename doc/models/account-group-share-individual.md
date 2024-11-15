
# Account Group Share Individual

## Structure

`AccountGroupShareIndividual`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FilterCriteria` | [`FilterCriteriaAccountGroupShare`](../../doc/models/filter-criteria-account-group-share.md) | Optional | - | FilterCriteriaAccountGroupShare getFilterCriteria() | setFilterCriteria(FilterCriteriaAccountGroupShare filterCriteria) |
| `Condition` | [`ConditionAccountGroupShare`](../../doc/models/condition-account-group-share.md) | Optional | - | ConditionAccountGroupShare getCondition() | setCondition(ConditionAccountGroupShare condition) |
| `Action` | [`ActionAccountGroupShare`](../../doc/models/action-account-group-share.md) | Optional | - | ActionAccountGroupShare getAction() | setAction(ActionAccountGroupShare action) |

## Example (as JSON)

```json
{
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
```

