
# Actionobject

## Structure

`Actionobject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Suspend` | `Boolean` | Optional | - | Boolean getSuspend() | setSuspend(Boolean suspend) |
| `SuspendDetails` | [`Suspenddetailsobject`](../../doc/models/suspenddetailsobject.md) | Optional | - | Suspenddetailsobject getSuspendDetails() | setSuspendDetails(Suspenddetailsobject suspendDetails) |
| `ChangePlan` | `Boolean` | Optional | a flag to set if the trigger changes service plans, true, or not, false | Boolean getChangePlan() | setChangePlan(Boolean changePlan) |
| `ChangePlanDetails` | [`ChangePlanDetails`](../../doc/models/change-plan-details.md) | Optional | The service plan code to switch to | ChangePlanDetails getChangePlanDetails() | setChangePlanDetails(ChangePlanDetails changePlanDetails) |

## Example (as JSON)

```json
{
  "suspend": true,
  "changePlan": true,
  "suspendDetails": {
    "suspendFromAccounts": [
      "suspendFromAccounts7"
    ],
    "suspendDuration": 152,
    "suspendOption": "suspendOption2",
    "threshold": 166,
    "thresholdUnit": "GB"
  },
  "changePlanDetails": {
    "toCarrierServicePlanCode": "toCarrierServicePlanCode2"
  }
}
```

