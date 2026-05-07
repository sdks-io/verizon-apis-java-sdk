
# Hpl Custom Fields

User assigned custom fields to use for fitering

## Structure

`HplCustomFields`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Key` | `String` | Optional | key property<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32` | String getKey() | setKey(String key) |
| `Value` | `String` | Optional | value of the key property<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32` | String getValue() | setValue(String value) |

## Example (as JSON)

```json
{
  "key": "key4",
  "value": "value6"
}
```

