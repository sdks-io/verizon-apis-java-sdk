
# Multi Line String

A MultiLineString is a type of geometry that represents a collection of LineString geometries.

## Structure

`MultiLineString`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`Type4Enum`](../../doc/models/type-4-enum.md) | Required | - | Type4Enum getType() | setType(Type4Enum type) |
| `Coordinates` | `List<List<List<Double>>>` | Required | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10`, `>= -180`, `<= 180` | List<List<List<Double>>> getCoordinates() | setCoordinates(List<List<List<Double>>> coordinates) |

## Example (as JSON)

```json
{
  "type": "MultiLineString",
  "coordinates": [
    [
      [
        180.0,
        180.0
      ],
      [
        180.0,
        180.0
      ]
    ],
    [
      [
        180.0,
        180.0
      ],
      [
        180.0,
        180.0
      ]
    ]
  ]
}
```

