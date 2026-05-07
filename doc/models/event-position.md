
# Event Position

## Structure

`EventPosition`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Latitude` | `int` | Required | Latitude of the event location in microdegrees (900000001 shall be used when unavailable).<br><br>**Constraints**: `>= -900000000`, `<= 900000001` | int getLatitude() | setLatitude(int latitude) |
| `Longitude` | `int` | Required | Longitude of the event location in microdegrees (1800000001 shall be used when unavailable).<br><br>**Constraints**: `>= -1800000000`, `<= 1800000001` | int getLongitude() | setLongitude(int longitude) |
| `PositionConfidenceEllipse` | [`PosConfidenceEllipse`](../../doc/models/pos-confidence-ellipse.md) | Required | - | PosConfidenceEllipse getPositionConfidenceEllipse() | setPositionConfidenceEllipse(PosConfidenceEllipse positionConfidenceEllipse) |
| `Altitude` | [`Altitude`](../../doc/models/altitude.md) | Required | - | Altitude getAltitude() | setAltitude(Altitude altitude) |

## Example (as JSON)

```json
{
  "latitude": 54,
  "longitude": 238,
  "positionConfidenceEllipse": {
    "semiMajorConfidence": 16,
    "semiMinorConfidence": 114,
    "semiMajorOrientation": 100
  },
  "altitude": {
    "altitudeValue": 236,
    "altitudeConfidence": "alt-000-01"
  }
}
```

