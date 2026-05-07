
# Service Plan Responseforplanner

## Structure

`ServicePlanResponseforplanner`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CarrierServicePlanCode` | `String` | Optional | The name of the service plan code | String getCarrierServicePlanCode() | setCarrierServicePlanCode(String carrierServicePlanCode) |
| `Code` | `String` | Optional | The actiavtion code value. | String getCode() | setCode(String code) |
| `ExtendedAttributes` | [`List<KvPairforplanner>`](../../doc/models/kv-pairforplanner.md) | Optional | key/value pairs assigned by the user for filtering.<br><br>**Constraints**: *Maximum Items*: `5` | List<KvPairforplanner> getExtendedAttributes() | setExtendedAttributes(List<KvPairforplanner> extendedAttributes) |
| `Name` | `String` | Optional | The carrier name of the active profile. | String getName() | setName(String name) |
| `SizeKb` | `Integer` | Optional | size in Kilobytes of the service plan | Integer getSizeKb() | setSizeKb(Integer sizeKb) |

## Example (as JSON)

```json
{
  "carrierServicePlanCode": "carrierServicePlanCode0",
  "code": "code0",
  "extendedAttributes": [
    {
      "key": "key8",
      "value": "value0"
    },
    {
      "key": "key8",
      "value": "value0"
    },
    {
      "key": "key8",
      "value": "value0"
    }
  ],
  "name": "name2",
  "sizeKb": 12
}
```

