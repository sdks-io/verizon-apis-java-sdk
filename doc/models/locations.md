
# Locations

Location details.

## Structure

`Locations`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressList` | [`List<AddressItem>`](../../doc/models/address-item.md) | Optional | **Constraints**: *Maximum Items*: `100` | List<AddressItem> getAddressList() | setAddressList(List<AddressItem> addressList) |

## Example (as JSON)

```json
{
  "addressList": [
    {
      "addressLine1": "addressLine10",
      "addressLine2": "addressLine28",
      "city": "city8",
      "state": "state4",
      "country": "country2"
    },
    {
      "addressLine1": "addressLine10",
      "addressLine2": "addressLine28",
      "city": "city8",
      "state": "state4",
      "country": "country2"
    }
  ]
}
```

