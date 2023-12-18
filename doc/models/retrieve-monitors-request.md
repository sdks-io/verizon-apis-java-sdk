
# Retrieve Monitors Request

## Structure

`RetrieveMonitorsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | The name of a billing account. | String getAccountName() | setAccountName(String accountName) |
| `Devices` | [`List<AccountDeviceList>`](../../doc/models/account-device-list.md) | Optional | The devices for which you want to restore service, specified by device identifier. | List<AccountDeviceList> getDevices() | setDevices(List<AccountDeviceList> devices) |
| `MonitorType` | `String` | Optional | The name of a billing account. | String getMonitorType() | setMonitorType(String monitorType) |

## Example (as JSON)

```json
{
  "accountName": "0868924207-00001",
  "devices": [
    {
      "deviceIds": [
        {
          "id": "89148000000800139708",
          "kind": "iccid"
        }
      ],
      "ipAddress": "ipAddress4"
    }
  ],
  "monitorType": "monitorType"
}
```

