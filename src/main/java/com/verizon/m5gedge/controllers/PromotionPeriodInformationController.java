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
import com.verizon.m5gedge.exceptions.ReadySimRestErrorResponseException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.ARequestBodyForUsage;
import com.verizon.m5gedge.models.RequestBodyForUsage;
import com.verizon.m5gedge.models.ResponseToUsageQuery;
import com.verizon.m5gedge.models.UsageRequestResponse;
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
public final class PromotionPeriodInformationController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public PromotionPeriodInformationController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieves the usage history of a device during the promotion period.
     * @param  body  Required parameter: Retrieve Aggregate Usage
     * @return    Returns the ResponseToUsageQuery wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ResponseToUsageQuery> getPromoDeviceUsageHistory(
            final ARequestBodyForUsage body) throws ApiException, IOException {
        return prepareGetPromoDeviceUsageHistoryRequest(body).execute();
    }

    /**
     * Retrieves the usage history of a device during the promotion period.
     * @param  body  Required parameter: Retrieve Aggregate Usage
     * @return    Returns the ResponseToUsageQuery wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ResponseToUsageQuery>> getPromoDeviceUsageHistoryAsync(
            final ARequestBodyForUsage body) {
        try { 
            return prepareGetPromoDeviceUsageHistoryRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getPromoDeviceUsageHistory.
     */
    private ApiCall<ApiResponse<ResponseToUsageQuery>, ApiException> prepareGetPromoDeviceUsageHistoryRequest(
            final ARequestBodyForUsage body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<ResponseToUsageQuery>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/devices/usage/actions/promodeviceusage")
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
                                response -> ApiHelper.deserialize(response, ResponseToUsageQuery.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("All error responses will be in this format",
                                (reason, context) -> new ReadySimRestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieves the aggregate usage for an account using pseudo-MDN during the promotional period
     * using a callback.
     * @param  body  Required parameter: Retrieve Aggregate Usage
     * @return    Returns the UsageRequestResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<UsageRequestResponse> getPromoDeviceAggregateUsageHistory(
            final RequestBodyForUsage body) throws ApiException, IOException {
        return prepareGetPromoDeviceAggregateUsageHistoryRequest(body).execute();
    }

    /**
     * Retrieves the aggregate usage for an account using pseudo-MDN during the promotional period
     * using a callback.
     * @param  body  Required parameter: Retrieve Aggregate Usage
     * @return    Returns the UsageRequestResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<UsageRequestResponse>> getPromoDeviceAggregateUsageHistoryAsync(
            final RequestBodyForUsage body) {
        try { 
            return prepareGetPromoDeviceAggregateUsageHistoryRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getPromoDeviceAggregateUsageHistory.
     */
    private ApiCall<ApiResponse<UsageRequestResponse>, ApiException> prepareGetPromoDeviceAggregateUsageHistoryRequest(
            final RequestBodyForUsage body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<UsageRequestResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/devices/usage/actions/promoaggregateusage")
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
                                response -> ApiHelper.deserialize(response, UsageRequestResponse.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response",
                                (reason, context) -> new ReadySimRestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}