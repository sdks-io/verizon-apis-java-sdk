
# Notification Report Status Request

## Structure

`NotificationReportStatusRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | The name of a billing account. | String getAccountName() | setAccountName(String accountName) |
| `Device` | [`DeviceId`](../../doc/models/device-id.md) | Optional | An identifier for a single device. | DeviceId getDevice() | setDevice(DeviceId device) |
| `RequestExpirationTime` | `String` | Optional | The time at which the request expires. | String getRequestExpirationTime() | setRequestExpirationTime(String requestExpirationTime) |
| `RequestType` | `String` | Optional | The type of request. | String getRequestType() | setRequestType(String requestType) |

## Example (as JSON)

```json
{
  "accountName": "0868924207-00001",
  "device": {
    "kind": "imei",
    "id": "990013907835573"
  },
  "requestExpirationTime": "requestExpirationTime6",
  "requestType": "requestType8"
}
```

