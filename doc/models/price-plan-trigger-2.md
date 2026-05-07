
# Price Plan Trigger 2

## Structure

`PricePlanTrigger2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountShare` | [`AccountShareFilterCriteria`](../../doc/models/account-share-filter-criteria.md) | Optional | - | AccountShareFilterCriteria getAccountShare() | setAccountShare(AccountShareFilterCriteria accountShare) |
| `Condition` | [`PricePlanTrigger2Condition`](../../doc/models/containers/price-plan-trigger-2-condition.md) | Optional | This is a container for any-of cases. | PricePlanTrigger2Condition getCondition() | setCondition(PricePlanTrigger2Condition condition) |
| `ChangePlan` | `Boolean` | Optional | a flag to set if the trigger changes service plans, true, or not, false | Boolean getChangePlan() | setChangePlan(Boolean changePlan) |
| `ChangePlanDetails` | [`ChangePlanDetails`](../../doc/models/change-plan-details.md) | Optional | The service plan code to switch to | ChangePlanDetails getChangePlanDetails() | setChangePlanDetails(ChangePlanDetails changePlanDetails) |
| `PayAsYouGo` | [`PayAsYouGoFilterCriteria`](../../doc/models/pay-as-you-go-filter-criteria.md) | Optional | - | PayAsYouGoFilterCriteria getPayAsYouGo() | setPayAsYouGo(PayAsYouGoFilterCriteria payAsYouGo) |
| `Action` | [`Actionobject`](../../doc/models/actionobject.md) | Optional | - | Actionobject getAction() | setAction(Actionobject action) |
| `StandAlone` | [`FiltercriteriaObjectCall`](../../doc/models/filtercriteria-object-call.md) | Optional | - | FiltercriteriaObjectCall getStandAlone() | setStandAlone(FiltercriteriaObjectCall standAlone) |

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
  },
  "payAsYouGo": {
    "filterCriteria": {
      "carrierServicePlanCode": "carrierServicePlanCode4",
      "accountNameList": [
        "accountNameList7",
        "accountNameList8"
      ]
    }
  }
}
```

