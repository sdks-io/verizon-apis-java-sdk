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
import com.verizon.m5gedge.exceptions.ConnectivityManagementResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.DeviceManagementResult;
import com.verizon.m5gedge.models.NotificationReportStatusRequest;
import com.verizon.m5gedge.models.RetrieveMonitorsRequest;
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
public final class DeviceDiagnosticsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DeviceDiagnosticsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * If the devices do not already exist in the account, this API resource adds them before
     * activation.
     * @param  body  Required parameter: Retrieve Reachability Report Status for a device.
     * @return    Returns the DeviceManagementResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DeviceManagementResult> deviceReachabilityStatusUsingPOST(
            final NotificationReportStatusRequest body) throws ApiException, IOException {
        return prepareDeviceReachabilityStatusUsingPOSTRequest(body).execute();
    }

    /**
     * If the devices do not already exist in the account, this API resource adds them before
     * activation.
     * @param  body  Required parameter: Retrieve Reachability Report Status for a device.
     * @return    Returns the DeviceManagementResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DeviceManagementResult>> deviceReachabilityStatusUsingPOSTAsync(
            final NotificationReportStatusRequest body) {
        try { 
            return prepareDeviceReachabilityStatusUsingPOSTRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for deviceReachabilityStatusUsingPOST.
     */
    private ApiCall<ApiResponse<DeviceManagementResult>, ApiException> prepareDeviceReachabilityStatusUsingPOSTRequest(
            final NotificationReportStatusRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<DeviceManagementResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/diagnostics/basic/devicereachability/status")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
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
                                response -> ApiHelper.deserialize(response, DeviceManagementResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Error response.",
                                (reason, context) -> new ConnectivityManagementResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieve all the active monitors.
     * @param  body  Required parameter: Retrieve Monitor Request.
     * @return    Returns the DeviceManagementResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DeviceManagementResult> retrieveActiveMonitorsUsingPOST(
            final RetrieveMonitorsRequest body) throws ApiException, IOException {
        return prepareRetrieveActiveMonitorsUsingPOSTRequest(body).execute();
    }

    /**
     * Retrieve all the active monitors.
     * @param  body  Required parameter: Retrieve Monitor Request.
     * @return    Returns the DeviceManagementResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DeviceManagementResult>> retrieveActiveMonitorsUsingPOSTAsync(
            final RetrieveMonitorsRequest body) {
        try { 
            return prepareRetrieveActiveMonitorsUsingPOSTRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for retrieveActiveMonitorsUsingPOST.
     */
    private ApiCall<ApiResponse<DeviceManagementResult>, ApiException> prepareRetrieveActiveMonitorsUsingPOSTRequest(
            final RetrieveMonitorsRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<DeviceManagementResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/diagnostics/basic/devicereachability/monitors")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
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
                                response -> ApiHelper.deserialize(response, DeviceManagementResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Error response.",
                                (reason, context) -> new ConnectivityManagementResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}