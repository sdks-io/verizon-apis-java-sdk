
# Carrier Deactivate Request

Request to deactivate a carrier.

## Structure

`CarrierDeactivateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | The name of a billing account. | String getAccountName() | setAccountName(String accountName) |
| `CustomFields` | [`List<CustomFields>`](../../doc/models/custom-fields.md) | Optional | Custom field names and values, if you want to only include devices that have matching values. | List<CustomFields> getCustomFields() | setCustomFields(List<CustomFields> customFields) |
| `Devices` | [`List<AccountDeviceList>`](../../doc/models/account-device-list.md) | Optional | The devices for which you want to deactivate service, specified by device identifier. | List<AccountDeviceList> getDevices() | setDevices(List<AccountDeviceList> devices) |
| `EtfWaiver` | `Boolean` | Optional | Fees may be assessed for deactivating Verizon Wireless devices, depending on the account contract. The etfWaiver parameter waives the Early Termination Fee (ETF), if applicable. | Boolean getEtfWaiver() | setEtfWaiver(Boolean etfWaiver) |
| `GroupName` | `String` | Optional | The name of a device group, if you want to deactivate all devices in that group. | String getGroupName() | setGroupName(String groupName) |
| `ReasonCode` | `String` | Optional | Code identifying the reason for the deactivation. Currently the only valid reason code is “FF”, which corresponds to General Admin/Maintenance. | String getReasonCode() | setReasonCode(String reasonCode) |
| `ServicePlan` | `String` | Optional | The name of a service plan, if you want to only include devices that have that service plan. | String getServicePlan() | setServicePlan(String servicePlan) |
| `DeleteAfterDeactivation` | `Boolean` | Optional | - | Boolean getDeleteAfterDeactivation() | setDeleteAfterDeactivation(Boolean deleteAfterDeactivation) |

## Example (as JSON)

```json
{
  "devices": [
    {
      "deviceIds": [
        {
          "id": "20-digit ICCID",
          "kind": "iccid"
        }
      ],
      "ipAddress": "ipAddress4"
    }
  ],
  "reasonCode": "FF",
  "etfWaiver": true,
  "accountName": "accountName2",
  "customFields": [
    {
      "key": "key0",
      "value": "value2"
    },
    {
      "key": "key0",
      "value": "value2"
    },
    {
      "key": "key0",
      "value": "value2"
    }
  ],
  "groupName": "groupName8"
}
```

