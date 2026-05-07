
# Etx ID

## Structure

`EtxID`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceID` | `UUID` | Optional | The generated ID (UUID v4) for the device. It can be used as:<br><br>- the MQTT Client ID when connecting to the Message Exchange system<br>- a parameter when asking for the connection endpoint<br>- a parameter when finishing the device registration<br>- a parameter when unregistering the device | UUID getDeviceID() | setDeviceID(UUID deviceID) |
| `IMEI` | `String` | Optional | The IMEI number of the device.<br><br>**Constraints**: *Maximum Length*: `19`, *Pattern*: `^(\d{2}-\d{6}-\d{6}-\d{1,2})$\|^(\d{15,16})$` | String getIMEI() | setIMEI(String iMEI) |
| `ICCID` | `String` | Optional | The ICCID number of the device.<br><br>**Constraints**: *Minimum Length*: `19`, *Maximum Length*: `20`, *Pattern*: `^(89\d{17,18})$` | String getICCID() | setICCID(String iCCID) |
| `IMSI` | `String` | Optional | The IMSI number of the device.<br><br>**Constraints**: *Minimum Length*: `14`, *Maximum Length*: `15`, *Pattern*: `^\d{14,15}$` | String getIMSI() | setIMSI(String iMSI) |

## Example (as JSON)

```json
{
  "DeviceID": "a4fcd16a-343d-4527-8203-2f46e3e4ff4b",
  "IMEI": "12-345678-901234-5",
  "ICCID": "89345678901234567890",
  "IMSI": "123456789012345"
}
```

