
# Device Profile Request

## Structure

`DeviceProfileRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Devices` | [`List<GIODeviceList>`](../../doc/models/gio-device-list.md) | Optional | **Constraints**: *Maximum Items*: `100` | List<GIODeviceList> getDevices() | setDevices(List<GIODeviceList> devices) |
| `AccountName` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[0-9\-]{3,32}$` | String getAccountName() | setAccountName(String accountName) |
| `ServicePlan` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9 ]{3,32}$` | String getServicePlan() | setServicePlan(String servicePlan) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "servicePlan": "service plan name",
  "devices": [
    {
      "deviceIds": [
        {
          "kind": "kind8",
          "id": "id0"
        }
      ]
    },
    {
      "deviceIds": [
        {
          "kind": "kind8",
          "id": "id0"
        }
      ]
    }
  ]
}
```

