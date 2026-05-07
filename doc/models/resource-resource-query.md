
# Resource Resource Query

## Structure

`ResourceResourceQuery`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filter` | [`Devicepropertyfilter`](../../doc/models/devicepropertyfilter.md) | Optional | - | Devicepropertyfilter getFilter() | setFilter(Devicepropertyfilter filter) |

## Example (as JSON)

```json
{
  "filter": {
    "$selection": {
      "modelid": "modelid0"
    },
    "$querytotalcount": false
  }
}
```

