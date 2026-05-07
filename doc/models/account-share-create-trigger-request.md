
# Account Share Create Trigger Request

## Structure

`AccountShareCreateTriggerRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TriggerName` | `String` | Optional | The user defined name of the trigger | String getTriggerName() | setTriggerName(String triggerName) |
| `EcpdId` | `String` | Optional | The Enterprise Customer Profile Database ID | String getEcpdId() | setEcpdId(String ecpdId) |
| `TriggerCategory` | [`TriggerCategoryEnum`](../../doc/models/trigger-category-enum.md) | Optional | The type of trigger being created or modified | TriggerCategoryEnum getTriggerCategory() | setTriggerCategory(TriggerCategoryEnum triggerCategory) |
| `PricePlanTrigger` | [`AccountSharePricePlanTrigger`](../../doc/models/account-share-price-plan-trigger.md) | Optional | - | AccountSharePricePlanTrigger getPricePlanTrigger() | setPricePlanTrigger(AccountSharePricePlanTrigger pricePlanTrigger) |
| `Notification` | [`Notificationarray`](../../doc/models/notificationarray.md) | Optional | - | Notificationarray getNotification() | setNotification(Notificationarray notification) |
| `Active` | [`ActiveEnum`](../../doc/models/active-enum.md) | Optional | A flag to indicate of the trigger is active, true, or not, false | ActiveEnum getActive() | setActive(ActiveEnum active) |

## Example (as JSON)

```json
{
  "triggerName": "name of the trigger",
  "ecpdId": "Verizon profile ID",
  "active": "true",
  "triggerCategory": "DeviceGroupUsage",
  "pricePlanTrigger": {
    "accountShare": {
      "filterCriteria": {
        "carrierServicePlanCode": "carrierServicePlanCode4",
        "accountNameList": [
          "accountNameList7",
          "accountNameList8"
        ]
      }
    },
    "condition": "Aging",
    "changePlan": false,
    "changePlanDetails": {
      "toCarrierServicePlanCode": "toCarrierServicePlanCode2"
    }
  },
  "notification": {
    "notificationType": "notificationType8",
    "callback": false,
    "emailNotification": false,
    "notificationGroupName": "notificationGroupName6",
    "notificationFrequencyFactor": 22
  }
}
```

