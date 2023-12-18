
# Fota V3 Subscr Ip Tion

Information for licenses applied to devices.

## Structure

`FotaV3SubscrIpTion`

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
  "accountName": "0000123456-000001",
  "purchaseType": "TS-HFOTA-EVNT,TS-HFOTA-MRC",
  "licenseCount": 500,
  "licenseUsedCount": 400,
  "updateTime": "2020-09-17T21:11:32.170Z"
}
```

