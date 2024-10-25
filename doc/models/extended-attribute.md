
# Extended Attribute

## Structure

`ExtendedAttribute`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Key` | `String` | Optional | The key indicates if the SMS message was to the device (MtSms) or from the device (MoSms)<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getKey() | setKey(String key) |
| `Value` | `String` | Optional | The number of SMS messages found<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getValue() | setValue(String value) |

## Example (as JSON)

```json
{
  "key": "MoSms",
  "value": "value4"
}
```

