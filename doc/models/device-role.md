
# Device Role

The access rule (DeviceRole object) defines the topics the application or device can publish or subscribe to. It also defines how many parallel subscriptions one device or application can have and how fast it can publish messages.

## Structure

`DeviceRole`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The unique name of the access rule.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1000`, *Pattern*: `^[a-zA-Z0-9_$\{\}:.-]+$` | String getName() | setName(String name) |
| `SubscribeLimit` | `Integer` | Optional | The maximum number of subscriptions that one application or device can make.<br><br>**Default**: `50`<br><br>**Constraints**: `>= 0`, `<= 2147483647` | Integer getSubscribeLimit() | setSubscribeLimit(Integer subscribeLimit) |
| `PublishRateLimit` | `Integer` | Optional | The maximum rate that one application or device can publish messages per seconds.<br><br>**Default**: `15`<br><br>**Constraints**: `>= 0`, `<= 2147483647` | Integer getPublishRateLimit() | setPublishRateLimit(Integer publishRateLimit) |
| `Publish` | `List<String>` | Optional | **Constraints**: *Minimum Items*: `0`, *Maximum Items*: `1000`, *Unique Items Required*, *Minimum Length*: `1`, *Maximum Length*: `1000`, *Pattern*: `^[a-zA-Z0-9_$\{\}*\/^\|.-]+$` | List<String> getPublish() | setPublish(List<String> publish) |
| `Subscribe` | `List<String>` | Optional | **Constraints**: *Minimum Items*: `0`, *Maximum Items*: `1000`, *Unique Items Required*, *Minimum Length*: `1`, *Maximum Length*: `1000`, *Pattern*: `^[a-zA-Z0-9_$\{\}*\/^\|.-]+$` | List<String> getSubscribe() | setSubscribe(List<String> subscribe) |

## Example (as JSON)

```json
{
  "name": "ts.device.mqtt.imp:Software.Application.TestVendor",
  "subscribeLimit": 50,
  "publishRateLimit": 15,
  "publish": [
    "vzimp/1/GeoRelevance/Vehicle/Bus/TestVendor/j2735_gr/BSM"
  ],
  "subscribe": [
    "vzimp/1/GeoRelevance/Vehicle/Bus/TestVendor/j2735_gr/MAP/*"
  ]
}
```

