
# Activate Device Profile Request

## Structure

`ActivateDeviceProfileRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Devices` | [`List<DeviceList>`](../../doc/models/device-list.md) | Optional | **Constraints**: *Maximum Items*: `100` | List<DeviceList> getDevices() | setDevices(List<DeviceList> devices) |
| `AccountName` | `String` | Optional | - | String getAccountName() | setAccountName(String accountName) |
| `ServicePlan` | `String` | Optional | - | String getServicePlan() | setServicePlan(String servicePlan) |
| `MdnZIpCode` | `String` | Optional | - | String getMdnZIpCode() | setMdnZIpCode(String mdnZIpCode) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "servicePlan": "The service plan name",
  "mdnZipCode": "five digit zip code",
  "devices": [
    {
      "deviceIds": [
        {
          "id": "id0",
          "kind": "kind8"
        }
      ]
    },
    {
      "deviceIds": [
        {
          "id": "id0",
          "kind": "kind8"
        }
      ]
    }
  ]
}
```

