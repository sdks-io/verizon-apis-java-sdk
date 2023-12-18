
# Fota V2 Subscr Ip Tion

FOTA Subscription.

## Structure

`FotaV2SubscrIpTion`

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
  "accountName": "00000000000-123345",
  "purchaseType": "TS-HFOTA-EVNT,TS-HFOTA-MRC",
  "licenseCount": 500,
  "licenseUsedCount": 400,
  "updateTime": "2021-06-03 00:03:56.079 +0000 UTC"
}
```

