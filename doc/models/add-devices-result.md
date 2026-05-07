
# Add Devices Result

Contains the device identifiers and a success or failure response for each device in the request.

## Structure

`AddDevicesResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceIds` | [`List<DeviceId>`](../../doc/models/device-id.md) | Optional | Identifiers for the device. | List<DeviceId> getDeviceIds() | setDeviceIds(List<DeviceId> deviceIds) |
| `Response` | `String` | Optional | The status message for the current device. This will be Success or Failed | String getResponse() | setResponse(String response) |

## Example (as JSON)

```json
{
  "deviceIds": [
    {
      "id": "20-digit ICCID",
      "kind": "iccid"
    }
  ],
  "response": "Success"
}
```

