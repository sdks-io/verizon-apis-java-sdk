
# 5g Bi Address

## Structure

`M5gBiAddress`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressLine1` | `String` | Optional | - | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `City` | `String` | Optional | - | String getCity() | setCity(String city) |
| `State` | `String` | Optional | - | String getState() | setState(String state) |
| `Zip` | `String` | Optional | - | String getZip() | setZip(String zip) |
| `Zip4` | `String` | Optional | - | String getZip4() | setZip4(String zip4) |
| `Phone` | `String` | Optional | - | String getPhone() | setPhone(String phone) |
| `PhoneType` | `String` | Optional | - | String getPhoneType() | setPhoneType(String phoneType) |
| `EmailAddress` | `String` | Optional | - | String getEmailAddress() | setEmailAddress(String emailAddress) |

## Example (as JSON)

```json
{
  "addressLine1": "number and street",
  "city": "city",
  "state": "2-letter state ID (conforms to ISO 3166-2)",
  "zip": "5-digit zip code",
  "zip+4": "the +4 digits used for zip codes",
  "phone": "a 10-digit phone number",
  "phoneType": "W",
  "emailAddress": "email@emailaddress.com"
}
```

