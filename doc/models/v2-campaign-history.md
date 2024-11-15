
# V2 Campaign History

Campaign history details.

## Structure

`V2CampaignHistory`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HasMoreData` | `boolean` | Required | Has more report flag. | boolean getHasMoreData() | setHasMoreData(boolean hasMoreData) |
| `LastSeenCampaignId` | `String` | Optional | Campaign identifier. | String getLastSeenCampaignId() | setLastSeenCampaignId(String lastSeenCampaignId) |
| `CampaignList` | [`List<V2CampaignMetaInfo>`](../../doc/models/v2-campaign-meta-info.md) | Required | Software upgrade list. | List<V2CampaignMetaInfo> getCampaignList() | setCampaignList(List<V2CampaignMetaInfo> campaignList) |

## Example (as JSON)

```json
{
  "hasMoreData": true,
  "lastSeenCampaignId": "60b5d639-ccdc-4db8-8824-069bd94c95bf",
  "campaignList": [
    {
      "accountName": "0402196254-00001",
      "id": "60b5d639-ccdc-4db8-8824-069bd94c95bf",
      "campaignName": "FOTA_Verizon_Upgrade",
      "softwareName": "FOTA_Verizon_Model-A_02To03_HF",
      "distributionType": "HTTP",
      "softwareFrom": "FOTA_Verizon_Model-A_00To01_HF",
      "softwareTo": "FOTA_Verizon_Model-A_02To03_HF",
      "make": "Verizon",
      "model": "Model-A",
      "startDate": "2020-08-21",
      "endDate": "2020-08-22",
      "downloadAfterDate": "2020-08-21",
      "downloadTimeWindowList": [
        {
          "startTime": 20,
          "endTime": 21
        }
      ],
      "installAfterDate": "2020-08-21",
      "installTimeWindowList": [
        {
          "startTime": 22,
          "endTime": 23
        }
      ],
      "status": "CampaignEnded"
    }
  ]
}
```

