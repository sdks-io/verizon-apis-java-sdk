
# Account Level Filter

## Structure

`AccountLevelFilter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SeparateOrCombined` | `String` | Optional | Determines whether or not to aggregate usage of multiple accounts together, or separate by account. If this is null or not present, then the trigger will be for an individual line. | String getSeparateOrCombined() | setSeparateOrCombined(String separateOrCombined) |
| `AccountNames` | [`Accountnames`](../../doc/models/accountnames.md) | Optional | - | Accountnames getAccountNames() | setAccountNames(Accountnames accountNames) |

## Example (as JSON)

```json
{
  "separateOrCombined": "Separate",
  "accountNames": {
    "accountNameList": [
      "accountNameList7",
      "accountNameList8",
      "accountNameList9"
    ]
  }
}
```

