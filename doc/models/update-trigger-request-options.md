
# Update Trigger Request Options

## Structure

`UpdateTriggerRequestOptions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TriggerId` | `String` | Optional | Trigger ID. | String getTriggerId() | setTriggerId(String triggerId) |
| `TriggerName` | `String` | Optional | Trigger name. | String getTriggerName() | setTriggerName(String triggerName) |
| `TriggerCategory` | `String` | Optional | This is the value to use in the request body to detect anomalous behaivior. The values in this table will only be relevant when this parameter is set to this value. | String getTriggerCategory() | setTriggerCategory(String triggerCategory) |
| `AccountName` | `String` | Optional | Account name.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32` | String getAccountName() | setAccountName(String accountName) |
| `AnomalyTriggerRequest` | [`AnomalyTriggerRequest`](../../doc/models/anomaly-trigger-request.md) | Optional | The details of the UsageAnomaly trigger. | AnomalyTriggerRequest getAnomalyTriggerRequest() | setAnomalyTriggerRequest(AnomalyTriggerRequest anomalyTriggerRequest) |
| `Notification` | [`Notification`](../../doc/models/notification.md) | Optional | The notification details of the trigger. | Notification getNotification() | setNotification(Notification notification) |
| `Active` | `Boolean` | Optional | Indicates anomaly detection is active<br />True - Anomaly detection is active.<br />False - Anomaly detection is not active. | Boolean getActive() | setActive(Boolean active) |

## Example (as JSON)

```json
{
  "triggerId": "595f5c44-c31c-4552-8670-020a1545a84d",
  "triggerName": "Anomaly Daily Usage REST Test-Patch Update 4",
  "accountName": "0000123456-00001",
  "triggerCategory": "UsageAnomaly",
  "anomalyTriggerRequest": {
    "accountNames": "0000123456-00001",
    "includeAbnormal": true,
    "includeVeryAbnormal": true,
    "includeUnderExpectedUsage": false,
    "includeOverExpectedUsage": true
  },
  "notification": {
    "notificationType": "DailySummary",
    "callback": true,
    "emailNotification": false,
    "notificationGroupName": "Anomaly Test API",
    "notificationFrequencyFactor": 3,
    "notificationFrequencyInterval": "Hourly",
    "externalEmailRecipients": "placeholder@verizon.com",
    "smsNotification": true,
    "smsNumbers": [
      {
        "carrier": "US Cellular",
        "number": "9299280711"
      }
    ],
    "reminder": true,
    "severity": "Critical"
  }
}
```

