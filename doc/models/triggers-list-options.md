
# Triggers List Options

## Structure

`TriggersListOptions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TriggerId` | `String` | Optional | The system assigned name of the trigger being updated. | String getTriggerId() | setTriggerId(String triggerId) |
| `TriggerName` | `String` | Optional | The user defined name of the trigger. | String getTriggerName() | setTriggerName(String triggerName) |
| `OrganizationName` | `String` | Optional | The user assigned name of the organization associated with the trigger. | String getOrganizationName() | setOrganizationName(String organizationName) |
| `TriggerCategory` | `String` | Optional | This is the value to use in the request body to detect anomalous behaivior. The values in this table will only be relevant when this parameter is set to this value. | String getTriggerCategory() | setTriggerCategory(String triggerCategory) |
| `TriggerAttributes` | [`List<TriggerAttributesOptions>`](../../doc/models/trigger-attributes-options.md) | Optional | Additional details and keys for the trigger. | List<TriggerAttributesOptions> getTriggerAttributes() | setTriggerAttributes(List<TriggerAttributesOptions> triggerAttributes) |
| `CreatedAt` | `String` | Optional | Timestamp for whe the trigger was created. | String getCreatedAt() | setCreatedAt(String createdAt) |
| `ModifiedAt` | `String` | Optional | Timestamp for the most recent time the trigger was modified. | String getModifiedAt() | setModifiedAt(String modifiedAt) |
| `Anomalyattributes` | [`UsageAnomalyAttributes`](../../doc/models/usage-anomaly-attributes.md) | Optional | The details of the UsageAnomaly trigger. | UsageAnomalyAttributes getAnomalyattributes() | setAnomalyattributes(UsageAnomalyAttributes anomalyattributes) |
| `Notification` | [`Notification`](../../doc/models/notification.md) | Optional | The notification details of the trigger. | Notification getNotification() | setNotification(Notification notification) |

## Example (as JSON)

```json
{
  "triggerId": "BE1B5958-3E11-41DB-9ABD-B1B7618C0035",
  "triggerName": "Anomaly Daily Usage REST Test-1",
  "organizationName": "AnamolyDetectionRTRTest",
  "triggerCategory": "UsageAnomaly",
  "triggerAttributes": [
    {
      "key": "DataPercentage50",
      "value": false
    }
  ],
  "createdAt": "2021-10-21T23:57:03.397Z",
  "modifiedAt": "2021-10-21T23:57:03.397Z"
}
```

