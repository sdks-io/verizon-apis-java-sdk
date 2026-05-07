
# M5 G Bichange Request

## Structure

`M5gBichangeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | - | String getAccountName() | setAccountName(String accountName) |
| `ServicePlan` | `String` | Optional | - | String getServicePlan() | setServicePlan(String servicePlan) |
| `DeviceListWithServiceAddress` | [`List<M5gBichangeRequestDeviceListWithServiceAddress>`](../../doc/models/containers/m5-g-bichange-request-device-list-with-service-address.md) | Optional | This is List of a container for any-of cases. | List<M5gBichangeRequestDeviceListWithServiceAddress> getDeviceListWithServiceAddress() | setDeviceListWithServiceAddress(List<M5gBichangeRequestDeviceListWithServiceAddress> deviceListWithServiceAddress) |
| `CurrentServicePlan` | `String` | Optional | - | String getCurrentServicePlan() | setCurrentServicePlan(String currentServicePlan) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "servicePlan": "5G BI service plan name being changed to",
  "currentServicePlan": "Optional name of the plan being changed from",
  "deviceListWithServiceAddress": [
    {
      "deviceId": [
        {
          "id": "id0",
          "kind": "kind8"
        },
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
        },
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
        },
        {
          "id": "id0",
          "kind": "kind8"
        }
      ]
    }
  ]
}
```

