
# Aggregate Usage Error

Error reported by a device.

## Structure

`AggregateUsageError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Imei` | `String` | Optional | The International Mobile Equipment Identifier of the device. | String getImei() | setImei(String imei) |
| `ErrorMessage` | `String` | Optional | A general error message. | String getErrorMessage() | setErrorMessage(String errorMessage) |
| `ErrorResponse` | [`IErrorMessage`](../../doc/models/i-error-message.md) | Optional | Error message. | IErrorMessage getErrorResponse() | setErrorResponse(IErrorMessage errorResponse) |

## Example (as JSON)

```json
{
  "imei": "15-digit IMEI",
  "errorMessage": "errorMessage4",
  "errorResponse": {
    "errorCode": "INVALID_PARAMETER",
    "errorMessage": "errorMessage4",
    "httpStatusCode": "423 LOCKED",
    "detailErrorMessage": "detailErrorMessage6"
  }
}
```

