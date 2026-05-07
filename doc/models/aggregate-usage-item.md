
# Aggregate Usage Item

Contains usage information per device.

## Structure

`AggregateUsageItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Imei` | `String` | Optional | The International Mobile Equipment Identifier of the device. | String getImei() | setImei(String imei) |
| `NumberOfSessions` | `Integer` | Optional | Number of sessions established by the device reporting usage. | Integer getNumberOfSessions() | setNumberOfSessions(Integer numberOfSessions) |
| `BytesTransferred` | `Integer` | Optional | The amount of data transferred by the device reporting usage, measured in Bytes. | Integer getBytesTransferred() | setBytesTransferred(Integer bytesTransferred) |

## Example (as JSON)

```json
{
  "imei": "15-digit IMEI",
  "numberOfSessions": 1,
  "bytesTransferred": 2057
}
```

