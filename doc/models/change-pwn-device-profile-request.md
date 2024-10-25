
# Change PWN Device Profile Request

## Structure

`ChangePWNDeviceProfileRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | - | String getAccountName() | setAccountName(String accountName) |
| `DeviceList` | [`List<PWNDeviceList>`](../../doc/models/pwn-device-list.md) | Required | - | List<PWNDeviceList> getDeviceList() | setDeviceList(List<PWNDeviceList> deviceList) |
| `NewProfile` | `String` | Required | - | String getNewProfile() | setNewProfile(String newProfile) |

## Example (as JSON)

```json
{
  "accountName": "0342351414-00001",
  "deviceList": [
    {
      "deviceIds": [
        {
          "id": "99948099913024600000",
          "kind": "iccid"
        }
      ]
    }
  ],
  "newProfile": "HSS EsmProfile Enterprise 5G internet"
}
```

