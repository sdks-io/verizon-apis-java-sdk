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
import com.verizon.m5gedge.models.AggregateSessionReport;
import com.verizon.m5gedge.models.AggregateSessionReportRequest;
import com.verizon.m5gedge.models.AggregatedReportCallbackResult;
import com.verizon.m5gedge.models.SessionReport;
import com.verizon.m5gedge.models.SessionReportRequest;
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
public final class DeviceReportsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DeviceReportsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Calculate aggregated report per day with number of sessions and usage information. User will
     * receive synchronous response for specified list of devices (Max 10) and date range (Max 180
     * days).
     * @param  body  Required parameter: Aggregated report request.
     * @return    Returns the AggregateSessionReport wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<AggregateSessionReport> calculateAggregatedReportSynchronous(
            final AggregateSessionReportRequest body) throws ApiException, IOException {
        return prepareCalculateAggregatedReportSynchronousRequest(body).execute();
    }

    /**
     * Calculate aggregated report per day with number of sessions and usage information. User will
     * receive synchronous response for specified list of devices (Max 10) and date range (Max 180
     * days).
     * @param  body  Required parameter: Aggregated report request.
     * @return    Returns the AggregateSessionReport wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<AggregateSessionReport>> calculateAggregatedReportSynchronousAsync(
            final AggregateSessionReportRequest body) {
        try { 
            return prepareCalculateAggregatedReportSynchronousRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for calculateAggregatedReportSynchronous.
     */
    private ApiCall<ApiResponse<AggregateSessionReport>, ApiException> prepareCalculateAggregatedReportSynchronousRequest(
            final AggregateSessionReportRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<AggregateSessionReport>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.HYPER_PRECISE_LOCATION.value())
                        .path("/report/aggregate")
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
                                response -> ApiHelper.deserialize(response, AggregateSessionReport.class))
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
     * Calculate aggregated report per day with number of sessions and usage information. User will
     * receive an asynchronous callback for the specified list of devices (Max 10000) and date range
     * (Max 180 days).
     * @param  body  Required parameter: Aggregated session report request.
     * @return    Returns the AggregatedReportCallbackResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<AggregatedReportCallbackResult> calculateAggregatedReportAsynchronous(
            final AggregateSessionReportRequest body) throws ApiException, IOException {
        return prepareCalculateAggregatedReportAsynchronousRequest(body).execute();
    }

    /**
     * Calculate aggregated report per day with number of sessions and usage information. User will
     * receive an asynchronous callback for the specified list of devices (Max 10000) and date range
     * (Max 180 days).
     * @param  body  Required parameter: Aggregated session report request.
     * @return    Returns the AggregatedReportCallbackResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<AggregatedReportCallbackResult>> calculateAggregatedReportAsynchronousAsync(
            final AggregateSessionReportRequest body) {
        try { 
            return prepareCalculateAggregatedReportAsynchronousRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for calculateAggregatedReportAsynchronous.
     */
    private ApiCall<ApiResponse<AggregatedReportCallbackResult>, ApiException> prepareCalculateAggregatedReportAsynchronousRequest(
            final AggregateSessionReportRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<AggregatedReportCallbackResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.HYPER_PRECISE_LOCATION.value())
                        .path("/report/async/aggregate")
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
                                response -> ApiHelper.deserialize(response, AggregatedReportCallbackResult.class))
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
     * Detailed report of session duration and number of bytes transferred per day.
     * @param  body  Required parameter: Request for sessions report.
     * @return    Returns the SessionReport wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<SessionReport> getSessionsReport(
            final SessionReportRequest body) throws ApiException, IOException {
        return prepareGetSessionsReportRequest(body).execute();
    }

    /**
     * Detailed report of session duration and number of bytes transferred per day.
     * @param  body  Required parameter: Request for sessions report.
     * @return    Returns the SessionReport wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<SessionReport>> getSessionsReportAsync(
            final SessionReportRequest body) {
        try { 
            return prepareGetSessionsReportRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getSessionsReport.
     */
    private ApiCall<ApiResponse<SessionReport>, ApiException> prepareGetSessionsReportRequest(
            final SessionReportRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<SessionReport>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.HYPER_PRECISE_LOCATION.value())
                        .path("/report/sessions")
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
                                response -> ApiHelper.deserialize(response, SessionReport.class))
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