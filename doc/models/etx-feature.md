
# Etx Feature

## Structure

`EtxFeature`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`Type1Enum`](../../doc/models/type-1-enum.md) | Required | - | Type1Enum getType() | setType(Type1Enum type) |
| `Geometry` | [`Geometry`](../../doc/models/containers/geometry.md) | Required | - | Geometry getGeometry() | setGeometry(Geometry geometry) |
| `Properties` | `Object` | Required | - | Object getProperties() | setProperties(Object properties) |

## Example (as JSON)

```json
{
  "type": "Feature",
  "geometry": {
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
  },
  "properties": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

