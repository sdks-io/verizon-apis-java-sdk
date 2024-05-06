
# Notification Report Status Request

## Structure

`NotificationReportStatusRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | The name of a billing account. | String getAccountName() | setAccountName(String accountName) |
| `Device` | [`DeviceId`](../../doc/models/device-id.md) | Required | An identifier for a single device. | DeviceId getDevice() | setDevice(DeviceId device) |
| `RequestType` | `String` | Required | The type of request. | String getRequestType() | setRequestType(String requestType) |
| `RequestExpirationTime` | `String` | Optional | The time at which the request expires. | String getRequestExpirationTime() | setRequestExpirationTime(String requestExpirationTime) |

## Example (as JSON)

```json
{
  "accountName": "0868924207-00001",
  "device": {
    "kind": "imei",
    "id": "990013907835573"
  },
  "requestType": "requestType8",
  "requestExpirationTime": "requestExpirationTime6"
}
```

