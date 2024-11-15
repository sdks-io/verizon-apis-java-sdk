
# Update Trigger V2 Request

Update Trigger Request

## Structure

`UpdateTriggerV2Request`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TriggerId` | `String` | Optional | - | String getTriggerId() | setTriggerId(String triggerId) |
| `TriggerName` | `String` | Optional | - | String getTriggerName() | setTriggerName(String triggerName) |
| `EcpdId` | `String` | Optional | - | String getEcpdId() | setEcpdId(String ecpdId) |
| `DeviceGroupName` | `String` | Optional | - | String getDeviceGroupName() | setDeviceGroupName(String deviceGroupName) |
| `TriggerCategory` | `String` | Optional | - | String getTriggerCategory() | setTriggerCategory(String triggerCategory) |
| `PricePlanTrigger` | [`PricePlanTrigger`](../../doc/models/price-plan-trigger.md) | Optional | - | PricePlanTrigger getPricePlanTrigger() | setPricePlanTrigger(PricePlanTrigger pricePlanTrigger) |
| `Notification` | [`Notification`](../../doc/models/notification.md) | Optional | - | Notification getNotification() | setNotification(Notification notification) |
| `Active` | `Boolean` | Optional | - | Boolean getActive() | setActive(Boolean active) |

## Example (as JSON)

```json
{
  "triggerId": "triggerId4",
  "triggerName": "triggerName6",
  "ecpdId": "ecpdId0",
  "deviceGroupName": "deviceGroupName4",
  "triggerCategory": "triggerCategory8"
}
```

