
# Qos Device Info

## Structure

`QosDeviceInfo`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceId` | [`QosDeviceId`](../../doc/models/qos-device-id.md) | Required | - | QosDeviceId getDeviceId() | setDeviceId(QosDeviceId deviceId) |
| `DeviceIpV6Addr` | `String` | Optional | - | String getDeviceIpV6Addr() | setDeviceIpV6Addr(String deviceIpV6Addr) |
| `FlowInfo` | [`List<FlowInfo>`](../../doc/models/flow-info.md) | Required | - | List<FlowInfo> getFlowInfo() | setFlowInfo(List<FlowInfo> flowInfo) |

## Example (as JSON)

```json
{
  "deviceId": {
    "id": "10-digit phone number",
    "kind": "mdn"
  },
  "deviceIPv6Addr": "IPv6 address",
  "flowInfo": [
    {
      "flowServer": "[IPv6 address]:port",
      "flowDevice": "[IPv6 address]:port",
      "flowDirection": "UPLINK",
      "flowProtocol": "UDP",
      "qciOption": "Premium"
    }
  ]
}
```

