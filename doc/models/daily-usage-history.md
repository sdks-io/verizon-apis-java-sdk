
# Daily Usage History

## Structure

`DailyUsageHistory`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BytesUsed` | `String` | Optional | the total data usage recorded in Bytes<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `32`, *Pattern*: `^[0-9]{1,32}$` | String getBytesUsed() | setBytesUsed(String bytesUsed) |
| `ExtendedAttributes` | [`List<ExtendedAttribute>`](../../doc/models/extended-attribute.md) | Optional | - | List<ExtendedAttribute> getExtendedAttributes() | setExtendedAttributes(List<ExtendedAttribute> extendedAttributes) |
| `ServicePlan` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getServicePlan() | setServicePlan(String servicePlan) |
| `SmsUsed` | `String` | Optional | The total number of SMS messages from and to the device<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `32`, *Pattern*: `^[0-9]{1,32}$` | String getSmsUsed() | setSmsUsed(String smsUsed) |
| `Source` | `String` | Optional | Where the collected data is being gathered from<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getSource() | setSource(String source) |
| `Timestamp` | `String` | Optional | Timestamp of when the retrieved record was completed ($datetime)<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getTimestamp() | setTimestamp(String timestamp) |

## Example (as JSON)

```json
{
  "bytesUsed": "123456",
  "smsUsed": "5",
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
  "servicePlan": "servicePlan6",
  "source": "source2"
}
```

