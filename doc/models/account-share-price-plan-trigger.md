
# Account Share Price Plan Trigger

## Structure

`AccountSharePricePlanTrigger`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountShare` | [`AccountShareFilterCriteria`](../../doc/models/account-share-filter-criteria.md) | Optional | - | AccountShareFilterCriteria getAccountShare() | setAccountShare(AccountShareFilterCriteria accountShare) |
| `Condition` | [`AccountSharePricePlanTriggerCondition`](../../doc/models/containers/account-share-price-plan-trigger-condition.md) | Optional | This is a container for any-of cases. | AccountSharePricePlanTriggerCondition getCondition() | setCondition(AccountSharePricePlanTriggerCondition condition) |
| `ChangePlan` | `Boolean` | Optional | a flag to set if the trigger changes service plans, true, or not, false | Boolean getChangePlan() | setChangePlan(Boolean changePlan) |
| `ChangePlanDetails` | [`ChangePlanDetails`](../../doc/models/change-plan-details.md) | Optional | The service plan code to switch to | ChangePlanDetails getChangePlanDetails() | setChangePlanDetails(ChangePlanDetails changePlanDetails) |

## Example (as JSON)

```json
{
  "changePlan": true,
  "accountShare": {
    "filterCriteria": {
      "carrierServicePlanCode": "carrierServicePlanCode4",
      "accountNameList": [
        "accountNameList7",
        "accountNameList8"
      ]
    }
  },
  "condition": "UsageAllowance",
  "changePlanDetails": {
    "toCarrierServicePlanCode": "toCarrierServicePlanCode2"
  }
}
```

