
# Dto Filter

## Structure

`DtoFilter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Expand` | `String` | Optional | Use to provide device details for alerts specific to a device | String getExpand() | setExpand(String expand) |
| `Limitnumber` | `Integer` | Optional | Limit the number of results returned<br><br>**Constraints**: `>= 0`, `<= 100` | Integer getLimitnumber() | setLimitnumber(Integer limitnumber) |
| `Nopagination` | `Boolean` | Optional | A flag set to show if pagination requested (false) or not (true) | Boolean getNopagination() | setNopagination(Boolean nopagination) |
| `Page` | `String` | Optional | - | String getPage() | setPage(String page) |
| `Pagenumber` | `Integer` | Optional | **Constraints**: `>= 0`, `<= 100` | Integer getPagenumber() | setPagenumber(Integer pagenumber) |
| `Projection` | `List<String>` | Optional | Limits the fields of the device that the user is interested in rather than all of the fields<br><br>**Constraints**: *Maximum Items*: `100` | List<String> getProjection() | setProjection(List<String> projection) |
| `Selection` | `Map<String, Object>` | Optional | Filters results based on user defined criteria | Map<String, Object> getSelection() | setSelection(Map<String, Object> selection) |

## Example (as JSON)

```json
{
  "$expand": "device detail(s)",
  "$nopagination": true,
  "$page": "The number of pages",
  "$limitnumber": 76,
  "$pagenumber": 12
}
```

