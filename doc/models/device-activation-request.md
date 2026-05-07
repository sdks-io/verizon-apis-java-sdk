
# Device Activation Request

Request for device status to check availability of activation.

## Structure

`DeviceActivationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | The name of a billing account. | String getAccountName() | setAccountName(String accountName) |
| `Devices` | [`List<AccountDeviceList>`](../../doc/models/account-device-list.md) | Required | Up to 10,000 devices that you want to move to a different account, specified by device identifier. | List<AccountDeviceList> getDevices() | setDevices(List<AccountDeviceList> devices) |

## Example (as JSON)

```json
{
  "accountName": "0212345678-00001",
  "devices": [
    {
      "deviceIds": [
        {
          "kind": "imei",
          "id": "15-digit IMEI"
        }
      ],
      "ipAddress": "ipAddress4"
    }
  ]
}
```

