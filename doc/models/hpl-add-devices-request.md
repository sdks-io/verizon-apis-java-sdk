
# Hpl Add Devices Request

Request to add the devices.

## Structure

`HplAddDevicesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | `String` | Optional | The initial service state for the devices. The only valid state is "Preactive." | String getState() | setState(String state) |
| `DevicesToAdd` | [`List<HplAccountDeviceList>`](../../doc/models/hpl-account-device-list.md) | Optional | The devices that you want to add. | List<HplAccountDeviceList> getDevicesToAdd() | setDevicesToAdd(List<HplAccountDeviceList> devicesToAdd) |
| `AccountName` | `String` | Optional | The numeric name of the account and must include leading zeroes. | String getAccountName() | setAccountName(String accountName) |
| `CustomFields` | [`List<HplCustomFields>`](../../doc/models/hpl-custom-fields.md) | Optional | The names and values for any custom fields that you want set for the devices as they are added to the account. | List<HplCustomFields> getCustomFields() | setCustomFields(List<HplCustomFields> customFields) |
| `GroupName` | `String` | Optional | The name of a device group to add the devices to. They are added to the default device group if you don't include this parameter. | String getGroupName() | setGroupName(String groupName) |
| `SkuNumber` | `String` | Optional | The Stock Keeping Unit (SKU) number of a 4G device type with an embedded SIM. | String getSkuNumber() | setSkuNumber(String skuNumber) |
| `SmsrOid` | `String` | Optional | The Subscription Manager Secure Router Object ID, used for remote SIM provisioning. SMSR securely routes the download and management of eSIM profiles. | String getSmsrOid() | setSmsrOid(String smsrOid) |
| `NumberOfVirtualImei` | `Integer` | Optional | numberOfVirtualImei. | Integer getNumberOfVirtualImei() | setNumberOfVirtualImei(Integer numberOfVirtualImei) |
| `UploadType` | `String` | Optional | uploadType. | String getUploadType() | setUploadType(String uploadType) |

## Example (as JSON)

```json
{
  "state": "preactive",
  "devicesToAdd": [
    {
      "deviceIds": [
        {
          "kind": "imei",
          "id": "15-digit IMEI"
        },
        {
          "kind": "iccid",
          "id": "20-digit ICCID"
        }
      ]
    },
    {
      "deviceIds": [
        {
          "kind": "imei",
          "id": "15-digit IMEI"
        },
        {
          "kind": "iccid",
          "id": "20-digit ICCID"
        }
      ]
    }
  ],
  "accountName": "0000123456-00001",
  "customFields": [
    {
      "key": "CustomField2",
      "value": "SuperVend"
    }
  ],
  "groupName": "West Region",
  "numberOfVirtualImei": 1
}
```

