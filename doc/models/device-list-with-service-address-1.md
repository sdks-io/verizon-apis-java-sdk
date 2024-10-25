
# Device List With Service Address 1

## Structure

`DeviceListWithServiceAddress1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceId` | [`List<M5gBideviceId1>`](../../doc/models/5g-bidevice-id-1.md) | Optional | - | List<M5gBideviceId1> getDeviceId() | setDeviceId(List<M5gBideviceId1> deviceId) |
| `PrimaryPlaceofuse` | [`M5gBiprimaryPlaceofuse`](../../doc/models/5g-biprimary-placeofuse.md) | Optional | - | M5gBiprimaryPlaceofuse getPrimaryPlaceofuse() | setPrimaryPlaceofuse(M5gBiprimaryPlaceofuse primaryPlaceofuse) |

## Example (as JSON)

```json
{
  "deviceId": [
    {
      "id": "id0",
      "kind": "kind8"
    }
  ],
  "primaryPlaceofuse": {
    "address": {
      "addressLine1": "addressLine18",
      "city": "city6",
      "state": "state2",
      "zip": "zip0",
      "zip+4": "zip+48"
    },
    "customerName": {
      "firstName": "firstName4",
      "lastName": "lastName4",
      "middleName": "middleName8",
      "title": "title4",
      "suffex": "suffex4"
    }
  }
}
```

