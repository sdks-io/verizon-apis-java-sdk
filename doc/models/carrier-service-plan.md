
# Carrier Service Plan

## Structure

`CarrierServicePlan`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The name of the service plan<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[0-9]{3,32}$` | String getName() | setName(String name) |
| `Code` | `String` | Optional | The inventory name or system name of the service plan<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[0-9]{3,32}$` | String getCode() | setCode(String code) |
| `SizeKb` | `String` | Optional | The ammount of space the service plan will occupy on the Subscriber Information Module (SIM)<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[0-9]{3,32}$` | String getSizeKb() | setSizeKb(String sizeKb) |
| `CarrierServicePlanCode` | `String` | Optional | The billing record ID. This can be numeric, alpha or alphanumeric.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[0-9]{3,32}$` | String getCarrierServicePlanCode() | setCarrierServicePlanCode(String carrierServicePlanCode) |

## Example (as JSON)

```json
{
  "name": "name6",
  "code": "code4",
  "sizeKb": "sizeKb6",
  "carrierServicePlanCode": "carrierServicePlanCode4"
}
```

