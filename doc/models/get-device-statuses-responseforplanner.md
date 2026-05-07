
# Get Device Statuses Responseforplanner

## Structure

`GetDeviceStatusesResponseforplanner`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountNumber` | `String` | Optional | The numeric name of the account, including leading zeros. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `RequestId` | `String` | Optional | - | String getRequestId() | setRequestId(String requestId) |
| `DeviceStatusList` | [`List<DeviceStatusItemforplanner>`](../../doc/models/device-status-itemforplanner.md) | Optional | - | List<DeviceStatusItemforplanner> getDeviceStatusList() | setDeviceStatusList(List<DeviceStatusItemforplanner> deviceStatusList) |

## Example (as JSON)

```json
{
  "accountNumber": "0000123456-00001",
  "requestId": "requestId4",
  "deviceStatusList": [
    {
      "deviceIds": [
        {
          "kind": "kind8",
          "id": "id0"
        }
      ],
      "status": "status6",
      "reason": "reason2"
    }
  ]
}
```

