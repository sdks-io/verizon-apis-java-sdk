
# Aggregate Session Report Request

Request for getting an aggregated session report.

## Structure

`AggregateSessionReportRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountNumber` | `String` | Required | The numeric ID of the account and must include leading zeroes. This value is indentical to `accountName`. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `StartDate` | `String` | Optional | Start date of session to include. If not specified  information will be shown from the earliest available (180 days). Can be either date in ISO 8601 format or predefined constants. | String getStartDate() | setStartDate(String startDate) |
| `EndDate` | `String` | Optional | End date of session to include. If not specified  information will be shown to the latest available. Can be either date in ISO 8601 format or predefined constants. | String getEndDate() | setEndDate(String endDate) |
| `Imei` | `List<String>` | Required | Devices for which return usage info. Could be 0, 1 or more. In case of 0 will return all devices belonging to customer (except of filtered by other parameters). | List<String> getImei() | setImei(List<String> imei) |
| `DeviceGroup` | `String` | Optional | Optional filter — only include devices matching this device group name. | String getDeviceGroup() | setDeviceGroup(String deviceGroup) |
| `DataPlan` | `String` | Optional | Optional filter — only include devices matching this carrier rate plan code. | String getDataPlan() | setDataPlan(String dataPlan) |
| `NoSessionFlag` | `Boolean` | Optional | Optional filter — when "true", returns only devices with no sessions. | Boolean getNoSessionFlag() | setNoSessionFlag(Boolean noSessionFlag) |

## Example (as JSON)

```json
{
  "accountNumber": "0000123456-00001",
  "startDate": "2022-12-09T22:01:06.217Z",
  "endDate": "2022-12-09T22:01:08.734Z",
  "imei": [
    "15-digit IMEI"
  ],
  "deviceGroup": "string",
  "dataPlan": "string",
  "noSessionFlag": false
}
```

