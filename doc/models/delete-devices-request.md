
# Delete Devices Request

Request to delete a device request.

## Structure

`DeleteDevicesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DevicesToDelete` | [`List<AccountDeviceList>`](../../doc/models/account-device-list.md) | Required | A list of up to 100 devices that you want to delete, specified by device identifier. You only need to provide one identifier per device. | List<AccountDeviceList> getDevicesToDelete() | setDevicesToDelete(List<AccountDeviceList> devicesToDelete) |
| `AccountName` | `String` | Optional | The Verizon billing account that the device group belongs to. An account name is usually numeric, and must include any leading zeros. | String getAccountName() | setAccountName(String accountName) |

## Example (as JSON)

```json
{
  "devicesToDelete": [
    {
      "deviceIds": [
        {
          "id": "09005470263",
          "kind": "esn"
        }
      ],
      "ipAddress": "ipAddress8"
    },
    {
      "deviceIds": [
        {
          "id": "85000022411113460014",
          "kind": "iccid"
        }
      ],
      "ipAddress": "ipAddress8"
    },
    {
      "deviceIds": [
        {
          "id": "85000022412313460016",
          "kind": "iccid"
        }
      ],
      "ipAddress": "ipAddress8"
    }
  ],
  "accountName": "accountName2"
}
```

