
# V2 Triggers Request 1

## Structure

`V2TriggersRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TriggerId` | `String` | Optional | The system assigned UUID of the trigger | String getTriggerId() | setTriggerId(String triggerId) |
| `TriggerName` | `String` | Optional | The user defined name of the trigger | String getTriggerName() | setTriggerName(String triggerName) |
| `EcpdId` | `String` | Optional | The Enterprise Customer Profile Database ID | String getEcpdId() | setEcpdId(String ecpdId) |
| `TriggerCategory` | [`TriggerCategoryEnum`](../../doc/models/trigger-category-enum.md) | Optional | The type of trigger being created or modified | TriggerCategoryEnum getTriggerCategory() | setTriggerCategory(TriggerCategoryEnum triggerCategory) |
| `DataTrigger` | [`DataTrigger5`](../../doc/models/data-trigger-5.md) | Optional | - | DataTrigger5 getDataTrigger() | setDataTrigger(DataTrigger5 dataTrigger) |
| `Notification` | [`Notificationarray`](../../doc/models/notificationarray.md) | Optional | - | Notificationarray getNotification() | setNotification(Notificationarray notification) |
| `NotificationType` | `String` | Optional | - | String getNotificationType() | setNotificationType(String notificationType) |
| `Callback` | `Boolean` | Optional | - | Boolean getCallback() | setCallback(Boolean callback) |
| `EmailNotification` | `Boolean` | Optional | - | Boolean getEmailNotification() | setEmailNotification(Boolean emailNotification) |
| `NotificationGroupName` | `String` | Optional | - | String getNotificationGroupName() | setNotificationGroupName(String notificationGroupName) |
| `NotificationFrequencyFactor` | `Integer` | Optional | - | Integer getNotificationFrequencyFactor() | setNotificationFrequencyFactor(Integer notificationFrequencyFactor) |
| `NotificationFrequencyInterval` | `String` | Optional | - | String getNotificationFrequencyInterval() | setNotificationFrequencyInterval(String notificationFrequencyInterval) |
| `ExternalEmailRecipients` | `String` | Optional | - | String getExternalEmailRecipients() | setExternalEmailRecipients(String externalEmailRecipients) |
| `SmsNotification` | `Boolean` | Optional | - | Boolean getSmsNotification() | setSmsNotification(Boolean smsNotification) |
| `SmsNumbers` | [`List<V2TriggersRequest1SmsNumbers>`](../../doc/models/containers/v2-triggers-request-1-sms-numbers.md) | Optional | This is List of a container for any-of cases. | List<V2TriggersRequest1SmsNumbers> getSmsNumbers() | setSmsNumbers(List<V2TriggersRequest1SmsNumbers> smsNumbers) |
| `Reminder` | `Boolean` | Optional | - | Boolean getReminder() | setReminder(Boolean reminder) |
| `Severity` | `String` | Optional | - | String getSeverity() | setSeverity(String severity) |
| `Active` | [`ActiveEnum`](../../doc/models/active-enum.md) | Optional | A flag to indicate of the trigger is active, true, or not, false | ActiveEnum getActive() | setActive(ActiveEnum active) |
| `AccountName` | `String` | Optional | The numeric name of the account and must include leading zeroes | String getAccountName() | setAccountName(String accountName) |
| `PricePlanTrigger` | [`PricePlanTrigger2`](../../doc/models/price-plan-trigger-2.md) | Optional | - | PricePlanTrigger2 getPricePlanTrigger() | setPricePlanTrigger(PricePlanTrigger2 pricePlanTrigger) |

## Example (as JSON)

```json
{
  "triggerId": "be1b5958-ffff-eeee-gggg-b1b7618c0035",
  "triggerName": "name of the trigger",
  "ecpdId": "Verizon profile ID",
  "notificationType": "PerEvent",
  "callback": true,
  "emailNotification": false,
  "notificationGroupName": "Notification Group Name (User defined)",
  "notificationFrequencyFactor": 3,
  "notificationFrequencyInterval": "Daily",
  "externalEmailRecipients": "Email addresses",
  "smsNotification": true,
  "reminder": true,
  "severity": "Notify",
  "active": "true",
  "accountName": "0000123456-00001",
  "triggerCategory": "DeviceGroupUsage",
  "dataTrigger": {
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
    "condition": "UsageAllowance",
    "action": "notify",
    "conditionType": "Aging",
    "comparitor": "eq"
  }
}
```

