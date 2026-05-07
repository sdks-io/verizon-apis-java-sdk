
# Multi Polygon

A MultiPolygon is a type of geometry that represents a collection of Polygon geometries.

## Structure

`MultiPolygon`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`Type5Enum`](../../doc/models/type-5-enum.md) | Required | - | Type5Enum getType() | setType(Type5Enum type) |
| `Coordinates` | `List<List<List<List<Double>>>>` | Required | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10`, `>= -180`, `<= 180` | List<List<List<List<Double>>>> getCoordinates() | setCoordinates(List<List<List<List<Double>>>> coordinates) |

## Example (as JSON)

```json
{
  "type": "MultiPolygon",
  "coordinates": [
    [
      [
        [
          46.55
        ]
      ]
    ]
  ]
}
```

