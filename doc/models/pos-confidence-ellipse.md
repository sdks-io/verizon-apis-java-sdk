
# Pos Confidence Ellipse

## Structure

`PosConfidenceEllipse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SemiMajorConfidence` | `int` | Required | **Constraints**: `>= 0`, `<= 4095` | int getSemiMajorConfidence() | setSemiMajorConfidence(int semiMajorConfidence) |
| `SemiMinorConfidence` | `int` | Required | **Constraints**: `>= 0`, `<= 4095` | int getSemiMinorConfidence() | setSemiMinorConfidence(int semiMinorConfidence) |
| `SemiMajorOrientation` | `int` | Required | **Constraints**: `>= 0`, `<= 3601` | int getSemiMajorOrientation() | setSemiMajorOrientation(int semiMajorOrientation) |

## Example (as JSON)

```json
{
  "semiMajorConfidence": 194,
  "semiMinorConfidence": 192,
  "semiMajorOrientation": 22
}
```

