
# Device Credential Request Item

## Structure

`DeviceCredentialRequestItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Imei` | `String` | Required | 15-digit alphanumeric identifier<br><br>**Constraints**: *Pattern*: `^[A-Za-z0-9]{15}$` | String getImei() | setImei(String imei) |

## Example (as JSON)

```json
{
  "imei": "221000008775573"
}
```

