
# V1 Account Subscr Ip Tion

Account subscription information.

## Structure

`V1AccountSubscrIpTion`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | Account identifier in "##########-#####". | String getAccountName() | setAccountName(String accountName) |
| `PurchaseType` | `String` | Optional | Subscription models used by the account. | String getPurchaseType() | setPurchaseType(String purchaseType) |
| `LicenseCount` | `Integer` | Optional | Number of monthly licenses in an MRC subscription. | Integer getLicenseCount() | setLicenseCount(Integer licenseCount) |
| `LicenseUsedCount` | `Integer` | Optional | Number of licenses currently assigned to devices. | Integer getLicenseUsedCount() | setLicenseUsedCount(Integer licenseUsedCount) |
| `UpdateTime` | `String` | Optional | The date and time of when the subscription was last updated. | String getUpdateTime() | setUpdateTime(String updateTime) |

## Example (as JSON)

```json
{
  "accountName": "0402196254-00001",
  "purchaseType": "TS-HFOTA-EVNT,TS-HFOTA-MRC",
  "licenseCount": 9000,
  "licenseUsedCount": 1000,
  "updateTime": "2018-03-02T16:03:06.000Z"
}
```

