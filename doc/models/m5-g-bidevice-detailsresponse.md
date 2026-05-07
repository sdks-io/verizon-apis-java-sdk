
# M5 G Bidevice Detailsresponse

## Structure

`M5gBideviceDetailsresponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HasMoreData` | `Boolean` | Optional | - | Boolean getHasMoreData() | setHasMoreData(Boolean hasMoreData) |
| `Devices` | [`List<M5gBideviceDetailsresponseDevices>`](../../doc/models/containers/m5-g-bidevice-detailsresponse-devices.md) | Optional | This is List of a container for any-of cases. | List<M5gBideviceDetailsresponseDevices> getDevices() | setDevices(List<M5gBideviceDetailsresponseDevices> devices) |

## Example (as JSON)

```json
{
  "hasMoreData": false,
  "devices": [
    {
      "accountName": "accountName0",
      "billingCycleEndDate": "billingCycleEndDate6",
      "carrierInformation": [
        {
          "carrierName": "carrierName4"
        },
        {
          "carrierName": "carrierName4"
        },
        {
          "carrierName": "carrierName4"
        }
      ],
      "connected": false,
      "createdAt": "createdAt0"
    },
    {
      "accountName": "accountName0",
      "billingCycleEndDate": "billingCycleEndDate6",
      "carrierInformation": [
        {
          "carrierName": "carrierName4"
        },
        {
          "carrierName": "carrierName4"
        },
        {
          "carrierName": "carrierName4"
        }
      ],
      "connected": false,
      "createdAt": "createdAt0"
    },
    {
      "accountName": "accountName0",
      "billingCycleEndDate": "billingCycleEndDate6",
      "carrierInformation": [
        {
          "carrierName": "carrierName4"
        },
        {
          "carrierName": "carrierName4"
        },
        {
          "carrierName": "carrierName4"
        }
      ],
      "connected": false,
      "createdAt": "createdAt0"
    }
  ]
}
```

