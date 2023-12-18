
# Hyper Precise Location Fault

Fault occurred while responding.

## Structure

`HyperPreciseLocationFault`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | Hyper precise location fault code. | String getCode() | setCode(String code) |
| `Message` | `String` | Optional | Hyper precise location fault message. | String getMessage() | setMessage(String message) |
| `DescrIpTion` | `String` | Optional | Hyper precise location fault description. | String getDescrIpTion() | setDescrIpTion(String descrIpTion) |

## Example (as JSON)

```json
{
  "code": "900906",
  "message": "No matching resource found in the API for the given request",
  "description": "Access failure for API. Check the API documentation and add a proper REST resource path to the invocation URL."
}
```

