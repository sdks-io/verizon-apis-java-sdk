
# Account Details

## Structure

`AccountDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | The numeric name of the account, in the format "0000123456-00001". Leading zeros must be included.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[0-9-]{3,32}$` | String getAccountName() | setAccountName(String accountName) |
| `AccountNumber` | `String` | Optional | The numeric name of the account, in the format "0000123456-00001". Leading zeros must be included.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[0-9-]{3,32}$` | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `OrganizationName` | `String` | Optional | user defined name of organization<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[0-9]{3,32}$` | String getOrganizationName() | setOrganizationName(String organizationName) |
| `IsProvisioningAllowed` | `Boolean` | Optional | Flag set to indicate if account details can be edited or not. Default is "true". | Boolean getIsProvisioningAllowed() | setIsProvisioningAllowed(Boolean isProvisioningAllowed) |
| `Carriers` | [`List<Carrier>`](../../doc/models/carrier.md) | Optional | - | List<Carrier> getCarriers() | setCarriers(List<Carrier> carriers) |
| `Features` | [`List<Feature>`](../../doc/models/feature.md) | Optional | - | List<Feature> getFeatures() | setFeatures(List<Feature> features) |
| `ServicePlans` | [`List<CarrierServicePlan>`](../../doc/models/carrier-service-plan.md) | Optional | - | List<CarrierServicePlan> getServicePlans() | setServicePlans(List<CarrierServicePlan> servicePlans) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "accountNumber": "0000123456-00001",
  "organizationName": "organizationName2",
  "isProvisioningAllowed": false,
  "carriers": [
    {
      "carriers": "carriers0"
    },
    {
      "carriers": "carriers0"
    },
    {
      "carriers": "carriers0"
    }
  ]
}
```

