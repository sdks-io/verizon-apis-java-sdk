/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.verizon.m5gedge.ApiHelper;
import com.verizon.m5gedge.Server;
import com.verizon.m5gedge.exceptions.ApiException;
import com.verizon.m5gedge.exceptions.FotaV3ResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.Campaign;
import com.verizon.m5gedge.models.CampaignFirmwareUpgrade;
import com.verizon.m5gedge.models.FirmwareCampaign;
import com.verizon.m5gedge.models.FotaV3SuccessResult;
import com.verizon.m5gedge.models.V3AddOrRemoveDeviceRequest;
import com.verizon.m5gedge.models.V3AddOrRemoveDeviceResult;
import com.verizon.m5gedge.models.V3ChangeCampaignDatesRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class CampaignsV3Controller extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public CampaignsV3Controller(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This endpoint allows a user to schedule a firmware upgrade for a list of devices.
     * @param  acc  Required parameter: Account identifier.
     * @param  body  Required parameter: Firmware upgrade information.
     * @return    Returns the FirmwareCampaign wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<FirmwareCampaign> scheduleCampaignFirmwareUpgrade(
            final String acc,
            final CampaignFirmwareUpgrade body) throws ApiException, IOException {
        return prepareScheduleCampaignFirmwareUpgradeRequest(acc, body).execute();
    }

    /**
     * This endpoint allows a user to schedule a firmware upgrade for a list of devices.
     * @param  acc  Required parameter: Account identifier.
     * @param  body  Required parameter: Firmware upgrade information.
     * @return    Returns the FirmwareCampaign wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<FirmwareCampaign>> scheduleCampaignFirmwareUpgradeAsync(
            final String acc,
            final CampaignFirmwareUpgrade body) {
        try { 
            return prepareScheduleCampaignFirmwareUpgradeRequest(acc, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for scheduleCampaignFirmwareUpgrade.
     */
    private ApiCall<ApiResponse<FirmwareCampaign>, ApiException> prepareScheduleCampaignFirmwareUpgradeRequest(
            final String acc,
            final CampaignFirmwareUpgrade body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<FirmwareCampaign>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V3.value())
                        .path("/campaigns/firmware/{acc}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("acc").value(acc)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, FirmwareCampaign.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV3ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows user to Add or Remove devices to an existing campaign.
     * @param  acc  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Unique identifier of a campaign.
     * @param  body  Required parameter: Add or remove device to existing upgrade information.
     * @return    Returns the V3AddOrRemoveDeviceResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<V3AddOrRemoveDeviceResult> updateCampaignFirmwareDevices(
            final String acc,
            final String campaignId,
            final V3AddOrRemoveDeviceRequest body) throws ApiException, IOException {
        return prepareUpdateCampaignFirmwareDevicesRequest(acc, campaignId, body).execute();
    }

    /**
     * This endpoint allows user to Add or Remove devices to an existing campaign.
     * @param  acc  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Unique identifier of a campaign.
     * @param  body  Required parameter: Add or remove device to existing upgrade information.
     * @return    Returns the V3AddOrRemoveDeviceResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<V3AddOrRemoveDeviceResult>> updateCampaignFirmwareDevicesAsync(
            final String acc,
            final String campaignId,
            final V3AddOrRemoveDeviceRequest body) {
        try { 
            return prepareUpdateCampaignFirmwareDevicesRequest(acc, campaignId, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateCampaignFirmwareDevices.
     */
    private ApiCall<ApiResponse<V3AddOrRemoveDeviceResult>, ApiException> prepareUpdateCampaignFirmwareDevicesRequest(
            final String acc,
            final String campaignId,
            final V3AddOrRemoveDeviceRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<V3AddOrRemoveDeviceResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V3.value())
                        .path("/campaigns/firmware/{acc}/{campaignId}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("acc").value(acc)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("campaignId").value(campaignId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, V3AddOrRemoveDeviceResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV3ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows user to change campaign dates and time windows. Fields which need to
     * remain unchanged should be also provided.
     * @param  acc  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Firmware upgrade information.
     * @param  body  Required parameter: New dates and time windows.
     * @return    Returns the FirmwareCampaign wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<FirmwareCampaign> updateCampaignDates(
            final String acc,
            final String campaignId,
            final V3ChangeCampaignDatesRequest body) throws ApiException, IOException {
        return prepareUpdateCampaignDatesRequest(acc, campaignId, body).execute();
    }

    /**
     * This endpoint allows user to change campaign dates and time windows. Fields which need to
     * remain unchanged should be also provided.
     * @param  acc  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Firmware upgrade information.
     * @param  body  Required parameter: New dates and time windows.
     * @return    Returns the FirmwareCampaign wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<FirmwareCampaign>> updateCampaignDatesAsync(
            final String acc,
            final String campaignId,
            final V3ChangeCampaignDatesRequest body) {
        try { 
            return prepareUpdateCampaignDatesRequest(acc, campaignId, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateCampaignDates.
     */
    private ApiCall<ApiResponse<FirmwareCampaign>, ApiException> prepareUpdateCampaignDatesRequest(
            final String acc,
            final String campaignId,
            final V3ChangeCampaignDatesRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<FirmwareCampaign>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V3.value())
                        .path("/campaigns/firmware/{acc}/{campaignId}/dates")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("acc").value(acc)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("campaignId").value(campaignId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, FirmwareCampaign.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV3ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows the user to retrieve campaign level information for a specified
     * campaign.
     * @param  acc  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Firmware upgrade identifier.
     * @return    Returns the Campaign wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Campaign> getCampaignInformation(
            final String acc,
            final String campaignId) throws ApiException, IOException {
        return prepareGetCampaignInformationRequest(acc, campaignId).execute();
    }

    /**
     * This endpoint allows the user to retrieve campaign level information for a specified
     * campaign.
     * @param  acc  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Firmware upgrade identifier.
     * @return    Returns the Campaign wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Campaign>> getCampaignInformationAsync(
            final String acc,
            final String campaignId) {
        try { 
            return prepareGetCampaignInformationRequest(acc, campaignId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getCampaignInformation.
     */
    private ApiCall<ApiResponse<Campaign>, ApiException> prepareGetCampaignInformationRequest(
            final String acc,
            final String campaignId) throws IOException {
        return new ApiCall.Builder<ApiResponse<Campaign>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V3.value())
                        .path("/campaigns/{acc}/{campaignId}")
                        .templateParam(param -> param.key("acc").value(acc)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("campaignId").value(campaignId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, Campaign.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV3ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows user to cancel a firmware campaign. A firmware campaign already started
     * can not be cancelled.
     * @param  acc  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Firmware upgrade information.
     * @return    Returns the FotaV3SuccessResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<FotaV3SuccessResult> cancelCampaign(
            final String acc,
            final String campaignId) throws ApiException, IOException {
        return prepareCancelCampaignRequest(acc, campaignId).execute();
    }

    /**
     * This endpoint allows user to cancel a firmware campaign. A firmware campaign already started
     * can not be cancelled.
     * @param  acc  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Firmware upgrade information.
     * @return    Returns the FotaV3SuccessResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<FotaV3SuccessResult>> cancelCampaignAsync(
            final String acc,
            final String campaignId) {
        try { 
            return prepareCancelCampaignRequest(acc, campaignId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for cancelCampaign.
     */
    private ApiCall<ApiResponse<FotaV3SuccessResult>, ApiException> prepareCancelCampaignRequest(
            final String acc,
            final String campaignId) throws IOException {
        return new ApiCall.Builder<ApiResponse<FotaV3SuccessResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V3.value())
                        .path("/campaigns/{acc}/{campaignId}")
                        .templateParam(param -> param.key("acc").value(acc)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("campaignId").value(campaignId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, FotaV3SuccessResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV3ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}