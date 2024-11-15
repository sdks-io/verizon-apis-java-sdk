
# Carrier

## Structure

`Carrier`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Carriers` | `String` | Optional | The list of carriers with active or available profiles<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[0-9]{3,32}$` | String getCarriers() | setCarriers(String carriers) |

## Example (as JSON)

```json
{
  "carriers": "carriers0"
}
```

