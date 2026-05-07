
# Private Network Apns

## Structure

`PrivateNetworkApns`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ApnName` | `String` | Optional | the Access Point Name | String getApnName() | setApnName(String apnName) |
| `AddressAssignmentMethod` | `String` | Optional | The method used for address assignment. | String getAddressAssignmentMethod() | setAddressAssignmentMethod(String addressAssignmentMethod) |
| `Ipaddress` | `String` | Optional | A IPv4 address | String getIpaddress() | setIpaddress(String ipaddress) |

## Example (as JSON)

```json
{
  "ipAddress": "10.10.10.01",
  "apnName": "apnName8",
  "addressAssignmentMethod": "addressAssignmentMethod4"
}
```

