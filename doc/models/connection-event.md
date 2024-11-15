
# Connection Event

Network connection events for a device during a specified time period.

## Structure

`ConnectionEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ConnectionEventAttributes` | [`List<CustomFields>`](../../doc/models/custom-fields.md) | Optional | The attributes that describe the connection event. | List<CustomFields> getConnectionEventAttributes() | setConnectionEventAttributes(List<CustomFields> connectionEventAttributes) |
| `ExtendedAttributes` | [`List<CustomFields>`](../../doc/models/custom-fields.md) | Optional | Currently not used. | List<CustomFields> getExtendedAttributes() | setExtendedAttributes(List<CustomFields> extendedAttributes) |
| `OccurredAt` | `String` | Optional | The date and time when the connection event occured. | String getOccurredAt() | setOccurredAt(String occurredAt) |

## Example (as JSON)

```json
{
  "connectionEventAttributes": [
    {
      "key": "BytesUsed",
      "value": "0"
    },
    {
      "key": "Event",
      "value": "Start"
    }
  ],
  "extendedAttributes": [],
  "occurredAt": "2015-12-17T14:12:36-05:00"
}
```

