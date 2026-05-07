
# Header

The header of the DENM PDU.

## Structure

`Header`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProtocolVersion` | [`ProtocolVersionEnum`](../../doc/models/protocol-version-enum.md) | Required | The protocol version of the DENM. | ProtocolVersionEnum getProtocolVersion() | setProtocolVersion(ProtocolVersionEnum protocolVersion) |
| `MessageId` | [`MessageIdEnum`](../../doc/models/message-id-enum.md) | Required | The type of ITIS message (typically 1 for DENM). | MessageIdEnum getMessageId() | setMessageId(MessageIdEnum messageId) |
| `StationId` | `int` | Required | The station identifier of the ITS-S. | int getStationId() | setStationId(int stationId) |

## Example (as JSON)

```json
{
  "protocolVersion": 2,
  "messageId": 1,
  "stationId": 12345
}
```

