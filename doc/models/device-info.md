
# Device Info

## Structure

`DeviceInfo`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceId` | [`DeviceId`](../../doc/models/device-id.md) | Optional | device identifiers consisting of an ID value and what that value represents (kind) | DeviceId getDeviceId() | setDeviceId(DeviceId deviceId) |
| `DeviceIPv6Addr` | `String` | Optional | the IPv6 IP address of the device | String getDeviceIPv6Addr() | setDeviceIPv6Addr(String deviceIPv6Addr) |
| `FlowInfo` | [`List<FlowInfo>`](../../doc/models/flow-info.md) | Optional | The details of the data connection | List<FlowInfo> getFlowInfo() | setFlowInfo(List<FlowInfo> flowInfo) |

## Example (as JSON)

```json
{
  "deviceIPv6Addr": "IPv6 address",
  "deviceId": {
    "id": "id0",
    "kind": "kind8"
  },
  "flowInfo": [
    {
      "flowServer": "flowServer4",
      "flowDevice": "flowDevice2",
      "flowDirection": "flowDirection6",
      "flowProtocol": "flowProtocol4",
      "qciOption": "qciOption0"
    },
    {
      "flowServer": "flowServer4",
      "flowDevice": "flowDevice2",
      "flowDirection": "flowDirection6",
      "flowProtocol": "flowProtocol4",
      "qciOption": "qciOption0"
    }
  ]
}
```

