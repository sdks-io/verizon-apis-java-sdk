
# Account Group Share Action

## Structure

`AccountGroupShareAction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Notify` | [`Notify`](../../doc/models/notify.md) | Optional | - | Notify getNotify() | setNotify(Notify notify) |

## Example (as JSON)

```json
{
  "notify": {
    "alertType": "alertType8",
    "threshold": [
      {
        "carrierCode": "carrierCode4",
        "percentage": {
          "percentage50": false,
          "percentage75": false,
          "percentage90": false,
          "percentage100": false
        }
      },
      {
        "carrierCode": "carrierCode4",
        "percentage": {
          "percentage50": false,
          "percentage75": false,
          "percentage90": false,
          "percentage100": false
        }
      },
      {
        "carrierCode": "carrierCode4",
        "percentage": {
          "percentage50": false,
          "percentage75": false,
          "percentage90": false,
          "percentage100": false
        }
      }
    ]
  }
}
```

