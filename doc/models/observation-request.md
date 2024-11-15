
# Observation Request

Used to define callbacks including the device identity, the attribute names, corresponding attribute values and the date/timestamp of when the observation was made.

## Structure

`ObservationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | Account identifier in "##########-#####". | String getAccountName() | setAccountName(String accountName) |
| `Devices` | [`List<Device>`](../../doc/models/device.md) | Required | List of devices. | List<Device> getDevices() | setDevices(List<Device> devices) |
| `Attributes` | [`List<ObservationRequestAttribute>`](../../doc/models/observation-request-attribute.md) | Required | Attributes are streaming RF parameters that you want to observe. | List<ObservationRequestAttribute> getAttributes() | setAttributes(List<ObservationRequestAttribute> attributes) |
| `Frequency` | [`NumericalData`](../../doc/models/numerical-data.md) | Optional | Describes value and unit of time. | NumericalData getFrequency() | setFrequency(NumericalData frequency) |
| `Duration` | [`NumericalData`](../../doc/models/numerical-data.md) | Optional | Describes value and unit of time. | NumericalData getDuration() | setDuration(NumericalData duration) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "attributes": [
    {
      "name": "RADIO_SIGNAL_STRENGTH"
    },
    {
      "name": "LINK_QUALITY"
    },
    {
      "name": "NETWORK_BEARER"
    },
    {
      "name": "CELL_ID"
    }
  ],
  "devices": [
    {
      "id": "864508030026238",
      "kind": "IMEI"
    }
  ],
  "frequency": {
    "value": 76,
    "unit": "SECOND"
  },
  "duration": {
    "value": 176,
    "unit": "SECOND"
  }
}
```

