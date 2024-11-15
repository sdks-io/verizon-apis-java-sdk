
# Flow Info

## Structure

`FlowInfo`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FlowServer` | `String` | Optional | The IPv6 IP address and port used to connect to the server | String getFlowServer() | setFlowServer(String flowServer) |
| `FlowDevice` | `String` | Optional | The IPv6 IP address and port used by the device | String getFlowDevice() | setFlowDevice(String flowDevice) |
| `FlowDirection` | `String` | Optional | The direction the data is flowing. UPLINK if from the device, DOWNLINK is to the device | String getFlowDirection() | setFlowDirection(String flowDirection) |
| `FlowProtocol` | `String` | Optional | The data protocol used for the connection | String getFlowProtocol() | setFlowProtocol(String flowProtocol) |
| `QciOption` | `String` | Optional | The QoS level of the connection. This will be Standard or Premium | String getQciOption() | setQciOption(String qciOption) |

## Example (as JSON)

```json
{
  "flowServer": "[IPv6 address]:port",
  "flowDevice": "[IPv6 address]:port",
  "flowDirection": "UPLINK",
  "flowProtocol": "UDP",
  "qciOption": "Premium"
}
```

