
# License Device List

List of all devices.

## Structure

`LicenseDeviceList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceIds` | [`List<LicenseDeviceId>`](../../doc/models/license-device-id.md) | Optional | For 4G devices, IMEI (decimal, up to 15 digits).<br>**Constraints**: *Maximum Items*: `100` | List<LicenseDeviceId> getDeviceIds() | setDeviceIds(List<LicenseDeviceId> deviceIds) |
| `Ipaddress` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[0-9].[0-9].[0-9].[0-9]{3,32}$` | String getIpaddress() | setIpaddress(String ipaddress) |

## Example (as JSON)

```json
{
  "deviceIds": [
    {
      "id": "864508030109877",
      "kind": "IMEI"
    }
  ],
  "ipAddress": "ipAddress4"
}
```
