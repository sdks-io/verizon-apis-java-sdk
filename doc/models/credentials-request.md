
# Credentials Request

## Structure

`CredentialsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ECPD` | `String` | Required | Enterprise Customer Profile ID | String getECPD() | setECPD(String eCPD) |
| `AccountNumber` | `String` | Required | Billing Account Number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `Items` | [`List<DeviceCredentialRequestItem>`](../../doc/models/device-credential-request-item.md) | Required | List of devices (1-50 items)<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `50` | List<DeviceCredentialRequestItem> getItems() | setItems(List<DeviceCredentialRequestItem> items) |

## Example (as JSON)

```json
{
  "ECPD": "3161585",
  "accountNumber": "0844021539-00001",
  "items": [
    {
      "imei": "221000008775573"
    }
  ]
}
```

