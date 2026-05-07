
# Rbs High Precision Tilt Config

## Structure

`RbsHighPrecisionTiltConfig`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Mode` | [`ModeEnum`](../../doc/models/mode-enum.md) | Optional | the reporting mode of the tilt sensor | ModeEnum getMode() | setMode(ModeEnum mode) |
| `PeriodicReporting` | [`PeriodicReporting`](../../doc/models/periodic-reporting.md) | Optional | The units and values of the time interval for the sensor to send a report | PeriodicReporting getPeriodicReporting() | setPeriodicReporting(PeriodicReporting periodicReporting) |
| `HoldTime` | `Integer` | Optional | The time the threshold condition exists, in milliseconds, to recognize an event | Integer getHoldTime() | setHoldTime(Integer holdTime) |
| `AngleAway` | `Integer` | Optional | the threshold value, from verticle, to recognize an event | Integer getAngleAway() | setAngleAway(Integer angleAway) |
| `AngleToward` | `Integer` | Optional | the threshold value, moving towards  verticle, to recognize an event | Integer getAngleToward() | setAngleToward(Integer angleToward) |
| `Tscore` | [`Tscore`](../../doc/models/tscore.md) | Optional | - | Tscore getTscore() | setTscore(Tscore tscore) |

## Example (as JSON)

```json
{
  "hold-time": 5000,
  "angle-away": 5,
  "angle-toward": 5,
  "mode": "reportOnChange",
  "periodic-reporting": {
    "unit": "minutes",
    "hours": 250,
    "minutes": 232
  }
}
```

