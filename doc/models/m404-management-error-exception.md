
# M404 Management Error Exception

## Structure

`M404ManagementErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Error` | `String` | Optional | - | String getError() | setError(String error) |
| `ErrorDescription` | `String` | Optional | **Constraints**: *Maximum Length*: `1000` | String getErrorDescription() | setErrorDescription(String errorDescription) |
| `Cause` | `String` | Optional | - | String getCauseField() | setCauseField(String causeField) |

## Example (as JSON)

```json
{
  "error": "Error name or code",
  "error_description": "A longer error description.",
  "cause": "A cause for the error"
}
```

