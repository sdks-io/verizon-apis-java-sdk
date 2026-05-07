
# Friction Information

## Structure

`FrictionInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RoadSurfaceDescription` | [`DescriptionOfRoadSurface`](../../doc/models/containers/description-of-road-surface.md) | Required | Indicates the composition of the surface of the roadway for use in estimation of friction. | DescriptionOfRoadSurface getRoadSurfaceDescription() | setRoadSurfaceDescription(DescriptionOfRoadSurface roadSurfaceDescription) |

## Example (as JSON)

```json
{
  "roadSurfaceDescription": {
    "portlandCement": {
      "type": "traveled"
    }
  }
}
```

