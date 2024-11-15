
# ESIM Global Device List

## Structure

`ESIMGlobalDeviceList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | The numeric name of the account. | String getAccountName() | setAccountName(String accountName) |
| `ProvisioningStatusFilter` | [`ProvisioningStatusFilterEnum`](../../doc/models/provisioning-status-filter-enum.md) | Optional | The last status of the device as a list filter. | ProvisioningStatusFilterEnum getProvisioningStatusFilter() | setProvisioningStatusFilter(ProvisioningStatusFilterEnum provisioningStatusFilter) |
| `ProfileStatusFilter` | [`ProfileStatusFilterEnum`](../../doc/models/profile-status-filter-enum.md) | Optional | The last status of the device's profile as a filter. | ProfileStatusFilterEnum getProfileStatusFilter() | setProfileStatusFilter(ProfileStatusFilterEnum profileStatusFilter) |
| `CarrierNameFilter` | `String` | Optional | The cellular service provider. | String getCarrierNameFilter() | setCarrierNameFilter(String carrierNameFilter) |
| `DeviceFilter` | [`List<DeviceId2>`](../../doc/models/device-id-2.md) | Optional | An array of device identifiers to filter the list. | List<DeviceId2> getDeviceFilter() | setDeviceFilter(List<DeviceId2> deviceFilter) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "carrierNameFilter": "VerizonWireless",
  "provisioningStatusFilter": "SUSPEND",
  "profileStatusFilter": "DELETE",
  "deviceFilter": [
    {
      "id": "id4",
      "kind": "kind2"
    }
  ]
}
```

