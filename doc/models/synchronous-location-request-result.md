
# Synchronous Location Request Result

## Structure

`SynchronousLocationRequestResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Txid` | `String` | Required | The transaction ID of the report. | String getTxid() | setTxid(String txid) |
| `Status` | [`ReportStatusEnum`](../../doc/models/report-status-enum.md) | Required | Status of the report. | ReportStatusEnum getStatus() | setStatus(ReportStatusEnum status) |

## Example (as JSON)

```json
{
  "txid": "4be7c858-eeee-ffff-gggg-95061456d835",
  "status": "QUEUED"
}
```

