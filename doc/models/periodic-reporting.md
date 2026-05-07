
# Periodic Reporting

The units and values of the time interval for the sensor to send a report

## Structure

`PeriodicReporting`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Unit` | [`UnitEnum`](../../doc/models/unit-enum.md) | Optional | - | UnitEnum getUnit() | setUnit(UnitEnum unit) |
| `Hours` | `Integer` | Optional | whole numbers from 0 to 24 | Integer getHours() | setHours(Integer hours) |
| `Minutes` | `Integer` | Optional | whole numbers from 0 to 59 | Integer getMinutes() | setMinutes(Integer minutes) |

## Example (as JSON)

```json
{
  "hours": 0,
  "minutes": 12,
  "unit": "minutes"
}
```

