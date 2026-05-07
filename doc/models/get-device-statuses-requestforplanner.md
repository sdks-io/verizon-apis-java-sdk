
# Get Device Statuses Requestforplanner

## Structure

`GetDeviceStatusesRequestforplanner`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountNumber` | `String` | Optional | The numeric name of the account, including leading zeros. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `RequestId` | `String` | Optional | The unique ID of a request. This is a UUID value. | String getRequestId() | setRequestId(String requestId) |
| `Devices` | [`List<DeviceListforplanner>`](../../doc/models/device-listforplanner.md) | Optional | - | List<DeviceListforplanner> getDevices() | setDevices(List<DeviceListforplanner> devices) |

## Example (as JSON)

```json
{
  "accountNumber": "0000123456-00001",
  "requestId": "d24cc6e4-eeee-ffff-gggg-0ffbb091c076",
  "devices": [
    {
      "deviceIds": [
        {
          "kind": "kind8",
          "id": "id0"
        }
      ],
      "privateNetworkApns": [
        {
          "apnName": "apnName2",
          "addressAssignmentMethod": "addressAssignmentMethod8",
          "ipAddress": "ipAddress4"
        },
        {
          "apnName": "apnName2",
          "addressAssignmentMethod": "addressAssignmentMethod8",
          "ipAddress": "ipAddress4"
        }
      ],
      "ipAddress": "ipAddress4",
      "activationCode": "activationCode2"
    },
    {
      "deviceIds": [
        {
          "kind": "kind8",
          "id": "id0"
        }
      ],
      "privateNetworkApns": [
        {
          "apnName": "apnName2",
          "addressAssignmentMethod": "addressAssignmentMethod8",
          "ipAddress": "ipAddress4"
        },
        {
          "apnName": "apnName2",
          "addressAssignmentMethod": "addressAssignmentMethod8",
          "ipAddress": "ipAddress4"
        }
      ],
      "ipAddress": "ipAddress4",
      "activationCode": "activationCode2"
    }
  ]
}
```

