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
import com.verizon.m5gedge.exceptions.FotaV2ResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.CampaignSoftware;
import com.verizon.m5gedge.models.CampaignSoftwareUpgrade;
import com.verizon.m5gedge.models.FotaV2SuccessResult;
import com.verizon.m5gedge.models.SchedulesSoftwareUpgradeRequest;
import com.verizon.m5gedge.models.UploadAndScheduleFileRequest;
import com.verizon.m5gedge.models.UploadAndScheduleFileResponse;
import com.verizon.m5gedge.models.V2AddOrRemoveDeviceRequest;
import com.verizon.m5gedge.models.V2AddOrRemoveDeviceResult;
import com.verizon.m5gedge.models.V2ChangeCampaignDatesRequest;
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
public final class CampaignsV2Controller extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public CampaignsV2Controller(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This endpoint allows user to schedule a software upgrade.
     * @param  account  Required parameter: Account identifier.
     * @param  body  Required parameter: Software upgrade information.
     * @return    Returns the CampaignSoftware wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<CampaignSoftware> scheduleCampaignFirmwareUpgrade(
            final String account,
            final CampaignSoftwareUpgrade body) throws ApiException, IOException {
        return prepareScheduleCampaignFirmwareUpgradeRequest(account, body).execute();
    }

    /**
     * This endpoint allows user to schedule a software upgrade.
     * @param  account  Required parameter: Account identifier.
     * @param  body  Required parameter: Software upgrade information.
     * @return    Returns the CampaignSoftware wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<CampaignSoftware>> scheduleCampaignFirmwareUpgradeAsync(
            final String account,
            final CampaignSoftwareUpgrade body) {
        try { 
            return prepareScheduleCampaignFirmwareUpgradeRequest(account, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for scheduleCampaignFirmwareUpgrade.
     */
    private ApiCall<ApiResponse<CampaignSoftware>, ApiException> prepareScheduleCampaignFirmwareUpgradeRequest(
            final String account,
            final CampaignSoftwareUpgrade body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<CampaignSoftware>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/campaigns/{account}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("*/*").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, CampaignSoftware.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows user to get information of a software upgrade.
     * @param  account  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Software upgrade identifier.
     * @return    Returns the CampaignSoftware wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<CampaignSoftware> getCampaignInformation(
            final String account,
            final String campaignId) throws ApiException, IOException {
        return prepareGetCampaignInformationRequest(account, campaignId).execute();
    }

    /**
     * This endpoint allows user to get information of a software upgrade.
     * @param  account  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Software upgrade identifier.
     * @return    Returns the CampaignSoftware wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<CampaignSoftware>> getCampaignInformationAsync(
            final String account,
            final String campaignId) {
        try { 
            return prepareGetCampaignInformationRequest(account, campaignId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getCampaignInformation.
     */
    private ApiCall<ApiResponse<CampaignSoftware>, ApiException> prepareGetCampaignInformationRequest(
            final String account,
            final String campaignId) throws IOException {
        return new ApiCall.Builder<ApiResponse<CampaignSoftware>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/campaigns/{account}/{campaignId}")
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("campaignId").value(campaignId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, CampaignSoftware.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows user to Add or Remove devices to an existing software upgrade.
     * @param  account  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Software upgrade information.
     * @param  body  Required parameter: Request to add or remove device to existing software
     *         upgrade information.
     * @return    Returns the V2AddOrRemoveDeviceResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<V2AddOrRemoveDeviceResult> updateCampaignFirmwareDevices(
            final String account,
            final String campaignId,
            final V2AddOrRemoveDeviceRequest body) throws ApiException, IOException {
        return prepareUpdateCampaignFirmwareDevicesRequest(account, campaignId, body).execute();
    }

    /**
     * This endpoint allows user to Add or Remove devices to an existing software upgrade.
     * @param  account  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Software upgrade information.
     * @param  body  Required parameter: Request to add or remove device to existing software
     *         upgrade information.
     * @return    Returns the V2AddOrRemoveDeviceResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<V2AddOrRemoveDeviceResult>> updateCampaignFirmwareDevicesAsync(
            final String account,
            final String campaignId,
            final V2AddOrRemoveDeviceRequest body) {
        try { 
            return prepareUpdateCampaignFirmwareDevicesRequest(account, campaignId, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateCampaignFirmwareDevices.
     */
    private ApiCall<ApiResponse<V2AddOrRemoveDeviceResult>, ApiException> prepareUpdateCampaignFirmwareDevicesRequest(
            final String account,
            final String campaignId,
            final V2AddOrRemoveDeviceRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<V2AddOrRemoveDeviceResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/campaigns/{account}/{campaignId}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("campaignId").value(campaignId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("*/*").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, V2AddOrRemoveDeviceResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows user to cancel software upgrade. A software upgrade already started can
     * not be cancelled.
     * @param  account  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Unique identifier of campaign.
     * @return    Returns the FotaV2SuccessResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<FotaV2SuccessResult> cancelCampaign(
            final String account,
            final String campaignId) throws ApiException, IOException {
        return prepareCancelCampaignRequest(account, campaignId).execute();
    }

    /**
     * This endpoint allows user to cancel software upgrade. A software upgrade already started can
     * not be cancelled.
     * @param  account  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Unique identifier of campaign.
     * @return    Returns the FotaV2SuccessResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<FotaV2SuccessResult>> cancelCampaignAsync(
            final String account,
            final String campaignId) {
        try { 
            return prepareCancelCampaignRequest(account, campaignId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for cancelCampaign.
     */
    private ApiCall<ApiResponse<FotaV2SuccessResult>, ApiException> prepareCancelCampaignRequest(
            final String account,
            final String campaignId) throws IOException {
        return new ApiCall.Builder<ApiResponse<FotaV2SuccessResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/campaigns/{account}/{campaignId}")
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("campaignId").value(campaignId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, FotaV2SuccessResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows user to change campaign dates and time windows. Fields which need to
     * remain unchanged should be also provided.
     * @param  account  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Software upgrade information.
     * @param  body  Required parameter: New dates and time windows.
     * @return    Returns the CampaignSoftware wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<CampaignSoftware> updateCampaignDates(
            final String account,
            final String campaignId,
            final V2ChangeCampaignDatesRequest body) throws ApiException, IOException {
        return prepareUpdateCampaignDatesRequest(account, campaignId, body).execute();
    }

    /**
     * This endpoint allows user to change campaign dates and time windows. Fields which need to
     * remain unchanged should be also provided.
     * @param  account  Required parameter: Account identifier.
     * @param  campaignId  Required parameter: Software upgrade information.
     * @param  body  Required parameter: New dates and time windows.
     * @return    Returns the CampaignSoftware wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<CampaignSoftware>> updateCampaignDatesAsync(
            final String account,
            final String campaignId,
            final V2ChangeCampaignDatesRequest body) {
        try { 
            return prepareUpdateCampaignDatesRequest(account, campaignId, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateCampaignDates.
     */
    private ApiCall<ApiResponse<CampaignSoftware>, ApiException> prepareUpdateCampaignDatesRequest(
            final String account,
            final String campaignId,
            final V2ChangeCampaignDatesRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<CampaignSoftware>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/campaigns/{account}/{campaignId}/dates")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("campaignId").value(campaignId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("*/*").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, CampaignSoftware.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * You can upload configuration files and schedule them in a campaign to devices.
     * @param  acc  Required parameter: Account identifier.
     * @param  body  Required parameter: Device logging information.
     * @return    Returns the UploadAndScheduleFileResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<UploadAndScheduleFileResponse> scheduleFileUpgrade(
            final String acc,
            final UploadAndScheduleFileRequest body) throws ApiException, IOException {
        return prepareScheduleFileUpgradeRequest(acc, body).execute();
    }

    /**
     * You can upload configuration files and schedule them in a campaign to devices.
     * @param  acc  Required parameter: Account identifier.
     * @param  body  Required parameter: Device logging information.
     * @return    Returns the UploadAndScheduleFileResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<UploadAndScheduleFileResponse>> scheduleFileUpgradeAsync(
            final String acc,
            final UploadAndScheduleFileRequest body) {
        try { 
            return prepareScheduleFileUpgradeRequest(acc, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for scheduleFileUpgrade.
     */
    private ApiCall<ApiResponse<UploadAndScheduleFileResponse>, ApiException> prepareScheduleFileUpgradeRequest(
            final String acc,
            final UploadAndScheduleFileRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<UploadAndScheduleFileResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/campaigns/files/{acc}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("acc").value(acc)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, UploadAndScheduleFileResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Campaign time windows for downloading and installing software are available as long as the
     * device OEM supports this.
     * @param  acc  Required parameter: Account identifier.
     * @param  body  Required parameter: Device logging information.
     * @return    Returns the UploadAndScheduleFileResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<UploadAndScheduleFileResponse> scheduleSWUpgradeHttpDevices(
            final String acc,
            final SchedulesSoftwareUpgradeRequest body) throws ApiException, IOException {
        return prepareScheduleSWUpgradeHttpDevicesRequest(acc, body).execute();
    }

    /**
     * Campaign time windows for downloading and installing software are available as long as the
     * device OEM supports this.
     * @param  acc  Required parameter: Account identifier.
     * @param  body  Required parameter: Device logging information.
     * @return    Returns the UploadAndScheduleFileResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<UploadAndScheduleFileResponse>> scheduleSWUpgradeHttpDevicesAsync(
            final String acc,
            final SchedulesSoftwareUpgradeRequest body) {
        try { 
            return prepareScheduleSWUpgradeHttpDevicesRequest(acc, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for scheduleSWUpgradeHttpDevices.
     */
    private ApiCall<ApiResponse<UploadAndScheduleFileResponse>, ApiException> prepareScheduleSWUpgradeHttpDevicesRequest(
            final String acc,
            final SchedulesSoftwareUpgradeRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<UploadAndScheduleFileResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/campaigns/software/{acc}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("acc").value(acc)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, UploadAndScheduleFileResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}