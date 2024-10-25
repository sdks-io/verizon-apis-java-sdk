
# Change PWN Device State Activate Request

## Structure

`ChangePWNDeviceStateActivateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | - | String getAccountName() | setAccountName(String accountName) |
| `DeviceList` | [`List<PWNDeviceList>`](../../doc/models/pwn-device-list.md) | Required | - | List<PWNDeviceList> getDeviceList() | setDeviceList(List<PWNDeviceList> deviceList) |
| `Activate` | [`Activate`](../../doc/models/activate.md) | Required | - | Activate getActivate() | setActivate(Activate activate) |

## Example (as JSON)

```json
{
  "accountName": "0342351414-00001",
  "deviceList": [
    {
      "deviceIds": [
        {
          "id": "99948099913024600001",
          "kind": "iccid"
        }
      ]
    }
  ],
  "activate": {
    "profile": "HSS EsmProfile Enterprise 5G"
  }
}
```

