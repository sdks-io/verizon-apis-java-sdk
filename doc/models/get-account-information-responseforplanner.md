
# Get Account Information Responseforplanner

## Structure

`GetAccountInformationResponseforplanner`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | - | String getAccountName() | setAccountName(String accountName) |
| `AccountNumber` | `String` | Optional | The numeric name of the account, including leading zeros. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `Carriers` | `List<String>` | Optional | The list of carrier names with profiles.<br><br>**Constraints**: *Maximum Items*: `5` | List<String> getCarriers() | setCarriers(List<String> carriers) |
| `Features` | `List<String>` | Optional | a list of features associated with the resident profiles.<br><br>**Constraints**: *Maximum Items*: `50` | List<String> getFeatures() | setFeatures(List<String> features) |
| `IpPools` | [`List<IPPoolforplanner>`](../../doc/models/ip-poolforplanner.md) | Optional | **Constraints**: *Maximum Items*: `50` | List<IPPoolforplanner> getIpPools() | setIpPools(List<IPPoolforplanner> ipPools) |
| `IsProvisioningAllowed` | `Boolean` | Optional | A flag indicating if provisioning is allowed (true) or provisioning is locked (false). | Boolean getIsProvisioningAllowed() | setIsProvisioningAllowed(Boolean isProvisioningAllowed) |
| `OrganizationName` | `String` | Optional | The user assigned organization name. | String getOrganizationName() | setOrganizationName(String organizationName) |
| `ServicePlans` | [`List<ServicePlanResponseforplanner>`](../../doc/models/service-plan-responseforplanner.md) | Optional | A list of service plans associated with the resident profiles.<br><br>**Constraints**: *Maximum Items*: `10` | List<ServicePlanResponseforplanner> getServicePlans() | setServicePlans(List<ServicePlanResponseforplanner> servicePlans) |

## Example (as JSON)

```json
{
  "accountNumber": "0000123456-00001",
  "accountName": "accountName6",
  "carriers": [
    "carriers2",
    "carriers1"
  ],
  "features": [
    "features3",
    "features4"
  ],
  "ipPools": [
    {
      "isDefaultPool": false,
      "poolName": "poolName2",
      "poolType": "poolType6"
    },
    {
      "isDefaultPool": false,
      "poolName": "poolName2",
      "poolType": "poolType6"
    },
    {
      "isDefaultPool": false,
      "poolName": "poolName2",
      "poolType": "poolType6"
    }
  ]
}
```

