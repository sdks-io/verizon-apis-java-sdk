
# Diagnostics Subscr Ip Tion

Status of the diagnostic services subscription.

## Structure

`DiagnosticsSubscrIpTion`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | Account identifier in "##########-#####". An account name is usually numeric, and must include any leading zeros. | String getAccountName() | setAccountName(String accountName) |
| `CreatedOn` | `LocalDateTime` | Required | The date and time of when the subscription was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `LastUpdated` | `LocalDateTime` | Required | The date and time of when the subscription was last updated. | LocalDateTime getLastUpdated() | setLastUpdated(LocalDateTime lastUpdated) |
| `TotalAllowed` | `int` | Required | Number of licenses currently assigned to devices. | int getTotalAllowed() | setTotalAllowed(int totalAllowed) |
| `TotalUsed` | `int` | Required | Number of licenses currently used by the devices. | int getTotalUsed() | setTotalUsed(int totalUsed) |
| `SkuName` | `String` | Required | Name of the SKU for the account. | String getSkuName() | setSkuName(String skuName) |

## Example (as JSON)

```json
{
  "accountName": "TestQAAccount",
  "skuName": "TS-BUNDLE-KTO-DIAGNOSTIC-MRC",
  "totalAllowed": 100,
  "totalUsed": 50,
  "createdOn": "2019-08-29T00:47:59.240Z",
  "lastUpdated": "2019-08-29T00:47:59.240Z"
}
```

