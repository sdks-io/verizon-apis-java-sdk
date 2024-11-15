
# Edge Discovery Result Exception

Base type for all errors.

## Structure

`EdgeDiscoveryResultException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | `String` | Required | HTTP status code or status of response.<br>**Constraints**: *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getStatus() | setStatus(String status) |
| `Message` | `String` | Required | Error details.<br>**Constraints**: *Maximum Length*: `32` | String getMessageField() | setMessageField(String messageField) |
| `Data` | [`EdgeDiscoveryResultData`](../../doc/models/edge-discovery-result-data.md) | Optional | For cases where user input exceeds the boundary values an additional 'data' key will be returned with a relevant description. | EdgeDiscoveryResultData getData() | setData(EdgeDiscoveryResultData data) |

## Example (as JSON)

```json
{
  "status": "status4",
  "message": "message2",
  "data": {
    "additionalMessage": "additionalMessage2"
  }
}
```

