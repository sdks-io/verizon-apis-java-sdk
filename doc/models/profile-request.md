
# Profile Request

## Structure

`ProfileRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Devices` | [`List<DeviceList>`](../../doc/models/device-list.md) | Optional | **Constraints**: *Maximum Items*: `100` | List<DeviceList> getDevices() | setDevices(List<DeviceList> devices) |
| `CarrierName` | `String` | Optional | - | String getCarrierName() | setCarrierName(String carrierName) |
| `AccountName` | `String` | Optional | - | String getAccountName() | setAccountName(String accountName) |
| `ServicePlan` | `String` | Optional | - | String getServicePlan() | setServicePlan(String servicePlan) |
| `MdnZIpCode` | `String` | Optional | - | String getMdnZIpCode() | setMdnZIpCode(String mdnZIpCode) |
| `PrimaryPlaceOfUse` | [`List<PrimaryPlaceOfUse>`](../../doc/models/primary-place-of-use.md) | Optional | **Constraints**: *Maximum Items*: `25` | List<PrimaryPlaceOfUse> getPrimaryPlaceOfUse() | setPrimaryPlaceOfUse(List<PrimaryPlaceOfUse> primaryPlaceOfUse) |
| `SmsrOid` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `46`, *Pattern*: `^[0-9.]{3,46}$` | String getSmsrOid() | setSmsrOid(String smsrOid) |
| `CarrierIpPoolName` | `String` | Optional | The name of the pool of IP addresses assigned to the profile. | String getCarrierIpPoolName() | setCarrierIpPoolName(String carrierIpPoolName) |

## Example (as JSON)

```json
{
  "carrierName": "the name of the mobile service provider",
  "accountName": "0000123456-00001",
  "servicePlan": "The service plan name",
  "mdnZipCode": "five digit zip code",
  "devices": [
    {
      "deviceIds": [
        {
          "id": "id0",
          "kind": "kind8"
        }
      ]
    },
    {
      "deviceIds": [
        {
          "id": "id0",
          "kind": "kind8"
        }
      ]
    }
  ]
}
```

