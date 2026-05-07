
# Hpl Device Id

Identifier object pairs of kind/id

## Structure

`HplDeviceId`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Kind` | `String` | Optional | The type of ID. This can be IMEI or ICCID. | String getKind() | setKind(String kind) |
| `Id` | `String` | Optional | The ID value. | String getId() | setId(String id) |

## Example (as JSON)

```json
{
  "kind": "kind4",
  "id": "id6"
}
```

