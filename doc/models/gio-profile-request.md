
# GIO Profile Request

## Structure

`GIOProfileRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Devices` | [`List<GIODeviceList>`](../../doc/models/gio-device-list.md) | Required | **Constraints**: *Maximum Items*: `100` | List<GIODeviceList> getDevices() | setDevices(List<GIODeviceList> devices) |
| `AccountName` | `String` | Required | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[0-9\-]{3,32}$` | String getAccountName() | setAccountName(String accountName) |
| `SmrsOid` | `String` | Optional | The Subscription Manager Secure Router Object ID, used for remote SIM provisioning. SMSR securely routes the download and management of eSIM profiles. | String getSmrsOid() | setSmrsOid(String smrsOid) |
| `MdnZipCode` | `String` | Optional | **Constraints**: *Minimum Length*: `5`, *Maximum Length*: `5`, *Pattern*: `^[0-9]{5,5}$` | String getMdnZipCode() | setMdnZipCode(String mdnZipCode) |
| `ServicePlan` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9 ]{3,32}$` | String getServicePlan() | setServicePlan(String servicePlan) |

## Example (as JSON)

```json
{
  "devices": [
    {
      "deviceIds": [
        {
          "kind": "kind8",
          "id": "id0"
        }
      ]
    }
  ],
  "accountName": "0000123456-00001",
  "smrsOid": "1.3.6.1.4.1.#####.1.500.200.101.5",
  "mdnZipCode": "12345",
  "servicePlan": "service plan name"
}
```

