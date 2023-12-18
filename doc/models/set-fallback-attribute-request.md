
# Set Fallback Attribute Request

## Structure

`SetFallbackAttributeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Devices` | [`List<DeviceList>`](../../doc/models/device-list.md) | Optional | **Constraints**: *Maximum Items*: `100` | List<DeviceList> getDevices() | setDevices(List<DeviceList> devices) |
| `AccountName` | `String` | Optional | - | String getAccountName() | setAccountName(String accountName) |
| `CarrierName` | `String` | Optional | - | String getCarrierName() | setCarrierName(String carrierName) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "carrierName": "the name of the mobile service provider",
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

