
# Price Plan Trigger

## Structure

`PricePlanTrigger`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StandAlone` | [`FiltercriteriaObjectCall`](../../doc/models/filtercriteria-object-call.md) | Optional | - | FiltercriteriaObjectCall getStandAlone() | setStandAlone(FiltercriteriaObjectCall standAlone) |
| `Condition` | [`PricePlanTriggerCondition`](../../doc/models/containers/price-plan-trigger-condition.md) | Optional | This is a container for any-of cases. | PricePlanTriggerCondition getCondition() | setCondition(PricePlanTriggerCondition condition) |
| `Action` | [`Actionobject`](../../doc/models/actionobject.md) | Optional | - | Actionobject getAction() | setAction(Actionobject action) |

## Example (as JSON)

```json
{
  "standAlone": {
    "filterCriteria": {
      "carrierServicePlanCode": "carrierServicePlanCode4",
      "accountNameList": [
        "accountNameList7",
        "accountNameList8"
      ]
    }
  },
  "condition": "Individual",
  "action": {
    "suspend": false,
    "suspendDetails": {
      "suspendFromAccounts": [
        "suspendFromAccounts7"
      ],
      "suspendDuration": 152,
      "suspendOption": "suspendOption2",
      "threshold": 166,
      "thresholdUnit": "GB"
    },
    "changePlan": false,
    "changePlanDetails": {
      "toCarrierServicePlanCode": "toCarrierServicePlanCode2"
    }
  }
}
```

