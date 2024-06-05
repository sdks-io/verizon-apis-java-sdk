
# Create Trigger V2 Request

Create Trigger Request

## Structure

`CreateTriggerV2Request`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
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
  "triggerName": "triggerName4",
  "ecpdId": "ecpdId0",
  "deviceGroupName": "deviceGroupName4",
  "triggerCategory": "triggerCategory8",
  "pricePlanTrigger": {
    "accountGroupShare": {
      "accountGroupShareIndividual": {
        "filterCriteria": {
          "ratePlanGroupId": 202
        },
        "condition": {
          "action": "action6"
        },
        "action": {
          "changePlan": {
            "triggerDate": "triggerDate6",
            "sharePlan": [
              {
                "fromCarrierCode": "fromCarrierCode6",
                "toCarrierCode": "toCarrierCode8",
                "criteriaPercentage": 170
              },
              {
                "fromCarrierCode": "fromCarrierCode6",
                "toCarrierCode": "toCarrierCode8",
                "criteriaPercentage": 170
              },
              {
                "fromCarrierCode": "fromCarrierCode6",
                "toCarrierCode": "toCarrierCode8",
                "criteriaPercentage": 170
              }
            ]
          }
        }
      }
    }
  }
}
```

