
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| environment | [`Environment`](../README.md#environments) | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| httpClientConfig | [`Consumer<HttpClientConfiguration.Builder>`](../doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| thingspaceOauthCredentials | [`ThingspaceOauthCredentials`](auth/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |
| vZM2mTokenCredentials | [`VZM2mTokenCredentials`](auth/custom-header-signature.md) | The Credentials Setter for Custom Header Signature |
| sessionTokenCredentials | [`SessionTokenCredentials`](auth/custom-header-signature-1.md) | The Credentials Setter for Custom Header Signature |
| thingspaceOauth1Credentials | [`ThingspaceOauth1Credentials`](auth/oauth-2-client-credentials-grant-1.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

The API client can be initialized as follows:

```java
import com.verizon.thingspace.Environment;
import com.verizon.thingspace.VerizonClient;
import com.verizon.thingspace.authentication.SessionTokenModel;
import com.verizon.thingspace.authentication.ThingspaceOauth1Model;
import com.verizon.thingspace.authentication.ThingspaceOauthModel;
import com.verizon.thingspace.authentication.VZM2mTokenModel;
import com.verizon.thingspace.exceptions.ApiException;
import com.verizon.thingspace.http.response.ApiResponse;
import com.verizon.thingspace.models.OauthToken;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        VerizonClient client = new VerizonClient.Builder()
            .httpClientConfig(configBuilder -> configBuilder
                    .timeout(0))
            .thingspaceOauthCredentials(new ThingspaceOauthModel.Builder(
                    "OAuthClientId",
                    "OAuthClientSecret"
                )
                .build())
            .vZM2mTokenCredentials(new VZM2mTokenModel.Builder(
                    "VZ-M2M-Token"
                )
                .build())
            .sessionTokenCredentials(new SessionTokenModel.Builder(
                    "SessionToken"
                )
                .build())
            .thingspaceOauth1Credentials(new ThingspaceOauth1Model.Builder(
                    "OAuthClientId",
                    "OAuthClientSecret"
                )
                .build())
            .environment(Environment.PRODUCTION)
            .build();

    }
}
```

## VerizonClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getAccountServiceController()` | Provides access to AccountServiceController controller. | `AccountServiceController` |
| `getIntelligenceServiceController()` | Provides access to IntelligenceServiceController controller. | `IntelligenceServiceController` |
| `getDeviceManagementController()` | Provides access to DeviceManagement controller. | `DeviceManagementController` |
| `getAccountsController()` | Provides access to Accounts controller. | `AccountsController` |
| `getDeviceGroupsController()` | Provides access to DeviceGroups controller. | `DeviceGroupsController` |
| `getSMSController()` | Provides access to SMS controller. | `SMSController` |
| `getSessionManagementController()` | Provides access to SessionManagement controller. | `SessionManagementController` |
| `getConnectivityCallbacksController()` | Provides access to ConnectivityCallbacks controller. | `ConnectivityCallbacksController` |
| `getAccountRequestsController()` | Provides access to AccountRequests controller. | `AccountRequestsController` |
| `getServicePlansController()` | Provides access to ServicePlans controller. | `ServicePlansController` |
| `getDeviceDiagnosticsController()` | Provides access to DeviceDiagnostics controller. | `DeviceDiagnosticsController` |
| `getDeviceMonitoringController()` | Provides access to DeviceMonitoring controller. | `DeviceMonitoringController` |
| `getDeviceProfileManagementController()` | Provides access to DeviceProfileManagement controller. | `DeviceProfileManagementController` |
| `getEUICCDeviceProfileManagementController()` | Provides access to EUICCDeviceProfileManagement controller. | `EUICCDeviceProfileManagementController` |
| `getDevicesLocationsController()` | Provides access to DevicesLocations controller. | `DevicesLocationsController` |
| `getExclusionsController()` | Provides access to Exclusions controller. | `ExclusionsController` |
| `getDevicesLocationSubscriptionsController()` | Provides access to DevicesLocationSubscriptions controller. | `DevicesLocationSubscriptionsController` |
| `getDeviceLocationCallbacksController()` | Provides access to DeviceLocationCallbacks controller. | `DeviceLocationCallbacksController` |
| `getUsageTriggerManagementController()` | Provides access to UsageTriggerManagement controller. | `UsageTriggerManagementController` |
| `getBillingController()` | Provides access to Billing controller. | `BillingController` |
| `getSoftwareManagementSubscriptionsV1Controller()` | Provides access to SoftwareManagementSubscriptionsV1 controller. | `SoftwareManagementSubscriptionsV1Controller` |
| `getSoftwareManagementLicensesV1Controller()` | Provides access to SoftwareManagementLicensesV1 controller. | `SoftwareManagementLicensesV1Controller` |
| `getFirmwareV1Controller()` | Provides access to FirmwareV1 controller. | `FirmwareV1Controller` |
| `getSoftwareManagementCallbacksV1Controller()` | Provides access to SoftwareManagementCallbacksV1 controller. | `SoftwareManagementCallbacksV1Controller` |
| `getSoftwareManagementReportsV1Controller()` | Provides access to SoftwareManagementReportsV1 controller. | `SoftwareManagementReportsV1Controller` |
| `getSoftwareManagementSubscriptionsV2Controller()` | Provides access to SoftwareManagementSubscriptionsV2 controller. | `SoftwareManagementSubscriptionsV2Controller` |
| `getSoftwareManagementLicensesV2Controller()` | Provides access to SoftwareManagementLicensesV2 controller. | `SoftwareManagementLicensesV2Controller` |
| `getCampaignsV2Controller()` | Provides access to CampaignsV2 controller. | `CampaignsV2Controller` |
| `getSoftwareManagementCallbacksV2Controller()` | Provides access to SoftwareManagementCallbacksV2 controller. | `SoftwareManagementCallbacksV2Controller` |
| `getSoftwareManagementReportsV2Controller()` | Provides access to SoftwareManagementReportsV2 controller. | `SoftwareManagementReportsV2Controller` |
| `getClientLoggingController()` | Provides access to ClientLogging controller. | `ClientLoggingController` |
| `getServerLoggingController()` | Provides access to ServerLogging controller. | `ServerLoggingController` |
| `getConfigurationFilesController()` | Provides access to ConfigurationFiles controller. | `ConfigurationFilesController` |
| `getSoftwareManagementSubscriptionsV3Controller()` | Provides access to SoftwareManagementSubscriptionsV3 controller. | `SoftwareManagementSubscriptionsV3Controller` |
| `getSoftwareManagementLicensesV3Controller()` | Provides access to SoftwareManagementLicensesV3 controller. | `SoftwareManagementLicensesV3Controller` |
| `getCampaignsV3Controller()` | Provides access to CampaignsV3 controller. | `CampaignsV3Controller` |
| `getSoftwareManagementReportsV3Controller()` | Provides access to SoftwareManagementReportsV3 controller. | `SoftwareManagementReportsV3Controller` |
| `getFirmwareV3Controller()` | Provides access to FirmwareV3 controller. | `FirmwareV3Controller` |
| `getAccountDevicesController()` | Provides access to AccountDevices controller. | `AccountDevicesController` |
| `getSoftwareManagementCallbacksV3Controller()` | Provides access to SoftwareManagementCallbacksV3 controller. | `SoftwareManagementCallbacksV3Controller` |
| `getSIMSecureforIoTLicensesController()` | Provides access to SIMSecureforIoTLicenses controller. | `SIMSecureforIoTLicensesController` |
| `getAccountSubscriptionsController()` | Provides access to AccountSubscriptions controller. | `AccountSubscriptionsController` |
| `getDiagnosticsSubscriptionsController()` | Provides access to DiagnosticsSubscriptions controller. | `DiagnosticsSubscriptionsController` |
| `getDiagnosticsObservationsController()` | Provides access to DiagnosticsObservations controller. | `DiagnosticsObservationsController` |
| `getDiagnosticsHistoryController()` | Provides access to DiagnosticsHistory controller. | `DiagnosticsHistoryController` |
| `getDiagnosticsSettingsController()` | Provides access to DiagnosticsSettings controller. | `DiagnosticsSettingsController` |
| `getDiagnosticsCallbacksController()` | Provides access to DiagnosticsCallbacks controller. | `DiagnosticsCallbacksController` |
| `getDiagnosticsFactoryResetController()` | Provides access to DiagnosticsFactoryReset controller. | `DiagnosticsFactoryResetController` |
| `getTargetsController()` | Provides access to Targets controller. | `TargetsController` |
| `getCloudConnectorSubscriptionsController()` | Provides access to CloudConnectorSubscriptions controller. | `CloudConnectorSubscriptionsController` |
| `getCloudConnectorDevicesController()` | Provides access to CloudConnectorDevices controller. | `CloudConnectorDevicesController` |
| `getHPLDeviceManagementController()` | Provides access to HPLDeviceManagement controller. | `HPLDeviceManagementController` |
| `getDeviceServiceManagementController()` | Provides access to DeviceServiceManagement controller. | `DeviceServiceManagementController` |
| `getDeviceReportsController()` | Provides access to DeviceReports controller. | `DeviceReportsController` |
| `getHyperPreciseLocationCallbacksController()` | Provides access to HyperPreciseLocationCallbacks controller. | `HyperPreciseLocationCallbacksController` |
| `getDeviceCredentialManagementController()` | Provides access to DeviceCredentialManagement controller. | `DeviceCredentialManagementController` |
| `getAnomalySettingsController()` | Provides access to AnomalySettings controller. | `AnomalySettingsController` |
| `getAnomalyTriggersController()` | Provides access to AnomalyTriggers controller. | `AnomalyTriggersController` |
| `getAnomalyTriggersV2Controller()` | Provides access to AnomalyTriggersV2 controller. | `AnomalyTriggersV2Controller` |
| `getWirelessNetworkPerformanceController()` | Provides access to WirelessNetworkPerformance controller. | `WirelessNetworkPerformanceController` |
| `getManagingeSIMProfilesController()` | Provides access to ManagingeSIMProfiles controller. | `ManagingeSIMProfilesController` |
| `getDeviceSMSMessagingController()` | Provides access to DeviceSMSMessaging controller. | `DeviceSMSMessagingController` |
| `getDeviceActionsController()` | Provides access to DeviceActions controller. | `DeviceActionsController` |
| `getThingSpaceQualityofServiceAPIActionsController()` | Provides access to ThingSpaceQualityofServiceAPIActions controller. | `ThingSpaceQualityofServiceAPIActionsController` |
| `getPWNController()` | Provides access to PWN controller. | `PWNController` |
| `getPromotionPeriodInformationController()` | Provides access to PromotionPeriodInformation controller. | `PromotionPeriodInformationController` |
| `getRetrievetheTriggersController()` | Provides access to RetrievetheTriggers controller. | `RetrievetheTriggersController` |
| `getUpdateTriggersController()` | Provides access to UpdateTriggers controller. | `UpdateTriggersController` |
| `getSIMActionsController()` | Provides access to SIMActions controller. | `SIMActionsController` |
| `getGlobalReportingController()` | Provides access to GlobalReporting controller. | `GlobalReportingController` |
| `getDeviceRoleController()` | Provides access to DeviceRoleController controller. | `DeviceRoleController` |
| `getMapDataManagerController()` | Provides access to MapDataManager controller. | `MapDataManagerController` |
| `getRetrieveRatePlanListController()` | Provides access to RetrieveRatePlanList controller. | `RetrieveRatePlanListController` |
| `getCreatePricePlanTriggersController()` | Provides access to CreatePricePlanTriggers controller. | `CreatePricePlanTriggersController` |
| `getUpdatePricePlanTriggersController()` | Provides access to UpdatePricePlanTriggers controller. | `UpdatePricePlanTriggersController` |
| `getM5gBIDeviceActionsController()` | Provides access to M5gBIDeviceActions controller. | `M5gBIDeviceActionsController` |
| `getSensorInsightsSensorsController()` | Provides access to SensorInsightsSensors controller. | `SensorInsightsSensorsController` |
| `getSensorInsightsDevicesController()` | Provides access to SensorInsightsDevices controller. | `SensorInsightsDevicesController` |
| `getSensorInsightsGatewaysController()` | Provides access to SensorInsightsGateways controller. | `SensorInsightsGatewaysController` |
| `getSensorInsightsSmartAlertsController()` | Provides access to SensorInsightsSmartAlerts controller. | `SensorInsightsSmartAlertsController` |
| `getSensorInsightsRulesController()` | Provides access to SensorInsightsRules controller. | `SensorInsightsRulesController` |
| `getSensorInsightsHealthScoreController()` | Provides access to SensorInsightsHealthScore controller. | `SensorInsightsHealthScoreController` |
| `getSensorInsightsNotificationGroupsController()` | Provides access to SensorInsightsNotificationGroups controller. | `SensorInsightsNotificationGroupsController` |
| `getSensorInsightsUsersController()` | Provides access to SensorInsightsUsers controller. | `SensorInsightsUsersController` |
| `getSensorInsightsDeviceProfileController()` | Provides access to SensorInsightsDeviceProfile controller. | `SensorInsightsDeviceProfileController` |
| `getSensorInsightsSmartAlertMetricsController()` | Provides access to SensorInsightsSmartAlertMetrics controller. | `SensorInsightsSmartAlertMetricsController` |
| `getAPIController()` | Provides access to Client controller. | `APIController` |
| `getOauthAuthorizationController()` | Provides access to OauthAuthorization controller. | `OauthAuthorizationController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](../doc/http-client-configuration.md) |
| `getThingspaceOauthCredentials()` | The credentials to use with ThingspaceOauth. | [`ThingspaceOauthCredentials`](auth/oauth-2-client-credentials-grant.md) |
| `getVZM2MTokenCredentials()` | The credentials to use with VZM2MToken. | [`VZM2mTokenCredentials`](auth/custom-header-signature.md) |
| `getSessionTokenCredentials()` | The credentials to use with SessionToken. | [`SessionTokenCredentials`](auth/custom-header-signature-1.md) |
| `getThingspaceOauth1Credentials()` | The credentials to use with ThingspaceOauth1. | [`ThingspaceOauth1Credentials`](auth/oauth-2-client-credentials-grant-1.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

