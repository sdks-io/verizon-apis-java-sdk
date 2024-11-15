
# Consent Transaction ID

The transaction ID of the request, from the POST /devicelocations synchronous response.

## Structure

`ConsentTransactionID`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionId` | `String` | Optional | - | String getTransactionId() | setTransactionId(String transactionId) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |

## Example (as JSON)

```json
{
  "transactionId": "2c90bd28-eeee-ffff-gggg-7e3bd4fbff33",
  "status": "QUEUED"
}
```

