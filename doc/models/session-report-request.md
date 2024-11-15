
# Session Report Request

Request for obtaining a session report.

## Structure

`SessionReportRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountNumber` | `String` | Required | Account Number. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `Imei` | `String` | Required | Device ids. | String getImei() | setImei(String imei) |
| `StartDate` | `String` | Optional | Start date of session to include. If not specified  information will be shown from the earliest available (180 days). Can be either date in ISO 8601 format or predefined constants. | String getStartDate() | setStartDate(String startDate) |
| `EndDate` | `String` | Optional | End date of session to include. If not specified  information will be shown to the latest available. Can be either date in ISO 8601 format or predefined constants. | String getEndDate() | setEndDate(String endDate) |
| `DurationLow` | `Integer` | Optional | The Low value of session duration. | Integer getDurationLow() | setDurationLow(Integer durationLow) |
| `DurationHigh` | `Integer` | Optional | The High value of session duration. | Integer getDurationHigh() | setDurationHigh(Integer durationHigh) |

## Example (as JSON)

```json
{
  "accountNumber": "0844021539-00001",
  "startDate": "2022-12-09T22:01:06.217Z",
  "endDate": "2022-12-09T22:01:08.734Z",
  "imei": "709312034493372",
  "durationLow": 224,
  "durationHigh": 92
}
```

