# Anomaly Triggers V2

```java
AnomalyTriggersV2Controller anomalyTriggersV2Controller = client.getAnomalyTriggersV2Controller();
```

## Class Name

`AnomalyTriggersV2Controller`

## Methods

* [Create Anomaly Detection Trigger V2](../../doc/controllers/anomaly-triggers-v2.md#create-anomaly-detection-trigger-v2)
* [Update Anomaly Detection Trigger V2](../../doc/controllers/anomaly-triggers-v2.md#update-anomaly-detection-trigger-v2)
* [List Anomaly Detection Trigger Settings V2](../../doc/controllers/anomaly-triggers-v2.md#list-anomaly-detection-trigger-settings-v2)


# Create Anomaly Detection Trigger V2

Creates the trigger to identify an anomaly.

```java
CompletableFuture<ApiResponse<AnomalyDetectionTrigger>> createAnomalyDetectionTriggerV2Async(
    final List<CreateTriggerRequestOptions2> body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`List<CreateTriggerRequestOptions2>`](../../doc/models/containers/create-trigger-request-options-2.md) | Body, Required | Request to create an anomaly trigger. |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`AnomalyDetectionTrigger`](../../doc/models/anomaly-detection-trigger.md).

## Example Usage

```java
List<CreateTriggerRequestOptions2> body = Arrays.asList(
    CreateTriggerRequestOptions2.fromTriggerType1(
        new TriggerType1.Builder()
            .name("Anomaly Daily Usage REST Test-Patch 1")
            .triggerCategory("UsageAnomaly")
            .accountName("0000123456-00001")
            .anomalyTriggerRequest(new AnomalyTriggerRequest.Builder()
                .accountNames("0000123456-00001")
                .includeAbnormal(true)
                .includeVeryAbnormal(true)
                .includeUnderExpectedUsage(true)
                .includeOverExpectedUsage(true)
                .build())
            .notification(new TriggerNotification.Builder()
                .notificationType("DailySummary")
                .callback(true)
                .emailNotification(false)
                .notificationGroupName("Anomaly Test API")
                .notificationFrequencyFactor(3)
                .notificationFrequencyInterval("Hourly")
                .externalEmailRecipients("placeholder@verizon.com")
                .smsNotification(true)
                .smsNumbers(Arrays.asList(
                    new SMSNumber.Builder()
                        .carrier("US Cellular")
                        .number("9299280711")
                        .build()
                ))
                .reminder(true)
                .severity("Critical")
                .build())
            .build()
    )
);
anomalyTriggersV2Controller.createAnomalyDetectionTriggerV2Async(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof IntelligenceResultException) {
        IntelligenceResultException intelligenceResultException = (IntelligenceResultException) cause;
        intelligenceResultException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "triggerId": "595f5c44-c31c-4552-8670-020a1545a84d"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | An error occurred. | [`IntelligenceResultException`](../../doc/models/intelligence-result-exception.md) |


# Update Anomaly Detection Trigger V2

Updates an existing trigger using the account name.

```java
CompletableFuture<ApiResponse<IntelligenceSuccessResult>> updateAnomalyDetectionTriggerV2Async(
    final List<UpdateTriggerRequestOptions2> body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`List<UpdateTriggerRequestOptions2>`](../../doc/models/containers/update-trigger-request-options-2.md) | Body, Required | Request to update existing trigger. |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`IntelligenceSuccessResult`](../../doc/models/intelligence-success-result.md).

## Example Usage

```java
List<UpdateTriggerRequestOptions2> body = Arrays.asList(
    UpdateTriggerRequestOptions2.fromTriggerType3(
        new TriggerType3.Builder()
            .triggerId("595f5c44-c31c-4552-8670-020a1545a84d")
            .triggerName("Anomaly Daily Usage REST Test-Patch Update 4")
            .triggerCategory("UsageAnomaly")
            .accountName("0000123456-00001")
            .anomalyTriggerRequest(new AnomalyTriggerRequest.Builder()
                .accountNames("0000123456-00001")
                .includeAbnormal(true)
                .includeVeryAbnormal(true)
                .includeUnderExpectedUsage(false)
                .includeOverExpectedUsage(true)
                .build())
            .notification(new TriggerNotification.Builder()
                .notificationType("DailySummary")
                .callback(true)
                .emailNotification(false)
                .notificationGroupName("Anomaly Test API")
                .notificationFrequencyFactor(3)
                .notificationFrequencyInterval("Hourly")
                .externalEmailRecipients("placeholder@verizon.com")
                .smsNotification(true)
                .smsNumbers(Arrays.asList(
                    new SMSNumber.Builder()
                        .carrier("US Cellular")
                        .number("9299280711")
                        .build()
                ))
                .reminder(true)
                .severity("Critical")
                .build())
            .build()
    )
);
anomalyTriggersV2Controller.updateAnomalyDetectionTriggerV2Async(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof IntelligenceResultException) {
        IntelligenceResultException intelligenceResultException = (IntelligenceResultException) cause;
        intelligenceResultException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "status": "Success"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | An error occurred. | [`IntelligenceResultException`](../../doc/models/intelligence-result-exception.md) |


# List Anomaly Detection Trigger Settings V2

Retrieves the values for a specific trigger ID.

```java
CompletableFuture<ApiResponse<AnomalyTriggerResult>> listAnomalyDetectionTriggerSettingsV2Async(
    final String triggerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `triggerId` | `String` | Template, Required | The trigger ID of a specific trigger. |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`AnomalyTriggerResult`](../../doc/models/anomaly-trigger-result.md).

## Example Usage

```java
String triggerId = "be1b5958-3e11-41db-9abd-b1b7618c0035";

anomalyTriggersV2Controller.listAnomalyDetectionTriggerSettingsV2Async(triggerId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof IntelligenceResultException) {
        IntelligenceResultException intelligenceResultException = (IntelligenceResultException) cause;
        intelligenceResultException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "triggers": [
    {
      "triggerId": "BE1B5958-3E11-41DB-9ABD-B1B7618C0035",
      "triggerName": "Anomaly Daily Usage REST Test-1",
      "organizationName": "AnamolyDetectionRTRTest",
      "triggerCategory": "UsageAnomaly",
      "triggerAttributes": [
        {
          "key": "DataPercentage50",
          "value": false
        }
      ],
      "createdAt": "2021-10-21T23:57:03.397.0000Z",
      "modifiedAt": "2021-10-21T23:57:03.397.0000Z",
      "notification": {
        "notificationType": "DailySummary",
        "callback": true,
        "emailNotification": true,
        "notificationGroupName": "Anomaly Test API",
        "notificationFrequencyFactor": -2147483648,
        "externalEmailRecipients": "placeholder@verizon.com",
        "smsNotification": true,
        "smsNumbers": [
          {
            "carrier": "US Cellular",
            "number": "9299280711"
          }
        ],
        "reminder": false,
        "severity": "Critical"
      }
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | An error occurred. | [`IntelligenceResultException`](../../doc/models/intelligence-result-exception.md) |

