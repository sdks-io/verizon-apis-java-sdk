
# Bullseye Service Result

Status of Hyper Precise Location on the device.

## Structure

`BullseyeServiceResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountNumber` | `String` | Optional | The account the device belongs to. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `DeviceList` | [`List<DeviceServiceInformation>`](../../doc/models/device-service-information.md) | Optional | List of devices. | List<DeviceServiceInformation> getDeviceList() | setDeviceList(List<DeviceServiceInformation> deviceList) |
| `ResponseType` | [`ApiResponseCode`](../../doc/models/api-response-code.md) | Optional | ResponseCode and/or a message indicating success or failure of the request. | ApiResponseCode getResponseType() | setResponseType(ApiResponseCode responseType) |

## Example (as JSON)

```json
{
  "accountNumber": "0844021539-00001",
  "deviceList": [
    {
      "imei": "709312034493372",
      "BullseyeEnable": true,
      "responseType": {
        "responseCode": "INTERNAL_ERROR",
        "message": "message8"
      }
    }
  ],
  "responseType": {
    "responseCode": "INTERNAL_ERROR",
    "message": "message8"
  }
}
```

