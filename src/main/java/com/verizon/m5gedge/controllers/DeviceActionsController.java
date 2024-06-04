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
import com.verizon.m5gedge.exceptions.GIORestErrorResponseException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.GIORequestResponse;
import com.verizon.m5gedge.models.GetDeviceListWithProfilesRequest;
import com.verizon.m5gedge.models.ProvhistoryRequest;
import com.verizon.m5gedge.models.StatusResponse;
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
public final class DeviceActionsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DeviceActionsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Allows the profile to fetch the complete device list. This works with Verizon US and Global
     * profiles.
     * @param  body  Required parameter: Device Profile Query
     * @return    Returns the GIORequestResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<GIORequestResponse> retrieveTheGlobalDeviceList(
            final GetDeviceListWithProfilesRequest body) throws ApiException, IOException {
        return prepareRetrieveTheGlobalDeviceListRequest(body).execute();
    }

    /**
     * Allows the profile to fetch the complete device list. This works with Verizon US and Global
     * profiles.
     * @param  body  Required parameter: Device Profile Query
     * @return    Returns the GIORequestResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<GIORequestResponse>> retrieveTheGlobalDeviceListAsync(
            final GetDeviceListWithProfilesRequest body) {
        try { 
            return prepareRetrieveTheGlobalDeviceListRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for retrieveTheGlobalDeviceList.
     */
    private ApiCall<ApiResponse<GIORequestResponse>, ApiException> prepareRetrieveTheGlobalDeviceListRequest(
            final GetDeviceListWithProfilesRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<GIORequestResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v2/devices/actions/list")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, GIORequestResponse.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response",
                                (reason, context) -> new GIORestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retreive the provisioning history of a specific device or devices.
     * @param  body  Required parameter: Device Provisioning History
     * @return    Returns the GIORequestResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<GIORequestResponse> retrieveDeviceProvisioningHistory(
            final ProvhistoryRequest body) throws ApiException, IOException {
        return prepareRetrieveDeviceProvisioningHistoryRequest(body).execute();
    }

    /**
     * Retreive the provisioning history of a specific device or devices.
     * @param  body  Required parameter: Device Provisioning History
     * @return    Returns the GIORequestResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<GIORequestResponse>> retrieveDeviceProvisioningHistoryAsync(
            final ProvhistoryRequest body) {
        try { 
            return prepareRetrieveDeviceProvisioningHistoryRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for retrieveDeviceProvisioningHistory.
     */
    private ApiCall<ApiResponse<GIORequestResponse>, ApiException> prepareRetrieveDeviceProvisioningHistoryRequest(
            final ProvhistoryRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<GIORequestResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v2/devices/history/actions/list")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, GIORequestResponse.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response",
                                (reason, context) -> new GIORestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get the status of an asynchronous request made with the Device Actions.
     * @param  accountName  Required parameter: Example:
     * @param  requestID  Required parameter: Example:
     * @return    Returns the StatusResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<StatusResponse> getAsynchronousRequestStatus(
            final String accountName,
            final String requestID) throws ApiException, IOException {
        return prepareGetAsynchronousRequestStatusRequest(accountName, requestID).execute();
    }

    /**
     * Get the status of an asynchronous request made with the Device Actions.
     * @param  accountName  Required parameter: Example:
     * @param  requestID  Required parameter: Example:
     * @return    Returns the StatusResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<StatusResponse>> getAsynchronousRequestStatusAsync(
            final String accountName,
            final String requestID) {
        try { 
            return prepareGetAsynchronousRequestStatusRequest(accountName, requestID).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAsynchronousRequestStatus.
     */
    private ApiCall<ApiResponse<StatusResponse>, ApiException> prepareGetAsynchronousRequestStatusRequest(
            final String accountName,
            final String requestID) throws IOException {
        return new ApiCall.Builder<ApiResponse<StatusResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v2/accounts/{accountName}/requests/{requestID}/status")
                        .templateParam(param -> param.key("accountName").value(accountName)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("requestID").value(requestID)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, StatusResponse.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response",
                                (reason, context) -> new GIORestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}