
# Diagnostic Observation Setting

Diagnostic observation settings and attributes for a device.

## Structure

`DiagnosticObservationSetting`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | The name of the billing account for which callback messages will be sent. Format: "##########-#####". | String getAccountName() | setAccountName(String accountName) |
| `Device` | [`Device`](../../doc/models/device.md) | Optional | Identifies a particular IoT device. | Device getDevice() | setDevice(Device device) |
| `Attributes` | [`List<AttributeSetting>`](../../doc/models/attribute-setting.md) | Optional | Streaming RF parameters for which you want to retrieve diagnostic settings. | List<AttributeSetting> getAttributes() | setAttributes(List<AttributeSetting> attributes) |

## Example (as JSON)

```json
{
  "accountName": "string",
  "device": {
    "id": "864508030026238",
    "kind": "IMEI"
  },
  "attributes": [
    {
      "name": "MANUFACTURER",
      "value": "string",
      "createdOn": "2019-09-07T23:08:03.532Z",
      "isObservable": true,
      "isObserving": true,
      "frequency": {
        "value": 5,
        "unit": "SECOND"
      }
    }
  ]
}
```

