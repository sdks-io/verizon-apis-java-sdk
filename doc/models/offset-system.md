
# Offset System

The OffsetSystem data frame selects a sequence of node offsets described in the Lat-Long offset method.

## Structure

`OffsetSystem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Offset` | [`Offset`](../../doc/models/offset.md) | Required | The sequence of node offsets then describes a path or polygon in the Lat-Long system. | Offset getOffset() | setOffset(Offset offset) |

## Example (as JSON)

```json
{
  "offset": {
    "ll": {
      "nodes": [
        {
          "delta": {
            "node-LatLon": {
              "lon": 40,
              "lat": 10
            }
          }
        }
      ]
    }
  }
}
```

