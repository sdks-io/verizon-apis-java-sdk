
# Account Consent Update

## Structure

`AccountConsentUpdate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | The numeric name of the account, including leading zeros. | String getAccountName() | setAccountName(String accountName) |
| `AllDeviceConsent` | `Integer` | Optional | The consent setting to use for all the devices in the account. | Integer getAllDeviceConsent() | setAllDeviceConsent(Integer allDeviceConsent) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "allDeviceConsent": 0
}
```

