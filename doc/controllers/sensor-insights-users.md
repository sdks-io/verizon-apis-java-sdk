# Sensor Insights Users

```java
SensorInsightsUsersController sensorInsightsUsersController = client.getSensorInsightsUsersController();
```

## Class Name

`SensorInsightsUsersController`

## Methods

* [Sensor Insights Create User Request](../../doc/controllers/sensor-insights-users.md#sensor-insights-create-user-request)
* [Sensor Insights Delete User](../../doc/controllers/sensor-insights-users.md#sensor-insights-delete-user)
* [Sensor Insights Update User Request](../../doc/controllers/sensor-insights-users.md#sensor-insights-update-user-request)
* [Sensor Insights List User Request](../../doc/controllers/sensor-insights-users.md#sensor-insights-list-user-request)


# Sensor Insights Create User Request

```java
CompletableFuture<ApiResponse<ResourceUser>> sensorInsightsCreateUserRequestAsync(
    final DtoCreateUserRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DtoCreateUserRequest`](../../doc/models/dto-create-user-request.md) | Body, Required | Create a user profile |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`ResourceUser`](../../doc/models/resource-user.md).

## Example Usage

```java
DtoCreateUserRequest body = new DtoCreateUserRequest.Builder()
    .accountname("0000123456-00001")
    .user(new DtoUserDTO.Builder()
        .email("email@domain.com")
        .firstname("First name")
        .lastname("Last name or Surname")
        .mdn("908-555-1234")
        .customdata(new LinkedHashMap<String, Object>() {{
            put("additionalProp1", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
            put("additionalProp2", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
            put("additionalProp3", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
        }})
        .build())
    .build();

sensorInsightsUsersController.sensorInsightsCreateUserRequestAsync(body).thenAccept(result -> {
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


# Sensor Insights Delete User

```java
CompletableFuture<ApiResponse<Void>> sensorInsightsDeleteUserAsync(
    final DtoDeleteUserRequest deleterequestpayload)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `deleterequestpayload` | [`DtoDeleteUserRequest`](../../doc/models/dto-delete-user-request.md) | Query, Required | Payload for the delete user request. |

## Response Type

`void`

## Example Usage

```java
DtoDeleteUserRequest deleterequestpayload = new DtoDeleteUserRequest.Builder()
    .accountname("0000123456-00001")
    .id("8ea30999-eeee-ffff-gggg-3ea409f5fee4")
    .build();

sensorInsightsUsersController.sensorInsightsDeleteUserAsync(deleterequestpayload).thenAccept(result -> {
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


# Sensor Insights Update User Request

```java
CompletableFuture<ApiResponse<ResourceUser>> sensorInsightsUpdateUserRequestAsync(
    final DtoUpdateUserRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DtoUpdateUserRequest`](../../doc/models/dto-update-user-request.md) | Body, Required | Partially update a user profile |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`ResourceUser`](../../doc/models/resource-user.md).

## Example Usage

```java
DtoUpdateUserRequest body = new DtoUpdateUserRequest.Builder()
    .accountname("0000123456-00001")
    .id("9dd573ba-eeee-ffff-gggg-8009758bcaca")
    .user(new DtoUserDTO.Builder()
        .email("email@domain.com")
        .firstname("First name")
        .lastname("Last name or Surname")
        .mdn("908-555-1234")
        .customdata(new LinkedHashMap<String, Object>() {{
            put("additionalProp1", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
            put("additionalProp2", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
            put("additionalProp3", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
        }})
        .build())
    .build();

sensorInsightsUsersController.sensorInsightsUpdateUserRequestAsync(body).thenAccept(result -> {
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


# Sensor Insights List User Request

```java
CompletableFuture<ApiResponse<List<ResourceUser>>> sensorInsightsListUserRequestAsync(
    final DtoListUserRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DtoListUserRequest`](../../doc/models/dto-list-user-request.md) | Body, Required | A summary of user profile records on an account |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`List<ResourceUser>`](../../doc/models/resource-user.md).

## Example Usage

```java
DtoListUserRequest body = new DtoListUserRequest.Builder()
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

sensorInsightsUsersController.sensorInsightsListUserRequestAsync(body).thenAccept(result -> {
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

