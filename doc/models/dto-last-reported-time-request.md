
# Dto Last Reported Time Request

## Structure

`DtoLastReportedTimeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Accountname` | `String` | Optional | The numeric account name, which must include leading zeros | String getAccountname() | setAccountname(String accountname) |
| `Resourceidentifier` | [`DtoDeviceResourceIdentifier`](../../doc/models/dto-device-resource-identifier.md) | Optional | Device identifiers, one or more are required | DtoDeviceResourceIdentifier getResourceidentifier() | setResourceidentifier(DtoDeviceResourceIdentifier resourceidentifier) |

## Example (as JSON)

```json
{
  "accountname": "0000123456-00001",
  "resourceidentifier": {
    "deveui": "deveui2",
    "deviceid": "deviceid6",
    "esn": 86,
    "iccid": "iccid0",
    "imei": 2
  }
}
```

