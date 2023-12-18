
# Resources Service Endpoint

Service Endpoint path, address, and port.

## Structure

`ResourcesServiceEndpoint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `URI` | `String` | Optional | URI of Service Endpoint if available.<br>**Constraints**: *Maximum Length*: `32`, *Pattern*: `\w+:(/?/?)[^\s]+` | String getURI() | setURI(String uRI) |
| `FQDN` | `String` | Optional | FQDN of Service Endpoint if available.<br>**Constraints**: *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9.]{3,32}$` | String getFQDN() | setFQDN(String fQDN) |
| `IpV4Address` | `String` | Optional | IPv4 Address of Service Endpoint if available.<br>**Constraints**: *Maximum Length*: `32` | String getIpV4Address() | setIpV4Address(String ipV4Address) |
| `IpV6Address` | `String` | Optional | IPv6 Address of Service Endpoint if available.<br>**Constraints**: *Maximum Length*: `64` | String getIpV6Address() | setIpV6Address(String ipV6Address) |
| `Port` | `Integer` | Optional | Port information of Service Endpoint if IPv4 or IPv6 is mentioned.<br>**Constraints**: `>= 1`, `<= 10000` | Integer getPort() | setPort(Integer port) |

## Example (as JSON)

```json
{
  "URI": "http://base_path/some_segment/id",
  "FQDN": "thingtest.verizon.com",
  "IPv4Address": "192.168.11.10",
  "IPv6Address": "2001:0db8:85a3:0000:0000:8a2e:0370:1234",
  "port": 1234
}
```

