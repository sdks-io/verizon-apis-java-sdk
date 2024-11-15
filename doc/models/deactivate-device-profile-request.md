
# Deactivate Device Profile Request

## Structure

`DeactivateDeviceProfileRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | - | String getAccountName() | setAccountName(String accountName) |
| `ReasonCode` | `String` | Required | - | String getReasonCode() | setReasonCode(String reasonCode) |
| `Devices` | [`List<DeactivateDeviceList>`](../../doc/models/deactivate-device-list.md) | Optional | **Constraints**: *Maximum Items*: `100` | List<DeactivateDeviceList> getDevices() | setDevices(List<DeactivateDeviceList> devices) |
| `CarrierName` | `String` | Optional | - | String getCarrierName() | setCarrierName(String carrierName) |
| `EtfWaiver` | `Boolean` | Optional | **Default**: `true` | Boolean getEtfWaiver() | setEtfWaiver(Boolean etfWaiver) |
| `CheckFallbackProfile` | `Boolean` | Optional | **Default**: `false` | Boolean getCheckFallbackProfile() | setCheckFallbackProfile(Boolean checkFallbackProfile) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "reasonCode": "a short code for the reason action was taken",
  "carrierName": "the name of the mobile service provider",
  "etfWaiver": true,
  "checkFallbackProfile": false,
  "devices": [
    {
      "ids": [
        {
          "id": "id4",
          "kind": "kind2"
        },
        {
          "id": "id4",
          "kind": "kind2"
        },
        {
          "id": "id4",
          "kind": "kind2"
        }
      ]
    },
    {
      "ids": [
        {
          "id": "id4",
          "kind": "kind2"
        },
        {
          "id": "id4",
          "kind": "kind2"
        },
        {
          "id": "id4",
          "kind": "kind2"
        }
      ]
    },
    {
      "ids": [
        {
          "id": "id4",
          "kind": "kind2"
        },
        {
          "id": "id4",
          "kind": "kind2"
        },
        {
          "id": "id4",
          "kind": "kind2"
        }
      ]
    }
  ]
}
```

