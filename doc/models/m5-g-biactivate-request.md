
# M5 G Biactivate Request

## Structure

`M5gBiactivateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | - | String getAccountName() | setAccountName(String accountName) |
| `ServicePlan` | `String` | Optional | - | String getServicePlan() | setServicePlan(String servicePlan) |
| `DeviceListWithServiceAddress` | [`List<M5gBiactivateRequestDeviceListWithServiceAddress>`](../../doc/models/containers/m5-g-biactivate-request-device-list-with-service-address.md) | Optional | This is List of a container for any-of cases. | List<M5gBiactivateRequestDeviceListWithServiceAddress> getDeviceListWithServiceAddress() | setDeviceListWithServiceAddress(List<M5gBiactivateRequestDeviceListWithServiceAddress> deviceListWithServiceAddress) |
| `SkuNumber` | `String` | Optional | - | String getSkuNumber() | setSkuNumber(String skuNumber) |
| `PublicIpRestriction` | `String` | Optional | - | String getPublicIpRestriction() | setPublicIpRestriction(String publicIpRestriction) |
| `CarrierName` | `String` | Optional | - | String getCarrierName() | setCarrierName(String carrierName) |
| `MdnZipCode` | `String` | Optional | - | String getMdnZipCode() | setMdnZipCode(String mdnZipCode) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "servicePlan": "service plan name",
  "skuNumber": "VZW Stock Keeping Unit number",
  "publicIpRestriction": "Unrestricted",
  "carrierName": "Verizon Wireless",
  "mdnZipCode": "5-digit zip code",
  "deviceListWithServiceAddress": [
    {
      "deviceId": [
        {
          "id": "id0",
          "kind": "kind8"
        }
      ]
    },
    {
      "deviceId": [
        {
          "id": "id0",
          "kind": "kind8"
        }
      ]
    }
  ]
}
```

