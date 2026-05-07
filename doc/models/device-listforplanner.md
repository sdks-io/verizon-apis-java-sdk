
# Device Listforplanner

## Structure

`DeviceListforplanner`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceIds` | [`List<DeviceIdforplanner>`](../../doc/models/device-idforplanner.md) | Optional | - | List<DeviceIdforplanner> getDeviceIds() | setDeviceIds(List<DeviceIdforplanner> deviceIds) |
| `PrivateNetworkApns` | [`List<PrivateNetworkApns>`](../../doc/models/private-network-apns.md) | Optional | - | List<PrivateNetworkApns> getPrivateNetworkApns() | setPrivateNetworkApns(List<PrivateNetworkApns> privateNetworkApns) |
| `Ipaddress` | `String` | Optional | A IPv4 address | String getIpaddress() | setIpaddress(String ipaddress) |
| `ActivationCode` | `String` | Optional | The activation code value. | String getActivationCode() | setActivationCode(String activationCode) |

## Example (as JSON)

```json
{
  "ipAddress": "10.10.10.01",
  "deviceIds": [
    {
      "kind": "kind8",
      "id": "id0"
    },
    {
      "kind": "kind8",
      "id": "id0"
    }
  ],
  "privateNetworkApns": [
    {
      "apnName": "apnName2",
      "addressAssignmentMethod": "addressAssignmentMethod8",
      "ipAddress": "ipAddress4"
    }
  ],
  "activationCode": "activationCode0"
}
```

