
# Account Group Share Create Trigger Request

## Structure

`AccountGroupShareCreateTriggerRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TriggerName` | `String` | Optional | The user defined name of the trigger | String getTriggerName() | setTriggerName(String triggerName) |
| `AccountName` | `String` | Optional | The numeric name of the account and must include leading zeroes | String getAccountName() | setAccountName(String accountName) |
| `TriggerCategory` | [`TriggerCategoryEnum`](../../doc/models/trigger-category-enum.md) | Optional | The type of trigger being created or modified | TriggerCategoryEnum getTriggerCategory() | setTriggerCategory(TriggerCategoryEnum triggerCategory) |
| `PricePlanTrigger` | [`AccountGroupShareObject`](../../doc/models/account-group-share-object.md) | Optional | - | AccountGroupShareObject getPricePlanTrigger() | setPricePlanTrigger(AccountGroupShareObject pricePlanTrigger) |
| `Notification` | [`Notificationarray`](../../doc/models/notificationarray.md) | Optional | - | Notificationarray getNotification() | setNotification(Notificationarray notification) |
| `Active` | [`ActiveEnum`](../../doc/models/active-enum.md) | Optional | A flag to indicate of the trigger is active, true, or not, false | ActiveEnum getActive() | setActive(ActiveEnum active) |

## Example (as JSON)

```json
{
  "triggerName": "name of the trigger",
  "accountName": "0000123456-00001",
  "active": "true",
  "triggerCategory": "PricePlanDataUsage",
  "pricePlanTrigger": {
    "accountGroupShare": {
      "accountGroupShareIndividual": {
        "filterCriteria": {
          "ratePlanGroupId": 202
        },
        "condition": {
          "action": "notify"
        },
        "action": {
          "notify": {
            "alertType": "alertType8",
            "threshold": [
              {
                "carrierCode": "carrierCode4",
                "percentage": {
                  "percentage50": false,
                  "percentage75": false,
                  "percentage90": false,
                  "percentage100": false
                }
              },
              {
                "carrierCode": "carrierCode4",
                "percentage": {
                  "percentage50": false,
                  "percentage75": false,
                  "percentage90": false,
                  "percentage100": false
                }
              },
              {
                "carrierCode": "carrierCode4",
                "percentage": {
                  "percentage50": false,
                  "percentage75": false,
                  "percentage90": false,
                  "percentage100": false
                }
              }
            ]
          }
        }
      }
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

