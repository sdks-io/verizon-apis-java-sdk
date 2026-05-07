
# ESIM Device List

## Structure

`ESIMDeviceList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceIds` | [`List<ESIMDeviceListDeviceIds>`](../../doc/models/containers/esim-device-list-device-ids.md) | Optional | This is List of a container for any-of cases.<br><br>**Constraints**: *Maximum Items*: `100` | List<ESIMDeviceListDeviceIds> getDeviceIds() | setDeviceIds(List<ESIMDeviceListDeviceIds> deviceIds) |

## Example (as JSON)

```json
{
  "deviceIds": [
    {
      "id": "id4",
      "kind": "kind2"
    }
  ]
}
```

