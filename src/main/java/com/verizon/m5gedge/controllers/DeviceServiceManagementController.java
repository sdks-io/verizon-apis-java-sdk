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
import com.verizon.m5gedge.exceptions.HyperPreciseLocationResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.BullseyeServiceRequest;
import com.verizon.m5gedge.models.BullseyeServiceResult;
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
public final class DeviceServiceManagementController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DeviceServiceManagementController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Gets the list of a status for hyper-precise location devices.
     * @param  imei  Required parameter: A unique identifier for a device.
     * @param  accountNumber  Required parameter: A unique identifier for an account.
     * @return    Returns the BullseyeServiceResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<BullseyeServiceResult> getDeviceHyperPreciseStatus(
            final String imei,
            final String accountNumber) throws ApiException, IOException {
        return prepareGetDeviceHyperPreciseStatusRequest(imei, accountNumber).execute();
    }

    /**
     * Gets the list of a status for hyper-precise location devices.
     * @param  imei  Required parameter: A unique identifier for a device.
     * @param  accountNumber  Required parameter: A unique identifier for an account.
     * @return    Returns the BullseyeServiceResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<BullseyeServiceResult>> getDeviceHyperPreciseStatusAsync(
            final String imei,
            final String accountNumber) {
        try { 
            return prepareGetDeviceHyperPreciseStatusRequest(imei, accountNumber).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getDeviceHyperPreciseStatus.
     */
    private ApiCall<ApiResponse<BullseyeServiceResult>, ApiException> prepareGetDeviceHyperPreciseStatusRequest(
            final String imei,
            final String accountNumber) throws IOException {
        return new ApiCall.Builder<ApiResponse<BullseyeServiceResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.HYPER_PRECISE_LOCATION.value())
                        .path("/devices/services")
                        .queryParam(param -> param.key("imei")
                                .value(imei))
                        .queryParam(param -> param.key("accountNumber")
                                .value(accountNumber))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, BullseyeServiceResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad request.",
                                (reason, context) -> new HyperPreciseLocationResultException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized request. Access token is missing or invalid.",
                                (reason, context) -> new HyperPreciseLocationResultException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden request.",
                                (reason, context) -> new HyperPreciseLocationResultException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Bad request. Not found.",
                                (reason, context) -> new HyperPreciseLocationResultException(reason, context)))
                        .localErrorCase("409",
                                 ErrorCase.setReason("Bad request. Conflict state.",
                                (reason, context) -> new HyperPreciseLocationResultException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server Error.",
                                (reason, context) -> new HyperPreciseLocationResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Enable/disable hyper-precise service for a device.
     * @param  body  Required parameter: List of devices and hyper-precise required statuses.
     * @return    Returns the BullseyeServiceResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<BullseyeServiceResult> updateDeviceHyperPreciseStatus(
            final BullseyeServiceRequest body) throws ApiException, IOException {
        return prepareUpdateDeviceHyperPreciseStatusRequest(body).execute();
    }

    /**
     * Enable/disable hyper-precise service for a device.
     * @param  body  Required parameter: List of devices and hyper-precise required statuses.
     * @return    Returns the BullseyeServiceResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<BullseyeServiceResult>> updateDeviceHyperPreciseStatusAsync(
            final BullseyeServiceRequest body) {
        try { 
            return prepareUpdateDeviceHyperPreciseStatusRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateDeviceHyperPreciseStatus.
     */
    private ApiCall<ApiResponse<BullseyeServiceResult>, ApiException> prepareUpdateDeviceHyperPreciseStatusRequest(
            final BullseyeServiceRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<BullseyeServiceResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.HYPER_PRECISE_LOCATION.value())
                        .path("/devices/services")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, BullseyeServiceResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad request.",
                                (reason, context) -> new HyperPreciseLocationResultException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized request. Access token is missing or invalid.",
                                (reason, context) -> new HyperPreciseLocationResultException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden request.",
                                (reason, context) -> new HyperPreciseLocationResultException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Bad request. Not found.",
                                (reason, context) -> new HyperPreciseLocationResultException(reason, context)))
                        .localErrorCase("409",
                                 ErrorCase.setReason("Bad request. Conflict state.",
                                (reason, context) -> new HyperPreciseLocationResultException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server Error.",
                                (reason, context) -> new HyperPreciseLocationResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}