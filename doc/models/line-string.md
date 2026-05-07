
# Line String

A LineString is a type of geometry that represents a collection of points that are connected by line segments.

## Structure

`LineString`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`Type2Enum`](../../doc/models/type-2-enum.md) | Required | - | Type2Enum getType() | setType(Type2Enum type) |
| `Coordinates` | `List<List<Double>>` | Required | **Constraints**: *Minimum Items*: `2`, *Maximum Items*: `63`, `>= -180`, `<= 180` | List<List<Double>> getCoordinates() | setCoordinates(List<List<Double>> coordinates) |

## Example (as JSON)

```json
{
  "type": "LineString",
  "coordinates": [
    [
      51.53,
      51.54
    ],
    [
      51.53,
      51.54
    ]
  ]
}
```

