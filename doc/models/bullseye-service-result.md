
# Bullseye Service Result

Status of Hyper Precise Location on the device.

## Structure

`BullseyeServiceResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountNumber` | `String` | Optional | The numeric ID of the account and must include leading zeroes. This value is indentical to `accountName`. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `DeviceList` | [`List<DeviceServiceInformation>`](../../doc/models/device-service-information.md) | Optional | List of devices. | List<DeviceServiceInformation> getDeviceList() | setDeviceList(List<DeviceServiceInformation> deviceList) |
| `ResponseType` | [`ApiResponseCode`](../../doc/models/api-response-code.md) | Optional | ResponseCode and/or a message indicating success or failure of the request. | ApiResponseCode getResponseType() | setResponseType(ApiResponseCode responseType) |

## Example (as JSON)

```json
{
  "accountNumber": "0000123456-00001",
  "deviceList": [
    {
      "responseType": {
        "responseCode": "INTERNAL_ERROR",
        "message": "message8"
      },
      "imei": "imei4",
      "BullseyeEnable": {
        "BullseyeEnable": false
      }
    }
  ],
  "responseType": {
    "responseCode": "INTERNAL_ERROR",
    "message": "message8"
  }
}
```

