
# Device List Query Result

List of devices.

## Structure

`DeviceListQueryResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | Account identifier in "##########-#####". | String getAccountName() | setAccountName(String accountName) |
| `HasMoreData` | `Boolean` | Optional | True if there are more devices to retrieve. | Boolean getHasMoreData() | setHasMoreData(Boolean hasMoreData) |
| `LastSeenDeviceId` | `Long` | Optional | If hasMoreData=true, the startIndex to use for the next request. 0 if hasMoreData=false. | Long getLastSeenDeviceId() | setLastSeenDeviceId(Long lastSeenDeviceId) |
| `DeviceList` | [`List<DeviceListQueryItem>`](../../doc/models/device-list-query-item.md) | Optional | The list of devices in the account. | List<DeviceListQueryItem> getDeviceList() | setDeviceList(List<DeviceListQueryItem> deviceList) |

## Example (as JSON)

```json
{
  "accountName": "0242078698-00001",
  "hasMoreData": true,
  "lastSeenDeviceId": 900000000001000,
  "deviceList": [
    {
      "deviceId": "900000000000001",
      "mdn": "0000040881",
      "model": "Model-A",
      "make": "Verizon",
      "firmware": "VerizonFirmwareVersion-01",
      "fotaEligible": true,
      "licenseAssigned": true,
      "upgradeTime": "2018-03-03T16:03:33.000Z"
    },
    {
      "deviceId": "900000000000999",
      "mdn": "0000041879",
      "model": "Model-A",
      "make": "Verizon",
      "firmware": "VerizonFirmwareVersion-01",
      "fotaEligible": true,
      "licenseAssigned": true,
      "upgradeTime": "2018-03-03T16:03:33.000Z"
    },
    {
      "deviceId": "900000000001000",
      "mdn": "0000041880",
      "model": "Model-A",
      "make": "Verizon",
      "firmware": "VerizonFirmwareVersion-01",
      "fotaEligible": true,
      "licenseAssigned": true,
      "upgradeTime": "2018-03-03T16:03:33.000Z"
    }
  ]
}
```

