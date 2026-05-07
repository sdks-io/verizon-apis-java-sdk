
# Dto Last Reported Time Response

## Structure

`DtoLastReportedTimeResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Event` | [`ResourceEvent`](../../doc/models/resource-event.md) | Optional | - | ResourceEvent getEvent() | setEvent(ResourceEvent event) |
| `Timestamp` | `String` | Optional | - | String getTimestamp() | setTimestamp(String timestamp) |

## Example (as JSON)

```json
{
  "event": {
    "accountclientid": "accountclientid4",
    "callbackurl": "callbackurl0",
    "createdon": "2016-03-13T12:52:32.123Z",
    "description": "description0",
    "deviceid": "deviceid0",
    "errmsg": "errmsg2",
    "fieldid": "fieldid6",
    "foreignid": "foreignid8",
    "lastupdated": "2016-03-13T12:52:32.123Z",
    "state": "state4",
    "versionid": "versionid2"
  },
  "timestamp": "timestamp0"
}
```

