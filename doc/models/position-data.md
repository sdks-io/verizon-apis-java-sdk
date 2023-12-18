
# Position Data

Position data.

## Structure

`PositionData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Time` | `String` | Optional | Time location obtained. | String getTime() | setTime(String time) |
| `Utcoffset` | `String` | Optional | UTC offset of time. | String getUtcoffset() | setUtcoffset(String utcoffset) |
| `X` | `String` | Optional | X coordinate of location. | String getX() | setX(String x) |
| `Y` | `String` | Optional | Y coordinate of location. | String getY() | setY(String y) |
| `Radius` | `String` | Optional | Radius of the location in meters. | String getRadius() | setRadius(String radius) |
| `Qos` | `Boolean` | Optional | Whether requested accurary is met or not. | Boolean getQos() | setQos(Boolean qos) |

## Example (as JSON)

```json
{
  "qos": false,
  "radius": "5571",
  "time": "20170520004421",
  "x": "33.45324",
  "y": "-84.59621",
  "utcoffset": "utcoffset0"
}
```

