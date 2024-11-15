
# 5g Biaccount Nameobject

## Structure

`M5gBiaccountNameobject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | - | String getAccountName() | setAccountName(String accountName) |
| `BillingCycleEndDate` | `String` | Optional | - | String getBillingCycleEndDate() | setBillingCycleEndDate(String billingCycleEndDate) |
| `CarrierInformation` | [`List<M5gBiCarrierInformation>`](../../doc/models/5g-bi-carrier-information.md) | Optional | - | List<M5gBiCarrierInformation> getCarrierInformation() | setCarrierInformation(List<M5gBiCarrierInformation> carrierInformation) |
| `Connected` | `Boolean` | Optional | - | Boolean getConnected() | setConnected(Boolean connected) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `CustomFields` | [`List<M5gBikeyValue1>`](../../doc/models/5g-bikey-value-1.md) | Optional | - | List<M5gBikeyValue1> getCustomFields() | setCustomFields(List<M5gBikeyValue1> customFields) |
| `DeviceIds` | [`List<M5gBideviceId1>`](../../doc/models/5g-bidevice-id-1.md) | Optional | - | List<M5gBideviceId1> getDeviceIds() | setDeviceIds(List<M5gBideviceId1> deviceIds) |
| `ExtendedAttributes` | [`List<M5gBikeyValue1>`](../../doc/models/5g-bikey-value-1.md) | Optional | - | List<M5gBikeyValue1> getExtendedAttributes() | setExtendedAttributes(List<M5gBikeyValue1> extendedAttributes) |
| `GroupNames` | [`List<GroupName>`](../../doc/models/group-name.md) | Optional | - | List<GroupName> getGroupNames() | setGroupNames(List<GroupName> groupNames) |
| `Ipaddress` | `String` | Optional | - | String getIpaddress() | setIpaddress(String ipaddress) |
| `LastActivationBy` | `String` | Optional | - | String getLastActivationBy() | setLastActivationBy(String lastActivationBy) |
| `LastActivationDate` | `String` | Optional | - | String getLastActivationDate() | setLastActivationDate(String lastActivationDate) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "billingCycleEndDate": "11/10/2022 00:00:00",
  "connected": false,
  "createdAt": "10/20/2022 18:23:41",
  "ipAddress": "0.0.0.0",
  "lastActivationBy": "User Name",
  "lastActivationDate": "2022-11-02 T21:36:18Z",
  "carrierInformation": [
    {
      "carrierName": "carrierName4"
    },
    {
      "carrierName": "carrierName4"
    },
    {
      "carrierName": "carrierName4"
    }
  ]
}
```

