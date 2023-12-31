
# Callback Registered

Registered callback listener.

## Structure

`CallbackRegistered`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | The billing account number for which callback messages will be sent. | String getAccountName() | setAccountName(String accountName) |
| `Name` | `String` | Required | The name of the callback service, which identifies the type and format of messages that will be sent to the registered URL. | String getName() | setName(String name) |

## Example (as JSON)

```json
{
  "accountName": "0844021539-00001",
  "name": "BullseyeReporting"
}
```

