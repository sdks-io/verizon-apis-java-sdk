
# Error Response Exception

## Structure

`ErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ResponseCode` | `String` | Optional | - | String getResponseCodeField() | setResponseCodeField(String responseCodeField) |
| `Message` | `String` | Optional | - | String getMessageField() | setMessageField(String messageField) |

## Example (as JSON)

```json
{
  "responseCode": "INVALID_ACCESS",
  "message": "UWS verification failure (Common exception)"
}
```

