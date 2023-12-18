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
import com.verizon.m5gedge.exceptions.RestErrorResponseException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.NotificationReportRequest;
import com.verizon.m5gedge.models.RequestResponse;
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
public final class DeviceMonitoringController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DeviceMonitoringController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * @param  body  Required parameter: Create Reachability Report Request
     * @return    Returns the RequestResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<RequestResponse> deviceReachability(
            final NotificationReportRequest body) throws ApiException, IOException {
        return prepareDeviceReachabilityRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Create Reachability Report Request
     * @return    Returns the RequestResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<RequestResponse>> deviceReachabilityAsync(
            final NotificationReportRequest body) {
        try { 
            return prepareDeviceReachabilityRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for deviceReachability.
     */
    private ApiCall<ApiResponse<RequestResponse>, ApiException> prepareDeviceReachabilityRequest(
            final NotificationReportRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<RequestResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/diagnostics/basic/devicereachability")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, RequestResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Error Response",
                                (reason, context) -> new RestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  accountName  Required parameter: The numeric name of the account.
     * @param  monitorIds  Required parameter: The array contains the monitorIDs (UUID) for which
     *         the monitor is to be deleted.
     * @return    Returns the RequestResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<RequestResponse> stopDeviceReachability(
            final String accountName,
            final List<String> monitorIds) throws ApiException, IOException {
        return prepareStopDeviceReachabilityRequest(accountName, monitorIds).execute();
    }

    /**
     * @param  accountName  Required parameter: The numeric name of the account.
     * @param  monitorIds  Required parameter: The array contains the monitorIDs (UUID) for which
     *         the monitor is to be deleted.
     * @return    Returns the RequestResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<RequestResponse>> stopDeviceReachabilityAsync(
            final String accountName,
            final List<String> monitorIds) {
        try { 
            return prepareStopDeviceReachabilityRequest(accountName, monitorIds).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for stopDeviceReachability.
     */
    private ApiCall<ApiResponse<RequestResponse>, ApiException> prepareStopDeviceReachabilityRequest(
            final String accountName,
            final List<String> monitorIds) throws IOException {
        return new ApiCall.Builder<ApiResponse<RequestResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/diagnostics/basic/devicereachability")
                        .queryParam(param -> param.key("accountName")
                                .value(accountName))
                        .queryParam(param -> param.key("monitorIds")
                                .value(monitorIds))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, RequestResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Error Response",
                                (reason, context) -> new RestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}