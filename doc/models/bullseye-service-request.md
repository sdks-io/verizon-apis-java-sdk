
# Bullseye Service Request

Account number and list of devices.

## Structure

`BullseyeServiceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceList` | [`List<DeviceServiceRequest>`](../../doc/models/device-service-request.md) | Required | A list of devices. | List<DeviceServiceRequest> getDeviceList() | setDeviceList(List<DeviceServiceRequest> deviceList) |
| `AccountNumber` | `String` | Required | The numeric ID of the account and must include leading zeroes. This value is indentical to `accountName`. | String getAccountNumber() | setAccountNumber(String accountNumber) |

## Example (as JSON)

```json
{
  "deviceList": [
    {
      "imei": "15-digit IMEI",
      "BullseyeEnable": {
        "BullseyeEnable": true
      }
    }
  ],
  "accountNumber": "0000123456-00001"
}
```

