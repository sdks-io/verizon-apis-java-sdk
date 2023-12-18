
# Associate Label Request

## Structure

`AssociateLabelRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | The name of a billing account. An account name is usually numeric, and must include any leading zeros. | String getAccountName() | setAccountName(String accountName) |
| `Labels` | [`AccountLabels`](../../doc/models/account-labels.md) | Optional | Maximum of 2,000 objects are allowed in the array. | AccountLabels getLabels() | setLabels(AccountLabels labels) |

## Example (as JSON)

```json
{
  "accountName": "1223334444-00001",
  "labels": {
    "devices": [
      {
        "deviceIds": [
          {
            "id": "id0",
            "kind": "kind8"
          }
        ]
      },
      {
        "deviceIds": [
          {
            "id": "id0",
            "kind": "kind8"
          }
        ]
      },
      {
        "deviceIds": [
          {
            "id": "id0",
            "kind": "kind8"
          }
        ]
      }
    ],
    "label": [
      {
        "name": "name0",
        "value": "value2"
      },
      {
        "name": "name0",
        "value": "value2"
      },
      {
        "name": "name0",
        "value": "value2"
      }
    ]
  }
}
```

