
# Device List IP

## Structure

`DeviceListIP`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceIds` | [`List<PWNDeviceId>`](../../doc/models/pwn-device-id.md) | Required | - | List<PWNDeviceId> getDeviceIds() | setDeviceIds(List<PWNDeviceId> deviceIds) |
| `Ipaddress` | `String` | Required | - | String getIpaddress() | setIpaddress(String ipaddress) |

## Example (as JSON)

```json
{
  "deviceIds": [
    {
      "id": "99948099913024600000",
      "kind": "iccid"
    }
  ],
  "ipAddress": "10.3.4.5"
}
```

