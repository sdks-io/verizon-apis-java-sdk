# Sensor Insights Notification Groups

```java
SensorInsightsNotificationGroupsController sensorInsightsNotificationGroupsController = client.getSensorInsightsNotificationGroupsController();
```

## Class Name

`SensorInsightsNotificationGroupsController`

## Methods

* [Sensor Insights List Notification Group Request](../../doc/controllers/sensor-insights-notification-groups.md#sensor-insights-list-notification-group-request)
* [Sensor Insights Update Notification Group Request](../../doc/controllers/sensor-insights-notification-groups.md#sensor-insights-update-notification-group-request)
* [Sensor Insights Create Notification Group Request](../../doc/controllers/sensor-insights-notification-groups.md#sensor-insights-create-notification-group-request)
* [Sensor Insights Delete Notification Group](../../doc/controllers/sensor-insights-notification-groups.md#sensor-insights-delete-notification-group)
* [Sensor Insights Add Users to Notification Group Request](../../doc/controllers/sensor-insights-notification-groups.md#sensor-insights-add-users-to-notification-group-request)
* [Sensor Insights Remove Users from Notification Group Request](../../doc/controllers/sensor-insights-notification-groups.md#sensor-insights-remove-users-from-notification-group-request)


# Sensor Insights List Notification Group Request

```java
CompletableFuture<ApiResponse<List<DtoNotificationGroupResponseEntity>>> sensorInsightsListNotificationGroupRequestAsync(
    final DtoListNotificationGroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DtoListNotificationGroupRequest`](../../doc/models/dto-list-notification-group-request.md) | Body, Required | Retrieve a notification group |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`List<DtoNotificationGroupResponseEntity>`](../../doc/models/dto-notification-group-response-entity.md).

## Example Usage

```java
DtoListNotificationGroupRequest body = new DtoListNotificationGroupRequest.Builder()
    .accountname("0000123456-00001")
    .filter(new DtoFilter.Builder()
        .expand("device detail(s)")
        .limitnumber(100)
        .nopagination(true)
        .page("The number of pages")
        .pagenumber(100)
        .projection(Arrays.asList(
            "specific device fields requested"
        ))
        .selection(new LinkedHashMap<String, Object>() {{
            put("additionalProp1", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
            put("additionalProp2", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
            put("additionalProp3", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
        }})
        .build())
    .build();

sensorInsightsNotificationGroupsController.sensorInsightsListNotificationGroupRequestAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof M400ManagementErrorException) {
        M400ManagementErrorException m400ManagementErrorException = (M400ManagementErrorException) cause;
        m400ManagementErrorException.printStackTrace();
    } else if (cause instanceof ManagementErrorException) {
        ManagementErrorException managementErrorException = (ManagementErrorException) cause;
        managementErrorException.printStackTrace();
    } else if (cause instanceof M403ManagementErrorException) {
        M403ManagementErrorException m403ManagementErrorException = (M403ManagementErrorException) cause;
        m403ManagementErrorException.printStackTrace();
    } else if (cause instanceof M404ManagementErrorException) {
        M404ManagementErrorException m404ManagementErrorException = (M404ManagementErrorException) cause;
        m404ManagementErrorException.printStackTrace();
    } else if (cause instanceof M500ManagementErrorException) {
        M500ManagementErrorException m500ManagementErrorException = (M500ManagementErrorException) cause;
        m500ManagementErrorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`M400ManagementErrorException`](../../doc/models/m400-management-error-exception.md) |
| 401 | UnAuthorized | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 403 | Forbidden | [`M403ManagementErrorException`](../../doc/models/m403-management-error-exception.md) |
| 404 | Not Found | [`M404ManagementErrorException`](../../doc/models/m404-management-error-exception.md) |
| 406 | Not Acceptable | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 415 | Unsupported media type | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 429 | Too many requests | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 500 | Internal server error. | [`M500ManagementErrorException`](../../doc/models/m500-management-error-exception.md) |
| Default | Unexpected error | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |


# Sensor Insights Update Notification Group Request

```java
CompletableFuture<ApiResponse<DtoNotificationGroupResponseEntity>> sensorInsightsUpdateNotificationGroupRequestAsync(
    final DtoUpdateNotificationGroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DtoUpdateNotificationGroupRequest`](../../doc/models/dto-update-notification-group-request.md) | Body, Required | Partially update a notification group |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`DtoNotificationGroupResponseEntity`](../../doc/models/dto-notification-group-response-entity.md).

## Example Usage

```java
DtoUpdateNotificationGroupRequest body = new DtoUpdateNotificationGroupRequest.Builder(
    new DtoNotificationGroupRequestEntity.Builder()
        .description("a short description")
        .groupemail("email@domain.com")
        .name("User defined name of the record")
        .build()
)
.accountname("0000123456-00001")
.id("7b0b9c53-eeee-ffff-gggg-bde5e44f4b12")
.userids(Arrays.asList(
        "ee70a869-eeee-ffff-gggg-07c14c31f96e",
        "131501ff-eeee-ffff-gggg-647d19179a12"
    ))
.build();

sensorInsightsNotificationGroupsController.sensorInsightsUpdateNotificationGroupRequestAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof M400ManagementErrorException) {
        M400ManagementErrorException m400ManagementErrorException = (M400ManagementErrorException) cause;
        m400ManagementErrorException.printStackTrace();
    } else if (cause instanceof ManagementErrorException) {
        ManagementErrorException managementErrorException = (ManagementErrorException) cause;
        managementErrorException.printStackTrace();
    } else if (cause instanceof M403ManagementErrorException) {
        M403ManagementErrorException m403ManagementErrorException = (M403ManagementErrorException) cause;
        m403ManagementErrorException.printStackTrace();
    } else if (cause instanceof M404ManagementErrorException) {
        M404ManagementErrorException m404ManagementErrorException = (M404ManagementErrorException) cause;
        m404ManagementErrorException.printStackTrace();
    } else if (cause instanceof M500ManagementErrorException) {
        M500ManagementErrorException m500ManagementErrorException = (M500ManagementErrorException) cause;
        m500ManagementErrorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`M400ManagementErrorException`](../../doc/models/m400-management-error-exception.md) |
| 401 | UnAuthorized | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 403 | Forbidden | [`M403ManagementErrorException`](../../doc/models/m403-management-error-exception.md) |
| 404 | Not Found | [`M404ManagementErrorException`](../../doc/models/m404-management-error-exception.md) |
| 406 | Not Acceptable | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 415 | Unsupported media type | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 429 | Too many requests | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 500 | Internal server error. | [`M500ManagementErrorException`](../../doc/models/m500-management-error-exception.md) |
| Default | Unexpected error | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |


# Sensor Insights Create Notification Group Request

```java
CompletableFuture<ApiResponse<DtoNotificationGroupResponseEntity>> sensorInsightsCreateNotificationGroupRequestAsync(
    final DtoCreateNotificationGroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DtoCreateNotificationGroupRequest`](../../doc/models/dto-create-notification-group-request.md) | Body, Required | Create a notification group |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`DtoNotificationGroupResponseEntity`](../../doc/models/dto-notification-group-response-entity.md).

## Example Usage

```java
DtoCreateNotificationGroupRequest body = new DtoCreateNotificationGroupRequest.Builder(
    new DtoNotificationGroupRequestEntity.Builder()
        .description("a short description")
        .groupemail("email@domain.com")
        .name("User defined name of the record")
        .build()
)
.accountname("0000123456-00001")
.userids(Arrays.asList(
        "ee70a869-eeee-ffff-gggg-07c14c31f96e",
        "131501ff-eeee-ffff-gggg-647d19179a12"
    ))
.build();

sensorInsightsNotificationGroupsController.sensorInsightsCreateNotificationGroupRequestAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof M400ManagementErrorException) {
        M400ManagementErrorException m400ManagementErrorException = (M400ManagementErrorException) cause;
        m400ManagementErrorException.printStackTrace();
    } else if (cause instanceof ManagementErrorException) {
        ManagementErrorException managementErrorException = (ManagementErrorException) cause;
        managementErrorException.printStackTrace();
    } else if (cause instanceof M403ManagementErrorException) {
        M403ManagementErrorException m403ManagementErrorException = (M403ManagementErrorException) cause;
        m403ManagementErrorException.printStackTrace();
    } else if (cause instanceof M500ManagementErrorException) {
        M500ManagementErrorException m500ManagementErrorException = (M500ManagementErrorException) cause;
        m500ManagementErrorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`M400ManagementErrorException`](../../doc/models/m400-management-error-exception.md) |
| 401 | UnAuthorized | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 403 | Forbidden | [`M403ManagementErrorException`](../../doc/models/m403-management-error-exception.md) |
| 406 | Not Acceptable | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 415 | Unsupported media type | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 429 | Too many requests | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 500 | Internal server error. | [`M500ManagementErrorException`](../../doc/models/m500-management-error-exception.md) |
| Default | Unexpected error | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |


# Sensor Insights Delete Notification Group

```java
CompletableFuture<ApiResponse<Void>> sensorInsightsDeleteNotificationGroupAsync(
    final DtoDeleteNotificationGroupRequest payload)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `payload` | [`DtoDeleteNotificationGroupRequest`](../../doc/models/dto-delete-notification-group-request.md) | Query, Required | Payload for the delete request. |

## Response Type

`void`

## Example Usage

```java
DtoDeleteNotificationGroupRequest payload = new DtoDeleteNotificationGroupRequest.Builder()
    .accountname("0000123456-00001")
    .force(true)
    .id("6737ca22-eeee-ffff-gggg-84c09f2ede8e")
    .build();

sensorInsightsNotificationGroupsController.sensorInsightsDeleteNotificationGroupAsync(payload).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof M400ManagementErrorException) {
        M400ManagementErrorException m400ManagementErrorException = (M400ManagementErrorException) cause;
        m400ManagementErrorException.printStackTrace();
    } else if (cause instanceof ManagementErrorException) {
        ManagementErrorException managementErrorException = (ManagementErrorException) cause;
        managementErrorException.printStackTrace();
    } else if (cause instanceof M403ManagementErrorException) {
        M403ManagementErrorException m403ManagementErrorException = (M403ManagementErrorException) cause;
        m403ManagementErrorException.printStackTrace();
    } else if (cause instanceof M404ManagementErrorException) {
        M404ManagementErrorException m404ManagementErrorException = (M404ManagementErrorException) cause;
        m404ManagementErrorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`M400ManagementErrorException`](../../doc/models/m400-management-error-exception.md) |
| 401 | UnAuthorized | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 403 | Forbidden | [`M403ManagementErrorException`](../../doc/models/m403-management-error-exception.md) |
| 404 | Not Found | [`M404ManagementErrorException`](../../doc/models/m404-management-error-exception.md) |


# Sensor Insights Add Users to Notification Group Request

```java
CompletableFuture<ApiResponse<Void>> sensorInsightsAddUsersToNotificationGroupRequestAsync(
    final DtoAddUsersToNotificationGroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DtoAddUsersToNotificationGroupRequest`](../../doc/models/dto-add-users-to-notification-group-request.md) | Body, Required | Add users to a notification group |

## Response Type

`void`

## Example Usage

```java
DtoAddUsersToNotificationGroupRequest body = new DtoAddUsersToNotificationGroupRequest.Builder()
    .accountname("0000123456-00001")
    .id("45f1a56e-eeee-ffff-gggg-68cb994feb5f")
    .userids(Arrays.asList(
        "ee70a869-eeee-ffff-gggg-07c14c31f96e",
        "131501ff-eeee-ffff-gggg-647d19179a12"
    ))
    .build();

sensorInsightsNotificationGroupsController.sensorInsightsAddUsersToNotificationGroupRequestAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof M400ManagementErrorException) {
        M400ManagementErrorException m400ManagementErrorException = (M400ManagementErrorException) cause;
        m400ManagementErrorException.printStackTrace();
    } else if (cause instanceof ManagementErrorException) {
        ManagementErrorException managementErrorException = (ManagementErrorException) cause;
        managementErrorException.printStackTrace();
    } else if (cause instanceof M403ManagementErrorException) {
        M403ManagementErrorException m403ManagementErrorException = (M403ManagementErrorException) cause;
        m403ManagementErrorException.printStackTrace();
    } else if (cause instanceof M404ManagementErrorException) {
        M404ManagementErrorException m404ManagementErrorException = (M404ManagementErrorException) cause;
        m404ManagementErrorException.printStackTrace();
    } else if (cause instanceof M500ManagementErrorException) {
        M500ManagementErrorException m500ManagementErrorException = (M500ManagementErrorException) cause;
        m500ManagementErrorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`M400ManagementErrorException`](../../doc/models/m400-management-error-exception.md) |
| 401 | UnAuthorized | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 403 | Forbidden | [`M403ManagementErrorException`](../../doc/models/m403-management-error-exception.md) |
| 404 | Not Found | [`M404ManagementErrorException`](../../doc/models/m404-management-error-exception.md) |
| 406 | Not Acceptable | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 415 | Unsupported media type | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 429 | Too many requests | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 500 | Internal server error. | [`M500ManagementErrorException`](../../doc/models/m500-management-error-exception.md) |
| Default | Unexpected error | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |


# Sensor Insights Remove Users from Notification Group Request

```java
CompletableFuture<ApiResponse<Void>> sensorInsightsRemoveUsersFromNotificationGroupRequestAsync(
    final DtoRemoveUsersFromNotificationGroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DtoRemoveUsersFromNotificationGroupRequest`](../../doc/models/dto-remove-users-from-notification-group-request.md) | Body, Required | Remove users from a notification group |

## Response Type

`void`

## Example Usage

```java
DtoRemoveUsersFromNotificationGroupRequest body = new DtoRemoveUsersFromNotificationGroupRequest.Builder()
    .accountname("0000123456-00001")
    .id("111538a8-eeee-ffff-gggg-3b72804403e8")
    .userids(Arrays.asList(
        "ee70a869-eeee-ffff-gggg-07c14c31f96e",
        "131501ff-eeee-ffff-gggg-647d19179a12"
    ))
    .build();

sensorInsightsNotificationGroupsController.sensorInsightsRemoveUsersFromNotificationGroupRequestAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof M400ManagementErrorException) {
        M400ManagementErrorException m400ManagementErrorException = (M400ManagementErrorException) cause;
        m400ManagementErrorException.printStackTrace();
    } else if (cause instanceof ManagementErrorException) {
        ManagementErrorException managementErrorException = (ManagementErrorException) cause;
        managementErrorException.printStackTrace();
    } else if (cause instanceof M403ManagementErrorException) {
        M403ManagementErrorException m403ManagementErrorException = (M403ManagementErrorException) cause;
        m403ManagementErrorException.printStackTrace();
    } else if (cause instanceof M404ManagementErrorException) {
        M404ManagementErrorException m404ManagementErrorException = (M404ManagementErrorException) cause;
        m404ManagementErrorException.printStackTrace();
    } else if (cause instanceof M500ManagementErrorException) {
        M500ManagementErrorException m500ManagementErrorException = (M500ManagementErrorException) cause;
        m500ManagementErrorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`M400ManagementErrorException`](../../doc/models/m400-management-error-exception.md) |
| 401 | UnAuthorized | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 403 | Forbidden | [`M403ManagementErrorException`](../../doc/models/m403-management-error-exception.md) |
| 404 | Not Found | [`M404ManagementErrorException`](../../doc/models/m404-management-error-exception.md) |
| 406 | Not Acceptable | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 415 | Unsupported media type | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 429 | Too many requests | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |
| 500 | Internal server error. | [`M500ManagementErrorException`](../../doc/models/m500-management-error-exception.md) |
| Default | Unexpected error | [`ManagementErrorException`](../../doc/models/management-error-exception.md) |

