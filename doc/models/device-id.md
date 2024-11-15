
# Device Id

device identifiers consisting of an ID value and what that value represents (kind)

## Structure

`DeviceId`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The numeric or alphanumeric ID value | String getId() | setId(String id) |
| `Kind` | `String` | Optional | What the ID value represents, which could be a Mobile Directory Number (MDN) or an International Mobile Equipment Identifier (IMEI) as an example | String getKind() | setKind(String kind) |

## Example (as JSON)

```json
{
  "id": "10-digit phone number",
  "kind": "mdn"
}
```

