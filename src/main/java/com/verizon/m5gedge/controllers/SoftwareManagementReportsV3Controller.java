/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.controllers;

import com.verizon.m5gedge.ApiHelper;
import com.verizon.m5gedge.Server;
import com.verizon.m5gedge.exceptions.ApiException;
import com.verizon.m5gedge.exceptions.FotaV3ResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.CampaignStatusEnum;
import com.verizon.m5gedge.models.DeviceFirmwareUpgrade;
import com.verizon.m5gedge.models.V3CampaignDevice;
import com.verizon.m5gedge.models.V3CampaignHistory;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SoftwareManagementReportsV3Controller extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SoftwareManagementReportsV3Controller(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieve a list of campaigns for an account that have a specified campaign status.
     * @param  acc  Required parameter: Account identifier.
     * @param  campaignStatus  Required parameter: Campaign status.
     * @param  lastSeenCampaignId  Optional parameter: Last seen campaign Id.
     * @return    Returns the V3CampaignHistory wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<V3CampaignHistory> getCampaignHistoryByStatus(
            final String acc,
            final CampaignStatusEnum campaignStatus,
            final String lastSeenCampaignId) throws ApiException, IOException {
        return prepareGetCampaignHistoryByStatusRequest(acc, campaignStatus,
                lastSeenCampaignId).execute();
    }

    /**
     * Retrieve a list of campaigns for an account that have a specified campaign status.
     * @param  acc  Required parameter: Account identifier.
     * @param  campaignStatus  Required parameter: Campaign status.
     * @param  lastSeenCampaignId  Optional parameter: Last seen campaign Id.
     * @return    Returns the V3CampaignHistory wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<V3CampaignHistory>> getCampaignHistoryByStatusAsync(
            final String acc,
            final CampaignStatusEnum campaignStatus,
            final String lastSeenCampaignId) {
        try { 
            return prepareGetCampaignHistoryByStatusRequest(acc, campaignStatus,
            lastSeenCampaignId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getCampaignHistoryByStatus.
     */
    private ApiCall<ApiResponse<V3CampaignHistory>, ApiException> prepareGetCampaignHistoryByStatusRequest(
            final String acc,
            final CampaignStatusEnum campaignStatus,
            final String lastSeenCampaignId) throws IOException {
        return new ApiCall.Builder<ApiResponse<V3CampaignHistory>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V3.value())
                        .path("/reports/{acc}/firmware/campaigns")
                        .queryParam(param -> param.key("campaignStatus")
                                .value((campaignStatus != null) ? campaignStatus.value() : null))
                        .queryParam(param -> param.key("lastSeenCampaignId")
                                .value(lastSeenCampaignId).isRequired(false))
                        .templateParam(param -> param.key("acc").value(acc)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, V3CampaignHistory.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV3ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieve campaign history for a specific device.
     * @param  acc  Required parameter: Account identifier.
     * @param  deviceId  Required parameter: Device IMEI identifier.
     * @return    Returns the List of DeviceFirmwareUpgrade wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<List<DeviceFirmwareUpgrade>> getDeviceFirmwareUpgradeHistory(
            final String acc,
            final String deviceId) throws ApiException, IOException {
        return prepareGetDeviceFirmwareUpgradeHistoryRequest(acc, deviceId).execute();
    }

    /**
     * Retrieve campaign history for a specific device.
     * @param  acc  Required parameter: Account identifier.
     * @param  deviceId  Required parameter: Device IMEI identifier.
     * @return    Returns the List of DeviceFirmwareUpgrade wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<List<DeviceFirmwareUpgrade>>> getDeviceFirmwareUpgradeHistoryAsync(
            final String acc,
            final String deviceId) {
        try { 
            return prepareGetDeviceFirmwareUpgradeHistoryRequest(acc, deviceId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getDeviceFirmwareUpgradeHistory.
     */
    private ApiCall<ApiResponse<List<DeviceFirmwareUpgrade>>, ApiException> prepareGetDeviceFirmwareUpgradeHistoryRequest(
            final String acc,
            final String deviceId) throws IOException {
        return new ApiCall.Builder<ApiResponse<List<DeviceFirmwareUpgrade>>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V3.value())
                        .path("/reports/{acc}/devices/{deviceId}")
                        .templateParam(param -> param.key("acc").value(acc)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("deviceId").value(deviceId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        DeviceFirmwareUpgrade[].class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV3ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieve a list of all devices in a campaign and the status of each device.
     * @param  acc  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Campaign identifier.
     * @param  lastSeenDeviceId  Optional parameter: Last seen device identifier.
     * @return    Returns the V3CampaignDevice wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<V3CampaignDevice> getCampaignDeviceStatus(
            final String acc,
            final String campaignId,
            final String lastSeenDeviceId) throws ApiException, IOException {
        return prepareGetCampaignDeviceStatusRequest(acc, campaignId, lastSeenDeviceId).execute();
    }

    /**
     * Retrieve a list of all devices in a campaign and the status of each device.
     * @param  acc  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Campaign identifier.
     * @param  lastSeenDeviceId  Optional parameter: Last seen device identifier.
     * @return    Returns the V3CampaignDevice wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<V3CampaignDevice>> getCampaignDeviceStatusAsync(
            final String acc,
            final String campaignId,
            final String lastSeenDeviceId) {
        try { 
            return prepareGetCampaignDeviceStatusRequest(acc, campaignId, lastSeenDeviceId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getCampaignDeviceStatus.
     */
    private ApiCall<ApiResponse<V3CampaignDevice>, ApiException> prepareGetCampaignDeviceStatusRequest(
            final String acc,
            final String campaignId,
            final String lastSeenDeviceId) throws IOException {
        return new ApiCall.Builder<ApiResponse<V3CampaignDevice>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V3.value())
                        .path("/reports/{acc}/campaigns/{campaignId}/devices")
                        .queryParam(param -> param.key("lastSeenDeviceId")
                                .value(lastSeenDeviceId).isRequired(false))
                        .templateParam(param -> param.key("acc").value(acc)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("campaignId").value(campaignId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, V3CampaignDevice.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV3ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}