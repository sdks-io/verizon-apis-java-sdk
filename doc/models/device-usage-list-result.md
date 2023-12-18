
# Device Usage List Result

Response to return the daily network data usage of a single device during a specified time period.

## Structure

`DeviceUsageListResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HasMoreData` | `Boolean` | Optional | False for a status 200 response.True for a status 202 response, indicating that there is more data to be retrieved. | Boolean getHasMoreData() | setHasMoreData(Boolean hasMoreData) |
| `UsageHistory` | [`List<Usage>`](../../doc/models/usage.md) | Optional | Placeholder. | List<Usage> getUsageHistory() | setUsageHistory(List<Usage> usageHistory) |

## Example (as JSON)

```json
{
  "hasMoreData": false,
  "usageHistory": [
    {
      "bytesUsed": 4096,
      "extendedAttributes": [
        {
          "key": "MoSms",
          "value": "0"
        }
      ],
      "smsUsed": 0,
      "source": "Raw Usage",
      "timestamp": "2020-12-01T00:00:00Z",
      "servicePlan": "servicePlan0"
    }
  ]
}
```

