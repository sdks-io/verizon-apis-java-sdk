/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.controllers;

import com.verizon.m5gedge.ApiHelper;
import com.verizon.m5gedge.Server;
import com.verizon.m5gedge.exceptions.ApiException;
import com.verizon.m5gedge.exceptions.DeviceDiagnosticsResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.DiagnosticsSubscription;
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
public final class DiagnosticsSubscriptionsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DiagnosticsSubscriptionsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This endpoint retrieves a diagnostics subscription by account.
     * @param  accountName  Required parameter: Account identifier.
     * @return    Returns the DiagnosticsSubscription wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DiagnosticsSubscription> getDiagnosticsSubscription(
            final String accountName) throws ApiException, IOException {
        return prepareGetDiagnosticsSubscriptionRequest(accountName).execute();
    }

    /**
     * This endpoint retrieves a diagnostics subscription by account.
     * @param  accountName  Required parameter: Account identifier.
     * @return    Returns the DiagnosticsSubscription wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DiagnosticsSubscription>> getDiagnosticsSubscriptionAsync(
            final String accountName) {
        try { 
            return prepareGetDiagnosticsSubscriptionRequest(accountName).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getDiagnosticsSubscription.
     */
    private ApiCall<ApiResponse<DiagnosticsSubscription>, ApiException> prepareGetDiagnosticsSubscriptionRequest(
            final String accountName) throws IOException {
        return new ApiCall.Builder<ApiResponse<DiagnosticsSubscription>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DEVICE_DIAGNOSTICS.value())
                        .path("/subscriptions")
                        .queryParam(param -> param.key("accountName")
                                .value(accountName))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, DiagnosticsSubscription.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response.",
                                (reason, context) -> new DeviceDiagnosticsResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}