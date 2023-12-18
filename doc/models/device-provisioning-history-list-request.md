
# Device Provisioning History List Request

Request to return the provisioning history of a specified device during a specified time period.

## Structure

`DeviceProvisioningHistoryListRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceId` | [`DeviceId`](../../doc/models/device-id.md) | Optional | An identifier for a single device. | DeviceId getDeviceId() | setDeviceId(DeviceId deviceId) |
| `Earliest` | `String` | Optional | The earliest date and time for which you want provisioning data. | String getEarliest() | setEarliest(String earliest) |
| `Latest` | `String` | Optional | The last date and time for which you want provisioning data. | String getLatest() | setLatest(String latest) |

## Example (as JSON)

```json
{
  "deviceId": {
    "id": "89141390780800784259",
    "kind": "iccid"
  },
  "earliest": "2015-09-16T00:00:01Z",
  "latest": "2015-09-18T00:00:01Z"
}
```

